package org.xixum.nlx.dictionary.grammar.factories

//import static org.xixum.nlx.constants.Neo4jConstants._ATTR_NAME
//import static org.xixum.nlx.constants.Neo4jConstants._NAME
//import static org.xixum.nlx.constants.Neo4jConstants._NODE
//import static org.xixum.nlx.constants.Neo4jConstants._TARGET
//import static org.xixum.nlx.constants.Neo4jConstants._TOKEN
import static org.xixum.nlx.dictionary.constants.PredicateConstants.DO_
import static org.xixum.nlx.dictionary.constants.PredicateConstants.ENDS_WITH_
import static org.xixum.nlx.dictionary.constants.PredicateConstants.ENTER_RULE_
import static org.xixum.nlx.dictionary.constants.PredicateConstants.EQUALS_
import static org.xixum.nlx.dictionary.constants.PredicateConstants.EXTENDS_
import static org.xixum.nlx.dictionary.constants.PredicateConstants.FIND_
import static org.xixum.nlx.dictionary.constants.PredicateConstants.OF_CLASS_
import static org.xixum.nlx.dictionary.constants.PredicateConstants.GET_NAME_
import static org.xixum.nlx.dictionary.constants.PredicateConstants.GET_SOURCE_
import static org.xixum.nlx.dictionary.constants.PredicateConstants.GET_TARGET_
import static org.xixum.nlx.dictionary.constants.PredicateConstants.INSTANCE_OF_
import static org.xixum.nlx.dictionary.constants.PredicateConstants.IS_
import static org.xixum.nlx.dictionary.constants.PredicateConstants.LINK_INSTANCE_TO_
import static org.xixum.nlx.dictionary.constants.PredicateConstants.LINK_TO_
import static org.xixum.nlx.dictionary.constants.PredicateConstants.NEXT_
import static org.xixum.nlx.dictionary.constants.PredicateConstants.PREVIOUS_
import static org.xixum.nlx.dictionary.constants.PredicateConstants.OF_
//import static org.xixum.nlx.dictionary.constants.PredicateConstants.RESULT_
import static org.xixum.nlx.dictionary.constants.PredicateConstants.TARGET_
//import static org.xixum.nlx.dictionary.constants.PredicateConstants.WITH_
//import static org.xixum.nlx.dictionary.constants.NodeConstants._QUERY
//import static org.xixum.nlx.dictionary.constants.NodeConstants._WORD

import org.xixum.nlx.ai.IDbAccess
import org.xixum.nlx.ai.IPredicateFactory
import org.xixum.nlx.ai.semantics.INode
import org.xixum.nlx.dictionary.grammar.predicates.Predicate
import org.neo4j.driver.internal.value.RelationshipValue
import org.xixum.nlx.dictionary.grammar.nodes.interfaces.IPredicateNEXT
import org.xixum.nlx.dictionary.grammar.nodes.interfaces.IPredicateIS
import org.xixum.nlx.dictionary.grammar.nodes.interfaces.IPredicateEQUALS
import org.xixum.nlx.dictionary.grammar.nodes.interfaces.IPredicatePREVIOUS
import org.xixum.nlx.dictionary.grammar.nodes.interfaces.IPredicateDO
import org.xixum.nlx.dictionary.grammar.nodes.interfaces.IPredicateENTER_RULE
import org.xixum.nlx.dictionary.grammar.nodes.interfaces.IPredicateEXTENDS
import org.xixum.nlx.dictionary.grammar.nodes.interfaces.IPredicateGET
import org.xixum.nlx.dictionary.grammar.nodes.interfaces.IPredicateENDS_WITH
import org.xixum.nlx.dictionary.grammar.nodes.interfaces.IPredicateOF
import org.xixum.nlx.dictionary.grammar.nodes.interfaces.IPredicateLINK_TO
import org.xixum.nlx.dictionary.grammar.nodes.interfaces.IPredicateGET_NAME
import org.xixum.nlx.dictionary.grammar.nodes.interfaces.IPredicateFIND
import org.xixum.nlx.dictionary.grammar.nodes.interfaces.IPredicateOF_CLASS
import org.xixum.nlx.dictionary.grammar.nodes.interfaces.IPredicateTARGET

class PredicateFactory implements IPredicateFactory {
	IDbAccess dbAccessor

	new(IDbAccess access) {
		this.dbAccessor = access
	}

