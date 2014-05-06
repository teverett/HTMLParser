package com.khubla.htmlparser;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author tom
 */
public class TestTreeWalk {
   /**
    * the examples dir
    */
   private static final String EXAMPLES = "src/test/resources";

   /**
    * find the example files
    */
   protected List<File> getAllExampleFiles(String dir, List<File> files) throws Exception {
      final File file = new File(dir);
      if (file.exists()) {
         final String[] list = file.list();
         for (int i = 0; i < list.length; i++) {
            {
               final String fileName = dir + "/" + list[i];
               final File f2 = new File(fileName);
               if (f2.isDirectory()) {
                  getAllExampleFiles(fileName + "/", files);
               } else {
                  if (null == files) {
                     files = new ArrayList<File>();
                  }
                  files.add(f2);
               }
            }
         }
         return files;
      } else {
         return null;
      }
   }

   /**
    * parse
    */
   protected ParserRuleContext parse(File file) throws Exception {
      return HTMLDocumentParser.parse(new FileInputStream(file));
   }

   @Test
   public void testExamples() {
      try {
         final List<File> exampleFiles = getAllExampleFiles(EXAMPLES, null);
         if (null != exampleFiles) {
            for (final File file : exampleFiles) {
               System.out.println("Parsing example input '" + file.getAbsolutePath() + "'");
               final ParserRuleContext parserRuleContext = parse(file);
               Assert.assertNotNull(parserRuleContext);
            }
         }
      } catch (final Exception e) {
         e.printStackTrace();
         Assert.fail();
      }
   }
}
