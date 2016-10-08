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

array       : ( DASH value NL )+
            ;

value       : ( ID | INT )
            | ( object )
            ;

object      : ( pair NL )+
            ;

pair        : ID COLON ( ID | INDENT? array+ DEDENT? | CLOSED_PAR | INDENT? ( pair NL )+ DEDENT? )
            ;

DASH        : '-'
            ;

COLON       : ': '
            ;

CLOSED_PAR  : '{}'
            ;

COMMENT     : '#' .*? NL   -> skip
            ;

ID          : [a-zA-Z]+
            ;

INT         : [0-9]+
            ;

NL          : ('\r'?'\n''\t'*)
            ;

WS          : ' '   -> skip
            ;