	override create(RelationshipValue value, INode nodeStart, INode nodeEnd) {
		var rel = value.asRelationship()
		var typeName = rel.type.toLowerCase
		switch (typeName) {
			// TODO: 27.10.22 consider to use annotations with reflection instead of Ipredicate interfaces  
			// TODO: igonore multible Lables for now
			case LINK_INSTANCE_TO_,
			case LINK_TO_: {
				new Predicate(rel, nodeStart, nodeEnd, dbAccessor, typeName) {
					override execute() {
						var delegate = [String t | doLinkTo(t)]
						if (nodeEnd instanceof IPredicateLINK_TO)
							nodeEnd.linkTo(nodeStart, relation, delegate)
					}
				}
			}
			case IS_,
			case INSTANCE_OF_: {
				new Predicate(rel, nodeStart, nodeEnd, dbAccessor, typeName) {
					override execute() {
						if (nodeEnd instanceof IPredicateIS){
							return nodeEnd.is(nodeStart)
						}
					}
				}
			}
			case TARGET_: {
				new Predicate(rel, nodeStart, nodeEnd, dbAccessor, typeName) {
					override execute() {
						if (nodeEnd instanceof IPredicateTARGET)
							return nodeEnd.target(nodeStart)
					}
				}}
			case EQUALS_: {
				new Predicate(rel, nodeStart, nodeEnd, dbAccessor, typeName) {
					override execute() {
						if (nodeEnd instanceof IPredicateEQUALS)
							return nodeEnd.equals(nodeStart)
					}
				}
			}
			case NEXT_: {
				new Predicate(rel, nodeStart, nodeEnd, dbAccessor, typeName) {
					override execute() {
						if (nodeEnd instanceof IPredicateNEXT)
							return nodeEnd.next(nodeStart)
					}
				}
			}
			case PREVIOUS_: {
				new Predicate(rel, nodeStart, nodeEnd, dbAccessor, typeName) {
					override execute() {
						if (nodeEnd instanceof IPredicatePREVIOUS)
							return nodeEnd.previous(nodeStart)
					}
				}
			}
			
			case DO_: {
				new Predicate(rel, nodeStart, nodeEnd, dbAccessor, typeName) {
					override execute() {
						if (nodeEnd instanceof IPredicateDO)
							return nodeEnd.Do(nodeStart)
					}
				}
			}
			case ENTER_RULE_: {
				new Predicate(rel, nodeStart, nodeEnd, dbAccessor, typeName) {
					override execute() {
						if (nodeEnd instanceof IPredicateENTER_RULE)
							return nodeEnd.enterRule(nodeStart)
					}
				}
			}
			case EXTENDS_: {
				new Predicate(rel, nodeStart, nodeEnd, dbAccessor, typeName) {
					override execute() {
						if (nodeEnd instanceof IPredicateEXTENDS)
							return nodeEnd.Extends(nodeStart)
					}
				}
			}
			case GET_TARGET_,
			case GET_SOURCE_: {
				new Predicate(rel, nodeStart, nodeEnd, dbAccessor, typeName) {
					override execute() {
						if (nodeEnd instanceof IPredicateGET)
							return nodeEnd.get(nodeStart, relation)
					}
				}
			}
			case ENDS_WITH_: {
				new Predicate(rel, nodeStart, nodeEnd, dbAccessor, typeName) {
					override execute() {
						if (nodeEnd instanceof IPredicateENDS_WITH)
							return nodeEnd.endsWith(nodeStart)
					}
				}
			}
			case OF_: {
				new Predicate(rel, nodeStart, nodeEnd, dbAccessor, typeName) {
					override execute() {
						if(nodeEnd instanceof IPredicateOF)
							return nodeEnd.of(nodeStart, relation)
					}
				}
			}
			case GET_NAME_: {
				new Predicate(rel, nodeStart, nodeEnd, dbAccessor, typeName) {
					override execute() {
						if(nodeEnd instanceof IPredicateGET_NAME)
							return nodeEnd.getName(nodeStart, relation)
					}
				}
			}
			case FIND_: {
				new Predicate(rel, nodeStart, nodeEnd, dbAccessor, typeName) {
					override execute() {
						if (nodeEnd instanceof IPredicateFIND)
							return nodeEnd.find(nodeStart, relation)
					}
				}
			}
			case OF_CLASS_: {
				new Predicate(rel, nodeStart, nodeEnd, dbAccessor, typeName) {
					override execute() {
						if (nodeEnd instanceof IPredicateOF_CLASS)
							return nodeEnd.ofClass(nodeStart, relation)
					}
				}
			}
			
//			case "Condition": {
//				attribute.get("type"):
//				new ConditionNode(node, dbAccessor)
//			}
		// TODO: ... other future NoteTypes
		}
	}
}
