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
		DASH=1, COLON=2, CLOSED_PAR=3, BOOLEAN=4, ID=5, NUMBER=6, REAL=7, HEX=8, 
		OCTAL=9, NL=10, COMMENT=11, WS=12;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"DASH", "COLON", "CLOSED_PAR", "BOOLEAN", "ID", "NUMBER", "REAL", "HEX", 
		"OCTAL", "NL", "COMMENT", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'-'", "': '", "'{}'", null, null, null, null, null, null, null, 
		null, "' '"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "DASH", "COLON", "CLOSED_PAR", "BOOLEAN", "ID", "NUMBER", "REAL", 
		"HEX", "OCTAL", "NL", "COMMENT", "WS"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\16r\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\5\5-\n\5\3\6\6\6\60\n\6\r\6\16\6\61\3\7\3\7\3\7\5\7"+
		"\67\n\7\3\b\5\b:\n\b\3\b\6\b=\n\b\r\b\16\b>\3\b\3\b\6\bC\n\b\r\b\16\b"+
		"D\7\bG\n\b\f\b\16\bJ\13\b\3\t\3\t\3\t\3\t\6\tP\n\t\r\t\16\tQ\3\n\3\n\3"+
		"\n\3\n\6\nX\n\n\r\n\16\nY\3\13\5\13]\n\13\3\13\3\13\7\13a\n\13\f\13\16"+
		"\13d\13\13\3\f\3\f\7\fh\n\f\f\f\16\fk\13\f\3\f\3\f\3\r\3\r\3\r\3\r\2\2"+
		"\16\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\3\2\7\13"+
		"\2\"#&),,\60\60\62;A\\`ac|\u0080\u0080\3\2\62;\5\2\62;CHch\3\2\629\4\2"+
		"\f\f\17\17~\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\3\33\3\2\2\2\5\35\3\2\2\2\7 \3\2\2\2\t,\3\2\2\2"+
		"\13/\3\2\2\2\r\66\3\2\2\2\179\3\2\2\2\21K\3\2\2\2\23S\3\2\2\2\25\\\3\2"+
		"\2\2\27e\3\2\2\2\31n\3\2\2\2\33\34\7/\2\2\34\4\3\2\2\2\35\36\7<\2\2\36"+
		"\37\7\"\2\2\37\6\3\2\2\2 !\7}\2\2!\"\7\177\2\2\"\b\3\2\2\2#$\7v\2\2$%"+
		"\7t\2\2%&\7w\2\2&-\7g\2\2\'(\7h\2\2()\7c\2\2)*\7n\2\2*+\7u\2\2+-\7g\2"+
		"\2,#\3\2\2\2,\'\3\2\2\2-\n\3\2\2\2.\60\t\2\2\2/.\3\2\2\2\60\61\3\2\2\2"+
		"\61/\3\2\2\2\61\62\3\2\2\2\62\f\3\2\2\2\63\67\5\17\b\2\64\67\5\21\t\2"+
		"\65\67\5\23\n\2\66\63\3\2\2\2\66\64\3\2\2\2\66\65\3\2\2\2\67\16\3\2\2"+
		"\28:\5\3\2\298\3\2\2\29:\3\2\2\2:<\3\2\2\2;=\t\3\2\2<;\3\2\2\2=>\3\2\2"+
		"\2><\3\2\2\2>?\3\2\2\2?H\3\2\2\2@B\7\60\2\2AC\t\3\2\2BA\3\2\2\2CD\3\2"+
		"\2\2DB\3\2\2\2DE\3\2\2\2EG\3\2\2\2F@\3\2\2\2GJ\3\2\2\2HF\3\2\2\2HI\3\2"+
		"\2\2I\20\3\2\2\2JH\3\2\2\2KL\7\62\2\2LM\7z\2\2MO\3\2\2\2NP\t\4\2\2ON\3"+
		"\2\2\2PQ\3\2\2\2QO\3\2\2\2QR\3\2\2\2R\22\3\2\2\2ST\7\62\2\2TU\7e\2\2U"+
		"W\3\2\2\2VX\t\5\2\2WV\3\2\2\2XY\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\24\3\2\2"+
		"\2[]\7\17\2\2\\[\3\2\2\2\\]\3\2\2\2]^\3\2\2\2^b\7\f\2\2_a\7\"\2\2`_\3"+
		"\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2c\26\3\2\2\2db\3\2\2\2ei\7%\2\2fh"+
		"\n\6\2\2gf\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2jl\3\2\2\2ki\3\2\2\2l"+
		"m\b\f\2\2m\30\3\2\2\2no\7\"\2\2op\3\2\2\2pq\b\r\2\2q\32\3\2\2\2\17\2,"+
		"\61\669>DHQY\\bi\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}