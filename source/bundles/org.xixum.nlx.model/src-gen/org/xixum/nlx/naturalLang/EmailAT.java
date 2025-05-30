/**
 * generated by Xtext 2.36.0
 */
package org.xixum.nlx.naturalLang;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Email AT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xixum.nlx.naturalLang.EmailAT#getEmail <em>Email</em>}</li>
 * </ul>
 *
 * @see org.xixum.nlx.naturalLang.NaturalLangPackage#getEmailAT()
 * @model
 * @generated
 */
public interface EmailAT extends EObject
{
  /**
   * Returns the value of the '<em><b>Email</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Email</em>' attribute list.
   * @see org.xixum.nlx.naturalLang.NaturalLangPackage#getEmailAT_Email()
   * @model unique="false"
   * @generated
   */
  EList<String> getEmail();

} // EmailAT
