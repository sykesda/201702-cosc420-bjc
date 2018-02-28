grammar BantamJava;

program :   classDefn+  ;

classDefn   :   CLASS ID LBRACE member* ;                   //CLASS:t ID:name

member  :   field
        |   method
        ;

field   :   ID ID SEMI                                  //ID:type ID:name
        |   ID ID ASSIGN expr SEMI                      //ID:type ID:name
        ;

method  :   ID ID formalList LBRACE stmt* retn RBRACE      //ID:ret_type ID:name
        |   ID ID formalList LBRACE stmt* RBRACE           //ID:ret_type ID:name
        ;

formalList: LPAREN RPAREN
          | LPAREN formal (COMMA formal)* RPAREN
          ;

formal: ID ID ;

stmtList: stmt+
        ;

stmt: ID ID ASSIGN expr SEMI
    | IF LPAREN expr RPAREN stmt
    | IF LPAREN expr RPAREN stmt ELSE stmt
    | WHILE LPAREN expr RPAREN stmt
    | expr SEMI
    | blockList
    ;

//stmtAux: ID ID ASSIGN expr SEMI
//       | IF LPAREN expr RPAREN stmtAux ELSE stmtAux
//       | WHILE LPAREN expr RPAREN stmtAux
//       | expr SEMI
//       | blockList
//       ;

blockList: LBRACE stmtList RBRACE ;

retn: RETURN SEMI
    | RETURN expr SEMI
    ;

//expr: exprAux
//    | ID
//    ;

expr:    ID
       | ID ASSIGN expr
       | memberRef
       | expr DOT ID argsList
       | NEW ID argsList
       | NEW ID LPAREN RPAREN
       | expr INSTANCEOF ID
       | LPAREN ID RPAREN LPAREN expr RPAREN
       // line 425 %prec NOT
       | MINUS expr
       | expr (TIMES | DIVIDE | MODULUS) expr
       | expr (PLUS | MINUS) expr
       // %prec NOT ends
       | NOT expr
       | expr AND expr
       | expr OR expr
       | expr EQ expr     // TODO same precedence
       | expr NE expr
       | expr LT expr
       | expr LEQ expr
       | expr GT expr
       | expr GEQ expr
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