package org.xixum.nlx.ai

import org.xixum.nlx.ai.semantics.IContextNode

interface IContextFactory {
	
	def IContextNode create(IParserDriver driver)
	
}