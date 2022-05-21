// Generated from /home/kimiya/Programming/Uni/PLC/Phase1/src/main/grammar/Cmm.g4 by ANTLR 4.9.1
package main.grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CmmParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		GET=1, SET=2, DISPLAY=3, APPEND=4, SIZE=5, DO=6, WHILE=7, FPTR=8, STRUCT=9, 
		LIST=10, VOID=11, RETURN=12, MAIN=13, IF=14, ELSE=15, COMMA=16, END=17, 
		BEGIN=18, LPAR=19, RPAR=20, LBRACE=21, RBRACE=22, SEMICOLON=23, ASSIGN=24, 
		SHARP=25, DOT=26, TYPE=27, BOOL=28, OR=29, AND=30, PLUS=31, MINUS=32, 
		MULTIPLY=33, DIVIDE=34, EQUAL=35, LESS=36, GREATER=37, TILDA=38, NUMBER=39, 
		NEWLINE=40, ID=41, COMMENT=42, WHITE_SPACE=43;
	public static final int
		RULE_cmm = 0, RULE_main = 1, RULE_funcReturnType = 2, RULE_functionDeclare = 3, 
		RULE_function = 4, RULE_body = 5, RULE_varDeclare = 6, RULE_setgetVarDec = 7, 
		RULE_structVars = 8, RULE_gsbody = 9, RULE_getterSetter = 10, RULE_structVar = 11, 
		RULE_struct = 12, RULE_stateFunctionCall = 13, RULE_functionCall = 14, 
		RULE_arguments = 15, RULE_argumentsDec = 16, RULE_argument = 17, RULE_returner = 18, 
		RULE_whileLoop = 19, RULE_ifConditions = 20, RULE_matchedIfBody = 21, 
		RULE_matchedIfScope = 22, RULE_matchedElseScope = 23, RULE_unmatchedIfScope = 24, 
		RULE_factorIf = 25, RULE_matchedIf = 26, RULE_unmatchedIf = 27, RULE_expression = 28, 
		RULE_expression_ = 29, RULE_orExpression = 30, RULE_orExpression_ = 31, 
		RULE_andExpression = 32, RULE_andExpression_ = 33, RULE_arithmeticExpressionP2 = 34, 
		RULE_arithmeticExpressionP2_ = 35, RULE_arithmeticExpressionP1 = 36, RULE_arithmeticExpressionP1_ = 37, 
		RULE_equalExpression = 38, RULE_equalExpression_ = 39, RULE_inequalityExpression = 40, 
		RULE_inequalityExpression_ = 41, RULE_unaryExpression = 42, RULE_factor0 = 43, 
		RULE_factor1 = 44, RULE_variable = 45, RULE_factor = 46, RULE_methodCall = 47, 
		RULE_varDec = 48, RULE_statement = 49, RULE_endLine = 50, RULE_listElementCall = 51, 
		RULE_varType = 52, RULE_listFormat = 53, RULE_fptrFormat = 54, RULE_semicolonScope = 55, 
		RULE_scope = 56;
	private static String[] makeRuleNames() {
		return new String[] {
			"cmm", "main", "funcReturnType", "functionDeclare", "function", "body", 
			"varDeclare", "setgetVarDec", "structVars", "gsbody", "getterSetter", 
			"structVar", "struct", "stateFunctionCall", "functionCall", "arguments", 
			"argumentsDec", "argument", "returner", "whileLoop", "ifConditions", 
			"matchedIfBody", "matchedIfScope", "matchedElseScope", "unmatchedIfScope", 
			"factorIf", "matchedIf", "unmatchedIf", "expression", "expression_", 
			"orExpression", "orExpression_", "andExpression", "andExpression_", "arithmeticExpressionP2", 
			"arithmeticExpressionP2_", "arithmeticExpressionP1", "arithmeticExpressionP1_", 
			"equalExpression", "equalExpression_", "inequalityExpression", "inequalityExpression_", 
			"unaryExpression", "factor0", "factor1", "variable", "factor", "methodCall", 
			"varDec", "statement", "endLine", "listElementCall", "varType", "listFormat", 
			"fptrFormat", "semicolonScope", "scope"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'get'", "'set'", "'display'", "'append'", "'size'", "'do'", "'while'", 
			"'fptr'", "'struct'", "'list'", "'void'", "'return'", "'main'", "'if'", 
			"'else'", "','", "'end'", "'begin'", "'('", "')'", "'['", "']'", "';'", 
			"'='", "'#'", "'.'", null, null, "'|'", "'&'", "'+'", "'-'", "'*'", "'/'", 
			"'=='", "'<'", "'>'", "'~'", null, "'\n'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "GET", "SET", "DISPLAY", "APPEND", "SIZE", "DO", "WHILE", "FPTR", 
			"STRUCT", "LIST", "VOID", "RETURN", "MAIN", "IF", "ELSE", "COMMA", "END", 
			"BEGIN", "LPAR", "RPAR", "LBRACE", "RBRACE", "SEMICOLON", "ASSIGN", "SHARP", 
			"DOT", "TYPE", "BOOL", "OR", "AND", "PLUS", "MINUS", "MULTIPLY", "DIVIDE", 
			"EQUAL", "LESS", "GREATER", "TILDA", "NUMBER", "NEWLINE", "ID", "COMMENT", 
			"WHITE_SPACE"
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
	public String getGrammarFileName() { return "Cmm.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CmmParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CmmContext extends ParserRuleContext {
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CmmParser.EOF, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(CmmParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CmmParser.NEWLINE, i);
		}
		public List<StructContext> struct() {
			return getRuleContexts(StructContext.class);
		}
		public StructContext struct(int i) {
			return getRuleContext(StructContext.class,i);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public CmmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterCmm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitCmm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitCmm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmmContext cmm() throws RecognitionException {
		CmmContext _localctx = new CmmContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_cmm);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(114);
				match(NEWLINE);
				}
				}
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(123);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(120);
					struct();
					}
					} 
				}
				setState(125);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FPTR) | (1L << STRUCT) | (1L << LIST) | (1L << VOID) | (1L << TYPE))) != 0)) {
				{
				{
				setState(126);
				function();
				}
				}
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(132);
			main();
			setState(133);
			match(EOF);
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

	public static class MainContext extends ParserRuleContext {
		public TerminalNode MAIN() { return getToken(CmmParser.MAIN, 0); }
		public TerminalNode LPAR() { return getToken(CmmParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(CmmParser.RPAR, 0); }
		public ScopeContext scope() {
			return getRuleContext(ScopeContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(CmmParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CmmParser.NEWLINE, i);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_main);
		int _la;
		try {
			setState(151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				match(MAIN);
				 System.out.println("Main"); 
				setState(137);
				match(LPAR);
				setState(138);
				match(RPAR);
				setState(139);
				scope();
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(140);
					match(NEWLINE);
					}
					}
					setState(145);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
				match(MAIN);
				 System.out.println("Main"); 
				setState(148);
				match(LPAR);
				setState(149);
				match(RPAR);
				setState(150);
				body();
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

	public static class FuncReturnTypeContext extends ParserRuleContext {
		public ListFormatContext listFormat() {
			return getRuleContext(ListFormatContext.class,0);
		}
		public TerminalNode TYPE() { return getToken(CmmParser.TYPE, 0); }
		public TerminalNode STRUCT() { return getToken(CmmParser.STRUCT, 0); }
		public TerminalNode ID() { return getToken(CmmParser.ID, 0); }
		public TerminalNode VOID() { return getToken(CmmParser.VOID, 0); }
		public FptrFormatContext fptrFormat() {
			return getRuleContext(FptrFormatContext.class,0);
		}
		public FuncReturnTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcReturnType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterFuncReturnType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitFuncReturnType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitFuncReturnType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncReturnTypeContext funcReturnType() throws RecognitionException {
		FuncReturnTypeContext _localctx = new FuncReturnTypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_funcReturnType);
		try {
			setState(159);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LIST:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				listFormat();
				}
				break;
			case TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				match(TYPE);
				}
				break;
			case STRUCT:
				enterOuterAlt(_localctx, 3);
				{
				setState(155);
				match(STRUCT);
				setState(156);
				match(ID);
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 4);
				{
				setState(157);
				match(VOID);
				}
				break;
			case FPTR:
				enterOuterAlt(_localctx, 5);
				{
				setState(158);
				fptrFormat();
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

	public static class FunctionDeclareContext extends ParserRuleContext {
		public Token ID;
		public FuncReturnTypeContext funcReturnType() {
			return getRuleContext(FuncReturnTypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(CmmParser.ID, 0); }
		public ArgumentsDecContext argumentsDec() {
			return getRuleContext(ArgumentsDecContext.class,0);
		}
		public FunctionDeclareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterFunctionDeclare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitFunctionDeclare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitFunctionDeclare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclareContext functionDeclare() throws RecognitionException {
		FunctionDeclareContext _localctx = new FunctionDeclareContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_functionDeclare);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			funcReturnType();
			setState(162);
			((FunctionDeclareContext)_localctx).ID = match(ID);
			 System.out.println("FunctionDec : " + ((FunctionDeclareContext)_localctx).ID.getText()); 
			setState(164);
			argumentsDec();
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

	public static class FunctionContext extends ParserRuleContext {
		public FunctionDeclareContext functionDeclare() {
			return getRuleContext(FunctionDeclareContext.class,0);
		}
		public ScopeContext scope() {
			return getRuleContext(ScopeContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(CmmParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CmmParser.NEWLINE, i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			functionDeclare();
			setState(167);
			scope();
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(168);
				match(NEWLINE);
				}
				}
				setState(173);
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

	public static class BodyContext extends ParserRuleContext {
		public IfConditionsContext ifConditions() {
			return getRuleContext(IfConditionsContext.class,0);
		}
		public StateFunctionCallContext stateFunctionCall() {
			return getRuleContext(StateFunctionCallContext.class,0);
		}
		public EndLineContext endLine() {
			return getRuleContext(EndLineContext.class,0);
		}
		public ReturnerContext returner() {
			return getRuleContext(ReturnerContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileLoopContext whileLoop() {
			return getRuleContext(WhileLoopContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(CmmParser.NEWLINE, 0); }
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_body);
		try {
			setState(186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				ifConditions();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
				stateFunctionCall();
				setState(176);
				endLine();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(178);
				returner();
				setState(179);
				endLine();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(181);
				statement();
				setState(182);
				endLine();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(184);
				whileLoop();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(185);
				match(NEWLINE);
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

	public static class VarDeclareContext extends ParserRuleContext {
		public Token ID;
		public VarTypeContext varType() {
			return getRuleContext(VarTypeContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(CmmParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CmmParser.ID, i);
		}
		public EndLineContext endLine() {
			return getRuleContext(EndLineContext.class,0);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(CmmParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(CmmParser.ASSIGN, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CmmParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CmmParser.COMMA, i);
		}
		public VarDeclareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterVarDeclare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitVarDeclare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitVarDeclare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclareContext varDeclare() throws RecognitionException {
		VarDeclareContext _localctx = new VarDeclareContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_varDeclare);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			varType();
			setState(189);
			((VarDeclareContext)_localctx).ID = match(ID);
			 System.out.println("VarDec : " + ((VarDeclareContext)_localctx).ID.getText()); 
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(191);
				match(ASSIGN);
				setState(192);
				expression();
				}
			}

			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(195);
				match(COMMA);
				setState(196);
				((VarDeclareContext)_localctx).ID = match(ID);
				 System.out.println("VarDec : " + ((VarDeclareContext)_localctx).ID.getText()); 
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(198);
					match(ASSIGN);
					setState(199);
					expression();
					}
				}

				}
				}
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(207);
			endLine();
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

	public static class SetgetVarDecContext extends ParserRuleContext {
		public Token ID;
		public FuncReturnTypeContext funcReturnType() {
			return getRuleContext(FuncReturnTypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(CmmParser.ID, 0); }
		public ArgumentsDecContext argumentsDec() {
			return getRuleContext(ArgumentsDecContext.class,0);
		}
		public SetgetVarDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setgetVarDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterSetgetVarDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitSetgetVarDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitSetgetVarDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetgetVarDecContext setgetVarDec() throws RecognitionException {
		SetgetVarDecContext _localctx = new SetgetVarDecContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_setgetVarDec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			funcReturnType();
			setState(210);
			((SetgetVarDecContext)_localctx).ID = match(ID);
			 System.out.println("VarDec : " + ((SetgetVarDecContext)_localctx).ID.getText()); 
			setState(212);
			argumentsDec();
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

	public static class StructVarsContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(CmmParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CmmParser.NEWLINE, i);
		}
		public List<VarDeclareContext> varDeclare() {
			return getRuleContexts(VarDeclareContext.class);
		}
		public VarDeclareContext varDeclare(int i) {
			return getRuleContext(VarDeclareContext.class,i);
		}
		public List<SetgetVarDecContext> setgetVarDec() {
			return getRuleContexts(SetgetVarDecContext.class);
		}
		public SetgetVarDecContext setgetVarDec(int i) {
			return getRuleContext(SetgetVarDecContext.class,i);
		}
		public List<TerminalNode> BEGIN() { return getTokens(CmmParser.BEGIN); }
		public TerminalNode BEGIN(int i) {
			return getToken(CmmParser.BEGIN, i);
		}
		public List<GetterSetterContext> getterSetter() {
			return getRuleContexts(GetterSetterContext.class);
		}
		public GetterSetterContext getterSetter(int i) {
			return getRuleContext(GetterSetterContext.class,i);
		}
		public List<TerminalNode> END() { return getTokens(CmmParser.END); }
		public TerminalNode END(int i) {
			return getToken(CmmParser.END, i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(CmmParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(CmmParser.SEMICOLON, i);
		}
		public StructVarsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structVars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterStructVars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitStructVars(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitStructVars(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructVarsContext structVars() throws RecognitionException {
		StructVarsContext _localctx = new StructVarsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_structVars);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FPTR) | (1L << STRUCT) | (1L << LIST) | (1L << VOID) | (1L << TYPE) | (1L << NEWLINE))) != 0)) {
				{
				setState(239);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					{
					setState(214);
					varDeclare();
					}
					}
					break;
				case 2:
					{
					{
					setState(215);
					setgetVarDec();
					setState(216);
					match(BEGIN);
					setState(220);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEWLINE) {
						{
						{
						setState(217);
						match(NEWLINE);
						}
						}
						setState(222);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(223);
					getterSetter();
					setState(227);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEWLINE) {
						{
						{
						setState(224);
						match(NEWLINE);
						}
						}
						setState(229);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(230);
					match(END);
					setState(231);
					_la = _input.LA(1);
					if ( !(_la==SEMICOLON || _la==NEWLINE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(235);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(232);
							match(NEWLINE);
							}
							} 
						}
						setState(237);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
					}
					}
					}
					break;
				case 3:
					{
					setState(238);
					match(NEWLINE);
					}
					break;
				}
				}
				setState(243);
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

	public static class GsbodyContext extends ParserRuleContext {
		public IfConditionsContext ifConditions() {
			return getRuleContext(IfConditionsContext.class,0);
		}
		public StateFunctionCallContext stateFunctionCall() {
			return getRuleContext(StateFunctionCallContext.class,0);
		}
		public EndLineContext endLine() {
			return getRuleContext(EndLineContext.class,0);
		}
		public WhileLoopContext whileLoop() {
			return getRuleContext(WhileLoopContext.class,0);
		}
		public ReturnerContext returner() {
			return getRuleContext(ReturnerContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(CmmParser.NEWLINE, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(CmmParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public GsbodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gsbody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterGsbody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitGsbody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitGsbody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GsbodyContext gsbody() throws RecognitionException {
		GsbodyContext _localctx = new GsbodyContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_gsbody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(244);
				ifConditions();
				}
				break;
			case 2:
				{
				setState(245);
				stateFunctionCall();
				setState(246);
				endLine();
				}
				break;
			case 3:
				{
				setState(256);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(248);
					variable();
					{
					setState(249);
					match(ASSIGN);
					setState(250);
					expression();
					}
					}
					break;
				case 2:
					{
					setState(252);
					methodCall();
					setState(253);
					match(ASSIGN);
					setState(254);
					expression();
					}
					break;
				}
				setState(258);
				endLine();
				}
				break;
			case 4:
				{
				setState(260);
				whileLoop();
				}
				break;
			case 5:
				{
				setState(261);
				returner();
				setState(262);
				endLine();
				}
				break;
			case 6:
				{
				setState(264);
				match(NEWLINE);
				}
				break;
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

	public static class GetterSetterContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(CmmParser.SET, 0); }
		public List<TerminalNode> BEGIN() { return getTokens(CmmParser.BEGIN); }
		public TerminalNode BEGIN(int i) {
			return getToken(CmmParser.BEGIN, i);
		}
		public List<TerminalNode> END() { return getTokens(CmmParser.END); }
		public TerminalNode END(int i) {
			return getToken(CmmParser.END, i);
		}
		public TerminalNode GET() { return getToken(CmmParser.GET, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(CmmParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CmmParser.NEWLINE, i);
		}
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
		public GetterSetterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getterSetter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterGetterSetter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitGetterSetter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitGetterSetter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GetterSetterContext getterSetter() throws RecognitionException {
		GetterSetterContext _localctx = new GetterSetterContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_getterSetter);
		int _la;
		try {
			int _alt;
			setState(406);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(267);
				match(SET);
				 System.out.println("Setter"); 
				setState(269);
				match(BEGIN);
				setState(271); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(270);
						match(NEWLINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(273); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(278);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DISPLAY) | (1L << APPEND) | (1L << SIZE) | (1L << DO) | (1L << WHILE) | (1L << FPTR) | (1L << STRUCT) | (1L << LIST) | (1L << RETURN) | (1L << IF) | (1L << LPAR) | (1L << TYPE) | (1L << BOOL) | (1L << MINUS) | (1L << TILDA) | (1L << NUMBER) | (1L << NEWLINE) | (1L << ID))) != 0)) {
					{
					{
					setState(275);
					body();
					}
					}
					setState(280);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(281);
				match(END);
				setState(283); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(282);
					match(NEWLINE);
					}
					}
					setState(285); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(287);
				match(GET);
				 System.out.println("Getter"); 
				setState(289);
				match(BEGIN);
				setState(291); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(290);
						match(NEWLINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(293); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(298);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(295);
						body();
						}
						} 
					}
					setState(300);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				}
				setState(304);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(301);
					match(NEWLINE);
					}
					}
					setState(306);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(307);
				match(END);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(308);
				match(SET);
				 System.out.println("Setter"); 
				setState(310);
				match(BEGIN);
				setState(312); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(311);
						match(NEWLINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(314); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(319);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DISPLAY) | (1L << APPEND) | (1L << SIZE) | (1L << DO) | (1L << WHILE) | (1L << FPTR) | (1L << STRUCT) | (1L << LIST) | (1L << RETURN) | (1L << IF) | (1L << LPAR) | (1L << TYPE) | (1L << BOOL) | (1L << MINUS) | (1L << TILDA) | (1L << NUMBER) | (1L << NEWLINE) | (1L << ID))) != 0)) {
					{
					{
					setState(316);
					body();
					}
					}
					setState(321);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(322);
				match(END);
				setState(324); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(323);
					match(NEWLINE);
					}
					}
					setState(326); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(328);
				match(GET);
				 System.out.println("Getter"); 
				setState(331); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(330);
						match(NEWLINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(333); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				{
				setState(335);
				body();
				}
				setState(339);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(336);
						match(NEWLINE);
						}
						} 
					}
					setState(341);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(342);
				match(SET);
				 System.out.println("Setter"); 
				setState(345); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(344);
						match(NEWLINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(347); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				{
				setState(349);
				body();
				}
				setState(353);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(350);
					match(NEWLINE);
					}
					}
					setState(355);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(356);
				match(GET);
				 System.out.println("Getter"); 
				setState(358);
				match(BEGIN);
				setState(360); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(359);
						match(NEWLINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(362); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(367);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(364);
						body();
						}
						} 
					}
					setState(369);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
				}
				setState(373);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(370);
					match(NEWLINE);
					}
					}
					setState(375);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(376);
				match(END);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(378);
				match(SET);
				 System.out.println("Setter"); 
				setState(381); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(380);
						match(NEWLINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(383); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				{
				setState(385);
				body();
				}
				setState(389);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(386);
					match(NEWLINE);
					}
					}
					setState(391);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(392);
				match(GET);
				 System.out.println("Getter"); 
				setState(395); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(394);
						match(NEWLINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(397); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				{
				setState(399);
				body();
				}
				setState(403);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(400);
						match(NEWLINE);
						}
						} 
					}
					setState(405);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
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

	public static class StructVarContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(CmmParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CmmParser.NEWLINE, i);
		}
		public VarDeclareContext varDeclare() {
			return getRuleContext(VarDeclareContext.class,0);
		}
		public SetgetVarDecContext setgetVarDec() {
			return getRuleContext(SetgetVarDecContext.class,0);
		}
		public TerminalNode BEGIN() { return getToken(CmmParser.BEGIN, 0); }
		public GetterSetterContext getterSetter() {
			return getRuleContext(GetterSetterContext.class,0);
		}
		public TerminalNode END() { return getToken(CmmParser.END, 0); }
		public TerminalNode SEMICOLON() { return getToken(CmmParser.SEMICOLON, 0); }
		public StructVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterStructVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitStructVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitStructVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructVarContext structVar() throws RecognitionException {
		StructVarContext _localctx = new StructVarContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_structVar);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				{
				setState(408);
				varDeclare();
				}
				}
				break;
			case 2:
				{
				{
				setState(409);
				setgetVarDec();
				setState(410);
				match(BEGIN);
				setState(411);
				match(NEWLINE);
				setState(412);
				getterSetter();
				setState(416);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(413);
					match(NEWLINE);
					}
					}
					setState(418);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(419);
				match(END);
				setState(420);
				_la = _input.LA(1);
				if ( !(_la==SEMICOLON || _la==NEWLINE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(424);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(421);
						match(NEWLINE);
						}
						} 
					}
					setState(426);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
				}
				}
				}
				break;
			case 3:
				{
				setState(427);
				match(NEWLINE);
				}
				break;
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

	public static class StructContext extends ParserRuleContext {
		public Token ID;
		public TerminalNode STRUCT() { return getToken(CmmParser.STRUCT, 0); }
		public TerminalNode ID() { return getToken(CmmParser.ID, 0); }
		public TerminalNode BEGIN() { return getToken(CmmParser.BEGIN, 0); }
		public StructVarsContext structVars() {
			return getRuleContext(StructVarsContext.class,0);
		}
		public TerminalNode END() { return getToken(CmmParser.END, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(CmmParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CmmParser.NEWLINE, i);
		}
		public StructVarContext structVar() {
			return getRuleContext(StructVarContext.class,0);
		}
		public StructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterStruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitStruct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitStruct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructContext struct() throws RecognitionException {
		StructContext _localctx = new StructContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_struct);
		int _la;
		try {
			int _alt;
			setState(462);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(430);
				match(STRUCT);
				setState(431);
				((StructContext)_localctx).ID = match(ID);
				 System.out.println("StructDec : " + ((StructContext)_localctx).ID.getText()); 
				setState(433);
				match(BEGIN);
				setState(435); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(434);
						match(NEWLINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(437); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(439);
				structVars();
				setState(440);
				match(END);
				setState(444);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(441);
					match(NEWLINE);
					}
					}
					setState(446);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(447);
				match(STRUCT);
				setState(448);
				((StructContext)_localctx).ID = match(ID);
				 System.out.println("StructDec : " + ((StructContext)_localctx).ID.getText()); 
				setState(451); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(450);
						match(NEWLINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(453); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(455);
				structVar();
				setState(459);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(456);
					match(NEWLINE);
					}
					}
					setState(461);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public static class StateFunctionCallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CmmParser.ID, 0); }
		public List<ArgumentsContext> arguments() {
			return getRuleContexts(ArgumentsContext.class);
		}
		public ArgumentsContext arguments(int i) {
			return getRuleContext(ArgumentsContext.class,i);
		}
		public TerminalNode DISPLAY() { return getToken(CmmParser.DISPLAY, 0); }
		public TerminalNode SIZE() { return getToken(CmmParser.SIZE, 0); }
		public TerminalNode APPEND() { return getToken(CmmParser.APPEND, 0); }
		public StateFunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stateFunctionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterStateFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitStateFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitStateFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StateFunctionCallContext stateFunctionCall() throws RecognitionException {
		StateFunctionCallContext _localctx = new StateFunctionCallContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_stateFunctionCall);
		int _la;
		try {
			setState(492);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(464);
				match(ID);
				 System.out.println("FunctionCall"); 
				setState(467); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(466);
					arguments();
					}
					}
					setState(469); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LPAR );
				}
				break;
			case DISPLAY:
				enterOuterAlt(_localctx, 2);
				{
				setState(471);
				match(DISPLAY);
				 System.out.println("Built-in : display"); 
				setState(474); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(473);
					arguments();
					}
					}
					setState(476); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LPAR );
				}
				break;
			case SIZE:
				enterOuterAlt(_localctx, 3);
				{
				setState(478);
				match(SIZE);
				 System.out.println("Size"); 
				setState(481); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(480);
					arguments();
					}
					}
					setState(483); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LPAR );
				}
				break;
			case APPEND:
				enterOuterAlt(_localctx, 4);
				{
				setState(485);
				match(APPEND);
				 System.out.println("Append"); 
				setState(488); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(487);
					arguments();
					}
					}
					setState(490); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LPAR );
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

	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CmmParser.ID, 0); }
		public List<ArgumentsContext> arguments() {
			return getRuleContexts(ArgumentsContext.class);
		}
		public ArgumentsContext arguments(int i) {
			return getRuleContext(ArgumentsContext.class,i);
		}
		public TerminalNode DISPLAY() { return getToken(CmmParser.DISPLAY, 0); }
		public TerminalNode SIZE() { return getToken(CmmParser.SIZE, 0); }
		public TerminalNode APPEND() { return getToken(CmmParser.APPEND, 0); }
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_functionCall);
		try {
			int _alt;
			setState(521);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(494);
				match(ID);
				setState(496); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(495);
						arguments();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(498); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case DISPLAY:
				enterOuterAlt(_localctx, 2);
				{
				setState(500);
				match(DISPLAY);
				 System.out.println("Built-in : display"); 
				setState(503); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(502);
						arguments();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(505); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case SIZE:
				enterOuterAlt(_localctx, 3);
				{
				setState(507);
				match(SIZE);
				 System.out.println("Size"); 
				setState(510); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(509);
						arguments();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(512); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case APPEND:
				enterOuterAlt(_localctx, 4);
				{
				setState(514);
				match(APPEND);
				 System.out.println("Append"); 
				setState(517); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(516);
						arguments();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(519); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class ArgumentsContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(CmmParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(CmmParser.RPAR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CmmParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CmmParser.COMMA, i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_arguments);
		try {
			int _alt;
			setState(537);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(523);
				match(LPAR);
				setState(529);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						{
						setState(524);
						expression();
						setState(525);
						match(COMMA);
						}
						}
						} 
					}
					setState(531);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
				}
				{
				setState(532);
				expression();
				}
				setState(533);
				match(RPAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(535);
				match(LPAR);
				setState(536);
				match(RPAR);
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

	public static class ArgumentsDecContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(CmmParser.LPAR, 0); }
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public TerminalNode RPAR() { return getToken(CmmParser.RPAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(CmmParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CmmParser.COMMA, i);
		}
		public ArgumentsDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentsDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterArgumentsDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitArgumentsDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitArgumentsDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsDecContext argumentsDec() throws RecognitionException {
		ArgumentsDecContext _localctx = new ArgumentsDecContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_argumentsDec);
		try {
			int _alt;
			setState(553);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(539);
				match(LPAR);
				setState(545);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(540);
						argument();
						setState(541);
						match(COMMA);
						}
						} 
					}
					setState(547);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
				}
				setState(548);
				argument();
				setState(549);
				match(RPAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(551);
				match(LPAR);
				setState(552);
				match(RPAR);
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

	public static class ArgumentContext extends ParserRuleContext {
		public Token ID;
		public VarTypeContext varType() {
			return getRuleContext(VarTypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(CmmParser.ID, 0); }
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(555);
			varType();
			setState(556);
			((ArgumentContext)_localctx).ID = match(ID);
			 System.out.println("ArgumentDec : " + ((ArgumentContext)_localctx).ID.getText()); 
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

	public static class ReturnerContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(CmmParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returner; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterReturner(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitReturner(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitReturner(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnerContext returner() throws RecognitionException {
		ReturnerContext _localctx = new ReturnerContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_returner);
		try {
			setState(564);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(559);
				match(RETURN);
				 System.out.println("Return"); 
				setState(561);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(562);
				match(RETURN);
				 System.out.println("Return"); 
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

	public static class WhileLoopContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(CmmParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SemicolonScopeContext semicolonScope() {
			return getRuleContext(SemicolonScopeContext.class,0);
		}
		public TerminalNode DO() { return getToken(CmmParser.DO, 0); }
		public ScopeContext scope() {
			return getRuleContext(ScopeContext.class,0);
		}
		public EndLineContext endLine() {
			return getRuleContext(EndLineContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(CmmParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CmmParser.NEWLINE, i);
		}
		public WhileLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitWhileLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitWhileLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileLoopContext whileLoop() throws RecognitionException {
		WhileLoopContext _localctx = new WhileLoopContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_whileLoop);
		int _la;
		try {
			setState(584);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(566);
				match(WHILE);
				 System.out.println("Loop : while"); 
				setState(568);
				expression();
				setState(569);
				semicolonScope();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 2);
				{
				setState(571);
				match(DO);
				 System.out.println("Loop : do...while"); 
				setState(573);
				scope();
				setState(577);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(574);
					match(NEWLINE);
					}
					}
					setState(579);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(580);
				match(WHILE);
				setState(581);
				expression();
				setState(582);
				endLine();
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

	public static class IfConditionsContext extends ParserRuleContext {
		public MatchedIfContext matchedIf() {
			return getRuleContext(MatchedIfContext.class,0);
		}
		public UnmatchedIfContext unmatchedIf() {
			return getRuleContext(UnmatchedIfContext.class,0);
		}
		public IfConditionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifConditions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterIfConditions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitIfConditions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitIfConditions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfConditionsContext ifConditions() throws RecognitionException {
		IfConditionsContext _localctx = new IfConditionsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_ifConditions);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(588);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				{
				setState(586);
				matchedIf();
				}
				break;
			case 2:
				{
				setState(587);
				unmatchedIf();
				}
				break;
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

	public static class MatchedIfBodyContext extends ParserRuleContext {
		public MatchedIfContext matchedIf() {
			return getRuleContext(MatchedIfContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public EndLineContext endLine() {
			return getRuleContext(EndLineContext.class,0);
		}
		public ReturnerContext returner() {
			return getRuleContext(ReturnerContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileLoopContext whileLoop() {
			return getRuleContext(WhileLoopContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(CmmParser.NEWLINE, 0); }
		public MatchedIfBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchedIfBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterMatchedIfBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitMatchedIfBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitMatchedIfBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchedIfBodyContext matchedIfBody() throws RecognitionException {
		MatchedIfBodyContext _localctx = new MatchedIfBodyContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_matchedIfBody);
		try {
			setState(602);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(590);
				matchedIf();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(591);
				functionCall();
				setState(592);
				endLine();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(594);
				returner();
				setState(595);
				endLine();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(597);
				statement();
				setState(598);
				endLine();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(600);
				whileLoop();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(601);
				match(NEWLINE);
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

	public static class MatchedIfScopeContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(CmmParser.BEGIN, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(CmmParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CmmParser.NEWLINE, i);
		}
		public TerminalNode END() { return getToken(CmmParser.END, 0); }
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
		public MatchedIfBodyContext matchedIfBody() {
			return getRuleContext(MatchedIfBodyContext.class,0);
		}
		public MatchedIfScopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchedIfScope; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterMatchedIfScope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitMatchedIfScope(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitMatchedIfScope(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchedIfScopeContext matchedIfScope() throws RecognitionException {
		MatchedIfScopeContext _localctx = new MatchedIfScopeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_matchedIfScope);
		int _la;
		try {
			setState(627);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(604);
				match(BEGIN);
				setState(605);
				match(NEWLINE);
				setState(609);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DISPLAY) | (1L << APPEND) | (1L << SIZE) | (1L << DO) | (1L << WHILE) | (1L << FPTR) | (1L << STRUCT) | (1L << LIST) | (1L << RETURN) | (1L << IF) | (1L << LPAR) | (1L << TYPE) | (1L << BOOL) | (1L << MINUS) | (1L << TILDA) | (1L << NUMBER) | (1L << NEWLINE) | (1L << ID))) != 0)) {
					{
					{
					setState(606);
					body();
					}
					}
					setState(611);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(612);
				match(END);
				setState(616);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(613);
					match(NEWLINE);
					}
					}
					setState(618);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(619);
				match(NEWLINE);
				setState(620);
				matchedIfBody();
				setState(624);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(621);
					match(NEWLINE);
					}
					}
					setState(626);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class MatchedElseScopeContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(CmmParser.BEGIN, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(CmmParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CmmParser.NEWLINE, i);
		}
		public TerminalNode END() { return getToken(CmmParser.END, 0); }
		public TerminalNode SEMICOLON() { return getToken(CmmParser.SEMICOLON, 0); }
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
		public MatchedIfBodyContext matchedIfBody() {
			return getRuleContext(MatchedIfBodyContext.class,0);
		}
		public MatchedElseScopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchedElseScope; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterMatchedElseScope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitMatchedElseScope(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitMatchedElseScope(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchedElseScopeContext matchedElseScope() throws RecognitionException {
		MatchedElseScopeContext _localctx = new MatchedElseScopeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_matchedElseScope);
		int _la;
		try {
			int _alt;
			setState(647);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(629);
				match(BEGIN);
				setState(630);
				match(NEWLINE);
				setState(634);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DISPLAY) | (1L << APPEND) | (1L << SIZE) | (1L << DO) | (1L << WHILE) | (1L << FPTR) | (1L << STRUCT) | (1L << LIST) | (1L << RETURN) | (1L << IF) | (1L << LPAR) | (1L << TYPE) | (1L << BOOL) | (1L << MINUS) | (1L << TILDA) | (1L << NUMBER) | (1L << NEWLINE) | (1L << ID))) != 0)) {
					{
					{
					setState(631);
					body();
					}
					}
					setState(636);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(637);
				match(END);
				setState(638);
				_la = _input.LA(1);
				if ( !(_la==SEMICOLON || _la==NEWLINE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(639);
				match(NEWLINE);
				setState(640);
				matchedIfBody();
				setState(644);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(641);
						match(NEWLINE);
						}
						} 
					}
					setState(646);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
				}
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

	public static class UnmatchedIfScopeContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(CmmParser.BEGIN, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(CmmParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CmmParser.NEWLINE, i);
		}
		public TerminalNode END() { return getToken(CmmParser.END, 0); }
		public TerminalNode SEMICOLON() { return getToken(CmmParser.SEMICOLON, 0); }
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
		public UnmatchedIfContext unmatchedIf() {
			return getRuleContext(UnmatchedIfContext.class,0);
		}
		public UnmatchedIfScopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unmatchedIfScope; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterUnmatchedIfScope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitUnmatchedIfScope(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitUnmatchedIfScope(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnmatchedIfScopeContext unmatchedIfScope() throws RecognitionException {
		UnmatchedIfScopeContext _localctx = new UnmatchedIfScopeContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_unmatchedIfScope);
		int _la;
		try {
			int _alt;
			setState(674);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(649);
				match(BEGIN);
				setState(650);
				match(NEWLINE);
				setState(654);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(651);
						body();
						}
						} 
					}
					setState(656);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
				}
				setState(660);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(657);
					match(NEWLINE);
					}
					}
					setState(662);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(663);
				match(END);
				setState(664);
				_la = _input.LA(1);
				if ( !(_la==SEMICOLON || _la==NEWLINE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(665);
				match(NEWLINE);
				setState(666);
				unmatchedIf();
				}
				setState(671);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(668);
						match(NEWLINE);
						}
						} 
					}
					setState(673);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
				}
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

	public static class FactorIfContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(CmmParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MatchedIfScopeContext matchedIfScope() {
			return getRuleContext(MatchedIfScopeContext.class,0);
		}
		public FactorIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factorIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterFactorIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitFactorIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitFactorIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorIfContext factorIf() throws RecognitionException {
		FactorIfContext _localctx = new FactorIfContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_factorIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(676);
			match(IF);
			 System.out.println("Conditional : if"); 
			setState(678);
			expression();
			setState(679);
			matchedIfScope();
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

	public static class MatchedIfContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(CmmParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MatchedIfScopeContext matchedIfScope() {
			return getRuleContext(MatchedIfScopeContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(CmmParser.ELSE, 0); }
		public MatchedElseScopeContext matchedElseScope() {
			return getRuleContext(MatchedElseScopeContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(CmmParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CmmParser.NEWLINE, i);
		}
		public MatchedIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchedIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterMatchedIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitMatchedIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitMatchedIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchedIfContext matchedIf() throws RecognitionException {
		MatchedIfContext _localctx = new MatchedIfContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_matchedIf);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(681);
			match(IF);
			 System.out.println("Conditional : if"); 
			setState(683);
			expression();
			setState(684);
			matchedIfScope();
			setState(685);
			match(ELSE);
			 System.out.println("Conditional : else"); 
			setState(687);
			matchedElseScope();
			setState(691);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(688);
					match(NEWLINE);
					}
					} 
				}
				setState(693);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
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

	public static class UnmatchedIfContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(CmmParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MatchedIfScopeContext matchedIfScope() {
			return getRuleContext(MatchedIfScopeContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(CmmParser.ELSE, 0); }
		public UnmatchedIfScopeContext unmatchedIfScope() {
			return getRuleContext(UnmatchedIfScopeContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(CmmParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CmmParser.NEWLINE, i);
		}
		public SemicolonScopeContext semicolonScope() {
			return getRuleContext(SemicolonScopeContext.class,0);
		}
		public UnmatchedIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unmatchedIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterUnmatchedIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitUnmatchedIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitUnmatchedIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnmatchedIfContext unmatchedIf() throws RecognitionException {
		UnmatchedIfContext _localctx = new UnmatchedIfContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_unmatchedIf);
		try {
			int _alt;
			setState(712);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(694);
				match(IF);
				 System.out.println("Conditional : if"); 
				setState(696);
				expression();
				setState(697);
				matchedIfScope();
				setState(698);
				match(ELSE);
				 System.out.println("Conditional : else"); 
				setState(700);
				unmatchedIfScope();
				setState(704);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(701);
						match(NEWLINE);
						}
						} 
					}
					setState(706);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(707);
				match(IF);
				 System.out.println("Conditional : if"); 
				setState(709);
				expression();
				setState(710);
				semicolonScope();
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

	public static class ExpressionContext extends ParserRuleContext {
		public OrExpressionContext orExpression() {
			return getRuleContext(OrExpressionContext.class,0);
		}
		public Expression_Context expression_() {
			return getRuleContext(Expression_Context.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(714);
			orExpression();
			setState(715);
			expression_();
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

	public static class Expression_Context extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(CmmParser.ASSIGN, 0); }
		public OrExpressionContext orExpression() {
			return getRuleContext(OrExpressionContext.class,0);
		}
		public Expression_Context expression_() {
			return getRuleContext(Expression_Context.class,0);
		}
		public Expression_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterExpression_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitExpression_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitExpression_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression_Context expression_() throws RecognitionException {
		Expression_Context _localctx = new Expression_Context(_ctx, getState());
		enterRule(_localctx, 58, RULE_expression_);
		try {
			setState(722);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(717);
				match(ASSIGN);
				setState(718);
				orExpression();
				setState(719);
				expression_();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
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

	public static class OrExpressionContext extends ParserRuleContext {
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public OrExpression_Context orExpression_() {
			return getRuleContext(OrExpression_Context.class,0);
		}
		public OrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrExpressionContext orExpression() throws RecognitionException {
		OrExpressionContext _localctx = new OrExpressionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_orExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(724);
			andExpression();
			setState(725);
			orExpression_();
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

	public static class OrExpression_Context extends ParserRuleContext {
		public TerminalNode OR() { return getToken(CmmParser.OR, 0); }
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public OrExpression_Context orExpression_() {
			return getRuleContext(OrExpression_Context.class,0);
		}
		public OrExpression_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orExpression_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterOrExpression_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitOrExpression_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitOrExpression_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrExpression_Context orExpression_() throws RecognitionException {
		OrExpression_Context _localctx = new OrExpression_Context(_ctx, getState());
		enterRule(_localctx, 62, RULE_orExpression_);
		try {
			setState(733);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OR:
				enterOuterAlt(_localctx, 1);
				{
				setState(727);
				match(OR);
				setState(728);
				andExpression();
				 System.out.println("Operator : |"); 
				setState(730);
				orExpression_();
				}
				break;
			case COMMA:
			case BEGIN:
			case RPAR:
			case RBRACE:
			case SEMICOLON:
			case ASSIGN:
			case NEWLINE:
				enterOuterAlt(_localctx, 2);
				{
				{
				}
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

	public static class AndExpressionContext extends ParserRuleContext {
		public EqualExpressionContext equalExpression() {
			return getRuleContext(EqualExpressionContext.class,0);
		}
		public AndExpression_Context andExpression_() {
			return getRuleContext(AndExpression_Context.class,0);
		}
		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_andExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(735);
			equalExpression();
			setState(736);
			andExpression_();
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

	public static class AndExpression_Context extends ParserRuleContext {
		public TerminalNode AND() { return getToken(CmmParser.AND, 0); }
		public EqualExpressionContext equalExpression() {
			return getRuleContext(EqualExpressionContext.class,0);
		}
		public AndExpression_Context andExpression_() {
			return getRuleContext(AndExpression_Context.class,0);
		}
		public AndExpression_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpression_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterAndExpression_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitAndExpression_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitAndExpression_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndExpression_Context andExpression_() throws RecognitionException {
		AndExpression_Context _localctx = new AndExpression_Context(_ctx, getState());
		enterRule(_localctx, 66, RULE_andExpression_);
		try {
			setState(744);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AND:
				enterOuterAlt(_localctx, 1);
				{
				setState(738);
				match(AND);
				setState(739);
				equalExpression();
				 System.out.println("Operator : &"); 
				setState(741);
				andExpression_();
				}
				break;
			case COMMA:
			case BEGIN:
			case RPAR:
			case RBRACE:
			case SEMICOLON:
			case ASSIGN:
			case OR:
			case NEWLINE:
				enterOuterAlt(_localctx, 2);
				{
				{
				}
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

	public static class ArithmeticExpressionP2Context extends ParserRuleContext {
		public ArithmeticExpressionP1Context arithmeticExpressionP1() {
			return getRuleContext(ArithmeticExpressionP1Context.class,0);
		}
		public ArithmeticExpressionP2_Context arithmeticExpressionP2_() {
			return getRuleContext(ArithmeticExpressionP2_Context.class,0);
		}
		public ArithmeticExpressionP2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticExpressionP2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterArithmeticExpressionP2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitArithmeticExpressionP2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitArithmeticExpressionP2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithmeticExpressionP2Context arithmeticExpressionP2() throws RecognitionException {
		ArithmeticExpressionP2Context _localctx = new ArithmeticExpressionP2Context(_ctx, getState());
		enterRule(_localctx, 68, RULE_arithmeticExpressionP2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(746);
			arithmeticExpressionP1();
			setState(747);
			arithmeticExpressionP2_();
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

	public static class ArithmeticExpressionP2_Context extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(CmmParser.MINUS, 0); }
		public ArithmeticExpressionP1Context arithmeticExpressionP1() {
			return getRuleContext(ArithmeticExpressionP1Context.class,0);
		}
		public ArithmeticExpressionP2_Context arithmeticExpressionP2_() {
			return getRuleContext(ArithmeticExpressionP2_Context.class,0);
		}
		public TerminalNode PLUS() { return getToken(CmmParser.PLUS, 0); }
		public ArithmeticExpressionP2_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticExpressionP2_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterArithmeticExpressionP2_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitArithmeticExpressionP2_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitArithmeticExpressionP2_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithmeticExpressionP2_Context arithmeticExpressionP2_() throws RecognitionException {
		ArithmeticExpressionP2_Context _localctx = new ArithmeticExpressionP2_Context(_ctx, getState());
		enterRule(_localctx, 70, RULE_arithmeticExpressionP2_);
		try {
			setState(760);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(749);
				match(MINUS);
				setState(750);
				arithmeticExpressionP1();
				 System.out.println("Operator : -"); 
				setState(752);
				arithmeticExpressionP2_();
				}
				break;
			case PLUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(754);
				match(PLUS);
				setState(755);
				arithmeticExpressionP1();
				 System.out.println("Operator : +"); 
				setState(757);
				arithmeticExpressionP2_();
				}
				break;
			case COMMA:
			case BEGIN:
			case RPAR:
			case RBRACE:
			case SEMICOLON:
			case ASSIGN:
			case OR:
			case AND:
			case EQUAL:
			case LESS:
			case GREATER:
			case NEWLINE:
				enterOuterAlt(_localctx, 3);
				{
				{
				}
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

	public static class ArithmeticExpressionP1Context extends ParserRuleContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public ArithmeticExpressionP1_Context arithmeticExpressionP1_() {
			return getRuleContext(ArithmeticExpressionP1_Context.class,0);
		}
		public ArithmeticExpressionP1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticExpressionP1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterArithmeticExpressionP1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitArithmeticExpressionP1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitArithmeticExpressionP1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithmeticExpressionP1Context arithmeticExpressionP1() throws RecognitionException {
		ArithmeticExpressionP1Context _localctx = new ArithmeticExpressionP1Context(_ctx, getState());
		enterRule(_localctx, 72, RULE_arithmeticExpressionP1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(762);
			unaryExpression();
			setState(763);
			arithmeticExpressionP1_();
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

	public static class ArithmeticExpressionP1_Context extends ParserRuleContext {
		public TerminalNode MULTIPLY() { return getToken(CmmParser.MULTIPLY, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public ArithmeticExpressionP1_Context arithmeticExpressionP1_() {
			return getRuleContext(ArithmeticExpressionP1_Context.class,0);
		}
		public TerminalNode DIVIDE() { return getToken(CmmParser.DIVIDE, 0); }
		public ArithmeticExpressionP1_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticExpressionP1_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterArithmeticExpressionP1_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitArithmeticExpressionP1_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitArithmeticExpressionP1_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithmeticExpressionP1_Context arithmeticExpressionP1_() throws RecognitionException {
		ArithmeticExpressionP1_Context _localctx = new ArithmeticExpressionP1_Context(_ctx, getState());
		enterRule(_localctx, 74, RULE_arithmeticExpressionP1_);
		try {
			setState(776);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MULTIPLY:
				enterOuterAlt(_localctx, 1);
				{
				setState(765);
				match(MULTIPLY);
				setState(766);
				unaryExpression();
				 System.out.println("Operator : *"); 
				setState(768);
				arithmeticExpressionP1_();
				}
				break;
			case DIVIDE:
				enterOuterAlt(_localctx, 2);
				{
				setState(770);
				match(DIVIDE);
				setState(771);
				unaryExpression();
				 System.out.println("Operator : /"); 
				setState(773);
				arithmeticExpressionP1_();
				}
				break;
			case COMMA:
			case BEGIN:
			case RPAR:
			case RBRACE:
			case SEMICOLON:
			case ASSIGN:
			case OR:
			case AND:
			case PLUS:
			case MINUS:
			case EQUAL:
			case LESS:
			case GREATER:
			case NEWLINE:
				enterOuterAlt(_localctx, 3);
				{
				{
				}
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

	public static class EqualExpressionContext extends ParserRuleContext {
		public InequalityExpressionContext inequalityExpression() {
			return getRuleContext(InequalityExpressionContext.class,0);
		}
		public EqualExpression_Context equalExpression_() {
			return getRuleContext(EqualExpression_Context.class,0);
		}
		public EqualExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterEqualExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitEqualExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitEqualExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualExpressionContext equalExpression() throws RecognitionException {
		EqualExpressionContext _localctx = new EqualExpressionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_equalExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(778);
			inequalityExpression();
			setState(779);
			equalExpression_();
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

	public static class EqualExpression_Context extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(CmmParser.EQUAL, 0); }
		public InequalityExpressionContext inequalityExpression() {
			return getRuleContext(InequalityExpressionContext.class,0);
		}
		public EqualExpression_Context equalExpression_() {
			return getRuleContext(EqualExpression_Context.class,0);
		}
		public EqualExpression_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalExpression_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterEqualExpression_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitEqualExpression_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitEqualExpression_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualExpression_Context equalExpression_() throws RecognitionException {
		EqualExpression_Context _localctx = new EqualExpression_Context(_ctx, getState());
		enterRule(_localctx, 78, RULE_equalExpression_);
		try {
			setState(787);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EQUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(781);
				match(EQUAL);
				setState(782);
				inequalityExpression();
				 System.out.println("Operator : =="); 
				setState(784);
				equalExpression_();
				}
				break;
			case COMMA:
			case BEGIN:
			case RPAR:
			case RBRACE:
			case SEMICOLON:
			case ASSIGN:
			case OR:
			case AND:
			case NEWLINE:
				enterOuterAlt(_localctx, 2);
				{
				{
				}
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

	public static class InequalityExpressionContext extends ParserRuleContext {
		public ArithmeticExpressionP2Context arithmeticExpressionP2() {
			return getRuleContext(ArithmeticExpressionP2Context.class,0);
		}
		public InequalityExpression_Context inequalityExpression_() {
			return getRuleContext(InequalityExpression_Context.class,0);
		}
		public InequalityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inequalityExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterInequalityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitInequalityExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitInequalityExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InequalityExpressionContext inequalityExpression() throws RecognitionException {
		InequalityExpressionContext _localctx = new InequalityExpressionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_inequalityExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(789);
			arithmeticExpressionP2();
			setState(790);
			inequalityExpression_();
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

	public static class InequalityExpression_Context extends ParserRuleContext {
		public TerminalNode GREATER() { return getToken(CmmParser.GREATER, 0); }
		public ArithmeticExpressionP2Context arithmeticExpressionP2() {
			return getRuleContext(ArithmeticExpressionP2Context.class,0);
		}
		public InequalityExpression_Context inequalityExpression_() {
			return getRuleContext(InequalityExpression_Context.class,0);
		}
		public TerminalNode LESS() { return getToken(CmmParser.LESS, 0); }
		public InequalityExpression_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inequalityExpression_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterInequalityExpression_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitInequalityExpression_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitInequalityExpression_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InequalityExpression_Context inequalityExpression_() throws RecognitionException {
		InequalityExpression_Context _localctx = new InequalityExpression_Context(_ctx, getState());
		enterRule(_localctx, 82, RULE_inequalityExpression_);
		try {
			setState(803);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GREATER:
				enterOuterAlt(_localctx, 1);
				{
				setState(792);
				match(GREATER);
				setState(793);
				arithmeticExpressionP2();
				 System.out.println("Operator : >"); 
				setState(795);
				inequalityExpression_();
				}
				break;
			case LESS:
				enterOuterAlt(_localctx, 2);
				{
				setState(797);
				match(LESS);
				setState(798);
				arithmeticExpressionP2();
				 System.out.println("Operator : <"); 
				setState(800);
				inequalityExpression_();
				}
				break;
			case COMMA:
			case BEGIN:
			case RPAR:
			case RBRACE:
			case SEMICOLON:
			case ASSIGN:
			case OR:
			case AND:
			case EQUAL:
			case NEWLINE:
				enterOuterAlt(_localctx, 3);
				{
				{
				}
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

	public static class UnaryExpressionContext extends ParserRuleContext {
		public TerminalNode TILDA() { return getToken(CmmParser.TILDA, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(CmmParser.MINUS, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_unaryExpression);
		try {
			setState(814);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TILDA:
				enterOuterAlt(_localctx, 1);
				{
				setState(805);
				match(TILDA);
				setState(806);
				unaryExpression();
				 System.out.println("Operator : ~"); 
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(809);
				match(MINUS);
				setState(810);
				unaryExpression();
				 System.out.println("Operator : -"); 
				}
				break;
			case DISPLAY:
			case APPEND:
			case SIZE:
			case LPAR:
			case BOOL:
			case NUMBER:
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(813);
				factor();
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

	public static class Factor0Context extends ParserRuleContext {
		public Factor1Context factor1() {
			return getRuleContext(Factor1Context.class,0);
		}
		public Factor0Context factor0() {
			return getRuleContext(Factor0Context.class,0);
		}
		public TerminalNode LBRACE() { return getToken(CmmParser.LBRACE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(CmmParser.RBRACE, 0); }
		public Factor0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor0; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterFactor0(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitFactor0(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitFactor0(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Factor0Context factor0() throws RecognitionException {
		return factor0(0);
	}

	private Factor0Context factor0(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Factor0Context _localctx = new Factor0Context(_ctx, _parentState);
		Factor0Context _prevctx = _localctx;
		int _startState = 86;
		enterRecursionRule(_localctx, 86, RULE_factor0, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(817);
			factor1(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(826);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Factor0Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_factor0);
					setState(819);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(820);
					match(LBRACE);
					setState(821);
					expression();
					setState(822);
					match(RBRACE);
					}
					} 
				}
				setState(828);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
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

	public static class Factor1Context extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(CmmParser.NUMBER, 0); }
		public Factor1Context factor1() {
			return getRuleContext(Factor1Context.class,0);
		}
		public TerminalNode DOT() { return getToken(CmmParser.DOT, 0); }
		public Factor1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterFactor1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitFactor1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitFactor1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Factor1Context factor1() throws RecognitionException {
		return factor1(0);
	}

	private Factor1Context factor1(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Factor1Context _localctx = new Factor1Context(_ctx, _parentState);
		Factor1Context _prevctx = _localctx;
		int _startState = 88;
		enterRecursionRule(_localctx, 88, RULE_factor1, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(830);
			match(NUMBER);
			}
			_ctx.stop = _input.LT(-1);
			setState(836);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Factor1Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_factor1);
					setState(832);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(833);
					match(DOT);
					}
					} 
				}
				setState(838);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CmmParser.ID, 0); }
		public ListElementCallContext listElementCall() {
			return getRuleContext(ListElementCallContext.class,0);
		}
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public List<TerminalNode> LBRACE() { return getTokens(CmmParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(CmmParser.LBRACE, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(CmmParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(CmmParser.RBRACE, i);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_variable);
		int _la;
		try {
			setState(851);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(839);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(840);
				listElementCall();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(841);
				methodCall();
				setState(848);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACE) {
					{
					{
					setState(842);
					match(LBRACE);
					setState(843);
					expression();
					setState(844);
					match(RBRACE);
					}
					}
					setState(850);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public static class FactorContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(CmmParser.LPAR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RPAR() { return getToken(CmmParser.RPAR, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public List<ArgumentsContext> arguments() {
			return getRuleContexts(ArgumentsContext.class);
		}
		public ArgumentsContext arguments(int i) {
			return getRuleContext(ArgumentsContext.class,i);
		}
		public List<TerminalNode> LBRACE() { return getTokens(CmmParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(CmmParser.LBRACE, i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(CmmParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(CmmParser.RBRACE, i);
		}
		public TerminalNode NUMBER() { return getToken(CmmParser.NUMBER, 0); }
		public TerminalNode BOOL() { return getToken(CmmParser.BOOL, 0); }
		public ListElementCallContext listElementCall() {
			return getRuleContext(ListElementCallContext.class,0);
		}
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public TerminalNode ID() { return getToken(CmmParser.ID, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_factor);
		int _la;
		try {
			setState(893);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(853);
				match(LPAR);
				setState(854);
				expression();
				setState(855);
				match(RPAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(857);
				functionCall();
				setState(861);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LPAR) {
					{
					{
					setState(858);
					arguments();
					}
					}
					setState(863);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(870);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACE) {
					{
					{
					setState(864);
					match(LBRACE);
					setState(865);
					expression();
					setState(866);
					match(RBRACE);
					}
					}
					setState(872);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(873);
				match(NUMBER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(874);
				match(BOOL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(875);
				listElementCall();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(876);
				methodCall();
				setState(880);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LPAR) {
					{
					{
					setState(877);
					arguments();
					}
					}
					setState(882);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(889);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACE) {
					{
					{
					setState(883);
					match(LBRACE);
					setState(884);
					expression();
					setState(885);
					match(RBRACE);
					}
					}
					setState(891);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(892);
				match(ID);
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

	public static class MethodCallContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(CmmParser.DOT, 0); }
		public List<TerminalNode> ID() { return getTokens(CmmParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CmmParser.ID, i);
		}
		public ListElementCallContext listElementCall() {
			return getRuleContext(ListElementCallContext.class,0);
		}
		public MethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitMethodCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodCallContext methodCall() throws RecognitionException {
		MethodCallContext _localctx = new MethodCallContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_methodCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(897);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				{
				setState(895);
				match(ID);
				}
				break;
			case 2:
				{
				setState(896);
				listElementCall();
				}
				break;
			}
			setState(899);
			match(DOT);
			setState(900);
			match(ID);
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

	public static class VarDecContext extends ParserRuleContext {
		public Token ID;
		public VarTypeContext varType() {
			return getRuleContext(VarTypeContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(CmmParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CmmParser.ID, i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(CmmParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(CmmParser.ASSIGN, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CmmParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CmmParser.COMMA, i);
		}
		public VarDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterVarDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitVarDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitVarDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDecContext varDec() throws RecognitionException {
		VarDecContext _localctx = new VarDecContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_varDec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(902);
			varType();
			setState(903);
			((VarDecContext)_localctx).ID = match(ID);
			 System.out.println("VarDec : " + ((VarDecContext)_localctx).ID.getText()); 
			setState(907);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(905);
				match(ASSIGN);
				setState(906);
				expression();
				}
			}

			setState(918);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(909);
				match(COMMA);
				setState(910);
				((VarDecContext)_localctx).ID = match(ID);
				 System.out.println("VarDec : " + ((VarDecContext)_localctx).ID.getText()); 
				setState(914);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(912);
					match(ASSIGN);
					setState(913);
					expression();
					}
				}

				}
				}
				setState(920);
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

	public static class StatementContext extends ParserRuleContext {
		public VarDecContext varDec() {
			return getRuleContext(VarDecContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(CmmParser.ASSIGN, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_statement);
		try {
			setState(926);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FPTR:
			case STRUCT:
			case LIST:
			case TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(921);
				varDec();
				}
				break;
			case DISPLAY:
			case APPEND:
			case SIZE:
			case LPAR:
			case BOOL:
			case MINUS:
			case TILDA:
			case NUMBER:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(922);
				expression();
				{
				setState(923);
				match(ASSIGN);
				setState(924);
				expression();
				}
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

	public static class EndLineContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(CmmParser.NEWLINE, 0); }
		public TerminalNode SEMICOLON() { return getToken(CmmParser.SEMICOLON, 0); }
		public EndLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endLine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterEndLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitEndLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitEndLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndLineContext endLine() throws RecognitionException {
		EndLineContext _localctx = new EndLineContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_endLine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(928);
			_la = _input.LA(1);
			if ( !(_la==SEMICOLON || _la==NEWLINE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class ListElementCallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CmmParser.ID, 0); }
		public List<TerminalNode> LBRACE() { return getTokens(CmmParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(CmmParser.LBRACE, i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(CmmParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(CmmParser.RBRACE, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ListElementCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listElementCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterListElementCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitListElementCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitListElementCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListElementCallContext listElementCall() throws RecognitionException {
		ListElementCallContext _localctx = new ListElementCallContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_listElementCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(930);
			match(ID);
			setState(935); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(931);
				match(LBRACE);
				{
				setState(932);
				expression();
				}
				setState(933);
				match(RBRACE);
				}
				}
				setState(937); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LBRACE );
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

	public static class VarTypeContext extends ParserRuleContext {
		public ListFormatContext listFormat() {
			return getRuleContext(ListFormatContext.class,0);
		}
		public TerminalNode TYPE() { return getToken(CmmParser.TYPE, 0); }
		public FptrFormatContext fptrFormat() {
			return getRuleContext(FptrFormatContext.class,0);
		}
		public TerminalNode STRUCT() { return getToken(CmmParser.STRUCT, 0); }
		public TerminalNode ID() { return getToken(CmmParser.ID, 0); }
		public VarTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterVarType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitVarType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitVarType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarTypeContext varType() throws RecognitionException {
		VarTypeContext _localctx = new VarTypeContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_varType);
		try {
			setState(944);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LIST:
				enterOuterAlt(_localctx, 1);
				{
				setState(939);
				listFormat();
				}
				break;
			case TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(940);
				match(TYPE);
				}
				break;
			case FPTR:
				enterOuterAlt(_localctx, 3);
				{
				setState(941);
				fptrFormat();
				}
				break;
			case STRUCT:
				enterOuterAlt(_localctx, 4);
				{
				setState(942);
				match(STRUCT);
				setState(943);
				match(ID);
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

	public static class ListFormatContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(CmmParser.TYPE, 0); }
		public TerminalNode STRUCT() { return getToken(CmmParser.STRUCT, 0); }
		public TerminalNode ID() { return getToken(CmmParser.ID, 0); }
		public List<TerminalNode> LIST() { return getTokens(CmmParser.LIST); }
		public TerminalNode LIST(int i) {
			return getToken(CmmParser.LIST, i);
		}
		public List<TerminalNode> SHARP() { return getTokens(CmmParser.SHARP); }
		public TerminalNode SHARP(int i) {
			return getToken(CmmParser.SHARP, i);
		}
		public ListFormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listFormat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterListFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitListFormat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitListFormat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListFormatContext listFormat() throws RecognitionException {
		ListFormatContext _localctx = new ListFormatContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_listFormat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(948); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(946);
				match(LIST);
				setState(947);
				match(SHARP);
				}
				}
				setState(950); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LIST );
			setState(955);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPE:
				{
				setState(952);
				match(TYPE);
				}
				break;
			case STRUCT:
				{
				setState(953);
				match(STRUCT);
				setState(954);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class FptrFormatContext extends ParserRuleContext {
		public TerminalNode FPTR() { return getToken(CmmParser.FPTR, 0); }
		public TerminalNode LESS() { return getToken(CmmParser.LESS, 0); }
		public TerminalNode MINUS() { return getToken(CmmParser.MINUS, 0); }
		public List<TerminalNode> GREATER() { return getTokens(CmmParser.GREATER); }
		public TerminalNode GREATER(int i) {
			return getToken(CmmParser.GREATER, i);
		}
		public List<VarTypeContext> varType() {
			return getRuleContexts(VarTypeContext.class);
		}
		public VarTypeContext varType(int i) {
			return getRuleContext(VarTypeContext.class,i);
		}
		public List<TerminalNode> VOID() { return getTokens(CmmParser.VOID); }
		public TerminalNode VOID(int i) {
			return getToken(CmmParser.VOID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CmmParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CmmParser.COMMA, i);
		}
		public FptrFormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fptrFormat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterFptrFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitFptrFormat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitFptrFormat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FptrFormatContext fptrFormat() throws RecognitionException {
		FptrFormatContext _localctx = new FptrFormatContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_fptrFormat);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(957);
			match(FPTR);
			setState(958);
			match(LESS);
			setState(969);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FPTR:
			case STRUCT:
			case LIST:
			case TYPE:
				{
				setState(964);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(959);
						varType();
						setState(960);
						match(COMMA);
						}
						} 
					}
					setState(966);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
				}
				setState(967);
				varType();
				}
				break;
			case VOID:
				{
				setState(968);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(971);
			match(MINUS);
			setState(972);
			match(GREATER);
			setState(975);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FPTR:
			case STRUCT:
			case LIST:
			case TYPE:
				{
				setState(973);
				varType();
				}
				break;
			case VOID:
				{
				setState(974);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(977);
			match(GREATER);
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

	public static class SemicolonScopeContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(CmmParser.BEGIN, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(CmmParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CmmParser.NEWLINE, i);
		}
		public TerminalNode END() { return getToken(CmmParser.END, 0); }
		public TerminalNode SEMICOLON() { return getToken(CmmParser.SEMICOLON, 0); }
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
		public SemicolonScopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_semicolonScope; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterSemicolonScope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitSemicolonScope(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitSemicolonScope(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SemicolonScopeContext semicolonScope() throws RecognitionException {
		SemicolonScopeContext _localctx = new SemicolonScopeContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_semicolonScope);
		int _la;
		try {
			int _alt;
			setState(1003);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(979);
				match(BEGIN);
				setState(980);
				match(NEWLINE);
				setState(984);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DISPLAY) | (1L << APPEND) | (1L << SIZE) | (1L << DO) | (1L << WHILE) | (1L << FPTR) | (1L << STRUCT) | (1L << LIST) | (1L << RETURN) | (1L << IF) | (1L << LPAR) | (1L << TYPE) | (1L << BOOL) | (1L << MINUS) | (1L << TILDA) | (1L << NUMBER) | (1L << NEWLINE) | (1L << ID))) != 0)) {
					{
					{
					setState(981);
					body();
					}
					}
					setState(986);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(987);
				match(END);
				setState(988);
				_la = _input.LA(1);
				if ( !(_la==SEMICOLON || _la==NEWLINE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(989);
				match(NEWLINE);
				setState(993);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,110,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(990);
						match(NEWLINE);
						}
						} 
					}
					setState(995);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,110,_ctx);
				}
				setState(996);
				body();
				setState(1000);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(997);
						match(NEWLINE);
						}
						} 
					}
					setState(1002);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
				}
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

	public static class ScopeContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(CmmParser.BEGIN, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(CmmParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CmmParser.NEWLINE, i);
		}
		public TerminalNode END() { return getToken(CmmParser.END, 0); }
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
		public ScopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scope; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterScope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitScope(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitScope(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScopeContext scope() throws RecognitionException {
		ScopeContext _localctx = new ScopeContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_scope);
		int _la;
		try {
			int _alt;
			setState(1028);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1005);
				match(BEGIN);
				setState(1006);
				match(NEWLINE);
				setState(1010);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DISPLAY) | (1L << APPEND) | (1L << SIZE) | (1L << DO) | (1L << WHILE) | (1L << FPTR) | (1L << STRUCT) | (1L << LIST) | (1L << RETURN) | (1L << IF) | (1L << LPAR) | (1L << TYPE) | (1L << BOOL) | (1L << MINUS) | (1L << TILDA) | (1L << NUMBER) | (1L << NEWLINE) | (1L << ID))) != 0)) {
					{
					{
					setState(1007);
					body();
					}
					}
					setState(1012);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1013);
				match(END);
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1014);
				match(NEWLINE);
				setState(1018);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,114,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1015);
						match(NEWLINE);
						}
						} 
					}
					setState(1020);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,114,_ctx);
				}
				setState(1021);
				body();
				setState(1025);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1022);
						match(NEWLINE);
						}
						} 
					}
					setState(1027);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
				}
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 43:
			return factor0_sempred((Factor0Context)_localctx, predIndex);
		case 44:
			return factor1_sempred((Factor1Context)_localctx, predIndex);
		}
		return true;
	}
	private boolean factor0_sempred(Factor0Context _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean factor1_sempred(Factor1Context _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3-\u0409\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\3\2\7\2v\n\2\f\2\16"+
		"\2y\13\2\3\2\7\2|\n\2\f\2\16\2\177\13\2\3\2\7\2\u0082\n\2\f\2\16\2\u0085"+
		"\13\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\7\3\u0090\n\3\f\3\16\3\u0093"+
		"\13\3\3\3\3\3\3\3\3\3\3\3\5\3\u009a\n\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u00a2"+
		"\n\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\7\6\u00ac\n\6\f\6\16\6\u00af\13\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00bd\n\7\3\b\3\b"+
		"\3\b\3\b\3\b\5\b\u00c4\n\b\3\b\3\b\3\b\3\b\3\b\5\b\u00cb\n\b\7\b\u00cd"+
		"\n\b\f\b\16\b\u00d0\13\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\7"+
		"\n\u00dd\n\n\f\n\16\n\u00e0\13\n\3\n\3\n\7\n\u00e4\n\n\f\n\16\n\u00e7"+
		"\13\n\3\n\3\n\3\n\7\n\u00ec\n\n\f\n\16\n\u00ef\13\n\3\n\7\n\u00f2\n\n"+
		"\f\n\16\n\u00f5\13\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\5\13\u0103\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u010c"+
		"\n\13\3\f\3\f\3\f\3\f\6\f\u0112\n\f\r\f\16\f\u0113\3\f\7\f\u0117\n\f\f"+
		"\f\16\f\u011a\13\f\3\f\3\f\6\f\u011e\n\f\r\f\16\f\u011f\3\f\3\f\3\f\3"+
		"\f\6\f\u0126\n\f\r\f\16\f\u0127\3\f\7\f\u012b\n\f\f\f\16\f\u012e\13\f"+
		"\3\f\7\f\u0131\n\f\f\f\16\f\u0134\13\f\3\f\3\f\3\f\3\f\3\f\6\f\u013b\n"+
		"\f\r\f\16\f\u013c\3\f\7\f\u0140\n\f\f\f\16\f\u0143\13\f\3\f\3\f\6\f\u0147"+
		"\n\f\r\f\16\f\u0148\3\f\3\f\3\f\6\f\u014e\n\f\r\f\16\f\u014f\3\f\3\f\7"+
		"\f\u0154\n\f\f\f\16\f\u0157\13\f\3\f\3\f\3\f\6\f\u015c\n\f\r\f\16\f\u015d"+
		"\3\f\3\f\7\f\u0162\n\f\f\f\16\f\u0165\13\f\3\f\3\f\3\f\3\f\6\f\u016b\n"+
		"\f\r\f\16\f\u016c\3\f\7\f\u0170\n\f\f\f\16\f\u0173\13\f\3\f\7\f\u0176"+
		"\n\f\f\f\16\f\u0179\13\f\3\f\3\f\3\f\3\f\3\f\6\f\u0180\n\f\r\f\16\f\u0181"+
		"\3\f\3\f\7\f\u0186\n\f\f\f\16\f\u0189\13\f\3\f\3\f\3\f\6\f\u018e\n\f\r"+
		"\f\16\f\u018f\3\f\3\f\7\f\u0194\n\f\f\f\16\f\u0197\13\f\5\f\u0199\n\f"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u01a1\n\r\f\r\16\r\u01a4\13\r\3\r\3\r\3\r"+
		"\7\r\u01a9\n\r\f\r\16\r\u01ac\13\r\3\r\5\r\u01af\n\r\3\16\3\16\3\16\3"+
		"\16\3\16\6\16\u01b6\n\16\r\16\16\16\u01b7\3\16\3\16\3\16\7\16\u01bd\n"+
		"\16\f\16\16\16\u01c0\13\16\3\16\3\16\3\16\3\16\6\16\u01c6\n\16\r\16\16"+
		"\16\u01c7\3\16\3\16\7\16\u01cc\n\16\f\16\16\16\u01cf\13\16\5\16\u01d1"+
		"\n\16\3\17\3\17\3\17\6\17\u01d6\n\17\r\17\16\17\u01d7\3\17\3\17\3\17\6"+
		"\17\u01dd\n\17\r\17\16\17\u01de\3\17\3\17\3\17\6\17\u01e4\n\17\r\17\16"+
		"\17\u01e5\3\17\3\17\3\17\6\17\u01eb\n\17\r\17\16\17\u01ec\5\17\u01ef\n"+
		"\17\3\20\3\20\6\20\u01f3\n\20\r\20\16\20\u01f4\3\20\3\20\3\20\6\20\u01fa"+
		"\n\20\r\20\16\20\u01fb\3\20\3\20\3\20\6\20\u0201\n\20\r\20\16\20\u0202"+
		"\3\20\3\20\3\20\6\20\u0208\n\20\r\20\16\20\u0209\5\20\u020c\n\20\3\21"+
		"\3\21\3\21\3\21\7\21\u0212\n\21\f\21\16\21\u0215\13\21\3\21\3\21\3\21"+
		"\3\21\3\21\5\21\u021c\n\21\3\22\3\22\3\22\3\22\7\22\u0222\n\22\f\22\16"+
		"\22\u0225\13\22\3\22\3\22\3\22\3\22\3\22\5\22\u022c\n\22\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\24\5\24\u0237\n\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\7\25\u0242\n\25\f\25\16\25\u0245\13\25\3\25\3\25"+
		"\3\25\3\25\5\25\u024b\n\25\3\26\3\26\5\26\u024f\n\26\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u025d\n\27\3\30\3\30"+
		"\3\30\7\30\u0262\n\30\f\30\16\30\u0265\13\30\3\30\3\30\7\30\u0269\n\30"+
		"\f\30\16\30\u026c\13\30\3\30\3\30\3\30\7\30\u0271\n\30\f\30\16\30\u0274"+
		"\13\30\5\30\u0276\n\30\3\31\3\31\3\31\7\31\u027b\n\31\f\31\16\31\u027e"+
		"\13\31\3\31\3\31\3\31\3\31\3\31\7\31\u0285\n\31\f\31\16\31\u0288\13\31"+
		"\5\31\u028a\n\31\3\32\3\32\3\32\7\32\u028f\n\32\f\32\16\32\u0292\13\32"+
		"\3\32\7\32\u0295\n\32\f\32\16\32\u0298\13\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\7\32\u02a0\n\32\f\32\16\32\u02a3\13\32\5\32\u02a5\n\32\3\33\3\33"+
		"\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\7\34\u02b4\n\34"+
		"\f\34\16\34\u02b7\13\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u02c1"+
		"\n\35\f\35\16\35\u02c4\13\35\3\35\3\35\3\35\3\35\3\35\5\35\u02cb\n\35"+
		"\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\5\37\u02d5\n\37\3 \3 \3 \3!\3"+
		"!\3!\3!\3!\3!\5!\u02e0\n!\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\5#\u02eb\n#\3"+
		"$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u02fb\n%\3&\3&\3&\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u030b\n\'\3(\3(\3(\3)\3)\3)\3"+
		")\3)\3)\5)\u0316\n)\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u0326"+
		"\n+\3,\3,\3,\3,\3,\3,\3,\3,\3,\5,\u0331\n,\3-\3-\3-\3-\3-\3-\3-\3-\7-"+
		"\u033b\n-\f-\16-\u033e\13-\3.\3.\3.\3.\3.\7.\u0345\n.\f.\16.\u0348\13"+
		".\3/\3/\3/\3/\3/\3/\3/\7/\u0351\n/\f/\16/\u0354\13/\5/\u0356\n/\3\60\3"+
		"\60\3\60\3\60\3\60\3\60\7\60\u035e\n\60\f\60\16\60\u0361\13\60\3\60\3"+
		"\60\3\60\3\60\7\60\u0367\n\60\f\60\16\60\u036a\13\60\3\60\3\60\3\60\3"+
		"\60\3\60\7\60\u0371\n\60\f\60\16\60\u0374\13\60\3\60\3\60\3\60\3\60\7"+
		"\60\u037a\n\60\f\60\16\60\u037d\13\60\3\60\5\60\u0380\n\60\3\61\3\61\5"+
		"\61\u0384\n\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\5\62\u038e\n\62"+
		"\3\62\3\62\3\62\3\62\3\62\5\62\u0395\n\62\7\62\u0397\n\62\f\62\16\62\u039a"+
		"\13\62\3\63\3\63\3\63\3\63\3\63\5\63\u03a1\n\63\3\64\3\64\3\65\3\65\3"+
		"\65\3\65\3\65\6\65\u03aa\n\65\r\65\16\65\u03ab\3\66\3\66\3\66\3\66\3\66"+
		"\5\66\u03b3\n\66\3\67\3\67\6\67\u03b7\n\67\r\67\16\67\u03b8\3\67\3\67"+
		"\3\67\5\67\u03be\n\67\38\38\38\38\38\78\u03c5\n8\f8\168\u03c8\138\38\3"+
		"8\58\u03cc\n8\38\38\38\38\58\u03d2\n8\38\38\39\39\39\79\u03d9\n9\f9\16"+
		"9\u03dc\139\39\39\39\39\79\u03e2\n9\f9\169\u03e5\139\39\39\79\u03e9\n"+
		"9\f9\169\u03ec\139\59\u03ee\n9\3:\3:\3:\7:\u03f3\n:\f:\16:\u03f6\13:\3"+
		":\3:\3:\7:\u03fb\n:\f:\16:\u03fe\13:\3:\3:\7:\u0402\n:\f:\16:\u0405\13"+
		":\5:\u0407\n:\3:\2\4XZ;\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*"+
		",.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnpr\2\3\4\2\31\31**\2\u0467"+
		"\2w\3\2\2\2\4\u0099\3\2\2\2\6\u00a1\3\2\2\2\b\u00a3\3\2\2\2\n\u00a8\3"+
		"\2\2\2\f\u00bc\3\2\2\2\16\u00be\3\2\2\2\20\u00d3\3\2\2\2\22\u00f3\3\2"+
		"\2\2\24\u010b\3\2\2\2\26\u0198\3\2\2\2\30\u01ae\3\2\2\2\32\u01d0\3\2\2"+
		"\2\34\u01ee\3\2\2\2\36\u020b\3\2\2\2 \u021b\3\2\2\2\"\u022b\3\2\2\2$\u022d"+
		"\3\2\2\2&\u0236\3\2\2\2(\u024a\3\2\2\2*\u024e\3\2\2\2,\u025c\3\2\2\2."+
		"\u0275\3\2\2\2\60\u0289\3\2\2\2\62\u02a4\3\2\2\2\64\u02a6\3\2\2\2\66\u02ab"+
		"\3\2\2\28\u02ca\3\2\2\2:\u02cc\3\2\2\2<\u02d4\3\2\2\2>\u02d6\3\2\2\2@"+
		"\u02df\3\2\2\2B\u02e1\3\2\2\2D\u02ea\3\2\2\2F\u02ec\3\2\2\2H\u02fa\3\2"+
		"\2\2J\u02fc\3\2\2\2L\u030a\3\2\2\2N\u030c\3\2\2\2P\u0315\3\2\2\2R\u0317"+
		"\3\2\2\2T\u0325\3\2\2\2V\u0330\3\2\2\2X\u0332\3\2\2\2Z\u033f\3\2\2\2\\"+
		"\u0355\3\2\2\2^\u037f\3\2\2\2`\u0383\3\2\2\2b\u0388\3\2\2\2d\u03a0\3\2"+
		"\2\2f\u03a2\3\2\2\2h\u03a4\3\2\2\2j\u03b2\3\2\2\2l\u03b6\3\2\2\2n\u03bf"+
		"\3\2\2\2p\u03ed\3\2\2\2r\u0406\3\2\2\2tv\7*\2\2ut\3\2\2\2vy\3\2\2\2wu"+
		"\3\2\2\2wx\3\2\2\2x}\3\2\2\2yw\3\2\2\2z|\5\32\16\2{z\3\2\2\2|\177\3\2"+
		"\2\2}{\3\2\2\2}~\3\2\2\2~\u0083\3\2\2\2\177}\3\2\2\2\u0080\u0082\5\n\6"+
		"\2\u0081\u0080\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084"+
		"\3\2\2\2\u0084\u0086\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u0087\5\4\3\2\u0087"+
		"\u0088\7\2\2\3\u0088\3\3\2\2\2\u0089\u008a\7\17\2\2\u008a\u008b\b\3\1"+
		"\2\u008b\u008c\7\25\2\2\u008c\u008d\7\26\2\2\u008d\u0091\5r:\2\u008e\u0090"+
		"\7*\2\2\u008f\u008e\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f\3\2\2\2\u0091"+
		"\u0092\3\2\2\2\u0092\u009a\3\2\2\2\u0093\u0091\3\2\2\2\u0094\u0095\7\17"+
		"\2\2\u0095\u0096\b\3\1\2\u0096\u0097\7\25\2\2\u0097\u0098\7\26\2\2\u0098"+
		"\u009a\5\f\7\2\u0099\u0089\3\2\2\2\u0099\u0094\3\2\2\2\u009a\5\3\2\2\2"+
		"\u009b\u00a2\5l\67\2\u009c\u00a2\7\35\2\2\u009d\u009e\7\13\2\2\u009e\u00a2"+
		"\7+\2\2\u009f\u00a2\7\r\2\2\u00a0\u00a2\5n8\2\u00a1\u009b\3\2\2\2\u00a1"+
		"\u009c\3\2\2\2\u00a1\u009d\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a0\3\2"+
		"\2\2\u00a2\7\3\2\2\2\u00a3\u00a4\5\6\4\2\u00a4\u00a5\7+\2\2\u00a5\u00a6"+
		"\b\5\1\2\u00a6\u00a7\5\"\22\2\u00a7\t\3\2\2\2\u00a8\u00a9\5\b\5\2\u00a9"+
		"\u00ad\5r:\2\u00aa\u00ac\7*\2\2\u00ab\u00aa\3\2\2\2\u00ac\u00af\3\2\2"+
		"\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\13\3\2\2\2\u00af\u00ad"+
		"\3\2\2\2\u00b0\u00bd\5*\26\2\u00b1\u00b2\5\34\17\2\u00b2\u00b3\5f\64\2"+
		"\u00b3\u00bd\3\2\2\2\u00b4\u00b5\5&\24\2\u00b5\u00b6\5f\64\2\u00b6\u00bd"+
		"\3\2\2\2\u00b7\u00b8\5d\63\2\u00b8\u00b9\5f\64\2\u00b9\u00bd\3\2\2\2\u00ba"+
		"\u00bd\5(\25\2\u00bb\u00bd\7*\2\2\u00bc\u00b0\3\2\2\2\u00bc\u00b1\3\2"+
		"\2\2\u00bc\u00b4\3\2\2\2\u00bc\u00b7\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc"+
		"\u00bb\3\2\2\2\u00bd\r\3\2\2\2\u00be\u00bf\5j\66\2\u00bf\u00c0\7+\2\2"+
		"\u00c0\u00c3\b\b\1\2\u00c1\u00c2\7\32\2\2\u00c2\u00c4\5:\36\2\u00c3\u00c1"+
		"\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00ce\3\2\2\2\u00c5\u00c6\7\22\2\2"+
		"\u00c6\u00c7\7+\2\2\u00c7\u00ca\b\b\1\2\u00c8\u00c9\7\32\2\2\u00c9\u00cb"+
		"\5:\36\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cd\3\2\2\2\u00cc"+
		"\u00c5\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2"+
		"\2\2\u00cf\u00d1\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d2\5f\64\2\u00d2"+
		"\17\3\2\2\2\u00d3\u00d4\5\6\4\2\u00d4\u00d5\7+\2\2\u00d5\u00d6\b\t\1\2"+
		"\u00d6\u00d7\5\"\22\2\u00d7\21\3\2\2\2\u00d8\u00f2\5\16\b\2\u00d9\u00da"+
		"\5\20\t\2\u00da\u00de\7\24\2\2\u00db\u00dd\7*\2\2\u00dc\u00db\3\2\2\2"+
		"\u00dd\u00e0\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e1"+
		"\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1\u00e5\5\26\f\2\u00e2\u00e4\7*\2\2\u00e3"+
		"\u00e2\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2"+
		"\2\2\u00e6\u00e8\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00e9\7\23\2\2\u00e9"+
		"\u00ed\t\2\2\2\u00ea\u00ec\7*\2\2\u00eb\u00ea\3\2\2\2\u00ec\u00ef\3\2"+
		"\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00f2\3\2\2\2\u00ef"+
		"\u00ed\3\2\2\2\u00f0\u00f2\7*\2\2\u00f1\u00d8\3\2\2\2\u00f1\u00d9\3\2"+
		"\2\2\u00f1\u00f0\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3"+
		"\u00f4\3\2\2\2\u00f4\23\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u010c\5*\26"+
		"\2\u00f7\u00f8\5\34\17\2\u00f8\u00f9\5f\64\2\u00f9\u010c\3\2\2\2\u00fa"+
		"\u00fb\5\\/\2\u00fb\u00fc\7\32\2\2\u00fc\u00fd\5:\36\2\u00fd\u0103\3\2"+
		"\2\2\u00fe\u00ff\5`\61\2\u00ff\u0100\7\32\2\2\u0100\u0101\5:\36\2\u0101"+
		"\u0103\3\2\2\2\u0102\u00fa\3\2\2\2\u0102\u00fe\3\2\2\2\u0103\u0104\3\2"+
		"\2\2\u0104\u0105\5f\64\2\u0105\u010c\3\2\2\2\u0106\u010c\5(\25\2\u0107"+
		"\u0108\5&\24\2\u0108\u0109\5f\64\2\u0109\u010c\3\2\2\2\u010a\u010c\7*"+
		"\2\2\u010b\u00f6\3\2\2\2\u010b\u00f7\3\2\2\2\u010b\u0102\3\2\2\2\u010b"+
		"\u0106\3\2\2\2\u010b\u0107\3\2\2\2\u010b\u010a\3\2\2\2\u010c\25\3\2\2"+
		"\2\u010d\u010e\7\4\2\2\u010e\u010f\b\f\1\2\u010f\u0111\7\24\2\2\u0110"+
		"\u0112\7*\2\2\u0111\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0111\3\2"+
		"\2\2\u0113\u0114\3\2\2\2\u0114\u0118\3\2\2\2\u0115\u0117\5\f\7\2\u0116"+
		"\u0115\3\2\2\2\u0117\u011a\3\2\2\2\u0118\u0116\3\2\2\2\u0118\u0119\3\2"+
		"\2\2\u0119\u011b\3\2\2\2\u011a\u0118\3\2\2\2\u011b\u011d\7\23\2\2\u011c"+
		"\u011e\7*\2\2\u011d\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u011d\3\2"+
		"\2\2\u011f\u0120\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0122\7\3\2\2\u0122"+
		"\u0123\b\f\1\2\u0123\u0125\7\24\2\2\u0124\u0126\7*\2\2\u0125\u0124\3\2"+
		"\2\2\u0126\u0127\3\2\2\2\u0127\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128"+
		"\u012c\3\2\2\2\u0129\u012b\5\f\7\2\u012a\u0129\3\2\2\2\u012b\u012e\3\2"+
		"\2\2\u012c\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u0132\3\2\2\2\u012e"+
		"\u012c\3\2\2\2\u012f\u0131\7*\2\2\u0130\u012f\3\2\2\2\u0131\u0134\3\2"+
		"\2\2\u0132\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0135\3\2\2\2\u0134"+
		"\u0132\3\2\2\2\u0135\u0199\7\23\2\2\u0136\u0137\7\4\2\2\u0137\u0138\b"+
		"\f\1\2\u0138\u013a\7\24\2\2\u0139\u013b\7*\2\2\u013a\u0139\3\2\2\2\u013b"+
		"\u013c\3\2\2\2\u013c\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u0141\3\2"+
		"\2\2\u013e\u0140\5\f\7\2\u013f\u013e\3\2\2\2\u0140\u0143\3\2\2\2\u0141"+
		"\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0144\3\2\2\2\u0143\u0141\3\2"+
		"\2\2\u0144\u0146\7\23\2\2\u0145\u0147\7*\2\2\u0146\u0145\3\2\2\2\u0147"+
		"\u0148\3\2\2\2\u0148\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014a\3\2"+
		"\2\2\u014a\u014b\7\3\2\2\u014b\u014d\b\f\1\2\u014c\u014e\7*\2\2\u014d"+
		"\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u014d\3\2\2\2\u014f\u0150\3\2"+
		"\2\2\u0150\u0151\3\2\2\2\u0151\u0155\5\f\7\2\u0152\u0154\7*\2\2\u0153"+
		"\u0152\3\2\2\2\u0154\u0157\3\2\2\2\u0155\u0153\3\2\2\2\u0155\u0156\3\2"+
		"\2\2\u0156\u0199\3\2\2\2\u0157\u0155\3\2\2\2\u0158\u0159\7\4\2\2\u0159"+
		"\u015b\b\f\1\2\u015a\u015c\7*\2\2\u015b\u015a\3\2\2\2\u015c\u015d\3\2"+
		"\2\2\u015d\u015b\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u015f\3\2\2\2\u015f"+
		"\u0163\5\f\7\2\u0160\u0162\7*\2\2\u0161\u0160\3\2\2\2\u0162\u0165\3\2"+
		"\2\2\u0163\u0161\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0166\3\2\2\2\u0165"+
		"\u0163\3\2\2\2\u0166\u0167\7\3\2\2\u0167\u0168\b\f\1\2\u0168\u016a\7\24"+
		"\2\2\u0169\u016b\7*\2\2\u016a\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016c"+
		"\u016a\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u0171\3\2\2\2\u016e\u0170\5\f"+
		"\7\2\u016f\u016e\3\2\2\2\u0170\u0173\3\2\2\2\u0171\u016f\3\2\2\2\u0171"+
		"\u0172\3\2\2\2\u0172\u0177\3\2\2\2\u0173\u0171\3\2\2\2\u0174\u0176\7*"+
		"\2\2\u0175\u0174\3\2\2\2\u0176\u0179\3\2\2\2\u0177\u0175\3\2\2\2\u0177"+
		"\u0178\3\2\2\2\u0178\u017a\3\2\2\2\u0179\u0177\3\2\2\2\u017a\u017b\7\23"+
		"\2\2\u017b\u0199\3\2\2\2\u017c\u017d\7\4\2\2\u017d\u017f\b\f\1\2\u017e"+
		"\u0180\7*\2\2\u017f\u017e\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u017f\3\2"+
		"\2\2\u0181\u0182\3\2\2\2\u0182\u0183\3\2\2\2\u0183\u0187\5\f\7\2\u0184"+
		"\u0186\7*\2\2\u0185\u0184\3\2\2\2\u0186\u0189\3\2\2\2\u0187\u0185\3\2"+
		"\2\2\u0187\u0188\3\2\2\2\u0188\u018a\3\2\2\2\u0189\u0187\3\2\2\2\u018a"+
		"\u018b\7\3\2\2\u018b\u018d\b\f\1\2\u018c\u018e\7*\2\2\u018d\u018c\3\2"+
		"\2\2\u018e\u018f\3\2\2\2\u018f\u018d\3\2\2\2\u018f\u0190\3\2\2\2\u0190"+
		"\u0191\3\2\2\2\u0191\u0195\5\f\7\2\u0192\u0194\7*\2\2\u0193\u0192\3\2"+
		"\2\2\u0194\u0197\3\2\2\2\u0195\u0193\3\2\2\2\u0195\u0196\3\2\2\2\u0196"+
		"\u0199\3\2\2\2\u0197\u0195\3\2\2\2\u0198\u010d\3\2\2\2\u0198\u0136\3\2"+
		"\2\2\u0198\u0158\3\2\2\2\u0198\u017c\3\2\2\2\u0199\27\3\2\2\2\u019a\u01af"+
		"\5\16\b\2\u019b\u019c\5\20\t\2\u019c\u019d\7\24\2\2\u019d\u019e\7*\2\2"+
		"\u019e\u01a2\5\26\f\2\u019f\u01a1\7*\2\2\u01a0\u019f\3\2\2\2\u01a1\u01a4"+
		"\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a5\3\2\2\2\u01a4"+
		"\u01a2\3\2\2\2\u01a5\u01a6\7\23\2\2\u01a6\u01aa\t\2\2\2\u01a7\u01a9\7"+
		"*\2\2\u01a8\u01a7\3\2\2\2\u01a9\u01ac\3\2\2\2\u01aa\u01a8\3\2\2\2\u01aa"+
		"\u01ab\3\2\2\2\u01ab\u01af\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ad\u01af\7*"+
		"\2\2\u01ae\u019a\3\2\2\2\u01ae\u019b\3\2\2\2\u01ae\u01ad\3\2\2\2\u01af"+
		"\31\3\2\2\2\u01b0\u01b1\7\13\2\2\u01b1\u01b2\7+\2\2\u01b2\u01b3\b\16\1"+
		"\2\u01b3\u01b5\7\24\2\2\u01b4\u01b6\7*\2\2\u01b5\u01b4\3\2\2\2\u01b6\u01b7"+
		"\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9"+
		"\u01ba\5\22\n\2\u01ba\u01be\7\23\2\2\u01bb\u01bd\7*\2\2\u01bc\u01bb\3"+
		"\2\2\2\u01bd\u01c0\3\2\2\2\u01be\u01bc\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf"+
		"\u01d1\3\2\2\2\u01c0\u01be\3\2\2\2\u01c1\u01c2\7\13\2\2\u01c2\u01c3\7"+
		"+\2\2\u01c3\u01c5\b\16\1\2\u01c4\u01c6\7*\2\2\u01c5\u01c4\3\2\2\2\u01c6"+
		"\u01c7\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01c9\3\2"+
		"\2\2\u01c9\u01cd\5\30\r\2\u01ca\u01cc\7*\2\2\u01cb\u01ca\3\2\2\2\u01cc"+
		"\u01cf\3\2\2\2\u01cd\u01cb\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce\u01d1\3\2"+
		"\2\2\u01cf\u01cd\3\2\2\2\u01d0\u01b0\3\2\2\2\u01d0\u01c1\3\2\2\2\u01d1"+
		"\33\3\2\2\2\u01d2\u01d3\7+\2\2\u01d3\u01d5\b\17\1\2\u01d4\u01d6\5 \21"+
		"\2\u01d5\u01d4\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01d5\3\2\2\2\u01d7\u01d8"+
		"\3\2\2\2\u01d8\u01ef\3\2\2\2\u01d9\u01da\7\5\2\2\u01da\u01dc\b\17\1\2"+
		"\u01db\u01dd\5 \21\2\u01dc\u01db\3\2\2\2\u01dd\u01de\3\2\2\2\u01de\u01dc"+
		"\3\2\2\2\u01de\u01df\3\2\2\2\u01df\u01ef\3\2\2\2\u01e0\u01e1\7\7\2\2\u01e1"+
		"\u01e3\b\17\1\2\u01e2\u01e4\5 \21\2\u01e3\u01e2\3\2\2\2\u01e4\u01e5\3"+
		"\2\2\2\u01e5\u01e3\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01ef\3\2\2\2\u01e7"+
		"\u01e8\7\6\2\2\u01e8\u01ea\b\17\1\2\u01e9\u01eb\5 \21\2\u01ea\u01e9\3"+
		"\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ea\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed"+
		"\u01ef\3\2\2\2\u01ee\u01d2\3\2\2\2\u01ee\u01d9\3\2\2\2\u01ee\u01e0\3\2"+
		"\2\2\u01ee\u01e7\3\2\2\2\u01ef\35\3\2\2\2\u01f0\u01f2\7+\2\2\u01f1\u01f3"+
		"\5 \21\2\u01f2\u01f1\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01f2\3\2\2\2\u01f4"+
		"\u01f5\3\2\2\2\u01f5\u020c\3\2\2\2\u01f6\u01f7\7\5\2\2\u01f7\u01f9\b\20"+
		"\1\2\u01f8\u01fa\5 \21\2\u01f9\u01f8\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb"+
		"\u01f9\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fc\u020c\3\2\2\2\u01fd\u01fe\7\7"+
		"\2\2\u01fe\u0200\b\20\1\2\u01ff\u0201\5 \21\2\u0200\u01ff\3\2\2\2\u0201"+
		"\u0202\3\2\2\2\u0202\u0200\3\2\2\2\u0202\u0203\3\2\2\2\u0203\u020c\3\2"+
		"\2\2\u0204\u0205\7\6\2\2\u0205\u0207\b\20\1\2\u0206\u0208\5 \21\2\u0207"+
		"\u0206\3\2\2\2\u0208\u0209\3\2\2\2\u0209\u0207\3\2\2\2\u0209\u020a\3\2"+
		"\2\2\u020a\u020c\3\2\2\2\u020b\u01f0\3\2\2\2\u020b\u01f6\3\2\2\2\u020b"+
		"\u01fd\3\2\2\2\u020b\u0204\3\2\2\2\u020c\37\3\2\2\2\u020d\u0213\7\25\2"+
		"\2\u020e\u020f\5:\36\2\u020f\u0210\7\22\2\2\u0210\u0212\3\2\2\2\u0211"+
		"\u020e\3\2\2\2\u0212\u0215\3\2\2\2\u0213\u0211\3\2\2\2\u0213\u0214\3\2"+
		"\2\2\u0214\u0216\3\2\2\2\u0215\u0213\3\2\2\2\u0216\u0217\5:\36\2\u0217"+
		"\u0218\7\26\2\2\u0218\u021c\3\2\2\2\u0219\u021a\7\25\2\2\u021a\u021c\7"+
		"\26\2\2\u021b\u020d\3\2\2\2\u021b\u0219\3\2\2\2\u021c!\3\2\2\2\u021d\u0223"+
		"\7\25\2\2\u021e\u021f\5$\23\2\u021f\u0220\7\22\2\2\u0220\u0222\3\2\2\2"+
		"\u0221\u021e\3\2\2\2\u0222\u0225\3\2\2\2\u0223\u0221\3\2\2\2\u0223\u0224"+
		"\3\2\2\2\u0224\u0226\3\2\2\2\u0225\u0223\3\2\2\2\u0226\u0227\5$\23\2\u0227"+
		"\u0228\7\26\2\2\u0228\u022c\3\2\2\2\u0229\u022a\7\25\2\2\u022a\u022c\7"+
		"\26\2\2\u022b\u021d\3\2\2\2\u022b\u0229\3\2\2\2\u022c#\3\2\2\2\u022d\u022e"+
		"\5j\66\2\u022e\u022f\7+\2\2\u022f\u0230\b\23\1\2\u0230%\3\2\2\2\u0231"+
		"\u0232\7\16\2\2\u0232\u0233\b\24\1\2\u0233\u0237\5:\36\2\u0234\u0235\7"+
		"\16\2\2\u0235\u0237\b\24\1\2\u0236\u0231\3\2\2\2\u0236\u0234\3\2\2\2\u0237"+
		"\'\3\2\2\2\u0238\u0239\7\t\2\2\u0239\u023a\b\25\1\2\u023a\u023b\5:\36"+
		"\2\u023b\u023c\5p9\2\u023c\u024b\3\2\2\2\u023d\u023e\7\b\2\2\u023e\u023f"+
		"\b\25\1\2\u023f\u0243\5r:\2\u0240\u0242\7*\2\2\u0241\u0240\3\2\2\2\u0242"+
		"\u0245\3\2\2\2\u0243\u0241\3\2\2\2\u0243\u0244\3\2\2\2\u0244\u0246\3\2"+
		"\2\2\u0245\u0243\3\2\2\2\u0246\u0247\7\t\2\2\u0247\u0248\5:\36\2\u0248"+
		"\u0249\5f\64\2\u0249\u024b\3\2\2\2\u024a\u0238\3\2\2\2\u024a\u023d\3\2"+
		"\2\2\u024b)\3\2\2\2\u024c\u024f\5\66\34\2\u024d\u024f\58\35\2\u024e\u024c"+
		"\3\2\2\2\u024e\u024d\3\2\2\2\u024f+\3\2\2\2\u0250\u025d\5\66\34\2\u0251"+
		"\u0252\5\36\20\2\u0252\u0253\5f\64\2\u0253\u025d\3\2\2\2\u0254\u0255\5"+
		"&\24\2\u0255\u0256\5f\64\2\u0256\u025d\3\2\2\2\u0257\u0258\5d\63\2\u0258"+
		"\u0259\5f\64\2\u0259\u025d\3\2\2\2\u025a\u025d\5(\25\2\u025b\u025d\7*"+
		"\2\2\u025c\u0250\3\2\2\2\u025c\u0251\3\2\2\2\u025c\u0254\3\2\2\2\u025c"+
		"\u0257\3\2\2\2\u025c\u025a\3\2\2\2\u025c\u025b\3\2\2\2\u025d-\3\2\2\2"+
		"\u025e\u025f\7\24\2\2\u025f\u0263\7*\2\2\u0260\u0262\5\f\7\2\u0261\u0260"+
		"\3\2\2\2\u0262\u0265\3\2\2\2\u0263\u0261\3\2\2\2\u0263\u0264\3\2\2\2\u0264"+
		"\u0266\3\2\2\2\u0265\u0263\3\2\2\2\u0266\u026a\7\23\2\2\u0267\u0269\7"+
		"*\2\2\u0268\u0267\3\2\2\2\u0269\u026c\3\2\2\2\u026a\u0268\3\2\2\2\u026a"+
		"\u026b\3\2\2\2\u026b\u0276\3\2\2\2\u026c\u026a\3\2\2\2\u026d\u026e\7*"+
		"\2\2\u026e\u0272\5,\27\2\u026f\u0271\7*\2\2\u0270\u026f\3\2\2\2\u0271"+
		"\u0274\3\2\2\2\u0272\u0270\3\2\2\2\u0272\u0273\3\2\2\2\u0273\u0276\3\2"+
		"\2\2\u0274\u0272\3\2\2\2\u0275\u025e\3\2\2\2\u0275\u026d\3\2\2\2\u0276"+
		"/\3\2\2\2\u0277\u0278\7\24\2\2\u0278\u027c\7*\2\2\u0279\u027b\5\f\7\2"+
		"\u027a\u0279\3\2\2\2\u027b\u027e\3\2\2\2\u027c\u027a\3\2\2\2\u027c\u027d"+
		"\3\2\2\2\u027d\u027f\3\2\2\2\u027e\u027c\3\2\2\2\u027f\u0280\7\23\2\2"+
		"\u0280\u028a\t\2\2\2\u0281\u0282\7*\2\2\u0282\u0286\5,\27\2\u0283\u0285"+
		"\7*\2\2\u0284\u0283\3\2\2\2\u0285\u0288\3\2\2\2\u0286\u0284\3\2\2\2\u0286"+
		"\u0287\3\2\2\2\u0287\u028a\3\2\2\2\u0288\u0286\3\2\2\2\u0289\u0277\3\2"+
		"\2\2\u0289\u0281\3\2\2\2\u028a\61\3\2\2\2\u028b\u028c\7\24\2\2\u028c\u0290"+
		"\7*\2\2\u028d\u028f\5\f\7\2\u028e\u028d\3\2\2\2\u028f\u0292\3\2\2\2\u0290"+
		"\u028e\3\2\2\2\u0290\u0291\3\2\2\2\u0291\u0296\3\2\2\2\u0292\u0290\3\2"+
		"\2\2\u0293\u0295\7*\2\2\u0294\u0293\3\2\2\2\u0295\u0298\3\2\2\2\u0296"+
		"\u0294\3\2\2\2\u0296\u0297\3\2\2\2\u0297\u0299\3\2\2\2\u0298\u0296\3\2"+
		"\2\2\u0299\u029a\7\23\2\2\u029a\u02a5\t\2\2\2\u029b\u029c\7*\2\2\u029c"+
		"\u029d\58\35\2\u029d\u02a1\3\2\2\2\u029e\u02a0\7*\2\2\u029f\u029e\3\2"+
		"\2\2\u02a0\u02a3\3\2\2\2\u02a1\u029f\3\2\2\2\u02a1\u02a2\3\2\2\2\u02a2"+
		"\u02a5\3\2\2\2\u02a3\u02a1\3\2\2\2\u02a4\u028b\3\2\2\2\u02a4\u029b\3\2"+
		"\2\2\u02a5\63\3\2\2\2\u02a6\u02a7\7\20\2\2\u02a7\u02a8\b\33\1\2\u02a8"+
		"\u02a9\5:\36\2\u02a9\u02aa\5.\30\2\u02aa\65\3\2\2\2\u02ab\u02ac\7\20\2"+
		"\2\u02ac\u02ad\b\34\1\2\u02ad\u02ae\5:\36\2\u02ae\u02af\5.\30\2\u02af"+
		"\u02b0\7\21\2\2\u02b0\u02b1\b\34\1\2\u02b1\u02b5\5\60\31\2\u02b2\u02b4"+
		"\7*\2\2\u02b3\u02b2\3\2\2\2\u02b4\u02b7\3\2\2\2\u02b5\u02b3\3\2\2\2\u02b5"+
		"\u02b6\3\2\2\2\u02b6\67\3\2\2\2\u02b7\u02b5\3\2\2\2\u02b8\u02b9\7\20\2"+
		"\2\u02b9\u02ba\b\35\1\2\u02ba\u02bb\5:\36\2\u02bb\u02bc\5.\30\2\u02bc"+
		"\u02bd\7\21\2\2\u02bd\u02be\b\35\1\2\u02be\u02c2\5\62\32\2\u02bf\u02c1"+
		"\7*\2\2\u02c0\u02bf\3\2\2\2\u02c1\u02c4\3\2\2\2\u02c2\u02c0\3\2\2\2\u02c2"+
		"\u02c3\3\2\2\2\u02c3\u02cb\3\2\2\2\u02c4\u02c2\3\2\2\2\u02c5\u02c6\7\20"+
		"\2\2\u02c6\u02c7\b\35\1\2\u02c7\u02c8\5:\36\2\u02c8\u02c9\5p9\2\u02c9"+
		"\u02cb\3\2\2\2\u02ca\u02b8\3\2\2\2\u02ca\u02c5\3\2\2\2\u02cb9\3\2\2\2"+
		"\u02cc\u02cd\5> \2\u02cd\u02ce\5<\37\2\u02ce;\3\2\2\2\u02cf\u02d0\7\32"+
		"\2\2\u02d0\u02d1\5> \2\u02d1\u02d2\5<\37\2\u02d2\u02d5\3\2\2\2\u02d3\u02d5"+
		"\3\2\2\2\u02d4\u02cf\3\2\2\2\u02d4\u02d3\3\2\2\2\u02d5=\3\2\2\2\u02d6"+
		"\u02d7\5B\"\2\u02d7\u02d8\5@!\2\u02d8?\3\2\2\2\u02d9\u02da\7\37\2\2\u02da"+
		"\u02db\5B\"\2\u02db\u02dc\b!\1\2\u02dc\u02dd\5@!\2\u02dd\u02e0\3\2\2\2"+
		"\u02de\u02e0\3\2\2\2\u02df\u02d9\3\2\2\2\u02df\u02de\3\2\2\2\u02e0A\3"+
		"\2\2\2\u02e1\u02e2\5N(\2\u02e2\u02e3\5D#\2\u02e3C\3\2\2\2\u02e4\u02e5"+
		"\7 \2\2\u02e5\u02e6\5N(\2\u02e6\u02e7\b#\1\2\u02e7\u02e8\5D#\2\u02e8\u02eb"+
		"\3\2\2\2\u02e9\u02eb\3\2\2\2\u02ea\u02e4\3\2\2\2\u02ea\u02e9\3\2\2\2\u02eb"+
		"E\3\2\2\2\u02ec\u02ed\5J&\2\u02ed\u02ee\5H%\2\u02eeG\3\2\2\2\u02ef\u02f0"+
		"\7\"\2\2\u02f0\u02f1\5J&\2\u02f1\u02f2\b%\1\2\u02f2\u02f3\5H%\2\u02f3"+
		"\u02fb\3\2\2\2\u02f4\u02f5\7!\2\2\u02f5\u02f6\5J&\2\u02f6\u02f7\b%\1\2"+
		"\u02f7\u02f8\5H%\2\u02f8\u02fb\3\2\2\2\u02f9\u02fb\3\2\2\2\u02fa\u02ef"+
		"\3\2\2\2\u02fa\u02f4\3\2\2\2\u02fa\u02f9\3\2\2\2\u02fbI\3\2\2\2\u02fc"+
		"\u02fd\5V,\2\u02fd\u02fe\5L\'\2\u02feK\3\2\2\2\u02ff\u0300\7#\2\2\u0300"+
		"\u0301\5V,\2\u0301\u0302\b\'\1\2\u0302\u0303\5L\'\2\u0303\u030b\3\2\2"+
		"\2\u0304\u0305\7$\2\2\u0305\u0306\5V,\2\u0306\u0307\b\'\1\2\u0307\u0308"+
		"\5L\'\2\u0308\u030b\3\2\2\2\u0309\u030b\3\2\2\2\u030a\u02ff\3\2\2\2\u030a"+
		"\u0304\3\2\2\2\u030a\u0309\3\2\2\2\u030bM\3\2\2\2\u030c\u030d\5R*\2\u030d"+
		"\u030e\5P)\2\u030eO\3\2\2\2\u030f\u0310\7%\2\2\u0310\u0311\5R*\2\u0311"+
		"\u0312\b)\1\2\u0312\u0313\5P)\2\u0313\u0316\3\2\2\2\u0314\u0316\3\2\2"+
		"\2\u0315\u030f\3\2\2\2\u0315\u0314\3\2\2\2\u0316Q\3\2\2\2\u0317\u0318"+
		"\5F$\2\u0318\u0319\5T+\2\u0319S\3\2\2\2\u031a\u031b\7\'\2\2\u031b\u031c"+
		"\5F$\2\u031c\u031d\b+\1\2\u031d\u031e\5T+\2\u031e\u0326\3\2\2\2\u031f"+
		"\u0320\7&\2\2\u0320\u0321\5F$\2\u0321\u0322\b+\1\2\u0322\u0323\5T+\2\u0323"+
		"\u0326\3\2\2\2\u0324\u0326\3\2\2\2\u0325\u031a\3\2\2\2\u0325\u031f\3\2"+
		"\2\2\u0325\u0324\3\2\2\2\u0326U\3\2\2\2\u0327\u0328\7(\2\2\u0328\u0329"+
		"\5V,\2\u0329\u032a\b,\1\2\u032a\u0331\3\2\2\2\u032b\u032c\7\"\2\2\u032c"+
		"\u032d\5V,\2\u032d\u032e\b,\1\2\u032e\u0331\3\2\2\2\u032f\u0331\5^\60"+
		"\2\u0330\u0327\3\2\2\2\u0330\u032b\3\2\2\2\u0330\u032f\3\2\2\2\u0331W"+
		"\3\2\2\2\u0332\u0333\b-\1\2\u0333\u0334\5Z.\2\u0334\u033c\3\2\2\2\u0335"+
		"\u0336\f\4\2\2\u0336\u0337\7\27\2\2\u0337\u0338\5:\36\2\u0338\u0339\7"+
		"\30\2\2\u0339\u033b\3\2\2\2\u033a\u0335\3\2\2\2\u033b\u033e\3\2\2\2\u033c"+
		"\u033a\3\2\2\2\u033c\u033d\3\2\2\2\u033dY\3\2\2\2\u033e\u033c\3\2\2\2"+
		"\u033f\u0340\b.\1\2\u0340\u0341\7)\2\2\u0341\u0346\3\2\2\2\u0342\u0343"+
		"\f\4\2\2\u0343\u0345\7\34\2\2\u0344\u0342\3\2\2\2\u0345\u0348\3\2\2\2"+
		"\u0346\u0344\3\2\2\2\u0346\u0347\3\2\2\2\u0347[\3\2\2\2\u0348\u0346\3"+
		"\2\2\2\u0349\u0356\7+\2\2\u034a\u0356\5h\65\2\u034b\u0352\5`\61\2\u034c"+
		"\u034d\7\27\2\2\u034d\u034e\5:\36\2\u034e\u034f\7\30\2\2\u034f\u0351\3"+
		"\2\2\2\u0350\u034c\3\2\2\2\u0351\u0354\3\2\2\2\u0352\u0350\3\2\2\2\u0352"+
		"\u0353\3\2\2\2\u0353\u0356\3\2\2\2\u0354\u0352\3\2\2\2\u0355\u0349\3\2"+
		"\2\2\u0355\u034a\3\2\2\2\u0355\u034b\3\2\2\2\u0356]\3\2\2\2\u0357\u0358"+
		"\7\25\2\2\u0358\u0359\5:\36\2\u0359\u035a\7\26\2\2\u035a\u0380\3\2\2\2"+
		"\u035b\u035f\5\36\20\2\u035c\u035e\5 \21\2\u035d\u035c\3\2\2\2\u035e\u0361"+
		"\3\2\2\2\u035f\u035d\3\2\2\2\u035f\u0360\3\2\2\2\u0360\u0368\3\2\2\2\u0361"+
		"\u035f\3\2\2\2\u0362\u0363\7\27\2\2\u0363\u0364\5:\36\2\u0364\u0365\7"+
		"\30\2\2\u0365\u0367\3\2\2\2\u0366\u0362\3\2\2\2\u0367\u036a\3\2\2\2\u0368"+
		"\u0366\3\2\2\2\u0368\u0369\3\2\2\2\u0369\u0380\3\2\2\2\u036a\u0368\3\2"+
		"\2\2\u036b\u0380\7)\2\2\u036c\u0380\7\36\2\2\u036d\u0380\5h\65\2\u036e"+
		"\u0372\5`\61\2\u036f\u0371\5 \21\2\u0370\u036f\3\2\2\2\u0371\u0374\3\2"+
		"\2\2\u0372\u0370\3\2\2\2\u0372\u0373\3\2\2\2\u0373\u037b\3\2\2\2\u0374"+
		"\u0372\3\2\2\2\u0375\u0376\7\27\2\2\u0376\u0377\5:\36\2\u0377\u0378\7"+
		"\30\2\2\u0378\u037a\3\2\2\2\u0379\u0375\3\2\2\2\u037a\u037d\3\2\2\2\u037b"+
		"\u0379\3\2\2\2\u037b\u037c\3\2\2\2\u037c\u0380\3\2\2\2\u037d\u037b\3\2"+
		"\2\2\u037e\u0380\7+\2\2\u037f\u0357\3\2\2\2\u037f\u035b\3\2\2\2\u037f"+
		"\u036b\3\2\2\2\u037f\u036c\3\2\2\2\u037f\u036d\3\2\2\2\u037f\u036e\3\2"+
		"\2\2\u037f\u037e\3\2\2\2\u0380_\3\2\2\2\u0381\u0384\7+\2\2\u0382\u0384"+
		"\5h\65\2\u0383\u0381\3\2\2\2\u0383\u0382\3\2\2\2\u0384\u0385\3\2\2\2\u0385"+
		"\u0386\7\34\2\2\u0386\u0387\7+\2\2\u0387a\3\2\2\2\u0388\u0389\5j\66\2"+
		"\u0389\u038a\7+\2\2\u038a\u038d\b\62\1\2\u038b\u038c\7\32\2\2\u038c\u038e"+
		"\5:\36\2\u038d\u038b\3\2\2\2\u038d\u038e\3\2\2\2\u038e\u0398\3\2\2\2\u038f"+
		"\u0390\7\22\2\2\u0390\u0391\7+\2\2\u0391\u0394\b\62\1\2\u0392\u0393\7"+
		"\32\2\2\u0393\u0395\5:\36\2\u0394\u0392\3\2\2\2\u0394\u0395\3\2\2\2\u0395"+
		"\u0397\3\2\2\2\u0396\u038f\3\2\2\2\u0397\u039a\3\2\2\2\u0398\u0396\3\2"+
		"\2\2\u0398\u0399\3\2\2\2\u0399c\3\2\2\2\u039a\u0398\3\2\2\2\u039b\u03a1"+
		"\5b\62\2\u039c\u039d\5:\36\2\u039d\u039e\7\32\2\2\u039e\u039f\5:\36\2"+
		"\u039f\u03a1\3\2\2\2\u03a0\u039b\3\2\2\2\u03a0\u039c\3\2\2\2\u03a1e\3"+
		"\2\2\2\u03a2\u03a3\t\2\2\2\u03a3g\3\2\2\2\u03a4\u03a9\7+\2\2\u03a5\u03a6"+
		"\7\27\2\2\u03a6\u03a7\5:\36\2\u03a7\u03a8\7\30\2\2\u03a8\u03aa\3\2\2\2"+
		"\u03a9\u03a5\3\2\2\2\u03aa\u03ab\3\2\2\2\u03ab\u03a9\3\2\2\2\u03ab\u03ac"+
		"\3\2\2\2\u03aci\3\2\2\2\u03ad\u03b3\5l\67\2\u03ae\u03b3\7\35\2\2\u03af"+
		"\u03b3\5n8\2\u03b0\u03b1\7\13\2\2\u03b1\u03b3\7+\2\2\u03b2\u03ad\3\2\2"+
		"\2\u03b2\u03ae\3\2\2\2\u03b2\u03af\3\2\2\2\u03b2\u03b0\3\2\2\2\u03b3k"+
		"\3\2\2\2\u03b4\u03b5\7\f\2\2\u03b5\u03b7\7\33\2\2\u03b6\u03b4\3\2\2\2"+
		"\u03b7\u03b8\3\2\2\2\u03b8\u03b6\3\2\2\2\u03b8\u03b9\3\2\2\2\u03b9\u03bd"+
		"\3\2\2\2\u03ba\u03be\7\35\2\2\u03bb\u03bc\7\13\2\2\u03bc\u03be\7+\2\2"+
		"\u03bd\u03ba\3\2\2\2\u03bd\u03bb\3\2\2\2\u03bem\3\2\2\2\u03bf\u03c0\7"+
		"\n\2\2\u03c0\u03cb\7&\2\2\u03c1\u03c2\5j\66\2\u03c2\u03c3\7\22\2\2\u03c3"+
		"\u03c5\3\2\2\2\u03c4\u03c1\3\2\2\2\u03c5\u03c8\3\2\2\2\u03c6\u03c4\3\2"+
		"\2\2\u03c6\u03c7\3\2\2\2\u03c7\u03c9\3\2\2\2\u03c8\u03c6\3\2\2\2\u03c9"+
		"\u03cc\5j\66\2\u03ca\u03cc\7\r\2\2\u03cb\u03c6\3\2\2\2\u03cb\u03ca\3\2"+
		"\2\2\u03cc\u03cd\3\2\2\2\u03cd\u03ce\7\"\2\2\u03ce\u03d1\7\'\2\2\u03cf"+
		"\u03d2\5j\66\2\u03d0\u03d2\7\r\2\2\u03d1\u03cf\3\2\2\2\u03d1\u03d0\3\2"+
		"\2\2\u03d2\u03d3\3\2\2\2\u03d3\u03d4\7\'\2\2\u03d4o\3\2\2\2\u03d5\u03d6"+
		"\7\24\2\2\u03d6\u03da\7*\2\2\u03d7\u03d9\5\f\7\2\u03d8\u03d7\3\2\2\2\u03d9"+
		"\u03dc\3\2\2\2\u03da\u03d8\3\2\2\2\u03da\u03db\3\2\2\2\u03db\u03dd\3\2"+
		"\2\2\u03dc\u03da\3\2\2\2\u03dd\u03de\7\23\2\2\u03de\u03ee\t\2\2\2\u03df"+
		"\u03e3\7*\2\2\u03e0\u03e2\7*\2\2\u03e1\u03e0\3\2\2\2\u03e2\u03e5\3\2\2"+
		"\2\u03e3\u03e1\3\2\2\2\u03e3\u03e4\3\2\2\2\u03e4\u03e6\3\2\2\2\u03e5\u03e3"+
		"\3\2\2\2\u03e6\u03ea\5\f\7\2\u03e7\u03e9\7*\2\2\u03e8\u03e7\3\2\2\2\u03e9"+
		"\u03ec\3\2\2\2\u03ea\u03e8\3\2\2\2\u03ea\u03eb\3\2\2\2\u03eb\u03ee\3\2"+
		"\2\2\u03ec\u03ea\3\2\2\2\u03ed\u03d5\3\2\2\2\u03ed\u03df\3\2\2\2\u03ee"+
		"q\3\2\2\2\u03ef\u03f0\7\24\2\2\u03f0\u03f4\7*\2\2\u03f1\u03f3\5\f\7\2"+
		"\u03f2\u03f1\3\2\2\2\u03f3\u03f6\3\2\2\2\u03f4\u03f2\3\2\2\2\u03f4\u03f5"+
		"\3\2\2\2\u03f5\u03f7\3\2\2\2\u03f6\u03f4\3\2\2\2\u03f7\u0407\7\23\2\2"+
		"\u03f8\u03fc\7*\2\2\u03f9\u03fb\7*\2\2\u03fa\u03f9\3\2\2\2\u03fb\u03fe"+
		"\3\2\2\2\u03fc\u03fa\3\2\2\2\u03fc\u03fd\3\2\2\2\u03fd\u03ff\3\2\2\2\u03fe"+
		"\u03fc\3\2\2\2\u03ff\u0403\5\f\7\2\u0400\u0402\7*\2\2\u0401\u0400\3\2"+
		"\2\2\u0402\u0405\3\2\2\2\u0403\u0401\3\2\2\2\u0403\u0404\3\2\2\2\u0404"+
		"\u0407\3\2\2\2\u0405\u0403\3\2\2\2\u0406\u03ef\3\2\2\2\u0406\u03f8\3\2"+
		"\2\2\u0407s\3\2\2\2ww}\u0083\u0091\u0099\u00a1\u00ad\u00bc\u00c3\u00ca"+
		"\u00ce\u00de\u00e5\u00ed\u00f1\u00f3\u0102\u010b\u0113\u0118\u011f\u0127"+
		"\u012c\u0132\u013c\u0141\u0148\u014f\u0155\u015d\u0163\u016c\u0171\u0177"+
		"\u0181\u0187\u018f\u0195\u0198\u01a2\u01aa\u01ae\u01b7\u01be\u01c7\u01cd"+
		"\u01d0\u01d7\u01de\u01e5\u01ec\u01ee\u01f4\u01fb\u0202\u0209\u020b\u0213"+
		"\u021b\u0223\u022b\u0236\u0243\u024a\u024e\u025c\u0263\u026a\u0272\u0275"+
		"\u027c\u0286\u0289\u0290\u0296\u02a1\u02a4\u02b5\u02c2\u02ca\u02d4\u02df"+
		"\u02ea\u02fa\u030a\u0315\u0325\u0330\u033c\u0346\u0352\u0355\u035f\u0368"+
		"\u0372\u037b\u037f\u0383\u038d\u0394\u0398\u03a0\u03ab\u03b2\u03b8\u03bd"+
		"\u03c6\u03cb\u03d1\u03da\u03e3\u03ea\u03ed\u03f4\u03fc\u0403\u0406";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}