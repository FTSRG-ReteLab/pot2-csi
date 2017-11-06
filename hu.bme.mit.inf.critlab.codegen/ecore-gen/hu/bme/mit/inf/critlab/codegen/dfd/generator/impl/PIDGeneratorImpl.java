/**
 */
package hu.bme.mit.inf.critlab.codegen.dfd.generator.impl;

import hu.bme.mit.inf.critlab.codegen.dfd.generator.GeneratorPackage;
import hu.bme.mit.inf.critlab.codegen.dfd.generator.PIDGenerator;

import hu.bme.mit.inf.critlab.codegen.dfd.pid.DataflowDiagram;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PID Generator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.critlab.codegen.dfd.generator.impl.PIDGeneratorImpl#getTargetDFD <em>Target DFD</em>}</li>
 *   <li>{@link hu.bme.mit.inf.critlab.codegen.dfd.generator.impl.PIDGeneratorImpl#getTargetProjectName <em>Target Project Name</em>}</li>
 *   <li>{@link hu.bme.mit.inf.critlab.codegen.dfd.generator.impl.PIDGeneratorImpl#getTargetFolder <em>Target Folder</em>}</li>
 *   <li>{@link hu.bme.mit.inf.critlab.codegen.dfd.generator.impl.PIDGeneratorImpl#getTargetPackage <em>Target Package</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PIDGeneratorImpl extends MinimalEObjectImpl.Container implements PIDGenerator {
	/**
	 * The cached value of the '{@link #getTargetDFD() <em>Target DFD</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetDFD()
	 * @generated
	 * @ordered
	 */
	protected DataflowDiagram targetDFD;

	/**
	 * The default value of the '{@link #getTargetProjectName() <em>Target Project Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetProjectName()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_PROJECT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetProjectName() <em>Target Project Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetProjectName()
	 * @generated
	 * @ordered
	 */
	protected String targetProjectName = TARGET_PROJECT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetFolder() <em>Target Folder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetFolder()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_FOLDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetFolder() <em>Target Folder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetFolder()
	 * @generated
	 * @ordered
	 */
	protected String targetFolder = TARGET_FOLDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetPackage() <em>Target Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetPackage()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_PACKAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetPackage() <em>Target Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetPackage()
	 * @generated
	 * @ordered
	 */
	protected String targetPackage = TARGET_PACKAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PIDGeneratorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.PID_GENERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataflowDiagram getTargetDFD() {
		if (targetDFD != null && targetDFD.eIsProxy()) {
			InternalEObject oldTargetDFD = (InternalEObject)targetDFD;
			targetDFD = (DataflowDiagram)eResolveProxy(oldTargetDFD);
			if (targetDFD != oldTargetDFD) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GeneratorPackage.PID_GENERATOR__TARGET_DFD, oldTargetDFD, targetDFD));
			}
		}
		return targetDFD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataflowDiagram basicGetTargetDFD() {
		return targetDFD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetDFD(DataflowDiagram newTargetDFD) {
		DataflowDiagram oldTargetDFD = targetDFD;
		targetDFD = newTargetDFD;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.PID_GENERATOR__TARGET_DFD, oldTargetDFD, targetDFD));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetProjectName() {
		return targetProjectName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetProjectName(String newTargetProjectName) {
		String oldTargetProjectName = targetProjectName;
		targetProjectName = newTargetProjectName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.PID_GENERATOR__TARGET_PROJECT_NAME, oldTargetProjectName, targetProjectName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetFolder() {
		return targetFolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetFolder(String newTargetFolder) {
		String oldTargetFolder = targetFolder;
		targetFolder = newTargetFolder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.PID_GENERATOR__TARGET_FOLDER, oldTargetFolder, targetFolder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetPackage() {
		return targetPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetPackage(String newTargetPackage) {
		String oldTargetPackage = targetPackage;
		targetPackage = newTargetPackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.PID_GENERATOR__TARGET_PACKAGE, oldTargetPackage, targetPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GeneratorPackage.PID_GENERATOR__TARGET_DFD:
				if (resolve) return getTargetDFD();
				return basicGetTargetDFD();
			case GeneratorPackage.PID_GENERATOR__TARGET_PROJECT_NAME:
				return getTargetProjectName();
			case GeneratorPackage.PID_GENERATOR__TARGET_FOLDER:
				return getTargetFolder();
			case GeneratorPackage.PID_GENERATOR__TARGET_PACKAGE:
				return getTargetPackage();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GeneratorPackage.PID_GENERATOR__TARGET_DFD:
				setTargetDFD((DataflowDiagram)newValue);
				return;
			case GeneratorPackage.PID_GENERATOR__TARGET_PROJECT_NAME:
				setTargetProjectName((String)newValue);
				return;
			case GeneratorPackage.PID_GENERATOR__TARGET_FOLDER:
				setTargetFolder((String)newValue);
				return;
			case GeneratorPackage.PID_GENERATOR__TARGET_PACKAGE:
				setTargetPackage((String)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case GeneratorPackage.PID_GENERATOR__TARGET_DFD:
				setTargetDFD((DataflowDiagram)null);
				return;
			case GeneratorPackage.PID_GENERATOR__TARGET_PROJECT_NAME:
				setTargetProjectName(TARGET_PROJECT_NAME_EDEFAULT);
				return;
			case GeneratorPackage.PID_GENERATOR__TARGET_FOLDER:
				setTargetFolder(TARGET_FOLDER_EDEFAULT);
				return;
			case GeneratorPackage.PID_GENERATOR__TARGET_PACKAGE:
				setTargetPackage(TARGET_PACKAGE_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GeneratorPackage.PID_GENERATOR__TARGET_DFD:
				return targetDFD != null;
			case GeneratorPackage.PID_GENERATOR__TARGET_PROJECT_NAME:
				return TARGET_PROJECT_NAME_EDEFAULT == null ? targetProjectName != null : !TARGET_PROJECT_NAME_EDEFAULT.equals(targetProjectName);
			case GeneratorPackage.PID_GENERATOR__TARGET_FOLDER:
				return TARGET_FOLDER_EDEFAULT == null ? targetFolder != null : !TARGET_FOLDER_EDEFAULT.equals(targetFolder);
			case GeneratorPackage.PID_GENERATOR__TARGET_PACKAGE:
				return TARGET_PACKAGE_EDEFAULT == null ? targetPackage != null : !TARGET_PACKAGE_EDEFAULT.equals(targetPackage);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (targetProjectName: ");
		result.append(targetProjectName);
		result.append(", targetFolder: ");
		result.append(targetFolder);
		result.append(", targetPackage: ");
		result.append(targetPackage);
		result.append(')');
		return result.toString();
	}

} //PIDGeneratorImpl
