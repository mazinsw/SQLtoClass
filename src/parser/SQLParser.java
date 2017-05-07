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
		RULE_dropTableName = 11, RULE_createTable = 12, RULE_tableName = 13, RULE_fieldList = 14, 
		RULE_createDefinition = 15, RULE_columnName = 16, RULE_constraintName = 17, 
		RULE_constraintTable = 18, RULE_columnDefinition = 19, RULE_autoIncrement = 20, 
		RULE_columnDefaultValue = 21, RULE_defaultNull = 22, RULE_defaultNotNull = 23, 
		RULE_fieldComment = 24, RULE_referenceDefinition = 25, RULE_referenceTable = 26, 
		RULE_indexColName = 27, RULE_dataType = 28, RULE_stringItem = 29, RULE_charsetName = 30, 
		RULE_collateName = 31, RULE_referenceOption = 32, RULE_defaultValue = 33, 
		RULE_tableOptions = 34, RULE_option = 35, RULE_idName = 36;
	public static final String[] ruleNames = {
		"script", "stmt", "dropSchema", "createSchema", "createSpecification", 
		"tableComment", "setStmt", "setOption", "setDefaultValue", "useStmt", 
		"dropTable", "dropTableName", "createTable", "tableName", "fieldList", 
		"createDefinition", "columnName", "constraintName", "constraintTable", 
		"columnDefinition", "autoIncrement", "columnDefaultValue", "defaultNull", 
		"defaultNotNull", "fieldComment", "referenceDefinition", "referenceTable", 
		"indexColName", "dataType", "stringItem", "charsetName", "collateName", 
		"referenceOption", "defaultValue", "tableOptions", "option", "idName"
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
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__6) | (1L << T__10) | (1L << T__16))) != 0)) {
				{
				{
				setState(74);
				stmt();
				}
				}
				setState(79);
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
			setState(98);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				createSchema();
				setState(81);
				match(T__0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				dropSchema();
				setState(84);
				match(T__0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(86);
				createTable();
				setState(87);
				match(T__0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(89);
				dropTable();
				setState(90);
				match(T__0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(92);
				useStmt();
				setState(93);
				match(T__0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(95);
				setStmt();
				setState(96);
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
			setState(100);
			match(T__1);
			setState(101);
			_la = _input.LA(1);
			if ( !(_la==T__2 || _la==T__3) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(104);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(102);
				match(T__4);
				setState(103);
				match(T__5);
				}
			}

			setState(106);
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
			setState(108);
			match(T__6);
			setState(109);
			_la = _input.LA(1);
			if ( !(_la==T__2 || _la==T__3) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(113);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(110);
				match(T__4);
				setState(111);
				match(T__7);
				setState(112);
				match(T__5);
				}
			}

			setState(115);
			idName();
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__12) | (1L << T__13))) != 0)) {
				{
				{
				setState(116);
				createSpecification();
				}
				}
				setState(121);
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
			setState(142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(122);
					match(T__8);
					}
				}

				setState(125);
				match(T__9);
				setState(126);
				match(T__10);
				setState(128);
				_la = _input.LA(1);
				if (_la==T__11) {
					{
					setState(127);
					match(T__11);
					}
				}

				setState(130);
				charsetName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(131);
					match(T__8);
					}
				}

				setState(134);
				match(T__12);
				setState(136);
				_la = _input.LA(1);
				if (_la==T__11) {
					{
					setState(135);
					match(T__11);
					}
				}

				setState(138);
				collateName();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(139);
				match(T__13);
				setState(140);
				match(T__11);
				setState(141);
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
			setState(144);
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
			setState(146);
			match(T__10);
			setState(152);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(147);
					setOption();
					setState(148);
					match(T__14);
					}
					} 
				}
				setState(154);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(155);
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
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(157);
				match(T__15);
				}
				}
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(163);
			match(NAME);
			setState(164);
			match(T__11);
			setState(173);
			switch (_input.LA(1)) {
			case T__30:
			case INT:
			case FLOAT:
			case STRING:
				{
				setState(165);
				setDefaultValue();
				}
				break;
			case T__15:
			case NAME:
				{
				{
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(166);
					match(T__15);
					}
					}
					setState(171);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(172);
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
			setState(175);
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
			setState(177);
			match(T__16);
			setState(178);
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
			setState(180);
			match(T__1);
			setState(182);
			_la = _input.LA(1);
			if (_la==T__17) {
				{
				setState(181);
				match(T__17);
				}
			}

			setState(184);
			match(T__18);
			setState(187);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(185);
				match(T__4);
				setState(186);
				match(T__5);
				}
			}

			setState(189);
			dropTableName();
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(190);
				match(T__14);
				setState(191);
				dropTableName();
				}
				}
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(198);
			_la = _input.LA(1);
			if (_la==T__19 || _la==T__20) {
				{
				setState(197);
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
			setState(200);
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
			setState(202);
			match(T__6);
			setState(204);
			_la = _input.LA(1);
			if (_la==T__17) {
				{
				setState(203);
				match(T__17);
				}
			}

			setState(206);
			match(T__18);
			setState(210);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(207);
				match(T__4);
				setState(208);
				match(T__7);
				setState(209);
				match(T__5);
				}
			}

			setState(212);
			tableName();
			setState(213);
			match(T__21);
			setState(215);
			_la = _input.LA(1);
			if (((((_la - 24)) & ~0x3f) == 0 && ((1L << (_la - 24)) & ((1L << (T__23 - 24)) | (1L << (T__24 - 24)) | (1L << (T__25 - 24)) | (1L << (T__26 - 24)) | (1L << (T__27 - 24)) | (1L << (T__28 - 24)) | (1L << (T__71 - 24)) | (1L << (T__72 - 24)) | (1L << (T__73 - 24)) | (1L << (NAME - 24)))) != 0)) {
				{
				setState(214);
				fieldList();
				}
			}

			setState(217);
			match(T__22);
			setState(218);
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
			setState(220);
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
			setState(227);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(222);
					createDefinition();
					setState(223);
					match(T__14);
					}
					} 
				}
				setState(229);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			setState(230);
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
			setState(320);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				_localctx = new FieldStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(232);
				columnName();
				setState(233);
				columnDefinition();
				}
				break;
			case 2:
				_localctx = new PrimaryKeyStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(239);
				_la = _input.LA(1);
				if (_la==T__23) {
					{
					setState(235);
					match(T__23);
					setState(237);
					_la = _input.LA(1);
					if (((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (T__71 - 72)) | (1L << (T__72 - 72)) | (1L << (T__73 - 72)) | (1L << (NAME - 72)))) != 0)) {
						{
						setState(236);
						constraintName();
						}
					}

					}
				}

				setState(241);
				match(T__24);
				setState(242);
				match(T__25);
				setState(243);
				match(T__21);
				setState(249);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(244);
						indexColName();
						setState(245);
						match(T__14);
						}
						} 
					}
					setState(251);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				}
				setState(252);
				indexColName();
				setState(253);
				match(T__22);
				}
				break;
			case 3:
				_localctx = new IndexStmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(255);
				_la = _input.LA(1);
				if ( !(_la==T__25 || _la==T__26) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(257);
				_la = _input.LA(1);
				if (((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (T__71 - 72)) | (1L << (T__72 - 72)) | (1L << (T__73 - 72)) | (1L << (NAME - 72)))) != 0)) {
					{
					setState(256);
					constraintName();
					}
				}

				setState(259);
				match(T__21);
				setState(265);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(260);
						indexColName();
						setState(261);
						match(T__14);
						}
						} 
					}
					setState(267);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				}
				setState(268);
				indexColName();
				setState(269);
				match(T__22);
				}
				break;
			case 4:
				_localctx = new UniqueStmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(275);
				_la = _input.LA(1);
				if (_la==T__23) {
					{
					setState(271);
					match(T__23);
					setState(273);
					_la = _input.LA(1);
					if (((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (T__71 - 72)) | (1L << (T__72 - 72)) | (1L << (T__73 - 72)) | (1L << (NAME - 72)))) != 0)) {
						{
						setState(272);
						constraintName();
						}
					}

					}
				}

				setState(277);
				match(T__27);
				setState(279);
				_la = _input.LA(1);
				if (_la==T__25 || _la==T__26) {
					{
					setState(278);
					_la = _input.LA(1);
					if ( !(_la==T__25 || _la==T__26) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
				}

				setState(282);
				_la = _input.LA(1);
				if (((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (T__71 - 72)) | (1L << (T__72 - 72)) | (1L << (T__73 - 72)) | (1L << (NAME - 72)))) != 0)) {
					{
					setState(281);
					constraintTable();
					}
				}

				setState(284);
				match(T__21);
				setState(290);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(285);
						indexColName();
						setState(286);
						match(T__14);
						}
						} 
					}
					setState(292);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				}
				setState(293);
				indexColName();
				setState(294);
				match(T__22);
				}
				break;
			case 5:
				_localctx = new ForeignStmtContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(300);
				_la = _input.LA(1);
				if (_la==T__23) {
					{
					setState(296);
					match(T__23);
					setState(298);
					_la = _input.LA(1);
					if (((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (T__71 - 72)) | (1L << (T__72 - 72)) | (1L << (T__73 - 72)) | (1L << (NAME - 72)))) != 0)) {
						{
						setState(297);
						constraintName();
						}
					}

					}
				}

				setState(302);
				match(T__28);
				setState(303);
				match(T__25);
				setState(305);
				_la = _input.LA(1);
				if (((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (T__71 - 72)) | (1L << (T__72 - 72)) | (1L << (T__73 - 72)) | (1L << (NAME - 72)))) != 0)) {
					{
					setState(304);
					constraintTable();
					}
				}

				setState(307);
				match(T__21);
				setState(313);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(308);
						indexColName();
						setState(309);
						match(T__14);
						}
						} 
					}
					setState(315);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				}
				setState(316);
				indexColName();
				setState(317);
				match(T__22);
				setState(318);
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
			setState(322);
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
			setState(324);
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
			setState(328);
			dataType();
			setState(331);
			switch (_input.LA(1)) {
			case T__30:
				{
				setState(329);
				defaultNull();
				}
				break;
			case T__7:
				{
				setState(330);
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
			setState(335);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(333);
				match(T__8);
				setState(334);
				columnDefaultValue();
				}
			}

			setState(338);
			_la = _input.LA(1);
			if (_la==T__29) {
				{
				setState(337);
				autoIncrement();
				}
			}

			setState(348);
			switch (_input.LA(1)) {
			case T__27:
				{
				{
				setState(340);
				match(T__27);
				setState(342);
				_la = _input.LA(1);
				if (_la==T__25) {
					{
					setState(341);
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
				setState(345);
				_la = _input.LA(1);
				if (_la==T__24) {
					{
					setState(344);
					match(T__24);
					}
				}

				setState(347);
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
			setState(352);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(350);
				match(T__13);
				setState(351);
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
			setState(354);
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
			setState(356);
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
			setState(358);
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
			setState(360);
			match(T__7);
			setState(361);
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
			setState(363);
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
		enterRule(_localctx, 50, RULE_referenceDefinition);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			match(T__31);
			setState(366);
			referenceTable();
			setState(367);
			match(T__21);
			setState(373);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(368);
					indexColName();
					setState(369);
					match(T__14);
					}
					} 
				}
				setState(375);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			}
			setState(376);
			indexColName();
			setState(377);
			match(T__22);
			setState(381);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(378);
				match(T__32);
				setState(379);
				match(T__33);
				setState(380);
				referenceOption();
				}
				break;
			}
			setState(386);
			_la = _input.LA(1);
			if (_la==T__32) {
				{
				setState(383);
				match(T__32);
				setState(384);
				match(T__34);
				setState(385);
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
		enterRule(_localctx, 52, RULE_referenceTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
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
		enterRule(_localctx, 54, RULE_indexColName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			idName();
			setState(392);
			_la = _input.LA(1);
			if (_la==T__35 || _la==T__36) {
				{
				setState(391);
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
		enterRule(_localctx, 56, RULE_dataType);
		int _la;
		try {
			int _alt;
			setState(687);
			switch (_input.LA(1)) {
			case T__37:
				_localctx = new TypeBitStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(394);
				match(T__37);
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

				}
				break;
			case T__38:
				_localctx = new TypeTinyIntStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(400);
				match(T__38);
				setState(404);
				_la = _input.LA(1);
				if (_la==T__21) {
					{
					setState(401);
					match(T__21);
					setState(402);
					match(INT);
					setState(403);
					match(T__22);
					}
				}

				setState(407);
				_la = _input.LA(1);
				if (_la==T__39) {
					{
					setState(406);
					match(T__39);
					}
				}

				setState(410);
				_la = _input.LA(1);
				if (_la==T__40) {
					{
					setState(409);
					match(T__40);
					}
				}

				}
				break;
			case T__41:
				_localctx = new TypeSmallIntStmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(412);
				match(T__41);
				setState(416);
				_la = _input.LA(1);
				if (_la==T__21) {
					{
					setState(413);
					match(T__21);
					setState(414);
					match(INT);
					setState(415);
					match(T__22);
					}
				}

				setState(419);
				_la = _input.LA(1);
				if (_la==T__39) {
					{
					setState(418);
					match(T__39);
					}
				}

				setState(422);
				_la = _input.LA(1);
				if (_la==T__40) {
					{
					setState(421);
					match(T__40);
					}
				}

				}
				break;
			case T__42:
				_localctx = new TypeMediumIntStmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(424);
				match(T__42);
				setState(428);
				_la = _input.LA(1);
				if (_la==T__21) {
					{
					setState(425);
					match(T__21);
					setState(426);
					match(INT);
					setState(427);
					match(T__22);
					}
				}

				setState(431);
				_la = _input.LA(1);
				if (_la==T__39) {
					{
					setState(430);
					match(T__39);
					}
				}

				setState(434);
				_la = _input.LA(1);
				if (_la==T__40) {
					{
					setState(433);
					match(T__40);
					}
				}

				}
				break;
			case T__43:
				_localctx = new TypeIntStmtContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(436);
				match(T__43);
				setState(440);
				_la = _input.LA(1);
				if (_la==T__21) {
					{
					setState(437);
					match(T__21);
					setState(438);
					match(INT);
					setState(439);
					match(T__22);
					}
				}

				setState(443);
				_la = _input.LA(1);
				if (_la==T__39) {
					{
					setState(442);
					match(T__39);
					}
				}

				setState(446);
				_la = _input.LA(1);
				if (_la==T__40) {
					{
					setState(445);
					match(T__40);
					}
				}

				}
				break;
			case T__44:
				_localctx = new TypeIntegerStmtContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(448);
				match(T__44);
				setState(452);
				_la = _input.LA(1);
				if (_la==T__21) {
					{
					setState(449);
					match(T__21);
					setState(450);
					match(INT);
					setState(451);
					match(T__22);
					}
				}

				setState(455);
				_la = _input.LA(1);
				if (_la==T__39) {
					{
					setState(454);
					match(T__39);
					}
				}

				setState(458);
				_la = _input.LA(1);
				if (_la==T__40) {
					{
					setState(457);
					match(T__40);
					}
				}

				}
				break;
			case T__45:
				_localctx = new TypeBigIntStmtContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(460);
				match(T__45);
				setState(464);
				_la = _input.LA(1);
				if (_la==T__21) {
					{
					setState(461);
					match(T__21);
					setState(462);
					match(INT);
					setState(463);
					match(T__22);
					}
				}

				setState(467);
				_la = _input.LA(1);
				if (_la==T__39) {
					{
					setState(466);
					match(T__39);
					}
				}

				setState(470);
				_la = _input.LA(1);
				if (_la==T__40) {
					{
					setState(469);
					match(T__40);
					}
				}

				}
				break;
			case T__46:
				_localctx = new TypeRealStmtContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(472);
				match(T__46);
				setState(478);
				_la = _input.LA(1);
				if (_la==T__21) {
					{
					setState(473);
					match(T__21);
					setState(474);
					match(INT);
					setState(475);
					match(T__14);
					setState(476);
					match(INT);
					setState(477);
					match(T__22);
					}
				}

				setState(481);
				_la = _input.LA(1);
				if (_la==T__39) {
					{
					setState(480);
					match(T__39);
					}
				}

				setState(484);
				_la = _input.LA(1);
				if (_la==T__40) {
					{
					setState(483);
					match(T__40);
					}
				}

				}
				break;
			case T__47:
				_localctx = new TypeDoubleStmtContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(486);
				match(T__47);
				setState(492);
				_la = _input.LA(1);
				if (_la==T__21) {
					{
					setState(487);
					match(T__21);
					setState(488);
					match(INT);
					setState(489);
					match(T__14);
					setState(490);
					match(INT);
					setState(491);
					match(T__22);
					}
				}

				setState(495);
				_la = _input.LA(1);
				if (_la==T__39) {
					{
					setState(494);
					match(T__39);
					}
				}

				setState(498);
				_la = _input.LA(1);
				if (_la==T__40) {
					{
					setState(497);
					match(T__40);
					}
				}

				}
				break;
			case T__48:
				_localctx = new TypeFloatStmtContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(500);
				match(T__48);
				setState(506);
				_la = _input.LA(1);
				if (_la==T__21) {
					{
					setState(501);
					match(T__21);
					setState(502);
					match(INT);
					setState(503);
					match(T__14);
					setState(504);
					match(INT);
					setState(505);
					match(T__22);
					}
				}

				setState(509);
				_la = _input.LA(1);
				if (_la==T__39) {
					{
					setState(508);
					match(T__39);
					}
				}

				setState(512);
				_la = _input.LA(1);
				if (_la==T__40) {
					{
					setState(511);
					match(T__40);
					}
				}

				}
				break;
			case T__49:
				_localctx = new TypeDecimalStmtContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(514);
				match(T__49);
				setState(522);
				_la = _input.LA(1);
				if (_la==T__21) {
					{
					setState(515);
					match(T__21);
					setState(516);
					match(INT);
					setState(519);
					_la = _input.LA(1);
					if (_la==T__14) {
						{
						setState(517);
						match(T__14);
						setState(518);
						match(INT);
						}
					}

					setState(521);
					match(T__22);
					}
				}

				setState(525);
				_la = _input.LA(1);
				if (_la==T__39) {
					{
					setState(524);
					match(T__39);
					}
				}

				setState(528);
				_la = _input.LA(1);
				if (_la==T__40) {
					{
					setState(527);
					match(T__40);
					}
				}

				}
				break;
			case T__50:
				_localctx = new TypeNumericStmtContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(530);
				match(T__50);
				setState(538);
				_la = _input.LA(1);
				if (_la==T__21) {
					{
					setState(531);
					match(T__21);
					setState(532);
					match(INT);
					setState(535);
					_la = _input.LA(1);
					if (_la==T__14) {
						{
						setState(533);
						match(T__14);
						setState(534);
						match(INT);
						}
					}

					setState(537);
					match(T__22);
					}
				}

				setState(541);
				_la = _input.LA(1);
				if (_la==T__39) {
					{
					setState(540);
					match(T__39);
					}
				}

				setState(544);
				_la = _input.LA(1);
				if (_la==T__40) {
					{
					setState(543);
					match(T__40);
					}
				}

				}
				break;
			case T__51:
				_localctx = new TypeDateStmtContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(546);
				match(T__51);
				}
				break;
			case T__52:
				_localctx = new TypeTimeStmtContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(547);
				match(T__52);
				}
				break;
			case T__53:
				_localctx = new TypeTimeStampStmtContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(548);
				match(T__53);
				}
				break;
			case T__54:
				_localctx = new TypeDateTimeStmtContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(549);
				match(T__54);
				}
				break;
			case T__55:
				_localctx = new TypeYearStmtContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(550);
				match(T__55);
				}
				break;
			case T__56:
				_localctx = new TypeCharStmtContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(551);
				match(T__56);
				setState(555);
				_la = _input.LA(1);
				if (_la==T__21) {
					{
					setState(552);
					match(T__21);
					setState(553);
					match(INT);
					setState(554);
					match(T__22);
					}
				}

				setState(560);
				_la = _input.LA(1);
				if (_la==T__9) {
					{
					setState(557);
					match(T__9);
					setState(558);
					match(T__10);
					setState(559);
					charsetName();
					}
				}

				setState(564);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(562);
					match(T__12);
					setState(563);
					collateName();
					}
				}

				}
				break;
			case T__57:
				_localctx = new TypeVarCharStmtContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(566);
				match(T__57);
				setState(567);
				match(T__21);
				setState(568);
				match(INT);
				setState(569);
				match(T__22);
				setState(573);
				_la = _input.LA(1);
				if (_la==T__9) {
					{
					setState(570);
					match(T__9);
					setState(571);
					match(T__10);
					setState(572);
					charsetName();
					}
				}

				setState(577);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(575);
					match(T__12);
					setState(576);
					collateName();
					}
				}

				}
				break;
			case T__58:
				_localctx = new TypeBinaryStmtContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(579);
				match(T__58);
				setState(583);
				_la = _input.LA(1);
				if (_la==T__21) {
					{
					setState(580);
					match(T__21);
					setState(581);
					match(INT);
					setState(582);
					match(T__22);
					}
				}

				}
				break;
			case T__59:
				_localctx = new TypeVarBinaryStmtContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(585);
				match(T__59);
				setState(586);
				match(T__21);
				setState(587);
				match(INT);
				setState(588);
				match(T__22);
				}
				break;
			case T__60:
				_localctx = new TypeTinyBlobStmtContext(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(589);
				match(T__60);
				}
				break;
			case T__61:
				_localctx = new TypeBlobStmtContext(_localctx);
				enterOuterAlt(_localctx, 23);
				{
				setState(590);
				match(T__61);
				}
				break;
			case T__62:
				_localctx = new TypeMediumBlobStmtContext(_localctx);
				enterOuterAlt(_localctx, 24);
				{
				setState(591);
				match(T__62);
				}
				break;
			case T__63:
				_localctx = new TypeLongBlobStmtContext(_localctx);
				enterOuterAlt(_localctx, 25);
				{
				setState(592);
				match(T__63);
				}
				break;
			case T__64:
				_localctx = new TypeTinyTextStmtContext(_localctx);
				enterOuterAlt(_localctx, 26);
				{
				setState(593);
				match(T__64);
				setState(595);
				_la = _input.LA(1);
				if (_la==T__58) {
					{
					setState(594);
					match(T__58);
					}
				}

				setState(600);
				_la = _input.LA(1);
				if (_la==T__9) {
					{
					setState(597);
					match(T__9);
					setState(598);
					match(T__10);
					setState(599);
					charsetName();
					}
				}

				setState(604);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(602);
					match(T__12);
					setState(603);
					collateName();
					}
				}

				}
				break;
			case T__65:
				_localctx = new TypeTextStmtContext(_localctx);
				enterOuterAlt(_localctx, 27);
				{
				setState(606);
				match(T__65);
				setState(608);
				_la = _input.LA(1);
				if (_la==T__58) {
					{
					setState(607);
					match(T__58);
					}
				}

				setState(613);
				_la = _input.LA(1);
				if (_la==T__9) {
					{
					setState(610);
					match(T__9);
					setState(611);
					match(T__10);
					setState(612);
					charsetName();
					}
				}

				setState(617);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(615);
					match(T__12);
					setState(616);
					collateName();
					}
				}

				}
				break;
			case T__66:
				_localctx = new TypeMediumTextStmtContext(_localctx);
				enterOuterAlt(_localctx, 28);
				{
				setState(619);
				match(T__66);
				setState(621);
				_la = _input.LA(1);
				if (_la==T__58) {
					{
					setState(620);
					match(T__58);
					}
				}

				setState(626);
				_la = _input.LA(1);
				if (_la==T__9) {
					{
					setState(623);
					match(T__9);
					setState(624);
					match(T__10);
					setState(625);
					charsetName();
					}
				}

				setState(630);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(628);
					match(T__12);
					setState(629);
					collateName();
					}
				}

				}
				break;
			case T__67:
				_localctx = new TypeLongTextStmtContext(_localctx);
				enterOuterAlt(_localctx, 29);
				{
				setState(632);
				match(T__67);
				setState(634);
				_la = _input.LA(1);
				if (_la==T__58) {
					{
					setState(633);
					match(T__58);
					}
				}

				setState(639);
				_la = _input.LA(1);
				if (_la==T__9) {
					{
					setState(636);
					match(T__9);
					setState(637);
					match(T__10);
					setState(638);
					charsetName();
					}
				}

				setState(643);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(641);
					match(T__12);
					setState(642);
					collateName();
					}
				}

				}
				break;
			case T__68:
				_localctx = new TypeEnumStmtContext(_localctx);
				enterOuterAlt(_localctx, 30);
				{
				setState(645);
				match(T__68);
				setState(646);
				match(T__21);
				setState(652);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(647);
						stringItem();
						setState(648);
						match(T__14);
						}
						} 
					}
					setState(654);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
				}
				setState(655);
				stringItem();
				setState(656);
				match(T__22);
				setState(660);
				_la = _input.LA(1);
				if (_la==T__9) {
					{
					setState(657);
					match(T__9);
					setState(658);
					match(T__10);
					setState(659);
					charsetName();
					}
				}

				setState(664);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(662);
					match(T__12);
					setState(663);
					collateName();
					}
				}

				}
				break;
			case T__10:
				_localctx = new TypeSetStmtContext(_localctx);
				enterOuterAlt(_localctx, 31);
				{
				setState(666);
				match(T__10);
				setState(667);
				match(T__21);
				setState(673);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(668);
						stringItem();
						setState(669);
						match(T__14);
						}
						} 
					}
					setState(675);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
				}
				setState(676);
				stringItem();
				setState(677);
				match(T__22);
				setState(681);
				_la = _input.LA(1);
				if (_la==T__9) {
					{
					setState(678);
					match(T__9);
					setState(679);
					match(T__10);
					setState(680);
					charsetName();
					}
				}

				setState(685);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(683);
					match(T__12);
					setState(684);
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
		enterRule(_localctx, 58, RULE_stringItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(689);
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
		enterRule(_localctx, 60, RULE_charsetName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(691);
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
		enterRule(_localctx, 62, RULE_collateName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(693);
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
		enterRule(_localctx, 64, RULE_referenceOption);
		try {
			setState(701);
			switch (_input.LA(1)) {
			case T__19:
				enterOuterAlt(_localctx, 1);
				{
				setState(695);
				match(T__19);
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 2);
				{
				setState(696);
				match(T__20);
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(697);
				match(T__10);
				setState(698);
				match(T__30);
				}
				}
				break;
			case T__69:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(699);
				match(T__69);
				setState(700);
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
		enterRule(_localctx, 66, RULE_defaultValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(703);
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
		enterRule(_localctx, 68, RULE_tableOptions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(708);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__12) | (1L << T__13))) != 0) || _la==NAME) {
				{
				{
				setState(705);
				option();
				}
				}
				setState(710);
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
		enterRule(_localctx, 70, RULE_option);
		try {
			setState(715);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(711);
				match(NAME);
				setState(712);
				match(T__11);
				setState(713);
				match(NAME);
				}
				break;
			case T__8:
			case T__9:
			case T__12:
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(714);
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
		enterRule(_localctx, 72, RULE_idName);
		try {
			setState(727);
			switch (_input.LA(1)) {
			case T__71:
				enterOuterAlt(_localctx, 1);
				{
				setState(717);
				match(T__71);
				setState(718);
				match(NAME);
				setState(719);
				match(T__71);
				}
				break;
			case T__72:
				enterOuterAlt(_localctx, 2);
				{
				setState(720);
				match(T__72);
				setState(721);
				match(NAME);
				setState(722);
				match(T__72);
				}
				break;
			case T__73:
				enterOuterAlt(_localctx, 3);
				{
				setState(723);
				match(T__73);
				setState(724);
				match(NAME);
				setState(725);
				match(T__73);
				}
				break;
			case NAME:
				enterOuterAlt(_localctx, 4);
				{
				setState(726);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3S\u02dc\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\7\2N\n\2\f\2\16\2Q\13\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3"+
		"e\n\3\3\4\3\4\3\4\3\4\5\4k\n\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\5\5t\n\5\3"+
		"\5\3\5\7\5x\n\5\f\5\16\5{\13\5\3\6\5\6~\n\6\3\6\3\6\3\6\5\6\u0083\n\6"+
		"\3\6\3\6\5\6\u0087\n\6\3\6\3\6\5\6\u008b\n\6\3\6\3\6\3\6\3\6\5\6\u0091"+
		"\n\6\3\7\3\7\3\b\3\b\3\b\3\b\7\b\u0099\n\b\f\b\16\b\u009c\13\b\3\b\3\b"+
		"\3\t\7\t\u00a1\n\t\f\t\16\t\u00a4\13\t\3\t\3\t\3\t\3\t\7\t\u00aa\n\t\f"+
		"\t\16\t\u00ad\13\t\3\t\5\t\u00b0\n\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f\5"+
		"\f\u00b9\n\f\3\f\3\f\3\f\5\f\u00be\n\f\3\f\3\f\3\f\7\f\u00c3\n\f\f\f\16"+
		"\f\u00c6\13\f\3\f\5\f\u00c9\n\f\3\r\3\r\3\16\3\16\5\16\u00cf\n\16\3\16"+
		"\3\16\3\16\3\16\5\16\u00d5\n\16\3\16\3\16\3\16\5\16\u00da\n\16\3\16\3"+
		"\16\3\16\3\17\3\17\3\20\3\20\3\20\7\20\u00e4\n\20\f\20\16\20\u00e7\13"+
		"\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\5\21\u00f0\n\21\5\21\u00f2\n\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u00fa\n\21\f\21\16\21\u00fd\13\21"+
		"\3\21\3\21\3\21\3\21\3\21\5\21\u0104\n\21\3\21\3\21\3\21\3\21\7\21\u010a"+
		"\n\21\f\21\16\21\u010d\13\21\3\21\3\21\3\21\3\21\3\21\5\21\u0114\n\21"+
		"\5\21\u0116\n\21\3\21\3\21\5\21\u011a\n\21\3\21\5\21\u011d\n\21\3\21\3"+
		"\21\3\21\3\21\7\21\u0123\n\21\f\21\16\21\u0126\13\21\3\21\3\21\3\21\3"+
		"\21\3\21\5\21\u012d\n\21\5\21\u012f\n\21\3\21\3\21\3\21\5\21\u0134\n\21"+
		"\3\21\3\21\3\21\3\21\7\21\u013a\n\21\f\21\16\21\u013d\13\21\3\21\3\21"+
		"\3\21\3\21\5\21\u0143\n\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25"+
		"\5\25\u014e\n\25\3\25\3\25\5\25\u0152\n\25\3\25\5\25\u0155\n\25\3\25\3"+
		"\25\5\25\u0159\n\25\3\25\5\25\u015c\n\25\3\25\5\25\u015f\n\25\3\25\3\25"+
		"\5\25\u0163\n\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\32\3\32"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\7\33\u0176\n\33\f\33\16\33\u0179\13\33"+
		"\3\33\3\33\3\33\3\33\3\33\5\33\u0180\n\33\3\33\3\33\3\33\5\33\u0185\n"+
		"\33\3\34\3\34\3\35\3\35\5\35\u018b\n\35\3\36\3\36\3\36\3\36\5\36\u0191"+
		"\n\36\3\36\3\36\3\36\3\36\5\36\u0197\n\36\3\36\5\36\u019a\n\36\3\36\5"+
		"\36\u019d\n\36\3\36\3\36\3\36\3\36\5\36\u01a3\n\36\3\36\5\36\u01a6\n\36"+
		"\3\36\5\36\u01a9\n\36\3\36\3\36\3\36\3\36\5\36\u01af\n\36\3\36\5\36\u01b2"+
		"\n\36\3\36\5\36\u01b5\n\36\3\36\3\36\3\36\3\36\5\36\u01bb\n\36\3\36\5"+
		"\36\u01be\n\36\3\36\5\36\u01c1\n\36\3\36\3\36\3\36\3\36\5\36\u01c7\n\36"+
		"\3\36\5\36\u01ca\n\36\3\36\5\36\u01cd\n\36\3\36\3\36\3\36\3\36\5\36\u01d3"+
		"\n\36\3\36\5\36\u01d6\n\36\3\36\5\36\u01d9\n\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\5\36\u01e1\n\36\3\36\5\36\u01e4\n\36\3\36\5\36\u01e7\n\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\5\36\u01ef\n\36\3\36\5\36\u01f2\n\36\3\36\5"+
		"\36\u01f5\n\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u01fd\n\36\3\36\5\36"+
		"\u0200\n\36\3\36\5\36\u0203\n\36\3\36\3\36\3\36\3\36\3\36\5\36\u020a\n"+
		"\36\3\36\5\36\u020d\n\36\3\36\5\36\u0210\n\36\3\36\5\36\u0213\n\36\3\36"+
		"\3\36\3\36\3\36\3\36\5\36\u021a\n\36\3\36\5\36\u021d\n\36\3\36\5\36\u0220"+
		"\n\36\3\36\5\36\u0223\n\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\5\36\u022e\n\36\3\36\3\36\3\36\5\36\u0233\n\36\3\36\3\36\5\36\u0237\n"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0240\n\36\3\36\3\36\5\36"+
		"\u0244\n\36\3\36\3\36\3\36\3\36\5\36\u024a\n\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\5\36\u0256\n\36\3\36\3\36\3\36\5\36\u025b"+
		"\n\36\3\36\3\36\5\36\u025f\n\36\3\36\3\36\5\36\u0263\n\36\3\36\3\36\3"+
		"\36\5\36\u0268\n\36\3\36\3\36\5\36\u026c\n\36\3\36\3\36\5\36\u0270\n\36"+
		"\3\36\3\36\3\36\5\36\u0275\n\36\3\36\3\36\5\36\u0279\n\36\3\36\3\36\5"+
		"\36\u027d\n\36\3\36\3\36\3\36\5\36\u0282\n\36\3\36\3\36\5\36\u0286\n\36"+
		"\3\36\3\36\3\36\3\36\3\36\7\36\u028d\n\36\f\36\16\36\u0290\13\36\3\36"+
		"\3\36\3\36\3\36\3\36\5\36\u0297\n\36\3\36\3\36\5\36\u029b\n\36\3\36\3"+
		"\36\3\36\3\36\3\36\7\36\u02a2\n\36\f\36\16\36\u02a5\13\36\3\36\3\36\3"+
		"\36\3\36\3\36\5\36\u02ac\n\36\3\36\3\36\5\36\u02b0\n\36\5\36\u02b2\n\36"+
		"\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u02c0\n\"\3#\3#\3$"+
		"\7$\u02c5\n$\f$\16$\u02c8\13$\3%\3%\3%\3%\5%\u02ce\n%\3&\3&\3&\3&\3&\3"+
		"&\3&\3&\3&\3&\5&\u02da\n&\3&\2\2\'\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668:<>@BDFHJ\2\7\3\2\5\6\3\2\26\27\3\2\34\35\3\2"+
		"&\'\4\2!!NP\u0352\2O\3\2\2\2\4d\3\2\2\2\6f\3\2\2\2\bn\3\2\2\2\n\u0090"+
		"\3\2\2\2\f\u0092\3\2\2\2\16\u0094\3\2\2\2\20\u00a2\3\2\2\2\22\u00b1\3"+
		"\2\2\2\24\u00b3\3\2\2\2\26\u00b6\3\2\2\2\30\u00ca\3\2\2\2\32\u00cc\3\2"+
		"\2\2\34\u00de\3\2\2\2\36\u00e5\3\2\2\2 \u0142\3\2\2\2\"\u0144\3\2\2\2"+
		"$\u0146\3\2\2\2&\u0148\3\2\2\2(\u014a\3\2\2\2*\u0164\3\2\2\2,\u0166\3"+
		"\2\2\2.\u0168\3\2\2\2\60\u016a\3\2\2\2\62\u016d\3\2\2\2\64\u016f\3\2\2"+
		"\2\66\u0186\3\2\2\28\u0188\3\2\2\2:\u02b1\3\2\2\2<\u02b3\3\2\2\2>\u02b5"+
		"\3\2\2\2@\u02b7\3\2\2\2B\u02bf\3\2\2\2D\u02c1\3\2\2\2F\u02c6\3\2\2\2H"+
		"\u02cd\3\2\2\2J\u02d9\3\2\2\2LN\5\4\3\2ML\3\2\2\2NQ\3\2\2\2OM\3\2\2\2"+
		"OP\3\2\2\2P\3\3\2\2\2QO\3\2\2\2RS\5\b\5\2ST\7\3\2\2Te\3\2\2\2UV\5\6\4"+
		"\2VW\7\3\2\2We\3\2\2\2XY\5\32\16\2YZ\7\3\2\2Ze\3\2\2\2[\\\5\26\f\2\\]"+
		"\7\3\2\2]e\3\2\2\2^_\5\24\13\2_`\7\3\2\2`e\3\2\2\2ab\5\16\b\2bc\7\3\2"+
		"\2ce\3\2\2\2dR\3\2\2\2dU\3\2\2\2dX\3\2\2\2d[\3\2\2\2d^\3\2\2\2da\3\2\2"+
		"\2e\5\3\2\2\2fg\7\4\2\2gj\t\2\2\2hi\7\7\2\2ik\7\b\2\2jh\3\2\2\2jk\3\2"+
		"\2\2kl\3\2\2\2lm\5J&\2m\7\3\2\2\2no\7\t\2\2os\t\2\2\2pq\7\7\2\2qr\7\n"+
		"\2\2rt\7\b\2\2sp\3\2\2\2st\3\2\2\2tu\3\2\2\2uy\5J&\2vx\5\n\6\2wv\3\2\2"+
		"\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z\t\3\2\2\2{y\3\2\2\2|~\7\13\2\2}|\3\2"+
		"\2\2}~\3\2\2\2~\177\3\2\2\2\177\u0080\7\f\2\2\u0080\u0082\7\r\2\2\u0081"+
		"\u0083\7\16\2\2\u0082\u0081\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\3"+
		"\2\2\2\u0084\u0091\5> \2\u0085\u0087\7\13\2\2\u0086\u0085\3\2\2\2\u0086"+
		"\u0087\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u008a\7\17\2\2\u0089\u008b\7"+
		"\16\2\2\u008a\u0089\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c\3\2\2\2\u008c"+
		"\u0091\5@!\2\u008d\u008e\7\20\2\2\u008e\u008f\7\16\2\2\u008f\u0091\5\f"+
		"\7\2\u0090}\3\2\2\2\u0090\u0086\3\2\2\2\u0090\u008d\3\2\2\2\u0091\13\3"+
		"\2\2\2\u0092\u0093\7P\2\2\u0093\r\3\2\2\2\u0094\u009a\7\r\2\2\u0095\u0096"+
		"\5\20\t\2\u0096\u0097\7\21\2\2\u0097\u0099\3\2\2\2\u0098\u0095\3\2\2\2"+
		"\u0099\u009c\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009d"+
		"\3\2\2\2\u009c\u009a\3\2\2\2\u009d\u009e\5\20\t\2\u009e\17\3\2\2\2\u009f"+
		"\u00a1\7\22\2\2\u00a0\u009f\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3"+
		"\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a5\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5"+
		"\u00a6\7M\2\2\u00a6\u00af\7\16\2\2\u00a7\u00b0\5\22\n\2\u00a8\u00aa\7"+
		"\22\2\2\u00a9\u00a8\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab"+
		"\u00ac\3\2\2\2\u00ac\u00ae\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae\u00b0\7M"+
		"\2\2\u00af\u00a7\3\2\2\2\u00af\u00ab\3\2\2\2\u00b0\21\3\2\2\2\u00b1\u00b2"+
		"\5D#\2\u00b2\23\3\2\2\2\u00b3\u00b4\7\23\2\2\u00b4\u00b5\5J&\2\u00b5\25"+
		"\3\2\2\2\u00b6\u00b8\7\4\2\2\u00b7\u00b9\7\24\2\2\u00b8\u00b7\3\2\2\2"+
		"\u00b8\u00b9\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bd\7\25\2\2\u00bb\u00bc"+
		"\7\7\2\2\u00bc\u00be\7\b\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be"+
		"\u00bf\3\2\2\2\u00bf\u00c4\5\30\r\2\u00c0\u00c1\7\21\2\2\u00c1\u00c3\5"+
		"\30\r\2\u00c2\u00c0\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4"+
		"\u00c5\3\2\2\2\u00c5\u00c8\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00c9\t\3"+
		"\2\2\u00c8\u00c7\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\27\3\2\2\2\u00ca\u00cb"+
		"\5J&\2\u00cb\31\3\2\2\2\u00cc\u00ce\7\t\2\2\u00cd\u00cf\7\24\2\2\u00ce"+
		"\u00cd\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d4\7\25"+
		"\2\2\u00d1\u00d2\7\7\2\2\u00d2\u00d3\7\n\2\2\u00d3\u00d5\7\b\2\2\u00d4"+
		"\u00d1\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7\5\34"+
		"\17\2\u00d7\u00d9\7\30\2\2\u00d8\u00da\5\36\20\2\u00d9\u00d8\3\2\2\2\u00d9"+
		"\u00da\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dc\7\31\2\2\u00dc\u00dd\5"+
		"F$\2\u00dd\33\3\2\2\2\u00de\u00df\5J&\2\u00df\35\3\2\2\2\u00e0\u00e1\5"+
		" \21\2\u00e1\u00e2\7\21\2\2\u00e2\u00e4\3\2\2\2\u00e3\u00e0\3\2\2\2\u00e4"+
		"\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e8\3\2"+
		"\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00e9\5 \21\2\u00e9\37\3\2\2\2\u00ea\u00eb"+
		"\5\"\22\2\u00eb\u00ec\5(\25\2\u00ec\u0143\3\2\2\2\u00ed\u00ef\7\32\2\2"+
		"\u00ee\u00f0\5$\23\2\u00ef\u00ee\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f2"+
		"\3\2\2\2\u00f1\u00ed\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3"+
		"\u00f4\7\33\2\2\u00f4\u00f5\7\34\2\2\u00f5\u00fb\7\30\2\2\u00f6\u00f7"+
		"\58\35\2\u00f7\u00f8\7\21\2\2\u00f8\u00fa\3\2\2\2\u00f9\u00f6\3\2\2\2"+
		"\u00fa\u00fd\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fe"+
		"\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fe\u00ff\58\35\2\u00ff\u0100\7\31\2\2"+
		"\u0100\u0143\3\2\2\2\u0101\u0103\t\4\2\2\u0102\u0104\5$\23\2\u0103\u0102"+
		"\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u010b\7\30\2\2"+
		"\u0106\u0107\58\35\2\u0107\u0108\7\21\2\2\u0108\u010a\3\2\2\2\u0109\u0106"+
		"\3\2\2\2\u010a\u010d\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c"+
		"\u010e\3\2\2\2\u010d\u010b\3\2\2\2\u010e\u010f\58\35\2\u010f\u0110\7\31"+
		"\2\2\u0110\u0143\3\2\2\2\u0111\u0113\7\32\2\2\u0112\u0114\5$\23\2\u0113"+
		"\u0112\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0116\3\2\2\2\u0115\u0111\3\2"+
		"\2\2\u0115\u0116\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0119\7\36\2\2\u0118"+
		"\u011a\t\4\2\2\u0119\u0118\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011c\3\2"+
		"\2\2\u011b\u011d\5&\24\2\u011c\u011b\3\2\2\2\u011c\u011d\3\2\2\2\u011d"+
		"\u011e\3\2\2\2\u011e\u0124\7\30\2\2\u011f\u0120\58\35\2\u0120\u0121\7"+
		"\21\2\2\u0121\u0123\3\2\2\2\u0122\u011f\3\2\2\2\u0123\u0126\3\2\2\2\u0124"+
		"\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0127\3\2\2\2\u0126\u0124\3\2"+
		"\2\2\u0127\u0128\58\35\2\u0128\u0129\7\31\2\2\u0129\u0143\3\2\2\2\u012a"+
		"\u012c\7\32\2\2\u012b\u012d\5$\23\2\u012c\u012b\3\2\2\2\u012c\u012d\3"+
		"\2\2\2\u012d\u012f\3\2\2\2\u012e\u012a\3\2\2\2\u012e\u012f\3\2\2\2\u012f"+
		"\u0130\3\2\2\2\u0130\u0131\7\37\2\2\u0131\u0133\7\34\2\2\u0132\u0134\5"+
		"&\24\2\u0133\u0132\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0135\3\2\2\2\u0135"+
		"\u013b\7\30\2\2\u0136\u0137\58\35\2\u0137\u0138\7\21\2\2\u0138\u013a\3"+
		"\2\2\2\u0139\u0136\3\2\2\2\u013a\u013d\3\2\2\2\u013b\u0139\3\2\2\2\u013b"+
		"\u013c\3\2\2\2\u013c\u013e\3\2\2\2\u013d\u013b\3\2\2\2\u013e\u013f\58"+
		"\35\2\u013f\u0140\7\31\2\2\u0140\u0141\5\64\33\2\u0141\u0143\3\2\2\2\u0142"+
		"\u00ea\3\2\2\2\u0142\u00f1\3\2\2\2\u0142\u0101\3\2\2\2\u0142\u0115\3\2"+
		"\2\2\u0142\u012e\3\2\2\2\u0143!\3\2\2\2\u0144\u0145\5J&\2\u0145#\3\2\2"+
		"\2\u0146\u0147\5J&\2\u0147%\3\2\2\2\u0148\u0149\5J&\2\u0149\'\3\2\2\2"+
		"\u014a\u014d\5:\36\2\u014b\u014e\5.\30\2\u014c\u014e\5\60\31\2\u014d\u014b"+
		"\3\2\2\2\u014d\u014c\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u0151\3\2\2\2\u014f"+
		"\u0150\7\13\2\2\u0150\u0152\5,\27\2\u0151\u014f\3\2\2\2\u0151\u0152\3"+
		"\2\2\2\u0152\u0154\3\2\2\2\u0153\u0155\5*\26\2\u0154\u0153\3\2\2\2\u0154"+
		"\u0155\3\2\2\2\u0155\u015e\3\2\2\2\u0156\u0158\7\36\2\2\u0157\u0159\7"+
		"\34\2\2\u0158\u0157\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u015f\3\2\2\2\u015a"+
		"\u015c\7\33\2\2\u015b\u015a\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015d\3"+
		"\2\2\2\u015d\u015f\7\34\2\2\u015e\u0156\3\2\2\2\u015e\u015b\3\2\2\2\u015e"+
		"\u015f\3\2\2\2\u015f\u0162\3\2\2\2\u0160\u0161\7\20\2\2\u0161\u0163\5"+
		"\62\32\2\u0162\u0160\3\2\2\2\u0162\u0163\3\2\2\2\u0163)\3\2\2\2\u0164"+
		"\u0165\7 \2\2\u0165+\3\2\2\2\u0166\u0167\5D#\2\u0167-\3\2\2\2\u0168\u0169"+
		"\7!\2\2\u0169/\3\2\2\2\u016a\u016b\7\n\2\2\u016b\u016c\7!\2\2\u016c\61"+
		"\3\2\2\2\u016d\u016e\7P\2\2\u016e\63\3\2\2\2\u016f\u0170\7\"\2\2\u0170"+
		"\u0171\5\66\34\2\u0171\u0177\7\30\2\2\u0172\u0173\58\35\2\u0173\u0174"+
		"\7\21\2\2\u0174\u0176\3\2\2\2\u0175\u0172\3\2\2\2\u0176\u0179\3\2\2\2"+
		"\u0177\u0175\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u017a\3\2\2\2\u0179\u0177"+
		"\3\2\2\2\u017a\u017b\58\35\2\u017b\u017f\7\31\2\2\u017c\u017d\7#\2\2\u017d"+
		"\u017e\7$\2\2\u017e\u0180\5B\"\2\u017f\u017c\3\2\2\2\u017f\u0180\3\2\2"+
		"\2\u0180\u0184\3\2\2\2\u0181\u0182\7#\2\2\u0182\u0183\7%\2\2\u0183\u0185"+
		"\5B\"\2\u0184\u0181\3\2\2\2\u0184\u0185\3\2\2\2\u0185\65\3\2\2\2\u0186"+
		"\u0187\5J&\2\u0187\67\3\2\2\2\u0188\u018a\5J&\2\u0189\u018b\t\5\2\2\u018a"+
		"\u0189\3\2\2\2\u018a\u018b\3\2\2\2\u018b9\3\2\2\2\u018c\u0190\7(\2\2\u018d"+
		"\u018e\7\30\2\2\u018e\u018f\7N\2\2\u018f\u0191\7\31\2\2\u0190\u018d\3"+
		"\2\2\2\u0190\u0191\3\2\2\2\u0191\u02b2\3\2\2\2\u0192\u0196\7)\2\2\u0193"+
		"\u0194\7\30\2\2\u0194\u0195\7N\2\2\u0195\u0197\7\31\2\2\u0196\u0193\3"+
		"\2\2\2\u0196\u0197\3\2\2\2\u0197\u0199\3\2\2\2\u0198\u019a\7*\2\2\u0199"+
		"\u0198\3\2\2\2\u0199\u019a\3\2\2\2\u019a\u019c\3\2\2\2\u019b\u019d\7+"+
		"\2\2\u019c\u019b\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u02b2\3\2\2\2\u019e"+
		"\u01a2\7,\2\2\u019f\u01a0\7\30\2\2\u01a0\u01a1\7N\2\2\u01a1\u01a3\7\31"+
		"\2\2\u01a2\u019f\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a5\3\2\2\2\u01a4"+
		"\u01a6\7*\2\2\u01a5\u01a4\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01a8\3\2"+
		"\2\2\u01a7\u01a9\7+\2\2\u01a8\u01a7\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9"+
		"\u02b2\3\2\2\2\u01aa\u01ae\7-\2\2\u01ab\u01ac\7\30\2\2\u01ac\u01ad\7N"+
		"\2\2\u01ad\u01af\7\31\2\2\u01ae\u01ab\3\2\2\2\u01ae\u01af\3\2\2\2\u01af"+
		"\u01b1\3\2\2\2\u01b0\u01b2\7*\2\2\u01b1\u01b0\3\2\2\2\u01b1\u01b2\3\2"+
		"\2\2\u01b2\u01b4\3\2\2\2\u01b3\u01b5\7+\2\2\u01b4\u01b3\3\2\2\2\u01b4"+
		"\u01b5\3\2\2\2\u01b5\u02b2\3\2\2\2\u01b6\u01ba\7.\2\2\u01b7\u01b8\7\30"+
		"\2\2\u01b8\u01b9\7N\2\2\u01b9\u01bb\7\31\2\2\u01ba\u01b7\3\2\2\2\u01ba"+
		"\u01bb\3\2\2\2\u01bb\u01bd\3\2\2\2\u01bc\u01be\7*\2\2\u01bd\u01bc\3\2"+
		"\2\2\u01bd\u01be\3\2\2\2\u01be\u01c0\3\2\2\2\u01bf\u01c1\7+\2\2\u01c0"+
		"\u01bf\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u02b2\3\2\2\2\u01c2\u01c6\7/"+
		"\2\2\u01c3\u01c4\7\30\2\2\u01c4\u01c5\7N\2\2\u01c5\u01c7\7\31\2\2\u01c6"+
		"\u01c3\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01c9\3\2\2\2\u01c8\u01ca\7*"+
		"\2\2\u01c9\u01c8\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca\u01cc\3\2\2\2\u01cb"+
		"\u01cd\7+\2\2\u01cc\u01cb\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\u02b2\3\2"+
		"\2\2\u01ce\u01d2\7\60\2\2\u01cf\u01d0\7\30\2\2\u01d0\u01d1\7N\2\2\u01d1"+
		"\u01d3\7\31\2\2\u01d2\u01cf\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3\u01d5\3"+
		"\2\2\2\u01d4\u01d6\7*\2\2\u01d5\u01d4\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6"+
		"\u01d8\3\2\2\2\u01d7\u01d9\7+\2\2\u01d8\u01d7\3\2\2\2\u01d8\u01d9\3\2"+
		"\2\2\u01d9\u02b2\3\2\2\2\u01da\u01e0\7\61\2\2\u01db\u01dc\7\30\2\2\u01dc"+
		"\u01dd\7N\2\2\u01dd\u01de\7\21\2\2\u01de\u01df\7N\2\2\u01df\u01e1\7\31"+
		"\2\2\u01e0\u01db\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1\u01e3\3\2\2\2\u01e2"+
		"\u01e4\7*\2\2\u01e3\u01e2\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01e6\3\2"+
		"\2\2\u01e5\u01e7\7+\2\2\u01e6\u01e5\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7"+
		"\u02b2\3\2\2\2\u01e8\u01ee\7\62\2\2\u01e9\u01ea\7\30\2\2\u01ea\u01eb\7"+
		"N\2\2\u01eb\u01ec\7\21\2\2\u01ec\u01ed\7N\2\2\u01ed\u01ef\7\31\2\2\u01ee"+
		"\u01e9\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef\u01f1\3\2\2\2\u01f0\u01f2\7*"+
		"\2\2\u01f1\u01f0\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2\u01f4\3\2\2\2\u01f3"+
		"\u01f5\7+\2\2\u01f4\u01f3\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5\u02b2\3\2"+
		"\2\2\u01f6\u01fc\7\63\2\2\u01f7\u01f8\7\30\2\2\u01f8\u01f9\7N\2\2\u01f9"+
		"\u01fa\7\21\2\2\u01fa\u01fb\7N\2\2\u01fb\u01fd\7\31\2\2\u01fc\u01f7\3"+
		"\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\u01ff\3\2\2\2\u01fe\u0200\7*\2\2\u01ff"+
		"\u01fe\3\2\2\2\u01ff\u0200\3\2\2\2\u0200\u0202\3\2\2\2\u0201\u0203\7+"+
		"\2\2\u0202\u0201\3\2\2\2\u0202\u0203\3\2\2\2\u0203\u02b2\3\2\2\2\u0204"+
		"\u020c\7\64\2\2\u0205\u0206\7\30\2\2\u0206\u0209\7N\2\2\u0207\u0208\7"+
		"\21\2\2\u0208\u020a\7N\2\2\u0209\u0207\3\2\2\2\u0209\u020a\3\2\2\2\u020a"+
		"\u020b\3\2\2\2\u020b\u020d\7\31\2\2\u020c\u0205\3\2\2\2\u020c\u020d\3"+
		"\2\2\2\u020d\u020f\3\2\2\2\u020e\u0210\7*\2\2\u020f\u020e\3\2\2\2\u020f"+
		"\u0210\3\2\2\2\u0210\u0212\3\2\2\2\u0211\u0213\7+\2\2\u0212\u0211\3\2"+
		"\2\2\u0212\u0213\3\2\2\2\u0213\u02b2\3\2\2\2\u0214\u021c\7\65\2\2\u0215"+
		"\u0216\7\30\2\2\u0216\u0219\7N\2\2\u0217\u0218\7\21\2\2\u0218\u021a\7"+
		"N\2\2\u0219\u0217\3\2\2\2\u0219\u021a\3\2\2\2\u021a\u021b\3\2\2\2\u021b"+
		"\u021d\7\31\2\2\u021c\u0215\3\2\2\2\u021c\u021d\3\2\2\2\u021d\u021f\3"+
		"\2\2\2\u021e\u0220\7*\2\2\u021f\u021e\3\2\2\2\u021f\u0220\3\2\2\2\u0220"+
		"\u0222\3\2\2\2\u0221\u0223\7+\2\2\u0222\u0221\3\2\2\2\u0222\u0223\3\2"+
		"\2\2\u0223\u02b2\3\2\2\2\u0224\u02b2\7\66\2\2\u0225\u02b2\7\67\2\2\u0226"+
		"\u02b2\78\2\2\u0227\u02b2\79\2\2\u0228\u02b2\7:\2\2\u0229\u022d\7;\2\2"+
		"\u022a\u022b\7\30\2\2\u022b\u022c\7N\2\2\u022c\u022e\7\31\2\2\u022d\u022a"+
		"\3\2\2\2\u022d\u022e\3\2\2\2\u022e\u0232\3\2\2\2\u022f\u0230\7\f\2\2\u0230"+
		"\u0231\7\r\2\2\u0231\u0233\5> \2\u0232\u022f\3\2\2\2\u0232\u0233\3\2\2"+
		"\2\u0233\u0236\3\2\2\2\u0234\u0235\7\17\2\2\u0235\u0237\5@!\2\u0236\u0234"+
		"\3\2\2\2\u0236\u0237\3\2\2\2\u0237\u02b2\3\2\2\2\u0238\u0239\7<\2\2\u0239"+
		"\u023a\7\30\2\2\u023a\u023b\7N\2\2\u023b\u023f\7\31\2\2\u023c\u023d\7"+
		"\f\2\2\u023d\u023e\7\r\2\2\u023e\u0240\5> \2\u023f\u023c\3\2\2\2\u023f"+
		"\u0240\3\2\2\2\u0240\u0243\3\2\2\2\u0241\u0242\7\17\2\2\u0242\u0244\5"+
		"@!\2\u0243\u0241\3\2\2\2\u0243\u0244\3\2\2\2\u0244\u02b2\3\2\2\2\u0245"+
		"\u0249\7=\2\2\u0246\u0247\7\30\2\2\u0247\u0248\7N\2\2\u0248\u024a\7\31"+
		"\2\2\u0249\u0246\3\2\2\2\u0249\u024a\3\2\2\2\u024a\u02b2\3\2\2\2\u024b"+
		"\u024c\7>\2\2\u024c\u024d\7\30\2\2\u024d\u024e\7N\2\2\u024e\u02b2\7\31"+
		"\2\2\u024f\u02b2\7?\2\2\u0250\u02b2\7@\2\2\u0251\u02b2\7A\2\2\u0252\u02b2"+
		"\7B\2\2\u0253\u0255\7C\2\2\u0254\u0256\7=\2\2\u0255\u0254\3\2\2\2\u0255"+
		"\u0256\3\2\2\2\u0256\u025a\3\2\2\2\u0257\u0258\7\f\2\2\u0258\u0259\7\r"+
		"\2\2\u0259\u025b\5> \2\u025a\u0257\3\2\2\2\u025a\u025b\3\2\2\2\u025b\u025e"+
		"\3\2\2\2\u025c\u025d\7\17\2\2\u025d\u025f\5@!\2\u025e\u025c\3\2\2\2\u025e"+
		"\u025f\3\2\2\2\u025f\u02b2\3\2\2\2\u0260\u0262\7D\2\2\u0261\u0263\7=\2"+
		"\2\u0262\u0261\3\2\2\2\u0262\u0263\3\2\2\2\u0263\u0267\3\2\2\2\u0264\u0265"+
		"\7\f\2\2\u0265\u0266\7\r\2\2\u0266\u0268\5> \2\u0267\u0264\3\2\2\2\u0267"+
		"\u0268\3\2\2\2\u0268\u026b\3\2\2\2\u0269\u026a\7\17\2\2\u026a\u026c\5"+
		"@!\2\u026b\u0269\3\2\2\2\u026b\u026c\3\2\2\2\u026c\u02b2\3\2\2\2\u026d"+
		"\u026f\7E\2\2\u026e\u0270\7=\2\2\u026f\u026e\3\2\2\2\u026f\u0270\3\2\2"+
		"\2\u0270\u0274\3\2\2\2\u0271\u0272\7\f\2\2\u0272\u0273\7\r\2\2\u0273\u0275"+
		"\5> \2\u0274\u0271\3\2\2\2\u0274\u0275\3\2\2\2\u0275\u0278\3\2\2\2\u0276"+
		"\u0277\7\17\2\2\u0277\u0279\5@!\2\u0278\u0276\3\2\2\2\u0278\u0279\3\2"+
		"\2\2\u0279\u02b2\3\2\2\2\u027a\u027c\7F\2\2\u027b\u027d\7=\2\2\u027c\u027b"+
		"\3\2\2\2\u027c\u027d\3\2\2\2\u027d\u0281\3\2\2\2\u027e\u027f\7\f\2\2\u027f"+
		"\u0280\7\r\2\2\u0280\u0282\5> \2\u0281\u027e\3\2\2\2\u0281\u0282\3\2\2"+
		"\2\u0282\u0285\3\2\2\2\u0283\u0284\7\17\2\2\u0284\u0286\5@!\2\u0285\u0283"+
		"\3\2\2\2\u0285\u0286\3\2\2\2\u0286\u02b2\3\2\2\2\u0287\u0288\7G\2\2\u0288"+
		"\u028e\7\30\2\2\u0289\u028a\5<\37\2\u028a\u028b\7\21\2\2\u028b\u028d\3"+
		"\2\2\2\u028c\u0289\3\2\2\2\u028d\u0290\3\2\2\2\u028e\u028c\3\2\2\2\u028e"+
		"\u028f\3\2\2\2\u028f\u0291\3\2\2\2\u0290\u028e\3\2\2\2\u0291\u0292\5<"+
		"\37\2\u0292\u0296\7\31\2\2\u0293\u0294\7\f\2\2\u0294\u0295\7\r\2\2\u0295"+
		"\u0297\5> \2\u0296\u0293\3\2\2\2\u0296\u0297\3\2\2\2\u0297\u029a\3\2\2"+
		"\2\u0298\u0299\7\17\2\2\u0299\u029b\5@!\2\u029a\u0298\3\2\2\2\u029a\u029b"+
		"\3\2\2\2\u029b\u02b2\3\2\2\2\u029c\u029d\7\r\2\2\u029d\u02a3\7\30\2\2"+
		"\u029e\u029f\5<\37\2\u029f\u02a0\7\21\2\2\u02a0\u02a2\3\2\2\2\u02a1\u029e"+
		"\3\2\2\2\u02a2\u02a5\3\2\2\2\u02a3\u02a1\3\2\2\2\u02a3\u02a4\3\2\2\2\u02a4"+
		"\u02a6\3\2\2\2\u02a5\u02a3\3\2\2\2\u02a6\u02a7\5<\37\2\u02a7\u02ab\7\31"+
		"\2\2\u02a8\u02a9\7\f\2\2\u02a9\u02aa\7\r\2\2\u02aa\u02ac\5> \2\u02ab\u02a8"+
		"\3\2\2\2\u02ab\u02ac\3\2\2\2\u02ac\u02af\3\2\2\2\u02ad\u02ae\7\17\2\2"+
		"\u02ae\u02b0\5@!\2\u02af\u02ad\3\2\2\2\u02af\u02b0\3\2\2\2\u02b0\u02b2"+
		"\3\2\2\2\u02b1\u018c\3\2\2\2\u02b1\u0192\3\2\2\2\u02b1\u019e\3\2\2\2\u02b1"+
		"\u01aa\3\2\2\2\u02b1\u01b6\3\2\2\2\u02b1\u01c2\3\2\2\2\u02b1\u01ce\3\2"+
		"\2\2\u02b1\u01da\3\2\2\2\u02b1\u01e8\3\2\2\2\u02b1\u01f6\3\2\2\2\u02b1"+
		"\u0204\3\2\2\2\u02b1\u0214\3\2\2\2\u02b1\u0224\3\2\2\2\u02b1\u0225\3\2"+
		"\2\2\u02b1\u0226\3\2\2\2\u02b1\u0227\3\2\2\2\u02b1\u0228\3\2\2\2\u02b1"+
		"\u0229\3\2\2\2\u02b1\u0238\3\2\2\2\u02b1\u0245\3\2\2\2\u02b1\u024b\3\2"+
		"\2\2\u02b1\u024f\3\2\2\2\u02b1\u0250\3\2\2\2\u02b1\u0251\3\2\2\2\u02b1"+
		"\u0252\3\2\2\2\u02b1\u0253\3\2\2\2\u02b1\u0260\3\2\2\2\u02b1\u026d\3\2"+
		"\2\2\u02b1\u027a\3\2\2\2\u02b1\u0287\3\2\2\2\u02b1\u029c\3\2\2\2\u02b2"+
		";\3\2\2\2\u02b3\u02b4\7P\2\2\u02b4=\3\2\2\2\u02b5\u02b6\5J&\2\u02b6?\3"+
		"\2\2\2\u02b7\u02b8\5J&\2\u02b8A\3\2\2\2\u02b9\u02c0\7\26\2\2\u02ba\u02c0"+
		"\7\27\2\2\u02bb\u02bc\7\r\2\2\u02bc\u02c0\7!\2\2\u02bd\u02be\7H\2\2\u02be"+
		"\u02c0\7I\2\2\u02bf\u02b9\3\2\2\2\u02bf\u02ba\3\2\2\2\u02bf\u02bb\3\2"+
		"\2\2\u02bf\u02bd\3\2\2\2\u02c0C\3\2\2\2\u02c1\u02c2\t\6\2\2\u02c2E\3\2"+
		"\2\2\u02c3\u02c5\5H%\2\u02c4\u02c3\3\2\2\2\u02c5\u02c8\3\2\2\2\u02c6\u02c4"+
		"\3\2\2\2\u02c6\u02c7\3\2\2\2\u02c7G\3\2\2\2\u02c8\u02c6\3\2\2\2\u02c9"+
		"\u02ca\7M\2\2\u02ca\u02cb\7\16\2\2\u02cb\u02ce\7M\2\2\u02cc\u02ce\5\n"+
		"\6\2\u02cd\u02c9\3\2\2\2\u02cd\u02cc\3\2\2\2\u02ceI\3\2\2\2\u02cf\u02d0"+
		"\7J\2\2\u02d0\u02d1\7M\2\2\u02d1\u02da\7J\2\2\u02d2\u02d3\7K\2\2\u02d3"+
		"\u02d4\7M\2\2\u02d4\u02da\7K\2\2\u02d5\u02d6\7L\2\2\u02d6\u02d7\7M\2\2"+
		"\u02d7\u02da\7L\2\2\u02d8\u02da\7M\2\2\u02d9\u02cf\3\2\2\2\u02d9\u02d2"+
		"\3\2\2\2\u02d9\u02d5\3\2\2\2\u02d9\u02d8\3\2\2\2\u02daK\3\2\2\2sOdjsy"+
		"}\u0082\u0086\u008a\u0090\u009a\u00a2\u00ab\u00af\u00b8\u00bd\u00c4\u00c8"+
		"\u00ce\u00d4\u00d9\u00e5\u00ef\u00f1\u00fb\u0103\u010b\u0113\u0115\u0119"+
		"\u011c\u0124\u012c\u012e\u0133\u013b\u0142\u014d\u0151\u0154\u0158\u015b"+
		"\u015e\u0162\u0177\u017f\u0184\u018a\u0190\u0196\u0199\u019c\u01a2\u01a5"+
		"\u01a8\u01ae\u01b1\u01b4\u01ba\u01bd\u01c0\u01c6\u01c9\u01cc\u01d2\u01d5"+
		"\u01d8\u01e0\u01e3\u01e6\u01ee\u01f1\u01f4\u01fc\u01ff\u0202\u0209\u020c"+
		"\u020f\u0212\u0219\u021c\u021f\u0222\u022d\u0232\u0236\u023f\u0243\u0249"+
		"\u0255\u025a\u025e\u0262\u0267\u026b\u026f\u0274\u0278\u027c\u0281\u0285"+
		"\u028e\u0296\u029a\u02a3\u02ab\u02af\u02b1\u02bf\u02c6\u02cd\u02d9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}