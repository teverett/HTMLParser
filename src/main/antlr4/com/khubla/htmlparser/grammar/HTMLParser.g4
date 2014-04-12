/*
 [The "BSD licence"]
 Copyright (c) 2013 Tom Everett
 All rights reserved.

 Redistribution and use in source and binary forms, with or without
 modification, are permitted provided that the following conditions
 are met:
 1. Redistributions of source code must retain the above copyright
    notice, this list of conditions and the following disclaimer.
 2. Redistributions in binary form must reproduce the above copyright
    notice, this list of conditions and the following disclaimer in the
    documentation and/or other materials provided with the distribution.
 3. The name of the author may not be used to endorse or promote products
    derived from this software without specific prior written permission.

 THIS SOFTWARE IS PROVIDED BY THE AUTHOR ``AS IS'' AND ANY EXPRESS OR
 IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
 IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY DIRECT, INDIRECT,
 INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT
 NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF
 THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/

//
//
// HTML Grammar based on the ANTLR4 XML Grammar by Terence Parr
//
//
parser grammar HTMLParser;

options { tokenVocab=HTMLLexer; }

htmlDocument    
    : HTML_DTD? htmlElements*
    ;

htmlElements
    : htmlMisc* htmlElement htmlMisc*
    ;

htmlElement     
    : '<' HTML_Name htmlAttribute* '>' htmlContent '<' HTML_SLASH HTML_Name '>'
    | '<' HTML_Name htmlAttribute* '/>'
    ;

htmlContent     
    : htmlChardata? ((htmlElement | htmlReference | htmlComment) htmlChardata?)*
    ;

htmlReference   
    : HTML_EntityRef 
    | HTML_CharRef
    ;

htmlAttribute   
    : HTML_Name HTML_EQUALS HTML_STRING
    ;

htmlChardata    
    : HTML_TEXT 
    | SEA_WS
    ;

htmlMisc        
    : htmlComment 
    | SEA_WS
    ;

htmlComment
    : HTML_COMMENT
    ;


