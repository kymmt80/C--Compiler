package main.visitor.type;


import main.ast.nodes.declaration.VariableDeclaration;
import main.ast.nodes.expression.operators.BinaryOperator;
import main.ast.nodes.expression.operators.UnaryOperator;
import main.ast.nodes.expression.values.primitive.BoolValue;
import main.ast.nodes.expression.values.primitive.IntValue;
import main.ast.nodes.expression.values.Value;
import main.ast.nodes.expression.BinaryExpression;
import main.ast.nodes.expression.Expression;
import main.ast.nodes.expression.ExprInPar;
import main.ast.nodes.expression.FunctionCall;
import main.ast.nodes.expression.Identifier;
import main.ast.nodes.expression.ListAccessByIndex;
import main.ast.nodes.expression.ListAppend;
import main.ast.nodes.expression.ListSize;
import main.ast.nodes.expression.StructAccess;
import main.ast.nodes.expression.UnaryExpression;
import main.ast.types.primitives.BoolType;
import main.ast.types.primitives.IntType;
import main.ast.types.primitives.VoidType;
import main.ast.types.FptrType;
import main.ast.types.ListType;
import main.ast.types.NoType;
import main.ast.types.StructType;
import main.ast.types.Type;
import main.compileError.CompileError;
import main.compileError.nameError.*;
import main.compileError.typeError.*;
import main.symbolTable.SymbolTable;
import main.symbolTable.exceptions.ItemAlreadyExistsException;
import main.symbolTable.exceptions.ItemNotFoundException;
import main.symbolTable.items.SymbolTableItem;
import main.symbolTable.items.FunctionSymbolTableItem;
import main.symbolTable.items.StructSymbolTableItem;
import main.symbolTable.items.VariableSymbolTableItem;
import main.visitor.Visitor;

import java.util.ArrayList;
import java.util.*;

public class ExpressionTypeChecker extends Visitor<Type> {

    private FunctionSymbolTableItem getFuncItemFromSymbolTable(FptrType t)
    {
        try
        {
            FunctionSymbolTableItem ft  = (FunctionSymbolTableItem) SymbolTable.root.getItem(FunctionSymbolTableItem.START_KEY + ((FptrType) t).getClass());
            return ft;
        }
        catch (ItemNotFoundException e)
        {
            return null;
        }
    }

    private StructSymbolTableItem getStructItemFromSymbolTable(StructType t)
    {
        try
        {
            StructSymbolTableItem st  = (StructSymbolTableItem) SymbolTable.root.getItem(StructSymbolTableItem.START_KEY + ((StructType) t).getStructName().getName());
            return st;
        }
        catch (ItemNotFoundException e)
        {
            return null;
        }
    }

    public boolean areTypesEqual(Type t1,Type t2)
    {
        if (t1 instanceof NoType || t2 instanceof NoType)
        {
            return true;
        }
        if (t1 instanceof BoolType && t2 instanceof BoolType)
        {
            return true;
        }
        if (t1 instanceof IntType && t2 instanceof IntType)
        {
            return true;
        }
        if (t1 instanceof VoidType && t2 instanceof VoidType)
        {
            return true;
        }
        if (t1 instanceof FptrType && t2 instanceof FptrType)
        {
            //? fptr name ? symbol table?
            if (((FptrType) t1).getArgsType().size() != ((FptrType) t2).getArgsType().size())
                return false;
            if (!areTypesEqual(((FptrType) t1).getReturnType() , ((FptrType) t2).getReturnType()))
                return false;
            for (int i=0 ; i < ((FptrType) t1).getArgsType().size() ; i++ )
            {
                if (!areTypesEqual(((FptrType) t1).getArgsType().get(i) , ((FptrType) t2).getArgsType().get(i)))
                    return false;
            }
            return true;
        }
        if (t1 instanceof ListType && t2 instanceof ListType)
        {
            if (areTypesEqual(((ListType) t1).getType(),((ListType) t2).getType()))
                return true;
            return false;
        }
        if (t1 instanceof StructType && t2 instanceof StructType)
        {
            if (((StructType) t1).getStructName().equals(((StructType) t2).getStructName()))
                return true;
            StructSymbolTableItem s1 = getStructItemFromSymbolTable((StructType) t1);
            StructSymbolTableItem s2 = getStructItemFromSymbolTable((StructType) t2);
            //? setter getter func?
        }

        return false;
    }


