package com.khubla.htmlparser.main;

import java.io.InputStream;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import com.khubla.htmlparser.HTMLDocumentParser;

/**
 * @author tom
 */
public class PageTester {
   /**
    * main
    */
   static public void main(String args[]) throws Exception {
      final String url = args[0];
      final CloseableHttpClient httpclient = HttpClients.createDefault();
      final HttpGet httpGet = new HttpGet(url);
      final CloseableHttpResponse response = httpclient.execute(httpGet);
      InputStream inputStream = null;
      try {
         inputStream = response.getEntity().getContent();
         HTMLDocumentParser.parse(inputStream);
      } finally {
         response.close();
      }
   }
}
