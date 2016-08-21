/**
 */
package hu.bme.mit.inf.critlab.codegen.dfd.generator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see hu.bme.mit.inf.critlab.codegen.dfd.generator.GeneratorFactory
 * @model kind="package"
 * @generated
 */
public interface GeneratorPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "generator";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "hu.bme.mit.inf.critlab.codegen.dfd.generator";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "hu.bme.mit.inf.critlab.codegen.dfd.generator";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GeneratorPackage eINSTANCE = hu.bme.mit.inf.critlab.codegen.dfd.generator.impl.GeneratorPackageImpl.init();

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.critlab.codegen.dfd.generator.impl.PIDGeneratorImpl <em>PID Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.critlab.codegen.dfd.generator.impl.PIDGeneratorImpl
	 * @see hu.bme.mit.inf.critlab.codegen.dfd.generator.impl.GeneratorPackageImpl#getPIDGenerator()
	 * @generated
	 */
	int PID_GENERATOR = 0;

	/**
	 * The feature id for the '<em><b>Target DFD</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PID_GENERATOR__TARGET_DFD = 0;

	/**
	 * The feature id for the '<em><b>Target Project Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PID_GENERATOR__TARGET_PROJECT_NAME = 1;

	/**
	 * The feature id for the '<em><b>Target Folder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PID_GENERATOR__TARGET_FOLDER = 2;

	/**
	 * The feature id for the '<em><b>Target Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PID_GENERATOR__TARGET_PACKAGE = 3;

	/**
	 * The number of structural features of the '<em>PID Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PID_GENERATOR_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>PID Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PID_GENERATOR_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.critlab.codegen.dfd.generator.PIDGenerator <em>PID Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PID Generator</em>'.
	 * @see hu.bme.mit.inf.critlab.codegen.dfd.generator.PIDGenerator
	 * @generated
	 */
	EClass getPIDGenerator();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.critlab.codegen.dfd.generator.PIDGenerator#getTargetDFD <em>Target DFD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target DFD</em>'.
	 * @see hu.bme.mit.inf.critlab.codegen.dfd.generator.PIDGenerator#getTargetDFD()
	 * @see #getPIDGenerator()
	 * @generated
	 */
	EReference getPIDGenerator_TargetDFD();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.critlab.codegen.dfd.generator.PIDGenerator#getTargetProjectName <em>Target Project Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Project Name</em>'.
	 * @see hu.bme.mit.inf.critlab.codegen.dfd.generator.PIDGenerator#getTargetProjectName()
	 * @see #getPIDGenerator()
	 * @generated
	 */
	EAttribute getPIDGenerator_TargetProjectName();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.critlab.codegen.dfd.generator.PIDGenerator#getTargetFolder <em>Target Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Folder</em>'.
	 * @see hu.bme.mit.inf.critlab.codegen.dfd.generator.PIDGenerator#getTargetFolder()
	 * @see #getPIDGenerator()
	 * @generated
	 */
	EAttribute getPIDGenerator_TargetFolder();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.critlab.codegen.dfd.generator.PIDGenerator#getTargetPackage <em>Target Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Package</em>'.
	 * @see hu.bme.mit.inf.critlab.codegen.dfd.generator.PIDGenerator#getTargetPackage()
	 * @see #getPIDGenerator()
	 * @generated
	 */
	EAttribute getPIDGenerator_TargetPackage();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GeneratorFactory getGeneratorFactory();

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
		 * The meta object literal for the '{@link hu.bme.mit.inf.critlab.codegen.dfd.generator.impl.PIDGeneratorImpl <em>PID Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.critlab.codegen.dfd.generator.impl.PIDGeneratorImpl
		 * @see hu.bme.mit.inf.critlab.codegen.dfd.generator.impl.GeneratorPackageImpl#getPIDGenerator()
		 * @generated
		 */
		EClass PID_GENERATOR = eINSTANCE.getPIDGenerator();

		/**
		 * The meta object literal for the '<em><b>Target DFD</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PID_GENERATOR__TARGET_DFD = eINSTANCE.getPIDGenerator_TargetDFD();

		/**
		 * The meta object literal for the '<em><b>Target Project Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PID_GENERATOR__TARGET_PROJECT_NAME = eINSTANCE.getPIDGenerator_TargetProjectName();

		/**
		 * The meta object literal for the '<em><b>Target Folder</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PID_GENERATOR__TARGET_FOLDER = eINSTANCE.getPIDGenerator_TargetFolder();

		/**
		 * The meta object literal for the '<em><b>Target Package</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PID_GENERATOR__TARGET_PACKAGE = eINSTANCE.getPIDGenerator_TargetPackage();

	}

} //GeneratorPackage
