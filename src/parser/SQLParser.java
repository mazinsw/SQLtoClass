// Generated from .\src\parser\SQL.g4 by ANTLR 4.5.3
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
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

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
		RULE_dropTableName = 11, RULE_createTable = 12, RULE_tableName = 13, RULE_createDefinition = 14, 
		RULE_columnName = 15, RULE_constraintName = 16, RULE_constraintTable = 17, 
		RULE_columnDefinition = 18, RULE_autoIncrement = 19, RULE_columnDefaultValue = 20, 
		RULE_defaultNull = 21, RULE_defaultNotNull = 22, RULE_fieldComment = 23, 
		RULE_referenceDefinition = 24, RULE_referenceTable = 25, RULE_indexColName = 26, 
		RULE_dataType = 27, RULE_stringItem = 28, RULE_charsetName = 29, RULE_collateName = 30, 
		RULE_referenceOption = 31, RULE_defaultValue = 32, RULE_tableOptions = 33, 
		RULE_option = 34, RULE_idName = 35;
	public static final String[] ruleNames = {
		"script", "stmt", "dropSchema", "createSchema", "createSpecification", 
		"tableComment", "setStmt", "setOption", "setDefaultValue", "useStmt", 
		"dropTable", "dropTableName", "createTable", "tableName", "createDefinition", 
		"columnName", "constraintName", "constraintTable", "columnDefinition", 
		"autoIncrement", "columnDefaultValue", "defaultNull", "defaultNotNull", 
		"fieldComment", "referenceDefinition", "referenceTable", "indexColName", 
		"dataType", "stringItem", "charsetName", "collateName", "referenceOption", 
		"defaultValue", "tableOptions", "option", "idName"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'DROP'", "'DATABASE'", "'SCHEMA'", "'IF'", "'EXISTS'", "'CREATE'", 
		"'NOT'", "'DEFAULT'", "'CHARACTER'", "'SET'", "'='", "'COLLATE'", "'COMMENT'", 
		"','", "'@'", "'USE'", "'TEMPORARY'", "'TABLE'", "'RESTRICT'", "'CASCADE'", 
		"'('", "')'", "'CONSTRAINT'", "'PRIMARY'", "'KEY'", "'INDEX'", "'UNIQUE'", 
		"'FOREIGN'", "'AUTO_INCREMENT'", "'NULL'", "'REFERENCES'", "'ON'", "'DELETE'", 
		"'UPDATE'", "'ASC'", "'DESC'", "'BIT'", "'TINYINT'", "'UNSIGNED'", "'ZEROFILL'", 
		"'SMALLINT'", "'MEDIUMINT'", "'INT'", "'INTEGER'", "'BIGINT'", "'REAL'", 
		"'DOUBLE'", "'FLOAT'", "'DECIMAL'", "'NUMERIC'", "'DATE'", "'TIME'", "'TIMESTAMP'", 
		"'DATETIME'", "'YEAR'", "'CHAR'", "'VARCHAR'", "'BINARY'", "'VARBINARY'", 
		"'TINYBLOB'", "'BLOB'", "'MEDIUMBLOB'", "'LONGBLOB'", "'TINYTEXT'", "'TEXT'", 
		"'MEDIUMTEXT'", "'LONGTEXT'", "'ENUM'", "'NO'", "'ACTION'", "'`'", "'''", 
		"'\"'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "NAME", "INT", "FLOAT", "STRING", "COMMENT", "SINGLE_COMMENT", 
		"WS"
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
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__6) | (1L << T__10) | (1L << T__16))) != 0)) {
				{
				{
				setState(72);
				stmt();
				}
				}
				setState(77);
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
			setState(96);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				createSchema();
				setState(79);
				match(T__0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				dropSchema();
				setState(82);
				match(T__0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(84);
				createTable();
				setState(85);
				match(T__0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(87);
				dropTable();
				setState(88);
				match(T__0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(90);
				useStmt();
				setState(91);
				match(T__0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(93);
				setStmt();
				setState(94);
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
			setState(98);
			match(T__1);
			setState(99);
			_la = _input.LA(1);
			if ( !(_la==T__2 || _la==T__3) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(102);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(100);
				match(T__4);
				setState(101);
				match(T__5);
				}
			}

			setState(104);
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
			setState(106);
			match(T__6);
			setState(107);
			_la = _input.LA(1);
			if ( !(_la==T__2 || _la==T__3) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(111);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(108);
				match(T__4);
				setState(109);
				match(T__7);
				setState(110);
				match(T__5);
				}
			}

			setState(113);
			idName();
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__12) | (1L << T__13))) != 0)) {
				{
				{
				setState(114);
				createSpecification();
				}
				}
				setState(119);
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
			setState(140);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(120);
					match(T__8);
					}
				}

				setState(123);
				match(T__9);
				setState(124);
				match(T__10);
				setState(126);
				_la = _input.LA(1);
				if (_la==T__11) {
					{
					setState(125);
					match(T__11);
					}
				}

				setState(128);
				charsetName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(129);
					match(T__8);
					}
				}

				setState(132);
				match(T__12);
				setState(134);
				_la = _input.LA(1);
				if (_la==T__11) {
					{
					setState(133);
					match(T__11);
					}
				}

				setState(136);
				collateName();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(137);
				match(T__13);
				setState(138);
				match(T__11);
				setState(139);
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
			setState(142);
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
			setState(144);
			match(T__10);
			setState(150);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(145);
					setOption();
					setState(146);
					match(T__14);
					}
					} 
				}
				setState(152);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(153);
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
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(155);
				match(T__15);
				}
				}
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(161);
			match(NAME);
			setState(162);
			match(T__11);
			setState(171);
			switch (_input.LA(1)) {
			case T__30:
			case INT:
			case FLOAT:
			case STRING:
				{
				setState(163);
				setDefaultValue();
				}
				break;
			case T__15:
			case NAME:
				{
				{
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(164);
					match(T__15);
					}
					}
					setState(169);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(170);
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
			setState(173);
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
			setState(175);
			match(T__16);
			setState(176);
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
			setState(178);
			match(T__1);
			setState(180);
			_la = _input.LA(1);
			if (_la==T__17) {
				{
				setState(179);
				match(T__17);
				}
			}

			setState(182);
			match(T__18);
			setState(185);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(183);
				match(T__4);
				setState(184);
				match(T__5);
				}
			}

			setState(187);
			dropTableName();
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(188);
				match(T__14);
				setState(189);
				dropTableName();
				}
				}
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(196);
			_la = _input.LA(1);
			if (_la==T__19 || _la==T__20) {
				{
				setState(195);
				_la = _input.LA(1);
				if ( !(_la==T__19 || _la==T__20) ) {
				_errHandler.recoverInline(this);
				} else {
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
			setState(198);
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
		public List<CreateDefinitionContext> createDefinition() {
			return getRuleContexts(CreateDefinitionContext.class);
		}
		public CreateDefinitionContext createDefinition(int i) {
			return getRuleContext(CreateDefinitionContext.class,i);
		}
		public TableOptionsContext tableOptions() {
			return getRuleContext(TableOptionsContext.class,0);
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(T__6);
			setState(202);
			_la = _input.LA(1);
			if (_la==T__17) {
				{
				setState(201);
				match(T__17);
				}
			}

			setState(204);
			match(T__18);
			setState(208);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(205);
				match(T__4);
				setState(206);
				match(T__7);
				setState(207);
				match(T__5);
				}
			}

			setState(210);
			tableName();
			setState(211);
			match(T__21);
			setState(217);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(212);
					createDefinition();
					setState(213);
					match(T__14);
					}
					} 
				}
				setState(219);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			setState(220);
			createDefinition();
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

	public final CreateDefinitionContext createDefinition() throws RecognitionException {
		CreateDefinitionContext _localctx = new CreateDefinitionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_createDefinition);
		int _la;
		try {
			int _alt;
			setState(314);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				_localctx = new FieldStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(226);
				columnName();
				setState(227);
				columnDefinition();
				}
				break;
			case 2:
				_localctx = new PrimaryKeyStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(233);
				_la = _input.LA(1);
				if (_la==T__23) {
					{
					setState(229);
					match(T__23);
					setState(231);
					_la = _input.LA(1);
					if (((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (T__71 - 72)) | (1L << (T__72 - 72)) | (1L << (T__73 - 72)) | (1L << (NAME - 72)))) != 0)) {
						{
						setState(230);
						constraintName();
						}
					}

					}
				}

				setState(235);
				match(T__24);
				setState(236);
				match(T__25);
				setState(237);
				match(T__21);
				setState(243);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(238);
						indexColName();
						setState(239);
						match(T__14);
						}
						} 
					}
					setState(245);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				}
				setState(246);
				indexColName();
				setState(247);
				match(T__22);
				}
				break;
			case 3:
				_localctx = new IndexStmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(249);
				_la = _input.LA(1);
				if ( !(_la==T__25 || _la==T__26) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(251);
				_la = _input.LA(1);
				if (((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (T__71 - 72)) | (1L << (T__72 - 72)) | (1L << (T__73 - 72)) | (1L << (NAME - 72)))) != 0)) {
					{
					setState(250);
					constraintName();
					}
				}

				setState(253);
				match(T__21);
				setState(259);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(254);
						indexColName();
						setState(255);
						match(T__14);
						}
						} 
					}
					setState(261);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				}
				setState(262);
				indexColName();
				setState(263);
				match(T__22);
				}
				break;
			case 4:
				_localctx = new UniqueStmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(269);
				_la = _input.LA(1);
				if (_la==T__23) {
					{
					setState(265);
					match(T__23);
					setState(267);
					_la = _input.LA(1);
					if (((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (T__71 - 72)) | (1L << (T__72 - 72)) | (1L << (T__73 - 72)) | (1L << (NAME - 72)))) != 0)) {
						{
						setState(266);
						constraintName();
						}
					}

					}
				}

				setState(271);
				match(T__27);
				setState(273);
				_la = _input.LA(1);
				if (_la==T__25 || _la==T__26) {
					{
					setState(272);
					_la = _input.LA(1);
					if ( !(_la==T__25 || _la==T__26) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
				}

				setState(276);
				_la = _input.LA(1);
				if (((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (T__71 - 72)) | (1L << (T__72 - 72)) | (1L << (T__73 - 72)) | (1L << (NAME - 72)))) != 0)) {
					{
					setState(275);
					constraintTable();
					}
				}

				setState(278);
				match(T__21);
				setState(284);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(279);
						indexColName();
						setState(280);
						match(T__14);
						}
						} 
					}
					setState(286);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				}
				setState(287);
				indexColName();
				setState(288);
				match(T__22);
				}
				break;
			case 5:
				_localctx = new ForeignStmtContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(294);
				_la = _input.LA(1);
				if (_la==T__23) {
					{
					setState(290);
					match(T__23);
					setState(292);
					_la = _input.LA(1);
					if (((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (T__71 - 72)) | (1L << (T__72 - 72)) | (1L << (T__73 - 72)) | (1L << (NAME - 72)))) != 0)) {
						{
						setState(291);
						constraintName();
						}
					}

					}
				}

				setState(296);
				match(T__28);
				setState(297);
				match(T__25);
				setState(299);
				_la = _input.LA(1);
				if (((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (T__71 - 72)) | (1L << (T__72 - 72)) | (1L << (T__73 - 72)) | (1L << (NAME - 72)))) != 0)) {
					{
					setState(298);
					constraintTable();
					}
				}

				setState(301);
				match(T__21);
				setState(307);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(302);
						indexColName();
						setState(303);
						match(T__14);
						}
						} 
					}
					setState(309);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				}
				setState(310);
				indexColName();
				setState(311);
				match(T__22);
				setState(312);
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
		enterRule(_localctx, 30, RULE_columnName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
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
		enterRule(_localctx, 32, RULE_constraintName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
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
		enterRule(_localctx, 34, RULE_constraintTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
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
		enterRule(_localctx, 36, RULE_columnDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			dataType();
			setState(325);
			switch (_input.LA(1)) {
			case T__30:
				{
				setState(323);
				defaultNull();
				}
				break;
			case T__7:
				{
				setState(324);
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
				throw new NoViableAltException(this);
			}
			setState(329);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(327);
				match(T__8);
				setState(328);
				columnDefaultValue();
				}
			}

			setState(332);
			_la = _input.LA(1);
			if (_la==T__29) {
				{
				setState(331);
				autoIncrement();
				}
			}

			setState(342);
			switch (_input.LA(1)) {
			case T__27:
				{
				{
				setState(334);
				match(T__27);
				setState(336);
				_la = _input.LA(1);
				if (_la==T__25) {
					{
					setState(335);
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
				setState(339);
				_la = _input.LA(1);
				if (_la==T__24) {
					{
					setState(338);
					match(T__24);
					}
				}

				setState(341);
				match(T__25);
				}
				}
				break;
			case T__13:
			case T__14:
			case T__22:
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(346);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(344);
				match(T__13);
				setState(345);
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
		enterRule(_localctx, 38, RULE_autoIncrement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
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
		enterRule(_localctx, 40, RULE_columnDefaultValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
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
		enterRule(_localctx, 42, RULE_defaultNull);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
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
		enterRule(_localctx, 44, RULE_defaultNotNull);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			match(T__7);
			setState(355);
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
		enterRule(_localctx, 46, RULE_fieldComment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
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
		public List<ReferenceOptionContext> referenceOption() {
			return getRuleContexts(ReferenceOptionContext.class);
		}
		public ReferenceOptionContext referenceOption(int i) {
			return getRuleContext(ReferenceOptionContext.class,i);
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
		enterRule(_localctx, 48, RULE_referenceDefinition);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			match(T__31);
			setState(360);
			referenceTable();
			setState(361);
			match(T__21);
			setState(367);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(362);
					indexColName();
					setState(363);
					match(T__14);
					}
					} 
				}
				setState(369);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			}
			setState(370);
			indexColName();
			setState(371);
			match(T__22);
			setState(375);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(372);
				match(T__32);
				setState(373);
				match(T__33);
				setState(374);
				referenceOption();
				}
				break;
			}
			setState(380);
			_la = _input.LA(1);
			if (_la==T__32) {
				{
				setState(377);
				match(T__32);
				setState(378);
				match(T__34);
				setState(379);
				referenceOption();
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
		enterRule(_localctx, 50, RULE_referenceTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
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
		enterRule(_localctx, 52, RULE_indexColName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			idName();
			setState(386);
			_la = _input.LA(1);
			if (_la==T__35 || _la==T__36) {
				{
				setState(385);
				((IndexColNameContext)_localctx).Type = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__35 || _la==T__36) ) {
					((IndexColNameContext)_localctx).Type = (Token)_errHandler.recoverInline(this);
				} else {
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

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_dataType);
		int _la;
		try {
			int _alt;
			setState(681);
			switch (_input.LA(1)) {
			case T__37:
				_localctx = new TypeBitStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(388);
				match(T__37);
				setState(392);
				_la = _input.LA(1);
				if (_la==T__21) {
					{
					setState(389);
					match(T__21);
					setState(390);
					match(INT);
					setState(391);
					match(T__22);
					}
				}

				}
				break;
			case T__38:
				_localctx = new TypeTinyIntStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(394);
				match(T__38);
				setState(398);
				_la = _input.LA(1);
				if (_la==T__21) {
					{
					setState(395);
					match(T__21);
					setState(396);
					match(INT);
					setState(397);
					match(T__22);
					}
				}

				setState(401);
				_la = _input.LA(1);
				if (_la==T__39) {
					{
					setState(400);
					match(T__39);
					}
				}

				setState(404);
				_la = _input.LA(1);
				if (_la==T__40) {
					{
					setState(403);
					match(T__40);
					}
				}

				}
				break;
			case T__41:
				_localctx = new TypeSmallIntStmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(406);
				match(T__41);
				setState(410);
				_la = _input.LA(1);
				if (_la==T__21) {
					{
					setState(407);
					match(T__21);
					setState(408);
					match(INT);
					setState(409);
					match(T__22);
					}
				}

				setState(413);
				_la = _input.LA(1);
				if (_la==T__39) {
					{
					setState(412);
					match(T__39);
					}
				}

				setState(416);
				_la = _input.LA(1);
				if (_la==T__40) {
					{
					setState(415);
					match(T__40);
					}
				}

				}
				break;
			case T__42:
				_localctx = new TypeMediumIntStmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(418);
				match(T__42);
				setState(422);
				_la = _input.LA(1);
				if (_la==T__21) {
					{
					setState(419);
					match(T__21);
					setState(420);
					match(INT);
					setState(421);
					match(T__22);
					}
				}

				setState(425);
				_la = _input.LA(1);
				if (_la==T__39) {
					{
					setState(424);
					match(T__39);
					}
				}

				setState(428);
				_la = _input.LA(1);
				if (_la==T__40) {
					{
					setState(427);
					match(T__40);
					}
				}

				}
				break;
			case T__43:
				_localctx = new TypeIntStmtContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(430);
				match(T__43);
				setState(434);
				_la = _input.LA(1);
				if (_la==T__21) {
					{
					setState(431);
					match(T__21);
					setState(432);
					match(INT);
					setState(433);
					match(T__22);
					}
				}

				setState(437);
				_la = _input.LA(1);
				if (_la==T__39) {
					{
					setState(436);
					match(T__39);
					}
				}

				setState(440);
				_la = _input.LA(1);
				if (_la==T__40) {
					{
					setState(439);
					match(T__40);
					}
				}

				}
				break;
			case T__44:
				_localctx = new TypeIntegerStmtContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(442);
				match(T__44);
				setState(446);
				_la = _input.LA(1);
				if (_la==T__21) {
					{
					setState(443);
					match(T__21);
					setState(444);
					match(INT);
					setState(445);
					match(T__22);
					}
				}

				setState(449);
				_la = _input.LA(1);
				if (_la==T__39) {
					{
					setState(448);
					match(T__39);
					}
				}

				setState(452);
				_la = _input.LA(1);
				if (_la==T__40) {
					{
					setState(451);
					match(T__40);
					}
				}

				}
				break;
			case T__45:
				_localctx = new TypeBigIntStmtContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(454);
				match(T__45);
				setState(458);
				_la = _input.LA(1);
				if (_la==T__21) {
					{
					setState(455);
					match(T__21);
					setState(456);
					match(INT);
					setState(457);
					match(T__22);
					}
				}

				setState(461);
				_la = _input.LA(1);
				if (_la==T__39) {
					{
					setState(460);
					match(T__39);
					}
				}

				setState(464);
				_la = _input.LA(1);
				if (_la==T__40) {
					{
					setState(463);
					match(T__40);
					}
				}

				}
				break;
			case T__46:
				_localctx = new TypeRealStmtContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(466);
				match(T__46);
				setState(472);
				_la = _input.LA(1);
				if (_la==T__21) {
					{
					setState(467);
					match(T__21);
					setState(468);
					match(INT);
					setState(469);
					match(T__14);
					setState(470);
					match(INT);
					setState(471);
					match(T__22);
					}
				}

				setState(475);
				_la = _input.LA(1);
				if (_la==T__39) {
					{
					setState(474);
					match(T__39);
					}
				}

				setState(478);
				_la = _input.LA(1);
				if (_la==T__40) {
					{
					setState(477);
					match(T__40);
					}
				}

				}
				break;
			case T__47:
				_localctx = new TypeDoubleStmtContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(480);
				match(T__47);
				setState(486);
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
				_la = _input.LA(1);
				if (_la==T__39) {
					{
					setState(488);
					match(T__39);
					}
				}

				setState(492);
				_la = _input.LA(1);
				if (_la==T__40) {
					{
					setState(491);
					match(T__40);
					}
				}

				}
				break;
			case T__48:
				_localctx = new TypeFloatStmtContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(494);
				match(T__48);
				setState(500);
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
				_la = _input.LA(1);
				if (_la==T__39) {
					{
					setState(502);
					match(T__39);
					}
				}

				setState(506);
				_la = _input.LA(1);
				if (_la==T__40) {
					{
					setState(505);
					match(T__40);
					}
				}

				}
				break;
			case T__49:
				_localctx = new TypeDecimalStmtContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(508);
				match(T__49);
				setState(516);
				_la = _input.LA(1);
				if (_la==T__21) {
					{
					setState(509);
					match(T__21);
					setState(510);
					match(INT);
					setState(513);
					_la = _input.LA(1);
					if (_la==T__14) {
						{
						setState(511);
						match(T__14);
						setState(512);
						match(INT);
						}
					}

					setState(515);
					match(T__22);
					}
				}

				setState(519);
				_la = _input.LA(1);
				if (_la==T__39) {
					{
					setState(518);
					match(T__39);
					}
				}

				setState(522);
				_la = _input.LA(1);
				if (_la==T__40) {
					{
					setState(521);
					match(T__40);
					}
				}

				}
				break;
			case T__50:
				_localctx = new TypeNumericStmtContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(524);
				match(T__50);
				setState(532);
				_la = _input.LA(1);
				if (_la==T__21) {
					{
					setState(525);
					match(T__21);
					setState(526);
					match(INT);
					setState(529);
					_la = _input.LA(1);
					if (_la==T__14) {
						{
						setState(527);
						match(T__14);
						setState(528);
						match(INT);
						}
					}

					setState(531);
					match(T__22);
					}
				}

				setState(535);
				_la = _input.LA(1);
				if (_la==T__39) {
					{
					setState(534);
					match(T__39);
					}
				}

				setState(538);
				_la = _input.LA(1);
				if (_la==T__40) {
					{
					setState(537);
					match(T__40);
					}
				}

				}
				break;
			case T__51:
				_localctx = new TypeDateStmtContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(540);
				match(T__51);
				}
				break;
			case T__52:
				_localctx = new TypeTimeStmtContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(541);
				match(T__52);
				}
				break;
			case T__53:
				_localctx = new TypeTimeStampStmtContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(542);
				match(T__53);
				}
				break;
			case T__54:
				_localctx = new TypeDateTimeStmtContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(543);
				match(T__54);
				}
				break;
			case T__55:
				_localctx = new TypeYearStmtContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(544);
				match(T__55);
				}
				break;
			case T__56:
				_localctx = new TypeCharStmtContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(545);
				match(T__56);
				setState(549);
				_la = _input.LA(1);
				if (_la==T__21) {
					{
					setState(546);
					match(T__21);
					setState(547);
					match(INT);
					setState(548);
					match(T__22);
					}
				}

				setState(554);
				_la = _input.LA(1);
				if (_la==T__9) {
					{
					setState(551);
					match(T__9);
					setState(552);
					match(T__10);
					setState(553);
					charsetName();
					}
				}

				setState(558);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(556);
					match(T__12);
					setState(557);
					collateName();
					}
				}

				}
				break;
			case T__57:
				_localctx = new TypeVarCharStmtContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(560);
				match(T__57);
				setState(561);
				match(T__21);
				setState(562);
				match(INT);
				setState(563);
				match(T__22);
				setState(567);
				_la = _input.LA(1);
				if (_la==T__9) {
					{
					setState(564);
					match(T__9);
					setState(565);
					match(T__10);
					setState(566);
					charsetName();
					}
				}

				setState(571);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(569);
					match(T__12);
					setState(570);
					collateName();
					}
				}

				}
				break;
			case T__58:
				_localctx = new TypeBinaryStmtContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(573);
				match(T__58);
				setState(577);
				_la = _input.LA(1);
				if (_la==T__21) {
					{
					setState(574);
					match(T__21);
					setState(575);
					match(INT);
					setState(576);
					match(T__22);
					}
				}

				}
				break;
			case T__59:
				_localctx = new TypeVarBinaryStmtContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(579);
				match(T__59);
				setState(580);
				match(T__21);
				setState(581);
				match(INT);
				setState(582);
				match(T__22);
				}
				break;
			case T__60:
				_localctx = new TypeTinyBlobStmtContext(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(583);
				match(T__60);
				}
				break;
			case T__61:
				_localctx = new TypeBlobStmtContext(_localctx);
				enterOuterAlt(_localctx, 23);
				{
				setState(584);
				match(T__61);
				}
				break;
			case T__62:
				_localctx = new TypeMediumBlobStmtContext(_localctx);
				enterOuterAlt(_localctx, 24);
				{
				setState(585);
				match(T__62);
				}
				break;
			case T__63:
				_localctx = new TypeLongBlobStmtContext(_localctx);
				enterOuterAlt(_localctx, 25);
				{
				setState(586);
				match(T__63);
				}
				break;
			case T__64:
				_localctx = new TypeTinyTextStmtContext(_localctx);
				enterOuterAlt(_localctx, 26);
				{
				setState(587);
				match(T__64);
				setState(589);
				_la = _input.LA(1);
				if (_la==T__58) {
					{
					setState(588);
					match(T__58);
					}
				}

				setState(594);
				_la = _input.LA(1);
				if (_la==T__9) {
					{
					setState(591);
					match(T__9);
					setState(592);
					match(T__10);
					setState(593);
					charsetName();
					}
				}

				setState(598);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(596);
					match(T__12);
					setState(597);
					collateName();
					}
				}

				}
				break;
			case T__65:
				_localctx = new TypeTextStmtContext(_localctx);
				enterOuterAlt(_localctx, 27);
				{
				setState(600);
				match(T__65);
				setState(602);
				_la = _input.LA(1);
				if (_la==T__58) {
					{
					setState(601);
					match(T__58);
					}
				}

				setState(607);
				_la = _input.LA(1);
				if (_la==T__9) {
					{
					setState(604);
					match(T__9);
					setState(605);
					match(T__10);
					setState(606);
					charsetName();
					}
				}

				setState(611);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(609);
					match(T__12);
					setState(610);
					collateName();
					}
				}

				}
				break;
			case T__66:
				_localctx = new TypeMediumTextStmtContext(_localctx);
				enterOuterAlt(_localctx, 28);
				{
				setState(613);
				match(T__66);
				setState(615);
				_la = _input.LA(1);
				if (_la==T__58) {
					{
					setState(614);
					match(T__58);
					}
				}

				setState(620);
				_la = _input.LA(1);
				if (_la==T__9) {
					{
					setState(617);
					match(T__9);
					setState(618);
					match(T__10);
					setState(619);
					charsetName();
					}
				}

				setState(624);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(622);
					match(T__12);
					setState(623);
					collateName();
					}
				}

				}
				break;
			case T__67:
				_localctx = new TypeLongTextStmtContext(_localctx);
				enterOuterAlt(_localctx, 29);
				{
				setState(626);
				match(T__67);
				setState(628);
				_la = _input.LA(1);
				if (_la==T__58) {
					{
					setState(627);
					match(T__58);
					}
				}

				setState(633);
				_la = _input.LA(1);
				if (_la==T__9) {
					{
					setState(630);
					match(T__9);
					setState(631);
					match(T__10);
					setState(632);
					charsetName();
					}
				}

				setState(637);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(635);
					match(T__12);
					setState(636);
					collateName();
					}
				}

				}
				break;
			case T__68:
				_localctx = new TypeEnumStmtContext(_localctx);
				enterOuterAlt(_localctx, 30);
				{
				setState(639);
				match(T__68);
				setState(640);
				match(T__21);
				setState(646);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(641);
						stringItem();
						setState(642);
						match(T__14);
						}
						} 
					}
					setState(648);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
				}
				setState(649);
				stringItem();
				setState(650);
				match(T__22);
				setState(654);
				_la = _input.LA(1);
				if (_la==T__9) {
					{
					setState(651);
					match(T__9);
					setState(652);
					match(T__10);
					setState(653);
					charsetName();
					}
				}

				setState(658);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(656);
					match(T__12);
					setState(657);
					collateName();
					}
				}

				}
				break;
			case T__10:
				_localctx = new TypeSetStmtContext(_localctx);
				enterOuterAlt(_localctx, 31);
				{
				setState(660);
				match(T__10);
				setState(661);
				match(T__21);
				setState(667);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(662);
						stringItem();
						setState(663);
						match(T__14);
						}
						} 
					}
					setState(669);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
				}
				setState(670);
				stringItem();
				setState(671);
				match(T__22);
				setState(675);
				_la = _input.LA(1);
				if (_la==T__9) {
					{
					setState(672);
					match(T__9);
					setState(673);
					match(T__10);
					setState(674);
					charsetName();
					}
				}

				setState(679);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(677);
					match(T__12);
					setState(678);
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
		enterRule(_localctx, 56, RULE_stringItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(683);
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
		enterRule(_localctx, 58, RULE_charsetName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(685);
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
		enterRule(_localctx, 60, RULE_collateName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(687);
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
		enterRule(_localctx, 62, RULE_referenceOption);
		try {
			setState(695);
			switch (_input.LA(1)) {
			case T__19:
				enterOuterAlt(_localctx, 1);
				{
				setState(689);
				match(T__19);
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 2);
				{
				setState(690);
				match(T__20);
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(691);
				match(T__10);
				setState(692);
				match(T__30);
				}
				}
				break;
			case T__69:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(693);
				match(T__69);
				setState(694);
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
		enterRule(_localctx, 64, RULE_defaultValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(697);
			_la = _input.LA(1);
			if ( !(((((_la - 31)) & ~0x3f) == 0 && ((1L << (_la - 31)) & ((1L << (T__30 - 31)) | (1L << (INT - 31)) | (1L << (FLOAT - 31)) | (1L << (STRING - 31)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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
		enterRule(_localctx, 66, RULE_tableOptions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(702);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__12) | (1L << T__13))) != 0) || _la==NAME) {
				{
				{
				setState(699);
				option();
				}
				}
				setState(704);
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
		enterRule(_localctx, 68, RULE_option);
		try {
			setState(709);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(705);
				match(NAME);
				setState(706);
				match(T__11);
				setState(707);
				match(NAME);
				}
				break;
			case T__8:
			case T__9:
			case T__12:
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(708);
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
		enterRule(_localctx, 70, RULE_idName);
		try {
			setState(721);
			switch (_input.LA(1)) {
			case T__71:
				enterOuterAlt(_localctx, 1);
				{
				setState(711);
				match(T__71);
				setState(712);
				match(NAME);
				setState(713);
				match(T__71);
				}
				break;
			case T__72:
				enterOuterAlt(_localctx, 2);
				{
				setState(714);
				match(T__72);
				setState(715);
				match(NAME);
				setState(716);
				match(T__72);
				}
				break;
			case T__73:
				enterOuterAlt(_localctx, 3);
				{
				setState(717);
				match(T__73);
				setState(718);
				match(NAME);
				setState(719);
				match(T__73);
				}
				break;
			case NAME:
				enterOuterAlt(_localctx, 4);
				{
				setState(720);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3S\u02d6\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\7\2L\n\2\f\2\16\2O\13\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3c\n\3"+
		"\3\4\3\4\3\4\3\4\5\4i\n\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\5\5r\n\5\3\5\3\5"+
		"\7\5v\n\5\f\5\16\5y\13\5\3\6\5\6|\n\6\3\6\3\6\3\6\5\6\u0081\n\6\3\6\3"+
		"\6\5\6\u0085\n\6\3\6\3\6\5\6\u0089\n\6\3\6\3\6\3\6\3\6\5\6\u008f\n\6\3"+
		"\7\3\7\3\b\3\b\3\b\3\b\7\b\u0097\n\b\f\b\16\b\u009a\13\b\3\b\3\b\3\t\7"+
		"\t\u009f\n\t\f\t\16\t\u00a2\13\t\3\t\3\t\3\t\3\t\7\t\u00a8\n\t\f\t\16"+
		"\t\u00ab\13\t\3\t\5\t\u00ae\n\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f\5\f\u00b7"+
		"\n\f\3\f\3\f\3\f\5\f\u00bc\n\f\3\f\3\f\3\f\7\f\u00c1\n\f\f\f\16\f\u00c4"+
		"\13\f\3\f\5\f\u00c7\n\f\3\r\3\r\3\16\3\16\5\16\u00cd\n\16\3\16\3\16\3"+
		"\16\3\16\5\16\u00d3\n\16\3\16\3\16\3\16\3\16\3\16\7\16\u00da\n\16\f\16"+
		"\16\16\u00dd\13\16\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3"+
		"\20\5\20\u00ea\n\20\5\20\u00ec\n\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20"+
		"\u00f4\n\20\f\20\16\20\u00f7\13\20\3\20\3\20\3\20\3\20\3\20\5\20\u00fe"+
		"\n\20\3\20\3\20\3\20\3\20\7\20\u0104\n\20\f\20\16\20\u0107\13\20\3\20"+
		"\3\20\3\20\3\20\3\20\5\20\u010e\n\20\5\20\u0110\n\20\3\20\3\20\5\20\u0114"+
		"\n\20\3\20\5\20\u0117\n\20\3\20\3\20\3\20\3\20\7\20\u011d\n\20\f\20\16"+
		"\20\u0120\13\20\3\20\3\20\3\20\3\20\3\20\5\20\u0127\n\20\5\20\u0129\n"+
		"\20\3\20\3\20\3\20\5\20\u012e\n\20\3\20\3\20\3\20\3\20\7\20\u0134\n\20"+
		"\f\20\16\20\u0137\13\20\3\20\3\20\3\20\3\20\5\20\u013d\n\20\3\21\3\21"+
		"\3\22\3\22\3\23\3\23\3\24\3\24\3\24\5\24\u0148\n\24\3\24\3\24\5\24\u014c"+
		"\n\24\3\24\5\24\u014f\n\24\3\24\3\24\5\24\u0153\n\24\3\24\5\24\u0156\n"+
		"\24\3\24\5\24\u0159\n\24\3\24\3\24\5\24\u015d\n\24\3\25\3\25\3\26\3\26"+
		"\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\7\32"+
		"\u0170\n\32\f\32\16\32\u0173\13\32\3\32\3\32\3\32\3\32\3\32\5\32\u017a"+
		"\n\32\3\32\3\32\3\32\5\32\u017f\n\32\3\33\3\33\3\34\3\34\5\34\u0185\n"+
		"\34\3\35\3\35\3\35\3\35\5\35\u018b\n\35\3\35\3\35\3\35\3\35\5\35\u0191"+
		"\n\35\3\35\5\35\u0194\n\35\3\35\5\35\u0197\n\35\3\35\3\35\3\35\3\35\5"+
		"\35\u019d\n\35\3\35\5\35\u01a0\n\35\3\35\5\35\u01a3\n\35\3\35\3\35\3\35"+
		"\3\35\5\35\u01a9\n\35\3\35\5\35\u01ac\n\35\3\35\5\35\u01af\n\35\3\35\3"+
		"\35\3\35\3\35\5\35\u01b5\n\35\3\35\5\35\u01b8\n\35\3\35\5\35\u01bb\n\35"+
		"\3\35\3\35\3\35\3\35\5\35\u01c1\n\35\3\35\5\35\u01c4\n\35\3\35\5\35\u01c7"+
		"\n\35\3\35\3\35\3\35\3\35\5\35\u01cd\n\35\3\35\5\35\u01d0\n\35\3\35\5"+
		"\35\u01d3\n\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u01db\n\35\3\35\5\35"+
		"\u01de\n\35\3\35\5\35\u01e1\n\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u01e9"+
		"\n\35\3\35\5\35\u01ec\n\35\3\35\5\35\u01ef\n\35\3\35\3\35\3\35\3\35\3"+
		"\35\3\35\5\35\u01f7\n\35\3\35\5\35\u01fa\n\35\3\35\5\35\u01fd\n\35\3\35"+
		"\3\35\3\35\3\35\3\35\5\35\u0204\n\35\3\35\5\35\u0207\n\35\3\35\5\35\u020a"+
		"\n\35\3\35\5\35\u020d\n\35\3\35\3\35\3\35\3\35\3\35\5\35\u0214\n\35\3"+
		"\35\5\35\u0217\n\35\3\35\5\35\u021a\n\35\3\35\5\35\u021d\n\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0228\n\35\3\35\3\35\3\35\5\35"+
		"\u022d\n\35\3\35\3\35\5\35\u0231\n\35\3\35\3\35\3\35\3\35\3\35\3\35\3"+
		"\35\5\35\u023a\n\35\3\35\3\35\5\35\u023e\n\35\3\35\3\35\3\35\3\35\5\35"+
		"\u0244\n\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0250"+
		"\n\35\3\35\3\35\3\35\5\35\u0255\n\35\3\35\3\35\5\35\u0259\n\35\3\35\3"+
		"\35\5\35\u025d\n\35\3\35\3\35\3\35\5\35\u0262\n\35\3\35\3\35\5\35\u0266"+
		"\n\35\3\35\3\35\5\35\u026a\n\35\3\35\3\35\3\35\5\35\u026f\n\35\3\35\3"+
		"\35\5\35\u0273\n\35\3\35\3\35\5\35\u0277\n\35\3\35\3\35\3\35\5\35\u027c"+
		"\n\35\3\35\3\35\5\35\u0280\n\35\3\35\3\35\3\35\3\35\3\35\7\35\u0287\n"+
		"\35\f\35\16\35\u028a\13\35\3\35\3\35\3\35\3\35\3\35\5\35\u0291\n\35\3"+
		"\35\3\35\5\35\u0295\n\35\3\35\3\35\3\35\3\35\3\35\7\35\u029c\n\35\f\35"+
		"\16\35\u029f\13\35\3\35\3\35\3\35\3\35\3\35\5\35\u02a6\n\35\3\35\3\35"+
		"\5\35\u02aa\n\35\5\35\u02ac\n\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3!\3"+
		"!\3!\3!\5!\u02ba\n!\3\"\3\"\3#\7#\u02bf\n#\f#\16#\u02c2\13#\3$\3$\3$\3"+
		"$\5$\u02c8\n$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u02d4\n%\3%\2\2&\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFH\2\7\3"+
		"\2\5\6\3\2\26\27\3\2\34\35\3\2&\'\4\2!!NP\u034c\2M\3\2\2\2\4b\3\2\2\2"+
		"\6d\3\2\2\2\bl\3\2\2\2\n\u008e\3\2\2\2\f\u0090\3\2\2\2\16\u0092\3\2\2"+
		"\2\20\u00a0\3\2\2\2\22\u00af\3\2\2\2\24\u00b1\3\2\2\2\26\u00b4\3\2\2\2"+
		"\30\u00c8\3\2\2\2\32\u00ca\3\2\2\2\34\u00e2\3\2\2\2\36\u013c\3\2\2\2 "+
		"\u013e\3\2\2\2\"\u0140\3\2\2\2$\u0142\3\2\2\2&\u0144\3\2\2\2(\u015e\3"+
		"\2\2\2*\u0160\3\2\2\2,\u0162\3\2\2\2.\u0164\3\2\2\2\60\u0167\3\2\2\2\62"+
		"\u0169\3\2\2\2\64\u0180\3\2\2\2\66\u0182\3\2\2\28\u02ab\3\2\2\2:\u02ad"+
		"\3\2\2\2<\u02af\3\2\2\2>\u02b1\3\2\2\2@\u02b9\3\2\2\2B\u02bb\3\2\2\2D"+
		"\u02c0\3\2\2\2F\u02c7\3\2\2\2H\u02d3\3\2\2\2JL\5\4\3\2KJ\3\2\2\2LO\3\2"+
		"\2\2MK\3\2\2\2MN\3\2\2\2N\3\3\2\2\2OM\3\2\2\2PQ\5\b\5\2QR\7\3\2\2Rc\3"+
		"\2\2\2ST\5\6\4\2TU\7\3\2\2Uc\3\2\2\2VW\5\32\16\2WX\7\3\2\2Xc\3\2\2\2Y"+
		"Z\5\26\f\2Z[\7\3\2\2[c\3\2\2\2\\]\5\24\13\2]^\7\3\2\2^c\3\2\2\2_`\5\16"+
		"\b\2`a\7\3\2\2ac\3\2\2\2bP\3\2\2\2bS\3\2\2\2bV\3\2\2\2bY\3\2\2\2b\\\3"+
		"\2\2\2b_\3\2\2\2c\5\3\2\2\2de\7\4\2\2eh\t\2\2\2fg\7\7\2\2gi\7\b\2\2hf"+
		"\3\2\2\2hi\3\2\2\2ij\3\2\2\2jk\5H%\2k\7\3\2\2\2lm\7\t\2\2mq\t\2\2\2no"+
		"\7\7\2\2op\7\n\2\2pr\7\b\2\2qn\3\2\2\2qr\3\2\2\2rs\3\2\2\2sw\5H%\2tv\5"+
		"\n\6\2ut\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2x\t\3\2\2\2yw\3\2\2\2z|"+
		"\7\13\2\2{z\3\2\2\2{|\3\2\2\2|}\3\2\2\2}~\7\f\2\2~\u0080\7\r\2\2\177\u0081"+
		"\7\16\2\2\u0080\177\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082\3\2\2\2\u0082"+
		"\u008f\5<\37\2\u0083\u0085\7\13\2\2\u0084\u0083\3\2\2\2\u0084\u0085\3"+
		"\2\2\2\u0085\u0086\3\2\2\2\u0086\u0088\7\17\2\2\u0087\u0089\7\16\2\2\u0088"+
		"\u0087\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008f\5>"+
		" \2\u008b\u008c\7\20\2\2\u008c\u008d\7\16\2\2\u008d\u008f\5\f\7\2\u008e"+
		"{\3\2\2\2\u008e\u0084\3\2\2\2\u008e\u008b\3\2\2\2\u008f\13\3\2\2\2\u0090"+
		"\u0091\7P\2\2\u0091\r\3\2\2\2\u0092\u0098\7\r\2\2\u0093\u0094\5\20\t\2"+
		"\u0094\u0095\7\21\2\2\u0095\u0097\3\2\2\2\u0096\u0093\3\2\2\2\u0097\u009a"+
		"\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009b\3\2\2\2\u009a"+
		"\u0098\3\2\2\2\u009b\u009c\5\20\t\2\u009c\17\3\2\2\2\u009d\u009f\7\22"+
		"\2\2\u009e\u009d\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0"+
		"\u00a1\3\2\2\2\u00a1\u00a3\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a4\7M"+
		"\2\2\u00a4\u00ad\7\16\2\2\u00a5\u00ae\5\22\n\2\u00a6\u00a8\7\22\2\2\u00a7"+
		"\u00a6\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2"+
		"\2\2\u00aa\u00ac\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00ae\7M\2\2\u00ad"+
		"\u00a5\3\2\2\2\u00ad\u00a9\3\2\2\2\u00ae\21\3\2\2\2\u00af\u00b0\5B\"\2"+
		"\u00b0\23\3\2\2\2\u00b1\u00b2\7\23\2\2\u00b2\u00b3\5H%\2\u00b3\25\3\2"+
		"\2\2\u00b4\u00b6\7\4\2\2\u00b5\u00b7\7\24\2\2\u00b6\u00b5\3\2\2\2\u00b6"+
		"\u00b7\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00bb\7\25\2\2\u00b9\u00ba\7"+
		"\7\2\2\u00ba\u00bc\7\b\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc"+
		"\u00bd\3\2\2\2\u00bd\u00c2\5\30\r\2\u00be\u00bf\7\21\2\2\u00bf\u00c1\5"+
		"\30\r\2\u00c0\u00be\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2"+
		"\u00c3\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00c7\t\3"+
		"\2\2\u00c6\u00c5\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\27\3\2\2\2\u00c8\u00c9"+
		"\5H%\2\u00c9\31\3\2\2\2\u00ca\u00cc\7\t\2\2\u00cb\u00cd\7\24\2\2\u00cc"+
		"\u00cb\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00d2\7\25"+
		"\2\2\u00cf\u00d0\7\7\2\2\u00d0\u00d1\7\n\2\2\u00d1\u00d3\7\b\2\2\u00d2"+
		"\u00cf\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d5\5\34"+
		"\17\2\u00d5\u00db\7\30\2\2\u00d6\u00d7\5\36\20\2\u00d7\u00d8\7\21\2\2"+
		"\u00d8\u00da\3\2\2\2\u00d9\u00d6\3\2\2\2\u00da\u00dd\3\2\2\2\u00db\u00d9"+
		"\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00de\3\2\2\2\u00dd\u00db\3\2\2\2\u00de"+
		"\u00df\5\36\20\2\u00df\u00e0\7\31\2\2\u00e0\u00e1\5D#\2\u00e1\33\3\2\2"+
		"\2\u00e2\u00e3\5H%\2\u00e3\35\3\2\2\2\u00e4\u00e5\5 \21\2\u00e5\u00e6"+
		"\5&\24\2\u00e6\u013d\3\2\2\2\u00e7\u00e9\7\32\2\2\u00e8\u00ea\5\"\22\2"+
		"\u00e9\u00e8\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00ec\3\2\2\2\u00eb\u00e7"+
		"\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ee\7\33\2\2"+
		"\u00ee\u00ef\7\34\2\2\u00ef\u00f5\7\30\2\2\u00f0\u00f1\5\66\34\2\u00f1"+
		"\u00f2\7\21\2\2\u00f2\u00f4\3\2\2\2\u00f3\u00f0\3\2\2\2\u00f4\u00f7\3"+
		"\2\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f8\3\2\2\2\u00f7"+
		"\u00f5\3\2\2\2\u00f8\u00f9\5\66\34\2\u00f9\u00fa\7\31\2\2\u00fa\u013d"+
		"\3\2\2\2\u00fb\u00fd\t\4\2\2\u00fc\u00fe\5\"\22\2\u00fd\u00fc\3\2\2\2"+
		"\u00fd\u00fe\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0105\7\30\2\2\u0100\u0101"+
		"\5\66\34\2\u0101\u0102\7\21\2\2\u0102\u0104\3\2\2\2\u0103\u0100\3\2\2"+
		"\2\u0104\u0107\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0108"+
		"\3\2\2\2\u0107\u0105\3\2\2\2\u0108\u0109\5\66\34\2\u0109\u010a\7\31\2"+
		"\2\u010a\u013d\3\2\2\2\u010b\u010d\7\32\2\2\u010c\u010e\5\"\22\2\u010d"+
		"\u010c\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u0110\3\2\2\2\u010f\u010b\3\2"+
		"\2\2\u010f\u0110\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0113\7\36\2\2\u0112"+
		"\u0114\t\4\2\2\u0113\u0112\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0116\3\2"+
		"\2\2\u0115\u0117\5$\23\2\u0116\u0115\3\2\2\2\u0116\u0117\3\2\2\2\u0117"+
		"\u0118\3\2\2\2\u0118\u011e\7\30\2\2\u0119\u011a\5\66\34\2\u011a\u011b"+
		"\7\21\2\2\u011b\u011d\3\2\2\2\u011c\u0119\3\2\2\2\u011d\u0120\3\2\2\2"+
		"\u011e\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0121\3\2\2\2\u0120\u011e"+
		"\3\2\2\2\u0121\u0122\5\66\34\2\u0122\u0123\7\31\2\2\u0123\u013d\3\2\2"+
		"\2\u0124\u0126\7\32\2\2\u0125\u0127\5\"\22\2\u0126\u0125\3\2\2\2\u0126"+
		"\u0127\3\2\2\2\u0127\u0129\3\2\2\2\u0128\u0124\3\2\2\2\u0128\u0129\3\2"+
		"\2\2\u0129\u012a\3\2\2\2\u012a\u012b\7\37\2\2\u012b\u012d\7\34\2\2\u012c"+
		"\u012e\5$\23\2\u012d\u012c\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u012f\3\2"+
		"\2\2\u012f\u0135\7\30\2\2\u0130\u0131\5\66\34\2\u0131\u0132\7\21\2\2\u0132"+
		"\u0134\3\2\2\2\u0133\u0130\3\2\2\2\u0134\u0137\3\2\2\2\u0135\u0133\3\2"+
		"\2\2\u0135\u0136\3\2\2\2\u0136\u0138\3\2\2\2\u0137\u0135\3\2\2\2\u0138"+
		"\u0139\5\66\34\2\u0139\u013a\7\31\2\2\u013a\u013b\5\62\32\2\u013b\u013d"+
		"\3\2\2\2\u013c\u00e4\3\2\2\2\u013c\u00eb\3\2\2\2\u013c\u00fb\3\2\2\2\u013c"+
		"\u010f\3\2\2\2\u013c\u0128\3\2\2\2\u013d\37\3\2\2\2\u013e\u013f\5H%\2"+
		"\u013f!\3\2\2\2\u0140\u0141\5H%\2\u0141#\3\2\2\2\u0142\u0143\5H%\2\u0143"+
		"%\3\2\2\2\u0144\u0147\58\35\2\u0145\u0148\5,\27\2\u0146\u0148\5.\30\2"+
		"\u0147\u0145\3\2\2\2\u0147\u0146\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u014b"+
		"\3\2\2\2\u0149\u014a\7\13\2\2\u014a\u014c\5*\26\2\u014b\u0149\3\2\2\2"+
		"\u014b\u014c\3\2\2\2\u014c\u014e\3\2\2\2\u014d\u014f\5(\25\2\u014e\u014d"+
		"\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0158\3\2\2\2\u0150\u0152\7\36\2\2"+
		"\u0151\u0153\7\34\2\2\u0152\u0151\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0159"+
		"\3\2\2\2\u0154\u0156\7\33\2\2\u0155\u0154\3\2\2\2\u0155\u0156\3\2\2\2"+
		"\u0156\u0157\3\2\2\2\u0157\u0159\7\34\2\2\u0158\u0150\3\2\2\2\u0158\u0155"+
		"\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u015c\3\2\2\2\u015a\u015b\7\20\2\2"+
		"\u015b\u015d\5\60\31\2\u015c\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015d\'"+
		"\3\2\2\2\u015e\u015f\7 \2\2\u015f)\3\2\2\2\u0160\u0161\5B\"\2\u0161+\3"+
		"\2\2\2\u0162\u0163\7!\2\2\u0163-\3\2\2\2\u0164\u0165\7\n\2\2\u0165\u0166"+
		"\7!\2\2\u0166/\3\2\2\2\u0167\u0168\7P\2\2\u0168\61\3\2\2\2\u0169\u016a"+
		"\7\"\2\2\u016a\u016b\5\64\33\2\u016b\u0171\7\30\2\2\u016c\u016d\5\66\34"+
		"\2\u016d\u016e\7\21\2\2\u016e\u0170\3\2\2\2\u016f\u016c\3\2\2\2\u0170"+
		"\u0173\3\2\2\2\u0171\u016f\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0174\3\2"+
		"\2\2\u0173\u0171\3\2\2\2\u0174\u0175\5\66\34\2\u0175\u0179\7\31\2\2\u0176"+
		"\u0177\7#\2\2\u0177\u0178\7$\2\2\u0178\u017a\5@!\2\u0179\u0176\3\2\2\2"+
		"\u0179\u017a\3\2\2\2\u017a\u017e\3\2\2\2\u017b\u017c\7#\2\2\u017c\u017d"+
		"\7%\2\2\u017d\u017f\5@!\2\u017e\u017b\3\2\2\2\u017e\u017f\3\2\2\2\u017f"+
		"\63\3\2\2\2\u0180\u0181\5H%\2\u0181\65\3\2\2\2\u0182\u0184\5H%\2\u0183"+
		"\u0185\t\5\2\2\u0184\u0183\3\2\2\2\u0184\u0185\3\2\2\2\u0185\67\3\2\2"+
		"\2\u0186\u018a\7(\2\2\u0187\u0188\7\30\2\2\u0188\u0189\7N\2\2\u0189\u018b"+
		"\7\31\2\2\u018a\u0187\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u02ac\3\2\2\2"+
		"\u018c\u0190\7)\2\2\u018d\u018e\7\30\2\2\u018e\u018f\7N\2\2\u018f\u0191"+
		"\7\31\2\2\u0190\u018d\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u0193\3\2\2\2"+
		"\u0192\u0194\7*\2\2\u0193\u0192\3\2\2\2\u0193\u0194\3\2\2\2\u0194\u0196"+
		"\3\2\2\2\u0195\u0197\7+\2\2\u0196\u0195\3\2\2\2\u0196\u0197\3\2\2\2\u0197"+
		"\u02ac\3\2\2\2\u0198\u019c\7,\2\2\u0199\u019a\7\30\2\2\u019a\u019b\7N"+
		"\2\2\u019b\u019d\7\31\2\2\u019c\u0199\3\2\2\2\u019c\u019d\3\2\2\2\u019d"+
		"\u019f\3\2\2\2\u019e\u01a0\7*\2\2\u019f\u019e\3\2\2\2\u019f\u01a0\3\2"+
		"\2\2\u01a0\u01a2\3\2\2\2\u01a1\u01a3\7+\2\2\u01a2\u01a1\3\2\2\2\u01a2"+
		"\u01a3\3\2\2\2\u01a3\u02ac\3\2\2\2\u01a4\u01a8\7-\2\2\u01a5\u01a6\7\30"+
		"\2\2\u01a6\u01a7\7N\2\2\u01a7\u01a9\7\31\2\2\u01a8\u01a5\3\2\2\2\u01a8"+
		"\u01a9\3\2\2\2\u01a9\u01ab\3\2\2\2\u01aa\u01ac\7*\2\2\u01ab\u01aa\3\2"+
		"\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01ae\3\2\2\2\u01ad\u01af\7+\2\2\u01ae"+
		"\u01ad\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u02ac\3\2\2\2\u01b0\u01b4\7."+
		"\2\2\u01b1\u01b2\7\30\2\2\u01b2\u01b3\7N\2\2\u01b3\u01b5\7\31\2\2\u01b4"+
		"\u01b1\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b7\3\2\2\2\u01b6\u01b8\7*"+
		"\2\2\u01b7\u01b6\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01ba\3\2\2\2\u01b9"+
		"\u01bb\7+\2\2\u01ba\u01b9\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u02ac\3\2"+
		"\2\2\u01bc\u01c0\7/\2\2\u01bd\u01be\7\30\2\2\u01be\u01bf\7N\2\2\u01bf"+
		"\u01c1\7\31\2\2\u01c0\u01bd\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c3\3"+
		"\2\2\2\u01c2\u01c4\7*\2\2\u01c3\u01c2\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4"+
		"\u01c6\3\2\2\2\u01c5\u01c7\7+\2\2\u01c6\u01c5\3\2\2\2\u01c6\u01c7\3\2"+
		"\2\2\u01c7\u02ac\3\2\2\2\u01c8\u01cc\7\60\2\2\u01c9\u01ca\7\30\2\2\u01ca"+
		"\u01cb\7N\2\2\u01cb\u01cd\7\31\2\2\u01cc\u01c9\3\2\2\2\u01cc\u01cd\3\2"+
		"\2\2\u01cd\u01cf\3\2\2\2\u01ce\u01d0\7*\2\2\u01cf\u01ce\3\2\2\2\u01cf"+
		"\u01d0\3\2\2\2\u01d0\u01d2\3\2\2\2\u01d1\u01d3\7+\2\2\u01d2\u01d1\3\2"+
		"\2\2\u01d2\u01d3\3\2\2\2\u01d3\u02ac\3\2\2\2\u01d4\u01da\7\61\2\2\u01d5"+
		"\u01d6\7\30\2\2\u01d6\u01d7\7N\2\2\u01d7\u01d8\7\21\2\2\u01d8\u01d9\7"+
		"N\2\2\u01d9\u01db\7\31\2\2\u01da\u01d5\3\2\2\2\u01da\u01db\3\2\2\2\u01db"+
		"\u01dd\3\2\2\2\u01dc\u01de\7*\2\2\u01dd\u01dc\3\2\2\2\u01dd\u01de\3\2"+
		"\2\2\u01de\u01e0\3\2\2\2\u01df\u01e1\7+\2\2\u01e0\u01df\3\2\2\2\u01e0"+
		"\u01e1\3\2\2\2\u01e1\u02ac\3\2\2\2\u01e2\u01e8\7\62\2\2\u01e3\u01e4\7"+
		"\30\2\2\u01e4\u01e5\7N\2\2\u01e5\u01e6\7\21\2\2\u01e6\u01e7\7N\2\2\u01e7"+
		"\u01e9\7\31\2\2\u01e8\u01e3\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9\u01eb\3"+
		"\2\2\2\u01ea\u01ec\7*\2\2\u01eb\u01ea\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec"+
		"\u01ee\3\2\2\2\u01ed\u01ef\7+\2\2\u01ee\u01ed\3\2\2\2\u01ee\u01ef\3\2"+
		"\2\2\u01ef\u02ac\3\2\2\2\u01f0\u01f6\7\63\2\2\u01f1\u01f2\7\30\2\2\u01f2"+
		"\u01f3\7N\2\2\u01f3\u01f4\7\21\2\2\u01f4\u01f5\7N\2\2\u01f5\u01f7\7\31"+
		"\2\2\u01f6\u01f1\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7\u01f9\3\2\2\2\u01f8"+
		"\u01fa\7*\2\2\u01f9\u01f8\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa\u01fc\3\2"+
		"\2\2\u01fb\u01fd\7+\2\2\u01fc\u01fb\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd"+
		"\u02ac\3\2\2\2\u01fe\u0206\7\64\2\2\u01ff\u0200\7\30\2\2\u0200\u0203\7"+
		"N\2\2\u0201\u0202\7\21\2\2\u0202\u0204\7N\2\2\u0203\u0201\3\2\2\2\u0203"+
		"\u0204\3\2\2\2\u0204\u0205\3\2\2\2\u0205\u0207\7\31\2\2\u0206\u01ff\3"+
		"\2\2\2\u0206\u0207\3\2\2\2\u0207\u0209\3\2\2\2\u0208\u020a\7*\2\2\u0209"+
		"\u0208\3\2\2\2\u0209\u020a\3\2\2\2\u020a\u020c\3\2\2\2\u020b\u020d\7+"+
		"\2\2\u020c\u020b\3\2\2\2\u020c\u020d\3\2\2\2\u020d\u02ac\3\2\2\2\u020e"+
		"\u0216\7\65\2\2\u020f\u0210\7\30\2\2\u0210\u0213\7N\2\2\u0211\u0212\7"+
		"\21\2\2\u0212\u0214\7N\2\2\u0213\u0211\3\2\2\2\u0213\u0214\3\2\2\2\u0214"+
		"\u0215\3\2\2\2\u0215\u0217\7\31\2\2\u0216\u020f\3\2\2\2\u0216\u0217\3"+
		"\2\2\2\u0217\u0219\3\2\2\2\u0218\u021a\7*\2\2\u0219\u0218\3\2\2\2\u0219"+
		"\u021a\3\2\2\2\u021a\u021c\3\2\2\2\u021b\u021d\7+\2\2\u021c\u021b\3\2"+
		"\2\2\u021c\u021d\3\2\2\2\u021d\u02ac\3\2\2\2\u021e\u02ac\7\66\2\2\u021f"+
		"\u02ac\7\67\2\2\u0220\u02ac\78\2\2\u0221\u02ac\79\2\2\u0222\u02ac\7:\2"+
		"\2\u0223\u0227\7;\2\2\u0224\u0225\7\30\2\2\u0225\u0226\7N\2\2\u0226\u0228"+
		"\7\31\2\2\u0227\u0224\3\2\2\2\u0227\u0228\3\2\2\2\u0228\u022c\3\2\2\2"+
		"\u0229\u022a\7\f\2\2\u022a\u022b\7\r\2\2\u022b\u022d\5<\37\2\u022c\u0229"+
		"\3\2\2\2\u022c\u022d\3\2\2\2\u022d\u0230\3\2\2\2\u022e\u022f\7\17\2\2"+
		"\u022f\u0231\5> \2\u0230\u022e\3\2\2\2\u0230\u0231\3\2\2\2\u0231\u02ac"+
		"\3\2\2\2\u0232\u0233\7<\2\2\u0233\u0234\7\30\2\2\u0234\u0235\7N\2\2\u0235"+
		"\u0239\7\31\2\2\u0236\u0237\7\f\2\2\u0237\u0238\7\r\2\2\u0238\u023a\5"+
		"<\37\2\u0239\u0236\3\2\2\2\u0239\u023a\3\2\2\2\u023a\u023d\3\2\2\2\u023b"+
		"\u023c\7\17\2\2\u023c\u023e\5> \2\u023d\u023b\3\2\2\2\u023d\u023e\3\2"+
		"\2\2\u023e\u02ac\3\2\2\2\u023f\u0243\7=\2\2\u0240\u0241\7\30\2\2\u0241"+
		"\u0242\7N\2\2\u0242\u0244\7\31\2\2\u0243\u0240\3\2\2\2\u0243\u0244\3\2"+
		"\2\2\u0244\u02ac\3\2\2\2\u0245\u0246\7>\2\2\u0246\u0247\7\30\2\2\u0247"+
		"\u0248\7N\2\2\u0248\u02ac\7\31\2\2\u0249\u02ac\7?\2\2\u024a\u02ac\7@\2"+
		"\2\u024b\u02ac\7A\2\2\u024c\u02ac\7B\2\2\u024d\u024f\7C\2\2\u024e\u0250"+
		"\7=\2\2\u024f\u024e\3\2\2\2\u024f\u0250\3\2\2\2\u0250\u0254\3\2\2\2\u0251"+
		"\u0252\7\f\2\2\u0252\u0253\7\r\2\2\u0253\u0255\5<\37\2\u0254\u0251\3\2"+
		"\2\2\u0254\u0255\3\2\2\2\u0255\u0258\3\2\2\2\u0256\u0257\7\17\2\2\u0257"+
		"\u0259\5> \2\u0258\u0256\3\2\2\2\u0258\u0259\3\2\2\2\u0259\u02ac\3\2\2"+
		"\2\u025a\u025c\7D\2\2\u025b\u025d\7=\2\2\u025c\u025b\3\2\2\2\u025c\u025d"+
		"\3\2\2\2\u025d\u0261\3\2\2\2\u025e\u025f\7\f\2\2\u025f\u0260\7\r\2\2\u0260"+
		"\u0262\5<\37\2\u0261\u025e\3\2\2\2\u0261\u0262\3\2\2\2\u0262\u0265\3\2"+
		"\2\2\u0263\u0264\7\17\2\2\u0264\u0266\5> \2\u0265\u0263\3\2\2\2\u0265"+
		"\u0266\3\2\2\2\u0266\u02ac\3\2\2\2\u0267\u0269\7E\2\2\u0268\u026a\7=\2"+
		"\2\u0269\u0268\3\2\2\2\u0269\u026a\3\2\2\2\u026a\u026e\3\2\2\2\u026b\u026c"+
		"\7\f\2\2\u026c\u026d\7\r\2\2\u026d\u026f\5<\37\2\u026e\u026b\3\2\2\2\u026e"+
		"\u026f\3\2\2\2\u026f\u0272\3\2\2\2\u0270\u0271\7\17\2\2\u0271\u0273\5"+
		"> \2\u0272\u0270\3\2\2\2\u0272\u0273\3\2\2\2\u0273\u02ac\3\2\2\2\u0274"+
		"\u0276\7F\2\2\u0275\u0277\7=\2\2\u0276\u0275\3\2\2\2\u0276\u0277\3\2\2"+
		"\2\u0277\u027b\3\2\2\2\u0278\u0279\7\f\2\2\u0279\u027a\7\r\2\2\u027a\u027c"+
		"\5<\37\2\u027b\u0278\3\2\2\2\u027b\u027c\3\2\2\2\u027c\u027f\3\2\2\2\u027d"+
		"\u027e\7\17\2\2\u027e\u0280\5> \2\u027f\u027d\3\2\2\2\u027f\u0280\3\2"+
		"\2\2\u0280\u02ac\3\2\2\2\u0281\u0282\7G\2\2\u0282\u0288\7\30\2\2\u0283"+
		"\u0284\5:\36\2\u0284\u0285\7\21\2\2\u0285\u0287\3\2\2\2\u0286\u0283\3"+
		"\2\2\2\u0287\u028a\3\2\2\2\u0288\u0286\3\2\2\2\u0288\u0289\3\2\2\2\u0289"+
		"\u028b\3\2\2\2\u028a\u0288\3\2\2\2\u028b\u028c\5:\36\2\u028c\u0290\7\31"+
		"\2\2\u028d\u028e\7\f\2\2\u028e\u028f\7\r\2\2\u028f\u0291\5<\37\2\u0290"+
		"\u028d\3\2\2\2\u0290\u0291\3\2\2\2\u0291\u0294\3\2\2\2\u0292\u0293\7\17"+
		"\2\2\u0293\u0295\5> \2\u0294\u0292\3\2\2\2\u0294\u0295\3\2\2\2\u0295\u02ac"+
		"\3\2\2\2\u0296\u0297\7\r\2\2\u0297\u029d\7\30\2\2\u0298\u0299\5:\36\2"+
		"\u0299\u029a\7\21\2\2\u029a\u029c\3\2\2\2\u029b\u0298\3\2\2\2\u029c\u029f"+
		"\3\2\2\2\u029d\u029b\3\2\2\2\u029d\u029e\3\2\2\2\u029e\u02a0\3\2\2\2\u029f"+
		"\u029d\3\2\2\2\u02a0\u02a1\5:\36\2\u02a1\u02a5\7\31\2\2\u02a2\u02a3\7"+
		"\f\2\2\u02a3\u02a4\7\r\2\2\u02a4\u02a6\5<\37\2\u02a5\u02a2\3\2\2\2\u02a5"+
		"\u02a6\3\2\2\2\u02a6\u02a9\3\2\2\2\u02a7\u02a8\7\17\2\2\u02a8\u02aa\5"+
		"> \2\u02a9\u02a7\3\2\2\2\u02a9\u02aa\3\2\2\2\u02aa\u02ac\3\2\2\2\u02ab"+
		"\u0186\3\2\2\2\u02ab\u018c\3\2\2\2\u02ab\u0198\3\2\2\2\u02ab\u01a4\3\2"+
		"\2\2\u02ab\u01b0\3\2\2\2\u02ab\u01bc\3\2\2\2\u02ab\u01c8\3\2\2\2\u02ab"+
		"\u01d4\3\2\2\2\u02ab\u01e2\3\2\2\2\u02ab\u01f0\3\2\2\2\u02ab\u01fe\3\2"+
		"\2\2\u02ab\u020e\3\2\2\2\u02ab\u021e\3\2\2\2\u02ab\u021f\3\2\2\2\u02ab"+
		"\u0220\3\2\2\2\u02ab\u0221\3\2\2\2\u02ab\u0222\3\2\2\2\u02ab\u0223\3\2"+
		"\2\2\u02ab\u0232\3\2\2\2\u02ab\u023f\3\2\2\2\u02ab\u0245\3\2\2\2\u02ab"+
		"\u0249\3\2\2\2\u02ab\u024a\3\2\2\2\u02ab\u024b\3\2\2\2\u02ab\u024c\3\2"+
		"\2\2\u02ab\u024d\3\2\2\2\u02ab\u025a\3\2\2\2\u02ab\u0267\3\2\2\2\u02ab"+
		"\u0274\3\2\2\2\u02ab\u0281\3\2\2\2\u02ab\u0296\3\2\2\2\u02ac9\3\2\2\2"+
		"\u02ad\u02ae\7P\2\2\u02ae;\3\2\2\2\u02af\u02b0\5H%\2\u02b0=\3\2\2\2\u02b1"+
		"\u02b2\5H%\2\u02b2?\3\2\2\2\u02b3\u02ba\7\26\2\2\u02b4\u02ba\7\27\2\2"+
		"\u02b5\u02b6\7\r\2\2\u02b6\u02ba\7!\2\2\u02b7\u02b8\7H\2\2\u02b8\u02ba"+
		"\7I\2\2\u02b9\u02b3\3\2\2\2\u02b9\u02b4\3\2\2\2\u02b9\u02b5\3\2\2\2\u02b9"+
		"\u02b7\3\2\2\2\u02baA\3\2\2\2\u02bb\u02bc\t\6\2\2\u02bcC\3\2\2\2\u02bd"+
		"\u02bf\5F$\2\u02be\u02bd\3\2\2\2\u02bf\u02c2\3\2\2\2\u02c0\u02be\3\2\2"+
		"\2\u02c0\u02c1\3\2\2\2\u02c1E\3\2\2\2\u02c2\u02c0\3\2\2\2\u02c3\u02c4"+
		"\7M\2\2\u02c4\u02c5\7\16\2\2\u02c5\u02c8\7M\2\2\u02c6\u02c8\5\n\6\2\u02c7"+
		"\u02c3\3\2\2\2\u02c7\u02c6\3\2\2\2\u02c8G\3\2\2\2\u02c9\u02ca\7J\2\2\u02ca"+
		"\u02cb\7M\2\2\u02cb\u02d4\7J\2\2\u02cc\u02cd\7K\2\2\u02cd\u02ce\7M\2\2"+
		"\u02ce\u02d4\7K\2\2\u02cf\u02d0\7L\2\2\u02d0\u02d1\7M\2\2\u02d1\u02d4"+
		"\7L\2\2\u02d2\u02d4\7M\2\2\u02d3\u02c9\3\2\2\2\u02d3\u02cc\3\2\2\2\u02d3"+
		"\u02cf\3\2\2\2\u02d3\u02d2\3\2\2\2\u02d4I\3\2\2\2rMbhqw{\u0080\u0084\u0088"+
		"\u008e\u0098\u00a0\u00a9\u00ad\u00b6\u00bb\u00c2\u00c6\u00cc\u00d2\u00db"+
		"\u00e9\u00eb\u00f5\u00fd\u0105\u010d\u010f\u0113\u0116\u011e\u0126\u0128"+
		"\u012d\u0135\u013c\u0147\u014b\u014e\u0152\u0155\u0158\u015c\u0171\u0179"+
		"\u017e\u0184\u018a\u0190\u0193\u0196\u019c\u019f\u01a2\u01a8\u01ab\u01ae"+
		"\u01b4\u01b7\u01ba\u01c0\u01c3\u01c6\u01cc\u01cf\u01d2\u01da\u01dd\u01e0"+
		"\u01e8\u01eb\u01ee\u01f6\u01f9\u01fc\u0203\u0206\u0209\u020c\u0213\u0216"+
		"\u0219\u021c\u0227\u022c\u0230\u0239\u023d\u0243\u024f\u0254\u0258\u025c"+
		"\u0261\u0265\u0269\u026e\u0272\u0276\u027b\u027f\u0288\u0290\u0294\u029d"+
		"\u02a5\u02a9\u02ab\u02b9\u02c0\u02c7\u02d3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}