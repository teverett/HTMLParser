// Generated from com/khubla/htmlparser/grammar/HTMLParser.g4 by ANTLR 4.2
package com.khubla.htmlparser.grammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HTMLParser}.
 */
public interface HTMLParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HTMLParser#htmlElements}.
	 * @param ctx the parse tree
	 */
	void enterHtmlElements(@NotNull HTMLParser.HtmlElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#htmlElements}.
	 * @param ctx the parse tree
	 */
	void exitHtmlElements(@NotNull HTMLParser.HtmlElementsContext ctx);

	/**
	 * Enter a parse tree produced by {@link HTMLParser#htmlReference}.
	 * @param ctx the parse tree
	 */
	void enterHtmlReference(@NotNull HTMLParser.HtmlReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#htmlReference}.
	 * @param ctx the parse tree
	 */
	void exitHtmlReference(@NotNull HTMLParser.HtmlReferenceContext ctx);

	/**
	 * Enter a parse tree produced by {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterHtmlElement(@NotNull HTMLParser.HtmlElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitHtmlElement(@NotNull HTMLParser.HtmlElementContext ctx);

	/**
	 * Enter a parse tree produced by {@link HTMLParser#htmlComment}.
	 * @param ctx the parse tree
	 */
	void enterHtmlComment(@NotNull HTMLParser.HtmlCommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#htmlComment}.
	 * @param ctx the parse tree
	 */
	void exitHtmlComment(@NotNull HTMLParser.HtmlCommentContext ctx);

	/**
	 * Enter a parse tree produced by {@link HTMLParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void enterHtmlAttribute(@NotNull HTMLParser.HtmlAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void exitHtmlAttribute(@NotNull HTMLParser.HtmlAttributeContext ctx);

	/**
	 * Enter a parse tree produced by {@link HTMLParser#htmlMisc}.
	 * @param ctx the parse tree
	 */
	void enterHtmlMisc(@NotNull HTMLParser.HtmlMiscContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#htmlMisc}.
	 * @param ctx the parse tree
	 */
	void exitHtmlMisc(@NotNull HTMLParser.HtmlMiscContext ctx);

	/**
	 * Enter a parse tree produced by {@link HTMLParser#htmlChardata}.
	 * @param ctx the parse tree
	 */
	void enterHtmlChardata(@NotNull HTMLParser.HtmlChardataContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#htmlChardata}.
	 * @param ctx the parse tree
	 */
	void exitHtmlChardata(@NotNull HTMLParser.HtmlChardataContext ctx);

	/**
	 * Enter a parse tree produced by {@link HTMLParser#htmlDocument}.
	 * @param ctx the parse tree
	 */
	void enterHtmlDocument(@NotNull HTMLParser.HtmlDocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#htmlDocument}.
	 * @param ctx the parse tree
	 */
	void exitHtmlDocument(@NotNull HTMLParser.HtmlDocumentContext ctx);

	/**
	 * Enter a parse tree produced by {@link HTMLParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void enterHtmlContent(@NotNull HTMLParser.HtmlContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void exitHtmlContent(@NotNull HTMLParser.HtmlContentContext ctx);
}