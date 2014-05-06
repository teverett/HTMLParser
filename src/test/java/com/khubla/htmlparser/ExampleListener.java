package com.khubla.htmlparser;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import com.khubla.htmlparser.grammar.HTMLParser.DtdContext;
import com.khubla.htmlparser.grammar.HTMLParser.HtmlAttributeContext;
import com.khubla.htmlparser.grammar.HTMLParser.HtmlAttributeNameContext;
import com.khubla.htmlparser.grammar.HTMLParser.HtmlAttributeValueContext;
import com.khubla.htmlparser.grammar.HTMLParser.HtmlChardataContext;
import com.khubla.htmlparser.grammar.HTMLParser.HtmlCommentContext;
import com.khubla.htmlparser.grammar.HTMLParser.HtmlContentContext;
import com.khubla.htmlparser.grammar.HTMLParser.HtmlDocumentContext;
import com.khubla.htmlparser.grammar.HTMLParser.HtmlElementContext;
import com.khubla.htmlparser.grammar.HTMLParser.HtmlElementsContext;
import com.khubla.htmlparser.grammar.HTMLParser.HtmlMiscContext;
import com.khubla.htmlparser.grammar.HTMLParser.HtmlTagNameContext;
import com.khubla.htmlparser.grammar.HTMLParser.ScriptContext;
import com.khubla.htmlparser.grammar.HTMLParser.ScriptletContext;
import com.khubla.htmlparser.grammar.HTMLParser.StyleContext;
import com.khubla.htmlparser.grammar.HTMLParser.XhtmlCDATAContext;
import com.khubla.htmlparser.grammar.HTMLParserListener;

/**
 * @author tom
 */
public class ExampleListener implements HTMLParserListener {
   @Override
   public void enterDtd(DtdContext ctx) {
      // TODO Auto-generated method stub
   }

   @Override
   public void enterEveryRule(ParserRuleContext arg0) {
      // TODO Auto-generated method stub
   }

   @Override
   public void enterHtmlAttribute(HtmlAttributeContext ctx) {
      // TODO Auto-generated method stub
   }

   @Override
   public void enterHtmlAttributeName(HtmlAttributeNameContext ctx) {
      // TODO Auto-generated method stub
   }

   @Override
   public void enterHtmlAttributeValue(HtmlAttributeValueContext ctx) {
      // TODO Auto-generated method stub
   }

   @Override
   public void enterHtmlChardata(HtmlChardataContext ctx) {
      // TODO Auto-generated method stub
   }

   @Override
   public void enterHtmlComment(HtmlCommentContext ctx) {
      // TODO Auto-generated method stub
   }

   @Override
   public void enterHtmlContent(HtmlContentContext ctx) {
      // TODO Auto-generated method stub
   }

   @Override
   public void enterHtmlDocument(HtmlDocumentContext ctx) {
      // TODO Auto-generated method stub
   }

   @Override
   public void enterHtmlElement(HtmlElementContext ctx) {
      // TODO Auto-generated method stub
   }

   @Override
   public void enterHtmlElements(HtmlElementsContext ctx) {
      // TODO Auto-generated method stub
   }

   @Override
   public void enterHtmlMisc(HtmlMiscContext ctx) {
      // TODO Auto-generated method stub
   }

   @Override
   public void enterHtmlTagName(HtmlTagNameContext ctx) {
      // TODO Auto-generated method stub
   }

   @Override
   public void enterScript(ScriptContext ctx) {
      // TODO Auto-generated method stub
   }

   @Override
   public void enterScriptlet(ScriptletContext ctx) {
      // TODO Auto-generated method stub
   }

   @Override
   public void enterStyle(StyleContext ctx) {
      // TODO Auto-generated method stub
   }

   @Override
   public void enterXhtmlCDATA(XhtmlCDATAContext ctx) {
      // TODO Auto-generated method stub
   }

   @Override
   public void exitDtd(DtdContext ctx) {
      // TODO Auto-generated method stub
   }

   @Override
   public void exitEveryRule(ParserRuleContext arg0) {
      // TODO Auto-generated method stub
   }

   @Override
   public void exitHtmlAttribute(HtmlAttributeContext ctx) {
      // TODO Auto-generated method stub
   }

   @Override
   public void exitHtmlAttributeName(HtmlAttributeNameContext ctx) {
      // TODO Auto-generated method stub
   }

   @Override
   public void exitHtmlAttributeValue(HtmlAttributeValueContext ctx) {
      // TODO Auto-generated method stub
   }

   @Override
   public void exitHtmlChardata(HtmlChardataContext ctx) {
      // TODO Auto-generated method stub
   }

   @Override
   public void exitHtmlComment(HtmlCommentContext ctx) {
      // TODO Auto-generated method stub
   }

   @Override
   public void exitHtmlContent(HtmlContentContext ctx) {
      // TODO Auto-generated method stub
   }

   @Override
   public void exitHtmlDocument(HtmlDocumentContext ctx) {
      // TODO Auto-generated method stub
   }

   @Override
   public void exitHtmlElement(HtmlElementContext ctx) {
      // TODO Auto-generated method stub
   }

   @Override
   public void exitHtmlElements(HtmlElementsContext ctx) {
      // TODO Auto-generated method stub
   }

   @Override
   public void exitHtmlMisc(HtmlMiscContext ctx) {
      // TODO Auto-generated method stub
   }

   @Override
   public void exitHtmlTagName(HtmlTagNameContext ctx) {
      // TODO Auto-generated method stub
   }

   @Override
   public void exitScript(ScriptContext ctx) {
      // TODO Auto-generated method stub
   }

   @Override
   public void exitScriptlet(ScriptletContext ctx) {
      // TODO Auto-generated method stub
   }

   @Override
   public void exitStyle(StyleContext ctx) {
      // TODO Auto-generated method stub
   }

   @Override
   public void exitXhtmlCDATA(XhtmlCDATAContext ctx) {
      // TODO Auto-generated method stub
   }

   @Override
   public void visitErrorNode(ErrorNode arg0) {
      // TODO Auto-generated method stub
   }

   @Override
   public void visitTerminal(TerminalNode arg0) {
      // TODO Auto-generated method stub
   }
}
