import org.antlr.symtab.*;
import org.antlr.v4.runtime.ParserRuleContext;
import static java.lang.Math.max;

/**
 * <h1>Semantic Analysis - Pass 2</h1>
 *
 */
public class SemanticAnalyzer2 extends BantamJavaBaseVisitor<ParserRuleContext> {

    protected Scope globals = null;
    protected ClassSymbol classScope = null;
    protected MethodSymbol methodScope = null;
    protected Scope currentScope = null;

    protected final boolean DEBUG = true;

    protected Symbol booleanSymbol = null;
    protected Symbol intSymbol = null;
    protected Symbol voidSymbol = null;

    protected Symbol objectSymbol = null;
    protected Symbol stringSymbol = null;
    protected Symbol sysSymbol = null;
    protected Symbol textIOSymbol = null;

    ErrorReporter reporter = null;


    SemanticAnalyzer2(ErrorReporter reporter) {
        this.reporter = reporter;

        if (DEBUG) {
            System.out.println("SemanticAnalysis2...");
        }
    }


    private boolean AssignmentCompatible(Type leftType, Type rightType) {
        Type voidType = (Type) voidSymbol;
        Type intType = (Type) intSymbol;
        Type booleanType = (Type) booleanSymbol;

        if (leftType == voidType || rightType == voidType) {
            return false;
        }

        if (leftType == intType || rightType == intType) {
            return leftType == rightType;
        }

        if (leftType == booleanType || rightType == booleanType) {
            return leftType == rightType;
        }

        // We are dealing with two reference types--ClassSymbol instances
        Type objectType = (Type) objectSymbol;
        ClassSymbol leftClassSymbol = (ClassSymbol) leftType;
        ClassSymbol rightClassSymbol = (ClassSymbol) rightType;
        while (rightClassSymbol != objectType && rightClassSymbol != leftClassSymbol) {
            rightClassSymbol = rightClassSymbol.getSuperClassScope();
        }
        return leftClassSymbol == rightClassSymbol;
    }

