/*
 * generated by Xtext 2.33.0
 */
package org.xixum.latex.ui.labeling;

import static org.xixum.latex.ui.constants.StylingConstants.BOLD_LIGHT_RED;
import static org.xixum.latex.ui.constants.StylingConstants.ITALIC_BLACK;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.StyledString;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider;
//import org.xixum.latex.texDsl.Attributes;
//import org.xixum.latex.texDsl.Command;
//import org.xixum.latex.texDsl.SubCommName;
//import org.xixum.latex.texDsl.SubCommand;
//import org.xixum.latex.texDsl.SubParams;
//import org.xixum.latex.texDsl.Token;

import com.google.inject.Inject;

/**
 * Provides labels for EObjects.
 * 
 * See https://www.eclipse.org/Xtext/documentation/310_eclipse_support.html#label-provider
 */
public class TexDslLabelProvider extends DefaultEObjectLabelProvider {

	@Inject
	public TexDslLabelProvider(AdapterFactoryLabelProvider delegate) {
		super(delegate);
	}
	
//	@Override
//	public Object doGetText(Object element) {
//		return text(element);
//	}
//
//	@Override
//	public Object text(Object element) {
//		if (!(element instanceof EObject)) {
//			return null;
//		}
//		var styledText = new StyledString(((EObject)element).eClass().getName());
//		styledText.append(": ");
//		// Java21 switch statement
//		switch (element) {
//			case Command c -> {
//				var commandName = c.getCommand();
//				styledText.append(commandName.getLeading());
//				styledText.append(new StyledString(commandName.getCName(), BOLD_LIGHT_RED));
//				
//				if (c.getParameters()!=null) {
//					resolveParametersStyled(styledText, c);
//				}
//				
//				if (c.getSubCommand()!=null) {
//					resolveSubCommandStyled(styledText, c.getSubCommand());
//				}
//				
//            }
//			default -> {
//				styledText.append(((EObject)element).eClass().getName());
//			}
//		
//		}
//		
//		return styledText;
//		
//	}
//
//	private void resolveParametersStyled(StyledString styledText, Command command) {
//		var c = command.getParameters();
//		var content = new StyledString(String.join(", ", styleAttributes(c.getAttributes())), ITALIC_BLACK);
//		styledText.append("[");
//		styledText.append(content);
//		styledText.append("]");
//	}
//
//	private void resolveSubCommandStyled(StyledString styledText, SubCommand subCommand) {
//		styledText.append(" {");
//		
//		resolveTypesStyled(styledText, subCommand.getTypes());
//		styledText.append("}");
//	}
//	
//	private void resolveTypesStyled(StyledString styledText, EList<SubCommName> types) {
//		var first = true;
//		for (var element : types) {
//			if (!first) {
//				styledText.append("|");
//			}
//			styledText.append(new StyledString(element.getId(), ITALIC_BLACK));
//			if (element.getSubParams() != null) {
//				resolveSubParamStyled(styledText, element.getSubParams());
//			}
//			first = false;
//			//els.add(sb.toString());
//		}
//		//return els;
//	}
//
//	private void resolveSubParamStyled(StyledString styledText, SubParams params) {
//		var content = new StyledString(String.join(", ", resolveTypes(params.getParams())), ITALIC_BLACK);
//		styledText.append("{");
//		styledText.append(content);
//		styledText.append("}");
//		
//	}
//
//	@Override
//	public org.eclipse.jface.viewers.StyledString getStyledText(Object element) {
//		return (org.eclipse.jface.viewers.StyledString) new org.eclipse.jface.viewers.StyledString(unast(element));
//	}
//
//	//TODO: redundant to text method except style
//	private String unast(Object element) {
//		if (!(element instanceof EObject)) {
//			return null;
//		}
//		var sb = new StringBuilder(((EObject)element).eClass().getName());
//		sb.append(": ");
//		// Java21 switch statement
//		switch (element) {
//			case Command c -> {
//				var commandName = c.getCommand();
//				sb.append(commandName.getLeading());
//				sb.append(commandName.getCName());
//				
//				if (c.getParameters()!=null) {
//					sb.append(resolveParameters(c));
//				}
//				
//				if (c.getSubCommand()!=null) {
//					sb.append(resolveSubCommand(c.getSubCommand()));
//				}
//				
//            }
//			case CommandName c -> {
//				sb.append(c.getLeading());
//				sb.append(c.getCName());
//			}
//			case Attributes a -> {
//				sb.append(a.getKey());
//				boolean hasValue = a.getValue() != null;
//				boolean hasMultiValue = !a.getMultiValue().isEmpty();
//				if (hasValue || hasMultiValue) {
//					sb.append("=");
//					if (hasMultiValue) {
//						sb.append(styleMultiValue(a.getMultiValue()));
//					} else {
//						sb.append(a.getValue());
//					}
//				}
//			}
//			case Token t -> {
//				sb.append(t.getToken());
//			}
//			
//			default -> {
//				sb.append(((EObject)element).eClass().getName());
//			}
//		
//		}
//		
//		return sb.toString();
//	}
//
//	private String resolveSubCommand(SubCommand subCommand) {
//		var sb = new StringBuilder();
//		sb.append(" {");
//		sb.append(String.join(", ", resolveTypes(subCommand.getTypes())));
//		sb.append("}");
//		return null;
//	}
//
//	private List<String> resolveTypes(EList<SubCommName> types) {
//		List<String> els = new ArrayList<>();
//		for (var element : types) {
//			var sb = new StringBuilder();
//			sb.append(element.getId());
//			if (element.getSubParams() != null) {
//				sb.append(resolveSubParams(element.getSubParams()));
//			}
//			els.add(sb.toString());
//		}
//		return els;
//	}
//
//	private Object resolveSubParams(SubParams subParams) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	private String resolveParameters(Command c) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	private List<String> styleAttributes(EList<Attributes> attributes) {
//		var result = new ArrayList<String>();
//		
//		attributes.forEach(element -> {
//			var value = 
//					element.getValue()!=null && element.getMultiValue().isEmpty() 
//						? element.getValue() 
//						: styleMultiValue(element.getMultiValue());
//			if (value.isEmpty()) {
//				result.add(element.getKey());
//            } else 
//            	result.add(String.join("=", element.getKey(), value));
//		});
//		return result;
//	}
//
//	private String styleMultiValue(EList<String> multiValue) {
//		var elements = String.join(", ", multiValue);		
//		if (elements.isEmpty()) {
//			return "";
//		}
//	    return "{" + elements + "}";
//	}
}
