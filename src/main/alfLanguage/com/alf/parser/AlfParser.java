// Generated from java-escape by ANTLR 4.11.1
package com.alf.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class AlfParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, NEWLINE=2, FUNCTION=3, VARIABLE=4, ADD=5, SUB=6, MUL=7, DIV=8, REM=9, 
		INT=10, FLOAT=11, STRING=12, LIST=13, LP=14, RP=15, EQ=16, SEMICOLON=17, 
		LSP=18, RSP=19, COMMA=20, LB=21, RB=22, RETURN=23, INT_NUMBER=24, FLOAT_NUMBER=25, 
		STRING_TEXT=26;
	public static final int
		RULE_start = 0, RULE_statement = 1, RULE_declaration = 2, RULE_type = 3, 
		RULE_value = 4, RULE_expression = 5, RULE_attribution = 6, RULE_list_declaration = 7, 
		RULE_values = 8, RULE_function_declaration = 9, RULE_parameter = 10, RULE_return_function = 11, 
		RULE_function_call = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "statement", "declaration", "type", "value", "expression", "attribution", 
			"list_declaration", "values", "function_declaration", "parameter", "return_function", 
			"function_call"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'function'", null, "'+'", "'-'", "'*'", "'/'", "'%'", 
			"'int'", "'float'", "'string'", "'list'", "'('", "')'", "'='", "';'", 
			"'['", "']'", "','", "'{'", "'}'", "'return'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "NEWLINE", "FUNCTION", "VARIABLE", "ADD", "SUB", "MUL", "DIV", 
			"REM", "INT", "FLOAT", "STRING", "LIST", "LP", "RP", "EQ", "SEMICOLON", 
			"LSP", "RSP", "COMMA", "LB", "RB", "RETURN", "INT_NUMBER", "FLOAT_NUMBER", 
			"STRING_TEXT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AlfParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartContext extends ParserRuleContext {
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
	 
		public StartContext() { }
		public void copyFrom(StartContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultilineProgContext extends StartContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(AlfParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(AlfParser.SEMICOLON, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(AlfParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(AlfParser.NEWLINE, i);
		}
		public MultilineProgContext(StartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlfListener ) ((AlfListener)listener).enterMultilineProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlfListener ) ((AlfListener)listener).exitMultilineProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlfVisitor ) return ((AlfVisitor<? extends T>)visitor).visitMultilineProg(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SinglelineProgContext extends StartContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(AlfParser.SEMICOLON, 0); }
		public SinglelineProgContext(StartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlfListener ) ((AlfListener)listener).enterSinglelineProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlfListener ) ((AlfListener)listener).exitSinglelineProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlfVisitor ) return ((AlfVisitor<? extends T>)visitor).visitSinglelineProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			setState(42);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new MultilineProgContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 117472280L) != 0) {
					{
					{
					setState(26);
					statement();
					setState(27);
					match(SEMICOLON);
					setState(31);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEWLINE) {
						{
						{
						setState(28);
						match(NEWLINE);
						}
						}
						setState(33);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(38);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				_localctx = new SinglelineProgContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				statement();
				setState(40);
				match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionRuleContext extends StatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionRuleContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlfListener ) ((AlfListener)listener).enterExpressionRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlfListener ) ((AlfListener)listener).exitExpressionRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlfVisitor ) return ((AlfVisitor<? extends T>)visitor).visitExpressionRule(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationRuleContext extends StatementContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public DeclarationRuleContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlfListener ) ((AlfListener)listener).enterDeclarationRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlfListener ) ((AlfListener)listener).exitDeclarationRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlfVisitor ) return ((AlfVisitor<? extends T>)visitor).visitDeclarationRule(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallRuleContext extends StatementContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public FunctionCallRuleContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlfListener ) ((AlfListener)listener).enterFunctionCallRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlfListener ) ((AlfListener)listener).exitFunctionCallRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlfVisitor ) return ((AlfVisitor<? extends T>)visitor).visitFunctionCallRule(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionRuleContext extends StatementContext {
		public Function_declarationContext function_declaration() {
			return getRuleContext(Function_declarationContext.class,0);
		}
		public FunctionRuleContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlfListener ) ((AlfListener)listener).enterFunctionRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlfListener ) ((AlfListener)listener).exitFunctionRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlfVisitor ) return ((AlfVisitor<? extends T>)visitor).visitFunctionRule(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ListRuleContext extends StatementContext {
		public List_declarationContext list_declaration() {
			return getRuleContext(List_declarationContext.class,0);
		}
		public ListRuleContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlfListener ) ((AlfListener)listener).enterListRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlfListener ) ((AlfListener)listener).exitListRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlfVisitor ) return ((AlfVisitor<? extends T>)visitor).visitListRule(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AttributionRuleContext extends StatementContext {
		public AttributionContext attribution() {
			return getRuleContext(AttributionContext.class,0);
		}
		public AttributionRuleContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlfListener ) ((AlfListener)listener).enterAttributionRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlfListener ) ((AlfListener)listener).exitAttributionRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlfVisitor ) return ((AlfVisitor<? extends T>)visitor).visitAttributionRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(50);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new DeclarationRuleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(44);
				declaration();
				}
				break;
			case 2:
				_localctx = new ExpressionRuleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(45);
				expression(0);
				}
				break;
			case 3:
				_localctx = new ListRuleContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(46);
				list_declaration();
				}
				break;
			case 4:
				_localctx = new FunctionRuleContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(47);
				function_declaration();
				}
				break;
			case 5:
				_localctx = new AttributionRuleContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(48);
				attribution();
				}
				break;
			case 6:
				_localctx = new FunctionCallRuleContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(49);
				function_call();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationContext extends ParserRuleContext {
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	 
		public DeclarationContext() { }
		public void copyFrom(DeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableFunctionCallContext extends DeclarationContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode VARIABLE() { return getToken(AlfParser.VARIABLE, 0); }
		public TerminalNode EQ() { return getToken(AlfParser.EQ, 0); }
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public VariableFunctionCallContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlfListener ) ((AlfListener)listener).enterVariableFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlfListener ) ((AlfListener)listener).exitVariableFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlfVisitor ) return ((AlfVisitor<? extends T>)visitor).visitVariableFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclarationContext extends DeclarationContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode VARIABLE() { return getToken(AlfParser.VARIABLE, 0); }
		public TerminalNode EQ() { return getToken(AlfParser.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableDeclarationContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlfListener ) ((AlfListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlfListener ) ((AlfListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlfVisitor ) return ((AlfVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaration);
		int _la;
		try {
			setState(63);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new VariableDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				type();
				setState(53);
				match(VARIABLE);
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ) {
					{
					setState(54);
					match(EQ);
					setState(55);
					expression(0);
					}
				}

				}
				break;
			case 2:
				_localctx = new VariableFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(58);
				type();
				setState(59);
				match(VARIABLE);
				setState(60);
				match(EQ);
				setState(61);
				function_call();
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeIntContext extends TypeContext {
		public TerminalNode INT() { return getToken(AlfParser.INT, 0); }
		public TypeIntContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlfListener ) ((AlfListener)listener).enterTypeInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlfListener ) ((AlfListener)listener).exitTypeInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlfVisitor ) return ((AlfVisitor<? extends T>)visitor).visitTypeInt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeFloatContext extends TypeContext {
		public TerminalNode FLOAT() { return getToken(AlfParser.FLOAT, 0); }
		public TypeFloatContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlfListener ) ((AlfListener)listener).enterTypeFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlfListener ) ((AlfListener)listener).exitTypeFloat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlfVisitor ) return ((AlfVisitor<? extends T>)visitor).visitTypeFloat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeStringContext extends TypeContext {
		public TerminalNode STRING() { return getToken(AlfParser.STRING, 0); }
		public TypeStringContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlfListener ) ((AlfListener)listener).enterTypeString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlfListener ) ((AlfListener)listener).exitTypeString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlfVisitor ) return ((AlfVisitor<? extends T>)visitor).visitTypeString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_type);
		try {
			setState(68);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				_localctx = new TypeIntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				match(INT);
				}
				break;
			case FLOAT:
				_localctx = new TypeFloatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(66);
				match(FLOAT);
				}
				break;
			case STRING:
				_localctx = new TypeStringContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(67);
				match(STRING);
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

	@SuppressWarnings("CheckReturnValue")
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
	@SuppressWarnings("CheckReturnValue")
	public static class ValueVariableContext extends ValueContext {
		public TerminalNode VARIABLE() { return getToken(AlfParser.VARIABLE, 0); }
		public ValueVariableContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlfListener ) ((AlfListener)listener).enterValueVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlfListener ) ((AlfListener)listener).exitValueVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlfVisitor ) return ((AlfVisitor<? extends T>)visitor).visitValueVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ValueStringContext extends ValueContext {
		public TerminalNode STRING_TEXT() { return getToken(AlfParser.STRING_TEXT, 0); }
		public ValueStringContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlfListener ) ((AlfListener)listener).enterValueString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlfListener ) ((AlfListener)listener).exitValueString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlfVisitor ) return ((AlfVisitor<? extends T>)visitor).visitValueString(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ValueIntContext extends ValueContext {
		public TerminalNode INT_NUMBER() { return getToken(AlfParser.INT_NUMBER, 0); }
		public ValueIntContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlfListener ) ((AlfListener)listener).enterValueInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlfListener ) ((AlfListener)listener).exitValueInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlfVisitor ) return ((AlfVisitor<? extends T>)visitor).visitValueInt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ValueFloatContext extends ValueContext {
		public TerminalNode FLOAT_NUMBER() { return getToken(AlfParser.FLOAT_NUMBER, 0); }
		public ValueFloatContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlfListener ) ((AlfListener)listener).enterValueFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlfListener ) ((AlfListener)listener).exitValueFloat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlfVisitor ) return ((AlfVisitor<? extends T>)visitor).visitValueFloat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_value);
		try {
			setState(74);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_NUMBER:
				_localctx = new ValueIntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				match(INT_NUMBER);
				}
				break;
			case FLOAT_NUMBER:
				_localctx = new ValueFloatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				match(FLOAT_NUMBER);
				}
				break;
			case STRING_TEXT:
				_localctx = new ValueStringContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(72);
				match(STRING_TEXT);
				}
				break;
			case VARIABLE:
				_localctx = new ValueVariableContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(73);
				match(VARIABLE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionValueContext extends ExpressionContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ExpressionValueContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlfListener ) ((AlfListener)listener).enterExpressionValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlfListener ) ((AlfListener)listener).exitExpressionValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlfVisitor ) return ((AlfVisitor<? extends T>)visitor).visitExpressionValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionMultiplyContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MUL() { return getToken(AlfParser.MUL, 0); }
		public ExpressionMultiplyContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlfListener ) ((AlfListener)listener).enterExpressionMultiply(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlfListener ) ((AlfListener)listener).exitExpressionMultiply(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlfVisitor ) return ((AlfVisitor<? extends T>)visitor).visitExpressionMultiply(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionDivisionContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode DIV() { return getToken(AlfParser.DIV, 0); }
		public ExpressionDivisionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlfListener ) ((AlfListener)listener).enterExpressionDivision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlfListener ) ((AlfListener)listener).exitExpressionDivision(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlfVisitor ) return ((AlfVisitor<? extends T>)visitor).visitExpressionDivision(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionFunctionCallContext extends ExpressionContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public ExpressionFunctionCallContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlfListener ) ((AlfListener)listener).enterExpressionFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlfListener ) ((AlfListener)listener).exitExpressionFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlfVisitor ) return ((AlfVisitor<? extends T>)visitor).visitExpressionFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionSubtractionContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode SUB() { return getToken(AlfParser.SUB, 0); }
		public ExpressionSubtractionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlfListener ) ((AlfListener)listener).enterExpressionSubtraction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlfListener ) ((AlfListener)listener).exitExpressionSubtraction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlfVisitor ) return ((AlfVisitor<? extends T>)visitor).visitExpressionSubtraction(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionRemContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode REM() { return getToken(AlfParser.REM, 0); }
		public ExpressionRemContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlfListener ) ((AlfListener)listener).enterExpressionRem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlfListener ) ((AlfListener)listener).exitExpressionRem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlfVisitor ) return ((AlfVisitor<? extends T>)visitor).visitExpressionRem(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionParanthesisContext extends ExpressionContext {
		public TerminalNode LP() { return getToken(AlfParser.LP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RP() { return getToken(AlfParser.RP, 0); }
		public ExpressionParanthesisContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlfListener ) ((AlfListener)listener).enterExpressionParanthesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlfListener ) ((AlfListener)listener).exitExpressionParanthesis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlfVisitor ) return ((AlfVisitor<? extends T>)visitor).visitExpressionParanthesis(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionAdditionContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ADD() { return getToken(AlfParser.ADD, 0); }
		public ExpressionAdditionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlfListener ) ((AlfListener)listener).enterExpressionAddition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlfListener ) ((AlfListener)listener).exitExpressionAddition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlfVisitor ) return ((AlfVisitor<? extends T>)visitor).visitExpressionAddition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				_localctx = new ExpressionParanthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(77);
				match(LP);
				setState(78);
				expression(0);
				setState(79);
				match(RP);
				}
				break;
			case 2:
				{
				_localctx = new ExpressionValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(81);
				value();
				}
				break;
			case 3:
				{
				_localctx = new ExpressionFunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(82);
				function_call();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(102);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(100);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionMultiplyContext(new ExpressionContext(_parentctx, _parentState));
						((ExpressionMultiplyContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(85);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(86);
						((ExpressionMultiplyContext)_localctx).op = match(MUL);
						setState(87);
						((ExpressionMultiplyContext)_localctx).right = expression(9);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionDivisionContext(new ExpressionContext(_parentctx, _parentState));
						((ExpressionDivisionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(88);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(89);
						((ExpressionDivisionContext)_localctx).op = match(DIV);
						setState(90);
						((ExpressionDivisionContext)_localctx).right = expression(8);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionRemContext(new ExpressionContext(_parentctx, _parentState));
						((ExpressionRemContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(91);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(92);
						((ExpressionRemContext)_localctx).op = match(REM);
						setState(93);
						((ExpressionRemContext)_localctx).right = expression(7);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionAdditionContext(new ExpressionContext(_parentctx, _parentState));
						((ExpressionAdditionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(94);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(95);
						((ExpressionAdditionContext)_localctx).op = match(ADD);
						setState(96);
						((ExpressionAdditionContext)_localctx).right = expression(6);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionSubtractionContext(new ExpressionContext(_parentctx, _parentState));
						((ExpressionSubtractionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(97);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(98);
						((ExpressionSubtractionContext)_localctx).op = match(SUB);
						setState(99);
						((ExpressionSubtractionContext)_localctx).right = expression(5);
						}
						break;
					}
					} 
				}
				setState(104);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AttributionContext extends ParserRuleContext {
		public AttributionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribution; }
	 
		public AttributionContext() { }
		public void copyFrom(AttributionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableAttributionContext extends AttributionContext {
		public TerminalNode VARIABLE() { return getToken(AlfParser.VARIABLE, 0); }
		public TerminalNode EQ() { return getToken(AlfParser.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableAttributionContext(AttributionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlfListener ) ((AlfListener)listener).enterVariableAttribution(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlfListener ) ((AlfListener)listener).exitVariableAttribution(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlfVisitor ) return ((AlfVisitor<? extends T>)visitor).visitVariableAttribution(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributionContext attribution() throws RecognitionException {
		AttributionContext _localctx = new AttributionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_attribution);
		try {
			_localctx = new VariableAttributionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(VARIABLE);
			setState(106);
			match(EQ);
			setState(107);
			expression(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class List_declarationContext extends ParserRuleContext {
		public List_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_declaration; }
	 
		public List_declarationContext() { }
		public void copyFrom(List_declarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ListDeclarationContext extends List_declarationContext {
		public TerminalNode LIST() { return getToken(AlfParser.LIST, 0); }
		public TerminalNode VARIABLE() { return getToken(AlfParser.VARIABLE, 0); }
		public TerminalNode EQ() { return getToken(AlfParser.EQ, 0); }
		public TerminalNode LSP() { return getToken(AlfParser.LSP, 0); }
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
		}
		public TerminalNode RSP() { return getToken(AlfParser.RSP, 0); }
		public ListDeclarationContext(List_declarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlfListener ) ((AlfListener)listener).enterListDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlfListener ) ((AlfListener)listener).exitListDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlfVisitor ) return ((AlfVisitor<? extends T>)visitor).visitListDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final List_declarationContext list_declaration() throws RecognitionException {
		List_declarationContext _localctx = new List_declarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_list_declaration);
		try {
			_localctx = new ListDeclarationContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(LIST);
			setState(110);
			match(VARIABLE);
			setState(111);
			match(EQ);
			setState(112);
			match(LSP);
			setState(113);
			values();
			setState(114);
			match(RSP);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ValuesContext extends ParserRuleContext {
		public ValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_values; }
	 
		public ValuesContext() { }
		public void copyFrom(ValuesContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ListValuesContext extends ValuesContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AlfParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AlfParser.COMMA, i);
		}
		public ListValuesContext(ValuesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlfListener ) ((AlfListener)listener).enterListValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlfListener ) ((AlfListener)listener).exitListValues(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlfVisitor ) return ((AlfVisitor<? extends T>)visitor).visitListValues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValuesContext values() throws RecognitionException {
		ValuesContext _localctx = new ValuesContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_values);
		int _la;
		try {
			_localctx = new ListValuesContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 117440528L) != 0) {
				{
				{
				setState(116);
				value();
				setState(117);
				match(COMMA);
				}
				}
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	@SuppressWarnings("CheckReturnValue")
	public static class Function_declarationContext extends ParserRuleContext {
		public Function_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_declaration; }
	 
		public Function_declarationContext() { }
		public void copyFrom(Function_declarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionContentContext extends Function_declarationContext {
		public TerminalNode FUNCTION() { return getToken(AlfParser.FUNCTION, 0); }
		public TerminalNode VARIABLE() { return getToken(AlfParser.VARIABLE, 0); }
		public TerminalNode LP() { return getToken(AlfParser.LP, 0); }
		public TerminalNode RP() { return getToken(AlfParser.RP, 0); }
		public TerminalNode LB() { return getToken(AlfParser.LB, 0); }
		public Return_functionContext return_function() {
			return getRuleContext(Return_functionContext.class,0);
		}
		public TerminalNode RB() { return getToken(AlfParser.RB, 0); }
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(AlfParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(AlfParser.SEMICOLON, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AlfParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AlfParser.COMMA, i);
		}
		public FunctionContentContext(Function_declarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlfListener ) ((AlfListener)listener).enterFunctionContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlfListener ) ((AlfListener)listener).exitFunctionContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlfVisitor ) return ((AlfVisitor<? extends T>)visitor).visitFunctionContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_declarationContext function_declaration() throws RecognitionException {
		Function_declarationContext _localctx = new Function_declarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_function_declaration);
		int _la;
		try {
			_localctx = new FunctionContentContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(FUNCTION);
			setState(125);
			match(VARIABLE);
			setState(126);
			match(LP);
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 7168L) != 0) {
				{
				{
				setState(127);
				parameter();
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(128);
					match(COMMA);
					}
					}
					setState(133);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(139);
			match(RP);
			setState(140);
			match(LB);
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 117472280L) != 0) {
				{
				{
				setState(141);
				statement();
				setState(142);
				match(SEMICOLON);
				}
				}
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(149);
			return_function();
			setState(150);
			match(RB);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterContext extends ParserRuleContext {
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
	 
		public ParameterContext() { }
		public void copyFrom(ParameterContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionParameterContext extends ParameterContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public FunctionParameterContext(ParameterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlfListener ) ((AlfListener)listener).enterFunctionParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlfListener ) ((AlfListener)listener).exitFunctionParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlfVisitor ) return ((AlfVisitor<? extends T>)visitor).visitFunctionParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_parameter);
		try {
			_localctx = new FunctionParameterContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			declaration();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Return_functionContext extends ParserRuleContext {
		public Return_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_function; }
	 
		public Return_functionContext() { }
		public void copyFrom(Return_functionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EmptyReturnContext extends Return_functionContext {
		public TerminalNode RETURN() { return getToken(AlfParser.RETURN, 0); }
		public TerminalNode SEMICOLON() { return getToken(AlfParser.SEMICOLON, 0); }
		public EmptyReturnContext(Return_functionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlfListener ) ((AlfListener)listener).enterEmptyReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlfListener ) ((AlfListener)listener).exitEmptyReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlfVisitor ) return ((AlfVisitor<? extends T>)visitor).visitEmptyReturn(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStatementContext extends Return_functionContext {
		public TerminalNode RETURN() { return getToken(AlfParser.RETURN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(AlfParser.SEMICOLON, 0); }
		public ReturnStatementContext(Return_functionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlfListener ) ((AlfListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlfListener ) ((AlfListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlfVisitor ) return ((AlfVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_functionContext return_function() throws RecognitionException {
		Return_functionContext _localctx = new Return_functionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_return_function);
		try {
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new ReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				match(RETURN);
				setState(155);
				statement();
				setState(156);
				match(SEMICOLON);
				}
				break;
			case 2:
				_localctx = new EmptyReturnContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(158);
				match(RETURN);
				setState(159);
				match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Function_callContext extends ParserRuleContext {
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
	 
		public Function_callContext() { }
		public void copyFrom(Function_callContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallContext extends Function_callContext {
		public TerminalNode VARIABLE() { return getToken(AlfParser.VARIABLE, 0); }
		public TerminalNode LP() { return getToken(AlfParser.LP, 0); }
		public TerminalNode RP() { return getToken(AlfParser.RP, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AlfParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AlfParser.COMMA, i);
		}
		public FunctionCallContext(Function_callContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlfListener ) ((AlfListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlfListener ) ((AlfListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlfVisitor ) return ((AlfVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_function_call);
		int _la;
		try {
			_localctx = new FunctionCallContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(VARIABLE);
			setState(163);
			match(LP);
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 117456912L) != 0) {
				{
				{
				setState(164);
				expression(0);
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(165);
					match(COMMA);
					}
					}
					setState(170);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(176);
			match(RP);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001a\u00b3\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000\u001e"+
		"\b\u0000\n\u0000\f\u0000!\t\u0000\u0005\u0000#\b\u0000\n\u0000\f\u0000"+
		"&\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000+\b\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u00013\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u00029\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u0002@\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003E\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003"+
		"\u0004K\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0003\u0005T\b\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0005\u0005e\b\u0005\n\u0005\f\u0005h\t\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b"+
		"\u0001\b\u0005\bx\b\b\n\b\f\b{\t\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0005\t\u0082\b\t\n\t\f\t\u0085\t\t\u0005\t\u0087\b\t\n\t\f\t\u008a"+
		"\t\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u0091\b\t\n\t\f\t"+
		"\u0094\t\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00a1\b\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u00a7\b\f\n\f\f\f\u00aa\t\f\u0005"+
		"\f\u00ac\b\f\n\f\f\f\u00af\t\f\u0001\f\u0001\f\u0001\f\u0000\u0001\n\r"+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u0000"+
		"\u0000\u00c2\u0000*\u0001\u0000\u0000\u0000\u00022\u0001\u0000\u0000\u0000"+
		"\u0004?\u0001\u0000\u0000\u0000\u0006D\u0001\u0000\u0000\u0000\bJ\u0001"+
		"\u0000\u0000\u0000\nS\u0001\u0000\u0000\u0000\fi\u0001\u0000\u0000\u0000"+
		"\u000em\u0001\u0000\u0000\u0000\u0010y\u0001\u0000\u0000\u0000\u0012|"+
		"\u0001\u0000\u0000\u0000\u0014\u0098\u0001\u0000\u0000\u0000\u0016\u00a0"+
		"\u0001\u0000\u0000\u0000\u0018\u00a2\u0001\u0000\u0000\u0000\u001a\u001b"+
		"\u0003\u0002\u0001\u0000\u001b\u001f\u0005\u0011\u0000\u0000\u001c\u001e"+
		"\u0005\u0002\u0000\u0000\u001d\u001c\u0001\u0000\u0000\u0000\u001e!\u0001"+
		"\u0000\u0000\u0000\u001f\u001d\u0001\u0000\u0000\u0000\u001f \u0001\u0000"+
		"\u0000\u0000 #\u0001\u0000\u0000\u0000!\u001f\u0001\u0000\u0000\u0000"+
		"\"\u001a\u0001\u0000\u0000\u0000#&\u0001\u0000\u0000\u0000$\"\u0001\u0000"+
		"\u0000\u0000$%\u0001\u0000\u0000\u0000%+\u0001\u0000\u0000\u0000&$\u0001"+
		"\u0000\u0000\u0000\'(\u0003\u0002\u0001\u0000()\u0005\u0011\u0000\u0000"+
		")+\u0001\u0000\u0000\u0000*$\u0001\u0000\u0000\u0000*\'\u0001\u0000\u0000"+
		"\u0000+\u0001\u0001\u0000\u0000\u0000,3\u0003\u0004\u0002\u0000-3\u0003"+
		"\n\u0005\u0000.3\u0003\u000e\u0007\u0000/3\u0003\u0012\t\u000003\u0003"+
		"\f\u0006\u000013\u0003\u0018\f\u00002,\u0001\u0000\u0000\u00002-\u0001"+
		"\u0000\u0000\u00002.\u0001\u0000\u0000\u00002/\u0001\u0000\u0000\u0000"+
		"20\u0001\u0000\u0000\u000021\u0001\u0000\u0000\u00003\u0003\u0001\u0000"+
		"\u0000\u000045\u0003\u0006\u0003\u000058\u0005\u0004\u0000\u000067\u0005"+
		"\u0010\u0000\u000079\u0003\n\u0005\u000086\u0001\u0000\u0000\u000089\u0001"+
		"\u0000\u0000\u00009@\u0001\u0000\u0000\u0000:;\u0003\u0006\u0003\u0000"+
		";<\u0005\u0004\u0000\u0000<=\u0005\u0010\u0000\u0000=>\u0003\u0018\f\u0000"+
		">@\u0001\u0000\u0000\u0000?4\u0001\u0000\u0000\u0000?:\u0001\u0000\u0000"+
		"\u0000@\u0005\u0001\u0000\u0000\u0000AE\u0005\n\u0000\u0000BE\u0005\u000b"+
		"\u0000\u0000CE\u0005\f\u0000\u0000DA\u0001\u0000\u0000\u0000DB\u0001\u0000"+
		"\u0000\u0000DC\u0001\u0000\u0000\u0000E\u0007\u0001\u0000\u0000\u0000"+
		"FK\u0005\u0018\u0000\u0000GK\u0005\u0019\u0000\u0000HK\u0005\u001a\u0000"+
		"\u0000IK\u0005\u0004\u0000\u0000JF\u0001\u0000\u0000\u0000JG\u0001\u0000"+
		"\u0000\u0000JH\u0001\u0000\u0000\u0000JI\u0001\u0000\u0000\u0000K\t\u0001"+
		"\u0000\u0000\u0000LM\u0006\u0005\uffff\uffff\u0000MN\u0005\u000e\u0000"+
		"\u0000NO\u0003\n\u0005\u0000OP\u0005\u000f\u0000\u0000PT\u0001\u0000\u0000"+
		"\u0000QT\u0003\b\u0004\u0000RT\u0003\u0018\f\u0000SL\u0001\u0000\u0000"+
		"\u0000SQ\u0001\u0000\u0000\u0000SR\u0001\u0000\u0000\u0000Tf\u0001\u0000"+
		"\u0000\u0000UV\n\b\u0000\u0000VW\u0005\u0007\u0000\u0000We\u0003\n\u0005"+
		"\tXY\n\u0007\u0000\u0000YZ\u0005\b\u0000\u0000Ze\u0003\n\u0005\b[\\\n"+
		"\u0006\u0000\u0000\\]\u0005\t\u0000\u0000]e\u0003\n\u0005\u0007^_\n\u0005"+
		"\u0000\u0000_`\u0005\u0005\u0000\u0000`e\u0003\n\u0005\u0006ab\n\u0004"+
		"\u0000\u0000bc\u0005\u0006\u0000\u0000ce\u0003\n\u0005\u0005dU\u0001\u0000"+
		"\u0000\u0000dX\u0001\u0000\u0000\u0000d[\u0001\u0000\u0000\u0000d^\u0001"+
		"\u0000\u0000\u0000da\u0001\u0000\u0000\u0000eh\u0001\u0000\u0000\u0000"+
		"fd\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000g\u000b\u0001\u0000"+
		"\u0000\u0000hf\u0001\u0000\u0000\u0000ij\u0005\u0004\u0000\u0000jk\u0005"+
		"\u0010\u0000\u0000kl\u0003\n\u0005\u0000l\r\u0001\u0000\u0000\u0000mn"+
		"\u0005\r\u0000\u0000no\u0005\u0004\u0000\u0000op\u0005\u0010\u0000\u0000"+
		"pq\u0005\u0012\u0000\u0000qr\u0003\u0010\b\u0000rs\u0005\u0013\u0000\u0000"+
		"s\u000f\u0001\u0000\u0000\u0000tu\u0003\b\u0004\u0000uv\u0005\u0014\u0000"+
		"\u0000vx\u0001\u0000\u0000\u0000wt\u0001\u0000\u0000\u0000x{\u0001\u0000"+
		"\u0000\u0000yw\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000z\u0011"+
		"\u0001\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000|}\u0005\u0003\u0000"+
		"\u0000}~\u0005\u0004\u0000\u0000~\u0088\u0005\u000e\u0000\u0000\u007f"+
		"\u0083\u0003\u0014\n\u0000\u0080\u0082\u0005\u0014\u0000\u0000\u0081\u0080"+
		"\u0001\u0000\u0000\u0000\u0082\u0085\u0001\u0000\u0000\u0000\u0083\u0081"+
		"\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u0087"+
		"\u0001\u0000\u0000\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0086\u007f"+
		"\u0001\u0000\u0000\u0000\u0087\u008a\u0001\u0000\u0000\u0000\u0088\u0086"+
		"\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u008b"+
		"\u0001\u0000\u0000\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008b\u008c"+
		"\u0005\u000f\u0000\u0000\u008c\u0092\u0005\u0015\u0000\u0000\u008d\u008e"+
		"\u0003\u0002\u0001\u0000\u008e\u008f\u0005\u0011\u0000\u0000\u008f\u0091"+
		"\u0001\u0000\u0000\u0000\u0090\u008d\u0001\u0000\u0000\u0000\u0091\u0094"+
		"\u0001\u0000\u0000\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0092\u0093"+
		"\u0001\u0000\u0000\u0000\u0093\u0095\u0001\u0000\u0000\u0000\u0094\u0092"+
		"\u0001\u0000\u0000\u0000\u0095\u0096\u0003\u0016\u000b\u0000\u0096\u0097"+
		"\u0005\u0016\u0000\u0000\u0097\u0013\u0001\u0000\u0000\u0000\u0098\u0099"+
		"\u0003\u0004\u0002\u0000\u0099\u0015\u0001\u0000\u0000\u0000\u009a\u009b"+
		"\u0005\u0017\u0000\u0000\u009b\u009c\u0003\u0002\u0001\u0000\u009c\u009d"+
		"\u0005\u0011\u0000\u0000\u009d\u00a1\u0001\u0000\u0000\u0000\u009e\u009f"+
		"\u0005\u0017\u0000\u0000\u009f\u00a1\u0005\u0011\u0000\u0000\u00a0\u009a"+
		"\u0001\u0000\u0000\u0000\u00a0\u009e\u0001\u0000\u0000\u0000\u00a1\u0017"+
		"\u0001\u0000\u0000\u0000\u00a2\u00a3\u0005\u0004\u0000\u0000\u00a3\u00ad"+
		"\u0005\u000e\u0000\u0000\u00a4\u00a8\u0003\n\u0005\u0000\u00a5\u00a7\u0005"+
		"\u0014\u0000\u0000\u00a6\u00a5\u0001\u0000\u0000\u0000\u00a7\u00aa\u0001"+
		"\u0000\u0000\u0000\u00a8\u00a6\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001"+
		"\u0000\u0000\u0000\u00a9\u00ac\u0001\u0000\u0000\u0000\u00aa\u00a8\u0001"+
		"\u0000\u0000\u0000\u00ab\u00a4\u0001\u0000\u0000\u0000\u00ac\u00af\u0001"+
		"\u0000\u0000\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000\u00ad\u00ae\u0001"+
		"\u0000\u0000\u0000\u00ae\u00b0\u0001\u0000\u0000\u0000\u00af\u00ad\u0001"+
		"\u0000\u0000\u0000\u00b0\u00b1\u0005\u000f\u0000\u0000\u00b1\u0019\u0001"+
		"\u0000\u0000\u0000\u0012\u001f$*28?DJSdfy\u0083\u0088\u0092\u00a0\u00a8"+
		"\u00ad";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}