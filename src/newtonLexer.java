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
		DASH=1, COLON=2, CLOSED_PAR=3, COMMENT=4, ID=5, NUMBER=6, REAL=7, HEX=8, 
		OCTAL=9, NL=10, WS=11;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"DASH", "COLON", "CLOSED_PAR", "COMMENT", "ID", "NUMBER", "REAL", "HEX", 
		"OCTAL", "NL", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'-'", "': '", "'{}'", null, null, null, null, null, null, null, 
		"' '"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "DASH", "COLON", "CLOSED_PAR", "COMMENT", "ID", "NUMBER", "REAL", 
		"HEX", "OCTAL", "NL", "WS"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\rd\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\7\5$\n\5\f\5\16\5"+
		"\'\13\5\3\5\3\5\3\5\3\5\3\6\6\6.\n\6\r\6\16\6/\3\7\3\7\3\7\5\7\65\n\7"+
		"\3\b\6\b8\n\b\r\b\16\b9\3\b\3\b\6\b>\n\b\r\b\16\b?\7\bB\n\b\f\b\16\bE"+
		"\13\b\3\t\3\t\3\t\3\t\6\tK\n\t\r\t\16\tL\3\n\3\n\3\n\3\n\6\nS\n\n\r\n"+
		"\16\nT\3\13\5\13X\n\13\3\13\3\13\7\13\\\n\13\f\13\16\13_\13\13\3\f\3\f"+
		"\3\f\3\f\3%\2\r\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\3\2"+
		"\6\7\2\"\"))C\\aac|\3\2\62;\5\2\62;CHch\3\2\629n\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\3\31\3\2\2\2\5\33\3\2"+
		"\2\2\7\36\3\2\2\2\t!\3\2\2\2\13-\3\2\2\2\r\64\3\2\2\2\17\67\3\2\2\2\21"+
		"F\3\2\2\2\23N\3\2\2\2\25W\3\2\2\2\27`\3\2\2\2\31\32\7/\2\2\32\4\3\2\2"+
		"\2\33\34\7<\2\2\34\35\7\"\2\2\35\6\3\2\2\2\36\37\7}\2\2\37 \7\177\2\2"+
		" \b\3\2\2\2!%\7%\2\2\"$\13\2\2\2#\"\3\2\2\2$\'\3\2\2\2%&\3\2\2\2%#\3\2"+
		"\2\2&(\3\2\2\2\'%\3\2\2\2()\5\25\13\2)*\3\2\2\2*+\b\5\2\2+\n\3\2\2\2,"+
		".\t\2\2\2-,\3\2\2\2./\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\f\3\2\2\2\61\65"+
		"\5\17\b\2\62\65\5\21\t\2\63\65\5\23\n\2\64\61\3\2\2\2\64\62\3\2\2\2\64"+
		"\63\3\2\2\2\65\16\3\2\2\2\668\t\3\2\2\67\66\3\2\2\289\3\2\2\29\67\3\2"+
		"\2\29:\3\2\2\2:C\3\2\2\2;=\7\60\2\2<>\t\3\2\2=<\3\2\2\2>?\3\2\2\2?=\3"+
		"\2\2\2?@\3\2\2\2@B\3\2\2\2A;\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2D\20"+
		"\3\2\2\2EC\3\2\2\2FG\7\62\2\2GH\7z\2\2HJ\3\2\2\2IK\t\4\2\2JI\3\2\2\2K"+
		"L\3\2\2\2LJ\3\2\2\2LM\3\2\2\2M\22\3\2\2\2NO\7\62\2\2OP\7e\2\2PR\3\2\2"+
		"\2QS\t\5\2\2RQ\3\2\2\2ST\3\2\2\2TR\3\2\2\2TU\3\2\2\2U\24\3\2\2\2VX\7\17"+
		"\2\2WV\3\2\2\2WX\3\2\2\2XY\3\2\2\2Y]\7\f\2\2Z\\\7\13\2\2[Z\3\2\2\2\\_"+
		"\3\2\2\2][\3\2\2\2]^\3\2\2\2^\26\3\2\2\2_]\3\2\2\2`a\7\"\2\2ab\3\2\2\2"+
		"bc\b\f\2\2c\30\3\2\2\2\r\2%/\649?CLTW]\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}