    /**
     * Visit a parse tree produced by {@link BantamJavaParser#program}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    @Override
    public ParserRuleContext visitProgram(BantamJavaParser.ProgramContext ctx) {
        globals = ctx.scope;
        currentScope = globals;
        intSymbol = globals.resolve("int");
        booleanSymbol = globals.resolve("boolean");
        voidSymbol = globals.resolve("void");
        objectSymbol = globals.resolve("Object");
        stringSymbol = globals.resolve("String");
        sysSymbol = globals.resolve("Sys");
        textIOSymbol = globals.resolve("TextIO");

        if (DEBUG) {
            System.out.print("SA2: Entering program Scope: ");
            System.out.print(currentScope.toString());
            System.out.println();
        }
        super.visitProgram(ctx);

        currentScope = null;

        return ctx;
    }

    /**
     * Visit a parse tree produced by the {@code class}
     * labeled alternative in {@link BantamJavaParser#classDefn}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public ParserRuleContext visitClass(BantamJavaParser.ClassContext ctx) {
        currentScope = ctx.scope;
        String className = ctx.className.getText();
        ClassSymbol currentClassSymbol = (ClassSymbol) currentScope.resolve(className);
        classScope = currentClassSymbol;

        super.visitClass(ctx);

        currentScope = currentScope.getEnclosingScope();
        classScope = null;

        return ctx;
    }


    /**
     * Visit a parse tree produced by the {@code fieldDeclOrInst}
     * labeled alternative in {@link BantamJavaParser#field}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public ParserRuleContext visitFieldDeclOrInst(BantamJavaParser.FieldDeclOrInstContext ctx) {

        // Syntax: type fieldName=ID (ASSIGN expr)? SEMI

        super.visitFieldDeclOrInst(ctx);

        FieldSymbol fieldSymbol = ctx.symbol;

        if (ctx.expr() != null) {
            // Make sure any expression is assignment compatible
            if (! AssignmentCompatible(fieldSymbol.getType(), ctx.expr().exprType)) {
                reporter.errorMessage(ctx, "Initialization expression not compatible");
            }
        }

        return ctx;
    }

    /**
     * Visit a parse tree produced by the {@code methodDeclaration}
     * labeled alternative in {@link BantamJavaParser#method}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public ParserRuleContext visitMethodDeclaration(BantamJavaParser.MethodDeclarationContext ctx) {
        // Syntax: type ID formalList LBRACE stmt* retn RBRACE

        currentScope = ctx.scope;
        methodScope = ctx.symbol;
        super.visitMethodDeclaration(ctx);

        Type methodReturnType = methodScope.getType();

// DON'T NEED THIS SINCE return HANDLES IT
//        // Make sure the return statement has an expression of the right type
//        BantamJavaParser.RetnContext returnCtx = ctx.retn();
//        if (returnCtx.getChildCount() == 2) {
//            // No expressions was returned
//            if (methodReturnType != voidSymbol) {
//                reporter.errorMessage(ctx, "return expression required");
//            }
//        }
//        if (!AssignmentCompatible(methodScope.getType(), null)) { // TODO
//        }

        currentScope = currentScope.getEnclosingScope();
        return ctx;
    }

    /**
     * Visit a parse tree produced by the {@code lstOfFormals}
     * labeled alternative in {@link BantamJavaParser#formalList}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public ParserRuleContext visitLstOfFormals(BantamJavaParser.LstOfFormalsContext ctx) {

        return super.visitLstOfFormals(ctx);
    }

    /**
     * Visit a parse tree produced by the {@code formalParameter}
     * labeled alternative in {@link BantamJavaParser#formal}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public ParserRuleContext visitFormalParameter(BantamJavaParser.FormalParameterContext ctx) {
        // Syntax: type ID

        super.visitFormalParameter(ctx);

        return ctx;
    }

    //
//    /**
//     * Visit a parse tree produced by the {@code stmtExprSemi}
//     * labeled alternative in {@link BantamJavaParser#stmt}.
//     *
//     * @param ctx the parse tree
//     * @return the visitor result
//     */
//    public ParserRuleContext visitStmtExprSemi(BantamJavaParser.StmtExprSemiContext ctx) {
//        return ctx;
//    }
//
//    /**
//     * Visit a parse tree produced by the {@code stmtBlock}
//     * labeled alternative in {@link BantamJavaParser#stmt}.
//     *
//     * @param ctx the parse tree
//     * @return the visitor result
//     */
//    public ParserRuleContext visitStmtBlock(BantamJavaParser.StmtBlockContext ctx) {
//        return ctx;
//    }

