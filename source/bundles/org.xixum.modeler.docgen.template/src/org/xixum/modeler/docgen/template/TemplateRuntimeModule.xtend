/** 
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.xixum.modeler.docgen.template

import org.eclipse.xtext.conversion.IValueConverterService
import org.eclipse.xtext.xbase.compiler.XbaseCompiler
import org.eclipse.xtext.xbase.typesystem.computation.ITypeComputer
import org.xixum.modeler.docgen.template.jvmmodel.TemplateCompiler
import org.xixum.modeler.docgen.template.typesystem.TemplateTypeComputer

/** 
 * Use this class to register components to be used at runtime / without the
 * Equinox extension registry.
 */
class TemplateRuntimeModule extends org.xixum.modeler.docgen.template.AbstractTemplateRuntimeModule {
	override Class<? extends IValueConverterService> bindIValueConverterService() {
		return TemplateValueConverterService
	}

	def Class<? extends XbaseCompiler> bindXbaseCompiler() {
		return TemplateCompiler
	}

	override Class<? extends ITypeComputer> bindITypeComputer() {
		return TemplateTypeComputer
	}
}
