grammar newton;

tokens { INDENT, DEDENT }

@lexer::header {
  import com.yuvalshavit.antlr4.DenterHelper;
}

@lexer::members {
  private final DenterHelper newtonDenter = new DenterHelper(NL, newtonParser.INDENT, newtonParser.DEDENT)

  {
    @Override
    public Token pullToken() {
      return newtonLexer.super.nextToken();
    }
  };

  @Override
  public Token nextToken() {
    return newtonDenter.nextToken();
  }
}

file        : structures                                       
            ;

structures  : array                                         
            | object                                        
            ;

array       : ( DASH value INDENT? DEDENT? )+
            ;

value       : data NL?                                     
            ;

object      : ( pair NL? )+
            ;

pair        : INDENT? ID COLON INDENT? data DEDENT?
            ;

data        : ID                                            # StringValue
            | NUMBER                                        # NumericValue
            | BOOLEAN                                       # BooleanValue
            | object                                        # ObjectValue
            | array                                         # ArrayValue
            | CLOSED_PAR                                    # EmptyObject
            ;

DASH        : '-'
            ;

COLON       : ': '
            ;

CLOSED_PAR  : '{}'
            ;

BOOLEAN     : 'true'
            | 'false'
            ;

ID          : [a-z_A-Z0-9' '~!@$%*&^?.]+ 
            ;

NUMBER      : REAL
            | HEX
            | OCTAL
            ;

REAL        : DASH? [0-9]+ ( '.' [0-9]+ )*
            ;

HEX         : '0x' [0-9A-Fa-f]+
            ;

OCTAL       : '0c' [0-7]+
            ;

NL          : ('\r'? '\n' ' '*)
            ;

COMMENT     : '#' ~[\r\n]*   -> skip
            ;

WS          : ' '   -> skip
            ;