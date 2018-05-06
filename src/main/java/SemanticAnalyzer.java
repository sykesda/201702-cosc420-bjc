import org.antlr.symtab.Scope;
import org.antlr.v4.runtime.ParserRuleContext;

public class SemanticAnalyzer extends BantamJavaBaseVisitor<ParserRuleContext> {

    protected Scope globals = null;
    protected Scope currentScope = null;
    protected final boolean DEBUG = true;


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
        if (DEBUG) {
            System.out.print("Entering program Scope: ");
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
        // Determine the superclass
        String className = ctx.className.getText();
        currentScope = ctx.scope;
//        if (ctx.superclassName == null) {
//        }
//        String superclassName = ctx.superclassName.getText();

        // if the superclassName is null
        // then use Object
        // else make sure the superclass is valid
        // TODO

        if (DEBUG) {
            System.out.print("Entering class Scope: ");
            System.out.print(currentScope.toString());
            System.out.println();
        }

        super.visitClass(ctx);
        currentScope = currentScope.getEnclosingScope();
        return ctx;
    }
//
//    /**
//     * Visit a parse tree produced by the {@code typeVoid}
//     * labeled alternative in {@link BantamJavaParser#type}.
//     *
//     * @param ctx the parse tree
//     * @return the visitor result
//     */
//    public ParserRuleContext visitTypeVoid(BantamJavaParser.TypeVoidContext ctx) {
//        return ctx;
//    }
//
//    /**
//     * Visit a parse tree produced by the {@code typeInt}
//     * labeled alternative in {@link BantamJavaParser#type}.
//     *
//     * @param ctx the parse tree
//     * @return the visitor result
//     */
//    public ParserRuleContext visitTypeInt(BantamJavaParser.TypeIntContext ctx) {
//        return ctx;
//    }
//
//    /**
//     * Visit a parse tree produced by the {@code typeBool}
//     * labeled alternative in {@link BantamJavaParser#type}.
//     *
//     * @param ctx the parse tree
//     * @return the visitor result
//     */
//    public ParserRuleContext visitTypeBool(BantamJavaParser.TypeBoolContext ctx) {
//        return ctx;
//    }
//
//    /**
//     * Visit a parse tree produced by the {@code typeID}
//     * labeled alternative in {@link BantamJavaParser#type}.
//     *
//     * @param ctx the parse tree
//     * @return the visitor result
//     */
//    public ParserRuleContext visitTypeID(BantamJavaParser.TypeIDContext ctx) {
//        return ctx;
//    }
//
//    /**
//     * Visit a parse tree produced by the {@code memberField}
//     * labeled alternative in {@link BantamJavaParser#member}.
//     *
//     * @param ctx the parse tree
//     * @return the visitor result
//     */
//    public ParserRuleContext visitMemberField(BantamJavaParser.MemberFieldContext ctx) {
//        return ctx;
//    }
//
//    /**
//     * Visit a parse tree produced by the {@code memberMethod}
//     * labeled alternative in {@link BantamJavaParser#member}.
//     *
//     * @param ctx the parse tree
//     * @return the visitor result
//     */
//    public ParserRuleContext visitMemberMethod(BantamJavaParser.MemberMethodContext ctx) {
//        currentScope = ctx.;
//        return super.visitMemberMethod(ctx);
//    }
//
//    /**
//     * Visit a parse tree produced by the {@code fieldDeclOrInst}
//     * labeled alternative in {@link BantamJavaParser#field}.
//     *
//     * @param ctx the parse tree
//     * @return the visitor result
//     */
//    public ParserRuleContext visitFieldDeclOrInst(BantamJavaParser.FieldDeclOrInstContext ctx) {
//        return ctx;
//    }
//
    /**
     * Visit a parse tree produced by the {@code methodDeclaration}
     * labeled alternative in {@link BantamJavaParser#method}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public ParserRuleContext visitMethodDeclaration(BantamJavaParser.MethodDeclarationContext ctx) {
        currentScope = ctx.scope;
        if (DEBUG) {
            System.out.print("Entering method Scope: ");
            System.out.print(currentScope.toString());
            System.out.println();
        }

        super.visitMethodDeclaration(ctx);
        currentScope = currentScope.getEnclosingScope();
        return ctx;
    }
//
//    /**
//     * Visit a parse tree produced by the {@code lstOfFormals}
//     * labeled alternative in {@link BantamJavaParser#formalList}.
//     *
//     * @param ctx the parse tree
//     * @return the visitor result
//     */
//    public ParserRuleContext visitLstOfFormals(BantamJavaParser.LstOfFormalsContext ctx) {
//        return ctx;
//    }
//
//    /**
//     * Visit a parse tree produced by the {@code formalParameter}
//     * labeled alternative in {@link BantamJavaParser#formal}.
//     *
//     * @param ctx the parse tree
//     * @return the visitor result
//     */
//    public ParserRuleContext visitFormalParameter(BantamJavaParser.FormalParameterContext ctx) {
//        return ctx;
//    }
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
//
//    /**
//     * Visit a parse tree produced by the {@code stmtIf}
//     * labeled alternative in {@link BantamJavaParser#stmt}.
//     *
//     * @param ctx the parse tree
//     * @return the visitor result
//     */
//    public ParserRuleContext visitStmtIf(BantamJavaParser.StmtIfContext ctx) {
//        return ctx;
//    }
//
//    /**
//     * Visit a parse tree produced by the {@code stmtWhile}
//     * labeled alternative in {@link BantamJavaParser#stmt}.
//     *
//     * @param ctx the parse tree
//     * @return the visitor result
//     */
//    public ParserRuleContext visitStmtWhile(BantamJavaParser.StmtWhileContext ctx) {
//        // Check WHILE statement semantics
//        // The expression must be of type boolean
//
//        // TODO
//        if (ctx.expr().exprType != null) {
//
//        }
//        return ctx;
//    }
//
//    /**
//     * Visit a parse tree produced by the {@code stmtLocalVarDecl}
//     * labeled alternative in {@link BantamJavaParser#stmt}.
//     *
//     * @param ctx the parse tree
//     * @return the visitor result
//     */
//    public ParserRuleContext visitStmtLocalVarDecl(BantamJavaParser.StmtLocalVarDeclContext ctx) {
//        return ctx;
//    }
//
    /**
     * Visit a parse tree produced by {@link BantamJavaParser#blockStmt}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public ParserRuleContext visitBlockStmt(BantamJavaParser.BlockStmtContext ctx) {
        currentScope = ctx.scope;
        if (DEBUG) {
            System.out.print("Entering local Scope: ");
            System.out.print(currentScope.toString());
            System.out.println();
        }

        super.visitBlockStmt(ctx);
        currentScope = currentScope.getEnclosingScope();
        return ctx;
    }
//
//    /**
//     * Visit a parse tree produced by the {@code return}
//     * labeled alternative in {@link BantamJavaParser#retn}.
//     *
//     * @param ctx the parse tree
//     * @return the visitor result
//     */
//    public ParserRuleContext visitReturn(BantamJavaParser.ReturnContext ctx) {
//        return ctx;
//    }
//
//    /**
//     * Visit a parse tree produced by the {@code exprInt}
//     * labeled alternative in {@link BantamJavaParser#expr}.
//     *
//     * @param ctx the parse tree
//     * @return the visitor result
//     */
//    public ParserRuleContext visitExprInt(BantamJavaParser.ExprIntContext ctx) {
//        return ctx;
//    }
//
//    /**
//     * Visit a parse tree produced by the {@code exprMulDivMod}
//     * labeled alternative in {@link BantamJavaParser#expr}.
//     *
//     * @param ctx the parse tree
//     * @return the visitor result
//     */
//    public ParserRuleContext visitExprMulDivMod(BantamJavaParser.ExprMulDivModContext ctx) {
//        return ctx;
//    }
//
//    /**
//     * Visit a parse tree produced by the {@code exprNot}
//     * labeled alternative in {@link BantamJavaParser#expr}.
//     *
//     * @param ctx the parse tree
//     * @return the visitor result
//     */
//    public ParserRuleContext visitExprNot(BantamJavaParser.ExprNotContext ctx) {
//        return ctx;
//    }
//
//    /**
//     * Visit a parse tree produced by the {@code exprVarAssign}
//     * labeled alternative in {@link BantamJavaParser#expr}.
//     *
//     * @param ctx the parse tree
//     * @return the visitor result
//     */
//    public ParserRuleContext visitExprVarAssign(BantamJavaParser.ExprVarAssignContext ctx) {
//        return ctx;
//    }
//
//    /**
//     * Visit a parse tree produced by the {@code exprAddSub}
//     * labeled alternative in {@link BantamJavaParser#expr}.
//     *
//     * @param ctx the parse tree
//     * @return the visitor result
//     */
//    public ParserRuleContext visitExprAddSub(BantamJavaParser.ExprAddSubContext ctx) {
//        return ctx;
//    }
//
//    /**
//     * Visit a parse tree produced by the {@code expStrLiteral}
//     * labeled alternative in {@link BantamJavaParser#expr}.
//     *
//     * @param ctx the parse tree
//     * @return the visitor result
//     */
//    public ParserRuleContext visitExpStrLiteral(BantamJavaParser.ExpStrLiteralContext ctx) {
//        return ctx;
//    }
//
//    /**
//     * Visit a parse tree produced by the {@code exprInstanceof}
//     * labeled alternative in {@link BantamJavaParser#expr}.
//     *
//     * @param ctx the parse tree
//     * @return the visitor result
//     */
//    public ParserRuleContext visitExprInstanceof(BantamJavaParser.ExprInstanceofContext ctx) {
//        return ctx;
//    }
//
//    /**
//     * Visit a parse tree produced by the {@code exprNew}
//     * labeled alternative in {@link BantamJavaParser#expr}.
//     *
//     * @param ctx the parse tree
//     * @return the visitor result
//     */
//    public ParserRuleContext visitExprNew(BantamJavaParser.ExprNewContext ctx) {
//        return ctx;
//    }
//
//    /**
//     * Visit a parse tree produced by the {@code exprOr}
//     * labeled alternative in {@link BantamJavaParser#expr}.
//     *
//     * @param ctx the parse tree
//     * @return the visitor result
//     */
//    public ParserRuleContext visitExprOr(BantamJavaParser.ExprOrContext ctx) {
//        return ctx;
//    }
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
    public ParserRuleContext visitExprFieldAssign(BantamJavaParser.ExprFieldAssignContext ctx) {
        return ctx;
    }
//
//    /**
//     * Visit a parse tree produced by the {@code exprParenthesized}
//     * labeled alternative in {@link BantamJavaParser#expr}.
//     *
//     * @param ctx the parse tree
//     * @return the visitor result
//     */
//    public ParserRuleContext visitExprParenthesized(BantamJavaParser.ExprParenthesizedContext ctx) {
//        return ctx;
//    }
//
//    /**
//     * Visit a parse tree produced by the {@code exprRelational}
//     * labeled alternative in {@link BantamJavaParser#expr}.
//     *
//     * @param ctx the parse tree
//     * @return the visitor result
//     */
//    public ParserRuleContext visitExprRelational(BantamJavaParser.ExprRelationalContext ctx) {
//        return ctx;
//    }
//
//    /**
//     * Visit a parse tree produced by the {@code exprBoolLiteral}
//     * labeled alternative in {@link BantamJavaParser#expr}.
//     *
//     * @param ctx the parse tree
//     * @return the visitor result
//     */
//    public ParserRuleContext visitExprBoolLiteral(BantamJavaParser.ExprBoolLiteralContext ctx) {
//        return ctx;
//    }
//
//    /**
//     * Visit a parse tree produced by the {@code exprAnd}
//     * labeled alternative in {@link BantamJavaParser#expr}.
//     *
//     * @param ctx the parse tree
//     * @return the visitor result
//     */
//    public ParserRuleContext visitExprAnd(BantamJavaParser.ExprAndContext ctx) {
//        return ctx;
//    }
//
//    /**
//     * Visit a parse tree produced by the {@code exprID}
//     * labeled alternative in {@link BantamJavaParser#expr}.
//     *
//     * @param ctx the parse tree
//     * @return the visitor result
//     */
//    public ParserRuleContext visitExprID(BantamJavaParser.ExprIDContext ctx) {
//        return ctx;
//    }
//
//    /**
//     * Visit a parse tree produced by the {@code exprMethodCall}
//     * labeled alternative in {@link BantamJavaParser#expr}.
//     *
//     * @param ctx the parse tree
//     * @return the visitor result
//     */
    public ParserRuleContext visitExprMethodCall(BantamJavaParser.ExprMethodCallContext ctx) {
        return ctx;
    }
//
//    /**
//     * Visit a parse tree produced by the {@code exprNegation}
//     * labeled alternative in {@link BantamJavaParser#expr}.
//     *
//     * @param ctx the parse tree
//     * @return the visitor result
//     */
//    public ParserRuleContext visitExprNegation(BantamJavaParser.ExprNegationContext ctx) {
//        return ctx;
//    }
//
//    /**
//     * Visit a parse tree produced by the {@code exprDotMethodCall}
//     * labeled alternative in {@link BantamJavaParser#expr}.
//     *
//     * @param ctx the parse tree
//     * @return the visitor result
//     */
//    public ParserRuleContext visitExprDotMethodCall(BantamJavaParser.ExprDotMethodCallContext ctx) {
//        return ctx;
//    }
//
//    /**
//     * Visit a parse tree produced by the {@code lstOfArgs}
//     * labeled alternative in {@link BantamJavaParser#argsList}.
//     *
//     * @param ctx the parse tree
//     * @return the visitor result
//     */
//    public ParserRuleContext visitLstOfArgs(BantamJavaParser.LstOfArgsContext ctx) {
//        return ctx;
//    }

