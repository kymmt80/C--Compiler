package main.visitor.codeGenerator;

import main.ast.nodes.*;
import main.ast.nodes.declaration.*;
import main.ast.nodes.declaration.struct.*;
import main.ast.nodes.expression.*;
import main.ast.nodes.expression.operators.*;
import main.ast.nodes.expression.values.*;
import main.ast.nodes.expression.values.primitive.*;
import main.ast.nodes.statement.*;
import main.ast.types.*;
import main.ast.types.primitives.*;
import main.compileError.typeError.UnsupportedOperandType;
import main.symbolTable.*;
import main.symbolTable.exceptions.*;
import main.symbolTable.items.FunctionSymbolTableItem;
import main.symbolTable.items.StructSymbolTableItem;
import main.symbolTable.items.VariableSymbolTableItem;
import main.visitor.Visitor;
import main.visitor.type.ExpressionTypeChecker;
import org.antlr.v4.runtime.misc.Pair;

import java.io.*;
import java.util.*;

public class  CodeGenerator extends Visitor<String> {
    ExpressionTypeChecker expressionTypeChecker = new ExpressionTypeChecker();
    private String outputPath;
    private FileWriter currentFile;
    private int lastLabelIndex;
    private boolean ISmain;
    private boolean ISstruct;
    private boolean exp=false;
    private ArrayList<String> slots=new ArrayList<>();
    private String currFuncName;

    private int updateIndex()
    {
        return lastLabelIndex++;
    }

    public FunctionSymbolTableItem getFunctionSymbolTableItem(String key)
    {
        try {
            return (FunctionSymbolTableItem) SymbolTable.root.getItem(key);
        }
        catch (ItemNotFoundException e){}
        return null;
    }

    public String getArgTypeSymbol(Type t)
    {
        if (t instanceof ListType)
            return "LList;";
        if (t instanceof IntType)
            return "Ljava/lang/Integer;";
        if (t instanceof FptrType)
            return "LFptr;";
        if (t instanceof BoolType)
            return "Ljava/lang/Boolean;";
        if (t instanceof StructType)
            return "L"+(((StructType) t).getStructName().getName() + ";");;
        if (t instanceof VoidType)
            return "V";
        return null;
    }

    public String addMainInstance()
    {
        // java/lang/Object/<init>()V ??
        String command = "new Main\n";
        command += "dup\n";
        command += "invokespecial Main/<init>()V\n";
        command += "pop\n";

        return command;
    }

    public String typeCheckcast(Type t)
    {
        if (t instanceof ListType)
            return "checkcast List\n";
        else if (t instanceof IntType)
            return "checkcast java/lang/Integer;\n";
        else if (t instanceof FptrType)
            return "checkcast Fptr\n";
        else if (t instanceof BoolType)
            return "checkcast java/lang/Boolean;\n";
        else if (t instanceof StructType)
            return ("checkcast " + ((StructType) t).getStructName().toString() + "\n");
        else if (t instanceof VoidType)
            return "\n";
        return "\n";
    }

    public String get_struct(Expression lval){
        String command="";
        if(lval instanceof Identifier){
                int slot=slotOf(((Identifier) lval).getName());
                command+="aload "+slot+"\n";
        }else if(lval instanceof ListAccessByIndex){
            String commandIndex = ((ListAccessByIndex) lval).getIndex().accept(this);
            //command += commandInst;
            //command += commandIndex;
            //command += "invokevirtual java/lang/Integer/intValue()I\n";
            command +=get_struct(((ListAccessByIndex) lval).getInstance());
            command += commandIndex;
            command += "invokevirtual List/getElement(I)Ljava/lang/Object;\n";
            //command += "invokevirtual List/setElement(I;Ljava/lang/Object;)V\n";
        }
        return command;
    }

