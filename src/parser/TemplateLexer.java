// Generated from SQLtoClass/src/parser/TemplateLexer.g4 by ANTLR 4.8
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
public class TemplateLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OPEN=1, K_ALL=2, K_ARRAY=3, K_BIGINT=4, K_BLOB=5, K_BOOLEAN=6, K_CHARS=7, 
		K_COMMENT=8, K_CONSTRAINT=9, K_CONTAINS=10, K_COUNT=11, K_CURRENCY=12, 
		K_DATE=13, K_DATETIME=14, K_DEFAULT=15, K_DESCRIPTION=16, K_DESCRIPTOR=17, 
		K_DOUBLE=18, K_EACH=19, K_END=20, K_ENUM=21, K_EXISTS=22, K_FIELD=23, 
		K_FLOAT=24, K_FOLDER=25, K_FOREIGN=26, K_GENDER=27, K_HEIGHT=28, K_HIGH=29, 
		K_IF=30, K_IMAGE=31, K_INDEX=32, K_INFO=33, K_INHERITED=34, K_INTEGER=35, 
		K_LENGTH=36, K_LETTER=37, K_LOW=38, K_MASK=39, K_MASKED=40, K_MATCH=41, 
		K_NAME=42, K_NORM=43, K_NULL=44, K_NUMBER=45, K_OPTION=46, K_PACKAGE=47, 
		K_PATH=48, K_PLURAL=49, K_PRIMARY=50, K_RADIO=51, K_REFERENCE=52, K_REPEATED=53, 
		K_SEARCHABLE=54, K_SINGULAR=55, K_SIZE=56, K_STRING=57, K_STYLE=58, K_TABLE=59, 
		K_TEXT=60, K_TIME=61, K_UNIQUE=62, K_UNIX=63, K_WIDTH=64, TEXT=65, CLOSE=66, 
		DOT=67, LPAR=68, RPAR=69, CHARS=70, REGEXS=71;
	public static final int
		INSIDE=1;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "INSIDE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"OPEN", "K_ALL", "K_ARRAY", "K_BIGINT", "K_BLOB", "K_BOOLEAN", "K_CHARS", 
			"K_COMMENT", "K_CONSTRAINT", "K_CONTAINS", "K_COUNT", "K_CURRENCY", "K_DATE", 
			"K_DATETIME", "K_DEFAULT", "K_DESCRIPTION", "K_DESCRIPTOR", "K_DOUBLE", 
			"K_EACH", "K_END", "K_ENUM", "K_EXISTS", "K_FIELD", "K_FLOAT", "K_FOLDER", 
			"K_FOREIGN", "K_GENDER", "K_HEIGHT", "K_HIGH", "K_IF", "K_IMAGE", "K_INDEX", 
			"K_INFO", "K_INHERITED", "K_INTEGER", "K_LENGTH", "K_LETTER", "K_LOW", 
			"K_MASK", "K_MASKED", "K_MATCH", "K_NAME", "K_NORM", "K_NULL", "K_NUMBER", 
			"K_OPTION", "K_PACKAGE", "K_PATH", "K_PLURAL", "K_PRIMARY", "K_RADIO", 
			"K_REFERENCE", "K_REPEATED", "K_SEARCHABLE", "K_SINGULAR", "K_SIZE", 
			"K_STRING", "K_STYLE", "K_TABLE", "K_TEXT", "K_TIME", "K_UNIQUE", "K_UNIX", 
			"K_WIDTH", "TEXT", "CLOSE", "DOT", "LPAR", "RPAR", "CHARS", "REGEXS", 
			"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", 
			"O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'['", null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "']'", "'.'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "OPEN", "K_ALL", "K_ARRAY", "K_BIGINT", "K_BLOB", "K_BOOLEAN", 
			"K_CHARS", "K_COMMENT", "K_CONSTRAINT", "K_CONTAINS", "K_COUNT", "K_CURRENCY", 
			"K_DATE", "K_DATETIME", "K_DEFAULT", "K_DESCRIPTION", "K_DESCRIPTOR", 
			"K_DOUBLE", "K_EACH", "K_END", "K_ENUM", "K_EXISTS", "K_FIELD", "K_FLOAT", 
			"K_FOLDER", "K_FOREIGN", "K_GENDER", "K_HEIGHT", "K_HIGH", "K_IF", "K_IMAGE", 
			"K_INDEX", "K_INFO", "K_INHERITED", "K_INTEGER", "K_LENGTH", "K_LETTER", 
			"K_LOW", "K_MASK", "K_MASKED", "K_MATCH", "K_NAME", "K_NORM", "K_NULL", 
			"K_NUMBER", "K_OPTION", "K_PACKAGE", "K_PATH", "K_PLURAL", "K_PRIMARY", 
			"K_RADIO", "K_REFERENCE", "K_REPEATED", "K_SEARCHABLE", "K_SINGULAR", 
			"K_SIZE", "K_STRING", "K_STYLE", "K_TABLE", "K_TEXT", "K_TIME", "K_UNIQUE", 
			"K_UNIX", "K_WIDTH", "TEXT", "CLOSE", "DOT", "LPAR", "RPAR", "CHARS", 
			"REGEXS"
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


	public TemplateLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "TemplateLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2I\u02c1\b\1\b\1\4"+
		"\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n"+
		"\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t"+
		"=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4"+
		"I\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\t"+
		"T\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_"+
		"\4`\t`\4a\ta\4b\tb\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 "+
		"\3 \3 \3 \3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3"+
		"&\3&\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3"+
		"*\3*\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3"+
		".\3/\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3"+
		"\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3"+
		"\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3"+
		"\65\3\65\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3"+
		"\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\38\38"+
		"\38\38\38\38\38\38\38\39\39\39\39\39\3:\3:\3:\3:\3:\3:\3:\3;\3;\3;\3;"+
		"\3;\3;\3<\3<\3<\3<\3<\3<\3=\3=\3=\3=\3=\3>\3>\3>\3>\3>\3?\3?\3?\3?\3?"+
		"\3?\3?\3@\3@\3@\3@\3@\3A\3A\3A\3A\3A\3A\3B\6B\u0276\nB\rB\16B\u0277\3"+
		"C\3C\3C\3C\3D\3D\3E\3E\3F\3F\3G\6G\u0285\nG\rG\16G\u0286\3H\6H\u028a\n"+
		"H\rH\16H\u028b\3I\3I\3J\3J\3K\3K\3L\3L\3M\3M\3N\3N\3O\3O\3P\3P\3Q\3Q\3"+
		"R\3R\3S\3S\3T\3T\3U\3U\3V\3V\3W\3W\3X\3X\3Y\3Y\3Z\3Z\3[\3[\3\\\3\\\3]"+
		"\3]\3^\3^\3_\3_\3`\3`\3a\3a\3b\3b\2\2c\4\3\6\4\b\5\n\6\f\7\16\b\20\t\22"+
		"\n\24\13\26\f\30\r\32\16\34\17\36\20 \21\"\22$\23&\24(\25*\26,\27.\30"+
		"\60\31\62\32\64\33\66\348\35:\36<\37> @!B\"D#F$H%J&L\'N(P)R*T+V,X-Z.\\"+
		"/^\60`\61b\62d\63f\64h\65j\66l\67n8p9r:t;v<x=z>|?~@\u0080A\u0082B\u0084"+
		"C\u0086D\u0088E\u008aF\u008cG\u008eH\u0090I\u0092\2\u0094\2\u0096\2\u0098"+
		"\2\u009a\2\u009c\2\u009e\2\u00a0\2\u00a2\2\u00a4\2\u00a6\2\u00a8\2\u00aa"+
		"\2\u00ac\2\u00ae\2\u00b0\2\u00b2\2\u00b4\2\u00b6\2\u00b8\2\u00ba\2\u00bc"+
		"\2\u00be\2\u00c0\2\u00c2\2\u00c4\2\4\2\3\37\4\2]]__\6\2\62;C\\aac|\3\2"+
		"*+\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2"+
		"KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4"+
		"\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\"+
		"||\2\u02a8\2\4\3\2\2\2\2\6\3\2\2\2\2\b\3\2\2\2\2\n\3\2\2\2\2\f\3\2\2\2"+
		"\2\16\3\2\2\2\2\20\3\2\2\2\2\22\3\2\2\2\2\24\3\2\2\2\2\26\3\2\2\2\2\30"+
		"\3\2\2\2\2\32\3\2\2\2\2\34\3\2\2\2\2\36\3\2\2\2\2 \3\2\2\2\2\"\3\2\2\2"+
		"\2$\3\2\2\2\2&\3\2\2\2\2(\3\2\2\2\2*\3\2\2\2\2,\3\2\2\2\2.\3\2\2\2\2\60"+
		"\3\2\2\2\2\62\3\2\2\2\2\64\3\2\2\2\2\66\3\2\2\2\28\3\2\2\2\2:\3\2\2\2"+
		"\2<\3\2\2\2\2>\3\2\2\2\2@\3\2\2\2\2B\3\2\2\2\2D\3\2\2\2\2F\3\2\2\2\2H"+
		"\3\2\2\2\2J\3\2\2\2\2L\3\2\2\2\2N\3\2\2\2\2P\3\2\2\2\2R\3\2\2\2\2T\3\2"+
		"\2\2\2V\3\2\2\2\2X\3\2\2\2\2Z\3\2\2\2\2\\\3\2\2\2\2^\3\2\2\2\2`\3\2\2"+
		"\2\2b\3\2\2\2\2d\3\2\2\2\2f\3\2\2\2\2h\3\2\2\2\2j\3\2\2\2\2l\3\2\2\2\2"+
		"n\3\2\2\2\2p\3\2\2\2\2r\3\2\2\2\2t\3\2\2\2\2v\3\2\2\2\2x\3\2\2\2\2z\3"+
		"\2\2\2\2|\3\2\2\2\2~\3\2\2\2\2\u0080\3\2\2\2\2\u0082\3\2\2\2\2\u0084\3"+
		"\2\2\2\3\u0086\3\2\2\2\3\u0088\3\2\2\2\3\u008a\3\2\2\2\3\u008c\3\2\2\2"+
		"\3\u008e\3\2\2\2\3\u0090\3\2\2\2\4\u00c6\3\2\2\2\6\u00ca\3\2\2\2\b\u00ce"+
		"\3\2\2\2\n\u00d4\3\2\2\2\f\u00db\3\2\2\2\16\u00e0\3\2\2\2\20\u00e8\3\2"+
		"\2\2\22\u00ee\3\2\2\2\24\u00f6\3\2\2\2\26\u0101\3\2\2\2\30\u010a\3\2\2"+
		"\2\32\u0110\3\2\2\2\34\u0119\3\2\2\2\36\u011e\3\2\2\2 \u0127\3\2\2\2\""+
		"\u012f\3\2\2\2$\u013b\3\2\2\2&\u0146\3\2\2\2(\u014d\3\2\2\2*\u0152\3\2"+
		"\2\2,\u0156\3\2\2\2.\u015b\3\2\2\2\60\u0162\3\2\2\2\62\u0168\3\2\2\2\64"+
		"\u016e\3\2\2\2\66\u0175\3\2\2\28\u017d\3\2\2\2:\u0184\3\2\2\2<\u018b\3"+
		"\2\2\2>\u0190\3\2\2\2@\u0193\3\2\2\2B\u0199\3\2\2\2D\u019f\3\2\2\2F\u01a4"+
		"\3\2\2\2H\u01ae\3\2\2\2J\u01b6\3\2\2\2L\u01bd\3\2\2\2N\u01c4\3\2\2\2P"+
		"\u01c8\3\2\2\2R\u01cd\3\2\2\2T\u01d4\3\2\2\2V\u01da\3\2\2\2X\u01df\3\2"+
		"\2\2Z\u01e4\3\2\2\2\\\u01e9\3\2\2\2^\u01f0\3\2\2\2`\u01f7\3\2\2\2b\u01ff"+
		"\3\2\2\2d\u0204\3\2\2\2f\u020b\3\2\2\2h\u0213\3\2\2\2j\u0219\3\2\2\2l"+
		"\u0223\3\2\2\2n\u022c\3\2\2\2p\u0237\3\2\2\2r\u0240\3\2\2\2t\u0245\3\2"+
		"\2\2v\u024c\3\2\2\2x\u0252\3\2\2\2z\u0258\3\2\2\2|\u025d\3\2\2\2~\u0262"+
		"\3\2\2\2\u0080\u0269\3\2\2\2\u0082\u026e\3\2\2\2\u0084\u0275\3\2\2\2\u0086"+
		"\u0279\3\2\2\2\u0088\u027d\3\2\2\2\u008a\u027f\3\2\2\2\u008c\u0281\3\2"+
		"\2\2\u008e\u0284\3\2\2\2\u0090\u0289\3\2\2\2\u0092\u028d\3\2\2\2\u0094"+
		"\u028f\3\2\2\2\u0096\u0291\3\2\2\2\u0098\u0293\3\2\2\2\u009a\u0295\3\2"+
		"\2\2\u009c\u0297\3\2\2\2\u009e\u0299\3\2\2\2\u00a0\u029b\3\2\2\2\u00a2"+
		"\u029d\3\2\2\2\u00a4\u029f\3\2\2\2\u00a6\u02a1\3\2\2\2\u00a8\u02a3\3\2"+
		"\2\2\u00aa\u02a5\3\2\2\2\u00ac\u02a7\3\2\2\2\u00ae\u02a9\3\2\2\2\u00b0"+
		"\u02ab\3\2\2\2\u00b2\u02ad\3\2\2\2\u00b4\u02af\3\2\2\2\u00b6\u02b1\3\2"+
		"\2\2\u00b8\u02b3\3\2\2\2\u00ba\u02b5\3\2\2\2\u00bc\u02b7\3\2\2\2\u00be"+
		"\u02b9\3\2\2\2\u00c0\u02bb\3\2\2\2\u00c2\u02bd\3\2\2\2\u00c4\u02bf\3\2"+
		"\2\2\u00c6\u00c7\7]\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c9\b\2\2\2\u00c9"+
		"\5\3\2\2\2\u00ca\u00cb\5\u0092I\2\u00cb\u00cc\5\u00a8T\2\u00cc\u00cd\5"+
		"\u00a8T\2\u00cd\7\3\2\2\2\u00ce\u00cf\5\u0092I\2\u00cf\u00d0\5\u00b4Z"+
		"\2\u00d0\u00d1\5\u00b4Z\2\u00d1\u00d2\5\u0092I\2\u00d2\u00d3\5\u00c2a"+
		"\2\u00d3\t\3\2\2\2\u00d4\u00d5\5\u0094J\2\u00d5\u00d6\5\u00a2Q\2\u00d6"+
		"\u00d7\5\u009eO\2\u00d7\u00d8\5\u00a2Q\2\u00d8\u00d9\5\u00acV\2\u00d9"+
		"\u00da\5\u00b8\\\2\u00da\13\3\2\2\2\u00db\u00dc\5\u0094J\2\u00dc\u00dd"+
		"\5\u00a8T\2\u00dd\u00de\5\u00aeW\2\u00de\u00df\5\u0094J\2\u00df\r\3\2"+
		"\2\2\u00e0\u00e1\5\u0094J\2\u00e1\u00e2\5\u00aeW\2\u00e2\u00e3\5\u00ae"+
		"W\2\u00e3\u00e4\5\u00a8T\2\u00e4\u00e5\5\u009aM\2\u00e5\u00e6\5\u0092"+
		"I\2\u00e6\u00e7\5\u00acV\2\u00e7\17\3\2\2\2\u00e8\u00e9\5\u0096K\2\u00e9"+
		"\u00ea\5\u00a0P\2\u00ea\u00eb\5\u0092I\2\u00eb\u00ec\5\u00b4Z\2\u00ec"+
		"\u00ed\5\u00b6[\2\u00ed\21\3\2\2\2\u00ee\u00ef\5\u0096K\2\u00ef\u00f0"+
		"\5\u00aeW\2\u00f0\u00f1\5\u00aaU\2\u00f1\u00f2\5\u00aaU\2\u00f2\u00f3"+
		"\5\u009aM\2\u00f3\u00f4\5\u00acV\2\u00f4\u00f5\5\u00b8\\\2\u00f5\23\3"+
		"\2\2\2\u00f6\u00f7\5\u0096K\2\u00f7\u00f8\5\u00aeW\2\u00f8\u00f9\5\u00ac"+
		"V\2\u00f9\u00fa\5\u00b6[\2\u00fa\u00fb\5\u00b8\\\2\u00fb\u00fc\5\u00b4"+
		"Z\2\u00fc\u00fd\5\u0092I\2\u00fd\u00fe\5\u00a2Q\2\u00fe\u00ff\5\u00ac"+
		"V\2\u00ff\u0100\5\u00b8\\\2\u0100\25\3\2\2\2\u0101\u0102\5\u0096K\2\u0102"+
		"\u0103\5\u00aeW\2\u0103\u0104\5\u00acV\2\u0104\u0105\5\u00b8\\\2\u0105"+
		"\u0106\5\u0092I\2\u0106\u0107\5\u00a2Q\2\u0107\u0108\5\u00acV\2\u0108"+
		"\u0109\5\u00b6[\2\u0109\27\3\2\2\2\u010a\u010b\5\u0096K\2\u010b\u010c"+
		"\5\u00aeW\2\u010c\u010d\5\u00ba]\2\u010d\u010e\5\u00acV\2\u010e\u010f"+
		"\5\u00b8\\\2\u010f\31\3\2\2\2\u0110\u0111\5\u0096K\2\u0111\u0112\5\u00ba"+
		"]\2\u0112\u0113\5\u00b4Z\2\u0113\u0114\5\u00b4Z\2\u0114\u0115\5\u009a"+
		"M\2\u0115\u0116\5\u00acV\2\u0116\u0117\5\u0096K\2\u0117\u0118\5\u00c2"+
		"a\2\u0118\33\3\2\2\2\u0119\u011a\5\u0098L\2\u011a\u011b\5\u0092I\2\u011b"+
		"\u011c\5\u00b8\\\2\u011c\u011d\5\u009aM\2\u011d\35\3\2\2\2\u011e\u011f"+
		"\5\u0098L\2\u011f\u0120\5\u0092I\2\u0120\u0121\5\u00b8\\\2\u0121\u0122"+
		"\5\u009aM\2\u0122\u0123\5\u00b8\\\2\u0123\u0124\5\u00a2Q\2\u0124\u0125"+
		"\5\u00aaU\2\u0125\u0126\5\u009aM\2\u0126\37\3\2\2\2\u0127\u0128\5\u0098"+
		"L\2\u0128\u0129\5\u009aM\2\u0129\u012a\5\u009cN\2\u012a\u012b\5\u0092"+
		"I\2\u012b\u012c\5\u00ba]\2\u012c\u012d\5\u00a8T\2\u012d\u012e\5\u00b8"+
		"\\\2\u012e!\3\2\2\2\u012f\u0130\5\u0098L\2\u0130\u0131\5\u009aM\2\u0131"+
		"\u0132\5\u00b6[\2\u0132\u0133\5\u0096K\2\u0133\u0134\5\u00b4Z\2\u0134"+
		"\u0135\5\u00a2Q\2\u0135\u0136\5\u00b0X\2\u0136\u0137\5\u00b8\\\2\u0137"+
		"\u0138\5\u00a2Q\2\u0138\u0139\5\u00aeW\2\u0139\u013a\5\u00acV\2\u013a"+
		"#\3\2\2\2\u013b\u013c\5\u0098L\2\u013c\u013d\5\u009aM\2\u013d\u013e\5"+
		"\u00b6[\2\u013e\u013f\5\u0096K\2\u013f\u0140\5\u00b4Z\2\u0140\u0141\5"+
		"\u00a2Q\2\u0141\u0142\5\u00b0X\2\u0142\u0143\5\u00b8\\\2\u0143\u0144\5"+
		"\u00aeW\2\u0144\u0145\5\u00b4Z\2\u0145%\3\2\2\2\u0146\u0147\5\u0098L\2"+
		"\u0147\u0148\5\u00aeW\2\u0148\u0149\5\u00ba]\2\u0149\u014a\5\u0094J\2"+
		"\u014a\u014b\5\u00a8T\2\u014b\u014c\5\u009aM\2\u014c\'\3\2\2\2\u014d\u014e"+
		"\5\u009aM\2\u014e\u014f\5\u0092I\2\u014f\u0150\5\u0096K\2\u0150\u0151"+
		"\5\u00a0P\2\u0151)\3\2\2\2\u0152\u0153\5\u009aM\2\u0153\u0154\5\u00ac"+
		"V\2\u0154\u0155\5\u0098L\2\u0155+\3\2\2\2\u0156\u0157\5\u009aM\2\u0157"+
		"\u0158\5\u00acV\2\u0158\u0159\5\u00ba]\2\u0159\u015a\5\u00aaU\2\u015a"+
		"-\3\2\2\2\u015b\u015c\5\u009aM\2\u015c\u015d\5\u00c0`\2\u015d\u015e\5"+
		"\u00a2Q\2\u015e\u015f\5\u00b6[\2\u015f\u0160\5\u00b8\\\2\u0160\u0161\5"+
		"\u00b6[\2\u0161/\3\2\2\2\u0162\u0163\5\u009cN\2\u0163\u0164\5\u00a2Q\2"+
		"\u0164\u0165\5\u009aM\2\u0165\u0166\5\u00a8T\2\u0166\u0167\5\u0098L\2"+
		"\u0167\61\3\2\2\2\u0168\u0169\5\u009cN\2\u0169\u016a\5\u00a8T\2\u016a"+
		"\u016b\5\u00aeW\2\u016b\u016c\5\u0092I\2\u016c\u016d\5\u00b8\\\2\u016d"+
		"\63\3\2\2\2\u016e\u016f\5\u009cN\2\u016f\u0170\5\u00aeW\2\u0170\u0171"+
		"\5\u00a8T\2\u0171\u0172\5\u0098L\2\u0172\u0173\5\u009aM\2\u0173\u0174"+
		"\5\u00b4Z\2\u0174\65\3\2\2\2\u0175\u0176\5\u009cN\2\u0176\u0177\5\u00ae"+
		"W\2\u0177\u0178\5\u00b4Z\2\u0178\u0179\5\u009aM\2\u0179\u017a\5\u00a2"+
		"Q\2\u017a\u017b\5\u009eO\2\u017b\u017c\5\u00acV\2\u017c\67\3\2\2\2\u017d"+
		"\u017e\5\u009eO\2\u017e\u017f\5\u009aM\2\u017f\u0180\5\u00acV\2\u0180"+
		"\u0181\5\u0098L\2\u0181\u0182\5\u009aM\2\u0182\u0183\5\u00b4Z\2\u0183"+
		"9\3\2\2\2\u0184\u0185\5\u00a0P\2\u0185\u0186\5\u009aM\2\u0186\u0187\5"+
		"\u00a2Q\2\u0187\u0188\5\u009eO\2\u0188\u0189\5\u00a0P\2\u0189\u018a\5"+
		"\u00b8\\\2\u018a;\3\2\2\2\u018b\u018c\5\u00a0P\2\u018c\u018d\5\u00a2Q"+
		"\2\u018d\u018e\5\u009eO\2\u018e\u018f\5\u00a0P\2\u018f=\3\2\2\2\u0190"+
		"\u0191\5\u00a2Q\2\u0191\u0192\5\u009cN\2\u0192?\3\2\2\2\u0193\u0194\5"+
		"\u00a2Q\2\u0194\u0195\5\u00aaU\2\u0195\u0196\5\u0092I\2\u0196\u0197\5"+
		"\u009eO\2\u0197\u0198\5\u009aM\2\u0198A\3\2\2\2\u0199\u019a\5\u00a2Q\2"+
		"\u019a\u019b\5\u00acV\2\u019b\u019c\5\u0098L\2\u019c\u019d\5\u009aM\2"+
		"\u019d\u019e\5\u00c0`\2\u019eC\3\2\2\2\u019f\u01a0\5\u00a2Q\2\u01a0\u01a1"+
		"\5\u00acV\2\u01a1\u01a2\5\u009cN\2\u01a2\u01a3\5\u00aeW\2\u01a3E\3\2\2"+
		"\2\u01a4\u01a5\5\u00a2Q\2\u01a5\u01a6\5\u00acV\2\u01a6\u01a7\5\u00a0P"+
		"\2\u01a7\u01a8\5\u009aM\2\u01a8\u01a9\5\u00b4Z\2\u01a9\u01aa\5\u00a2Q"+
		"\2\u01aa\u01ab\5\u00b8\\\2\u01ab\u01ac\5\u009aM\2\u01ac\u01ad\5\u0098"+
		"L\2\u01adG\3\2\2\2\u01ae\u01af\5\u00a2Q\2\u01af\u01b0\5\u00acV\2\u01b0"+
		"\u01b1\5\u00b8\\\2\u01b1\u01b2\5\u009aM\2\u01b2\u01b3\5\u009eO\2\u01b3"+
		"\u01b4\5\u009aM\2\u01b4\u01b5\5\u00b4Z\2\u01b5I\3\2\2\2\u01b6\u01b7\5"+
		"\u00a8T\2\u01b7\u01b8\5\u009aM\2\u01b8\u01b9\5\u00acV\2\u01b9\u01ba\5"+
		"\u009eO\2\u01ba\u01bb\5\u00b8\\\2\u01bb\u01bc\5\u00a0P\2\u01bcK\3\2\2"+
		"\2\u01bd\u01be\5\u00a8T\2\u01be\u01bf\5\u009aM\2\u01bf\u01c0\5\u00b8\\"+
		"\2\u01c0\u01c1\5\u00b8\\\2\u01c1\u01c2\5\u009aM\2\u01c2\u01c3\5\u00b4"+
		"Z\2\u01c3M\3\2\2\2\u01c4\u01c5\5\u00a8T\2\u01c5\u01c6\5\u00aeW\2\u01c6"+
		"\u01c7\5\u00be_\2\u01c7O\3\2\2\2\u01c8\u01c9\5\u00aaU\2\u01c9\u01ca\5"+
		"\u0092I\2\u01ca\u01cb\5\u00b6[\2\u01cb\u01cc\5\u00a6S\2\u01ccQ\3\2\2\2"+
		"\u01cd\u01ce\5\u00aaU\2\u01ce\u01cf\5\u0092I\2\u01cf\u01d0\5\u00b6[\2"+
		"\u01d0\u01d1\5\u00a6S\2\u01d1\u01d2\5\u009aM\2\u01d2\u01d3\5\u0098L\2"+
		"\u01d3S\3\2\2\2\u01d4\u01d5\5\u00aaU\2\u01d5\u01d6\5\u0092I\2\u01d6\u01d7"+
		"\5\u00b8\\\2\u01d7\u01d8\5\u0096K\2\u01d8\u01d9\5\u00a0P\2\u01d9U\3\2"+
		"\2\2\u01da\u01db\5\u00acV\2\u01db\u01dc\5\u0092I\2\u01dc\u01dd\5\u00aa"+
		"U\2\u01dd\u01de\5\u009aM\2\u01deW\3\2\2\2\u01df\u01e0\5\u00acV\2\u01e0"+
		"\u01e1\5\u00aeW\2\u01e1\u01e2\5\u00b4Z\2\u01e2\u01e3\5\u00aaU\2\u01e3"+
		"Y\3\2\2\2\u01e4\u01e5\5\u00acV\2\u01e5\u01e6\5\u00ba]\2\u01e6\u01e7\5"+
		"\u00a8T\2\u01e7\u01e8\5\u00a8T\2\u01e8[\3\2\2\2\u01e9\u01ea\5\u00acV\2"+
		"\u01ea\u01eb\5\u00ba]\2\u01eb\u01ec\5\u00aaU\2\u01ec\u01ed\5\u0094J\2"+
		"\u01ed\u01ee\5\u009aM\2\u01ee\u01ef\5\u00b4Z\2\u01ef]\3\2\2\2\u01f0\u01f1"+
		"\5\u00aeW\2\u01f1\u01f2\5\u00b0X\2\u01f2\u01f3\5\u00b8\\\2\u01f3\u01f4"+
		"\5\u00a2Q\2\u01f4\u01f5\5\u00aeW\2\u01f5\u01f6\5\u00acV\2\u01f6_\3\2\2"+
		"\2\u01f7\u01f8\5\u00b0X\2\u01f8\u01f9\5\u0092I\2\u01f9\u01fa\5\u0096K"+
		"\2\u01fa\u01fb\5\u00a6S\2\u01fb\u01fc\5\u0092I\2\u01fc\u01fd\5\u009eO"+
		"\2\u01fd\u01fe\5\u009aM\2\u01fea\3\2\2\2\u01ff\u0200\5\u00b0X\2\u0200"+
		"\u0201\5\u0092I\2\u0201\u0202\5\u00b8\\\2\u0202\u0203\5\u00a0P\2\u0203"+
		"c\3\2\2\2\u0204\u0205\5\u00b0X\2\u0205\u0206\5\u00a8T\2\u0206\u0207\5"+
		"\u00ba]\2\u0207\u0208\5\u00b4Z\2\u0208\u0209\5\u0092I\2\u0209\u020a\5"+
		"\u00a8T\2\u020ae\3\2\2\2\u020b\u020c\5\u00b0X\2\u020c\u020d\5\u00b4Z\2"+
		"\u020d\u020e\5\u00a2Q\2\u020e\u020f\5\u00aaU\2\u020f\u0210\5\u0092I\2"+
		"\u0210\u0211\5\u00b4Z\2\u0211\u0212\5\u00c2a\2\u0212g\3\2\2\2\u0213\u0214"+
		"\5\u00b4Z\2\u0214\u0215\5\u0092I\2\u0215\u0216\5\u0098L\2\u0216\u0217"+
		"\5\u00a2Q\2\u0217\u0218\5\u00aeW\2\u0218i\3\2\2\2\u0219\u021a\5\u00b4"+
		"Z\2\u021a\u021b\5\u009aM\2\u021b\u021c\5\u009cN\2\u021c\u021d\5\u009a"+
		"M\2\u021d\u021e\5\u00b4Z\2\u021e\u021f\5\u009aM\2\u021f\u0220\5\u00ac"+
		"V\2\u0220\u0221\5\u0096K\2\u0221\u0222\5\u009aM\2\u0222k\3\2\2\2\u0223"+
		"\u0224\5\u00b4Z\2\u0224\u0225\5\u009aM\2\u0225\u0226\5\u00b0X\2\u0226"+
		"\u0227\5\u009aM\2\u0227\u0228\5\u0092I\2\u0228\u0229\5\u00b8\\\2\u0229"+
		"\u022a\5\u009aM\2\u022a\u022b\5\u0098L\2\u022bm\3\2\2\2\u022c\u022d\5"+
		"\u00b6[\2\u022d\u022e\5\u009aM\2\u022e\u022f\5\u0092I\2\u022f\u0230\5"+
		"\u00b4Z\2\u0230\u0231\5\u0096K\2\u0231\u0232\5\u00a0P\2\u0232\u0233\5"+
		"\u0092I\2\u0233\u0234\5\u0094J\2\u0234\u0235\5\u00a8T\2\u0235\u0236\5"+
		"\u009aM\2\u0236o\3\2\2\2\u0237\u0238\5\u00b6[\2\u0238\u0239\5\u00a2Q\2"+
		"\u0239\u023a\5\u00acV\2\u023a\u023b\5\u009eO\2\u023b\u023c\5\u00ba]\2"+
		"\u023c\u023d\5\u00a8T\2\u023d\u023e\5\u0092I\2\u023e\u023f\5\u00b4Z\2"+
		"\u023fq\3\2\2\2\u0240\u0241\5\u00b6[\2\u0241\u0242\5\u00a2Q\2\u0242\u0243"+
		"\5\u00c4b\2\u0243\u0244\5\u009aM\2\u0244s\3\2\2\2\u0245\u0246\5\u00b6"+
		"[\2\u0246\u0247\5\u00b8\\\2\u0247\u0248\5\u00b4Z\2\u0248\u0249\5\u00a2"+
		"Q\2\u0249\u024a\5\u00acV\2\u024a\u024b\5\u009eO\2\u024bu\3\2\2\2\u024c"+
		"\u024d\5\u00b6[\2\u024d\u024e\5\u00b8\\\2\u024e\u024f\5\u00c2a\2\u024f"+
		"\u0250\5\u00a8T\2\u0250\u0251\5\u009aM\2\u0251w\3\2\2\2\u0252\u0253\5"+
		"\u00b8\\\2\u0253\u0254\5\u0092I\2\u0254\u0255\5\u0094J\2\u0255\u0256\5"+
		"\u00a8T\2\u0256\u0257\5\u009aM\2\u0257y\3\2\2\2\u0258\u0259\5\u00b8\\"+
		"\2\u0259\u025a\5\u009aM\2\u025a\u025b\5\u00c0`\2\u025b\u025c\5\u00b8\\"+
		"\2\u025c{\3\2\2\2\u025d\u025e\5\u00b8\\\2\u025e\u025f\5\u00a2Q\2\u025f"+
		"\u0260\5\u00aaU\2\u0260\u0261\5\u009aM\2\u0261}\3\2\2\2\u0262\u0263\5"+
		"\u00ba]\2\u0263\u0264\5\u00acV\2\u0264\u0265\5\u00a2Q\2\u0265\u0266\5"+
		"\u00b2Y\2\u0266\u0267\5\u00ba]\2\u0267\u0268\5\u009aM\2\u0268\177\3\2"+
		"\2\2\u0269\u026a\5\u00ba]\2\u026a\u026b\5\u00acV\2\u026b\u026c\5\u00a2"+
		"Q\2\u026c\u026d\5\u00c0`\2\u026d\u0081\3\2\2\2\u026e\u026f\5\u00be_\2"+
		"\u026f\u0270\5\u00a2Q\2\u0270\u0271\5\u0098L\2\u0271\u0272\5\u00b8\\\2"+
		"\u0272\u0273\5\u00a0P\2\u0273\u0083\3\2\2\2\u0274\u0276\n\2\2\2\u0275"+
		"\u0274\3\2\2\2\u0276\u0277\3\2\2\2\u0277\u0275\3\2\2\2\u0277\u0278\3\2"+
		"\2\2\u0278\u0085\3\2\2\2\u0279\u027a\7_\2\2\u027a\u027b\3\2\2\2\u027b"+
		"\u027c\bC\3\2\u027c\u0087\3\2\2\2\u027d\u027e\7\60\2\2\u027e\u0089\3\2"+
		"\2\2\u027f\u0280\7*\2\2\u0280\u008b\3\2\2\2\u0281\u0282\7+\2\2\u0282\u008d"+
		"\3\2\2\2\u0283\u0285\t\3\2\2\u0284\u0283\3\2\2\2\u0285\u0286\3\2\2\2\u0286"+
		"\u0284\3\2\2\2\u0286\u0287\3\2\2\2\u0287\u008f\3\2\2\2\u0288\u028a\n\4"+
		"\2\2\u0289\u0288\3\2\2\2\u028a\u028b\3\2\2\2\u028b\u0289\3\2\2\2\u028b"+
		"\u028c\3\2\2\2\u028c\u0091\3\2\2\2\u028d\u028e\t\5\2\2\u028e\u0093\3\2"+
		"\2\2\u028f\u0290\t\6\2\2\u0290\u0095\3\2\2\2\u0291\u0292\t\7\2\2\u0292"+
		"\u0097\3\2\2\2\u0293\u0294\t\b\2\2\u0294\u0099\3\2\2\2\u0295\u0296\t\t"+
		"\2\2\u0296\u009b\3\2\2\2\u0297\u0298\t\n\2\2\u0298\u009d\3\2\2\2\u0299"+
		"\u029a\t\13\2\2\u029a\u009f\3\2\2\2\u029b\u029c\t\f\2\2\u029c\u00a1\3"+
		"\2\2\2\u029d\u029e\t\r\2\2\u029e\u00a3\3\2\2\2\u029f\u02a0\t\16\2\2\u02a0"+
		"\u00a5\3\2\2\2\u02a1\u02a2\t\17\2\2\u02a2\u00a7\3\2\2\2\u02a3\u02a4\t"+
		"\20\2\2\u02a4\u00a9\3\2\2\2\u02a5\u02a6\t\21\2\2\u02a6\u00ab\3\2\2\2\u02a7"+
		"\u02a8\t\22\2\2\u02a8\u00ad\3\2\2\2\u02a9\u02aa\t\23\2\2\u02aa\u00af\3"+
		"\2\2\2\u02ab\u02ac\t\24\2\2\u02ac\u00b1\3\2\2\2\u02ad\u02ae\t\25\2\2\u02ae"+
		"\u00b3\3\2\2\2\u02af\u02b0\t\26\2\2\u02b0\u00b5\3\2\2\2\u02b1\u02b2\t"+
		"\27\2\2\u02b2\u00b7\3\2\2\2\u02b3\u02b4\t\30\2\2\u02b4\u00b9\3\2\2\2\u02b5"+
		"\u02b6\t\31\2\2\u02b6\u00bb\3\2\2\2\u02b7\u02b8\t\32\2\2\u02b8\u00bd\3"+
		"\2\2\2\u02b9\u02ba\t\33\2\2\u02ba\u00bf\3\2\2\2\u02bb\u02bc\t\34\2\2\u02bc"+
		"\u00c1\3\2\2\2\u02bd\u02be\t\35\2\2\u02be\u00c3\3\2\2\2\u02bf\u02c0\t"+
		"\36\2\2\u02c0\u00c5\3\2\2\2\7\2\3\u0277\u0286\u028b\4\7\3\2\6\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}