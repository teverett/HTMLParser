[![Travis](https://travis-ci.org/teverett/HTMLParser.svg?branch=master)](https://travis-ci.org/teverett/HTMLParser)
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/9ebea7ee219e4210bf17ac5f99b73303)](https://www.codacy.com/app/teverett/HTMLParser?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=teverett/HTMLParser&amp;utm_campaign=Badge_Grade)

HTMLParser
==========

A simple HTML Parser using [ANTLR4](http://www.antlr.org/)

Maven Coordinates
--------

	<dependency>
		<groupId>com.khubla.htmlparser</groupId>
		<artifactId>htmlparser</artifactId>
		<version>1.0</version>
		<type>jar</type>
		<scope>compile</scope>
	</dependency>


Fetching and Validating a Page
---------

HTMLParser can be used as a command-line jar file to fetch a single page and parse it.  Parse errors will be logged to the console. For example

<pre>
sh fetch.sh http://www.slashdot.org
</pre>

Example Usage of the Library
---------

To parse an arbitrary HTML document using the callback parser, provide an implementation of [HTMLParserListener](https://github.com/teverett/HTMLParser/blob/master/src/main/java/com/khubla/htmlparser/grammar/HTMLParserListener.java) along with an InputStream of HTML to [HTMLDocumentParser:parse](https://github.com/teverett/HTMLParser/blob/master/src/main/java/com/khubla/htmlparser/HTMLDocumentParser.java)

<pre>
  final InputStream inputStream = TestTreeWalk.class.getResourceAsStream("/example1.html");
  final HTMLParserListener htmlParserListener = new ExampleListener();
  HTMLDocumentParser.parse(inputStream, htmlParserListener);
</pre>

Licensing
---------

HTMLParser is licensed under the [GPLv2](https://github.com/teverett/HTMLParser/blob/master/LICENSE)

