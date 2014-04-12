package com.khubla.htmlparser;

import java.io.InputStream;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.khubla.htmlparser.grammar.HTMLParser.HtmlDocumentContext;

/**
 * @author tom
 */
public class TestTreeWalk {
   @Test
   public void test1() {
      try {
         final InputStream inputStream = TestTreeWalk.class.getResourceAsStream("/example1.html");
         final HtmlDocumentContext htmlDocumentContext = HTMLDocumentParser.parse(inputStream);
         Assert.assertNotNull(htmlDocumentContext);
      } catch (final Exception e) {
         e.printStackTrace();
         Assert.fail();
      }
   }
}
