/**
 */
package usability_rules;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see usability_rules.Usability_rulesFactory
 * @model kind="package"
 * @generated
 */
public interface Usability_rulesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "usability_rules";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://usability_rules/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "usability_rules";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Usability_rulesPackage eINSTANCE = usability_rules.impl.Usability_rulesPackageImpl.init();

	/**
	 * The meta object id for the '{@link usability_rules.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see usability_rules.impl.NamedElementImpl
	 * @see usability_rules.impl.Usability_rulesPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link usability_rules.impl.CatalogueImpl <em>Catalogue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see usability_rules.impl.CatalogueImpl
	 * @see usability_rules.impl.Usability_rulesPackageImpl#getCatalogue()
	 * @generated
	 */
	int CATALOGUE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOGUE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOGUE__RULES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Catalogue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOGUE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Catalogue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOGUE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link usability_rules.impl.RuleImpl <em>Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see usability_rules.impl.RuleImpl
	 * @see usability_rules.impl.Usability_rulesPackageImpl#getRule()
	 * @generated
	 */
	int RULE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Calculation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__CALCULATION = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Restriction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__RESTRICTION = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Correction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__CORRECTION = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__DESCRIPTION = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Importance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__IMPORTANCE = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__RANGE = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Element Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__ELEMENT_TYPE = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link usability_rules.impl.EOLCodeImpl <em>EOL Code</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see usability_rules.impl.EOLCodeImpl
	 * @see usability_rules.impl.Usability_rulesPackageImpl#getEOLCode()
	 * @generated
	 */
	int EOL_CODE = 3;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_CODE__CODE = 0;

	/**
	 * The number of structural features of the '<em>EOL Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_CODE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>EOL Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_CODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link usability_rules.impl.DescriptionImpl <em>Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see usability_rules.impl.DescriptionImpl
	 * @see usability_rules.impl.Usability_rulesPackageImpl#getDescription()
	 * @generated
	 */
	int DESCRIPTION = 4;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION__DEFINITION = 0;

	/**
	 * The feature id for the '<em><b>Error Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION__ERROR_MESSAGE = 1;

	/**
	 * The number of structural features of the '<em>Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link usability_rules.impl.RangeImpl <em>Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see usability_rules.impl.RangeImpl
	 * @see usability_rules.impl.Usability_rulesPackageImpl#getRange()
	 * @generated
	 */
	int RANGE = 5;

	/**
	 * The number of structural features of the '<em>Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link usability_rules.impl.DoubleRangeImpl <em>Double Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see usability_rules.impl.DoubleRangeImpl
	 * @see usability_rules.impl.Usability_rulesPackageImpl#getDoubleRange()
	 * @generated
	 */
	int DOUBLE_RANGE = 6;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_RANGE__MIN = RANGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_RANGE__MAX = RANGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_RANGE__UNIT = RANGE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Double Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_RANGE_FEATURE_COUNT = RANGE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Double Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_RANGE_OPERATION_COUNT = RANGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link usability_rules.impl.BooleanRangeImpl <em>Boolean Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see usability_rules.impl.BooleanRangeImpl
	 * @see usability_rules.impl.Usability_rulesPackageImpl#getBooleanRange()
	 * @generated
	 */
	int BOOLEAN_RANGE = 7;

	/**
	 * The feature id for the '<em><b>Correct Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_RANGE__CORRECT_VALUE = RANGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_RANGE_FEATURE_COUNT = RANGE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Boolean Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_RANGE_OPERATION_COUNT = RANGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link usability_rules.impl.StringRangeImpl <em>String Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see usability_rules.impl.StringRangeImpl
	 * @see usability_rules.impl.Usability_rulesPackageImpl#getStringRange()
	 * @generated
	 */
	int STRING_RANGE = 8;

	/**
	 * The feature id for the '<em><b>Correct Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_RANGE__CORRECT_VALUES = RANGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_RANGE_FEATURE_COUNT = RANGE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>String Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_RANGE_OPERATION_COUNT = RANGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link usability_rules.impl.IntegerRangeImpl <em>Integer Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see usability_rules.impl.IntegerRangeImpl
	 * @see usability_rules.impl.Usability_rulesPackageImpl#getIntegerRange()
	 * @generated
	 */
	int INTEGER_RANGE = 9;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_RANGE__MIN = RANGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_RANGE__MAX = RANGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_RANGE__UNIT = RANGE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Integer Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_RANGE_FEATURE_COUNT = RANGE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Integer Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_RANGE_OPERATION_COUNT = RANGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link usability_rules.Importance <em>Importance</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see usability_rules.Importance
	 * @see usability_rules.impl.Usability_rulesPackageImpl#getImportance()
	 * @generated
	 */
	int IMPORTANCE = 10;


	/**
	 * Returns the meta object for class '{@link usability_rules.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see usability_rules.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link usability_rules.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see usability_rules.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link usability_rules.Catalogue <em>Catalogue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Catalogue</em>'.
	 * @see usability_rules.Catalogue
	 * @generated
	 */
	EClass getCatalogue();

	/**
	 * Returns the meta object for the containment reference list '{@link usability_rules.Catalogue#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rules</em>'.
	 * @see usability_rules.Catalogue#getRules()
	 * @see #getCatalogue()
	 * @generated
	 */
	EReference getCatalogue_Rules();

	/**
	 * Returns the meta object for class '{@link usability_rules.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule</em>'.
	 * @see usability_rules.Rule
	 * @generated
	 */
	EClass getRule();

	/**
	 * Returns the meta object for the containment reference '{@link usability_rules.Rule#getCalculation <em>Calculation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Calculation</em>'.
	 * @see usability_rules.Rule#getCalculation()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_Calculation();

	/**
	 * Returns the meta object for the containment reference '{@link usability_rules.Rule#getRestriction <em>Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Restriction</em>'.
	 * @see usability_rules.Rule#getRestriction()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_Restriction();

	/**
	 * Returns the meta object for the containment reference '{@link usability_rules.Rule#getCorrection <em>Correction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Correction</em>'.
	 * @see usability_rules.Rule#getCorrection()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_Correction();

	/**
	 * Returns the meta object for the containment reference '{@link usability_rules.Rule#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see usability_rules.Rule#getDescription()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_Description();

	/**
	 * Returns the meta object for the attribute '{@link usability_rules.Rule#getImportance <em>Importance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Importance</em>'.
	 * @see usability_rules.Rule#getImportance()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_Importance();

	/**
	 * Returns the meta object for the containment reference '{@link usability_rules.Rule#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Range</em>'.
	 * @see usability_rules.Rule#getRange()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_Range();

	/**
	 * Returns the meta object for the attribute '{@link usability_rules.Rule#getElementType <em>Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Element Type</em>'.
	 * @see usability_rules.Rule#getElementType()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_ElementType();

	/**
	 * Returns the meta object for class '{@link usability_rules.EOLCode <em>EOL Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EOL Code</em>'.
	 * @see usability_rules.EOLCode
	 * @generated
	 */
	EClass getEOLCode();

	/**
	 * Returns the meta object for the attribute '{@link usability_rules.EOLCode#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see usability_rules.EOLCode#getCode()
	 * @see #getEOLCode()
	 * @generated
	 */
	EAttribute getEOLCode_Code();

	/**
	 * Returns the meta object for class '{@link usability_rules.Description <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Description</em>'.
	 * @see usability_rules.Description
	 * @generated
	 */
	EClass getDescription();

	/**
	 * Returns the meta object for the attribute '{@link usability_rules.Description#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Definition</em>'.
	 * @see usability_rules.Description#getDefinition()
	 * @see #getDescription()
	 * @generated
	 */
	EAttribute getDescription_Definition();

	/**
	 * Returns the meta object for the attribute '{@link usability_rules.Description#getErrorMessage <em>Error Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error Message</em>'.
	 * @see usability_rules.Description#getErrorMessage()
	 * @see #getDescription()
	 * @generated
	 */
	EAttribute getDescription_ErrorMessage();

	/**
	 * Returns the meta object for class '{@link usability_rules.Range <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Range</em>'.
	 * @see usability_rules.Range
	 * @generated
	 */
	EClass getRange();

	/**
	 * Returns the meta object for class '{@link usability_rules.DoubleRange <em>Double Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Double Range</em>'.
	 * @see usability_rules.DoubleRange
	 * @generated
	 */
	EClass getDoubleRange();

	/**
	 * Returns the meta object for the attribute '{@link usability_rules.DoubleRange#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see usability_rules.DoubleRange#getMin()
	 * @see #getDoubleRange()
	 * @generated
	 */
	EAttribute getDoubleRange_Min();

	/**
	 * Returns the meta object for the attribute '{@link usability_rules.DoubleRange#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see usability_rules.DoubleRange#getMax()
	 * @see #getDoubleRange()
	 * @generated
	 */
	EAttribute getDoubleRange_Max();

	/**
	 * Returns the meta object for the attribute '{@link usability_rules.DoubleRange#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see usability_rules.DoubleRange#getUnit()
	 * @see #getDoubleRange()
	 * @generated
	 */
	EAttribute getDoubleRange_Unit();

	/**
	 * Returns the meta object for class '{@link usability_rules.BooleanRange <em>Boolean Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Range</em>'.
	 * @see usability_rules.BooleanRange
	 * @generated
	 */
	EClass getBooleanRange();

	/**
	 * Returns the meta object for the attribute '{@link usability_rules.BooleanRange#isCorrectValue <em>Correct Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Correct Value</em>'.
	 * @see usability_rules.BooleanRange#isCorrectValue()
	 * @see #getBooleanRange()
	 * @generated
	 */
	EAttribute getBooleanRange_CorrectValue();

	/**
	 * Returns the meta object for class '{@link usability_rules.StringRange <em>String Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Range</em>'.
	 * @see usability_rules.StringRange
	 * @generated
	 */
	EClass getStringRange();

	/**
	 * Returns the meta object for the attribute '{@link usability_rules.StringRange#getCorrectValues <em>Correct Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Correct Values</em>'.
	 * @see usability_rules.StringRange#getCorrectValues()
	 * @see #getStringRange()
	 * @generated
	 */
	EAttribute getStringRange_CorrectValues();

	/**
	 * Returns the meta object for class '{@link usability_rules.IntegerRange <em>Integer Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Range</em>'.
	 * @see usability_rules.IntegerRange
	 * @generated
	 */
	EClass getIntegerRange();

	/**
	 * Returns the meta object for the attribute '{@link usability_rules.IntegerRange#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see usability_rules.IntegerRange#getMin()
	 * @see #getIntegerRange()
	 * @generated
	 */
	EAttribute getIntegerRange_Min();

	/**
	 * Returns the meta object for the attribute '{@link usability_rules.IntegerRange#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see usability_rules.IntegerRange#getMax()
	 * @see #getIntegerRange()
	 * @generated
	 */
	EAttribute getIntegerRange_Max();

	/**
	 * Returns the meta object for the attribute '{@link usability_rules.IntegerRange#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see usability_rules.IntegerRange#getUnit()
	 * @see #getIntegerRange()
	 * @generated
	 */
	EAttribute getIntegerRange_Unit();

	/**
	 * Returns the meta object for enum '{@link usability_rules.Importance <em>Importance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Importance</em>'.
	 * @see usability_rules.Importance
	 * @generated
	 */
	EEnum getImportance();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Usability_rulesFactory getUsability_rulesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link usability_rules.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see usability_rules.impl.NamedElementImpl
		 * @see usability_rules.impl.Usability_rulesPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link usability_rules.impl.CatalogueImpl <em>Catalogue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see usability_rules.impl.CatalogueImpl
		 * @see usability_rules.impl.Usability_rulesPackageImpl#getCatalogue()
		 * @generated
		 */
		EClass CATALOGUE = eINSTANCE.getCatalogue();

		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATALOGUE__RULES = eINSTANCE.getCatalogue_Rules();

		/**
		 * The meta object literal for the '{@link usability_rules.impl.RuleImpl <em>Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see usability_rules.impl.RuleImpl
		 * @see usability_rules.impl.Usability_rulesPackageImpl#getRule()
		 * @generated
		 */
		EClass RULE = eINSTANCE.getRule();

		/**
		 * The meta object literal for the '<em><b>Calculation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__CALCULATION = eINSTANCE.getRule_Calculation();

		/**
		 * The meta object literal for the '<em><b>Restriction</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__RESTRICTION = eINSTANCE.getRule_Restriction();

		/**
		 * The meta object literal for the '<em><b>Correction</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__CORRECTION = eINSTANCE.getRule_Correction();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__DESCRIPTION = eINSTANCE.getRule_Description();

		/**
		 * The meta object literal for the '<em><b>Importance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__IMPORTANCE = eINSTANCE.getRule_Importance();

		/**
		 * The meta object literal for the '<em><b>Range</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__RANGE = eINSTANCE.getRule_Range();

		/**
		 * The meta object literal for the '<em><b>Element Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__ELEMENT_TYPE = eINSTANCE.getRule_ElementType();

		/**
		 * The meta object literal for the '{@link usability_rules.impl.EOLCodeImpl <em>EOL Code</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see usability_rules.impl.EOLCodeImpl
		 * @see usability_rules.impl.Usability_rulesPackageImpl#getEOLCode()
		 * @generated
		 */
		EClass EOL_CODE = eINSTANCE.getEOLCode();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EOL_CODE__CODE = eINSTANCE.getEOLCode_Code();

		/**
		 * The meta object literal for the '{@link usability_rules.impl.DescriptionImpl <em>Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see usability_rules.impl.DescriptionImpl
		 * @see usability_rules.impl.Usability_rulesPackageImpl#getDescription()
		 * @generated
		 */
		EClass DESCRIPTION = eINSTANCE.getDescription();

		/**
		 * The meta object literal for the '<em><b>Definition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIPTION__DEFINITION = eINSTANCE.getDescription_Definition();

		/**
		 * The meta object literal for the '<em><b>Error Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIPTION__ERROR_MESSAGE = eINSTANCE.getDescription_ErrorMessage();

		/**
		 * The meta object literal for the '{@link usability_rules.impl.RangeImpl <em>Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see usability_rules.impl.RangeImpl
		 * @see usability_rules.impl.Usability_rulesPackageImpl#getRange()
		 * @generated
		 */
		EClass RANGE = eINSTANCE.getRange();

		/**
		 * The meta object literal for the '{@link usability_rules.impl.DoubleRangeImpl <em>Double Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see usability_rules.impl.DoubleRangeImpl
		 * @see usability_rules.impl.Usability_rulesPackageImpl#getDoubleRange()
		 * @generated
		 */
		EClass DOUBLE_RANGE = eINSTANCE.getDoubleRange();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOUBLE_RANGE__MIN = eINSTANCE.getDoubleRange_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOUBLE_RANGE__MAX = eINSTANCE.getDoubleRange_Max();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOUBLE_RANGE__UNIT = eINSTANCE.getDoubleRange_Unit();

		/**
		 * The meta object literal for the '{@link usability_rules.impl.BooleanRangeImpl <em>Boolean Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see usability_rules.impl.BooleanRangeImpl
		 * @see usability_rules.impl.Usability_rulesPackageImpl#getBooleanRange()
		 * @generated
		 */
		EClass BOOLEAN_RANGE = eINSTANCE.getBooleanRange();

		/**
		 * The meta object literal for the '<em><b>Correct Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_RANGE__CORRECT_VALUE = eINSTANCE.getBooleanRange_CorrectValue();

		/**
		 * The meta object literal for the '{@link usability_rules.impl.StringRangeImpl <em>String Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see usability_rules.impl.StringRangeImpl
		 * @see usability_rules.impl.Usability_rulesPackageImpl#getStringRange()
		 * @generated
		 */
		EClass STRING_RANGE = eINSTANCE.getStringRange();

		/**
		 * The meta object literal for the '<em><b>Correct Values</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_RANGE__CORRECT_VALUES = eINSTANCE.getStringRange_CorrectValues();

		/**
		 * The meta object literal for the '{@link usability_rules.impl.IntegerRangeImpl <em>Integer Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see usability_rules.impl.IntegerRangeImpl
		 * @see usability_rules.impl.Usability_rulesPackageImpl#getIntegerRange()
		 * @generated
		 */
		EClass INTEGER_RANGE = eINSTANCE.getIntegerRange();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_RANGE__MIN = eINSTANCE.getIntegerRange_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_RANGE__MAX = eINSTANCE.getIntegerRange_Max();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_RANGE__UNIT = eINSTANCE.getIntegerRange_Unit();

		/**
		 * The meta object literal for the '{@link usability_rules.Importance <em>Importance</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see usability_rules.Importance
		 * @see usability_rules.impl.Usability_rulesPackageImpl#getImportance()
		 * @generated
		 */
		EEnum IMPORTANCE = eINSTANCE.getImportance();

	}

} //Usability_rulesPackage
