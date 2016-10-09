import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class JSONEmitter extends newtonBaseListener {
    ParseTreeProperty<String> JSON = new ParseTreeProperty<String>();

    // helper methods
    String getValue(ParseTree node) {
        return JSON.get(node);
    }

    void setValue(ParseTree node, String str) {
        JSON.put(node, str);
    }

    public void enterStringValue(newtonParser.StringValueContext ctx) {
        setValue(ctx, ctx.ID().getText());
    }

    public void enterNumericValue(newtonParser.NumericValueContext ctx) { 
        setValue(ctx, ctx.NUMBER().getText());
    }

    public void enterBooleanValue(newtonParser.BooleanValueContext ctx) { 
        setValue(ctx, ctx.BOOLEAN().getText());
    }

    public void enterEmptyObject(newtonParser.EmptyObjectContext ctx) {
        setValue(ctx, ctx.CLOSED_PAR().getText());
    }

    public void exitObjectValue(newtonParser.ObjectValueContext ctx) { 
        setValue(ctx, getValue(ctx.object()));
    }

    public void exitArrayValue(newtonParser.ArrayValueContext ctx) { 
        setValue(ctx, getValue(ctx.array()));
    }

    public void exitPair(newtonParser.PairContext ctx) {
        StringBuilder buffer = new StringBuilder();
        String key = ctx.ID().getText();
        buffer.append(key+": ");
        newtonParser.DataContext dctx = ctx.data();
        buffer.append(getValue(dctx));
        setValue(ctx, buffer.toString());
    }

    public void exitObject(newtonParser.ObjectContext ctx) { 
        StringBuilder buffer = new StringBuilder();
        buffer.append("{\n\t");
        for (newtonParser.PairContext ovctx : ctx.pair()) {
            buffer.append(getValue(ovctx));
            buffer.append(",");
            buffer.append("\n\t");
        }
        buffer.append("\n\t}");
        setValue(ctx, buffer.toString());
    }

    public void exitValue(newtonParser.ValueContext ctx) {
        newtonParser.DataContext dctx = ctx.data();
        setValue(ctx, getValue(ctx.data()));
    }

    public void exitArray(newtonParser.ArrayContext ctx) { 
        StringBuilder buffer = new StringBuilder();
        buffer.append("[");
        for(newtonParser.ValueContext vctx : ctx.value()) {
            buffer.append(getValue(vctx));
            buffer.append(",");
        }
        buffer.append(" ]");
        setValue(ctx, buffer.toString());
    }

    public void exitStructures(newtonParser.StructuresContext ctx) { 
        setValue(ctx, getValue(ctx.getChild(0)));
    }

    public void exitFile(newtonParser.FileContext ctx) { 
        setValue(ctx, getValue(ctx.getChild(0)));
    }


}