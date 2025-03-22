/**
 * 
 */
package org.xixum.nlx.dictionary.grammar.token;

import org.xixum.utils.data.lists.IAppendable
import org.xixum.utils.data.lists.IContainable
import org.xixum.utils.data.lists.IIndexable
import org.eclipse.emf.ecore.EObject
import org.neo4j.driver.v1.types.Node
import org.xixum.nlx.dictionary.grammar.types.IGrammarType

/**
 * @author schaller
 *
 */
public interface IGrammarItem extends IAppendable, IContainable, IIndexable{

	def abstract String getName();
	
	def abstract String getLabel();
	
	def abstract EObject getElement();
	
	def abstract Node getBaseNode();

	def abstract long generateID();
	
	def abstract IGrammarType getInternalType();

}
