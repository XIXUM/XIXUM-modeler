/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.xixum.modeler.docgen.template.ui.highlighting

import org.eclipse.xtext.xbase.ui.highlighting.XbaseHighlightingConfiguration
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor
import org.eclipse.xtext.ui.editor.utils.TextStyle
import org.eclipse.swt.graphics.RGB

class TemplateHighlightingConfiguration extends XbaseHighlightingConfiguration {

	public static val TEXT = 'template.text'
	public static val ESCAPE = 'teamplate.escape'

	override configure(IHighlightingConfigurationAcceptor acceptor) {
		acceptor.acceptDefaultHighlighting(TEXT, 'Text', staticText)
		acceptor.acceptDefaultHighlighting(ESCAPE, 'Statement/Expression Escape Symbols', staticEscape)
		super.configure([id, name, style| 
			style.backgroundColor = new RGB(230, 230, 230)
			acceptor.acceptDefaultHighlighting(id, name, style)
		])
	}

	def TextStyle staticText() {
		defaultTextStyle.copy => [
			color= new RGB(0, 0, 0)
		]
	}

	def TextStyle staticEscape() {
		defaultTextStyle.copy => [
			color = new RGB(180, 180, 180)
			backgroundColor = new RGB(230, 230, 230)
		]
	}
}
