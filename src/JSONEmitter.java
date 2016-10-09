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

    public void exitObjectValue(newtonParser.ObjectValueContext ctx) { 
        StringBuilder buffer = new StringBuilder();
        buffer.append("{\n\t");
        String key = ctx.ID().getText();
        buffer.append(key);
        buffer.append(": ");
        newtonParser.DataContext dctx = ctx.data();
        String value = getValue(dctx);
        buffer.append(value);
        buffer.append("\n}");
        setValue(ctx, buffer.toString());
    }
}