    public String initialize_command(Type type){
        String command="";
        if(type instanceof IntType){
            command+="ldc 0\n";
        }else if(type instanceof BoolType){
            command+="ldc 0\n";
        }
        if (type instanceof ListType) {
            command+="new List\n";
            command+="dup\n";
            command+="new java/util/ArrayList\n";
            command+="dup \n";
            command+="invokespecial java/util/ArrayList/<init>()V\n";
            command+="invokespecial List/<init>(Ljava/util/ArrayList;)V\n";
        } else if (type instanceof FptrType) {
            addCommand("aconst_null");
        } else if (type instanceof StructType) {
            command+="new "+ ((StructType) type).getStructName().getName()+"\n";
            command+="dup\n";
            command+="invokespecial "+((StructType) type).getStructName().getName()+"/<init>()V\n";
        }
        return command;
    }

    private void copyFile(String toBeCopied, String toBePasted) {
        try {
            File readingFile = new File(toBeCopied);
            File writingFile = new File(toBePasted);
            InputStream readingFileStream = new FileInputStream(readingFile);
            OutputStream writingFileStream = new FileOutputStream(writingFile);
            byte[] buffer = new byte[1024];
            int readLength;
            while ((readLength = readingFileStream.read(buffer)) > 0)
                writingFileStream.write(buffer, 0, readLength);
            readingFileStream.close();
            writingFileStream.close();
        } catch (IOException e) {//unreachable
        }
    }

    private void prepareOutputFolder() {
        this.outputPath = "output/";
        String jasminPath = "utilities/jarFiles/jasmin.jar";
        String listClassPath = "utilities/codeGenerationUtilityClasses/List.j";
        String fptrClassPath = "utilities/codeGenerationUtilityClasses/Fptr.j";
        try{
            File directory = new File(this.outputPath);
            File[] files = directory.listFiles();
            if(files != null)
                for (File file : files)
                    file.delete();
            directory.mkdir();
        }
        catch(SecurityException e) {//unreachable

        }
        copyFile(jasminPath, this.outputPath + "jasmin.jar");
        copyFile(listClassPath, this.outputPath + "List.j");
        copyFile(fptrClassPath, this.outputPath + "Fptr.j");
    }

    private void createFile(String name) {
        try {
            String path = this.outputPath + name + ".j";
            File file = new File(path);
            file.createNewFile();
            this.currentFile = new FileWriter(path);
        } catch (IOException e) {//never reached
        }
    }

    private void addCommand(String command) {
        try {
            command = String.join("\n\t\t", command.split("\n"));
            if(command.startsWith("Label_"))
                this.currentFile.write("\t" + command + "\n");
            else if(command.startsWith("."))
                this.currentFile.write(command + "\n");
            else
                this.currentFile.write("\t\t" + command + "\n");
            this.currentFile.flush();
        } catch (IOException e) {//unreachable

        }
    }

    private void addStaticMainMethod() {
        addCommand(".method public static main([Ljava/lang/String;)V");
        addCommand(".limit stack 128");
        addCommand(".limit locals 128");
        addCommand("new Main");
        addCommand("invokespecial Main/<init>()V");
        addCommand("return");
        addCommand(".end method");
    }

    private int slotOf(String identifier) {
        if (identifier.equals("")) {
            return slots.size()+1;
        }
        for (int i = 0; i < slots.size(); i++)
            if (slots.get(i).equals(identifier))
                return i+1;
        slots.add(identifier);
        return slots.size();
    }

    @Override
    public String visit(Program program) {
        prepareOutputFolder();

        for(StructDeclaration structDeclaration : program.getStructs()){
            structDeclaration.accept(this);
        }

        createFile("Main");

        addCommand(program.getMain().accept(this));

        for (FunctionDeclaration functionDeclaration: program.getFunctions()){
            addCommand(functionDeclaration.accept(this));
        }
        return null;
    }

