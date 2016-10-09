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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\16o\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\5\5-\n\5\3\6\6\6\60\n\6\r\6\16\6\61\3\7\3\7\3\7\5\7"+
		"\67\n\7\3\b\6\b:\n\b\r\b\16\b;\3\b\3\b\6\b@\n\b\r\b\16\bA\7\bD\n\b\f\b"+
		"\16\bG\13\b\3\t\3\t\3\t\3\t\6\tM\n\t\r\t\16\tN\3\n\3\n\3\n\3\n\6\nU\n"+
		"\n\r\n\16\nV\3\13\5\13Z\n\13\3\13\3\13\7\13^\n\13\f\13\16\13a\13\13\3"+
		"\f\3\f\7\fe\n\f\f\f\16\fh\13\f\3\f\3\f\3\r\3\r\3\r\3\r\2\2\16\3\3\5\4"+
		"\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\3\2\7\13\2\"#&),,\60"+
		"\60\62;A\\`ac|\u0080\u0080\3\2\62;\5\2\62;CHch\3\2\629\4\2\f\f\17\17z"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\3\33\3\2\2\2\5\35\3\2\2\2\7 \3\2\2\2\t,\3\2\2\2\13/\3\2"+
		"\2\2\r\66\3\2\2\2\179\3\2\2\2\21H\3\2\2\2\23P\3\2\2\2\25Y\3\2\2\2\27b"+
		"\3\2\2\2\31k\3\2\2\2\33\34\7/\2\2\34\4\3\2\2\2\35\36\7<\2\2\36\37\7\""+
		"\2\2\37\6\3\2\2\2 !\7}\2\2!\"\7\177\2\2\"\b\3\2\2\2#$\7v\2\2$%\7t\2\2"+
		"%&\7w\2\2&-\7g\2\2\'(\7h\2\2()\7c\2\2)*\7n\2\2*+\7u\2\2+-\7g\2\2,#\3\2"+
		"\2\2,\'\3\2\2\2-\n\3\2\2\2.\60\t\2\2\2/.\3\2\2\2\60\61\3\2\2\2\61/\3\2"+
		"\2\2\61\62\3\2\2\2\62\f\3\2\2\2\63\67\5\17\b\2\64\67\5\21\t\2\65\67\5"+
		"\23\n\2\66\63\3\2\2\2\66\64\3\2\2\2\66\65\3\2\2\2\67\16\3\2\2\28:\t\3"+
		"\2\298\3\2\2\2:;\3\2\2\2;9\3\2\2\2;<\3\2\2\2<E\3\2\2\2=?\7\60\2\2>@\t"+
		"\3\2\2?>\3\2\2\2@A\3\2\2\2A?\3\2\2\2AB\3\2\2\2BD\3\2\2\2C=\3\2\2\2DG\3"+
		"\2\2\2EC\3\2\2\2EF\3\2\2\2F\20\3\2\2\2GE\3\2\2\2HI\7\62\2\2IJ\7z\2\2J"+
		"L\3\2\2\2KM\t\4\2\2LK\3\2\2\2MN\3\2\2\2NL\3\2\2\2NO\3\2\2\2O\22\3\2\2"+
		"\2PQ\7\62\2\2QR\7e\2\2RT\3\2\2\2SU\t\5\2\2TS\3\2\2\2UV\3\2\2\2VT\3\2\2"+
		"\2VW\3\2\2\2W\24\3\2\2\2XZ\7\17\2\2YX\3\2\2\2YZ\3\2\2\2Z[\3\2\2\2[_\7"+
		"\f\2\2\\^\7\13\2\2]\\\3\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`\26\3\2\2"+
		"\2a_\3\2\2\2bf\7%\2\2ce\n\6\2\2dc\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2"+
		"\2gi\3\2\2\2hf\3\2\2\2ij\b\f\2\2j\30\3\2\2\2kl\7\"\2\2lm\3\2\2\2mn\b\r"+
		"\2\2n\32\3\2\2\2\16\2,\61\66;AENVY_f\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}