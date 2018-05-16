import java.io.*;

import org.antlr.symtab.ClassSymbol;
import org.antlr.symtab.MethodSymbol;
import org.antlr.symtab.Scope;
import org.antlr.v4.runtime.ParserRuleContext;


public class CodeGenerator extends BantamJavaBaseVisitor<ParserRuleContext> {

    private PrintStream codeFile = null;
    private ErrorReporter reporter = null;
    private int nextLabel = 0;

    protected Scope globals = null;
    protected ClassSymbol classScope = null;
    protected MethodSymbol methodScope = null;
    protected Scope currentScope = null;


    CodeGenerator(ErrorReporter reporter) {

        this.reporter = reporter;
    }

    private String getNextLabel() {
        String lbl = "L" + Integer.toString(nextLabel);
        nextLabel++;
        return lbl;
    }

    @Override
    public ParserRuleContext visitProgram(BantamJavaParser.ProgramContext ctx) {

        System.out.println("CodeGenerator");

        // Open a file to contain the generated Jasmin assembly code
        // The name of the file is (for now, anyway) Bantam.j
        try {
            codeFile = new PrintStream("Bantam.j");
        } catch (FileNotFoundException e) {
            System.err.println("FATAL: Cannot open file Bantam.j");
            System.exit(2);
        }

        globals = ctx.scope;
        currentScope = globals;

        super.visitProgram(ctx);

        codeFile.close();

        currentScope = null;

        return ctx;
    }

    @Override
    public ParserRuleContext visitClass(BantamJavaParser.ClassContext ctx) {

        currentScope = ctx.scope;
        classScope = ctx.symbol;

        // Issue a directive to define a class
        codeFile.print("; Line");
        codeFile.println(ctx.start.getLine());
        codeFile.println(".class public " + ctx.className.getText());
        codeFile.println(".super " + "SUPERCLASSNAME"); // TODO
        codeFile.println(".implements java/lang/Cloneable");
        codeFile.println();

        // Emit code for the fields
        codeFile.println(".field protected <name> <type>");  // TODO

        // Generate code for the constructor
        codeFile.println(".method public <init>()V");
        codeFile.println(".limit stack <max>");   // TODO
        codeFile.println(".limit locals <n>");   // TODO
        codeFile.println("    aload_0");
        codeFile.println("    dup");
        codeFile.println("    invokespecial java/lang/Object/<init>()V");

        // Code to initialize the fields
        // TODO

        codeFile.println("    return");
        codeFile.println(".end method");
        codeFile.println();

        super.visitClass(ctx);

        // Spit out the code below
        // TODO
//        .method static public main([Ljava.lang.String;)V
//                .limit stack 2
//                .limit locals 1
//        new Main
//        dup
//        invokespecial Main/<init>()V
//        invokevirtual Main/original_main()V
//        return
//        .end method

        currentScope = currentScope.getEnclosingScope();
        return ctx;
    }

    @Override
    public ParserRuleContext visitTypeVoid(BantamJavaParser.TypeVoidContext ctx) {

        return super.visitTypeVoid(ctx);
    }

    @Override
    public ParserRuleContext visitTypeInt(BantamJavaParser.TypeIntContext ctx) {

        return super.visitTypeInt(ctx);
    }

    @Override
    public ParserRuleContext visitTypeBool(BantamJavaParser.TypeBoolContext ctx) {

        return super.visitTypeBool(ctx);
    }

    @Override
    public ParserRuleContext visitTypeID(BantamJavaParser.TypeIDContext ctx) {

        return super.visitTypeID(ctx);
    }

    @Override
    public ParserRuleContext visitMemberField(BantamJavaParser.MemberFieldContext ctx) {
        return super.visitMemberField(ctx);
    }

    @Override
    public ParserRuleContext visitMemberMethod(BantamJavaParser.MemberMethodContext ctx) {
        return super.visitMemberMethod(ctx);
     }

    @Override
    public ParserRuleContext visitFieldDeclOrInst(BantamJavaParser.FieldDeclOrInstContext ctx) {
        return super.visitFieldDeclOrInst(ctx);
    }

    @Override
    public ParserRuleContext visitMethodDeclaration(BantamJavaParser.MethodDeclarationContext ctx) {
        // Defining a method

        currentScope = ctx.scope;
        methodScope = ctx.symbol;

        codeFile.println("; Defining a method");
        codeFile.print(".method public ");
        codeFile.print(ctx.ID().getText());
        // TODO Need a type descriptor for the parameters
        codeFile.println("    ; TODO type descriptor");
        codeFile.println();

        codeFile.println("    .limit stack TBD");
        codeFile.println("    .limit locals TBD");

        codeFile.println("    ; set up local variables");

        super.visitMethodDeclaration(ctx);

        currentScope = currentScope.getEnclosingScope();
        return ctx;
    }

    @Override
    public ParserRuleContext visitLstOfFormals(BantamJavaParser.LstOfFormalsContext ctx) {
        return super.visitLstOfFormals(ctx);
    }

    @Override
    public ParserRuleContext visitFormalParameter(BantamJavaParser.FormalParameterContext ctx) {
        return super.visitFormalParameter(ctx);
    }

