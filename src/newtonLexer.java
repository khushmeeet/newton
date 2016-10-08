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
		T__0=1, DASH=2, COLON=3, CLOSED_PAR=4, COMMENT=5, ID=6, NUMBER=7, BOOLEAN=8, 
		REAL=9, HEX=10, OCTAL=11, NL=12, WS=13;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "DASH", "COLON", "CLOSED_PAR", "COMMENT", "ID", "NUMBER", "BOOLEAN", 
		"REAL", "HEX", "OCTAL", "NL", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'null'", "'-'", "': '", "'{}'", null, null, null, null, null, null, 
		null, null, "' '"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "DASH", "COLON", "CLOSED_PAR", "COMMENT", "ID", "NUMBER", 
		"BOOLEAN", "REAL", "HEX", "OCTAL", "NL", "WS"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\17x\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4"+
		"\3\5\3\5\3\5\3\6\3\6\7\6-\n\6\f\6\16\6\60\13\6\3\6\3\6\3\6\3\6\3\7\6\7"+
		"\67\n\7\r\7\16\78\3\b\3\b\3\b\5\b>\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\5\tI\n\t\3\n\6\nL\n\n\r\n\16\nM\3\n\3\n\6\nR\n\n\r\n\16\nS\7\nV\n"+
		"\n\f\n\16\nY\13\n\3\13\3\13\3\13\3\13\6\13_\n\13\r\13\16\13`\3\f\3\f\3"+
		"\f\3\f\6\fg\n\f\r\f\16\fh\3\r\5\rl\n\r\3\r\3\r\7\rp\n\r\f\r\16\rs\13\r"+
		"\3\16\3\16\3\16\3\16\3.\2\17\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\3\2\6\7\2\"\"))C\\aac|\3\2\62;\5\2\62;CHch\3\2"+
		"\629\u0083\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\3\35\3\2\2\2\5\"\3\2\2\2\7$\3\2\2\2"+
		"\t\'\3\2\2\2\13*\3\2\2\2\r\66\3\2\2\2\17=\3\2\2\2\21H\3\2\2\2\23K\3\2"+
		"\2\2\25Z\3\2\2\2\27b\3\2\2\2\31k\3\2\2\2\33t\3\2\2\2\35\36\7p\2\2\36\37"+
		"\7w\2\2\37 \7n\2\2 !\7n\2\2!\4\3\2\2\2\"#\7/\2\2#\6\3\2\2\2$%\7<\2\2%"+
		"&\7\"\2\2&\b\3\2\2\2\'(\7}\2\2()\7\177\2\2)\n\3\2\2\2*.\7%\2\2+-\13\2"+
		"\2\2,+\3\2\2\2-\60\3\2\2\2./\3\2\2\2.,\3\2\2\2/\61\3\2\2\2\60.\3\2\2\2"+
		"\61\62\5\31\r\2\62\63\3\2\2\2\63\64\b\6\2\2\64\f\3\2\2\2\65\67\t\2\2\2"+
		"\66\65\3\2\2\2\678\3\2\2\28\66\3\2\2\289\3\2\2\29\16\3\2\2\2:>\5\23\n"+
		"\2;>\5\25\13\2<>\5\27\f\2=:\3\2\2\2=;\3\2\2\2=<\3\2\2\2>\20\3\2\2\2?@"+
		"\7v\2\2@A\7t\2\2AB\7w\2\2BI\7g\2\2CD\7h\2\2DE\7c\2\2EF\7n\2\2FG\7u\2\2"+
		"GI\7g\2\2H?\3\2\2\2HC\3\2\2\2I\22\3\2\2\2JL\t\3\2\2KJ\3\2\2\2LM\3\2\2"+
		"\2MK\3\2\2\2MN\3\2\2\2NW\3\2\2\2OQ\7\60\2\2PR\t\3\2\2QP\3\2\2\2RS\3\2"+
		"\2\2SQ\3\2\2\2ST\3\2\2\2TV\3\2\2\2UO\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2"+
		"\2\2X\24\3\2\2\2YW\3\2\2\2Z[\7\62\2\2[\\\7z\2\2\\^\3\2\2\2]_\t\4\2\2^"+
		"]\3\2\2\2_`\3\2\2\2`^\3\2\2\2`a\3\2\2\2a\26\3\2\2\2bc\7\62\2\2cd\7e\2"+
		"\2df\3\2\2\2eg\t\5\2\2fe\3\2\2\2gh\3\2\2\2hf\3\2\2\2hi\3\2\2\2i\30\3\2"+
		"\2\2jl\7\17\2\2kj\3\2\2\2kl\3\2\2\2lm\3\2\2\2mq\7\f\2\2np\7\13\2\2on\3"+
		"\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2r\32\3\2\2\2sq\3\2\2\2tu\7\"\2\2u"+
		"v\3\2\2\2vw\b\16\2\2w\34\3\2\2\2\16\2.8=HMSW`hkq\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}