    @Override
    public String visit(StructDeclaration structDeclaration) {
        //todo
        createFile(structDeclaration.getStructName().getName());
        addCommand(".class public " + structDeclaration.getStructName().getName());
        addCommand(".super java/lang/Object");
        try{
            String structKey = StructSymbolTableItem.START_KEY + structDeclaration.getStructName().getName();
            StructSymbolTableItem structSymbolTableItem = (StructSymbolTableItem)SymbolTable.root.getItem(structKey);
            SymbolTable.push(structSymbolTableItem.getStructSymbolTable());
        }catch (ItemNotFoundException e){//unreachable
        }

        ISstruct = true;
        addCommand(structDeclaration.getBody().accept(this));
        ISstruct = false;
        addCommand(".method public <init>()V");
        addCommand(".limit stack 1");
        addCommand(".limit locals 1");
        addCommand("aload_0");
        addCommand("invokespecial java/lang/Object/<init>()V");
        addCommand("return");
        addCommand(".end method");

        SymbolTable.pop();

        return null;
    }

    @Override
    public String visit(FunctionDeclaration functionDeclaration) {
        //todo
        try{
            String functionKey = FunctionSymbolTableItem.START_KEY + functionDeclaration.getFunctionName().getName();
            FunctionSymbolTableItem functionSymbolTableItem = (FunctionSymbolTableItem)SymbolTable.root.getItem(functionKey);
            SymbolTable.push(functionSymbolTableItem.getFunctionSymbolTable());
        }catch (ItemNotFoundException e){//unreachable
        }

        String funcN = functionDeclaration.getFunctionName().getName();

        String command = "";
        command += ".method public " + funcN;

        FunctionSymbolTableItem fsti = getFunctionSymbolTableItem(FunctionSymbolTableItem.START_KEY + funcN);
        StringBuilder argInput = new StringBuilder("(");
        for (VariableDeclaration arg : functionDeclaration.getArgs())
        {
            argInput.append(getArgTypeSymbol(arg.getVarType()));
            slotOf(arg.getVarName().getName());
        }
        argInput.append(")");
        String ret = getArgTypeSymbol(fsti.getReturnType());
        argInput.append(ret);

        // limit method 128 ?
        command += argInput.toString() + "\n";
        command += ".limit stack 128\n";
        command += ".limit locals 128\n";
        //command += "new Main\n";
        //command += "invokespecial Main/<init>()V\n";
        command += functionDeclaration.getBody().accept(this);
        command += ".end method\n";
        SymbolTable.pop();
        slots.clear();
        return command;
    }

    @Override
    public String visit(MainDeclaration mainDeclaration) {
        //todo
        addCommand(".class public Main");
        addCommand(".super java/lang/Object");
        try{
            String functionKey = FunctionSymbolTableItem.START_KEY + "main";
            FunctionSymbolTableItem functionSymbolTableItem = (FunctionSymbolTableItem)SymbolTable.root.getItem(functionKey);
            SymbolTable.push(functionSymbolTableItem.getFunctionSymbolTable());
        }catch (ItemNotFoundException e){//unreachable
        }
        addCommand(".method public <init>()V\n");
        addCommand(".limit stack 128\n");
        addCommand(".limit locals 128\n");
        addCommand("aload_0\n");
        addCommand("invokespecial java/lang/Object/<init>()V\n");
        addCommand("return\n");
        addCommand(".end method\n");
        addCommand("");

        ISmain = true;
        // java/lang/Object/<init>()V ??
        String command = ".method public static main([Ljava/lang/String;)V\n";
        command += ".limit stack 128\n";
        command += ".limit locals 128\n";
        command += addMainInstance();
        command += mainDeclaration.getBody().accept(this);
        command += "return\n";
        command += ".end method\n";
        //addCommand(command);
        ISmain = false;

        SymbolTable.pop();
        slots.clear();
        return command;
    }

