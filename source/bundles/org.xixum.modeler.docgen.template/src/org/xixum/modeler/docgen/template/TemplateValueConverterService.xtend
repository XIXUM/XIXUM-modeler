/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.xixum.modeler.docgen.template

import com.google.inject.Inject
import org.eclipse.xtext.conversion.IValueConverter
import org.eclipse.xtext.conversion.ValueConverter
import org.eclipse.xtext.conversion.impl.STRINGValueConverter
import org.eclipse.xtext.xbase.conversion.XbaseValueConverterService
import org.eclipse.xtext.util.Strings
import org.eclipse.xtext.nodemodel.INode
import org.eclipse.xtext.conversion.ValueConverterWithValueException

class TemplateValueConverterService extends XbaseValueConverterService {

	@Inject TextValueConverter textValueConverter
	
	@ValueConverter(rule = "TEXT")
	def IValueConverter<String> TEXT() {
		return textValueConverter;
	}
}

/**
 * removes the surrounding terminals in template text
 */
class TextValueConverter extends STRINGValueConverter {
	
	override protected toEscapedString(String value) {
		'»' + Strings.convertToJavaString(value, false) + '«'
	}		
	
	//TODO why is this needed?
	override protected convertFromString(String literal, INode node) throws ValueConverterWithValueException {
		return literal.substring(1, literal.length-1)
	}
	
}
