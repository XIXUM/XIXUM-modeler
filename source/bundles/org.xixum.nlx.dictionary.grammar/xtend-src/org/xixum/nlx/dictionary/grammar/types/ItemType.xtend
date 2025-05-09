/**
 * (c) felixschaller.com
 * @author Felix Schaller
 */
package org.xixum.nlx.dictionary.grammar.types

//TODO: 05.10.22 replace by some more dynamic solution (class or neo4j node)
enum ItemType {
	START,
	NEWLINE,
	BRACKETOPEN,
	BRACKETCLOSE,
	KOMMA,
	COLON,
	SEMICOLON,
	FULLSTOP,
	QUESTION_M,
	EXCLAMATION_M,
	SEPARATOR,
	SPECIAL
}
