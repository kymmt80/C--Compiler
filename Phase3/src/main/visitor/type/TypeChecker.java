package main.visitor.type;

import main.ast.nodes.Program;
import main.ast.nodes.declaration.*;
import main.ast.nodes.declaration.struct.*;
import main.ast.nodes.expression.*;
import main.ast.nodes.statement.*;
import main.ast.types.*;
import main.ast.types.primitives.BoolType;
import main.ast.types.primitives.IntType;
import main.ast.types.primitives.VoidType;
import main.compileError.typeError.*;
import main.symbolTable.SymbolTable;
import main.symbolTable.exceptions.ItemNotFoundException;
import main.symbolTable.items.FunctionSymbolTableItem;
import main.symbolTable.items.StructSymbolTableItem;
import main.symbolTable.items.VariableSymbolTableItem;
import main.visitor.Visitor;
import java.util.*;

public class TypeChecker extends Visitor<Void> {
    ExpressionTypeChecker expressionTypeChecker;

    int currScope=0;
    int GLOBAL=0;
    int SET=1;
    int GET=2;
    int MAIN=3;

    Type expectedType;

    public void TypeChecker(){
        this.expressionTypeChecker = new ExpressionTypeChecker();
    }


    public boolean isLvalue(Expression exp){
        if(!(exp instanceof Identifier ||exp instanceof ListAccessByIndex ||exp instanceof StructAccess||exp instanceof ExprInPar)){
            return false;
        }
        if(exp instanceof ExprInPar){
            return isLvalue(((ExprInPar) exp).getInputs().get(0));
        }
        if(exp instanceof ListAccessByIndex){
            return isLvalue(((ListAccessByIndex) exp).getInstance());
        }
        if(exp instanceof StructAccess){
            return isLvalue(((StructAccess) exp).getInstance());
        }
        if(exp instanceof Identifier){
            try{SymbolTable.root.getItem(FunctionSymbolTableItem.START_KEY+((Identifier)exp).getName());return false;}
            catch (Exception e){return true;}
        }
        return true;
    }

    public boolean hasSameType(Type t1,Type t2){
        ArrayList<Type> argsType;
        if (t1 instanceof IntType && t2 instanceof IntType){
            return true;
        }else if(t1 instanceof BoolType && t2 instanceof BoolType){
            return true;
        }else if(t1 instanceof ListType && t2 instanceof ListType){
            return hasSameType(((ListType)t1).getType(),((ListType)t2).getType());
        }else if(t1 instanceof StructType && t2 instanceof StructType){
            return Objects.equals(((StructType) t1).getStructName().getName(), ((StructType) t2).getStructName().getName());
        }else if(t1 instanceof FptrType && t2 instanceof FptrType){
            if(((FptrType) t1).getArgsType().size()!=((FptrType) t2).getArgsType().size()){
                return false;
            }
            if (!hasSameType(((FptrType) t1).getReturnType(),((FptrType) t2).getReturnType())){
                return false;
            }
            for(int i=0;i<((FptrType) t1).getArgsType().size();i++){
                if(!hasSameType(((FptrType) t1).getArgsType().get(i),((FptrType) t2).getArgsType().get(i))){
                    return false;
                }
            }
            return true;
        }else if(t1 instanceof NoType || t2 instanceof NoType){
            return true;
        }
        else if(t1 instanceof VoidType && t2 instanceof VoidType){
            return true;
        }
        return false;
    }

    @Override
    public Void visit(Program program) {
        this.TypeChecker();
        for (StructDeclaration structDeclaration: program.getStructs())
            structDeclaration.accept(this);
        for (FunctionDeclaration functionDeclaration:program.getFunctions())
            functionDeclaration.accept(this);
        program.getMain().accept(this);
        return null;
    }

    @Override
    public Void visit(FunctionDeclaration functionDec) {
        FunctionSymbolTableItem func = null;
        try {
            func = (FunctionSymbolTableItem) SymbolTable.root.getItem(FunctionSymbolTableItem.START_KEY+functionDec.getFunctionName().getName());
            if(functionDec.getReturnType() instanceof StructType){
                try {
                    SymbolTable.root.getItem(StructSymbolTableItem.START_KEY+((StructType) functionDec.getReturnType()).getStructName().getName());
                    func.setReturnType(functionDec.getReturnType());
                }catch (Exception e){
                    functionDec.addError(new StructNotDeclared(functionDec.getLine(),((StructType) functionDec.getReturnType()).getStructName().getName()));
                    func.setReturnType(new NoType());
                }
            }else {
                func.setReturnType(functionDec.getReturnType());
            }
            expectedType= functionDec.getReturnType();
            SymbolTable.push(new SymbolTable(SymbolTable.top));
            for (VariableDeclaration arg: functionDec.getArgs())
                arg.accept(this);
            func.setFunctionSymbolTable(SymbolTable.top);
            SymbolTable.push(new SymbolTable(SymbolTable.top));
            functionDec.getBody().accept(this);
            SymbolTable.pop();
            SymbolTable.pop();
            return null;
        }catch (ItemNotFoundException e){//unreachable
            return null;
        }

    }

