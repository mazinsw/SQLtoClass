// Generated from D:\Estudos\Java\Desktop\SQLParser\SQL.g4 by ANTLR 4.1
package parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SQLLexer extends Lexer {
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
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'INDEX'", "'BINARY'", "'`'", "'DELETE'", "'CONSTRAINT'", "'COMMENT'", 
		"'MEDIUMINT'", "'PRIMARY'", "'IF'", "'TINYBLOB'", "'\"'", "'LONGBLOB'", 
		"'SET'", "'YEAR'", "'UNSIGNED'", "'TIMESTAMP'", "')'", "'CHARACTER'", 
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
	public static final String[] ruleNames = {
		"T__73", "T__72", "T__71", "T__70", "T__69", "T__68", "T__67", "T__66", 
		"T__65", "T__64", "T__63", "T__62", "T__61", "T__60", "T__59", "T__58", 
		"T__57", "T__56", "T__55", "T__54", "T__53", "T__52", "T__51", "T__50", 
		"T__49", "T__48", "T__47", "T__46", "T__45", "T__44", "T__43", "T__42", 
		"T__41", "T__40", "T__39", "T__38", "T__37", "T__36", "T__35", "T__34", 
		"T__33", "T__32", "T__31", "T__30", "T__29", "T__28", "T__27", "T__26", 
		"T__25", "T__24", "T__23", "T__22", "T__21", "T__20", "T__19", "T__18", 
		"T__17", "T__16", "T__15", "T__14", "T__13", "T__12", "T__11", "T__10", 
		"T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", 
		"T__0", "NAME", "INT", "FLOAT", "STRING", "COMMENT", "SINGLE_COMMENT", 
		"WS"
	};


	public SQLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SQL.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 78: COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 79: SINGLE_COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 80: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2: skip();  break;
		}
	}
	private void SINGLE_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: skip();  break;
		}
	}
	private void COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2S\u02d4\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\31\3\31"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3"+
		" \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3%\3%\3"+
		"%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3("+
		"\3(\3(\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3*\3*\3+\3+\3+\3+\3,"+
		"\3,\3,\3,\3,\3,\3,\3,\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\64"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\38\38\38\38\38\38\38\38\38\39\39\39\39\39\3:\3:\3:\3:\3:\3:\3:\3:\3;"+
		"\3;\3;\3<\3<\3<\3<\3=\3=\3=\3=\3=\3>\3>\3>\3>\3>\3>\3>\3?\3?\3?\3?\3?"+
		"\3?\3?\3@\3@\3@\3@\3@\3A\3A\3A\3A\3A\3A\3A\3A\3A\3B\3B\3C\3C\3C\3C\3D"+
		"\3D\3D\3D\3D\3D\3D\3E\3E\3E\3F\3F\3F\3F\3F\3F\3F\3G\3G\3G\3G\3G\3H\3H"+
		"\3H\3H\3H\3H\3H\3H\3H\3H\3H\3I\3I\3I\3I\3I\3I\3I\3J\3J\3J\3J\3J\3J\3J"+
		"\3J\3J\3K\3K\3K\3K\3K\3K\3K\3K\3K\3L\3L\7L\u028d\nL\fL\16L\u0290\13L\3"+
		"M\6M\u0293\nM\rM\16M\u0294\3N\7N\u0298\nN\fN\16N\u029b\13N\3N\3N\6N\u029f"+
		"\nN\rN\16N\u02a0\3O\3O\7O\u02a5\nO\fO\16O\u02a8\13O\3O\3O\3O\7O\u02ad"+
		"\nO\fO\16O\u02b0\13O\3O\5O\u02b3\nO\3P\3P\3P\3P\7P\u02b9\nP\fP\16P\u02bc"+
		"\13P\3P\3P\3P\3P\3P\3Q\3Q\3Q\3Q\7Q\u02c7\nQ\fQ\16Q\u02ca\13Q\3Q\3Q\3R"+
		"\6R\u02cf\nR\rR\16R\u02d0\3R\3R\5\u02a6\u02ae\u02baS\3\3\1\5\4\1\7\5\1"+
		"\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17"+
		"\1\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\27\1-\30\1/\31\1\61"+
		"\32\1\63\33\1\65\34\1\67\35\19\36\1;\37\1= \1?!\1A\"\1C#\1E$\1G%\1I&\1"+
		"K\'\1M(\1O)\1Q*\1S+\1U,\1W-\1Y.\1[/\1]\60\1_\61\1a\62\1c\63\1e\64\1g\65"+
		"\1i\66\1k\67\1m8\1o9\1q:\1s;\1u<\1w=\1y>\1{?\1}@\1\177A\1\u0081B\1\u0083"+
		"C\1\u0085D\1\u0087E\1\u0089F\1\u008bG\1\u008dH\1\u008fI\1\u0091J\1\u0093"+
		"K\1\u0095L\1\u0097M\1\u0099N\1\u009bO\1\u009dP\1\u009fQ\2\u00a1R\3\u00a3"+
		"S\4\3\2\7\5\2C\\aac|\6\2\62;C\\aac|\3\2\62;\4\2\f\f\17\17\5\2\13\f\17"+
		"\17\"\"\u02dd\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3"+
		"\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2"+
		"\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2"+
		"S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3"+
		"\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2"+
		"\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2"+
		"y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083"+
		"\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2"+
		"\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095"+
		"\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2"+
		"\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\3\u00a5\3\2\2\2\5\u00ab"+
		"\3\2\2\2\7\u00b2\3\2\2\2\t\u00b4\3\2\2\2\13\u00bb\3\2\2\2\r\u00c6\3\2"+
		"\2\2\17\u00ce\3\2\2\2\21\u00d8\3\2\2\2\23\u00e0\3\2\2\2\25\u00e3\3\2\2"+
		"\2\27\u00ec\3\2\2\2\31\u00ee\3\2\2\2\33\u00f7\3\2\2\2\35\u00fb\3\2\2\2"+
		"\37\u0100\3\2\2\2!\u0109\3\2\2\2#\u0113\3\2\2\2%\u0115\3\2\2\2\'\u011f"+
		"\3\2\2\2)\u0125\3\2\2\2+\u012d\3\2\2\2-\u0132\3\2\2\2/\u013b\3\2\2\2\61"+
		"\u013d\3\2\2\2\63\u0142\3\2\2\2\65\u0151\3\2\2\2\67\u0153\3\2\2\29\u015b"+
		"\3\2\2\2;\u0163\3\2\2\2=\u016c\3\2\2\2?\u0177\3\2\2\2A\u017d\3\2\2\2C"+
		"\u0182\3\2\2\2E\u0186\3\2\2\2G\u018b\3\2\2\2I\u018f\3\2\2\2K\u0193\3\2"+
		"\2\2M\u019d\3\2\2\2O\u01a5\3\2\2\2Q\u01af\3\2\2\2S\u01b6\3\2\2\2U\u01b8"+
		"\3\2\2\2W\u01bc\3\2\2\2Y\u01c4\3\2\2\2[\u01c6\3\2\2\2]\u01ce\3\2\2\2_"+
		"\u01d3\3\2\2\2a\u01da\3\2\2\2c\u01dc\3\2\2\2e\u01e4\3\2\2\2g\u01ef\3\2"+
		"\2\2i\u01f8\3\2\2\2k\u01ff\3\2\2\2m\u0204\3\2\2\2o\u020c\3\2\2\2q\u0215"+
		"\3\2\2\2s\u021a\3\2\2\2u\u0222\3\2\2\2w\u0225\3\2\2\2y\u0229\3\2\2\2{"+
		"\u022e\3\2\2\2}\u0235\3\2\2\2\177\u023c\3\2\2\2\u0081\u0241\3\2\2\2\u0083"+
		"\u024a\3\2\2\2\u0085\u024c\3\2\2\2\u0087\u0250\3\2\2\2\u0089\u0257\3\2"+
		"\2\2\u008b\u025a\3\2\2\2\u008d\u0261\3\2\2\2\u008f\u0266\3\2\2\2\u0091"+
		"\u0271\3\2\2\2\u0093\u0278\3\2\2\2\u0095\u0281\3\2\2\2\u0097\u028a\3\2"+
		"\2\2\u0099\u0292\3\2\2\2\u009b\u0299\3\2\2\2\u009d\u02b2\3\2\2\2\u009f"+
		"\u02b4\3\2\2\2\u00a1\u02c2\3\2\2\2\u00a3\u02ce\3\2\2\2\u00a5\u00a6\7K"+
		"\2\2\u00a6\u00a7\7P\2\2\u00a7\u00a8\7F\2\2\u00a8\u00a9\7G\2\2\u00a9\u00aa"+
		"\7Z\2\2\u00aa\4\3\2\2\2\u00ab\u00ac\7D\2\2\u00ac\u00ad\7K\2\2\u00ad\u00ae"+
		"\7P\2\2\u00ae\u00af\7C\2\2\u00af\u00b0\7T\2\2\u00b0\u00b1\7[\2\2\u00b1"+
		"\6\3\2\2\2\u00b2\u00b3\7b\2\2\u00b3\b\3\2\2\2\u00b4\u00b5\7F\2\2\u00b5"+
		"\u00b6\7G\2\2\u00b6\u00b7\7N\2\2\u00b7\u00b8\7G\2\2\u00b8\u00b9\7V\2\2"+
		"\u00b9\u00ba\7G\2\2\u00ba\n\3\2\2\2\u00bb\u00bc\7E\2\2\u00bc\u00bd\7Q"+
		"\2\2\u00bd\u00be\7P\2\2\u00be\u00bf\7U\2\2\u00bf\u00c0\7V\2\2\u00c0\u00c1"+
		"\7T\2\2\u00c1\u00c2\7C\2\2\u00c2\u00c3\7K\2\2\u00c3\u00c4\7P\2\2\u00c4"+
		"\u00c5\7V\2\2\u00c5\f\3\2\2\2\u00c6\u00c7\7E\2\2\u00c7\u00c8\7Q\2\2\u00c8"+
		"\u00c9\7O\2\2\u00c9\u00ca\7O\2\2\u00ca\u00cb\7G\2\2\u00cb\u00cc\7P\2\2"+
		"\u00cc\u00cd\7V\2\2\u00cd\16\3\2\2\2\u00ce\u00cf\7O\2\2\u00cf\u00d0\7"+
		"G\2\2\u00d0\u00d1\7F\2\2\u00d1\u00d2\7K\2\2\u00d2\u00d3\7W\2\2\u00d3\u00d4"+
		"\7O\2\2\u00d4\u00d5\7K\2\2\u00d5\u00d6\7P\2\2\u00d6\u00d7\7V\2\2\u00d7"+
		"\20\3\2\2\2\u00d8\u00d9\7R\2\2\u00d9\u00da\7T\2\2\u00da\u00db\7K\2\2\u00db"+
		"\u00dc\7O\2\2\u00dc\u00dd\7C\2\2\u00dd\u00de\7T\2\2\u00de\u00df\7[\2\2"+
		"\u00df\22\3\2\2\2\u00e0\u00e1\7K\2\2\u00e1\u00e2\7H\2\2\u00e2\24\3\2\2"+
		"\2\u00e3\u00e4\7V\2\2\u00e4\u00e5\7K\2\2\u00e5\u00e6\7P\2\2\u00e6\u00e7"+
		"\7[\2\2\u00e7\u00e8\7D\2\2\u00e8\u00e9\7N\2\2\u00e9\u00ea\7Q\2\2\u00ea"+
		"\u00eb\7D\2\2\u00eb\26\3\2\2\2\u00ec\u00ed\7$\2\2\u00ed\30\3\2\2\2\u00ee"+
		"\u00ef\7N\2\2\u00ef\u00f0\7Q\2\2\u00f0\u00f1\7P\2\2\u00f1\u00f2\7I\2\2"+
		"\u00f2\u00f3\7D\2\2\u00f3\u00f4\7N\2\2\u00f4\u00f5\7Q\2\2\u00f5\u00f6"+
		"\7D\2\2\u00f6\32\3\2\2\2\u00f7\u00f8\7U\2\2\u00f8\u00f9\7G\2\2\u00f9\u00fa"+
		"\7V\2\2\u00fa\34\3\2\2\2\u00fb\u00fc\7[\2\2\u00fc\u00fd\7G\2\2\u00fd\u00fe"+
		"\7C\2\2\u00fe\u00ff\7T\2\2\u00ff\36\3\2\2\2\u0100\u0101\7W\2\2\u0101\u0102"+
		"\7P\2\2\u0102\u0103\7U\2\2\u0103\u0104\7K\2\2\u0104\u0105\7I\2\2\u0105"+
		"\u0106\7P\2\2\u0106\u0107\7G\2\2\u0107\u0108\7F\2\2\u0108 \3\2\2\2\u0109"+
		"\u010a\7V\2\2\u010a\u010b\7K\2\2\u010b\u010c\7O\2\2\u010c\u010d\7G\2\2"+
		"\u010d\u010e\7U\2\2\u010e\u010f\7V\2\2\u010f\u0110\7C\2\2\u0110\u0111"+
		"\7O\2\2\u0111\u0112\7R\2\2\u0112\"\3\2\2\2\u0113\u0114\7+\2\2\u0114$\3"+
		"\2\2\2\u0115\u0116\7E\2\2\u0116\u0117\7J\2\2\u0117\u0118\7C\2\2\u0118"+
		"\u0119\7T\2\2\u0119\u011a\7C\2\2\u011a\u011b\7E\2\2\u011b\u011c\7V\2\2"+
		"\u011c\u011d\7G\2\2\u011d\u011e\7T\2\2\u011e&\3\2\2\2\u011f\u0120\7V\2"+
		"\2\u0120\u0121\7C\2\2\u0121\u0122\7D\2\2\u0122\u0123\7N\2\2\u0123\u0124"+
		"\7G\2\2\u0124(\3\2\2\2\u0125\u0126\7F\2\2\u0126\u0127\7G\2\2\u0127\u0128"+
		"\7E\2\2\u0128\u0129\7K\2\2\u0129\u012a\7O\2\2\u012a\u012b\7C\2\2\u012b"+
		"\u012c\7N\2\2\u012c*\3\2\2\2\u012d\u012e\7E\2\2\u012e\u012f\7J\2\2\u012f"+
		"\u0130\7C\2\2\u0130\u0131\7T\2\2\u0131,\3\2\2\2\u0132\u0133\7N\2\2\u0133"+
		"\u0134\7Q\2\2\u0134\u0135\7P\2\2\u0135\u0136\7I\2\2\u0136\u0137\7V\2\2"+
		"\u0137\u0138\7G\2\2\u0138\u0139\7Z\2\2\u0139\u013a\7V\2\2\u013a.\3\2\2"+
		"\2\u013b\u013c\7B\2\2\u013c\60\3\2\2\2\u013d\u013e\7F\2\2\u013e\u013f"+
		"\7G\2\2\u013f\u0140\7U\2\2\u0140\u0141\7E\2\2\u0141\62\3\2\2\2\u0142\u0143"+
		"\7C\2\2\u0143\u0144\7W\2\2\u0144\u0145\7V\2\2\u0145\u0146\7Q\2\2\u0146"+
		"\u0147\7a\2\2\u0147\u0148\7K\2\2\u0148\u0149\7P\2\2\u0149\u014a\7E\2\2"+
		"\u014a\u014b\7T\2\2\u014b\u014c\7G\2\2\u014c\u014d\7O\2\2\u014d\u014e"+
		"\7G\2\2\u014e\u014f\7P\2\2\u014f\u0150\7V\2\2\u0150\64\3\2\2\2\u0151\u0152"+
		"\7?\2\2\u0152\66\3\2\2\2\u0153\u0154\7E\2\2\u0154\u0155\7C\2\2\u0155\u0156"+
		"\7U\2\2\u0156\u0157\7E\2\2\u0157\u0158\7C\2\2\u0158\u0159\7F\2\2\u0159"+
		"\u015a\7G\2\2\u015a8\3\2\2\2\u015b\u015c\7V\2\2\u015c\u015d\7K\2\2\u015d"+
		"\u015e\7P\2\2\u015e\u015f\7[\2\2\u015f\u0160\7K\2\2\u0160\u0161\7P\2\2"+
		"\u0161\u0162\7V\2\2\u0162:\3\2\2\2\u0163\u0164\7F\2\2\u0164\u0165\7C\2"+
		"\2\u0165\u0166\7V\2\2\u0166\u0167\7G\2\2\u0167\u0168\7V\2\2\u0168\u0169"+
		"\7K\2\2\u0169\u016a\7O\2\2\u016a\u016b\7G\2\2\u016b<\3\2\2\2\u016c\u016d"+
		"\7T\2\2\u016d\u016e\7G\2\2\u016e\u016f\7H\2\2\u016f\u0170\7G\2\2\u0170"+
		"\u0171\7T\2\2\u0171\u0172\7G\2\2\u0172\u0173\7P\2\2\u0173\u0174\7E\2\2"+
		"\u0174\u0175\7G\2\2\u0175\u0176\7U\2\2\u0176>\3\2\2\2\u0177\u0178\7H\2"+
		"\2\u0178\u0179\7N\2\2\u0179\u017a\7Q\2\2\u017a\u017b\7C\2\2\u017b\u017c"+
		"\7V\2\2\u017c@\3\2\2\2\u017d\u017e\7F\2\2\u017e\u017f\7T\2\2\u017f\u0180"+
		"\7Q\2\2\u0180\u0181\7R\2\2\u0181B\3\2\2\2\u0182\u0183\7W\2\2\u0183\u0184"+
		"\7U\2\2\u0184\u0185\7G\2\2\u0185D\3\2\2\2\u0186\u0187\7V\2\2\u0187\u0188"+
		"\7G\2\2\u0188\u0189\7Z\2\2\u0189\u018a\7V\2\2\u018aF\3\2\2\2\u018b\u018c"+
		"\7P\2\2\u018c\u018d\7Q\2\2\u018d\u018e\7V\2\2\u018eH\3\2\2\2\u018f\u0190"+
		"\7K\2\2\u0190\u0191\7P\2\2\u0191\u0192\7V\2\2\u0192J\3\2\2\2\u0193\u0194"+
		"\7X\2\2\u0194\u0195\7C\2\2\u0195\u0196\7T\2\2\u0196\u0197\7D\2\2\u0197"+
		"\u0198\7K\2\2\u0198\u0199\7P\2\2\u0199\u019a\7C\2\2\u019a\u019b\7T\2\2"+
		"\u019b\u019c\7[\2\2\u019cL\3\2\2\2\u019d\u019e\7K\2\2\u019e\u019f\7P\2"+
		"\2\u019f\u01a0\7V\2\2\u01a0\u01a1\7G\2\2\u01a1\u01a2\7I\2\2\u01a2\u01a3"+
		"\7G\2\2\u01a3\u01a4\7T\2\2\u01a4N\3\2\2\2\u01a5\u01a6\7V\2\2\u01a6\u01a7"+
		"\7G\2\2\u01a7\u01a8\7O\2\2\u01a8\u01a9\7R\2\2\u01a9\u01aa\7Q\2\2\u01aa"+
		"\u01ab\7T\2\2\u01ab\u01ac\7C\2\2\u01ac\u01ad\7T\2\2\u01ad\u01ae\7[\2\2"+
		"\u01aeP\3\2\2\2\u01af\u01b0\7G\2\2\u01b0\u01b1\7Z\2\2\u01b1\u01b2\7K\2"+
		"\2\u01b2\u01b3\7U\2\2\u01b3\u01b4\7V\2\2\u01b4\u01b5\7U\2\2\u01b5R\3\2"+
		"\2\2\u01b6\u01b7\7.\2\2\u01b7T\3\2\2\2\u01b8\u01b9\7C\2\2\u01b9\u01ba"+
		"\7U\2\2\u01ba\u01bb\7E\2\2\u01bbV\3\2\2\2\u01bc\u01bd\7P\2\2\u01bd\u01be"+
		"\7W\2\2\u01be\u01bf\7O\2\2\u01bf\u01c0\7G\2\2\u01c0\u01c1\7T\2\2\u01c1"+
		"\u01c2\7K\2\2\u01c2\u01c3\7E\2\2\u01c3X\3\2\2\2\u01c4\u01c5\7*\2\2\u01c5"+
		"Z\3\2\2\2\u01c6\u01c7\7H\2\2\u01c7\u01c8\7Q\2\2\u01c8\u01c9\7T\2\2\u01c9"+
		"\u01ca\7G\2\2\u01ca\u01cb\7K\2\2\u01cb\u01cc\7I\2\2\u01cc\u01cd\7P\2\2"+
		"\u01cd\\\3\2\2\2\u01ce\u01cf\7V\2\2\u01cf\u01d0\7K\2\2\u01d0\u01d1\7O"+
		"\2\2\u01d1\u01d2\7G\2\2\u01d2^\3\2\2\2\u01d3\u01d4\7C\2\2\u01d4\u01d5"+
		"\7E\2\2\u01d5\u01d6\7V\2\2\u01d6\u01d7\7K\2\2\u01d7\u01d8\7Q\2\2\u01d8"+
		"\u01d9\7P\2\2\u01d9`\3\2\2\2\u01da\u01db\7)\2\2\u01dbb\3\2\2\2\u01dc\u01dd"+
		"\7E\2\2\u01dd\u01de\7Q\2\2\u01de\u01df\7N\2\2\u01df\u01e0\7N\2\2\u01e0"+
		"\u01e1\7C\2\2\u01e1\u01e2\7V\2\2\u01e2\u01e3\7G\2\2\u01e3d\3\2\2\2\u01e4"+
		"\u01e5\7O\2\2\u01e5\u01e6\7G\2\2\u01e6\u01e7\7F\2\2\u01e7\u01e8\7K\2\2"+
		"\u01e8\u01e9\7W\2\2\u01e9\u01ea\7O\2\2\u01ea\u01eb\7D\2\2\u01eb\u01ec"+
		"\7N\2\2\u01ec\u01ed\7Q\2\2\u01ed\u01ee\7D\2\2\u01eef\3\2\2\2\u01ef\u01f0"+
		"\7V\2\2\u01f0\u01f1\7K\2\2\u01f1\u01f2\7P\2\2\u01f2\u01f3\7[\2\2\u01f3"+
		"\u01f4\7V\2\2\u01f4\u01f5\7G\2\2\u01f5\u01f6\7Z\2\2\u01f6\u01f7\7V\2\2"+
		"\u01f7h\3\2\2\2\u01f8\u01f9\7D\2\2\u01f9\u01fa\7K\2\2\u01fa\u01fb\7I\2"+
		"\2\u01fb\u01fc\7K\2\2\u01fc\u01fd\7P\2\2\u01fd\u01fe\7V\2\2\u01fej\3\2"+
		"\2\2\u01ff\u0200\7F\2\2\u0200\u0201\7C\2\2\u0201\u0202\7V\2\2\u0202\u0203"+
		"\7G\2\2\u0203l\3\2\2\2\u0204\u0205\7F\2\2\u0205\u0206\7G\2\2\u0206\u0207"+
		"\7H\2\2\u0207\u0208\7C\2\2\u0208\u0209\7W\2\2\u0209\u020a\7N\2\2\u020a"+
		"\u020b\7V\2\2\u020bn\3\2\2\2\u020c\u020d\7\\\2\2\u020d\u020e\7G\2\2\u020e"+
		"\u020f\7T\2\2\u020f\u0210\7Q\2\2\u0210\u0211\7H\2\2\u0211\u0212\7K\2\2"+
		"\u0212\u0213\7N\2\2\u0213\u0214\7N\2\2\u0214p\3\2\2\2\u0215\u0216\7D\2"+
		"\2\u0216\u0217\7N\2\2\u0217\u0218\7Q\2\2\u0218\u0219\7D\2\2\u0219r\3\2"+
		"\2\2\u021a\u021b\7X\2\2\u021b\u021c\7C\2\2\u021c\u021d\7T\2\2\u021d\u021e"+
		"\7E\2\2\u021e\u021f\7J\2\2\u021f\u0220\7C\2\2\u0220\u0221\7T\2\2\u0221"+
		"t\3\2\2\2\u0222\u0223\7P\2\2\u0223\u0224\7Q\2\2\u0224v\3\2\2\2\u0225\u0226"+
		"\7D\2\2\u0226\u0227\7K\2\2\u0227\u0228\7V\2\2\u0228x\3\2\2\2\u0229\u022a"+
		"\7P\2\2\u022a\u022b\7W\2\2\u022b\u022c\7N\2\2\u022c\u022d\7N\2\2\u022d"+
		"z\3\2\2\2\u022e\u022f\7W\2\2\u022f\u0230\7R\2\2\u0230\u0231\7F\2\2\u0231"+
		"\u0232\7C\2\2\u0232\u0233\7V\2\2\u0233\u0234\7G\2\2\u0234|\3\2\2\2\u0235"+
		"\u0236\7U\2\2\u0236\u0237\7E\2\2\u0237\u0238\7J\2\2\u0238\u0239\7G\2\2"+
		"\u0239\u023a\7O\2\2\u023a\u023b\7C\2\2\u023b~\3\2\2\2\u023c\u023d\7G\2"+
		"\2\u023d\u023e\7P\2\2\u023e\u023f\7W\2\2\u023f\u0240\7O\2\2\u0240\u0080"+
		"\3\2\2\2\u0241\u0242\7U\2\2\u0242\u0243\7O\2\2\u0243\u0244\7C\2\2\u0244"+
		"\u0245\7N\2\2\u0245\u0246\7N\2\2\u0246\u0247\7K\2\2\u0247\u0248\7P\2\2"+
		"\u0248\u0249\7V\2\2\u0249\u0082\3\2\2\2\u024a\u024b\7=\2\2\u024b\u0084"+
		"\3\2\2\2\u024c\u024d\7M\2\2\u024d\u024e\7G\2\2\u024e\u024f\7[\2\2\u024f"+
		"\u0086\3\2\2\2\u0250\u0251\7E\2\2\u0251\u0252\7T\2\2\u0252\u0253\7G\2"+
		"\2\u0253\u0254\7C\2\2\u0254\u0255\7V\2\2\u0255\u0256\7G\2\2\u0256\u0088"+
		"\3\2\2\2\u0257\u0258\7Q\2\2\u0258\u0259\7P\2\2\u0259\u008a\3\2\2\2\u025a"+
		"\u025b\7F\2\2\u025b\u025c\7Q\2\2\u025c\u025d\7W\2\2\u025d\u025e\7D\2\2"+
		"\u025e\u025f\7N\2\2\u025f\u0260\7G\2\2\u0260\u008c\3\2\2\2\u0261\u0262"+
		"\7T\2\2\u0262\u0263\7G\2\2\u0263\u0264\7C\2\2\u0264\u0265\7N\2\2\u0265"+
		"\u008e\3\2\2\2\u0266\u0267\7O\2\2\u0267\u0268\7G\2\2\u0268\u0269\7F\2"+
		"\2\u0269\u026a\7K\2\2\u026a\u026b\7W\2\2\u026b\u026c\7O\2\2\u026c\u026d"+
		"\7V\2\2\u026d\u026e\7G\2\2\u026e\u026f\7Z\2\2\u026f\u0270\7V\2\2\u0270"+
		"\u0090\3\2\2\2\u0271\u0272\7W\2\2\u0272\u0273\7P\2\2\u0273\u0274\7K\2"+
		"\2\u0274\u0275\7S\2\2\u0275\u0276\7W\2\2\u0276\u0277\7G\2\2\u0277\u0092"+
		"\3\2\2\2\u0278\u0279\7F\2\2\u0279\u027a\7C\2\2\u027a\u027b\7V\2\2\u027b"+
		"\u027c\7C\2\2\u027c\u027d\7D\2\2\u027d\u027e\7C\2\2\u027e\u027f\7U\2\2"+
		"\u027f\u0280\7G\2\2\u0280\u0094\3\2\2\2\u0281\u0282\7T\2\2\u0282\u0283"+
		"\7G\2\2\u0283\u0284\7U\2\2\u0284\u0285\7V\2\2\u0285\u0286\7T\2\2\u0286"+
		"\u0287\7K\2\2\u0287\u0288\7E\2\2\u0288\u0289\7V\2\2\u0289\u0096\3\2\2"+
		"\2\u028a\u028e\t\2\2\2\u028b\u028d\t\3\2\2\u028c\u028b\3\2\2\2\u028d\u0290"+
		"\3\2\2\2\u028e\u028c\3\2\2\2\u028e\u028f\3\2\2\2\u028f\u0098\3\2\2\2\u0290"+
		"\u028e\3\2\2\2\u0291\u0293\t\4\2\2\u0292\u0291\3\2\2\2\u0293\u0294\3\2"+
		"\2\2\u0294\u0292\3\2\2\2\u0294\u0295\3\2\2\2\u0295\u009a\3\2\2\2\u0296"+
		"\u0298\t\4\2\2\u0297\u0296\3\2\2\2\u0298\u029b\3\2\2\2\u0299\u0297\3\2"+
		"\2\2\u0299\u029a\3\2\2\2\u029a\u029c\3\2\2\2\u029b\u0299\3\2\2\2\u029c"+
		"\u029e\7\60\2\2\u029d\u029f\t\4\2\2\u029e\u029d\3\2\2\2\u029f\u02a0\3"+
		"\2\2\2\u02a0\u029e\3\2\2\2\u02a0\u02a1\3\2\2\2\u02a1\u009c\3\2\2\2\u02a2"+
		"\u02a6\7)\2\2\u02a3\u02a5\13\2\2\2\u02a4\u02a3\3\2\2\2\u02a5\u02a8\3\2"+
		"\2\2\u02a6\u02a7\3\2\2\2\u02a6\u02a4\3\2\2\2\u02a7\u02a9\3\2\2\2\u02a8"+
		"\u02a6\3\2\2\2\u02a9\u02b3\7)\2\2\u02aa\u02ae\7$\2\2\u02ab\u02ad\13\2"+
		"\2\2\u02ac\u02ab\3\2\2\2\u02ad\u02b0\3\2\2\2\u02ae\u02af\3\2\2\2\u02ae"+
		"\u02ac\3\2\2\2\u02af\u02b1\3\2\2\2\u02b0\u02ae\3\2\2\2\u02b1\u02b3\7$"+
		"\2\2\u02b2\u02a2\3\2\2\2\u02b2\u02aa\3\2\2\2\u02b3\u009e\3\2\2\2\u02b4"+
		"\u02b5\7\61\2\2\u02b5\u02b6\7,\2\2\u02b6\u02ba\3\2\2\2\u02b7\u02b9\13"+
		"\2\2\2\u02b8\u02b7\3\2\2\2\u02b9\u02bc\3\2\2\2\u02ba\u02bb\3\2\2\2\u02ba"+
		"\u02b8\3\2\2\2\u02bb\u02bd\3\2\2\2\u02bc\u02ba\3\2\2\2\u02bd\u02be\7,"+
		"\2\2\u02be\u02bf\7\61\2\2\u02bf\u02c0\3\2\2\2\u02c0\u02c1\bP\2\2\u02c1"+
		"\u00a0\3\2\2\2\u02c2\u02c3\7/\2\2\u02c3\u02c4\7/\2\2\u02c4\u02c8\3\2\2"+
		"\2\u02c5\u02c7\n\5\2\2\u02c6\u02c5\3\2\2\2\u02c7\u02ca\3\2\2\2\u02c8\u02c6"+
		"\3\2\2\2\u02c8\u02c9\3\2\2\2\u02c9\u02cb\3\2\2\2\u02ca\u02c8\3\2\2\2\u02cb"+
		"\u02cc\bQ\3\2\u02cc\u00a2\3\2\2\2\u02cd\u02cf\t\6\2\2\u02ce\u02cd\3\2"+
		"\2\2\u02cf\u02d0\3\2\2\2\u02d0\u02ce\3\2\2\2\u02d0\u02d1\3\2\2\2\u02d1"+
		"\u02d2\3\2\2\2\u02d2\u02d3\bR\4\2\u02d3\u00a4\3\2\2\2\r\2\u028e\u0294"+
		"\u0299\u02a0\u02a6\u02ae\u02b2\u02ba\u02c8\u02d0";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}