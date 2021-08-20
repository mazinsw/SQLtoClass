// Generated from /home/mazinsw/Development/SQLtoClass/src/parser/SQLParser.g4 by ANTLR 4.8
package parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SQLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BOOL=1, K_DROP=2, K_DATABASE=3, K_SCHEMA=4, K_IF=5, K_EXISTS=6, K_NOT=7, 
		K_DEFAULT=8, K_CHARACTER=9, K_SET=10, K_COLLATE=11, K_USE=12, K_TEMPORARY=13, 
		K_TABLE=14, K_RESTRICT=15, K_CASCADE=16, K_CONSTRAINT=17, K_PRIMARY=18, 
		K_KEY=19, K_INDEX=20, K_UNIQUE=21, K_FOREIGN=22, K_COMMENT=23, K_AUTO_INCREMENT=24, 
		K_NULL=25, K_REFERENCES=26, K_ON=27, K_DELETE=28, K_UPDATE=29, K_ASC=30, 
		K_DESC=31, K_BIT=32, K_TINYINT=33, K_UNSIGNED=34, K_BINARY=35, K_ZEROFILL=36, 
		K_SMALLINT=37, K_MEDIUMINT=38, K_INT=39, K_INTEGER=40, K_BIGINT=41, K_REAL=42, 
		K_DOUBLE=43, K_FLOAT=44, K_DECIMAL=45, K_NUMERIC=46, K_BOOL=47, K_BOOLEAN=48, 
		K_DATE=49, K_TIME=50, K_TIMESTAMP=51, K_DATETIME=52, K_YEAR=53, K_CHAR=54, 
		K_VARCHAR=55, K_VARBINARY=56, K_TINYBLOB=57, K_BLOB=58, K_MEDIUMBLOB=59, 
		K_LONGBLOB=60, K_JSON=61, K_TINYTEXT=62, K_TEXT=63, K_MEDIUMTEXT=64, K_LONGTEXT=65, 
		K_ENUM=66, K_NO=67, K_ACTION=68, K_CREATE=69, K_FALSE=70, K_TRUE=71, DOT=72, 
		EQ=73, SINGLE_QUOTE=74, DOUBLE_QUOTE=75, BACK_QUOTE=76, AT=77, COMMA=78, 
		SEMICOLON=79, LPAR=80, RPAR=81, ID=82, NAME=83, INT=84, FLOAT=85, STRING=86, 
		COMMENT=87, SINGLE_COMMENT=88, WS=89;
	public static final int
		RULE_script = 0, RULE_stmt = 1, RULE_dropSchema = 2, RULE_createSchema = 3, 
		RULE_createSpecification = 4, RULE_tableComment = 5, RULE_setStmt = 6, 
		RULE_setOption = 7, RULE_setDefaultValue = 8, RULE_useStmt = 9, RULE_dropTable = 10, 
		RULE_dropTableName = 11, RULE_createTable = 12, RULE_tableName = 13, RULE_fieldList = 14, 
		RULE_createDefinition = 15, RULE_columnName = 16, RULE_constraintName = 17, 
		RULE_constraintTable = 18, RULE_columnDefinition = 19, RULE_autoIncrement = 20, 
		RULE_columnDefaultValue = 21, RULE_columnNull = 22, RULE_columnNotNull = 23, 
		RULE_fieldComment = 24, RULE_referenceDefinition = 25, RULE_referenceDeleteOption = 26, 
		RULE_referenceUpdateOption = 27, RULE_referenceTable = 28, RULE_indexColName = 29, 
		RULE_dataType = 30, RULE_stringItem = 31, RULE_charsetName = 32, RULE_collateName = 33, 
		RULE_referenceOption = 34, RULE_defaultValue = 35, RULE_tableOptions = 36, 
		RULE_option = 37, RULE_idName = 38;
	private static String[] makeRuleNames() {
		return new String[] {
			"script", "stmt", "dropSchema", "createSchema", "createSpecification", 
			"tableComment", "setStmt", "setOption", "setDefaultValue", "useStmt", 
			"dropTable", "dropTableName", "createTable", "tableName", "fieldList", 
			"createDefinition", "columnName", "constraintName", "constraintTable", 
			"columnDefinition", "autoIncrement", "columnDefaultValue", "columnNull", 
			"columnNotNull", "fieldComment", "referenceDefinition", "referenceDeleteOption", 
			"referenceUpdateOption", "referenceTable", "indexColName", "dataType", 
			"stringItem", "charsetName", "collateName", "referenceOption", "defaultValue", 
			"tableOptions", "option", "idName"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"'.'", "'='", "'''", "'\"'", "'`'", "'@'", "','", "';'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BOOL", "K_DROP", "K_DATABASE", "K_SCHEMA", "K_IF", "K_EXISTS", 
			"K_NOT", "K_DEFAULT", "K_CHARACTER", "K_SET", "K_COLLATE", "K_USE", "K_TEMPORARY", 
			"K_TABLE", "K_RESTRICT", "K_CASCADE", "K_CONSTRAINT", "K_PRIMARY", "K_KEY", 
			"K_INDEX", "K_UNIQUE", "K_FOREIGN", "K_COMMENT", "K_AUTO_INCREMENT", 
			"K_NULL", "K_REFERENCES", "K_ON", "K_DELETE", "K_UPDATE", "K_ASC", "K_DESC", 
			"K_BIT", "K_TINYINT", "K_UNSIGNED", "K_BINARY", "K_ZEROFILL", "K_SMALLINT", 
			"K_MEDIUMINT", "K_INT", "K_INTEGER", "K_BIGINT", "K_REAL", "K_DOUBLE", 
			"K_FLOAT", "K_DECIMAL", "K_NUMERIC", "K_BOOL", "K_BOOLEAN", "K_DATE", 
			"K_TIME", "K_TIMESTAMP", "K_DATETIME", "K_YEAR", "K_CHAR", "K_VARCHAR", 
			"K_VARBINARY", "K_TINYBLOB", "K_BLOB", "K_MEDIUMBLOB", "K_LONGBLOB", 
			"K_JSON", "K_TINYTEXT", "K_TEXT", "K_MEDIUMTEXT", "K_LONGTEXT", "K_ENUM", 
			"K_NO", "K_ACTION", "K_CREATE", "K_FALSE", "K_TRUE", "DOT", "EQ", "SINGLE_QUOTE", 
			"DOUBLE_QUOTE", "BACK_QUOTE", "AT", "COMMA", "SEMICOLON", "LPAR", "RPAR", 
			"ID", "NAME", "INT", "FLOAT", "STRING", "COMMENT", "SINGLE_COMMENT", 
			"WS"
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
	public String getGrammarFileName() { return "SQLParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SQLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ScriptContext extends ParserRuleContext {
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public ScriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_script; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterScript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitScript(this);
		}
	}

	public final ScriptContext script() throws RecognitionException {
		ScriptContext _localctx = new ScriptContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_script);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_DROP) | (1L << K_SET) | (1L << K_USE))) != 0) || _la==K_CREATE || _la==SEMICOLON) {
				{
				{
				setState(78);
				stmt();
				}
				}
				setState(83);
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

	public static class StmtContext extends ParserRuleContext {
		public CreateSchemaContext createSchema() {
			return getRuleContext(CreateSchemaContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(SQLParser.SEMICOLON, 0); }
		public DropSchemaContext dropSchema() {
			return getRuleContext(DropSchemaContext.class,0);
		}
		public CreateTableContext createTable() {
			return getRuleContext(CreateTableContext.class,0);
		}
		public DropTableContext dropTable() {
			return getRuleContext(DropTableContext.class,0);
		}
		public UseStmtContext useStmt() {
			return getRuleContext(UseStmtContext.class,0);
		}
		public SetStmtContext setStmt() {
			return getRuleContext(SetStmtContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitStmt(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stmt);
		try {
			setState(103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				createSchema();
				setState(85);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				dropSchema();
				setState(88);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(90);
				createTable();
				setState(91);
				match(SEMICOLON);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(93);
				dropTable();
				setState(94);
				match(SEMICOLON);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(96);
				useStmt();
				setState(97);
				match(SEMICOLON);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(99);
				setStmt();
				setState(100);
				match(SEMICOLON);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(102);
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

	public static class DropSchemaContext extends ParserRuleContext {
		public TerminalNode K_DROP() { return getToken(SQLParser.K_DROP, 0); }
		public IdNameContext idName() {
			return getRuleContext(IdNameContext.class,0);
		}
		public TerminalNode K_DATABASE() { return getToken(SQLParser.K_DATABASE, 0); }
		public TerminalNode K_SCHEMA() { return getToken(SQLParser.K_SCHEMA, 0); }
		public TerminalNode K_IF() { return getToken(SQLParser.K_IF, 0); }
		public TerminalNode K_EXISTS() { return getToken(SQLParser.K_EXISTS, 0); }
		public DropSchemaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropSchema; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterDropSchema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitDropSchema(this);
		}
	}

	public final DropSchemaContext dropSchema() throws RecognitionException {
		DropSchemaContext _localctx = new DropSchemaContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_dropSchema);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(K_DROP);
			setState(106);
			_la = _input.LA(1);
			if ( !(_la==K_DATABASE || _la==K_SCHEMA) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_IF) {
				{
				setState(107);
				match(K_IF);
				setState(108);
				match(K_EXISTS);
				}
			}

			setState(111);
			idName();
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

	public static class CreateSchemaContext extends ParserRuleContext {
		public TerminalNode K_CREATE() { return getToken(SQLParser.K_CREATE, 0); }
		public IdNameContext idName() {
			return getRuleContext(IdNameContext.class,0);
		}
		public TerminalNode K_DATABASE() { return getToken(SQLParser.K_DATABASE, 0); }
		public TerminalNode K_SCHEMA() { return getToken(SQLParser.K_SCHEMA, 0); }
		public TerminalNode K_IF() { return getToken(SQLParser.K_IF, 0); }
		public TerminalNode K_NOT() { return getToken(SQLParser.K_NOT, 0); }
		public TerminalNode K_EXISTS() { return getToken(SQLParser.K_EXISTS, 0); }
		public List<CreateSpecificationContext> createSpecification() {
			return getRuleContexts(CreateSpecificationContext.class);
		}
		public CreateSpecificationContext createSpecification(int i) {
			return getRuleContext(CreateSpecificationContext.class,i);
		}
		public CreateSchemaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createSchema; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterCreateSchema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitCreateSchema(this);
		}
	}

	public final CreateSchemaContext createSchema() throws RecognitionException {
		CreateSchemaContext _localctx = new CreateSchemaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_createSchema);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(K_CREATE);
			setState(114);
			_la = _input.LA(1);
			if ( !(_la==K_DATABASE || _la==K_SCHEMA) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_IF) {
				{
				setState(115);
				match(K_IF);
				setState(116);
				match(K_NOT);
				setState(117);
				match(K_EXISTS);
				}
			}

			setState(120);
			idName();
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_DEFAULT) | (1L << K_CHARACTER) | (1L << K_COLLATE) | (1L << K_COMMENT))) != 0)) {
				{
				{
				setState(121);
				createSpecification();
				}
				}
				setState(126);
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

	public static class CreateSpecificationContext extends ParserRuleContext {
		public TerminalNode K_CHARACTER() { return getToken(SQLParser.K_CHARACTER, 0); }
		public TerminalNode K_SET() { return getToken(SQLParser.K_SET, 0); }
		public CharsetNameContext charsetName() {
			return getRuleContext(CharsetNameContext.class,0);
		}
		public TerminalNode K_DEFAULT() { return getToken(SQLParser.K_DEFAULT, 0); }
		public TerminalNode EQ() { return getToken(SQLParser.EQ, 0); }
		public TerminalNode K_COLLATE() { return getToken(SQLParser.K_COLLATE, 0); }
		public CollateNameContext collateName() {
			return getRuleContext(CollateNameContext.class,0);
		}
		public TerminalNode K_COMMENT() { return getToken(SQLParser.K_COMMENT, 0); }
		public TableCommentContext tableComment() {
			return getRuleContext(TableCommentContext.class,0);
		}
		public CreateSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterCreateSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitCreateSpecification(this);
		}
	}

	public final CreateSpecificationContext createSpecification() throws RecognitionException {
		CreateSpecificationContext _localctx = new CreateSpecificationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_createSpecification);
		int _la;
		try {
			setState(147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_DEFAULT) {
					{
					setState(127);
					match(K_DEFAULT);
					}
				}

				setState(130);
				match(K_CHARACTER);
				setState(131);
				match(K_SET);
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ) {
					{
					setState(132);
					match(EQ);
					}
				}

				setState(135);
				charsetName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_DEFAULT) {
					{
					setState(136);
					match(K_DEFAULT);
					}
				}

				setState(139);
				match(K_COLLATE);
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ) {
					{
					setState(140);
					match(EQ);
					}
				}

				setState(143);
				collateName();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(144);
				match(K_COMMENT);
				setState(145);
				match(EQ);
				setState(146);
				tableComment();
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

	public static class TableCommentContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(SQLParser.STRING, 0); }
		public TableCommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableComment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterTableComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitTableComment(this);
		}
	}

	public final TableCommentContext tableComment() throws RecognitionException {
		TableCommentContext _localctx = new TableCommentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_tableComment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(STRING);
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

	public static class SetStmtContext extends ParserRuleContext {
		public TerminalNode K_SET() { return getToken(SQLParser.K_SET, 0); }
		public List<SetOptionContext> setOption() {
			return getRuleContexts(SetOptionContext.class);
		}
		public SetOptionContext setOption(int i) {
			return getRuleContext(SetOptionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public SetStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterSetStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitSetStmt(this);
		}
	}

	public final SetStmtContext setStmt() throws RecognitionException {
		SetStmtContext _localctx = new SetStmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_setStmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(K_SET);
			setState(157);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(152);
					setOption();
					setState(153);
					match(COMMA);
					}
					} 
				}
				setState(159);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(160);
			setOption();
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

	public static class SetOptionContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(SQLParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(SQLParser.NAME, i);
		}
		public TerminalNode EQ() { return getToken(SQLParser.EQ, 0); }
		public SetDefaultValueContext setDefaultValue() {
			return getRuleContext(SetDefaultValueContext.class,0);
		}
		public List<TerminalNode> AT() { return getTokens(SQLParser.AT); }
		public TerminalNode AT(int i) {
			return getToken(SQLParser.AT, i);
		}
		public SetOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setOption; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterSetOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitSetOption(this);
		}
	}

	public final SetOptionContext setOption() throws RecognitionException {
		SetOptionContext _localctx = new SetOptionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_setOption);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(162);
				match(AT);
				}
				}
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(168);
			match(NAME);
			setState(169);
			match(EQ);
			setState(178);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
			case K_NULL:
			case INT:
			case FLOAT:
			case STRING:
				{
				setState(170);
				setDefaultValue();
				}
				break;
			case AT:
			case NAME:
				{
				{
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(171);
					match(AT);
					}
					}
					setState(176);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(177);
				match(NAME);
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

	public static class SetDefaultValueContext extends ParserRuleContext {
		public DefaultValueContext defaultValue() {
			return getRuleContext(DefaultValueContext.class,0);
		}
		public SetDefaultValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setDefaultValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterSetDefaultValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitSetDefaultValue(this);
		}
	}

	public final SetDefaultValueContext setDefaultValue() throws RecognitionException {
		SetDefaultValueContext _localctx = new SetDefaultValueContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_setDefaultValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			defaultValue();
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

	public static class UseStmtContext extends ParserRuleContext {
		public TerminalNode K_USE() { return getToken(SQLParser.K_USE, 0); }
		public IdNameContext idName() {
			return getRuleContext(IdNameContext.class,0);
		}
		public UseStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterUseStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitUseStmt(this);
		}
	}

	public final UseStmtContext useStmt() throws RecognitionException {
		UseStmtContext _localctx = new UseStmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_useStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(K_USE);
			setState(183);
			idName();
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

	public static class DropTableContext extends ParserRuleContext {
		public TerminalNode K_DROP() { return getToken(SQLParser.K_DROP, 0); }
		public TerminalNode K_TABLE() { return getToken(SQLParser.K_TABLE, 0); }
		public List<DropTableNameContext> dropTableName() {
			return getRuleContexts(DropTableNameContext.class);
		}
		public DropTableNameContext dropTableName(int i) {
			return getRuleContext(DropTableNameContext.class,i);
		}
		public TerminalNode K_TEMPORARY() { return getToken(SQLParser.K_TEMPORARY, 0); }
		public TerminalNode K_IF() { return getToken(SQLParser.K_IF, 0); }
		public TerminalNode K_EXISTS() { return getToken(SQLParser.K_EXISTS, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public TerminalNode K_RESTRICT() { return getToken(SQLParser.K_RESTRICT, 0); }
		public TerminalNode K_CASCADE() { return getToken(SQLParser.K_CASCADE, 0); }
		public DropTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterDropTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitDropTable(this);
		}
	}

	public final DropTableContext dropTable() throws RecognitionException {
		DropTableContext _localctx = new DropTableContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_dropTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(K_DROP);
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TEMPORARY) {
				{
				setState(186);
				match(K_TEMPORARY);
				}
			}

			setState(189);
			match(K_TABLE);
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_IF) {
				{
				setState(190);
				match(K_IF);
				setState(191);
				match(K_EXISTS);
				}
			}

			setState(194);
			dropTableName();
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(195);
				match(COMMA);
				setState(196);
				dropTableName();
				}
				}
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_RESTRICT || _la==K_CASCADE) {
				{
				setState(202);
				_la = _input.LA(1);
				if ( !(_la==K_RESTRICT || _la==K_CASCADE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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

	public static class DropTableNameContext extends ParserRuleContext {
		public IdNameContext idName() {
			return getRuleContext(IdNameContext.class,0);
		}
		public DropTableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropTableName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterDropTableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitDropTableName(this);
		}
	}

	public final DropTableNameContext dropTableName() throws RecognitionException {
		DropTableNameContext _localctx = new DropTableNameContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_dropTableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			idName();
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

	public static class CreateTableContext extends ParserRuleContext {
		public TerminalNode K_CREATE() { return getToken(SQLParser.K_CREATE, 0); }
		public TerminalNode K_TABLE() { return getToken(SQLParser.K_TABLE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(SQLParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SQLParser.RPAR, 0); }
		public TableOptionsContext tableOptions() {
			return getRuleContext(TableOptionsContext.class,0);
		}
		public TerminalNode K_TEMPORARY() { return getToken(SQLParser.K_TEMPORARY, 0); }
		public TerminalNode K_IF() { return getToken(SQLParser.K_IF, 0); }
		public TerminalNode K_NOT() { return getToken(SQLParser.K_NOT, 0); }
		public TerminalNode K_EXISTS() { return getToken(SQLParser.K_EXISTS, 0); }
		public FieldListContext fieldList() {
			return getRuleContext(FieldListContext.class,0);
		}
		public CreateTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterCreateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitCreateTable(this);
		}
	}

	public final CreateTableContext createTable() throws RecognitionException {
		CreateTableContext _localctx = new CreateTableContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_createTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(K_CREATE);
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TEMPORARY) {
				{
				setState(208);
				match(K_TEMPORARY);
				}
			}

			setState(211);
			match(K_TABLE);
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_IF) {
				{
				setState(212);
				match(K_IF);
				setState(213);
				match(K_NOT);
				setState(214);
				match(K_EXISTS);
				}
			}

			setState(217);
			tableName();
			setState(218);
			match(LPAR);
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_CONSTRAINT) | (1L << K_PRIMARY) | (1L << K_KEY) | (1L << K_INDEX) | (1L << K_UNIQUE) | (1L << K_FOREIGN))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (SINGLE_QUOTE - 74)) | (1L << (DOUBLE_QUOTE - 74)) | (1L << (ID - 74)) | (1L << (NAME - 74)))) != 0)) {
				{
				setState(219);
				fieldList();
				}
			}

			setState(222);
			match(RPAR);
			setState(223);
			tableOptions();
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

	public static class TableNameContext extends ParserRuleContext {
		public IdNameContext idName() {
			return getRuleContext(IdNameContext.class,0);
		}
		public TableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterTableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitTableName(this);
		}
	}

	public final TableNameContext tableName() throws RecognitionException {
		TableNameContext _localctx = new TableNameContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_tableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			idName();
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

	public static class FieldListContext extends ParserRuleContext {
		public List<CreateDefinitionContext> createDefinition() {
			return getRuleContexts(CreateDefinitionContext.class);
		}
		public CreateDefinitionContext createDefinition(int i) {
			return getRuleContext(CreateDefinitionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public FieldListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterFieldList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitFieldList(this);
		}
	}

	public final FieldListContext fieldList() throws RecognitionException {
		FieldListContext _localctx = new FieldListContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_fieldList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(227);
					createDefinition();
					setState(228);
					match(COMMA);
					}
					} 
				}
				setState(234);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			setState(235);
			createDefinition();
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

	public static class CreateDefinitionContext extends ParserRuleContext {
		public CreateDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createDefinition; }
	 
		public CreateDefinitionContext() { }
		public void copyFrom(CreateDefinitionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ForeignStmtContext extends CreateDefinitionContext {
		public TerminalNode K_FOREIGN() { return getToken(SQLParser.K_FOREIGN, 0); }
		public TerminalNode K_KEY() { return getToken(SQLParser.K_KEY, 0); }
		public TerminalNode LPAR() { return getToken(SQLParser.LPAR, 0); }
		public List<IndexColNameContext> indexColName() {
			return getRuleContexts(IndexColNameContext.class);
		}
		public IndexColNameContext indexColName(int i) {
			return getRuleContext(IndexColNameContext.class,i);
		}
		public TerminalNode RPAR() { return getToken(SQLParser.RPAR, 0); }
		public ReferenceDefinitionContext referenceDefinition() {
			return getRuleContext(ReferenceDefinitionContext.class,0);
		}
		public TerminalNode K_CONSTRAINT() { return getToken(SQLParser.K_CONSTRAINT, 0); }
		public ConstraintTableContext constraintTable() {
			return getRuleContext(ConstraintTableContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public ConstraintNameContext constraintName() {
			return getRuleContext(ConstraintNameContext.class,0);
		}
		public ForeignStmtContext(CreateDefinitionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterForeignStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitForeignStmt(this);
		}
	}
	public static class PrimaryKeyStmtContext extends CreateDefinitionContext {
		public TerminalNode K_PRIMARY() { return getToken(SQLParser.K_PRIMARY, 0); }
		public TerminalNode K_KEY() { return getToken(SQLParser.K_KEY, 0); }
		public TerminalNode LPAR() { return getToken(SQLParser.LPAR, 0); }
		public List<IndexColNameContext> indexColName() {
			return getRuleContexts(IndexColNameContext.class);
		}
		public IndexColNameContext indexColName(int i) {
			return getRuleContext(IndexColNameContext.class,i);
		}
		public TerminalNode RPAR() { return getToken(SQLParser.RPAR, 0); }
		public TerminalNode K_CONSTRAINT() { return getToken(SQLParser.K_CONSTRAINT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public ConstraintNameContext constraintName() {
			return getRuleContext(ConstraintNameContext.class,0);
		}
		public PrimaryKeyStmtContext(CreateDefinitionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterPrimaryKeyStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitPrimaryKeyStmt(this);
		}
	}
	public static class IndexStmtContext extends CreateDefinitionContext {
		public TerminalNode LPAR() { return getToken(SQLParser.LPAR, 0); }
		public List<IndexColNameContext> indexColName() {
			return getRuleContexts(IndexColNameContext.class);
		}
		public IndexColNameContext indexColName(int i) {
			return getRuleContext(IndexColNameContext.class,i);
		}
		public TerminalNode RPAR() { return getToken(SQLParser.RPAR, 0); }
		public TerminalNode K_INDEX() { return getToken(SQLParser.K_INDEX, 0); }
		public TerminalNode K_KEY() { return getToken(SQLParser.K_KEY, 0); }
		public ConstraintNameContext constraintName() {
			return getRuleContext(ConstraintNameContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public IndexStmtContext(CreateDefinitionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterIndexStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitIndexStmt(this);
		}
	}
	public static class UniqueStmtContext extends CreateDefinitionContext {
		public TerminalNode K_UNIQUE() { return getToken(SQLParser.K_UNIQUE, 0); }
		public TerminalNode LPAR() { return getToken(SQLParser.LPAR, 0); }
		public List<IndexColNameContext> indexColName() {
			return getRuleContexts(IndexColNameContext.class);
		}
		public IndexColNameContext indexColName(int i) {
			return getRuleContext(IndexColNameContext.class,i);
		}
		public TerminalNode RPAR() { return getToken(SQLParser.RPAR, 0); }
		public TerminalNode K_CONSTRAINT() { return getToken(SQLParser.K_CONSTRAINT, 0); }
		public ConstraintTableContext constraintTable() {
			return getRuleContext(ConstraintTableContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public TerminalNode K_INDEX() { return getToken(SQLParser.K_INDEX, 0); }
		public TerminalNode K_KEY() { return getToken(SQLParser.K_KEY, 0); }
		public ConstraintNameContext constraintName() {
			return getRuleContext(ConstraintNameContext.class,0);
		}
		public UniqueStmtContext(CreateDefinitionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterUniqueStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitUniqueStmt(this);
		}
	}
	public static class FieldStmtContext extends CreateDefinitionContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public ColumnDefinitionContext columnDefinition() {
			return getRuleContext(ColumnDefinitionContext.class,0);
		}
		public FieldStmtContext(CreateDefinitionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterFieldStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitFieldStmt(this);
		}
	}

	public final CreateDefinitionContext createDefinition() throws RecognitionException {
		CreateDefinitionContext _localctx = new CreateDefinitionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_createDefinition);
		int _la;
		try {
			int _alt;
			setState(325);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				_localctx = new FieldStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(237);
				columnName();
				setState(238);
				columnDefinition();
				}
				break;
			case 2:
				_localctx = new PrimaryKeyStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(244);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_CONSTRAINT) {
					{
					setState(240);
					match(K_CONSTRAINT);
					setState(242);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (SINGLE_QUOTE - 74)) | (1L << (DOUBLE_QUOTE - 74)) | (1L << (ID - 74)) | (1L << (NAME - 74)))) != 0)) {
						{
						setState(241);
						constraintName();
						}
					}

					}
				}

				setState(246);
				match(K_PRIMARY);
				setState(247);
				match(K_KEY);
				setState(248);
				match(LPAR);
				setState(254);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(249);
						indexColName();
						setState(250);
						match(COMMA);
						}
						} 
					}
					setState(256);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				}
				setState(257);
				indexColName();
				setState(258);
				match(RPAR);
				}
				break;
			case 3:
				_localctx = new IndexStmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(260);
				_la = _input.LA(1);
				if ( !(_la==K_KEY || _la==K_INDEX) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(262);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (SINGLE_QUOTE - 74)) | (1L << (DOUBLE_QUOTE - 74)) | (1L << (ID - 74)) | (1L << (NAME - 74)))) != 0)) {
					{
					setState(261);
					constraintName();
					}
				}

				setState(264);
				match(LPAR);
				setState(270);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(265);
						indexColName();
						setState(266);
						match(COMMA);
						}
						} 
					}
					setState(272);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				}
				setState(273);
				indexColName();
				setState(274);
				match(RPAR);
				}
				break;
			case 4:
				_localctx = new UniqueStmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(280);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_CONSTRAINT) {
					{
					setState(276);
					match(K_CONSTRAINT);
					setState(278);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (SINGLE_QUOTE - 74)) | (1L << (DOUBLE_QUOTE - 74)) | (1L << (ID - 74)) | (1L << (NAME - 74)))) != 0)) {
						{
						setState(277);
						constraintName();
						}
					}

					}
				}

				setState(282);
				match(K_UNIQUE);
				setState(284);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_KEY || _la==K_INDEX) {
					{
					setState(283);
					_la = _input.LA(1);
					if ( !(_la==K_KEY || _la==K_INDEX) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(287);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (SINGLE_QUOTE - 74)) | (1L << (DOUBLE_QUOTE - 74)) | (1L << (ID - 74)) | (1L << (NAME - 74)))) != 0)) {
					{
					setState(286);
					constraintTable();
					}
				}

				setState(289);
				match(LPAR);
				setState(295);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(290);
						indexColName();
						setState(291);
						match(COMMA);
						}
						} 
					}
					setState(297);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				}
				setState(298);
				indexColName();
				setState(299);
				match(RPAR);
				}
				break;
			case 5:
				_localctx = new ForeignStmtContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(305);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_CONSTRAINT) {
					{
					setState(301);
					match(K_CONSTRAINT);
					setState(303);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (SINGLE_QUOTE - 74)) | (1L << (DOUBLE_QUOTE - 74)) | (1L << (ID - 74)) | (1L << (NAME - 74)))) != 0)) {
						{
						setState(302);
						constraintName();
						}
					}

					}
				}

				setState(307);
				match(K_FOREIGN);
				setState(308);
				match(K_KEY);
				setState(310);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (SINGLE_QUOTE - 74)) | (1L << (DOUBLE_QUOTE - 74)) | (1L << (ID - 74)) | (1L << (NAME - 74)))) != 0)) {
					{
					setState(309);
					constraintTable();
					}
				}

				setState(312);
				match(LPAR);
				setState(318);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(313);
						indexColName();
						setState(314);
						match(COMMA);
						}
						} 
					}
					setState(320);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				}
				setState(321);
				indexColName();
				setState(322);
				match(RPAR);
				setState(323);
				referenceDefinition();
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

	public static class ColumnNameContext extends ParserRuleContext {
		public IdNameContext idName() {
			return getRuleContext(IdNameContext.class,0);
		}
		public ColumnNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterColumnName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitColumnName(this);
		}
	}

	public final ColumnNameContext columnName() throws RecognitionException {
		ColumnNameContext _localctx = new ColumnNameContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_columnName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			idName();
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

	public static class ConstraintNameContext extends ParserRuleContext {
		public IdNameContext idName() {
			return getRuleContext(IdNameContext.class,0);
		}
		public ConstraintNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraintName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterConstraintName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitConstraintName(this);
		}
	}

	public final ConstraintNameContext constraintName() throws RecognitionException {
		ConstraintNameContext _localctx = new ConstraintNameContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_constraintName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			idName();
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

	public static class ConstraintTableContext extends ParserRuleContext {
		public IdNameContext idName() {
			return getRuleContext(IdNameContext.class,0);
		}
		public ConstraintTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraintTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterConstraintTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitConstraintTable(this);
		}
	}

	public final ConstraintTableContext constraintTable() throws RecognitionException {
		ConstraintTableContext _localctx = new ConstraintTableContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_constraintTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			idName();
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

	public static class ColumnDefinitionContext extends ParserRuleContext {
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public ColumnNullContext columnNull() {
			return getRuleContext(ColumnNullContext.class,0);
		}
		public ColumnNotNullContext columnNotNull() {
			return getRuleContext(ColumnNotNullContext.class,0);
		}
		public TerminalNode K_DEFAULT() { return getToken(SQLParser.K_DEFAULT, 0); }
		public ColumnDefaultValueContext columnDefaultValue() {
			return getRuleContext(ColumnDefaultValueContext.class,0);
		}
		public AutoIncrementContext autoIncrement() {
			return getRuleContext(AutoIncrementContext.class,0);
		}
		public TerminalNode K_COMMENT() { return getToken(SQLParser.K_COMMENT, 0); }
		public FieldCommentContext fieldComment() {
			return getRuleContext(FieldCommentContext.class,0);
		}
		public TerminalNode K_UNIQUE() { return getToken(SQLParser.K_UNIQUE, 0); }
		public TerminalNode K_KEY() { return getToken(SQLParser.K_KEY, 0); }
		public TerminalNode K_PRIMARY() { return getToken(SQLParser.K_PRIMARY, 0); }
		public ColumnDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterColumnDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitColumnDefinition(this);
		}
	}

	public final ColumnDefinitionContext columnDefinition() throws RecognitionException {
		ColumnDefinitionContext _localctx = new ColumnDefinitionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_columnDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			dataType();
			setState(336);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_NULL:
				{
				setState(334);
				columnNull();
				}
				break;
			case K_NOT:
				{
				setState(335);
				columnNotNull();
				}
				break;
			case K_DEFAULT:
			case K_PRIMARY:
			case K_KEY:
			case K_UNIQUE:
			case K_COMMENT:
			case K_AUTO_INCREMENT:
			case COMMA:
			case RPAR:
				break;
			default:
				break;
			}
			setState(340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_DEFAULT) {
				{
				setState(338);
				match(K_DEFAULT);
				setState(339);
				columnDefaultValue();
				}
			}

			setState(343);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_AUTO_INCREMENT) {
				{
				setState(342);
				autoIncrement();
				}
			}

			setState(353);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_UNIQUE:
				{
				{
				setState(345);
				match(K_UNIQUE);
				setState(347);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_KEY) {
					{
					setState(346);
					match(K_KEY);
					}
				}

				}
				}
				break;
			case K_PRIMARY:
			case K_KEY:
				{
				{
				setState(350);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_PRIMARY) {
					{
					setState(349);
					match(K_PRIMARY);
					}
				}

				setState(352);
				match(K_KEY);
				}
				}
				break;
			case K_COMMENT:
			case COMMA:
			case RPAR:
				break;
			default:
				break;
			}
			setState(357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_COMMENT) {
				{
				setState(355);
				match(K_COMMENT);
				setState(356);
				fieldComment();
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

	public static class AutoIncrementContext extends ParserRuleContext {
		public TerminalNode K_AUTO_INCREMENT() { return getToken(SQLParser.K_AUTO_INCREMENT, 0); }
		public AutoIncrementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_autoIncrement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterAutoIncrement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitAutoIncrement(this);
		}
	}

	public final AutoIncrementContext autoIncrement() throws RecognitionException {
		AutoIncrementContext _localctx = new AutoIncrementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_autoIncrement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			match(K_AUTO_INCREMENT);
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

	public static class ColumnDefaultValueContext extends ParserRuleContext {
		public DefaultValueContext defaultValue() {
			return getRuleContext(DefaultValueContext.class,0);
		}
		public ColumnDefaultValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnDefaultValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterColumnDefaultValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitColumnDefaultValue(this);
		}
	}

	public final ColumnDefaultValueContext columnDefaultValue() throws RecognitionException {
		ColumnDefaultValueContext _localctx = new ColumnDefaultValueContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_columnDefaultValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			defaultValue();
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

	public static class ColumnNullContext extends ParserRuleContext {
		public TerminalNode K_NULL() { return getToken(SQLParser.K_NULL, 0); }
		public ColumnNullContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnNull; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterColumnNull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitColumnNull(this);
		}
	}

	public final ColumnNullContext columnNull() throws RecognitionException {
		ColumnNullContext _localctx = new ColumnNullContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_columnNull);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			match(K_NULL);
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

	public static class ColumnNotNullContext extends ParserRuleContext {
		public TerminalNode K_NOT() { return getToken(SQLParser.K_NOT, 0); }
		public TerminalNode K_NULL() { return getToken(SQLParser.K_NULL, 0); }
		public ColumnNotNullContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnNotNull; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterColumnNotNull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitColumnNotNull(this);
		}
	}

	public final ColumnNotNullContext columnNotNull() throws RecognitionException {
		ColumnNotNullContext _localctx = new ColumnNotNullContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_columnNotNull);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			match(K_NOT);
			setState(366);
			match(K_NULL);
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

	public static class FieldCommentContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(SQLParser.STRING, 0); }
		public FieldCommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldComment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterFieldComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitFieldComment(this);
		}
	}

	public final FieldCommentContext fieldComment() throws RecognitionException {
		FieldCommentContext _localctx = new FieldCommentContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_fieldComment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			match(STRING);
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

	public static class ReferenceDefinitionContext extends ParserRuleContext {
		public TerminalNode K_REFERENCES() { return getToken(SQLParser.K_REFERENCES, 0); }
		public ReferenceTableContext referenceTable() {
			return getRuleContext(ReferenceTableContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(SQLParser.LPAR, 0); }
		public List<IndexColNameContext> indexColName() {
			return getRuleContexts(IndexColNameContext.class);
		}
		public IndexColNameContext indexColName(int i) {
			return getRuleContext(IndexColNameContext.class,i);
		}
		public TerminalNode RPAR() { return getToken(SQLParser.RPAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public List<TerminalNode> K_ON() { return getTokens(SQLParser.K_ON); }
		public TerminalNode K_ON(int i) {
			return getToken(SQLParser.K_ON, i);
		}
		public TerminalNode K_DELETE() { return getToken(SQLParser.K_DELETE, 0); }
		public ReferenceDeleteOptionContext referenceDeleteOption() {
			return getRuleContext(ReferenceDeleteOptionContext.class,0);
		}
		public TerminalNode K_UPDATE() { return getToken(SQLParser.K_UPDATE, 0); }
		public ReferenceUpdateOptionContext referenceUpdateOption() {
			return getRuleContext(ReferenceUpdateOptionContext.class,0);
		}
		public ReferenceDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referenceDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterReferenceDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitReferenceDefinition(this);
		}
	}

	public final ReferenceDefinitionContext referenceDefinition() throws RecognitionException {
		ReferenceDefinitionContext _localctx = new ReferenceDefinitionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_referenceDefinition);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			match(K_REFERENCES);
			setState(371);
			referenceTable();
			setState(372);
			match(LPAR);
			setState(378);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(373);
					indexColName();
					setState(374);
					match(COMMA);
					}
					} 
				}
				setState(380);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			}
			setState(381);
			indexColName();
			setState(382);
			match(RPAR);
			setState(386);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(383);
				match(K_ON);
				setState(384);
				match(K_DELETE);
				setState(385);
				referenceDeleteOption();
				}
				break;
			}
			setState(391);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ON) {
				{
				setState(388);
				match(K_ON);
				setState(389);
				match(K_UPDATE);
				setState(390);
				referenceUpdateOption();
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

	public static class ReferenceDeleteOptionContext extends ParserRuleContext {
		public ReferenceOptionContext referenceOption() {
			return getRuleContext(ReferenceOptionContext.class,0);
		}
		public ReferenceDeleteOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referenceDeleteOption; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterReferenceDeleteOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitReferenceDeleteOption(this);
		}
	}

	public final ReferenceDeleteOptionContext referenceDeleteOption() throws RecognitionException {
		ReferenceDeleteOptionContext _localctx = new ReferenceDeleteOptionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_referenceDeleteOption);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			referenceOption();
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

	public static class ReferenceUpdateOptionContext extends ParserRuleContext {
		public ReferenceOptionContext referenceOption() {
			return getRuleContext(ReferenceOptionContext.class,0);
		}
		public ReferenceUpdateOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referenceUpdateOption; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterReferenceUpdateOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitReferenceUpdateOption(this);
		}
	}

	public final ReferenceUpdateOptionContext referenceUpdateOption() throws RecognitionException {
		ReferenceUpdateOptionContext _localctx = new ReferenceUpdateOptionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_referenceUpdateOption);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			referenceOption();
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

	public static class ReferenceTableContext extends ParserRuleContext {
		public IdNameContext idName() {
			return getRuleContext(IdNameContext.class,0);
		}
		public ReferenceTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referenceTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterReferenceTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitReferenceTable(this);
		}
	}

	public final ReferenceTableContext referenceTable() throws RecognitionException {
		ReferenceTableContext _localctx = new ReferenceTableContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_referenceTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			idName();
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

	public static class IndexColNameContext extends ParserRuleContext {
		public Token Type;
		public IdNameContext idName() {
			return getRuleContext(IdNameContext.class,0);
		}
		public TerminalNode K_ASC() { return getToken(SQLParser.K_ASC, 0); }
		public TerminalNode K_DESC() { return getToken(SQLParser.K_DESC, 0); }
		public IndexColNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexColName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterIndexColName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitIndexColName(this);
		}
	}

	public final IndexColNameContext indexColName() throws RecognitionException {
		IndexColNameContext _localctx = new IndexColNameContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_indexColName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			idName();
			setState(401);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(400);
				((IndexColNameContext)_localctx).Type = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==K_ASC || _la==K_DESC) ) {
					((IndexColNameContext)_localctx).Type = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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

	public static class DataTypeContext extends ParserRuleContext {
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
	 
		public DataTypeContext() { }
		public void copyFrom(DataTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TypeBlobStmtContext extends DataTypeContext {
		public TerminalNode K_BLOB() { return getToken(SQLParser.K_BLOB, 0); }
		public TypeBlobStmtContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterTypeBlobStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitTypeBlobStmt(this);
		}
	}
	public static class TypeTinyTextStmtContext extends DataTypeContext {
		public TerminalNode K_TINYTEXT() { return getToken(SQLParser.K_TINYTEXT, 0); }
		public TerminalNode K_BINARY() { return getToken(SQLParser.K_BINARY, 0); }
		public TerminalNode K_CHARACTER() { return getToken(SQLParser.K_CHARACTER, 0); }
		public TerminalNode K_SET() { return getToken(SQLParser.K_SET, 0); }
		public CharsetNameContext charsetName() {
			return getRuleContext(CharsetNameContext.class,0);
		}
		public TerminalNode K_COLLATE() { return getToken(SQLParser.K_COLLATE, 0); }
		public CollateNameContext collateName() {
			return getRuleContext(CollateNameContext.class,0);
		}
		public TypeTinyTextStmtContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterTypeTinyTextStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitTypeTinyTextStmt(this);
		}
	}
	public static class TypeDecimalStmtContext extends DataTypeContext {
		public TerminalNode K_DECIMAL() { return getToken(SQLParser.K_DECIMAL, 0); }
		public TerminalNode LPAR() { return getToken(SQLParser.LPAR, 0); }
		public List<TerminalNode> INT() { return getTokens(SQLParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(SQLParser.INT, i);
		}
		public TerminalNode RPAR() { return getToken(SQLParser.RPAR, 0); }
		public TerminalNode K_UNSIGNED() { return getToken(SQLParser.K_UNSIGNED, 0); }
		public TerminalNode K_ZEROFILL() { return getToken(SQLParser.K_ZEROFILL, 0); }
		public TerminalNode COMMA() { return getToken(SQLParser.COMMA, 0); }
		public TypeDecimalStmtContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterTypeDecimalStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitTypeDecimalStmt(this);
		}
	}
	public static class TypeBooleanStmtContext extends DataTypeContext {
		public TerminalNode K_BOOL() { return getToken(SQLParser.K_BOOL, 0); }
		public TerminalNode K_BOOLEAN() { return getToken(SQLParser.K_BOOLEAN, 0); }
		public TypeBooleanStmtContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterTypeBooleanStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitTypeBooleanStmt(this);
		}
	}
	public static class TypeLongTextStmtContext extends DataTypeContext {
		public TerminalNode K_LONGTEXT() { return getToken(SQLParser.K_LONGTEXT, 0); }
		public TerminalNode K_BINARY() { return getToken(SQLParser.K_BINARY, 0); }
		public TerminalNode K_CHARACTER() { return getToken(SQLParser.K_CHARACTER, 0); }
		public TerminalNode K_SET() { return getToken(SQLParser.K_SET, 0); }
		public CharsetNameContext charsetName() {
			return getRuleContext(CharsetNameContext.class,0);
		}
		public TerminalNode K_COLLATE() { return getToken(SQLParser.K_COLLATE, 0); }
		public CollateNameContext collateName() {
			return getRuleContext(CollateNameContext.class,0);
		}
		public TypeLongTextStmtContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterTypeLongTextStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitTypeLongTextStmt(this);
		}
	}
	public static class TypeMediumBlobStmtContext extends DataTypeContext {
		public TerminalNode K_MEDIUMBLOB() { return getToken(SQLParser.K_MEDIUMBLOB, 0); }
		public TypeMediumBlobStmtContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterTypeMediumBlobStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitTypeMediumBlobStmt(this);
		}
	}
	public static class TypeDoubleStmtContext extends DataTypeContext {
		public TerminalNode K_DOUBLE() { return getToken(SQLParser.K_DOUBLE, 0); }
		public TerminalNode LPAR() { return getToken(SQLParser.LPAR, 0); }
		public List<TerminalNode> INT() { return getTokens(SQLParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(SQLParser.INT, i);
		}
		public TerminalNode COMMA() { return getToken(SQLParser.COMMA, 0); }
		public TerminalNode RPAR() { return getToken(SQLParser.RPAR, 0); }
		public TerminalNode K_UNSIGNED() { return getToken(SQLParser.K_UNSIGNED, 0); }
		public TerminalNode K_ZEROFILL() { return getToken(SQLParser.K_ZEROFILL, 0); }
		public TypeDoubleStmtContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterTypeDoubleStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitTypeDoubleStmt(this);
		}
	}
	public static class TypeTimeStmtContext extends DataTypeContext {
		public TerminalNode K_TIME() { return getToken(SQLParser.K_TIME, 0); }
		public TypeTimeStmtContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterTypeTimeStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitTypeTimeStmt(this);
		}
	}
	public static class TypeLongBlobStmtContext extends DataTypeContext {
		public TerminalNode K_LONGBLOB() { return getToken(SQLParser.K_LONGBLOB, 0); }
		public TypeLongBlobStmtContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterTypeLongBlobStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitTypeLongBlobStmt(this);
		}
	}
	public static class TypeTinyIntStmtContext extends DataTypeContext {
		public TerminalNode K_TINYINT() { return getToken(SQLParser.K_TINYINT, 0); }
		public TerminalNode LPAR() { return getToken(SQLParser.LPAR, 0); }
		public TerminalNode INT() { return getToken(SQLParser.INT, 0); }
		public TerminalNode RPAR() { return getToken(SQLParser.RPAR, 0); }
		public TerminalNode K_UNSIGNED() { return getToken(SQLParser.K_UNSIGNED, 0); }
		public TerminalNode K_ZEROFILL() { return getToken(SQLParser.K_ZEROFILL, 0); }
		public TypeTinyIntStmtContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterTypeTinyIntStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitTypeTinyIntStmt(this);
		}
	}
	public static class TypeTinyBlobStmtContext extends DataTypeContext {
		public TerminalNode K_TINYBLOB() { return getToken(SQLParser.K_TINYBLOB, 0); }
		public TypeTinyBlobStmtContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterTypeTinyBlobStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitTypeTinyBlobStmt(this);
		}
	}
	public static class TypeSetStmtContext extends DataTypeContext {
		public List<TerminalNode> K_SET() { return getTokens(SQLParser.K_SET); }
		public TerminalNode K_SET(int i) {
			return getToken(SQLParser.K_SET, i);
		}
		public TerminalNode LPAR() { return getToken(SQLParser.LPAR, 0); }
		public List<StringItemContext> stringItem() {
			return getRuleContexts(StringItemContext.class);
		}
		public StringItemContext stringItem(int i) {
			return getRuleContext(StringItemContext.class,i);
		}
		public TerminalNode RPAR() { return getToken(SQLParser.RPAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public TerminalNode K_CHARACTER() { return getToken(SQLParser.K_CHARACTER, 0); }
		public CharsetNameContext charsetName() {
			return getRuleContext(CharsetNameContext.class,0);
		}
		public TerminalNode K_COLLATE() { return getToken(SQLParser.K_COLLATE, 0); }
		public CollateNameContext collateName() {
			return getRuleContext(CollateNameContext.class,0);
		}
		public TypeSetStmtContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterTypeSetStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitTypeSetStmt(this);
		}
	}
	public static class TypeFloatStmtContext extends DataTypeContext {
		public TerminalNode K_FLOAT() { return getToken(SQLParser.K_FLOAT, 0); }
		public TerminalNode LPAR() { return getToken(SQLParser.LPAR, 0); }
		public List<TerminalNode> INT() { return getTokens(SQLParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(SQLParser.INT, i);
		}
		public TerminalNode COMMA() { return getToken(SQLParser.COMMA, 0); }
		public TerminalNode RPAR() { return getToken(SQLParser.RPAR, 0); }
		public TerminalNode K_UNSIGNED() { return getToken(SQLParser.K_UNSIGNED, 0); }
		public TerminalNode K_ZEROFILL() { return getToken(SQLParser.K_ZEROFILL, 0); }
		public TypeFloatStmtContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterTypeFloatStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitTypeFloatStmt(this);
		}
	}
	public static class TypeDateStmtContext extends DataTypeContext {
		public TerminalNode K_DATE() { return getToken(SQLParser.K_DATE, 0); }
		public TypeDateStmtContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterTypeDateStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitTypeDateStmt(this);
		}
	}
	public static class TypeVarCharStmtContext extends DataTypeContext {
		public TerminalNode K_VARCHAR() { return getToken(SQLParser.K_VARCHAR, 0); }
		public TerminalNode LPAR() { return getToken(SQLParser.LPAR, 0); }
		public TerminalNode INT() { return getToken(SQLParser.INT, 0); }
		public TerminalNode RPAR() { return getToken(SQLParser.RPAR, 0); }
		public TerminalNode K_CHARACTER() { return getToken(SQLParser.K_CHARACTER, 0); }
		public TerminalNode K_SET() { return getToken(SQLParser.K_SET, 0); }
		public CharsetNameContext charsetName() {
			return getRuleContext(CharsetNameContext.class,0);
		}
		public TerminalNode K_COLLATE() { return getToken(SQLParser.K_COLLATE, 0); }
		public CollateNameContext collateName() {
			return getRuleContext(CollateNameContext.class,0);
		}
		public TypeVarCharStmtContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterTypeVarCharStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitTypeVarCharStmt(this);
		}
	}
	public static class TypeMediumTextStmtContext extends DataTypeContext {
		public TerminalNode K_MEDIUMTEXT() { return getToken(SQLParser.K_MEDIUMTEXT, 0); }
		public TerminalNode K_BINARY() { return getToken(SQLParser.K_BINARY, 0); }
		public TerminalNode K_CHARACTER() { return getToken(SQLParser.K_CHARACTER, 0); }
		public TerminalNode K_SET() { return getToken(SQLParser.K_SET, 0); }
		public CharsetNameContext charsetName() {
			return getRuleContext(CharsetNameContext.class,0);
		}
		public TerminalNode K_COLLATE() { return getToken(SQLParser.K_COLLATE, 0); }
		public CollateNameContext collateName() {
			return getRuleContext(CollateNameContext.class,0);
		}
		public TypeMediumTextStmtContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterTypeMediumTextStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitTypeMediumTextStmt(this);
		}
	}
	public static class TypeTimeStampStmtContext extends DataTypeContext {
		public TerminalNode K_TIMESTAMP() { return getToken(SQLParser.K_TIMESTAMP, 0); }
		public TypeTimeStampStmtContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterTypeTimeStampStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitTypeTimeStampStmt(this);
		}
	}
	public static class TypeMediumIntStmtContext extends DataTypeContext {
		public TerminalNode K_MEDIUMINT() { return getToken(SQLParser.K_MEDIUMINT, 0); }
		public TerminalNode LPAR() { return getToken(SQLParser.LPAR, 0); }
		public TerminalNode INT() { return getToken(SQLParser.INT, 0); }
		public TerminalNode RPAR() { return getToken(SQLParser.RPAR, 0); }
		public TerminalNode K_UNSIGNED() { return getToken(SQLParser.K_UNSIGNED, 0); }
		public TerminalNode K_ZEROFILL() { return getToken(SQLParser.K_ZEROFILL, 0); }
		public TypeMediumIntStmtContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterTypeMediumIntStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitTypeMediumIntStmt(this);
		}
	}
	public static class TypeEnumStmtContext extends DataTypeContext {
		public TerminalNode K_ENUM() { return getToken(SQLParser.K_ENUM, 0); }
		public TerminalNode LPAR() { return getToken(SQLParser.LPAR, 0); }
		public List<StringItemContext> stringItem() {
			return getRuleContexts(StringItemContext.class);
		}
		public StringItemContext stringItem(int i) {
			return getRuleContext(StringItemContext.class,i);
		}
		public TerminalNode RPAR() { return getToken(SQLParser.RPAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public TerminalNode K_CHARACTER() { return getToken(SQLParser.K_CHARACTER, 0); }
		public TerminalNode K_SET() { return getToken(SQLParser.K_SET, 0); }
		public CharsetNameContext charsetName() {
			return getRuleContext(CharsetNameContext.class,0);
		}
		public TerminalNode K_COLLATE() { return getToken(SQLParser.K_COLLATE, 0); }
		public CollateNameContext collateName() {
			return getRuleContext(CollateNameContext.class,0);
		}
		public TypeEnumStmtContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterTypeEnumStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitTypeEnumStmt(this);
		}
	}
	public static class TypeBitStmtContext extends DataTypeContext {
		public TerminalNode K_BIT() { return getToken(SQLParser.K_BIT, 0); }
		public TerminalNode LPAR() { return getToken(SQLParser.LPAR, 0); }
		public TerminalNode INT() { return getToken(SQLParser.INT, 0); }
		public TerminalNode RPAR() { return getToken(SQLParser.RPAR, 0); }
		public TypeBitStmtContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterTypeBitStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitTypeBitStmt(this);
		}
	}
	public static class TypeNumericStmtContext extends DataTypeContext {
		public TerminalNode K_NUMERIC() { return getToken(SQLParser.K_NUMERIC, 0); }
		public TerminalNode LPAR() { return getToken(SQLParser.LPAR, 0); }
		public List<TerminalNode> INT() { return getTokens(SQLParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(SQLParser.INT, i);
		}
		public TerminalNode RPAR() { return getToken(SQLParser.RPAR, 0); }
		public TerminalNode K_UNSIGNED() { return getToken(SQLParser.K_UNSIGNED, 0); }
		public TerminalNode K_ZEROFILL() { return getToken(SQLParser.K_ZEROFILL, 0); }
		public TerminalNode COMMA() { return getToken(SQLParser.COMMA, 0); }
		public TypeNumericStmtContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterTypeNumericStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitTypeNumericStmt(this);
		}
	}
	public static class TypeRealStmtContext extends DataTypeContext {
		public TerminalNode K_REAL() { return getToken(SQLParser.K_REAL, 0); }
		public TerminalNode LPAR() { return getToken(SQLParser.LPAR, 0); }
		public List<TerminalNode> INT() { return getTokens(SQLParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(SQLParser.INT, i);
		}
		public TerminalNode COMMA() { return getToken(SQLParser.COMMA, 0); }
		public TerminalNode RPAR() { return getToken(SQLParser.RPAR, 0); }
		public TerminalNode K_UNSIGNED() { return getToken(SQLParser.K_UNSIGNED, 0); }
		public TerminalNode K_ZEROFILL() { return getToken(SQLParser.K_ZEROFILL, 0); }
		public TypeRealStmtContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterTypeRealStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitTypeRealStmt(this);
		}
	}
	public static class TypeTextStmtContext extends DataTypeContext {
		public TerminalNode K_TEXT() { return getToken(SQLParser.K_TEXT, 0); }
		public TerminalNode K_BINARY() { return getToken(SQLParser.K_BINARY, 0); }
		public TerminalNode K_CHARACTER() { return getToken(SQLParser.K_CHARACTER, 0); }
		public TerminalNode K_SET() { return getToken(SQLParser.K_SET, 0); }
		public CharsetNameContext charsetName() {
			return getRuleContext(CharsetNameContext.class,0);
		}
		public TerminalNode K_COLLATE() { return getToken(SQLParser.K_COLLATE, 0); }
		public CollateNameContext collateName() {
			return getRuleContext(CollateNameContext.class,0);
		}
		public TypeTextStmtContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterTypeTextStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitTypeTextStmt(this);
		}
	}
	public static class TypeBigIntStmtContext extends DataTypeContext {
		public TerminalNode K_BIGINT() { return getToken(SQLParser.K_BIGINT, 0); }
		public TerminalNode LPAR() { return getToken(SQLParser.LPAR, 0); }
		public TerminalNode INT() { return getToken(SQLParser.INT, 0); }
		public TerminalNode RPAR() { return getToken(SQLParser.RPAR, 0); }
		public TerminalNode K_UNSIGNED() { return getToken(SQLParser.K_UNSIGNED, 0); }
		public TerminalNode K_ZEROFILL() { return getToken(SQLParser.K_ZEROFILL, 0); }
		public TypeBigIntStmtContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterTypeBigIntStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitTypeBigIntStmt(this);
		}
	}
	public static class TypeJsonStmtContext extends DataTypeContext {
		public TerminalNode K_JSON() { return getToken(SQLParser.K_JSON, 0); }
		public TypeJsonStmtContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterTypeJsonStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitTypeJsonStmt(this);
		}
	}
	public static class TypeDateTimeStmtContext extends DataTypeContext {
		public TerminalNode K_DATETIME() { return getToken(SQLParser.K_DATETIME, 0); }
		public TypeDateTimeStmtContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterTypeDateTimeStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitTypeDateTimeStmt(this);
		}
	}
	public static class TypeBinaryStmtContext extends DataTypeContext {
		public TerminalNode K_BINARY() { return getToken(SQLParser.K_BINARY, 0); }
		public TerminalNode LPAR() { return getToken(SQLParser.LPAR, 0); }
		public TerminalNode INT() { return getToken(SQLParser.INT, 0); }
		public TerminalNode RPAR() { return getToken(SQLParser.RPAR, 0); }
		public TypeBinaryStmtContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterTypeBinaryStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitTypeBinaryStmt(this);
		}
	}
	public static class TypeYearStmtContext extends DataTypeContext {
		public TerminalNode K_YEAR() { return getToken(SQLParser.K_YEAR, 0); }
		public TypeYearStmtContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterTypeYearStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitTypeYearStmt(this);
		}
	}
	public static class TypeIntStmtContext extends DataTypeContext {
		public TerminalNode K_INT() { return getToken(SQLParser.K_INT, 0); }
		public TerminalNode LPAR() { return getToken(SQLParser.LPAR, 0); }
		public TerminalNode INT() { return getToken(SQLParser.INT, 0); }
		public TerminalNode RPAR() { return getToken(SQLParser.RPAR, 0); }
		public TerminalNode K_UNSIGNED() { return getToken(SQLParser.K_UNSIGNED, 0); }
		public TerminalNode K_ZEROFILL() { return getToken(SQLParser.K_ZEROFILL, 0); }
		public TypeIntStmtContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterTypeIntStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitTypeIntStmt(this);
		}
	}
	public static class TypeVarBinaryStmtContext extends DataTypeContext {
		public TerminalNode K_VARBINARY() { return getToken(SQLParser.K_VARBINARY, 0); }
		public TerminalNode LPAR() { return getToken(SQLParser.LPAR, 0); }
		public TerminalNode INT() { return getToken(SQLParser.INT, 0); }
		public TerminalNode RPAR() { return getToken(SQLParser.RPAR, 0); }
		public TypeVarBinaryStmtContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterTypeVarBinaryStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitTypeVarBinaryStmt(this);
		}
	}
	public static class TypeCharStmtContext extends DataTypeContext {
		public TerminalNode K_CHAR() { return getToken(SQLParser.K_CHAR, 0); }
		public TerminalNode LPAR() { return getToken(SQLParser.LPAR, 0); }
		public TerminalNode INT() { return getToken(SQLParser.INT, 0); }
		public TerminalNode RPAR() { return getToken(SQLParser.RPAR, 0); }
		public TerminalNode K_CHARACTER() { return getToken(SQLParser.K_CHARACTER, 0); }
		public TerminalNode K_SET() { return getToken(SQLParser.K_SET, 0); }
		public CharsetNameContext charsetName() {
			return getRuleContext(CharsetNameContext.class,0);
		}
		public TerminalNode K_COLLATE() { return getToken(SQLParser.K_COLLATE, 0); }
		public CollateNameContext collateName() {
			return getRuleContext(CollateNameContext.class,0);
		}
		public TypeCharStmtContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterTypeCharStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitTypeCharStmt(this);
		}
	}
	public static class TypeSmallIntStmtContext extends DataTypeContext {
		public TerminalNode K_SMALLINT() { return getToken(SQLParser.K_SMALLINT, 0); }
		public TerminalNode LPAR() { return getToken(SQLParser.LPAR, 0); }
		public TerminalNode INT() { return getToken(SQLParser.INT, 0); }
		public TerminalNode RPAR() { return getToken(SQLParser.RPAR, 0); }
		public TerminalNode K_UNSIGNED() { return getToken(SQLParser.K_UNSIGNED, 0); }
		public TerminalNode K_ZEROFILL() { return getToken(SQLParser.K_ZEROFILL, 0); }
		public TypeSmallIntStmtContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterTypeSmallIntStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitTypeSmallIntStmt(this);
		}
	}
	public static class TypeIntegerStmtContext extends DataTypeContext {
		public TerminalNode K_INTEGER() { return getToken(SQLParser.K_INTEGER, 0); }
		public TerminalNode LPAR() { return getToken(SQLParser.LPAR, 0); }
		public TerminalNode INT() { return getToken(SQLParser.INT, 0); }
		public TerminalNode RPAR() { return getToken(SQLParser.RPAR, 0); }
		public TerminalNode K_UNSIGNED() { return getToken(SQLParser.K_UNSIGNED, 0); }
		public TerminalNode K_ZEROFILL() { return getToken(SQLParser.K_ZEROFILL, 0); }
		public TypeIntegerStmtContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterTypeIntegerStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitTypeIntegerStmt(this);
		}
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_dataType);
		int _la;
		try {
			int _alt;
			setState(698);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_BIT:
				_localctx = new TypeBitStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(403);
				match(K_BIT);
				setState(407);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAR) {
					{
					setState(404);
					match(LPAR);
					setState(405);
					match(INT);
					setState(406);
					match(RPAR);
					}
				}

				}
				break;
			case K_TINYINT:
				_localctx = new TypeTinyIntStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(409);
				match(K_TINYINT);
				setState(413);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAR) {
					{
					setState(410);
					match(LPAR);
					setState(411);
					match(INT);
					setState(412);
					match(RPAR);
					}
				}

				setState(416);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_UNSIGNED) {
					{
					setState(415);
					match(K_UNSIGNED);
					}
				}

				setState(419);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ZEROFILL) {
					{
					setState(418);
					match(K_ZEROFILL);
					}
				}

				}
				break;
			case K_SMALLINT:
				_localctx = new TypeSmallIntStmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(421);
				match(K_SMALLINT);
				setState(425);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAR) {
					{
					setState(422);
					match(LPAR);
					setState(423);
					match(INT);
					setState(424);
					match(RPAR);
					}
				}

				setState(428);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_UNSIGNED) {
					{
					setState(427);
					match(K_UNSIGNED);
					}
				}

				setState(431);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ZEROFILL) {
					{
					setState(430);
					match(K_ZEROFILL);
					}
				}

				}
				break;
			case K_MEDIUMINT:
				_localctx = new TypeMediumIntStmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(433);
				match(K_MEDIUMINT);
				setState(437);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAR) {
					{
					setState(434);
					match(LPAR);
					setState(435);
					match(INT);
					setState(436);
					match(RPAR);
					}
				}

				setState(440);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_UNSIGNED) {
					{
					setState(439);
					match(K_UNSIGNED);
					}
				}

				setState(443);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ZEROFILL) {
					{
					setState(442);
					match(K_ZEROFILL);
					}
				}

				}
				break;
			case K_INT:
				_localctx = new TypeIntStmtContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(445);
				match(K_INT);
				setState(449);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAR) {
					{
					setState(446);
					match(LPAR);
					setState(447);
					match(INT);
					setState(448);
					match(RPAR);
					}
				}

				setState(452);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_UNSIGNED) {
					{
					setState(451);
					match(K_UNSIGNED);
					}
				}

				setState(455);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ZEROFILL) {
					{
					setState(454);
					match(K_ZEROFILL);
					}
				}

				}
				break;
			case K_INTEGER:
				_localctx = new TypeIntegerStmtContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(457);
				match(K_INTEGER);
				setState(461);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAR) {
					{
					setState(458);
					match(LPAR);
					setState(459);
					match(INT);
					setState(460);
					match(RPAR);
					}
				}

				setState(464);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_UNSIGNED) {
					{
					setState(463);
					match(K_UNSIGNED);
					}
				}

				setState(467);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ZEROFILL) {
					{
					setState(466);
					match(K_ZEROFILL);
					}
				}

				}
				break;
			case K_BIGINT:
				_localctx = new TypeBigIntStmtContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(469);
				match(K_BIGINT);
				setState(473);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAR) {
					{
					setState(470);
					match(LPAR);
					setState(471);
					match(INT);
					setState(472);
					match(RPAR);
					}
				}

				setState(476);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_UNSIGNED) {
					{
					setState(475);
					match(K_UNSIGNED);
					}
				}

				setState(479);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ZEROFILL) {
					{
					setState(478);
					match(K_ZEROFILL);
					}
				}

				}
				break;
			case K_REAL:
				_localctx = new TypeRealStmtContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(481);
				match(K_REAL);
				setState(487);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAR) {
					{
					setState(482);
					match(LPAR);
					setState(483);
					match(INT);
					setState(484);
					match(COMMA);
					setState(485);
					match(INT);
					setState(486);
					match(RPAR);
					}
				}

				setState(490);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_UNSIGNED) {
					{
					setState(489);
					match(K_UNSIGNED);
					}
				}

				setState(493);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ZEROFILL) {
					{
					setState(492);
					match(K_ZEROFILL);
					}
				}

				}
				break;
			case K_DOUBLE:
				_localctx = new TypeDoubleStmtContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(495);
				match(K_DOUBLE);
				setState(501);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAR) {
					{
					setState(496);
					match(LPAR);
					setState(497);
					match(INT);
					setState(498);
					match(COMMA);
					setState(499);
					match(INT);
					setState(500);
					match(RPAR);
					}
				}

				setState(504);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_UNSIGNED) {
					{
					setState(503);
					match(K_UNSIGNED);
					}
				}

				setState(507);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ZEROFILL) {
					{
					setState(506);
					match(K_ZEROFILL);
					}
				}

				}
				break;
			case K_FLOAT:
				_localctx = new TypeFloatStmtContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(509);
				match(K_FLOAT);
				setState(515);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAR) {
					{
					setState(510);
					match(LPAR);
					setState(511);
					match(INT);
					setState(512);
					match(COMMA);
					setState(513);
					match(INT);
					setState(514);
					match(RPAR);
					}
				}

				setState(518);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_UNSIGNED) {
					{
					setState(517);
					match(K_UNSIGNED);
					}
				}

				setState(521);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ZEROFILL) {
					{
					setState(520);
					match(K_ZEROFILL);
					}
				}

				}
				break;
			case K_DECIMAL:
				_localctx = new TypeDecimalStmtContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(523);
				match(K_DECIMAL);
				setState(531);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAR) {
					{
					setState(524);
					match(LPAR);
					setState(525);
					match(INT);
					setState(528);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(526);
						match(COMMA);
						setState(527);
						match(INT);
						}
					}

					setState(530);
					match(RPAR);
					}
				}

				setState(534);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_UNSIGNED) {
					{
					setState(533);
					match(K_UNSIGNED);
					}
				}

				setState(537);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ZEROFILL) {
					{
					setState(536);
					match(K_ZEROFILL);
					}
				}

				}
				break;
			case K_NUMERIC:
				_localctx = new TypeNumericStmtContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(539);
				match(K_NUMERIC);
				setState(547);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAR) {
					{
					setState(540);
					match(LPAR);
					setState(541);
					match(INT);
					setState(544);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(542);
						match(COMMA);
						setState(543);
						match(INT);
						}
					}

					setState(546);
					match(RPAR);
					}
				}

				setState(550);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_UNSIGNED) {
					{
					setState(549);
					match(K_UNSIGNED);
					}
				}

				setState(553);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ZEROFILL) {
					{
					setState(552);
					match(K_ZEROFILL);
					}
				}

				}
				break;
			case K_BOOL:
			case K_BOOLEAN:
				_localctx = new TypeBooleanStmtContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(555);
				_la = _input.LA(1);
				if ( !(_la==K_BOOL || _la==K_BOOLEAN) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case K_DATE:
				_localctx = new TypeDateStmtContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(556);
				match(K_DATE);
				}
				break;
			case K_TIME:
				_localctx = new TypeTimeStmtContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(557);
				match(K_TIME);
				}
				break;
			case K_TIMESTAMP:
				_localctx = new TypeTimeStampStmtContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(558);
				match(K_TIMESTAMP);
				}
				break;
			case K_DATETIME:
				_localctx = new TypeDateTimeStmtContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(559);
				match(K_DATETIME);
				}
				break;
			case K_YEAR:
				_localctx = new TypeYearStmtContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(560);
				match(K_YEAR);
				}
				break;
			case K_CHAR:
				_localctx = new TypeCharStmtContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(561);
				match(K_CHAR);
				setState(565);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAR) {
					{
					setState(562);
					match(LPAR);
					setState(563);
					match(INT);
					setState(564);
					match(RPAR);
					}
				}

				setState(570);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_CHARACTER) {
					{
					setState(567);
					match(K_CHARACTER);
					setState(568);
					match(K_SET);
					setState(569);
					charsetName();
					}
				}

				setState(574);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_COLLATE) {
					{
					setState(572);
					match(K_COLLATE);
					setState(573);
					collateName();
					}
				}

				}
				break;
			case K_VARCHAR:
				_localctx = new TypeVarCharStmtContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(576);
				match(K_VARCHAR);
				setState(577);
				match(LPAR);
				setState(578);
				match(INT);
				setState(579);
				match(RPAR);
				setState(583);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_CHARACTER) {
					{
					setState(580);
					match(K_CHARACTER);
					setState(581);
					match(K_SET);
					setState(582);
					charsetName();
					}
				}

				setState(587);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_COLLATE) {
					{
					setState(585);
					match(K_COLLATE);
					setState(586);
					collateName();
					}
				}

				}
				break;
			case K_BINARY:
				_localctx = new TypeBinaryStmtContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(589);
				match(K_BINARY);
				setState(593);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAR) {
					{
					setState(590);
					match(LPAR);
					setState(591);
					match(INT);
					setState(592);
					match(RPAR);
					}
				}

				}
				break;
			case K_VARBINARY:
				_localctx = new TypeVarBinaryStmtContext(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(595);
				match(K_VARBINARY);
				setState(596);
				match(LPAR);
				setState(597);
				match(INT);
				setState(598);
				match(RPAR);
				}
				break;
			case K_TINYBLOB:
				_localctx = new TypeTinyBlobStmtContext(_localctx);
				enterOuterAlt(_localctx, 23);
				{
				setState(599);
				match(K_TINYBLOB);
				}
				break;
			case K_BLOB:
				_localctx = new TypeBlobStmtContext(_localctx);
				enterOuterAlt(_localctx, 24);
				{
				setState(600);
				match(K_BLOB);
				}
				break;
			case K_MEDIUMBLOB:
				_localctx = new TypeMediumBlobStmtContext(_localctx);
				enterOuterAlt(_localctx, 25);
				{
				setState(601);
				match(K_MEDIUMBLOB);
				}
				break;
			case K_LONGBLOB:
				_localctx = new TypeLongBlobStmtContext(_localctx);
				enterOuterAlt(_localctx, 26);
				{
				setState(602);
				match(K_LONGBLOB);
				}
				break;
			case K_JSON:
				_localctx = new TypeJsonStmtContext(_localctx);
				enterOuterAlt(_localctx, 27);
				{
				setState(603);
				match(K_JSON);
				}
				break;
			case K_TINYTEXT:
				_localctx = new TypeTinyTextStmtContext(_localctx);
				enterOuterAlt(_localctx, 28);
				{
				setState(604);
				match(K_TINYTEXT);
				setState(606);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_BINARY) {
					{
					setState(605);
					match(K_BINARY);
					}
				}

				setState(611);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_CHARACTER) {
					{
					setState(608);
					match(K_CHARACTER);
					setState(609);
					match(K_SET);
					setState(610);
					charsetName();
					}
				}

				setState(615);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_COLLATE) {
					{
					setState(613);
					match(K_COLLATE);
					setState(614);
					collateName();
					}
				}

				}
				break;
			case K_TEXT:
				_localctx = new TypeTextStmtContext(_localctx);
				enterOuterAlt(_localctx, 29);
				{
				setState(617);
				match(K_TEXT);
				setState(619);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_BINARY) {
					{
					setState(618);
					match(K_BINARY);
					}
				}

				setState(624);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_CHARACTER) {
					{
					setState(621);
					match(K_CHARACTER);
					setState(622);
					match(K_SET);
					setState(623);
					charsetName();
					}
				}

				setState(628);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_COLLATE) {
					{
					setState(626);
					match(K_COLLATE);
					setState(627);
					collateName();
					}
				}

				}
				break;
			case K_MEDIUMTEXT:
				_localctx = new TypeMediumTextStmtContext(_localctx);
				enterOuterAlt(_localctx, 30);
				{
				setState(630);
				match(K_MEDIUMTEXT);
				setState(632);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_BINARY) {
					{
					setState(631);
					match(K_BINARY);
					}
				}

				setState(637);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_CHARACTER) {
					{
					setState(634);
					match(K_CHARACTER);
					setState(635);
					match(K_SET);
					setState(636);
					charsetName();
					}
				}

				setState(641);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_COLLATE) {
					{
					setState(639);
					match(K_COLLATE);
					setState(640);
					collateName();
					}
				}

				}
				break;
			case K_LONGTEXT:
				_localctx = new TypeLongTextStmtContext(_localctx);
				enterOuterAlt(_localctx, 31);
				{
				setState(643);
				match(K_LONGTEXT);
				setState(645);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_BINARY) {
					{
					setState(644);
					match(K_BINARY);
					}
				}

				setState(650);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_CHARACTER) {
					{
					setState(647);
					match(K_CHARACTER);
					setState(648);
					match(K_SET);
					setState(649);
					charsetName();
					}
				}

				setState(654);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_COLLATE) {
					{
					setState(652);
					match(K_COLLATE);
					setState(653);
					collateName();
					}
				}

				}
				break;
			case K_ENUM:
				_localctx = new TypeEnumStmtContext(_localctx);
				enterOuterAlt(_localctx, 32);
				{
				setState(656);
				match(K_ENUM);
				setState(657);
				match(LPAR);
				setState(663);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(658);
						stringItem();
						setState(659);
						match(COMMA);
						}
						} 
					}
					setState(665);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
				}
				setState(666);
				stringItem();
				setState(667);
				match(RPAR);
				setState(671);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_CHARACTER) {
					{
					setState(668);
					match(K_CHARACTER);
					setState(669);
					match(K_SET);
					setState(670);
					charsetName();
					}
				}

				setState(675);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_COLLATE) {
					{
					setState(673);
					match(K_COLLATE);
					setState(674);
					collateName();
					}
				}

				}
				break;
			case K_SET:
				_localctx = new TypeSetStmtContext(_localctx);
				enterOuterAlt(_localctx, 33);
				{
				setState(677);
				match(K_SET);
				setState(678);
				match(LPAR);
				setState(684);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(679);
						stringItem();
						setState(680);
						match(COMMA);
						}
						} 
					}
					setState(686);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
				}
				setState(687);
				stringItem();
				setState(688);
				match(RPAR);
				setState(692);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_CHARACTER) {
					{
					setState(689);
					match(K_CHARACTER);
					setState(690);
					match(K_SET);
					setState(691);
					charsetName();
					}
				}

				setState(696);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_COLLATE) {
					{
					setState(694);
					match(K_COLLATE);
					setState(695);
					collateName();
					}
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

	public static class StringItemContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(SQLParser.STRING, 0); }
		public StringItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterStringItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitStringItem(this);
		}
	}

	public final StringItemContext stringItem() throws RecognitionException {
		StringItemContext _localctx = new StringItemContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_stringItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(700);
			match(STRING);
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

	public static class CharsetNameContext extends ParserRuleContext {
		public IdNameContext idName() {
			return getRuleContext(IdNameContext.class,0);
		}
		public CharsetNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charsetName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterCharsetName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitCharsetName(this);
		}
	}

	public final CharsetNameContext charsetName() throws RecognitionException {
		CharsetNameContext _localctx = new CharsetNameContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_charsetName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(702);
			idName();
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

	public static class CollateNameContext extends ParserRuleContext {
		public IdNameContext idName() {
			return getRuleContext(IdNameContext.class,0);
		}
		public CollateNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collateName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterCollateName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitCollateName(this);
		}
	}

	public final CollateNameContext collateName() throws RecognitionException {
		CollateNameContext _localctx = new CollateNameContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_collateName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(704);
			idName();
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

	public static class ReferenceOptionContext extends ParserRuleContext {
		public TerminalNode K_RESTRICT() { return getToken(SQLParser.K_RESTRICT, 0); }
		public TerminalNode K_CASCADE() { return getToken(SQLParser.K_CASCADE, 0); }
		public TerminalNode K_SET() { return getToken(SQLParser.K_SET, 0); }
		public TerminalNode K_NULL() { return getToken(SQLParser.K_NULL, 0); }
		public TerminalNode K_NO() { return getToken(SQLParser.K_NO, 0); }
		public TerminalNode K_ACTION() { return getToken(SQLParser.K_ACTION, 0); }
		public ReferenceOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referenceOption; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterReferenceOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitReferenceOption(this);
		}
	}

	public final ReferenceOptionContext referenceOption() throws RecognitionException {
		ReferenceOptionContext _localctx = new ReferenceOptionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_referenceOption);
		try {
			setState(712);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_RESTRICT:
				enterOuterAlt(_localctx, 1);
				{
				setState(706);
				match(K_RESTRICT);
				}
				break;
			case K_CASCADE:
				enterOuterAlt(_localctx, 2);
				{
				setState(707);
				match(K_CASCADE);
				}
				break;
			case K_SET:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(708);
				match(K_SET);
				setState(709);
				match(K_NULL);
				}
				}
				break;
			case K_NO:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(710);
				match(K_NO);
				setState(711);
				match(K_ACTION);
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

	public static class DefaultValueContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(SQLParser.INT, 0); }
		public TerminalNode STRING() { return getToken(SQLParser.STRING, 0); }
		public TerminalNode FLOAT() { return getToken(SQLParser.FLOAT, 0); }
		public TerminalNode BOOL() { return getToken(SQLParser.BOOL, 0); }
		public TerminalNode K_NULL() { return getToken(SQLParser.K_NULL, 0); }
		public DefaultValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterDefaultValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitDefaultValue(this);
		}
	}

	public final DefaultValueContext defaultValue() throws RecognitionException {
		DefaultValueContext _localctx = new DefaultValueContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_defaultValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(714);
			_la = _input.LA(1);
			if ( !(_la==BOOL || _la==K_NULL || ((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & ((1L << (INT - 84)) | (1L << (FLOAT - 84)) | (1L << (STRING - 84)))) != 0)) ) {
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

	public static class TableOptionsContext extends ParserRuleContext {
		public List<OptionContext> option() {
			return getRuleContexts(OptionContext.class);
		}
		public OptionContext option(int i) {
			return getRuleContext(OptionContext.class,i);
		}
		public TableOptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableOptions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterTableOptions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitTableOptions(this);
		}
	}

	public final TableOptionsContext tableOptions() throws RecognitionException {
		TableOptionsContext _localctx = new TableOptionsContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_tableOptions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(719);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_DEFAULT) | (1L << K_CHARACTER) | (1L << K_COLLATE) | (1L << K_COMMENT))) != 0) || _la==NAME) {
				{
				{
				setState(716);
				option();
				}
				}
				setState(721);
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

	public static class OptionContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(SQLParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(SQLParser.NAME, i);
		}
		public TerminalNode EQ() { return getToken(SQLParser.EQ, 0); }
		public CreateSpecificationContext createSpecification() {
			return getRuleContext(CreateSpecificationContext.class,0);
		}
		public OptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitOption(this);
		}
	}

	public final OptionContext option() throws RecognitionException {
		OptionContext _localctx = new OptionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_option);
		try {
			setState(726);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(722);
				match(NAME);
				setState(723);
				match(EQ);
				setState(724);
				match(NAME);
				}
				break;
			case K_DEFAULT:
			case K_CHARACTER:
			case K_COLLATE:
			case K_COMMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(725);
				createSpecification();
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

	public static class IdNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SQLParser.ID, 0); }
		public List<TerminalNode> SINGLE_QUOTE() { return getTokens(SQLParser.SINGLE_QUOTE); }
		public TerminalNode SINGLE_QUOTE(int i) {
			return getToken(SQLParser.SINGLE_QUOTE, i);
		}
		public TerminalNode NAME() { return getToken(SQLParser.NAME, 0); }
		public List<TerminalNode> DOUBLE_QUOTE() { return getTokens(SQLParser.DOUBLE_QUOTE); }
		public TerminalNode DOUBLE_QUOTE(int i) {
			return getToken(SQLParser.DOUBLE_QUOTE, i);
		}
		public IdNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterIdName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitIdName(this);
		}
	}

	public final IdNameContext idName() throws RecognitionException {
		IdNameContext _localctx = new IdNameContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_idName);
		try {
			setState(736);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(728);
				match(ID);
				}
				break;
			case SINGLE_QUOTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(729);
				match(SINGLE_QUOTE);
				setState(730);
				match(NAME);
				setState(731);
				match(SINGLE_QUOTE);
				}
				break;
			case DOUBLE_QUOTE:
				enterOuterAlt(_localctx, 3);
				{
				setState(732);
				match(DOUBLE_QUOTE);
				setState(733);
				match(NAME);
				setState(734);
				match(DOUBLE_QUOTE);
				}
				break;
			case NAME:
				enterOuterAlt(_localctx, 4);
				{
				setState(735);
				match(NAME);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3[\u02e5\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\7\2R\n\2\f\2\16"+
		"\2U\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\5\3j\n\3\3\4\3\4\3\4\3\4\5\4p\n\4\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\3\5\5\5y\n\5\3\5\3\5\7\5}\n\5\f\5\16\5\u0080\13\5\3\6\5\6\u0083\n\6"+
		"\3\6\3\6\3\6\5\6\u0088\n\6\3\6\3\6\5\6\u008c\n\6\3\6\3\6\5\6\u0090\n\6"+
		"\3\6\3\6\3\6\3\6\5\6\u0096\n\6\3\7\3\7\3\b\3\b\3\b\3\b\7\b\u009e\n\b\f"+
		"\b\16\b\u00a1\13\b\3\b\3\b\3\t\7\t\u00a6\n\t\f\t\16\t\u00a9\13\t\3\t\3"+
		"\t\3\t\3\t\7\t\u00af\n\t\f\t\16\t\u00b2\13\t\3\t\5\t\u00b5\n\t\3\n\3\n"+
		"\3\13\3\13\3\13\3\f\3\f\5\f\u00be\n\f\3\f\3\f\3\f\5\f\u00c3\n\f\3\f\3"+
		"\f\3\f\7\f\u00c8\n\f\f\f\16\f\u00cb\13\f\3\f\5\f\u00ce\n\f\3\r\3\r\3\16"+
		"\3\16\5\16\u00d4\n\16\3\16\3\16\3\16\3\16\5\16\u00da\n\16\3\16\3\16\3"+
		"\16\5\16\u00df\n\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\20\7\20\u00e9"+
		"\n\20\f\20\16\20\u00ec\13\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\5\21\u00f5"+
		"\n\21\5\21\u00f7\n\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u00ff\n\21\f"+
		"\21\16\21\u0102\13\21\3\21\3\21\3\21\3\21\3\21\5\21\u0109\n\21\3\21\3"+
		"\21\3\21\3\21\7\21\u010f\n\21\f\21\16\21\u0112\13\21\3\21\3\21\3\21\3"+
		"\21\3\21\5\21\u0119\n\21\5\21\u011b\n\21\3\21\3\21\5\21\u011f\n\21\3\21"+
		"\5\21\u0122\n\21\3\21\3\21\3\21\3\21\7\21\u0128\n\21\f\21\16\21\u012b"+
		"\13\21\3\21\3\21\3\21\3\21\3\21\5\21\u0132\n\21\5\21\u0134\n\21\3\21\3"+
		"\21\3\21\5\21\u0139\n\21\3\21\3\21\3\21\3\21\7\21\u013f\n\21\f\21\16\21"+
		"\u0142\13\21\3\21\3\21\3\21\3\21\5\21\u0148\n\21\3\22\3\22\3\23\3\23\3"+
		"\24\3\24\3\25\3\25\3\25\5\25\u0153\n\25\3\25\3\25\5\25\u0157\n\25\3\25"+
		"\5\25\u015a\n\25\3\25\3\25\5\25\u015e\n\25\3\25\5\25\u0161\n\25\3\25\5"+
		"\25\u0164\n\25\3\25\3\25\5\25\u0168\n\25\3\26\3\26\3\27\3\27\3\30\3\30"+
		"\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\7\33\u017b\n\33"+
		"\f\33\16\33\u017e\13\33\3\33\3\33\3\33\3\33\3\33\5\33\u0185\n\33\3\33"+
		"\3\33\3\33\5\33\u018a\n\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\5\37"+
		"\u0194\n\37\3 \3 \3 \3 \5 \u019a\n \3 \3 \3 \3 \5 \u01a0\n \3 \5 \u01a3"+
		"\n \3 \5 \u01a6\n \3 \3 \3 \3 \5 \u01ac\n \3 \5 \u01af\n \3 \5 \u01b2"+
		"\n \3 \3 \3 \3 \5 \u01b8\n \3 \5 \u01bb\n \3 \5 \u01be\n \3 \3 \3 \3 "+
		"\5 \u01c4\n \3 \5 \u01c7\n \3 \5 \u01ca\n \3 \3 \3 \3 \5 \u01d0\n \3 "+
		"\5 \u01d3\n \3 \5 \u01d6\n \3 \3 \3 \3 \5 \u01dc\n \3 \5 \u01df\n \3 "+
		"\5 \u01e2\n \3 \3 \3 \3 \3 \3 \5 \u01ea\n \3 \5 \u01ed\n \3 \5 \u01f0"+
		"\n \3 \3 \3 \3 \3 \3 \5 \u01f8\n \3 \5 \u01fb\n \3 \5 \u01fe\n \3 \3 "+
		"\3 \3 \3 \3 \5 \u0206\n \3 \5 \u0209\n \3 \5 \u020c\n \3 \3 \3 \3 \3 "+
		"\5 \u0213\n \3 \5 \u0216\n \3 \5 \u0219\n \3 \5 \u021c\n \3 \3 \3 \3 "+
		"\3 \5 \u0223\n \3 \5 \u0226\n \3 \5 \u0229\n \3 \5 \u022c\n \3 \3 \3 "+
		"\3 \3 \3 \3 \3 \3 \3 \5 \u0238\n \3 \3 \3 \5 \u023d\n \3 \3 \5 \u0241"+
		"\n \3 \3 \3 \3 \3 \3 \3 \5 \u024a\n \3 \3 \5 \u024e\n \3 \3 \3 \3 \5 "+
		"\u0254\n \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u0261\n \3 \3 \3 \5 \u0266"+
		"\n \3 \3 \5 \u026a\n \3 \3 \5 \u026e\n \3 \3 \3 \5 \u0273\n \3 \3 \5 "+
		"\u0277\n \3 \3 \5 \u027b\n \3 \3 \3 \5 \u0280\n \3 \3 \5 \u0284\n \3 "+
		"\3 \5 \u0288\n \3 \3 \3 \5 \u028d\n \3 \3 \5 \u0291\n \3 \3 \3 \3 \3 "+
		"\7 \u0298\n \f \16 \u029b\13 \3 \3 \3 \3 \3 \5 \u02a2\n \3 \3 \5 \u02a6"+
		"\n \3 \3 \3 \3 \3 \7 \u02ad\n \f \16 \u02b0\13 \3 \3 \3 \3 \3 \5 \u02b7"+
		"\n \3 \3 \5 \u02bb\n \5 \u02bd\n \3!\3!\3\"\3\"\3#\3#\3$\3$\3$\3$\3$\3"+
		"$\5$\u02cb\n$\3%\3%\3&\7&\u02d0\n&\f&\16&\u02d3\13&\3\'\3\'\3\'\3\'\5"+
		"\'\u02d9\n\'\3(\3(\3(\3(\3(\3(\3(\3(\5(\u02e3\n(\3(\2\2)\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLN\2\b\3\2\5\6"+
		"\3\2\21\22\3\2\25\26\3\2 !\3\2\61\62\5\2\3\3\33\33VX\2\u035c\2S\3\2\2"+
		"\2\4i\3\2\2\2\6k\3\2\2\2\bs\3\2\2\2\n\u0095\3\2\2\2\f\u0097\3\2\2\2\16"+
		"\u0099\3\2\2\2\20\u00a7\3\2\2\2\22\u00b6\3\2\2\2\24\u00b8\3\2\2\2\26\u00bb"+
		"\3\2\2\2\30\u00cf\3\2\2\2\32\u00d1\3\2\2\2\34\u00e3\3\2\2\2\36\u00ea\3"+
		"\2\2\2 \u0147\3\2\2\2\"\u0149\3\2\2\2$\u014b\3\2\2\2&\u014d\3\2\2\2(\u014f"+
		"\3\2\2\2*\u0169\3\2\2\2,\u016b\3\2\2\2.\u016d\3\2\2\2\60\u016f\3\2\2\2"+
		"\62\u0172\3\2\2\2\64\u0174\3\2\2\2\66\u018b\3\2\2\28\u018d\3\2\2\2:\u018f"+
		"\3\2\2\2<\u0191\3\2\2\2>\u02bc\3\2\2\2@\u02be\3\2\2\2B\u02c0\3\2\2\2D"+
		"\u02c2\3\2\2\2F\u02ca\3\2\2\2H\u02cc\3\2\2\2J\u02d1\3\2\2\2L\u02d8\3\2"+
		"\2\2N\u02e2\3\2\2\2PR\5\4\3\2QP\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2"+
		"T\3\3\2\2\2US\3\2\2\2VW\5\b\5\2WX\7Q\2\2Xj\3\2\2\2YZ\5\6\4\2Z[\7Q\2\2"+
		"[j\3\2\2\2\\]\5\32\16\2]^\7Q\2\2^j\3\2\2\2_`\5\26\f\2`a\7Q\2\2aj\3\2\2"+
		"\2bc\5\24\13\2cd\7Q\2\2dj\3\2\2\2ef\5\16\b\2fg\7Q\2\2gj\3\2\2\2hj\7Q\2"+
		"\2iV\3\2\2\2iY\3\2\2\2i\\\3\2\2\2i_\3\2\2\2ib\3\2\2\2ie\3\2\2\2ih\3\2"+
		"\2\2j\5\3\2\2\2kl\7\4\2\2lo\t\2\2\2mn\7\7\2\2np\7\b\2\2om\3\2\2\2op\3"+
		"\2\2\2pq\3\2\2\2qr\5N(\2r\7\3\2\2\2st\7G\2\2tx\t\2\2\2uv\7\7\2\2vw\7\t"+
		"\2\2wy\7\b\2\2xu\3\2\2\2xy\3\2\2\2yz\3\2\2\2z~\5N(\2{}\5\n\6\2|{\3\2\2"+
		"\2}\u0080\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\t\3\2\2\2\u0080~\3\2\2\2"+
		"\u0081\u0083\7\n\2\2\u0082\u0081\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084"+
		"\3\2\2\2\u0084\u0085\7\13\2\2\u0085\u0087\7\f\2\2\u0086\u0088\7K\2\2\u0087"+
		"\u0086\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u0096\5B"+
		"\"\2\u008a\u008c\7\n\2\2\u008b\u008a\3\2\2\2\u008b\u008c\3\2\2\2\u008c"+
		"\u008d\3\2\2\2\u008d\u008f\7\r\2\2\u008e\u0090\7K\2\2\u008f\u008e\3\2"+
		"\2\2\u008f\u0090\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0096\5D#\2\u0092\u0093"+
		"\7\31\2\2\u0093\u0094\7K\2\2\u0094\u0096\5\f\7\2\u0095\u0082\3\2\2\2\u0095"+
		"\u008b\3\2\2\2\u0095\u0092\3\2\2\2\u0096\13\3\2\2\2\u0097\u0098\7X\2\2"+
		"\u0098\r\3\2\2\2\u0099\u009f\7\f\2\2\u009a\u009b\5\20\t\2\u009b\u009c"+
		"\7P\2\2\u009c\u009e\3\2\2\2\u009d\u009a\3\2\2\2\u009e\u00a1\3\2\2\2\u009f"+
		"\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a2\3\2\2\2\u00a1\u009f\3\2"+
		"\2\2\u00a2\u00a3\5\20\t\2\u00a3\17\3\2\2\2\u00a4\u00a6\7O\2\2\u00a5\u00a4"+
		"\3\2\2\2\u00a6\u00a9\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8"+
		"\u00aa\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa\u00ab\7U\2\2\u00ab\u00b4\7K\2"+
		"\2\u00ac\u00b5\5\22\n\2\u00ad\u00af\7O\2\2\u00ae\u00ad\3\2\2\2\u00af\u00b2"+
		"\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b3\3\2\2\2\u00b2"+
		"\u00b0\3\2\2\2\u00b3\u00b5\7U\2\2\u00b4\u00ac\3\2\2\2\u00b4\u00b0\3\2"+
		"\2\2\u00b5\21\3\2\2\2\u00b6\u00b7\5H%\2\u00b7\23\3\2\2\2\u00b8\u00b9\7"+
		"\16\2\2\u00b9\u00ba\5N(\2\u00ba\25\3\2\2\2\u00bb\u00bd\7\4\2\2\u00bc\u00be"+
		"\7\17\2\2\u00bd\u00bc\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bf\3\2\2\2"+
		"\u00bf\u00c2\7\20\2\2\u00c0\u00c1\7\7\2\2\u00c1\u00c3\7\b\2\2\u00c2\u00c0"+
		"\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c9\5\30\r\2"+
		"\u00c5\u00c6\7P\2\2\u00c6\u00c8\5\30\r\2\u00c7\u00c5\3\2\2\2\u00c8\u00cb"+
		"\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb"+
		"\u00c9\3\2\2\2\u00cc\u00ce\t\3\2\2\u00cd\u00cc\3\2\2\2\u00cd\u00ce\3\2"+
		"\2\2\u00ce\27\3\2\2\2\u00cf\u00d0\5N(\2\u00d0\31\3\2\2\2\u00d1\u00d3\7"+
		"G\2\2\u00d2\u00d4\7\17\2\2\u00d3\u00d2\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4"+
		"\u00d5\3\2\2\2\u00d5\u00d9\7\20\2\2\u00d6\u00d7\7\7\2\2\u00d7\u00d8\7"+
		"\t\2\2\u00d8\u00da\7\b\2\2\u00d9\u00d6\3\2\2\2\u00d9\u00da\3\2\2\2\u00da"+
		"\u00db\3\2\2\2\u00db\u00dc\5\34\17\2\u00dc\u00de\7R\2\2\u00dd\u00df\5"+
		"\36\20\2\u00de\u00dd\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0"+
		"\u00e1\7S\2\2\u00e1\u00e2\5J&\2\u00e2\33\3\2\2\2\u00e3\u00e4\5N(\2\u00e4"+
		"\35\3\2\2\2\u00e5\u00e6\5 \21\2\u00e6\u00e7\7P\2\2\u00e7\u00e9\3\2\2\2"+
		"\u00e8\u00e5\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb"+
		"\3\2\2\2\u00eb\u00ed\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed\u00ee\5 \21\2\u00ee"+
		"\37\3\2\2\2\u00ef\u00f0\5\"\22\2\u00f0\u00f1\5(\25\2\u00f1\u0148\3\2\2"+
		"\2\u00f2\u00f4\7\23\2\2\u00f3\u00f5\5$\23\2\u00f4\u00f3\3\2\2\2\u00f4"+
		"\u00f5\3\2\2\2\u00f5\u00f7\3\2\2\2\u00f6\u00f2\3\2\2\2\u00f6\u00f7\3\2"+
		"\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f9\7\24\2\2\u00f9\u00fa\7\25\2\2\u00fa"+
		"\u0100\7R\2\2\u00fb\u00fc\5<\37\2\u00fc\u00fd\7P\2\2\u00fd\u00ff\3\2\2"+
		"\2\u00fe\u00fb\3\2\2\2\u00ff\u0102\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101"+
		"\3\2\2\2\u0101\u0103\3\2\2\2\u0102\u0100\3\2\2\2\u0103\u0104\5<\37\2\u0104"+
		"\u0105\7S\2\2\u0105\u0148\3\2\2\2\u0106\u0108\t\4\2\2\u0107\u0109\5$\23"+
		"\2\u0108\u0107\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u0110"+
		"\7R\2\2\u010b\u010c\5<\37\2\u010c\u010d\7P\2\2\u010d\u010f\3\2\2\2\u010e"+
		"\u010b\3\2\2\2\u010f\u0112\3\2\2\2\u0110\u010e\3\2\2\2\u0110\u0111\3\2"+
		"\2\2\u0111\u0113\3\2\2\2\u0112\u0110\3\2\2\2\u0113\u0114\5<\37\2\u0114"+
		"\u0115\7S\2\2\u0115\u0148\3\2\2\2\u0116\u0118\7\23\2\2\u0117\u0119\5$"+
		"\23\2\u0118\u0117\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011b\3\2\2\2\u011a"+
		"\u0116\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011e\7\27"+
		"\2\2\u011d\u011f\t\4\2\2\u011e\u011d\3\2\2\2\u011e\u011f\3\2\2\2\u011f"+
		"\u0121\3\2\2\2\u0120\u0122\5&\24\2\u0121\u0120\3\2\2\2\u0121\u0122\3\2"+
		"\2\2\u0122\u0123\3\2\2\2\u0123\u0129\7R\2\2\u0124\u0125\5<\37\2\u0125"+
		"\u0126\7P\2\2\u0126\u0128\3\2\2\2\u0127\u0124\3\2\2\2\u0128\u012b\3\2"+
		"\2\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012c\3\2\2\2\u012b"+
		"\u0129\3\2\2\2\u012c\u012d\5<\37\2\u012d\u012e\7S\2\2\u012e\u0148\3\2"+
		"\2\2\u012f\u0131\7\23\2\2\u0130\u0132\5$\23\2\u0131\u0130\3\2\2\2\u0131"+
		"\u0132\3\2\2\2\u0132\u0134\3\2\2\2\u0133\u012f\3\2\2\2\u0133\u0134\3\2"+
		"\2\2\u0134\u0135\3\2\2\2\u0135\u0136\7\30\2\2\u0136\u0138\7\25\2\2\u0137"+
		"\u0139\5&\24\2\u0138\u0137\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013a\3\2"+
		"\2\2\u013a\u0140\7R\2\2\u013b\u013c\5<\37\2\u013c\u013d\7P\2\2\u013d\u013f"+
		"\3\2\2\2\u013e\u013b\3\2\2\2\u013f\u0142\3\2\2\2\u0140\u013e\3\2\2\2\u0140"+
		"\u0141\3\2\2\2\u0141\u0143\3\2\2\2\u0142\u0140\3\2\2\2\u0143\u0144\5<"+
		"\37\2\u0144\u0145\7S\2\2\u0145\u0146\5\64\33\2\u0146\u0148\3\2\2\2\u0147"+
		"\u00ef\3\2\2\2\u0147\u00f6\3\2\2\2\u0147\u0106\3\2\2\2\u0147\u011a\3\2"+
		"\2\2\u0147\u0133\3\2\2\2\u0148!\3\2\2\2\u0149\u014a\5N(\2\u014a#\3\2\2"+
		"\2\u014b\u014c\5N(\2\u014c%\3\2\2\2\u014d\u014e\5N(\2\u014e\'\3\2\2\2"+
		"\u014f\u0152\5> \2\u0150\u0153\5.\30\2\u0151\u0153\5\60\31\2\u0152\u0150"+
		"\3\2\2\2\u0152\u0151\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0156\3\2\2\2\u0154"+
		"\u0155\7\n\2\2\u0155\u0157\5,\27\2\u0156\u0154\3\2\2\2\u0156\u0157\3\2"+
		"\2\2\u0157\u0159\3\2\2\2\u0158\u015a\5*\26\2\u0159\u0158\3\2\2\2\u0159"+
		"\u015a\3\2\2\2\u015a\u0163\3\2\2\2\u015b\u015d\7\27\2\2\u015c\u015e\7"+
		"\25\2\2\u015d\u015c\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u0164\3\2\2\2\u015f"+
		"\u0161\7\24\2\2\u0160\u015f\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u0162\3"+
		"\2\2\2\u0162\u0164\7\25\2\2\u0163\u015b\3\2\2\2\u0163\u0160\3\2\2\2\u0163"+
		"\u0164\3\2\2\2\u0164\u0167\3\2\2\2\u0165\u0166\7\31\2\2\u0166\u0168\5"+
		"\62\32\2\u0167\u0165\3\2\2\2\u0167\u0168\3\2\2\2\u0168)\3\2\2\2\u0169"+
		"\u016a\7\32\2\2\u016a+\3\2\2\2\u016b\u016c\5H%\2\u016c-\3\2\2\2\u016d"+
		"\u016e\7\33\2\2\u016e/\3\2\2\2\u016f\u0170\7\t\2\2\u0170\u0171\7\33\2"+
		"\2\u0171\61\3\2\2\2\u0172\u0173\7X\2\2\u0173\63\3\2\2\2\u0174\u0175\7"+
		"\34\2\2\u0175\u0176\5:\36\2\u0176\u017c\7R\2\2\u0177\u0178\5<\37\2\u0178"+
		"\u0179\7P\2\2\u0179\u017b\3\2\2\2\u017a\u0177\3\2\2\2\u017b\u017e\3\2"+
		"\2\2\u017c\u017a\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u017f\3\2\2\2\u017e"+
		"\u017c\3\2\2\2\u017f\u0180\5<\37\2\u0180\u0184\7S\2\2\u0181\u0182\7\35"+
		"\2\2\u0182\u0183\7\36\2\2\u0183\u0185\5\66\34\2\u0184\u0181\3\2\2\2\u0184"+
		"\u0185\3\2\2\2\u0185\u0189\3\2\2\2\u0186\u0187\7\35\2\2\u0187\u0188\7"+
		"\37\2\2\u0188\u018a\58\35\2\u0189\u0186\3\2\2\2\u0189\u018a\3\2\2\2\u018a"+
		"\65\3\2\2\2\u018b\u018c\5F$\2\u018c\67\3\2\2\2\u018d\u018e\5F$\2\u018e"+
		"9\3\2\2\2\u018f\u0190\5N(\2\u0190;\3\2\2\2\u0191\u0193\5N(\2\u0192\u0194"+
		"\t\5\2\2\u0193\u0192\3\2\2\2\u0193\u0194\3\2\2\2\u0194=\3\2\2\2\u0195"+
		"\u0199\7\"\2\2\u0196\u0197\7R\2\2\u0197\u0198\7V\2\2\u0198\u019a\7S\2"+
		"\2\u0199\u0196\3\2\2\2\u0199\u019a\3\2\2\2\u019a\u02bd\3\2\2\2\u019b\u019f"+
		"\7#\2\2\u019c\u019d\7R\2\2\u019d\u019e\7V\2\2\u019e\u01a0\7S\2\2\u019f"+
		"\u019c\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a2\3\2\2\2\u01a1\u01a3\7$"+
		"\2\2\u01a2\u01a1\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a5\3\2\2\2\u01a4"+
		"\u01a6\7&\2\2\u01a5\u01a4\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u02bd\3\2"+
		"\2\2\u01a7\u01ab\7\'\2\2\u01a8\u01a9\7R\2\2\u01a9\u01aa\7V\2\2\u01aa\u01ac"+
		"\7S\2\2\u01ab\u01a8\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01ae\3\2\2\2\u01ad"+
		"\u01af\7$\2\2\u01ae\u01ad\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01b1\3\2"+
		"\2\2\u01b0\u01b2\7&\2\2\u01b1\u01b0\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2"+
		"\u02bd\3\2\2\2\u01b3\u01b7\7(\2\2\u01b4\u01b5\7R\2\2\u01b5\u01b6\7V\2"+
		"\2\u01b6\u01b8\7S\2\2\u01b7\u01b4\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01ba"+
		"\3\2\2\2\u01b9\u01bb\7$\2\2\u01ba\u01b9\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb"+
		"\u01bd\3\2\2\2\u01bc\u01be\7&\2\2\u01bd\u01bc\3\2\2\2\u01bd\u01be\3\2"+
		"\2\2\u01be\u02bd\3\2\2\2\u01bf\u01c3\7)\2\2\u01c0\u01c1\7R\2\2\u01c1\u01c2"+
		"\7V\2\2\u01c2\u01c4\7S\2\2\u01c3\u01c0\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4"+
		"\u01c6\3\2\2\2\u01c5\u01c7\7$\2\2\u01c6\u01c5\3\2\2\2\u01c6\u01c7\3\2"+
		"\2\2\u01c7\u01c9\3\2\2\2\u01c8\u01ca\7&\2\2\u01c9\u01c8\3\2\2\2\u01c9"+
		"\u01ca\3\2\2\2\u01ca\u02bd\3\2\2\2\u01cb\u01cf\7*\2\2\u01cc\u01cd\7R\2"+
		"\2\u01cd\u01ce\7V\2\2\u01ce\u01d0\7S\2\2\u01cf\u01cc\3\2\2\2\u01cf\u01d0"+
		"\3\2\2\2\u01d0\u01d2\3\2\2\2\u01d1\u01d3\7$\2\2\u01d2\u01d1\3\2\2\2\u01d2"+
		"\u01d3\3\2\2\2\u01d3\u01d5\3\2\2\2\u01d4\u01d6\7&\2\2\u01d5\u01d4\3\2"+
		"\2\2\u01d5\u01d6\3\2\2\2\u01d6\u02bd\3\2\2\2\u01d7\u01db\7+\2\2\u01d8"+
		"\u01d9\7R\2\2\u01d9\u01da\7V\2\2\u01da\u01dc\7S\2\2\u01db\u01d8\3\2\2"+
		"\2\u01db\u01dc\3\2\2\2\u01dc\u01de\3\2\2\2\u01dd\u01df\7$\2\2\u01de\u01dd"+
		"\3\2\2\2\u01de\u01df\3\2\2\2\u01df\u01e1\3\2\2\2\u01e0\u01e2\7&\2\2\u01e1"+
		"\u01e0\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u02bd\3\2\2\2\u01e3\u01e9\7,"+
		"\2\2\u01e4\u01e5\7R\2\2\u01e5\u01e6\7V\2\2\u01e6\u01e7\7P\2\2\u01e7\u01e8"+
		"\7V\2\2\u01e8\u01ea\7S\2\2\u01e9\u01e4\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea"+
		"\u01ec\3\2\2\2\u01eb\u01ed\7$\2\2\u01ec\u01eb\3\2\2\2\u01ec\u01ed\3\2"+
		"\2\2\u01ed\u01ef\3\2\2\2\u01ee\u01f0\7&\2\2\u01ef\u01ee\3\2\2\2\u01ef"+
		"\u01f0\3\2\2\2\u01f0\u02bd\3\2\2\2\u01f1\u01f7\7-\2\2\u01f2\u01f3\7R\2"+
		"\2\u01f3\u01f4\7V\2\2\u01f4\u01f5\7P\2\2\u01f5\u01f6\7V\2\2\u01f6\u01f8"+
		"\7S\2\2\u01f7\u01f2\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\u01fa\3\2\2\2\u01f9"+
		"\u01fb\7$\2\2\u01fa\u01f9\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb\u01fd\3\2"+
		"\2\2\u01fc\u01fe\7&\2\2\u01fd\u01fc\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe"+
		"\u02bd\3\2\2\2\u01ff\u0205\7.\2\2\u0200\u0201\7R\2\2\u0201\u0202\7V\2"+
		"\2\u0202\u0203\7P\2\2\u0203\u0204\7V\2\2\u0204\u0206\7S\2\2\u0205\u0200"+
		"\3\2\2\2\u0205\u0206\3\2\2\2\u0206\u0208\3\2\2\2\u0207\u0209\7$\2\2\u0208"+
		"\u0207\3\2\2\2\u0208\u0209\3\2\2\2\u0209\u020b\3\2\2\2\u020a\u020c\7&"+
		"\2\2\u020b\u020a\3\2\2\2\u020b\u020c\3\2\2\2\u020c\u02bd\3\2\2\2\u020d"+
		"\u0215\7/\2\2\u020e\u020f\7R\2\2\u020f\u0212\7V\2\2\u0210\u0211\7P\2\2"+
		"\u0211\u0213\7V\2\2\u0212\u0210\3\2\2\2\u0212\u0213\3\2\2\2\u0213\u0214"+
		"\3\2\2\2\u0214\u0216\7S\2\2\u0215\u020e\3\2\2\2\u0215\u0216\3\2\2\2\u0216"+
		"\u0218\3\2\2\2\u0217\u0219\7$\2\2\u0218\u0217\3\2\2\2\u0218\u0219\3\2"+
		"\2\2\u0219\u021b\3\2\2\2\u021a\u021c\7&\2\2\u021b\u021a\3\2\2\2\u021b"+
		"\u021c\3\2\2\2\u021c\u02bd\3\2\2\2\u021d\u0225\7\60\2\2\u021e\u021f\7"+
		"R\2\2\u021f\u0222\7V\2\2\u0220\u0221\7P\2\2\u0221\u0223\7V\2\2\u0222\u0220"+
		"\3\2\2\2\u0222\u0223\3\2\2\2\u0223\u0224\3\2\2\2\u0224\u0226\7S\2\2\u0225"+
		"\u021e\3\2\2\2\u0225\u0226\3\2\2\2\u0226\u0228\3\2\2\2\u0227\u0229\7$"+
		"\2\2\u0228\u0227\3\2\2\2\u0228\u0229\3\2\2\2\u0229\u022b\3\2\2\2\u022a"+
		"\u022c\7&\2\2\u022b\u022a\3\2\2\2\u022b\u022c\3\2\2\2\u022c\u02bd\3\2"+
		"\2\2\u022d\u02bd\t\6\2\2\u022e\u02bd\7\63\2\2\u022f\u02bd\7\64\2\2\u0230"+
		"\u02bd\7\65\2\2\u0231\u02bd\7\66\2\2\u0232\u02bd\7\67\2\2\u0233\u0237"+
		"\78\2\2\u0234\u0235\7R\2\2\u0235\u0236\7V\2\2\u0236\u0238\7S\2\2\u0237"+
		"\u0234\3\2\2\2\u0237\u0238\3\2\2\2\u0238\u023c\3\2\2\2\u0239\u023a\7\13"+
		"\2\2\u023a\u023b\7\f\2\2\u023b\u023d\5B\"\2\u023c\u0239\3\2\2\2\u023c"+
		"\u023d\3\2\2\2\u023d\u0240\3\2\2\2\u023e\u023f\7\r\2\2\u023f\u0241\5D"+
		"#\2\u0240\u023e\3\2\2\2\u0240\u0241\3\2\2\2\u0241\u02bd\3\2\2\2\u0242"+
		"\u0243\79\2\2\u0243\u0244\7R\2\2\u0244\u0245\7V\2\2\u0245\u0249\7S\2\2"+
		"\u0246\u0247\7\13\2\2\u0247\u0248\7\f\2\2\u0248\u024a\5B\"\2\u0249\u0246"+
		"\3\2\2\2\u0249\u024a\3\2\2\2\u024a\u024d\3\2\2\2\u024b\u024c\7\r\2\2\u024c"+
		"\u024e\5D#\2\u024d\u024b\3\2\2\2\u024d\u024e\3\2\2\2\u024e\u02bd\3\2\2"+
		"\2\u024f\u0253\7%\2\2\u0250\u0251\7R\2\2\u0251\u0252\7V\2\2\u0252\u0254"+
		"\7S\2\2\u0253\u0250\3\2\2\2\u0253\u0254\3\2\2\2\u0254\u02bd\3\2\2\2\u0255"+
		"\u0256\7:\2\2\u0256\u0257\7R\2\2\u0257\u0258\7V\2\2\u0258\u02bd\7S\2\2"+
		"\u0259\u02bd\7;\2\2\u025a\u02bd\7<\2\2\u025b\u02bd\7=\2\2\u025c\u02bd"+
		"\7>\2\2\u025d\u02bd\7?\2\2\u025e\u0260\7@\2\2\u025f\u0261\7%\2\2\u0260"+
		"\u025f\3\2\2\2\u0260\u0261\3\2\2\2\u0261\u0265\3\2\2\2\u0262\u0263\7\13"+
		"\2\2\u0263\u0264\7\f\2\2\u0264\u0266\5B\"\2\u0265\u0262\3\2\2\2\u0265"+
		"\u0266\3\2\2\2\u0266\u0269\3\2\2\2\u0267\u0268\7\r\2\2\u0268\u026a\5D"+
		"#\2\u0269\u0267\3\2\2\2\u0269\u026a\3\2\2\2\u026a\u02bd\3\2\2\2\u026b"+
		"\u026d\7A\2\2\u026c\u026e\7%\2\2\u026d\u026c\3\2\2\2\u026d\u026e\3\2\2"+
		"\2\u026e\u0272\3\2\2\2\u026f\u0270\7\13\2\2\u0270\u0271\7\f\2\2\u0271"+
		"\u0273\5B\"\2\u0272\u026f\3\2\2\2\u0272\u0273\3\2\2\2\u0273\u0276\3\2"+
		"\2\2\u0274\u0275\7\r\2\2\u0275\u0277\5D#\2\u0276\u0274\3\2\2\2\u0276\u0277"+
		"\3\2\2\2\u0277\u02bd\3\2\2\2\u0278\u027a\7B\2\2\u0279\u027b\7%\2\2\u027a"+
		"\u0279\3\2\2\2\u027a\u027b\3\2\2\2\u027b\u027f\3\2\2\2\u027c\u027d\7\13"+
		"\2\2\u027d\u027e\7\f\2\2\u027e\u0280\5B\"\2\u027f\u027c\3\2\2\2\u027f"+
		"\u0280\3\2\2\2\u0280\u0283\3\2\2\2\u0281\u0282\7\r\2\2\u0282\u0284\5D"+
		"#\2\u0283\u0281\3\2\2\2\u0283\u0284\3\2\2\2\u0284\u02bd\3\2\2\2\u0285"+
		"\u0287\7C\2\2\u0286\u0288\7%\2\2\u0287\u0286\3\2\2\2\u0287\u0288\3\2\2"+
		"\2\u0288\u028c\3\2\2\2\u0289\u028a\7\13\2\2\u028a\u028b\7\f\2\2\u028b"+
		"\u028d\5B\"\2\u028c\u0289\3\2\2\2\u028c\u028d\3\2\2\2\u028d\u0290\3\2"+
		"\2\2\u028e\u028f\7\r\2\2\u028f\u0291\5D#\2\u0290\u028e\3\2\2\2\u0290\u0291"+
		"\3\2\2\2\u0291\u02bd\3\2\2\2\u0292\u0293\7D\2\2\u0293\u0299\7R\2\2\u0294"+
		"\u0295\5@!\2\u0295\u0296\7P\2\2\u0296\u0298\3\2\2\2\u0297\u0294\3\2\2"+
		"\2\u0298\u029b\3\2\2\2\u0299\u0297\3\2\2\2\u0299\u029a\3\2\2\2\u029a\u029c"+
		"\3\2\2\2\u029b\u0299\3\2\2\2\u029c\u029d\5@!\2\u029d\u02a1\7S\2\2\u029e"+
		"\u029f\7\13\2\2\u029f\u02a0\7\f\2\2\u02a0\u02a2\5B\"\2\u02a1\u029e\3\2"+
		"\2\2\u02a1\u02a2\3\2\2\2\u02a2\u02a5\3\2\2\2\u02a3\u02a4\7\r\2\2\u02a4"+
		"\u02a6\5D#\2\u02a5\u02a3\3\2\2\2\u02a5\u02a6\3\2\2\2\u02a6\u02bd\3\2\2"+
		"\2\u02a7\u02a8\7\f\2\2\u02a8\u02ae\7R\2\2\u02a9\u02aa\5@!\2\u02aa\u02ab"+
		"\7P\2\2\u02ab\u02ad\3\2\2\2\u02ac\u02a9\3\2\2\2\u02ad\u02b0\3\2\2\2\u02ae"+
		"\u02ac\3\2\2\2\u02ae\u02af\3\2\2\2\u02af\u02b1\3\2\2\2\u02b0\u02ae\3\2"+
		"\2\2\u02b1\u02b2\5@!\2\u02b2\u02b6\7S\2\2\u02b3\u02b4\7\13\2\2\u02b4\u02b5"+
		"\7\f\2\2\u02b5\u02b7\5B\"\2\u02b6\u02b3\3\2\2\2\u02b6\u02b7\3\2\2\2\u02b7"+
		"\u02ba\3\2\2\2\u02b8\u02b9\7\r\2\2\u02b9\u02bb\5D#\2\u02ba\u02b8\3\2\2"+
		"\2\u02ba\u02bb\3\2\2\2\u02bb\u02bd\3\2\2\2\u02bc\u0195\3\2\2\2\u02bc\u019b"+
		"\3\2\2\2\u02bc\u01a7\3\2\2\2\u02bc\u01b3\3\2\2\2\u02bc\u01bf\3\2\2\2\u02bc"+
		"\u01cb\3\2\2\2\u02bc\u01d7\3\2\2\2\u02bc\u01e3\3\2\2\2\u02bc\u01f1\3\2"+
		"\2\2\u02bc\u01ff\3\2\2\2\u02bc\u020d\3\2\2\2\u02bc\u021d\3\2\2\2\u02bc"+
		"\u022d\3\2\2\2\u02bc\u022e\3\2\2\2\u02bc\u022f\3\2\2\2\u02bc\u0230\3\2"+
		"\2\2\u02bc\u0231\3\2\2\2\u02bc\u0232\3\2\2\2\u02bc\u0233\3\2\2\2\u02bc"+
		"\u0242\3\2\2\2\u02bc\u024f\3\2\2\2\u02bc\u0255\3\2\2\2\u02bc\u0259\3\2"+
		"\2\2\u02bc\u025a\3\2\2\2\u02bc\u025b\3\2\2\2\u02bc\u025c\3\2\2\2\u02bc"+
		"\u025d\3\2\2\2\u02bc\u025e\3\2\2\2\u02bc\u026b\3\2\2\2\u02bc\u0278\3\2"+
		"\2\2\u02bc\u0285\3\2\2\2\u02bc\u0292\3\2\2\2\u02bc\u02a7\3\2\2\2\u02bd"+
		"?\3\2\2\2\u02be\u02bf\7X\2\2\u02bfA\3\2\2\2\u02c0\u02c1\5N(\2\u02c1C\3"+
		"\2\2\2\u02c2\u02c3\5N(\2\u02c3E\3\2\2\2\u02c4\u02cb\7\21\2\2\u02c5\u02cb"+
		"\7\22\2\2\u02c6\u02c7\7\f\2\2\u02c7\u02cb\7\33\2\2\u02c8\u02c9\7E\2\2"+
		"\u02c9\u02cb\7F\2\2\u02ca\u02c4\3\2\2\2\u02ca\u02c5\3\2\2\2\u02ca\u02c6"+
		"\3\2\2\2\u02ca\u02c8\3\2\2\2\u02cbG\3\2\2\2\u02cc\u02cd\t\7\2\2\u02cd"+
		"I\3\2\2\2\u02ce\u02d0\5L\'\2\u02cf\u02ce\3\2\2\2\u02d0\u02d3\3\2\2\2\u02d1"+
		"\u02cf\3\2\2\2\u02d1\u02d2\3\2\2\2\u02d2K\3\2\2\2\u02d3\u02d1\3\2\2\2"+
		"\u02d4\u02d5\7U\2\2\u02d5\u02d6\7K\2\2\u02d6\u02d9\7U\2\2\u02d7\u02d9"+
		"\5\n\6\2\u02d8\u02d4\3\2\2\2\u02d8\u02d7\3\2\2\2\u02d9M\3\2\2\2\u02da"+
		"\u02e3\7T\2\2\u02db\u02dc\7L\2\2\u02dc\u02dd\7U\2\2\u02dd\u02e3\7L\2\2"+
		"\u02de\u02df\7M\2\2\u02df\u02e0\7U\2\2\u02e0\u02e3\7M\2\2\u02e1\u02e3"+
		"\7U\2\2\u02e2\u02da\3\2\2\2\u02e2\u02db\3\2\2\2\u02e2\u02de\3\2\2\2\u02e2"+
		"\u02e1\3\2\2\2\u02e3O\3\2\2\2sSiox~\u0082\u0087\u008b\u008f\u0095\u009f"+
		"\u00a7\u00b0\u00b4\u00bd\u00c2\u00c9\u00cd\u00d3\u00d9\u00de\u00ea\u00f4"+
		"\u00f6\u0100\u0108\u0110\u0118\u011a\u011e\u0121\u0129\u0131\u0133\u0138"+
		"\u0140\u0147\u0152\u0156\u0159\u015d\u0160\u0163\u0167\u017c\u0184\u0189"+
		"\u0193\u0199\u019f\u01a2\u01a5\u01ab\u01ae\u01b1\u01b7\u01ba\u01bd\u01c3"+
		"\u01c6\u01c9\u01cf\u01d2\u01d5\u01db\u01de\u01e1\u01e9\u01ec\u01ef\u01f7"+
		"\u01fa\u01fd\u0205\u0208\u020b\u0212\u0215\u0218\u021b\u0222\u0225\u0228"+
		"\u022b\u0237\u023c\u0240\u0249\u024d\u0253\u0260\u0265\u0269\u026d\u0272"+
		"\u0276\u027a\u027f\u0283\u0287\u028c\u0290\u0299\u02a1\u02a5\u02ae\u02b6"+
		"\u02ba\u02bc\u02ca\u02d1\u02d8\u02e2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}