    /**
     * Visit a parse tree produced by the {@code stmtIf}
     * labeled alternative in {@link BantamJavaParser#stmt}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public ParserRuleContext visitStmtIf(BantamJavaParser.StmtIfContext ctx) {
        // Syntax: IF LPAREN expr RPAREN stmt (ELSE stmt)?

        super.visitStmtIf(ctx);

        if (ctx.expr().exprType != booleanSymbol) {
            reporter.errorMessage(ctx, "if expression must be boolean");
        }
        return ctx;
    }

    /**
     * Visit a parse tree produced by the {@code stmtWhile}
     * labeled alternative in {@link BantamJavaParser#stmt}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public ParserRuleContext visitStmtWhile(BantamJavaParser.StmtWhileContext ctx) {
        // Syntax: WHILE LPAREN expr RPAREN stmt

        super.visitStmtWhile(ctx);

        if (ctx.expr().exprType != booleanSymbol) {
            reporter.errorMessage(ctx, "while expression must be boolean");
        }

        return ctx;
    }


    /**
     * Visit a parse tree produced by the {@code stmtLocalVarDecl}
     * labeled alternative in {@link BantamJavaParser#stmt}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public ParserRuleContext visitStmtLocalVarDecl(BantamJavaParser.StmtLocalVarDeclContext ctx) {
        // Syntax: type ID ASSIGN expr SEMI

        // The listener should have created a VariableSymbol
        VariableSymbol varSymbol = ctx.symbol;

        super.visitStmtLocalVarDecl(ctx);

        Type type = varSymbol.getType(); // might have been changed
                                         // from void to Object

        if (!AssignmentCompatible(type, ctx.expr().exprType)) {
            reporter.errorMessage(ctx, "Incompatible expression type");
        }

        return ctx;
    }

    /**
     * Visit a parse tree produced by {@link BantamJavaParser#blockStmt}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public ParserRuleContext visitBlockStmt(BantamJavaParser.BlockStmtContext ctx) {
        // Set up a new local scope (and restore the current one)
        currentScope = ctx.scope;

        super.visitBlockStmt(ctx);

        currentScope = currentScope.getEnclosingScope();

        return ctx;
    }

    /**
     * Visit a parse tree produced by the {@code return}
     * labeled alternative in {@link BantamJavaParser#retn}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public ParserRuleContext visitReturn(BantamJavaParser.ReturnContext ctx) {
        // Syntax: RETURN expr? SEMI
        super.visitReturn(ctx);
        Type methodReturnType = methodScope.getType();
        BantamJavaParser.ExprContext expr = ctx.expr();
        if (expr == null && methodReturnType != voidSymbol) {
            reporter.errorMessage(ctx, "Expression expected");
        }
        else if (expr != null && !AssignmentCompatible(methodReturnType, expr.exprType)) {
            reporter.errorMessage(ctx, "Incompatible expression types");
        }

        return ctx;
    }


    /**
     * Visit a parse tree produced by the {@code exprInt}
     * labeled alternative in {@link BantamJavaParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public ParserRuleContext visitExprInt(BantamJavaParser.ExprIntContext ctx) {
        // Syntax: INT_CONST

        // While we don't check, there are MIN and MAX int values
        ctx.exprType = (Type)intSymbol;
        ctx.height = 1;
        super.visitExprInt(ctx);
        return ctx;
    }

    /**
     * Visit a parse tree produced by the {@code exprMulDivMod}
     * labeled alternative in {@link BantamJavaParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public ParserRuleContext visitExprMulDivMod(BantamJavaParser.ExprMulDivModContext ctx) {
        // Syntax: expr (TIMES | DIVIDE | MODULUS) expr

        super.visitExprMulDivMod(ctx);

        org.antlr.symtab.Type leftType = ctx.expr(0).exprType;
        org.antlr.symtab.Type rightType = ctx.expr(1).exprType;

        if (leftType != intSymbol || rightType != intSymbol) {
            reporter.errorMessage(ctx, "Incompatible types: Must be of type int.");
        }
        ctx.exprType = (Type)intSymbol;
        ctx.height = max(ctx.expr(0).height, ctx.expr(1).height) + 1;

        return ctx;
    }

    /**
     * Visit a parse tree produced by the {@code exprNot}
     * labeled alternative in {@link BantamJavaParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public ParserRuleContext visitExprNot(BantamJavaParser.ExprNotContext ctx) {
        // Syntax: NOT expr
        super.visitExprNot(ctx);
        if (ctx.expr().exprType != booleanSymbol) {
            reporter.errorMessage(ctx, "Incompatible type: expr must be type boolean.");
        }
        ctx.exprType = (Type)booleanSymbol;
        ctx.height = ctx.expr().height + 1;
        return ctx;
    }

    /**
     * Visit a parse tree produced by the {@code exprVarAssign}
     * labeled alternative in {@link BantamJavaParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public ParserRuleContext visitExprVarAssign(BantamJavaParser.ExprVarAssignContext ctx) {
        // Syntax: ID ASSIGN expr

        super.visitExprVarAssign(ctx);

        // Since we don't have arrays, the left side must be
        // a variable
        Symbol leftSymbol = currentScope.resolve(ctx.ID().getText());
        if (leftSymbol instanceof VariableSymbol) {
            VariableSymbol varSymbol = (VariableSymbol)leftSymbol;

            if (!AssignmentCompatible(varSymbol.getType(), ctx.expr().exprType)) {
                reporter.errorMessage(ctx, "Expression is not assignment compatible");
            }

            ctx.exprType = varSymbol.getType();
        }
        else {
            reporter.errorMessage(ctx, ctx.ID().getText() + " is not a variable, field, or parameter");
            ctx.exprType = (Type)objectSymbol;
        }

        ctx.height = ctx.expr().height + 1;
        return ctx;
    }

    /**
     * Visit a parse tree produced by the {@code exprAddSub}
     * labeled alternative in {@link BantamJavaParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public ParserRuleContext visitExprAddSub(BantamJavaParser.ExprAddSubContext ctx) {
        // Syntax: expr (PLUS | MINUS) expr
        super.visitExprAddSub(ctx);
        org.antlr.symtab.Type leftType = ctx.expr(0).exprType;
        org.antlr.symtab.Type rightType = ctx.expr(1).exprType;

        if (leftType != intSymbol || rightType != intSymbol) {
            reporter.errorMessage(ctx, "Incompatible types: Must be of type int.");
        }

        ctx.exprType = (Type) intSymbol;
        ctx.height = max(ctx.expr(0).height, ctx.expr(1).height);

        return ctx;
    }

    /**
     * Visit a parse tree produced by the {@code expStrLiteral}
     * labeled alternative in {@link BantamJavaParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public ParserRuleContext visitExpStrLiteral(BantamJavaParser.ExpStrLiteralContext ctx) {
        // Syntax: STR_CONST
        ctx.exprType = (Type)stringSymbol;
        ctx.height = 0;
        return ctx;
    }

    /**
     * Visit a parse tree produced by the {@code exprInstanceof}
     * labeled alternative in {@link BantamJavaParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public ParserRuleContext visitExprInstanceof(BantamJavaParser.ExprInstanceofContext ctx) {
        // Syntax: expr INSTANCEOF type

        super.visitExprInstanceof(ctx);

        Type exprType = ctx.expr().exprType;
        Type typeSymbol = ctx.type().typeSymbol;
        if (!(typeSymbol instanceof ClassSymbol)) {
            reporter.errorMessage(ctx, "Type must specify a class");
        }

        ctx.exprType = (Type) booleanSymbol;
        ctx.height = ctx.expr().height + 1;

        return ctx;
    }

    /**
     * Visit a parse tree produced by the {@code exprNew}
     * labeled alternative in {@link BantamJavaParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public ParserRuleContext visitExprNew(BantamJavaParser.ExprNewContext ctx) {
        // Syntax: NEW ID LPAREN RPAREN
        super.visitExprNew(ctx);

        org.antlr.symtab.Symbol symbol = currentScope.resolve(ctx.ID().getText());
        if ((symbol instanceof ClassSymbol)) {
            ctx.exprType = (ClassSymbol)symbol;
        }
        else {
            reporter.errorMessage(ctx, "new requires a Class");
            ctx.exprType = (Type)objectSymbol;  // recover as new Object()
        }

        ctx.height = 1;  // ???
        return ctx;
    }

    /**
     * Visit a parse tree produced by the {@code exprOr}
     * labeled alternative in {@link BantamJavaParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public ParserRuleContext visitExprOr(BantamJavaParser.ExprOrContext ctx) {
        // Syntax: expr OR expr
        super.visitExprOr(ctx);

        Type leftType = ctx.expr(0).exprType;
        Type rightType = ctx.expr(1).exprType;
        if (leftType != booleanSymbol || rightType != booleanSymbol) {
            reporter.errorMessage(ctx, "Operand(s) not of type boolean");
        }

        ctx.exprType = (Type) booleanSymbol;
        ctx.height = max(ctx.expr(0).height, ctx.expr(1).height);

        return ctx;
    }
//
//    /**
//     * Visit a parse tree produced by the {@code exprTypeConversion}
//     * labeled alternative in {@link BantamJavaParser#expr}.
//     *
//     * @param ctx the parse tree
//     * @return the visitor result
//     */
//    public ParserRuleContext visitExprTypeConversion(BantamJavaParser.ExprTypeConversionContext ctx) {
//        return ctx;
//    }
//
//    /**
//     * Visit a parse tree produced by the {@code exprFieldAssign}
//     * labeled alternative in {@link BantamJavaParser#expr}.
//     *
//     * @param ctx the parse tree
//     * @return the visitor result
//     */
//    public ParserRuleContext visitExprFieldAssign(BantamJavaParser.ExprFieldAssignContext ctx) {
//        return ctx;
//    }

