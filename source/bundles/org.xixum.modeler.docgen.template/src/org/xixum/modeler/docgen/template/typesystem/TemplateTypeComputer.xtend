package org.xixum.modeler.docgen.template.typesystem

import org.eclipse.xtext.xbase.XBlockExpression
import org.eclipse.xtext.xbase.XExpression
import org.eclipse.xtext.xbase.XForLoopExpression
import org.eclipse.xtext.xbase.annotations.typesystem.XbaseWithAnnotationsTypeComputer
import org.eclipse.xtext.xbase.typesystem.computation.ITypeComputationState
import org.xixum.modeler.docgen.template.template.RichString
import org.xixum.modeler.docgen.template.template.RichStringForLoop

class TemplateTypeComputer extends XbaseWithAnnotationsTypeComputer {
	
	override computeTypes(XExpression expression, ITypeComputationState state) {
		if(expression instanceof RichString) {
			_computeTypes(expression, state);
		} else if(expression instanceof RichStringForLoop) {
			_computeTypes(expression, state);
		} else {
			super.computeTypes(expression, state)
		}
	}
	
	protected def _computeTypes(RichString expression, ITypeComputationState state) {
		super._computeTypes(expression as XBlockExpression, state)
		state.acceptActualType(getTypeForName(StringBuilder, state))
	}
	 
	protected def _computeTypes(RichStringForLoop expression, ITypeComputationState state) {
		super._computeTypes(expression as XForLoopExpression, state)
		state.acceptActualType(getTypeForName(StringBuilder, state))
	}
}