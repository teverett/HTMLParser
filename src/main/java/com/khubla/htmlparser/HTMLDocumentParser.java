package com.khubla.htmlparser;

import java.io.InputStream;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import com.khubla.htmlparser.grammar.HTMLLexer;
import com.khubla.htmlparser.grammar.HTMLParser;
import com.khubla.htmlparser.grammar.HTMLParser.HtmlDocumentContext;
import com.khubla.htmlparser.grammar.HTMLParserListener;

/**
 * @author tom
 */
public class HTMLDocumentParser {
   /**
    * parse an HTML document and return an instance of HtmlDocumentContext
    */
   public static HtmlDocumentContext parse(InputStream inputStream) throws Exception {
      try {
         final HTMLLexer htmlLexer = new HTMLLexer(CharStreams.fromStream(inputStream));
         final CommonTokenStream tokens = new CommonTokenStream(htmlLexer);
         final HTMLParser htmlParser = new HTMLParser(tokens);
         return htmlParser.htmlDocument();
      } catch (final Exception e) {
         throw new Exception("Exception in parse", e);
      }
   }

   /**
    * parse an HTML document using an listener
    */
   public static void parse(InputStream inputStream, HTMLParserListener htmlParserListener) throws Exception {
      try {
         final HTMLLexer htmlLexer = new HTMLLexer(CharStreams.fromStream(inputStream));
         final CommonTokenStream tokens = new CommonTokenStream(htmlLexer);
         final HTMLParser htmlParser = new HTMLParser(tokens);
         final HtmlDocumentContext htmlDocumentContext = htmlParser.htmlDocument();
         final ParseTreeWalker walker = new ParseTreeWalker();
         walker.walk(htmlParserListener, htmlDocumentContext);
      } catch (final Exception e) {
         throw new Exception("Exception in parse", e);
      }
   }
}
