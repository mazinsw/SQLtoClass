// Generated from /home/mazinsw/Development/SQLtoClass/src/parser/SQLParser.g4 by ANTLR 4.13.2
package parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class SQLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BOOL=1, K_DROP=2, K_DATABASE=3, K_SCHEMA=4, K_IF=5, K_EXISTS=6, K_NOT=7, 
		K_DEFAULT=8, K_CHARACTER=9, K_SET=10, K_COLLATE=11, K_USE=12, K_TEMPORARY=13, 
		K_TABLE=14, K_RESTRICT=15, K_CASCADE=16, K_CONSTRAINT=17, K_PRIMARY=18, 
		K_KEY=19, K_INDEX=20, K_UNIQUE=21, K_FULLTEXT=22, K_FOREIGN=23, K_COMMENT=24, 
		K_AUTO_INCREMENT=25, K_NULL=26, K_REFERENCES=27, K_ON=28, K_DELETE=29, 
		K_UPDATE=30, K_ASC=31, K_DESC=32, K_BIT=33, K_TINYINT=34, K_UNSIGNED=35, 
		K_BINARY=36, K_ZEROFILL=37, K_SMALLINT=38, K_MEDIUMINT=39, K_INT=40, K_INTEGER=41, 
		K_BIGINT=42, K_REAL=43, K_DOUBLE=44, K_FLOAT=45, K_DECIMAL=46, K_NUMERIC=47, 
		K_BOOL=48, K_BOOLEAN=49, K_DATE=50, K_TIME=51, K_TIMESTAMP=52, K_DATETIME=53, 
		K_YEAR=54, K_CHAR=55, K_VARCHAR=56, K_VARBINARY=57, K_TINYBLOB=58, K_BLOB=59, 
		K_MEDIUMBLOB=60, K_LONGBLOB=61, K_JSON=62, K_TINYTEXT=63, K_TEXT=64, K_MEDIUMTEXT=65, 
		K_LONGTEXT=66, K_ENUM=67, K_NO=68, K_ACTION=69, K_CREATE=70, K_FALSE=71, 
		K_TRUE=72, DOT=73, EQ=74, SINGLE_QUOTE=75, DOUBLE_QUOTE=76, BACK_QUOTE=77, 
		AT=78, COMMA=79, SEMICOLON=80, LPAR=81, RPAR=82, ID=83, NAME=84, INT=85, 
		FLOAT=86, STRING=87, COMMENT=88, SINGLE_COMMENT=89, WS=90;
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
			null, "'.'", "'='", "'''", "'\"'", "'`'", "'@'", "','", "';'", "'('", 
			"')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BOOL", "K_DROP", "K_DATABASE", "K_SCHEMA", "K_IF", "K_EXISTS", 
			"K_NOT", "K_DEFAULT", "K_CHARACTER", "K_SET", "K_COLLATE", "K_USE", "K_TEMPORARY", 
			"K_TABLE", "K_RESTRICT", "K_CASCADE", "K_CONSTRAINT", "K_PRIMARY", "K_KEY", 
			"K_INDEX", "K_UNIQUE", "K_FULLTEXT", "K_FOREIGN", "K_COMMENT", "K_AUTO_INCREMENT", 
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

	@SuppressWarnings("CheckReturnValue")
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 5124L) != 0) || _la==K_CREATE || _la==SEMICOLON) {
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 16780032L) != 0)) {
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
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
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 16646144L) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & 771L) != 0)) {
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
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
	@SuppressWarnings("CheckReturnValue")
	public static class FulltextStmtContext extends CreateDefinitionContext {
		public TerminalNode K_FULLTEXT() { return getToken(SQLParser.K_FULLTEXT, 0); }
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
		public FulltextStmtContext(CreateDefinitionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterFulltextStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitFulltextStmt(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
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
	@SuppressWarnings("CheckReturnValue")
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
	@SuppressWarnings("CheckReturnValue")
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
	@SuppressWarnings("CheckReturnValue")
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
	@SuppressWarnings("CheckReturnValue")
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
			setState(342);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
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
					if (((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & 771L) != 0)) {
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
				if (((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & 771L) != 0)) {
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
				_localctx = new FulltextStmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(276);
				match(K_FULLTEXT);
				setState(277);
				_la = _input.LA(1);
				if ( !(_la==K_KEY || _la==K_INDEX) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(279);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & 771L) != 0)) {
					{
					setState(278);
					constraintName();
					}
				}

				setState(281);
				match(LPAR);
				setState(287);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(282);
						indexColName();
						setState(283);
						match(COMMA);
						}
						} 
					}
					setState(289);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				}
				setState(290);
				indexColName();
				setState(291);
				match(RPAR);
				}
				break;
			case 5:
				_localctx = new UniqueStmtContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(297);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_CONSTRAINT) {
					{
					setState(293);
					match(K_CONSTRAINT);
					setState(295);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & 771L) != 0)) {
						{
						setState(294);
						constraintName();
						}
					}

					}
				}

				setState(299);
				match(K_UNIQUE);
				setState(301);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_KEY || _la==K_INDEX) {
					{
					setState(300);
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

				setState(304);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & 771L) != 0)) {
					{
					setState(303);
					constraintTable();
					}
				}

				setState(306);
				match(LPAR);
				setState(312);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(307);
						indexColName();
						setState(308);
						match(COMMA);
						}
						} 
					}
					setState(314);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				}
				setState(315);
				indexColName();
				setState(316);
				match(RPAR);
				}
				break;
			case 6:
				_localctx = new ForeignStmtContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(322);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_CONSTRAINT) {
					{
					setState(318);
					match(K_CONSTRAINT);
					setState(320);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & 771L) != 0)) {
						{
						setState(319);
						constraintName();
						}
					}

					}
				}

				setState(324);
				match(K_FOREIGN);
				setState(325);
				match(K_KEY);
				setState(327);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & 771L) != 0)) {
					{
					setState(326);
					constraintTable();
					}
				}

				setState(329);
				match(LPAR);
				setState(335);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(330);
						indexColName();
						setState(331);
						match(COMMA);
						}
						} 
					}
					setState(337);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				}
				setState(338);
				indexColName();
				setState(339);
				match(RPAR);
				setState(340);
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

	@SuppressWarnings("CheckReturnValue")
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
			setState(344);
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

	@SuppressWarnings("CheckReturnValue")
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
			setState(346);
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

	@SuppressWarnings("CheckReturnValue")
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
			setState(348);
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

	@SuppressWarnings("CheckReturnValue")
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
			setState(350);
			dataType();
			setState(353);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_NULL:
				{
				setState(351);
				columnNull();
				}
				break;
			case K_NOT:
				{
				setState(352);
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
			setState(357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_DEFAULT) {
				{
				setState(355);
				match(K_DEFAULT);
				setState(356);
				columnDefaultValue();
				}
			}

			setState(360);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_AUTO_INCREMENT) {
				{
				setState(359);
				autoIncrement();
				}
			}

			setState(370);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_UNIQUE:
				{
				{
				setState(362);
				match(K_UNIQUE);
				setState(364);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_KEY) {
					{
					setState(363);
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
				setState(367);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_PRIMARY) {
					{
					setState(366);
					match(K_PRIMARY);
					}
				}

				setState(369);
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
			setState(374);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_COMMENT) {
				{
				setState(372);
				match(K_COMMENT);
				setState(373);
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

	@SuppressWarnings("CheckReturnValue")
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
			setState(376);
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

	@SuppressWarnings("CheckReturnValue")
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
			setState(378);
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

	@SuppressWarnings("CheckReturnValue")
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
			setState(380);
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

	@SuppressWarnings("CheckReturnValue")
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
			setState(382);
			match(K_NOT);
			setState(383);
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

	@SuppressWarnings("CheckReturnValue")
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
			setState(385);
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

	@SuppressWarnings("CheckReturnValue")
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
			setState(387);
			match(K_REFERENCES);
			setState(388);
			referenceTable();
			setState(389);
			match(LPAR);
			setState(395);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(390);
					indexColName();
					setState(391);
					match(COMMA);
					}
					} 
				}
				setState(397);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			}
			setState(398);
			indexColName();
			setState(399);
			match(RPAR);
			setState(403);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(400);
				match(K_ON);
				setState(401);
				match(K_DELETE);
				setState(402);
				referenceDeleteOption();
				}
				break;
			}
			setState(408);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ON) {
				{
				setState(405);
				match(K_ON);
				setState(406);
				match(K_UPDATE);
				setState(407);
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

	@SuppressWarnings("CheckReturnValue")
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
			setState(410);
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

	@SuppressWarnings("CheckReturnValue")
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
			setState(412);
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

	@SuppressWarnings("CheckReturnValue")
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
			setState(414);
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

	@SuppressWarnings("CheckReturnValue")
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
			setState(416);
			idName();
			setState(418);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(417);
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

	@SuppressWarnings("CheckReturnValue")
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
	@SuppressWarnings("CheckReturnValue")
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
	@SuppressWarnings("CheckReturnValue")
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
	@SuppressWarnings("CheckReturnValue")
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
	@SuppressWarnings("CheckReturnValue")
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
	@SuppressWarnings("CheckReturnValue")
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
	@SuppressWarnings("CheckReturnValue")
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
	@SuppressWarnings("CheckReturnValue")
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
	@SuppressWarnings("CheckReturnValue")
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
	@SuppressWarnings("CheckReturnValue")
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
	@SuppressWarnings("CheckReturnValue")
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
	@SuppressWarnings("CheckReturnValue")
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
	@SuppressWarnings("CheckReturnValue")
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
	@SuppressWarnings("CheckReturnValue")
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
	@SuppressWarnings("CheckReturnValue")
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
	@SuppressWarnings("CheckReturnValue")
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
	@SuppressWarnings("CheckReturnValue")
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
	@SuppressWarnings("CheckReturnValue")
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
	@SuppressWarnings("CheckReturnValue")
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
	@SuppressWarnings("CheckReturnValue")
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
	@SuppressWarnings("CheckReturnValue")
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
	@SuppressWarnings("CheckReturnValue")
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
	@SuppressWarnings("CheckReturnValue")
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
	@SuppressWarnings("CheckReturnValue")
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
	@SuppressWarnings("CheckReturnValue")
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
	@SuppressWarnings("CheckReturnValue")
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
	@SuppressWarnings("CheckReturnValue")
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
	@SuppressWarnings("CheckReturnValue")
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
	@SuppressWarnings("CheckReturnValue")
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
	@SuppressWarnings("CheckReturnValue")
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
	@SuppressWarnings("CheckReturnValue")
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
	@SuppressWarnings("CheckReturnValue")
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
	@SuppressWarnings("CheckReturnValue")
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
	@SuppressWarnings("CheckReturnValue")
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
			setState(715);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_BIT:
				_localctx = new TypeBitStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(420);
				match(K_BIT);
				setState(424);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAR) {
					{
					setState(421);
					match(LPAR);
					setState(422);
					match(INT);
					setState(423);
					match(RPAR);
					}
				}

				}
				break;
			case K_TINYINT:
				_localctx = new TypeTinyIntStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(426);
				match(K_TINYINT);
				setState(430);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAR) {
					{
					setState(427);
					match(LPAR);
					setState(428);
					match(INT);
					setState(429);
					match(RPAR);
					}
				}

				setState(433);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_UNSIGNED) {
					{
					setState(432);
					match(K_UNSIGNED);
					}
				}

				setState(436);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ZEROFILL) {
					{
					setState(435);
					match(K_ZEROFILL);
					}
				}

				}
				break;
			case K_SMALLINT:
				_localctx = new TypeSmallIntStmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(438);
				match(K_SMALLINT);
				setState(442);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAR) {
					{
					setState(439);
					match(LPAR);
					setState(440);
					match(INT);
					setState(441);
					match(RPAR);
					}
				}

				setState(445);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_UNSIGNED) {
					{
					setState(444);
					match(K_UNSIGNED);
					}
				}

				setState(448);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ZEROFILL) {
					{
					setState(447);
					match(K_ZEROFILL);
					}
				}

				}
				break;
			case K_MEDIUMINT:
				_localctx = new TypeMediumIntStmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(450);
				match(K_MEDIUMINT);
				setState(454);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAR) {
					{
					setState(451);
					match(LPAR);
					setState(452);
					match(INT);
					setState(453);
					match(RPAR);
					}
				}

				setState(457);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_UNSIGNED) {
					{
					setState(456);
					match(K_UNSIGNED);
					}
				}

				setState(460);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ZEROFILL) {
					{
					setState(459);
					match(K_ZEROFILL);
					}
				}

				}
				break;
			case K_INT:
				_localctx = new TypeIntStmtContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(462);
				match(K_INT);
				setState(466);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAR) {
					{
					setState(463);
					match(LPAR);
					setState(464);
					match(INT);
					setState(465);
					match(RPAR);
					}
				}

				setState(469);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_UNSIGNED) {
					{
					setState(468);
					match(K_UNSIGNED);
					}
				}

				setState(472);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ZEROFILL) {
					{
					setState(471);
					match(K_ZEROFILL);
					}
				}

				}
				break;
			case K_INTEGER:
				_localctx = new TypeIntegerStmtContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(474);
				match(K_INTEGER);
				setState(478);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAR) {
					{
					setState(475);
					match(LPAR);
					setState(476);
					match(INT);
					setState(477);
					match(RPAR);
					}
				}

				setState(481);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_UNSIGNED) {
					{
					setState(480);
					match(K_UNSIGNED);
					}
				}

				setState(484);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ZEROFILL) {
					{
					setState(483);
					match(K_ZEROFILL);
					}
				}

				}
				break;
			case K_BIGINT:
				_localctx = new TypeBigIntStmtContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(486);
				match(K_BIGINT);
				setState(490);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAR) {
					{
					setState(487);
					match(LPAR);
					setState(488);
					match(INT);
					setState(489);
					match(RPAR);
					}
				}

				setState(493);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_UNSIGNED) {
					{
					setState(492);
					match(K_UNSIGNED);
					}
				}

				setState(496);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ZEROFILL) {
					{
					setState(495);
					match(K_ZEROFILL);
					}
				}

				}
				break;
			case K_REAL:
				_localctx = new TypeRealStmtContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(498);
				match(K_REAL);
				setState(504);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAR) {
					{
					setState(499);
					match(LPAR);
					setState(500);
					match(INT);
					setState(501);
					match(COMMA);
					setState(502);
					match(INT);
					setState(503);
					match(RPAR);
					}
				}

				setState(507);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_UNSIGNED) {
					{
					setState(506);
					match(K_UNSIGNED);
					}
				}

				setState(510);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ZEROFILL) {
					{
					setState(509);
					match(K_ZEROFILL);
					}
				}

				}
				break;
			case K_DOUBLE:
				_localctx = new TypeDoubleStmtContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(512);
				match(K_DOUBLE);
				setState(518);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAR) {
					{
					setState(513);
					match(LPAR);
					setState(514);
					match(INT);
					setState(515);
					match(COMMA);
					setState(516);
					match(INT);
					setState(517);
					match(RPAR);
					}
				}

				setState(521);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_UNSIGNED) {
					{
					setState(520);
					match(K_UNSIGNED);
					}
				}

				setState(524);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ZEROFILL) {
					{
					setState(523);
					match(K_ZEROFILL);
					}
				}

				}
				break;
			case K_FLOAT:
				_localctx = new TypeFloatStmtContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(526);
				match(K_FLOAT);
				setState(532);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAR) {
					{
					setState(527);
					match(LPAR);
					setState(528);
					match(INT);
					setState(529);
					match(COMMA);
					setState(530);
					match(INT);
					setState(531);
					match(RPAR);
					}
				}

				setState(535);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_UNSIGNED) {
					{
					setState(534);
					match(K_UNSIGNED);
					}
				}

				setState(538);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ZEROFILL) {
					{
					setState(537);
					match(K_ZEROFILL);
					}
				}

				}
				break;
			case K_DECIMAL:
				_localctx = new TypeDecimalStmtContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(540);
				match(K_DECIMAL);
				setState(548);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAR) {
					{
					setState(541);
					match(LPAR);
					setState(542);
					match(INT);
					setState(545);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(543);
						match(COMMA);
						setState(544);
						match(INT);
						}
					}

					setState(547);
					match(RPAR);
					}
				}

				setState(551);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_UNSIGNED) {
					{
					setState(550);
					match(K_UNSIGNED);
					}
				}

				setState(554);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ZEROFILL) {
					{
					setState(553);
					match(K_ZEROFILL);
					}
				}

				}
				break;
			case K_NUMERIC:
				_localctx = new TypeNumericStmtContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(556);
				match(K_NUMERIC);
				setState(564);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAR) {
					{
					setState(557);
					match(LPAR);
					setState(558);
					match(INT);
					setState(561);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(559);
						match(COMMA);
						setState(560);
						match(INT);
						}
					}

					setState(563);
					match(RPAR);
					}
				}

				setState(567);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_UNSIGNED) {
					{
					setState(566);
					match(K_UNSIGNED);
					}
				}

				setState(570);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ZEROFILL) {
					{
					setState(569);
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
				setState(572);
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
				setState(573);
				match(K_DATE);
				}
				break;
			case K_TIME:
				_localctx = new TypeTimeStmtContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(574);
				match(K_TIME);
				}
				break;
			case K_TIMESTAMP:
				_localctx = new TypeTimeStampStmtContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(575);
				match(K_TIMESTAMP);
				}
				break;
			case K_DATETIME:
				_localctx = new TypeDateTimeStmtContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(576);
				match(K_DATETIME);
				}
				break;
			case K_YEAR:
				_localctx = new TypeYearStmtContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(577);
				match(K_YEAR);
				}
				break;
			case K_CHAR:
				_localctx = new TypeCharStmtContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(578);
				match(K_CHAR);
				setState(582);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAR) {
					{
					setState(579);
					match(LPAR);
					setState(580);
					match(INT);
					setState(581);
					match(RPAR);
					}
				}

				setState(587);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_CHARACTER) {
					{
					setState(584);
					match(K_CHARACTER);
					setState(585);
					match(K_SET);
					setState(586);
					charsetName();
					}
				}

				setState(591);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_COLLATE) {
					{
					setState(589);
					match(K_COLLATE);
					setState(590);
					collateName();
					}
				}

				}
				break;
			case K_VARCHAR:
				_localctx = new TypeVarCharStmtContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(593);
				match(K_VARCHAR);
				setState(594);
				match(LPAR);
				setState(595);
				match(INT);
				setState(596);
				match(RPAR);
				setState(600);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_CHARACTER) {
					{
					setState(597);
					match(K_CHARACTER);
					setState(598);
					match(K_SET);
					setState(599);
					charsetName();
					}
				}

				setState(604);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_COLLATE) {
					{
					setState(602);
					match(K_COLLATE);
					setState(603);
					collateName();
					}
				}

				}
				break;
			case K_BINARY:
				_localctx = new TypeBinaryStmtContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(606);
				match(K_BINARY);
				setState(610);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAR) {
					{
					setState(607);
					match(LPAR);
					setState(608);
					match(INT);
					setState(609);
					match(RPAR);
					}
				}

				}
				break;
			case K_VARBINARY:
				_localctx = new TypeVarBinaryStmtContext(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(612);
				match(K_VARBINARY);
				setState(613);
				match(LPAR);
				setState(614);
				match(INT);
				setState(615);
				match(RPAR);
				}
				break;
			case K_TINYBLOB:
				_localctx = new TypeTinyBlobStmtContext(_localctx);
				enterOuterAlt(_localctx, 23);
				{
				setState(616);
				match(K_TINYBLOB);
				}
				break;
			case K_BLOB:
				_localctx = new TypeBlobStmtContext(_localctx);
				enterOuterAlt(_localctx, 24);
				{
				setState(617);
				match(K_BLOB);
				}
				break;
			case K_MEDIUMBLOB:
				_localctx = new TypeMediumBlobStmtContext(_localctx);
				enterOuterAlt(_localctx, 25);
				{
				setState(618);
				match(K_MEDIUMBLOB);
				}
				break;
			case K_LONGBLOB:
				_localctx = new TypeLongBlobStmtContext(_localctx);
				enterOuterAlt(_localctx, 26);
				{
				setState(619);
				match(K_LONGBLOB);
				}
				break;
			case K_JSON:
				_localctx = new TypeJsonStmtContext(_localctx);
				enterOuterAlt(_localctx, 27);
				{
				setState(620);
				match(K_JSON);
				}
				break;
			case K_TINYTEXT:
				_localctx = new TypeTinyTextStmtContext(_localctx);
				enterOuterAlt(_localctx, 28);
				{
				setState(621);
				match(K_TINYTEXT);
				setState(623);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_BINARY) {
					{
					setState(622);
					match(K_BINARY);
					}
				}

				setState(628);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_CHARACTER) {
					{
					setState(625);
					match(K_CHARACTER);
					setState(626);
					match(K_SET);
					setState(627);
					charsetName();
					}
				}

				setState(632);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_COLLATE) {
					{
					setState(630);
					match(K_COLLATE);
					setState(631);
					collateName();
					}
				}

				}
				break;
			case K_TEXT:
				_localctx = new TypeTextStmtContext(_localctx);
				enterOuterAlt(_localctx, 29);
				{
				setState(634);
				match(K_TEXT);
				setState(636);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_BINARY) {
					{
					setState(635);
					match(K_BINARY);
					}
				}

				setState(641);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_CHARACTER) {
					{
					setState(638);
					match(K_CHARACTER);
					setState(639);
					match(K_SET);
					setState(640);
					charsetName();
					}
				}

				setState(645);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_COLLATE) {
					{
					setState(643);
					match(K_COLLATE);
					setState(644);
					collateName();
					}
				}

				}
				break;
			case K_MEDIUMTEXT:
				_localctx = new TypeMediumTextStmtContext(_localctx);
				enterOuterAlt(_localctx, 30);
				{
				setState(647);
				match(K_MEDIUMTEXT);
				setState(649);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_BINARY) {
					{
					setState(648);
					match(K_BINARY);
					}
				}

				setState(654);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_CHARACTER) {
					{
					setState(651);
					match(K_CHARACTER);
					setState(652);
					match(K_SET);
					setState(653);
					charsetName();
					}
				}

				setState(658);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_COLLATE) {
					{
					setState(656);
					match(K_COLLATE);
					setState(657);
					collateName();
					}
				}

				}
				break;
			case K_LONGTEXT:
				_localctx = new TypeLongTextStmtContext(_localctx);
				enterOuterAlt(_localctx, 31);
				{
				setState(660);
				match(K_LONGTEXT);
				setState(662);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_BINARY) {
					{
					setState(661);
					match(K_BINARY);
					}
				}

				setState(667);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_CHARACTER) {
					{
					setState(664);
					match(K_CHARACTER);
					setState(665);
					match(K_SET);
					setState(666);
					charsetName();
					}
				}

				setState(671);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_COLLATE) {
					{
					setState(669);
					match(K_COLLATE);
					setState(670);
					collateName();
					}
				}

				}
				break;
			case K_ENUM:
				_localctx = new TypeEnumStmtContext(_localctx);
				enterOuterAlt(_localctx, 32);
				{
				setState(673);
				match(K_ENUM);
				setState(674);
				match(LPAR);
				setState(680);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(675);
						stringItem();
						setState(676);
						match(COMMA);
						}
						} 
					}
					setState(682);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
				}
				setState(683);
				stringItem();
				setState(684);
				match(RPAR);
				setState(688);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_CHARACTER) {
					{
					setState(685);
					match(K_CHARACTER);
					setState(686);
					match(K_SET);
					setState(687);
					charsetName();
					}
				}

				setState(692);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_COLLATE) {
					{
					setState(690);
					match(K_COLLATE);
					setState(691);
					collateName();
					}
				}

				}
				break;
			case K_SET:
				_localctx = new TypeSetStmtContext(_localctx);
				enterOuterAlt(_localctx, 33);
				{
				setState(694);
				match(K_SET);
				setState(695);
				match(LPAR);
				setState(701);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(696);
						stringItem();
						setState(697);
						match(COMMA);
						}
						} 
					}
					setState(703);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
				}
				setState(704);
				stringItem();
				setState(705);
				match(RPAR);
				setState(709);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_CHARACTER) {
					{
					setState(706);
					match(K_CHARACTER);
					setState(707);
					match(K_SET);
					setState(708);
					charsetName();
					}
				}

				setState(713);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_COLLATE) {
					{
					setState(711);
					match(K_COLLATE);
					setState(712);
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

	@SuppressWarnings("CheckReturnValue")
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
			setState(717);
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

	@SuppressWarnings("CheckReturnValue")
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
			setState(719);
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

	@SuppressWarnings("CheckReturnValue")
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
			setState(721);
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

	@SuppressWarnings("CheckReturnValue")
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
			setState(729);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_RESTRICT:
				enterOuterAlt(_localctx, 1);
				{
				setState(723);
				match(K_RESTRICT);
				}
				break;
			case K_CASCADE:
				enterOuterAlt(_localctx, 2);
				{
				setState(724);
				match(K_CASCADE);
				}
				break;
			case K_SET:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(725);
				match(K_SET);
				setState(726);
				match(K_NULL);
				}
				}
				break;
			case K_NO:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(727);
				match(K_NO);
				setState(728);
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

	@SuppressWarnings("CheckReturnValue")
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
			setState(731);
			_la = _input.LA(1);
			if ( !(_la==BOOL || _la==K_NULL || ((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & 7L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
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
			setState(736);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 16780032L) != 0) || _la==NAME) {
				{
				{
				setState(733);
				option();
				}
				}
				setState(738);
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
			setState(743);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(739);
				match(NAME);
				setState(740);
				match(EQ);
				setState(741);
				match(NAME);
				}
				break;
			case K_DEFAULT:
			case K_CHARACTER:
			case K_COLLATE:
			case K_COMMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(742);
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

	@SuppressWarnings("CheckReturnValue")
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
			setState(753);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(745);
				match(ID);
				}
				break;
			case SINGLE_QUOTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(746);
				match(SINGLE_QUOTE);
				setState(747);
				match(NAME);
				setState(748);
				match(SINGLE_QUOTE);
				}
				break;
			case DOUBLE_QUOTE:
				enterOuterAlt(_localctx, 3);
				{
				setState(749);
				match(DOUBLE_QUOTE);
				setState(750);
				match(NAME);
				setState(751);
				match(DOUBLE_QUOTE);
				}
				break;
			case NAME:
				enterOuterAlt(_localctx, 4);
				{
				setState(752);
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
		"\u0004\u0001Z\u02f4\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0001\u0000\u0005\u0000"+
		"P\b\u0000\n\u0000\f\u0000S\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001h\b\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002n\b\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003w\b\u0003\u0001\u0003\u0001\u0003\u0005\u0003"+
		"{\b\u0003\n\u0003\f\u0003~\t\u0003\u0001\u0004\u0003\u0004\u0081\b\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u0086\b\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004\u008a\b\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"\u008e\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"\u0094\b\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0005\u0006\u009c\b\u0006\n\u0006\f\u0006\u009f\t\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0005\u0007\u00a4\b\u0007\n\u0007\f\u0007"+
		"\u00a7\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007"+
		"\u00ad\b\u0007\n\u0007\f\u0007\u00b0\t\u0007\u0001\u0007\u0003\u0007\u00b3"+
		"\b\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0003"+
		"\n\u00bc\b\n\u0001\n\u0001\n\u0001\n\u0003\n\u00c1\b\n\u0001\n\u0001\n"+
		"\u0001\n\u0005\n\u00c6\b\n\n\n\f\n\u00c9\t\n\u0001\n\u0003\n\u00cc\b\n"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0003\f\u00d2\b\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0003\f\u00d8\b\f\u0001\f\u0001\f\u0001\f\u0003\f\u00dd"+
		"\b\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0005\u000e\u00e7\b\u000e\n\u000e\f\u000e\u00ea\t\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0003\u000f\u00f3\b\u000f\u0003\u000f\u00f5\b\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u00fd"+
		"\b\u000f\n\u000f\f\u000f\u0100\t\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0003\u000f\u0107\b\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0005\u000f\u010d\b\u000f\n\u000f\f\u000f\u0110"+
		"\t\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0003\u000f\u0118\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0005\u000f\u011e\b\u000f\n\u000f\f\u000f\u0121\t\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0128\b\u000f"+
		"\u0003\u000f\u012a\b\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u012e\b"+
		"\u000f\u0001\u000f\u0003\u000f\u0131\b\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0005\u000f\u0137\b\u000f\n\u000f\f\u000f\u013a\t\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f"+
		"\u0141\b\u000f\u0003\u000f\u0143\b\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0003\u000f\u0148\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0005\u000f\u014e\b\u000f\n\u000f\f\u000f\u0151\t\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0157\b\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0003\u0013\u0162\b\u0013\u0001\u0013\u0001\u0013"+
		"\u0003\u0013\u0166\b\u0013\u0001\u0013\u0003\u0013\u0169\b\u0013\u0001"+
		"\u0013\u0001\u0013\u0003\u0013\u016d\b\u0013\u0001\u0013\u0003\u0013\u0170"+
		"\b\u0013\u0001\u0013\u0003\u0013\u0173\b\u0013\u0001\u0013\u0001\u0013"+
		"\u0003\u0013\u0177\b\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018"+
		"\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0005\u0019\u018a\b\u0019\n\u0019\f\u0019\u018d\t\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u0194"+
		"\b\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u0199\b\u0019"+
		"\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c"+
		"\u0001\u001d\u0001\u001d\u0003\u001d\u01a3\b\u001d\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0003\u001e\u01a9\b\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0003\u001e\u01af\b\u001e\u0001\u001e\u0003\u001e"+
		"\u01b2\b\u001e\u0001\u001e\u0003\u001e\u01b5\b\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u01bb\b\u001e\u0001\u001e\u0003"+
		"\u001e\u01be\b\u001e\u0001\u001e\u0003\u001e\u01c1\b\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u01c7\b\u001e\u0001\u001e"+
		"\u0003\u001e\u01ca\b\u001e\u0001\u001e\u0003\u001e\u01cd\b\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u01d3\b\u001e\u0001"+
		"\u001e\u0003\u001e\u01d6\b\u001e\u0001\u001e\u0003\u001e\u01d9\b\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u01df\b\u001e"+
		"\u0001\u001e\u0003\u001e\u01e2\b\u001e\u0001\u001e\u0003\u001e\u01e5\b"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u01eb"+
		"\b\u001e\u0001\u001e\u0003\u001e\u01ee\b\u001e\u0001\u001e\u0003\u001e"+
		"\u01f1\b\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0003\u001e\u01f9\b\u001e\u0001\u001e\u0003\u001e\u01fc\b"+
		"\u001e\u0001\u001e\u0003\u001e\u01ff\b\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u0207\b\u001e\u0001"+
		"\u001e\u0003\u001e\u020a\b\u001e\u0001\u001e\u0003\u001e\u020d\b\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0003\u001e\u0215\b\u001e\u0001\u001e\u0003\u001e\u0218\b\u001e\u0001"+
		"\u001e\u0003\u001e\u021b\b\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0003\u001e\u0222\b\u001e\u0001\u001e\u0003\u001e\u0225"+
		"\b\u001e\u0001\u001e\u0003\u001e\u0228\b\u001e\u0001\u001e\u0003\u001e"+
		"\u022b\b\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0003\u001e\u0232\b\u001e\u0001\u001e\u0003\u001e\u0235\b\u001e\u0001"+
		"\u001e\u0003\u001e\u0238\b\u001e\u0001\u001e\u0003\u001e\u023b\b\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u0247\b\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u024c\b\u001e\u0001\u001e"+
		"\u0001\u001e\u0003\u001e\u0250\b\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u0259\b\u001e"+
		"\u0001\u001e\u0001\u001e\u0003\u001e\u025d\b\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0003\u001e\u0263\b\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u0270\b\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0003\u001e\u0275\b\u001e\u0001\u001e\u0001\u001e"+
		"\u0003\u001e\u0279\b\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u027d\b"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u0282\b\u001e\u0001"+
		"\u001e\u0001\u001e\u0003\u001e\u0286\b\u001e\u0001\u001e\u0001\u001e\u0003"+
		"\u001e\u028a\b\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u028f"+
		"\b\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u0293\b\u001e\u0001\u001e"+
		"\u0001\u001e\u0003\u001e\u0297\b\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0003\u001e\u029c\b\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u02a0\b"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0005"+
		"\u001e\u02a7\b\u001e\n\u001e\f\u001e\u02aa\t\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u02b1\b\u001e\u0001\u001e"+
		"\u0001\u001e\u0003\u001e\u02b5\b\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0005\u001e\u02bc\b\u001e\n\u001e\f\u001e\u02bf"+
		"\t\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003"+
		"\u001e\u02c6\b\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u02ca\b\u001e"+
		"\u0003\u001e\u02cc\b\u001e\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001"+
		"!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u02da"+
		"\b\"\u0001#\u0001#\u0001$\u0005$\u02df\b$\n$\f$\u02e2\t$\u0001%\u0001"+
		"%\u0001%\u0001%\u0003%\u02e8\b%\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0003&\u02f2\b&\u0001&\u0000\u0000\'\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&(*,.02468:<>@BDFHJL\u0000\u0006\u0001\u0000\u0003\u0004\u0001\u0000"+
		"\u000f\u0010\u0001\u0000\u0013\u0014\u0001\u0000\u001f \u0001\u000001"+
		"\u0003\u0000\u0001\u0001\u001a\u001aUW\u036e\u0000Q\u0001\u0000\u0000"+
		"\u0000\u0002g\u0001\u0000\u0000\u0000\u0004i\u0001\u0000\u0000\u0000\u0006"+
		"q\u0001\u0000\u0000\u0000\b\u0093\u0001\u0000\u0000\u0000\n\u0095\u0001"+
		"\u0000\u0000\u0000\f\u0097\u0001\u0000\u0000\u0000\u000e\u00a5\u0001\u0000"+
		"\u0000\u0000\u0010\u00b4\u0001\u0000\u0000\u0000\u0012\u00b6\u0001\u0000"+
		"\u0000\u0000\u0014\u00b9\u0001\u0000\u0000\u0000\u0016\u00cd\u0001\u0000"+
		"\u0000\u0000\u0018\u00cf\u0001\u0000\u0000\u0000\u001a\u00e1\u0001\u0000"+
		"\u0000\u0000\u001c\u00e8\u0001\u0000\u0000\u0000\u001e\u0156\u0001\u0000"+
		"\u0000\u0000 \u0158\u0001\u0000\u0000\u0000\"\u015a\u0001\u0000\u0000"+
		"\u0000$\u015c\u0001\u0000\u0000\u0000&\u015e\u0001\u0000\u0000\u0000("+
		"\u0178\u0001\u0000\u0000\u0000*\u017a\u0001\u0000\u0000\u0000,\u017c\u0001"+
		"\u0000\u0000\u0000.\u017e\u0001\u0000\u0000\u00000\u0181\u0001\u0000\u0000"+
		"\u00002\u0183\u0001\u0000\u0000\u00004\u019a\u0001\u0000\u0000\u00006"+
		"\u019c\u0001\u0000\u0000\u00008\u019e\u0001\u0000\u0000\u0000:\u01a0\u0001"+
		"\u0000\u0000\u0000<\u02cb\u0001\u0000\u0000\u0000>\u02cd\u0001\u0000\u0000"+
		"\u0000@\u02cf\u0001\u0000\u0000\u0000B\u02d1\u0001\u0000\u0000\u0000D"+
		"\u02d9\u0001\u0000\u0000\u0000F\u02db\u0001\u0000\u0000\u0000H\u02e0\u0001"+
		"\u0000\u0000\u0000J\u02e7\u0001\u0000\u0000\u0000L\u02f1\u0001\u0000\u0000"+
		"\u0000NP\u0003\u0002\u0001\u0000ON\u0001\u0000\u0000\u0000PS\u0001\u0000"+
		"\u0000\u0000QO\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000R\u0001"+
		"\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000TU\u0003\u0006\u0003"+
		"\u0000UV\u0005P\u0000\u0000Vh\u0001\u0000\u0000\u0000WX\u0003\u0004\u0002"+
		"\u0000XY\u0005P\u0000\u0000Yh\u0001\u0000\u0000\u0000Z[\u0003\u0018\f"+
		"\u0000[\\\u0005P\u0000\u0000\\h\u0001\u0000\u0000\u0000]^\u0003\u0014"+
		"\n\u0000^_\u0005P\u0000\u0000_h\u0001\u0000\u0000\u0000`a\u0003\u0012"+
		"\t\u0000ab\u0005P\u0000\u0000bh\u0001\u0000\u0000\u0000cd\u0003\f\u0006"+
		"\u0000de\u0005P\u0000\u0000eh\u0001\u0000\u0000\u0000fh\u0005P\u0000\u0000"+
		"gT\u0001\u0000\u0000\u0000gW\u0001\u0000\u0000\u0000gZ\u0001\u0000\u0000"+
		"\u0000g]\u0001\u0000\u0000\u0000g`\u0001\u0000\u0000\u0000gc\u0001\u0000"+
		"\u0000\u0000gf\u0001\u0000\u0000\u0000h\u0003\u0001\u0000\u0000\u0000"+
		"ij\u0005\u0002\u0000\u0000jm\u0007\u0000\u0000\u0000kl\u0005\u0005\u0000"+
		"\u0000ln\u0005\u0006\u0000\u0000mk\u0001\u0000\u0000\u0000mn\u0001\u0000"+
		"\u0000\u0000no\u0001\u0000\u0000\u0000op\u0003L&\u0000p\u0005\u0001\u0000"+
		"\u0000\u0000qr\u0005F\u0000\u0000rv\u0007\u0000\u0000\u0000st\u0005\u0005"+
		"\u0000\u0000tu\u0005\u0007\u0000\u0000uw\u0005\u0006\u0000\u0000vs\u0001"+
		"\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000"+
		"x|\u0003L&\u0000y{\u0003\b\u0004\u0000zy\u0001\u0000\u0000\u0000{~\u0001"+
		"\u0000\u0000\u0000|z\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000"+
		"}\u0007\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000\u0000\u007f\u0081"+
		"\u0005\b\u0000\u0000\u0080\u007f\u0001\u0000\u0000\u0000\u0080\u0081\u0001"+
		"\u0000\u0000\u0000\u0081\u0082\u0001\u0000\u0000\u0000\u0082\u0083\u0005"+
		"\t\u0000\u0000\u0083\u0085\u0005\n\u0000\u0000\u0084\u0086\u0005J\u0000"+
		"\u0000\u0085\u0084\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000"+
		"\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087\u0094\u0003@ \u0000\u0088"+
		"\u008a\u0005\b\u0000\u0000\u0089\u0088\u0001\u0000\u0000\u0000\u0089\u008a"+
		"\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u008d"+
		"\u0005\u000b\u0000\u0000\u008c\u008e\u0005J\u0000\u0000\u008d\u008c\u0001"+
		"\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u008f\u0001"+
		"\u0000\u0000\u0000\u008f\u0094\u0003B!\u0000\u0090\u0091\u0005\u0018\u0000"+
		"\u0000\u0091\u0092\u0005J\u0000\u0000\u0092\u0094\u0003\n\u0005\u0000"+
		"\u0093\u0080\u0001\u0000\u0000\u0000\u0093\u0089\u0001\u0000\u0000\u0000"+
		"\u0093\u0090\u0001\u0000\u0000\u0000\u0094\t\u0001\u0000\u0000\u0000\u0095"+
		"\u0096\u0005W\u0000\u0000\u0096\u000b\u0001\u0000\u0000\u0000\u0097\u009d"+
		"\u0005\n\u0000\u0000\u0098\u0099\u0003\u000e\u0007\u0000\u0099\u009a\u0005"+
		"O\u0000\u0000\u009a\u009c\u0001\u0000\u0000\u0000\u009b\u0098\u0001\u0000"+
		"\u0000\u0000\u009c\u009f\u0001\u0000\u0000\u0000\u009d\u009b\u0001\u0000"+
		"\u0000\u0000\u009d\u009e\u0001\u0000\u0000\u0000\u009e\u00a0\u0001\u0000"+
		"\u0000\u0000\u009f\u009d\u0001\u0000\u0000\u0000\u00a0\u00a1\u0003\u000e"+
		"\u0007\u0000\u00a1\r\u0001\u0000\u0000\u0000\u00a2\u00a4\u0005N\u0000"+
		"\u0000\u00a3\u00a2\u0001\u0000\u0000\u0000\u00a4\u00a7\u0001\u0000\u0000"+
		"\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000"+
		"\u0000\u00a6\u00a8\u0001\u0000\u0000\u0000\u00a7\u00a5\u0001\u0000\u0000"+
		"\u0000\u00a8\u00a9\u0005T\u0000\u0000\u00a9\u00b2\u0005J\u0000\u0000\u00aa"+
		"\u00b3\u0003\u0010\b\u0000\u00ab\u00ad\u0005N\u0000\u0000\u00ac\u00ab"+
		"\u0001\u0000\u0000\u0000\u00ad\u00b0\u0001\u0000\u0000\u0000\u00ae\u00ac"+
		"\u0001\u0000\u0000\u0000\u00ae\u00af\u0001\u0000\u0000\u0000\u00af\u00b1"+
		"\u0001\u0000\u0000\u0000\u00b0\u00ae\u0001\u0000\u0000\u0000\u00b1\u00b3"+
		"\u0005T\u0000\u0000\u00b2\u00aa\u0001\u0000\u0000\u0000\u00b2\u00ae\u0001"+
		"\u0000\u0000\u0000\u00b3\u000f\u0001\u0000\u0000\u0000\u00b4\u00b5\u0003"+
		"F#\u0000\u00b5\u0011\u0001\u0000\u0000\u0000\u00b6\u00b7\u0005\f\u0000"+
		"\u0000\u00b7\u00b8\u0003L&\u0000\u00b8\u0013\u0001\u0000\u0000\u0000\u00b9"+
		"\u00bb\u0005\u0002\u0000\u0000\u00ba\u00bc\u0005\r\u0000\u0000\u00bb\u00ba"+
		"\u0001\u0000\u0000\u0000\u00bb\u00bc\u0001\u0000\u0000\u0000\u00bc\u00bd"+
		"\u0001\u0000\u0000\u0000\u00bd\u00c0\u0005\u000e\u0000\u0000\u00be\u00bf"+
		"\u0005\u0005\u0000\u0000\u00bf\u00c1\u0005\u0006\u0000\u0000\u00c0\u00be"+
		"\u0001\u0000\u0000\u0000\u00c0\u00c1\u0001\u0000\u0000\u0000\u00c1\u00c2"+
		"\u0001\u0000\u0000\u0000\u00c2\u00c7\u0003\u0016\u000b\u0000\u00c3\u00c4"+
		"\u0005O\u0000\u0000\u00c4\u00c6\u0003\u0016\u000b\u0000\u00c5\u00c3\u0001"+
		"\u0000\u0000\u0000\u00c6\u00c9\u0001\u0000\u0000\u0000\u00c7\u00c5\u0001"+
		"\u0000\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8\u00cb\u0001"+
		"\u0000\u0000\u0000\u00c9\u00c7\u0001\u0000\u0000\u0000\u00ca\u00cc\u0007"+
		"\u0001\u0000\u0000\u00cb\u00ca\u0001\u0000\u0000\u0000\u00cb\u00cc\u0001"+
		"\u0000\u0000\u0000\u00cc\u0015\u0001\u0000\u0000\u0000\u00cd\u00ce\u0003"+
		"L&\u0000\u00ce\u0017\u0001\u0000\u0000\u0000\u00cf\u00d1\u0005F\u0000"+
		"\u0000\u00d0\u00d2\u0005\r\u0000\u0000\u00d1\u00d0\u0001\u0000\u0000\u0000"+
		"\u00d1\u00d2\u0001\u0000\u0000\u0000\u00d2\u00d3\u0001\u0000\u0000\u0000"+
		"\u00d3\u00d7\u0005\u000e\u0000\u0000\u00d4\u00d5\u0005\u0005\u0000\u0000"+
		"\u00d5\u00d6\u0005\u0007\u0000\u0000\u00d6\u00d8\u0005\u0006\u0000\u0000"+
		"\u00d7\u00d4\u0001\u0000\u0000\u0000\u00d7\u00d8\u0001\u0000\u0000\u0000"+
		"\u00d8\u00d9\u0001\u0000\u0000\u0000\u00d9\u00da\u0003\u001a\r\u0000\u00da"+
		"\u00dc\u0005Q\u0000\u0000\u00db\u00dd\u0003\u001c\u000e\u0000\u00dc\u00db"+
		"\u0001\u0000\u0000\u0000\u00dc\u00dd\u0001\u0000\u0000\u0000\u00dd\u00de"+
		"\u0001\u0000\u0000\u0000\u00de\u00df\u0005R\u0000\u0000\u00df\u00e0\u0003"+
		"H$\u0000\u00e0\u0019\u0001\u0000\u0000\u0000\u00e1\u00e2\u0003L&\u0000"+
		"\u00e2\u001b\u0001\u0000\u0000\u0000\u00e3\u00e4\u0003\u001e\u000f\u0000"+
		"\u00e4\u00e5\u0005O\u0000\u0000\u00e5\u00e7\u0001\u0000\u0000\u0000\u00e6"+
		"\u00e3\u0001\u0000\u0000\u0000\u00e7\u00ea\u0001\u0000\u0000\u0000\u00e8"+
		"\u00e6\u0001\u0000\u0000\u0000\u00e8\u00e9\u0001\u0000\u0000\u0000\u00e9"+
		"\u00eb\u0001\u0000\u0000\u0000\u00ea\u00e8\u0001\u0000\u0000\u0000\u00eb"+
		"\u00ec\u0003\u001e\u000f\u0000\u00ec\u001d\u0001\u0000\u0000\u0000\u00ed"+
		"\u00ee\u0003 \u0010\u0000\u00ee\u00ef\u0003&\u0013\u0000\u00ef\u0157\u0001"+
		"\u0000\u0000\u0000\u00f0\u00f2\u0005\u0011\u0000\u0000\u00f1\u00f3\u0003"+
		"\"\u0011\u0000\u00f2\u00f1\u0001\u0000\u0000\u0000\u00f2\u00f3\u0001\u0000"+
		"\u0000\u0000\u00f3\u00f5\u0001\u0000\u0000\u0000\u00f4\u00f0\u0001\u0000"+
		"\u0000\u0000\u00f4\u00f5\u0001\u0000\u0000\u0000\u00f5\u00f6\u0001\u0000"+
		"\u0000\u0000\u00f6\u00f7\u0005\u0012\u0000\u0000\u00f7\u00f8\u0005\u0013"+
		"\u0000\u0000\u00f8\u00fe\u0005Q\u0000\u0000\u00f9\u00fa\u0003:\u001d\u0000"+
		"\u00fa\u00fb\u0005O\u0000\u0000\u00fb\u00fd\u0001\u0000\u0000\u0000\u00fc"+
		"\u00f9\u0001\u0000\u0000\u0000\u00fd\u0100\u0001\u0000\u0000\u0000\u00fe"+
		"\u00fc\u0001\u0000\u0000\u0000\u00fe\u00ff\u0001\u0000\u0000\u0000\u00ff"+
		"\u0101\u0001\u0000\u0000\u0000\u0100\u00fe\u0001\u0000\u0000\u0000\u0101"+
		"\u0102\u0003:\u001d\u0000\u0102\u0103\u0005R\u0000\u0000\u0103\u0157\u0001"+
		"\u0000\u0000\u0000\u0104\u0106\u0007\u0002\u0000\u0000\u0105\u0107\u0003"+
		"\"\u0011\u0000\u0106\u0105\u0001\u0000\u0000\u0000\u0106\u0107\u0001\u0000"+
		"\u0000\u0000\u0107\u0108\u0001\u0000\u0000\u0000\u0108\u010e\u0005Q\u0000"+
		"\u0000\u0109\u010a\u0003:\u001d\u0000\u010a\u010b\u0005O\u0000\u0000\u010b"+
		"\u010d\u0001\u0000\u0000\u0000\u010c\u0109\u0001\u0000\u0000\u0000\u010d"+
		"\u0110\u0001\u0000\u0000\u0000\u010e\u010c\u0001\u0000\u0000\u0000\u010e"+
		"\u010f\u0001\u0000\u0000\u0000\u010f\u0111\u0001\u0000\u0000\u0000\u0110"+
		"\u010e\u0001\u0000\u0000\u0000\u0111\u0112\u0003:\u001d\u0000\u0112\u0113"+
		"\u0005R\u0000\u0000\u0113\u0157\u0001\u0000\u0000\u0000\u0114\u0115\u0005"+
		"\u0016\u0000\u0000\u0115\u0117\u0007\u0002\u0000\u0000\u0116\u0118\u0003"+
		"\"\u0011\u0000\u0117\u0116\u0001\u0000\u0000\u0000\u0117\u0118\u0001\u0000"+
		"\u0000\u0000\u0118\u0119\u0001\u0000\u0000\u0000\u0119\u011f\u0005Q\u0000"+
		"\u0000\u011a\u011b\u0003:\u001d\u0000\u011b\u011c\u0005O\u0000\u0000\u011c"+
		"\u011e\u0001\u0000\u0000\u0000\u011d\u011a\u0001\u0000\u0000\u0000\u011e"+
		"\u0121\u0001\u0000\u0000\u0000\u011f\u011d\u0001\u0000\u0000\u0000\u011f"+
		"\u0120\u0001\u0000\u0000\u0000\u0120\u0122\u0001\u0000\u0000\u0000\u0121"+
		"\u011f\u0001\u0000\u0000\u0000\u0122\u0123\u0003:\u001d\u0000\u0123\u0124"+
		"\u0005R\u0000\u0000\u0124\u0157\u0001\u0000\u0000\u0000\u0125\u0127\u0005"+
		"\u0011\u0000\u0000\u0126\u0128\u0003\"\u0011\u0000\u0127\u0126\u0001\u0000"+
		"\u0000\u0000\u0127\u0128\u0001\u0000\u0000\u0000\u0128\u012a\u0001\u0000"+
		"\u0000\u0000\u0129\u0125\u0001\u0000\u0000\u0000\u0129\u012a\u0001\u0000"+
		"\u0000\u0000\u012a\u012b\u0001\u0000\u0000\u0000\u012b\u012d\u0005\u0015"+
		"\u0000\u0000\u012c\u012e\u0007\u0002\u0000\u0000\u012d\u012c\u0001\u0000"+
		"\u0000\u0000\u012d\u012e\u0001\u0000\u0000\u0000\u012e\u0130\u0001\u0000"+
		"\u0000\u0000\u012f\u0131\u0003$\u0012\u0000\u0130\u012f\u0001\u0000\u0000"+
		"\u0000\u0130\u0131\u0001\u0000\u0000\u0000\u0131\u0132\u0001\u0000\u0000"+
		"\u0000\u0132\u0138\u0005Q\u0000\u0000\u0133\u0134\u0003:\u001d\u0000\u0134"+
		"\u0135\u0005O\u0000\u0000\u0135\u0137\u0001\u0000\u0000\u0000\u0136\u0133"+
		"\u0001\u0000\u0000\u0000\u0137\u013a\u0001\u0000\u0000\u0000\u0138\u0136"+
		"\u0001\u0000\u0000\u0000\u0138\u0139\u0001\u0000\u0000\u0000\u0139\u013b"+
		"\u0001\u0000\u0000\u0000\u013a\u0138\u0001\u0000\u0000\u0000\u013b\u013c"+
		"\u0003:\u001d\u0000\u013c\u013d\u0005R\u0000\u0000\u013d\u0157\u0001\u0000"+
		"\u0000\u0000\u013e\u0140\u0005\u0011\u0000\u0000\u013f\u0141\u0003\"\u0011"+
		"\u0000\u0140\u013f\u0001\u0000\u0000\u0000\u0140\u0141\u0001\u0000\u0000"+
		"\u0000\u0141\u0143\u0001\u0000\u0000\u0000\u0142\u013e\u0001\u0000\u0000"+
		"\u0000\u0142\u0143\u0001\u0000\u0000\u0000\u0143\u0144\u0001\u0000\u0000"+
		"\u0000\u0144\u0145\u0005\u0017\u0000\u0000\u0145\u0147\u0005\u0013\u0000"+
		"\u0000\u0146\u0148\u0003$\u0012\u0000\u0147\u0146\u0001\u0000\u0000\u0000"+
		"\u0147\u0148\u0001\u0000\u0000\u0000\u0148\u0149\u0001\u0000\u0000\u0000"+
		"\u0149\u014f\u0005Q\u0000\u0000\u014a\u014b\u0003:\u001d\u0000\u014b\u014c"+
		"\u0005O\u0000\u0000\u014c\u014e\u0001\u0000\u0000\u0000\u014d\u014a\u0001"+
		"\u0000\u0000\u0000\u014e\u0151\u0001\u0000\u0000\u0000\u014f\u014d\u0001"+
		"\u0000\u0000\u0000\u014f\u0150\u0001\u0000\u0000\u0000\u0150\u0152\u0001"+
		"\u0000\u0000\u0000\u0151\u014f\u0001\u0000\u0000\u0000\u0152\u0153\u0003"+
		":\u001d\u0000\u0153\u0154\u0005R\u0000\u0000\u0154\u0155\u00032\u0019"+
		"\u0000\u0155\u0157\u0001\u0000\u0000\u0000\u0156\u00ed\u0001\u0000\u0000"+
		"\u0000\u0156\u00f4\u0001\u0000\u0000\u0000\u0156\u0104\u0001\u0000\u0000"+
		"\u0000\u0156\u0114\u0001\u0000\u0000\u0000\u0156\u0129\u0001\u0000\u0000"+
		"\u0000\u0156\u0142\u0001\u0000\u0000\u0000\u0157\u001f\u0001\u0000\u0000"+
		"\u0000\u0158\u0159\u0003L&\u0000\u0159!\u0001\u0000\u0000\u0000\u015a"+
		"\u015b\u0003L&\u0000\u015b#\u0001\u0000\u0000\u0000\u015c\u015d\u0003"+
		"L&\u0000\u015d%\u0001\u0000\u0000\u0000\u015e\u0161\u0003<\u001e\u0000"+
		"\u015f\u0162\u0003,\u0016\u0000\u0160\u0162\u0003.\u0017\u0000\u0161\u015f"+
		"\u0001\u0000\u0000\u0000\u0161\u0160\u0001\u0000\u0000\u0000\u0161\u0162"+
		"\u0001\u0000\u0000\u0000\u0162\u0165\u0001\u0000\u0000\u0000\u0163\u0164"+
		"\u0005\b\u0000\u0000\u0164\u0166\u0003*\u0015\u0000\u0165\u0163\u0001"+
		"\u0000\u0000\u0000\u0165\u0166\u0001\u0000\u0000\u0000\u0166\u0168\u0001"+
		"\u0000\u0000\u0000\u0167\u0169\u0003(\u0014\u0000\u0168\u0167\u0001\u0000"+
		"\u0000\u0000\u0168\u0169\u0001\u0000\u0000\u0000\u0169\u0172\u0001\u0000"+
		"\u0000\u0000\u016a\u016c\u0005\u0015\u0000\u0000\u016b\u016d\u0005\u0013"+
		"\u0000\u0000\u016c\u016b\u0001\u0000\u0000\u0000\u016c\u016d\u0001\u0000"+
		"\u0000\u0000\u016d\u0173\u0001\u0000\u0000\u0000\u016e\u0170\u0005\u0012"+
		"\u0000\u0000\u016f\u016e\u0001\u0000\u0000\u0000\u016f\u0170\u0001\u0000"+
		"\u0000\u0000\u0170\u0171\u0001\u0000\u0000\u0000\u0171\u0173\u0005\u0013"+
		"\u0000\u0000\u0172\u016a\u0001\u0000\u0000\u0000\u0172\u016f\u0001\u0000"+
		"\u0000\u0000\u0172\u0173\u0001\u0000\u0000\u0000\u0173\u0176\u0001\u0000"+
		"\u0000\u0000\u0174\u0175\u0005\u0018\u0000\u0000\u0175\u0177\u00030\u0018"+
		"\u0000\u0176\u0174\u0001\u0000\u0000\u0000\u0176\u0177\u0001\u0000\u0000"+
		"\u0000\u0177\'\u0001\u0000\u0000\u0000\u0178\u0179\u0005\u0019\u0000\u0000"+
		"\u0179)\u0001\u0000\u0000\u0000\u017a\u017b\u0003F#\u0000\u017b+\u0001"+
		"\u0000\u0000\u0000\u017c\u017d\u0005\u001a\u0000\u0000\u017d-\u0001\u0000"+
		"\u0000\u0000\u017e\u017f\u0005\u0007\u0000\u0000\u017f\u0180\u0005\u001a"+
		"\u0000\u0000\u0180/\u0001\u0000\u0000\u0000\u0181\u0182\u0005W\u0000\u0000"+
		"\u01821\u0001\u0000\u0000\u0000\u0183\u0184\u0005\u001b\u0000\u0000\u0184"+
		"\u0185\u00038\u001c\u0000\u0185\u018b\u0005Q\u0000\u0000\u0186\u0187\u0003"+
		":\u001d\u0000\u0187\u0188\u0005O\u0000\u0000\u0188\u018a\u0001\u0000\u0000"+
		"\u0000\u0189\u0186\u0001\u0000\u0000\u0000\u018a\u018d\u0001\u0000\u0000"+
		"\u0000\u018b\u0189\u0001\u0000\u0000\u0000\u018b\u018c\u0001\u0000\u0000"+
		"\u0000\u018c\u018e\u0001\u0000\u0000\u0000\u018d\u018b\u0001\u0000\u0000"+
		"\u0000\u018e\u018f\u0003:\u001d\u0000\u018f\u0193\u0005R\u0000\u0000\u0190"+
		"\u0191\u0005\u001c\u0000\u0000\u0191\u0192\u0005\u001d\u0000\u0000\u0192"+
		"\u0194\u00034\u001a\u0000\u0193\u0190\u0001\u0000\u0000\u0000\u0193\u0194"+
		"\u0001\u0000\u0000\u0000\u0194\u0198\u0001\u0000\u0000\u0000\u0195\u0196"+
		"\u0005\u001c\u0000\u0000\u0196\u0197\u0005\u001e\u0000\u0000\u0197\u0199"+
		"\u00036\u001b\u0000\u0198\u0195\u0001\u0000\u0000\u0000\u0198\u0199\u0001"+
		"\u0000\u0000\u0000\u01993\u0001\u0000\u0000\u0000\u019a\u019b\u0003D\""+
		"\u0000\u019b5\u0001\u0000\u0000\u0000\u019c\u019d\u0003D\"\u0000\u019d"+
		"7\u0001\u0000\u0000\u0000\u019e\u019f\u0003L&\u0000\u019f9\u0001\u0000"+
		"\u0000\u0000\u01a0\u01a2\u0003L&\u0000\u01a1\u01a3\u0007\u0003\u0000\u0000"+
		"\u01a2\u01a1\u0001\u0000\u0000\u0000\u01a2\u01a3\u0001\u0000\u0000\u0000"+
		"\u01a3;\u0001\u0000\u0000\u0000\u01a4\u01a8\u0005!\u0000\u0000\u01a5\u01a6"+
		"\u0005Q\u0000\u0000\u01a6\u01a7\u0005U\u0000\u0000\u01a7\u01a9\u0005R"+
		"\u0000\u0000\u01a8\u01a5\u0001\u0000\u0000\u0000\u01a8\u01a9\u0001\u0000"+
		"\u0000\u0000\u01a9\u02cc\u0001\u0000\u0000\u0000\u01aa\u01ae\u0005\"\u0000"+
		"\u0000\u01ab\u01ac\u0005Q\u0000\u0000\u01ac\u01ad\u0005U\u0000\u0000\u01ad"+
		"\u01af\u0005R\u0000\u0000\u01ae\u01ab\u0001\u0000\u0000\u0000\u01ae\u01af"+
		"\u0001\u0000\u0000\u0000\u01af\u01b1\u0001\u0000\u0000\u0000\u01b0\u01b2"+
		"\u0005#\u0000\u0000\u01b1\u01b0\u0001\u0000\u0000\u0000\u01b1\u01b2\u0001"+
		"\u0000\u0000\u0000\u01b2\u01b4\u0001\u0000\u0000\u0000\u01b3\u01b5\u0005"+
		"%\u0000\u0000\u01b4\u01b3\u0001\u0000\u0000\u0000\u01b4\u01b5\u0001\u0000"+
		"\u0000\u0000\u01b5\u02cc\u0001\u0000\u0000\u0000\u01b6\u01ba\u0005&\u0000"+
		"\u0000\u01b7\u01b8\u0005Q\u0000\u0000\u01b8\u01b9\u0005U\u0000\u0000\u01b9"+
		"\u01bb\u0005R\u0000\u0000\u01ba\u01b7\u0001\u0000\u0000\u0000\u01ba\u01bb"+
		"\u0001\u0000\u0000\u0000\u01bb\u01bd\u0001\u0000\u0000\u0000\u01bc\u01be"+
		"\u0005#\u0000\u0000\u01bd\u01bc\u0001\u0000\u0000\u0000\u01bd\u01be\u0001"+
		"\u0000\u0000\u0000\u01be\u01c0\u0001\u0000\u0000\u0000\u01bf\u01c1\u0005"+
		"%\u0000\u0000\u01c0\u01bf\u0001\u0000\u0000\u0000\u01c0\u01c1\u0001\u0000"+
		"\u0000\u0000\u01c1\u02cc\u0001\u0000\u0000\u0000\u01c2\u01c6\u0005\'\u0000"+
		"\u0000\u01c3\u01c4\u0005Q\u0000\u0000\u01c4\u01c5\u0005U\u0000\u0000\u01c5"+
		"\u01c7\u0005R\u0000\u0000\u01c6\u01c3\u0001\u0000\u0000\u0000\u01c6\u01c7"+
		"\u0001\u0000\u0000\u0000\u01c7\u01c9\u0001\u0000\u0000\u0000\u01c8\u01ca"+
		"\u0005#\u0000\u0000\u01c9\u01c8\u0001\u0000\u0000\u0000\u01c9\u01ca\u0001"+
		"\u0000\u0000\u0000\u01ca\u01cc\u0001\u0000\u0000\u0000\u01cb\u01cd\u0005"+
		"%\u0000\u0000\u01cc\u01cb\u0001\u0000\u0000\u0000\u01cc\u01cd\u0001\u0000"+
		"\u0000\u0000\u01cd\u02cc\u0001\u0000\u0000\u0000\u01ce\u01d2\u0005(\u0000"+
		"\u0000\u01cf\u01d0\u0005Q\u0000\u0000\u01d0\u01d1\u0005U\u0000\u0000\u01d1"+
		"\u01d3\u0005R\u0000\u0000\u01d2\u01cf\u0001\u0000\u0000\u0000\u01d2\u01d3"+
		"\u0001\u0000\u0000\u0000\u01d3\u01d5\u0001\u0000\u0000\u0000\u01d4\u01d6"+
		"\u0005#\u0000\u0000\u01d5\u01d4\u0001\u0000\u0000\u0000\u01d5\u01d6\u0001"+
		"\u0000\u0000\u0000\u01d6\u01d8\u0001\u0000\u0000\u0000\u01d7\u01d9\u0005"+
		"%\u0000\u0000\u01d8\u01d7\u0001\u0000\u0000\u0000\u01d8\u01d9\u0001\u0000"+
		"\u0000\u0000\u01d9\u02cc\u0001\u0000\u0000\u0000\u01da\u01de\u0005)\u0000"+
		"\u0000\u01db\u01dc\u0005Q\u0000\u0000\u01dc\u01dd\u0005U\u0000\u0000\u01dd"+
		"\u01df\u0005R\u0000\u0000\u01de\u01db\u0001\u0000\u0000\u0000\u01de\u01df"+
		"\u0001\u0000\u0000\u0000\u01df\u01e1\u0001\u0000\u0000\u0000\u01e0\u01e2"+
		"\u0005#\u0000\u0000\u01e1\u01e0\u0001\u0000\u0000\u0000\u01e1\u01e2\u0001"+
		"\u0000\u0000\u0000\u01e2\u01e4\u0001\u0000\u0000\u0000\u01e3\u01e5\u0005"+
		"%\u0000\u0000\u01e4\u01e3\u0001\u0000\u0000\u0000\u01e4\u01e5\u0001\u0000"+
		"\u0000\u0000\u01e5\u02cc\u0001\u0000\u0000\u0000\u01e6\u01ea\u0005*\u0000"+
		"\u0000\u01e7\u01e8\u0005Q\u0000\u0000\u01e8\u01e9\u0005U\u0000\u0000\u01e9"+
		"\u01eb\u0005R\u0000\u0000\u01ea\u01e7\u0001\u0000\u0000\u0000\u01ea\u01eb"+
		"\u0001\u0000\u0000\u0000\u01eb\u01ed\u0001\u0000\u0000\u0000\u01ec\u01ee"+
		"\u0005#\u0000\u0000\u01ed\u01ec\u0001\u0000\u0000\u0000\u01ed\u01ee\u0001"+
		"\u0000\u0000\u0000\u01ee\u01f0\u0001\u0000\u0000\u0000\u01ef\u01f1\u0005"+
		"%\u0000\u0000\u01f0\u01ef\u0001\u0000\u0000\u0000\u01f0\u01f1\u0001\u0000"+
		"\u0000\u0000\u01f1\u02cc\u0001\u0000\u0000\u0000\u01f2\u01f8\u0005+\u0000"+
		"\u0000\u01f3\u01f4\u0005Q\u0000\u0000\u01f4\u01f5\u0005U\u0000\u0000\u01f5"+
		"\u01f6\u0005O\u0000\u0000\u01f6\u01f7\u0005U\u0000\u0000\u01f7\u01f9\u0005"+
		"R\u0000\u0000\u01f8\u01f3\u0001\u0000\u0000\u0000\u01f8\u01f9\u0001\u0000"+
		"\u0000\u0000\u01f9\u01fb\u0001\u0000\u0000\u0000\u01fa\u01fc\u0005#\u0000"+
		"\u0000\u01fb\u01fa\u0001\u0000\u0000\u0000\u01fb\u01fc\u0001\u0000\u0000"+
		"\u0000\u01fc\u01fe\u0001\u0000\u0000\u0000\u01fd\u01ff\u0005%\u0000\u0000"+
		"\u01fe\u01fd\u0001\u0000\u0000\u0000\u01fe\u01ff\u0001\u0000\u0000\u0000"+
		"\u01ff\u02cc\u0001\u0000\u0000\u0000\u0200\u0206\u0005,\u0000\u0000\u0201"+
		"\u0202\u0005Q\u0000\u0000\u0202\u0203\u0005U\u0000\u0000\u0203\u0204\u0005"+
		"O\u0000\u0000\u0204\u0205\u0005U\u0000\u0000\u0205\u0207\u0005R\u0000"+
		"\u0000\u0206\u0201\u0001\u0000\u0000\u0000\u0206\u0207\u0001\u0000\u0000"+
		"\u0000\u0207\u0209\u0001\u0000\u0000\u0000\u0208\u020a\u0005#\u0000\u0000"+
		"\u0209\u0208\u0001\u0000\u0000\u0000\u0209\u020a\u0001\u0000\u0000\u0000"+
		"\u020a\u020c\u0001\u0000\u0000\u0000\u020b\u020d\u0005%\u0000\u0000\u020c"+
		"\u020b\u0001\u0000\u0000\u0000\u020c\u020d\u0001\u0000\u0000\u0000\u020d"+
		"\u02cc\u0001\u0000\u0000\u0000\u020e\u0214\u0005-\u0000\u0000\u020f\u0210"+
		"\u0005Q\u0000\u0000\u0210\u0211\u0005U\u0000\u0000\u0211\u0212\u0005O"+
		"\u0000\u0000\u0212\u0213\u0005U\u0000\u0000\u0213\u0215\u0005R\u0000\u0000"+
		"\u0214\u020f\u0001\u0000\u0000\u0000\u0214\u0215\u0001\u0000\u0000\u0000"+
		"\u0215\u0217\u0001\u0000\u0000\u0000\u0216\u0218\u0005#\u0000\u0000\u0217"+
		"\u0216\u0001\u0000\u0000\u0000\u0217\u0218\u0001\u0000\u0000\u0000\u0218"+
		"\u021a\u0001\u0000\u0000\u0000\u0219\u021b\u0005%\u0000\u0000\u021a\u0219"+
		"\u0001\u0000\u0000\u0000\u021a\u021b\u0001\u0000\u0000\u0000\u021b\u02cc"+
		"\u0001\u0000\u0000\u0000\u021c\u0224\u0005.\u0000\u0000\u021d\u021e\u0005"+
		"Q\u0000\u0000\u021e\u0221\u0005U\u0000\u0000\u021f\u0220\u0005O\u0000"+
		"\u0000\u0220\u0222\u0005U\u0000\u0000\u0221\u021f\u0001\u0000\u0000\u0000"+
		"\u0221\u0222\u0001\u0000\u0000\u0000\u0222\u0223\u0001\u0000\u0000\u0000"+
		"\u0223\u0225\u0005R\u0000\u0000\u0224\u021d\u0001\u0000\u0000\u0000\u0224"+
		"\u0225\u0001\u0000\u0000\u0000\u0225\u0227\u0001\u0000\u0000\u0000\u0226"+
		"\u0228\u0005#\u0000\u0000\u0227\u0226\u0001\u0000\u0000\u0000\u0227\u0228"+
		"\u0001\u0000\u0000\u0000\u0228\u022a\u0001\u0000\u0000\u0000\u0229\u022b"+
		"\u0005%\u0000\u0000\u022a\u0229\u0001\u0000\u0000\u0000\u022a\u022b\u0001"+
		"\u0000\u0000\u0000\u022b\u02cc\u0001\u0000\u0000\u0000\u022c\u0234\u0005"+
		"/\u0000\u0000\u022d\u022e\u0005Q\u0000\u0000\u022e\u0231\u0005U\u0000"+
		"\u0000\u022f\u0230\u0005O\u0000\u0000\u0230\u0232\u0005U\u0000\u0000\u0231"+
		"\u022f\u0001\u0000\u0000\u0000\u0231\u0232\u0001\u0000\u0000\u0000\u0232"+
		"\u0233\u0001\u0000\u0000\u0000\u0233\u0235\u0005R\u0000\u0000\u0234\u022d"+
		"\u0001\u0000\u0000\u0000\u0234\u0235\u0001\u0000\u0000\u0000\u0235\u0237"+
		"\u0001\u0000\u0000\u0000\u0236\u0238\u0005#\u0000\u0000\u0237\u0236\u0001"+
		"\u0000\u0000\u0000\u0237\u0238\u0001\u0000\u0000\u0000\u0238\u023a\u0001"+
		"\u0000\u0000\u0000\u0239\u023b\u0005%\u0000\u0000\u023a\u0239\u0001\u0000"+
		"\u0000\u0000\u023a\u023b\u0001\u0000\u0000\u0000\u023b\u02cc\u0001\u0000"+
		"\u0000\u0000\u023c\u02cc\u0007\u0004\u0000\u0000\u023d\u02cc\u00052\u0000"+
		"\u0000\u023e\u02cc\u00053\u0000\u0000\u023f\u02cc\u00054\u0000\u0000\u0240"+
		"\u02cc\u00055\u0000\u0000\u0241\u02cc\u00056\u0000\u0000\u0242\u0246\u0005"+
		"7\u0000\u0000\u0243\u0244\u0005Q\u0000\u0000\u0244\u0245\u0005U\u0000"+
		"\u0000\u0245\u0247\u0005R\u0000\u0000\u0246\u0243\u0001\u0000\u0000\u0000"+
		"\u0246\u0247\u0001\u0000\u0000\u0000\u0247\u024b\u0001\u0000\u0000\u0000"+
		"\u0248\u0249\u0005\t\u0000\u0000\u0249\u024a\u0005\n\u0000\u0000\u024a"+
		"\u024c\u0003@ \u0000\u024b\u0248\u0001\u0000\u0000\u0000\u024b\u024c\u0001"+
		"\u0000\u0000\u0000\u024c\u024f\u0001\u0000\u0000\u0000\u024d\u024e\u0005"+
		"\u000b\u0000\u0000\u024e\u0250\u0003B!\u0000\u024f\u024d\u0001\u0000\u0000"+
		"\u0000\u024f\u0250\u0001\u0000\u0000\u0000\u0250\u02cc\u0001\u0000\u0000"+
		"\u0000\u0251\u0252\u00058\u0000\u0000\u0252\u0253\u0005Q\u0000\u0000\u0253"+
		"\u0254\u0005U\u0000\u0000\u0254\u0258\u0005R\u0000\u0000\u0255\u0256\u0005"+
		"\t\u0000\u0000\u0256\u0257\u0005\n\u0000\u0000\u0257\u0259\u0003@ \u0000"+
		"\u0258\u0255\u0001\u0000\u0000\u0000\u0258\u0259\u0001\u0000\u0000\u0000"+
		"\u0259\u025c\u0001\u0000\u0000\u0000\u025a\u025b\u0005\u000b\u0000\u0000"+
		"\u025b\u025d\u0003B!\u0000\u025c\u025a\u0001\u0000\u0000\u0000\u025c\u025d"+
		"\u0001\u0000\u0000\u0000\u025d\u02cc\u0001\u0000\u0000\u0000\u025e\u0262"+
		"\u0005$\u0000\u0000\u025f\u0260\u0005Q\u0000\u0000\u0260\u0261\u0005U"+
		"\u0000\u0000\u0261\u0263\u0005R\u0000\u0000\u0262\u025f\u0001\u0000\u0000"+
		"\u0000\u0262\u0263\u0001\u0000\u0000\u0000\u0263\u02cc\u0001\u0000\u0000"+
		"\u0000\u0264\u0265\u00059\u0000\u0000\u0265\u0266\u0005Q\u0000\u0000\u0266"+
		"\u0267\u0005U\u0000\u0000\u0267\u02cc\u0005R\u0000\u0000\u0268\u02cc\u0005"+
		":\u0000\u0000\u0269\u02cc\u0005;\u0000\u0000\u026a\u02cc\u0005<\u0000"+
		"\u0000\u026b\u02cc\u0005=\u0000\u0000\u026c\u02cc\u0005>\u0000\u0000\u026d"+
		"\u026f\u0005?\u0000\u0000\u026e\u0270\u0005$\u0000\u0000\u026f\u026e\u0001"+
		"\u0000\u0000\u0000\u026f\u0270\u0001\u0000\u0000\u0000\u0270\u0274\u0001"+
		"\u0000\u0000\u0000\u0271\u0272\u0005\t\u0000\u0000\u0272\u0273\u0005\n"+
		"\u0000\u0000\u0273\u0275\u0003@ \u0000\u0274\u0271\u0001\u0000\u0000\u0000"+
		"\u0274\u0275\u0001\u0000\u0000\u0000\u0275\u0278\u0001\u0000\u0000\u0000"+
		"\u0276\u0277\u0005\u000b\u0000\u0000\u0277\u0279\u0003B!\u0000\u0278\u0276"+
		"\u0001\u0000\u0000\u0000\u0278\u0279\u0001\u0000\u0000\u0000\u0279\u02cc"+
		"\u0001\u0000\u0000\u0000\u027a\u027c\u0005@\u0000\u0000\u027b\u027d\u0005"+
		"$\u0000\u0000\u027c\u027b\u0001\u0000\u0000\u0000\u027c\u027d\u0001\u0000"+
		"\u0000\u0000\u027d\u0281\u0001\u0000\u0000\u0000\u027e\u027f\u0005\t\u0000"+
		"\u0000\u027f\u0280\u0005\n\u0000\u0000\u0280\u0282\u0003@ \u0000\u0281"+
		"\u027e\u0001\u0000\u0000\u0000\u0281\u0282\u0001\u0000\u0000\u0000\u0282"+
		"\u0285\u0001\u0000\u0000\u0000\u0283\u0284\u0005\u000b\u0000\u0000\u0284"+
		"\u0286\u0003B!\u0000\u0285\u0283\u0001\u0000\u0000\u0000\u0285\u0286\u0001"+
		"\u0000\u0000\u0000\u0286\u02cc\u0001\u0000\u0000\u0000\u0287\u0289\u0005"+
		"A\u0000\u0000\u0288\u028a\u0005$\u0000\u0000\u0289\u0288\u0001\u0000\u0000"+
		"\u0000\u0289\u028a\u0001\u0000\u0000\u0000\u028a\u028e\u0001\u0000\u0000"+
		"\u0000\u028b\u028c\u0005\t\u0000\u0000\u028c\u028d\u0005\n\u0000\u0000"+
		"\u028d\u028f\u0003@ \u0000\u028e\u028b\u0001\u0000\u0000\u0000\u028e\u028f"+
		"\u0001\u0000\u0000\u0000\u028f\u0292\u0001\u0000\u0000\u0000\u0290\u0291"+
		"\u0005\u000b\u0000\u0000\u0291\u0293\u0003B!\u0000\u0292\u0290\u0001\u0000"+
		"\u0000\u0000\u0292\u0293\u0001\u0000\u0000\u0000\u0293\u02cc\u0001\u0000"+
		"\u0000\u0000\u0294\u0296\u0005B\u0000\u0000\u0295\u0297\u0005$\u0000\u0000"+
		"\u0296\u0295\u0001\u0000\u0000\u0000\u0296\u0297\u0001\u0000\u0000\u0000"+
		"\u0297\u029b\u0001\u0000\u0000\u0000\u0298\u0299\u0005\t\u0000\u0000\u0299"+
		"\u029a\u0005\n\u0000\u0000\u029a\u029c\u0003@ \u0000\u029b\u0298\u0001"+
		"\u0000\u0000\u0000\u029b\u029c\u0001\u0000\u0000\u0000\u029c\u029f\u0001"+
		"\u0000\u0000\u0000\u029d\u029e\u0005\u000b\u0000\u0000\u029e\u02a0\u0003"+
		"B!\u0000\u029f\u029d\u0001\u0000\u0000\u0000\u029f\u02a0\u0001\u0000\u0000"+
		"\u0000\u02a0\u02cc\u0001\u0000\u0000\u0000\u02a1\u02a2\u0005C\u0000\u0000"+
		"\u02a2\u02a8\u0005Q\u0000\u0000\u02a3\u02a4\u0003>\u001f\u0000\u02a4\u02a5"+
		"\u0005O\u0000\u0000\u02a5\u02a7\u0001\u0000\u0000\u0000\u02a6\u02a3\u0001"+
		"\u0000\u0000\u0000\u02a7\u02aa\u0001\u0000\u0000\u0000\u02a8\u02a6\u0001"+
		"\u0000\u0000\u0000\u02a8\u02a9\u0001\u0000\u0000\u0000\u02a9\u02ab\u0001"+
		"\u0000\u0000\u0000\u02aa\u02a8\u0001\u0000\u0000\u0000\u02ab\u02ac\u0003"+
		">\u001f\u0000\u02ac\u02b0\u0005R\u0000\u0000\u02ad\u02ae\u0005\t\u0000"+
		"\u0000\u02ae\u02af\u0005\n\u0000\u0000\u02af\u02b1\u0003@ \u0000\u02b0"+
		"\u02ad\u0001\u0000\u0000\u0000\u02b0\u02b1\u0001\u0000\u0000\u0000\u02b1"+
		"\u02b4\u0001\u0000\u0000\u0000\u02b2\u02b3\u0005\u000b\u0000\u0000\u02b3"+
		"\u02b5\u0003B!\u0000\u02b4\u02b2\u0001\u0000\u0000\u0000\u02b4\u02b5\u0001"+
		"\u0000\u0000\u0000\u02b5\u02cc\u0001\u0000\u0000\u0000\u02b6\u02b7\u0005"+
		"\n\u0000\u0000\u02b7\u02bd\u0005Q\u0000\u0000\u02b8\u02b9\u0003>\u001f"+
		"\u0000\u02b9\u02ba\u0005O\u0000\u0000\u02ba\u02bc\u0001\u0000\u0000\u0000"+
		"\u02bb\u02b8\u0001\u0000\u0000\u0000\u02bc\u02bf\u0001\u0000\u0000\u0000"+
		"\u02bd\u02bb\u0001\u0000\u0000\u0000\u02bd\u02be\u0001\u0000\u0000\u0000"+
		"\u02be\u02c0\u0001\u0000\u0000\u0000\u02bf\u02bd\u0001\u0000\u0000\u0000"+
		"\u02c0\u02c1\u0003>\u001f\u0000\u02c1\u02c5\u0005R\u0000\u0000\u02c2\u02c3"+
		"\u0005\t\u0000\u0000\u02c3\u02c4\u0005\n\u0000\u0000\u02c4\u02c6\u0003"+
		"@ \u0000\u02c5\u02c2\u0001\u0000\u0000\u0000\u02c5\u02c6\u0001\u0000\u0000"+
		"\u0000\u02c6\u02c9\u0001\u0000\u0000\u0000\u02c7\u02c8\u0005\u000b\u0000"+
		"\u0000\u02c8\u02ca\u0003B!\u0000\u02c9\u02c7\u0001\u0000\u0000\u0000\u02c9"+
		"\u02ca\u0001\u0000\u0000\u0000\u02ca\u02cc\u0001\u0000\u0000\u0000\u02cb"+
		"\u01a4\u0001\u0000\u0000\u0000\u02cb\u01aa\u0001\u0000\u0000\u0000\u02cb"+
		"\u01b6\u0001\u0000\u0000\u0000\u02cb\u01c2\u0001\u0000\u0000\u0000\u02cb"+
		"\u01ce\u0001\u0000\u0000\u0000\u02cb\u01da\u0001\u0000\u0000\u0000\u02cb"+
		"\u01e6\u0001\u0000\u0000\u0000\u02cb\u01f2\u0001\u0000\u0000\u0000\u02cb"+
		"\u0200\u0001\u0000\u0000\u0000\u02cb\u020e\u0001\u0000\u0000\u0000\u02cb"+
		"\u021c\u0001\u0000\u0000\u0000\u02cb\u022c\u0001\u0000\u0000\u0000\u02cb"+
		"\u023c\u0001\u0000\u0000\u0000\u02cb\u023d\u0001\u0000\u0000\u0000\u02cb"+
		"\u023e\u0001\u0000\u0000\u0000\u02cb\u023f\u0001\u0000\u0000\u0000\u02cb"+
		"\u0240\u0001\u0000\u0000\u0000\u02cb\u0241\u0001\u0000\u0000\u0000\u02cb"+
		"\u0242\u0001\u0000\u0000\u0000\u02cb\u0251\u0001\u0000\u0000\u0000\u02cb"+
		"\u025e\u0001\u0000\u0000\u0000\u02cb\u0264\u0001\u0000\u0000\u0000\u02cb"+
		"\u0268\u0001\u0000\u0000\u0000\u02cb\u0269\u0001\u0000\u0000\u0000\u02cb"+
		"\u026a\u0001\u0000\u0000\u0000\u02cb\u026b\u0001\u0000\u0000\u0000\u02cb"+
		"\u026c\u0001\u0000\u0000\u0000\u02cb\u026d\u0001\u0000\u0000\u0000\u02cb"+
		"\u027a\u0001\u0000\u0000\u0000\u02cb\u0287\u0001\u0000\u0000\u0000\u02cb"+
		"\u0294\u0001\u0000\u0000\u0000\u02cb\u02a1\u0001\u0000\u0000\u0000\u02cb"+
		"\u02b6\u0001\u0000\u0000\u0000\u02cc=\u0001\u0000\u0000\u0000\u02cd\u02ce"+
		"\u0005W\u0000\u0000\u02ce?\u0001\u0000\u0000\u0000\u02cf\u02d0\u0003L"+
		"&\u0000\u02d0A\u0001\u0000\u0000\u0000\u02d1\u02d2\u0003L&\u0000\u02d2"+
		"C\u0001\u0000\u0000\u0000\u02d3\u02da\u0005\u000f\u0000\u0000\u02d4\u02da"+
		"\u0005\u0010\u0000\u0000\u02d5\u02d6\u0005\n\u0000\u0000\u02d6\u02da\u0005"+
		"\u001a\u0000\u0000\u02d7\u02d8\u0005D\u0000\u0000\u02d8\u02da\u0005E\u0000"+
		"\u0000\u02d9\u02d3\u0001\u0000\u0000\u0000\u02d9\u02d4\u0001\u0000\u0000"+
		"\u0000\u02d9\u02d5\u0001\u0000\u0000\u0000\u02d9\u02d7\u0001\u0000\u0000"+
		"\u0000\u02daE\u0001\u0000\u0000\u0000\u02db\u02dc\u0007\u0005\u0000\u0000"+
		"\u02dcG\u0001\u0000\u0000\u0000\u02dd\u02df\u0003J%\u0000\u02de\u02dd"+
		"\u0001\u0000\u0000\u0000\u02df\u02e2\u0001\u0000\u0000\u0000\u02e0\u02de"+
		"\u0001\u0000\u0000\u0000\u02e0\u02e1\u0001\u0000\u0000\u0000\u02e1I\u0001"+
		"\u0000\u0000\u0000\u02e2\u02e0\u0001\u0000\u0000\u0000\u02e3\u02e4\u0005"+
		"T\u0000\u0000\u02e4\u02e5\u0005J\u0000\u0000\u02e5\u02e8\u0005T\u0000"+
		"\u0000\u02e6\u02e8\u0003\b\u0004\u0000\u02e7\u02e3\u0001\u0000\u0000\u0000"+
		"\u02e7\u02e6\u0001\u0000\u0000\u0000\u02e8K\u0001\u0000\u0000\u0000\u02e9"+
		"\u02f2\u0005S\u0000\u0000\u02ea\u02eb\u0005K\u0000\u0000\u02eb\u02ec\u0005"+
		"T\u0000\u0000\u02ec\u02f2\u0005K\u0000\u0000\u02ed\u02ee\u0005L\u0000"+
		"\u0000\u02ee\u02ef\u0005T\u0000\u0000\u02ef\u02f2\u0005L\u0000\u0000\u02f0"+
		"\u02f2\u0005T\u0000\u0000\u02f1\u02e9\u0001\u0000\u0000\u0000\u02f1\u02ea"+
		"\u0001\u0000\u0000\u0000\u02f1\u02ed\u0001\u0000\u0000\u0000\u02f1\u02f0"+
		"\u0001\u0000\u0000\u0000\u02f2M\u0001\u0000\u0000\u0000sQgmv|\u0080\u0085"+
		"\u0089\u008d\u0093\u009d\u00a5\u00ae\u00b2\u00bb\u00c0\u00c7\u00cb\u00d1"+
		"\u00d7\u00dc\u00e8\u00f2\u00f4\u00fe\u0106\u010e\u0117\u011f\u0127\u0129"+
		"\u012d\u0130\u0138\u0140\u0142\u0147\u014f\u0156\u0161\u0165\u0168\u016c"+
		"\u016f\u0172\u0176\u018b\u0193\u0198\u01a2\u01a8\u01ae\u01b1\u01b4\u01ba"+
		"\u01bd\u01c0\u01c6\u01c9\u01cc\u01d2\u01d5\u01d8\u01de\u01e1\u01e4\u01ea"+
		"\u01ed\u01f0\u01f8\u01fb\u01fe\u0206\u0209\u020c\u0214\u0217\u021a\u0221"+
		"\u0224\u0227\u022a\u0231\u0234\u0237\u023a\u0246\u024b\u024f\u0258\u025c"+
		"\u0262\u026f\u0274\u0278\u027c\u0281\u0285\u0289\u028e\u0292\u0296\u029b"+
		"\u029f\u02a8\u02b0\u02b4\u02bd\u02c5\u02c9\u02cb\u02d9\u02e0\u02e7\u02f1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}