    /**
     * Visit a parse tree produced by the {@code exprParenthesized}
     * labeled alternative in {@link BantamJavaParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public ParserRuleContext visitExprParenthesized(BantamJavaParser.ExprParenthesizedContext ctx) {
        super.visitExprParenthesized(ctx);

        ctx.exprType = ctx.expr().exprType;
        ctx.height = ctx.expr().height;
        return ctx;
    }

    /**
     * Visit a parse tree produced by the {@code exprRelational}
     * labeled alternative in {@link BantamJavaParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public ParserRuleContext visitExprRelational(BantamJavaParser.ExprRelationalContext ctx) {
        super.visitExprRelational(ctx);
        Type leftType = ctx.expr(0).exprType;
        Type rightType = ctx.expr(1).exprType;
        String operator = ctx.operator.getText();
        if (operator.equals("==") || operator.equals("!=")) {
            // The operands must both be int, boolean, or assignment-compatible

            if (!AssignmentCompatible(leftType, rightType) &&
                    !AssignmentCompatible(rightType, leftType)) {
                reporter.errorMessage(ctx, "Cannot compare these expressions");
            }
        } else {
            // Both must be either int or boolean
            if (!(leftType == intSymbol && rightType == intSymbol) &&
                    !(leftType == booleanSymbol && rightType == booleanSymbol)) {
                reporter.errorMessage(ctx, "Operands must both be int or boolean");
            }
        }
        ctx.exprType = (Type) booleanSymbol;
        ctx.height = max(ctx.expr(0).height, ctx.expr(1).height);

        return ctx;
    }

    /**
     * Visit a parse tree produced by the {@code exprBoolLiteral}
     * labeled alternative in {@link BantamJavaParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public ParserRuleContext visitExprBoolLiteral(BantamJavaParser.ExprBoolLiteralContext ctx) {
        ctx.exprType = (org.antlr.symtab.PrimitiveType) currentScope.resolve("boolean");
        ctx.height = 0;
        return ctx;
    }

    /**
     * Visit a parse tree produced by the {@code exprAnd}
     * labeled alternative in {@link BantamJavaParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public ParserRuleContext visitExprAnd(BantamJavaParser.ExprAndContext ctx) {
        // Syntax: expr AND expr
        super.visitExprAnd(ctx);

        Type leftType = ctx.expr(0).exprType;
        Type rightType = ctx.expr(1).exprType;
        if (leftType != booleanSymbol || rightType != booleanSymbol) {
            reporter.errorMessage(ctx, "Operand(s) not of type boolean");
        }

        ctx.exprType = (Type) booleanSymbol;
        ctx.height = max(ctx.expr(0).height, ctx.expr(1).height);

        return ctx;
    }

    /**
     * Visit a parse tree produced by the {@code exprID}
     * labeled alternative in {@link BantamJavaParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public ParserRuleContext visitExprID(BantamJavaParser.ExprIDContext ctx) {
        // Syntax: ID
        super.visitExprID(ctx);

        // Check that the ID is a variable, formal parameter, or a field
        String id = ctx.ID().getText();
        Symbol symbol = (Symbol) currentScope.resolve(id);

        if (!(symbol instanceof VariableSymbol)) {
            reporter.errorMessage(ctx, "Not a variable.");
            ctx.exprType = (Type)objectSymbol;
        }
        else {
            VariableSymbol varSymbol = (VariableSymbol) symbol;
            ctx.exprType = varSymbol.getType();
        }
        ctx.height = 0;
        return ctx;
    }

    /**
     * Visit a parse tree produced by the {@code exprMethodCall}
     * labeled alternative in {@link BantamJavaParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public ParserRuleContext visitExprMethodCall(BantamJavaParser.ExprMethodCallContext ctx) {
        // Syntax: ID argsList
        String methodName = ctx.ID().getText();

        super.visitExprMethodCall(ctx);

        Symbol symbol = classScope.resolve(methodName);
        if (symbol instanceof MethodSymbol) {
            MethodSymbol methodSymbol = (MethodSymbol) symbol;
            matchArgs(methodSymbol, ctx.argsList());

            ctx.exprType = methodSymbol.getType();
        } else {
            reporter.errorMessage(ctx, methodName + " is not a method");
            ctx.exprType = (Type) voidSymbol;  // RECOVER
        }
        ctx.height = ctx.argsList().children.size() + 1;  // 1 for this
        return ctx;
    }

    /**
     * Visit a parse tree produced by the {@code exprNegation}
     * labeled alternative in {@link BantamJavaParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public ParserRuleContext visitExprNegation(BantamJavaParser.ExprNegationContext ctx) {
        // Syntax: MINUS expr
        super.visitExprNegation(ctx);

        Type exprType = ctx.expr().exprType;
        if (exprType != intSymbol) {
            reporter.errorMessage(ctx, "Incompatible type: must be of type int");
        }
        ctx.exprType = (Type) intSymbol;
        ctx.height = ctx.height + 1;

        return ctx;
    }

    /**
     * Visit a parse tree produced by the {@code exprDotMethodCall}
     * labeled alternative in {@link BantamJavaParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public ParserRuleContext visitExprDotMethodCall(BantamJavaParser.ExprDotMethodCallContext ctx) {
        // Syntax: expr DOT ID argsList

        String methodName = ctx.ID().getText();

        super.visitExprDotMethodCall(ctx);

        Type objectType = ctx.expr().exprType;
        Type methodReturnType = (Type) voidSymbol;  // default for errors

        if (!(objectType instanceof ClassSymbol)) {
            reporter.errorMessage(ctx, "The expression must be an object");
        } else {
            // Make sure the method name is defined by the object's class
            ClassSymbol classSymbol = (ClassSymbol) objectType;
            Symbol symbol = classSymbol.getSymbol(methodName);
            if (symbol == null || !(symbol instanceof MethodSymbol)) {
                reporter.errorMessage(ctx, "Cannot locate method");
            } else {
                MethodSymbol methodSymbol = (MethodSymbol) symbol;
                matchArgs(methodSymbol, ctx.argsList());
                methodReturnType = methodSymbol.getType();
            }
        }

        ctx.exprType = methodReturnType;
        ctx.height = ctx.argsList().children.size() + 1;  // 1 for this
        return ctx;
    }

    private void matchArgs(MethodSymbol methodSymbol, BantamJavaParser.ArgsListContext argsCtx) {
        int numOfParams = methodSymbol.getNumberOfParameters();
        int numOfArgs = (argsCtx.getChildCount() - 1) / 2; //accounting for parens and commas

        if (numOfParams != numOfArgs) {
            reporter.errorMessage(argsCtx, "Number of arguments does not match number of required parameters");
        } else {
            String mismatches = "";
            for (int i = 0; i <= numOfParams; i++) {
                ParameterSymbol param = (ParameterSymbol) methodSymbol.getSymbols().get(i);
                Type paramType = param.getType();
                if (paramType != ((BantamJavaParser.LstOfArgsContext) argsCtx).expr(i).exprType) {
                    mismatches = mismatches + Integer.toString(i) + " (" + paramType.getName() + ")" + param.getName() + ",";
                }
            }
            if(!mismatches.equals("")){
                reporter.errorMessage(argsCtx, "Type mismatch for argument(s) " + mismatches);
            }
        }
    }
//    /**
//     * Visit a parse tree produced by the {@code lstOfArgs}
//     * labeled alternative in {@link BantamJavaParser#argsList}.
//     *
//     * @param ctx the parse tree
//     * @return the visitor result
//     */
    public ParserRuleContext visitLstOfArgs(BantamJavaParser.LstOfArgsContext ctx) {
        // Syntax: LPAREN (expr (COMMA expr)*)* RPAREN
        super.visitLstOfArgs(ctx);
        ctx.height = 0;

        for (int i = 0; i <= (ctx.getChildCount() - 1) / 2; i++) {
            ctx.height = max(ctx.height, ctx.expr(i).height);
        }

        return ctx;
    }
}