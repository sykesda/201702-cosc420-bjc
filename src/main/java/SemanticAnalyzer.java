import org.antlr.symtab.*;
import org.antlr.v4.runtime.ParserRuleContext;

/**
 * <h1>Semantic Analysis - Pass 1</h1>
 *
 * This pass processes semantics associated with the <em>structure</em> of
 * a BantamJava program: scope and definitions. It does not do any type
 * checking that involves expressions since an expression can
 * use a class or a method that has not yet been defined.
 */
public class SemanticAnalyzer extends BantamJavaBaseVisitor<ParserRuleContext> {

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

    protected ErrorReporter reporter = null;


    SemanticAnalyzer(ErrorReporter reporter) {
        this.reporter = reporter;
    }


//    /**
//     * Checks if symbol is a primitive type{@link BantamJavaParser#type}.
//     *
//     * @param symbol a symbol in the symbol table (not null)
//     * @return a Type symbol if symbol references int or boolean, null otherwise
//     */
//    private Type CheckPrimitiveType(Symbol symbol) {
//        if (symbol == booleanSymbol || symbol == intSymbol) {
//            return (Type) symbol;
//        } else {
//            return null;
//        }
//    }
//
//    /**
//     * Checks if symbol is a reference type{@link BantamJavaParser#type}.
//     *
//     * @param symbol a symbol in the symbol table (not null)
//     * @return a Type symbol if symbol references a ClassSymbol, null otherwise
//     */
//    private Type CheckReferenceType(Symbol symbol) {
//        if (symbol instanceof ClassSymbol) {
//            return (Type) symbol;
//        } else {
//            return null;
//        }
//    }
//
//    private Type CheckTypeCompatibility(Type leftType, Type rightType) {
//        if (leftType == rightType) {
//            return leftType;
//        } else if (leftType instanceof ClassSymbol && rightType instanceof ClassSymbol) {
//            if (leftType == rightType) {
//                return leftType;
//            }
//            while (((ClassSymbol) rightType).getSuperClassScope() != null) {
//                if (((ClassSymbol) leftType) == ((ClassSymbol) rightType).getSuperClassScope()) {
//                    return rightType;
//                }
//            }
//
//        } else {
//            return null;
//        }
//        return null;
//    }

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
            System.out.print("SEM1: Entering program Scope: ");
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
        if (DEBUG) {
            System.out.println("SEM1: visitClass: " + ctx.className.getText());

            System.out.print("Entering class Scope: ");
            System.out.print(currentScope.toString());
            System.out.println();
        }

        // The listener set the scope
        currentScope = ctx.scope;
        String className = ctx.className.getText();
        ClassSymbol currentClassSymbol = (ClassSymbol) currentScope.resolve(className);
        classScope = currentClassSymbol;

        // if there is no "extends" then our superclass is Object
        if (ctx.superclassName == null) {
            currentClassSymbol.setSuperClass("Object");
        } else {
            // Make sure the superclass name is for a class
            String superclass = ctx.superclassName.getText();
            Symbol superclassSym = currentScope.resolve(superclass);

            if (superclassSym instanceof ClassSymbol) {
                currentClassSymbol.setSuperClass(superclass);
            } else {
                reporter.errorMessage(ctx, "Superclass is not an instance of Class Symbol!");
                currentClassSymbol.setSuperClass("Object");
            }
        }

        super.visitClass(ctx);

        currentScope = currentScope.getEnclosingScope();
        classScope = null;

        return ctx;
    }
//

    /**
     * Visit a parse tree produced by the {@code typeVoid}
     * labeled alternative in {@link BantamJavaParser#type}.
     *
     * @param ctx the parse tree
     * @return the context with typeSymbol set
     */
    public ParserRuleContext visitTypeVoid(BantamJavaParser.TypeVoidContext ctx) {
        ctx.typeSymbol = (Type) voidSymbol;
        return super.visitTypeVoid(ctx);
    }
//

    /**
     * Visit a parse tree produced by the {@code typeInt}
     * labeled alternative in {@link BantamJavaParser#type}.
     *
     * @param ctx the parse tree
     * @return the context with typeSymbol set
     */
    public ParserRuleContext visitTypeInt(BantamJavaParser.TypeIntContext ctx) {
        ctx.typeSymbol = (Type) intSymbol;
        return super.visitTypeInt(ctx);
    }

    /**
     * Visit a parse tree produced by the {@code typeBool}
     * labeled alternative in {@link BantamJavaParser#type}.
     *
     * @param ctx the parse tree
     * @return the context with typeSymbol set
     */
    public ParserRuleContext visitTypeBool(BantamJavaParser.TypeBoolContext ctx) {
        ctx.typeSymbol = (Type) booleanSymbol;
        return super.visitTypeBool(ctx);
    }

    /**
     * Visit a parse tree produced by the {@code typeID}
     * labeled alternative in {@link BantamJavaParser#type}.
     *
     * @param ctx the parse tree
     * @return the context with typeSymbol set
     */
    public ParserRuleContext visitTypeID(BantamJavaParser.TypeIDContext ctx) {
        // Syntax: ID
        Symbol symbol = currentScope.resolve(ctx.ID().getText());
        if (symbol instanceof ClassSymbol) {
            ctx.typeSymbol = (Type)symbol;
        }
        else {
            reporter.errorMessage(ctx, "Type must name a class");
            ctx.typeSymbol = (Type)objectSymbol;  // Recover
        }

        return super.visitTypeID(ctx);
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
        Type type = ctx.type().typeSymbol;

        if (type == voidSymbol) {
            reporter.errorMessage(ctx, "Field type cannot be void");
        }

        fieldSymbol.setType(type);

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
        if (DEBUG) {
            System.out.print("Entering method Scope: ");
            System.out.print(currentScope.toString());
            System.out.println();
        }

        currentScope = ctx.scope;
        methodScope = ctx.symbol;
        super.visitMethodDeclaration(ctx);

        methodScope.setType(ctx.type().typeSymbol);

//        // SA2: Make sure the return statement has an expression of the right type
//        BantamJavaParser.RetnContext retn = ctx.retn();
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

        // The listener created a ParameterSymbol symbol
        ParameterSymbol paramSymbol = ctx.symbol;

        // Make sure the type is not void
        Type type = ctx.type().typeSymbol;
        if (type == voidSymbol) {
            reporter.errorMessage(ctx, "A formal parameter cannot have type void");
            type = (Type)intSymbol;  // RECOVER
        }
        paramSymbol.setType(type);

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

        Type type = ctx.type().typeSymbol;
        if (type == voidSymbol) {
            // The type is void
            reporter.errorMessage(ctx, "Variable cannot have void type");
            type = (Type)objectSymbol;  // RECOVER
        }
        varSymbol.setType(type);

//        if (CheckTypeCompatibility(type, ctx.expr().exprType) != null) {
//            reporter.errorMessage(ctx, "Incompatible expression type");
//            // TODO - recover
//        }

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

}