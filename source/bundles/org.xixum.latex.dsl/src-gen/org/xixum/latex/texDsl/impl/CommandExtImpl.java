/**
 * generated by Xtext 2.33.0
 */
package org.xixum.latex.texDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xixum.latex.texDsl.CommandExt;
import org.xixum.latex.texDsl.Compound;
import org.xixum.latex.texDsl.TexDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Command Ext</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xixum.latex.texDsl.impl.CommandExtImpl#getCommand <em>Command</em>}</li>
 *   <li>{@link org.xixum.latex.texDsl.impl.CommandExtImpl#getTokens <em>Tokens</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommandExtImpl extends CompoundImpl implements CommandExt
{
  /**
   * The default value of the '{@link #getCommand() <em>Command</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCommand()
   * @generated
   * @ordered
   */
  protected static final String COMMAND_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCommand() <em>Command</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCommand()
   * @generated
   * @ordered
   */
  protected String command = COMMAND_EDEFAULT;

  /**
   * The cached value of the '{@link #getTokens() <em>Tokens</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTokens()
   * @generated
   * @ordered
   */
  protected EList<Compound> tokens;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CommandExtImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return TexDslPackage.Literals.COMMAND_EXT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getCommand()
  {
    return command;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCommand(String newCommand)
  {
    String oldCommand = command;
    command = newCommand;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TexDslPackage.COMMAND_EXT__COMMAND, oldCommand, command));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Compound> getTokens()
  {
    if (tokens == null)
    {
      tokens = new EObjectContainmentEList<Compound>(Compound.class, this, TexDslPackage.COMMAND_EXT__TOKENS);
    }
    return tokens;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case TexDslPackage.COMMAND_EXT__TOKENS:
        return ((InternalEList<?>)getTokens()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case TexDslPackage.COMMAND_EXT__COMMAND:
        return getCommand();
      case TexDslPackage.COMMAND_EXT__TOKENS:
        return getTokens();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case TexDslPackage.COMMAND_EXT__COMMAND:
        setCommand((String)newValue);
        return;
      case TexDslPackage.COMMAND_EXT__TOKENS:
        getTokens().clear();
        getTokens().addAll((Collection<? extends Compound>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case TexDslPackage.COMMAND_EXT__COMMAND:
        setCommand(COMMAND_EDEFAULT);
        return;
      case TexDslPackage.COMMAND_EXT__TOKENS:
        getTokens().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case TexDslPackage.COMMAND_EXT__COMMAND:
        return COMMAND_EDEFAULT == null ? command != null : !COMMAND_EDEFAULT.equals(command);
      case TexDslPackage.COMMAND_EXT__TOKENS:
        return tokens != null && !tokens.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (command: ");
    result.append(command);
    result.append(')');
    return result.toString();
  }

} //CommandExtImpl
