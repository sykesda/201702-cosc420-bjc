import org.antlr.symtab.*;
import org.antlr.v4.runtime.ParserRuleContext;

public class SemanticAnalyzer extends BantamJavaBaseVisitor<ParserRuleContext> {

    protected Scope globals = null;
    protected Scope currentScope = null;
    protected final boolean DEBUG = true;
    protected Symbol booleanSymbol = null;
    protected Symbol intSymbol = null;
    protected Symbol voidSymbol = null;
    protected Symbol objectSymbol = null;

    /**
     * Checks if id is a valid type{@link BantamJavaParser#type}.
     *
     * @param id identifier string
     * @return a symbol reference if id is a valid type, null otherwise
     */
    private Type CheckValidType(String id) {
        Symbol symbol = currentScope.resolve(id);
        if (symbol == booleanSymbol || symbol == intSymbol || symbol == voidSymbol || symbol instanceof ClassSymbol) {
            return (Type) symbol;
        } else {
            return null;
        }
    }

    private Type CheckTypeCompatibility(Type leftType, Type rightType) {
        if (leftType == rightType) {
            return leftType;
        } else if (leftType instanceof ClassSymbol && rightType instanceof ClassSymbol) {
            if (leftType == rightType) {
                return leftType;
            }
            while (((ClassSymbol) rightType).getSuperClassScope() != null) {
                if (((ClassSymbol) leftType) == ((ClassSymbol) rightType).getSuperClassScope()) {
                    return rightType;
                }
            }

        } else {
            return null;
        }
        return null;
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
        currentScope = ctx.scope;
        String className = ctx.className.getText();
        ClassSymbol currentClassSymbol = (ClassSymbol) currentScope.resolve(className);

        // if there is no "extends" then our superclass is Object
        if (ctx.superclassName == null) {
            currentClassSymbol.setSuperClass("Object");

            // otherwise, get the superclass object and make sure it's an instance of class symbol
        } else {
            String superclass = ctx.superclassName.getText();
            Symbol superclassSym = currentScope.resolve(superclass);
            if (superclassSym instanceof ClassSymbol) {
                currentClassSymbol.setSuperClass(superclass);
            } else {
                System.out.println("Superclass is not an instance of Class Symbol!");
            }
        }
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

    /**
     * Visit a parse tree produced by the {@code fieldDeclOrInst}
     * labeled alternative in {@link BantamJavaParser#field}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public ParserRuleContext visitFieldDeclOrInst(BantamJavaParser.FieldDeclOrInstContext ctx) {
        //Check if id in symbol table already. If yes, error.
        //If not, put in symbol table
        //TODO
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
        currentScope = ctx.scope;
        if (DEBUG) {
            System.out.print("Entering method Scope: ");
            System.out.print(currentScope.toString());
            System.out.println();
        }

        Symbol rtnSymbol = currentScope.resolve(ctx.type().getText());
        //Check if method symbol already in symbol table
        //TODO
        //If yes, error
        //Else, check if method is void
        //void, put in symbol table
        //If not void, set return type & put in symbol table

        if (rtnSymbol != voidSymbol) {
            //Set return type to symbol
            ctx.symbol.setType((Type) rtnSymbol);
        } else {
            //Set return type to void
            ctx.symbol.setType((Type) voidSymbol);
        }
        super.visitMethodDeclaration(ctx);
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
        //make sure list size of formals is same as formals in method declaration
        //go through all formal parameters
        //make sure that none are type void
        //if a class instance, check if class or id is valid

        int sizeOfFormals = ctx.children.size() + 1;
        for (int i = 0; i < sizeOfFormals; i++) {
            Type type = CheckValidType(ctx.formal().toString());
            if (type != null) {
                //Put in symbol table
                //TODO
            } else {
                errorMessage(ctx, "Parameter not compatible with return type");
            }
        }
        return ctx;
    }

    /**
     * Visit a parse tree produced by the {@code formalParameter}
     * labeled alternative in {@link BantamJavaParser#formal}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public ParserRuleContext visitFormalParameter(BantamJavaParser.FormalParameterContext ctx) {
        Type formalSymbol = CheckValidType(ctx.type().getText());
        Type methodSymbol = CheckValidType(currentScope.getEnclosingScope().toString());
        if (formalSymbol != voidSymbol) {
            if (CheckTypeCompatibility(methodSymbol, formalSymbol) != null) {
                //currentScope.resolve(ctx.ID().getText());
                //put in symbol table
                //TODO
            } else {
                errorMessage(ctx, "Type not compatible with return type.");
            }
        }
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

    /**
     * Visit a parse tree produced by the {@code stmtLocalVarDecl}
     * labeled alternative in {@link BantamJavaParser#stmt}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public ParserRuleContext visitStmtLocalVarDecl(BantamJavaParser.StmtLocalVarDeclContext ctx) {
        // get the variable and make sure it's a Variable Symbol (it will be, see ParserListener)
        Symbol sym = currentScope.resolve(ctx.ID().getText());
        assert sym instanceof VariableSymbol;

        String type = ctx.type().getText();
        Type t = CheckValidType(type);
        if (t != null) {
            ((VariableSymbol) sym).setType(t);
        } else {
            // do error
            ((VariableSymbol) sym).setType((Type) objectSymbol);
        }
        super.visitStmtLocalVarDecl(ctx);
        return ctx;
    }

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

    /**
     * Visit a parse tree produced by the {@code exprInt}
     * labeled alternative in {@link BantamJavaParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public ParserRuleContext visitExprInt(BantamJavaParser.ExprIntContext ctx) {
        org.antlr.symtab.PrimitiveType thisType = (org.antlr.symtab.PrimitiveType) currentScope.resolve("int");
        ctx.exprType = thisType;
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
        super.visitExprMulDivMod(ctx);
        org.antlr.symtab.Symbol leftType = (org.antlr.symtab.Symbol) ctx.expr(0).exprType;
        org.antlr.symtab.Symbol rightType = (org.antlr.symtab.Symbol) ctx.expr(1).exprType;
        if (leftType != currentScope.resolve("int") || leftType != rightType) {
            //todo error
        }
        ctx.exprType = (org.antlr.symtab.Type) leftType;
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
        super.visitExprNot(ctx);
        org.antlr.symtab.PrimitiveType thisType = (org.antlr.symtab.PrimitiveType) currentScope.resolve(ctx.expr().exprType.getName());
        if (thisType != currentScope.resolve("boolean")) {
            errorMessage(ctx, "Incompatible type: expr must be type boolean.");
        }
        ctx.exprType = thisType;
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
        super.visitExprVarAssign(ctx);

        org.antlr.symtab.VariableSymbol leftSymbol = (org.antlr.symtab.VariableSymbol) currentScope.resolve(ctx.ID().getText());
        org.antlr.symtab.Type leftType = leftSymbol.getType();

        org.antlr.symtab.VariableSymbol rightSymbol = (org.antlr.symtab.VariableSymbol) currentScope.resolve(ctx.expr().getText());
        org.antlr.symtab.Type rightType = ctx.expr().exprType;


        if (leftType != rightType) {
            errorMessage(ctx, "Incompatible Types.");
        }

        if (leftSymbol == null) {
            errorMessage(ctx, "Undefined variable.");
        }

        ctx.exprType = ctx.expr().exprType;
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
        super.visitExprAddSub(ctx);
        org.antlr.symtab.Type leftType = ctx.expr(0).exprType;
        org.antlr.symtab.Type rightType = ctx.expr(1).exprType;
        org.antlr.symtab.PrimitiveType intType = (org.antlr.symtab.PrimitiveType) currentScope.resolve("int");

        if (leftType != intType || rightType != intType) {
            errorMessage(ctx, "Incompatible types: Must be of type int.");
        }
        ctx.exprType = intType;
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
        org.antlr.symtab.PrimitiveType thisType = (org.antlr.symtab.PrimitiveType) currentScope.resolve("String");
        ctx.exprType = thisType;
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
        org.antlr.symtab.Symbol leftType = (org.antlr.symtab.Symbol) ctx.expr().exprType;
        org.antlr.symtab.Type rightType = CheckValidType(ctx.type().getText());
        if (rightType == null || !(rightType instanceof ClassSymbol) || leftType != rightType) {
            //todo error
        }
        ctx.exprType = (org.antlr.symtab.Type) leftType;
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
        super.visitExprNew(ctx);
        org.antlr.symtab.Type idType = CheckValidType(ctx.ID().getText());
        if (idType == null || !(idType instanceof ClassSymbol)) {
            //todo error
        }
        ctx.exprType = (org.antlr.symtab.Type) idType;
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
        super.visitExprOr(ctx);
        org.antlr.symtab.Type leftType = (org.antlr.symtab.Type) ctx.expr(0).exprType;
        org.antlr.symtab.Type rightType = (org.antlr.symtab.Type) ctx.expr(1).exprType;
        if (leftType != currentScope.resolve("boolean") || leftType != rightType) {
            //TODO error message
        } else {
            ctx.exprType = leftType;
        }
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
        org.antlr.symtab.Symbol leftType = (org.antlr.symtab.Symbol) ctx.expr(0).exprType;
        org.antlr.symtab.Symbol rightType = (org.antlr.symtab.Symbol) ctx.expr(1).exprType;
        String operator = ctx.operator.getText();
        if (operator.equals("==") || operator.equals("!=")) {
            if ((leftType != currentScope.resolve("int") || !(leftType instanceof org.antlr.symtab.ClassSymbol)) || leftType != rightType) {
                //TODO error message
            }
        } else {
            if (leftType != currentScope.resolve("int") || leftType != rightType) {
                //TODO error message
            }
        }
        ctx.exprType = (org.antlr.symtab.Type) currentScope.resolve("boolean");
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
        super.visitExprAnd(ctx);
        org.antlr.symtab.Type leftType = ctx.expr(0).exprType;
        org.antlr.symtab.Type rightType = ctx.expr(0).exprType;
        if (leftType != currentScope.resolve("boolean") || rightType != currentScope.resolve("boolean")) {
            errorMessage(ctx, "Incompatible type: expr must be type boolean.");
        }
        ctx.exprType = (org.antlr.symtab.PrimitiveType) currentScope.resolve("boolean");
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
        super.visitExprID(ctx);
        Symbol thisID = (Symbol) currentScope.resolve(ctx.ID().getText());
        org.antlr.symtab.Type thisType = CheckValidType(thisID.getName());
        if (thisID == null) {
            errorMessage(ctx, "Undefined variable.");
        }
        ctx.exprType = thisType;
        //todo set ctx.exprType ??
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
        //ID argsList
        super.visitExprMethodCall(ctx);
        org.antlr.symtab.Type idType = CheckValidType(ctx.ID().getText());
        //todo check argsList
        if (idType == null || !(idType instanceof org.antlr.symtab.MethodSymbol)) {
            //todo error
        }
        ctx.exprType = idType;
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
        super.visitExprNegation(ctx);
        org.antlr.symtab.PrimitiveType thisType = (org.antlr.symtab.PrimitiveType) currentScope.resolve(ctx.expr().exprType.getName());
        if (thisType != currentScope.resolve("int")) {
            errorMessage(ctx, "Incompatible type: must be of type int");
        }
        ctx.exprType = (org.antlr.symtab.Type) currentScope.resolve("int");
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
        super.visitExprDotMethodCall(ctx);
        org.antlr.symtab.Type idType = CheckValidType(ctx.ID().getText());
        org.antlr.symtab.Symbol thisExpr = currentScope.resolve(ctx.expr().getText());
        //todo check argsList
        if (idType == null || !(idType instanceof org.antlr.symtab.MethodSymbol) || !(thisExpr instanceof org.antlr.symtab.ClassSymbol)) {
            //todo error
        }
        ctx.exprType = idType;
        return ctx;
    }

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
     * terminates execution with status 1
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