    @Override
    public String visit(VariableDeclaration variableDeclaration) {
        //todo
        String command="";
        String def_command="";
        Type type=variableDeclaration.getVarType();
        if ( variableDeclaration.getDefaultValue() != null)
            def_command=variableDeclaration.getDefaultValue().accept(this);
        if(!ISstruct) {
            command+=def_command;
            int slot = slotOf(variableDeclaration.getVarName().getName());
            if(!Objects.equals(def_command, "")) {
                if (type instanceof BoolType || type instanceof IntType)
                    //command += "istore " + slot + "\n";
                    command+="invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;\n";
                command += "astore " + slot + "\n";
            }else{
                command+=initialize_command(type);
                if (type instanceof BoolType || type instanceof IntType)
                    //command += "istore " + slot + "\n";
                    command+="invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;\n";
                command += "astore " + slot + "\n";
            }
        }else{
            command+=".field public "+variableDeclaration.getVarName().getName()+" "+getArgTypeSymbol(variableDeclaration.getVarType())+"\n";
        }
        return command;
    }

    @Override
    public String visit(SetGetVarDeclaration setGetVarDeclaration) {
        return null;
    }

    @Override
    public String visit(AssignmentStmt assignmentStmt) {
        //todo
        Type lval=assignmentStmt.getLValue().accept(expressionTypeChecker);
        Type rval=assignmentStmt.getRValue().accept(expressionTypeChecker);
        String rval_command=assignmentStmt.getRValue().accept(this);
        String command="";
        if(assignmentStmt.getLValue() instanceof StructAccess){
            StructType type= (StructType) ((StructAccess) assignmentStmt.getLValue()).getInstance().accept(expressionTypeChecker);
            if(((StructAccess) assignmentStmt.getLValue()).getInstance() instanceof Identifier){
                int slot=slotOf(((Identifier) ((StructAccess) assignmentStmt.getLValue()).getInstance()).getName());
                command+="aload "+slot+"\n";
            }
            //command+=get_struct(assignmentStmt.getLValue());
            //load struct access
            command+=rval_command;
            if(exp)
                command+="dup\n";
            if(rval instanceof IntType){
                command+="invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;\n";
            }if(rval instanceof BoolType){
                command+="invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;\n";
            }
            Type elementType=null;
            VariableSymbolTableItem var;
            try {
                StructSymbolTableItem s= (StructSymbolTableItem) SymbolTable.root.getItem(StructSymbolTableItem.START_KEY + type.getStructName().getName());
                var= (VariableSymbolTableItem) s.getStructSymbolTable().getItem(VariableSymbolTableItem.START_KEY+((StructAccess)assignmentStmt.getLValue()).getElement().getName());
                elementType=var.getType();
            }catch (Exception e){}
            command+="putfield "+ type.getStructName().getName()+"/"+((StructAccess)assignmentStmt.getLValue()).getElement().getName()+" "+getArgTypeSymbol(elementType)+"\n";
        }else if(assignmentStmt.getLValue() instanceof Identifier){
            command+=rval_command;
            int slot=slotOf(((Identifier) assignmentStmt.getLValue()).getName());
            if(exp)
                command+="dup\n";
            if(lval instanceof IntType ||lval instanceof BoolType)
                //command+="istore "+slot+"\n";
                command+="invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;\n";
            command+="astore "+slot+"\n";
        }
        return command;
    }

    @Override
    public String visit(BlockStmt blockStmt) {
        StringBuilder command = new StringBuilder();
        for (Statement stmt : blockStmt.getStatements())
            command.append(stmt.accept(this)).append('\n');

        return command.toString();
    }

    @Override
    public String visit(ConditionalStmt conditionalStmt) {
        //todo
        String elseLabelJumpLine = "Label" + updateIndex();
        String afterLabelJumpLine = "Label" + updateIndex();
        String command = "";
        command += conditionalStmt.getCondition().accept(this);
        //command += "invokevirtual java/lang/Boolean/booleanValue()Z\n";
        if(conditionalStmt.getElseBody()!=null) {
            command += "ifeq " + elseLabelJumpLine + "\n";
            command += conditionalStmt.getThenBody().accept(this);
            command += "goto " + afterLabelJumpLine + "\n";
            command += elseLabelJumpLine + ":\n";
            command += conditionalStmt.getElseBody().accept(this);
        }else{
            command += "ifeq " + afterLabelJumpLine + "\n";
            command += conditionalStmt.getThenBody().accept(this);
        }
        command += afterLabelJumpLine + ":\n";

        return command;
    }

