/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.xixum.modeler.docgen.template.validation

import org.eclipse.xtext.xbase.XExpression
import org.eclipse.xtext.validation.Check

class TemplateValidator extends AbstractTemplateValidator {

	override checkInnerExpressions(XExpression expr) {
		// disabled
	}
	
//	public static val INVALID_NAME = 'invalidName'
//
//	@Check
//	def checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character.isUpperCase(greeting.name.charAt(0))) {
//			warning('Name should start with a capital', 
//					TemplatePackage.Literals.GREETING__NAME,
//					INVALID_NAME)
//		}
//	}
}
