// Generated from newton.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class newtonParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, DASH=2, COLON=3, CLOSED_PAR=4, COMMENT=5, ID=6, NUMBER=7, BOOLEAN=8, 
		REAL=9, HEX=10, OCTAL=11, NL=12, WS=13, INDENT=14, DEDENT=15;
	public static final int
		RULE_file = 0, RULE_structures = 1, RULE_array = 2, RULE_value = 3, RULE_object = 4, 
		RULE_pair = 5, RULE_data = 6;
	public static final String[] ruleNames = {
		"file", "structures", "array", "value", "object", "pair", "data"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'null'", "'-'", "': '", "'{}'", null, null, null, null, null, null, 
		null, null, "' '"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "DASH", "COLON", "CLOSED_PAR", "COMMENT", "ID", "NUMBER", 
		"BOOLEAN", "REAL", "HEX", "OCTAL", "NL", "WS", "INDENT", "DEDENT"
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

	@Override
	public String getGrammarFileName() { return "newton.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public newtonParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class FileContext extends ParserRuleContext {
		public StructuresContext structures() {
			return getRuleContext(StructuresContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(newtonParser.COMMENT, 0); }
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof newtonListener ) ((newtonListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof newtonListener ) ((newtonListener)listener).exitFile(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		try {
			setState(16);
			switch (_input.LA(1)) {
			case DASH:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(14);
				structures();
				}
				break;
			case COMMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(15);
				match(COMMENT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructuresContext extends ParserRuleContext {
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public StructuresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structures; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof newtonListener ) ((newtonListener)listener).enterStructures(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof newtonListener ) ((newtonListener)listener).exitStructures(this);
		}
	}

	public final StructuresContext structures() throws RecognitionException {
		StructuresContext _localctx = new StructuresContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_structures);
		try {
			setState(20);
			switch (_input.LA(1)) {
			case DASH:
				enterOuterAlt(_localctx, 1);
				{
				setState(18);
				array();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(19);
				object();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayContext extends ParserRuleContext {
		public List<TerminalNode> DASH() { return getTokens(newtonParser.DASH); }
		public TerminalNode DASH(int i) {
			return getToken(newtonParser.DASH, i);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof newtonListener ) ((newtonListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof newtonListener ) ((newtonListener)listener).exitArray(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_array);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(24); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(22);
					match(DASH);
					setState(23);
					value();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(26); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	 
		public ValueContext() { }
		public void copyFrom(ValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ObjectInArrayContext extends ValueContext {
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public ObjectInArrayContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof newtonListener ) ((newtonListener)listener).enterObjectInArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof newtonListener ) ((newtonListener)listener).exitObjectInArray(this);
		}
	}
	public static class ArrayValueContext extends ValueContext {
		public DataContext data() {
			return getRuleContext(DataContext.class,0);
		}
		public TerminalNode NL() { return getToken(newtonParser.NL, 0); }
		public ArrayValueContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof newtonListener ) ((newtonListener)listener).enterArrayValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof newtonListener ) ((newtonListener)listener).exitArrayValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_value);
		try {
			setState(32);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new ArrayValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(28);
				data();
				setState(29);
				match(NL);
				}
				break;
			case 2:
				_localctx = new ObjectInArrayContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(31);
				object();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjectContext extends ParserRuleContext {
		public List<PairContext> pair() {
			return getRuleContexts(PairContext.class);
		}
		public PairContext pair(int i) {
			return getRuleContext(PairContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(newtonParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(newtonParser.NL, i);
		}
		public ObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof newtonListener ) ((newtonListener)listener).enterObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof newtonListener ) ((newtonListener)listener).exitObject(this);
		}
	}

	public final ObjectContext object() throws RecognitionException {
		ObjectContext _localctx = new ObjectContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_object);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(38); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(34);
					pair();
					setState(36);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						setState(35);
						match(NL);
						}
						break;
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(40); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PairContext extends ParserRuleContext {
		public PairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pair; }
	 
		public PairContext() { }
		public void copyFrom(PairContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArrayInObjectContext extends PairContext {
		public TerminalNode ID() { return getToken(newtonParser.ID, 0); }
		public TerminalNode COLON() { return getToken(newtonParser.COLON, 0); }
		public TerminalNode INDENT() { return getToken(newtonParser.INDENT, 0); }
		public List<ArrayContext> array() {
			return getRuleContexts(ArrayContext.class);
		}
		public ArrayContext array(int i) {
			return getRuleContext(ArrayContext.class,i);
		}
		public TerminalNode DEDENT() { return getToken(newtonParser.DEDENT, 0); }
		public ArrayInObjectContext(PairContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof newtonListener ) ((newtonListener)listener).enterArrayInObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof newtonListener ) ((newtonListener)listener).exitArrayInObject(this);
		}
	}
	public static class NestedObjectContext extends PairContext {
		public TerminalNode ID() { return getToken(newtonParser.ID, 0); }
		public TerminalNode COLON() { return getToken(newtonParser.COLON, 0); }
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public TerminalNode INDENT() { return getToken(newtonParser.INDENT, 0); }
		public TerminalNode DEDENT() { return getToken(newtonParser.DEDENT, 0); }
		public NestedObjectContext(PairContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof newtonListener ) ((newtonListener)listener).enterNestedObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof newtonListener ) ((newtonListener)listener).exitNestedObject(this);
		}
	}
	public static class ObjectValueContext extends PairContext {
		public TerminalNode ID() { return getToken(newtonParser.ID, 0); }
		public TerminalNode COLON() { return getToken(newtonParser.COLON, 0); }
		public DataContext data() {
			return getRuleContext(DataContext.class,0);
		}
		public ObjectValueContext(PairContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof newtonListener ) ((newtonListener)listener).enterObjectValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof newtonListener ) ((newtonListener)listener).exitObjectValue(this);
		}
	}
	public static class EmptyObjectContext extends PairContext {
		public TerminalNode ID() { return getToken(newtonParser.ID, 0); }
		public TerminalNode COLON() { return getToken(newtonParser.COLON, 0); }
		public TerminalNode CLOSED_PAR() { return getToken(newtonParser.CLOSED_PAR, 0); }
		public EmptyObjectContext(PairContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof newtonListener ) ((newtonListener)listener).enterEmptyObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof newtonListener ) ((newtonListener)listener).exitEmptyObject(this);
		}
	}

	public final PairContext pair() throws RecognitionException {
		PairContext _localctx = new PairContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_pair);
		int _la;
		try {
			int _alt;
			setState(70);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new ObjectValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				match(ID);
				setState(43);
				match(COLON);
				setState(44);
				data();
				}
				break;
			case 2:
				_localctx = new ArrayInObjectContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(45);
				match(ID);
				setState(46);
				match(COLON);
				setState(48);
				_la = _input.LA(1);
				if (_la==INDENT) {
					{
					setState(47);
					match(INDENT);
					}
				}

				setState(51); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(50);
						array();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(53); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(56);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(55);
					match(DEDENT);
					}
					break;
				}
				}
				break;
			case 3:
				_localctx = new EmptyObjectContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(58);
				match(ID);
				setState(59);
				match(COLON);
				setState(60);
				match(CLOSED_PAR);
				}
				break;
			case 4:
				_localctx = new NestedObjectContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(61);
				match(ID);
				setState(62);
				match(COLON);
				setState(64);
				_la = _input.LA(1);
				if (_la==INDENT) {
					{
					setState(63);
					match(INDENT);
					}
				}

				setState(66);
				object();
				setState(68);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(67);
					match(DEDENT);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataContext extends ParserRuleContext {
		public DataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data; }
	 
		public DataContext() { }
		public void copyFrom(DataContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NullValueContext extends DataContext {
		public NullValueContext(DataContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof newtonListener ) ((newtonListener)listener).enterNullValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof newtonListener ) ((newtonListener)listener).exitNullValue(this);
		}
	}
	public static class BoolValueContext extends DataContext {
		public TerminalNode BOOLEAN() { return getToken(newtonParser.BOOLEAN, 0); }
		public BoolValueContext(DataContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof newtonListener ) ((newtonListener)listener).enterBoolValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof newtonListener ) ((newtonListener)listener).exitBoolValue(this);
		}
	}
	public static class StringContext extends DataContext {
		public TerminalNode ID() { return getToken(newtonParser.ID, 0); }
		public StringContext(DataContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof newtonListener ) ((newtonListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof newtonListener ) ((newtonListener)listener).exitString(this);
		}
	}
	public static class NumericValueContext extends DataContext {
		public TerminalNode NUMBER() { return getToken(newtonParser.NUMBER, 0); }
		public NumericValueContext(DataContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof newtonListener ) ((newtonListener)listener).enterNumericValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof newtonListener ) ((newtonListener)listener).exitNumericValue(this);
		}
	}

	public final DataContext data() throws RecognitionException {
		DataContext _localctx = new DataContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_data);
		try {
			setState(76);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new StringContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				match(ID);
				}
				break;
			case NUMBER:
				_localctx = new NumericValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				match(NUMBER);
				}
				break;
			case BOOLEAN:
				_localctx = new BoolValueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(74);
				match(BOOLEAN);
				}
				break;
			case T__0:
				_localctx = new NullValueContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(75);
				match(T__0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\21Q\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\5\2\23\n\2\3\3\3\3"+
		"\5\3\27\n\3\3\4\3\4\6\4\33\n\4\r\4\16\4\34\3\5\3\5\3\5\3\5\5\5#\n\5\3"+
		"\6\3\6\5\6\'\n\6\6\6)\n\6\r\6\16\6*\3\7\3\7\3\7\3\7\3\7\3\7\5\7\63\n\7"+
		"\3\7\6\7\66\n\7\r\7\16\7\67\3\7\5\7;\n\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7C"+
		"\n\7\3\7\3\7\5\7G\n\7\5\7I\n\7\3\b\3\b\3\b\3\b\5\bO\n\b\3\b\2\2\t\2\4"+
		"\6\b\n\f\16\2\2Z\2\22\3\2\2\2\4\26\3\2\2\2\6\32\3\2\2\2\b\"\3\2\2\2\n"+
		"(\3\2\2\2\fH\3\2\2\2\16N\3\2\2\2\20\23\5\4\3\2\21\23\7\7\2\2\22\20\3\2"+
		"\2\2\22\21\3\2\2\2\23\3\3\2\2\2\24\27\5\6\4\2\25\27\5\n\6\2\26\24\3\2"+
		"\2\2\26\25\3\2\2\2\27\5\3\2\2\2\30\31\7\4\2\2\31\33\5\b\5\2\32\30\3\2"+
		"\2\2\33\34\3\2\2\2\34\32\3\2\2\2\34\35\3\2\2\2\35\7\3\2\2\2\36\37\5\16"+
		"\b\2\37 \7\16\2\2 #\3\2\2\2!#\5\n\6\2\"\36\3\2\2\2\"!\3\2\2\2#\t\3\2\2"+
		"\2$&\5\f\7\2%\'\7\16\2\2&%\3\2\2\2&\'\3\2\2\2\')\3\2\2\2($\3\2\2\2)*\3"+
		"\2\2\2*(\3\2\2\2*+\3\2\2\2+\13\3\2\2\2,-\7\b\2\2-.\7\5\2\2.I\5\16\b\2"+
		"/\60\7\b\2\2\60\62\7\5\2\2\61\63\7\20\2\2\62\61\3\2\2\2\62\63\3\2\2\2"+
		"\63\65\3\2\2\2\64\66\5\6\4\2\65\64\3\2\2\2\66\67\3\2\2\2\67\65\3\2\2\2"+
		"\678\3\2\2\28:\3\2\2\29;\7\21\2\2:9\3\2\2\2:;\3\2\2\2;I\3\2\2\2<=\7\b"+
		"\2\2=>\7\5\2\2>I\7\6\2\2?@\7\b\2\2@B\7\5\2\2AC\7\20\2\2BA\3\2\2\2BC\3"+
		"\2\2\2CD\3\2\2\2DF\5\n\6\2EG\7\21\2\2FE\3\2\2\2FG\3\2\2\2GI\3\2\2\2H,"+
		"\3\2\2\2H/\3\2\2\2H<\3\2\2\2H?\3\2\2\2I\r\3\2\2\2JO\7\b\2\2KO\7\t\2\2"+
		"LO\7\n\2\2MO\7\3\2\2NJ\3\2\2\2NK\3\2\2\2NL\3\2\2\2NM\3\2\2\2O\17\3\2\2"+
		"\2\17\22\26\34\"&*\62\67:BFHN";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}