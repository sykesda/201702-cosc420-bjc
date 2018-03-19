grammar BantamJava;

@header {import org.antlr.symtab.*;}

program     :   classDefn+
            ;

classDefn   :   CLASS className=ID (EXTENDS superclassName=ID)? LBRACE member* RBRACE                 #class
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

stmt        :   expr SEMI                                      #stmtExprSemi
            |   LBRACE stmt* RBRACE                            #stmtBlock
            |   IF LPAREN expr RPAREN stmt (ELSE stmt)?        #stmtIf
            //|   IF LPAREN expr RPAREN stmt            #stmtIfElse
            |   WHILE LPAREN expr RPAREN stmt                  #stmtWhile
            |   type ID ASSIGN expr SEMI                       #stmtLocalVarDecl
            ;

retn        :   RETURN expr? SEMI                              #return
            ;

expr        :   ID ASSIGN expr                                  #exprVarAssign
            |   ID                                              #exprID
            |   ID argsList?                                    #exprMethodCall
            |   expr DOT ID argsList?                           #exprDotMethodCall
            |   expr DOT ID ASSIGN expr                         #exprFieldAssign
            |   NEW ID argsList                                 #exprNew
            |   expr INSTANCEOF type                            #exprInstanceof
            |   LPAREN type RPAREN LPAREN expr RPAREN           #exprTypeConversion
            |   MINUS expr                                      #exprNegation
            |   expr (TIMES | DIVIDE | MODULUS) expr            #exprMulDivMod
            |   expr (PLUS | MINUS) expr                        #exprAddSub
            |   expr (EQ | NE | LT | LE | GT | GE) expr         #exprRelational
            |   NOT expr                                        #exprNot
            |   expr AND expr                                   #exprAnd
            |   expr OR expr                                    #exprOr
            |   LPAREN expr RPAREN                              #exprParenthesized
            |   INT_CONST                                       #exprInt
            |   (TRUE | FALSE)                                  #exprBoolLiteral
            |   STR_CONST                                       #expStrLiteral
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

PLUS        :   '+';
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

ID          :   [a-zA-Z][a-zA-Z0-9_]*;
INT_CONST   :   [0-9]+;
STR_CONST   :   DQUOTE (ESC | .)*? DQUOTE;
fragment ESC:   '\\' [btnr"\\] ;

ML_COMMENT  :   '/*' .*? '*/' -> skip;
SL_COMMENT  :   '//'.*? '\r'? '\n' -> skip;