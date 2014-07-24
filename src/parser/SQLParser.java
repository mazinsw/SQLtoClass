// Generated from D:\Estudos\Java\Desktop\SQLtoClass\SQL.g4 by ANTLR 4.1
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
		RULE_script = 0, RULE_stmt = 1, RULE_dropSchema = 2, RULE_createSchema = 3, 
		RULE_createSpecification = 4, RULE_setStmt = 5, RULE_setOption = 6, RULE_setDefaultValue = 7, 
		RULE_useStmt = 8, RULE_dropTable = 9, RULE_dropTableName = 10, RULE_createTable = 11, 
		RULE_tableName = 12, RULE_createDefinition = 13, RULE_columnName = 14, 
		RULE_constraintName = 15, RULE_constraintTable = 16, RULE_columnDefinition = 17, 
		RULE_autoIncrement = 18, RULE_columnDefaultValue = 19, RULE_defaultNull = 20, 
		RULE_defaultNotNull = 21, RULE_referenceDefinition = 22, RULE_referenceTable = 23, 
		RULE_indexColName = 24, RULE_dataType = 25, RULE_stringItem = 26, RULE_charsetName = 27, 
		RULE_collateName = 28, RULE_referenceOption = 29, RULE_defaultValue = 30, 
		RULE_tableOptions = 31, RULE_option = 32, RULE_idName = 33;
	public static final String[] ruleNames = {
		"script", "stmt", "dropSchema", "createSchema", "createSpecification", 
		"setStmt", "setOption", "setDefaultValue", "useStmt", "dropTable", "dropTableName", 
		"createTable", "tableName", "createDefinition", "columnName", "constraintName", 
		"constraintTable", "columnDefinition", "autoIncrement", "columnDefaultValue", 
		"defaultNull", "defaultNotNull", "referenceDefinition", "referenceTable", 
		"indexColName", "dataType", "stringItem", "charsetName", "collateName", 
		"referenceOption", "defaultValue", "tableOptions", "option", "idName"
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
			setState(71);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(68); stmt();
					}
					} 
				}
				setState(73);
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
		public DropSchemaContext dropSchema() {
			return getRuleContext(DropSchemaContext.class,0);
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
			setState(92);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(74); createSchema();
				setState(75); match(65);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(77); dropSchema();
				setState(78); match(65);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(80); createTable();
				setState(81); match(65);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(83); dropTable();
				setState(84); match(65);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(86); useStmt();
				setState(87); match(65);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(89); setStmt();
				setState(90); match(65);
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
			setState(94); match(32);
			setState(95);
			_la = _input.LA(1);
			if ( !(_la==62 || _la==73) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(98);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(96); match(9);
				setState(97); match(40);
				}
				break;
			}
			setState(100); idName();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 6, RULE_createSchema);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(102); match(67);
			setState(103);
			_la = _input.LA(1);
			if ( !(_la==62 || _la==73) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(107);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(104); match(9);
				setState(105); match(35);
				setState(106); match(40);
				}
				break;
			}
			setState(109); idName();
			setState(113);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(110); createSpecification();
					}
					} 
				}
				setState(115);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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
		enterRule(_localctx, 8, RULE_createSpecification);
		try {
			setState(136);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(116); match(54);
					}
					break;
				}
				setState(119); match(18);
				setState(120); match(13);
				setState(122);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(121); match(26);
					}
					break;
				}
				setState(124); charsetName();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(125); match(54);
					}
					break;
				}
				setState(128); match(49);
				setState(130);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(129); match(26);
					}
					break;
				}
				setState(132); collateName();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(133); match(6);
				setState(134); match(26);
				setState(135); match(STRING);
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
		enterRule(_localctx, 10, RULE_setStmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(138); match(13);
			setState(144);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(139); setOption();
					setState(140); match(41);
					}
					} 
				}
				setState(146);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(147); setOption();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 12, RULE_setOption);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(149); match(23);
					}
					} 
				}
				setState(154);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			setState(155); match(NAME);
			setState(156); match(26);
			setState(165);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(157); setDefaultValue();
				}
				break;

			case 2:
				{
				{
				setState(161);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(158); match(23);
						}
						} 
					}
					setState(163);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				}
				setState(164); match(NAME);
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
		enterRule(_localctx, 14, RULE_setDefaultValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167); defaultValue();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 16, RULE_useStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169); match(33);
			setState(170); idName();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 18, RULE_dropTable);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(172); match(32);
			setState(174);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(173); match(39);
				}
				break;
			}
			setState(176); match(19);
			setState(179);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(177); match(9);
				setState(178); match(40);
				}
				break;
			}
			setState(181); dropTableName();
			setState(186);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(182); match(41);
					setState(183); dropTableName();
					}
					} 
				}
				setState(188);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			setState(190);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(189);
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
		enterRule(_localctx, 20, RULE_dropTableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192); idName();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 22, RULE_createTable);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(194); match(67);
			setState(196);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(195); match(39);
				}
				break;
			}
			setState(198); match(19);
			setState(202);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(199); match(9);
				setState(200); match(35);
				setState(201); match(40);
				}
				break;
			}
			setState(204); tableName();
			setState(205); match(44);
			setState(211);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(206); createDefinition();
					setState(207); match(41);
					}
					} 
				}
				setState(213);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			setState(214); createDefinition();
			setState(215); match(17);
			setState(216); tableOptions();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 24, RULE_tableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218); idName();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 26, RULE_createDefinition);
		int _la;
		try {
			int _alt;
			setState(308);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				_localctx = new FieldStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(220); columnName();
				setState(221); columnDefinition();
				}
				break;

			case 2:
				_localctx = new PrimaryKeyStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(227);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(223); match(5);
					setState(225);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						setState(224); constraintName();
						}
						break;
					}
					}
					break;
				}
				setState(229); match(8);
				setState(230); match(66);
				setState(231); match(44);
				setState(237);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(232); indexColName();
						setState(233); match(41);
						}
						} 
					}
					setState(239);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				}
				setState(240); indexColName();
				setState(241); match(17);
				}
				break;

			case 3:
				_localctx = new IndexStmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(243);
				_la = _input.LA(1);
				if ( !(_la==1 || _la==66) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(245);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(244); constraintName();
					}
					break;
				}
				setState(247); match(44);
				setState(253);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(248); indexColName();
						setState(249); match(41);
						}
						} 
					}
					setState(255);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				}
				setState(256); indexColName();
				setState(257); match(17);
				}
				break;

			case 4:
				_localctx = new UniqueStmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(263);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(259); match(5);
					setState(261);
					switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
					case 1:
						{
						setState(260); constraintName();
						}
						break;
					}
					}
					break;
				}
				setState(265); match(72);
				setState(267);
				switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
				case 1:
					{
					setState(266);
					_la = _input.LA(1);
					if ( !(_la==1 || _la==66) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					break;
				}
				setState(270);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(269); constraintTable();
					}
					break;
				}
				setState(272); match(44);
				setState(278);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(273); indexColName();
						setState(274); match(41);
						}
						} 
					}
					setState(280);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				}
				setState(281); indexColName();
				setState(282); match(17);
				}
				break;

			case 5:
				_localctx = new ForeignStmtContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(288);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(284); match(5);
					setState(286);
					switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
					case 1:
						{
						setState(285); constraintName();
						}
						break;
					}
					}
					break;
				}
				setState(290); match(45);
				setState(291); match(66);
				setState(293);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(292); constraintTable();
					}
					break;
				}
				setState(295); match(44);
				setState(301);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(296); indexColName();
						setState(297); match(41);
						}
						} 
					}
					setState(303);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				}
				setState(304); indexColName();
				setState(305); match(17);
				setState(306); referenceDefinition();
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
		enterRule(_localctx, 28, RULE_columnName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310); idName();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 30, RULE_constraintName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312); idName();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 32, RULE_constraintTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314); idName();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 34, RULE_columnDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316); dataType();
			setState(319);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(317); defaultNull();
				}
				break;

			case 2:
				{
				setState(318); defaultNotNull();
				}
				break;
			}
			setState(323);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(321); match(54);
				setState(322); columnDefaultValue();
				}
				break;
			}
			setState(326);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(325); autoIncrement();
				}
				break;
			}
			setState(336);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				{
				setState(328); match(72);
				setState(330);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(329); match(66);
					}
					break;
				}
				}
				}
				break;

			case 2:
				{
				{
				setState(333);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					{
					setState(332); match(8);
					}
					break;
				}
				setState(335); match(66);
				}
				}
				break;
			}
			setState(340);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(338); match(6);
				setState(339); match(STRING);
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
		enterRule(_localctx, 36, RULE_autoIncrement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342); match(25);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 38, RULE_columnDefaultValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344); defaultValue();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 40, RULE_defaultNull);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346); match(60);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 42, RULE_defaultNotNull);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348); match(35);
			setState(349); match(60);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 44, RULE_referenceDefinition);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(351); match(30);
			setState(352); referenceTable();
			setState(353); match(44);
			setState(359);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(354); indexColName();
					setState(355); match(41);
					}
					} 
				}
				setState(361);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			}
			setState(362); indexColName();
			setState(363); match(17);
			setState(367);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(364); match(68);
				setState(365); match(4);
				setState(366); referenceOption();
				}
				break;
			}
			setState(372);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(369); match(68);
				setState(370); match(61);
				setState(371); referenceOption();
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
		enterRule(_localctx, 46, RULE_referenceTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374); idName();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 48, RULE_indexColName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376); idName();
			setState(378);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(377);
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
		enterRule(_localctx, 50, RULE_dataType);
		try {
			int _alt;
			setState(673);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				_localctx = new TypeBitStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(380); match(59);
				setState(384);
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
				case 1:
					{
					setState(381); match(44);
					setState(382); match(INT);
					setState(383); match(17);
					}
					break;
				}
				}
				break;

			case 2:
				_localctx = new TypeTinyIntStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(386); match(28);
				setState(390);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(387); match(44);
					setState(388); match(INT);
					setState(389); match(17);
					}
					break;
				}
				setState(393);
				switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
				case 1:
					{
					setState(392); match(15);
					}
					break;
				}
				setState(396);
				switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
				case 1:
					{
					setState(395); match(55);
					}
					break;
				}
				}
				break;

			case 3:
				_localctx = new TypeSmallIntStmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(398); match(64);
				setState(402);
				switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
				case 1:
					{
					setState(399); match(44);
					setState(400); match(INT);
					setState(401); match(17);
					}
					break;
				}
				setState(405);
				switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
				case 1:
					{
					setState(404); match(15);
					}
					break;
				}
				setState(408);
				switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
				case 1:
					{
					setState(407); match(55);
					}
					break;
				}
				}
				break;

			case 4:
				_localctx = new TypeMediumIntStmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(410); match(7);
				setState(414);
				switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
				case 1:
					{
					setState(411); match(44);
					setState(412); match(INT);
					setState(413); match(17);
					}
					break;
				}
				setState(417);
				switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
				case 1:
					{
					setState(416); match(15);
					}
					break;
				}
				setState(420);
				switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
				case 1:
					{
					setState(419); match(55);
					}
					break;
				}
				}
				break;

			case 5:
				_localctx = new TypeIntStmtContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(422); match(36);
				setState(426);
				switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
				case 1:
					{
					setState(423); match(44);
					setState(424); match(INT);
					setState(425); match(17);
					}
					break;
				}
				setState(429);
				switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
				case 1:
					{
					setState(428); match(15);
					}
					break;
				}
				setState(432);
				switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
				case 1:
					{
					setState(431); match(55);
					}
					break;
				}
				}
				break;

			case 6:
				_localctx = new TypeIntegerStmtContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(434); match(38);
				setState(438);
				switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
				case 1:
					{
					setState(435); match(44);
					setState(436); match(INT);
					setState(437); match(17);
					}
					break;
				}
				setState(441);
				switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
				case 1:
					{
					setState(440); match(15);
					}
					break;
				}
				setState(444);
				switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
				case 1:
					{
					setState(443); match(55);
					}
					break;
				}
				}
				break;

			case 7:
				_localctx = new TypeBigIntStmtContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(446); match(52);
				setState(450);
				switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
				case 1:
					{
					setState(447); match(44);
					setState(448); match(INT);
					setState(449); match(17);
					}
					break;
				}
				setState(453);
				switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
				case 1:
					{
					setState(452); match(15);
					}
					break;
				}
				setState(456);
				switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
				case 1:
					{
					setState(455); match(55);
					}
					break;
				}
				}
				break;

			case 8:
				_localctx = new TypeRealStmtContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(458); match(70);
				setState(464);
				switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
				case 1:
					{
					setState(459); match(44);
					setState(460); match(INT);
					setState(461); match(41);
					setState(462); match(INT);
					setState(463); match(17);
					}
					break;
				}
				setState(467);
				switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
				case 1:
					{
					setState(466); match(15);
					}
					break;
				}
				setState(470);
				switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
				case 1:
					{
					setState(469); match(55);
					}
					break;
				}
				}
				break;

			case 9:
				_localctx = new TypeDoubleStmtContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(472); match(69);
				setState(478);
				switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
				case 1:
					{
					setState(473); match(44);
					setState(474); match(INT);
					setState(475); match(41);
					setState(476); match(INT);
					setState(477); match(17);
					}
					break;
				}
				setState(481);
				switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
				case 1:
					{
					setState(480); match(15);
					}
					break;
				}
				setState(484);
				switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
				case 1:
					{
					setState(483); match(55);
					}
					break;
				}
				}
				break;

			case 10:
				_localctx = new TypeFloatStmtContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(486); match(31);
				setState(492);
				switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
				case 1:
					{
					setState(487); match(44);
					setState(488); match(INT);
					setState(489); match(41);
					setState(490); match(INT);
					setState(491); match(17);
					}
					break;
				}
				setState(495);
				switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
				case 1:
					{
					setState(494); match(15);
					}
					break;
				}
				setState(498);
				switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
				case 1:
					{
					setState(497); match(55);
					}
					break;
				}
				}
				break;

			case 11:
				_localctx = new TypeDecimalStmtContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(500); match(20);
				setState(508);
				switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
				case 1:
					{
					setState(501); match(44);
					setState(502); match(INT);
					setState(505);
					switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
					case 1:
						{
						setState(503); match(41);
						setState(504); match(INT);
						}
						break;
					}
					setState(507); match(17);
					}
					break;
				}
				setState(511);
				switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
				case 1:
					{
					setState(510); match(15);
					}
					break;
				}
				setState(514);
				switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
				case 1:
					{
					setState(513); match(55);
					}
					break;
				}
				}
				break;

			case 12:
				_localctx = new TypeNumericStmtContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(516); match(43);
				setState(524);
				switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
				case 1:
					{
					setState(517); match(44);
					setState(518); match(INT);
					setState(521);
					switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
					case 1:
						{
						setState(519); match(41);
						setState(520); match(INT);
						}
						break;
					}
					setState(523); match(17);
					}
					break;
				}
				setState(527);
				switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
				case 1:
					{
					setState(526); match(15);
					}
					break;
				}
				setState(530);
				switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
				case 1:
					{
					setState(529); match(55);
					}
					break;
				}
				}
				break;

			case 13:
				_localctx = new TypeDateStmtContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(532); match(53);
				}
				break;

			case 14:
				_localctx = new TypeTimeStmtContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(533); match(46);
				}
				break;

			case 15:
				_localctx = new TypeTimeStampStmtContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(534); match(16);
				}
				break;

			case 16:
				_localctx = new TypeDateTimeStmtContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(535); match(29);
				}
				break;

			case 17:
				_localctx = new TypeYearStmtContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(536); match(14);
				}
				break;

			case 18:
				_localctx = new TypeCharStmtContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(537); match(21);
				setState(541);
				switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
				case 1:
					{
					setState(538); match(44);
					setState(539); match(INT);
					setState(540); match(17);
					}
					break;
				}
				setState(546);
				switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
				case 1:
					{
					setState(543); match(18);
					setState(544); match(13);
					setState(545); charsetName();
					}
					break;
				}
				setState(550);
				switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
				case 1:
					{
					setState(548); match(49);
					setState(549); collateName();
					}
					break;
				}
				}
				break;

			case 19:
				_localctx = new TypeVarCharStmtContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(552); match(57);
				setState(553); match(44);
				setState(554); match(INT);
				setState(555); match(17);
				setState(559);
				switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
				case 1:
					{
					setState(556); match(18);
					setState(557); match(13);
					setState(558); charsetName();
					}
					break;
				}
				setState(563);
				switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
				case 1:
					{
					setState(561); match(49);
					setState(562); collateName();
					}
					break;
				}
				}
				break;

			case 20:
				_localctx = new TypeBinaryStmtContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(565); match(2);
				setState(569);
				switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
				case 1:
					{
					setState(566); match(44);
					setState(567); match(INT);
					setState(568); match(17);
					}
					break;
				}
				}
				break;

			case 21:
				_localctx = new TypeVarBinaryStmtContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(571); match(37);
				setState(572); match(44);
				setState(573); match(INT);
				setState(574); match(17);
				}
				break;

			case 22:
				_localctx = new TypeTinyBlobStmtContext(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(575); match(10);
				}
				break;

			case 23:
				_localctx = new TypeBlobStmtContext(_localctx);
				enterOuterAlt(_localctx, 23);
				{
				setState(576); match(56);
				}
				break;

			case 24:
				_localctx = new TypeMediumBlobStmtContext(_localctx);
				enterOuterAlt(_localctx, 24);
				{
				setState(577); match(50);
				}
				break;

			case 25:
				_localctx = new TypeLongBlobStmtContext(_localctx);
				enterOuterAlt(_localctx, 25);
				{
				setState(578); match(12);
				}
				break;

			case 26:
				_localctx = new TypeTinyTextStmtContext(_localctx);
				enterOuterAlt(_localctx, 26);
				{
				setState(579); match(51);
				setState(581);
				switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
				case 1:
					{
					setState(580); match(2);
					}
					break;
				}
				setState(586);
				switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
				case 1:
					{
					setState(583); match(18);
					setState(584); match(13);
					setState(585); charsetName();
					}
					break;
				}
				setState(590);
				switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
				case 1:
					{
					setState(588); match(49);
					setState(589); collateName();
					}
					break;
				}
				}
				break;

			case 27:
				_localctx = new TypeTextStmtContext(_localctx);
				enterOuterAlt(_localctx, 27);
				{
				setState(592); match(34);
				setState(594);
				switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
				case 1:
					{
					setState(593); match(2);
					}
					break;
				}
				setState(599);
				switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
				case 1:
					{
					setState(596); match(18);
					setState(597); match(13);
					setState(598); charsetName();
					}
					break;
				}
				setState(603);
				switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
				case 1:
					{
					setState(601); match(49);
					setState(602); collateName();
					}
					break;
				}
				}
				break;

			case 28:
				_localctx = new TypeMediumTextStmtContext(_localctx);
				enterOuterAlt(_localctx, 28);
				{
				setState(605); match(71);
				setState(607);
				switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
				case 1:
					{
					setState(606); match(2);
					}
					break;
				}
				setState(612);
				switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
				case 1:
					{
					setState(609); match(18);
					setState(610); match(13);
					setState(611); charsetName();
					}
					break;
				}
				setState(616);
				switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
				case 1:
					{
					setState(614); match(49);
					setState(615); collateName();
					}
					break;
				}
				}
				break;

			case 29:
				_localctx = new TypeLongTextStmtContext(_localctx);
				enterOuterAlt(_localctx, 29);
				{
				setState(618); match(22);
				setState(620);
				switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
				case 1:
					{
					setState(619); match(2);
					}
					break;
				}
				setState(625);
				switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
				case 1:
					{
					setState(622); match(18);
					setState(623); match(13);
					setState(624); charsetName();
					}
					break;
				}
				setState(629);
				switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
				case 1:
					{
					setState(627); match(49);
					setState(628); collateName();
					}
					break;
				}
				}
				break;

			case 30:
				_localctx = new TypeEnumStmtContext(_localctx);
				enterOuterAlt(_localctx, 30);
				{
				setState(631); match(63);
				setState(632); match(44);
				setState(638);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(633); stringItem();
						setState(634); match(41);
						}
						} 
					}
					setState(640);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
				}
				setState(641); stringItem();
				setState(642); match(17);
				setState(646);
				switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
				case 1:
					{
					setState(643); match(18);
					setState(644); match(13);
					setState(645); charsetName();
					}
					break;
				}
				setState(650);
				switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
				case 1:
					{
					setState(648); match(49);
					setState(649); collateName();
					}
					break;
				}
				}
				break;

			case 31:
				_localctx = new TypeSetStmtContext(_localctx);
				enterOuterAlt(_localctx, 31);
				{
				setState(652); match(13);
				setState(653); match(44);
				setState(659);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(654); stringItem();
						setState(655); match(41);
						}
						} 
					}
					setState(661);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
				}
				setState(662); stringItem();
				setState(663); match(17);
				setState(667);
				switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
				case 1:
					{
					setState(664); match(18);
					setState(665); match(13);
					setState(666); charsetName();
					}
					break;
				}
				setState(671);
				switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
				case 1:
					{
					setState(669); match(49);
					setState(670); collateName();
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
		enterRule(_localctx, 52, RULE_stringItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(675); match(STRING);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 54, RULE_charsetName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(677); idName();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 56, RULE_collateName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(679); idName();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 58, RULE_referenceOption);
		try {
			setState(687);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(681); match(74);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(682); match(27);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(683); match(13);
				setState(684); match(60);
				}
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(685); match(58);
				setState(686); match(47);
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
		enterRule(_localctx, 60, RULE_defaultValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(689);
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
		enterRule(_localctx, 62, RULE_tableOptions);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(694);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,109,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(691); option();
					}
					} 
				}
				setState(696);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,109,_ctx);
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
		enterRule(_localctx, 64, RULE_option);
		try {
			setState(701);
			switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(697); match(NAME);
				setState(698); match(26);
				setState(699); match(NAME);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(700); createSpecification();
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
		enterRule(_localctx, 66, RULE_idName);
		try {
			setState(713);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(703); match(3);
				setState(704); match(NAME);
				setState(705); match(3);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(706); match(48);
				setState(707); match(NAME);
				setState(708); match(48);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(709); match(11);
				setState(710); match(NAME);
				setState(711); match(11);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(712); match(NAME);
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3S\u02ce\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\7\2H\n\2\f\2\16\2K\13\2\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3_\n\3\3\4\3\4\3\4"+
		"\3\4\5\4e\n\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\5\5n\n\5\3\5\3\5\7\5r\n\5\f"+
		"\5\16\5u\13\5\3\6\5\6x\n\6\3\6\3\6\3\6\5\6}\n\6\3\6\3\6\5\6\u0081\n\6"+
		"\3\6\3\6\5\6\u0085\n\6\3\6\3\6\3\6\3\6\5\6\u008b\n\6\3\7\3\7\3\7\3\7\7"+
		"\7\u0091\n\7\f\7\16\7\u0094\13\7\3\7\3\7\3\b\7\b\u0099\n\b\f\b\16\b\u009c"+
		"\13\b\3\b\3\b\3\b\3\b\7\b\u00a2\n\b\f\b\16\b\u00a5\13\b\3\b\5\b\u00a8"+
		"\n\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\5\13\u00b1\n\13\3\13\3\13\3\13\5\13"+
		"\u00b6\n\13\3\13\3\13\3\13\7\13\u00bb\n\13\f\13\16\13\u00be\13\13\3\13"+
		"\5\13\u00c1\n\13\3\f\3\f\3\r\3\r\5\r\u00c7\n\r\3\r\3\r\3\r\3\r\5\r\u00cd"+
		"\n\r\3\r\3\r\3\r\3\r\3\r\7\r\u00d4\n\r\f\r\16\r\u00d7\13\r\3\r\3\r\3\r"+
		"\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\5\17\u00e4\n\17\5\17\u00e6\n\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00ee\n\17\f\17\16\17\u00f1\13\17"+
		"\3\17\3\17\3\17\3\17\3\17\5\17\u00f8\n\17\3\17\3\17\3\17\3\17\7\17\u00fe"+
		"\n\17\f\17\16\17\u0101\13\17\3\17\3\17\3\17\3\17\3\17\5\17\u0108\n\17"+
		"\5\17\u010a\n\17\3\17\3\17\5\17\u010e\n\17\3\17\5\17\u0111\n\17\3\17\3"+
		"\17\3\17\3\17\7\17\u0117\n\17\f\17\16\17\u011a\13\17\3\17\3\17\3\17\3"+
		"\17\3\17\5\17\u0121\n\17\5\17\u0123\n\17\3\17\3\17\3\17\5\17\u0128\n\17"+
		"\3\17\3\17\3\17\3\17\7\17\u012e\n\17\f\17\16\17\u0131\13\17\3\17\3\17"+
		"\3\17\3\17\5\17\u0137\n\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23"+
		"\5\23\u0142\n\23\3\23\3\23\5\23\u0146\n\23\3\23\5\23\u0149\n\23\3\23\3"+
		"\23\5\23\u014d\n\23\3\23\5\23\u0150\n\23\3\23\5\23\u0153\n\23\3\23\3\23"+
		"\5\23\u0157\n\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\7\30\u0168\n\30\f\30\16\30\u016b\13\30\3\30\3\30"+
		"\3\30\3\30\3\30\5\30\u0172\n\30\3\30\3\30\3\30\5\30\u0177\n\30\3\31\3"+
		"\31\3\32\3\32\5\32\u017d\n\32\3\33\3\33\3\33\3\33\5\33\u0183\n\33\3\33"+
		"\3\33\3\33\3\33\5\33\u0189\n\33\3\33\5\33\u018c\n\33\3\33\5\33\u018f\n"+
		"\33\3\33\3\33\3\33\3\33\5\33\u0195\n\33\3\33\5\33\u0198\n\33\3\33\5\33"+
		"\u019b\n\33\3\33\3\33\3\33\3\33\5\33\u01a1\n\33\3\33\5\33\u01a4\n\33\3"+
		"\33\5\33\u01a7\n\33\3\33\3\33\3\33\3\33\5\33\u01ad\n\33\3\33\5\33\u01b0"+
		"\n\33\3\33\5\33\u01b3\n\33\3\33\3\33\3\33\3\33\5\33\u01b9\n\33\3\33\5"+
		"\33\u01bc\n\33\3\33\5\33\u01bf\n\33\3\33\3\33\3\33\3\33\5\33\u01c5\n\33"+
		"\3\33\5\33\u01c8\n\33\3\33\5\33\u01cb\n\33\3\33\3\33\3\33\3\33\3\33\3"+
		"\33\5\33\u01d3\n\33\3\33\5\33\u01d6\n\33\3\33\5\33\u01d9\n\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\5\33\u01e1\n\33\3\33\5\33\u01e4\n\33\3\33\5\33\u01e7"+
		"\n\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u01ef\n\33\3\33\5\33\u01f2\n"+
		"\33\3\33\5\33\u01f5\n\33\3\33\3\33\3\33\3\33\3\33\5\33\u01fc\n\33\3\33"+
		"\5\33\u01ff\n\33\3\33\5\33\u0202\n\33\3\33\5\33\u0205\n\33\3\33\3\33\3"+
		"\33\3\33\3\33\5\33\u020c\n\33\3\33\5\33\u020f\n\33\3\33\5\33\u0212\n\33"+
		"\3\33\5\33\u0215\n\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33"+
		"\u0220\n\33\3\33\3\33\3\33\5\33\u0225\n\33\3\33\3\33\5\33\u0229\n\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0232\n\33\3\33\3\33\5\33\u0236"+
		"\n\33\3\33\3\33\3\33\3\33\5\33\u023c\n\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\5\33\u0248\n\33\3\33\3\33\3\33\5\33\u024d\n\33\3"+
		"\33\3\33\5\33\u0251\n\33\3\33\3\33\5\33\u0255\n\33\3\33\3\33\3\33\5\33"+
		"\u025a\n\33\3\33\3\33\5\33\u025e\n\33\3\33\3\33\5\33\u0262\n\33\3\33\3"+
		"\33\3\33\5\33\u0267\n\33\3\33\3\33\5\33\u026b\n\33\3\33\3\33\5\33\u026f"+
		"\n\33\3\33\3\33\3\33\5\33\u0274\n\33\3\33\3\33\5\33\u0278\n\33\3\33\3"+
		"\33\3\33\3\33\3\33\7\33\u027f\n\33\f\33\16\33\u0282\13\33\3\33\3\33\3"+
		"\33\3\33\3\33\5\33\u0289\n\33\3\33\3\33\5\33\u028d\n\33\3\33\3\33\3\33"+
		"\3\33\3\33\7\33\u0294\n\33\f\33\16\33\u0297\13\33\3\33\3\33\3\33\3\33"+
		"\3\33\5\33\u029e\n\33\3\33\3\33\5\33\u02a2\n\33\5\33\u02a4\n\33\3\34\3"+
		"\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u02b2\n\37"+
		"\3 \3 \3!\7!\u02b7\n!\f!\16!\u02ba\13!\3\"\3\"\3\"\3\"\5\"\u02c0\n\"\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u02cc\n#\3#\2$\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BD\2\7\4\2@@KK\4\2\35\35LL\4"+
		"\2\3\3DD\4\2\32\32,,\4\2>>NP\u0346\2I\3\2\2\2\4^\3\2\2\2\6`\3\2\2\2\b"+
		"h\3\2\2\2\n\u008a\3\2\2\2\f\u008c\3\2\2\2\16\u009a\3\2\2\2\20\u00a9\3"+
		"\2\2\2\22\u00ab\3\2\2\2\24\u00ae\3\2\2\2\26\u00c2\3\2\2\2\30\u00c4\3\2"+
		"\2\2\32\u00dc\3\2\2\2\34\u0136\3\2\2\2\36\u0138\3\2\2\2 \u013a\3\2\2\2"+
		"\"\u013c\3\2\2\2$\u013e\3\2\2\2&\u0158\3\2\2\2(\u015a\3\2\2\2*\u015c\3"+
		"\2\2\2,\u015e\3\2\2\2.\u0161\3\2\2\2\60\u0178\3\2\2\2\62\u017a\3\2\2\2"+
		"\64\u02a3\3\2\2\2\66\u02a5\3\2\2\28\u02a7\3\2\2\2:\u02a9\3\2\2\2<\u02b1"+
		"\3\2\2\2>\u02b3\3\2\2\2@\u02b8\3\2\2\2B\u02bf\3\2\2\2D\u02cb\3\2\2\2F"+
		"H\5\4\3\2GF\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2J\3\3\2\2\2KI\3\2\2\2"+
		"LM\5\b\5\2MN\7C\2\2N_\3\2\2\2OP\5\6\4\2PQ\7C\2\2Q_\3\2\2\2RS\5\30\r\2"+
		"ST\7C\2\2T_\3\2\2\2UV\5\24\13\2VW\7C\2\2W_\3\2\2\2XY\5\22\n\2YZ\7C\2\2"+
		"Z_\3\2\2\2[\\\5\f\7\2\\]\7C\2\2]_\3\2\2\2^L\3\2\2\2^O\3\2\2\2^R\3\2\2"+
		"\2^U\3\2\2\2^X\3\2\2\2^[\3\2\2\2_\5\3\2\2\2`a\7\"\2\2ad\t\2\2\2bc\7\13"+
		"\2\2ce\7*\2\2db\3\2\2\2de\3\2\2\2ef\3\2\2\2fg\5D#\2g\7\3\2\2\2hi\7E\2"+
		"\2im\t\2\2\2jk\7\13\2\2kl\7%\2\2ln\7*\2\2mj\3\2\2\2mn\3\2\2\2no\3\2\2"+
		"\2os\5D#\2pr\5\n\6\2qp\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2t\t\3\2\2"+
		"\2us\3\2\2\2vx\78\2\2wv\3\2\2\2wx\3\2\2\2xy\3\2\2\2yz\7\24\2\2z|\7\17"+
		"\2\2{}\7\34\2\2|{\3\2\2\2|}\3\2\2\2}~\3\2\2\2~\u008b\58\35\2\177\u0081"+
		"\78\2\2\u0080\177\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082\3\2\2\2\u0082"+
		"\u0084\7\63\2\2\u0083\u0085\7\34\2\2\u0084\u0083\3\2\2\2\u0084\u0085\3"+
		"\2\2\2\u0085\u0086\3\2\2\2\u0086\u008b\5:\36\2\u0087\u0088\7\b\2\2\u0088"+
		"\u0089\7\34\2\2\u0089\u008b\7P\2\2\u008aw\3\2\2\2\u008a\u0080\3\2\2\2"+
		"\u008a\u0087\3\2\2\2\u008b\13\3\2\2\2\u008c\u0092\7\17\2\2\u008d\u008e"+
		"\5\16\b\2\u008e\u008f\7+\2\2\u008f\u0091\3\2\2\2\u0090\u008d\3\2\2\2\u0091"+
		"\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0095\3\2"+
		"\2\2\u0094\u0092\3\2\2\2\u0095\u0096\5\16\b\2\u0096\r\3\2\2\2\u0097\u0099"+
		"\7\31\2\2\u0098\u0097\3\2\2\2\u0099\u009c\3\2\2\2\u009a\u0098\3\2\2\2"+
		"\u009a\u009b\3\2\2\2\u009b\u009d\3\2\2\2\u009c\u009a\3\2\2\2\u009d\u009e"+
		"\7M\2\2\u009e\u00a7\7\34\2\2\u009f\u00a8\5\20\t\2\u00a0\u00a2\7\31\2\2"+
		"\u00a1\u00a0\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4"+
		"\3\2\2\2\u00a4\u00a6\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6\u00a8\7M\2\2\u00a7"+
		"\u009f\3\2\2\2\u00a7\u00a3\3\2\2\2\u00a8\17\3\2\2\2\u00a9\u00aa\5> \2"+
		"\u00aa\21\3\2\2\2\u00ab\u00ac\7#\2\2\u00ac\u00ad\5D#\2\u00ad\23\3\2\2"+
		"\2\u00ae\u00b0\7\"\2\2\u00af\u00b1\7)\2\2\u00b0\u00af\3\2\2\2\u00b0\u00b1"+
		"\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b5\7\25\2\2\u00b3\u00b4\7\13\2\2"+
		"\u00b4\u00b6\7*\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7"+
		"\3\2\2\2\u00b7\u00bc\5\26\f\2\u00b8\u00b9\7+\2\2\u00b9\u00bb\5\26\f\2"+
		"\u00ba\u00b8\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd"+
		"\3\2\2\2\u00bd\u00c0\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf\u00c1\t\3\2\2\u00c0"+
		"\u00bf\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\25\3\2\2\2\u00c2\u00c3\5D#\2"+
		"\u00c3\27\3\2\2\2\u00c4\u00c6\7E\2\2\u00c5\u00c7\7)\2\2\u00c6\u00c5\3"+
		"\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00cc\7\25\2\2\u00c9"+
		"\u00ca\7\13\2\2\u00ca\u00cb\7%\2\2\u00cb\u00cd\7*\2\2\u00cc\u00c9\3\2"+
		"\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf\5\32\16\2\u00cf"+
		"\u00d5\7.\2\2\u00d0\u00d1\5\34\17\2\u00d1\u00d2\7+\2\2\u00d2\u00d4\3\2"+
		"\2\2\u00d3\u00d0\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5"+
		"\u00d6\3\2\2\2\u00d6\u00d8\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8\u00d9\5\34"+
		"\17\2\u00d9\u00da\7\23\2\2\u00da\u00db\5@!\2\u00db\31\3\2\2\2\u00dc\u00dd"+
		"\5D#\2\u00dd\33\3\2\2\2\u00de\u00df\5\36\20\2\u00df\u00e0\5$\23\2\u00e0"+
		"\u0137\3\2\2\2\u00e1\u00e3\7\7\2\2\u00e2\u00e4\5 \21\2\u00e3\u00e2\3\2"+
		"\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e6\3\2\2\2\u00e5\u00e1\3\2\2\2\u00e5"+
		"\u00e6\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e8\7\n\2\2\u00e8\u00e9\7D"+
		"\2\2\u00e9\u00ef\7.\2\2\u00ea\u00eb\5\62\32\2\u00eb\u00ec\7+\2\2\u00ec"+
		"\u00ee\3\2\2\2\u00ed\u00ea\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed\3\2"+
		"\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f2\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2"+
		"\u00f3\5\62\32\2\u00f3\u00f4\7\23\2\2\u00f4\u0137\3\2\2\2\u00f5\u00f7"+
		"\t\4\2\2\u00f6\u00f8\5 \21\2\u00f7\u00f6\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8"+
		"\u00f9\3\2\2\2\u00f9\u00ff\7.\2\2\u00fa\u00fb\5\62\32\2\u00fb\u00fc\7"+
		"+\2\2\u00fc\u00fe\3\2\2\2\u00fd\u00fa\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff"+
		"\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0102\3\2\2\2\u0101\u00ff\3\2"+
		"\2\2\u0102\u0103\5\62\32\2\u0103\u0104\7\23\2\2\u0104\u0137\3\2\2\2\u0105"+
		"\u0107\7\7\2\2\u0106\u0108\5 \21\2\u0107\u0106\3\2\2\2\u0107\u0108\3\2"+
		"\2\2\u0108\u010a\3\2\2\2\u0109\u0105\3\2\2\2\u0109\u010a\3\2\2\2\u010a"+
		"\u010b\3\2\2\2\u010b\u010d\7J\2\2\u010c\u010e\t\4\2\2\u010d\u010c\3\2"+
		"\2\2\u010d\u010e\3\2\2\2\u010e\u0110\3\2\2\2\u010f\u0111\5\"\22\2\u0110"+
		"\u010f\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0118\7."+
		"\2\2\u0113\u0114\5\62\32\2\u0114\u0115\7+\2\2\u0115\u0117\3\2\2\2\u0116"+
		"\u0113\3\2\2\2\u0117\u011a\3\2\2\2\u0118\u0116\3\2\2\2\u0118\u0119\3\2"+
		"\2\2\u0119\u011b\3\2\2\2\u011a\u0118\3\2\2\2\u011b\u011c\5\62\32\2\u011c"+
		"\u011d\7\23\2\2\u011d\u0137\3\2\2\2\u011e\u0120\7\7\2\2\u011f\u0121\5"+
		" \21\2\u0120\u011f\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0123\3\2\2\2\u0122"+
		"\u011e\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0125\7/"+
		"\2\2\u0125\u0127\7D\2\2\u0126\u0128\5\"\22\2\u0127\u0126\3\2\2\2\u0127"+
		"\u0128\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012f\7.\2\2\u012a\u012b\5\62"+
		"\32\2\u012b\u012c\7+\2\2\u012c\u012e\3\2\2\2\u012d\u012a\3\2\2\2\u012e"+
		"\u0131\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0132\3\2"+
		"\2\2\u0131\u012f\3\2\2\2\u0132\u0133\5\62\32\2\u0133\u0134\7\23\2\2\u0134"+
		"\u0135\5.\30\2\u0135\u0137\3\2\2\2\u0136\u00de\3\2\2\2\u0136\u00e5\3\2"+
		"\2\2\u0136\u00f5\3\2\2\2\u0136\u0109\3\2\2\2\u0136\u0122\3\2\2\2\u0137"+
		"\35\3\2\2\2\u0138\u0139\5D#\2\u0139\37\3\2\2\2\u013a\u013b\5D#\2\u013b"+
		"!\3\2\2\2\u013c\u013d\5D#\2\u013d#\3\2\2\2\u013e\u0141\5\64\33\2\u013f"+
		"\u0142\5*\26\2\u0140\u0142\5,\27\2\u0141\u013f\3\2\2\2\u0141\u0140\3\2"+
		"\2\2\u0141\u0142\3\2\2\2\u0142\u0145\3\2\2\2\u0143\u0144\78\2\2\u0144"+
		"\u0146\5(\25\2\u0145\u0143\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0148\3\2"+
		"\2\2\u0147\u0149\5&\24\2\u0148\u0147\3\2\2\2\u0148\u0149\3\2\2\2\u0149"+
		"\u0152\3\2\2\2\u014a\u014c\7J\2\2\u014b\u014d\7D\2\2\u014c\u014b\3\2\2"+
		"\2\u014c\u014d\3\2\2\2\u014d\u0153\3\2\2\2\u014e\u0150\7\n\2\2\u014f\u014e"+
		"\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0153\7D\2\2\u0152"+
		"\u014a\3\2\2\2\u0152\u014f\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0156\3\2"+
		"\2\2\u0154\u0155\7\b\2\2\u0155\u0157\7P\2\2\u0156\u0154\3\2\2\2\u0156"+
		"\u0157\3\2\2\2\u0157%\3\2\2\2\u0158\u0159\7\33\2\2\u0159\'\3\2\2\2\u015a"+
		"\u015b\5> \2\u015b)\3\2\2\2\u015c\u015d\7>\2\2\u015d+\3\2\2\2\u015e\u015f"+
		"\7%\2\2\u015f\u0160\7>\2\2\u0160-\3\2\2\2\u0161\u0162\7 \2\2\u0162\u0163"+
		"\5\60\31\2\u0163\u0169\7.\2\2\u0164\u0165\5\62\32\2\u0165\u0166\7+\2\2"+
		"\u0166\u0168\3\2\2\2\u0167\u0164\3\2\2\2\u0168\u016b\3\2\2\2\u0169\u0167"+
		"\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u016c\3\2\2\2\u016b\u0169\3\2\2\2\u016c"+
		"\u016d\5\62\32\2\u016d\u0171\7\23\2\2\u016e\u016f\7F\2\2\u016f\u0170\7"+
		"\6\2\2\u0170\u0172\5<\37\2\u0171\u016e\3\2\2\2\u0171\u0172\3\2\2\2\u0172"+
		"\u0176\3\2\2\2\u0173\u0174\7F\2\2\u0174\u0175\7?\2\2\u0175\u0177\5<\37"+
		"\2\u0176\u0173\3\2\2\2\u0176\u0177\3\2\2\2\u0177/\3\2\2\2\u0178\u0179"+
		"\5D#\2\u0179\61\3\2\2\2\u017a\u017c\5D#\2\u017b\u017d\t\5\2\2\u017c\u017b"+
		"\3\2\2\2\u017c\u017d\3\2\2\2\u017d\63\3\2\2\2\u017e\u0182\7=\2\2\u017f"+
		"\u0180\7.\2\2\u0180\u0181\7N\2\2\u0181\u0183\7\23\2\2\u0182\u017f\3\2"+
		"\2\2\u0182\u0183\3\2\2\2\u0183\u02a4\3\2\2\2\u0184\u0188\7\36\2\2\u0185"+
		"\u0186\7.\2\2\u0186\u0187\7N\2\2\u0187\u0189\7\23\2\2\u0188\u0185\3\2"+
		"\2\2\u0188\u0189\3\2\2\2\u0189\u018b\3\2\2\2\u018a\u018c\7\21\2\2\u018b"+
		"\u018a\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u018e\3\2\2\2\u018d\u018f\79"+
		"\2\2\u018e\u018d\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u02a4\3\2\2\2\u0190"+
		"\u0194\7B\2\2\u0191\u0192\7.\2\2\u0192\u0193\7N\2\2\u0193\u0195\7\23\2"+
		"\2\u0194\u0191\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u0197\3\2\2\2\u0196\u0198"+
		"\7\21\2\2\u0197\u0196\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u019a\3\2\2\2"+
		"\u0199\u019b\79\2\2\u019a\u0199\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u02a4"+
		"\3\2\2\2\u019c\u01a0\7\t\2\2\u019d\u019e\7.\2\2\u019e\u019f\7N\2\2\u019f"+
		"\u01a1\7\23\2\2\u01a0\u019d\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01a3\3"+
		"\2\2\2\u01a2\u01a4\7\21\2\2\u01a3\u01a2\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4"+
		"\u01a6\3\2\2\2\u01a5\u01a7\79\2\2\u01a6\u01a5\3\2\2\2\u01a6\u01a7\3\2"+
		"\2\2\u01a7\u02a4\3\2\2\2\u01a8\u01ac\7&\2\2\u01a9\u01aa\7.\2\2\u01aa\u01ab"+
		"\7N\2\2\u01ab\u01ad\7\23\2\2\u01ac\u01a9\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad"+
		"\u01af\3\2\2\2\u01ae\u01b0\7\21\2\2\u01af\u01ae\3\2\2\2\u01af\u01b0\3"+
		"\2\2\2\u01b0\u01b2\3\2\2\2\u01b1\u01b3\79\2\2\u01b2\u01b1\3\2\2\2\u01b2"+
		"\u01b3\3\2\2\2\u01b3\u02a4\3\2\2\2\u01b4\u01b8\7(\2\2\u01b5\u01b6\7.\2"+
		"\2\u01b6\u01b7\7N\2\2\u01b7\u01b9\7\23\2\2\u01b8\u01b5\3\2\2\2\u01b8\u01b9"+
		"\3\2\2\2\u01b9\u01bb\3\2\2\2\u01ba\u01bc\7\21\2\2\u01bb\u01ba\3\2\2\2"+
		"\u01bb\u01bc\3\2\2\2\u01bc\u01be\3\2\2\2\u01bd\u01bf\79\2\2\u01be\u01bd"+
		"\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u02a4\3\2\2\2\u01c0\u01c4\7\66\2\2"+
		"\u01c1\u01c2\7.\2\2\u01c2\u01c3\7N\2\2\u01c3\u01c5\7\23\2\2\u01c4\u01c1"+
		"\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5\u01c7\3\2\2\2\u01c6\u01c8\7\21\2\2"+
		"\u01c7\u01c6\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01ca\3\2\2\2\u01c9\u01cb"+
		"\79\2\2\u01ca\u01c9\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u02a4\3\2\2\2\u01cc"+
		"\u01d2\7H\2\2\u01cd\u01ce\7.\2\2\u01ce\u01cf\7N\2\2\u01cf\u01d0\7+\2\2"+
		"\u01d0\u01d1\7N\2\2\u01d1\u01d3\7\23\2\2\u01d2\u01cd\3\2\2\2\u01d2\u01d3"+
		"\3\2\2\2\u01d3\u01d5\3\2\2\2\u01d4\u01d6\7\21\2\2\u01d5\u01d4\3\2\2\2"+
		"\u01d5\u01d6\3\2\2\2\u01d6\u01d8\3\2\2\2\u01d7\u01d9\79\2\2\u01d8\u01d7"+
		"\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9\u02a4\3\2\2\2\u01da\u01e0\7G\2\2\u01db"+
		"\u01dc\7.\2\2\u01dc\u01dd\7N\2\2\u01dd\u01de\7+\2\2\u01de\u01df\7N\2\2"+
		"\u01df\u01e1\7\23\2\2\u01e0\u01db\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1\u01e3"+
		"\3\2\2\2\u01e2\u01e4\7\21\2\2\u01e3\u01e2\3\2\2\2\u01e3\u01e4\3\2\2\2"+
		"\u01e4\u01e6\3\2\2\2\u01e5\u01e7\79\2\2\u01e6\u01e5\3\2\2\2\u01e6\u01e7"+
		"\3\2\2\2\u01e7\u02a4\3\2\2\2\u01e8\u01ee\7!\2\2\u01e9\u01ea\7.\2\2\u01ea"+
		"\u01eb\7N\2\2\u01eb\u01ec\7+\2\2\u01ec\u01ed\7N\2\2\u01ed\u01ef\7\23\2"+
		"\2\u01ee\u01e9\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef\u01f1\3\2\2\2\u01f0\u01f2"+
		"\7\21\2\2\u01f1\u01f0\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2\u01f4\3\2\2\2"+
		"\u01f3\u01f5\79\2\2\u01f4\u01f3\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5\u02a4"+
		"\3\2\2\2\u01f6\u01fe\7\26\2\2\u01f7\u01f8\7.\2\2\u01f8\u01fb\7N\2\2\u01f9"+
		"\u01fa\7+\2\2\u01fa\u01fc\7N\2\2\u01fb\u01f9\3\2\2\2\u01fb\u01fc\3\2\2"+
		"\2\u01fc\u01fd\3\2\2\2\u01fd\u01ff\7\23\2\2\u01fe\u01f7\3\2\2\2\u01fe"+
		"\u01ff\3\2\2\2\u01ff\u0201\3\2\2\2\u0200\u0202\7\21\2\2\u0201\u0200\3"+
		"\2\2\2\u0201\u0202\3\2\2\2\u0202\u0204\3\2\2\2\u0203\u0205\79\2\2\u0204"+
		"\u0203\3\2\2\2\u0204\u0205\3\2\2\2\u0205\u02a4\3\2\2\2\u0206\u020e\7-"+
		"\2\2\u0207\u0208\7.\2\2\u0208\u020b\7N\2\2\u0209\u020a\7+\2\2\u020a\u020c"+
		"\7N\2\2\u020b\u0209\3\2\2\2\u020b\u020c\3\2\2\2\u020c\u020d\3\2\2\2\u020d"+
		"\u020f\7\23\2\2\u020e\u0207\3\2\2\2\u020e\u020f\3\2\2\2\u020f\u0211\3"+
		"\2\2\2\u0210\u0212\7\21\2\2\u0211\u0210\3\2\2\2\u0211\u0212\3\2\2\2\u0212"+
		"\u0214\3\2\2\2\u0213\u0215\79\2\2\u0214\u0213\3\2\2\2\u0214\u0215\3\2"+
		"\2\2\u0215\u02a4\3\2\2\2\u0216\u02a4\7\67\2\2\u0217\u02a4\7\60\2\2\u0218"+
		"\u02a4\7\22\2\2\u0219\u02a4\7\37\2\2\u021a\u02a4\7\20\2\2\u021b\u021f"+
		"\7\27\2\2\u021c\u021d\7.\2\2\u021d\u021e\7N\2\2\u021e\u0220\7\23\2\2\u021f"+
		"\u021c\3\2\2\2\u021f\u0220\3\2\2\2\u0220\u0224\3\2\2\2\u0221\u0222\7\24"+
		"\2\2\u0222\u0223\7\17\2\2\u0223\u0225\58\35\2\u0224\u0221\3\2\2\2\u0224"+
		"\u0225\3\2\2\2\u0225\u0228\3\2\2\2\u0226\u0227\7\63\2\2\u0227\u0229\5"+
		":\36\2\u0228\u0226\3\2\2\2\u0228\u0229\3\2\2\2\u0229\u02a4\3\2\2\2\u022a"+
		"\u022b\7;\2\2\u022b\u022c\7.\2\2\u022c\u022d\7N\2\2\u022d\u0231\7\23\2"+
		"\2\u022e\u022f\7\24\2\2\u022f\u0230\7\17\2\2\u0230\u0232\58\35\2\u0231"+
		"\u022e\3\2\2\2\u0231\u0232\3\2\2\2\u0232\u0235\3\2\2\2\u0233\u0234\7\63"+
		"\2\2\u0234\u0236\5:\36\2\u0235\u0233\3\2\2\2\u0235\u0236\3\2\2\2\u0236"+
		"\u02a4\3\2\2\2\u0237\u023b\7\4\2\2\u0238\u0239\7.\2\2\u0239\u023a\7N\2"+
		"\2\u023a\u023c\7\23\2\2\u023b\u0238\3\2\2\2\u023b\u023c\3\2\2\2\u023c"+
		"\u02a4\3\2\2\2\u023d\u023e\7\'\2\2\u023e\u023f\7.\2\2\u023f\u0240\7N\2"+
		"\2\u0240\u02a4\7\23\2\2\u0241\u02a4\7\f\2\2\u0242\u02a4\7:\2\2\u0243\u02a4"+
		"\7\64\2\2\u0244\u02a4\7\16\2\2\u0245\u0247\7\65\2\2\u0246\u0248\7\4\2"+
		"\2\u0247\u0246\3\2\2\2\u0247\u0248\3\2\2\2\u0248\u024c\3\2\2\2\u0249\u024a"+
		"\7\24\2\2\u024a\u024b\7\17\2\2\u024b\u024d\58\35\2\u024c\u0249\3\2\2\2"+
		"\u024c\u024d\3\2\2\2\u024d\u0250\3\2\2\2\u024e\u024f\7\63\2\2\u024f\u0251"+
		"\5:\36\2\u0250\u024e\3\2\2\2\u0250\u0251\3\2\2\2\u0251\u02a4\3\2\2\2\u0252"+
		"\u0254\7$\2\2\u0253\u0255\7\4\2\2\u0254\u0253\3\2\2\2\u0254\u0255\3\2"+
		"\2\2\u0255\u0259\3\2\2\2\u0256\u0257\7\24\2\2\u0257\u0258\7\17\2\2\u0258"+
		"\u025a\58\35\2\u0259\u0256\3\2\2\2\u0259\u025a\3\2\2\2\u025a\u025d\3\2"+
		"\2\2\u025b\u025c\7\63\2\2\u025c\u025e\5:\36\2\u025d\u025b\3\2\2\2\u025d"+
		"\u025e\3\2\2\2\u025e\u02a4\3\2\2\2\u025f\u0261\7I\2\2\u0260\u0262\7\4"+
		"\2\2\u0261\u0260\3\2\2\2\u0261\u0262\3\2\2\2\u0262\u0266\3\2\2\2\u0263"+
		"\u0264\7\24\2\2\u0264\u0265\7\17\2\2\u0265\u0267\58\35\2\u0266\u0263\3"+
		"\2\2\2\u0266\u0267\3\2\2\2\u0267\u026a\3\2\2\2\u0268\u0269\7\63\2\2\u0269"+
		"\u026b\5:\36\2\u026a\u0268\3\2\2\2\u026a\u026b\3\2\2\2\u026b\u02a4\3\2"+
		"\2\2\u026c\u026e\7\30\2\2\u026d\u026f\7\4\2\2\u026e\u026d\3\2\2\2\u026e"+
		"\u026f\3\2\2\2\u026f\u0273\3\2\2\2\u0270\u0271\7\24\2\2\u0271\u0272\7"+
		"\17\2\2\u0272\u0274\58\35\2\u0273\u0270\3\2\2\2\u0273\u0274\3\2\2\2\u0274"+
		"\u0277\3\2\2\2\u0275\u0276\7\63\2\2\u0276\u0278\5:\36\2\u0277\u0275\3"+
		"\2\2\2\u0277\u0278\3\2\2\2\u0278\u02a4\3\2\2\2\u0279\u027a\7A\2\2\u027a"+
		"\u0280\7.\2\2\u027b\u027c\5\66\34\2\u027c\u027d\7+\2\2\u027d\u027f\3\2"+
		"\2\2\u027e\u027b\3\2\2\2\u027f\u0282\3\2\2\2\u0280\u027e\3\2\2\2\u0280"+
		"\u0281\3\2\2\2\u0281\u0283\3\2\2\2\u0282\u0280\3\2\2\2\u0283\u0284\5\66"+
		"\34\2\u0284\u0288\7\23\2\2\u0285\u0286\7\24\2\2\u0286\u0287\7\17\2\2\u0287"+
		"\u0289\58\35\2\u0288\u0285\3\2\2\2\u0288\u0289\3\2\2\2\u0289\u028c\3\2"+
		"\2\2\u028a\u028b\7\63\2\2\u028b\u028d\5:\36\2\u028c\u028a\3\2\2\2\u028c"+
		"\u028d\3\2\2\2\u028d\u02a4\3\2\2\2\u028e\u028f\7\17\2\2\u028f\u0295\7"+
		".\2\2\u0290\u0291\5\66\34\2\u0291\u0292\7+\2\2\u0292\u0294\3\2\2\2\u0293"+
		"\u0290\3\2\2\2\u0294\u0297\3\2\2\2\u0295\u0293\3\2\2\2\u0295\u0296\3\2"+
		"\2\2\u0296\u0298\3\2\2\2\u0297\u0295\3\2\2\2\u0298\u0299\5\66\34\2\u0299"+
		"\u029d\7\23\2\2\u029a\u029b\7\24\2\2\u029b\u029c\7\17\2\2\u029c\u029e"+
		"\58\35\2\u029d\u029a\3\2\2\2\u029d\u029e\3\2\2\2\u029e\u02a1\3\2\2\2\u029f"+
		"\u02a0\7\63\2\2\u02a0\u02a2\5:\36\2\u02a1\u029f\3\2\2\2\u02a1\u02a2\3"+
		"\2\2\2\u02a2\u02a4\3\2\2\2\u02a3\u017e\3\2\2\2\u02a3\u0184\3\2\2\2\u02a3"+
		"\u0190\3\2\2\2\u02a3\u019c\3\2\2\2\u02a3\u01a8\3\2\2\2\u02a3\u01b4\3\2"+
		"\2\2\u02a3\u01c0\3\2\2\2\u02a3\u01cc\3\2\2\2\u02a3\u01da\3\2\2\2\u02a3"+
		"\u01e8\3\2\2\2\u02a3\u01f6\3\2\2\2\u02a3\u0206\3\2\2\2\u02a3\u0216\3\2"+
		"\2\2\u02a3\u0217\3\2\2\2\u02a3\u0218\3\2\2\2\u02a3\u0219\3\2\2\2\u02a3"+
		"\u021a\3\2\2\2\u02a3\u021b\3\2\2\2\u02a3\u022a\3\2\2\2\u02a3\u0237\3\2"+
		"\2\2\u02a3\u023d\3\2\2\2\u02a3\u0241\3\2\2\2\u02a3\u0242\3\2\2\2\u02a3"+
		"\u0243\3\2\2\2\u02a3\u0244\3\2\2\2\u02a3\u0245\3\2\2\2\u02a3\u0252\3\2"+
		"\2\2\u02a3\u025f\3\2\2\2\u02a3\u026c\3\2\2\2\u02a3\u0279\3\2\2\2\u02a3"+
		"\u028e\3\2\2\2\u02a4\65\3\2\2\2\u02a5\u02a6\7P\2\2\u02a6\67\3\2\2\2\u02a7"+
		"\u02a8\5D#\2\u02a89\3\2\2\2\u02a9\u02aa\5D#\2\u02aa;\3\2\2\2\u02ab\u02b2"+
		"\7L\2\2\u02ac\u02b2\7\35\2\2\u02ad\u02ae\7\17\2\2\u02ae\u02b2\7>\2\2\u02af"+
		"\u02b0\7<\2\2\u02b0\u02b2\7\61\2\2\u02b1\u02ab\3\2\2\2\u02b1\u02ac\3\2"+
		"\2\2\u02b1\u02ad\3\2\2\2\u02b1\u02af\3\2\2\2\u02b2=\3\2\2\2\u02b3\u02b4"+
		"\t\6\2\2\u02b4?\3\2\2\2\u02b5\u02b7\5B\"\2\u02b6\u02b5\3\2\2\2\u02b7\u02ba"+
		"\3\2\2\2\u02b8\u02b6\3\2\2\2\u02b8\u02b9\3\2\2\2\u02b9A\3\2\2\2\u02ba"+
		"\u02b8\3\2\2\2\u02bb\u02bc\7M\2\2\u02bc\u02bd\7\34\2\2\u02bd\u02c0\7M"+
		"\2\2\u02be\u02c0\5\n\6\2\u02bf\u02bb\3\2\2\2\u02bf\u02be\3\2\2\2\u02c0"+
		"C\3\2\2\2\u02c1\u02c2\7\5\2\2\u02c2\u02c3\7M\2\2\u02c3\u02cc\7\5\2\2\u02c4"+
		"\u02c5\7\62\2\2\u02c5\u02c6\7M\2\2\u02c6\u02cc\7\62\2\2\u02c7\u02c8\7"+
		"\r\2\2\u02c8\u02c9\7M\2\2\u02c9\u02cc\7\r\2\2\u02ca\u02cc\7M\2\2\u02cb"+
		"\u02c1\3\2\2\2\u02cb\u02c4\3\2\2\2\u02cb\u02c7\3\2\2\2\u02cb\u02ca\3\2"+
		"\2\2\u02ccE\3\2\2\2rI^dmsw|\u0080\u0084\u008a\u0092\u009a\u00a3\u00a7"+
		"\u00b0\u00b5\u00bc\u00c0\u00c6\u00cc\u00d5\u00e3\u00e5\u00ef\u00f7\u00ff"+
		"\u0107\u0109\u010d\u0110\u0118\u0120\u0122\u0127\u012f\u0136\u0141\u0145"+
		"\u0148\u014c\u014f\u0152\u0156\u0169\u0171\u0176\u017c\u0182\u0188\u018b"+
		"\u018e\u0194\u0197\u019a\u01a0\u01a3\u01a6\u01ac\u01af\u01b2\u01b8\u01bb"+
		"\u01be\u01c4\u01c7\u01ca\u01d2\u01d5\u01d8\u01e0\u01e3\u01e6\u01ee\u01f1"+
		"\u01f4\u01fb\u01fe\u0201\u0204\u020b\u020e\u0211\u0214\u021f\u0224\u0228"+
		"\u0231\u0235\u023b\u0247\u024c\u0250\u0254\u0259\u025d\u0261\u0266\u026a"+
		"\u026e\u0273\u0277\u0280\u0288\u028c\u0295\u029d\u02a1\u02a3\u02b1\u02b8"+
		"\u02bf\u02cb";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}