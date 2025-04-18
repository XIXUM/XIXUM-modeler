/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.xixum.modeler.docgen.template.ui.contentassist

import org.eclipse.emf.ecore.EObject
import org.eclipse.jface.text.contentassist.CompletionProposal
import org.eclipse.xtext.RuleCall
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor

/**
 * see http://www.eclipse.org/Xtext/documentation/latest/xtext.html#contentAssist on how to customize content assistant
 */
class TemplateProposalProvider extends AbstractTemplateProposalProvider {
	
	override complete_TEXT(EObject model, RuleCall ruleCall, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		acceptor.accept(new CompletionProposal("«»", context.getOffset(), 0, 1))
	}
}