    @Override
    public Type visit(BinaryExpression binaryExpression) {
        Expression left,right;
        left = binaryExpression.getFirstOperand();
        right = binaryExpression.getSecondOperand();

        Type tl,tr;

        tl = left.accept(this);
        tr = right.accept(this);

        BinaryOperator op = binaryExpression.getBinaryOperator();

        if (op.equals(BinaryOperator.eq))
        {
            if (!areTypesEqual(tl,tr)||(tl instanceof ListType && tr instanceof ListType)){
                UnsupportedOperandType exception = new UnsupportedOperandType(right.getLine(), op.name());
                binaryExpression.addError(exception);
                return new NoType();
            }
            else {
                if (tl instanceof NoType || tr instanceof NoType)
                    return new NoType();
                else
                    return new BoolType();
            }
        }

        if ((op.equals(BinaryOperator.gt)) || (op.equals(BinaryOperator.lt)))
        {
            if (tl instanceof IntType && tr instanceof IntType)
                return new BoolType();

            if ((tl instanceof NoType || tl instanceof IntType) &&
                    (tr instanceof IntType || tr instanceof NoType))
                return new NoType();
        }

        if ((op.equals(BinaryOperator.add)) || (op.equals(BinaryOperator.sub)) || (op.equals(BinaryOperator.mult)) || (op.equals(BinaryOperator.div)))
        {
            if (tl instanceof IntType && tr instanceof IntType)
                return new IntType();

            if ((tl instanceof NoType || tl instanceof IntType) &&
                    (tr instanceof IntType || tr instanceof NoType))
                return new NoType();
        }

        if ((op.equals(BinaryOperator.and)) || (op.equals(BinaryOperator.or)))
        {
            if (tl instanceof BoolType && tr instanceof BoolType)
                return new BoolType();

            if ((tl instanceof NoType || tl instanceof BoolType) &&
                    (tr instanceof BoolType || tr instanceof NoType))
                return new NoType();
        }

        if (op.equals(BinaryOperator.assign))
        {
            if (tl instanceof IntType && tr instanceof IntType)
                return new BoolType();

            if ((tl instanceof NoType || tl instanceof IntType) &&
                    (tr instanceof IntType || tr instanceof NoType))
                return new NoType();
        }

        UnsupportedOperandType exception = new UnsupportedOperandType(left.getLine(), op.name());
        left.addError(exception);
        return new NoType();
//        return null;
    }

    @Override
    public Type visit(UnaryExpression unaryExpression) {
        //Todo
        Expression uExpr = unaryExpression.getOperand();
        Type ut = uExpr.accept(this);
        UnaryOperator op = unaryExpression.getOperator();

        if(op.equals(UnaryOperator.not))
        {
            if (ut instanceof BoolType) {
                return new BoolType();
            }
            if (ut instanceof NoType) {
                return new NoType();
            }
            else
            {
                UnsupportedOperandType exception = new UnsupportedOperandType(uExpr.getLine(), op.name());
                uExpr.addError(exception);
                return new NoType();
            }
        }

        if (op.equals(UnaryOperator.minus))
        {
            if (ut instanceof IntType) {
                return new IntType();
            }
            if (ut instanceof NoType) {
                return new NoType();
            }
            else
            {
                UnsupportedOperandType exception = new UnsupportedOperandType(uExpr.getLine(), op.name());
                uExpr.addError(exception);
                return new NoType();
            }
        }
        UnsupportedOperandType exception = new UnsupportedOperandType(uExpr.getLine(), op.name());
        uExpr.addError(exception);
        return new NoType();
//        return null;
    }

