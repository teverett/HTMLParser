package com.khubla.htmlparser;

import java.io.InputStream;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.khubla.htmlparser.grammar.HTMLParserListener;

/**
 * @author tom
 */
public class TestListener {
   @Test(enabled = false)
   public void test1() {
      try {
         final InputStream inputStream = TestTreeWalk.class.getResourceAsStream("/script1.html");
         final HTMLParserListener htmlParserListener = new ExampleListener();
         HTMLDocumentParser.parse(inputStream, htmlParserListener);
      } catch (final Exception e) {
         e.printStackTrace();
         Assert.fail();
      }
   }
}
