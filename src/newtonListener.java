// Generated from newton.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link newtonParser}.
 */
public interface newtonListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link newtonParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(newtonParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link newtonParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(newtonParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link newtonParser#structures}.
	 * @param ctx the parse tree
	 */
	void enterStructures(newtonParser.StructuresContext ctx);
	/**
	 * Exit a parse tree produced by {@link newtonParser#structures}.
	 * @param ctx the parse tree
	 */
	void exitStructures(newtonParser.StructuresContext ctx);
	/**
	 * Enter a parse tree produced by {@link newtonParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(newtonParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link newtonParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(newtonParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link newtonParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(newtonParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link newtonParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(newtonParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link newtonParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(newtonParser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link newtonParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(newtonParser.ObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link newtonParser#pair}.
	 * @param ctx the parse tree
	 */
	void enterPair(newtonParser.PairContext ctx);
	/**
	 * Exit a parse tree produced by {@link newtonParser#pair}.
	 * @param ctx the parse tree
	 */
	void exitPair(newtonParser.PairContext ctx);
}