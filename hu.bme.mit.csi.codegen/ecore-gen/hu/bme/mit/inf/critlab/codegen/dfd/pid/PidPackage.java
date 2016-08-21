/**
 */
package hu.bme.mit.inf.critlab.codegen.dfd.pid;

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
 * @see hu.bme.mit.inf.critlab.codegen.dfd.pid.PidFactory
 * @model kind="package"
 * @generated
 */
public interface PidPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "pid";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "hu.bme.mit.inf.critlab.codegen.dfd.pid";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "hu.bme.mit.inf.critlab.codegen.dfd.pid";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PidPackage eINSTANCE = hu.bme.mit.inf.critlab.codegen.dfd.pid.impl.PidPackageImpl.init();

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.critlab.codegen.dfd.pid.impl.DataflowDiagramImpl <em>Dataflow Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.critlab.codegen.dfd.pid.impl.DataflowDiagramImpl
	 * @see hu.bme.mit.inf.critlab.codegen.dfd.pid.impl.PidPackageImpl#getDataflowDiagram()
	 * @generated
	 */
	int DATAFLOW_DIAGRAM = 0;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFLOW_DIAGRAM__NODES = 0;

	/**
	 * The number of structural features of the '<em>Dataflow Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFLOW_DIAGRAM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Dataflow Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFLOW_DIAGRAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.critlab.codegen.dfd.pid.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.critlab.codegen.dfd.pid.impl.NodeImpl
	 * @see hu.bme.mit.inf.critlab.codegen.dfd.pid.impl.PidPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.critlab.codegen.dfd.pid.DataflowDiagram <em>Dataflow Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dataflow Diagram</em>'.
	 * @see hu.bme.mit.inf.critlab.codegen.dfd.pid.DataflowDiagram
	 * @generated
	 */
	EClass getDataflowDiagram();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.critlab.codegen.dfd.pid.DataflowDiagram#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see hu.bme.mit.inf.critlab.codegen.dfd.pid.DataflowDiagram#getNodes()
	 * @see #getDataflowDiagram()
	 * @generated
	 */
	EReference getDataflowDiagram_Nodes();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.critlab.codegen.dfd.pid.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see hu.bme.mit.inf.critlab.codegen.dfd.pid.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.critlab.codegen.dfd.pid.Node#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hu.bme.mit.inf.critlab.codegen.dfd.pid.Node#getName()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PidFactory getPidFactory();

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
		 * The meta object literal for the '{@link hu.bme.mit.inf.critlab.codegen.dfd.pid.impl.DataflowDiagramImpl <em>Dataflow Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.critlab.codegen.dfd.pid.impl.DataflowDiagramImpl
		 * @see hu.bme.mit.inf.critlab.codegen.dfd.pid.impl.PidPackageImpl#getDataflowDiagram()
		 * @generated
		 */
		EClass DATAFLOW_DIAGRAM = eINSTANCE.getDataflowDiagram();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATAFLOW_DIAGRAM__NODES = eINSTANCE.getDataflowDiagram_Nodes();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.critlab.codegen.dfd.pid.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.critlab.codegen.dfd.pid.impl.NodeImpl
		 * @see hu.bme.mit.inf.critlab.codegen.dfd.pid.impl.PidPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__NAME = eINSTANCE.getNode_Name();

	}

} //PidPackage
