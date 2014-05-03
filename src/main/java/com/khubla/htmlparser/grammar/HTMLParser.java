// Generated from com/khubla/htmlparser/grammar/HTMLParser.g4 by ANTLR 4.2
package com.khubla.htmlparser.grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HTMLParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TAG_WHITESPACE=17, TAG_NAME=16, HREF_BODY=22, STYLE_BODY=20, CDATA=2, 
		SEA_WS=5, TAG_CLOSE=11, SCRIPT_BODY=18, TAG_VALUE=15, TAG_SLASH=13, STYLE_OPEN=7, 
		DTD=3, STYLE_SHORT_BODY=21, TAG_EQUALS=14, HTML_COMMENT=1, TAG_SLASH_CLOSE=12, 
		HTML_TEXT=10, HREF_UNCLOSED=24, SCRIPT_OPEN=6, HREF_SHORT_BODY=23, SCRIPTLET=4, 
		SCRIPT_SHORT_BODY=19, HREF_OPEN=8, TAG_OPEN=9;
	public static final String[] tokenNames = {
		"<INVALID>", "HTML_COMMENT", "CDATA", "DTD", "SCRIPTLET", "SEA_WS", "SCRIPT_OPEN", 
		"STYLE_OPEN", "HREF_OPEN", "'<'", "HTML_TEXT", "'>'", "'/>'", "'/'", "'='", 
		"TAG_VALUE", "TAG_NAME", "TAG_WHITESPACE", "SCRIPT_BODY", "SCRIPT_SHORT_BODY", 
		"STYLE_BODY", "STYLE_SHORT_BODY", "HREF_BODY", "HREF_SHORT_BODY", "HREF_UNCLOSED"
	};
	public static final int
		RULE_htmlDocument = 0, RULE_htmlElements = 1, RULE_htmlElement = 2, RULE_htmlContent = 3, 
		RULE_htmlAttribute = 4, RULE_htmlAttributeName = 5, RULE_htmlAttributeValue = 6, 
		RULE_htmlTagName = 7, RULE_htmlChardata = 8, RULE_htmlMisc = 9, RULE_htmlComment = 10, 
		RULE_xhtmlCDATA = 11, RULE_dtd = 12, RULE_scriptlet = 13, RULE_script = 14, 
		RULE_style = 15, RULE_href = 16;
	public static final String[] ruleNames = {
		"htmlDocument", "htmlElements", "htmlElement", "htmlContent", "htmlAttribute", 
		"htmlAttributeName", "htmlAttributeValue", "htmlTagName", "htmlChardata", 
		"htmlMisc", "htmlComment", "xhtmlCDATA", "dtd", "scriptlet", "script", 
		"style", "href"
	};

	@Override
	public String getGrammarFileName() { return "HTMLParser.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HTMLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class HtmlDocumentContext extends ParserRuleContext {
		public TerminalNode SEA_WS() { return getToken(HTMLParser.SEA_WS, 0); }
		public HtmlElementsContext htmlElements(int i) {
			return getRuleContext(HtmlElementsContext.class,i);
		}
		public List<HtmlElementsContext> htmlElements() {
			return getRuleContexts(HtmlElementsContext.class);
		}
		public DtdContext dtd() {
			return getRuleContext(DtdContext.class,0);
		}
		public HtmlDocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlDocument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterHtmlDocument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitHtmlDocument(this);
		}
	}

	public final HtmlDocumentContext htmlDocument() throws RecognitionException {
		HtmlDocumentContext _localctx = new HtmlDocumentContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_htmlDocument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(34); match(SEA_WS);
				}
				break;
			}
			setState(38);
			_la = _input.LA(1);
			if (_la==DTD) {
				{
				setState(37); dtd();
				}
			}

			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << HTML_COMMENT) | (1L << SCRIPTLET) | (1L << SEA_WS) | (1L << SCRIPT_OPEN) | (1L << STYLE_OPEN) | (1L << HREF_OPEN) | (1L << TAG_OPEN))) != 0)) {
				{
				{
				setState(40); htmlElements();
				}
				}
				setState(45);
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

	public static class HtmlElementsContext extends ParserRuleContext {
		public List<HtmlMiscContext> htmlMisc() {
			return getRuleContexts(HtmlMiscContext.class);
		}
		public HtmlElementContext htmlElement() {
			return getRuleContext(HtmlElementContext.class,0);
		}
		public HtmlMiscContext htmlMisc(int i) {
			return getRuleContext(HtmlMiscContext.class,i);
		}
		public HtmlElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlElements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterHtmlElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitHtmlElements(this);
		}
	}

	public final HtmlElementsContext htmlElements() throws RecognitionException {
		HtmlElementsContext _localctx = new HtmlElementsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_htmlElements);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==HTML_COMMENT || _la==SEA_WS) {
				{
				{
				setState(46); htmlMisc();
				}
				}
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(52); htmlElement();
			setState(56);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(53); htmlMisc();
					}
					} 
				}
				setState(58);
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

	public static class HtmlElementContext extends ParserRuleContext {
		public TerminalNode TAG_SLASH() { return getToken(HTMLParser.TAG_SLASH, 0); }
		public StyleContext style() {
			return getRuleContext(StyleContext.class,0);
		}
		public TerminalNode TAG_SLASH_CLOSE() { return getToken(HTMLParser.TAG_SLASH_CLOSE, 0); }
		public List<HtmlTagNameContext> htmlTagName() {
			return getRuleContexts(HtmlTagNameContext.class);
		}
		public TerminalNode TAG_CLOSE(int i) {
			return getToken(HTMLParser.TAG_CLOSE, i);
		}
		public ScriptletContext scriptlet() {
			return getRuleContext(ScriptletContext.class,0);
		}
		public List<TerminalNode> TAG_CLOSE() { return getTokens(HTMLParser.TAG_CLOSE); }
		public ScriptContext script() {
			return getRuleContext(ScriptContext.class,0);
		}
		public HrefContext href() {
			return getRuleContext(HrefContext.class,0);
		}
		public TerminalNode TAG_OPEN(int i) {
			return getToken(HTMLParser.TAG_OPEN, i);
		}
		public List<TerminalNode> TAG_OPEN() { return getTokens(HTMLParser.TAG_OPEN); }
		public HtmlContentContext htmlContent() {
			return getRuleContext(HtmlContentContext.class,0);
		}
		public HtmlAttributeContext htmlAttribute(int i) {
			return getRuleContext(HtmlAttributeContext.class,i);
		}
		public HtmlTagNameContext htmlTagName(int i) {
			return getRuleContext(HtmlTagNameContext.class,i);
		}
		public List<HtmlAttributeContext> htmlAttribute() {
			return getRuleContexts(HtmlAttributeContext.class);
		}
		public HtmlElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterHtmlElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitHtmlElement(this);
		}
	}

	public final HtmlElementContext htmlElement() throws RecognitionException {
		HtmlElementContext _localctx = new HtmlElementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_htmlElement);
		int _la;
		try {
			setState(98);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(59); match(TAG_OPEN);
				setState(60); htmlTagName();
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TAG_NAME) {
					{
					{
					setState(61); htmlAttribute();
					}
					}
					setState(66);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(67); match(TAG_CLOSE);
				setState(68); htmlContent();
				setState(69); match(TAG_OPEN);
				setState(70); match(TAG_SLASH);
				setState(71); htmlTagName();
				setState(72); match(TAG_CLOSE);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(74); match(TAG_OPEN);
				setState(75); htmlTagName();
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TAG_NAME) {
					{
					{
					setState(76); htmlAttribute();
					}
					}
					setState(81);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(82); match(TAG_SLASH_CLOSE);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(84); match(TAG_OPEN);
				setState(85); htmlTagName();
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TAG_NAME) {
					{
					{
					setState(86); htmlAttribute();
					}
					}
					setState(91);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(92); match(TAG_CLOSE);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(94); scriptlet();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(95); script();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(96); style();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(97); href();
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

	public static class HtmlContentContext extends ParserRuleContext {
		public HtmlCommentContext htmlComment(int i) {
			return getRuleContext(HtmlCommentContext.class,i);
		}
		public HtmlElementContext htmlElement(int i) {
			return getRuleContext(HtmlElementContext.class,i);
		}
		public XhtmlCDATAContext xhtmlCDATA(int i) {
			return getRuleContext(XhtmlCDATAContext.class,i);
		}
		public List<HtmlElementContext> htmlElement() {
			return getRuleContexts(HtmlElementContext.class);
		}
		public List<HtmlCommentContext> htmlComment() {
			return getRuleContexts(HtmlCommentContext.class);
		}
		public List<HtmlChardataContext> htmlChardata() {
			return getRuleContexts(HtmlChardataContext.class);
		}
		public List<XhtmlCDATAContext> xhtmlCDATA() {
			return getRuleContexts(XhtmlCDATAContext.class);
		}
		public HtmlChardataContext htmlChardata(int i) {
			return getRuleContext(HtmlChardataContext.class,i);
		}
		public HtmlContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterHtmlContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitHtmlContent(this);
		}
	}

	public final HtmlContentContext htmlContent() throws RecognitionException {
		HtmlContentContext _localctx = new HtmlContentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_htmlContent);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			_la = _input.LA(1);
			if (_la==SEA_WS || _la==HTML_TEXT) {
				{
				setState(100); htmlChardata();
				}
			}

			setState(113);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(106);
					switch (_input.LA(1)) {
					case SCRIPTLET:
					case SCRIPT_OPEN:
					case STYLE_OPEN:
					case HREF_OPEN:
					case TAG_OPEN:
						{
						setState(103); htmlElement();
						}
						break;
					case CDATA:
						{
						setState(104); xhtmlCDATA();
						}
						break;
					case HTML_COMMENT:
						{
						setState(105); htmlComment();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(109);
					_la = _input.LA(1);
					if (_la==SEA_WS || _la==HTML_TEXT) {
						{
						setState(108); htmlChardata();
						}
					}

					}
					} 
				}
				setState(115);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	public static class HtmlAttributeContext extends ParserRuleContext {
		public HtmlAttributeNameContext htmlAttributeName() {
			return getRuleContext(HtmlAttributeNameContext.class,0);
		}
		public TerminalNode TAG_EQUALS() { return getToken(HTMLParser.TAG_EQUALS, 0); }
		public HtmlAttributeValueContext htmlAttributeValue() {
			return getRuleContext(HtmlAttributeValueContext.class,0);
		}
		public HtmlAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterHtmlAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitHtmlAttribute(this);
		}
	}

	public final HtmlAttributeContext htmlAttribute() throws RecognitionException {
		HtmlAttributeContext _localctx = new HtmlAttributeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_htmlAttribute);
		try {
			setState(121);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(116); htmlAttributeName();
				setState(117); match(TAG_EQUALS);
				setState(118); htmlAttributeValue();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(120); htmlAttributeName();
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

	public static class HtmlAttributeNameContext extends ParserRuleContext {
		public TerminalNode TAG_NAME() { return getToken(HTMLParser.TAG_NAME, 0); }
		public HtmlAttributeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlAttributeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterHtmlAttributeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitHtmlAttributeName(this);
		}
	}

	public final HtmlAttributeNameContext htmlAttributeName() throws RecognitionException {
		HtmlAttributeNameContext _localctx = new HtmlAttributeNameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_htmlAttributeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123); match(TAG_NAME);
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

	public static class HtmlAttributeValueContext extends ParserRuleContext {
		public TerminalNode TAG_VALUE() { return getToken(HTMLParser.TAG_VALUE, 0); }
		public HtmlAttributeValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlAttributeValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterHtmlAttributeValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitHtmlAttributeValue(this);
		}
	}

	public final HtmlAttributeValueContext htmlAttributeValue() throws RecognitionException {
		HtmlAttributeValueContext _localctx = new HtmlAttributeValueContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_htmlAttributeValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125); match(TAG_VALUE);
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

	public static class HtmlTagNameContext extends ParserRuleContext {
		public TerminalNode TAG_NAME() { return getToken(HTMLParser.TAG_NAME, 0); }
		public HtmlTagNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlTagName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterHtmlTagName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitHtmlTagName(this);
		}
	}

	public final HtmlTagNameContext htmlTagName() throws RecognitionException {
		HtmlTagNameContext _localctx = new HtmlTagNameContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_htmlTagName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127); match(TAG_NAME);
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

	public static class HtmlChardataContext extends ParserRuleContext {
		public TerminalNode SEA_WS() { return getToken(HTMLParser.SEA_WS, 0); }
		public TerminalNode HTML_TEXT() { return getToken(HTMLParser.HTML_TEXT, 0); }
		public HtmlChardataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlChardata; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterHtmlChardata(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitHtmlChardata(this);
		}
	}

	public final HtmlChardataContext htmlChardata() throws RecognitionException {
		HtmlChardataContext _localctx = new HtmlChardataContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_htmlChardata);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			_la = _input.LA(1);
			if ( !(_la==SEA_WS || _la==HTML_TEXT) ) {
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

	public static class HtmlMiscContext extends ParserRuleContext {
		public TerminalNode SEA_WS() { return getToken(HTMLParser.SEA_WS, 0); }
		public HtmlCommentContext htmlComment() {
			return getRuleContext(HtmlCommentContext.class,0);
		}
		public HtmlMiscContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlMisc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterHtmlMisc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitHtmlMisc(this);
		}
	}

	public final HtmlMiscContext htmlMisc() throws RecognitionException {
		HtmlMiscContext _localctx = new HtmlMiscContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_htmlMisc);
		try {
			setState(133);
			switch (_input.LA(1)) {
			case HTML_COMMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(131); htmlComment();
				}
				break;
			case SEA_WS:
				enterOuterAlt(_localctx, 2);
				{
				setState(132); match(SEA_WS);
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

	public static class HtmlCommentContext extends ParserRuleContext {
		public TerminalNode HTML_COMMENT() { return getToken(HTMLParser.HTML_COMMENT, 0); }
		public HtmlCommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlComment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterHtmlComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitHtmlComment(this);
		}
	}

	public final HtmlCommentContext htmlComment() throws RecognitionException {
		HtmlCommentContext _localctx = new HtmlCommentContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_htmlComment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135); match(HTML_COMMENT);
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

	public static class XhtmlCDATAContext extends ParserRuleContext {
		public TerminalNode CDATA() { return getToken(HTMLParser.CDATA, 0); }
		public XhtmlCDATAContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xhtmlCDATA; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterXhtmlCDATA(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitXhtmlCDATA(this);
		}
	}

	public final XhtmlCDATAContext xhtmlCDATA() throws RecognitionException {
		XhtmlCDATAContext _localctx = new XhtmlCDATAContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_xhtmlCDATA);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137); match(CDATA);
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

	public static class DtdContext extends ParserRuleContext {
		public TerminalNode DTD() { return getToken(HTMLParser.DTD, 0); }
		public DtdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dtd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterDtd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitDtd(this);
		}
	}

	public final DtdContext dtd() throws RecognitionException {
		DtdContext _localctx = new DtdContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_dtd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139); match(DTD);
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

	public static class ScriptletContext extends ParserRuleContext {
		public TerminalNode SCRIPTLET() { return getToken(HTMLParser.SCRIPTLET, 0); }
		public ScriptletContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scriptlet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterScriptlet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitScriptlet(this);
		}
	}

	public final ScriptletContext scriptlet() throws RecognitionException {
		ScriptletContext _localctx = new ScriptletContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_scriptlet);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141); match(SCRIPTLET);
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

	public static class ScriptContext extends ParserRuleContext {
		public TerminalNode SCRIPT_OPEN() { return getToken(HTMLParser.SCRIPT_OPEN, 0); }
		public TerminalNode SCRIPT_BODY() { return getToken(HTMLParser.SCRIPT_BODY, 0); }
		public TerminalNode SCRIPT_SHORT_BODY() { return getToken(HTMLParser.SCRIPT_SHORT_BODY, 0); }
		public ScriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_script; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterScript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitScript(this);
		}
	}

	public final ScriptContext script() throws RecognitionException {
		ScriptContext _localctx = new ScriptContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_script);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143); match(SCRIPT_OPEN);
			setState(144);
			_la = _input.LA(1);
			if ( !(_la==SCRIPT_BODY || _la==SCRIPT_SHORT_BODY) ) {
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

	public static class StyleContext extends ParserRuleContext {
		public TerminalNode STYLE_SHORT_BODY() { return getToken(HTMLParser.STYLE_SHORT_BODY, 0); }
		public TerminalNode STYLE_BODY() { return getToken(HTMLParser.STYLE_BODY, 0); }
		public TerminalNode STYLE_OPEN() { return getToken(HTMLParser.STYLE_OPEN, 0); }
		public StyleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_style; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterStyle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitStyle(this);
		}
	}

	public final StyleContext style() throws RecognitionException {
		StyleContext _localctx = new StyleContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_style);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146); match(STYLE_OPEN);
			setState(147);
			_la = _input.LA(1);
			if ( !(_la==STYLE_BODY || _la==STYLE_SHORT_BODY) ) {
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

	public static class HrefContext extends ParserRuleContext {
		public TerminalNode HREF_OPEN() { return getToken(HTMLParser.HREF_OPEN, 0); }
		public TerminalNode HREF_BODY() { return getToken(HTMLParser.HREF_BODY, 0); }
		public TerminalNode HREF_UNCLOSED() { return getToken(HTMLParser.HREF_UNCLOSED, 0); }
		public TerminalNode HREF_SHORT_BODY() { return getToken(HTMLParser.HREF_SHORT_BODY, 0); }
		public HrefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_href; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterHref(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitHref(this);
		}
	}

	public final HrefContext href() throws RecognitionException {
		HrefContext _localctx = new HrefContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_href);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149); match(HREF_OPEN);
			setState(150);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << HREF_BODY) | (1L << HREF_SHORT_BODY) | (1L << HREF_UNCLOSED))) != 0)) ) {
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\32\u009b\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\5\2&\n\2\3\2\5\2)\n\2\3\2\7\2,\n\2\f\2\16\2/\13\2\3\3\7\3\62\n\3"+
		"\f\3\16\3\65\13\3\3\3\3\3\7\39\n\3\f\3\16\3<\13\3\3\4\3\4\3\4\7\4A\n\4"+
		"\f\4\16\4D\13\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4P\n\4\f\4\16"+
		"\4S\13\4\3\4\3\4\3\4\3\4\3\4\7\4Z\n\4\f\4\16\4]\13\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\5\4e\n\4\3\5\5\5h\n\5\3\5\3\5\3\5\5\5m\n\5\3\5\5\5p\n\5\7\5r\n"+
		"\5\f\5\16\5u\13\5\3\6\3\6\3\6\3\6\3\6\5\6|\n\6\3\7\3\7\3\b\3\b\3\t\3\t"+
		"\3\n\3\n\3\13\3\13\5\13\u0088\n\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\2\2\23\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"\2\6\4\2\7\7\f\f\3\2\24\25\3\2\26\27\3\2"+
		"\30\32\u009e\2%\3\2\2\2\4\63\3\2\2\2\6d\3\2\2\2\bg\3\2\2\2\n{\3\2\2\2"+
		"\f}\3\2\2\2\16\177\3\2\2\2\20\u0081\3\2\2\2\22\u0083\3\2\2\2\24\u0087"+
		"\3\2\2\2\26\u0089\3\2\2\2\30\u008b\3\2\2\2\32\u008d\3\2\2\2\34\u008f\3"+
		"\2\2\2\36\u0091\3\2\2\2 \u0094\3\2\2\2\"\u0097\3\2\2\2$&\7\7\2\2%$\3\2"+
		"\2\2%&\3\2\2\2&(\3\2\2\2\')\5\32\16\2(\'\3\2\2\2()\3\2\2\2)-\3\2\2\2*"+
		",\5\4\3\2+*\3\2\2\2,/\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\3\3\2\2\2/-\3\2\2\2"+
		"\60\62\5\24\13\2\61\60\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2"+
		"\2\64\66\3\2\2\2\65\63\3\2\2\2\66:\5\6\4\2\679\5\24\13\28\67\3\2\2\29"+
		"<\3\2\2\2:8\3\2\2\2:;\3\2\2\2;\5\3\2\2\2<:\3\2\2\2=>\7\13\2\2>B\5\20\t"+
		"\2?A\5\n\6\2@?\3\2\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2CE\3\2\2\2DB\3\2\2"+
		"\2EF\7\r\2\2FG\5\b\5\2GH\7\13\2\2HI\7\17\2\2IJ\5\20\t\2JK\7\r\2\2Ke\3"+
		"\2\2\2LM\7\13\2\2MQ\5\20\t\2NP\5\n\6\2ON\3\2\2\2PS\3\2\2\2QO\3\2\2\2Q"+
		"R\3\2\2\2RT\3\2\2\2SQ\3\2\2\2TU\7\16\2\2Ue\3\2\2\2VW\7\13\2\2W[\5\20\t"+
		"\2XZ\5\n\6\2YX\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\^\3\2\2\2][\3\2"+
		"\2\2^_\7\r\2\2_e\3\2\2\2`e\5\34\17\2ae\5\36\20\2be\5 \21\2ce\5\"\22\2"+
		"d=\3\2\2\2dL\3\2\2\2dV\3\2\2\2d`\3\2\2\2da\3\2\2\2db\3\2\2\2dc\3\2\2\2"+
		"e\7\3\2\2\2fh\5\22\n\2gf\3\2\2\2gh\3\2\2\2hs\3\2\2\2im\5\6\4\2jm\5\30"+
		"\r\2km\5\26\f\2li\3\2\2\2lj\3\2\2\2lk\3\2\2\2mo\3\2\2\2np\5\22\n\2on\3"+
		"\2\2\2op\3\2\2\2pr\3\2\2\2ql\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2t\t"+
		"\3\2\2\2us\3\2\2\2vw\5\f\7\2wx\7\20\2\2xy\5\16\b\2y|\3\2\2\2z|\5\f\7\2"+
		"{v\3\2\2\2{z\3\2\2\2|\13\3\2\2\2}~\7\22\2\2~\r\3\2\2\2\177\u0080\7\21"+
		"\2\2\u0080\17\3\2\2\2\u0081\u0082\7\22\2\2\u0082\21\3\2\2\2\u0083\u0084"+
		"\t\2\2\2\u0084\23\3\2\2\2\u0085\u0088\5\26\f\2\u0086\u0088\7\7\2\2\u0087"+
		"\u0085\3\2\2\2\u0087\u0086\3\2\2\2\u0088\25\3\2\2\2\u0089\u008a\7\3\2"+
		"\2\u008a\27\3\2\2\2\u008b\u008c\7\4\2\2\u008c\31\3\2\2\2\u008d\u008e\7"+
		"\5\2\2\u008e\33\3\2\2\2\u008f\u0090\7\6\2\2\u0090\35\3\2\2\2\u0091\u0092"+
		"\7\b\2\2\u0092\u0093\t\3\2\2\u0093\37\3\2\2\2\u0094\u0095\7\t\2\2\u0095"+
		"\u0096\t\4\2\2\u0096!\3\2\2\2\u0097\u0098\7\n\2\2\u0098\u0099\t\5\2\2"+
		"\u0099#\3\2\2\2\21%(-\63:BQ[dglos{\u0087";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}