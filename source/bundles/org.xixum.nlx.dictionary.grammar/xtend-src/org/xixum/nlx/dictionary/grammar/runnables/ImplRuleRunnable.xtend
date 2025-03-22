package org.xixum.nlx.dictionary.grammar.runnables

import org.xixum.nlx.ai.semantics.INode
import org.xixum.nlx.dictionary.grammar.nodes.ImplRuleNode
import org.xixum.nlx.dictionary.grammar.token.IGrammarItem
import java.util.HashMap

class ImplRuleRunnable extends Thread implements IRuleRunnable {
	protected static int nextRunnerNumber = 0
	protected int runnerNr
	protected ImplRuleNode implRuleNode
	protected IGrammarItem token
	protected HashMap<Integer, INode> result = new HashMap
	protected String lock

	new(ImplRuleNode implRuleNode, IGrammarItem token) {
		super('''ImplRuleRunner-«implRuleNode.getName»-«nextRunnerNumber++»''')
		this.lock = name
		runnerNr = nextRunnerNumber
		this.implRuleNode = implRuleNode
		this.token = token
	}

	def solve() {
				var INode value = implRuleNode.solve()
				if (value !== null) { // contraction handling unclear
					var int i = token.getIndex()
					result.put(i, value)
					implRuleNode.getDriver.logger.log('''[ImplRuleRunner-«runnerNr»] [Error]: Required Input on Token:[«i»][name: «token.toString»] Result:«result.get(i)»''')
				}
	}

	override run() {
			solve
	}
	
	override getResult() {
		result
	}
}
