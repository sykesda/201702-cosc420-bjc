grammar BantamJava;

program     :   classDefn+
            ;

classDefn   :   CLASS ID LBRACE member* RBRACE                 #class
            ;

type        :   VOID                                           #typeVoid
            |   INT                                            #typeInt
            |   BOOLEAN                                        #typeBool
            |   ID                                             #typeID
            ;

member      :   field                                          #memberField
            |   method                                         #memberMethod
            ;

field       :   type ID (ASSIGN expr)? SEMI                    #fieldDeclOrInst
            ;

method      :   type ID formalList LBRACE stmt* retn RBRACE    #methodDeclaration
            ;

formalList  :   LPAREN (formal (COMMA formal)*)* RPAREN        #lstOfFormals
            ;

formal      :   type ID                                        #typeWithID
            ;

stmt        :   type ID ASSIGN expr SEMI                       #stmtAssignIDExpr
            |   IF LPAREN expr RPAREN stmt                     #stmtIf
            |   IF LPAREN expr RPAREN stmt ELSE stmt           #stmtIfElse
            |   WHILE LPAREN expr RPAREN stmt                  #stmtWhile
            |   expr SEMI                                      #stmtExprSemi
            |   LBRACE stmt* RBRACE                            #stmtBlock
            ;

retn        :   RETURN expr? SEMI                              #return
            ;

expr        :   ID
            |   ID ASSIGN expr
            |   expr DOT ID argsList?
            |   expr DOT ID ASSIGN expr
            |   NEW ID argsList
            |   expr INSTANCEOF type
            |   LPAREN type RPAREN LPAREN expr RPAREN
            |   MINUS expr
            |   expr (TIMES | DIVIDE | MODULUS) expr
            |   expr (PLUS | MINUS) expr
            |   expr (EQ | NE | LT | LE | GT | GE) expr
            |   NOT expr
            |   expr AND expr
            |   expr OR expr
            |   LPAREN expr RPAREN
            |   INT_CONST
            |   (TRUE | FALSE)
            |   STR_CONST
            ;

argsList    :   LPAREN (expr (COMMA expr)*)* RPAREN            #lstOfArgs
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