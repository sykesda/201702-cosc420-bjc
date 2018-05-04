grammar BantamJava;

@header {import org.antlr.symtab.*;}

program returns [org.antlr.symtab.Scope scope]
            :   classDefn+
            ;

classDefn returns [org.antlr.symtab.Scope scope,
                   org.antlr.symtab.ClassSymbol symbol]
            :   CLASS className=ID (EXTENDS superclassName=ID)?
                    LBRACE member* RBRACE                      #class
            ;

type        :   VOID                                           #typeVoid
            |   INT                                            #typeInt
            |   BOOLEAN                                        #typeBool
            |   ID                                             #typeID
            ;

member      :   field                                          #memberField
            |   method                                         #memberMethod
            ;

field returns [org.antlr.symtab.FieldSymbol symbol]
            :   type fieldName=ID (ASSIGN expr)? SEMI          #fieldDeclOrInst
            ;

method returns [org.antlr.symtab.Scope scope,
                org.antlr.symtab.MethodSymbol symbol]
            :   type ID formalList LBRACE stmt* retn RBRACE    #methodDeclaration
            ;

formalList  :   LPAREN (formal (COMMA formal)*)* RPAREN        #lstOfFormals
            ;

formal returns [org.antlr.symtab.ParameterSymbol symbol]
            :   type ID                                        #formalParameter
            ;

stmt        :   expr SEMI                                      #stmtExprSemi
            |   blockStmt                                      #stmtBlock
            |   IF LPAREN expr RPAREN stmt (ELSE stmt)?        #stmtIf
            |   WHILE LPAREN expr RPAREN stmt                  #stmtWhile
            |   localVar                                       #stmtLocalVar
            ;

localVar returns [org.antlr.symtab.VariableSymbol symbol]
            : type ID ASSIGN expr SEMI                         #stmtLocalVarDecl
            ;

blockStmt returns [org.antlr.symtab.Scope scope] :
                LBRACE stmt* RBRACE
            ;

retn        :   RETURN expr? SEMI                              #return
            ;

expr returns [org.antlr.symtab.Type exprType, int height]
            :   ID ASSIGN expr                                  #exprVarAssign
            |   ID                                              #exprID
            |   ID argsList                                     #exprMethodCall
            |   expr DOT ID argsList                            #exprDotMethodCall
            |   (THIS | SUPER) DOT ID ASSIGN expr               #exprFieldAssign
            |   NEW ID argsList                                 #exprNew
            |   expr INSTANCEOF type                            #exprInstanceof
            |   LPAREN type RPAREN LPAREN expr RPAREN           #exprTypeConversion
            |   MINUS expr                                      #exprNegation
            |   expr (TIMES | DIVIDE | MODULUS) expr            #exprMulDivMod
            |   expr (PLUS | MINUS) expr                        #exprAddSub
            |   expr operator=(EQ | NE | LT | LE | GT | GE) expr #exprRelational
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
THIS        :   'this';
SUPER       :   'super';
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