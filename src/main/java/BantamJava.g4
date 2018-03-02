grammar BantamJava;

program :   classDefn+                                     #programStart
        ;

classDefn   :   CLASS ID LBRACE member*                    #class
            ;

member  :   field                                          #fieldMember
        |   method                                         #methodMember
        ;

field   :   ID ID SEMI                                     #fieldDeclaration
        |   ID ID ASSIGN expr SEMI                         #fieldInstantiation
        ;

method  :   ID ID formalList LBRACE stmt* retn RBRACE      #methodWithReturn
        |   ID ID formalList LBRACE stmt* RBRACE           #methodNoReturn
        ;

formalList: LPAREN RPAREN                                  #formalListEmpty
          | LPAREN formal (COMMA formal)* RPAREN           #formalListPopulated
          ;

formal: ID ID                                              #formalWithTypeAndID
      ;

stmtList: stmt+                                            #listOfStatements
        ;

stmt: ID ID ASSIGN expr SEMI                               #statementDeclaration
    | IF LPAREN expr RPAREN stmt                           #ifStatement
    | IF LPAREN expr RPAREN stmt ELSE stmt                 #ifElseStatement
    | WHILE LPAREN expr RPAREN stmt                        #whileStatement
    | expr SEMI                                            #exprStatement
    | blockList                                            #blockListStatement
    ;

blockList: LBRACE stmtList RBRACE ;

retn: RETURN SEMI
    | RETURN expr SEMI
    ;

expr:    ID
       | ID ASSIGN expr
       | memberRef
       | expr DOT ID argsList
       | NEW ID argsList
       | NEW ID LPAREN RPAREN
       | expr INSTANCEOF ID
       | LPAREN ID RPAREN LPAREN expr RPAREN
       | MINUS expr
       | expr (TIMES | DIVIDE | MODULUS) expr
       | expr (PLUS | MINUS) expr
       | NOT expr
       | expr AND expr
       | expr OR expr
       | expr (EQ | NE | LT | LEQ | GT | GEQ) expr
       | LPAREN expr RPAREN
       | LPAREN ID RPAREN
       | INT_CONST
       | BOOLEAN_CONST
       | STRING_CONST
       ;

memberRef: ID DOT ID argsList
         | ID DOT ID
         | ID DOT ID ASSIGN expr
         ;

argsList: LPAREN RPAREN
        | LPAREN expr (COMMA expr)* RPAREN
        ;


// Tokens follow

SPACE: [ \t\f]+ -> skip;
NEWLINE: [\n\r]+ -> skip;

STRING_CONST_DELIM: '"';
BADID: [0-9]+[a-zA-Z][a-zA-Z0-9]*;

CLASS: 'class';
EXTENDS: 'extends';
RETURN: 'return';
IF: 'if';
ELSE: 'else';
WHILE: 'while';
NEW: 'new';
INSTANCEOF: 'instanceof';

LBRACE: '{';
RBRACE: '}';
LPAREN: '(';
RPAREN: ')';
SEMI: ';';
COMMA: ',';

PLUS: '+';
MINUS: '-';
TIMES: '*';
DIVIDE: '/';
MODULUS: '%';
EQ: '==';
NE: '!=';
LEQ: '<=';
GEQ: '>=';
LT: '<';
GT: '>';
NOT: '!';
AND: '&&';
OR: '||';
ASSIGN: '=';
DOT: '.';
TRUE: 'true';
FALSE: 'false';

ID: [a-zA-Z][a-zA-Z0-9_]*;
BOOLEAN_CONST: TRUE|FALSE;
INT_CONST: [0-9]+;
STRING_CONST: STRING_CONST_DELIM (ESC | .)*? STRING_CONST_DELIM;
fragment ESC: '\\' [btnr"\\] ;

ML_COMMENT: '/*' .*? '*/' -> skip;
SL_COMMENT: '//'.*? '\r'? '\n' -> skip;