/**
 */
package hu.bme.mit.inf.critlab.codegen.dfd.generator;

import hu.bme.mit.inf.critlab.codegen.dfd.pid.DataflowDiagram;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PID Generator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.critlab.codegen.dfd.generator.PIDGenerator#getTargetDFD <em>Target DFD</em>}</li>
 *   <li>{@link hu.bme.mit.inf.critlab.codegen.dfd.generator.PIDGenerator#getTargetProjectName <em>Target Project Name</em>}</li>
 *   <li>{@link hu.bme.mit.inf.critlab.codegen.dfd.generator.PIDGenerator#getTargetFolder <em>Target Folder</em>}</li>
 *   <li>{@link hu.bme.mit.inf.critlab.codegen.dfd.generator.PIDGenerator#getTargetPackage <em>Target Package</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.critlab.codegen.dfd.generator.GeneratorPackage#getPIDGenerator()
 * @model
 * @generated
 */
public interface PIDGenerator extends EObject {
	/**
	 * Returns the value of the '<em><b>Target DFD</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target DFD</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target DFD</em>' reference.
	 * @see #setTargetDFD(DataflowDiagram)
	 * @see hu.bme.mit.inf.critlab.codegen.dfd.generator.GeneratorPackage#getPIDGenerator_TargetDFD()
	 * @model required="true"
	 * @generated
	 */
	DataflowDiagram getTargetDFD();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.critlab.codegen.dfd.generator.PIDGenerator#getTargetDFD <em>Target DFD</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target DFD</em>' reference.
	 * @see #getTargetDFD()
	 * @generated
	 */
	void setTargetDFD(DataflowDiagram value);

	/**
	 * Returns the value of the '<em><b>Target Project Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Project Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Project Name</em>' attribute.
	 * @see #setTargetProjectName(String)
	 * @see hu.bme.mit.inf.critlab.codegen.dfd.generator.GeneratorPackage#getPIDGenerator_TargetProjectName()
	 * @model
	 * @generated
	 */
	String getTargetProjectName();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.critlab.codegen.dfd.generator.PIDGenerator#getTargetProjectName <em>Target Project Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Project Name</em>' attribute.
	 * @see #getTargetProjectName()
	 * @generated
	 */
	void setTargetProjectName(String value);

	/**
	 * Returns the value of the '<em><b>Target Folder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Folder</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Folder</em>' attribute.
	 * @see #setTargetFolder(String)
	 * @see hu.bme.mit.inf.critlab.codegen.dfd.generator.GeneratorPackage#getPIDGenerator_TargetFolder()
	 * @model
	 * @generated
	 */
	String getTargetFolder();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.critlab.codegen.dfd.generator.PIDGenerator#getTargetFolder <em>Target Folder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Folder</em>' attribute.
	 * @see #getTargetFolder()
	 * @generated
	 */
	void setTargetFolder(String value);

	/**
	 * Returns the value of the '<em><b>Target Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Package</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Package</em>' attribute.
	 * @see #setTargetPackage(String)
	 * @see hu.bme.mit.inf.critlab.codegen.dfd.generator.GeneratorPackage#getPIDGenerator_TargetPackage()
	 * @model
	 * @generated
	 */
	String getTargetPackage();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.critlab.codegen.dfd.generator.PIDGenerator#getTargetPackage <em>Target Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Package</em>' attribute.
	 * @see #getTargetPackage()
	 * @generated
	 */
	void setTargetPackage(String value);

} // PIDGenerator
