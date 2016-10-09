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

    public void enterString(newtonParser.StringContext ctx) {
        setValue(ctx, ctx.ID().getText());
    }

    public void enterNumericValue(newtonParser.NumericValueContext ctx) { 
        setValue(ctx, ctx.NUMBER().getText());
    }

    public void enterBooleanValue(newtonParser.BooleanValueContext ctx) { 
        setValue(ctx, ctx.BOOLEAN().getText());
    }

    public void exitObjectValue(newtonParser.ObjectValueContext ctx) { 
        StringBuilder buffer = new StringBuilder();
        String key = ctx.ID().getText();
        buffer.append(key);
        buffer.append(": ");
        newtonParser.DataContext dctx = ctx.data();
        String value = getValue(dctx);
        buffer.append(value);
        setValue(ctx, buffer.toString());
    }

    public void exitArrayInObject(newtonParser.ArrayInObjectContext ctx) { 
        StringBuilder buffer = new StringBuilder();
        buffer.append("\n");
        buffer.append(ctx.ID().getText());
        buffer.append(": ");
        newtonParser.ArrayContext actx = ctx.array();
        buffer.append(getValue(actx));
        System.out.println(buffer.toString());
        setValue(ctx, buffer.toString());
    }

    public void exitEmptyObject(newtonParser.EmptyObjectContext ctx) { 
        StringBuilder buffer = new StringBuilder();
        buffer.append("\n\t");
        String key = ctx.ID().getText();
        buffer.append(key);
        buffer.append(": {}");
        setValue(ctx, buffer.toString());
    }

    public void exitNestedObject(newtonParser.NestedObjectContext ctx) { 
        StringBuilder buffer = new StringBuilder();
        buffer.append("{\n\t");
        String key = ctx.ID().getText();
        buffer.append(key+": ");
        newtonParser.ObjectContext objctx  = ctx.object();
        buffer.append(getValue(objctx));
        buffer.append("\n}");
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

    public void exitArrayValue(newtonParser.ArrayValueContext ctx) { 
        newtonParser.DataContext dctx = ctx.data();
        String value = getValue(dctx);
        setValue(ctx, value);
    }

    public void exitObjectInArray(newtonParser.ObjectInArrayContext ctx) { 
        StringBuilder buffer = new StringBuilder();
        buffer.append("\n\t");
        newtonParser.ObjectContext objctx = ctx.object();
        buffer.append(getValue(objctx));
        buffer.append("\n");
        setValue(ctx, buffer.toString());
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