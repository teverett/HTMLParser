// Generated from com/khubla/htmlparser/grammar/HTMLParser.g4 by ANTLR 4.2
package com.khubla.htmlparser.grammar;

import java.util.List;

import org.antlr.v4.runtime.NoViableAltException;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;

@SuppressWarnings({ "all", "warnings", "unchecked", "unused", "cast" })
public class HTMLParser extends Parser {
   public static class HtmlAttributeContext extends ParserRuleContext {
      public HtmlAttributeContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof HTMLParserListener) {
            ((HTMLParserListener) listener).enterHtmlAttribute(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof HTMLParserListener) {
            ((HTMLParserListener) listener).exitHtmlAttribute(this);
         }
      }

      @Override
      public int getRuleIndex() {
         return RULE_htmlAttribute;
      }

      public TerminalNode HTML_EQUALS() {
         return getToken(HTMLParser.HTML_EQUALS, 0);
      }

      public TerminalNode HTML_Name() {
         return getToken(HTMLParser.HTML_Name, 0);
      }

      public TerminalNode HTML_STRING() {
         return getToken(HTMLParser.HTML_STRING, 0);
      }
   }

   public static class HtmlChardataContext extends ParserRuleContext {
      public HtmlChardataContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof HTMLParserListener) {
            ((HTMLParserListener) listener).enterHtmlChardata(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof HTMLParserListener) {
            ((HTMLParserListener) listener).exitHtmlChardata(this);
         }
      }

      @Override
      public int getRuleIndex() {
         return RULE_htmlChardata;
      }

      public TerminalNode HTML_TEXT() {
         return getToken(HTMLParser.HTML_TEXT, 0);
      }

      public TerminalNode SEA_WS() {
         return getToken(HTMLParser.SEA_WS, 0);
      }
   }

   public static class HtmlCommentContext extends ParserRuleContext {
      public HtmlCommentContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof HTMLParserListener) {
            ((HTMLParserListener) listener).enterHtmlComment(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof HTMLParserListener) {
            ((HTMLParserListener) listener).exitHtmlComment(this);
         }
      }

      @Override
      public int getRuleIndex() {
         return RULE_htmlComment;
      }

      public TerminalNode HTML_COMMENT() {
         return getToken(HTMLParser.HTML_COMMENT, 0);
      }
   }

   public static class HtmlContentContext extends ParserRuleContext {
      public HtmlContentContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof HTMLParserListener) {
            ((HTMLParserListener) listener).enterHtmlContent(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof HTMLParserListener) {
            ((HTMLParserListener) listener).exitHtmlContent(this);
         }
      }

      @Override
      public int getRuleIndex() {
         return RULE_htmlContent;
      }

      public List<HtmlChardataContext> htmlChardata() {
         return getRuleContexts(HtmlChardataContext.class);
      }

      public HtmlChardataContext htmlChardata(int i) {
         return getRuleContext(HtmlChardataContext.class, i);
      }

      public List<HtmlCommentContext> htmlComment() {
         return getRuleContexts(HtmlCommentContext.class);
      }

      public HtmlCommentContext htmlComment(int i) {
         return getRuleContext(HtmlCommentContext.class, i);
      }

      public List<HtmlElementContext> htmlElement() {
         return getRuleContexts(HtmlElementContext.class);
      }

      public HtmlElementContext htmlElement(int i) {
         return getRuleContext(HtmlElementContext.class, i);
      }

      public List<HtmlReferenceContext> htmlReference() {
         return getRuleContexts(HtmlReferenceContext.class);
      }

      public HtmlReferenceContext htmlReference(int i) {
         return getRuleContext(HtmlReferenceContext.class, i);
      }
   }

   public static class HtmlDocumentContext extends ParserRuleContext {
      public HtmlDocumentContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof HTMLParserListener) {
            ((HTMLParserListener) listener).enterHtmlDocument(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof HTMLParserListener) {
            ((HTMLParserListener) listener).exitHtmlDocument(this);
         }
      }

      @Override
      public int getRuleIndex() {
         return RULE_htmlDocument;
      }

      public TerminalNode HTML_DTD() {
         return getToken(HTMLParser.HTML_DTD, 0);
      }

      public List<HtmlElementsContext> htmlElements() {
         return getRuleContexts(HtmlElementsContext.class);
      }

      public HtmlElementsContext htmlElements(int i) {
         return getRuleContext(HtmlElementsContext.class, i);
      }
   }

   public static class HtmlElementContext extends ParserRuleContext {
      public HtmlElementContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof HTMLParserListener) {
            ((HTMLParserListener) listener).enterHtmlElement(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof HTMLParserListener) {
            ((HTMLParserListener) listener).exitHtmlElement(this);
         }
      }

      @Override
      public int getRuleIndex() {
         return RULE_htmlElement;
      }

      public List<TerminalNode> HTML_Name() {
         return getTokens(HTMLParser.HTML_Name);
      }

      public TerminalNode HTML_Name(int i) {
         return getToken(HTMLParser.HTML_Name, i);
      }

      public TerminalNode HTML_SLASH() {
         return getToken(HTMLParser.HTML_SLASH, 0);
      }

      public List<HtmlAttributeContext> htmlAttribute() {
         return getRuleContexts(HtmlAttributeContext.class);
      }

      public HtmlAttributeContext htmlAttribute(int i) {
         return getRuleContext(HtmlAttributeContext.class, i);
      }

      public HtmlContentContext htmlContent() {
         return getRuleContext(HtmlContentContext.class, 0);
      }
   }

   public static class HtmlElementsContext extends ParserRuleContext {
      public HtmlElementsContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof HTMLParserListener) {
            ((HTMLParserListener) listener).enterHtmlElements(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof HTMLParserListener) {
            ((HTMLParserListener) listener).exitHtmlElements(this);
         }
      }

      @Override
      public int getRuleIndex() {
         return RULE_htmlElements;
      }

      public HtmlElementContext htmlElement() {
         return getRuleContext(HtmlElementContext.class, 0);
      }

      public List<HtmlMiscContext> htmlMisc() {
         return getRuleContexts(HtmlMiscContext.class);
      }

      public HtmlMiscContext htmlMisc(int i) {
         return getRuleContext(HtmlMiscContext.class, i);
      }
   }

   public static class HtmlMiscContext extends ParserRuleContext {
      public HtmlMiscContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof HTMLParserListener) {
            ((HTMLParserListener) listener).enterHtmlMisc(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof HTMLParserListener) {
            ((HTMLParserListener) listener).exitHtmlMisc(this);
         }
      }

      @Override
      public int getRuleIndex() {
         return RULE_htmlMisc;
      }

      public HtmlCommentContext htmlComment() {
         return getRuleContext(HtmlCommentContext.class, 0);
      }

      public TerminalNode SEA_WS() {
         return getToken(HTMLParser.SEA_WS, 0);
      }
   }

   public static class HtmlReferenceContext extends ParserRuleContext {
      public HtmlReferenceContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof HTMLParserListener) {
            ((HTMLParserListener) listener).enterHtmlReference(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof HTMLParserListener) {
            ((HTMLParserListener) listener).exitHtmlReference(this);
         }
      }

      @Override
      public int getRuleIndex() {
         return RULE_htmlReference;
      }

      public TerminalNode HTML_CharRef() {
         return getToken(HTMLParser.HTML_CharRef, 0);
      }

      public TerminalNode HTML_EntityRef() {
         return getToken(HTMLParser.HTML_EntityRef, 0);
      }
   }

   protected static final DFA[] _decisionToDFA;
   protected static final PredictionContextCache _sharedContextCache = new PredictionContextCache();
   public static final int OPEN = 6, SEA_WS = 5, HTML_DTD = 2, HTML_STRING = 12, HTML_EntityRef = 3, HTML_Name = 13, HTML_SLASH = 10, HTML_CharRef = 4, HTML_SLASH_CLOSE = 9, HTML_COMMENT = 1,
         HTML_TEXT = 7, S = 14, HTML_EQUALS = 11, HTML_CLOSE = 8;
   public static final String[] tokenNames = { "<INVALID>", "HTML_COMMENT", "HTML_DTD", "HTML_EntityRef", "HTML_CharRef", "SEA_WS", "'<'", "HTML_TEXT", "'>'", "'/>'", "'/'", "'='", "HTML_STRING",
         "HTML_Name", "S" };
   public static final int RULE_htmlDocument = 0, RULE_htmlElements = 1, RULE_htmlElement = 2, RULE_htmlContent = 3, RULE_htmlReference = 4, RULE_htmlAttribute = 5, RULE_htmlChardata = 6,
         RULE_htmlMisc = 7, RULE_htmlComment = 8;
   public static final String[] ruleNames = { "htmlDocument", "htmlElements", "htmlElement", "htmlContent", "htmlReference", "htmlAttribute", "htmlChardata", "htmlMisc", "htmlComment" };
   public static final String _serializedATN = "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\20c\4\2\t\2\4\3\t" + "\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\5\2\26"
         + "\n\2\3\2\7\2\31\n\2\f\2\16\2\34\13\2\3\3\7\3\37\n\3\f\3\16\3\"\13\3\3" + "\3\3\3\7\3&\n\3\f\3\16\3)\13\3\3\4\3\4\3\4\7\4.\n\4\f\4\16\4\61\13\4\3"
         + "\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4=\n\4\f\4\16\4@\13\4\3\4\5\4" + "C\n\4\3\5\5\5F\n\5\3\5\3\5\3\5\5\5K\n\5\3\5\5\5N\n\5\7\5P\n\5\f\5\16\5"
         + "S\13\5\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\5\t_\n\t\3\n\3\n\3\n\2" + "\2\13\2\4\6\b\n\f\16\20\22\2\4\3\2\5\6\4\2\7\7\t\tf\2\25\3\2\2\2\4 \3"
         + "\2\2\2\6B\3\2\2\2\bE\3\2\2\2\nT\3\2\2\2\fV\3\2\2\2\16Z\3\2\2\2\20^\3\2" + "\2\2\22`\3\2\2\2\24\26\7\4\2\2\25\24\3\2\2\2\25\26\3\2\2\2\26\32\3\2\2"
         + "\2\27\31\5\4\3\2\30\27\3\2\2\2\31\34\3\2\2\2\32\30\3\2\2\2\32\33\3\2\2" + "\2\33\3\3\2\2\2\34\32\3\2\2\2\35\37\5\20\t\2\36\35\3\2\2\2\37\"\3\2\2"
         + "\2 \36\3\2\2\2 !\3\2\2\2!#\3\2\2\2\" \3\2\2\2#\'\5\6\4\2$&\5\20\t\2%$" + "\3\2\2\2&)\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2(\5\3\2\2\2)\'\3\2\2\2*+\7\b\2"
         + "\2+/\7\17\2\2,.\5\f\7\2-,\3\2\2\2.\61\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60" + "\62\3\2\2\2\61/\3\2\2\2\62\63\7\n\2\2\63\64\5\b\5\2\64\65\7\b\2\2\65\66"
         + "\7\f\2\2\66\67\7\17\2\2\678\7\n\2\28C\3\2\2\29:\7\b\2\2:>\7\17\2\2;=\5" + "\f\7\2<;\3\2\2\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2?A\3\2\2\2@>\3\2\2\2AC\7"
         + "\13\2\2B*\3\2\2\2B9\3\2\2\2C\7\3\2\2\2DF\5\16\b\2ED\3\2\2\2EF\3\2\2\2" + "FQ\3\2\2\2GK\5\6\4\2HK\5\n\6\2IK\5\22\n\2JG\3\2\2\2JH\3\2\2\2JI\3\2\2"
         + "\2KM\3\2\2\2LN\5\16\b\2ML\3\2\2\2MN\3\2\2\2NP\3\2\2\2OJ\3\2\2\2PS\3\2" + "\2\2QO\3\2\2\2QR\3\2\2\2R\t\3\2\2\2SQ\3\2\2\2TU\t\2\2\2U\13\3\2\2\2VW"
         + "\7\17\2\2WX\7\r\2\2XY\7\16\2\2Y\r\3\2\2\2Z[\t\3\2\2[\17\3\2\2\2\\_\5\22" + "\n\2]_\7\7\2\2^\\\3\2\2\2^]\3\2\2\2_\21\3\2\2\2`a\7\3\2\2a\23\3\2\2\2" + "\16\25\32 \'/>BEJMQ^";
   public static final ATN _ATN = new ATNDeserializer().deserialize(_serializedATN.toCharArray());
   static {
      _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
      for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
         _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
      }
   }

   public HTMLParser(TokenStream input) {
      super(input);
      _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
   }

   @Override
   public ATN getATN() {
      return _ATN;
   }

   @Override
   public String getGrammarFileName() {
      return "HTMLParser.g4";
   }

   @Override
   public String[] getRuleNames() {
      return ruleNames;
   }

   @Override
   public String getSerializedATN() {
      return _serializedATN;
   }

   @Override
   public String[] getTokenNames() {
      return tokenNames;
   }

   public final HtmlAttributeContext htmlAttribute() throws RecognitionException {
      final HtmlAttributeContext _localctx = new HtmlAttributeContext(_ctx, getState());
      enterRule(_localctx, 10, RULE_htmlAttribute);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(84);
            match(HTML_Name);
            setState(85);
            match(HTML_EQUALS);
            setState(86);
            match(HTML_STRING);
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final HtmlChardataContext htmlChardata() throws RecognitionException {
      final HtmlChardataContext _localctx = new HtmlChardataContext(_ctx, getState());
      enterRule(_localctx, 12, RULE_htmlChardata);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(88);
            _la = _input.LA(1);
            if (!((_la == SEA_WS) || (_la == HTML_TEXT))) {
               _errHandler.recoverInline(this);
            }
            consume();
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final HtmlCommentContext htmlComment() throws RecognitionException {
      final HtmlCommentContext _localctx = new HtmlCommentContext(_ctx, getState());
      enterRule(_localctx, 16, RULE_htmlComment);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(94);
            match(HTML_COMMENT);
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final HtmlContentContext htmlContent() throws RecognitionException {
      final HtmlContentContext _localctx = new HtmlContentContext(_ctx, getState());
      enterRule(_localctx, 6, RULE_htmlContent);
      int _la;
      try {
         int _alt;
         enterOuterAlt(_localctx, 1);
         {
            setState(67);
            _la = _input.LA(1);
            if ((_la == SEA_WS) || (_la == HTML_TEXT)) {
               {
                  setState(66);
                  htmlChardata();
               }
            }
            setState(79);
            _errHandler.sync(this);
            _alt = getInterpreter().adaptivePredict(_input, 10, _ctx);
            while ((_alt != 2) && (_alt != -1)) {
               if (_alt == 1) {
                  {
                     {
                        setState(72);
                        switch (_input.LA(1)) {
                           case OPEN: {
                              setState(69);
                              htmlElement();
                           }
                              break;
                           case HTML_EntityRef:
                           case HTML_CharRef: {
                              setState(70);
                              htmlReference();
                           }
                              break;
                           case HTML_COMMENT: {
                              setState(71);
                              htmlComment();
                           }
                              break;
                           default:
                              throw new NoViableAltException(this);
                        }
                        setState(75);
                        _la = _input.LA(1);
                        if ((_la == SEA_WS) || (_la == HTML_TEXT)) {
                           {
                              setState(74);
                              htmlChardata();
                           }
                        }
                     }
                  }
               }
               setState(81);
               _errHandler.sync(this);
               _alt = getInterpreter().adaptivePredict(_input, 10, _ctx);
            }
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final HtmlDocumentContext htmlDocument() throws RecognitionException {
      final HtmlDocumentContext _localctx = new HtmlDocumentContext(_ctx, getState());
      enterRule(_localctx, 0, RULE_htmlDocument);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(19);
            _la = _input.LA(1);
            if (_la == HTML_DTD) {
               {
                  setState(18);
                  match(HTML_DTD);
               }
            }
            setState(24);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (((((_la) & ~0x3f) == 0) && (((1L << _la) & ((1L << HTML_COMMENT) | (1L << SEA_WS) | (1L << OPEN))) != 0))) {
               {
                  {
                     setState(21);
                     htmlElements();
                  }
               }
               setState(26);
               _errHandler.sync(this);
               _la = _input.LA(1);
            }
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final HtmlElementContext htmlElement() throws RecognitionException {
      final HtmlElementContext _localctx = new HtmlElementContext(_ctx, getState());
      enterRule(_localctx, 4, RULE_htmlElement);
      int _la;
      try {
         setState(64);
         switch (getInterpreter().adaptivePredict(_input, 6, _ctx)) {
            case 1:
               enterOuterAlt(_localctx, 1);
               {
                  setState(40);
                  match(OPEN);
                  setState(41);
                  match(HTML_Name);
                  setState(45);
                  _errHandler.sync(this);
                  _la = _input.LA(1);
                  while (_la == HTML_Name) {
                     {
                        {
                           setState(42);
                           htmlAttribute();
                        }
                     }
                     setState(47);
                     _errHandler.sync(this);
                     _la = _input.LA(1);
                  }
                  setState(48);
                  match(HTML_CLOSE);
                  setState(49);
                  htmlContent();
                  setState(50);
                  match(OPEN);
                  setState(51);
                  match(HTML_SLASH);
                  setState(52);
                  match(HTML_Name);
                  setState(53);
                  match(HTML_CLOSE);
               }
               break;
            case 2:
               enterOuterAlt(_localctx, 2);
               {
                  setState(55);
                  match(OPEN);
                  setState(56);
                  match(HTML_Name);
                  setState(60);
                  _errHandler.sync(this);
                  _la = _input.LA(1);
                  while (_la == HTML_Name) {
                     {
                        {
                           setState(57);
                           htmlAttribute();
                        }
                     }
                     setState(62);
                     _errHandler.sync(this);
                     _la = _input.LA(1);
                  }
                  setState(63);
                  match(HTML_SLASH_CLOSE);
               }
               break;
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final HtmlElementsContext htmlElements() throws RecognitionException {
      final HtmlElementsContext _localctx = new HtmlElementsContext(_ctx, getState());
      enterRule(_localctx, 2, RULE_htmlElements);
      int _la;
      try {
         int _alt;
         enterOuterAlt(_localctx, 1);
         {
            setState(30);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while ((_la == HTML_COMMENT) || (_la == SEA_WS)) {
               {
                  {
                     setState(27);
                     htmlMisc();
                  }
               }
               setState(32);
               _errHandler.sync(this);
               _la = _input.LA(1);
            }
            setState(33);
            htmlElement();
            setState(37);
            _errHandler.sync(this);
            _alt = getInterpreter().adaptivePredict(_input, 3, _ctx);
            while ((_alt != 2) && (_alt != -1)) {
               if (_alt == 1) {
                  {
                     {
                        setState(34);
                        htmlMisc();
                     }
                  }
               }
               setState(39);
               _errHandler.sync(this);
               _alt = getInterpreter().adaptivePredict(_input, 3, _ctx);
            }
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final HtmlMiscContext htmlMisc() throws RecognitionException {
      final HtmlMiscContext _localctx = new HtmlMiscContext(_ctx, getState());
      enterRule(_localctx, 14, RULE_htmlMisc);
      try {
         setState(92);
         switch (_input.LA(1)) {
            case HTML_COMMENT:
               enterOuterAlt(_localctx, 1);
               {
                  setState(90);
                  htmlComment();
               }
               break;
            case SEA_WS:
               enterOuterAlt(_localctx, 2);
               {
                  setState(91);
                  match(SEA_WS);
               }
               break;
            default:
               throw new NoViableAltException(this);
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final HtmlReferenceContext htmlReference() throws RecognitionException {
      final HtmlReferenceContext _localctx = new HtmlReferenceContext(_ctx, getState());
      enterRule(_localctx, 8, RULE_htmlReference);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(82);
            _la = _input.LA(1);
            if (!((_la == HTML_EntityRef) || (_la == HTML_CharRef))) {
               _errHandler.recoverInline(this);
            }
            consume();
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }
}