import java.io.FileInputStream;
import java.io.InputStream;
import java.util.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Renderer {
    public static void main(String[] args) throws Exception {
        String inputFile = null;
        if ( args.length>0 ) inputFile = args[0];
        InputStream is = System.in;
        if ( inputFile!=null ) {
            is = new FileInputStream(inputFile);
        }
        ANTLRInputStream input = new ANTLRInputStream(is);
        newtonLexer lexer = new newtonLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        newtonParser parser = new newtonParser(tokens);
        parser.setBuildParseTree(true);
        ParseTree tree = parser.pair();
        // show tree in text form
        System.out.println(tree.toStringTree(parser));

        ParseTreeWalker walker = new ParseTreeWalker();
        JSONEmitter emitter = new JSONEmitter();
        walker.walk(emitter, tree);
        System.out.println(emitter.getValue(tree));
    }
}