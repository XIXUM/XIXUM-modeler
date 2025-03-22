package org.xixum.nlx.dictionary.grammar.nodes

import org.xixum.nlx.ai.IParserDriver
import org.xixum.nlx.ai.semantics.INode
import org.xixum.nlx.dictionary.grammar.bool.BoolOr
import org.xixum.utils.data.lists.IAppendable
import java.util.List
import org.neo4j.driver.v1.Record
import org.neo4j.driver.v1.types.Node

import static org.xixum.nlx.constants.Neo4jConstants._TOKEN
import static org.xixum.nlx.dictionary.constants.PredicateConstants.DO_
import static org.xixum.nlx.dictionary.constants.PredicateConstants.ENTER_RULE_
import org.xixum.nlx.dictionary.grammar.nodes.interfaces.IPredicateDO

class ImplRuleNode extends AbstractDictRuleObj implements IRuleNode {
	
	val static BoolOr boolOr = new BoolOr()

	protected int index = 0
	protected INode result


	new(Node node, IAppendable token, IParserDriver driver) {
		super(node, driver)
		driver.context.setAttribute(_TOKEN, token)
		setAttribute(_TOKEN, token)
	}

	override INode solve() {
		// TODO consider a wrapper function with pre and post solves
		
		
		if (predicates === null) {
			var List<Record> outs = listAllOutputs()
			createPredicates(outs)
		}
		setResult = doExecuteType(ENTER_RULE_, boolOr, predicates.get(ENTER_RULE_))
		if (getResult !== null) {
			return doExecuteType(DO_, boolOr, predicates.get(DO_)) // void return
			
		}
	}

	def setResult(INode node) {
		this.result = node
	}
	
	def INode getResult(){
		result
	}
	
	
}
