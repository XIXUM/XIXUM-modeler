/**
 * generated by Xtext 2.36.0
 */
package org.xixum.nlx.naturalLang;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Formula</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xixum.nlx.naturalLang.Formula#getName <em>Name</em>}</li>
 *   <li>{@link org.xixum.nlx.naturalLang.Formula#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see org.xixum.nlx.naturalLang.NaturalLangPackage#getFormula()
 * @model
 * @generated
 */
public interface Formula extends NoNElement
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' containment reference list.
   * @see org.xixum.nlx.naturalLang.NaturalLangPackage#getFormula_Name()
   * @model containment="true"
   * @generated
   */
  EList<EObject> getName();

  /**
   * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
   * The list contents are of type {@link org.xixum.nlx.naturalLang.BracketSentence}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters</em>' containment reference list.
   * @see org.xixum.nlx.naturalLang.NaturalLangPackage#getFormula_Parameters()
   * @model containment="true"
   * @generated
   */
  EList<BracketSentence> getParameters();

} // Formula