    private int infoCount = 0;
    private int warningCount = 0;
    private int errorCount = 0;

    /**
     * Emit an information message
     *
     * @param ctx the parse tree
     * @return void. Prints a message to the standard error stream
     */
    void infoMessage(ParserRuleContext ctx, String message) {
        System.err.print("[");
        System.err.print(ctx.getStart().getLine());
        System.err.print("] INFO: ");
        System.err.println(message);
        ++infoCount;
    }

    /**
     * Emit a warning message
     *
     * @param ctx the parse tree
     * @return void. Prints a message to the standard error stream
     */
    void warningMessage(ParserRuleContext ctx, String message) {
        System.err.print("[");
        System.err.print(ctx.getStart().getLine());
        System.err.print("] WARNING: ");
        System.err.println(message);
        ++warningCount;
    }

    /**
     * Emit an error message
     *
     * @param ctx the parse tree
     * @return void. Prints a message to the standard error stream
     */
    void errorMessage(ParserRuleContext ctx, String message) {
        System.err.print("[");
        System.err.print(ctx.getStart().getLine());
        System.err.print("] ERROR: ");
        System.err.println(message);
        ++errorCount;
    }

    /**
     * Emit a fatal error message
     *
     * @param ctx the parse tree
     * @return void. Prints a message to the standard error stream and
     *         terminates execution with status 1
     */
    void fatalMessage(ParserRuleContext ctx, String message) {
        System.err.print("[");
        System.err.print(ctx.getStart().getLine());
        System.err.print("] FATAL ERROR: ");
        System.err.println(message);
        System.exit(1);
    }

    /**
     * Get the number of error messages
     *
     * @return the number of error messages
     */
    int getErrorCount() {
        return errorCount;
    }

}