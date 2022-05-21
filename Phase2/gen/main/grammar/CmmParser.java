// Generated from /home/kimiya/Programming/Uni/PLC/Phase2/Phase2/src/main/grammar/Cmm.g4 by ANTLR 4.9.1
package main.grammar;

     import main.ast.nodes.*;
     import main.ast.nodes.declaration.*;
     import main.ast.nodes.declaration.struct.*;
     import main.ast.nodes.expression.*;
     import main.ast.nodes.expression.operators.*;
     import main.ast.nodes.expression.values.*;
     import main.ast.nodes.expression.values.primitive.*;
     import main.ast.nodes.statement.*;
     import main.ast.types.*;
     import main.ast.types.primitives.*;
     import java.util.*;
 
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
		MAIN=1, RETURN=2, VOID=3, SIZE=4, DISPLAY=5, APPEND=6, IF=7, ELSE=8, PLUS=9, 
		MINUS=10, MULT=11, DIVIDE=12, EQUAL=13, ARROW=14, GREATER_THAN=15, LESS_THAN=16, 
		AND=17, OR=18, NOT=19, TRUE=20, FALSE=21, BEGIN=22, END=23, INT=24, BOOL=25, 
		LIST=26, STRUCT=27, FPTR=28, GET=29, SET=30, WHILE=31, DO=32, ASSIGN=33, 
		SHARP=34, LPAR=35, RPAR=36, LBRACK=37, RBRACK=38, COMMA=39, DOT=40, SEMICOLON=41, 
		NEWLINE=42, INT_VALUE=43, IDENTIFIER=44, COMMENT=45, WS=46;
	public static final int
		RULE_cmm = 0, RULE_program = 1, RULE_main = 2, RULE_structDeclaration = 3, 
		RULE_singleVarWithGetAndSet = 4, RULE_singleStatementStructBody = 5, RULE_structBody = 6, 
		RULE_getBody = 7, RULE_setBody = 8, RULE_functionDeclaration = 9, RULE_functionArgsDec = 10, 
		RULE_functionArguments = 11, RULE_body = 12, RULE_loopCondBody = 13, RULE_blockStatement = 14, 
		RULE_varDecStatement = 15, RULE_functionCallStmt = 16, RULE_returnStatement = 17, 
		RULE_ifStatement = 18, RULE_elseStatement = 19, RULE_loopStatement = 20, 
		RULE_whileLoopStatement = 21, RULE_doWhileLoopStatement = 22, RULE_displayStatement = 23, 
		RULE_assignmentStatement = 24, RULE_singleStatement = 25, RULE_expression = 26, 
		RULE_orExpression = 27, RULE_andExpression = 28, RULE_equalityExpression = 29, 
		RULE_relationalExpression = 30, RULE_additiveExpression = 31, RULE_multiplicativeExpression = 32, 
		RULE_preUnaryExpression = 33, RULE_accessExpression = 34, RULE_otherExpression = 35, 
		RULE_size = 36, RULE_append = 37, RULE_value = 38, RULE_boolValue = 39, 
		RULE_identifier = 40, RULE_type = 41, RULE_fptrType = 42;
	private static String[] makeRuleNames() {
		return new String[] {
			"cmm", "program", "main", "structDeclaration", "singleVarWithGetAndSet", 
			"singleStatementStructBody", "structBody", "getBody", "setBody", "functionDeclaration", 
			"functionArgsDec", "functionArguments", "body", "loopCondBody", "blockStatement", 
			"varDecStatement", "functionCallStmt", "returnStatement", "ifStatement", 
			"elseStatement", "loopStatement", "whileLoopStatement", "doWhileLoopStatement", 
			"displayStatement", "assignmentStatement", "singleStatement", "expression", 
			"orExpression", "andExpression", "equalityExpression", "relationalExpression", 
			"additiveExpression", "multiplicativeExpression", "preUnaryExpression", 
			"accessExpression", "otherExpression", "size", "append", "value", "boolValue", 
			"identifier", "type", "fptrType"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'main'", "'return'", "'void'", "'size'", "'display'", "'append'", 
			"'if'", "'else'", "'+'", "'-'", "'*'", "'/'", "'=='", "'->'", "'>'", 
			"'<'", "'&'", "'|'", "'~'", "'true'", "'false'", "'begin'", "'end'", 
			"'int'", "'bool'", "'list'", "'struct'", "'fptr'", "'get'", "'set'", 
			"'while'", "'do'", "'='", "'#'", "'('", "')'", "'['", "']'", "','", "'.'", 
			"';'", "'\n'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "MAIN", "RETURN", "VOID", "SIZE", "DISPLAY", "APPEND", "IF", "ELSE", 
			"PLUS", "MINUS", "MULT", "DIVIDE", "EQUAL", "ARROW", "GREATER_THAN", 
			"LESS_THAN", "AND", "OR", "NOT", "TRUE", "FALSE", "BEGIN", "END", "INT", 
			"BOOL", "LIST", "STRUCT", "FPTR", "GET", "SET", "WHILE", "DO", "ASSIGN", 
			"SHARP", "LPAR", "RPAR", "LBRACK", "RBRACK", "COMMA", "DOT", "SEMICOLON", 
			"NEWLINE", "INT_VALUE", "IDENTIFIER", "COMMENT", "WS"
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
		public Program cmmProgram;
		public ProgramContext p;
		public TerminalNode EOF() { return getToken(CmmParser.EOF, 0); }
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(CmmParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CmmParser.NEWLINE, i);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(86);
				match(NEWLINE);
				}
				}
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(92);
			((CmmContext)_localctx).p = program();
			((CmmContext)_localctx).cmmProgram =  ((CmmContext)_localctx).p.programRet;
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(94);
				match(NEWLINE);
				}
				}
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(100);
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

	public static class ProgramContext extends ParserRuleContext {
		public Program programRet;
		public StructDeclarationContext s;
		public FunctionDeclarationContext f;
		public MainContext m;
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public List<StructDeclarationContext> structDeclaration() {
			return getRuleContexts(StructDeclarationContext.class);
		}
		public StructDeclarationContext structDeclaration(int i) {
			return getRuleContext(StructDeclarationContext.class,i);
		}
		public List<FunctionDeclarationContext> functionDeclaration() {
			return getRuleContexts(FunctionDeclarationContext.class);
		}
		public FunctionDeclarationContext functionDeclaration(int i) {
			return getRuleContext(FunctionDeclarationContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_program);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{

			    ((ProgramContext)_localctx).programRet =  new Program();
			     int line = 1;
			     _localctx.programRet.setLine(line);
			//     {System.out.println("New Program Is created.");}
			     
			setState(108);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(103);
					((ProgramContext)_localctx).s = structDeclaration();
					_localctx.programRet.addStruct(((ProgramContext)_localctx).s.structDeclarationRet);
					}
					} 
				}
				setState(110);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VOID) | (1L << INT) | (1L << BOOL) | (1L << LIST) | (1L << STRUCT) | (1L << FPTR))) != 0)) {
				{
				{
				setState(111);
				((ProgramContext)_localctx).f = functionDeclaration();
				_localctx.programRet.addFunction(((ProgramContext)_localctx).f.functionDeclarationRet);
				}
				}
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(119);
			((ProgramContext)_localctx).m = main();
			_localctx.programRet.setMain(((ProgramContext)_localctx).m.mainRet);
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
		public MainDeclaration mainRet;
		public Token MAIN;
		public BodyContext b;
		public TerminalNode MAIN() { return getToken(CmmParser.MAIN, 0); }
		public TerminalNode LPAR() { return getToken(CmmParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(CmmParser.RPAR, 0); }
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
		enterRule(_localctx, 4, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			((MainContext)_localctx).mainRet =  new MainDeclaration();
			setState(123);
			((MainContext)_localctx).MAIN = match(MAIN);
			setState(124);
			match(LPAR);
			setState(125);
			match(RPAR);
			_localctx.mainRet.setLine(((MainContext)_localctx).MAIN.getLine());
			setState(127);
			((MainContext)_localctx).b = body();
			_localctx.mainRet.setBody(((MainContext)_localctx).b.bodyRet);
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

	public static class StructDeclarationContext extends ParserRuleContext {
		public StructDeclaration structDeclarationRet;
		public Token STRUCT;
		public IdentifierContext i;
		public StructBodyContext sb;
		public SingleStatementStructBodyContext sssb;
		public TerminalNode STRUCT() { return getToken(CmmParser.STRUCT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(CmmParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CmmParser.NEWLINE, i);
		}
		public TerminalNode BEGIN() { return getToken(CmmParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(CmmParser.END, 0); }
		public StructBodyContext structBody() {
			return getRuleContext(StructBodyContext.class,0);
		}
		public SingleStatementStructBodyContext singleStatementStructBody() {
			return getRuleContext(SingleStatementStructBodyContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CmmParser.SEMICOLON, 0); }
		public StructDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterStructDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitStructDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitStructDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructDeclarationContext structDeclaration() throws RecognitionException {
		StructDeclarationContext _localctx = new StructDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_structDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			((StructDeclarationContext)_localctx).STRUCT = match(STRUCT);
			setState(131);
			((StructDeclarationContext)_localctx).i = identifier();
			((StructDeclarationContext)_localctx).structDeclarationRet =  new StructDeclaration() ;
			    _localctx.structDeclarationRet.setLine(((StructDeclarationContext)_localctx).STRUCT.getLine());
			    _localctx.structDeclarationRet.setStructName(((StructDeclarationContext)_localctx).i.identifierRet);
			setState(153);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
				{
				{
				setState(133);
				match(BEGIN);
				setState(134);
				((StructDeclarationContext)_localctx).sb = structBody();
				_localctx.structDeclarationRet.setBody(((StructDeclarationContext)_localctx).sb.structBodyRet);
				setState(137); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(136);
					match(NEWLINE);
					}
					}
					setState(139); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(141);
				match(END);
				}
				}
				break;
			case NEWLINE:
				{
				{
				setState(144); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(143);
					match(NEWLINE);
					}
					}
					setState(146); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(148);
				((StructDeclarationContext)_localctx).sssb = singleStatementStructBody();
				_localctx.structDeclarationRet.setBody(((StructDeclarationContext)_localctx).sssb.singleStatementStructBodyRet);
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(150);
					match(SEMICOLON);
					}
				}

				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(156); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(155);
				match(NEWLINE);
				}
				}
				setState(158); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
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

	public static class SingleVarWithGetAndSetContext extends ParserRuleContext {
		public SetGetVarDeclaration setgetVarRet;
		public TypeContext t;
		public IdentifierContext i;
		public FunctionArgsDecContext fad;
		public SetBodyContext sb;
		public GetBodyContext gb;
		public TerminalNode BEGIN() { return getToken(CmmParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(CmmParser.END, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FunctionArgsDecContext functionArgsDec() {
			return getRuleContext(FunctionArgsDecContext.class,0);
		}
		public SetBodyContext setBody() {
			return getRuleContext(SetBodyContext.class,0);
		}
		public GetBodyContext getBody() {
			return getRuleContext(GetBodyContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(CmmParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CmmParser.NEWLINE, i);
		}
		public SingleVarWithGetAndSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleVarWithGetAndSet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterSingleVarWithGetAndSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitSingleVarWithGetAndSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitSingleVarWithGetAndSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleVarWithGetAndSetContext singleVarWithGetAndSet() throws RecognitionException {
		SingleVarWithGetAndSetContext _localctx = new SingleVarWithGetAndSetContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_singleVarWithGetAndSet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((SingleVarWithGetAndSetContext)_localctx).setgetVarRet =  new SetGetVarDeclaration();
			setState(161);
			((SingleVarWithGetAndSetContext)_localctx).t = type();
			_localctx.setgetVarRet.setVarType(((SingleVarWithGetAndSetContext)_localctx).t.typeRet);
			setState(163);
			((SingleVarWithGetAndSetContext)_localctx).i = identifier();
			_localctx.setgetVarRet.setVarName(((SingleVarWithGetAndSetContext)_localctx).i.identifierRet);
			_localctx.setgetVarRet.setLine(((SingleVarWithGetAndSetContext)_localctx).i.identifierRet.getLine());
			setState(166);
			((SingleVarWithGetAndSetContext)_localctx).fad = functionArgsDec();
			_localctx.setgetVarRet.setArgs(((SingleVarWithGetAndSetContext)_localctx).fad.ArgsDeclarationForFuncVariableRet);
			setState(168);
			match(BEGIN);
			setState(170); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(169);
				match(NEWLINE);
				}
				}
				setState(172); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(174);
			((SingleVarWithGetAndSetContext)_localctx).sb = setBody();
			_localctx.setgetVarRet.setSetterBody(((SingleVarWithGetAndSetContext)_localctx).sb.setBodyRet);
			setState(176);
			((SingleVarWithGetAndSetContext)_localctx).gb = getBody();
			_localctx.setgetVarRet.setGetterBody(((SingleVarWithGetAndSetContext)_localctx).gb.getBodyRet);
			setState(178);
			match(END);
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

	public static class SingleStatementStructBodyContext extends ParserRuleContext {
		public Statement singleStatementStructBodyRet;
		public VarDecStatementContext vds;
		public SingleVarWithGetAndSetContext svwgas;
		public VarDecStatementContext varDecStatement() {
			return getRuleContext(VarDecStatementContext.class,0);
		}
		public SingleVarWithGetAndSetContext singleVarWithGetAndSet() {
			return getRuleContext(SingleVarWithGetAndSetContext.class,0);
		}
		public SingleStatementStructBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleStatementStructBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterSingleStatementStructBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitSingleStatementStructBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitSingleStatementStructBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleStatementStructBodyContext singleStatementStructBody() throws RecognitionException {
		SingleStatementStructBodyContext _localctx = new SingleStatementStructBodyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_singleStatementStructBody);
		try {
			setState(186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				((SingleStatementStructBodyContext)_localctx).vds = varDecStatement();
				((SingleStatementStructBodyContext)_localctx).singleStatementStructBodyRet =  ((SingleStatementStructBodyContext)_localctx).vds.VarDecStmtRet;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				((SingleStatementStructBodyContext)_localctx).svwgas = singleVarWithGetAndSet();
				((SingleStatementStructBodyContext)_localctx).singleStatementStructBodyRet =  ((SingleStatementStructBodyContext)_localctx).svwgas.setgetVarRet;
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

	public static class StructBodyContext extends ParserRuleContext {
		public Statement structBodyRet;
		public SingleStatementStructBodyContext sssb;
		public SingleStatementStructBodyContext sssb1;
		public List<SingleStatementStructBodyContext> singleStatementStructBody() {
			return getRuleContexts(SingleStatementStructBodyContext.class);
		}
		public SingleStatementStructBodyContext singleStatementStructBody(int i) {
			return getRuleContext(SingleStatementStructBodyContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(CmmParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CmmParser.NEWLINE, i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(CmmParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(CmmParser.SEMICOLON, i);
		}
		public StructBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterStructBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitStructBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitStructBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructBodyContext structBody() throws RecognitionException {
		StructBodyContext _localctx = new StructBodyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_structBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(207); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(189); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(188);
						match(NEWLINE);
						}
						}
						setState(191); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==NEWLINE );
					setState(199);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(193);
							((StructBodyContext)_localctx).sssb = singleStatementStructBody();
							((StructBodyContext)_localctx).structBodyRet =  ((StructBodyContext)_localctx).sssb.singleStatementStructBodyRet;
							setState(195);
							match(SEMICOLON);
							}
							} 
						}
						setState(201);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
					}
					setState(202);
					((StructBodyContext)_localctx).sssb1 = singleStatementStructBody();
					((StructBodyContext)_localctx).structBodyRet =  ((StructBodyContext)_localctx).sssb1.singleStatementStructBodyRet;
					setState(205);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMICOLON) {
						{
						setState(204);
						match(SEMICOLON);
						}
					}

					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(209); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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

	public static class GetBodyContext extends ParserRuleContext {
		public Statement getBodyRet;
		public BodyContext b;
		public TerminalNode GET() { return getToken(CmmParser.GET, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(CmmParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CmmParser.NEWLINE, i);
		}
		public GetBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterGetBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitGetBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitGetBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GetBodyContext getBody() throws RecognitionException {
		GetBodyContext _localctx = new GetBodyContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_getBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(GET);
			setState(212);
			((GetBodyContext)_localctx).b = body();
			((GetBodyContext)_localctx).getBodyRet =  ((GetBodyContext)_localctx).b.bodyRet;
			setState(215); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(214);
				match(NEWLINE);
				}
				}
				setState(217); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
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

	public static class SetBodyContext extends ParserRuleContext {
		public Statement setBodyRet;
		public BodyContext b;
		public TerminalNode SET() { return getToken(CmmParser.SET, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(CmmParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CmmParser.NEWLINE, i);
		}
		public SetBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterSetBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitSetBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitSetBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetBodyContext setBody() throws RecognitionException {
		SetBodyContext _localctx = new SetBodyContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_setBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			match(SET);
			setState(220);
			((SetBodyContext)_localctx).b = body();
			((SetBodyContext)_localctx).setBodyRet =  ((SetBodyContext)_localctx).b.bodyRet;
			setState(223); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(222);
				match(NEWLINE);
				}
				}
				setState(225); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
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

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public FunctionDeclaration functionDeclarationRet;
		public TypeContext t;
		public IdentifierContext i;
		public FunctionArgsDecContext fad;
		public BodyContext b;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FunctionArgsDecContext functionArgsDec() {
			return getRuleContext(FunctionArgsDecContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode VOID() { return getToken(CmmParser.VOID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(CmmParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CmmParser.NEWLINE, i);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((FunctionDeclarationContext)_localctx).functionDeclarationRet =  new FunctionDeclaration();
			setState(233);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case BOOL:
			case LIST:
			case STRUCT:
			case FPTR:
				{
				setState(228);
				((FunctionDeclarationContext)_localctx).t = type();
				_localctx.functionDeclarationRet.setReturnType(((FunctionDeclarationContext)_localctx).t.typeRet);
				}
				break;
			case VOID:
				{
				setState(231);
				match(VOID);
				_localctx.functionDeclarationRet.setReturnType(new VoidType());
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(235);
			((FunctionDeclarationContext)_localctx).i = identifier();
			_localctx.functionDeclarationRet.setLine(((FunctionDeclarationContext)_localctx).i.identifierRet.getLine());
			_localctx.functionDeclarationRet.setFunctionName(((FunctionDeclarationContext)_localctx).i.identifierRet);
			setState(238);
			((FunctionDeclarationContext)_localctx).fad = functionArgsDec();
			_localctx.functionDeclarationRet.setArgs(((FunctionDeclarationContext)_localctx).fad.ArgsDeclarationForFuncVariableRet);
			setState(240);
			((FunctionDeclarationContext)_localctx).b = body();
			_localctx.functionDeclarationRet.setBody(((FunctionDeclarationContext)_localctx).b.bodyRet);
			setState(243); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(242);
				match(NEWLINE);
				}
				}
				setState(245); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
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

	public static class FunctionArgsDecContext extends ParserRuleContext {
		public ArrayList<VariableDeclaration> ArgsDeclarationForFuncVariableRet;
		public VariableDeclaration varTemp;
		public TypeContext t;
		public IdentifierContext i;
		public TypeContext tt;
		public IdentifierContext ii;
		public TerminalNode LPAR() { return getToken(CmmParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(CmmParser.RPAR, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CmmParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CmmParser.COMMA, i);
		}
		public FunctionArgsDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionArgsDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterFunctionArgsDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitFunctionArgsDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitFunctionArgsDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionArgsDecContext functionArgsDec() throws RecognitionException {
		FunctionArgsDecContext _localctx = new FunctionArgsDecContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_functionArgsDec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((FunctionArgsDecContext)_localctx).ArgsDeclarationForFuncVariableRet =  new ArrayList<>();
			setState(248);
			match(LPAR);
			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << LIST) | (1L << STRUCT) | (1L << FPTR))) != 0)) {
				{
				setState(249);
				((FunctionArgsDecContext)_localctx).t = type();
				setState(250);
				((FunctionArgsDecContext)_localctx).i = identifier();

				    ((FunctionArgsDecContext)_localctx).varTemp =  new VariableDeclaration(((FunctionArgsDecContext)_localctx).i.identifierRet,((FunctionArgsDecContext)_localctx).t.typeRet);
				    _localctx.varTemp.setLine(((FunctionArgsDecContext)_localctx).i.identifierRet.getLine());
				    _localctx.ArgsDeclarationForFuncVariableRet.add(_localctx.varTemp);
				    
				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(252);
					match(COMMA);
					setState(253);
					((FunctionArgsDecContext)_localctx).tt = type();
					setState(254);
					((FunctionArgsDecContext)_localctx).ii = identifier();

					    ((FunctionArgsDecContext)_localctx).varTemp =  new VariableDeclaration(((FunctionArgsDecContext)_localctx).ii.identifierRet,((FunctionArgsDecContext)_localctx).tt.typeRet);
					    _localctx.varTemp.setLine(((FunctionArgsDecContext)_localctx).ii.identifierRet.getLine());
					    _localctx.ArgsDeclarationForFuncVariableRet.add(_localctx.varTemp);
					    
					}
					}
					setState(261);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(264);
			match(RPAR);
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

	public static class FunctionArgumentsContext extends ParserRuleContext {
		public ExprInPar funcArgumentsRet;
		public ArrayList<Expression> exprs;
		public ExpressionContext e;
		public ExpressionContext ee;
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
		public FunctionArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterFunctionArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitFunctionArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitFunctionArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionArgumentsContext functionArguments() throws RecognitionException {
		FunctionArgumentsContext _localctx = new FunctionArgumentsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_functionArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((FunctionArgumentsContext)_localctx).exprs =  new ArrayList<>();
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SIZE) | (1L << APPEND) | (1L << MINUS) | (1L << NOT) | (1L << TRUE) | (1L << FALSE) | (1L << LPAR) | (1L << INT_VALUE) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(267);
				((FunctionArgumentsContext)_localctx).e = expression();
				_localctx.exprs.add(((FunctionArgumentsContext)_localctx).e.expressionRet);
				setState(275);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(269);
					match(COMMA);
					setState(270);
					((FunctionArgumentsContext)_localctx).ee = expression();
					_localctx.exprs.add(((FunctionArgumentsContext)_localctx).ee.expressionRet);
					}
					}
					setState(277);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			((FunctionArgumentsContext)_localctx).funcArgumentsRet =  new ExprInPar(_localctx.exprs);
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
		public Statement bodyRet;
		public BlockStatementContext bs;
		public SingleStatementContext ss;
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public SingleStatementContext singleStatement() {
			return getRuleContext(SingleStatementContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(CmmParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CmmParser.NEWLINE, i);
		}
		public TerminalNode SEMICOLON() { return getToken(CmmParser.SEMICOLON, 0); }
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
		enterRule(_localctx, 24, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
				{
				setState(282);
				((BodyContext)_localctx).bs = blockStatement();
				((BodyContext)_localctx).bodyRet =  ((BodyContext)_localctx).bs.blockStatementRet;
				}
				break;
			case NEWLINE:
				{
				{
				setState(286); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(285);
					match(NEWLINE);
					}
					}
					setState(288); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(290);
				((BodyContext)_localctx).ss = singleStatement();
				((BodyContext)_localctx).bodyRet =  ((BodyContext)_localctx).ss.singleStatementRet;
				setState(293);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(292);
					match(SEMICOLON);
					}
				}

				}
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

	public static class LoopCondBodyContext extends ParserRuleContext {
		public Statement loopCondBodyRet;
		public BlockStatementContext bs;
		public SingleStatementContext ss;
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public SingleStatementContext singleStatement() {
			return getRuleContext(SingleStatementContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(CmmParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CmmParser.NEWLINE, i);
		}
		public LoopCondBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopCondBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterLoopCondBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitLoopCondBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitLoopCondBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopCondBodyContext loopCondBody() throws RecognitionException {
		LoopCondBodyContext _localctx = new LoopCondBodyContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_loopCondBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
				{
				setState(297);
				((LoopCondBodyContext)_localctx).bs = blockStatement();
				((LoopCondBodyContext)_localctx).loopCondBodyRet =  ((LoopCondBodyContext)_localctx).bs.blockStatementRet;
				}
				break;
			case NEWLINE:
				{
				{
				setState(301); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(300);
					match(NEWLINE);
					}
					}
					setState(303); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(305);
				((LoopCondBodyContext)_localctx).ss = singleStatement();
				((LoopCondBodyContext)_localctx).loopCondBodyRet =  ((LoopCondBodyContext)_localctx).ss.singleStatementRet;
				}
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

	public static class BlockStatementContext extends ParserRuleContext {
		public BlockStmt blockStatementRet;
		public Token BEGIN;
		public SingleStatementContext ss;
		public SingleStatementContext ss1;
		public TerminalNode BEGIN() { return getToken(CmmParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(CmmParser.END, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(CmmParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CmmParser.NEWLINE, i);
		}
		public List<SingleStatementContext> singleStatement() {
			return getRuleContexts(SingleStatementContext.class);
		}
		public SingleStatementContext singleStatement(int i) {
			return getRuleContext(SingleStatementContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(CmmParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(CmmParser.SEMICOLON, i);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitBlockStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_blockStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			((BlockStatementContext)_localctx).blockStatementRet =  new BlockStmt();
			setState(311);
			((BlockStatementContext)_localctx).BEGIN = match(BEGIN);
			_localctx.blockStatementRet.setLine(((BlockStatementContext)_localctx).BEGIN.getLine());
			setState(332); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(314); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(313);
						match(NEWLINE);
						}
						}
						setState(316); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==NEWLINE );
					setState(324);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(318);
							((BlockStatementContext)_localctx).ss = singleStatement();
							_localctx.blockStatementRet.addStatement(((BlockStatementContext)_localctx).ss.singleStatementRet);
							setState(320);
							match(SEMICOLON);
							}
							} 
						}
						setState(326);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
					}
					setState(327);
					((BlockStatementContext)_localctx).ss1 = singleStatement();
					_localctx.blockStatementRet.addStatement(((BlockStatementContext)_localctx).ss1.singleStatementRet);
					setState(330);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMICOLON) {
						{
						setState(329);
						match(SEMICOLON);
						}
					}

					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(334); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(337); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(336);
				match(NEWLINE);
				}
				}
				setState(339); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(341);
			match(END);
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

	public static class VarDecStatementContext extends ParserRuleContext {
		public VarDecStmt VarDecStmtRet;
		public VariableDeclaration vardectemp;
		public ArrayList<VariableDeclaration> vardecstmtTemp;
		public TypeContext t;
		public IdentifierContext i;
		public OrExpressionContext oe;
		public IdentifierContext i1;
		public OrExpressionContext oe1;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(CmmParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(CmmParser.ASSIGN, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CmmParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CmmParser.COMMA, i);
		}
		public List<OrExpressionContext> orExpression() {
			return getRuleContexts(OrExpressionContext.class);
		}
		public OrExpressionContext orExpression(int i) {
			return getRuleContext(OrExpressionContext.class,i);
		}
		public VarDecStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterVarDecStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitVarDecStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitVarDecStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDecStatementContext varDecStatement() throws RecognitionException {
		VarDecStatementContext _localctx = new VarDecStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_varDecStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((VarDecStatementContext)_localctx).vardecstmtTemp =  new ArrayList<>();
			((VarDecStatementContext)_localctx).VarDecStmtRet =  new VarDecStmt();
			setState(345);
			((VarDecStatementContext)_localctx).t = type();
			setState(346);
			((VarDecStatementContext)_localctx).i = identifier();
			((VarDecStatementContext)_localctx).vardectemp =  new VariableDeclaration(((VarDecStatementContext)_localctx).i.identifierRet,((VarDecStatementContext)_localctx).t.typeRet);
			setState(352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(348);
				match(ASSIGN);
				setState(349);
				((VarDecStatementContext)_localctx).oe = orExpression();
				_localctx.vardectemp.setDefaultValue(((VarDecStatementContext)_localctx).oe.orExpRet);
				}
			}

			_localctx.vardecstmtTemp.add(_localctx.vardectemp);
			setState(368);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(355);
				match(COMMA);
				setState(356);
				((VarDecStatementContext)_localctx).i1 = identifier();
				((VarDecStatementContext)_localctx).vardectemp =  new VariableDeclaration(((VarDecStatementContext)_localctx).i1.identifierRet,((VarDecStatementContext)_localctx).t.typeRet);
				setState(362);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(358);
					match(ASSIGN);
					setState(359);
					((VarDecStatementContext)_localctx).oe1 = orExpression();
					_localctx.vardectemp.setDefaultValue(((VarDecStatementContext)_localctx).oe1.orExpRet);
					}
				}

				_localctx.vardecstmtTemp.add(_localctx.vardectemp);
				}
				}
				setState(370);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			_localctx.VarDecStmtRet.setVars(_localctx.vardecstmtTemp);
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

	public static class FunctionCallStmtContext extends ParserRuleContext {
		public FunctionCallStmt funcCallStmtRet;
		public Expression expr;
		public FunctionCall fc;
		public OtherExpressionContext oe;
		public Token LPAR;
		public FunctionArgumentsContext fa1;
		public Token DOT;
		public IdentifierContext i;
		public FunctionArgumentsContext fa;
		public OtherExpressionContext otherExpression() {
			return getRuleContext(OtherExpressionContext.class,0);
		}
		public List<TerminalNode> LPAR() { return getTokens(CmmParser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(CmmParser.LPAR, i);
		}
		public List<TerminalNode> RPAR() { return getTokens(CmmParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(CmmParser.RPAR, i);
		}
		public List<FunctionArgumentsContext> functionArguments() {
			return getRuleContexts(FunctionArgumentsContext.class);
		}
		public FunctionArgumentsContext functionArguments(int i) {
			return getRuleContext(FunctionArgumentsContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(CmmParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(CmmParser.DOT, i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public FunctionCallStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterFunctionCallStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitFunctionCallStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitFunctionCallStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallStmtContext functionCallStmt() throws RecognitionException {
		FunctionCallStmtContext _localctx = new FunctionCallStmtContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_functionCallStmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			((FunctionCallStmtContext)_localctx).oe = otherExpression();
			((FunctionCallStmtContext)_localctx).expr =  ((FunctionCallStmtContext)_localctx).oe.otherExpRet;
			setState(388);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(386);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LPAR:
						{
						{
						setState(375);
						((FunctionCallStmtContext)_localctx).LPAR = match(LPAR);
						setState(376);
						((FunctionCallStmtContext)_localctx).fa1 = functionArguments();
						((FunctionCallStmtContext)_localctx).expr =  new FunctionCall(_localctx.expr,((FunctionCallStmtContext)_localctx).fa1.funcArgumentsRet.getInputs());
						_localctx.expr.setLine(((FunctionCallStmtContext)_localctx).LPAR.getLine());
						setState(379);
						match(RPAR);
						}
						}
						break;
					case DOT:
						{
						{
						setState(381);
						((FunctionCallStmtContext)_localctx).DOT = match(DOT);
						setState(382);
						((FunctionCallStmtContext)_localctx).i = identifier();
						((FunctionCallStmtContext)_localctx).expr =  new StructAccess(_localctx.expr,((FunctionCallStmtContext)_localctx).i.identifierRet);
						_localctx.expr.setLine(((FunctionCallStmtContext)_localctx).DOT.getLine());
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(390);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			}
			{
			setState(391);
			((FunctionCallStmtContext)_localctx).LPAR = match(LPAR);
			setState(392);
			((FunctionCallStmtContext)_localctx).fa = functionArguments();
			((FunctionCallStmtContext)_localctx).fc =  new FunctionCall(_localctx.expr,((FunctionCallStmtContext)_localctx).fa.funcArgumentsRet.getInputs());
			_localctx.fc.setLine(((FunctionCallStmtContext)_localctx).LPAR.getLine());
			((FunctionCallStmtContext)_localctx).funcCallStmtRet =  new FunctionCallStmt(_localctx.fc);
			_localctx.funcCallStmtRet.setLine(((FunctionCallStmtContext)_localctx).LPAR.getLine());
			setState(397);
			match(RPAR);
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

	public static class ReturnStatementContext extends ParserRuleContext {
		public ReturnStmt returnRet;
		public Token RETURN;
		public ExpressionContext e;
		public TerminalNode RETURN() { return getToken(CmmParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ReturnStatementContext)_localctx).returnRet =  new ReturnStmt();
			setState(400);
			((ReturnStatementContext)_localctx).RETURN = match(RETURN);
			setState(402);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SIZE) | (1L << APPEND) | (1L << MINUS) | (1L << NOT) | (1L << TRUE) | (1L << FALSE) | (1L << LPAR) | (1L << INT_VALUE) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(401);
				((ReturnStatementContext)_localctx).e = expression();
				}
			}

			_localctx.returnRet.setReturnedExpr(((ReturnStatementContext)_localctx).e.expressionRet);
			_localctx.returnRet.setLine(((ReturnStatementContext)_localctx).RETURN.getLine());
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

	public static class IfStatementContext extends ParserRuleContext {
		public ConditionalStmt ifstmtRet;
		public Token IF;
		public ExpressionContext e;
		public LoopCondBodyContext lcb;
		public BodyContext b;
		public ElseStatementContext es;
		public TerminalNode IF() { return getToken(CmmParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LoopCondBodyContext loopCondBody() {
			return getRuleContext(LoopCondBodyContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public ElseStatementContext elseStatement() {
			return getRuleContext(ElseStatementContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			((IfStatementContext)_localctx).IF = match(IF);
			setState(408);
			((IfStatementContext)_localctx).e = expression();
			((IfStatementContext)_localctx).ifstmtRet =  new ConditionalStmt(((IfStatementContext)_localctx).e.expressionRet); _localctx.ifstmtRet.setLine(((IfStatementContext)_localctx).IF.getLine());
			setState(418);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(410);
				((IfStatementContext)_localctx).lcb = loopCondBody();
				_localctx.ifstmtRet.setThenBody(((IfStatementContext)_localctx).lcb.loopCondBodyRet);
				}
				break;
			case 2:
				{
				setState(413);
				((IfStatementContext)_localctx).b = body();
				_localctx.ifstmtRet.setThenBody(((IfStatementContext)_localctx).b.bodyRet);
				setState(415);
				((IfStatementContext)_localctx).es = elseStatement();
				_localctx.ifstmtRet.setElseBody(((IfStatementContext)_localctx).es.loopCondElseBodyRet);
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

	public static class ElseStatementContext extends ParserRuleContext {
		public Statement loopCondElseBodyRet;
		public LoopCondBodyContext lcb;
		public TerminalNode ELSE() { return getToken(CmmParser.ELSE, 0); }
		public LoopCondBodyContext loopCondBody() {
			return getRuleContext(LoopCondBodyContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(CmmParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CmmParser.NEWLINE, i);
		}
		public ElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterElseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitElseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitElseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseStatementContext elseStatement() throws RecognitionException {
		ElseStatementContext _localctx = new ElseStatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_elseStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(420);
				match(NEWLINE);
				}
				}
				setState(425);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(426);
			match(ELSE);
			setState(427);
			((ElseStatementContext)_localctx).lcb = loopCondBody();
			((ElseStatementContext)_localctx).loopCondElseBodyRet =  ((ElseStatementContext)_localctx).lcb.loopCondBodyRet;
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

	public static class LoopStatementContext extends ParserRuleContext {
		public Statement loopStatementRet;
		public WhileLoopStatementContext wls;
		public DoWhileLoopStatementContext dwls;
		public WhileLoopStatementContext whileLoopStatement() {
			return getRuleContext(WhileLoopStatementContext.class,0);
		}
		public DoWhileLoopStatementContext doWhileLoopStatement() {
			return getRuleContext(DoWhileLoopStatementContext.class,0);
		}
		public LoopStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterLoopStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitLoopStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitLoopStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopStatementContext loopStatement() throws RecognitionException {
		LoopStatementContext _localctx = new LoopStatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_loopStatement);
		try {
			setState(436);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(430);
				((LoopStatementContext)_localctx).wls = whileLoopStatement();
				((LoopStatementContext)_localctx).loopStatementRet =  ((LoopStatementContext)_localctx).wls.wloopstmtRet;
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 2);
				{
				setState(433);
				((LoopStatementContext)_localctx).dwls = doWhileLoopStatement();
				((LoopStatementContext)_localctx).loopStatementRet =  ((LoopStatementContext)_localctx).dwls.dwloopstmtRet;
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

	public static class WhileLoopStatementContext extends ParserRuleContext {
		public LoopStmt wloopstmtRet;
		public ExpressionContext e;
		public LoopCondBodyContext lcb;
		public TerminalNode WHILE() { return getToken(CmmParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LoopCondBodyContext loopCondBody() {
			return getRuleContext(LoopCondBodyContext.class,0);
		}
		public WhileLoopStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileLoopStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterWhileLoopStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitWhileLoopStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitWhileLoopStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileLoopStatementContext whileLoopStatement() throws RecognitionException {
		WhileLoopStatementContext _localctx = new WhileLoopStatementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_whileLoopStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(438);
			match(WHILE);
			((WhileLoopStatementContext)_localctx).wloopstmtRet =  new LoopStmt();
			setState(440);
			((WhileLoopStatementContext)_localctx).e = expression();
			_localctx.wloopstmtRet.setCondition(((WhileLoopStatementContext)_localctx).e.expressionRet);
			setState(442);
			((WhileLoopStatementContext)_localctx).lcb = loopCondBody();
			_localctx.wloopstmtRet.setBody(((WhileLoopStatementContext)_localctx).lcb.loopCondBodyRet);
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

	public static class DoWhileLoopStatementContext extends ParserRuleContext {
		public LoopStmt dwloopstmtRet;
		public BodyContext b;
		public ExpressionContext e;
		public TerminalNode DO() { return getToken(CmmParser.DO, 0); }
		public TerminalNode WHILE() { return getToken(CmmParser.WHILE, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(CmmParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CmmParser.NEWLINE, i);
		}
		public DoWhileLoopStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhileLoopStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterDoWhileLoopStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitDoWhileLoopStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitDoWhileLoopStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoWhileLoopStatementContext doWhileLoopStatement() throws RecognitionException {
		DoWhileLoopStatementContext _localctx = new DoWhileLoopStatementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_doWhileLoopStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			match(DO);
			((DoWhileLoopStatementContext)_localctx).dwloopstmtRet =  new LoopStmt();
			setState(447);
			((DoWhileLoopStatementContext)_localctx).b = body();
			_localctx.dwloopstmtRet.setBody(((DoWhileLoopStatementContext)_localctx).b.bodyRet);
			setState(452);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(449);
				match(NEWLINE);
				}
				}
				setState(454);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(455);
			match(WHILE);
			setState(456);
			((DoWhileLoopStatementContext)_localctx).e = expression();
			_localctx.dwloopstmtRet.setCondition(((DoWhileLoopStatementContext)_localctx).e.expressionRet);
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

	public static class DisplayStatementContext extends ParserRuleContext {
		public DisplayStmt displayStmtRet;
		public ExpressionContext e;
		public TerminalNode DISPLAY() { return getToken(CmmParser.DISPLAY, 0); }
		public TerminalNode LPAR() { return getToken(CmmParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(CmmParser.RPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DisplayStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_displayStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterDisplayStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitDisplayStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitDisplayStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DisplayStatementContext displayStatement() throws RecognitionException {
		DisplayStatementContext _localctx = new DisplayStatementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_displayStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459);
			match(DISPLAY);
			setState(460);
			match(LPAR);
			setState(461);
			((DisplayStatementContext)_localctx).e = expression();
			((DisplayStatementContext)_localctx).displayStmtRet =  new DisplayStmt(((DisplayStatementContext)_localctx).e.expressionRet);
			setState(463);
			match(RPAR);
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

	public static class AssignmentStatementContext extends ParserRuleContext {
		public AssignmentStmt assignmentStmtRet;
		public OrExpressionContext lval_;
		public Token ASSIGN;
		public ExpressionContext rval_;
		public TerminalNode ASSIGN() { return getToken(CmmParser.ASSIGN, 0); }
		public OrExpressionContext orExpression() {
			return getRuleContext(OrExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitAssignmentStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitAssignmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentStatementContext assignmentStatement() throws RecognitionException {
		AssignmentStatementContext _localctx = new AssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_assignmentStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			((AssignmentStatementContext)_localctx).lval_ = orExpression();
			setState(466);
			((AssignmentStatementContext)_localctx).ASSIGN = match(ASSIGN);
			setState(467);
			((AssignmentStatementContext)_localctx).rval_ = expression();
			((AssignmentStatementContext)_localctx).assignmentStmtRet =  new AssignmentStmt(((AssignmentStatementContext)_localctx).lval_.orExpRet,((AssignmentStatementContext)_localctx).rval_.expressionRet);
			_localctx.assignmentStmtRet.setLine(((AssignmentStatementContext)_localctx).ASSIGN.getLine());
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

	public static class SingleStatementContext extends ParserRuleContext {
		public Statement singleStatementRet;
		public IfStatementContext is;
		public DisplayStatementContext ds;
		public FunctionCallStmtContext fcs;
		public ReturnStatementContext rs;
		public AssignmentStatementContext as;
		public VarDecStatementContext vds;
		public LoopStatementContext ls;
		public AppendContext a;
		public SizeContext s;
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public DisplayStatementContext displayStatement() {
			return getRuleContext(DisplayStatementContext.class,0);
		}
		public FunctionCallStmtContext functionCallStmt() {
			return getRuleContext(FunctionCallStmtContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public AssignmentStatementContext assignmentStatement() {
			return getRuleContext(AssignmentStatementContext.class,0);
		}
		public VarDecStatementContext varDecStatement() {
			return getRuleContext(VarDecStatementContext.class,0);
		}
		public LoopStatementContext loopStatement() {
			return getRuleContext(LoopStatementContext.class,0);
		}
		public AppendContext append() {
			return getRuleContext(AppendContext.class,0);
		}
		public SizeContext size() {
			return getRuleContext(SizeContext.class,0);
		}
		public SingleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterSingleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitSingleStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitSingleStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleStatementContext singleStatement() throws RecognitionException {
		SingleStatementContext _localctx = new SingleStatementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_singleStatement);
		try {
			setState(498);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(471);
				((SingleStatementContext)_localctx).is = ifStatement();
				((SingleStatementContext)_localctx).singleStatementRet =  ((SingleStatementContext)_localctx).is.ifstmtRet;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(474);
				((SingleStatementContext)_localctx).ds = displayStatement();
				((SingleStatementContext)_localctx).singleStatementRet =  ((SingleStatementContext)_localctx).ds.displayStmtRet;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(477);
				((SingleStatementContext)_localctx).fcs = functionCallStmt();
				((SingleStatementContext)_localctx).singleStatementRet =  ((SingleStatementContext)_localctx).fcs.funcCallStmtRet;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(480);
				((SingleStatementContext)_localctx).rs = returnStatement();
				((SingleStatementContext)_localctx).singleStatementRet =  ((SingleStatementContext)_localctx).rs.returnRet;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(483);
				((SingleStatementContext)_localctx).as = assignmentStatement();
				((SingleStatementContext)_localctx).singleStatementRet =  ((SingleStatementContext)_localctx).as.assignmentStmtRet;
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(486);
				((SingleStatementContext)_localctx).vds = varDecStatement();
				((SingleStatementContext)_localctx).singleStatementRet =  ((SingleStatementContext)_localctx).vds.VarDecStmtRet;
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(489);
				((SingleStatementContext)_localctx).ls = loopStatement();
				((SingleStatementContext)_localctx).singleStatementRet =  ((SingleStatementContext)_localctx).ls.loopStatementRet;
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(492);
				((SingleStatementContext)_localctx).a = append();
				((SingleStatementContext)_localctx).singleStatementRet =  new ListAppendStmt(((SingleStatementContext)_localctx).a.appExpRet);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(495);
				((SingleStatementContext)_localctx).s = size();
				((SingleStatementContext)_localctx).singleStatementRet =  new ListSizeStmt(((SingleStatementContext)_localctx).s.siExpRet);
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
		public Expression expressionRet;
		public BinaryOperator bo;
		public OrExpressionContext fe;
		public Token op;
		public ExpressionContext e;
		public OrExpressionContext orExpression() {
			return getRuleContext(OrExpressionContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(CmmParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		enterRule(_localctx, 52, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(500);
			((ExpressionContext)_localctx).fe = orExpression();
			((ExpressionContext)_localctx).expressionRet =  ((ExpressionContext)_localctx).fe.orExpRet;
			setState(508);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				((ExpressionContext)_localctx).bo =  BinaryOperator.assign;
				setState(503);
				((ExpressionContext)_localctx).op = match(ASSIGN);
				setState(504);
				((ExpressionContext)_localctx).e = expression();
				((ExpressionContext)_localctx).expressionRet =  new BinaryExpression(((ExpressionContext)_localctx).fe.orExpRet,((ExpressionContext)_localctx).e.expressionRet,_localctx.bo);
				_localctx.expressionRet.setLine(((ExpressionContext)_localctx).op.getLine());
				}
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

	public static class OrExpressionContext extends ParserRuleContext {
		public Expression orExpRet;
		public BinaryOperator bo;
		public AndExpressionContext ae;
		public Token op;
		public AndExpressionContext ae_;
		public List<AndExpressionContext> andExpression() {
			return getRuleContexts(AndExpressionContext.class);
		}
		public AndExpressionContext andExpression(int i) {
			return getRuleContext(AndExpressionContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(CmmParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(CmmParser.OR, i);
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
		enterRule(_localctx, 54, RULE_orExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(510);
			((OrExpressionContext)_localctx).ae = andExpression();
			((OrExpressionContext)_localctx).orExpRet =  ((OrExpressionContext)_localctx).ae.andExpRet;
			setState(520);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				((OrExpressionContext)_localctx).bo =  BinaryOperator.or;
				setState(513);
				((OrExpressionContext)_localctx).op = match(OR);
				setState(514);
				((OrExpressionContext)_localctx).ae_ = andExpression();
				((OrExpressionContext)_localctx).orExpRet =  new BinaryExpression(((OrExpressionContext)_localctx).ae.andExpRet,((OrExpressionContext)_localctx).ae_.andExpRet,_localctx.bo);
				_localctx.orExpRet.setLine(((OrExpressionContext)_localctx).op.getLine());
				}
				}
				setState(522);
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

	public static class AndExpressionContext extends ParserRuleContext {
		public Expression andExpRet;
		public BinaryOperator bo;
		public EqualityExpressionContext ee;
		public Token op;
		public EqualityExpressionContext ee_;
		public List<EqualityExpressionContext> equalityExpression() {
			return getRuleContexts(EqualityExpressionContext.class);
		}
		public EqualityExpressionContext equalityExpression(int i) {
			return getRuleContext(EqualityExpressionContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(CmmParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(CmmParser.AND, i);
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
		enterRule(_localctx, 56, RULE_andExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
			((AndExpressionContext)_localctx).ee = equalityExpression();
			((AndExpressionContext)_localctx).andExpRet =  ((AndExpressionContext)_localctx).ee.eqExpRet;
			setState(533);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				((AndExpressionContext)_localctx).bo =  BinaryOperator.and; 
				setState(526);
				((AndExpressionContext)_localctx).op = match(AND);
				setState(527);
				((AndExpressionContext)_localctx).ee_ = equalityExpression();
				((AndExpressionContext)_localctx).andExpRet =  new BinaryExpression(((AndExpressionContext)_localctx).ee.eqExpRet,((AndExpressionContext)_localctx).ee_.eqExpRet,_localctx.bo);
				_localctx.andExpRet.setLine(((AndExpressionContext)_localctx).op.getLine());
				}
				}
				setState(535);
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

	public static class EqualityExpressionContext extends ParserRuleContext {
		public Expression eqExpRet;
		public BinaryOperator bo;
		public RelationalExpressionContext re;
		public Token op;
		public RelationalExpressionContext re_;
		public List<RelationalExpressionContext> relationalExpression() {
			return getRuleContexts(RelationalExpressionContext.class);
		}
		public RelationalExpressionContext relationalExpression(int i) {
			return getRuleContext(RelationalExpressionContext.class,i);
		}
		public List<TerminalNode> EQUAL() { return getTokens(CmmParser.EQUAL); }
		public TerminalNode EQUAL(int i) {
			return getToken(CmmParser.EQUAL, i);
		}
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitEqualityExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitEqualityExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_equalityExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(536);
			((EqualityExpressionContext)_localctx).re = relationalExpression();
			((EqualityExpressionContext)_localctx).eqExpRet =  ((EqualityExpressionContext)_localctx).re.reExpRet;
			setState(546);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EQUAL) {
				{
				{
				((EqualityExpressionContext)_localctx).bo =  BinaryOperator.eq;
				setState(539);
				((EqualityExpressionContext)_localctx).op = match(EQUAL);
				setState(540);
				((EqualityExpressionContext)_localctx).re_ = relationalExpression();
				((EqualityExpressionContext)_localctx).eqExpRet =  new BinaryExpression(((EqualityExpressionContext)_localctx).re.reExpRet,((EqualityExpressionContext)_localctx).re_.reExpRet,_localctx.bo);
				_localctx.eqExpRet.setLine(((EqualityExpressionContext)_localctx).op.getLine());
				}
				}
				setState(548);
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

	public static class RelationalExpressionContext extends ParserRuleContext {
		public Expression reExpRet;
		public BinaryOperator bo;
		public AdditiveExpressionContext ae;
		public Token op;
		public AdditiveExpressionContext ae_;
		public List<AdditiveExpressionContext> additiveExpression() {
			return getRuleContexts(AdditiveExpressionContext.class);
		}
		public AdditiveExpressionContext additiveExpression(int i) {
			return getRuleContext(AdditiveExpressionContext.class,i);
		}
		public List<TerminalNode> GREATER_THAN() { return getTokens(CmmParser.GREATER_THAN); }
		public TerminalNode GREATER_THAN(int i) {
			return getToken(CmmParser.GREATER_THAN, i);
		}
		public List<TerminalNode> LESS_THAN() { return getTokens(CmmParser.LESS_THAN); }
		public TerminalNode LESS_THAN(int i) {
			return getToken(CmmParser.LESS_THAN, i);
		}
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitRelationalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitRelationalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_relationalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(549);
			((RelationalExpressionContext)_localctx).ae = additiveExpression();
			((RelationalExpressionContext)_localctx).reExpRet =  ((RelationalExpressionContext)_localctx).ae.addExpRet;
			setState(563);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==GREATER_THAN || _la==LESS_THAN) {
				{
				{
				setState(555);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case GREATER_THAN:
					{
					setState(551);
					((RelationalExpressionContext)_localctx).op = match(GREATER_THAN);
					((RelationalExpressionContext)_localctx).bo =  BinaryOperator.gt;
					}
					break;
				case LESS_THAN:
					{
					setState(553);
					((RelationalExpressionContext)_localctx).op = match(LESS_THAN);
					((RelationalExpressionContext)_localctx).bo =  BinaryOperator.lt;
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(557);
				((RelationalExpressionContext)_localctx).ae_ = additiveExpression();
				((RelationalExpressionContext)_localctx).reExpRet =  new BinaryExpression(((RelationalExpressionContext)_localctx).ae.addExpRet,((RelationalExpressionContext)_localctx).ae_.addExpRet,_localctx.bo);
				_localctx.reExpRet.setLine(((RelationalExpressionContext)_localctx).op.getLine());
				}
				}
				setState(565);
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

	public static class AdditiveExpressionContext extends ParserRuleContext {
		public Expression addExpRet;
		public BinaryOperator bo;
		public MultiplicativeExpressionContext me;
		public Token op;
		public MultiplicativeExpressionContext me_;
		public List<MultiplicativeExpressionContext> multiplicativeExpression() {
			return getRuleContexts(MultiplicativeExpressionContext.class);
		}
		public MultiplicativeExpressionContext multiplicativeExpression(int i) {
			return getRuleContext(MultiplicativeExpressionContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(CmmParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(CmmParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(CmmParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(CmmParser.MINUS, i);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitAdditiveExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_additiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(566);
			((AdditiveExpressionContext)_localctx).me = multiplicativeExpression();
			((AdditiveExpressionContext)_localctx).addExpRet =  ((AdditiveExpressionContext)_localctx).me.multiExpRet;
			setState(580);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(572);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PLUS:
					{
					setState(568);
					((AdditiveExpressionContext)_localctx).op = match(PLUS);
					((AdditiveExpressionContext)_localctx).bo =  BinaryOperator.add;
					}
					break;
				case MINUS:
					{
					setState(570);
					((AdditiveExpressionContext)_localctx).op = match(MINUS);
					((AdditiveExpressionContext)_localctx).bo =  BinaryOperator.sub;
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(574);
				((AdditiveExpressionContext)_localctx).me_ = multiplicativeExpression();
				((AdditiveExpressionContext)_localctx).addExpRet =  new BinaryExpression(((AdditiveExpressionContext)_localctx).me.multiExpRet,((AdditiveExpressionContext)_localctx).me_.multiExpRet,_localctx.bo);
				_localctx.addExpRet.setLine(((AdditiveExpressionContext)_localctx).op.getLine());
				}
				}
				setState(582);
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

	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public Expression multiExpRet;
		public BinaryOperator bo;
		public PreUnaryExpressionContext pe;
		public Token op;
		public PreUnaryExpressionContext pe_;
		public List<PreUnaryExpressionContext> preUnaryExpression() {
			return getRuleContexts(PreUnaryExpressionContext.class);
		}
		public PreUnaryExpressionContext preUnaryExpression(int i) {
			return getRuleContext(PreUnaryExpressionContext.class,i);
		}
		public List<TerminalNode> MULT() { return getTokens(CmmParser.MULT); }
		public TerminalNode MULT(int i) {
			return getToken(CmmParser.MULT, i);
		}
		public List<TerminalNode> DIVIDE() { return getTokens(CmmParser.DIVIDE); }
		public TerminalNode DIVIDE(int i) {
			return getToken(CmmParser.DIVIDE, i);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitMultiplicativeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_multiplicativeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(583);
			((MultiplicativeExpressionContext)_localctx).pe = preUnaryExpression();
			((MultiplicativeExpressionContext)_localctx).multiExpRet =  ((MultiplicativeExpressionContext)_localctx).pe.puExpRet;
			setState(597);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULT || _la==DIVIDE) {
				{
				{
				setState(589);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MULT:
					{
					setState(585);
					((MultiplicativeExpressionContext)_localctx).op = match(MULT);
					((MultiplicativeExpressionContext)_localctx).bo =  BinaryOperator.mult;
					}
					break;
				case DIVIDE:
					{
					setState(587);
					((MultiplicativeExpressionContext)_localctx).op = match(DIVIDE);
					((MultiplicativeExpressionContext)_localctx).bo =  BinaryOperator.div;
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(591);
				((MultiplicativeExpressionContext)_localctx).pe_ = preUnaryExpression();
				((MultiplicativeExpressionContext)_localctx).multiExpRet =  new BinaryExpression(((MultiplicativeExpressionContext)_localctx).pe.puExpRet,((MultiplicativeExpressionContext)_localctx).pe_.puExpRet,_localctx.bo);
				_localctx.multiExpRet.setLine(((MultiplicativeExpressionContext)_localctx).op.getLine());
				}
				}
				setState(599);
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

	public static class PreUnaryExpressionContext extends ParserRuleContext {
		public Expression puExpRet;
		public UnaryOperator uo;
		public Token op;
		public PreUnaryExpressionContext pe;
		public AccessExpressionContext ae;
		public PreUnaryExpressionContext preUnaryExpression() {
			return getRuleContext(PreUnaryExpressionContext.class,0);
		}
		public TerminalNode NOT() { return getToken(CmmParser.NOT, 0); }
		public TerminalNode MINUS() { return getToken(CmmParser.MINUS, 0); }
		public AccessExpressionContext accessExpression() {
			return getRuleContext(AccessExpressionContext.class,0);
		}
		public PreUnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preUnaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterPreUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitPreUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitPreUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PreUnaryExpressionContext preUnaryExpression() throws RecognitionException {
		PreUnaryExpressionContext _localctx = new PreUnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_preUnaryExpression);
		try {
			setState(614);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(604);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NOT:
					{
					setState(600);
					((PreUnaryExpressionContext)_localctx).op = match(NOT);
					((PreUnaryExpressionContext)_localctx).uo =  UnaryOperator.not;
					}
					break;
				case MINUS:
					{
					setState(602);
					((PreUnaryExpressionContext)_localctx).op = match(MINUS);
					((PreUnaryExpressionContext)_localctx).uo =  UnaryOperator.minus;
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(606);
				((PreUnaryExpressionContext)_localctx).pe = preUnaryExpression();
				((PreUnaryExpressionContext)_localctx).puExpRet =  new UnaryExpression(((PreUnaryExpressionContext)_localctx).pe.puExpRet, _localctx.uo);
				_localctx.puExpRet.setLine(((PreUnaryExpressionContext)_localctx).op.getLine());
				}
				}
				break;
			case SIZE:
			case APPEND:
			case TRUE:
			case FALSE:
			case LPAR:
			case INT_VALUE:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(610);
				((PreUnaryExpressionContext)_localctx).ae = accessExpression();
				((PreUnaryExpressionContext)_localctx).puExpRet =  ((PreUnaryExpressionContext)_localctx).ae.accExpRet;
				_localctx.puExpRet.setLine(((PreUnaryExpressionContext)_localctx).ae.accExpRet.getLine());
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

	public static class AccessExpressionContext extends ParserRuleContext {
		public Expression accExpRet;
		public OtherExpressionContext oe;
		public Token LPAR;
		public FunctionArgumentsContext fa;
		public Token DOT;
		public IdentifierContext i;
		public Token LBRACK;
		public ExpressionContext e;
		public IdentifierContext i_;
		public OtherExpressionContext otherExpression() {
			return getRuleContext(OtherExpressionContext.class,0);
		}
		public List<TerminalNode> LPAR() { return getTokens(CmmParser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(CmmParser.LPAR, i);
		}
		public List<TerminalNode> RPAR() { return getTokens(CmmParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(CmmParser.RPAR, i);
		}
		public List<TerminalNode> DOT() { return getTokens(CmmParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(CmmParser.DOT, i);
		}
		public List<TerminalNode> LBRACK() { return getTokens(CmmParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(CmmParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(CmmParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(CmmParser.RBRACK, i);
		}
		public List<FunctionArgumentsContext> functionArguments() {
			return getRuleContexts(FunctionArgumentsContext.class);
		}
		public FunctionArgumentsContext functionArguments(int i) {
			return getRuleContext(FunctionArgumentsContext.class,i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AccessExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterAccessExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitAccessExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitAccessExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccessExpressionContext accessExpression() throws RecognitionException {
		AccessExpressionContext _localctx = new AccessExpressionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_accessExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(616);
			((AccessExpressionContext)_localctx).oe = otherExpression();
			((AccessExpressionContext)_localctx).accExpRet =  ((AccessExpressionContext)_localctx).oe.otherExpRet;
			setState(632);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(630);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LPAR:
						{
						{
						setState(618);
						((AccessExpressionContext)_localctx).LPAR = match(LPAR);
						setState(619);
						((AccessExpressionContext)_localctx).fa = functionArguments();
						setState(620);
						match(RPAR);
						((AccessExpressionContext)_localctx).accExpRet =  new FunctionCall(_localctx.accExpRet,((AccessExpressionContext)_localctx).fa.funcArgumentsRet.getInputs());
						}
						_localctx.accExpRet.setLine(((AccessExpressionContext)_localctx).LPAR.getLine());
						}
						break;
					case DOT:
						{
						{
						setState(625);
						((AccessExpressionContext)_localctx).DOT = match(DOT);
						setState(626);
						((AccessExpressionContext)_localctx).i = identifier();
						((AccessExpressionContext)_localctx).accExpRet =  new StructAccess(_localctx.accExpRet,((AccessExpressionContext)_localctx).i.identifierRet);
						_localctx.accExpRet.setLine(((AccessExpressionContext)_localctx).DOT.getLine());
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(634);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			}
			setState(649);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK || _la==DOT) {
				{
				setState(647);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LBRACK:
					{
					{
					setState(635);
					((AccessExpressionContext)_localctx).LBRACK = match(LBRACK);
					setState(636);
					((AccessExpressionContext)_localctx).e = expression();
					((AccessExpressionContext)_localctx).accExpRet =  new ListAccessByIndex(_localctx.accExpRet,((AccessExpressionContext)_localctx).e.expressionRet);
					setState(638);
					match(RBRACK);
					}
					_localctx.accExpRet.setLine(((AccessExpressionContext)_localctx).LBRACK.getLine());
					}
					break;
				case DOT:
					{
					{
					setState(642);
					((AccessExpressionContext)_localctx).DOT = match(DOT);
					setState(643);
					((AccessExpressionContext)_localctx).i_ = identifier();
					((AccessExpressionContext)_localctx).accExpRet =  new StructAccess(_localctx.accExpRet,((AccessExpressionContext)_localctx).i.identifierRet);
					_localctx.accExpRet.setLine(((AccessExpressionContext)_localctx).DOT.getLine());
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(651);
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

	public static class OtherExpressionContext extends ParserRuleContext {
		public Expression otherExpRet;
		public ValueContext v;
		public IdentifierContext i;
		public Token LPAR;
		public FunctionArgumentsContext fa;
		public SizeContext s;
		public AppendContext a;
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(CmmParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(CmmParser.RPAR, 0); }
		public FunctionArgumentsContext functionArguments() {
			return getRuleContext(FunctionArgumentsContext.class,0);
		}
		public SizeContext size() {
			return getRuleContext(SizeContext.class,0);
		}
		public AppendContext append() {
			return getRuleContext(AppendContext.class,0);
		}
		public OtherExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_otherExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterOtherExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitOtherExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitOtherExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OtherExpressionContext otherExpression() throws RecognitionException {
		OtherExpressionContext _localctx = new OtherExpressionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_otherExpression);
		try {
			setState(671);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
			case INT_VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(652);
				((OtherExpressionContext)_localctx).v = value();
				((OtherExpressionContext)_localctx).otherExpRet =  ((OtherExpressionContext)_localctx).v.valRet;
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(655);
				((OtherExpressionContext)_localctx).i = identifier();
				((OtherExpressionContext)_localctx).otherExpRet =  ((OtherExpressionContext)_localctx).i.identifierRet;
				}
				break;
			case LPAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(658);
				((OtherExpressionContext)_localctx).LPAR = match(LPAR);
				{
				setState(659);
				((OtherExpressionContext)_localctx).fa = functionArguments();
				((OtherExpressionContext)_localctx).otherExpRet =  ((OtherExpressionContext)_localctx).fa.funcArgumentsRet;
				}
				setState(662);
				match(RPAR);
				_localctx.otherExpRet.setLine(((OtherExpressionContext)_localctx).LPAR.getLine());
				}
				break;
			case SIZE:
				enterOuterAlt(_localctx, 4);
				{
				setState(665);
				((OtherExpressionContext)_localctx).s = size();
				((OtherExpressionContext)_localctx).otherExpRet =  ((OtherExpressionContext)_localctx).s.siExpRet;
				}
				break;
			case APPEND:
				enterOuterAlt(_localctx, 5);
				{
				setState(668);
				((OtherExpressionContext)_localctx).a = append();
				((OtherExpressionContext)_localctx).otherExpRet =  ((OtherExpressionContext)_localctx).a.appExpRet;
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

	public static class SizeContext extends ParserRuleContext {
		public ListSize siExpRet;
		public Token SIZE;
		public ExpressionContext e;
		public TerminalNode SIZE() { return getToken(CmmParser.SIZE, 0); }
		public TerminalNode LPAR() { return getToken(CmmParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(CmmParser.RPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_size; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterSize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitSize(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitSize(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SizeContext size() throws RecognitionException {
		SizeContext _localctx = new SizeContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_size);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(673);
			((SizeContext)_localctx).SIZE = match(SIZE);
			setState(674);
			match(LPAR);
			setState(675);
			((SizeContext)_localctx).e = expression();
			setState(676);
			match(RPAR);
			((SizeContext)_localctx).siExpRet =  new ListSize(((SizeContext)_localctx).e.expressionRet);
			_localctx.siExpRet.setLine(((SizeContext)_localctx).SIZE.getLine());
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

	public static class AppendContext extends ParserRuleContext {
		public ListAppend appExpRet;
		public Token APPEND;
		public ExpressionContext e;
		public ExpressionContext e_;
		public TerminalNode APPEND() { return getToken(CmmParser.APPEND, 0); }
		public TerminalNode LPAR() { return getToken(CmmParser.LPAR, 0); }
		public TerminalNode COMMA() { return getToken(CmmParser.COMMA, 0); }
		public TerminalNode RPAR() { return getToken(CmmParser.RPAR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AppendContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_append; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterAppend(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitAppend(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitAppend(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AppendContext append() throws RecognitionException {
		AppendContext _localctx = new AppendContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_append);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(680);
			((AppendContext)_localctx).APPEND = match(APPEND);
			setState(681);
			match(LPAR);
			setState(682);
			((AppendContext)_localctx).e = expression();
			setState(683);
			match(COMMA);
			setState(684);
			((AppendContext)_localctx).e_ = expression();
			setState(685);
			match(RPAR);
			((AppendContext)_localctx).appExpRet =  new ListAppend(((AppendContext)_localctx).e.expressionRet,((AppendContext)_localctx).e_.expressionRet);
			_localctx.appExpRet.setLine(((AppendContext)_localctx).APPEND.getLine());
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
		public Value valRet;
		public BoolValueContext bv;
		public Token INT_VALUE;
		public BoolValueContext boolValue() {
			return getRuleContext(BoolValueContext.class,0);
		}
		public TerminalNode INT_VALUE() { return getToken(CmmParser.INT_VALUE, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_value);
		try {
			setState(694);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(689);
				((ValueContext)_localctx).bv = boolValue();
				((ValueContext)_localctx).valRet =  ((ValueContext)_localctx).bv.boolvalRet;
				}
				break;
			case INT_VALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(692);
				((ValueContext)_localctx).INT_VALUE = match(INT_VALUE);
				((ValueContext)_localctx).valRet =  new IntValue(Integer.parseInt(((ValueContext)_localctx).INT_VALUE.getText())); _localctx.valRet.setLine(((ValueContext)_localctx).INT_VALUE.getLine());
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

	public static class BoolValueContext extends ParserRuleContext {
		public BoolValue boolvalRet;
		public Token TRUE;
		public Token FALSE;
		public TerminalNode TRUE() { return getToken(CmmParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(CmmParser.FALSE, 0); }
		public BoolValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterBoolValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitBoolValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitBoolValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolValueContext boolValue() throws RecognitionException {
		BoolValueContext _localctx = new BoolValueContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_boolValue);
		try {
			setState(700);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(696);
				((BoolValueContext)_localctx).TRUE = match(TRUE);
				((BoolValueContext)_localctx).boolvalRet =  new BoolValue(true); _localctx.boolvalRet.setLine(((BoolValueContext)_localctx).TRUE.getLine());
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(698);
				((BoolValueContext)_localctx).FALSE = match(FALSE);
				((BoolValueContext)_localctx).boolvalRet =  new BoolValue(false); _localctx.boolvalRet.setLine(((BoolValueContext)_localctx).FALSE.getLine());
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

	public static class IdentifierContext extends ParserRuleContext {
		public Identifier identifierRet;
		public Token IDENTIFIER;
		public TerminalNode IDENTIFIER() { return getToken(CmmParser.IDENTIFIER, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(702);
			((IdentifierContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			((IdentifierContext)_localctx).identifierRet =  new Identifier(((IdentifierContext)_localctx).IDENTIFIER.getText());
			     _localctx.identifierRet.setLine(((IdentifierContext)_localctx).IDENTIFIER.getLine());
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

	public static class TypeContext extends ParserRuleContext {
		public Type typeRet;
		public TypeContext t;
		public IdentifierContext i;
		public FptrTypeContext fT;
		public TerminalNode INT() { return getToken(CmmParser.INT, 0); }
		public TerminalNode BOOL() { return getToken(CmmParser.BOOL, 0); }
		public TerminalNode LIST() { return getToken(CmmParser.LIST, 0); }
		public TerminalNode SHARP() { return getToken(CmmParser.SHARP, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode STRUCT() { return getToken(CmmParser.STRUCT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FptrTypeContext fptrType() {
			return getRuleContext(FptrTypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_type);
		try {
			setState(721);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(705);
				match(INT);
				((TypeContext)_localctx).typeRet =  new IntType();
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(707);
				match(BOOL);
				((TypeContext)_localctx).typeRet =  new BoolType();
				}
				break;
			case LIST:
				enterOuterAlt(_localctx, 3);
				{
				setState(709);
				match(LIST);
				setState(710);
				match(SHARP);
				setState(711);
				((TypeContext)_localctx).t = type();
				((TypeContext)_localctx).typeRet =  ((TypeContext)_localctx).t.typeRet;
				}
				break;
			case STRUCT:
				enterOuterAlt(_localctx, 4);
				{
				setState(714);
				match(STRUCT);
				setState(715);
				((TypeContext)_localctx).i = identifier();
				((TypeContext)_localctx).typeRet =  new StructType(((TypeContext)_localctx).i.identifierRet);
				}
				break;
			case FPTR:
				enterOuterAlt(_localctx, 5);
				{
				setState(718);
				((TypeContext)_localctx).fT = fptrType();
				((TypeContext)_localctx).typeRet =  ((TypeContext)_localctx).fT.fptrTRet;
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

	public static class FptrTypeContext extends ParserRuleContext {
		public FptrType fptrTRet;
		public Type stRet;
		public ArrayList<Type> ft;
		public TypeContext t;
		public TypeContext t1;
		public TypeContext t2;
		public TerminalNode FPTR() { return getToken(CmmParser.FPTR, 0); }
		public TerminalNode LESS_THAN() { return getToken(CmmParser.LESS_THAN, 0); }
		public TerminalNode ARROW() { return getToken(CmmParser.ARROW, 0); }
		public TerminalNode GREATER_THAN() { return getToken(CmmParser.GREATER_THAN, 0); }
		public List<TerminalNode> VOID() { return getTokens(CmmParser.VOID); }
		public TerminalNode VOID(int i) {
			return getToken(CmmParser.VOID, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CmmParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CmmParser.COMMA, i);
		}
		public FptrTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fptrType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterFptrType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitFptrType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitFptrType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FptrTypeContext fptrType() throws RecognitionException {
		FptrTypeContext _localctx = new FptrTypeContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_fptrType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((FptrTypeContext)_localctx).ft =  new ArrayList<>();
			setState(724);
			match(FPTR);
			setState(725);
			match(LESS_THAN);
			setState(739);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				{
				setState(726);
				match(VOID);
				_localctx.ft.add(new VoidType());
				}
				break;
			case INT:
			case BOOL:
			case LIST:
			case STRUCT:
			case FPTR:
				{
				{
				setState(728);
				((FptrTypeContext)_localctx).t = type();
				_localctx.ft.add(((FptrTypeContext)_localctx).t.typeRet);
				setState(736);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(730);
					match(COMMA);
					setState(731);
					((FptrTypeContext)_localctx).t1 = type();
					_localctx.ft.add(((FptrTypeContext)_localctx).t1.typeRet);
					}
					}
					setState(738);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(741);
			match(ARROW);
			setState(747);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case BOOL:
			case LIST:
			case STRUCT:
			case FPTR:
				{
				setState(742);
				((FptrTypeContext)_localctx).t2 = type();
				((FptrTypeContext)_localctx).stRet =  ((FptrTypeContext)_localctx).t2.typeRet;
				}
				break;
			case VOID:
				{
				setState(745);
				match(VOID);
				((FptrTypeContext)_localctx).stRet =  new VoidType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(749);
			match(GREATER_THAN);
			((FptrTypeContext)_localctx).fptrTRet =  new FptrType(_localctx.ft,_localctx.stRet);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\60\u02f3\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\7\2Z\n\2\f\2\16\2]\13\2\3\2\3\2\3\2\7\2b\n\2\f\2\16\2e\13\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\7\3m\n\3\f\3\16\3p\13\3\3\3\3\3\3\3\7\3u\n\3\f"+
		"\3\16\3x\13\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\6\5\u008c\n\5\r\5\16\5\u008d\3\5\3\5\3\5\6\5\u0093\n"+
		"\5\r\5\16\5\u0094\3\5\3\5\3\5\5\5\u009a\n\5\5\5\u009c\n\5\3\5\6\5\u009f"+
		"\n\5\r\5\16\5\u00a0\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\6\6\u00ad"+
		"\n\6\r\6\16\6\u00ae\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\5"+
		"\7\u00bd\n\7\3\b\6\b\u00c0\n\b\r\b\16\b\u00c1\3\b\3\b\3\b\3\b\7\b\u00c8"+
		"\n\b\f\b\16\b\u00cb\13\b\3\b\3\b\3\b\5\b\u00d0\n\b\6\b\u00d2\n\b\r\b\16"+
		"\b\u00d3\3\t\3\t\3\t\3\t\6\t\u00da\n\t\r\t\16\t\u00db\3\n\3\n\3\n\3\n"+
		"\6\n\u00e2\n\n\r\n\16\n\u00e3\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00ec"+
		"\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\6\13\u00f6\n\13\r\13\16"+
		"\13\u00f7\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u0104\n\f\f\f\16"+
		"\f\u0107\13\f\5\f\u0109\n\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u0114"+
		"\n\r\f\r\16\r\u0117\13\r\5\r\u0119\n\r\3\r\3\r\3\16\3\16\3\16\3\16\6\16"+
		"\u0121\n\16\r\16\16\16\u0122\3\16\3\16\3\16\5\16\u0128\n\16\5\16\u012a"+
		"\n\16\3\17\3\17\3\17\3\17\6\17\u0130\n\17\r\17\16\17\u0131\3\17\3\17\3"+
		"\17\5\17\u0137\n\17\3\20\3\20\3\20\3\20\6\20\u013d\n\20\r\20\16\20\u013e"+
		"\3\20\3\20\3\20\3\20\7\20\u0145\n\20\f\20\16\20\u0148\13\20\3\20\3\20"+
		"\3\20\5\20\u014d\n\20\6\20\u014f\n\20\r\20\16\20\u0150\3\20\6\20\u0154"+
		"\n\20\r\20\16\20\u0155\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\5\21\u0163\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21"+
		"\u016d\n\21\3\21\3\21\7\21\u0171\n\21\f\21\16\21\u0174\13\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22"+
		"\u0185\n\22\f\22\16\22\u0188\13\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\5\23\u0195\n\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u01a5\n\24\3\25\7\25\u01a8\n"+
		"\25\f\25\16\25\u01ab\13\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\5\26\u01b7\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\30\3\30\7\30\u01c5\n\30\f\30\16\30\u01c8\13\30\3\30\3\30\3\30\3\30"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u01f5\n\33"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u01ff\n\34\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\7\35\u0209\n\35\f\35\16\35\u020c\13\35\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\7\36\u0216\n\36\f\36\16\36\u0219\13"+
		"\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\7\37\u0223\n\37\f\37\16\37"+
		"\u0226\13\37\3 \3 \3 \3 \3 \3 \5 \u022e\n \3 \3 \3 \3 \7 \u0234\n \f "+
		"\16 \u0237\13 \3!\3!\3!\3!\3!\3!\5!\u023f\n!\3!\3!\3!\3!\7!\u0245\n!\f"+
		"!\16!\u0248\13!\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u0250\n\"\3\"\3\"\3\"\3\""+
		"\7\"\u0256\n\"\f\"\16\"\u0259\13\"\3#\3#\3#\3#\5#\u025f\n#\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\5#\u0269\n#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\7"+
		"$\u0279\n$\f$\16$\u027c\13$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\7$\u028a"+
		"\n$\f$\16$\u028d\13$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3"+
		"%\3%\3%\5%\u02a2\n%\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\3(\3(\3(\3(\3(\5(\u02b9\n(\3)\3)\3)\3)\5)\u02bf\n)\3*\3*\3*\3+"+
		"\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u02d4\n+\3,\3,\3,\3,"+
		"\3,\3,\3,\3,\3,\3,\3,\7,\u02e1\n,\f,\16,\u02e4\13,\5,\u02e6\n,\3,\3,\3"+
		",\3,\3,\3,\5,\u02ee\n,\3,\3,\3,\3,\2\2-\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTV\2\2\2\u0317\2[\3\2\2\2"+
		"\4h\3\2\2\2\6|\3\2\2\2\b\u0084\3\2\2\2\n\u00a2\3\2\2\2\f\u00bc\3\2\2\2"+
		"\16\u00d1\3\2\2\2\20\u00d5\3\2\2\2\22\u00dd\3\2\2\2\24\u00e5\3\2\2\2\26"+
		"\u00f9\3\2\2\2\30\u010c\3\2\2\2\32\u0129\3\2\2\2\34\u0136\3\2\2\2\36\u0138"+
		"\3\2\2\2 \u0159\3\2\2\2\"\u0177\3\2\2\2$\u0191\3\2\2\2&\u0199\3\2\2\2"+
		"(\u01a9\3\2\2\2*\u01b6\3\2\2\2,\u01b8\3\2\2\2.\u01bf\3\2\2\2\60\u01cd"+
		"\3\2\2\2\62\u01d3\3\2\2\2\64\u01f4\3\2\2\2\66\u01f6\3\2\2\28\u0200\3\2"+
		"\2\2:\u020d\3\2\2\2<\u021a\3\2\2\2>\u0227\3\2\2\2@\u0238\3\2\2\2B\u0249"+
		"\3\2\2\2D\u0268\3\2\2\2F\u026a\3\2\2\2H\u02a1\3\2\2\2J\u02a3\3\2\2\2L"+
		"\u02aa\3\2\2\2N\u02b8\3\2\2\2P\u02be\3\2\2\2R\u02c0\3\2\2\2T\u02d3\3\2"+
		"\2\2V\u02d5\3\2\2\2XZ\7,\2\2YX\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2"+
		"\\^\3\2\2\2][\3\2\2\2^_\5\4\3\2_c\b\2\1\2`b\7,\2\2a`\3\2\2\2be\3\2\2\2"+
		"ca\3\2\2\2cd\3\2\2\2df\3\2\2\2ec\3\2\2\2fg\7\2\2\3g\3\3\2\2\2hn\b\3\1"+
		"\2ij\5\b\5\2jk\b\3\1\2km\3\2\2\2li\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2"+
		"\2ov\3\2\2\2pn\3\2\2\2qr\5\24\13\2rs\b\3\1\2su\3\2\2\2tq\3\2\2\2ux\3\2"+
		"\2\2vt\3\2\2\2vw\3\2\2\2wy\3\2\2\2xv\3\2\2\2yz\5\6\4\2z{\b\3\1\2{\5\3"+
		"\2\2\2|}\b\4\1\2}~\7\3\2\2~\177\7%\2\2\177\u0080\7&\2\2\u0080\u0081\b"+
		"\4\1\2\u0081\u0082\5\32\16\2\u0082\u0083\b\4\1\2\u0083\7\3\2\2\2\u0084"+
		"\u0085\7\35\2\2\u0085\u0086\5R*\2\u0086\u009b\b\5\1\2\u0087\u0088\7\30"+
		"\2\2\u0088\u0089\5\16\b\2\u0089\u008b\b\5\1\2\u008a\u008c\7,\2\2\u008b"+
		"\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2"+
		"\2\2\u008e\u008f\3\2\2\2\u008f\u0090\7\31\2\2\u0090\u009c\3\2\2\2\u0091"+
		"\u0093\7,\2\2\u0092\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0092\3\2"+
		"\2\2\u0094\u0095\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0097\5\f\7\2\u0097"+
		"\u0099\b\5\1\2\u0098\u009a\7+\2\2\u0099\u0098\3\2\2\2\u0099\u009a\3\2"+
		"\2\2\u009a\u009c\3\2\2\2\u009b\u0087\3\2\2\2\u009b\u0092\3\2\2\2\u009c"+
		"\u009e\3\2\2\2\u009d\u009f\7,\2\2\u009e\u009d\3\2\2\2\u009f\u00a0\3\2"+
		"\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\t\3\2\2\2\u00a2\u00a3"+
		"\b\6\1\2\u00a3\u00a4\5T+\2\u00a4\u00a5\b\6\1\2\u00a5\u00a6\5R*\2\u00a6"+
		"\u00a7\b\6\1\2\u00a7\u00a8\b\6\1\2\u00a8\u00a9\5\26\f\2\u00a9\u00aa\b"+
		"\6\1\2\u00aa\u00ac\7\30\2\2\u00ab\u00ad\7,\2\2\u00ac\u00ab\3\2\2\2\u00ad"+
		"\u00ae\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\3\2"+
		"\2\2\u00b0\u00b1\5\22\n\2\u00b1\u00b2\b\6\1\2\u00b2\u00b3\5\20\t\2\u00b3"+
		"\u00b4\b\6\1\2\u00b4\u00b5\7\31\2\2\u00b5\13\3\2\2\2\u00b6\u00b7\5 \21"+
		"\2\u00b7\u00b8\b\7\1\2\u00b8\u00bd\3\2\2\2\u00b9\u00ba\5\n\6\2\u00ba\u00bb"+
		"\b\7\1\2\u00bb\u00bd\3\2\2\2\u00bc\u00b6\3\2\2\2\u00bc\u00b9\3\2\2\2\u00bd"+
		"\r\3\2\2\2\u00be\u00c0\7,\2\2\u00bf\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2"+
		"\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c9\3\2\2\2\u00c3\u00c4"+
		"\5\f\7\2\u00c4\u00c5\b\b\1\2\u00c5\u00c6\7+\2\2\u00c6\u00c8\3\2\2\2\u00c7"+
		"\u00c3\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2"+
		"\2\2\u00ca\u00cc\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00cd\5\f\7\2\u00cd"+
		"\u00cf\b\b\1\2\u00ce\u00d0\7+\2\2\u00cf\u00ce\3\2\2\2\u00cf\u00d0\3\2"+
		"\2\2\u00d0\u00d2\3\2\2\2\u00d1\u00bf\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3"+
		"\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\17\3\2\2\2\u00d5\u00d6\7\37\2"+
		"\2\u00d6\u00d7\5\32\16\2\u00d7\u00d9\b\t\1\2\u00d8\u00da\7,\2\2\u00d9"+
		"\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2"+
		"\2\2\u00dc\21\3\2\2\2\u00dd\u00de\7 \2\2\u00de\u00df\5\32\16\2\u00df\u00e1"+
		"\b\n\1\2\u00e0\u00e2\7,\2\2\u00e1\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3"+
		"\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\23\3\2\2\2\u00e5\u00eb\b\13\1"+
		"\2\u00e6\u00e7\5T+\2\u00e7\u00e8\b\13\1\2\u00e8\u00ec\3\2\2\2\u00e9\u00ea"+
		"\7\5\2\2\u00ea\u00ec\b\13\1\2\u00eb\u00e6\3\2\2\2\u00eb\u00e9\3\2\2\2"+
		"\u00ec\u00ed\3\2\2\2\u00ed\u00ee\5R*\2\u00ee\u00ef\b\13\1\2\u00ef\u00f0"+
		"\b\13\1\2\u00f0\u00f1\5\26\f\2\u00f1\u00f2\b\13\1\2\u00f2\u00f3\5\32\16"+
		"\2\u00f3\u00f5\b\13\1\2\u00f4\u00f6\7,\2\2\u00f5\u00f4\3\2\2\2\u00f6\u00f7"+
		"\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\25\3\2\2\2\u00f9"+
		"\u00fa\b\f\1\2\u00fa\u0108\7%\2\2\u00fb\u00fc\5T+\2\u00fc\u00fd\5R*\2"+
		"\u00fd\u0105\b\f\1\2\u00fe\u00ff\7)\2\2\u00ff\u0100\5T+\2\u0100\u0101"+
		"\5R*\2\u0101\u0102\b\f\1\2\u0102\u0104\3\2\2\2\u0103\u00fe\3\2\2\2\u0104"+
		"\u0107\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0109\3\2"+
		"\2\2\u0107\u0105\3\2\2\2\u0108\u00fb\3\2\2\2\u0108\u0109\3\2\2\2\u0109"+
		"\u010a\3\2\2\2\u010a\u010b\7&\2\2\u010b\27\3\2\2\2\u010c\u0118\b\r\1\2"+
		"\u010d\u010e\5\66\34\2\u010e\u0115\b\r\1\2\u010f\u0110\7)\2\2\u0110\u0111"+
		"\5\66\34\2\u0111\u0112\b\r\1\2\u0112\u0114\3\2\2\2\u0113\u010f\3\2\2\2"+
		"\u0114\u0117\3\2\2\2\u0115\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0119"+
		"\3\2\2\2\u0117\u0115\3\2\2\2\u0118\u010d\3\2\2\2\u0118\u0119\3\2\2\2\u0119"+
		"\u011a\3\2\2\2\u011a\u011b\b\r\1\2\u011b\31\3\2\2\2\u011c\u011d\5\36\20"+
		"\2\u011d\u011e\b\16\1\2\u011e\u012a\3\2\2\2\u011f\u0121\7,\2\2\u0120\u011f"+
		"\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123"+
		"\u0124\3\2\2\2\u0124\u0125\5\64\33\2\u0125\u0127\b\16\1\2\u0126\u0128"+
		"\7+\2\2\u0127\u0126\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u012a\3\2\2\2\u0129"+
		"\u011c\3\2\2\2\u0129\u0120\3\2\2\2\u012a\33\3\2\2\2\u012b\u012c\5\36\20"+
		"\2\u012c\u012d\b\17\1\2\u012d\u0137\3\2\2\2\u012e\u0130\7,\2\2\u012f\u012e"+
		"\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132"+
		"\u0133\3\2\2\2\u0133\u0134\5\64\33\2\u0134\u0135\b\17\1\2\u0135\u0137"+
		"\3\2\2\2\u0136\u012b\3\2\2\2\u0136\u012f\3\2\2\2\u0137\35\3\2\2\2\u0138"+
		"\u0139\b\20\1\2\u0139\u013a\7\30\2\2\u013a\u014e\b\20\1\2\u013b\u013d"+
		"\7,\2\2\u013c\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u013c\3\2\2\2\u013e"+
		"\u013f\3\2\2\2\u013f\u0146\3\2\2\2\u0140\u0141\5\64\33\2\u0141\u0142\b"+
		"\20\1\2\u0142\u0143\7+\2\2\u0143\u0145\3\2\2\2\u0144\u0140\3\2\2\2\u0145"+
		"\u0148\3\2\2\2\u0146\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0149\3\2"+
		"\2\2\u0148\u0146\3\2\2\2\u0149\u014a\5\64\33\2\u014a\u014c\b\20\1\2\u014b"+
		"\u014d\7+\2\2\u014c\u014b\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014f\3\2"+
		"\2\2\u014e\u013c\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u014e\3\2\2\2\u0150"+
		"\u0151\3\2\2\2\u0151\u0153\3\2\2\2\u0152\u0154\7,\2\2\u0153\u0152\3\2"+
		"\2\2\u0154\u0155\3\2\2\2\u0155\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156"+
		"\u0157\3\2\2\2\u0157\u0158\7\31\2\2\u0158\37\3\2\2\2\u0159\u015a\b\21"+
		"\1\2\u015a\u015b\b\21\1\2\u015b\u015c\5T+\2\u015c\u015d\5R*\2\u015d\u0162"+
		"\b\21\1\2\u015e\u015f\7#\2\2\u015f\u0160\58\35\2\u0160\u0161\b\21\1\2"+
		"\u0161\u0163\3\2\2\2\u0162\u015e\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0164"+
		"\3\2\2\2\u0164\u0172\b\21\1\2\u0165\u0166\7)\2\2\u0166\u0167\5R*\2\u0167"+
		"\u016c\b\21\1\2\u0168\u0169\7#\2\2\u0169\u016a\58\35\2\u016a\u016b\b\21"+
		"\1\2\u016b\u016d\3\2\2\2\u016c\u0168\3\2\2\2\u016c\u016d\3\2\2\2\u016d"+
		"\u016e\3\2\2\2\u016e\u016f\b\21\1\2\u016f\u0171\3\2\2\2\u0170\u0165\3"+
		"\2\2\2\u0171\u0174\3\2\2\2\u0172\u0170\3\2\2\2\u0172\u0173\3\2\2\2\u0173"+
		"\u0175\3\2\2\2\u0174\u0172\3\2\2\2\u0175\u0176\b\21\1\2\u0176!\3\2\2\2"+
		"\u0177\u0178\5H%\2\u0178\u0186\b\22\1\2\u0179\u017a\7%\2\2\u017a\u017b"+
		"\5\30\r\2\u017b\u017c\b\22\1\2\u017c\u017d\b\22\1\2\u017d\u017e\7&\2\2"+
		"\u017e\u0185\3\2\2\2\u017f\u0180\7*\2\2\u0180\u0181\5R*\2\u0181\u0182"+
		"\b\22\1\2\u0182\u0183\b\22\1\2\u0183\u0185\3\2\2\2\u0184\u0179\3\2\2\2"+
		"\u0184\u017f\3\2\2\2\u0185\u0188\3\2\2\2\u0186\u0184\3\2\2\2\u0186\u0187"+
		"\3\2\2\2\u0187\u0189\3\2\2\2\u0188\u0186\3\2\2\2\u0189\u018a\7%\2\2\u018a"+
		"\u018b\5\30\r\2\u018b\u018c\b\22\1\2\u018c\u018d\b\22\1\2\u018d\u018e"+
		"\b\22\1\2\u018e\u018f\b\22\1\2\u018f\u0190\7&\2\2\u0190#\3\2\2\2\u0191"+
		"\u0192\b\23\1\2\u0192\u0194\7\4\2\2\u0193\u0195\5\66\34\2\u0194\u0193"+
		"\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u0197\b\23\1\2"+
		"\u0197\u0198\b\23\1\2\u0198%\3\2\2\2\u0199\u019a\7\t\2\2\u019a\u019b\5"+
		"\66\34\2\u019b\u01a4\b\24\1\2\u019c\u019d\5\34\17\2\u019d\u019e\b\24\1"+
		"\2\u019e\u01a5\3\2\2\2\u019f\u01a0\5\32\16\2\u01a0\u01a1\b\24\1\2\u01a1"+
		"\u01a2\5(\25\2\u01a2\u01a3\b\24\1\2\u01a3\u01a5\3\2\2\2\u01a4\u019c\3"+
		"\2\2\2\u01a4\u019f\3\2\2\2\u01a5\'\3\2\2\2\u01a6\u01a8\7,\2\2\u01a7\u01a6"+
		"\3\2\2\2\u01a8\u01ab\3\2\2\2\u01a9\u01a7\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa"+
		"\u01ac\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ac\u01ad\7\n\2\2\u01ad\u01ae\5\34"+
		"\17\2\u01ae\u01af\b\25\1\2\u01af)\3\2\2\2\u01b0\u01b1\5,\27\2\u01b1\u01b2"+
		"\b\26\1\2\u01b2\u01b7\3\2\2\2\u01b3\u01b4\5.\30\2\u01b4\u01b5\b\26\1\2"+
		"\u01b5\u01b7\3\2\2\2\u01b6\u01b0\3\2\2\2\u01b6\u01b3\3\2\2\2\u01b7+\3"+
		"\2\2\2\u01b8\u01b9\7!\2\2\u01b9\u01ba\b\27\1\2\u01ba\u01bb\5\66\34\2\u01bb"+
		"\u01bc\b\27\1\2\u01bc\u01bd\5\34\17\2\u01bd\u01be\b\27\1\2\u01be-\3\2"+
		"\2\2\u01bf\u01c0\7\"\2\2\u01c0\u01c1\b\30\1\2\u01c1\u01c2\5\32\16\2\u01c2"+
		"\u01c6\b\30\1\2\u01c3\u01c5\7,\2\2\u01c4\u01c3\3\2\2\2\u01c5\u01c8\3\2"+
		"\2\2\u01c6\u01c4\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01c9\3\2\2\2\u01c8"+
		"\u01c6\3\2\2\2\u01c9\u01ca\7!\2\2\u01ca\u01cb\5\66\34\2\u01cb\u01cc\b"+
		"\30\1\2\u01cc/\3\2\2\2\u01cd\u01ce\7\7\2\2\u01ce\u01cf\7%\2\2\u01cf\u01d0"+
		"\5\66\34\2\u01d0\u01d1\b\31\1\2\u01d1\u01d2\7&\2\2\u01d2\61\3\2\2\2\u01d3"+
		"\u01d4\58\35\2\u01d4\u01d5\7#\2\2\u01d5\u01d6\5\66\34\2\u01d6\u01d7\b"+
		"\32\1\2\u01d7\u01d8\b\32\1\2\u01d8\63\3\2\2\2\u01d9\u01da\5&\24\2\u01da"+
		"\u01db\b\33\1\2\u01db\u01f5\3\2\2\2\u01dc\u01dd\5\60\31\2\u01dd\u01de"+
		"\b\33\1\2\u01de\u01f5\3\2\2\2\u01df\u01e0\5\"\22\2\u01e0\u01e1\b\33\1"+
		"\2\u01e1\u01f5\3\2\2\2\u01e2\u01e3\5$\23\2\u01e3\u01e4\b\33\1\2\u01e4"+
		"\u01f5\3\2\2\2\u01e5\u01e6\5\62\32\2\u01e6\u01e7\b\33\1\2\u01e7\u01f5"+
		"\3\2\2\2\u01e8\u01e9\5 \21\2\u01e9\u01ea\b\33\1\2\u01ea\u01f5\3\2\2\2"+
		"\u01eb\u01ec\5*\26\2\u01ec\u01ed\b\33\1\2\u01ed\u01f5\3\2\2\2\u01ee\u01ef"+
		"\5L\'\2\u01ef\u01f0\b\33\1\2\u01f0\u01f5\3\2\2\2\u01f1\u01f2\5J&\2\u01f2"+
		"\u01f3\b\33\1\2\u01f3\u01f5\3\2\2\2\u01f4\u01d9\3\2\2\2\u01f4\u01dc\3"+
		"\2\2\2\u01f4\u01df\3\2\2\2\u01f4\u01e2\3\2\2\2\u01f4\u01e5\3\2\2\2\u01f4"+
		"\u01e8\3\2\2\2\u01f4\u01eb\3\2\2\2\u01f4\u01ee\3\2\2\2\u01f4\u01f1\3\2"+
		"\2\2\u01f5\65\3\2\2\2\u01f6\u01f7\58\35\2\u01f7\u01fe\b\34\1\2\u01f8\u01f9"+
		"\b\34\1\2\u01f9\u01fa\7#\2\2\u01fa\u01fb\5\66\34\2\u01fb\u01fc\b\34\1"+
		"\2\u01fc\u01fd\b\34\1\2\u01fd\u01ff\3\2\2\2\u01fe\u01f8\3\2\2\2\u01fe"+
		"\u01ff\3\2\2\2\u01ff\67\3\2\2\2\u0200\u0201\5:\36\2\u0201\u020a\b\35\1"+
		"\2\u0202\u0203\b\35\1\2\u0203\u0204\7\24\2\2\u0204\u0205\5:\36\2\u0205"+
		"\u0206\b\35\1\2\u0206\u0207\b\35\1\2\u0207\u0209\3\2\2\2\u0208\u0202\3"+
		"\2\2\2\u0209\u020c\3\2\2\2\u020a\u0208\3\2\2\2\u020a\u020b\3\2\2\2\u020b"+
		"9\3\2\2\2\u020c\u020a\3\2\2\2\u020d\u020e\5<\37\2\u020e\u0217\b\36\1\2"+
		"\u020f\u0210\b\36\1\2\u0210\u0211\7\23\2\2\u0211\u0212\5<\37\2\u0212\u0213"+
		"\b\36\1\2\u0213\u0214\b\36\1\2\u0214\u0216\3\2\2\2\u0215\u020f\3\2\2\2"+
		"\u0216\u0219\3\2\2\2\u0217\u0215\3\2\2\2\u0217\u0218\3\2\2\2\u0218;\3"+
		"\2\2\2\u0219\u0217\3\2\2\2\u021a\u021b\5> \2\u021b\u0224\b\37\1\2\u021c"+
		"\u021d\b\37\1\2\u021d\u021e\7\17\2\2\u021e\u021f\5> \2\u021f\u0220\b\37"+
		"\1\2\u0220\u0221\b\37\1\2\u0221\u0223\3\2\2\2\u0222\u021c\3\2\2\2\u0223"+
		"\u0226\3\2\2\2\u0224\u0222\3\2\2\2\u0224\u0225\3\2\2\2\u0225=\3\2\2\2"+
		"\u0226\u0224\3\2\2\2\u0227\u0228\5@!\2\u0228\u0235\b \1\2\u0229\u022a"+
		"\7\21\2\2\u022a\u022e\b \1\2\u022b\u022c\7\22\2\2\u022c\u022e\b \1\2\u022d"+
		"\u0229\3\2\2\2\u022d\u022b\3\2\2\2\u022e\u022f\3\2\2\2\u022f\u0230\5@"+
		"!\2\u0230\u0231\b \1\2\u0231\u0232\b \1\2\u0232\u0234\3\2\2\2\u0233\u022d"+
		"\3\2\2\2\u0234\u0237\3\2\2\2\u0235\u0233\3\2\2\2\u0235\u0236\3\2\2\2\u0236"+
		"?\3\2\2\2\u0237\u0235\3\2\2\2\u0238\u0239\5B\"\2\u0239\u0246\b!\1\2\u023a"+
		"\u023b\7\13\2\2\u023b\u023f\b!\1\2\u023c\u023d\7\f\2\2\u023d\u023f\b!"+
		"\1\2\u023e\u023a\3\2\2\2\u023e\u023c\3\2\2\2\u023f\u0240\3\2\2\2\u0240"+
		"\u0241\5B\"\2\u0241\u0242\b!\1\2\u0242\u0243\b!\1\2\u0243\u0245\3\2\2"+
		"\2\u0244\u023e\3\2\2\2\u0245\u0248\3\2\2\2\u0246\u0244\3\2\2\2\u0246\u0247"+
		"\3\2\2\2\u0247A\3\2\2\2\u0248\u0246\3\2\2\2\u0249\u024a\5D#\2\u024a\u0257"+
		"\b\"\1\2\u024b\u024c\7\r\2\2\u024c\u0250\b\"\1\2\u024d\u024e\7\16\2\2"+
		"\u024e\u0250\b\"\1\2\u024f\u024b\3\2\2\2\u024f\u024d\3\2\2\2\u0250\u0251"+
		"\3\2\2\2\u0251\u0252\5D#\2\u0252\u0253\b\"\1\2\u0253\u0254\b\"\1\2\u0254"+
		"\u0256\3\2\2\2\u0255\u024f\3\2\2\2\u0256\u0259\3\2\2\2\u0257\u0255\3\2"+
		"\2\2\u0257\u0258\3\2\2\2\u0258C\3\2\2\2\u0259\u0257\3\2\2\2\u025a\u025b"+
		"\7\25\2\2\u025b\u025f\b#\1\2\u025c\u025d\7\f\2\2\u025d\u025f\b#\1\2\u025e"+
		"\u025a\3\2\2\2\u025e\u025c\3\2\2\2\u025f\u0260\3\2\2\2\u0260\u0261\5D"+
		"#\2\u0261\u0262\b#\1\2\u0262\u0263\b#\1\2\u0263\u0269\3\2\2\2\u0264\u0265"+
		"\5F$\2\u0265\u0266\b#\1\2\u0266\u0267\b#\1\2\u0267\u0269\3\2\2\2\u0268"+
		"\u025e\3\2\2\2\u0268\u0264\3\2\2\2\u0269E\3\2\2\2\u026a\u026b\5H%\2\u026b"+
		"\u027a\b$\1\2\u026c\u026d\7%\2\2\u026d\u026e\5\30\r\2\u026e\u026f\7&\2"+
		"\2\u026f\u0270\b$\1\2\u0270\u0271\3\2\2\2\u0271\u0272\b$\1\2\u0272\u0279"+
		"\3\2\2\2\u0273\u0274\7*\2\2\u0274\u0275\5R*\2\u0275\u0276\b$\1\2\u0276"+
		"\u0277\b$\1\2\u0277\u0279\3\2\2\2\u0278\u026c\3\2\2\2\u0278\u0273\3\2"+
		"\2\2\u0279\u027c\3\2\2\2\u027a\u0278\3\2\2\2\u027a\u027b\3\2\2\2\u027b"+
		"\u028b\3\2\2\2\u027c\u027a\3\2\2\2\u027d\u027e\7\'\2\2\u027e\u027f\5\66"+
		"\34\2\u027f\u0280\b$\1\2\u0280\u0281\7(\2\2\u0281\u0282\3\2\2\2\u0282"+
		"\u0283\b$\1\2\u0283\u028a\3\2\2\2\u0284\u0285\7*\2\2\u0285\u0286\5R*\2"+
		"\u0286\u0287\b$\1\2\u0287\u0288\b$\1\2\u0288\u028a\3\2\2\2\u0289\u027d"+
		"\3\2\2\2\u0289\u0284\3\2\2\2\u028a\u028d\3\2\2\2\u028b\u0289\3\2\2\2\u028b"+
		"\u028c\3\2\2\2\u028cG\3\2\2\2\u028d\u028b\3\2\2\2\u028e\u028f\5N(\2\u028f"+
		"\u0290\b%\1\2\u0290\u02a2\3\2\2\2\u0291\u0292\5R*\2\u0292\u0293\b%\1\2"+
		"\u0293\u02a2\3\2\2\2\u0294\u0295\7%\2\2\u0295\u0296\5\30\r\2\u0296\u0297"+
		"\b%\1\2\u0297\u0298\3\2\2\2\u0298\u0299\7&\2\2\u0299\u029a\b%\1\2\u029a"+
		"\u02a2\3\2\2\2\u029b\u029c\5J&\2\u029c\u029d\b%\1\2\u029d\u02a2\3\2\2"+
		"\2\u029e\u029f\5L\'\2\u029f\u02a0\b%\1\2\u02a0\u02a2\3\2\2\2\u02a1\u028e"+
		"\3\2\2\2\u02a1\u0291\3\2\2\2\u02a1\u0294\3\2\2\2\u02a1\u029b\3\2\2\2\u02a1"+
		"\u029e\3\2\2\2\u02a2I\3\2\2\2\u02a3\u02a4\7\6\2\2\u02a4\u02a5\7%\2\2\u02a5"+
		"\u02a6\5\66\34\2\u02a6\u02a7\7&\2\2\u02a7\u02a8\b&\1\2\u02a8\u02a9\b&"+
		"\1\2\u02a9K\3\2\2\2\u02aa\u02ab\7\b\2\2\u02ab\u02ac\7%\2\2\u02ac\u02ad"+
		"\5\66\34\2\u02ad\u02ae\7)\2\2\u02ae\u02af\5\66\34\2\u02af\u02b0\7&\2\2"+
		"\u02b0\u02b1\b\'\1\2\u02b1\u02b2\b\'\1\2\u02b2M\3\2\2\2\u02b3\u02b4\5"+
		"P)\2\u02b4\u02b5\b(\1\2\u02b5\u02b9\3\2\2\2\u02b6\u02b7\7-\2\2\u02b7\u02b9"+
		"\b(\1\2\u02b8\u02b3\3\2\2\2\u02b8\u02b6\3\2\2\2\u02b9O\3\2\2\2\u02ba\u02bb"+
		"\7\26\2\2\u02bb\u02bf\b)\1\2\u02bc\u02bd\7\27\2\2\u02bd\u02bf\b)\1\2\u02be"+
		"\u02ba\3\2\2\2\u02be\u02bc\3\2\2\2\u02bfQ\3\2\2\2\u02c0\u02c1\7.\2\2\u02c1"+
		"\u02c2\b*\1\2\u02c2S\3\2\2\2\u02c3\u02c4\7\32\2\2\u02c4\u02d4\b+\1\2\u02c5"+
		"\u02c6\7\33\2\2\u02c6\u02d4\b+\1\2\u02c7\u02c8\7\34\2\2\u02c8\u02c9\7"+
		"$\2\2\u02c9\u02ca\5T+\2\u02ca\u02cb\b+\1\2\u02cb\u02d4\3\2\2\2\u02cc\u02cd"+
		"\7\35\2\2\u02cd\u02ce\5R*\2\u02ce\u02cf\b+\1\2\u02cf\u02d4\3\2\2\2\u02d0"+
		"\u02d1\5V,\2\u02d1\u02d2\b+\1\2\u02d2\u02d4\3\2\2\2\u02d3\u02c3\3\2\2"+
		"\2\u02d3\u02c5\3\2\2\2\u02d3\u02c7\3\2\2\2\u02d3\u02cc\3\2\2\2\u02d3\u02d0"+
		"\3\2\2\2\u02d4U\3\2\2\2\u02d5\u02d6\b,\1\2\u02d6\u02d7\7\36\2\2\u02d7"+
		"\u02e5\7\22\2\2\u02d8\u02d9\7\5\2\2\u02d9\u02e6\b,\1\2\u02da\u02db\5T"+
		"+\2\u02db\u02e2\b,\1\2\u02dc\u02dd\7)\2\2\u02dd\u02de\5T+\2\u02de\u02df"+
		"\b,\1\2\u02df\u02e1\3\2\2\2\u02e0\u02dc\3\2\2\2\u02e1\u02e4\3\2\2\2\u02e2"+
		"\u02e0\3\2\2\2\u02e2\u02e3\3\2\2\2\u02e3\u02e6\3\2\2\2\u02e4\u02e2\3\2"+
		"\2\2\u02e5\u02d8\3\2\2\2\u02e5\u02da\3\2\2\2\u02e6\u02e7\3\2\2\2\u02e7"+
		"\u02ed\7\20\2\2\u02e8\u02e9\5T+\2\u02e9\u02ea\b,\1\2\u02ea\u02ee\3\2\2"+
		"\2\u02eb\u02ec\7\5\2\2\u02ec\u02ee\b,\1\2\u02ed\u02e8\3\2\2\2\u02ed\u02eb"+
		"\3\2\2\2\u02ee\u02ef\3\2\2\2\u02ef\u02f0\7\21\2\2\u02f0\u02f1\b,\1\2\u02f1"+
		"W\3\2\2\2E[cnv\u008d\u0094\u0099\u009b\u00a0\u00ae\u00bc\u00c1\u00c9\u00cf"+
		"\u00d3\u00db\u00e3\u00eb\u00f7\u0105\u0108\u0115\u0118\u0122\u0127\u0129"+
		"\u0131\u0136\u013e\u0146\u014c\u0150\u0155\u0162\u016c\u0172\u0184\u0186"+
		"\u0194\u01a4\u01a9\u01b6\u01c6\u01f4\u01fe\u020a\u0217\u0224\u022d\u0235"+
		"\u023e\u0246\u024f\u0257\u025e\u0268\u0278\u027a\u0289\u028b\u02a1\u02b8"+
		"\u02be\u02d3\u02e2\u02e5\u02ed";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}