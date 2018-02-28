grammar BantamJava;

program :   class+  ;

class   :   CLASS ID LBRACE member* ;                   //CLASS:t ID:name

member  :   field
        |   method
        ;

field   :   ID ID SEMI                                  //ID:type ID:name
        |   ID ID ASSIGN expr SEMI                      //ID:type ID:name
        ;

method  :   ID ID formalList LBRACE stmt* retn RBRACE      //ID:ret_type ID:name
        |   ID ID formalList LBRACE stmt* RBRACE           //ID:ret_type ID:name
        ;

formalList: LPAREN RPAREN            // TODO
          | LPAREN formal RPAREN
          | LPAREN formalListAux formal RPAREN
          ;

formalListAux: formal COMMA
             | formalListAux formal COMMA
             ;

formal: ID ID ;

stmtList: //NEWLINE?
        | stmtList stmt
        ;

stmt: ID ID ASSIGN expr SEMI
    | IF LPAREN expr RPAREN stmt
    | IF LPAREN expr RPAREN stmtAux ELSE stmt
    | WHILE LPAREN expr RPAREN stmt
    | expr SEMI
    | blockList
    ;

stmtAux: ID ID ASSIGN expr SEMI
       | IF LPAREN expr RPAREN stmtAux ELSE stmtAux
       | WHILE LPAREN expr RPAREN stmtAux
       | expr SEMI
       | blockList
       ;

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
       | expr PLUS expr
       | expr MINUS expr
       | expr TIMES expr
       | expr DIVIDE expr
       | expr MODULUS expr
       | MINUS expr
       // %prec NOT ends
       | NOT expr
       | expr OR expr
       | expr AND expr
       | expr EQ expr
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
        | LPAREN expr RPAREN
        | LPAREN argsListAux expr RPAREN
        ;

argsListAux: expr COMMA
           | argsListAux expr COMMA
           ;






SPACE: [ \t\f]+ -> skip;
NEWLINE: [\n\r]+ -> skip;

STRINGCONSTDELIM: '\"';
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

ADD: '+';
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
BOOLEANCONST: TRUE|FALSE;
INTCONST: [0-9]+;

MLCOMMENT: '/*' [^'*/']* '*/' -> skip;
SLCOMMENT: '//'[^\n]* -> skip;