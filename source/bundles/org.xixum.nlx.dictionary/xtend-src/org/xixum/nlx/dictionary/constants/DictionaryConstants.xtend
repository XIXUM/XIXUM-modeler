package org.xixum.nlx.dictionary.constants

class DictionaryConstants extends AbstractConstantClass
{
	public  static val NOUN_ 				= getString("_NOUN")				// "Noun";
	public  static val NAME_ 				= getString("_NAME")				// "Name";
	public  static val PRONOUN_ 			= getString("_PRONOUN")				// "Pronoun";
	public  static val ARTICLE_ 			= getString("_ARTICLE")				// "Article";
	public  static val VERB_ 				= getString("_VERB")				// "Verb";
	public  static val ADJECTIVE_ 			= getString("_ADJECTIVE")			// "Adjective";
	public  static val ADVERB_ 				= getString("_ADVERB")				// "Adverb";
	public  static val PREPOSITION_ 		= getString("_PREPOSITION")			// "Preposition";
	public  static val CONJUNCTION_ 		= getString("_CONJUNCTION")			// "Conjunction";
	public  static val INTERJECTION_ 		= getString("_INTERJECTION")		// "Interjection";
	public  static val UNDEFINED_ 			= getString("_UNDEFINED")			// "Undefined";

	public  static val _NX 					= getString("_NX")					// "nx";
	public  static val _NY 					= getString("_NY")					// "ny";
	public  static val _TX 					= getString("_TX")					// "tx";
	public  static val _TY 					= getString("_TY")					// "ty";


	//public  static val PLURAL_ 				= getString("PLURAL_")				// "plural";
	public  static val	_FOLLOWED_BY 		= getString("_FOLLOWED_BY")			// "followedBy"

	public  static val _IT_WORD 			= getString("_IT_WORD")				// "ItWord";
	public  static val _QUOTE 				= getString("_QUOTE")				// "Quote";
	public  static val _SYMBOLS 			= getString("_SYMBOLS")				// "Symbols";
	public  static val _IGNORED_TEXT 		= getString("_IGNORED_TEXT")		// "IgnoredText";
	public  static val _UNIT 				= getString("_UNIT")				// "Unit";
	public  static val _NONE_TYPE 			= getString("_NONE_TYPE")			// "NONE_TYPE";

	public  static val _GLOBAL 				= getString("_GLOBAL")				// "global";

	public  static val _BASEFORM			= getString("_BASEFORM")			// "baseform"
	public  static val _CONJUGATION			= getString("_CONJUGATION")			// "conjugation"
	public  static val _CONTINUOUS			= getString("_CONTINUOUS")			// "continuous"
	public  static val _PLURAL				= getString("_PLURAL")				// "plural"

//TODO: 02.05.22 move into Database:
	public  static val PREFIX_CONST_		= getString("PREFIX_CONST_")		// "a, an, ante, anti, auto, by, circum, co, com, con, contra, contro, de, dis, down, en, ex, extra, for, fore, hetero, homo, homeo, hyper, il, im, in, infra, ir, in, inter, intra, intro, mega, mid, mis, macro, micro, non, omni, on, over, off, out, post, pre, pro, re, semi, sub, super, sym, syn, tele, trans, tri, to, un, ultra, under, uni, up, with, "
	public  static val SUFFIX_CONST_		= getString("SUFFIX_CONST_")		// "acy, al, ance, ence, ate, dom, ee, en, hood, ify, fy, able, ible, al, esque, dom, er, or, i, ism, ist, ity, ty, ment, ness, ry, ship, sion, tion, ize, ise, ful, ic, ical, ious, ous, ish, ive, ian, ly, less,ward, wards, wise, xion, y"
	public  static val SINGULAR_PLURAL_		= getString("SINGULAR_PLURAL_") 	// y->ies sh->shes ch->ches ss->sses s->ses ex->exes us->i ch->ches us->uses lis->lides as->ases ey->eys ay->ays oy->oys li->lies e->es o->oes f->ves fe->ves oman->omen oot->eet ooth->eeth ouse->ice oose->eese

