/**
 * generated by Xtext 2.33.0
 */
package org.xixum.latex.texDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multi</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xixum.latex.texDsl.Multi#getTokens <em>Tokens</em>}</li>
 * </ul>
 *
 * @see org.xixum.latex.texDsl.TexDslPackage#getMulti()
 * @model
 * @generated
 */
public interface Multi extends Compound
{
  /**
   * Returns the value of the '<em><b>Tokens</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tokens</em>' attribute list.
   * @see org.xixum.latex.texDsl.TexDslPackage#getMulti_Tokens()
   * @model unique="false"
   * @generated
   */
  EList<String> getTokens();

} // Multi
