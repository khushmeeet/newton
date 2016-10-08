// Generated from newton.g4 by ANTLR 4.5.3

  import com.yuvalshavit.antlr4.DenterHelper;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class newtonLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, DASH=2, COLON=3, CLOSED_PAR=4, ID=5, NUMBER=6, BOOLEAN=7, REAL=8, 
		HEX=9, OCTAL=10, NL=11, COMMENT=12, WS=13;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "DASH", "COLON", "CLOSED_PAR", "ID", "NUMBER", "BOOLEAN", "REAL", 
		"HEX", "OCTAL", "NL", "COMMENT", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'null'", "'-'", "': '", "'{}'", null, null, null, null, null, null, 
		null, null, "' '"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "DASH", "COLON", "CLOSED_PAR", "ID", "NUMBER", "BOOLEAN", 
		"REAL", "HEX", "OCTAL", "NL", "COMMENT", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


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


	public newtonLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "newton.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\17v\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4"+
		"\3\5\3\5\3\5\3\6\6\6,\n\6\r\6\16\6-\3\7\3\7\3\7\5\7\63\n\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\5\b>\n\b\3\t\6\tA\n\t\r\t\16\tB\3\t\3\t\6\tG"+
		"\n\t\r\t\16\tH\7\tK\n\t\f\t\16\tN\13\t\3\n\3\n\3\n\3\n\6\nT\n\n\r\n\16"+
		"\nU\3\13\3\13\3\13\3\13\6\13\\\n\13\r\13\16\13]\3\f\5\fa\n\f\3\f\3\f\7"+
		"\fe\n\f\f\f\16\fh\13\f\3\r\3\r\7\rl\n\r\f\r\16\ro\13\r\3\r\3\r\3\16\3"+
		"\16\3\16\3\16\2\2\17\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\3\2\7\t\2\"#&&(-\60>@\\^^a\u0080\3\2\62;\5\2\62;CHch\3"+
		"\2\629\4\2\f\f\17\17\u0081\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\3\35\3\2\2\2\5\"\3"+
		"\2\2\2\7$\3\2\2\2\t\'\3\2\2\2\13+\3\2\2\2\r\62\3\2\2\2\17=\3\2\2\2\21"+
		"@\3\2\2\2\23O\3\2\2\2\25W\3\2\2\2\27`\3\2\2\2\31i\3\2\2\2\33r\3\2\2\2"+
		"\35\36\7p\2\2\36\37\7w\2\2\37 \7n\2\2 !\7n\2\2!\4\3\2\2\2\"#\7/\2\2#\6"+
		"\3\2\2\2$%\7<\2\2%&\7\"\2\2&\b\3\2\2\2\'(\7}\2\2()\7\177\2\2)\n\3\2\2"+
		"\2*,\t\2\2\2+*\3\2\2\2,-\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\f\3\2\2\2/\63\5"+
		"\21\t\2\60\63\5\23\n\2\61\63\5\25\13\2\62/\3\2\2\2\62\60\3\2\2\2\62\61"+
		"\3\2\2\2\63\16\3\2\2\2\64\65\7v\2\2\65\66\7t\2\2\66\67\7w\2\2\67>\7g\2"+
		"\289\7h\2\29:\7c\2\2:;\7n\2\2;<\7u\2\2<>\7g\2\2=\64\3\2\2\2=8\3\2\2\2"+
		">\20\3\2\2\2?A\t\3\2\2@?\3\2\2\2AB\3\2\2\2B@\3\2\2\2BC\3\2\2\2CL\3\2\2"+
		"\2DF\7\60\2\2EG\t\3\2\2FE\3\2\2\2GH\3\2\2\2HF\3\2\2\2HI\3\2\2\2IK\3\2"+
		"\2\2JD\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2M\22\3\2\2\2NL\3\2\2\2OP\7"+
		"\62\2\2PQ\7z\2\2QS\3\2\2\2RT\t\4\2\2SR\3\2\2\2TU\3\2\2\2US\3\2\2\2UV\3"+
		"\2\2\2V\24\3\2\2\2WX\7\62\2\2XY\7e\2\2Y[\3\2\2\2Z\\\t\5\2\2[Z\3\2\2\2"+
		"\\]\3\2\2\2][\3\2\2\2]^\3\2\2\2^\26\3\2\2\2_a\7\17\2\2`_\3\2\2\2`a\3\2"+
		"\2\2ab\3\2\2\2bf\7\f\2\2ce\7\13\2\2dc\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3"+
		"\2\2\2g\30\3\2\2\2hf\3\2\2\2im\7%\2\2jl\n\6\2\2kj\3\2\2\2lo\3\2\2\2mk"+
		"\3\2\2\2mn\3\2\2\2np\3\2\2\2om\3\2\2\2pq\b\r\2\2q\32\3\2\2\2rs\7\"\2\2"+
		"st\3\2\2\2tu\b\16\2\2u\34\3\2\2\2\16\2-\62=BHLU]`fm\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}