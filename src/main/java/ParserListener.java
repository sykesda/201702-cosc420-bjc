import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.symtab.*;


public class ParserListener extends BantamJavaBaseListener {

    protected BantamJavaPrimitiveScope primitiveScope= null;
    protected Scope globals = null;
    protected Scope currentScope = null;

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterProgram(BantamJavaParser.ProgramContext ctx) {
        System.out.println("enterProgram" + ctx.toString());
        primitiveScope = new BantamJavaPrimitiveScope();
        globals = new GlobalScope(primitiveScope);
        currentScope = globals;
        ctx.scope = currentScope;

    }
    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitProgram(BantamJavaParser.ProgramContext ctx) {
        System.out.println("exitProgram" + ctx.toString());
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterClass(BantamJavaParser.ClassContext ctx) {
        System.out.print("enterClass: ");
        System.out.print(ctx.className.getText());
        if (ctx.superclassName != null) {
            System.out.print(':' + ctx.superclassName.getText());
        }
        System.out.println("");

        String className = ctx.className.getText();
        ClassSymbol c = new ClassSymbol(className);
        currentScope.define(c);
        currentScope = new LocalScope(currentScope);
        ctx.scope = currentScope;
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitClass(BantamJavaParser.ClassContext ctx) {
        currentScope = currentScope.getEnclosingScope();
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterTypeVoid(BantamJavaParser.TypeVoidContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitTypeVoid(BantamJavaParser.TypeVoidContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterTypeInt(BantamJavaParser.TypeIntContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitTypeInt(BantamJavaParser.TypeIntContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterTypeBool(BantamJavaParser.TypeBoolContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitTypeBool(BantamJavaParser.TypeBoolContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterTypeID(BantamJavaParser.TypeIDContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitTypeID(BantamJavaParser.TypeIDContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterMemberField(BantamJavaParser.MemberFieldContext ctx) {
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitMemberField(BantamJavaParser.MemberFieldContext ctx) {

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterMemberMethod(BantamJavaParser.MemberMethodContext ctx) {
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitMemberMethod(BantamJavaParser.MemberMethodContext ctx) {
        currentScope = currentScope.getEnclosingScope();
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterFieldDeclOrInst(BantamJavaParser.FieldDeclOrInstContext ctx) {
        FieldSymbol fieldSymbol = new FieldSymbol(ctx.ID().getText());
        currentScope.define(fieldSymbol);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitFieldDeclOrInst(BantamJavaParser.FieldDeclOrInstContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterMethodDeclaration(BantamJavaParser.MethodDeclarationContext ctx) {
        System.out.println("enterMethodDeclaration " + ctx.ID().getText());
        MethodSymbol methodSymbol = new MethodSymbol(ctx.ID().getText());
        currentScope.define(methodSymbol);
        currentScope = new LocalScope(currentScope);
        ctx.scope = currentScope;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitMethodDeclaration(BantamJavaParser.MethodDeclarationContext ctx) {
        System.out.println("exitMethodDeclaration stmt:" + ctx.stmt().toString());
        currentScope = currentScope.getEnclosingScope();
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterLstOfFormals(BantamJavaParser.LstOfFormalsContext ctx) {
        ParameterSymbol parameterSymbol = new ParameterSymbol(ctx.formal().toString());
        currentScope.define(parameterSymbol);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitLstOfFormals(BantamJavaParser.LstOfFormalsContext ctx) {
        currentScope = currentScope.getEnclosingScope();
    }
    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterTypeWithID(BantamJavaParser.TypeWithIDContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitTypeWithID(BantamJavaParser.TypeWithIDContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterStmtExprSemi(BantamJavaParser.StmtExprSemiContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitStmtExprSemi(BantamJavaParser.StmtExprSemiContext ctx) {
    }

//    /**
//     * {@inheritDoc}
//     * <p>
//     * <p>The default implementation does nothing.</p>
//     */
//    @Override
//    public void enterStmtBlock(BantamJavaParser.StmtBlockContext ctx) {
//    }
//
//    /**
//     * {@inheritDoc}
//     * <p>
//     * <p>The default implementation does nothing.</p>
//     */
//    @Override
//    public void exitStmtBlock(BantamJavaParser.StmtBlockContext ctx) {
//    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterBlockStmt(BantamJavaParser.BlockStmtContext ctx) {
        currentScope = new LocalScope(currentScope);
        ctx.scope = currentScope;
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitBlockStmt(BantamJavaParser.BlockStmtContext ctx) {
        currentScope = currentScope.getEnclosingScope();
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterStmtIf(BantamJavaParser.StmtIfContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitStmtIf(BantamJavaParser.StmtIfContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterStmtWhile(BantamJavaParser.StmtWhileContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitStmtWhile(BantamJavaParser.StmtWhileContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterStmtLocalVarDecl(BantamJavaParser.StmtLocalVarDeclContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitStmtLocalVarDecl(BantamJavaParser.StmtLocalVarDeclContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterReturn(BantamJavaParser.ReturnContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitReturn(BantamJavaParser.ReturnContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterExprInt(BantamJavaParser.ExprIntContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitExprInt(BantamJavaParser.ExprIntContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterExprMulDivMod(BantamJavaParser.ExprMulDivModContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitExprMulDivMod(BantamJavaParser.ExprMulDivModContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterExprNot(BantamJavaParser.ExprNotContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitExprNot(BantamJavaParser.ExprNotContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterExprVarAssign(BantamJavaParser.ExprVarAssignContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitExprVarAssign(BantamJavaParser.ExprVarAssignContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterExprAddSub(BantamJavaParser.ExprAddSubContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitExprAddSub(BantamJavaParser.ExprAddSubContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterExpStrLiteral(BantamJavaParser.ExpStrLiteralContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitExpStrLiteral(BantamJavaParser.ExpStrLiteralContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterExprInstanceof(BantamJavaParser.ExprInstanceofContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitExprInstanceof(BantamJavaParser.ExprInstanceofContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterExprNew(BantamJavaParser.ExprNewContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitExprNew(BantamJavaParser.ExprNewContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterExprOr(BantamJavaParser.ExprOrContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitExprOr(BantamJavaParser.ExprOrContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterExprTypeConversion(BantamJavaParser.ExprTypeConversionContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitExprTypeConversion(BantamJavaParser.ExprTypeConversionContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterExprFieldAssign(BantamJavaParser.ExprFieldAssignContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitExprFieldAssign(BantamJavaParser.ExprFieldAssignContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterExprParenthesized(BantamJavaParser.ExprParenthesizedContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitExprParenthesized(BantamJavaParser.ExprParenthesizedContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterExprRelational(BantamJavaParser.ExprRelationalContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitExprRelational(BantamJavaParser.ExprRelationalContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterExprBoolLiteral(BantamJavaParser.ExprBoolLiteralContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitExprBoolLiteral(BantamJavaParser.ExprBoolLiteralContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterExprAnd(BantamJavaParser.ExprAndContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitExprAnd(BantamJavaParser.ExprAndContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterExprID(BantamJavaParser.ExprIDContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitExprID(BantamJavaParser.ExprIDContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterExprMethodCall(BantamJavaParser.ExprMethodCallContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitExprMethodCall(BantamJavaParser.ExprMethodCallContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterExprNegation(BantamJavaParser.ExprNegationContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitExprNegation(BantamJavaParser.ExprNegationContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterExprDotMethodCall(BantamJavaParser.ExprDotMethodCallContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitExprDotMethodCall(BantamJavaParser.ExprDotMethodCallContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterLstOfArgs(BantamJavaParser.LstOfArgsContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitLstOfArgs(BantamJavaParser.LstOfArgsContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void visitTerminal(TerminalNode node) {
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void visitErrorNode(ErrorNode node) {
    }

}
