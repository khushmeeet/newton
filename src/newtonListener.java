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
	 * Enter a parse tree produced by the {@code ArrayValue}
	 * labeled alternative in {@link newtonParser#value}.
	 * @param ctx the parse tree
	 */
	void enterArrayValue(newtonParser.ArrayValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayValue}
	 * labeled alternative in {@link newtonParser#value}.
	 * @param ctx the parse tree
	 */
	void exitArrayValue(newtonParser.ArrayValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ObjectInArray}
	 * labeled alternative in {@link newtonParser#value}.
	 * @param ctx the parse tree
	 */
	void enterObjectInArray(newtonParser.ObjectInArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ObjectInArray}
	 * labeled alternative in {@link newtonParser#value}.
	 * @param ctx the parse tree
	 */
	void exitObjectInArray(newtonParser.ObjectInArrayContext ctx);
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
	 * Enter a parse tree produced by the {@code ObjectValue}
	 * labeled alternative in {@link newtonParser#pair}.
	 * @param ctx the parse tree
	 */
	void enterObjectValue(newtonParser.ObjectValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ObjectValue}
	 * labeled alternative in {@link newtonParser#pair}.
	 * @param ctx the parse tree
	 */
	void exitObjectValue(newtonParser.ObjectValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayInObject}
	 * labeled alternative in {@link newtonParser#pair}.
	 * @param ctx the parse tree
	 */
	void enterArrayInObject(newtonParser.ArrayInObjectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayInObject}
	 * labeled alternative in {@link newtonParser#pair}.
	 * @param ctx the parse tree
	 */
	void exitArrayInObject(newtonParser.ArrayInObjectContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EmptyObject}
	 * labeled alternative in {@link newtonParser#pair}.
	 * @param ctx the parse tree
	 */
	void enterEmptyObject(newtonParser.EmptyObjectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EmptyObject}
	 * labeled alternative in {@link newtonParser#pair}.
	 * @param ctx the parse tree
	 */
	void exitEmptyObject(newtonParser.EmptyObjectContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NestedObject}
	 * labeled alternative in {@link newtonParser#pair}.
	 * @param ctx the parse tree
	 */
	void enterNestedObject(newtonParser.NestedObjectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NestedObject}
	 * labeled alternative in {@link newtonParser#pair}.
	 * @param ctx the parse tree
	 */
	void exitNestedObject(newtonParser.NestedObjectContext ctx);
	/**
	 * Enter a parse tree produced by the {@code String}
	 * labeled alternative in {@link newtonParser#data}.
	 * @param ctx the parse tree
	 */
	void enterString(newtonParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code String}
	 * labeled alternative in {@link newtonParser#data}.
	 * @param ctx the parse tree
	 */
	void exitString(newtonParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumericValue}
	 * labeled alternative in {@link newtonParser#data}.
	 * @param ctx the parse tree
	 */
	void enterNumericValue(newtonParser.NumericValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumericValue}
	 * labeled alternative in {@link newtonParser#data}.
	 * @param ctx the parse tree
	 */
	void exitNumericValue(newtonParser.NumericValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BooleanValue}
	 * labeled alternative in {@link newtonParser#data}.
	 * @param ctx the parse tree
	 */
	void enterBooleanValue(newtonParser.BooleanValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BooleanValue}
	 * labeled alternative in {@link newtonParser#data}.
	 * @param ctx the parse tree
	 */
	void exitBooleanValue(newtonParser.BooleanValueContext ctx);
}