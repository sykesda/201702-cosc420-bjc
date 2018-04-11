import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.FileInputStream;
import java.io.InputStream;

public class BantamJavaCompiler {

    public static void main(String[] args) throws Exception {
        // Create an input stream of characters for the lexer.
        if (args.length > 0) {
            // The last command line arg is the source file name
            String inputFile = args[args.length - 1];
            InputStream is = new FileInputStream(inputFile);
            CharStream input = CharStreams.fromStream(is);

            // Create the lexer and parser objects and a token stream "pipe" between them
            BantamJavaLexer lexer = new BantamJavaLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            BantamJavaParser parser = new BantamJavaParser(tokens);

            // Launch the parser
            // https://github.com/antlr/antlr4/blob/master/doc/listeners.md
            BantamJavaParser.ProgramContext tree = parser.program();
            ParserListener listener = new ParserListener();
            ParseTreeWalker.DEFAULT.walk(listener, tree); // initiate walk of tree with listener in use of default walker

//            BantamJavaVisitor semantics = new SemanticAnalyzer(listener.getGlobalScope());
            BantamJavaVisitor semantics = new SemanticAnalyzer();
            semantics.visit(tree);

            // Print the parse tree
            System.out.println(tree.toStringTree(parser)); // print tree as text <label id="code.tour.main.7"/>
        }
        else {
            System.err.println("ERROR: No source file specified.");
        }
    }
}
