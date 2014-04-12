package com.khubla.htmlparser;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import com.khubla.htmlparser.grammar.HTMLParser.HtmlAttributeContext;
import com.khubla.htmlparser.grammar.HTMLParser.HtmlChardataContext;
import com.khubla.htmlparser.grammar.HTMLParser.HtmlCommentContext;
import com.khubla.htmlparser.grammar.HTMLParser.HtmlContentContext;
import com.khubla.htmlparser.grammar.HTMLParser.HtmlDocumentContext;
import com.khubla.htmlparser.grammar.HTMLParser.HtmlElementContext;
import com.khubla.htmlparser.grammar.HTMLParser.HtmlElementsContext;
import com.khubla.htmlparser.grammar.HTMLParser.HtmlMiscContext;
import com.khubla.htmlparser.grammar.HTMLParser.HtmlReferenceContext;
import com.khubla.htmlparser.grammar.HTMLParserListener;

/**
 * @author tom
 */
public class ExampleListener implements HTMLParserListener {
   @Override
   public void enterEveryRule(ParserRuleContext arg0) {
      System.out.println("enterEveryRule");
   }

   @Override
   public void enterHtmlAttribute(HtmlAttributeContext ctx) {
      System.out.println("enterHtmlAttribute");
   }

   @Override
   public void enterHtmlChardata(HtmlChardataContext ctx) {
      System.out.println("enterHtmlChardata");
   }

   @Override
   public void enterHtmlComment(HtmlCommentContext ctx) {
      System.out.println("enterHtmlComment");
   }

   @Override
   public void enterHtmlContent(HtmlContentContext ctx) {
      System.out.println("enterHtmlContent");
   }

   @Override
   public void enterHtmlDocument(HtmlDocumentContext ctx) {
      System.out.println("enterHtmlDocument");
   }

   @Override
   public void enterHtmlElement(HtmlElementContext ctx) {
      System.out.println("enterHtmlElement");
   }

   @Override
   public void enterHtmlElements(HtmlElementsContext ctx) {
      System.out.println("enterHtmlElements");
   }

   @Override
   public void enterHtmlMisc(HtmlMiscContext ctx) {
      System.out.println("enterHtmlMisc");
   }

   @Override
   public void enterHtmlReference(HtmlReferenceContext ctx) {
      System.out.println("enterHtmlReference");
   }

   @Override
   public void exitEveryRule(ParserRuleContext arg0) {
      System.out.println("exitEveryRule");
   }

   @Override
   public void exitHtmlAttribute(HtmlAttributeContext ctx) {
      System.out.println("exitHtmlAttribute");
   }

   @Override
   public void exitHtmlChardata(HtmlChardataContext ctx) {
      System.out.println("exitHtmlChardata");
   }

   @Override
   public void exitHtmlComment(HtmlCommentContext ctx) {
      System.out.println("exitHtmlComment");
   }

   @Override
   public void exitHtmlContent(HtmlContentContext ctx) {
      System.out.println("exitHtmlContent");
   }

   @Override
   public void exitHtmlDocument(HtmlDocumentContext ctx) {
      System.out.println("exitHtmlDocument");
   }

   @Override
   public void exitHtmlElement(HtmlElementContext ctx) {
      System.out.println("exitHtmlElement");
   }

   @Override
   public void exitHtmlElements(HtmlElementsContext ctx) {
      System.out.println("exitHtmlElements");
   }

   @Override
   public void exitHtmlMisc(HtmlMiscContext ctx) {
      System.out.println("exitHtmlMisc");
   }

   @Override
   public void exitHtmlReference(HtmlReferenceContext ctx) {
      System.out.println("exitHtmlReference");
   }

   @Override
   public void visitErrorNode(ErrorNode arg0) {
      System.out.println("visitErrorNode");
   }

   @Override
   public void visitTerminal(TerminalNode arg0) {
      System.out.println("visitTerminal");
   }
}
