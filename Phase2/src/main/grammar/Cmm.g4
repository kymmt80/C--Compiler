grammar Cmm;

@header{
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
     import java.util.*;
 }

cmm returns[Program cmmProgram]:
    NEWLINE* p = program {$cmmProgram = $p.programRet;} NEWLINE* EOF;

program returns[Program programRet]:
    {
    $programRet = new Program();
     int line = 1;
     $programRet.setLine(line);
//     {System.out.println("New Program Is created.");}
     }
    (
    s = structDeclaration {$programRet.addStruct($s.structDeclarationRet);}
    {System.out.println("programRet.addStruct called");}
    )*
    (
    f = functionDeclaration {$programRet.addFunction($f.functionDeclarationRet);}
//    {System.out.println("programRet.addfunction called");}
    )*
    m = main {$programRet.setMain($m.mainRet);}
    ;

//todo
main returns[MainDeclaration mainRet]:
    {$mainRet = new MainDeclaration();}
    m = MAIN LPAR RPAR {$mainRet.setLine($m.getLine());}
    b = body
    {$mainRet.setBody($b.bodyRet);}
    ;

//todo
structDeclaration returns[StructDeclaration structDeclarationRet]:
    s = STRUCT
    i = identifier
    {$structDeclarationRet = new StructDeclaration() ;
    $structDeclarationRet.setLine($s.getLine());
    $structDeclarationRet.setStructName($i.identifierRet);}
    ((b = BEGIN
    sb = structBody
    {$sb.structBodyRet.setLine($b.getLine());}
    {$structDeclarationRet.setBody($sb.structBodyRet);}
    NEWLINE+ END) | (NEWLINE+
    sssb = singleStatementStructBody
    {$sssb.singleStatementStructBodyRet.setLine($b.getLine());}
    {$structDeclarationRet.setBody($sssb.singleStatementStructBodyRet);}
    SEMICOLON?)) NEWLINE+
    ;


//todo
singleVarWithGetAndSet returns[SetGetVarDeclaration setgetVarRet]:
    {$setgetVarRet = new SetGetVarDeclaration();}
    t = type
    {$setgetVarRet.setVarType($t.typeRet);}
    i = identifier
    {$setgetVarRet.setVarName($i.identifierRet);}
    {$setgetVarRet.setLine($i.identifierRet.getLine());}
    fad = functionArgsDec
    {$setgetVarRet.setArgs($fad.ArgsDeclarationForFuncVariableRet);}
    BEGIN NEWLINE+
    sb = setBody
    {$setgetVarRet.setSetterBody($sb.setBodyRet);}
    gb = getBody
    {$setgetVarRet.setGetterBody($gb.getBodyRet);}
    END
    ;

//todo
singleStatementStructBody  returns[Statement singleStatementStructBodyRet]:
    vds = varDecStatement
    {$singleStatementStructBodyRet = $vds.VarDecStmtRet;}
    |
    svwgas = singleVarWithGetAndSet
    {$singleStatementStructBodyRet = $svwgas.setgetVarRet;}
    ;

//todo
structBody returns[BlockStmt structBodyRet]:
    {$structBodyRet = new BlockStmt();}
    (NEWLINE+ (
    sssb = singleStatementStructBody
    {$structBodyRet.addStatement($sssb.singleStatementStructBodyRet);}
    SEMICOLON)*
    sssb1 = singleStatementStructBody
    {$structBodyRet.addStatement($sssb1.singleStatementStructBodyRet);}
    SEMICOLON?)+
    ;

//todo
getBody returns[Statement getBodyRet]:
    GET
    b = body
    {$getBodyRet = $b.bodyRet;}
    NEWLINE+
    ;

//todo
setBody returns[Statement setBodyRet]:
    SET
    b = body
    {$setBodyRet = $b.bodyRet;}
    NEWLINE+
    ;

//todo
functionDeclaration returns[FunctionDeclaration functionDeclarationRet]:
    {$functionDeclarationRet = new FunctionDeclaration();}
    (t = type {$functionDeclarationRet.setReturnType($t.typeRet);}
    | VOID {$functionDeclarationRet.setReturnType(new VoidType());})
    i = identifier
    {$functionDeclarationRet.setLine($i.identifierRet.getLine());}
    {$functionDeclarationRet.setFunctionName($i.identifierRet);}
    fad = functionArgsDec
    {$functionDeclarationRet.setArgs($fad.ArgsDeclarationForFuncVariableRet);}
    b = body
    {$functionDeclarationRet.setBody($b.bodyRet);}
    NEWLINE+
    ;