    @Override
    public String visit(FunctionCallStmt functionCallStmt) {
        //todo
        expressionTypeChecker.setInFunctionCallStmt(true);
        String command = "";
        command += functionCallStmt.getFunctionCall().accept(this);

        //Type t = functionCallStmt.getFunctionCall().accept(expressionTypeChecker);
        //if (!(t instanceof VoidType))
        //    command += "pop\n";

        expressionTypeChecker.setInFunctionCallStmt(false);

        return command;
    }

    @Override
    public String visit(DisplayStmt displayStmt) {
        String command="";
        command+="getstatic java/lang/System/out Ljava/io/PrintStream;\n";
        Type argType = displayStmt.getArg().accept(expressionTypeChecker);
        String commandsOfArg = displayStmt.getArg().accept(this);
        command+=commandsOfArg+"\n";
        if (argType instanceof IntType)
            command+="invokevirtual java/io/PrintStream/println(I)V\n";
        if (argType instanceof BoolType)
            command+="invokevirtual java/io/PrintStream/println(Z)V\n";

        return command;
    }

    @Override
    public String visit(ReturnStmt returnStmt) {
        //todo
        String command = "";
        if(returnStmt.getReturnedExpr() != null) {
            command += returnStmt.getReturnedExpr().accept(this);
            Type returnT = returnStmt.getReturnedExpr().accept(expressionTypeChecker);
            if (returnT instanceof IntType) {
                command += "invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;\n";
            } else if (returnT instanceof BoolType) {
                command += "invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;\n";
            }
                command += "areturn\n";
        }else {
                command += "return\n";
        }

        return command;
    }

    @Override
    public String visit(LoopStmt loopStmt) {
        //todo
        Expression cond = loopStmt.getCondition();
        Statement body = loopStmt.getBody();
        String commandcond = "Label" + updateIndex();
        String commandbody = "Label" + updateIndex();
        String command = "";

        if(loopStmt.getIsDoWhile())
        {
            command += commandbody + ":\n";
            command += body.accept(this);
            command += commandcond + ":\n";
            command += cond.accept(this);
            command += "ifne " + commandbody + "\n";

        }
        else {
            command += "goto " + commandcond + "\n";
            command += commandbody + ":\n";
            command += body.accept(this);
            command += commandcond + ":\n";
            command += cond.accept(this);
            command += "ifne " + commandbody + "\n";
        }

        return command;
    }

    @Override
    public String visit(VarDecStmt varDecStmt) {
        StringBuilder command = new StringBuilder();
        for (VariableDeclaration var : varDecStmt.getVars())
            command.append(var.accept(this)).append('\n');
        return command.toString();
    }

    @Override
    public String visit(ListAppendStmt listAppendStmt) {
        expressionTypeChecker.setInFunctionCallStmt(true);
        String command = "";
        command += listAppendStmt.getListAppendExpr().accept(this);
        expressionTypeChecker.setInFunctionCallStmt(false);

        return command;
    }

    @Override
    public String visit(ListSizeStmt listSizeStmt) {
        String command = "";
        command += listSizeStmt.getListSizeExpr().accept(this);
        command +="pop\n";
        return command;
    }

