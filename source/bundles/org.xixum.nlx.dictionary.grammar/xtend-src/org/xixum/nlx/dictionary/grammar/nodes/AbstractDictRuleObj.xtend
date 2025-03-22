/**
 * AbstractDictRuleObj - Base Obj for Abstract dictionary rules
 * (c) 2020 licensed under Apache Public License 2.0
 * www.felixschaller.com
 * @author Felix Schaller
 */

package org.xixum.nlx.dictionary.grammar.nodes

import static org.xixum.nlx.constants.Neo4jConstants._ATTR_NAME
import static org.xixum.nlx.constants.Neo4jConstants._LINK
import static org.xixum.nlx.constants.Neo4jConstants._NODE
import static org.xixum.nlx.constants.Neo4jConstants._NAME
import static org.xixum.nlx.constants.Neo4jConstants._TARGET
import static org.xixum.nlx.dictionary.constants.NodeConstants._KOMMA_SEP_FILTER
import static org.xixum.nlx.dictionary.constants.NodeConstants._NEGATIVE_FILTER
import static org.xixum.nlx.constants.Neo4jConstants._TOKEN

import org.xixum.nlx.ai.IFunction1
import org.xixum.nlx.ai.IParserDriver
import org.xixum.nlx.ai.neo4j.Neo4jAccess.Action
import org.xixum.nlx.ai.semantics.INode
import org.xixum.nlx.ai.semantics.IPredicate
import org.xixum.nlx.ai.util.NodeUtil
import org.xixum.nlx.dictionary.grammar.bool.BoolOp
import java.util.ArrayList
import java.util.Collections
import java.util.HashMap
import java.util.List
import org.neo4j.driver.internal.value.NodeValue
import org.neo4j.driver.internal.value.RelationshipValue
import org.neo4j.driver.v1.Record
import org.xixum.nlx.constants.Direction
import org.xixum.nlx.ai.util.Arrow
import java.util.Map
import org.neo4j.driver.v1.types.Node
import org.eclipse.xtext.xbase.lib.Functions.Function1
import org.xixum.nlx.dictionary.grammar.token.IGrammarItem

abstract class AbstractDictRuleObj extends AbstractNode implements INode {
	protected Node node
	protected String label
	protected String name
	protected long ID
	protected IParserDriver driver
	protected Map<String, List<IPredicate>> predicates
	protected List<String> negativeFilter
	protected List<String> positiveFilter
	
	protected Map<Long, Map<String, INode>> children = newHashMap
	
	protected Map<String,String> mapResultTo = newHashMap
	

	new(Node node, IParserDriver driver) {
		this.node = node
		this.name = node.get(_NAME).asString
		this.driver = driver
		this.label = internalGetLabelFromNode()
		this.attributes = internalGetAttrFromNode()
		this.ID = internalGetIdFromNode(node)
	}

	protected def Map<String, Object> internalGetAttrFromNode() {
		new HashMap<String, Object>(node.asMap())
	}

	protected def String internalGetLabelFromNode() {
		// TODO: unfinished
		var Iterable<String> result = node.labels()
		result.get(0)
	}

	protected def long internalGetIdFromNode(Node node) {
		node.id
	}

	override Node getNodeRef() {
		node
	}

	override void setNodeRef(Node node) {
		this.node = node
	}

	override boolean hasLabel(Node node, String name) {
		for (label : node.labels) {
			if (label.equals(name)) return true
		}
		return false
	}

	override toString() {
		'''Node of Class:(«this.class»), 
Labels:(«label»), Attributes:(«attributes.toString()»)'''
	}

override List<Record> listAllConnections() {
		val query = '''MATCH («_NODE»:«label»)-[«_LINK»]-(«_TARGET»)
WHERE ID(«_NODE») = «ID»
RETURN «_LINK», «_TARGET»'''
		driver.dbAccessor.runCodeRecords(query, Action.READ)
	}
	
	override List<Record> listConnections(String type) {
		val query = '''MATCH («_NODE»:«label»)-[«_LINK»:«type»]-(«_TARGET»)
WHERE ID(«_NODE») = «ID»
RETURN «_LINK», «_TARGET»'''
		driver.dbAccessor.runCodeRecords(query, Action.READ)
	}

	override List<Record> listAllOutputs() {
		val query = '''MATCH («_NODE»:«label»)-[«_LINK»]->(«_TARGET»)
WHERE ID(«_NODE») = «ID»
RETURN «_LINK», «_TARGET»'''
		driver.dbAccessor.runCodeRecords(query, Action.READ)
	}

	override List<Record> listAllInputs() {
		val query = '''MATCH («_NODE»:«label»)<-[«_LINK»]-(«_TARGET»)
WHERE ID(«_NODE») = «ID»
RETURN «_LINK», «_TARGET»'''
		driver.dbAccessor.runCodeRecords(query, Action.READ)
	}


