package org.xixum.nlx.dictionary.grammar.types

import org.xixum.nlx.dictionary.type.ITypeInfo
import org.xixum.nlx.dictionary.type.ITypeAttributes
import org.xixum.utils.data.types.XPair

interface IGrammarType {
		def String getName()
		def ITypeInfo getTypeInfo()
		def XPair<String, ITypeAttributes> getBaseType()
}