    @Override
    public String visit(BinaryExpression binaryExpression) {
        //todo
        String command = "";
        String commandLeft = binaryExpression.getFirstOperand().accept(this);
        String commandRight = binaryExpression.getSecondOperand().accept(this);
        Type tl = binaryExpression.getFirstOperand().accept(expressionTypeChecker);
        Type tr = binaryExpression.getSecondOperand().accept(expressionTypeChecker);
        BinaryOperator op = binaryExpression.getBinaryOperator();
        String commandOp = "";
        command+=commandLeft;
        command+=commandRight;
        if (op == BinaryOperator.add) {
            command += "iadd\n";
        } else if (op == BinaryOperator.sub) {
            command += "isub\n";
        } else if (op == BinaryOperator.mult) {
            command += "imul\n";
        } else if (op == BinaryOperator.div) {
            command += "idiv\n";
        }else if (op == BinaryOperator.and) {
            command += "iand\n";
        } else if (op == BinaryOperator.or) {
            command += "ior\n";
        }else if ((op == BinaryOperator.gt) || (op == BinaryOperator.lt)) {
            String label_gt=Integer.toString(updateIndex());
            String label_end=Integer.toString(updateIndex());
            command += "if_icmp" + op + " Label" + label_gt+'\n';
            command += "ldc 0\n";
            command += "goto Label" + label_end+'\n';
            command += "Label" + label_gt + ":\n";
            command += "ldc 1\n";
            command += "Label" + label_end+ ":\n";
        }else if (op == BinaryOperator.eq) {
            String label_eq=Integer.toString(updateIndex());
            String label_end=Integer.toString(updateIndex());
            command+="if_icmpeq"+ " Label"+label_eq+"\n";
            command += "ldc 0\n";
            command += "goto Label" + label_end+"\n";
            command += "Label" + label_eq + ":\n";
            command += "ldc 1\n";
            command += "Label" + label_end + ":\n";
        }else if (op == BinaryOperator.assign) {
            command="";
            exp=true;
            command+=new AssignmentStmt(binaryExpression.getFirstOperand(),binaryExpression.getSecondOperand()).accept(this);
            exp=false;
        }

        return command;
    }

    @Override
    public String visit(UnaryExpression unaryExpression){
        return null;
    }

    @Override
    public String visit(StructAccess structAccess){
        //todo
        Type type=structAccess.getInstance().accept(expressionTypeChecker);
        String struct_command=structAccess.getInstance().accept(this);
        String field=structAccess.getElement().getName();
        String command="";
        command+=struct_command;
        Type elementType=null;
        VariableSymbolTableItem var;
        try {
            StructSymbolTableItem s= (StructSymbolTableItem) SymbolTable.root.getItem(StructSymbolTableItem.START_KEY + ((StructType)type).getStructName().getName());
            var= (VariableSymbolTableItem) s.getStructSymbolTable().getItem(VariableSymbolTableItem.START_KEY+field);
            elementType=var.getType();
        }catch (Exception e){}
        command+="getfield "+((StructType)type).getStructName().getName()+"/"+field+" "+getArgTypeSymbol(elementType)+"\n";
        if(elementType instanceof IntType){
            command+="invokevirtual java/lang/Integer/intValue()I\n";
        }if(elementType instanceof BoolType){
            command+="invokevirtual java/lang/Boolean/booleanValue()Z\n";
        }
        return command;
    }

    @Override
    public String visit(Identifier identifier){
        //todo
        String command = "";
        Type type = identifier.accept(expressionTypeChecker);
        ArrayList<Type>arr=new ArrayList<Type>();
        try {
            FunctionSymbolTableItem func = (FunctionSymbolTableItem) SymbolTable.root.getItem(FunctionSymbolTableItem.START_KEY + identifier.getName());
            command += "new Fptr\ndup\n";
            command += "new Main"+"\n" + "dup\n"+"invokespecial Main/<init>()V\n";
            command += "ldc \"" + identifier.getName() + "\"\n";
            command += "invokespecial Fptr/<init>(Ljava/lang/Object;Ljava/lang/String;)V\n";
        }catch (ItemNotFoundException e) {
            int slot = slotOf(identifier.getName());

//                command += "iload " + slot + "\n";
//            else
                command += "aload " + slot + "\n";
            if (type instanceof IntType)
                command += "invokevirtual java/lang/Integer/intValue()I\n";
            else if(type instanceof BoolType)
                command += "invokevirtual java/lang/Boolean/booleanValue()Z\n";

        }
        return command;
    }