//todo
functionArgsDec returns [ArrayList<VariableDeclaration> ArgsDeclarationForFuncVariableRet] locals[VariableDeclaration varTemp]:
    {$ArgsDeclarationForFuncVariableRet = new ArrayList<>();}
    LPAR (
    t = type i = identifier
    {
    $varTemp = new VariableDeclaration($i.identifierRet,$t.typeRet);
    $varTemp.setLine($i.identifierRet.getLine());
    $ArgsDeclarationForFuncVariableRet.add($varTemp);
    }
    (COMMA
    tt = type ii = identifier
    {
    $varTemp = new VariableDeclaration($ii.identifierRet,$tt.typeRet);
    $varTemp.setLine($ii.identifierRet.getLine());
    $ArgsDeclarationForFuncVariableRet.add($varTemp);
    }
    )*)? RPAR
    ;

//todo
functionArguments  returns[ExprInPar funcArgumentsRet] locals[ArrayList<Expression> exprs]:
    {$exprs = new ArrayList<>();}
    (
    e = expression
    {$exprs.add($e.expressionRet);}
    (COMMA
    ee = expression
    {$exprs.add($ee.expressionRet);}
    )*)?
    {$funcArgumentsRet = new ExprInPar($exprs);}
    ;

//todo
body returns [Statement bodyRet]:
     (
     bs = blockStatement
     {$bodyRet = $bs.blockStatementRet;}
     | (NEWLINE+
     ss = singleStatement
     {$bodyRet = $ss.singleStatementRet;}
     (SEMICOLON)?))
     ;

//todo
loopCondBody returns [Statement loopCondBodyRet]:
     (
     bs = blockStatement
     {$loopCondBodyRet = $bs.blockStatementRet;}
     | (NEWLINE+
     ss = singleStatement
     {$loopCondBodyRet = $ss.singleStatementRet;}
     ))
     ;

//todo
blockStatement returns [BlockStmt blockStatementRet]:
    {$blockStatementRet = new BlockStmt();}
    b = BEGIN
    {$blockStatementRet.setLine($b.getLine());}
    (NEWLINE+ (
    ss = singleStatement
    {$blockStatementRet.addStatement($ss.singleStatementRet);}
    SEMICOLON)*
    ss1 = singleStatement
    {$blockStatementRet.addStatement($ss1.singleStatementRet);}
    (SEMICOLON)?)+ NEWLINE+ END
    ;

//todo
varDecStatement returns [VarDecStmt VarDecStmtRet] locals[VariableDeclaration vardectemp,ArrayList<VariableDeclaration> vardecstmtTemp]:
    {$vardecstmtTemp = new ArrayList<>();}
    t = type
    i = identifier
    {$vardectemp = new VariableDeclaration($i.identifierRet,$t.typeRet);}
    {$vardectemp.setLine($i.identifierRet.getLine());}
    {$VarDecStmtRet = new VarDecStmt();}
    {$VarDecStmtRet.setLine($i.identifierRet.getLine());}
    (ASSIGN
    oe = orExpression
    {$vardectemp.setDefaultValue($oe.orExpRet);}
    )?
    {$vardecstmtTemp.add($vardectemp);}
    (COMMA
    i1 = identifier
    {$vardectemp = new VariableDeclaration($i1.identifierRet,$t.typeRet);}
    {$vardectemp.setLine($i1.identifierRet.getLine());}
    (ASSIGN
    oe1 = orExpression
    {$vardectemp.setDefaultValue($oe1.orExpRet);}
    )?
    {$vardecstmtTemp.add($vardectemp);}
    )*
    {$VarDecStmtRet.setVars($vardecstmtTemp);}
    ;

//todo
functionCallStmt returns[FunctionCallStmt funcCallStmtRet] locals[Expression expr,FunctionCall fc]:
     oe = otherExpression {$expr = $oe.otherExpRet;}
     (( l = LPAR
     fa1 = functionArguments {$expr = new FunctionCall($expr,$fa1.funcArgumentsRet.getInputs());}
     {$expr.setLine($l.getLine());}
     RPAR) | (d = DOT
     i = identifier {$expr = new StructAccess($expr,$i.identifierRet);}
     {$expr.setLine($d.getLine());}
     ))* (ll = LPAR
     fa = functionArguments
     {$fc = new FunctionCall($expr,$fa.funcArgumentsRet.getInputs());}
     {$fc.setLine($ll.getLine());}
     {$funcCallStmtRet = new FunctionCallStmt($fc);}
     {$funcCallStmtRet.setLine($ll.getLine());}
     RPAR)
     ;