    @Override
    public Type visit(FunctionCall funcCall) {
        //Todo
        Type type = funcCall.getInstance().accept(this);
        if(type instanceof NoType){
            return new NoType();
        }
        ArrayList<Type> argTypes = new ArrayList<>();
        Type typ;
        for(int i=0;i<funcCall.getArgs().size();i++){
            typ=funcCall.getArgs().get(i).accept(this);
            argTypes.add(typ);
        }
        if (!(type instanceof FptrType)){
            if(!(type instanceof NoType))
                funcCall.addError(new CallOnNoneFptrType(funcCall.getLine()));
            return new NoType();
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
                    if (!(areTypesEqual(argTypes.get(i), t.getArgsType().get(i)))) {
                        funcCall.addError(new ArgsInFunctionCallNotMatchDefinition(funcCall.getLine()));
                        break;
                    }
                }
            }
        }
        if(t.getReturnType() instanceof VoidType){
            funcCall.addError(new CantUseValueOfVoidFunction(funcCall.getLine()));
            return new NoType();
        }
        return t.getReturnType();
    }

    @Override
    public Type visit(Identifier identifier) {
        ArrayList<Type>arr=new ArrayList<Type>();
        try {
            FunctionSymbolTableItem func = (FunctionSymbolTableItem) SymbolTable.root.getItem(FunctionSymbolTableItem.START_KEY + identifier.getName());
            if(func.getArgTypes().size()==0){
                arr.add(new VoidType());
                //System.out.println(func.getArgTypes());
                return new FptrType(arr, func.getReturnType());
            }
            return new FptrType(func.getArgTypes(), func.getReturnType());
        }catch (ItemNotFoundException e)
        {
            try {
                VariableSymbolTableItem var = (VariableSymbolTableItem) SymbolTable.top.getItem(VariableSymbolTableItem.START_KEY + identifier.getName());
                return var.getType();
            }catch (ItemNotFoundException e_)
            {
                identifier.addError(new VarNotDeclared(identifier.getLine(),identifier.getName()));
                return new NoType();
            }
        }
    }

    @Override
    public Type visit(ListAccessByIndex listAccessByIndex) {
        //Todo
        Type indexT = listAccessByIndex.getIndex().accept(this);
        Type instanceT = listAccessByIndex.getInstance().accept(this);

        if(!((indexT instanceof IntType) || (indexT instanceof NoType)))
        {
            ListIndexNotInt e = new ListIndexNotInt(listAccessByIndex.getLine());
            listAccessByIndex.addError(e);
        }

        if(instanceT instanceof NoType)
            return new NoType();
        if(!(instanceT instanceof ListType)){
            listAccessByIndex.addError(new AccessByIndexOnNonList(listAccessByIndex.getLine()));
            return new NoType();
        }
        else {
            if (indexT instanceof IntType)
                return ((ListType) instanceT).getType();
            else
                return new NoType();
        }

    }

    @Override
    public Type visit(StructAccess structAccess) {
        //Todo
        Type inst = structAccess.getInstance().accept(this);

        if (inst instanceof NoType)
        {
            return new NoType();
        }

        if (!(inst instanceof StructType))
        {
            AccessOnNonStruct exc = new AccessOnNonStruct(structAccess.getLine());
            structAccess.addError(exc);
            return new NoType();
        }

        String varN = structAccess.getElement().getName();
        String stcN = ((StructType)inst).getStructName().getName();

        StructSymbolTableItem s = getStructItemFromSymbolTable((StructType) inst);
        SymbolTable st = s.getStructSymbolTable();

        try {
            VariableSymbolTableItem var = (VariableSymbolTableItem) st.getItem(VariableSymbolTableItem.START_KEY+varN);
            return var.getType();
        }catch (ItemNotFoundException e)
        {
            StructMemberNotFound err =  new StructMemberNotFound(structAccess.getLine(),stcN,varN);
            structAccess.addError(err);
            return new NoType();
        }

    }

    @Override
    public Type visit(ListSize listSize) {
        //Todo
        Type inst = listSize.getArg().accept(this);

        if(inst instanceof ListType)
            return new IntType();

        else {
            if(!(inst instanceof NoType))
            {
                GetSizeOfNonList e = new GetSizeOfNonList(listSize.getLine());
                listSize.addError(e);
            }
            return new NoType();
        }
    }

    @Override
    public Type visit(ListAppend listAppend) {
        //Todo
        Type in1=listAppend.getListArg().accept(this);
        Type in2=listAppend.getElementArg().accept(this);
        if (in1 instanceof NoType){
            listAppend.addError(new CantUseValueOfVoidFunction(listAppend.getLine()));
            return new NoType();
        }
        if (!(in1 instanceof ListType)){
            listAppend.addError(new AppendToNonList(listAppend.getLine()));
        }else if (!areTypesEqual((((ListType) in1).getType()),in2)){
            listAppend.addError(new NewElementTypeNotMatchListType(listAppend.getLine()));
        }
        listAppend.addError(new CantUseValueOfVoidFunction(listAppend.getLine()));
        return new NoType();
    }

    @Override
    public Type visit(ExprInPar exprInPar) {
        //Todo
        return exprInPar.getInputs().get(0).accept(this);
//        return null;
    }

    @Override
    public Type visit(IntValue intValue) {
        //Todo
        return new IntType();
//        return null;
    }

    @Override
    public Type visit(BoolValue boolValue) {
        //Todo
        return new BoolType();
//        return null;
    }
}