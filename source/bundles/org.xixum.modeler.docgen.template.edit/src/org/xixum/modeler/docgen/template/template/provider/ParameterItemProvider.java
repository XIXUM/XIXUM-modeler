/**
 * generated by template
 */
package org.xixum.modeler.docgen.template.template.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.xtext.common.types.TypesFactory;

import org.eclipse.xtext.xbase.XbaseFactory;

import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotationsFactory;

import org.eclipse.xtext.xtype.XtypeFactory;
import org.xixum.modeler.docgen.template.template.Parameter;
import org.xixum.modeler.docgen.template.template.TemplateFactory;
import org.xixum.modeler.docgen.template.template.TemplatePackage;

/**
 * This is the item provider adapter for a {@link org.xixum.modeler.docgen.template.template.Parameter} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ParameterItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Parameter_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Parameter_name_feature", "_UI_Parameter_type"),
				 TemplatePackage.Literals.PARAMETER__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(TemplatePackage.Literals.PARAMETER__ANNOTATIONS);
			childrenFeatures.add(TemplatePackage.Literals.PARAMETER__TYPE);
			childrenFeatures.add(TemplatePackage.Literals.PARAMETER__DEFAULTEXP);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Parameter.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Parameter"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Parameter)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Parameter_type") :
			getString("_UI_Parameter_type") + " " + label;
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Parameter.class)) {
			case TemplatePackage.PARAMETER__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case TemplatePackage.PARAMETER__ANNOTATIONS:
			case TemplatePackage.PARAMETER__TYPE:
			case TemplatePackage.PARAMETER__DEFAULTEXP:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(TemplatePackage.Literals.PARAMETER__ANNOTATIONS,
				 XAnnotationsFactory.eINSTANCE.createXAnnotation()));

		newChildDescriptors.add
			(createChildParameter
				(TemplatePackage.Literals.PARAMETER__TYPE,
				 TypesFactory.eINSTANCE.createJvmParameterizedTypeReference()));

		newChildDescriptors.add
			(createChildParameter
				(TemplatePackage.Literals.PARAMETER__TYPE,
				 TypesFactory.eINSTANCE.createJvmGenericArrayTypeReference()));

		newChildDescriptors.add
			(createChildParameter
				(TemplatePackage.Literals.PARAMETER__TYPE,
				 TypesFactory.eINSTANCE.createJvmWildcardTypeReference()));

		newChildDescriptors.add
			(createChildParameter
				(TemplatePackage.Literals.PARAMETER__TYPE,
				 TypesFactory.eINSTANCE.createJvmAnyTypeReference()));

		newChildDescriptors.add
			(createChildParameter
				(TemplatePackage.Literals.PARAMETER__TYPE,
				 TypesFactory.eINSTANCE.createJvmMultiTypeReference()));

		newChildDescriptors.add
			(createChildParameter
				(TemplatePackage.Literals.PARAMETER__TYPE,
				 TypesFactory.eINSTANCE.createJvmDelegateTypeReference()));

		newChildDescriptors.add
			(createChildParameter
				(TemplatePackage.Literals.PARAMETER__TYPE,
				 TypesFactory.eINSTANCE.createJvmSynonymTypeReference()));

		newChildDescriptors.add
			(createChildParameter
				(TemplatePackage.Literals.PARAMETER__TYPE,
				 TypesFactory.eINSTANCE.createJvmUnknownTypeReference()));

		newChildDescriptors.add
			(createChildParameter
				(TemplatePackage.Literals.PARAMETER__TYPE,
				 TypesFactory.eINSTANCE.createJvmInnerTypeReference()));

		newChildDescriptors.add
			(createChildParameter
				(TemplatePackage.Literals.PARAMETER__TYPE,
				 XtypeFactory.eINSTANCE.createXFunctionTypeRef()));

		newChildDescriptors.add
			(createChildParameter
				(TemplatePackage.Literals.PARAMETER__TYPE,
				 XtypeFactory.eINSTANCE.createXComputedTypeReference()));

		newChildDescriptors.add
			(createChildParameter
				(TemplatePackage.Literals.PARAMETER__DEFAULTEXP,
				 TemplateFactory.eINSTANCE.createRichString()));

		newChildDescriptors.add
			(createChildParameter
				(TemplatePackage.Literals.PARAMETER__DEFAULTEXP,
				 TemplateFactory.eINSTANCE.createRichStringLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(TemplatePackage.Literals.PARAMETER__DEFAULTEXP,
				 TemplateFactory.eINSTANCE.createRichStringForLoop()));

		newChildDescriptors.add
			(createChildParameter
				(TemplatePackage.Literals.PARAMETER__DEFAULTEXP,
				 TemplateFactory.eINSTANCE.createRichStringIf()));

		newChildDescriptors.add
			(createChildParameter
				(TemplatePackage.Literals.PARAMETER__DEFAULTEXP,
				 XAnnotationsFactory.eINSTANCE.createXAnnotation()));

		newChildDescriptors.add
			(createChildParameter
				(TemplatePackage.Literals.PARAMETER__DEFAULTEXP,
				 XbaseFactory.eINSTANCE.createXIfExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TemplatePackage.Literals.PARAMETER__DEFAULTEXP,
				 XbaseFactory.eINSTANCE.createXSwitchExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TemplatePackage.Literals.PARAMETER__DEFAULTEXP,
				 XbaseFactory.eINSTANCE.createXBlockExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TemplatePackage.Literals.PARAMETER__DEFAULTEXP,
				 XbaseFactory.eINSTANCE.createXVariableDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(TemplatePackage.Literals.PARAMETER__DEFAULTEXP,
				 XbaseFactory.eINSTANCE.createXMemberFeatureCall()));

		newChildDescriptors.add
			(createChildParameter
				(TemplatePackage.Literals.PARAMETER__DEFAULTEXP,
				 XbaseFactory.eINSTANCE.createXFeatureCall()));

		newChildDescriptors.add
			(createChildParameter
				(TemplatePackage.Literals.PARAMETER__DEFAULTEXP,
				 XbaseFactory.eINSTANCE.createXConstructorCall()));

		newChildDescriptors.add
			(createChildParameter
				(TemplatePackage.Literals.PARAMETER__DEFAULTEXP,
				 XbaseFactory.eINSTANCE.createXBooleanLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(TemplatePackage.Literals.PARAMETER__DEFAULTEXP,
				 XbaseFactory.eINSTANCE.createXNullLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(TemplatePackage.Literals.PARAMETER__DEFAULTEXP,
				 XbaseFactory.eINSTANCE.createXNumberLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(TemplatePackage.Literals.PARAMETER__DEFAULTEXP,
				 XbaseFactory.eINSTANCE.createXStringLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(TemplatePackage.Literals.PARAMETER__DEFAULTEXP,
				 XbaseFactory.eINSTANCE.createXListLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(TemplatePackage.Literals.PARAMETER__DEFAULTEXP,
				 XbaseFactory.eINSTANCE.createXSetLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(TemplatePackage.Literals.PARAMETER__DEFAULTEXP,
				 XbaseFactory.eINSTANCE.createXClosure()));

		newChildDescriptors.add
			(createChildParameter
				(TemplatePackage.Literals.PARAMETER__DEFAULTEXP,
				 XbaseFactory.eINSTANCE.createXCastedExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TemplatePackage.Literals.PARAMETER__DEFAULTEXP,
				 XbaseFactory.eINSTANCE.createXBinaryOperation()));

		newChildDescriptors.add
			(createChildParameter
				(TemplatePackage.Literals.PARAMETER__DEFAULTEXP,
				 XbaseFactory.eINSTANCE.createXUnaryOperation()));

		newChildDescriptors.add
			(createChildParameter
				(TemplatePackage.Literals.PARAMETER__DEFAULTEXP,
				 XbaseFactory.eINSTANCE.createXPostfixOperation()));

		newChildDescriptors.add
			(createChildParameter
				(TemplatePackage.Literals.PARAMETER__DEFAULTEXP,
				 XbaseFactory.eINSTANCE.createXForLoopExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TemplatePackage.Literals.PARAMETER__DEFAULTEXP,
				 XbaseFactory.eINSTANCE.createXBasicForLoopExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TemplatePackage.Literals.PARAMETER__DEFAULTEXP,
				 XbaseFactory.eINSTANCE.createXDoWhileExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TemplatePackage.Literals.PARAMETER__DEFAULTEXP,
				 XbaseFactory.eINSTANCE.createXWhileExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TemplatePackage.Literals.PARAMETER__DEFAULTEXP,
				 XbaseFactory.eINSTANCE.createXTypeLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(TemplatePackage.Literals.PARAMETER__DEFAULTEXP,
				 XbaseFactory.eINSTANCE.createXInstanceOfExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TemplatePackage.Literals.PARAMETER__DEFAULTEXP,
				 XbaseFactory.eINSTANCE.createXThrowExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TemplatePackage.Literals.PARAMETER__DEFAULTEXP,
				 XbaseFactory.eINSTANCE.createXTryCatchFinallyExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TemplatePackage.Literals.PARAMETER__DEFAULTEXP,
				 XbaseFactory.eINSTANCE.createXAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(TemplatePackage.Literals.PARAMETER__DEFAULTEXP,
				 XbaseFactory.eINSTANCE.createXReturnExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TemplatePackage.Literals.PARAMETER__DEFAULTEXP,
				 XbaseFactory.eINSTANCE.createXSynchronizedExpression()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == TemplatePackage.Literals.PARAMETER__ANNOTATIONS ||
			childFeature == TemplatePackage.Literals.PARAMETER__DEFAULTEXP;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return TemplateEditPlugin.INSTANCE;
	}

}