//todo
returnStatement returns [ReturnStmt returnRet]:
    {$returnRet = new ReturnStmt();}
    r = RETURN (e = expression)?{$returnRet.setReturnedExpr($e.expressionRet);} {$returnRet.setLine($r.getLine());}
    ;

//todo
ifStatement returns [ConditionalStmt ifstmtRet]:
    i = IF
    e = expression
    {$ifstmtRet = new ConditionalStmt($e.expressionRet); $ifstmtRet.setLine($i.getLine());}
    (lcb = loopCondBody {$ifstmtRet.setThenBody($lcb.loopCondBodyRet);}|
    b = body {$ifstmtRet.setThenBody($b.bodyRet);}
    es = elseStatement {$ifstmtRet.setElseBody($es.loopCondElseBodyRet);})
    ;

//todo
elseStatement returns [Statement loopCondElseBodyRet]:
     NEWLINE* ELSE lcb = loopCondBody {$loopCondElseBodyRet = $lcb.loopCondBodyRet;}
     ;

//todo
loopStatement returns [Statement loopStatementRet]:
    wls = whileLoopStatement {$loopStatementRet = $wls.wloopstmtRet;}
    |
    dwls = doWhileLoopStatement {$loopStatementRet = $dwls.dwloopstmtRet;}
    ;

//todo
whileLoopStatement returns [LoopStmt wloopstmtRet]:
    w = WHILE {$wloopstmtRet = new LoopStmt();}
    {$wloopstmtRet.setLine($w.getLine());}
    e = expression {$wloopstmtRet.setCondition($e.expressionRet);}
    lcb = loopCondBody {$wloopstmtRet.setBody($lcb.loopCondBodyRet);}
    ;

//todo
doWhileLoopStatement  returns [LoopStmt dwloopstmtRet]:
    d = DO {$dwloopstmtRet = new LoopStmt();}
    {$dwloopstmtRet.setLine($d.getLine());}
    b = body {$dwloopstmtRet.setBody($b.bodyRet);}
    NEWLINE* WHILE
    e = expression {$dwloopstmtRet.setCondition($e.expressionRet);}
    ;

//todo
displayStatement returns[DisplayStmt displayStmtRet]:
      d_ = DISPLAY LPAR
      e = expression {$displayStmtRet = new DisplayStmt($e.expressionRet);}
      {$displayStmtRet.setLine($d_.getLine());}
      RPAR
      ;

//todo
assignmentStatement returns[AssignmentStmt assignmentStmtRet]:
    lval_ = orExpression a = ASSIGN rval_ = expression
    {$assignmentStmtRet = new AssignmentStmt($lval_.orExpRet,$rval_.expressionRet);}
    {$assignmentStmtRet.setLine($a.getLine());}
    ;

//todo
singleStatement returns [Statement singleStatementRet]:
    is = ifStatement {$singleStatementRet = $is.ifstmtRet;}
    | ds = displayStatement {$singleStatementRet = $ds.displayStmtRet;}
    | fcs = functionCallStmt {$singleStatementRet = $fcs.funcCallStmtRet;}
    | rs = returnStatement {$singleStatementRet = $rs.returnRet;}
    | as = assignmentStatement {$singleStatementRet = $as.assignmentStmtRet;}
    | vds = varDecStatement {$singleStatementRet = $vds.VarDecStmtRet;}
    | ls = loopStatement {$singleStatementRet = $ls.loopStatementRet;}
    | a = append {$singleStatementRet = new ListAppendStmt($a.appExpRet);}
    {$singleStatementRet.setLine($a.appExpRet.getLine());}
    | s = size {$singleStatementRet = new ListSizeStmt($s.siExpRet);}
    {$singleStatementRet.setLine($s.siExpRet.getLine());}
    ;

