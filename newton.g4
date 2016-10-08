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
      return fluxLexer.super.nextToken();
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

array       : '-' ( ID | INT ) NL
            ;

object      : pair ( INDENT? pair DEDENT? )*
            ;

pair        : ID ':' ID NL
            ;

COMMENT     : '#' .*?   -> skip
            ;

ID          : [a-zA-Z]+
            ;

INT         :
            ;

NL          : ('\r'?'\n''\t'*)
            ;