    @Override
    public Void visit(MainDeclaration mainDec) {
        SymbolTable scope=new SymbolTable(SymbolTable.top);
        SymbolTable.push(scope);
        currScope=MAIN;
        mainDec.getBody().accept(this);
        currScope=GLOBAL;
        SymbolTable.pop();
        return null;
    }

    @Override
    public Void visit(VariableDeclaration variableDec) {
        if(currScope==GET||currScope==SET){
            variableDec.addError(new CannotUseDefineVar(variableDec.getLine()));
        }
        SymbolTable curr=SymbolTable.top;
        VariableSymbolTableItem var=new VariableSymbolTableItem(variableDec.getVarName());
        if(variableDec.getVarType() instanceof StructType){
            try {
                SymbolTable.root.getItem(StructSymbolTableItem.START_KEY+((StructType) variableDec.getVarType()).getStructName().getName());
                var.setType(variableDec.getVarType());
            }catch (Exception e){
                variableDec.addError(new StructNotDeclared(variableDec.getLine(),((StructType) variableDec.getVarType()).getStructName().getName()));
                var.setType(new NoType());
            }
        }else{
            var.setType(variableDec.getVarType());
        }
        boolean er=false;
        if(variableDec.getVarType() instanceof FptrType){
            for(Type arg: ((FptrType)variableDec.getVarType()).getArgsType()){
                if(arg instanceof StructType) {
                    try {SymbolTable.root.getItem(StructSymbolTableItem.START_KEY + ((StructType)arg).getStructName().getName());}
                    catch (Exception e) {variableDec.addError(new StructNotDeclared(variableDec.getLine(), ((StructType) arg).getStructName().getName()));
                    er=true; }}
            }
        }
        if(er){var.setType(new NoType());}
        try {
            curr.put(var);
        }catch (Exception e){
            //unreachable
        }
        Type exp;
        if(variableDec.getDefaultValue()!=null){
            exp=variableDec.getDefaultValue().accept(expressionTypeChecker);
            if(!hasSameType(exp, var.getType())){
                variableDec.addError(new UnsupportedOperandType(variableDec.getLine(),"assign"));
            }
        }
        return null;
    }

    @Override
    public Void visit(StructDeclaration structDec) {
        StructSymbolTableItem strct = null;
        try {
            strct = (StructSymbolTableItem) SymbolTable.root.getItem(StructSymbolTableItem.START_KEY+structDec.getStructName().getName());
        }catch (Exception e){//unreachable
        }

        SymbolTable.push(new SymbolTable(SymbolTable.top));
        structDec.getBody().accept(this);
        strct.setStructSymbolTable(SymbolTable.top);
        SymbolTable.pop();
        return null;
    }

    @Override
    public Void visit(SetGetVarDeclaration setGetVarDec) {
        SymbolTable scope=new SymbolTable(SymbolTable.top);
        setGetVarDec.getVarDec().accept(this);
        SymbolTable.push(scope);
        expectedType=setGetVarDec.getVarDec().getVarType();
        for (VariableDeclaration varDec: setGetVarDec.getArgs())
            varDec.accept(this);
        currScope=SET;
        setGetVarDec.getSetterBody().accept(this);
        SymbolTable.pop();
        SymbolTable scope2=new SymbolTable(SymbolTable.top);
        currScope=GET;
        SymbolTable.push(scope2);
        setGetVarDec.getGetterBody().accept(this);
        SymbolTable.pop();
        currScope=GLOBAL;
        return null;
    }

    @Override
    public Void visit(AssignmentStmt assignmentStmt) {
        Expression lvalue=assignmentStmt.getLValue();
        Type Lval = assignmentStmt.getLValue().accept(expressionTypeChecker);
        Type Rval = assignmentStmt.getRValue().accept(expressionTypeChecker);
        if(!isLvalue(lvalue)){
            assignmentStmt.addError(new LeftSideNotLvalue(assignmentStmt.getLine()));
            return null;
        }
        if(!hasSameType(Lval,Rval)){
            assignmentStmt.addError(new UnsupportedOperandType(assignmentStmt.getLine(),"assign"));
        }
        return null;
    }

    @Override
    public Void visit(BlockStmt blockStmt) {
        for (Statement stmt: blockStmt.getStatements())
            stmt.accept(this);
        return null;
    }

