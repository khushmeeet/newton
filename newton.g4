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

array       : ( DASH value )+
            ;

value       : data NL                                       # ArrayValue
            | object                                        # ObjectInArray
            ;

object      : ( pair NL? )+
            ;

pair        : ID COLON data NL                              # ObjectValue                
            | ID COLON INDENT? array+ DEDENT?               # ArrayInObject
            | ID COLON CLOSED_PAR                           # EmptyObject
            | ID COLON INDENT? object DEDENT?               # NestedObject
            ;

data        : ID                                            # String
            | NUMBER                                        # NumericValue
            | BOOLEAN                                       # BoolValue
            | 'null'                                        # NullValue 
            ;

DASH        : '-'
            ;

COLON       : ': '
            ;

CLOSED_PAR  : '{}'
            ;

ID          : [a-z_A-Z0-9' '~!@$%*&^?.]+
            ;

NUMBER      : REAL
            | HEX
            | OCTAL
            ;

BOOLEAN     : 'true'
            | 'false'
            ;

REAL        : [0-9]+ ( '.' [0-9]+ )*
            ;

HEX         : '0x' [0-9A-Fa-f]+
            ;

OCTAL       : '0c' [0-7]+
            ;

NL          : ('\r'?'\n''\t'*)
            ;

COMMENT     : '#' ~[\r\n]*   -> skip
            ;

WS          : ' '   -> skip
            ;