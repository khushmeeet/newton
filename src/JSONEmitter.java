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

    public void exitString(newtonParser.StringContext ctx) {
        setValue(ctx, ctx.getText());
    }

    public void exitNumericValue(newtonParser.NumericValueContext ctx) {
        setValue(ctx, ctx.getText());
    }

    public void exitBoolValue(newtonParser.BoolValueContext ctx) {
        setValue(ctx, ctx.getText());
    }

    public void exitNullValue(newtonParser.NullValueContext ctx) {
        setValue(ctx, ctx.getText());
    }

    public void exitObjectValue(newtonParser.ObjectValueContext ctx) {
        String key = "'"+ctx.ID().getText()+"'";
        newtonParser.DataContext datactx = ctx.data();
        String value = "'"+getValue(datactx)+"'";
        String pair = key+":"+value;
        setValue(ctx, pair);
    }

    public void exitArrayInObject(newtonParser.ArrayInObjectContext ctx) {
        StringBuilder buffer = new StringBuilder();
        buffer.append("\n");
        String key = "'"+ctx.ID().getText()+"'";
        buffer.append(key);
        buffer.append(": [");
        for(newtonParser.ArrayContext arrayctx: ctx.array()) {
            buffer.append("'");
            buffer.append(getValue(arrayctx));
            buffer.append("',");
        }
        buffer.append("]");
        setValue(ctx, buffer.toString());
    }

    public void exitEmptyObject(newtonParser.EmptyObjectContext ctx) {
        StringBuilder buffer = new StringBuilder();
        buffer.append("\n");
        String key = "'"+ctx.ID().getText()+"'";
        buffer.append("'"+key+"'"+":"+"{}");
        setValue(ctx, buffer.toString()); 
    }

    // public void exitNestedObject(newtonParser.NestedObjectContext ctx) {
    //     StringBuilder buffer = new StringBuilder();
    //     buffer.append("\n");
    //     for(newtonParser.ObjectContext objctx: ctx.object()) {
    //         buffer.append(getValue(objctx));
    //     }
    //     setValue(ctx, buffer.toString());
    // }





}