    @Override
    public Void visit(ConditionalStmt conditionalStmt) {
        Type exp= conditionalStmt.getCondition().accept(expressionTypeChecker);
        if(!(exp instanceof BoolType||exp instanceof NoType)){
            conditionalStmt.addError(new ConditionNotBool(conditionalStmt.getLine()));
        }
        SymbolTable ifScope=new SymbolTable(SymbolTable.top);
        SymbolTable.push(ifScope);
        conditionalStmt.getThenBody().accept(this);
        SymbolTable.pop();
        SymbolTable elseScope=new SymbolTable(SymbolTable.top);
        if (conditionalStmt.getElseBody() != null) {
            SymbolTable.push(elseScope);
            conditionalStmt.getElseBody().accept(this);
            SymbolTable.pop();
        }
        return null;
    }

    @Override
    public Void visit(FunctionCallStmt functionCallStmt) {
        //Todo
        FunctionCall funcCall=functionCallStmt.getFunctionCall();
        Type type = funcCall.getInstance().accept(expressionTypeChecker);
        ArrayList<Type> argTypes = new ArrayList<>();
        Type typ;
        for(int i=0;i<funcCall.getArgs().size();i++){
            typ=funcCall.getArgs().get(i).accept(expressionTypeChecker);
            argTypes.add(typ);
        }
        if (!(type instanceof FptrType)){
            if(!(type instanceof NoType))
                funcCall.addError(new CallOnNoneFptrType(funcCall.getLine()));
            return null;
        }
        FptrType t= (FptrType) type;
        if(t.getArgsType().get(0) instanceof VoidType){
            if(funcCall.getArgs().size()!=0){
                funcCall.addError(new ArgsInFunctionCallNotMatchDefinition(funcCall.getLine()));
            }
        }else {
            if (t.getArgsType().size() != funcCall.getArgs().size()) {
                funcCall.addError(new ArgsInFunctionCallNotMatchDefinition(funcCall.getLine()));
            } else {
                for (int i = 0; i < t.getArgsType().size(); i++) {
                    if (!(hasSameType(argTypes.get(i), t.getArgsType().get(i)))) {
                        funcCall.addError(new ArgsInFunctionCallNotMatchDefinition(funcCall.getLine()));
                        break;
                    }
                }
            }
        }
        return null;
    }

    @Override
    public Void visit(DisplayStmt displayStmt) {
        Type exp=displayStmt.getArg().accept(expressionTypeChecker);
        if(!(exp instanceof BoolType || exp instanceof IntType||exp instanceof NoType||exp instanceof ListType)){
            displayStmt.addError(new UnsupportedTypeForDisplay(displayStmt.getLine()));
        }
        return null;
    }

    @Override
    public Void visit(ReturnStmt returnStmt) {
        //Todo
        //System.out.println(returnStmt.getLine());
        if(currScope==MAIN||currScope==SET){
            returnStmt.addError(new CannotUseReturn(returnStmt.getLine()));
        }
        Type exp=returnStmt.getReturnedExpr().accept(expressionTypeChecker);
        //System.out.println(returnStmt.getLine()+exp.toString());
        if(!hasSameType(exp,expectedType)){
            returnStmt.addError(new ReturnValueNotMatchFunctionReturnType(returnStmt.getLine()));
        }
        return null;
    }

    @Override
    public Void visit(LoopStmt loopStmt) {
        Type exp= loopStmt.getCondition().accept(expressionTypeChecker);
        if(!(exp instanceof BoolType||exp instanceof NoType)){
            loopStmt.addError(new ConditionNotBool(loopStmt.getLine()));
        }
        SymbolTable scope=new SymbolTable(SymbolTable.top);
        SymbolTable.push(scope);
        loopStmt.getBody().accept(this);
        SymbolTable.pop();
        return null;
    }

    @Override
    public Void visit(VarDecStmt varDecStmt) {
        if(currScope==GET||currScope==SET){
            varDecStmt.addError(new CannotUseDefineVar(varDecStmt.getLine()));
        }
        int temp=currScope;
        currScope=GLOBAL;
        for (VariableDeclaration var : varDecStmt.getVars())
            var.accept(this);
        currScope=temp;
        return null;
    }

    @Override
    public Void visit(ListAppendStmt listAppendStmt) {
        ListAppend input= (ListAppend) listAppendStmt.getListAppendExpr();
        Type in1=input.getListArg().accept(expressionTypeChecker);
        Type in2=input.getElementArg().accept(expressionTypeChecker);
        if (in1 instanceof NoType){
            return null;
        }
        if (!(in1 instanceof ListType)){
            listAppendStmt.addError(new AppendToNonList(listAppendStmt.getLine()));
            return null;
        }
        ListType in=(ListType) in1;
        if (!hasSameType((in.getType()),in2)){
            listAppendStmt.addError(new NewElementTypeNotMatchListType(listAppendStmt.getLine()));
        }
        return null;
    }

    @Override
    public Void visit(ListSizeStmt listSizeStmt) {
        Type exp= listSizeStmt.getListSizeExpr().accept(expressionTypeChecker);
        if(!(exp instanceof ListType)){
            listSizeStmt.addError(new GetSizeOfNonList(listSizeStmt.getLine()));
        }
        return null;
    }
}
