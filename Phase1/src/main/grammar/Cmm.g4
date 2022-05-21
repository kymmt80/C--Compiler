grammar Cmm;

    cmm:
        (NEWLINE)*(struct)*(function)* main EOF
    ;

    main:
        MAIN { System.out.println("Main"); } LPAR RPAR scope (NEWLINE)*
    |   MAIN { System.out.println("Main"); } LPAR RPAR body
    ;

    funcReturnType:
        listFormat|TYPE|STRUCT ID|VOID|fptrFormat
    ;

    functionDeclare:
        funcReturnType ID { System.out.println("FunctionDec : " + $ID.getText()); } argumentsDec
    ;

    function:
        functionDeclare scope (NEWLINE)*
    ;

    body:
        ifConditions|stateFunctionCall endLine|returner endLine|statement endLine|whileLoop|NEWLINE
    ;

    varDeclare:
         varType ID{ System.out.println("VarDec : " + $ID.getText()); } (ASSIGN expression)? (COMMA ID { System.out.println("VarDec : " + $ID.getText()); }(ASSIGN expression)?)*endLine
    ;

    setgetVarDec:
        funcReturnType ID { System.out.println("VarDec : " + $ID.getText()); } argumentsDec
    ;

    structVars:
        ((varDeclare)|(setgetVarDec BEGIN (NEWLINE)* getterSetter (NEWLINE)* END(NEWLINE|SEMICOLON) (NEWLINE)*)|NEWLINE)*
    ;

    gsbody:
        (ifConditions|stateFunctionCall endLine|(variable (ASSIGN expression)|methodCall ASSIGN expression) endLine|whileLoop|returner endLine|NEWLINE)
    ;

    getterSetter:
        SET { System.out.println("Setter"); }BEGIN (NEWLINE)+ (body)* END (NEWLINE)+ GET{ System.out.println("Getter"); } BEGIN (NEWLINE)+  (body)*(NEWLINE)* END
    |   SET { System.out.println("Setter"); }BEGIN (NEWLINE)+ (body)* END (NEWLINE)+ GET{ System.out.println("Getter"); } (NEWLINE)+ (body) (NEWLINE)*
    |   SET { System.out.println("Setter"); }(NEWLINE)+ (body) (NEWLINE)* GET{ System.out.println("Getter"); } BEGIN (NEWLINE)+ (body)* (NEWLINE)* END
    |   SET { System.out.println("Setter"); }(NEWLINE)+ (body) (NEWLINE)* GET{ System.out.println("Getter"); } (NEWLINE)+ (body) (NEWLINE)*
    ;

    structVar:
        ((varDeclare)|(setgetVarDec BEGIN NEWLINE getterSetter (NEWLINE)* END(NEWLINE|SEMICOLON)(NEWLINE)*)|NEWLINE)
    ;

    struct:
        STRUCT ID { System.out.println("StructDec : " + $ID.getText()); } BEGIN (NEWLINE)+ structVars END (NEWLINE)*
    |   STRUCT ID { System.out.println("StructDec : " + $ID.getText()); } (NEWLINE)+ structVar (NEWLINE)*
    ;

    stateFunctionCall:
        ID { System.out.println("FunctionCall"); }(arguments)+
    |   DISPLAY { System.out.println("Built-in : display"); } (arguments)+
    |   SIZE { System.out.println("Size"); }(arguments)+
    |   APPEND { System.out.println("Append"); }(arguments)+
    ;

    functionCall:
        ID (arguments)+
    |   DISPLAY { System.out.println("Built-in : display"); } (arguments)+
    |   SIZE { System.out.println("Size"); }(arguments)+
    |   APPEND { System.out.println("Append"); }(arguments)+
    ;

    arguments:
        LPAR ((expression COMMA))* (expression) RPAR
    |   LPAR RPAR
    ;

    argumentsDec:
        LPAR (argument COMMA)* argument RPAR
    //|   LPAR (ID ASSIGN argument COMMA)* (ID ASSIGN argument) RPAR
    |   LPAR RPAR
    ;

    argument:
        varType ID  { System.out.println("ArgumentDec : " + $ID.getText()); }
    ;

    returner:
       RETURN { System.out.println("Return"); } expression
    |  RETURN { System.out.println("Return"); }
    ;

    whileLoop:
        WHILE { System.out.println("Loop : while"); } expression semicolonScope
    |   DO { System.out.println("Loop : do...while"); }scope(NEWLINE)* WHILE expression endLine
    ;

    ifConditions:
        (matchedIf|unmatchedIf)