//todo
expression returns [Expression expressionRet] locals[BinaryOperator bo]:
    fe = orExpression {$expressionRet = $fe.orExpRet;}
    ( {$bo = BinaryOperator.assign;} op = ASSIGN
    e = expression
    {$expressionRet = new BinaryExpression($fe.orExpRet,$e.expressionRet,$bo);}
    {$expressionRet.setLine($op.getLine());}
    )?
    ;

//todo
orExpression returns [Expression orExpRet] locals[BinaryOperator bo]:
    ae = andExpression {$orExpRet = $ae.andExpRet;}
    ({$bo = BinaryOperator.or;} op = OR
    ae_ = andExpression
    {$orExpRet = new BinaryExpression($ae.andExpRet,$ae_.andExpRet,$bo);}
    {$orExpRet.setLine($op.getLine());}
    )*
    ;

//todo
andExpression returns [Expression andExpRet] locals[BinaryOperator bo]:
    ee = equalityExpression {$andExpRet = $ee.eqExpRet;}
    ({$bo = BinaryOperator.and; } op = AND
    ee_ = equalityExpression
    {$andExpRet = new BinaryExpression($ee.eqExpRet,$ee_.eqExpRet,$bo);}//Cannot resolve symbol 'ee'
    {$andExpRet.setLine($op.getLine());}
    )*
    ;

//todo
equalityExpression returns [Expression eqExpRet] locals[BinaryOperator bo]:
    re = relationalExpression {$eqExpRet = $re.reExpRet;}
    ({$bo = BinaryOperator.eq;} op = EQUAL
    re_ = relationalExpression
    {$eqExpRet = new BinaryExpression($re.reExpRet,$re_.reExpRet,$bo);}
    {$eqExpRet.setLine($op.getLine());}
    )*;

//todo
relationalExpression returns [Expression reExpRet] locals[BinaryOperator bo]:
    ae = additiveExpression {$reExpRet = $ae.addExpRet;}
    ((op = GREATER_THAN {$bo = BinaryOperator.gt;}
    | op = LESS_THAN {$bo = BinaryOperator.lt;} )
    ae_ = additiveExpression
    {$reExpRet = new BinaryExpression($ae.addExpRet,$ae_.addExpRet,$bo);}
    {$reExpRet.setLine($op.getLine());}
    )*
    ;

//todo
additiveExpression returns [Expression addExpRet] locals[BinaryOperator bo]:
    me = multiplicativeExpression {$addExpRet = $me.multiExpRet;}
    ((op = PLUS  {$bo = BinaryOperator.add;}
    | op = MINUS {$bo = BinaryOperator.sub;} )
    me_ = multiplicativeExpression
    {$addExpRet = new BinaryExpression($me.multiExpRet,$me_.multiExpRet,$bo);}
    {$addExpRet.setLine($op.getLine());}
    )*
    ;

//todo
multiplicativeExpression returns [Expression multiExpRet] locals[BinaryOperator bo]:
    pe = preUnaryExpression {$multiExpRet = $pe.puExpRet;}
    ((op = MULT {$bo = BinaryOperator.mult;}
    | op = DIVIDE{$bo = BinaryOperator.div;} )
    pe_ = preUnaryExpression
    {$multiExpRet = new BinaryExpression($pe.puExpRet,$pe_.puExpRet,$bo);}
    {$multiExpRet.setLine($op.getLine());}
    )*
    ;

//todo
preUnaryExpression returns [Expression puExpRet] locals[UnaryOperator uo]:
    ((op = NOT {$uo = UnaryOperator.not;}
    | op = MINUS {$uo = UnaryOperator.minus;})
    pe = preUnaryExpression
    {$puExpRet = new UnaryExpression($pe.puExpRet, $uo);}
    {$puExpRet.setLine($op.getLine());}
    ) |
    ae = accessExpression
    {$puExpRet = $ae.accExpRet;}
    {$puExpRet.setLine($ae.accExpRet.getLine());}
    ;

//todo
accessExpression returns [Expression accExpRet]:
    oe = otherExpression {$accExpRet = $oe.otherExpRet;}
    ((l = LPAR fa = functionArguments RPAR {$accExpRet = new FunctionCall($accExpRet,$fa.funcArgumentsRet.getInputs());})
    {$accExpRet.setLine($l.getLine());}
    | (d = DOT i = identifier{$accExpRet = new StructAccess($accExpRet,$i.identifierRet);}
    {$accExpRet.setLine($d.getLine());}
    ))*
    ((ll = LBRACK e = expression {$accExpRet = new ListAccessByIndex($accExpRet,$e.expressionRet);}RBRACK)
    {$accExpRet.setLine($ll.getLine());}
    | (dd = DOT i_ = identifier{$accExpRet = new StructAccess($accExpRet,$i.identifierRet);}
    {$accExpRet.setLine($dd.getLine());}
    ))*
    ;

