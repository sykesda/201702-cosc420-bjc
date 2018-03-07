grammar BantamJava;

program     :   classDefn+
            ;

classDefn   :   CLASS ID LBRACE member* RBRACE
            ;

type        :   VOID
            |   INT
            |   BOOLEAN
            |   ID
            ;

member      :   field
            |   method
            ;

field       :   ID ID SEMI
            |   ID ID ASSIGN expr SEMI
            ;

method      :   type ID formalList LBRACE stmt* retn RBRACE
            ;

formalList  :   LPAREN (formal (COMMA formal)*)* RPAREN
            ;

formal      :   ID ID
            ;


stmt        :   ID ID ASSIGN expr SEMI
            |   IF LPAREN expr RPAREN stmt
            |   IF LPAREN expr RPAREN stmt ELSE stmt
            |   WHILE LPAREN expr RPAREN stmt
            |   expr SEMI
            |   blockList
            ;

blockList   :   LBRACE stmt* RBRACE
            ;

retn        :   RETURN expr? SEMI
            ;

expr        :   ID
            |   ID ASSIGN expr
            |   memberRef
            |   expr DOT ID argsList
            |   NEW ID argsList
            |   NEW ID LPAREN RPAREN
            |   expr INSTANCEOF ID
            |   LPAREN ID RPAREN LPAREN expr RPAREN
            |   MINUS expr
            |   expr (TIMES | DIVIDE | MODULUS) expr
            |   expr (PLUS | MINUS) expr
            |   NOT expr
            |   expr AND expr
            |   expr OR expr
            |   expr (EQ | NE | LT | LE | GT | GE) expr
            |   LPAREN expr RPAREN
            |   LPAREN ID RPAREN
            |   INT_CONST
            |   (TRUE | FALSE)
            |   STR_CONST
            ;

memberRef   :   ID DOT ID argsList
            |   ID DOT ID
            |   ID DOT ID ASSIGN expr
            ;

argsList    :   LPAREN (expr (COMMA expr)*)* RPAREN
            ;


// Tokens follow

SPACE       :   [ \t\f]+ -> skip;
NEWLINE     :   [\n\r]+ -> skip;

DQUOTE      :   '"';
BADID       :   [0-9]+[a-zA-Z][a-zA-Z0-9]*;

CLASS       :   'class';
EXTENDS     :   'extends';
RETURN      :   'return';
IF          :   'if';
ELSE        :   'else';
WHILE       :   'while';
NEW         :   'new';
INSTANCEOF  :   'instanceof';
TRUE        :   'true';
FALSE       :   'false';
VOID        :   'void';
INT         :   'int';
BOOLEAN     :   'boolean';

LBRACE      :   '{';
RBRACE      :   '}';
LPAREN      :   '(';
RPAREN      :   ')';
SEMI        :   ';';
COMMA       :   ',';

PLUS        :    '+';
MINUS       :   '-';
TIMES       :   '*';
DIVIDE      :   '/';
MODULUS     :   '%';
EQ          :   '==';
NE          :   '!=';
LE          :   '<=';
GE          :   '>=';
LT          :   '<';
GT          :   '>';
NOT         :   '!';
AND         :   '&&';
OR          :   '||';
ASSIGN      :   '=';
DOT         :   '.';

ID          : [a-zA-Z][a-zA-Z0-9_]*;
INT_CONST   : [0-9]+;
STR_CONST   : DQUOTE (ESC | .)*? DQUOTE;
fragment ESC: '\\' [btnr"\\] ;

ML_COMMENT  : '/*' .*? '*/' -> skip;
SL_COMMENT  : '//'.*? '\r'? '\n' -> skip;