/**
 */
package hu.bme.mit.inf.critlab.codegen.dfd.pid;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see hu.bme.mit.inf.critlab.codegen.dfd.pid.PidPackage
 * @generated
 */
public interface PidFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PidFactory eINSTANCE = hu.bme.mit.inf.critlab.codegen.dfd.pid.impl.PidFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Dataflow Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dataflow Diagram</em>'.
	 * @generated
	 */
	DataflowDiagram createDataflowDiagram();

	/**
	 * Returns a new object of class '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node</em>'.
	 * @generated
	 */
	Node createNode();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PidPackage getPidPackage();

} //PidFactory
