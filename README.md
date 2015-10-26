HTMLParser
==========

A simple HTML Parser using [ANTLR4](http://www.antlr.org/)


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


Travis Status
---------

<a href="https://travis-ci.org/teverett/HTMLParser"><img src="https://api.travis-ci.org/teverett/HTMLParser.png"></a>


