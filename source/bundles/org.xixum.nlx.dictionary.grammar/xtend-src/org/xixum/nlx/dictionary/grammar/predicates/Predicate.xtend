/**
 * AbstractDictRuleObj - Base Obj for Abstract dictionary rules
 * (c) 2020 licensed under Apache Public License 2.0
 * www.felixschaller.com
 * @author Felix Schaller
 */

package org.xixum.nlx.dictionary.grammar.predicates

import org.xixum.nlx.ai.IDbAccess
import org.xixum.nlx.ai.neo4j.Neo4jAccess.Action
import org.xixum.nlx.ai.semantics.INode
import org.xixum.nlx.ai.semantics.IPredicate
import org.xixum.nlx.ai.util.Arrow
import org.xixum.nlx.constants.Direction
import org.xixum.nlx.dictionary.grammar.nodes.ValidateNode
import java.text.MessageFormat
import java.util.Collections
import java.util.List
import org.neo4j.driver.internal.value.NodeValue
import org.neo4j.driver.internal.value.NullValue
import org.neo4j.driver.internal.value.RelationshipValue
import org.neo4j.driver.v1.Record
import org.neo4j.driver.v1.types.Relationship

import static org.xixum.nlx.constants.Neo4jConstants._LINK
import static org.xixum.nlx.constants.Neo4jConstants._NODE
//import static org.xixum.nlx.constants.Neo4jConstants._NAME
//import static org.xixum.nlx.constants.Neo4jConstants._OF_CLASS
import static org.xixum.nlx.constants.Neo4jConstants._TARGET
import static org.xixum.nlx.dictionary.constants.PredicateConstants.BASE_FORM_
import static org.xixum.nlx.dictionary.constants.PredicateConstants.CONJUGATION_
import static org.xixum.nlx.dictionary.constants.PredicateConstants.GET_SOURCE_
import static org.xixum.nlx.dictionary.constants.PredicateConstants.GET_TARGET_
import static org.xixum.nlx.constants.Neo4jConstants._TOKEN
import static org.xixum.nlx.dictionary.constants.PredicateConstants.NAME_
import static org.xixum.nlx.dictionary.constants.PredicateConstants.SUB_CLASS_OF_
import static org.xixum.nlx.dictionary.constants.PredicateConstants.PRECEED_BY_
import static org.xixum.nlx.dictionary.constants.PredicateConstants.TENSE_
import static org.xixum.nlx.dictionary.constants.PredicateConstants.WITH_
import static org.xixum.nlx.dictionary.constants.PredicateConstants.RESULT_
import org.xixum.nlx.dictionary.grammar.nodes.IDictNode

//import static org.xixum.nlx.dictionary.constants.NodeConstants._WORD
//import static org.xixum.nlx.dictionary.constants.DictionaryConstants._POSITION



abstract class Predicate implements IPredicate {
	static val DEBUG = false
	protected static val List<String> requiredTense = #[WITH_]
	protected static val List<String> requiredSubClass = #[WITH_, GET_TARGET_]
	protected static val List<String> requiredConjugation = (requiredTense + #[GET_SOURCE_, GET_TARGET_]).toList  // TODO: nice but awkward
	protected static val List<String> requiredBaseForm = requiredConjugation
	protected Relationship relation
	protected NodeValue target
	protected IDbAccess dbAccessor
	protected INode nodeStart
	protected INode nodeEnd
	protected INode errorNode
	protected String name
	//protected Map<Long, Map<String, IDictNode>> children = newHashMap()
	protected static val validationType = #{
		CONJUGATION_ -> requiredConjugation,
		TENSE_ -> requiredTense,
		SUB_CLASS_OF_ -> requiredSubClass,
		BASE_FORM_ -> requiredBaseForm,
		PRECEED_BY_ -> requiredTense
	}
	
	

	new(Relationship relation, INode nodeStart, INode nodeEnd, IDbAccess dbAccessor, String name) {
		this.relation = relation
		this.dbAccessor = dbAccessor
		this.nodeStart = nodeStart
		this.nodeEnd = nodeEnd
		this.name = name
	}

	abstract override INode execute()

	def isRelated(long s, long e, String type) {
		// TODO: should cache query for next inquiries to speed up
		val query = '''MATCH («_NODE»)«new Arrow(null,type,Direction.RIGHT).generate»(«_TARGET») WHERE ID(«_NODE») = «s» AND ID(«_TARGET») = «e»
«					»Return «_NODE»,«_TARGET»'''
		var List<Record> records = readDB(query)
		if (records !== null && ! records.isEmpty)
			return true
		false
	}

