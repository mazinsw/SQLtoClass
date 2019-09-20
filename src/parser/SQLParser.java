// Generated from ./src/parser/SQL.g4 by ANTLR 4.7.2
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
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, T__64=65, T__65=66, 
		T__66=67, T__67=68, T__68=69, T__69=70, T__70=71, T__71=72, T__72=73, 
		T__73=74, NAME=75, INT=76, FLOAT=77, STRING=78, COMMENT=79, SINGLE_COMMENT=80, 
		WS=81;
	public static final int
		RULE_script = 0, RULE_stmt = 1, RULE_dropSchema = 2, RULE_createSchema = 3, 
		RULE_createSpecification = 4, RULE_tableComment = 5, RULE_setStmt = 6, 
		RULE_setOption = 7, RULE_setDefaultValue = 8, RULE_useStmt = 9, RULE_dropTable = 10, 
		RULE_dropTableName = 11, RULE_createTable = 12, RULE_tableName = 13, RULE_fieldList = 14, 
		RULE_createDefinition = 15, RULE_columnName = 16, RULE_constraintName = 17, 
		RULE_constraintTable = 18, RULE_columnDefinition = 19, RULE_autoIncrement = 20, 
		RULE_columnDefaultValue = 21, RULE_defaultNull = 22, RULE_defaultNotNull = 23, 
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
			"columnDefinition", "autoIncrement", "columnDefaultValue", "defaultNull", 
			"defaultNotNull", "fieldComment", "referenceDefinition", "referenceDeleteOption", 
			"referenceUpdateOption", "referenceTable", "indexColName", "dataType", 
			"stringItem", "charsetName", "collateName", "referenceOption", "defaultValue", 
			"tableOptions", "option", "idName"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'DROP'", "'DATABASE'", "'SCHEMA'", "'IF'", "'EXISTS'", 
			"'CREATE'", "'NOT'", "'DEFAULT'", "'CHARACTER'", "'SET'", "'='", "'COLLATE'", 
			"'COMMENT'", "','", "'@'", "'USE'", "'TEMPORARY'", "'TABLE'", "'RESTRICT'", 
			"'CASCADE'", "'('", "')'", "'CONSTRAINT'", "'PRIMARY'", "'KEY'", "'INDEX'", 
			"'UNIQUE'", "'FOREIGN'", "'AUTO_INCREMENT'", "'NULL'", "'REFERENCES'", 
			"'ON'", "'DELETE'", "'UPDATE'", "'ASC'", "'DESC'", "'BIT'", "'TINYINT'", 
			"'UNSIGNED'", "'ZEROFILL'", "'SMALLINT'", "'MEDIUMINT'", "'INT'", "'INTEGER'", 
			"'BIGINT'", "'REAL'", "'DOUBLE'", "'FLOAT'", "'DECIMAL'", "'NUMERIC'", 
			"'DATE'", "'TIME'", "'TIMESTAMP'", "'DATETIME'", "'YEAR'", "'CHAR'", 
			"'VARCHAR'", "'BINARY'", "'VARBINARY'", "'TINYBLOB'", "'BLOB'", "'MEDIUMBLOB'", 
			"'LONGBLOB'", "'TINYTEXT'", "'TEXT'", "'MEDIUMTEXT'", "'LONGTEXT'", "'ENUM'", 
			"'NO'", "'ACTION'", "'`'", "'''", "'\"'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "NAME", "INT", "FLOAT", "STRING", "COMMENT", "SINGLE_COMMENT", 
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
	public String getGrammarFileName() { return "SQL.g4"; }

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
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterScript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitScript(this);
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__6) | (1L << T__10) | (1L << T__16))) != 0)) {
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
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitStmt(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stmt);
		try {
			setState(102);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				createSchema();
				setState(85);
				match(T__0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				dropSchema();
				setState(88);
				match(T__0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(90);
				createTable();
				setState(91);
				match(T__0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(93);
				dropTable();
				setState(94);
				match(T__0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(96);
				useStmt();
				setState(97);
				match(T__0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(99);
				setStmt();
				setState(100);
				match(T__0);
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
		public IdNameContext idName() {
			return getRuleContext(IdNameContext.class,0);
		}
		public DropSchemaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropSchema; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterDropSchema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitDropSchema(this);
		}
	}

	public final DropSchemaContext dropSchema() throws RecognitionException {
		DropSchemaContext _localctx = new DropSchemaContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_dropSchema);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(T__1);
			setState(105);
			_la = _input.LA(1);
			if ( !(_la==T__2 || _la==T__3) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(106);
				match(T__4);
				setState(107);
				match(T__5);
				}
			}

			setState(110);
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
		public IdNameContext idName() {
			return getRuleContext(IdNameContext.class,0);
		}
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
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterCreateSchema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitCreateSchema(this);
		}
	}

	public final CreateSchemaContext createSchema() throws RecognitionException {
		CreateSchemaContext _localctx = new CreateSchemaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_createSchema);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(T__6);
			setState(113);
			_la = _input.LA(1);
			if ( !(_la==T__2 || _la==T__3) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(114);
				match(T__4);
				setState(115);
				match(T__7);
				setState(116);
				match(T__5);
				}
			}

			setState(119);
			idName();
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__12) | (1L << T__13))) != 0)) {
				{
				{
				setState(120);
				createSpecification();
				}
				}
				setState(125);
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
		public CharsetNameContext charsetName() {
			return getRuleContext(CharsetNameContext.class,0);
		}
		public CollateNameContext collateName() {
			return getRuleContext(CollateNameContext.class,0);
		}
		public TableCommentContext tableComment() {
			return getRuleContext(TableCommentContext.class,0);
		}
		public CreateSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterCreateSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitCreateSpecification(this);
		}
	}

	public final CreateSpecificationContext createSpecification() throws RecognitionException {
		CreateSpecificationContext _localctx = new CreateSpecificationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_createSpecification);
		int _la;
		try {
			setState(146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(126);
					match(T__8);
					}
				}

				setState(129);
				match(T__9);
				setState(130);
				match(T__10);
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__11) {
					{
					setState(131);
					match(T__11);
					}
				}

				setState(134);
				charsetName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(135);
					match(T__8);
					}
				}

				setState(138);
				match(T__12);
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__11) {
					{
					setState(139);
					match(T__11);
					}
				}

				setState(142);
				collateName();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(143);
				match(T__13);
				setState(144);
				match(T__11);
				setState(145);
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
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTableComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTableComment(this);
		}
	}

	public final TableCommentContext tableComment() throws RecognitionException {
		TableCommentContext _localctx = new TableCommentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_tableComment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
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
		public List<SetOptionContext> setOption() {
			return getRuleContexts(SetOptionContext.class);
		}
		public SetOptionContext setOption(int i) {
			return getRuleContext(SetOptionContext.class,i);
		}
		public SetStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterSetStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitSetStmt(this);
		}
	}

	public final SetStmtContext setStmt() throws RecognitionException {
		SetStmtContext _localctx = new SetStmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_setStmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(T__10);
			setState(156);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(151);
					setOption();
					setState(152);
					match(T__14);
					}
					} 
				}
				setState(158);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(159);
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
		public SetDefaultValueContext setDefaultValue() {
			return getRuleContext(SetDefaultValueContext.class,0);
		}
		public SetOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setOption; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterSetOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitSetOption(this);
		}
	}

	public final SetOptionContext setOption() throws RecognitionException {
		SetOptionContext _localctx = new SetOptionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_setOption);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(161);
				match(T__15);
				}
				}
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(167);
			match(NAME);
			setState(168);
			match(T__11);
			setState(177);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__30:
			case INT:
			case FLOAT:
			case STRING:
				{
				setState(169);
				setDefaultValue();
				}
				break;
			case T__15:
			case NAME:
				{
				{
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(170);
					match(T__15);
					}
					}
					setState(175);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(176);
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
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterSetDefaultValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitSetDefaultValue(this);
		}
	}

	public final SetDefaultValueContext setDefaultValue() throws RecognitionException {
		SetDefaultValueContext _localctx = new SetDefaultValueContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_setDefaultValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
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
		public IdNameContext idName() {
			return getRuleContext(IdNameContext.class,0);
		}
		public UseStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterUseStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitUseStmt(this);
		}
	}

	public final UseStmtContext useStmt() throws RecognitionException {
		UseStmtContext _localctx = new UseStmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_useStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(T__16);
			setState(182);
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
		public List<DropTableNameContext> dropTableName() {
			return getRuleContexts(DropTableNameContext.class);
		}
		public DropTableNameContext dropTableName(int i) {
			return getRuleContext(DropTableNameContext.class,i);
		}
		public DropTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterDropTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitDropTable(this);
		}
	}

	public final DropTableContext dropTable() throws RecognitionException {
		DropTableContext _localctx = new DropTableContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_dropTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(T__1);
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__17) {
				{
				setState(185);
				match(T__17);
				}
			}

			setState(188);
			match(T__18);
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(189);
				match(T__4);
				setState(190);
				match(T__5);
				}
			}

			setState(193);
			dropTableName();
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(194);
				match(T__14);
				setState(195);
				dropTableName();
				}
				}
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__19 || _la==T__20) {
				{
				setState(201);
				_la = _input.LA(1);
				if ( !(_la==T__19 || _la==T__20) ) {
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
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterDropTableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitDropTableName(this);
		}
	}

	public final DropTableNameContext dropTableName() throws RecognitionException {
		DropTableNameContext _localctx = new DropTableNameContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_dropTableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
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
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TableOptionsContext tableOptions() {
			return getRuleContext(TableOptionsContext.class,0);
		}
		public FieldListContext fieldList() {
			return getRuleContext(FieldListContext.class,0);
		}
		public CreateTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterCreateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitCreateTable(this);
		}
	}

	public final CreateTableContext createTable() throws RecognitionException {
		CreateTableContext _localctx = new CreateTableContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_createTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(T__6);
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__17) {
				{
				setState(207);
				match(T__17);
				}
			}

			setState(210);
			match(T__18);
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(211);
				match(T__4);
				setState(212);
				match(T__7);
				setState(213);
				match(T__5);
				}
			}

			setState(216);
			tableName();
			setState(217);
			match(T__21);
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 24)) & ~0x3f) == 0 && ((1L << (_la - 24)) & ((1L << (T__23 - 24)) | (1L << (T__24 - 24)) | (1L << (T__25 - 24)) | (1L << (T__26 - 24)) | (1L << (T__27 - 24)) | (1L << (T__28 - 24)) | (1L << (T__71 - 24)) | (1L << (T__72 - 24)) | (1L << (T__73 - 24)) | (1L << (NAME - 24)))) != 0)) {
				{
				setState(218);
				fieldList();
				}
			}

			setState(221);
			match(T__22);
			setState(222);
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
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTableName(this);
		}
	}

	public final TableNameContext tableName() throws RecognitionException {
		TableNameContext _localctx = new TableNameContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_tableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
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
		public FieldListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterFieldList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitFieldList(this);
		}
	}

	public final FieldListContext fieldList() throws RecognitionException {
		FieldListContext _localctx = new FieldListContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_fieldList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(226);
					createDefinition();
					setState(227);
					match(T__14);
					}
					} 
				}
				setState(233);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			setState(234);
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
		public List<IndexColNameContext> indexColName() {
			return getRuleContexts(IndexColNameContext.class);
		}
		public IndexColNameContext indexColName(int i) {
			return getRuleContext(IndexColNameContext.class,i);
		}
		public ReferenceDefinitionContext referenceDefinition() {
			return getRuleContext(ReferenceDefinitionContext.class,0);
		}
		public ConstraintTableContext constraintTable() {
			return getRuleContext(ConstraintTableContext.class,0);
		}
		public ConstraintNameContext constraintName() {
			return getRuleContext(ConstraintNameContext.class,0);
		}
		public ForeignStmtContext(CreateDefinitionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterForeignStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitForeignStmt(this);
		}
	}
	public static class PrimaryKeyStmtContext extends CreateDefinitionContext {
		public List<IndexColNameContext> indexColName() {
			return getRuleContexts(IndexColNameContext.class);
		}
		public IndexColNameContext indexColName(int i) {
			return getRuleContext(IndexColNameContext.class,i);
		}
		public ConstraintNameContext constraintName() {
			return getRuleContext(ConstraintNameContext.class,0);
		}
		public PrimaryKeyStmtContext(CreateDefinitionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterPrimaryKeyStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitPrimaryKeyStmt(this);
		}
	}
	public static class IndexStmtContext extends CreateDefinitionContext {
		public List<IndexColNameContext> indexColName() {
			return getRuleContexts(IndexColNameContext.class);
		}
		public IndexColNameContext indexColName(int i) {
			return getRuleContext(IndexColNameContext.class,i);
		}
		public ConstraintNameContext constraintName() {
			return getRuleContext(ConstraintNameContext.class,0);
		}
		public IndexStmtContext(CreateDefinitionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterIndexStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitIndexStmt(this);
		}
	}
	public static class UniqueStmtContext extends CreateDefinitionContext {
		public List<IndexColNameContext> indexColName() {
			return getRuleContexts(IndexColNameContext.class);
		}
		public IndexColNameContext indexColName(int i) {
			return getRuleContext(IndexColNameContext.class,i);
		}
		public ConstraintTableContext constraintTable() {
			return getRuleContext(ConstraintTableContext.class,0);
		}
		public ConstraintNameContext constraintName() {
			return getRuleContext(ConstraintNameContext.class,0);
		}
		public UniqueStmtContext(CreateDefinitionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterUniqueStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitUniqueStmt(this);
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
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterFieldStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitFieldStmt(this);
		}
	}

	public final CreateDefinitionContext createDefinition() throws RecognitionException {
		CreateDefinitionContext _localctx = new CreateDefinitionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_createDefinition);
		int _la;
		try {
			int _alt;
			setState(324);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				_localctx = new FieldStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(236);
				columnName();
				setState(237);
				columnDefinition();
				}
				break;
			case 2:
				_localctx = new PrimaryKeyStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__23) {
					{
					setState(239);
					match(T__23);
					setState(241);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (T__71 - 72)) | (1L << (T__72 - 72)) | (1L << (T__73 - 72)) | (1L << (NAME - 72)))) != 0)) {
						{
						setState(240);
						constraintName();
						}
					}

					}
				}

				setState(245);
				match(T__24);
				setState(246);
				match(T__25);
				setState(247);
				match(T__21);
				setState(253);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(248);
						indexColName();
						setState(249);
						match(T__14);
						}
						} 
					}
					setState(255);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				}
				setState(256);
				indexColName();
				setState(257);
				match(T__22);
				}
				break;
			case 3:
				_localctx = new IndexStmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(259);
				_la = _input.LA(1);
				if ( !(_la==T__25 || _la==T__26) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(261);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (T__71 - 72)) | (1L << (T__72 - 72)) | (1L << (T__73 - 72)) | (1L << (NAME - 72)))) != 0)) {
					{
					setState(260);
					constraintName();
					}
				}

				setState(263);
				match(T__21);
				setState(269);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(264);
						indexColName();
						setState(265);
						match(T__14);
						}
						} 
					}
					setState(271);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				}
				setState(272);
				indexColName();
				setState(273);
				match(T__22);
				}
				break;
			case 4:
				_localctx = new UniqueStmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(279);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__23) {
					{
					setState(275);
					match(T__23);
					setState(277);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (T__71 - 72)) | (1L << (T__72 - 72)) | (1L << (T__73 - 72)) | (1L << (NAME - 72)))) != 0)) {
						{
						setState(276);
						constraintName();
						}
					}

					}
				}

				setState(281);
				match(T__27);
				setState(283);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__25 || _la==T__26) {
					{
					setState(282);
					_la = _input.LA(1);
					if ( !(_la==T__25 || _la==T__26) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(286);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (T__71 - 72)) | (1L << (T__72 - 72)) | (1L << (T__73 - 72)) | (1L << (NAME - 72)))) != 0)) {
					{
					setState(285);
					constraintTable();
					}
				}

				setState(288);
				match(T__21);
				setState(294);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(289);
						indexColName();
						setState(290);
						match(T__14);
						}
						} 
					}
					setState(296);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				}
				setState(297);
				indexColName();
				setState(298);
				match(T__22);
				}
				break;
			case 5:
				_localctx = new ForeignStmtContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(304);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__23) {
					{
					setState(300);
					match(T__23);
					setState(302);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (T__71 - 72)) | (1L << (T__72 - 72)) | (1L << (T__73 - 72)) | (1L << (NAME - 72)))) != 0)) {
						{
						setState(301);
						constraintName();
						}
					}

					}
				}

				setState(306);
				match(T__28);
				setState(307);
				match(T__25);
				setState(309);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (T__71 - 72)) | (1L << (T__72 - 72)) | (1L << (T__73 - 72)) | (1L << (NAME - 72)))) != 0)) {
					{
					setState(308);
					constraintTable();
					}
				}

				setState(311);
				match(T__21);
				setState(317);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(312);
						indexColName();
						setState(313);
						match(T__14);
						}
						} 
					}
					setState(319);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				}
				setState(320);
				indexColName();
				setState(321);
				match(T__22);
				setState(322);
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
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterColumnName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitColumnName(this);
		}
	}

	public final ColumnNameContext columnName() throws RecognitionException {
		ColumnNameContext _localctx = new ColumnNameContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_columnName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
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
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterConstraintName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitConstraintName(this);
		}
	}

	public final ConstraintNameContext constraintName() throws RecognitionException {
		ConstraintNameContext _localctx = new ConstraintNameContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_constraintName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
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
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterConstraintTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitConstraintTable(this);
		}
	}

	public final ConstraintTableContext constraintTable() throws RecognitionException {
		ConstraintTableContext _localctx = new ConstraintTableContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_constraintTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
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
		public DefaultNullContext defaultNull() {
			return getRuleContext(DefaultNullContext.class,0);
		}
		public DefaultNotNullContext defaultNotNull() {
			return getRuleContext(DefaultNotNullContext.class,0);
		}
		public ColumnDefaultValueContext columnDefaultValue() {
			return getRuleContext(ColumnDefaultValueContext.class,0);
		}
		public AutoIncrementContext autoIncrement() {
			return getRuleContext(AutoIncrementContext.class,0);
		}
		public FieldCommentContext fieldComment() {
			return getRuleContext(FieldCommentContext.class,0);
		}
		public ColumnDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterColumnDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitColumnDefinition(this);
		}
	}

	public final ColumnDefinitionContext columnDefinition() throws RecognitionException {
		ColumnDefinitionContext _localctx = new ColumnDefinitionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_columnDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			dataType();
			setState(335);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__30:
				{
				setState(333);
				defaultNull();
				}
				break;
			case T__7:
				{
				setState(334);
				defaultNotNull();
				}
				break;
			case T__8:
			case T__13:
			case T__14:
			case T__22:
			case T__24:
			case T__25:
			case T__27:
			case T__29:
				break;
			default:
				break;
			}
			setState(339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(337);
				match(T__8);
				setState(338);
				columnDefaultValue();
				}
			}

			setState(342);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__29) {
				{
				setState(341);
				autoIncrement();
				}
			}

			setState(352);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__27:
				{
				{
				setState(344);
				match(T__27);
				setState(346);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__25) {
					{
					setState(345);
					match(T__25);
					}
				}

				}
				}
				break;
			case T__24:
			case T__25:
				{
				{
				setState(349);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__24) {
					{
					setState(348);
					match(T__24);
					}
				}

				setState(351);
				match(T__25);
				}
				}
				break;
			case T__13:
			case T__14:
			case T__22:
				break;
			default:
				break;
			}
			setState(356);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(354);
				match(T__13);
				setState(355);
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
		public AutoIncrementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_autoIncrement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterAutoIncrement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitAutoIncrement(this);
		}
	}

	public final AutoIncrementContext autoIncrement() throws RecognitionException {
		AutoIncrementContext _localctx = new AutoIncrementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_autoIncrement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			match(T__29);
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
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterColumnDefaultValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitColumnDefaultValue(this);
		}
	}

	public final ColumnDefaultValueContext columnDefaultValue() throws RecognitionException {
		ColumnDefaultValueContext _localctx = new ColumnDefaultValueContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_columnDefaultValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
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

	public static class DefaultNullContext extends ParserRuleContext {
		public DefaultNullContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultNull; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterDefaultNull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitDefaultNull(this);
		}
	}

	public final DefaultNullContext defaultNull() throws RecognitionException {
		DefaultNullContext _localctx = new DefaultNullContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_defaultNull);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			match(T__30);
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

	public static class DefaultNotNullContext extends ParserRuleContext {
		public DefaultNotNullContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultNotNull; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterDefaultNotNull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitDefaultNotNull(this);
		}
	}

	public final DefaultNotNullContext defaultNotNull() throws RecognitionException {
		DefaultNotNullContext _localctx = new DefaultNotNullContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_defaultNotNull);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			match(T__7);
			setState(365);
			match(T__30);
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
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterFieldComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitFieldComment(this);
		}
	}

	public final FieldCommentContext fieldComment() throws RecognitionException {
		FieldCommentContext _localctx = new FieldCommentContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_fieldComment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
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
		public ReferenceTableContext referenceTable() {
			return getRuleContext(ReferenceTableContext.class,0);
		}
		public List<IndexColNameContext> indexColName() {
			return getRuleContexts(IndexColNameContext.class);
		}
		public IndexColNameContext indexColName(int i) {
			return getRuleContext(IndexColNameContext.class,i);
		}
		public ReferenceDeleteOptionContext referenceDeleteOption() {
			return getRuleContext(ReferenceDeleteOptionContext.class,0);
		}
		public ReferenceUpdateOptionContext referenceUpdateOption() {
			return getRuleContext(ReferenceUpdateOptionContext.class,0);
		}
		public ReferenceDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referenceDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterReferenceDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitReferenceDefinition(this);
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
			setState(369);
			match(T__31);
			setState(370);
			referenceTable();
			setState(371);
			match(T__21);
			setState(377);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(372);
					indexColName();
					setState(373);
					match(T__14);
					}
					} 
				}
				setState(379);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			}
			setState(380);
			indexColName();
			setState(381);
			match(T__22);
			setState(385);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(382);
				match(T__32);
				setState(383);
				match(T__33);
				setState(384);
				referenceDeleteOption();
				}
				break;
			}
			setState(390);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__32) {
				{
				setState(387);
				match(T__32);
				setState(388);
				match(T__34);
				setState(389);
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
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterReferenceDeleteOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitReferenceDeleteOption(this);
		}
	}

	public final ReferenceDeleteOptionContext referenceDeleteOption() throws RecognitionException {
		ReferenceDeleteOptionContext _localctx = new ReferenceDeleteOptionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_referenceDeleteOption);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
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
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterReferenceUpdateOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitReferenceUpdateOption(this);
		}
	}

	public final ReferenceUpdateOptionContext referenceUpdateOption() throws RecognitionException {
		ReferenceUpdateOptionContext _localctx = new ReferenceUpdateOptionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_referenceUpdateOption);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
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
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterReferenceTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitReferenceTable(this);
		}
	}

	public final ReferenceTableContext referenceTable() throws RecognitionException {
		ReferenceTableContext _localctx = new ReferenceTableContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_referenceTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
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
		public IndexColNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexColName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterIndexColName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitIndexColName(this);
		}
	}

	public final IndexColNameContext indexColName() throws RecognitionException {
		IndexColNameContext _localctx = new IndexColNameContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_indexColName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			idName();
			setState(400);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__35 || _la==T__36) {
				{
				setState(399);
				((IndexColNameContext)_localctx).Type = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__35 || _la==T__36) ) {
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
		public TypeBlobStmtContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTypeBlobStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTypeBlobStmt(this);
		}
	}
	public static class TypeTinyTextStmtContext extends DataTypeContext {
		public CharsetNameContext charsetName() {
			return getRuleContext(CharsetNameContext.class,0);
		}
		public CollateNameContext collateName() {
			return getRuleContext(CollateNameContext.class,0);
		}
		public TypeTinyTextStmtContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTypeTinyTextStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTypeTinyTextStmt(this);
		}
	}
	public static class TypeDecimalStmtContext extends DataTypeContext {
		public List<TerminalNode> INT() { return getTokens(SQLParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(SQLParser.INT, i);
		}
		public TypeDecimalStmtContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTypeDecimalStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTypeDecimalStmt(this);
		}
	}
	public static class TypeLongTextStmtContext extends DataTypeContext {
		public CharsetNameContext charsetName() {
			return getRuleContext(CharsetNameContext.class,0);
		}
		public CollateNameContext collateName() {
			return getRuleContext(CollateNameContext.class,0);
		}
		public TypeLongTextStmtContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTypeLongTextStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTypeLongTextStmt(this);
		}
	}
	public static class TypeMediumBlobStmtContext extends DataTypeContext {
		public TypeMediumBlobStmtContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTypeMediumBlobStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTypeMediumBlobStmt(this);
		}
	}
	public static class TypeDoubleStmtContext extends DataTypeContext {
		public List<TerminalNode> INT() { return getTokens(SQLParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(SQLParser.INT, i);
		}
		public TypeDoubleStmtContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTypeDoubleStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTypeDoubleStmt(this);
		}
	}
	public static class TypeTimeStmtContext extends DataTypeContext {
		public TypeTimeStmtContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTypeTimeStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTypeTimeStmt(this);
		}
	}
	public static class TypeLongBlobStmtContext extends DataTypeContext {
		public TypeLongBlobStmtContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTypeLongBlobStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTypeLongBlobStmt(this);
		}
	}
	public static class TypeTinyIntStmtContext extends DataTypeContext {
		public TerminalNode INT() { return getToken(SQLParser.INT, 0); }
		public TypeTinyIntStmtContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTypeTinyIntStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTypeTinyIntStmt(this);
		}
	}
	public static class TypeTinyBlobStmtContext extends DataTypeContext {
		public TypeTinyBlobStmtContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTypeTinyBlobStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTypeTinyBlobStmt(this);
		}
	}
	public static class TypeSetStmtContext extends DataTypeContext {
		public List<StringItemContext> stringItem() {
			return getRuleContexts(StringItemContext.class);
		}
		public StringItemContext stringItem(int i) {
			return getRuleContext(StringItemContext.class,i);
		}
		public CharsetNameContext charsetName() {
			return getRuleContext(CharsetNameContext.class,0);
		}
		public CollateNameContext collateName() {
			return getRuleContext(CollateNameContext.class,0);
		}
		public TypeSetStmtContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTypeSetStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTypeSetStmt(this);
		}
	}
	public static class TypeFloatStmtContext extends DataTypeContext {
		public List<TerminalNode> INT() { return getTokens(SQLParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(SQLParser.INT, i);
		}
		public TypeFloatStmtContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTypeFloatStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTypeFloatStmt(this);
		}
	}
	public static class TypeDateStmtContext extends DataTypeContext {
		public TypeDateStmtContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTypeDateStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTypeDateStmt(this);
		}
	}
	public static class TypeVarCharStmtContext extends DataTypeContext {
		public TerminalNode INT() { return getToken(SQLParser.INT, 0); }
		public CharsetNameContext charsetName() {
			return getRuleContext(CharsetNameContext.class,0);
		}
		public CollateNameContext collateName() {
			return getRuleContext(CollateNameContext.class,0);
		}
		public TypeVarCharStmtContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTypeVarCharStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTypeVarCharStmt(this);
		}
	}
	public static class TypeMediumTextStmtContext extends DataTypeContext {
		public CharsetNameContext charsetName() {
			return getRuleContext(CharsetNameContext.class,0);
		}
		public CollateNameContext collateName() {
			return getRuleContext(CollateNameContext.class,0);
		}
		public TypeMediumTextStmtContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTypeMediumTextStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTypeMediumTextStmt(this);
		}
	}
	public static class TypeTimeStampStmtContext extends DataTypeContext {
		public TypeTimeStampStmtContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTypeTimeStampStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTypeTimeStampStmt(this);
		}
	}
	public static class TypeMediumIntStmtContext extends DataTypeContext {
		public TerminalNode INT() { return getToken(SQLParser.INT, 0); }
		public TypeMediumIntStmtContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTypeMediumIntStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTypeMediumIntStmt(this);
		}
	}
	public static class TypeEnumStmtContext extends DataTypeContext {
		public List<StringItemContext> stringItem() {
			return getRuleContexts(StringItemContext.class);
		}
		public StringItemContext stringItem(int i) {
			return getRuleContext(StringItemContext.class,i);
		}
		public CharsetNameContext charsetName() {
			return getRuleContext(CharsetNameContext.class,0);
		}
		public CollateNameContext collateName() {
			return getRuleContext(CollateNameContext.class,0);
		}
		public TypeEnumStmtContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTypeEnumStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTypeEnumStmt(this);
		}
	}
	public static class TypeBitStmtContext extends DataTypeContext {
		public TerminalNode INT() { return getToken(SQLParser.INT, 0); }
		public TypeBitStmtContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTypeBitStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTypeBitStmt(this);
		}
	}
	public static class TypeNumericStmtContext extends DataTypeContext {
		public List<TerminalNode> INT() { return getTokens(SQLParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(SQLParser.INT, i);
		}
		public TypeNumericStmtContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTypeNumericStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTypeNumericStmt(this);
		}
	}
	public static class TypeRealStmtContext extends DataTypeContext {
		public List<TerminalNode> INT() { return getTokens(SQLParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(SQLParser.INT, i);
		}
		public TypeRealStmtContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTypeRealStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTypeRealStmt(this);
		}
	}
	public static class TypeTextStmtContext extends DataTypeContext {
		public CharsetNameContext charsetName() {
			return getRuleContext(CharsetNameContext.class,0);
		}
		public CollateNameContext collateName() {
			return getRuleContext(CollateNameContext.class,0);
		}
		public TypeTextStmtContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTypeTextStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTypeTextStmt(this);
		}
	}
	public static class TypeBigIntStmtContext extends DataTypeContext {
		public TerminalNode INT() { return getToken(SQLParser.INT, 0); }
		public TypeBigIntStmtContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTypeBigIntStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTypeBigIntStmt(this);
		}
	}
	public static class TypeDateTimeStmtContext extends DataTypeContext {
		public TypeDateTimeStmtContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTypeDateTimeStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTypeDateTimeStmt(this);
		}
	}
	public static class TypeBinaryStmtContext extends DataTypeContext {
		public TerminalNode INT() { return getToken(SQLParser.INT, 0); }
		public TypeBinaryStmtContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTypeBinaryStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTypeBinaryStmt(this);
		}
	}
	public static class TypeYearStmtContext extends DataTypeContext {
		public TypeYearStmtContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTypeYearStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTypeYearStmt(this);
		}
	}
	public static class TypeIntStmtContext extends DataTypeContext {
		public TerminalNode INT() { return getToken(SQLParser.INT, 0); }
		public TypeIntStmtContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTypeIntStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTypeIntStmt(this);
		}
	}
	public static class TypeVarBinaryStmtContext extends DataTypeContext {
		public TerminalNode INT() { return getToken(SQLParser.INT, 0); }
		public TypeVarBinaryStmtContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTypeVarBinaryStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTypeVarBinaryStmt(this);
		}
	}
	public static class TypeCharStmtContext extends DataTypeContext {
		public TerminalNode INT() { return getToken(SQLParser.INT, 0); }
		public CharsetNameContext charsetName() {
			return getRuleContext(CharsetNameContext.class,0);
		}
		public CollateNameContext collateName() {
			return getRuleContext(CollateNameContext.class,0);
		}
		public TypeCharStmtContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTypeCharStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTypeCharStmt(this);
		}
	}
	public static class TypeSmallIntStmtContext extends DataTypeContext {
		public TerminalNode INT() { return getToken(SQLParser.INT, 0); }
		public TypeSmallIntStmtContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTypeSmallIntStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTypeSmallIntStmt(this);
		}
	}
	public static class TypeIntegerStmtContext extends DataTypeContext {
		public TerminalNode INT() { return getToken(SQLParser.INT, 0); }
		public TypeIntegerStmtContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTypeIntegerStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTypeIntegerStmt(this);
		}
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_dataType);
		int _la;
		try {
			int _alt;
			setState(695);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__37:
				_localctx = new TypeBitStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(402);
				match(T__37);
				setState(406);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__21) {
					{
					setState(403);
					match(T__21);
					setState(404);
					match(INT);
					setState(405);
					match(T__22);
					}
				}

				}
				break;
			case T__38:
				_localctx = new TypeTinyIntStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(408);
				match(T__38);
				setState(412);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__21) {
					{
					setState(409);
					match(T__21);
					setState(410);
					match(INT);
					setState(411);
					match(T__22);
					}
				}

				setState(415);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__39) {
					{
					setState(414);
					match(T__39);
					}
				}

				setState(418);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__40) {
					{
					setState(417);
					match(T__40);
					}
				}

				}
				break;
			case T__41:
				_localctx = new TypeSmallIntStmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(420);
				match(T__41);
				setState(424);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__21) {
					{
					setState(421);
					match(T__21);
					setState(422);
					match(INT);
					setState(423);
					match(T__22);
					}
				}

				setState(427);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__39) {
					{
					setState(426);
					match(T__39);
					}
				}

				setState(430);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__40) {
					{
					setState(429);
					match(T__40);
					}
				}

				}
				break;
			case T__42:
				_localctx = new TypeMediumIntStmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(432);
				match(T__42);
				setState(436);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__21) {
					{
					setState(433);
					match(T__21);
					setState(434);
					match(INT);
					setState(435);
					match(T__22);
					}
				}

				setState(439);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__39) {
					{
					setState(438);
					match(T__39);
					}
				}

				setState(442);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__40) {
					{
					setState(441);
					match(T__40);
					}
				}

				}
				break;
			case T__43:
				_localctx = new TypeIntStmtContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(444);
				match(T__43);
				setState(448);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__21) {
					{
					setState(445);
					match(T__21);
					setState(446);
					match(INT);
					setState(447);
					match(T__22);
					}
				}

				setState(451);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__39) {
					{
					setState(450);
					match(T__39);
					}
				}

				setState(454);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__40) {
					{
					setState(453);
					match(T__40);
					}
				}

				}
				break;
			case T__44:
				_localctx = new TypeIntegerStmtContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(456);
				match(T__44);
				setState(460);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__21) {
					{
					setState(457);
					match(T__21);
					setState(458);
					match(INT);
					setState(459);
					match(T__22);
					}
				}

				setState(463);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__39) {
					{
					setState(462);
					match(T__39);
					}
				}

				setState(466);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__40) {
					{
					setState(465);
					match(T__40);
					}
				}

				}
				break;
			case T__45:
				_localctx = new TypeBigIntStmtContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(468);
				match(T__45);
				setState(472);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__21) {
					{
					setState(469);
					match(T__21);
					setState(470);
					match(INT);
					setState(471);
					match(T__22);
					}
				}

				setState(475);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__39) {
					{
					setState(474);
					match(T__39);
					}
				}

				setState(478);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__40) {
					{
					setState(477);
					match(T__40);
					}
				}

				}
				break;
			case T__46:
				_localctx = new TypeRealStmtContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(480);
				match(T__46);
				setState(486);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__21) {
					{
					setState(481);
					match(T__21);
					setState(482);
					match(INT);
					setState(483);
					match(T__14);
					setState(484);
					match(INT);
					setState(485);
					match(T__22);
					}
				}

				setState(489);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__39) {
					{
					setState(488);
					match(T__39);
					}
				}

				setState(492);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__40) {
					{
					setState(491);
					match(T__40);
					}
				}

				}
				break;
			case T__47:
				_localctx = new TypeDoubleStmtContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(494);
				match(T__47);
				setState(500);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__21) {
					{
					setState(495);
					match(T__21);
					setState(496);
					match(INT);
					setState(497);
					match(T__14);
					setState(498);
					match(INT);
					setState(499);
					match(T__22);
					}
				}

				setState(503);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__39) {
					{
					setState(502);
					match(T__39);
					}
				}

				setState(506);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__40) {
					{
					setState(505);
					match(T__40);
					}
				}

				}
				break;
			case T__48:
				_localctx = new TypeFloatStmtContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(508);
				match(T__48);
				setState(514);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__21) {
					{
					setState(509);
					match(T__21);
					setState(510);
					match(INT);
					setState(511);
					match(T__14);
					setState(512);
					match(INT);
					setState(513);
					match(T__22);
					}
				}

				setState(517);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__39) {
					{
					setState(516);
					match(T__39);
					}
				}

				setState(520);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__40) {
					{
					setState(519);
					match(T__40);
					}
				}

				}
				break;
			case T__49:
				_localctx = new TypeDecimalStmtContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(522);
				match(T__49);
				setState(530);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__21) {
					{
					setState(523);
					match(T__21);
					setState(524);
					match(INT);
					setState(527);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__14) {
						{
						setState(525);
						match(T__14);
						setState(526);
						match(INT);
						}
					}

					setState(529);
					match(T__22);
					}
				}

				setState(533);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__39) {
					{
					setState(532);
					match(T__39);
					}
				}

				setState(536);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__40) {
					{
					setState(535);
					match(T__40);
					}
				}

				}
				break;
			case T__50:
				_localctx = new TypeNumericStmtContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(538);
				match(T__50);
				setState(546);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__21) {
					{
					setState(539);
					match(T__21);
					setState(540);
					match(INT);
					setState(543);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__14) {
						{
						setState(541);
						match(T__14);
						setState(542);
						match(INT);
						}
					}

					setState(545);
					match(T__22);
					}
				}

				setState(549);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__39) {
					{
					setState(548);
					match(T__39);
					}
				}

				setState(552);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__40) {
					{
					setState(551);
					match(T__40);
					}
				}

				}
				break;
			case T__51:
				_localctx = new TypeDateStmtContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(554);
				match(T__51);
				}
				break;
			case T__52:
				_localctx = new TypeTimeStmtContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(555);
				match(T__52);
				}
				break;
			case T__53:
				_localctx = new TypeTimeStampStmtContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(556);
				match(T__53);
				}
				break;
			case T__54:
				_localctx = new TypeDateTimeStmtContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(557);
				match(T__54);
				}
				break;
			case T__55:
				_localctx = new TypeYearStmtContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(558);
				match(T__55);
				}
				break;
			case T__56:
				_localctx = new TypeCharStmtContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(559);
				match(T__56);
				setState(563);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__21) {
					{
					setState(560);
					match(T__21);
					setState(561);
					match(INT);
					setState(562);
					match(T__22);
					}
				}

				setState(568);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__9) {
					{
					setState(565);
					match(T__9);
					setState(566);
					match(T__10);
					setState(567);
					charsetName();
					}
				}

				setState(572);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(570);
					match(T__12);
					setState(571);
					collateName();
					}
				}

				}
				break;
			case T__57:
				_localctx = new TypeVarCharStmtContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(574);
				match(T__57);
				setState(575);
				match(T__21);
				setState(576);
				match(INT);
				setState(577);
				match(T__22);
				setState(581);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__9) {
					{
					setState(578);
					match(T__9);
					setState(579);
					match(T__10);
					setState(580);
					charsetName();
					}
				}

				setState(585);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(583);
					match(T__12);
					setState(584);
					collateName();
					}
				}

				}
				break;
			case T__58:
				_localctx = new TypeBinaryStmtContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(587);
				match(T__58);
				setState(591);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__21) {
					{
					setState(588);
					match(T__21);
					setState(589);
					match(INT);
					setState(590);
					match(T__22);
					}
				}

				}
				break;
			case T__59:
				_localctx = new TypeVarBinaryStmtContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(593);
				match(T__59);
				setState(594);
				match(T__21);
				setState(595);
				match(INT);
				setState(596);
				match(T__22);
				}
				break;
			case T__60:
				_localctx = new TypeTinyBlobStmtContext(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(597);
				match(T__60);
				}
				break;
			case T__61:
				_localctx = new TypeBlobStmtContext(_localctx);
				enterOuterAlt(_localctx, 23);
				{
				setState(598);
				match(T__61);
				}
				break;
			case T__62:
				_localctx = new TypeMediumBlobStmtContext(_localctx);
				enterOuterAlt(_localctx, 24);
				{
				setState(599);
				match(T__62);
				}
				break;
			case T__63:
				_localctx = new TypeLongBlobStmtContext(_localctx);
				enterOuterAlt(_localctx, 25);
				{
				setState(600);
				match(T__63);
				}
				break;
			case T__64:
				_localctx = new TypeTinyTextStmtContext(_localctx);
				enterOuterAlt(_localctx, 26);
				{
				setState(601);
				match(T__64);
				setState(603);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__58) {
					{
					setState(602);
					match(T__58);
					}
				}

				setState(608);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__9) {
					{
					setState(605);
					match(T__9);
					setState(606);
					match(T__10);
					setState(607);
					charsetName();
					}
				}

				setState(612);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(610);
					match(T__12);
					setState(611);
					collateName();
					}
				}

				}
				break;
			case T__65:
				_localctx = new TypeTextStmtContext(_localctx);
				enterOuterAlt(_localctx, 27);
				{
				setState(614);
				match(T__65);
				setState(616);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__58) {
					{
					setState(615);
					match(T__58);
					}
				}

				setState(621);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__9) {
					{
					setState(618);
					match(T__9);
					setState(619);
					match(T__10);
					setState(620);
					charsetName();
					}
				}

				setState(625);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(623);
					match(T__12);
					setState(624);
					collateName();
					}
				}

				}
				break;
			case T__66:
				_localctx = new TypeMediumTextStmtContext(_localctx);
				enterOuterAlt(_localctx, 28);
				{
				setState(627);
				match(T__66);
				setState(629);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__58) {
					{
					setState(628);
					match(T__58);
					}
				}

				setState(634);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__9) {
					{
					setState(631);
					match(T__9);
					setState(632);
					match(T__10);
					setState(633);
					charsetName();
					}
				}

				setState(638);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(636);
					match(T__12);
					setState(637);
					collateName();
					}
				}

				}
				break;
			case T__67:
				_localctx = new TypeLongTextStmtContext(_localctx);
				enterOuterAlt(_localctx, 29);
				{
				setState(640);
				match(T__67);
				setState(642);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__58) {
					{
					setState(641);
					match(T__58);
					}
				}

				setState(647);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__9) {
					{
					setState(644);
					match(T__9);
					setState(645);
					match(T__10);
					setState(646);
					charsetName();
					}
				}

				setState(651);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(649);
					match(T__12);
					setState(650);
					collateName();
					}
				}

				}
				break;
			case T__68:
				_localctx = new TypeEnumStmtContext(_localctx);
				enterOuterAlt(_localctx, 30);
				{
				setState(653);
				match(T__68);
				setState(654);
				match(T__21);
				setState(660);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(655);
						stringItem();
						setState(656);
						match(T__14);
						}
						} 
					}
					setState(662);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
				}
				setState(663);
				stringItem();
				setState(664);
				match(T__22);
				setState(668);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__9) {
					{
					setState(665);
					match(T__9);
					setState(666);
					match(T__10);
					setState(667);
					charsetName();
					}
				}

				setState(672);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(670);
					match(T__12);
					setState(671);
					collateName();
					}
				}

				}
				break;
			case T__10:
				_localctx = new TypeSetStmtContext(_localctx);
				enterOuterAlt(_localctx, 31);
				{
				setState(674);
				match(T__10);
				setState(675);
				match(T__21);
				setState(681);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(676);
						stringItem();
						setState(677);
						match(T__14);
						}
						} 
					}
					setState(683);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
				}
				setState(684);
				stringItem();
				setState(685);
				match(T__22);
				setState(689);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__9) {
					{
					setState(686);
					match(T__9);
					setState(687);
					match(T__10);
					setState(688);
					charsetName();
					}
				}

				setState(693);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(691);
					match(T__12);
					setState(692);
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
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterStringItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitStringItem(this);
		}
	}

	public final StringItemContext stringItem() throws RecognitionException {
		StringItemContext _localctx = new StringItemContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_stringItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(697);
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
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterCharsetName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitCharsetName(this);
		}
	}

	public final CharsetNameContext charsetName() throws RecognitionException {
		CharsetNameContext _localctx = new CharsetNameContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_charsetName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(699);
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
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterCollateName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitCollateName(this);
		}
	}

	public final CollateNameContext collateName() throws RecognitionException {
		CollateNameContext _localctx = new CollateNameContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_collateName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(701);
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
		public ReferenceOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referenceOption; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterReferenceOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitReferenceOption(this);
		}
	}

	public final ReferenceOptionContext referenceOption() throws RecognitionException {
		ReferenceOptionContext _localctx = new ReferenceOptionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_referenceOption);
		try {
			setState(709);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__19:
				enterOuterAlt(_localctx, 1);
				{
				setState(703);
				match(T__19);
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 2);
				{
				setState(704);
				match(T__20);
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(705);
				match(T__10);
				setState(706);
				match(T__30);
				}
				}
				break;
			case T__69:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(707);
				match(T__69);
				setState(708);
				match(T__70);
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
		public DefaultValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterDefaultValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitDefaultValue(this);
		}
	}

	public final DefaultValueContext defaultValue() throws RecognitionException {
		DefaultValueContext _localctx = new DefaultValueContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_defaultValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(711);
			_la = _input.LA(1);
			if ( !(((((_la - 31)) & ~0x3f) == 0 && ((1L << (_la - 31)) & ((1L << (T__30 - 31)) | (1L << (INT - 31)) | (1L << (FLOAT - 31)) | (1L << (STRING - 31)))) != 0)) ) {
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
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTableOptions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTableOptions(this);
		}
	}

	public final TableOptionsContext tableOptions() throws RecognitionException {
		TableOptionsContext _localctx = new TableOptionsContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_tableOptions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(716);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__12) | (1L << T__13))) != 0) || _la==NAME) {
				{
				{
				setState(713);
				option();
				}
				}
				setState(718);
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
		public CreateSpecificationContext createSpecification() {
			return getRuleContext(CreateSpecificationContext.class,0);
		}
		public OptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitOption(this);
		}
	}

	public final OptionContext option() throws RecognitionException {
		OptionContext _localctx = new OptionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_option);
		try {
			setState(723);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(719);
				match(NAME);
				setState(720);
				match(T__11);
				setState(721);
				match(NAME);
				}
				break;
			case T__8:
			case T__9:
			case T__12:
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(722);
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
		public TerminalNode NAME() { return getToken(SQLParser.NAME, 0); }
		public IdNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterIdName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitIdName(this);
		}
	}

	public final IdNameContext idName() throws RecognitionException {
		IdNameContext _localctx = new IdNameContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_idName);
		try {
			setState(735);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__71:
				enterOuterAlt(_localctx, 1);
				{
				setState(725);
				match(T__71);
				setState(726);
				match(NAME);
				setState(727);
				match(T__71);
				}
				break;
			case T__72:
				enterOuterAlt(_localctx, 2);
				{
				setState(728);
				match(T__72);
				setState(729);
				match(NAME);
				setState(730);
				match(T__72);
				}
				break;
			case T__73:
				enterOuterAlt(_localctx, 3);
				{
				setState(731);
				match(T__73);
				setState(732);
				match(NAME);
				setState(733);
				match(T__73);
				}
				break;
			case NAME:
				enterOuterAlt(_localctx, 4);
				{
				setState(734);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3S\u02e4\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\7\2R\n\2\f\2\16"+
		"\2U\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\5\3i\n\3\3\4\3\4\3\4\3\4\5\4o\n\4\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\5\5\5x\n\5\3\5\3\5\7\5|\n\5\f\5\16\5\177\13\5\3\6\5\6\u0082\n\6\3\6\3"+
		"\6\3\6\5\6\u0087\n\6\3\6\3\6\5\6\u008b\n\6\3\6\3\6\5\6\u008f\n\6\3\6\3"+
		"\6\3\6\3\6\5\6\u0095\n\6\3\7\3\7\3\b\3\b\3\b\3\b\7\b\u009d\n\b\f\b\16"+
		"\b\u00a0\13\b\3\b\3\b\3\t\7\t\u00a5\n\t\f\t\16\t\u00a8\13\t\3\t\3\t\3"+
		"\t\3\t\7\t\u00ae\n\t\f\t\16\t\u00b1\13\t\3\t\5\t\u00b4\n\t\3\n\3\n\3\13"+
		"\3\13\3\13\3\f\3\f\5\f\u00bd\n\f\3\f\3\f\3\f\5\f\u00c2\n\f\3\f\3\f\3\f"+
		"\7\f\u00c7\n\f\f\f\16\f\u00ca\13\f\3\f\5\f\u00cd\n\f\3\r\3\r\3\16\3\16"+
		"\5\16\u00d3\n\16\3\16\3\16\3\16\3\16\5\16\u00d9\n\16\3\16\3\16\3\16\5"+
		"\16\u00de\n\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\20\7\20\u00e8\n\20"+
		"\f\20\16\20\u00eb\13\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\5\21\u00f4"+
		"\n\21\5\21\u00f6\n\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u00fe\n\21\f"+
		"\21\16\21\u0101\13\21\3\21\3\21\3\21\3\21\3\21\5\21\u0108\n\21\3\21\3"+
		"\21\3\21\3\21\7\21\u010e\n\21\f\21\16\21\u0111\13\21\3\21\3\21\3\21\3"+
		"\21\3\21\5\21\u0118\n\21\5\21\u011a\n\21\3\21\3\21\5\21\u011e\n\21\3\21"+
		"\5\21\u0121\n\21\3\21\3\21\3\21\3\21\7\21\u0127\n\21\f\21\16\21\u012a"+
		"\13\21\3\21\3\21\3\21\3\21\3\21\5\21\u0131\n\21\5\21\u0133\n\21\3\21\3"+
		"\21\3\21\5\21\u0138\n\21\3\21\3\21\3\21\3\21\7\21\u013e\n\21\f\21\16\21"+
		"\u0141\13\21\3\21\3\21\3\21\3\21\5\21\u0147\n\21\3\22\3\22\3\23\3\23\3"+
		"\24\3\24\3\25\3\25\3\25\5\25\u0152\n\25\3\25\3\25\5\25\u0156\n\25\3\25"+
		"\5\25\u0159\n\25\3\25\3\25\5\25\u015d\n\25\3\25\5\25\u0160\n\25\3\25\5"+
		"\25\u0163\n\25\3\25\3\25\5\25\u0167\n\25\3\26\3\26\3\27\3\27\3\30\3\30"+
		"\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\7\33\u017a\n\33"+
		"\f\33\16\33\u017d\13\33\3\33\3\33\3\33\3\33\3\33\5\33\u0184\n\33\3\33"+
		"\3\33\3\33\5\33\u0189\n\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\5\37"+
		"\u0193\n\37\3 \3 \3 \3 \5 \u0199\n \3 \3 \3 \3 \5 \u019f\n \3 \5 \u01a2"+
		"\n \3 \5 \u01a5\n \3 \3 \3 \3 \5 \u01ab\n \3 \5 \u01ae\n \3 \5 \u01b1"+
		"\n \3 \3 \3 \3 \5 \u01b7\n \3 \5 \u01ba\n \3 \5 \u01bd\n \3 \3 \3 \3 "+
		"\5 \u01c3\n \3 \5 \u01c6\n \3 \5 \u01c9\n \3 \3 \3 \3 \5 \u01cf\n \3 "+
		"\5 \u01d2\n \3 \5 \u01d5\n \3 \3 \3 \3 \5 \u01db\n \3 \5 \u01de\n \3 "+
		"\5 \u01e1\n \3 \3 \3 \3 \3 \3 \5 \u01e9\n \3 \5 \u01ec\n \3 \5 \u01ef"+
		"\n \3 \3 \3 \3 \3 \3 \5 \u01f7\n \3 \5 \u01fa\n \3 \5 \u01fd\n \3 \3 "+
		"\3 \3 \3 \3 \5 \u0205\n \3 \5 \u0208\n \3 \5 \u020b\n \3 \3 \3 \3 \3 "+
		"\5 \u0212\n \3 \5 \u0215\n \3 \5 \u0218\n \3 \5 \u021b\n \3 \3 \3 \3 "+
		"\3 \5 \u0222\n \3 \5 \u0225\n \3 \5 \u0228\n \3 \5 \u022b\n \3 \3 \3 "+
		"\3 \3 \3 \3 \3 \3 \5 \u0236\n \3 \3 \3 \5 \u023b\n \3 \3 \5 \u023f\n "+
		"\3 \3 \3 \3 \3 \3 \3 \5 \u0248\n \3 \3 \5 \u024c\n \3 \3 \3 \3 \5 \u0252"+
		"\n \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u025e\n \3 \3 \3 \5 \u0263\n \3 "+
		"\3 \5 \u0267\n \3 \3 \5 \u026b\n \3 \3 \3 \5 \u0270\n \3 \3 \5 \u0274"+
		"\n \3 \3 \5 \u0278\n \3 \3 \3 \5 \u027d\n \3 \3 \5 \u0281\n \3 \3 \5 "+
		"\u0285\n \3 \3 \3 \5 \u028a\n \3 \3 \5 \u028e\n \3 \3 \3 \3 \3 \7 \u0295"+
		"\n \f \16 \u0298\13 \3 \3 \3 \3 \3 \5 \u029f\n \3 \3 \5 \u02a3\n \3 \3"+
		" \3 \3 \3 \7 \u02aa\n \f \16 \u02ad\13 \3 \3 \3 \3 \3 \5 \u02b4\n \3 "+
		"\3 \5 \u02b8\n \5 \u02ba\n \3!\3!\3\"\3\"\3#\3#\3$\3$\3$\3$\3$\3$\5$\u02c8"+
		"\n$\3%\3%\3&\7&\u02cd\n&\f&\16&\u02d0\13&\3\'\3\'\3\'\3\'\5\'\u02d6\n"+
		"\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u02e2\n(\3(\2\2)\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLN\2\7\3\2\5\6\3\2"+
		"\26\27\3\2\34\35\3\2&\'\4\2!!NP\2\u0358\2S\3\2\2\2\4h\3\2\2\2\6j\3\2\2"+
		"\2\br\3\2\2\2\n\u0094\3\2\2\2\f\u0096\3\2\2\2\16\u0098\3\2\2\2\20\u00a6"+
		"\3\2\2\2\22\u00b5\3\2\2\2\24\u00b7\3\2\2\2\26\u00ba\3\2\2\2\30\u00ce\3"+
		"\2\2\2\32\u00d0\3\2\2\2\34\u00e2\3\2\2\2\36\u00e9\3\2\2\2 \u0146\3\2\2"+
		"\2\"\u0148\3\2\2\2$\u014a\3\2\2\2&\u014c\3\2\2\2(\u014e\3\2\2\2*\u0168"+
		"\3\2\2\2,\u016a\3\2\2\2.\u016c\3\2\2\2\60\u016e\3\2\2\2\62\u0171\3\2\2"+
		"\2\64\u0173\3\2\2\2\66\u018a\3\2\2\28\u018c\3\2\2\2:\u018e\3\2\2\2<\u0190"+
		"\3\2\2\2>\u02b9\3\2\2\2@\u02bb\3\2\2\2B\u02bd\3\2\2\2D\u02bf\3\2\2\2F"+
		"\u02c7\3\2\2\2H\u02c9\3\2\2\2J\u02ce\3\2\2\2L\u02d5\3\2\2\2N\u02e1\3\2"+
		"\2\2PR\5\4\3\2QP\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2T\3\3\2\2\2US\3"+
		"\2\2\2VW\5\b\5\2WX\7\3\2\2Xi\3\2\2\2YZ\5\6\4\2Z[\7\3\2\2[i\3\2\2\2\\]"+
		"\5\32\16\2]^\7\3\2\2^i\3\2\2\2_`\5\26\f\2`a\7\3\2\2ai\3\2\2\2bc\5\24\13"+
		"\2cd\7\3\2\2di\3\2\2\2ef\5\16\b\2fg\7\3\2\2gi\3\2\2\2hV\3\2\2\2hY\3\2"+
		"\2\2h\\\3\2\2\2h_\3\2\2\2hb\3\2\2\2he\3\2\2\2i\5\3\2\2\2jk\7\4\2\2kn\t"+
		"\2\2\2lm\7\7\2\2mo\7\b\2\2nl\3\2\2\2no\3\2\2\2op\3\2\2\2pq\5N(\2q\7\3"+
		"\2\2\2rs\7\t\2\2sw\t\2\2\2tu\7\7\2\2uv\7\n\2\2vx\7\b\2\2wt\3\2\2\2wx\3"+
		"\2\2\2xy\3\2\2\2y}\5N(\2z|\5\n\6\2{z\3\2\2\2|\177\3\2\2\2}{\3\2\2\2}~"+
		"\3\2\2\2~\t\3\2\2\2\177}\3\2\2\2\u0080\u0082\7\13\2\2\u0081\u0080\3\2"+
		"\2\2\u0081\u0082\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\7\f\2\2\u0084"+
		"\u0086\7\r\2\2\u0085\u0087\7\16\2\2\u0086\u0085\3\2\2\2\u0086\u0087\3"+
		"\2\2\2\u0087\u0088\3\2\2\2\u0088\u0095\5B\"\2\u0089\u008b\7\13\2\2\u008a"+
		"\u0089\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008e\7\17"+
		"\2\2\u008d\u008f\7\16\2\2\u008e\u008d\3\2\2\2\u008e\u008f\3\2\2\2\u008f"+
		"\u0090\3\2\2\2\u0090\u0095\5D#\2\u0091\u0092\7\20\2\2\u0092\u0093\7\16"+
		"\2\2\u0093\u0095\5\f\7\2\u0094\u0081\3\2\2\2\u0094\u008a\3\2\2\2\u0094"+
		"\u0091\3\2\2\2\u0095\13\3\2\2\2\u0096\u0097\7P\2\2\u0097\r\3\2\2\2\u0098"+
		"\u009e\7\r\2\2\u0099\u009a\5\20\t\2\u009a\u009b\7\21\2\2\u009b\u009d\3"+
		"\2\2\2\u009c\u0099\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009e"+
		"\u009f\3\2\2\2\u009f\u00a1\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a2\5\20"+
		"\t\2\u00a2\17\3\2\2\2\u00a3\u00a5\7\22\2\2\u00a4\u00a3\3\2\2\2\u00a5\u00a8"+
		"\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a9\3\2\2\2\u00a8"+
		"\u00a6\3\2\2\2\u00a9\u00aa\7M\2\2\u00aa\u00b3\7\16\2\2\u00ab\u00b4\5\22"+
		"\n\2\u00ac\u00ae\7\22\2\2\u00ad\u00ac\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af"+
		"\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b2\3\2\2\2\u00b1\u00af\3\2"+
		"\2\2\u00b2\u00b4\7M\2\2\u00b3\u00ab\3\2\2\2\u00b3\u00af\3\2\2\2\u00b4"+
		"\21\3\2\2\2\u00b5\u00b6\5H%\2\u00b6\23\3\2\2\2\u00b7\u00b8\7\23\2\2\u00b8"+
		"\u00b9\5N(\2\u00b9\25\3\2\2\2\u00ba\u00bc\7\4\2\2\u00bb\u00bd\7\24\2\2"+
		"\u00bc\u00bb\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00c1"+
		"\7\25\2\2\u00bf\u00c0\7\7\2\2\u00c0\u00c2\7\b\2\2\u00c1\u00bf\3\2\2\2"+
		"\u00c1\u00c2\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c8\5\30\r\2\u00c4\u00c5"+
		"\7\21\2\2\u00c5\u00c7\5\30\r\2\u00c6\u00c4\3\2\2\2\u00c7\u00ca\3\2\2\2"+
		"\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8"+
		"\3\2\2\2\u00cb\u00cd\t\3\2\2\u00cc\u00cb\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd"+
		"\27\3\2\2\2\u00ce\u00cf\5N(\2\u00cf\31\3\2\2\2\u00d0\u00d2\7\t\2\2\u00d1"+
		"\u00d3\7\24\2\2\u00d2\u00d1\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4\3"+
		"\2\2\2\u00d4\u00d8\7\25\2\2\u00d5\u00d6\7\7\2\2\u00d6\u00d7\7\n\2\2\u00d7"+
		"\u00d9\7\b\2\2\u00d8\u00d5\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00da\3\2"+
		"\2\2\u00da\u00db\5\34\17\2\u00db\u00dd\7\30\2\2\u00dc\u00de\5\36\20\2"+
		"\u00dd\u00dc\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e0"+
		"\7\31\2\2\u00e0\u00e1\5J&\2\u00e1\33\3\2\2\2\u00e2\u00e3\5N(\2\u00e3\35"+
		"\3\2\2\2\u00e4\u00e5\5 \21\2\u00e5\u00e6\7\21\2\2\u00e6\u00e8\3\2\2\2"+
		"\u00e7\u00e4\3\2\2\2\u00e8\u00eb\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea"+
		"\3\2\2\2\u00ea\u00ec\3\2\2\2\u00eb\u00e9\3\2\2\2\u00ec\u00ed\5 \21\2\u00ed"+
		"\37\3\2\2\2\u00ee\u00ef\5\"\22\2\u00ef\u00f0\5(\25\2\u00f0\u0147\3\2\2"+
		"\2\u00f1\u00f3\7\32\2\2\u00f2\u00f4\5$\23\2\u00f3\u00f2\3\2\2\2\u00f3"+
		"\u00f4\3\2\2\2\u00f4\u00f6\3\2\2\2\u00f5\u00f1\3\2\2\2\u00f5\u00f6\3\2"+
		"\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f8\7\33\2\2\u00f8\u00f9\7\34\2\2\u00f9"+
		"\u00ff\7\30\2\2\u00fa\u00fb\5<\37\2\u00fb\u00fc\7\21\2\2\u00fc\u00fe\3"+
		"\2\2\2\u00fd\u00fa\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff"+
		"\u0100\3\2\2\2\u0100\u0102\3\2\2\2\u0101\u00ff\3\2\2\2\u0102\u0103\5<"+
		"\37\2\u0103\u0104\7\31\2\2\u0104\u0147\3\2\2\2\u0105\u0107\t\4\2\2\u0106"+
		"\u0108\5$\23\2\u0107\u0106\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u0109\3\2"+
		"\2\2\u0109\u010f\7\30\2\2\u010a\u010b\5<\37\2\u010b\u010c\7\21\2\2\u010c"+
		"\u010e\3\2\2\2\u010d\u010a\3\2\2\2\u010e\u0111\3\2\2\2\u010f\u010d\3\2"+
		"\2\2\u010f\u0110\3\2\2\2\u0110\u0112\3\2\2\2\u0111\u010f\3\2\2\2\u0112"+
		"\u0113\5<\37\2\u0113\u0114\7\31\2\2\u0114\u0147\3\2\2\2\u0115\u0117\7"+
		"\32\2\2\u0116\u0118\5$\23\2\u0117\u0116\3\2\2\2\u0117\u0118\3\2\2\2\u0118"+
		"\u011a\3\2\2\2\u0119\u0115\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011b\3\2"+
		"\2\2\u011b\u011d\7\36\2\2\u011c\u011e\t\4\2\2\u011d\u011c\3\2\2\2\u011d"+
		"\u011e\3\2\2\2\u011e\u0120\3\2\2\2\u011f\u0121\5&\24\2\u0120\u011f\3\2"+
		"\2\2\u0120\u0121\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0128\7\30\2\2\u0123"+
		"\u0124\5<\37\2\u0124\u0125\7\21\2\2\u0125\u0127\3\2\2\2\u0126\u0123\3"+
		"\2\2\2\u0127\u012a\3\2\2\2\u0128\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129"+
		"\u012b\3\2\2\2\u012a\u0128\3\2\2\2\u012b\u012c\5<\37\2\u012c\u012d\7\31"+
		"\2\2\u012d\u0147\3\2\2\2\u012e\u0130\7\32\2\2\u012f\u0131\5$\23\2\u0130"+
		"\u012f\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u0133\3\2\2\2\u0132\u012e\3\2"+
		"\2\2\u0132\u0133\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0135\7\37\2\2\u0135"+
		"\u0137\7\34\2\2\u0136\u0138\5&\24\2\u0137\u0136\3\2\2\2\u0137\u0138\3"+
		"\2\2\2\u0138\u0139\3\2\2\2\u0139\u013f\7\30\2\2\u013a\u013b\5<\37\2\u013b"+
		"\u013c\7\21\2\2\u013c\u013e\3\2\2\2\u013d\u013a\3\2\2\2\u013e\u0141\3"+
		"\2\2\2\u013f\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0142\3\2\2\2\u0141"+
		"\u013f\3\2\2\2\u0142\u0143\5<\37\2\u0143\u0144\7\31\2\2\u0144\u0145\5"+
		"\64\33\2\u0145\u0147\3\2\2\2\u0146\u00ee\3\2\2\2\u0146\u00f5\3\2\2\2\u0146"+
		"\u0105\3\2\2\2\u0146\u0119\3\2\2\2\u0146\u0132\3\2\2\2\u0147!\3\2\2\2"+
		"\u0148\u0149\5N(\2\u0149#\3\2\2\2\u014a\u014b\5N(\2\u014b%\3\2\2\2\u014c"+
		"\u014d\5N(\2\u014d\'\3\2\2\2\u014e\u0151\5> \2\u014f\u0152\5.\30\2\u0150"+
		"\u0152\5\60\31\2\u0151\u014f\3\2\2\2\u0151\u0150\3\2\2\2\u0151\u0152\3"+
		"\2\2\2\u0152\u0155\3\2\2\2\u0153\u0154\7\13\2\2\u0154\u0156\5,\27\2\u0155"+
		"\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0158\3\2\2\2\u0157\u0159\5*"+
		"\26\2\u0158\u0157\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u0162\3\2\2\2\u015a"+
		"\u015c\7\36\2\2\u015b\u015d\7\34\2\2\u015c\u015b\3\2\2\2\u015c\u015d\3"+
		"\2\2\2\u015d\u0163\3\2\2\2\u015e\u0160\7\33\2\2\u015f\u015e\3\2\2\2\u015f"+
		"\u0160\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u0163\7\34\2\2\u0162\u015a\3"+
		"\2\2\2\u0162\u015f\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0166\3\2\2\2\u0164"+
		"\u0165\7\20\2\2\u0165\u0167\5\62\32\2\u0166\u0164\3\2\2\2\u0166\u0167"+
		"\3\2\2\2\u0167)\3\2\2\2\u0168\u0169\7 \2\2\u0169+\3\2\2\2\u016a\u016b"+
		"\5H%\2\u016b-\3\2\2\2\u016c\u016d\7!\2\2\u016d/\3\2\2\2\u016e\u016f\7"+
		"\n\2\2\u016f\u0170\7!\2\2\u0170\61\3\2\2\2\u0171\u0172\7P\2\2\u0172\63"+
		"\3\2\2\2\u0173\u0174\7\"\2\2\u0174\u0175\5:\36\2\u0175\u017b\7\30\2\2"+
		"\u0176\u0177\5<\37\2\u0177\u0178\7\21\2\2\u0178\u017a\3\2\2\2\u0179\u0176"+
		"\3\2\2\2\u017a\u017d\3\2\2\2\u017b\u0179\3\2\2\2\u017b\u017c\3\2\2\2\u017c"+
		"\u017e\3\2\2\2\u017d\u017b\3\2\2\2\u017e\u017f\5<\37\2\u017f\u0183\7\31"+
		"\2\2\u0180\u0181\7#\2\2\u0181\u0182\7$\2\2\u0182\u0184\5\66\34\2\u0183"+
		"\u0180\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0188\3\2\2\2\u0185\u0186\7#"+
		"\2\2\u0186\u0187\7%\2\2\u0187\u0189\58\35\2\u0188\u0185\3\2\2\2\u0188"+
		"\u0189\3\2\2\2\u0189\65\3\2\2\2\u018a\u018b\5F$\2\u018b\67\3\2\2\2\u018c"+
		"\u018d\5F$\2\u018d9\3\2\2\2\u018e\u018f\5N(\2\u018f;\3\2\2\2\u0190\u0192"+
		"\5N(\2\u0191\u0193\t\5\2\2\u0192\u0191\3\2\2\2\u0192\u0193\3\2\2\2\u0193"+
		"=\3\2\2\2\u0194\u0198\7(\2\2\u0195\u0196\7\30\2\2\u0196\u0197\7N\2\2\u0197"+
		"\u0199\7\31\2\2\u0198\u0195\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u02ba\3"+
		"\2\2\2\u019a\u019e\7)\2\2\u019b\u019c\7\30\2\2\u019c\u019d\7N\2\2\u019d"+
		"\u019f\7\31\2\2\u019e\u019b\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01a1\3"+
		"\2\2\2\u01a0\u01a2\7*\2\2\u01a1\u01a0\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2"+
		"\u01a4\3\2\2\2\u01a3\u01a5\7+\2\2\u01a4\u01a3\3\2\2\2\u01a4\u01a5\3\2"+
		"\2\2\u01a5\u02ba\3\2\2\2\u01a6\u01aa\7,\2\2\u01a7\u01a8\7\30\2\2\u01a8"+
		"\u01a9\7N\2\2\u01a9\u01ab\7\31\2\2\u01aa\u01a7\3\2\2\2\u01aa\u01ab\3\2"+
		"\2\2\u01ab\u01ad\3\2\2\2\u01ac\u01ae\7*\2\2\u01ad\u01ac\3\2\2\2\u01ad"+
		"\u01ae\3\2\2\2\u01ae\u01b0\3\2\2\2\u01af\u01b1\7+\2\2\u01b0\u01af\3\2"+
		"\2\2\u01b0\u01b1\3\2\2\2\u01b1\u02ba\3\2\2\2\u01b2\u01b6\7-\2\2\u01b3"+
		"\u01b4\7\30\2\2\u01b4\u01b5\7N\2\2\u01b5\u01b7\7\31\2\2\u01b6\u01b3\3"+
		"\2\2\2\u01b6\u01b7\3\2\2\2\u01b7\u01b9\3\2\2\2\u01b8\u01ba\7*\2\2\u01b9"+
		"\u01b8\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01bc\3\2\2\2\u01bb\u01bd\7+"+
		"\2\2\u01bc\u01bb\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u02ba\3\2\2\2\u01be"+
		"\u01c2\7.\2\2\u01bf\u01c0\7\30\2\2\u01c0\u01c1\7N\2\2\u01c1\u01c3\7\31"+
		"\2\2\u01c2\u01bf\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01c5\3\2\2\2\u01c4"+
		"\u01c6\7*\2\2\u01c5\u01c4\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01c8\3\2"+
		"\2\2\u01c7\u01c9\7+\2\2\u01c8\u01c7\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9"+
		"\u02ba\3\2\2\2\u01ca\u01ce\7/\2\2\u01cb\u01cc\7\30\2\2\u01cc\u01cd\7N"+
		"\2\2\u01cd\u01cf\7\31\2\2\u01ce\u01cb\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf"+
		"\u01d1\3\2\2\2\u01d0\u01d2\7*\2\2\u01d1\u01d0\3\2\2\2\u01d1\u01d2\3\2"+
		"\2\2\u01d2\u01d4\3\2\2\2\u01d3\u01d5\7+\2\2\u01d4\u01d3\3\2\2\2\u01d4"+
		"\u01d5\3\2\2\2\u01d5\u02ba\3\2\2\2\u01d6\u01da\7\60\2\2\u01d7\u01d8\7"+
		"\30\2\2\u01d8\u01d9\7N\2\2\u01d9\u01db\7\31\2\2\u01da\u01d7\3\2\2\2\u01da"+
		"\u01db\3\2\2\2\u01db\u01dd\3\2\2\2\u01dc\u01de\7*\2\2\u01dd\u01dc\3\2"+
		"\2\2\u01dd\u01de\3\2\2\2\u01de\u01e0\3\2\2\2\u01df\u01e1\7+\2\2\u01e0"+
		"\u01df\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1\u02ba\3\2\2\2\u01e2\u01e8\7\61"+
		"\2\2\u01e3\u01e4\7\30\2\2\u01e4\u01e5\7N\2\2\u01e5\u01e6\7\21\2\2\u01e6"+
		"\u01e7\7N\2\2\u01e7\u01e9\7\31\2\2\u01e8\u01e3\3\2\2\2\u01e8\u01e9\3\2"+
		"\2\2\u01e9\u01eb\3\2\2\2\u01ea\u01ec\7*\2\2\u01eb\u01ea\3\2\2\2\u01eb"+
		"\u01ec\3\2\2\2\u01ec\u01ee\3\2\2\2\u01ed\u01ef\7+\2\2\u01ee\u01ed\3\2"+
		"\2\2\u01ee\u01ef\3\2\2\2\u01ef\u02ba\3\2\2\2\u01f0\u01f6\7\62\2\2\u01f1"+
		"\u01f2\7\30\2\2\u01f2\u01f3\7N\2\2\u01f3\u01f4\7\21\2\2\u01f4\u01f5\7"+
		"N\2\2\u01f5\u01f7\7\31\2\2\u01f6\u01f1\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7"+
		"\u01f9\3\2\2\2\u01f8\u01fa\7*\2\2\u01f9\u01f8\3\2\2\2\u01f9\u01fa\3\2"+
		"\2\2\u01fa\u01fc\3\2\2\2\u01fb\u01fd\7+\2\2\u01fc\u01fb\3\2\2\2\u01fc"+
		"\u01fd\3\2\2\2\u01fd\u02ba\3\2\2\2\u01fe\u0204\7\63\2\2\u01ff\u0200\7"+
		"\30\2\2\u0200\u0201\7N\2\2\u0201\u0202\7\21\2\2\u0202\u0203\7N\2\2\u0203"+
		"\u0205\7\31\2\2\u0204\u01ff\3\2\2\2\u0204\u0205\3\2\2\2\u0205\u0207\3"+
		"\2\2\2\u0206\u0208\7*\2\2\u0207\u0206\3\2\2\2\u0207\u0208\3\2\2\2\u0208"+
		"\u020a\3\2\2\2\u0209\u020b\7+\2\2\u020a\u0209\3\2\2\2\u020a\u020b\3\2"+
		"\2\2\u020b\u02ba\3\2\2\2\u020c\u0214\7\64\2\2\u020d\u020e\7\30\2\2\u020e"+
		"\u0211\7N\2\2\u020f\u0210\7\21\2\2\u0210\u0212\7N\2\2\u0211\u020f\3\2"+
		"\2\2\u0211\u0212\3\2\2\2\u0212\u0213\3\2\2\2\u0213\u0215\7\31\2\2\u0214"+
		"\u020d\3\2\2\2\u0214\u0215\3\2\2\2\u0215\u0217\3\2\2\2\u0216\u0218\7*"+
		"\2\2\u0217\u0216\3\2\2\2\u0217\u0218\3\2\2\2\u0218\u021a\3\2\2\2\u0219"+
		"\u021b\7+\2\2\u021a\u0219\3\2\2\2\u021a\u021b\3\2\2\2\u021b\u02ba\3\2"+
		"\2\2\u021c\u0224\7\65\2\2\u021d\u021e\7\30\2\2\u021e\u0221\7N\2\2\u021f"+
		"\u0220\7\21\2\2\u0220\u0222\7N\2\2\u0221\u021f\3\2\2\2\u0221\u0222\3\2"+
		"\2\2\u0222\u0223\3\2\2\2\u0223\u0225\7\31\2\2\u0224\u021d\3\2\2\2\u0224"+
		"\u0225\3\2\2\2\u0225\u0227\3\2\2\2\u0226\u0228\7*\2\2\u0227\u0226\3\2"+
		"\2\2\u0227\u0228\3\2\2\2\u0228\u022a\3\2\2\2\u0229\u022b\7+\2\2\u022a"+
		"\u0229\3\2\2\2\u022a\u022b\3\2\2\2\u022b\u02ba\3\2\2\2\u022c\u02ba\7\66"+
		"\2\2\u022d\u02ba\7\67\2\2\u022e\u02ba\78\2\2\u022f\u02ba\79\2\2\u0230"+
		"\u02ba\7:\2\2\u0231\u0235\7;\2\2\u0232\u0233\7\30\2\2\u0233\u0234\7N\2"+
		"\2\u0234\u0236\7\31\2\2\u0235\u0232\3\2\2\2\u0235\u0236\3\2\2\2\u0236"+
		"\u023a\3\2\2\2\u0237\u0238\7\f\2\2\u0238\u0239\7\r\2\2\u0239\u023b\5B"+
		"\"\2\u023a\u0237\3\2\2\2\u023a\u023b\3\2\2\2\u023b\u023e\3\2\2\2\u023c"+
		"\u023d\7\17\2\2\u023d\u023f\5D#\2\u023e\u023c\3\2\2\2\u023e\u023f\3\2"+
		"\2\2\u023f\u02ba\3\2\2\2\u0240\u0241\7<\2\2\u0241\u0242\7\30\2\2\u0242"+
		"\u0243\7N\2\2\u0243\u0247\7\31\2\2\u0244\u0245\7\f\2\2\u0245\u0246\7\r"+
		"\2\2\u0246\u0248\5B\"\2\u0247\u0244\3\2\2\2\u0247\u0248\3\2\2\2\u0248"+
		"\u024b\3\2\2\2\u0249\u024a\7\17\2\2\u024a\u024c\5D#\2\u024b\u0249\3\2"+
		"\2\2\u024b\u024c\3\2\2\2\u024c\u02ba\3\2\2\2\u024d\u0251\7=\2\2\u024e"+
		"\u024f\7\30\2\2\u024f\u0250\7N\2\2\u0250\u0252\7\31\2\2\u0251\u024e\3"+
		"\2\2\2\u0251\u0252\3\2\2\2\u0252\u02ba\3\2\2\2\u0253\u0254\7>\2\2\u0254"+
		"\u0255\7\30\2\2\u0255\u0256\7N\2\2\u0256\u02ba\7\31\2\2\u0257\u02ba\7"+
		"?\2\2\u0258\u02ba\7@\2\2\u0259\u02ba\7A\2\2\u025a\u02ba\7B\2\2\u025b\u025d"+
		"\7C\2\2\u025c\u025e\7=\2\2\u025d\u025c\3\2\2\2\u025d\u025e\3\2\2\2\u025e"+
		"\u0262\3\2\2\2\u025f\u0260\7\f\2\2\u0260\u0261\7\r\2\2\u0261\u0263\5B"+
		"\"\2\u0262\u025f\3\2\2\2\u0262\u0263\3\2\2\2\u0263\u0266\3\2\2\2\u0264"+
		"\u0265\7\17\2\2\u0265\u0267\5D#\2\u0266\u0264\3\2\2\2\u0266\u0267\3\2"+
		"\2\2\u0267\u02ba\3\2\2\2\u0268\u026a\7D\2\2\u0269\u026b\7=\2\2\u026a\u0269"+
		"\3\2\2\2\u026a\u026b\3\2\2\2\u026b\u026f\3\2\2\2\u026c\u026d\7\f\2\2\u026d"+
		"\u026e\7\r\2\2\u026e\u0270\5B\"\2\u026f\u026c\3\2\2\2\u026f\u0270\3\2"+
		"\2\2\u0270\u0273\3\2\2\2\u0271\u0272\7\17\2\2\u0272\u0274\5D#\2\u0273"+
		"\u0271\3\2\2\2\u0273\u0274\3\2\2\2\u0274\u02ba\3\2\2\2\u0275\u0277\7E"+
		"\2\2\u0276\u0278\7=\2\2\u0277\u0276\3\2\2\2\u0277\u0278\3\2\2\2\u0278"+
		"\u027c\3\2\2\2\u0279\u027a\7\f\2\2\u027a\u027b\7\r\2\2\u027b\u027d\5B"+
		"\"\2\u027c\u0279\3\2\2\2\u027c\u027d\3\2\2\2\u027d\u0280\3\2\2\2\u027e"+
		"\u027f\7\17\2\2\u027f\u0281\5D#\2\u0280\u027e\3\2\2\2\u0280\u0281\3\2"+
		"\2\2\u0281\u02ba\3\2\2\2\u0282\u0284\7F\2\2\u0283\u0285\7=\2\2\u0284\u0283"+
		"\3\2\2\2\u0284\u0285\3\2\2\2\u0285\u0289\3\2\2\2\u0286\u0287\7\f\2\2\u0287"+
		"\u0288\7\r\2\2\u0288\u028a\5B\"\2\u0289\u0286\3\2\2\2\u0289\u028a\3\2"+
		"\2\2\u028a\u028d\3\2\2\2\u028b\u028c\7\17\2\2\u028c\u028e\5D#\2\u028d"+
		"\u028b\3\2\2\2\u028d\u028e\3\2\2\2\u028e\u02ba\3\2\2\2\u028f\u0290\7G"+
		"\2\2\u0290\u0296\7\30\2\2\u0291\u0292\5@!\2\u0292\u0293\7\21\2\2\u0293"+
		"\u0295\3\2\2\2\u0294\u0291\3\2\2\2\u0295\u0298\3\2\2\2\u0296\u0294\3\2"+
		"\2\2\u0296\u0297\3\2\2\2\u0297\u0299\3\2\2\2\u0298\u0296\3\2\2\2\u0299"+
		"\u029a\5@!\2\u029a\u029e\7\31\2\2\u029b\u029c\7\f\2\2\u029c\u029d\7\r"+
		"\2\2\u029d\u029f\5B\"\2\u029e\u029b\3\2\2\2\u029e\u029f\3\2\2\2\u029f"+
		"\u02a2\3\2\2\2\u02a0\u02a1\7\17\2\2\u02a1\u02a3\5D#\2\u02a2\u02a0\3\2"+
		"\2\2\u02a2\u02a3\3\2\2\2\u02a3\u02ba\3\2\2\2\u02a4\u02a5\7\r\2\2\u02a5"+
		"\u02ab\7\30\2\2\u02a6\u02a7\5@!\2\u02a7\u02a8\7\21\2\2\u02a8\u02aa\3\2"+
		"\2\2\u02a9\u02a6\3\2\2\2\u02aa\u02ad\3\2\2\2\u02ab\u02a9\3\2\2\2\u02ab"+
		"\u02ac\3\2\2\2\u02ac\u02ae\3\2\2\2\u02ad\u02ab\3\2\2\2\u02ae\u02af\5@"+
		"!\2\u02af\u02b3\7\31\2\2\u02b0\u02b1\7\f\2\2\u02b1\u02b2\7\r\2\2\u02b2"+
		"\u02b4\5B\"\2\u02b3\u02b0\3\2\2\2\u02b3\u02b4\3\2\2\2\u02b4\u02b7\3\2"+
		"\2\2\u02b5\u02b6\7\17\2\2\u02b6\u02b8\5D#\2\u02b7\u02b5\3\2\2\2\u02b7"+
		"\u02b8\3\2\2\2\u02b8\u02ba\3\2\2\2\u02b9\u0194\3\2\2\2\u02b9\u019a\3\2"+
		"\2\2\u02b9\u01a6\3\2\2\2\u02b9\u01b2\3\2\2\2\u02b9\u01be\3\2\2\2\u02b9"+
		"\u01ca\3\2\2\2\u02b9\u01d6\3\2\2\2\u02b9\u01e2\3\2\2\2\u02b9\u01f0\3\2"+
		"\2\2\u02b9\u01fe\3\2\2\2\u02b9\u020c\3\2\2\2\u02b9\u021c\3\2\2\2\u02b9"+
		"\u022c\3\2\2\2\u02b9\u022d\3\2\2\2\u02b9\u022e\3\2\2\2\u02b9\u022f\3\2"+
		"\2\2\u02b9\u0230\3\2\2\2\u02b9\u0231\3\2\2\2\u02b9\u0240\3\2\2\2\u02b9"+
		"\u024d\3\2\2\2\u02b9\u0253\3\2\2\2\u02b9\u0257\3\2\2\2\u02b9\u0258\3\2"+
		"\2\2\u02b9\u0259\3\2\2\2\u02b9\u025a\3\2\2\2\u02b9\u025b\3\2\2\2\u02b9"+
		"\u0268\3\2\2\2\u02b9\u0275\3\2\2\2\u02b9\u0282\3\2\2\2\u02b9\u028f\3\2"+
		"\2\2\u02b9\u02a4\3\2\2\2\u02ba?\3\2\2\2\u02bb\u02bc\7P\2\2\u02bcA\3\2"+
		"\2\2\u02bd\u02be\5N(\2\u02beC\3\2\2\2\u02bf\u02c0\5N(\2\u02c0E\3\2\2\2"+
		"\u02c1\u02c8\7\26\2\2\u02c2\u02c8\7\27\2\2\u02c3\u02c4\7\r\2\2\u02c4\u02c8"+
		"\7!\2\2\u02c5\u02c6\7H\2\2\u02c6\u02c8\7I\2\2\u02c7\u02c1\3\2\2\2\u02c7"+
		"\u02c2\3\2\2\2\u02c7\u02c3\3\2\2\2\u02c7\u02c5\3\2\2\2\u02c8G\3\2\2\2"+
		"\u02c9\u02ca\t\6\2\2\u02caI\3\2\2\2\u02cb\u02cd\5L\'\2\u02cc\u02cb\3\2"+
		"\2\2\u02cd\u02d0\3\2\2\2\u02ce\u02cc\3\2\2\2\u02ce\u02cf\3\2\2\2\u02cf"+
		"K\3\2\2\2\u02d0\u02ce\3\2\2\2\u02d1\u02d2\7M\2\2\u02d2\u02d3\7\16\2\2"+
		"\u02d3\u02d6\7M\2\2\u02d4\u02d6\5\n\6\2\u02d5\u02d1\3\2\2\2\u02d5\u02d4"+
		"\3\2\2\2\u02d6M\3\2\2\2\u02d7\u02d8\7J\2\2\u02d8\u02d9\7M\2\2\u02d9\u02e2"+
		"\7J\2\2\u02da\u02db\7K\2\2\u02db\u02dc\7M\2\2\u02dc\u02e2\7K\2\2\u02dd"+
		"\u02de\7L\2\2\u02de\u02df\7M\2\2\u02df\u02e2\7L\2\2\u02e0\u02e2\7M\2\2"+
		"\u02e1\u02d7\3\2\2\2\u02e1\u02da\3\2\2\2\u02e1\u02dd\3\2\2\2\u02e1\u02e0"+
		"\3\2\2\2\u02e2O\3\2\2\2sShnw}\u0081\u0086\u008a\u008e\u0094\u009e\u00a6"+
		"\u00af\u00b3\u00bc\u00c1\u00c8\u00cc\u00d2\u00d8\u00dd\u00e9\u00f3\u00f5"+
		"\u00ff\u0107\u010f\u0117\u0119\u011d\u0120\u0128\u0130\u0132\u0137\u013f"+
		"\u0146\u0151\u0155\u0158\u015c\u015f\u0162\u0166\u017b\u0183\u0188\u0192"+
		"\u0198\u019e\u01a1\u01a4\u01aa\u01ad\u01b0\u01b6\u01b9\u01bc\u01c2\u01c5"+
		"\u01c8\u01ce\u01d1\u01d4\u01da\u01dd\u01e0\u01e8\u01eb\u01ee\u01f6\u01f9"+
		"\u01fc\u0204\u0207\u020a\u0211\u0214\u0217\u021a\u0221\u0224\u0227\u022a"+
		"\u0235\u023a\u023e\u0247\u024b\u0251\u025d\u0262\u0266\u026a\u026f\u0273"+
		"\u0277\u027c\u0280\u0284\u0289\u028d\u0296\u029e\u02a2\u02ab\u02b3\u02b7"+
		"\u02b9\u02c7\u02ce\u02d5\u02e1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}