    @Override
    public ParserRuleContext visitStmtExprSemi(BantamJavaParser.StmtExprSemiContext ctx) {
        return super.visitStmtExprSemi(ctx);
    }

    @Override
    public ParserRuleContext visitStmtBlock(BantamJavaParser.StmtBlockContext ctx) {
        return super.visitStmtBlock(ctx);
    }

    @Override
    public ParserRuleContext visitStmtIf(BantamJavaParser.StmtIfContext ctx) {

        String elseLabel = getNextLabel();
        String endLabel = getNextLabel();

        codeFile.println("    ; if statement: boolean expression");
        // Emit code for the expression TODO

        codeFile.println("    ifeq  " + elseLabel);
        codeFile.println("    ; then part code");
        // Emit code for the _then_ part  TODO

        codeFile.println("    goto " + endLabel);
        codeFile.println(elseLabel + ':');
        // Emit code for any _else_ part TODO

        codeFile.println(endLabel + ':');

        return super.visitStmtIf(ctx);
    }

    @Override
    public ParserRuleContext visitStmtWhile(BantamJavaParser.StmtWhileContext ctx) {

        return super.visitStmtWhile(ctx);
    }

    @Override
    public ParserRuleContext visitStmtLocalVarDecl(BantamJavaParser.StmtLocalVarDeclContext ctx) {
        return super.visitStmtLocalVarDecl(ctx);
    }

    @Override
    public ParserRuleContext visitBlockStmt(BantamJavaParser.BlockStmtContext ctx) {

        return super.visitBlockStmt(ctx);
    }

    @Override
    public ParserRuleContext visitReturn(BantamJavaParser.ReturnContext ctx) {
        return super.visitReturn(ctx);
    }

    @Override
    public ParserRuleContext visitExprInt(BantamJavaParser.ExprIntContext ctx) {
        return super.visitExprInt(ctx);
    }

    @Override
    public ParserRuleContext visitExprMulDivMod(BantamJavaParser.ExprMulDivModContext ctx) {
        return super.visitExprMulDivMod(ctx);
    }

    @Override
    public ParserRuleContext visitExprNot(BantamJavaParser.ExprNotContext ctx) {
        return super.visitExprNot(ctx);
    }

    @Override
    public ParserRuleContext visitExprVarAssign(BantamJavaParser.ExprVarAssignContext ctx) {
        return super.visitExprVarAssign(ctx);
    }

    @Override
    public ParserRuleContext visitExprAddSub(BantamJavaParser.ExprAddSubContext ctx) {
        return super.visitExprAddSub(ctx);
    }

    @Override
    public ParserRuleContext visitExpStrLiteral(BantamJavaParser.ExpStrLiteralContext ctx) {
        return super.visitExpStrLiteral(ctx);
    }

    @Override
    public ParserRuleContext visitExprInstanceof(BantamJavaParser.ExprInstanceofContext ctx) {
        return super.visitExprInstanceof(ctx);
    }

    @Override
    public ParserRuleContext visitExprNew(BantamJavaParser.ExprNewContext ctx) {
        return super.visitExprNew(ctx);
    }

    @Override
    public ParserRuleContext visitExprOr(BantamJavaParser.ExprOrContext ctx) {
        return super.visitExprOr(ctx);
    }

    @Override
    public ParserRuleContext visitExprTypeConversion(BantamJavaParser.ExprTypeConversionContext ctx) {
        return super.visitExprTypeConversion(ctx);
    }

    @Override
    public ParserRuleContext visitExprFieldAssign(BantamJavaParser.ExprFieldAssignContext ctx) {
        return super.visitExprFieldAssign(ctx);
    }

    @Override
    public ParserRuleContext visitExprParenthesized(BantamJavaParser.ExprParenthesizedContext ctx) {
        return super.visitExprParenthesized(ctx);
    }

    @Override
    public ParserRuleContext visitExprRelational(BantamJavaParser.ExprRelationalContext ctx) {
        return super.visitExprRelational(ctx);
    }

    @Override
    public ParserRuleContext visitExprBoolLiteral(BantamJavaParser.ExprBoolLiteralContext ctx) {
        return super.visitExprBoolLiteral(ctx);
    }

    @Override
    public ParserRuleContext visitExprAnd(BantamJavaParser.ExprAndContext ctx) {
        return super.visitExprAnd(ctx);
    }

    @Override
    public ParserRuleContext visitExprID(BantamJavaParser.ExprIDContext ctx) {
        return super.visitExprID(ctx);
    }

    @Override
    public ParserRuleContext visitExprMethodCall(BantamJavaParser.ExprMethodCallContext ctx) {
        return super.visitExprMethodCall(ctx);
    }

    @Override
    public ParserRuleContext visitExprNegation(BantamJavaParser.ExprNegationContext ctx) {
        return super.visitExprNegation(ctx);
    }

    @Override
    public ParserRuleContext visitExprDotMethodCall(BantamJavaParser.ExprDotMethodCallContext ctx) {
        return super.visitExprDotMethodCall(ctx);
    }

    @Override
    public ParserRuleContext visitLstOfArgs(BantamJavaParser.LstOfArgsContext ctx) {
        return super.visitLstOfArgs(ctx);
    }
}
