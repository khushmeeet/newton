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
            | COMMENT
            ;

structures  : array
            | object
            ;

array       : ( DASH value )+
            ;

value       : ( ID | NUMBER ) NL
            | object
            ;

object      : ( pair NL? )+
            ;

pair        : ID COLON ( ( ID | NUMBER ) | INDENT? array+ DEDENT? | CLOSED_PAR | INDENT? ( object ) DEDENT? )
            ;

DASH        : '-'
            ;

COLON       : ': '
            ;

CLOSED_PAR  : '{}'
            ;

COMMENT     : '#' .*? NL   -> skip
            ;

ID          : [a-z_A-Z' ']+
            ;

NUMBER      : REAL
            | HEX
            | OCTAL
            ;

REAL        : [0-9]+ ( '.' [0-9]+ )*
            ;

HEX         : '0x' [0-9A-Fa-f]+
            ;

OCTAL       : '0c' [0-7]+
            ;

NL          : ('\r'?'\n''\t'*)
            ;

WS          : ' '   -> skip
            ;