	def INode doLinkTo(String asType) {
		errorNode = null
		// TODO: Validation has to go here
		var ValidateNode nodeValidator = new ValidateNode(nodeStart, nodeEnd, validationType.get(asType))
		var connections = nodeValidator.validate()
		if (nodeValidator.hasAnnotation()) // TODO: Distinguish between Error Annotation and other Types
			return nodeValidator.getAnnotation()
		var source = connections.get(GET_SOURCE_)
		var target = connections.get(GET_TARGET_)
		var with = connections.get(WITH_)

		val rawQuery = '''MATCH («_NODE») WHERE ID(«_NODE») = {0}
«						 »MATCH («_TARGET») WHERE ID(«_TARGET») = {1}
«						 »MERGE («_NODE»)«new Arrow(_LINK, asType, Direction.RIGHT).generate»(«_TARGET»)
«						 »Return «_LINK»'''

		switch (asType) {
			case BASE_FORM_,
			case CONJUGATION_: {
				if (source !== null && target !== null) {
					if (source.equals(with)) {
						if (!isRelated(source.getID, target.getID, asType)) {
							val query = MessageFormat.format(rawQuery, with.getID.toString, target.getID.toString)
							var List<Record> records = writeDB(query)
							logResult(records)
						}
					}
				}
				nodeEnd
			}
			case TENSE_: {
				var end = nodeEnd.getID()
				if (!isRelated(with.getID, end, asType)) {
					val query = MessageFormat.format(rawQuery, with.getID.toString, end.toString)
					var List<Record> records = writeDB(query)
					logResult(records)
				}
				nodeEnd
			}
			case SUB_CLASS_OF_: {
				if (target !== null) {
					val end = nodeEnd.getID()
					if (!isRelated(target.getID, end, asType)) {
						val query = MessageFormat.format(rawQuery, target.getID.toString, end.toString)
						var List<Record> records = writeDB(query)
						logResult(records)
					}
				}
				nodeEnd
			}
			case PRECEED_BY_:{
				if (with !== null) {
					val end = nodeEnd.getAttribute(RESULT_)
					if (end instanceof IDictNode)
						if (!isRelated(with.getID, end.ID, asType)) {
							val query = MessageFormat.format(rawQuery, with.getID.toString, end.ID.toString)
							var List<Record> records = writeDB(query)
							logResult(records)
						}
				}
				nodeEnd
			}
			
		}
	}

	def void logResult(List<Record> records) {
		for (record : records ?: Collections.emptyList) {
			val param = record.get(_LINK)
			if (param instanceof RelationshipValue)
				logIt((param as RelationshipValue).asRelationship)
			if (param instanceof NullValue)
				logIt(null)
		}
	}

	def List<Record> writeDB(String query) {
		if (!DEBUG) {
			dbAccessor.runCodeRecords(query, Action.WRITE)
		} else {
			nodeStart.getDriver.logger.log(query)
			null
		}
	}

	def List<Record> readDB(String query) {
		dbAccessor.runCodeRecords(query, Action.READ)
	}

	protected def logIt(Relationship rel) {
		if (rel !== null){
			nodeStart.getDriver.logger.log('''Connection created:
«	»		START:  «nodeStart.getAttribute(NAME_)»
«	»		with: «nodeStart.getAttribute(WITH_)»
«	»		getSource: «nodeStart.getAttribute(GET_SOURCE_)»
«	»		getTarget: «nodeStart.getAttribute(GET_TARGET_)»
«	»		Node: «nodeEnd.getAttribute(_NODE)»
«	»		-
«	»		[Connection ID: «rel.id» , Type: «rel.type»]
«	»		->
«	»		END: «nodeEnd.getAttribute(NAME_)»
«	»		with: «nodeStart.getAttribute(WITH_)»
«	»		getSource: «nodeStart.getAttribute(GET_SOURCE_)»
«	»		getTarget: «nodeStart.getAttribute(GET_TARGET_)»
«	»		Node: «nodeEnd.getAttribute(_NODE)»
«	»		Debug:«DEBUG»
«	»		---------------------------------------------------------------''')

		} else {
			nodeStart.getDriver.logger.log('''Connection 'null' cannot be created!''')
		}
	}
}