    @Override
    public String visit(ListAccessByIndex listAccessByIndex){
        //todo
        String commandInst = listAccessByIndex.getInstance().accept(this);
        String commandIndex = listAccessByIndex.getIndex().accept(this);
        Type inst_type=listAccessByIndex.getInstance().accept(expressionTypeChecker);
        String command = "";
        command += commandInst;
        command += commandIndex;
        //command += "invokevirtual java/lang/Integer/intValue()I\n";
        command += "invokevirtual List/getElement(I)Ljava/lang/Object;\n";
        //command += "checkcast java/lang/Integer\n";
        if(((ListType)inst_type).getType() instanceof IntType) {
            command += "checkcast java/lang/Integer\n";
            command += "invokevirtual java/lang/Integer/intValue()I\n";
        }
        if(((ListType)inst_type).getType() instanceof BoolType){
            command += "checkcast java/lang/Boolean\n";
            command += "invokevirtual java/lang/Boolean/booleanValue()Z\n";
        }

        return command;
    }

    @Override
    public String visit(FunctionCall functionCall){
        //todo
        String commands = "";
        commands += functionCall.getInstance().accept(this);
        commands += "new java/util/ArrayList\n";
        commands += "dup\n";
        commands += "invokespecial java/util/ArrayList/<init>()V\n";
        commands += "astore "+slotOf("")+'\n';
        for (Expression arg : functionCall.getArgs()) {
            commands += "aload "+slotOf("")+'\n';
            Type argType = arg.accept(expressionTypeChecker);
            if (argType instanceof IntType) {
                commands += arg.accept(this);
                commands += "invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;\n";
            } else if (argType instanceof BoolType) {
                commands += arg.accept(this);
                commands += "invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;\n";
            } else {
                commands += arg.accept(this);
            }
            commands += "invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z\n";
            commands += "pop\n";
        }
        commands += "aload "+slotOf("")+'\n';
        commands += "invokevirtual Fptr/invoke(Ljava/util/ArrayList;)Ljava/lang/Object;\n";
        Type returnType = ((FptrType) functionCall.getInstance().accept(expressionTypeChecker)).getReturnType();
        if (returnType instanceof IntType) {
            commands += "checkcast java/lang/Integer\n";
            commands += "invokevirtual java/lang/Integer/intValue()I\n";
        } else if (returnType instanceof BoolType) {
            commands += "checkcast java/lang/Boolean\n";
            commands += "invokevirtual java/lang/Boolean/booleanValue()Z\n";
        }else if (returnType instanceof FptrType){
            commands += "checkcast Fptr\n";
        }else if(returnType instanceof ListType){
            commands += "checkcast List\n";
        }else if (returnType instanceof VoidType) {
            commands += "pop\n";
        }
        return commands;
}

    @Override
    public String visit(ListSize listSize){
        //todo
        String commandInst = listSize.getArg().accept(this);
        String command = "";
        command += commandInst;
        command += "invokevirtual List/getSize()I\n";

        return command;
    }

    @Override
    public String visit(ListAppend listAppend) {
        //todo
        String command = "";
        String list = listAppend.getListArg().accept(this);
        String element = listAppend.getElementArg().accept(this);
        command += list;
        command += element;
        command +="invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;\n";
        command += "invokevirtual List/addElement(Ljava/lang/Object;)V\n";

        return command;
    }

    //done
    @Override
    public String visit(IntValue intValue) {
        String command = "";
//        if ((0 <= intValue.getConstant()) && (intValue.getConstant() <= 5))
//            command += "iconst_";
//        else
//            command += "bipush ";
        command +="ldc ";
        command += Integer.toString(intValue.getConstant())+'\n';
        return command;
    }

    //done
    @Override
    public String visit(BoolValue boolValue) {
        String commands = "";
        if (boolValue.getConstant())
            commands += "ldc 1\n";
        else
            commands += "ldc 0\n";
        return commands;
    }


    //done
    @Override
    public String visit(ExprInPar exprInPar) {
        return exprInPar.getInputs().get(0).accept(this);
    }
}
