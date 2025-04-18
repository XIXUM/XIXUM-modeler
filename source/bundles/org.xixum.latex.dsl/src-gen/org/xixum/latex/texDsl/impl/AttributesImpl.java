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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xixum.latex.texDsl.Attributes;
import org.xixum.latex.texDsl.Multi;
import org.xixum.latex.texDsl.TexDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attributes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xixum.latex.texDsl.impl.AttributesImpl#getKey <em>Key</em>}</li>
 *   <li>{@link org.xixum.latex.texDsl.impl.AttributesImpl#getMulti <em>Multi</em>}</li>
 *   <li>{@link org.xixum.latex.texDsl.impl.AttributesImpl#getSingle <em>Single</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributesImpl extends MinimalEObjectImpl.Container implements Attributes
{
  /**
   * The default value of the '{@link #getKey() <em>Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKey()
   * @generated
   * @ordered
   */
  protected static final String KEY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getKey() <em>Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKey()
   * @generated
   * @ordered
   */
  protected String key = KEY_EDEFAULT;

  /**
   * The cached value of the '{@link #getMulti() <em>Multi</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMulti()
   * @generated
   * @ordered
   */
  protected EList<Multi> multi;

  /**
   * The default value of the '{@link #getSingle() <em>Single</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSingle()
   * @generated
   * @ordered
   */
  protected static final String SINGLE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSingle() <em>Single</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSingle()
   * @generated
   * @ordered
   */
  protected String single = SINGLE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AttributesImpl()
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
    return TexDslPackage.Literals.ATTRIBUTES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getKey()
  {
    return key;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setKey(String newKey)
  {
    String oldKey = key;
    key = newKey;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TexDslPackage.ATTRIBUTES__KEY, oldKey, key));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Multi> getMulti()
  {
    if (multi == null)
    {
      multi = new EObjectContainmentEList<Multi>(Multi.class, this, TexDslPackage.ATTRIBUTES__MULTI);
    }
    return multi;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getSingle()
  {
    return single;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSingle(String newSingle)
  {
    String oldSingle = single;
    single = newSingle;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TexDslPackage.ATTRIBUTES__SINGLE, oldSingle, single));
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
      case TexDslPackage.ATTRIBUTES__MULTI:
        return ((InternalEList<?>)getMulti()).basicRemove(otherEnd, msgs);
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
      case TexDslPackage.ATTRIBUTES__KEY:
        return getKey();
      case TexDslPackage.ATTRIBUTES__MULTI:
        return getMulti();
      case TexDslPackage.ATTRIBUTES__SINGLE:
        return getSingle();
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
      case TexDslPackage.ATTRIBUTES__KEY:
        setKey((String)newValue);
        return;
      case TexDslPackage.ATTRIBUTES__MULTI:
        getMulti().clear();
        getMulti().addAll((Collection<? extends Multi>)newValue);
        return;
      case TexDslPackage.ATTRIBUTES__SINGLE:
        setSingle((String)newValue);
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
      case TexDslPackage.ATTRIBUTES__KEY:
        setKey(KEY_EDEFAULT);
        return;
      case TexDslPackage.ATTRIBUTES__MULTI:
        getMulti().clear();
        return;
      case TexDslPackage.ATTRIBUTES__SINGLE:
        setSingle(SINGLE_EDEFAULT);
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
      case TexDslPackage.ATTRIBUTES__KEY:
        return KEY_EDEFAULT == null ? key != null : !KEY_EDEFAULT.equals(key);
      case TexDslPackage.ATTRIBUTES__MULTI:
        return multi != null && !multi.isEmpty();
      case TexDslPackage.ATTRIBUTES__SINGLE:
        return SINGLE_EDEFAULT == null ? single != null : !SINGLE_EDEFAULT.equals(single);
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
    result.append(" (key: ");
    result.append(key);
    result.append(", single: ");
    result.append(single);
    result.append(')');
    return result.toString();
  }

} //AttributesImpl
