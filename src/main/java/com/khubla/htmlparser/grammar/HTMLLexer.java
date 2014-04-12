// Generated from com/khubla/htmlparser/grammar/HTMLLexer.g4 by ANTLR 4.2
package com.khubla.htmlparser.grammar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HTMLLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		HTML_COMMENT=1, HTML_DTD=2, HTML_EntityRef=3, HTML_CharRef=4, SEA_WS=5, 
		OPEN=6, HTML_TEXT=7, HTML_CLOSE=8, HTML_SLASH_CLOSE=9, HTML_SLASH=10, 
		HTML_EQUALS=11, HTML_STRING=12, HTML_Name=13, S=14;
	public static final int INSIDE = 1;
	public static String[] modeNames = {
		"DEFAULT_MODE", "INSIDE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"HTML_COMMENT", "HTML_DTD", "HTML_EntityRef", "HTML_CharRef", "SEA_WS", 
		"'<'", "HTML_TEXT", "'>'", "'/>'", "'/'", "'='", "HTML_STRING", "HTML_Name", 
		"S"
	};
	public static final String[] ruleNames = {
		"HTML_COMMENT", "HTML_DTD", "HTML_EntityRef", "HTML_CharRef", "SEA_WS", 
		"OPEN", "HTML_TEXT", "HTML_CLOSE", "HTML_SLASH_CLOSE", "HTML_SLASH", "HTML_EQUALS", 
		"HTML_STRING", "HTML_Name", "S", "HEXDIGIT", "DIGIT", "NameChar", "NameStartChar"
	};


	public HTMLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "HTMLLexer.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\20\u00a6\b\1\b\1"+
		"\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t"+
		"\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4"+
		"\22\t\22\4\23\t\23\3\2\3\2\3\2\3\2\3\2\3\2\7\2/\n\2\f\2\16\2\62\13\2\3"+
		"\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3<\n\3\f\3\16\3?\13\3\3\3\3\3\3\4\3\4"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\6\5K\n\5\r\5\16\5L\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\6\5V\n\5\r\5\16\5W\3\5\3\5\5\5\\\n\5\3\6\3\6\5\6`\n\6\3\6\6\6c\n\6"+
		"\r\6\16\6d\3\7\3\7\3\7\3\7\3\b\6\bl\n\b\r\b\16\bm\3\t\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\7\r\177\n\r\f\r\16\r\u0082"+
		"\13\r\3\r\3\r\3\r\7\r\u0087\n\r\f\r\16\r\u008a\13\r\3\r\5\r\u008d\n\r"+
		"\3\16\3\16\7\16\u0091\n\16\f\16\16\16\u0094\13\16\3\17\3\17\3\17\3\17"+
		"\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\5\22\u00a2\n\22\3\23\5\23\u00a5"+
		"\n\23\4\60=\2\24\4\3\6\4\b\5\n\6\f\7\16\b\20\t\22\n\24\13\26\f\30\r\32"+
		"\16\34\17\36\20 \2\"\2$\2&\2\4\2\3\f\4\2\13\13\"\"\4\2((>>\4\2$$>>\4\2"+
		"))>>\5\2\13\f\17\17\"\"\5\2\62;CHch\3\2\62;\4\2/\60aa\5\2\u00b9\u00b9"+
		"\u0302\u0371\u2041\u2042\n\2<<C\\c|\u2072\u2191\u2c02\u2ff1\u3003\ud801"+
		"\uf902\ufdd1\ufdf2\uffff\u00b0\2\4\3\2\2\2\2\6\3\2\2\2\2\b\3\2\2\2\2\n"+
		"\3\2\2\2\2\f\3\2\2\2\2\16\3\2\2\2\2\20\3\2\2\2\3\22\3\2\2\2\3\24\3\2\2"+
		"\2\3\26\3\2\2\2\3\30\3\2\2\2\3\32\3\2\2\2\3\34\3\2\2\2\3\36\3\2\2\2\4"+
		"(\3\2\2\2\6\67\3\2\2\2\bB\3\2\2\2\n[\3\2\2\2\fb\3\2\2\2\16f\3\2\2\2\20"+
		"k\3\2\2\2\22o\3\2\2\2\24s\3\2\2\2\26x\3\2\2\2\30z\3\2\2\2\32\u008c\3\2"+
		"\2\2\34\u008e\3\2\2\2\36\u0095\3\2\2\2 \u0099\3\2\2\2\"\u009b\3\2\2\2"+
		"$\u00a1\3\2\2\2&\u00a4\3\2\2\2()\7>\2\2)*\7#\2\2*+\7/\2\2+,\7/\2\2,\60"+
		"\3\2\2\2-/\13\2\2\2.-\3\2\2\2/\62\3\2\2\2\60\61\3\2\2\2\60.\3\2\2\2\61"+
		"\63\3\2\2\2\62\60\3\2\2\2\63\64\7/\2\2\64\65\7/\2\2\65\66\7@\2\2\66\5"+
		"\3\2\2\2\678\7>\2\289\7#\2\29=\3\2\2\2:<\13\2\2\2;:\3\2\2\2<?\3\2\2\2"+
		"=>\3\2\2\2=;\3\2\2\2>@\3\2\2\2?=\3\2\2\2@A\7@\2\2A\7\3\2\2\2BC\7(\2\2"+
		"CD\5\34\16\2DE\7=\2\2E\t\3\2\2\2FG\7(\2\2GH\7%\2\2HJ\3\2\2\2IK\5\"\21"+
		"\2JI\3\2\2\2KL\3\2\2\2LJ\3\2\2\2LM\3\2\2\2MN\3\2\2\2NO\7=\2\2O\\\3\2\2"+
		"\2PQ\7(\2\2QR\7%\2\2RS\7z\2\2SU\3\2\2\2TV\5 \20\2UT\3\2\2\2VW\3\2\2\2"+
		"WU\3\2\2\2WX\3\2\2\2XY\3\2\2\2YZ\7=\2\2Z\\\3\2\2\2[F\3\2\2\2[P\3\2\2\2"+
		"\\\13\3\2\2\2]c\t\2\2\2^`\7\17\2\2_^\3\2\2\2_`\3\2\2\2`a\3\2\2\2ac\7\f"+
		"\2\2b]\3\2\2\2b_\3\2\2\2cd\3\2\2\2db\3\2\2\2de\3\2\2\2e\r\3\2\2\2fg\7"+
		">\2\2gh\3\2\2\2hi\b\7\2\2i\17\3\2\2\2jl\n\3\2\2kj\3\2\2\2lm\3\2\2\2mk"+
		"\3\2\2\2mn\3\2\2\2n\21\3\2\2\2op\7@\2\2pq\3\2\2\2qr\b\t\3\2r\23\3\2\2"+
		"\2st\7\61\2\2tu\7@\2\2uv\3\2\2\2vw\b\n\3\2w\25\3\2\2\2xy\7\61\2\2y\27"+
		"\3\2\2\2z{\7?\2\2{\31\3\2\2\2|\u0080\7$\2\2}\177\n\4\2\2~}\3\2\2\2\177"+
		"\u0082\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0083\3\2\2\2"+
		"\u0082\u0080\3\2\2\2\u0083\u008d\7$\2\2\u0084\u0088\7)\2\2\u0085\u0087"+
		"\n\5\2\2\u0086\u0085\3\2\2\2\u0087\u008a\3\2\2\2\u0088\u0086\3\2\2\2\u0088"+
		"\u0089\3\2\2\2\u0089\u008b\3\2\2\2\u008a\u0088\3\2\2\2\u008b\u008d\7)"+
		"\2\2\u008c|\3\2\2\2\u008c\u0084\3\2\2\2\u008d\33\3\2\2\2\u008e\u0092\5"+
		"&\23\2\u008f\u0091\5$\22\2\u0090\u008f\3\2\2\2\u0091\u0094\3\2\2\2\u0092"+
		"\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\35\3\2\2\2\u0094\u0092\3\2\2"+
		"\2\u0095\u0096\t\6\2\2\u0096\u0097\3\2\2\2\u0097\u0098\b\17\4\2\u0098"+
		"\37\3\2\2\2\u0099\u009a\t\7\2\2\u009a!\3\2\2\2\u009b\u009c\t\b\2\2\u009c"+
		"#\3\2\2\2\u009d\u00a2\5&\23\2\u009e\u00a2\t\t\2\2\u009f\u00a2\5\"\21\2"+
		"\u00a0\u00a2\t\n\2\2\u00a1\u009d\3\2\2\2\u00a1\u009e\3\2\2\2\u00a1\u009f"+
		"\3\2\2\2\u00a1\u00a0\3\2\2\2\u00a2%\3\2\2\2\u00a3\u00a5\t\13\2\2\u00a4"+
		"\u00a3\3\2\2\2\u00a5\'\3\2\2\2\23\2\3\60=LW[_bdm\u0080\u0088\u008c\u0092"+
		"\u00a1\u00a4\5\7\3\2\6\2\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}