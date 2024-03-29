// Generated from /home/mazinsw/Development/SQLtoClass/src/parser/SQLLexer.g4 by ANTLR 4.8
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"BOOL", "K_DROP", "K_DATABASE", "K_SCHEMA", "K_IF", "K_EXISTS", "K_NOT", 
			"K_DEFAULT", "K_CHARACTER", "K_SET", "K_COLLATE", "K_USE", "K_TEMPORARY", 
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
			"WS", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", 
			"N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"
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


	public SQLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SQLLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2[\u0379\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\3\2\3\2\5\2\u00ec"+
		"\n\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r"+
		"\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3 "+
		"\3 \3 \3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3"+
		"&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3)\3"+
		")\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3,\3,\3,\3,\3"+
		",\3,\3,\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3"+
		"/\3/\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\38\38\38\38\3"+
		"8\38\38\38\39\39\39\39\39\39\39\39\39\39\3:\3:\3:\3:\3:\3:\3:\3:\3:\3"+
		";\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3=\3=\3=\3=\3=\3=\3=\3"+
		"=\3=\3>\3>\3>\3>\3>\3?\3?\3?\3?\3?\3?\3?\3?\3?\3@\3@\3@\3@\3@\3A\3A\3"+
		"A\3A\3A\3A\3A\3A\3A\3A\3A\3B\3B\3B\3B\3B\3B\3B\3B\3B\3C\3C\3C\3C\3C\3"+
		"D\3D\3D\3E\3E\3E\3E\3E\3E\3E\3F\3F\3F\3F\3F\3F\3F\3G\3G\3G\3G\3G\3G\3"+
		"H\3H\3H\3H\3H\3I\3I\3J\3J\3K\3K\3L\3L\3M\3M\3N\3N\3O\3O\3P\3P\3Q\3Q\3"+
		"R\3R\3S\3S\3S\3S\3T\3T\7T\u02f8\nT\fT\16T\u02fb\13T\3U\6U\u02fe\nU\rU"+
		"\16U\u02ff\3V\7V\u0303\nV\fV\16V\u0306\13V\3V\3V\6V\u030a\nV\rV\16V\u030b"+
		"\3W\3W\3W\3W\7W\u0312\nW\fW\16W\u0315\13W\3W\3W\3W\3W\3W\7W\u031c\nW\f"+
		"W\16W\u031f\13W\3W\5W\u0322\nW\3X\3X\3X\3X\7X\u0328\nX\fX\16X\u032b\13"+
		"X\3X\3X\3X\5X\u0330\nX\3X\3X\3Y\3Y\3Y\3Y\7Y\u0338\nY\fY\16Y\u033b\13Y"+
		"\3Y\3Y\3Z\6Z\u0340\nZ\rZ\16Z\u0341\3Z\3Z\3[\3[\3\\\3\\\3]\3]\3^\3^\3_"+
		"\3_\3`\3`\3a\3a\3b\3b\3c\3c\3d\3d\3e\3e\3f\3f\3g\3g\3h\3h\3i\3i\3j\3j"+
		"\3k\3k\3l\3l\3m\3m\3n\3n\3o\3o\3p\3p\3q\3q\3r\3r\3s\3s\3t\3t\3\u0329\2"+
		"u\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37"+
		"= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o"+
		"9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH"+
		"\u008fI\u0091J\u0093K\u0095L\u0097M\u0099N\u009bO\u009dP\u009fQ\u00a1"+
		"R\u00a3S\u00a5T\u00a7U\u00a9V\u00abW\u00adX\u00afY\u00b1Z\u00b3[\u00b5"+
		"\2\u00b7\2\u00b9\2\u00bb\2\u00bd\2\u00bf\2\u00c1\2\u00c3\2\u00c5\2\u00c7"+
		"\2\u00c9\2\u00cb\2\u00cd\2\u00cf\2\u00d1\2\u00d3\2\u00d5\2\u00d7\2\u00d9"+
		"\2\u00db\2\u00dd\2\u00df\2\u00e1\2\u00e3\2\u00e5\2\u00e7\2\3\2%\5\2C\\"+
		"aac|\7\2\60\60\62;C\\aac|\3\2\62;\4\2))^^\b\2$$))^^ppttvv\4\2$$^^\7\2"+
		"$$))^^pptt\4\2\f\f\17\17\5\2\13\f\17\17\"\"\4\2CCcc\4\2DDdd\4\2EEee\4"+
		"\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNn"+
		"n\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2"+
		"WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\2\u036c\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"+
		"\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2"+
		"\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2"+
		"\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K"+
		"\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2"+
		"\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2"+
		"\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q"+
		"\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2"+
		"\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087"+
		"\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2"+
		"\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099"+
		"\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2"+
		"\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9\3\2\2\2\2\u00ab"+
		"\3\2\2\2\2\u00ad\3\2\2\2\2\u00af\3\2\2\2\2\u00b1\3\2\2\2\2\u00b3\3\2\2"+
		"\2\3\u00eb\3\2\2\2\5\u00ed\3\2\2\2\7\u00f2\3\2\2\2\t\u00fb\3\2\2\2\13"+
		"\u0102\3\2\2\2\r\u0105\3\2\2\2\17\u010c\3\2\2\2\21\u0110\3\2\2\2\23\u0118"+
		"\3\2\2\2\25\u0122\3\2\2\2\27\u0126\3\2\2\2\31\u012e\3\2\2\2\33\u0132\3"+
		"\2\2\2\35\u013c\3\2\2\2\37\u0142\3\2\2\2!\u014b\3\2\2\2#\u0153\3\2\2\2"+
		"%\u015e\3\2\2\2\'\u0166\3\2\2\2)\u016a\3\2\2\2+\u0170\3\2\2\2-\u0177\3"+
		"\2\2\2/\u017f\3\2\2\2\61\u0187\3\2\2\2\63\u0196\3\2\2\2\65\u019b\3\2\2"+
		"\2\67\u01a6\3\2\2\29\u01a9\3\2\2\2;\u01b0\3\2\2\2=\u01b7\3\2\2\2?\u01bb"+
		"\3\2\2\2A\u01c0\3\2\2\2C\u01c4\3\2\2\2E\u01cc\3\2\2\2G\u01d5\3\2\2\2I"+
		"\u01dc\3\2\2\2K\u01e5\3\2\2\2M\u01ee\3\2\2\2O\u01f8\3\2\2\2Q\u01fc\3\2"+
		"\2\2S\u0204\3\2\2\2U\u020b\3\2\2\2W\u0210\3\2\2\2Y\u0217\3\2\2\2[\u021d"+
		"\3\2\2\2]\u0225\3\2\2\2_\u022d\3\2\2\2a\u0232\3\2\2\2c\u023a\3\2\2\2e"+
		"\u023f\3\2\2\2g\u0244\3\2\2\2i\u024e\3\2\2\2k\u0257\3\2\2\2m\u025c\3\2"+
		"\2\2o\u0261\3\2\2\2q\u0269\3\2\2\2s\u0273\3\2\2\2u\u027c\3\2\2\2w\u0281"+
		"\3\2\2\2y\u028c\3\2\2\2{\u0295\3\2\2\2}\u029a\3\2\2\2\177\u02a3\3\2\2"+
		"\2\u0081\u02a8\3\2\2\2\u0083\u02b3\3\2\2\2\u0085\u02bc\3\2\2\2\u0087\u02c1"+
		"\3\2\2\2\u0089\u02c4\3\2\2\2\u008b\u02cb\3\2\2\2\u008d\u02d2\3\2\2\2\u008f"+
		"\u02d8\3\2\2\2\u0091\u02dd\3\2\2\2\u0093\u02df\3\2\2\2\u0095\u02e1\3\2"+
		"\2\2\u0097\u02e3\3\2\2\2\u0099\u02e5\3\2\2\2\u009b\u02e7\3\2\2\2\u009d"+
		"\u02e9\3\2\2\2\u009f\u02eb\3\2\2\2\u00a1\u02ed\3\2\2\2\u00a3\u02ef\3\2"+
		"\2\2\u00a5\u02f1\3\2\2\2\u00a7\u02f5\3\2\2\2\u00a9\u02fd\3\2\2\2\u00ab"+
		"\u0304\3\2\2\2\u00ad\u0321\3\2\2\2\u00af\u0323\3\2\2\2\u00b1\u0333\3\2"+
		"\2\2\u00b3\u033f\3\2\2\2\u00b5\u0345\3\2\2\2\u00b7\u0347\3\2\2\2\u00b9"+
		"\u0349\3\2\2\2\u00bb\u034b\3\2\2\2\u00bd\u034d\3\2\2\2\u00bf\u034f\3\2"+
		"\2\2\u00c1\u0351\3\2\2\2\u00c3\u0353\3\2\2\2\u00c5\u0355\3\2\2\2\u00c7"+
		"\u0357\3\2\2\2\u00c9\u0359\3\2\2\2\u00cb\u035b\3\2\2\2\u00cd\u035d\3\2"+
		"\2\2\u00cf\u035f\3\2\2\2\u00d1\u0361\3\2\2\2\u00d3\u0363\3\2\2\2\u00d5"+
		"\u0365\3\2\2\2\u00d7\u0367\3\2\2\2\u00d9\u0369\3\2\2\2\u00db\u036b\3\2"+
		"\2\2\u00dd\u036d\3\2\2\2\u00df\u036f\3\2\2\2\u00e1\u0371\3\2\2\2\u00e3"+
		"\u0373\3\2\2\2\u00e5\u0375\3\2\2\2\u00e7\u0377\3\2\2\2\u00e9\u00ec\5\u008d"+
		"G\2\u00ea\u00ec\5\u008fH\2\u00eb\u00e9\3\2\2\2\u00eb\u00ea\3\2\2\2\u00ec"+
		"\4\3\2\2\2\u00ed\u00ee\5\u00bb^\2\u00ee\u00ef\5\u00d7l\2\u00ef\u00f0\5"+
		"\u00d1i\2\u00f0\u00f1\5\u00d3j\2\u00f1\6\3\2\2\2\u00f2\u00f3\5\u00bb^"+
		"\2\u00f3\u00f4\5\u00b5[\2\u00f4\u00f5\5\u00dbn\2\u00f5\u00f6\5\u00b5["+
		"\2\u00f6\u00f7\5\u00b7\\\2\u00f7\u00f8\5\u00b5[\2\u00f8\u00f9\5\u00d9"+
		"m\2\u00f9\u00fa\5\u00bd_\2\u00fa\b\3\2\2\2\u00fb\u00fc\5\u00d9m\2\u00fc"+
		"\u00fd\5\u00b9]\2\u00fd\u00fe\5\u00c3b\2\u00fe\u00ff\5\u00bd_\2\u00ff"+
		"\u0100\5\u00cdg\2\u0100\u0101\5\u00b5[\2\u0101\n\3\2\2\2\u0102\u0103\5"+
		"\u00c5c\2\u0103\u0104\5\u00bf`\2\u0104\f\3\2\2\2\u0105\u0106\5\u00bd_"+
		"\2\u0106\u0107\5\u00e3r\2\u0107\u0108\5\u00c5c\2\u0108\u0109\5\u00d9m"+
		"\2\u0109\u010a\5\u00dbn\2\u010a\u010b\5\u00d9m\2\u010b\16\3\2\2\2\u010c"+
		"\u010d\5\u00cfh\2\u010d\u010e\5\u00d1i\2\u010e\u010f\5\u00dbn\2\u010f"+
		"\20\3\2\2\2\u0110\u0111\5\u00bb^\2\u0111\u0112\5\u00bd_\2\u0112\u0113"+
		"\5\u00bf`\2\u0113\u0114\5\u00b5[\2\u0114\u0115\5\u00ddo\2\u0115\u0116"+
		"\5\u00cbf\2\u0116\u0117\5\u00dbn\2\u0117\22\3\2\2\2\u0118\u0119\5\u00b9"+
		"]\2\u0119\u011a\5\u00c3b\2\u011a\u011b\5\u00b5[\2\u011b\u011c\5\u00d7"+
		"l\2\u011c\u011d\5\u00b5[\2\u011d\u011e\5\u00b9]\2\u011e\u011f\5\u00db"+
		"n\2\u011f\u0120\5\u00bd_\2\u0120\u0121\5\u00d7l\2\u0121\24\3\2\2\2\u0122"+
		"\u0123\5\u00d9m\2\u0123\u0124\5\u00bd_\2\u0124\u0125\5\u00dbn\2\u0125"+
		"\26\3\2\2\2\u0126\u0127\5\u00b9]\2\u0127\u0128\5\u00d1i\2\u0128\u0129"+
		"\5\u00cbf\2\u0129\u012a\5\u00cbf\2\u012a\u012b\5\u00b5[\2\u012b\u012c"+
		"\5\u00dbn\2\u012c\u012d\5\u00bd_\2\u012d\30\3\2\2\2\u012e\u012f\5\u00dd"+
		"o\2\u012f\u0130\5\u00d9m\2\u0130\u0131\5\u00bd_\2\u0131\32\3\2\2\2\u0132"+
		"\u0133\5\u00dbn\2\u0133\u0134\5\u00bd_\2\u0134\u0135\5\u00cdg\2\u0135"+
		"\u0136\5\u00d3j\2\u0136\u0137\5\u00d1i\2\u0137\u0138\5\u00d7l\2\u0138"+
		"\u0139\5\u00b5[\2\u0139\u013a\5\u00d7l\2\u013a\u013b\5\u00e5s\2\u013b"+
		"\34\3\2\2\2\u013c\u013d\5\u00dbn\2\u013d\u013e\5\u00b5[\2\u013e\u013f"+
		"\5\u00b7\\\2\u013f\u0140\5\u00cbf\2\u0140\u0141\5\u00bd_\2\u0141\36\3"+
		"\2\2\2\u0142\u0143\5\u00d7l\2\u0143\u0144\5\u00bd_\2\u0144\u0145\5\u00d9"+
		"m\2\u0145\u0146\5\u00dbn\2\u0146\u0147\5\u00d7l\2\u0147\u0148\5\u00c5"+
		"c\2\u0148\u0149\5\u00b9]\2\u0149\u014a\5\u00dbn\2\u014a \3\2\2\2\u014b"+
		"\u014c\5\u00b9]\2\u014c\u014d\5\u00b5[\2\u014d\u014e\5\u00d9m\2\u014e"+
		"\u014f\5\u00b9]\2\u014f\u0150\5\u00b5[\2\u0150\u0151\5\u00bb^\2\u0151"+
		"\u0152\5\u00bd_\2\u0152\"\3\2\2\2\u0153\u0154\5\u00b9]\2\u0154\u0155\5"+
		"\u00d1i\2\u0155\u0156\5\u00cfh\2\u0156\u0157\5\u00d9m\2\u0157\u0158\5"+
		"\u00dbn\2\u0158\u0159\5\u00d7l\2\u0159\u015a\5\u00b5[\2\u015a\u015b\5"+
		"\u00c5c\2\u015b\u015c\5\u00cfh\2\u015c\u015d\5\u00dbn\2\u015d$\3\2\2\2"+
		"\u015e\u015f\5\u00d3j\2\u015f\u0160\5\u00d7l\2\u0160\u0161\5\u00c5c\2"+
		"\u0161\u0162\5\u00cdg\2\u0162\u0163\5\u00b5[\2\u0163\u0164\5\u00d7l\2"+
		"\u0164\u0165\5\u00e5s\2\u0165&\3\2\2\2\u0166\u0167\5\u00c9e\2\u0167\u0168"+
		"\5\u00bd_\2\u0168\u0169\5\u00e5s\2\u0169(\3\2\2\2\u016a\u016b\5\u00c5"+
		"c\2\u016b\u016c\5\u00cfh\2\u016c\u016d\5\u00bb^\2\u016d\u016e\5\u00bd"+
		"_\2\u016e\u016f\5\u00e3r\2\u016f*\3\2\2\2\u0170\u0171\5\u00ddo\2\u0171"+
		"\u0172\5\u00cfh\2\u0172\u0173\5\u00c5c\2\u0173\u0174\5\u00d5k\2\u0174"+
		"\u0175\5\u00ddo\2\u0175\u0176\5\u00bd_\2\u0176,\3\2\2\2\u0177\u0178\5"+
		"\u00bf`\2\u0178\u0179\5\u00d1i\2\u0179\u017a\5\u00d7l\2\u017a\u017b\5"+
		"\u00bd_\2\u017b\u017c\5\u00c5c\2\u017c\u017d\5\u00c1a\2\u017d\u017e\5"+
		"\u00cfh\2\u017e.\3\2\2\2\u017f\u0180\5\u00b9]\2\u0180\u0181\5\u00d1i\2"+
		"\u0181\u0182\5\u00cdg\2\u0182\u0183\5\u00cdg\2\u0183\u0184\5\u00bd_\2"+
		"\u0184\u0185\5\u00cfh\2\u0185\u0186\5\u00dbn\2\u0186\60\3\2\2\2\u0187"+
		"\u0188\5\u00b5[\2\u0188\u0189\5\u00ddo\2\u0189\u018a\5\u00dbn\2\u018a"+
		"\u018b\5\u00d1i\2\u018b\u018c\7a\2\2\u018c\u018d\5\u00c5c\2\u018d\u018e"+
		"\5\u00cfh\2\u018e\u018f\5\u00b9]\2\u018f\u0190\5\u00d7l\2\u0190\u0191"+
		"\5\u00bd_\2\u0191\u0192\5\u00cdg\2\u0192\u0193\5\u00bd_\2\u0193\u0194"+
		"\5\u00cfh\2\u0194\u0195\5\u00dbn\2\u0195\62\3\2\2\2\u0196\u0197\5\u00cf"+
		"h\2\u0197\u0198\5\u00ddo\2\u0198\u0199\5\u00cbf\2\u0199\u019a\5\u00cb"+
		"f\2\u019a\64\3\2\2\2\u019b\u019c\5\u00d7l\2\u019c\u019d\5\u00bd_\2\u019d"+
		"\u019e\5\u00bf`\2\u019e\u019f\5\u00bd_\2\u019f\u01a0\5\u00d7l\2\u01a0"+
		"\u01a1\5\u00bd_\2\u01a1\u01a2\5\u00cfh\2\u01a2\u01a3\5\u00b9]\2\u01a3"+
		"\u01a4\5\u00bd_\2\u01a4\u01a5\5\u00d9m\2\u01a5\66\3\2\2\2\u01a6\u01a7"+
		"\5\u00d1i\2\u01a7\u01a8\5\u00cfh\2\u01a88\3\2\2\2\u01a9\u01aa\5\u00bb"+
		"^\2\u01aa\u01ab\5\u00bd_\2\u01ab\u01ac\5\u00cbf\2\u01ac\u01ad\5\u00bd"+
		"_\2\u01ad\u01ae\5\u00dbn\2\u01ae\u01af\5\u00bd_\2\u01af:\3\2\2\2\u01b0"+
		"\u01b1\5\u00ddo\2\u01b1\u01b2\5\u00d3j\2\u01b2\u01b3\5\u00bb^\2\u01b3"+
		"\u01b4\5\u00b5[\2\u01b4\u01b5\5\u00dbn\2\u01b5\u01b6\5\u00bd_\2\u01b6"+
		"<\3\2\2\2\u01b7\u01b8\5\u00b5[\2\u01b8\u01b9\5\u00d9m\2\u01b9\u01ba\5"+
		"\u00b9]\2\u01ba>\3\2\2\2\u01bb\u01bc\5\u00bb^\2\u01bc\u01bd\5\u00bd_\2"+
		"\u01bd\u01be\5\u00d9m\2\u01be\u01bf\5\u00b9]\2\u01bf@\3\2\2\2\u01c0\u01c1"+
		"\5\u00b7\\\2\u01c1\u01c2\5\u00c5c\2\u01c2\u01c3\5\u00dbn\2\u01c3B\3\2"+
		"\2\2\u01c4\u01c5\5\u00dbn\2\u01c5\u01c6\5\u00c5c\2\u01c6\u01c7\5\u00cf"+
		"h\2\u01c7\u01c8\5\u00e5s\2\u01c8\u01c9\5\u00c5c\2\u01c9\u01ca\5\u00cf"+
		"h\2\u01ca\u01cb\5\u00dbn\2\u01cbD\3\2\2\2\u01cc\u01cd\5\u00ddo\2\u01cd"+
		"\u01ce\5\u00cfh\2\u01ce\u01cf\5\u00d9m\2\u01cf\u01d0\5\u00c5c\2\u01d0"+
		"\u01d1\5\u00c1a\2\u01d1\u01d2\5\u00cfh\2\u01d2\u01d3\5\u00bd_\2\u01d3"+
		"\u01d4\5\u00bb^\2\u01d4F\3\2\2\2\u01d5\u01d6\5\u00b7\\\2\u01d6\u01d7\5"+
		"\u00c5c\2\u01d7\u01d8\5\u00cfh\2\u01d8\u01d9\5\u00b5[\2\u01d9\u01da\5"+
		"\u00d7l\2\u01da\u01db\5\u00e5s\2\u01dbH\3\2\2\2\u01dc\u01dd\5\u00e7t\2"+
		"\u01dd\u01de\5\u00bd_\2\u01de\u01df\5\u00d7l\2\u01df\u01e0\5\u00d1i\2"+
		"\u01e0\u01e1\5\u00bf`\2\u01e1\u01e2\5\u00c5c\2\u01e2\u01e3\5\u00cbf\2"+
		"\u01e3\u01e4\5\u00cbf\2\u01e4J\3\2\2\2\u01e5\u01e6\5\u00d9m\2\u01e6\u01e7"+
		"\5\u00cdg\2\u01e7\u01e8\5\u00b5[\2\u01e8\u01e9\5\u00cbf\2\u01e9\u01ea"+
		"\5\u00cbf\2\u01ea\u01eb\5\u00c5c\2\u01eb\u01ec\5\u00cfh\2\u01ec\u01ed"+
		"\5\u00dbn\2\u01edL\3\2\2\2\u01ee\u01ef\5\u00cdg\2\u01ef\u01f0\5\u00bd"+
		"_\2\u01f0\u01f1\5\u00bb^\2\u01f1\u01f2\5\u00c5c\2\u01f2\u01f3\5\u00dd"+
		"o\2\u01f3\u01f4\5\u00cdg\2\u01f4\u01f5\5\u00c5c\2\u01f5\u01f6\5\u00cf"+
		"h\2\u01f6\u01f7\5\u00dbn\2\u01f7N\3\2\2\2\u01f8\u01f9\5\u00c5c\2\u01f9"+
		"\u01fa\5\u00cfh\2\u01fa\u01fb\5\u00dbn\2\u01fbP\3\2\2\2\u01fc\u01fd\5"+
		"\u00c5c\2\u01fd\u01fe\5\u00cfh\2\u01fe\u01ff\5\u00dbn\2\u01ff\u0200\5"+
		"\u00bd_\2\u0200\u0201\5\u00c1a\2\u0201\u0202\5\u00bd_\2\u0202\u0203\5"+
		"\u00d7l\2\u0203R\3\2\2\2\u0204\u0205\5\u00b7\\\2\u0205\u0206\5\u00c5c"+
		"\2\u0206\u0207\5\u00c1a\2\u0207\u0208\5\u00c5c\2\u0208\u0209\5\u00cfh"+
		"\2\u0209\u020a\5\u00dbn\2\u020aT\3\2\2\2\u020b\u020c\5\u00d7l\2\u020c"+
		"\u020d\5\u00bd_\2\u020d\u020e\5\u00b5[\2\u020e\u020f\5\u00cbf\2\u020f"+
		"V\3\2\2\2\u0210\u0211\5\u00bb^\2\u0211\u0212\5\u00d1i\2\u0212\u0213\5"+
		"\u00ddo\2\u0213\u0214\5\u00b7\\\2\u0214\u0215\5\u00cbf\2\u0215\u0216\5"+
		"\u00bd_\2\u0216X\3\2\2\2\u0217\u0218\5\u00bf`\2\u0218\u0219\5\u00cbf\2"+
		"\u0219\u021a\5\u00d1i\2\u021a\u021b\5\u00b5[\2\u021b\u021c\5\u00dbn\2"+
		"\u021cZ\3\2\2\2\u021d\u021e\5\u00bb^\2\u021e\u021f\5\u00bd_\2\u021f\u0220"+
		"\5\u00b9]\2\u0220\u0221\5\u00c5c\2\u0221\u0222\5\u00cdg\2\u0222\u0223"+
		"\5\u00b5[\2\u0223\u0224\5\u00cbf\2\u0224\\\3\2\2\2\u0225\u0226\5\u00cf"+
		"h\2\u0226\u0227\5\u00ddo\2\u0227\u0228\5\u00cdg\2\u0228\u0229\5\u00bd"+
		"_\2\u0229\u022a\5\u00d7l\2\u022a\u022b\5\u00c5c\2\u022b\u022c\5\u00b9"+
		"]\2\u022c^\3\2\2\2\u022d\u022e\5\u00b7\\\2\u022e\u022f\5\u00d1i\2\u022f"+
		"\u0230\5\u00d1i\2\u0230\u0231\5\u00cbf\2\u0231`\3\2\2\2\u0232\u0233\5"+
		"\u00b7\\\2\u0233\u0234\5\u00d1i\2\u0234\u0235\5\u00d1i\2\u0235\u0236\5"+
		"\u00cbf\2\u0236\u0237\5\u00bd_\2\u0237\u0238\5\u00b5[\2\u0238\u0239\5"+
		"\u00cfh\2\u0239b\3\2\2\2\u023a\u023b\5\u00bb^\2\u023b\u023c\5\u00b5[\2"+
		"\u023c\u023d\5\u00dbn\2\u023d\u023e\5\u00bd_\2\u023ed\3\2\2\2\u023f\u0240"+
		"\5\u00dbn\2\u0240\u0241\5\u00c5c\2\u0241\u0242\5\u00cdg\2\u0242\u0243"+
		"\5\u00bd_\2\u0243f\3\2\2\2\u0244\u0245\5\u00dbn\2\u0245\u0246\5\u00c5"+
		"c\2\u0246\u0247\5\u00cdg\2\u0247\u0248\5\u00bd_\2\u0248\u0249\5\u00d9"+
		"m\2\u0249\u024a\5\u00dbn\2\u024a\u024b\5\u00b5[\2\u024b\u024c\5\u00cd"+
		"g\2\u024c\u024d\5\u00d3j\2\u024dh\3\2\2\2\u024e\u024f\5\u00bb^\2\u024f"+
		"\u0250\5\u00b5[\2\u0250\u0251\5\u00dbn\2\u0251\u0252\5\u00bd_\2\u0252"+
		"\u0253\5\u00dbn\2\u0253\u0254\5\u00c5c\2\u0254\u0255\5\u00cdg\2\u0255"+
		"\u0256\5\u00bd_\2\u0256j\3\2\2\2\u0257\u0258\5\u00e5s\2\u0258\u0259\5"+
		"\u00bd_\2\u0259\u025a\5\u00b5[\2\u025a\u025b\5\u00d7l\2\u025bl\3\2\2\2"+
		"\u025c\u025d\5\u00b9]\2\u025d\u025e\5\u00c3b\2\u025e\u025f\5\u00b5[\2"+
		"\u025f\u0260\5\u00d7l\2\u0260n\3\2\2\2\u0261\u0262\5\u00dfp\2\u0262\u0263"+
		"\5\u00b5[\2\u0263\u0264\5\u00d7l\2\u0264\u0265\5\u00b9]\2\u0265\u0266"+
		"\5\u00c3b\2\u0266\u0267\5\u00b5[\2\u0267\u0268\5\u00d7l\2\u0268p\3\2\2"+
		"\2\u0269\u026a\5\u00dfp\2\u026a\u026b\5\u00b5[\2\u026b\u026c\5\u00d7l"+
		"\2\u026c\u026d\5\u00b7\\\2\u026d\u026e\5\u00c5c\2\u026e\u026f\5\u00cf"+
		"h\2\u026f\u0270\5\u00b5[\2\u0270\u0271\5\u00d7l\2\u0271\u0272\5\u00e5"+
		"s\2\u0272r\3\2\2\2\u0273\u0274\5\u00dbn\2\u0274\u0275\5\u00c5c\2\u0275"+
		"\u0276\5\u00cfh\2\u0276\u0277\5\u00e5s\2\u0277\u0278\5\u00b7\\\2\u0278"+
		"\u0279\5\u00cbf\2\u0279\u027a\5\u00d1i\2\u027a\u027b\5\u00b7\\\2\u027b"+
		"t\3\2\2\2\u027c\u027d\5\u00b7\\\2\u027d\u027e\5\u00cbf\2\u027e\u027f\5"+
		"\u00d1i\2\u027f\u0280\5\u00b7\\\2\u0280v\3\2\2\2\u0281\u0282\5\u00cdg"+
		"\2\u0282\u0283\5\u00bd_\2\u0283\u0284\5\u00bb^\2\u0284\u0285\5\u00c5c"+
		"\2\u0285\u0286\5\u00ddo\2\u0286\u0287\5\u00cdg\2\u0287\u0288\5\u00b7\\"+
		"\2\u0288\u0289\5\u00cbf\2\u0289\u028a\5\u00d1i\2\u028a\u028b\5\u00b7\\"+
		"\2\u028bx\3\2\2\2\u028c\u028d\5\u00cbf\2\u028d\u028e\5\u00d1i\2\u028e"+
		"\u028f\5\u00cfh\2\u028f\u0290\5\u00c1a\2\u0290\u0291\5\u00b7\\\2\u0291"+
		"\u0292\5\u00cbf\2\u0292\u0293\5\u00d1i\2\u0293\u0294\5\u00b7\\\2\u0294"+
		"z\3\2\2\2\u0295\u0296\5\u00c7d\2\u0296\u0297\5\u00d9m\2\u0297\u0298\5"+
		"\u00d1i\2\u0298\u0299\5\u00cfh\2\u0299|\3\2\2\2\u029a\u029b\5\u00dbn\2"+
		"\u029b\u029c\5\u00c5c\2\u029c\u029d\5\u00cfh\2\u029d\u029e\5\u00e5s\2"+
		"\u029e\u029f\5\u00dbn\2\u029f\u02a0\5\u00bd_\2\u02a0\u02a1\5\u00e3r\2"+
		"\u02a1\u02a2\5\u00dbn\2\u02a2~\3\2\2\2\u02a3\u02a4\5\u00dbn\2\u02a4\u02a5"+
		"\5\u00bd_\2\u02a5\u02a6\5\u00e3r\2\u02a6\u02a7\5\u00dbn\2\u02a7\u0080"+
		"\3\2\2\2\u02a8\u02a9\5\u00cdg\2\u02a9\u02aa\5\u00bd_\2\u02aa\u02ab\5\u00bb"+
		"^\2\u02ab\u02ac\5\u00c5c\2\u02ac\u02ad\5\u00ddo\2\u02ad\u02ae\5\u00cd"+
		"g\2\u02ae\u02af\5\u00dbn\2\u02af\u02b0\5\u00bd_\2\u02b0\u02b1\5\u00e3"+
		"r\2\u02b1\u02b2\5\u00dbn\2\u02b2\u0082\3\2\2\2\u02b3\u02b4\5\u00cbf\2"+
		"\u02b4\u02b5\5\u00d1i\2\u02b5\u02b6\5\u00cfh\2\u02b6\u02b7\5\u00c1a\2"+
		"\u02b7\u02b8\5\u00dbn\2\u02b8\u02b9\5\u00bd_\2\u02b9\u02ba\5\u00e3r\2"+
		"\u02ba\u02bb\5\u00dbn\2\u02bb\u0084\3\2\2\2\u02bc\u02bd\5\u00bd_\2\u02bd"+
		"\u02be\5\u00cfh\2\u02be\u02bf\5\u00ddo\2\u02bf\u02c0\5\u00cdg\2\u02c0"+
		"\u0086\3\2\2\2\u02c1\u02c2\5\u00cfh\2\u02c2\u02c3\5\u00d1i\2\u02c3\u0088"+
		"\3\2\2\2\u02c4\u02c5\5\u00b5[\2\u02c5\u02c6\5\u00b9]\2\u02c6\u02c7\5\u00db"+
		"n\2\u02c7\u02c8\5\u00c5c\2\u02c8\u02c9\5\u00d1i\2\u02c9\u02ca\5\u00cf"+
		"h\2\u02ca\u008a\3\2\2\2\u02cb\u02cc\5\u00b9]\2\u02cc\u02cd\5\u00d7l\2"+
		"\u02cd\u02ce\5\u00bd_\2\u02ce\u02cf\5\u00b5[\2\u02cf\u02d0\5\u00dbn\2"+
		"\u02d0\u02d1\5\u00bd_\2\u02d1\u008c\3\2\2\2\u02d2\u02d3\5\u00bf`\2\u02d3"+
		"\u02d4\5\u00b5[\2\u02d4\u02d5\5\u00cbf\2\u02d5\u02d6\5\u00d9m\2\u02d6"+
		"\u02d7\5\u00bd_\2\u02d7\u008e\3\2\2\2\u02d8\u02d9\5\u00dbn\2\u02d9\u02da"+
		"\5\u00d7l\2\u02da\u02db\5\u00ddo\2\u02db\u02dc\5\u00bd_\2\u02dc\u0090"+
		"\3\2\2\2\u02dd\u02de\7\60\2\2\u02de\u0092\3\2\2\2\u02df\u02e0\7?\2\2\u02e0"+
		"\u0094\3\2\2\2\u02e1\u02e2\7)\2\2\u02e2\u0096\3\2\2\2\u02e3\u02e4\7$\2"+
		"\2\u02e4\u0098\3\2\2\2\u02e5\u02e6\7b\2\2\u02e6\u009a\3\2\2\2\u02e7\u02e8"+
		"\7B\2\2\u02e8\u009c\3\2\2\2\u02e9\u02ea\7.\2\2\u02ea\u009e\3\2\2\2\u02eb"+
		"\u02ec\7=\2\2\u02ec\u00a0\3\2\2\2\u02ed\u02ee\7*\2\2\u02ee\u00a2\3\2\2"+
		"\2\u02ef\u02f0\7+\2\2\u02f0\u00a4\3\2\2\2\u02f1\u02f2\7b\2\2\u02f2\u02f3"+
		"\5\u00a7T\2\u02f3\u02f4\7b\2\2\u02f4\u00a6\3\2\2\2\u02f5\u02f9\t\2\2\2"+
		"\u02f6\u02f8\t\3\2\2\u02f7\u02f6\3\2\2\2\u02f8\u02fb\3\2\2\2\u02f9\u02f7"+
		"\3\2\2\2\u02f9\u02fa\3\2\2\2\u02fa\u00a8\3\2\2\2\u02fb\u02f9\3\2\2\2\u02fc"+
		"\u02fe\t\4\2\2\u02fd\u02fc\3\2\2\2\u02fe\u02ff\3\2\2\2\u02ff\u02fd\3\2"+
		"\2\2\u02ff\u0300\3\2\2\2\u0300\u00aa\3\2\2\2\u0301\u0303\t\4\2\2\u0302"+
		"\u0301\3\2\2\2\u0303\u0306\3\2\2\2\u0304\u0302\3\2\2\2\u0304\u0305\3\2"+
		"\2\2\u0305\u0307\3\2\2\2\u0306\u0304\3\2\2\2\u0307\u0309\7\60\2\2\u0308"+
		"\u030a\t\4\2\2\u0309\u0308\3\2\2\2\u030a\u030b\3\2\2\2\u030b\u0309\3\2"+
		"\2\2\u030b\u030c\3\2\2\2\u030c\u00ac\3\2\2\2\u030d\u0313\7)\2\2\u030e"+
		"\u0312\n\5\2\2\u030f\u0310\7^\2\2\u0310\u0312\t\6\2\2\u0311\u030e\3\2"+
		"\2\2\u0311\u030f\3\2\2\2\u0312\u0315\3\2\2\2\u0313\u0311\3\2\2\2\u0313"+
		"\u0314\3\2\2\2\u0314\u0316\3\2\2\2\u0315\u0313\3\2\2\2\u0316\u0322\7)"+
		"\2\2\u0317\u031d\7$\2\2\u0318\u031c\n\7\2\2\u0319\u031a\7^\2\2\u031a\u031c"+
		"\t\b\2\2\u031b\u0318\3\2\2\2\u031b\u0319\3\2\2\2\u031c\u031f\3\2\2\2\u031d"+
		"\u031b\3\2\2\2\u031d\u031e\3\2\2\2\u031e\u0320\3\2\2\2\u031f\u031d\3\2"+
		"\2\2\u0320\u0322\7$\2\2\u0321\u030d\3\2\2\2\u0321\u0317\3\2\2\2\u0322"+
		"\u00ae\3\2\2\2\u0323\u0324\7\61\2\2\u0324\u0325\7,\2\2\u0325\u0329\3\2"+
		"\2\2\u0326\u0328\13\2\2\2\u0327\u0326\3\2\2\2\u0328\u032b\3\2\2\2\u0329"+
		"\u032a\3\2\2\2\u0329\u0327\3\2\2\2\u032a\u032f\3\2\2\2\u032b\u0329\3\2"+
		"\2\2\u032c\u032d\7,\2\2\u032d\u0330\7\61\2\2\u032e\u0330\7\2\2\3\u032f"+
		"\u032c\3\2\2\2\u032f\u032e\3\2\2\2\u0330\u0331\3\2\2\2\u0331\u0332\bX"+
		"\2\2\u0332\u00b0\3\2\2\2\u0333\u0334\7/\2\2\u0334\u0335\7/\2\2\u0335\u0339"+
		"\3\2\2\2\u0336\u0338\n\t\2\2\u0337\u0336\3\2\2\2\u0338\u033b\3\2\2\2\u0339"+
		"\u0337\3\2\2\2\u0339\u033a\3\2\2\2\u033a\u033c\3\2\2\2\u033b\u0339\3\2"+
		"\2\2\u033c\u033d\bY\2\2\u033d\u00b2\3\2\2\2\u033e\u0340\t\n\2\2\u033f"+
		"\u033e\3\2\2\2\u0340\u0341\3\2\2\2\u0341\u033f\3\2\2\2\u0341\u0342\3\2"+
		"\2\2\u0342\u0343\3\2\2\2\u0343\u0344\bZ\2\2\u0344\u00b4\3\2\2\2\u0345"+
		"\u0346\t\13\2\2\u0346\u00b6\3\2\2\2\u0347\u0348\t\f\2\2\u0348\u00b8\3"+
		"\2\2\2\u0349\u034a\t\r\2\2\u034a\u00ba\3\2\2\2\u034b\u034c\t\16\2\2\u034c"+
		"\u00bc\3\2\2\2\u034d\u034e\t\17\2\2\u034e\u00be\3\2\2\2\u034f\u0350\t"+
		"\20\2\2\u0350\u00c0\3\2\2\2\u0351\u0352\t\21\2\2\u0352\u00c2\3\2\2\2\u0353"+
		"\u0354\t\22\2\2\u0354\u00c4\3\2\2\2\u0355\u0356\t\23\2\2\u0356\u00c6\3"+
		"\2\2\2\u0357\u0358\t\24\2\2\u0358\u00c8\3\2\2\2\u0359\u035a\t\25\2\2\u035a"+
		"\u00ca\3\2\2\2\u035b\u035c\t\26\2\2\u035c\u00cc\3\2\2\2\u035d\u035e\t"+
		"\27\2\2\u035e\u00ce\3\2\2\2\u035f\u0360\t\30\2\2\u0360\u00d0\3\2\2\2\u0361"+
		"\u0362\t\31\2\2\u0362\u00d2\3\2\2\2\u0363\u0364\t\32\2\2\u0364\u00d4\3"+
		"\2\2\2\u0365\u0366\t\33\2\2\u0366\u00d6\3\2\2\2\u0367\u0368\t\34\2\2\u0368"+
		"\u00d8\3\2\2\2\u0369\u036a\t\35\2\2\u036a\u00da\3\2\2\2\u036b\u036c\t"+
		"\36\2\2\u036c\u00dc\3\2\2\2\u036d\u036e\t\37\2\2\u036e\u00de\3\2\2\2\u036f"+
		"\u0370\t \2\2\u0370\u00e0\3\2\2\2\u0371\u0372\t!\2\2\u0372\u00e2\3\2\2"+
		"\2\u0373\u0374\t\"\2\2\u0374\u00e4\3\2\2\2\u0375\u0376\t#\2\2\u0376\u00e6"+
		"\3\2\2\2\u0377\u0378\t$\2\2\u0378\u00e8\3\2\2\2\21\2\u00eb\u02f9\u02ff"+
		"\u0304\u030b\u0311\u0313\u031b\u031d\u0321\u0329\u032f\u0339\u0341\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}