	public  static val _PREFIX				= getString("_PREFIX")				// "Prefix"
	public  static val _SUFFIX				= getString("_SUFFIX")				// "Suffix"
	public  static val _PREFIXED 			= getString("_PREFIXED")			// prefixed
	public  static val _SUFFIXED 			= getString("_SUFFIXED")			// suffixed

	public  static val _ENDS_WITH 			= getString("_ENDS_WITH")			// endsWith
	public  static val _STARTS_WITH			= getString("_STARTS_WITH")			// startsWith

	public  static val _START				= getString("_START")				// start
	public  static val _END					= getString("_END") 				// end

	public  static val _PATTERN				= getString("_PATTERN")				// pattern
	public  static val _EXCLUDES			= getString("_EXCLUDES")			// excludes
	public  static val _POSITION			= getString("_POSITION")			// Position

	public  static val _EXCLUDED			= getString("_EXCLUDED")			// excluded
	public  static val _INCLUDED			= getString("_INCLUDED")			// included
	public  static val _LEFT_OVER			= getString("_LEFT_OVER") 				// end

	public  static val _INFIX_TRANSITION	= getString("_INFIX_TRANSITION")	// InfixTransition
	public  static val _COMMON_PREFIX		= getString("_COMMON_PREFIX")		// commonPrefix
	public  static val _TRANSIT_TO			= getString("_TRANSIT_TO")			// transitTo

	public  static val _SUBSTR				= getString("_SUBSTR")				// substr
	public  static val _INFIX_N				= getString("_INFIX_N")				// infix_n
	public  static val _INFIX_T				= getString("_INFIX_T")				// infix_t

	public  static val _COMPARATIVE_SUFFIX	= getString("_COMPARATIVE_SUFFIX")	// er
	public  static val _SUPERLATIVE_SUFFIX	= getString("_SUPERLATIVE_SUFFIX")	// est
	public  static val _COMPARATIVE			= getString("_COMPARATIVE")			// comparative
	public  static val _SUPERLATIVE			= getString("_SUPERLATIVE")			// superlative

	public  static val _WORD_FRAGMENT		= getString("_WORD_FRAGMENT")		// WordFragment
	public  static val _CHAR				= getString("_CHAR")				// Char
	public  static val _AT					= getString("_AT")					// at
	public  static val _OF_TYPE				= getString("_OF_TYPE")				// ofType
	public 	static val _WORD_CLASS			= getString("_WORD_CLASS")
	public 	static val _WORD_TYPE			= getString("_WORD_TYPE")

	public static val _ORDINAL				= getString("_ORDINAL")				// ordinal

	public static val _FORWARD				= getString("_FORWARD")				// forward

	public static val _REDUNDANCE			= getString("_REDUNDANCE")			// Redundance
	public static val _REDUNDANT			= getString("_REDUNDANT")			// redundant
	public static val _CARDINALITY			= getString("_CARDINALITY")			// cardinality
	public static val _EXTENDS				= getString("_EXTENDS")				// extends
	
	public static val _FULLSTOP 			= getString("_FULLSTOP") 			// FULLSTOP
	public static val _BRACKETOPEN 			= getString("_BRACKETOPEN") 		// BRACKEDOPEN
	public static val _BRACKETCLOSE 		= getString("_BRACKETCLOSE") 		// BRACKEDCLOSE
	public static val _QUESTION_M 			= getString("_QUESTION_M") 			// QUESTION_M
	public static val _SEPARATOR 			= getString("_SEPARATOR") 			// SEPARATOR
	public static val _NEWLINE 				= getString("_NEWLINE") 			// NEWLINE
	public static val _KOMMA 				= getString("_KOMMA") 				// KOMMA
	public static val _SEMICOLON 			= getString("_SEMICOLON") 			// SEMICOLON
	public static val _EXCLAMATION_M 		= getString("_EXCLAMATION_M")		// EXCLAMATION_M
	public static val _SPECIAL 				= getString("_SPECIAL") 			// SPECIAL
	
	public static val _BRACKET_SENTENCE		= getString("_BRACKET_SENTENCE")	// BracketSentence
	public static val _CLUSTER_TYPE			= getString("_CLUSTER_TYPE")		// ClusterType
//Deprecated
	public static val _SENTENCE_TYPE 		= getString("_SENTENCE_TYPE")		// SentenceClass
}