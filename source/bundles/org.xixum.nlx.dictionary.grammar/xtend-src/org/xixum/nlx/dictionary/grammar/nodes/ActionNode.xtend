package org.xixum.nlx.dictionary.grammar.nodes

import static org.xixum.nlx.dictionary.constants.PredicateConstants.DO_
import static org.xixum.nlx.dictionary.constants.PredicateConstants.FIND_
import static org.xixum.nlx.dictionary.constants.PredicateConstants.GET_SOURCE_
import static org.xixum.nlx.dictionary.constants.PredicateConstants.GET_TARGET_
import static org.xixum.nlx.dictionary.constants.PredicateConstants.LINK_INSTANCE_TO_
import static org.xixum.nlx.dictionary.constants.PredicateConstants.LINK_TO_
import static org.xixum.nlx.dictionary.constants.PredicateConstants.WITH_
import static org.xixum.nlx.dictionary.constants.PredicateConstants.TARGET_

import org.xixum.nlx.ai.IParserDriver
import org.xixum.nlx.ai.semantics.INode
import org.xixum.nlx.dictionary.grammar.bool.BoolOr
import java.util.List
import org.neo4j.driver.v1.Record
import org.neo4j.driver.v1.types.Node

import org.xixum.nlx.dictionary.grammar.nodes.interfaces.IPredicateDO


class ActionNode extends AbstractActionPredicatedNodeObj implements IActionNode, IActionSubject, IPredicateDO {
	
	val static BoolOr boolOr = new BoolOr()
	
//	var INode objectNode
	//TODO: configure this externally one day
	protected val List<String> functionalTypes = #[GET_SOURCE_, GET_TARGET_, LINK_TO_, LINK_INSTANCE_TO_, FIND_]

	new(Node node, IParserDriver driver) {
		super(node, driver)
	}

	override INode solve() {
		// TODO consider a wrapper function with pre and post solves
		if (predicates === null) {
			var List<Record> outs = listAllOutputs()
			createPredicates(outs)
		}
		var INode result = doExecuteTypes(functionalTypes, boolOr)
		if (result !== null){
			return doExecuteType(DO_, boolOr, predicates.get(DO_)) 
		}
		//TODO Fetch ErrorNode and pass to parent ImplRuleNode
	}
	
	override Do(INode caller) {
		switch(caller){
			ImplRuleNode:{ 
				var target = driver.context.getAttribute(TARGET_)
				if (target !== null)
					setAttribute(WITH_, target as INode)
				else
					setAttribute(WITH_, caller.getResult() as INode)  // fallback if no explicit target exists
				return solve // return Error else null
			}
			IActionNode:{
				setAttribute(WITH_, caller.getAttribute(WITH_))
				return solve // return Error else null
			}
		}
		null
	}
	
	

}
