/**
 * generated by Xtext 2.16.0
 */
package org.xtext.example.mydsl.mml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Validation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.mml.Validation#getStratification <em>Stratification</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.mml.Validation#getMetric <em>Metric</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.mml.MmlPackage#getValidation()
 * @model
 * @generated
 */
public interface Validation extends EObject
{
  /**
   * Returns the value of the '<em><b>Stratification</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Stratification</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stratification</em>' containment reference.
   * @see #setStratification(StratificationMethod)
   * @see org.xtext.example.mydsl.mml.MmlPackage#getValidation_Stratification()
   * @model containment="true"
   * @generated
   */
  StratificationMethod getStratification();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.mml.Validation#getStratification <em>Stratification</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Stratification</em>' containment reference.
   * @see #getStratification()
   * @generated
   */
  void setStratification(StratificationMethod value);

  /**
   * Returns the value of the '<em><b>Metric</b></em>' attribute list.
   * The list contents are of type {@link org.xtext.example.mydsl.mml.ValidationMetric}.
   * The literals are from the enumeration {@link org.xtext.example.mydsl.mml.ValidationMetric}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Metric</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Metric</em>' attribute list.
   * @see org.xtext.example.mydsl.mml.ValidationMetric
   * @see org.xtext.example.mydsl.mml.MmlPackage#getValidation_Metric()
   * @model unique="false"
   * @generated
   */
  EList<ValidationMetric> getMetric();

} // Validation
