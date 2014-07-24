// Generated from D:\Estudos\Java\Desktop\SQLParser\SQL.g4 by ANTLR 4.1
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
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__73=1, T__72=2, T__71=3, T__70=4, T__69=5, T__68=6, T__67=7, T__66=8, 
		T__65=9, T__64=10, T__63=11, T__62=12, T__61=13, T__60=14, T__59=15, T__58=16, 
		T__57=17, T__56=18, T__55=19, T__54=20, T__53=21, T__52=22, T__51=23, 
		T__50=24, T__49=25, T__48=26, T__47=27, T__46=28, T__45=29, T__44=30, 
		T__43=31, T__42=32, T__41=33, T__40=34, T__39=35, T__38=36, T__37=37, 
		T__36=38, T__35=39, T__34=40, T__33=41, T__32=42, T__31=43, T__30=44, 
		T__29=45, T__28=46, T__27=47, T__26=48, T__25=49, T__24=50, T__23=51, 
		T__22=52, T__21=53, T__20=54, T__19=55, T__18=56, T__17=57, T__16=58, 
		T__15=59, T__14=60, T__13=61, T__12=62, T__11=63, T__10=64, T__9=65, T__8=66, 
		T__7=67, T__6=68, T__5=69, T__4=70, T__3=71, T__2=72, T__1=73, T__0=74, 
		NAME=75, INT=76, FLOAT=77, STRING=78, COMMENT=79, SINGLE_COMMENT=80, WS=81;
	public static final String[] tokenNames = {
		"<INVALID>", "'INDEX'", "'BINARY'", "'`'", "'DELETE'", "'CONSTRAINT'", 
		"'COMMENT'", "'MEDIUMINT'", "'PRIMARY'", "'IF'", "'TINYBLOB'", "'\"'", 
		"'LONGBLOB'", "'SET'", "'YEAR'", "'UNSIGNED'", "'TIMESTAMP'", "')'", "'CHARACTER'", 
		"'TABLE'", "'DECIMAL'", "'CHAR'", "'LONGTEXT'", "'@'", "'DESC'", "'AUTO_INCREMENT'", 
		"'='", "'CASCADE'", "'TINYINT'", "'DATETIME'", "'REFERENCES'", "'FLOAT'", 
		"'DROP'", "'USE'", "'TEXT'", "'NOT'", "'INT'", "'VARBINARY'", "'INTEGER'", 
		"'TEMPORARY'", "'EXISTS'", "','", "'ASC'", "'NUMERIC'", "'('", "'FOREIGN'", 
		"'TIME'", "'ACTION'", "'''", "'COLLATE'", "'MEDIUMBLOB'", "'TINYTEXT'", 
		"'BIGINT'", "'DATE'", "'DEFAULT'", "'ZEROFILL'", "'BLOB'", "'VARCHAR'", 
		"'NO'", "'BIT'", "'NULL'", "'UPDATE'", "'SCHEMA'", "'ENUM'", "'SMALLINT'", 
		"';'", "'KEY'", "'CREATE'", "'ON'", "'DOUBLE'", "'REAL'", "'MEDIUMTEXT'", 
		"'UNIQUE'", "'DATABASE'", "'RESTRICT'", "NAME", "INT", "FLOAT", "STRING", 
		"COMMENT", "SINGLE_COMMENT", "WS"
	};
	public static final int
		RULE_script = 0, RULE_stmt = 1, RULE_createSchema = 2, RULE_createSpecification = 3, 
		RULE_setStmt = 4, RULE_setOption = 5, RULE_setDefaultValue = 6, RULE_useStmt = 7, 
		RULE_dropTable = 8, RULE_dropTableName = 9, RULE_createTable = 10, RULE_tableName = 11, 
		RULE_createDefinition = 12, RULE_columnName = 13, RULE_constraintName = 14, 
		RULE_constraintTable = 15, RULE_columnDefinition = 16, RULE_autoIncrement = 17, 
		RULE_columnDefaultValue = 18, RULE_defaultNull = 19, RULE_defaultNotNull = 20, 
		RULE_referenceDefinition = 21, RULE_referenceTable = 22, RULE_indexColName = 23, 
		RULE_dataType = 24, RULE_stringItem = 25, RULE_charsetName = 26, RULE_collateName = 27, 
		RULE_referenceOption = 28, RULE_defaultValue = 29, RULE_tableOptions = 30, 
		RULE_option = 31, RULE_idName = 32;
	public static final String[] ruleNames = {
		"script", "stmt", "createSchema", "createSpecification", "setStmt", "setOption", 
		"setDefaultValue", "useStmt", "dropTable", "dropTableName", "createTable", 
		"tableName", "createDefinition", "columnName", "constraintName", "constraintTable", 
		"columnDefinition", "autoIncrement", "columnDefaultValue", "defaultNull", 
		"defaultNotNull", "referenceDefinition", "referenceTable", "indexColName", 
		"dataType", "stringItem", "charsetName", "collateName", "referenceOption", 
		"defaultValue", "tableOptions", "option", "idName"
	};

	@Override
	public String getGrammarFileName() { return "SQL.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public SQLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ScriptContext extends ParserRuleContext {
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(66); stmt();
					}
					} 
				}
				setState(71);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
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
		public UseStmtContext useStmt() {
			return getRuleContext(UseStmtContext.class,0);
		}
		public CreateTableContext createTable() {
			return getRuleContext(CreateTableContext.class,0);
		}
		public DropTableContext dropTable() {
			return getRuleContext(DropTableContext.class,0);
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
			setState(87);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(72); createSchema();
				setState(73); match(65);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(75); createTable();
				setState(76); match(65);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(78); dropTable();
				setState(79); match(65);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(81); useStmt();
				setState(82); match(65);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(84); setStmt();
				setState(85); match(65);
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

	public static class CreateSchemaContext extends ParserRuleContext {
		public CreateSpecificationContext createSpecification(int i) {
			return getRuleContext(CreateSpecificationContext.class,i);
		}
		public IdNameContext idName() {
			return getRuleContext(IdNameContext.class,0);
		}
		public List<CreateSpecificationContext> createSpecification() {
			return getRuleContexts(CreateSpecificationContext.class);
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
		enterRule(_localctx, 4, RULE_createSchema);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(89); match(67);
			setState(90);
			_la = _input.LA(1);
			if ( !(_la==62 || _la==73) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(94);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(91); match(9);
				setState(92); match(35);
				setState(93); match(40);
				}
				break;
			}
			setState(96); idName();
			setState(100);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(97); createSpecification();
					}
					} 
				}
				setState(102);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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
		public CollateNameContext collateName() {
			return getRuleContext(CollateNameContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SQLParser.STRING, 0); }
		public CharsetNameContext charsetName() {
			return getRuleContext(CharsetNameContext.class,0);
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
		enterRule(_localctx, 6, RULE_createSpecification);
		try {
			setState(123);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(103); match(54);
					}
					break;
				}
				setState(106); match(18);
				setState(107); match(13);
				setState(109);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(108); match(26);
					}
					break;
				}
				setState(111); charsetName();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(112); match(54);
					}
					break;
				}
				setState(115); match(49);
				setState(117);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(116); match(26);
					}
					break;
				}
				setState(119); collateName();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(120); match(6);
				setState(121); match(26);
				setState(122); match(STRING);
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

	public static class SetStmtContext extends ParserRuleContext {
		public SetOptionContext setOption(int i) {
			return getRuleContext(SetOptionContext.class,i);
		}
		public List<SetOptionContext> setOption() {
			return getRuleContexts(SetOptionContext.class);
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
		enterRule(_localctx, 8, RULE_setStmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(125); match(13);
			setState(131);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(126); setOption();
					setState(127); match(41);
					}
					} 
				}
				setState(133);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(134); setOption();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode NAME(int i) {
			return getToken(SQLParser.NAME, i);
		}
		public SetDefaultValueContext setDefaultValue() {
			return getRuleContext(SetDefaultValueContext.class,0);
		}
		public List<TerminalNode> NAME() { return getTokens(SQLParser.NAME); }
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
		enterRule(_localctx, 10, RULE_setOption);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(136); match(23);
					}
					} 
				}
				setState(141);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(142); match(NAME);
			setState(143); match(26);
			setState(152);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(144); setDefaultValue();
				}
				break;

			case 2:
				{
				{
				setState(148);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(145); match(23);
						}
						} 
					}
					setState(150);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				}
				setState(151); match(NAME);
				}
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
		enterRule(_localctx, 12, RULE_setDefaultValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154); defaultValue();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 14, RULE_useStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156); match(33);
			setState(157); idName();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 16, RULE_dropTable);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(159); match(32);
			setState(161);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(160); match(39);
				}
				break;
			}
			setState(163); match(19);
			setState(166);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(164); match(9);
				setState(165); match(40);
				}
				break;
			}
			setState(168); dropTableName();
			setState(173);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(169); match(41);
					setState(170); dropTableName();
					}
					} 
				}
				setState(175);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			setState(177);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(176);
				_la = _input.LA(1);
				if ( !(_la==27 || _la==74) ) {
				_errHandler.recoverInline(this);
				}
				consume();
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
		enterRule(_localctx, 18, RULE_dropTableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179); idName();
			}
		}
		catch (RecognitionException re) {
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
		public List<CreateDefinitionContext> createDefinition() {
			return getRuleContexts(CreateDefinitionContext.class);
		}
		public TableOptionsContext tableOptions() {
			return getRuleContext(TableOptionsContext.class,0);
		}
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public CreateDefinitionContext createDefinition(int i) {
			return getRuleContext(CreateDefinitionContext.class,i);
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
		enterRule(_localctx, 20, RULE_createTable);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(181); match(67);
			setState(183);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(182); match(39);
				}
				break;
			}
			setState(185); match(19);
			setState(189);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(186); match(9);
				setState(187); match(35);
				setState(188); match(40);
				}
				break;
			}
			setState(191); tableName();
			setState(192); match(44);
			setState(198);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(193); createDefinition();
					setState(194); match(41);
					}
					} 
				}
				setState(200);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			setState(201); createDefinition();
			setState(202); match(17);
			setState(203); tableOptions();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 22, RULE_tableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205); idName();
			}
		}
		catch (RecognitionException re) {
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
		public IndexColNameContext indexColName(int i) {
			return getRuleContext(IndexColNameContext.class,i);
		}
		public ConstraintNameContext constraintName() {
			return getRuleContext(ConstraintNameContext.class,0);
		}
		public List<IndexColNameContext> indexColName() {
			return getRuleContexts(IndexColNameContext.class);
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
		public ConstraintTableContext constraintTable() {
			return getRuleContext(ConstraintTableContext.class,0);
		}
		public IndexColNameContext indexColName(int i) {
			return getRuleContext(IndexColNameContext.class,i);
		}
		public ConstraintNameContext constraintName() {
			return getRuleContext(ConstraintNameContext.class,0);
		}
		public List<IndexColNameContext> indexColName() {
			return getRuleContexts(IndexColNameContext.class);
		}
		public ReferenceDefinitionContext referenceDefinition() {
			return getRuleContext(ReferenceDefinitionContext.class,0);
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
		public IndexColNameContext indexColName(int i) {
			return getRuleContext(IndexColNameContext.class,i);
		}
		public ConstraintNameContext constraintName() {
			return getRuleContext(ConstraintNameContext.class,0);
		}
		public List<IndexColNameContext> indexColName() {
			return getRuleContexts(IndexColNameContext.class);
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
	public static class UniqueStmtContext extends CreateDefinitionContext {
		public ConstraintTableContext constraintTable() {
			return getRuleContext(ConstraintTableContext.class,0);
		}
		public IndexColNameContext indexColName(int i) {
			return getRuleContext(IndexColNameContext.class,i);
		}
		public ConstraintNameContext constraintName() {
			return getRuleContext(ConstraintNameContext.class,0);
		}
		public List<IndexColNameContext> indexColName() {
			return getRuleContexts(IndexColNameContext.class);
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

	public final CreateDefinitionContext createDefinition() throws RecognitionException {
		CreateDefinitionContext _localctx = new CreateDefinitionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_createDefinition);
		int _la;
		try {
			int _alt;
			setState(295);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				_localctx = new FieldStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(207); columnName();
				setState(208); columnDefinition();
				}
				break;

			case 2:
				_localctx = new PrimaryKeyStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(214);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(210); match(5);
					setState(212);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						setState(211); constraintName();
						}
						break;
					}
					}
					break;
				}
				setState(216); match(8);
				setState(217); match(66);
				setState(218); match(44);
				setState(224);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(219); indexColName();
						setState(220); match(41);
						}
						} 
					}
					setState(226);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				}
				setState(227); indexColName();
				setState(228); match(17);
				}
				break;

			case 3:
				_localctx = new IndexStmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(230);
				_la = _input.LA(1);
				if ( !(_la==1 || _la==66) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(232);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(231); constraintName();
					}
					break;
				}
				setState(234); match(44);
				setState(240);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(235); indexColName();
						setState(236); match(41);
						}
						} 
					}
					setState(242);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				}
				setState(243); indexColName();
				setState(244); match(17);
				}
				break;

			case 4:
				_localctx = new UniqueStmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(250);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(246); match(5);
					setState(248);
					switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
					case 1:
						{
						setState(247); constraintName();
						}
						break;
					}
					}
					break;
				}
				setState(252); match(72);
				setState(254);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(253);
					_la = _input.LA(1);
					if ( !(_la==1 || _la==66) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					break;
				}
				setState(257);
				switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
				case 1:
					{
					setState(256); constraintTable();
					}
					break;
				}
				setState(259); match(44);
				setState(265);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(260); indexColName();
						setState(261); match(41);
						}
						} 
					}
					setState(267);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				}
				setState(268); indexColName();
				setState(269); match(17);
				}
				break;

			case 5:
				_localctx = new ForeignStmtContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(275);
				switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
				case 1:
					{
					setState(271); match(5);
					setState(273);
					switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
					case 1:
						{
						setState(272); constraintName();
						}
						break;
					}
					}
					break;
				}
				setState(277); match(45);
				setState(278); match(66);
				setState(280);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(279); constraintTable();
					}
					break;
				}
				setState(282); match(44);
				setState(288);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(283); indexColName();
						setState(284); match(41);
						}
						} 
					}
					setState(290);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				}
				setState(291); indexColName();
				setState(292); match(17);
				setState(293); referenceDefinition();
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
		enterRule(_localctx, 26, RULE_columnName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297); idName();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 28, RULE_constraintName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299); idName();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 30, RULE_constraintTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301); idName();
			}
		}
		catch (RecognitionException re) {
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
		public ColumnDefaultValueContext columnDefaultValue() {
			return getRuleContext(ColumnDefaultValueContext.class,0);
		}
		public AutoIncrementContext autoIncrement() {
			return getRuleContext(AutoIncrementContext.class,0);
		}
		public DefaultNotNullContext defaultNotNull() {
			return getRuleContext(DefaultNotNullContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SQLParser.STRING, 0); }
		public DefaultNullContext defaultNull() {
			return getRuleContext(DefaultNullContext.class,0);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
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
		enterRule(_localctx, 32, RULE_columnDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303); dataType();
			setState(306);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(304); defaultNull();
				}
				break;

			case 2:
				{
				setState(305); defaultNotNull();
				}
				break;
			}
			setState(310);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(308); match(54);
				setState(309); columnDefaultValue();
				}
				break;
			}
			setState(313);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(312); autoIncrement();
				}
				break;
			}
			setState(323);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				{
				setState(315); match(72);
				setState(317);
				switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					{
					setState(316); match(66);
					}
					break;
				}
				}
				}
				break;

			case 2:
				{
				{
				setState(320);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(319); match(8);
					}
					break;
				}
				setState(322); match(66);
				}
				}
				break;
			}
			setState(327);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(325); match(6);
				setState(326); match(STRING);
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
		enterRule(_localctx, 34, RULE_autoIncrement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329); match(25);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 36, RULE_columnDefaultValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331); defaultValue();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 38, RULE_defaultNull);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333); match(60);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 40, RULE_defaultNotNull);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335); match(35);
			setState(336); match(60);
			}
		}
		catch (RecognitionException re) {
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
		public ReferenceOptionContext referenceOption(int i) {
			return getRuleContext(ReferenceOptionContext.class,i);
		}
		public IndexColNameContext indexColName(int i) {
			return getRuleContext(IndexColNameContext.class,i);
		}
		public List<ReferenceOptionContext> referenceOption() {
			return getRuleContexts(ReferenceOptionContext.class);
		}
		public ReferenceTableContext referenceTable() {
			return getRuleContext(ReferenceTableContext.class,0);
		}
		public List<IndexColNameContext> indexColName() {
			return getRuleContexts(IndexColNameContext.class);
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
		enterRule(_localctx, 42, RULE_referenceDefinition);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(338); match(30);
			setState(339); referenceTable();
			setState(340); match(44);
			setState(346);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(341); indexColName();
					setState(342); match(41);
					}
					} 
				}
				setState(348);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			}
			setState(349); indexColName();
			setState(350); match(17);
			setState(354);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(351); match(68);
				setState(352); match(4);
				setState(353); referenceOption();
				}
				break;
			}
			setState(359);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(356); match(68);
				setState(357); match(61);
				setState(358); referenceOption();
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
		enterRule(_localctx, 44, RULE_referenceTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361); idName();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 46, RULE_indexColName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363); idName();
			setState(365);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(364);
				((IndexColNameContext)_localctx).Type = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==24 || _la==42) ) {
					((IndexColNameContext)_localctx).Type = (Token)_errHandler.recoverInline(this);
				}
				consume();
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
		public CollateNameContext collateName() {
			return getRuleContext(CollateNameContext.class,0);
		}
		public StringItemContext stringItem(int i) {
			return getRuleContext(StringItemContext.class,i);
		}
		public List<StringItemContext> stringItem() {
			return getRuleContexts(StringItemContext.class);
		}
		public CharsetNameContext charsetName() {
			return getRuleContext(CharsetNameContext.class,0);
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
		public CollateNameContext collateName() {
			return getRuleContext(CollateNameContext.class,0);
		}
		public CharsetNameContext charsetName() {
			return getRuleContext(CharsetNameContext.class,0);
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
		public CollateNameContext collateName() {
			return getRuleContext(CollateNameContext.class,0);
		}
		public CharsetNameContext charsetName() {
			return getRuleContext(CharsetNameContext.class,0);
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
		public CollateNameContext collateName() {
			return getRuleContext(CollateNameContext.class,0);
		}
		public CharsetNameContext charsetName() {
			return getRuleContext(CharsetNameContext.class,0);
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
		public CollateNameContext collateName() {
			return getRuleContext(CollateNameContext.class,0);
		}
		public TerminalNode INT() { return getToken(SQLParser.INT, 0); }
		public CharsetNameContext charsetName() {
			return getRuleContext(CharsetNameContext.class,0);
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
		public CollateNameContext collateName() {
			return getRuleContext(CollateNameContext.class,0);
		}
		public TerminalNode INT() { return getToken(SQLParser.INT, 0); }
		public CharsetNameContext charsetName() {
			return getRuleContext(CharsetNameContext.class,0);
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
		public CollateNameContext collateName() {
			return getRuleContext(CollateNameContext.class,0);
		}
		public CharsetNameContext charsetName() {
			return getRuleContext(CharsetNameContext.class,0);
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
		public CollateNameContext collateName() {
			return getRuleContext(CollateNameContext.class,0);
		}
		public StringItemContext stringItem(int i) {
			return getRuleContext(StringItemContext.class,i);
		}
		public List<StringItemContext> stringItem() {
			return getRuleContexts(StringItemContext.class);
		}
		public CharsetNameContext charsetName() {
			return getRuleContext(CharsetNameContext.class,0);
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
		enterRule(_localctx, 48, RULE_dataType);
		try {
			int _alt;
			setState(660);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				_localctx = new TypeBitStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(367); match(59);
				setState(371);
				switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
				case 1:
					{
					setState(368); match(44);
					setState(369); match(INT);
					setState(370); match(17);
					}
					break;
				}
				}
				break;

			case 2:
				_localctx = new TypeTinyIntStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(373); match(28);
				setState(377);
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
				case 1:
					{
					setState(374); match(44);
					setState(375); match(INT);
					setState(376); match(17);
					}
					break;
				}
				setState(380);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(379); match(15);
					}
					break;
				}
				setState(383);
				switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
				case 1:
					{
					setState(382); match(55);
					}
					break;
				}
				}
				break;

			case 3:
				_localctx = new TypeSmallIntStmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(385); match(64);
				setState(389);
				switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
				case 1:
					{
					setState(386); match(44);
					setState(387); match(INT);
					setState(388); match(17);
					}
					break;
				}
				setState(392);
				switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
				case 1:
					{
					setState(391); match(15);
					}
					break;
				}
				setState(395);
				switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
				case 1:
					{
					setState(394); match(55);
					}
					break;
				}
				}
				break;

			case 4:
				_localctx = new TypeMediumIntStmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(397); match(7);
				setState(401);
				switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
				case 1:
					{
					setState(398); match(44);
					setState(399); match(INT);
					setState(400); match(17);
					}
					break;
				}
				setState(404);
				switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
				case 1:
					{
					setState(403); match(15);
					}
					break;
				}
				setState(407);
				switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
				case 1:
					{
					setState(406); match(55);
					}
					break;
				}
				}
				break;

			case 5:
				_localctx = new TypeIntStmtContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(409); match(36);
				setState(413);
				switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
				case 1:
					{
					setState(410); match(44);
					setState(411); match(INT);
					setState(412); match(17);
					}
					break;
				}
				setState(416);
				switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
				case 1:
					{
					setState(415); match(15);
					}
					break;
				}
				setState(419);
				switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
				case 1:
					{
					setState(418); match(55);
					}
					break;
				}
				}
				break;

			case 6:
				_localctx = new TypeIntegerStmtContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(421); match(38);
				setState(425);
				switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
				case 1:
					{
					setState(422); match(44);
					setState(423); match(INT);
					setState(424); match(17);
					}
					break;
				}
				setState(428);
				switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
				case 1:
					{
					setState(427); match(15);
					}
					break;
				}
				setState(431);
				switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
				case 1:
					{
					setState(430); match(55);
					}
					break;
				}
				}
				break;

			case 7:
				_localctx = new TypeBigIntStmtContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(433); match(52);
				setState(437);
				switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
				case 1:
					{
					setState(434); match(44);
					setState(435); match(INT);
					setState(436); match(17);
					}
					break;
				}
				setState(440);
				switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
				case 1:
					{
					setState(439); match(15);
					}
					break;
				}
				setState(443);
				switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
				case 1:
					{
					setState(442); match(55);
					}
					break;
				}
				}
				break;

			case 8:
				_localctx = new TypeRealStmtContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(445); match(70);
				setState(451);
				switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
				case 1:
					{
					setState(446); match(44);
					setState(447); match(INT);
					setState(448); match(41);
					setState(449); match(INT);
					setState(450); match(17);
					}
					break;
				}
				setState(454);
				switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
				case 1:
					{
					setState(453); match(15);
					}
					break;
				}
				setState(457);
				switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
				case 1:
					{
					setState(456); match(55);
					}
					break;
				}
				}
				break;

			case 9:
				_localctx = new TypeDoubleStmtContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(459); match(69);
				setState(465);
				switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
				case 1:
					{
					setState(460); match(44);
					setState(461); match(INT);
					setState(462); match(41);
					setState(463); match(INT);
					setState(464); match(17);
					}
					break;
				}
				setState(468);
				switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
				case 1:
					{
					setState(467); match(15);
					}
					break;
				}
				setState(471);
				switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
				case 1:
					{
					setState(470); match(55);
					}
					break;
				}
				}
				break;

			case 10:
				_localctx = new TypeFloatStmtContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(473); match(31);
				setState(479);
				switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
				case 1:
					{
					setState(474); match(44);
					setState(475); match(INT);
					setState(476); match(41);
					setState(477); match(INT);
					setState(478); match(17);
					}
					break;
				}
				setState(482);
				switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
				case 1:
					{
					setState(481); match(15);
					}
					break;
				}
				setState(485);
				switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
				case 1:
					{
					setState(484); match(55);
					}
					break;
				}
				}
				break;

			case 11:
				_localctx = new TypeDecimalStmtContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(487); match(20);
				setState(495);
				switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
				case 1:
					{
					setState(488); match(44);
					setState(489); match(INT);
					setState(492);
					switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
					case 1:
						{
						setState(490); match(41);
						setState(491); match(INT);
						}
						break;
					}
					setState(494); match(17);
					}
					break;
				}
				setState(498);
				switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
				case 1:
					{
					setState(497); match(15);
					}
					break;
				}
				setState(501);
				switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
				case 1:
					{
					setState(500); match(55);
					}
					break;
				}
				}
				break;

			case 12:
				_localctx = new TypeNumericStmtContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(503); match(43);
				setState(511);
				switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
				case 1:
					{
					setState(504); match(44);
					setState(505); match(INT);
					setState(508);
					switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
					case 1:
						{
						setState(506); match(41);
						setState(507); match(INT);
						}
						break;
					}
					setState(510); match(17);
					}
					break;
				}
				setState(514);
				switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
				case 1:
					{
					setState(513); match(15);
					}
					break;
				}
				setState(517);
				switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
				case 1:
					{
					setState(516); match(55);
					}
					break;
				}
				}
				break;

			case 13:
				_localctx = new TypeDateStmtContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(519); match(53);
				}
				break;

			case 14:
				_localctx = new TypeTimeStmtContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(520); match(46);
				}
				break;

			case 15:
				_localctx = new TypeTimeStampStmtContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(521); match(16);
				}
				break;

			case 16:
				_localctx = new TypeDateTimeStmtContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(522); match(29);
				}
				break;

			case 17:
				_localctx = new TypeYearStmtContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(523); match(14);
				}
				break;

			case 18:
				_localctx = new TypeCharStmtContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(524); match(21);
				setState(528);
				switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
				case 1:
					{
					setState(525); match(44);
					setState(526); match(INT);
					setState(527); match(17);
					}
					break;
				}
				setState(533);
				switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
				case 1:
					{
					setState(530); match(18);
					setState(531); match(13);
					setState(532); charsetName();
					}
					break;
				}
				setState(537);
				switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
				case 1:
					{
					setState(535); match(49);
					setState(536); collateName();
					}
					break;
				}
				}
				break;

			case 19:
				_localctx = new TypeVarCharStmtContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(539); match(57);
				setState(540); match(44);
				setState(541); match(INT);
				setState(542); match(17);
				setState(546);
				switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
				case 1:
					{
					setState(543); match(18);
					setState(544); match(13);
					setState(545); charsetName();
					}
					break;
				}
				setState(550);
				switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
				case 1:
					{
					setState(548); match(49);
					setState(549); collateName();
					}
					break;
				}
				}
				break;

			case 20:
				_localctx = new TypeBinaryStmtContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(552); match(2);
				setState(556);
				switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
				case 1:
					{
					setState(553); match(44);
					setState(554); match(INT);
					setState(555); match(17);
					}
					break;
				}
				}
				break;

			case 21:
				_localctx = new TypeVarBinaryStmtContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(558); match(37);
				setState(559); match(44);
				setState(560); match(INT);
				setState(561); match(17);
				}
				break;

			case 22:
				_localctx = new TypeTinyBlobStmtContext(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(562); match(10);
				}
				break;

			case 23:
				_localctx = new TypeBlobStmtContext(_localctx);
				enterOuterAlt(_localctx, 23);
				{
				setState(563); match(56);
				}
				break;

			case 24:
				_localctx = new TypeMediumBlobStmtContext(_localctx);
				enterOuterAlt(_localctx, 24);
				{
				setState(564); match(50);
				}
				break;

			case 25:
				_localctx = new TypeLongBlobStmtContext(_localctx);
				enterOuterAlt(_localctx, 25);
				{
				setState(565); match(12);
				}
				break;

			case 26:
				_localctx = new TypeTinyTextStmtContext(_localctx);
				enterOuterAlt(_localctx, 26);
				{
				setState(566); match(51);
				setState(568);
				switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
				case 1:
					{
					setState(567); match(2);
					}
					break;
				}
				setState(573);
				switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
				case 1:
					{
					setState(570); match(18);
					setState(571); match(13);
					setState(572); charsetName();
					}
					break;
				}
				setState(577);
				switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
				case 1:
					{
					setState(575); match(49);
					setState(576); collateName();
					}
					break;
				}
				}
				break;

			case 27:
				_localctx = new TypeTextStmtContext(_localctx);
				enterOuterAlt(_localctx, 27);
				{
				setState(579); match(34);
				setState(581);
				switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
				case 1:
					{
					setState(580); match(2);
					}
					break;
				}
				setState(586);
				switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
				case 1:
					{
					setState(583); match(18);
					setState(584); match(13);
					setState(585); charsetName();
					}
					break;
				}
				setState(590);
				switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
				case 1:
					{
					setState(588); match(49);
					setState(589); collateName();
					}
					break;
				}
				}
				break;

			case 28:
				_localctx = new TypeMediumTextStmtContext(_localctx);
				enterOuterAlt(_localctx, 28);
				{
				setState(592); match(71);
				setState(594);
				switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
				case 1:
					{
					setState(593); match(2);
					}
					break;
				}
				setState(599);
				switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
				case 1:
					{
					setState(596); match(18);
					setState(597); match(13);
					setState(598); charsetName();
					}
					break;
				}
				setState(603);
				switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
				case 1:
					{
					setState(601); match(49);
					setState(602); collateName();
					}
					break;
				}
				}
				break;

			case 29:
				_localctx = new TypeLongTextStmtContext(_localctx);
				enterOuterAlt(_localctx, 29);
				{
				setState(605); match(22);
				setState(607);
				switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
				case 1:
					{
					setState(606); match(2);
					}
					break;
				}
				setState(612);
				switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
				case 1:
					{
					setState(609); match(18);
					setState(610); match(13);
					setState(611); charsetName();
					}
					break;
				}
				setState(616);
				switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
				case 1:
					{
					setState(614); match(49);
					setState(615); collateName();
					}
					break;
				}
				}
				break;

			case 30:
				_localctx = new TypeEnumStmtContext(_localctx);
				enterOuterAlt(_localctx, 30);
				{
				setState(618); match(63);
				setState(619); match(44);
				setState(625);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(620); stringItem();
						setState(621); match(41);
						}
						} 
					}
					setState(627);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
				}
				setState(628); stringItem();
				setState(629); match(17);
				setState(633);
				switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
				case 1:
					{
					setState(630); match(18);
					setState(631); match(13);
					setState(632); charsetName();
					}
					break;
				}
				setState(637);
				switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
				case 1:
					{
					setState(635); match(49);
					setState(636); collateName();
					}
					break;
				}
				}
				break;

			case 31:
				_localctx = new TypeSetStmtContext(_localctx);
				enterOuterAlt(_localctx, 31);
				{
				setState(639); match(13);
				setState(640); match(44);
				setState(646);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(641); stringItem();
						setState(642); match(41);
						}
						} 
					}
					setState(648);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
				}
				setState(649); stringItem();
				setState(650); match(17);
				setState(654);
				switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
				case 1:
					{
					setState(651); match(18);
					setState(652); match(13);
					setState(653); charsetName();
					}
					break;
				}
				setState(658);
				switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
				case 1:
					{
					setState(656); match(49);
					setState(657); collateName();
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
		enterRule(_localctx, 50, RULE_stringItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(662); match(STRING);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 52, RULE_charsetName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(664); idName();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 54, RULE_collateName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(666); idName();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 56, RULE_referenceOption);
		try {
			setState(674);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(668); match(74);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(669); match(27);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(670); match(13);
				setState(671); match(60);
				}
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(672); match(58);
				setState(673); match(47);
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

	public static class DefaultValueContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(SQLParser.FLOAT, 0); }
		public TerminalNode INT() { return getToken(SQLParser.INT, 0); }
		public TerminalNode STRING() { return getToken(SQLParser.STRING, 0); }
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
		enterRule(_localctx, 58, RULE_defaultValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(676);
			_la = _input.LA(1);
			if ( !(((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & ((1L << (60 - 60)) | (1L << (INT - 60)) | (1L << (FLOAT - 60)) | (1L << (STRING - 60)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 60, RULE_tableOptions);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(681);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,108,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(678); option();
					}
					} 
				}
				setState(683);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,108,_ctx);
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
		public TerminalNode NAME(int i) {
			return getToken(SQLParser.NAME, i);
		}
		public List<TerminalNode> NAME() { return getTokens(SQLParser.NAME); }
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
		enterRule(_localctx, 62, RULE_option);
		try {
			setState(688);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(684); match(NAME);
				setState(685); match(26);
				setState(686); match(NAME);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(687); createSpecification();
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
		enterRule(_localctx, 64, RULE_idName);
		try {
			setState(700);
			switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(690); match(3);
				setState(691); match(NAME);
				setState(692); match(3);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(693); match(48);
				setState(694); match(NAME);
				setState(695); match(48);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(696); match(11);
				setState(697); match(NAME);
				setState(698); match(11);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(699); match(NAME);
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

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3S\u02c1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\7\2F\n\2\f\2\16\2I\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3Z\n\3\3\4\3\4\3\4\3\4\3\4\5\4a\n\4\3"+
		"\4\3\4\7\4e\n\4\f\4\16\4h\13\4\3\5\5\5k\n\5\3\5\3\5\3\5\5\5p\n\5\3\5\3"+
		"\5\5\5t\n\5\3\5\3\5\5\5x\n\5\3\5\3\5\3\5\3\5\5\5~\n\5\3\6\3\6\3\6\3\6"+
		"\7\6\u0084\n\6\f\6\16\6\u0087\13\6\3\6\3\6\3\7\7\7\u008c\n\7\f\7\16\7"+
		"\u008f\13\7\3\7\3\7\3\7\3\7\7\7\u0095\n\7\f\7\16\7\u0098\13\7\3\7\5\7"+
		"\u009b\n\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\5\n\u00a4\n\n\3\n\3\n\3\n\5\n\u00a9"+
		"\n\n\3\n\3\n\3\n\7\n\u00ae\n\n\f\n\16\n\u00b1\13\n\3\n\5\n\u00b4\n\n\3"+
		"\13\3\13\3\f\3\f\5\f\u00ba\n\f\3\f\3\f\3\f\3\f\5\f\u00c0\n\f\3\f\3\f\3"+
		"\f\3\f\3\f\7\f\u00c7\n\f\f\f\16\f\u00ca\13\f\3\f\3\f\3\f\3\f\3\r\3\r\3"+
		"\16\3\16\3\16\3\16\3\16\5\16\u00d7\n\16\5\16\u00d9\n\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\7\16\u00e1\n\16\f\16\16\16\u00e4\13\16\3\16\3\16\3\16"+
		"\3\16\3\16\5\16\u00eb\n\16\3\16\3\16\3\16\3\16\7\16\u00f1\n\16\f\16\16"+
		"\16\u00f4\13\16\3\16\3\16\3\16\3\16\3\16\5\16\u00fb\n\16\5\16\u00fd\n"+
		"\16\3\16\3\16\5\16\u0101\n\16\3\16\5\16\u0104\n\16\3\16\3\16\3\16\3\16"+
		"\7\16\u010a\n\16\f\16\16\16\u010d\13\16\3\16\3\16\3\16\3\16\3\16\5\16"+
		"\u0114\n\16\5\16\u0116\n\16\3\16\3\16\3\16\5\16\u011b\n\16\3\16\3\16\3"+
		"\16\3\16\7\16\u0121\n\16\f\16\16\16\u0124\13\16\3\16\3\16\3\16\3\16\5"+
		"\16\u012a\n\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\5\22\u0135"+
		"\n\22\3\22\3\22\5\22\u0139\n\22\3\22\5\22\u013c\n\22\3\22\3\22\5\22\u0140"+
		"\n\22\3\22\5\22\u0143\n\22\3\22\5\22\u0146\n\22\3\22\3\22\5\22\u014a\n"+
		"\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\7\27\u015b\n\27\f\27\16\27\u015e\13\27\3\27\3\27\3\27\3\27\3"+
		"\27\5\27\u0165\n\27\3\27\3\27\3\27\5\27\u016a\n\27\3\30\3\30\3\31\3\31"+
		"\5\31\u0170\n\31\3\32\3\32\3\32\3\32\5\32\u0176\n\32\3\32\3\32\3\32\3"+
		"\32\5\32\u017c\n\32\3\32\5\32\u017f\n\32\3\32\5\32\u0182\n\32\3\32\3\32"+
		"\3\32\3\32\5\32\u0188\n\32\3\32\5\32\u018b\n\32\3\32\5\32\u018e\n\32\3"+
		"\32\3\32\3\32\3\32\5\32\u0194\n\32\3\32\5\32\u0197\n\32\3\32\5\32\u019a"+
		"\n\32\3\32\3\32\3\32\3\32\5\32\u01a0\n\32\3\32\5\32\u01a3\n\32\3\32\5"+
		"\32\u01a6\n\32\3\32\3\32\3\32\3\32\5\32\u01ac\n\32\3\32\5\32\u01af\n\32"+
		"\3\32\5\32\u01b2\n\32\3\32\3\32\3\32\3\32\5\32\u01b8\n\32\3\32\5\32\u01bb"+
		"\n\32\3\32\5\32\u01be\n\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u01c6\n"+
		"\32\3\32\5\32\u01c9\n\32\3\32\5\32\u01cc\n\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\5\32\u01d4\n\32\3\32\5\32\u01d7\n\32\3\32\5\32\u01da\n\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\5\32\u01e2\n\32\3\32\5\32\u01e5\n\32\3\32\5\32"+
		"\u01e8\n\32\3\32\3\32\3\32\3\32\3\32\5\32\u01ef\n\32\3\32\5\32\u01f2\n"+
		"\32\3\32\5\32\u01f5\n\32\3\32\5\32\u01f8\n\32\3\32\3\32\3\32\3\32\3\32"+
		"\5\32\u01ff\n\32\3\32\5\32\u0202\n\32\3\32\5\32\u0205\n\32\3\32\5\32\u0208"+
		"\n\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0213\n\32\3\32"+
		"\3\32\3\32\5\32\u0218\n\32\3\32\3\32\5\32\u021c\n\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\5\32\u0225\n\32\3\32\3\32\5\32\u0229\n\32\3\32\3\32"+
		"\3\32\3\32\5\32\u022f\n\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\5\32\u023b\n\32\3\32\3\32\3\32\5\32\u0240\n\32\3\32\3\32\5\32\u0244"+
		"\n\32\3\32\3\32\5\32\u0248\n\32\3\32\3\32\3\32\5\32\u024d\n\32\3\32\3"+
		"\32\5\32\u0251\n\32\3\32\3\32\5\32\u0255\n\32\3\32\3\32\3\32\5\32\u025a"+
		"\n\32\3\32\3\32\5\32\u025e\n\32\3\32\3\32\5\32\u0262\n\32\3\32\3\32\3"+
		"\32\5\32\u0267\n\32\3\32\3\32\5\32\u026b\n\32\3\32\3\32\3\32\3\32\3\32"+
		"\7\32\u0272\n\32\f\32\16\32\u0275\13\32\3\32\3\32\3\32\3\32\3\32\5\32"+
		"\u027c\n\32\3\32\3\32\5\32\u0280\n\32\3\32\3\32\3\32\3\32\3\32\7\32\u0287"+
		"\n\32\f\32\16\32\u028a\13\32\3\32\3\32\3\32\3\32\3\32\5\32\u0291\n\32"+
		"\3\32\3\32\5\32\u0295\n\32\5\32\u0297\n\32\3\33\3\33\3\34\3\34\3\35\3"+
		"\35\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u02a5\n\36\3\37\3\37\3 \7 \u02aa"+
		"\n \f \16 \u02ad\13 \3!\3!\3!\3!\5!\u02b3\n!\3\"\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\5\"\u02bf\n\"\3\"\2#\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668:<>@B\2\7\4\2@@KK\4\2\35\35LL\4\2\3\3DD\4\2\32"+
		"\32,,\4\2>>NP\u0338\2G\3\2\2\2\4Y\3\2\2\2\6[\3\2\2\2\b}\3\2\2\2\n\177"+
		"\3\2\2\2\f\u008d\3\2\2\2\16\u009c\3\2\2\2\20\u009e\3\2\2\2\22\u00a1\3"+
		"\2\2\2\24\u00b5\3\2\2\2\26\u00b7\3\2\2\2\30\u00cf\3\2\2\2\32\u0129\3\2"+
		"\2\2\34\u012b\3\2\2\2\36\u012d\3\2\2\2 \u012f\3\2\2\2\"\u0131\3\2\2\2"+
		"$\u014b\3\2\2\2&\u014d\3\2\2\2(\u014f\3\2\2\2*\u0151\3\2\2\2,\u0154\3"+
		"\2\2\2.\u016b\3\2\2\2\60\u016d\3\2\2\2\62\u0296\3\2\2\2\64\u0298\3\2\2"+
		"\2\66\u029a\3\2\2\28\u029c\3\2\2\2:\u02a4\3\2\2\2<\u02a6\3\2\2\2>\u02ab"+
		"\3\2\2\2@\u02b2\3\2\2\2B\u02be\3\2\2\2DF\5\4\3\2ED\3\2\2\2FI\3\2\2\2G"+
		"E\3\2\2\2GH\3\2\2\2H\3\3\2\2\2IG\3\2\2\2JK\5\6\4\2KL\7C\2\2LZ\3\2\2\2"+
		"MN\5\26\f\2NO\7C\2\2OZ\3\2\2\2PQ\5\22\n\2QR\7C\2\2RZ\3\2\2\2ST\5\20\t"+
		"\2TU\7C\2\2UZ\3\2\2\2VW\5\n\6\2WX\7C\2\2XZ\3\2\2\2YJ\3\2\2\2YM\3\2\2\2"+
		"YP\3\2\2\2YS\3\2\2\2YV\3\2\2\2Z\5\3\2\2\2[\\\7E\2\2\\`\t\2\2\2]^\7\13"+
		"\2\2^_\7%\2\2_a\7*\2\2`]\3\2\2\2`a\3\2\2\2ab\3\2\2\2bf\5B\"\2ce\5\b\5"+
		"\2dc\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2g\7\3\2\2\2hf\3\2\2\2ik\78\2"+
		"\2ji\3\2\2\2jk\3\2\2\2kl\3\2\2\2lm\7\24\2\2mo\7\17\2\2np\7\34\2\2on\3"+
		"\2\2\2op\3\2\2\2pq\3\2\2\2q~\5\66\34\2rt\78\2\2sr\3\2\2\2st\3\2\2\2tu"+
		"\3\2\2\2uw\7\63\2\2vx\7\34\2\2wv\3\2\2\2wx\3\2\2\2xy\3\2\2\2y~\58\35\2"+
		"z{\7\b\2\2{|\7\34\2\2|~\7P\2\2}j\3\2\2\2}s\3\2\2\2}z\3\2\2\2~\t\3\2\2"+
		"\2\177\u0085\7\17\2\2\u0080\u0081\5\f\7\2\u0081\u0082\7+\2\2\u0082\u0084"+
		"\3\2\2\2\u0083\u0080\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0085"+
		"\u0086\3\2\2\2\u0086\u0088\3\2\2\2\u0087\u0085\3\2\2\2\u0088\u0089\5\f"+
		"\7\2\u0089\13\3\2\2\2\u008a\u008c\7\31\2\2\u008b\u008a\3\2\2\2\u008c\u008f"+
		"\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0090\3\2\2\2\u008f"+
		"\u008d\3\2\2\2\u0090\u0091\7M\2\2\u0091\u009a\7\34\2\2\u0092\u009b\5\16"+
		"\b\2\u0093\u0095\7\31\2\2\u0094\u0093\3\2\2\2\u0095\u0098\3\2\2\2\u0096"+
		"\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0099\3\2\2\2\u0098\u0096\3\2"+
		"\2\2\u0099\u009b\7M\2\2\u009a\u0092\3\2\2\2\u009a\u0096\3\2\2\2\u009b"+
		"\r\3\2\2\2\u009c\u009d\5<\37\2\u009d\17\3\2\2\2\u009e\u009f\7#\2\2\u009f"+
		"\u00a0\5B\"\2\u00a0\21\3\2\2\2\u00a1\u00a3\7\"\2\2\u00a2\u00a4\7)\2\2"+
		"\u00a3\u00a2\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a8"+
		"\7\25\2\2\u00a6\u00a7\7\13\2\2\u00a7\u00a9\7*\2\2\u00a8\u00a6\3\2\2\2"+
		"\u00a8\u00a9\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00af\5\24\13\2\u00ab\u00ac"+
		"\7+\2\2\u00ac\u00ae\5\24\13\2\u00ad\u00ab\3\2\2\2\u00ae\u00b1\3\2\2\2"+
		"\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00af"+
		"\3\2\2\2\u00b2\u00b4\t\3\2\2\u00b3\u00b2\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4"+
		"\23\3\2\2\2\u00b5\u00b6\5B\"\2\u00b6\25\3\2\2\2\u00b7\u00b9\7E\2\2\u00b8"+
		"\u00ba\7)\2\2\u00b9\u00b8\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb\3\2"+
		"\2\2\u00bb\u00bf\7\25\2\2\u00bc\u00bd\7\13\2\2\u00bd\u00be\7%\2\2\u00be"+
		"\u00c0\7*\2\2\u00bf\u00bc\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1\3\2"+
		"\2\2\u00c1\u00c2\5\30\r\2\u00c2\u00c8\7.\2\2\u00c3\u00c4\5\32\16\2\u00c4"+
		"\u00c5\7+\2\2\u00c5\u00c7\3\2\2\2\u00c6\u00c3\3\2\2\2\u00c7\u00ca\3\2"+
		"\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00cb\3\2\2\2\u00ca"+
		"\u00c8\3\2\2\2\u00cb\u00cc\5\32\16\2\u00cc\u00cd\7\23\2\2\u00cd\u00ce"+
		"\5> \2\u00ce\27\3\2\2\2\u00cf\u00d0\5B\"\2\u00d0\31\3\2\2\2\u00d1\u00d2"+
		"\5\34\17\2\u00d2\u00d3\5\"\22\2\u00d3\u012a\3\2\2\2\u00d4\u00d6\7\7\2"+
		"\2\u00d5\u00d7\5\36\20\2\u00d6\u00d5\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7"+
		"\u00d9\3\2\2\2\u00d8\u00d4\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00da\3\2"+
		"\2\2\u00da\u00db\7\n\2\2\u00db\u00dc\7D\2\2\u00dc\u00e2\7.\2\2\u00dd\u00de"+
		"\5\60\31\2\u00de\u00df\7+\2\2\u00df\u00e1\3\2\2\2\u00e0\u00dd\3\2\2\2"+
		"\u00e1\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e5"+
		"\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00e6\5\60\31\2\u00e6\u00e7\7\23\2"+
		"\2\u00e7\u012a\3\2\2\2\u00e8\u00ea\t\4\2\2\u00e9\u00eb\5\36\20\2\u00ea"+
		"\u00e9\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00f2\7."+
		"\2\2\u00ed\u00ee\5\60\31\2\u00ee\u00ef\7+\2\2\u00ef\u00f1\3\2\2\2\u00f0"+
		"\u00ed\3\2\2\2\u00f1\u00f4\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2"+
		"\2\2\u00f3\u00f5\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f5\u00f6\5\60\31\2\u00f6"+
		"\u00f7\7\23\2\2\u00f7\u012a\3\2\2\2\u00f8\u00fa\7\7\2\2\u00f9\u00fb\5"+
		"\36\20\2\u00fa\u00f9\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fd\3\2\2\2\u00fc"+
		"\u00f8\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0100\7J"+
		"\2\2\u00ff\u0101\t\4\2\2\u0100\u00ff\3\2\2\2\u0100\u0101\3\2\2\2\u0101"+
		"\u0103\3\2\2\2\u0102\u0104\5 \21\2\u0103\u0102\3\2\2\2\u0103\u0104\3\2"+
		"\2\2\u0104\u0105\3\2\2\2\u0105\u010b\7.\2\2\u0106\u0107\5\60\31\2\u0107"+
		"\u0108\7+\2\2\u0108\u010a\3\2\2\2\u0109\u0106\3\2\2\2\u010a\u010d\3\2"+
		"\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010e\3\2\2\2\u010d"+
		"\u010b\3\2\2\2\u010e\u010f\5\60\31\2\u010f\u0110\7\23\2\2\u0110\u012a"+
		"\3\2\2\2\u0111\u0113\7\7\2\2\u0112\u0114\5\36\20\2\u0113\u0112\3\2\2\2"+
		"\u0113\u0114\3\2\2\2\u0114\u0116\3\2\2\2\u0115\u0111\3\2\2\2\u0115\u0116"+
		"\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0118\7/\2\2\u0118\u011a\7D\2\2\u0119"+
		"\u011b\5 \21\2\u011a\u0119\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011c\3\2"+
		"\2\2\u011c\u0122\7.\2\2\u011d\u011e\5\60\31\2\u011e\u011f\7+\2\2\u011f"+
		"\u0121\3\2\2\2\u0120\u011d\3\2\2\2\u0121\u0124\3\2\2\2\u0122\u0120\3\2"+
		"\2\2\u0122\u0123\3\2\2\2\u0123\u0125\3\2\2\2\u0124\u0122\3\2\2\2\u0125"+
		"\u0126\5\60\31\2\u0126\u0127\7\23\2\2\u0127\u0128\5,\27\2\u0128\u012a"+
		"\3\2\2\2\u0129\u00d1\3\2\2\2\u0129\u00d8\3\2\2\2\u0129\u00e8\3\2\2\2\u0129"+
		"\u00fc\3\2\2\2\u0129\u0115\3\2\2\2\u012a\33\3\2\2\2\u012b\u012c\5B\"\2"+
		"\u012c\35\3\2\2\2\u012d\u012e\5B\"\2\u012e\37\3\2\2\2\u012f\u0130\5B\""+
		"\2\u0130!\3\2\2\2\u0131\u0134\5\62\32\2\u0132\u0135\5(\25\2\u0133\u0135"+
		"\5*\26\2\u0134\u0132\3\2\2\2\u0134\u0133\3\2\2\2\u0134\u0135\3\2\2\2\u0135"+
		"\u0138\3\2\2\2\u0136\u0137\78\2\2\u0137\u0139\5&\24\2\u0138\u0136\3\2"+
		"\2\2\u0138\u0139\3\2\2\2\u0139\u013b\3\2\2\2\u013a\u013c\5$\23\2\u013b"+
		"\u013a\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u0145\3\2\2\2\u013d\u013f\7J"+
		"\2\2\u013e\u0140\7D\2\2\u013f\u013e\3\2\2\2\u013f\u0140\3\2\2\2\u0140"+
		"\u0146\3\2\2\2\u0141\u0143\7\n\2\2\u0142\u0141\3\2\2\2\u0142\u0143\3\2"+
		"\2\2\u0143\u0144\3\2\2\2\u0144\u0146\7D\2\2\u0145\u013d\3\2\2\2\u0145"+
		"\u0142\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0149\3\2\2\2\u0147\u0148\7\b"+
		"\2\2\u0148\u014a\7P\2\2\u0149\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a"+
		"#\3\2\2\2\u014b\u014c\7\33\2\2\u014c%\3\2\2\2\u014d\u014e\5<\37\2\u014e"+
		"\'\3\2\2\2\u014f\u0150\7>\2\2\u0150)\3\2\2\2\u0151\u0152\7%\2\2\u0152"+
		"\u0153\7>\2\2\u0153+\3\2\2\2\u0154\u0155\7 \2\2\u0155\u0156\5.\30\2\u0156"+
		"\u015c\7.\2\2\u0157\u0158\5\60\31\2\u0158\u0159\7+\2\2\u0159\u015b\3\2"+
		"\2\2\u015a\u0157\3\2\2\2\u015b\u015e\3\2\2\2\u015c\u015a\3\2\2\2\u015c"+
		"\u015d\3\2\2\2\u015d\u015f\3\2\2\2\u015e\u015c\3\2\2\2\u015f\u0160\5\60"+
		"\31\2\u0160\u0164\7\23\2\2\u0161\u0162\7F\2\2\u0162\u0163\7\6\2\2\u0163"+
		"\u0165\5:\36\2\u0164\u0161\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0169\3\2"+
		"\2\2\u0166\u0167\7F\2\2\u0167\u0168\7?\2\2\u0168\u016a\5:\36\2\u0169\u0166"+
		"\3\2\2\2\u0169\u016a\3\2\2\2\u016a-\3\2\2\2\u016b\u016c\5B\"\2\u016c/"+
		"\3\2\2\2\u016d\u016f\5B\"\2\u016e\u0170\t\5\2\2\u016f\u016e\3\2\2\2\u016f"+
		"\u0170\3\2\2\2\u0170\61\3\2\2\2\u0171\u0175\7=\2\2\u0172\u0173\7.\2\2"+
		"\u0173\u0174\7N\2\2\u0174\u0176\7\23\2\2\u0175\u0172\3\2\2\2\u0175\u0176"+
		"\3\2\2\2\u0176\u0297\3\2\2\2\u0177\u017b\7\36\2\2\u0178\u0179\7.\2\2\u0179"+
		"\u017a\7N\2\2\u017a\u017c\7\23\2\2\u017b\u0178\3\2\2\2\u017b\u017c\3\2"+
		"\2\2\u017c\u017e\3\2\2\2\u017d\u017f\7\21\2\2\u017e\u017d\3\2\2\2\u017e"+
		"\u017f\3\2\2\2\u017f\u0181\3\2\2\2\u0180\u0182\79\2\2\u0181\u0180\3\2"+
		"\2\2\u0181\u0182\3\2\2\2\u0182\u0297\3\2\2\2\u0183\u0187\7B\2\2\u0184"+
		"\u0185\7.\2\2\u0185\u0186\7N\2\2\u0186\u0188\7\23\2\2\u0187\u0184\3\2"+
		"\2\2\u0187\u0188\3\2\2\2\u0188\u018a\3\2\2\2\u0189\u018b\7\21\2\2\u018a"+
		"\u0189\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u018d\3\2\2\2\u018c\u018e\79"+
		"\2\2\u018d\u018c\3\2\2\2\u018d\u018e\3\2\2\2\u018e\u0297\3\2\2\2\u018f"+
		"\u0193\7\t\2\2\u0190\u0191\7.\2\2\u0191\u0192\7N\2\2\u0192\u0194\7\23"+
		"\2\2\u0193\u0190\3\2\2\2\u0193\u0194\3\2\2\2\u0194\u0196\3\2\2\2\u0195"+
		"\u0197\7\21\2\2\u0196\u0195\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u0199\3"+
		"\2\2\2\u0198\u019a\79\2\2\u0199\u0198\3\2\2\2\u0199\u019a\3\2\2\2\u019a"+
		"\u0297\3\2\2\2\u019b\u019f\7&\2\2\u019c\u019d\7.\2\2\u019d\u019e\7N\2"+
		"\2\u019e\u01a0\7\23\2\2\u019f\u019c\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0"+
		"\u01a2\3\2\2\2\u01a1\u01a3\7\21\2\2\u01a2\u01a1\3\2\2\2\u01a2\u01a3\3"+
		"\2\2\2\u01a3\u01a5\3\2\2\2\u01a4\u01a6\79\2\2\u01a5\u01a4\3\2\2\2\u01a5"+
		"\u01a6\3\2\2\2\u01a6\u0297\3\2\2\2\u01a7\u01ab\7(\2\2\u01a8\u01a9\7.\2"+
		"\2\u01a9\u01aa\7N\2\2\u01aa\u01ac\7\23\2\2\u01ab\u01a8\3\2\2\2\u01ab\u01ac"+
		"\3\2\2\2\u01ac\u01ae\3\2\2\2\u01ad\u01af\7\21\2\2\u01ae\u01ad\3\2\2\2"+
		"\u01ae\u01af\3\2\2\2\u01af\u01b1\3\2\2\2\u01b0\u01b2\79\2\2\u01b1\u01b0"+
		"\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2\u0297\3\2\2\2\u01b3\u01b7\7\66\2\2"+
		"\u01b4\u01b5\7.\2\2\u01b5\u01b6\7N\2\2\u01b6\u01b8\7\23\2\2\u01b7\u01b4"+
		"\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01ba\3\2\2\2\u01b9\u01bb\7\21\2\2"+
		"\u01ba\u01b9\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01bd\3\2\2\2\u01bc\u01be"+
		"\79\2\2\u01bd\u01bc\3\2\2\2\u01bd\u01be\3\2\2\2\u01be\u0297\3\2\2\2\u01bf"+
		"\u01c5\7H\2\2\u01c0\u01c1\7.\2\2\u01c1\u01c2\7N\2\2\u01c2\u01c3\7+\2\2"+
		"\u01c3\u01c4\7N\2\2\u01c4\u01c6\7\23\2\2\u01c5\u01c0\3\2\2\2\u01c5\u01c6"+
		"\3\2\2\2\u01c6\u01c8\3\2\2\2\u01c7\u01c9\7\21\2\2\u01c8\u01c7\3\2\2\2"+
		"\u01c8\u01c9\3\2\2\2\u01c9\u01cb\3\2\2\2\u01ca\u01cc\79\2\2\u01cb\u01ca"+
		"\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u0297\3\2\2\2\u01cd\u01d3\7G\2\2\u01ce"+
		"\u01cf\7.\2\2\u01cf\u01d0\7N\2\2\u01d0\u01d1\7+\2\2\u01d1\u01d2\7N\2\2"+
		"\u01d2\u01d4\7\23\2\2\u01d3\u01ce\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4\u01d6"+
		"\3\2\2\2\u01d5\u01d7\7\21\2\2\u01d6\u01d5\3\2\2\2\u01d6\u01d7\3\2\2\2"+
		"\u01d7\u01d9\3\2\2\2\u01d8\u01da\79\2\2\u01d9\u01d8\3\2\2\2\u01d9\u01da"+
		"\3\2\2\2\u01da\u0297\3\2\2\2\u01db\u01e1\7!\2\2\u01dc\u01dd\7.\2\2\u01dd"+
		"\u01de\7N\2\2\u01de\u01df\7+\2\2\u01df\u01e0\7N\2\2\u01e0\u01e2\7\23\2"+
		"\2\u01e1\u01dc\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01e4\3\2\2\2\u01e3\u01e5"+
		"\7\21\2\2\u01e4\u01e3\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5\u01e7\3\2\2\2"+
		"\u01e6\u01e8\79\2\2\u01e7\u01e6\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8\u0297"+
		"\3\2\2\2\u01e9\u01f1\7\26\2\2\u01ea\u01eb\7.\2\2\u01eb\u01ee\7N\2\2\u01ec"+
		"\u01ed\7+\2\2\u01ed\u01ef\7N\2\2\u01ee\u01ec\3\2\2\2\u01ee\u01ef\3\2\2"+
		"\2\u01ef\u01f0\3\2\2\2\u01f0\u01f2\7\23\2\2\u01f1\u01ea\3\2\2\2\u01f1"+
		"\u01f2\3\2\2\2\u01f2\u01f4\3\2\2\2\u01f3\u01f5\7\21\2\2\u01f4\u01f3\3"+
		"\2\2\2\u01f4\u01f5\3\2\2\2\u01f5\u01f7\3\2\2\2\u01f6\u01f8\79\2\2\u01f7"+
		"\u01f6\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\u0297\3\2\2\2\u01f9\u0201\7-"+
		"\2\2\u01fa\u01fb\7.\2\2\u01fb\u01fe\7N\2\2\u01fc\u01fd\7+\2\2\u01fd\u01ff"+
		"\7N\2\2\u01fe\u01fc\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff\u0200\3\2\2\2\u0200"+
		"\u0202\7\23\2\2\u0201\u01fa\3\2\2\2\u0201\u0202\3\2\2\2\u0202\u0204\3"+
		"\2\2\2\u0203\u0205\7\21\2\2\u0204\u0203\3\2\2\2\u0204\u0205\3\2\2\2\u0205"+
		"\u0207\3\2\2\2\u0206\u0208\79\2\2\u0207\u0206\3\2\2\2\u0207\u0208\3\2"+
		"\2\2\u0208\u0297\3\2\2\2\u0209\u0297\7\67\2\2\u020a\u0297\7\60\2\2\u020b"+
		"\u0297\7\22\2\2\u020c\u0297\7\37\2\2\u020d\u0297\7\20\2\2\u020e\u0212"+
		"\7\27\2\2\u020f\u0210\7.\2\2\u0210\u0211\7N\2\2\u0211\u0213\7\23\2\2\u0212"+
		"\u020f\3\2\2\2\u0212\u0213\3\2\2\2\u0213\u0217\3\2\2\2\u0214\u0215\7\24"+
		"\2\2\u0215\u0216\7\17\2\2\u0216\u0218\5\66\34\2\u0217\u0214\3\2\2\2\u0217"+
		"\u0218\3\2\2\2\u0218\u021b\3\2\2\2\u0219\u021a\7\63\2\2\u021a\u021c\5"+
		"8\35\2\u021b\u0219\3\2\2\2\u021b\u021c\3\2\2\2\u021c\u0297\3\2\2\2\u021d"+
		"\u021e\7;\2\2\u021e\u021f\7.\2\2\u021f\u0220\7N\2\2\u0220\u0224\7\23\2"+
		"\2\u0221\u0222\7\24\2\2\u0222\u0223\7\17\2\2\u0223\u0225\5\66\34\2\u0224"+
		"\u0221\3\2\2\2\u0224\u0225\3\2\2\2\u0225\u0228\3\2\2\2\u0226\u0227\7\63"+
		"\2\2\u0227\u0229\58\35\2\u0228\u0226\3\2\2\2\u0228\u0229\3\2\2\2\u0229"+
		"\u0297\3\2\2\2\u022a\u022e\7\4\2\2\u022b\u022c\7.\2\2\u022c\u022d\7N\2"+
		"\2\u022d\u022f\7\23\2\2\u022e\u022b\3\2\2\2\u022e\u022f\3\2\2\2\u022f"+
		"\u0297\3\2\2\2\u0230\u0231\7\'\2\2\u0231\u0232\7.\2\2\u0232\u0233\7N\2"+
		"\2\u0233\u0297\7\23\2\2\u0234\u0297\7\f\2\2\u0235\u0297\7:\2\2\u0236\u0297"+
		"\7\64\2\2\u0237\u0297\7\16\2\2\u0238\u023a\7\65\2\2\u0239\u023b\7\4\2"+
		"\2\u023a\u0239\3\2\2\2\u023a\u023b\3\2\2\2\u023b\u023f\3\2\2\2\u023c\u023d"+
		"\7\24\2\2\u023d\u023e\7\17\2\2\u023e\u0240\5\66\34\2\u023f\u023c\3\2\2"+
		"\2\u023f\u0240\3\2\2\2\u0240\u0243\3\2\2\2\u0241\u0242\7\63\2\2\u0242"+
		"\u0244\58\35\2\u0243\u0241\3\2\2\2\u0243\u0244\3\2\2\2\u0244\u0297\3\2"+
		"\2\2\u0245\u0247\7$\2\2\u0246\u0248\7\4\2\2\u0247\u0246\3\2\2\2\u0247"+
		"\u0248\3\2\2\2\u0248\u024c\3\2\2\2\u0249\u024a\7\24\2\2\u024a\u024b\7"+
		"\17\2\2\u024b\u024d\5\66\34\2\u024c\u0249\3\2\2\2\u024c\u024d\3\2\2\2"+
		"\u024d\u0250\3\2\2\2\u024e\u024f\7\63\2\2\u024f\u0251\58\35\2\u0250\u024e"+
		"\3\2\2\2\u0250\u0251\3\2\2\2\u0251\u0297\3\2\2\2\u0252\u0254\7I\2\2\u0253"+
		"\u0255\7\4\2\2\u0254\u0253\3\2\2\2\u0254\u0255\3\2\2\2\u0255\u0259\3\2"+
		"\2\2\u0256\u0257\7\24\2\2\u0257\u0258\7\17\2\2\u0258\u025a\5\66\34\2\u0259"+
		"\u0256\3\2\2\2\u0259\u025a\3\2\2\2\u025a\u025d\3\2\2\2\u025b\u025c\7\63"+
		"\2\2\u025c\u025e\58\35\2\u025d\u025b\3\2\2\2\u025d\u025e\3\2\2\2\u025e"+
		"\u0297\3\2\2\2\u025f\u0261\7\30\2\2\u0260\u0262\7\4\2\2\u0261\u0260\3"+
		"\2\2\2\u0261\u0262\3\2\2\2\u0262\u0266\3\2\2\2\u0263\u0264\7\24\2\2\u0264"+
		"\u0265\7\17\2\2\u0265\u0267\5\66\34\2\u0266\u0263\3\2\2\2\u0266\u0267"+
		"\3\2\2\2\u0267\u026a\3\2\2\2\u0268\u0269\7\63\2\2\u0269\u026b\58\35\2"+
		"\u026a\u0268\3\2\2\2\u026a\u026b\3\2\2\2\u026b\u0297\3\2\2\2\u026c\u026d"+
		"\7A\2\2\u026d\u0273\7.\2\2\u026e\u026f\5\64\33\2\u026f\u0270\7+\2\2\u0270"+
		"\u0272\3\2\2\2\u0271\u026e\3\2\2\2\u0272\u0275\3\2\2\2\u0273\u0271\3\2"+
		"\2\2\u0273\u0274\3\2\2\2\u0274\u0276\3\2\2\2\u0275\u0273\3\2\2\2\u0276"+
		"\u0277\5\64\33\2\u0277\u027b\7\23\2\2\u0278\u0279\7\24\2\2\u0279\u027a"+
		"\7\17\2\2\u027a\u027c\5\66\34\2\u027b\u0278\3\2\2\2\u027b\u027c\3\2\2"+
		"\2\u027c\u027f\3\2\2\2\u027d\u027e\7\63\2\2\u027e\u0280\58\35\2\u027f"+
		"\u027d\3\2\2\2\u027f\u0280\3\2\2\2\u0280\u0297\3\2\2\2\u0281\u0282\7\17"+
		"\2\2\u0282\u0288\7.\2\2\u0283\u0284\5\64\33\2\u0284\u0285\7+\2\2\u0285"+
		"\u0287\3\2\2\2\u0286\u0283\3\2\2\2\u0287\u028a\3\2\2\2\u0288\u0286\3\2"+
		"\2\2\u0288\u0289\3\2\2\2\u0289\u028b\3\2\2\2\u028a\u0288\3\2\2\2\u028b"+
		"\u028c\5\64\33\2\u028c\u0290\7\23\2\2\u028d\u028e\7\24\2\2\u028e\u028f"+
		"\7\17\2\2\u028f\u0291\5\66\34\2\u0290\u028d\3\2\2\2\u0290\u0291\3\2\2"+
		"\2\u0291\u0294\3\2\2\2\u0292\u0293\7\63\2\2\u0293\u0295\58\35\2\u0294"+
		"\u0292\3\2\2\2\u0294\u0295\3\2\2\2\u0295\u0297\3\2\2\2\u0296\u0171\3\2"+
		"\2\2\u0296\u0177\3\2\2\2\u0296\u0183\3\2\2\2\u0296\u018f\3\2\2\2\u0296"+
		"\u019b\3\2\2\2\u0296\u01a7\3\2\2\2\u0296\u01b3\3\2\2\2\u0296\u01bf\3\2"+
		"\2\2\u0296\u01cd\3\2\2\2\u0296\u01db\3\2\2\2\u0296\u01e9\3\2\2\2\u0296"+
		"\u01f9\3\2\2\2\u0296\u0209\3\2\2\2\u0296\u020a\3\2\2\2\u0296\u020b\3\2"+
		"\2\2\u0296\u020c\3\2\2\2\u0296\u020d\3\2\2\2\u0296\u020e\3\2\2\2\u0296"+
		"\u021d\3\2\2\2\u0296\u022a\3\2\2\2\u0296\u0230\3\2\2\2\u0296\u0234\3\2"+
		"\2\2\u0296\u0235\3\2\2\2\u0296\u0236\3\2\2\2\u0296\u0237\3\2\2\2\u0296"+
		"\u0238\3\2\2\2\u0296\u0245\3\2\2\2\u0296\u0252\3\2\2\2\u0296\u025f\3\2"+
		"\2\2\u0296\u026c\3\2\2\2\u0296\u0281\3\2\2\2\u0297\63\3\2\2\2\u0298\u0299"+
		"\7P\2\2\u0299\65\3\2\2\2\u029a\u029b\5B\"\2\u029b\67\3\2\2\2\u029c\u029d"+
		"\5B\"\2\u029d9\3\2\2\2\u029e\u02a5\7L\2\2\u029f\u02a5\7\35\2\2\u02a0\u02a1"+
		"\7\17\2\2\u02a1\u02a5\7>\2\2\u02a2\u02a3\7<\2\2\u02a3\u02a5\7\61\2\2\u02a4"+
		"\u029e\3\2\2\2\u02a4\u029f\3\2\2\2\u02a4\u02a0\3\2\2\2\u02a4\u02a2\3\2"+
		"\2\2\u02a5;\3\2\2\2\u02a6\u02a7\t\6\2\2\u02a7=\3\2\2\2\u02a8\u02aa\5@"+
		"!\2\u02a9\u02a8\3\2\2\2\u02aa\u02ad\3\2\2\2\u02ab\u02a9\3\2\2\2\u02ab"+
		"\u02ac\3\2\2\2\u02ac?\3\2\2\2\u02ad\u02ab\3\2\2\2\u02ae\u02af\7M\2\2\u02af"+
		"\u02b0\7\34\2\2\u02b0\u02b3\7M\2\2\u02b1\u02b3\5\b\5\2\u02b2\u02ae\3\2"+
		"\2\2\u02b2\u02b1\3\2\2\2\u02b3A\3\2\2\2\u02b4\u02b5\7\5\2\2\u02b5\u02b6"+
		"\7M\2\2\u02b6\u02bf\7\5\2\2\u02b7\u02b8\7\62\2\2\u02b8\u02b9\7M\2\2\u02b9"+
		"\u02bf\7\62\2\2\u02ba\u02bb\7\r\2\2\u02bb\u02bc\7M\2\2\u02bc\u02bf\7\r"+
		"\2\2\u02bd\u02bf\7M\2\2\u02be\u02b4\3\2\2\2\u02be\u02b7\3\2\2\2\u02be"+
		"\u02ba\3\2\2\2\u02be\u02bd\3\2\2\2\u02bfC\3\2\2\2qGY`fjosw}\u0085\u008d"+
		"\u0096\u009a\u00a3\u00a8\u00af\u00b3\u00b9\u00bf\u00c8\u00d6\u00d8\u00e2"+
		"\u00ea\u00f2\u00fa\u00fc\u0100\u0103\u010b\u0113\u0115\u011a\u0122\u0129"+
		"\u0134\u0138\u013b\u013f\u0142\u0145\u0149\u015c\u0164\u0169\u016f\u0175"+
		"\u017b\u017e\u0181\u0187\u018a\u018d\u0193\u0196\u0199\u019f\u01a2\u01a5"+
		"\u01ab\u01ae\u01b1\u01b7\u01ba\u01bd\u01c5\u01c8\u01cb\u01d3\u01d6\u01d9"+
		"\u01e1\u01e4\u01e7\u01ee\u01f1\u01f4\u01f7\u01fe\u0201\u0204\u0207\u0212"+
		"\u0217\u021b\u0224\u0228\u022e\u023a\u023f\u0243\u0247\u024c\u0250\u0254"+
		"\u0259\u025d\u0261\u0266\u026a\u0273\u027b\u027f\u0288\u0290\u0294\u0296"+
		"\u02a4\u02ab\u02b2\u02be";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}