	override long getID() {
		ID
	}

	override String getLabel() {
		label
	}
	
	override String getName() {
		name
	}

	override INode findNodeAndCreateTarget(String string, IFunction1<Object, ? extends Object> delegate) {
		var result = delegate.apply(string) // findLinkedNodeByName(string)
		if (result instanceof List) {
			var List<Node> nodes = result
			if (nodes !== null && !nodes.isEmpty)
				driver.getNodeById(nodes.get(0))
		}
	}


	// TODO: redundant find a general solution
	override List<Node> findNodeTypeByName(String type, String name) {
		val query = '''
MATCH («_NODE»:«type» {«_ATTR_NAME»:"«name»"})
RETURN «_NODE»'''
		val List<Record> records = driver.dbAccessor.runCodeRecords(query, Action.READ)
		NodeUtil.recordsToNode(records, _NODE)
	}

	override List<Node> findLinkedNodeByName(String string, String linkType, Direction dir) {
		val query = '''
MATCH («_NODE»:«label» {«_ATTR_NAME»:"«attributes.get(_ATTR_NAME.toString)»"})«new Arrow(null, linkType, dir).generate»(«_TARGET» {«_ATTR_NAME»: "«string»"})
WHERE ID(«_NODE») = «ID»
RETURN «_TARGET»'''
		val List<Record> records = driver.dbAccessor.runCodeRecords(query, Action.READ)
		NodeUtil.recordsToNode(records, _TARGET)
	}

	protected def void createPredicates(List<Record> outs) {
		predicates = newHashMap
		for (record : outs) {
			var RelationshipValue rel = record.get(_LINK.toString) as RelationshipValue
			var predicate = driver.predicateFactory.create(
				rel,
				this,
				driver.getNodeById((record.get(_TARGET) as NodeValue).asNode)  //TODO: 01.12.22 require bidirectional relation for tracing
			)
			var type = rel.asRelationship.type.toLowerCase
			if (predicate !== null) {
				var result = predicates.get(type)
				if (result === null)
					result = new ArrayList
				result.add(predicate)
				predicates.put(type, result)
			}
		}
	}

	protected def INode doExecuteTypes(List<String> types, BoolOp boolOp) {
		var INode result
		for (connection : types) { // iterate through types
			var type = predicates.get(connection)
			if (type !== null && !type.isEmpty) {
				result = doExecuteType(connection, boolOp, type)
				if (result !== null)
					setAttribute(connection, result) 
				if (boolOp.isTrue(result))
					return boolOp.returnIntermediate(result)
			}
		}
		boolOp.returnFinal(result)
	}

	protected def INode doExecuteType(String type, BoolOp boolOp, List<IPredicate> connections) {
		var INode result
		if (negativeFilter !== null && negativeFilter.contains(type))
			return null
		for (predicate : connections ?: Collections.emptyList) {
			result = predicate.execute()
			if (boolOp.isTrue(result))
				return boolOp.returnIntermediate(result)
		}
		boolOp.returnFinal(result)
	}

	override setFilter(String filter) {
		negativeFilter = new ArrayList
		positiveFilter = new ArrayList
		for (element : filter.split(_KOMMA_SEP_FILTER)) {
			if (element.startsWith(_NEGATIVE_FILTER))
				negativeFilter.add(element.substring(1))
			else
				positiveFilter.add(element) // positive Filter not supported yet
		}
	}
	
	def INode executeQuery(String query, IParserDriver driver) {
		var List<Node> nodes = NodeUtil.recordsToNode(driver.dbAccessor.runCodeRecords(query, Action.WRITE), _TARGET)
		if (nodes !== null && !nodes.isEmpty)
			driver.getNodeById(nodes.get(0))
		else
			null
	}
	
	/**
	* Wrapper function that unifies common tasks for next and previous by calling designated delegate from predicate method
	*/
	def wrappedWalker(INode node, Function1<INode, Object> preSolveDelegate, Function1<INode, Object> postSolveDelegate, String filter) {
		init
		val contextS = node.getAttribute(_TOKEN) 
		if (contextS === null)
			return null
		
		val target = preSolveDelegate?.apply(node)
		if (target === null)
			return null
		if (target instanceof IGrammarItem){
			setAttribute(_TOKEN, target)
			setAttribute(_NODE,  driver.getNodeById(target.baseNode)) 
		}
		if (filter !== null)
			setFilter(filter)
		val res = solve
		postSolveDelegate?.apply(node)
		return res
	}

	override IParserDriver getDriver() {
		driver
	}

	override INode solve()
	
	override getChildren() {
		children
	}
}
