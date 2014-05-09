package com.khubla.htmlparser.main;

import java.io.InputStream;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import com.khubla.htmlparser.HTMLDocumentParser;
import com.khubla.htmlparser.grammar.HTMLParser.HtmlDocumentContext;

/**
 * 
 * @author tom
 * 
 */
public class PageTester {
	/**
	 * 
	 * main
	 * 
	 * @throws Exception
	 * 
	 */
	static public void main(String args[]) throws Exception {
		/*
		 * the url
		 */
		String url = args[0];
		/*
		 * 
		 */
		CloseableHttpClient httpclient = HttpClients.createDefault();
		HttpGet httpGet = new HttpGet(url);
		CloseableHttpResponse response = httpclient.execute(httpGet);
		InputStream inputStream = null;
		try {
			inputStream = response.getEntity().getContent();
			/*
			 * parse
			 */
			HtmlDocumentContext htmlDocumentContext = HTMLDocumentParser
					.parse(inputStream);
		} finally {
			response.close();
		}

	}
}
