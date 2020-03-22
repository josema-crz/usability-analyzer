/**
 */
package usability_rules;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link usability_rules.Rule#getCalculation <em>Calculation</em>}</li>
 *   <li>{@link usability_rules.Rule#getRestriction <em>Restriction</em>}</li>
 *   <li>{@link usability_rules.Rule#getCorrection <em>Correction</em>}</li>
 *   <li>{@link usability_rules.Rule#getDescription <em>Description</em>}</li>
 *   <li>{@link usability_rules.Rule#getImportance <em>Importance</em>}</li>
 *   <li>{@link usability_rules.Rule#getRange <em>Range</em>}</li>
 *   <li>{@link usability_rules.Rule#getElementType <em>Element Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see usability_rules.Usability_rulesPackage#getRule()
 * @model
 * @generated
 */
public interface Rule extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Calculation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Calculation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calculation</em>' containment reference.
	 * @see #setCalculation(EOLCode)
	 * @see usability_rules.Usability_rulesPackage#getRule_Calculation()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EOLCode getCalculation();

	/**
	 * Sets the value of the '{@link usability_rules.Rule#getCalculation <em>Calculation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calculation</em>' containment reference.
	 * @see #getCalculation()
	 * @generated
	 */
	void setCalculation(EOLCode value);

	/**
	 * Returns the value of the '<em><b>Restriction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Restriction</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Restriction</em>' containment reference.
	 * @see #setRestriction(EOLCode)
	 * @see usability_rules.Usability_rulesPackage#getRule_Restriction()
	 * @model containment="true"
	 * @generated
	 */
	EOLCode getRestriction();

	/**
	 * Sets the value of the '{@link usability_rules.Rule#getRestriction <em>Restriction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Restriction</em>' containment reference.
	 * @see #getRestriction()
	 * @generated
	 */
	void setRestriction(EOLCode value);

	/**
	 * Returns the value of the '<em><b>Correction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Correction</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Correction</em>' containment reference.
	 * @see #setCorrection(EOLCode)
	 * @see usability_rules.Usability_rulesPackage#getRule_Correction()
	 * @model containment="true"
	 * @generated
	 */
	EOLCode getCorrection();

	/**
	 * Sets the value of the '{@link usability_rules.Rule#getCorrection <em>Correction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Correction</em>' containment reference.
	 * @see #getCorrection()
	 * @generated
	 */
	void setCorrection(EOLCode value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(Description)
	 * @see usability_rules.Usability_rulesPackage#getRule_Description()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Description getDescription();

	/**
	 * Sets the value of the '{@link usability_rules.Rule#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(Description value);

	/**
	 * Returns the value of the '<em><b>Importance</b></em>' attribute.
	 * The literals are from the enumeration {@link usability_rules.Importance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Importance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Importance</em>' attribute.
	 * @see usability_rules.Importance
	 * @see #setImportance(Importance)
	 * @see usability_rules.Usability_rulesPackage#getRule_Importance()
	 * @model required="true"
	 * @generated
	 */
	Importance getImportance();

	/**
	 * Sets the value of the '{@link usability_rules.Rule#getImportance <em>Importance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Importance</em>' attribute.
	 * @see usability_rules.Importance
	 * @see #getImportance()
	 * @generated
	 */
	void setImportance(Importance value);

	/**
	 * Returns the value of the '<em><b>Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Range</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Range</em>' containment reference.
	 * @see #setRange(Range)
	 * @see usability_rules.Usability_rulesPackage#getRule_Range()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Range getRange();

	/**
	 * Sets the value of the '{@link usability_rules.Rule#getRange <em>Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range</em>' containment reference.
	 * @see #getRange()
	 * @generated
	 */
	void setRange(Range value);

	/**
	 * Returns the value of the '<em><b>Element Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Type</em>' attribute.
	 * @see #setElementType(String)
	 * @see usability_rules.Usability_rulesPackage#getRule_ElementType()
	 * @model required="true"
	 * @generated
	 */
	String getElementType();

	/**
	 * Sets the value of the '{@link usability_rules.Rule#getElementType <em>Element Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Type</em>' attribute.
	 * @see #getElementType()
	 * @generated
	 */
	void setElementType(String value);

} // Rule