//todo
otherExpression returns [Expression otherExpRet]:
    v = value {$otherExpRet = $v.valRet;}
    | i = identifier {$otherExpRet = $i.identifierRet;}
    | LPAR (fa = functionArguments {$otherExpRet = $fa.funcArgumentsRet;}{$otherExpRet.setLine($LPAR.getLine());}) RPAR
    | s = size {$otherExpRet = $s.siExpRet;}
    | a = append {$otherExpRet = $a.appExpRet;}
    ;

//todo
size returns [ListSize siExpRet]:
    s = SIZE LPAR e = expression RPAR
    {$siExpRet = new ListSize($e.expressionRet);}
    {$siExpRet.setLine($s.getLine());}
    ;

//todo
append returns [ListAppend appExpRet]:
    a = APPEND LPAR e = expression COMMA e_ = expression RPAR
    {$appExpRet = new ListAppend($e.expressionRet,$e_.expressionRet);}
    {$appExpRet.setLine($a.getLine());}
    ;

//todo
value returns [Value valRet]:
    bv = boolValue
    {$valRet = $bv.boolvalRet;}
    | iv = INT_VALUE {$valRet = new IntValue(Integer.parseInt($iv.text)); $valRet.setLine($iv.getLine());}
    ;

//todo
boolValue returns [BoolValue boolvalRet] :
    t = TRUE {$boolvalRet = new BoolValue(true); $boolvalRet.setLine($t.getLine());}
    |
    f = FALSE{$boolvalRet = new BoolValue(false); $boolvalRet.setLine($f.getLine());}
    ;

//todo
identifier returns [Identifier identifierRet]:
    i = IDENTIFIER
    {$identifierRet = new Identifier($i.getText());
    $identifierRet.setLine($i.getLine());}
    ;

//err
//todo
type returns [Type typeRet]:
    INT {$typeRet = new IntType();}
    | BOOL {$typeRet = new BoolType();}
    | LIST SHARP t = type {$typeRet = $t.typeRet;}
    | STRUCT i = identifier {$typeRet = new StructType($i.identifierRet);}
    | fT = fptrType {$typeRet = $fT.fptrTRet;}
    ;

//todo
fptrType returns [FptrType fptrTRet] locals[Type stRet, ArrayList<Type> ft]:
    {$ft = new ArrayList<>();}
    FPTR LESS_THAN (VOID {$ft.add(new VoidType());}
    | (t = type {$ft.add($t.typeRet);}
    (COMMA t1 = type {$ft.add($t1.typeRet);} )*))
    ARROW (
    t2 = type {$stRet = $t2.typeRet;}|
    VOID {$stRet = new VoidType();} ) GREATER_THAN
    {$fptrTRet = new FptrType($ft,$stRet);}
    ;

MAIN: 'main';
RETURN: 'return';
VOID: 'void';

SIZE: 'size';
DISPLAY: 'display';
APPEND: 'append';

IF: 'if';
ELSE: 'else';

PLUS: '+';
MINUS: '-';
MULT: '*';
DIVIDE: '/';


EQUAL: '==';
ARROW: '->';
GREATER_THAN: '>';
LESS_THAN: '<';


AND: '&';
OR: '|';
NOT: '~';

TRUE: 'true';
FALSE: 'false';

BEGIN: 'begin';
END: 'end';

INT: 'int';
BOOL: 'bool';
LIST: 'list';
STRUCT: 'struct';
FPTR: 'fptr';
GET: 'get';
SET: 'set';
WHILE: 'while';
DO: 'do';

ASSIGN: '=';
SHARP: '#';
LPAR: '(';
RPAR: ')';
LBRACK: '[';
RBRACK: ']';

COMMA: ',';
DOT: '.';
SEMICOLON: ';';
NEWLINE: '\n';

INT_VALUE: '0' | [1-9][0-9]*;
IDENTIFIER: [a-zA-Z_][A-Za-z0-9_]*;


COMMENT: ('/*' .*? '*/') -> skip;
WS: ([ \t\r]) -> skip;