;

    matchedIfBody:
        matchedIf|functionCall endLine|returner endLine|statement endLine|whileLoop|NEWLINE
    ;

    matchedIfScope:
        BEGIN NEWLINE (body)* END(NEWLINE)*| NEWLINE matchedIfBody (NEWLINE)*
    ;

    matchedElseScope:
        BEGIN NEWLINE (body)* END(SEMICOLON|NEWLINE)| NEWLINE matchedIfBody (NEWLINE)*
    ;


    unmatchedIfScope:
        (BEGIN NEWLINE (body)* (NEWLINE)* END(SEMICOLON|NEWLINE))| (NEWLINE unmatchedIf)(NEWLINE)*
    ;

    factorIf:
       IF{ System.out.println("Conditional : if"); } expression matchedIfScope
    ;

    matchedIf:
       IF { System.out.println("Conditional : if"); } expression matchedIfScope ELSE{ System.out.println("Conditional : else"); } matchedElseScope (NEWLINE)*
   ;

    unmatchedIf:
        IF{ System.out.println("Conditional : if"); } expression matchedIfScope ELSE{ System.out.println("Conditional : else"); } unmatchedIfScope (NEWLINE)*
    |   IF{ System.out.println("Conditional : if"); } expression semicolonScope
    ;

    expression:
        orExpression expression_
    ;


    expression_:
        ASSIGN orExpression expression_
    |   ()
    ;

    orExpression:
        andExpression orExpression_
    ;

    orExpression_:
        OR andExpression { System.out.println("Operator : |"); } orExpression_
    |   ()
    ;

    andExpression:
        equalExpression andExpression_
    ;

    andExpression_:
        AND equalExpression { System.out.println("Operator : &"); } andExpression_
    |   ()
    ;

    arithmeticExpressionP2
    :   arithmeticExpressionP1 arithmeticExpressionP2_
    ;

    arithmeticExpressionP2_
    :   MINUS arithmeticExpressionP1 { System.out.println("Operator : -"); } arithmeticExpressionP2_
    |   PLUS  arithmeticExpressionP1 { System.out.println("Operator : +"); } arithmeticExpressionP2_
    |   ()
    ;

    arithmeticExpressionP1:
        unaryExpression arithmeticExpressionP1_
    ;

    arithmeticExpressionP1_:
        MULTIPLY unaryExpression { System.out.println("Operator : *"); } arithmeticExpressionP1_
    |   DIVIDE unaryExpression { System.out.println("Operator : /"); } arithmeticExpressionP1_
    |   ()
    ;

    equalExpression
    :   inequalityExpression equalExpression_
    ;

    equalExpression_
    :   EQUAL inequalityExpression { System.out.println("Operator : =="); } equalExpression_
    |   ()
    ;

    inequalityExpression
    :   arithmeticExpressionP2 inequalityExpression_
    ;

    inequalityExpression_
    :   GREATER arithmeticExpressionP2 { System.out.println("Operator : >"); } inequalityExpression_
    |   LESS arithmeticExpressionP2 { System.out.println("Operator : <"); } inequalityExpression_
    |   ()
    ;

    unaryExpression:
        TILDA  unaryExpression { System.out.println("Operator : ~"); }
    |   MINUS  unaryExpression { System.out.println("Operator : -"); }
    |   factor
    ;

    factor0:
    factor0 LBRACE expression RBRACE| factor1
    ;

    factor1:
    factor1 DOT
    |NUMBER
    ;

    variable:
       ID
    |   listElementCall
    |   methodCall (LBRACE expression RBRACE)*
    ;

    factor:
        LPAR expression RPAR
    |   functionCall (arguments)*(LBRACE expression RBRACE)*
    |   NUMBER
    |   BOOL
    |   listElementCall
    |   methodCall (arguments)*(LBRACE expression RBRACE)*
    |   ID
    ;

    methodCall:
        (ID|listElementCall) DOT ID
    ;

    varDec:
        varType ID{ System.out.println("VarDec : " + $ID.getText()); }(ASSIGN expression)? (COMMA ID{ System.out.println("VarDec : " + $ID.getText()); } (ASSIGN expression)?)*
    ;

    statement:
        varDec
    |   expression (ASSIGN expression)
    ;

    endLine:
        NEWLINE|SEMICOLON
    ;

    listElementCall:
       ID (LBRACE (expression) RBRACE)+
    ;

    varType:
        listFormat|TYPE|fptrFormat|STRUCT ID
    ;

    listFormat:
        (LIST SHARP)+ (TYPE|STRUCT ID)
    ;

    fptrFormat:
        FPTR LESS ((varType COMMA)* varType|VOID)MINUS GREATER(varType|VOID) GREATER
    ;

    semicolonScope:
        BEGIN NEWLINE (body)* END (SEMICOLON|NEWLINE)| NEWLINE(NEWLINE)* body (NEWLINE)*
    ;

    scope:
        BEGIN NEWLINE (body)* END| NEWLINE(NEWLINE)* body (NEWLINE)*
    ;

    //Keywords
    GET:
        'get'
    ;

    SET:
        'set'
    ;

    DISPLAY:
        'display'
    ;

    APPEND:
        'append'
    ;

    SIZE:
        'size'
    ;

    DO:
        'do'
    ;

    WHILE:
        'while'
    ;

    FPTR:
        'fptr'
    ;

    STRUCT:
        'struct'
    ;

    LIST:
        'list'
    ;

    VOID:
        'void'
    ;

    RETURN:
        'return'
    ;

    MAIN:
        'main'
    ;

    IF:
        'if'
    ;

    ELSE:
        'else'
    ;

    //other
    COMMA:
        ','
    ;

    END:
        'end'
    ;

    BEGIN:
        'begin'
    ;

    LPAR:
        '('
    ;

    RPAR:
        ')'
    ;

    LBRACE:
        '['
    ;

    RBRACE:
        ']'
    ;

    SEMICOLON:
        ';'
    ;

    ASSIGN:
        '='
    ;

    SHARP:
        '#'
    ;

    DOT:
        '.'
    ;

    TYPE:
        'int'|'bool'
    ;

    BOOL:
        'true' | 'false'
    ;

    //operators
    OR:
        '|'
    ;

    AND:
        '&'
    ;

    PLUS:
        '+'
    ;

    MINUS:
        '-'
    ;

    MULTIPLY:
        '*'
    ;

    DIVIDE:
        '/'
    ;

    EQUAL:
        '=='
    ;

    LESS:
        '<'
    ;

    GREATER:
        '>'
    ;

    TILDA:
        '~'
    ;

    NUMBER:
         [1-9][0-9]* | '0'
    ;

    NEWLINE:
         '\n'
    ;

    ID:
        [a-zA-Z_][a-zA-Z0-9_]*
    ;

    COMMENT:
        '/*' .*? '*/'-> skip
    ;

    WHITE_SPACE:
        [ \t\r] -> skip
    ;