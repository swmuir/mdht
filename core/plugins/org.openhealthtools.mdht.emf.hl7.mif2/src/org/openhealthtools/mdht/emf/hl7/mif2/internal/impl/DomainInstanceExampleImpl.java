/*******************************************************************************
 * Copyright (c) 2006, 2009 David A Carlson
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.emf.hl7.mif2.internal.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.openhealthtools.mdht.emf.hl7.mif2.DomainInstanceExample;
import org.openhealthtools.mdht.emf.hl7.mif2.DomainInstanceExampleAnnotations;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;
import org.openhealthtools.mdht.emf.hl7.mif2.XMIContent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain Instance Example</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.DomainInstanceExampleImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.DomainInstanceExampleImpl#getModel <em>Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DomainInstanceExampleImpl extends PackageArtifactImpl implements DomainInstanceExample {
	/**
	 * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected DomainInstanceExampleAnnotations annotations;

	/**
	 * The cached value of the '{@link #getModel() <em>Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected XMIContent model;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainInstanceExampleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.DOMAIN_INSTANCE_EXAMPLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainInstanceExampleAnnotations getAnnotations() {
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnnotations(DomainInstanceExampleAnnotations newAnnotations, NotificationChain msgs) {
		DomainInstanceExampleAnnotations oldAnnotations = annotations;
		annotations = newAnnotations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, Mif2Package.DOMAIN_INSTANCE_EXAMPLE__ANNOTATIONS, oldAnnotations,
				newAnnotations);
			if (msgs == null) {
				msgs = notification;
			} else {
				msgs.add(notification);
			}
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnotations(DomainInstanceExampleAnnotations newAnnotations) {
		if (newAnnotations != annotations) {
			NotificationChain msgs = null;
			if (annotations != null) {
				msgs = ((InternalEObject) annotations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.DOMAIN_INSTANCE_EXAMPLE__ANNOTATIONS, null, msgs);
			}
			if (newAnnotations != null) {
				msgs = ((InternalEObject) newAnnotations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.DOMAIN_INSTANCE_EXAMPLE__ANNOTATIONS, null, msgs);
			}
			msgs = basicSetAnnotations(newAnnotations, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.DOMAIN_INSTANCE_EXAMPLE__ANNOTATIONS, newAnnotations,
				newAnnotations));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMIContent getModel() {
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModel(XMIContent newModel, NotificationChain msgs) {
		XMIContent oldModel = model;
		model = newModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, Mif2Package.DOMAIN_INSTANCE_EXAMPLE__MODEL, oldModel, newModel);
			if (msgs == null) {
				msgs = notification;
			} else {
				msgs.add(notification);
			}
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModel(XMIContent newModel) {
		if (newModel != model) {
			NotificationChain msgs = null;
			if (model != null) {
				msgs = ((InternalEObject) model).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.DOMAIN_INSTANCE_EXAMPLE__MODEL, null, msgs);
			}
			if (newModel != null) {
				msgs = ((InternalEObject) newModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.DOMAIN_INSTANCE_EXAMPLE__MODEL, null, msgs);
			}
			msgs = basicSetModel(newModel, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.DOMAIN_INSTANCE_EXAMPLE__MODEL, newModel, newModel));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Mif2Package.DOMAIN_INSTANCE_EXAMPLE__ANNOTATIONS:
				return basicSetAnnotations(null, msgs);
			case Mif2Package.DOMAIN_INSTANCE_EXAMPLE__MODEL:
				return basicSetModel(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Mif2Package.DOMAIN_INSTANCE_EXAMPLE__ANNOTATIONS:
				return getAnnotations();
			case Mif2Package.DOMAIN_INSTANCE_EXAMPLE__MODEL:
				return getModel();
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
			case Mif2Package.DOMAIN_INSTANCE_EXAMPLE__ANNOTATIONS:
				setAnnotations((DomainInstanceExampleAnnotations) newValue);
				return;
			case Mif2Package.DOMAIN_INSTANCE_EXAMPLE__MODEL:
				setModel((XMIContent) newValue);
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
			case Mif2Package.DOMAIN_INSTANCE_EXAMPLE__ANNOTATIONS:
				setAnnotations((DomainInstanceExampleAnnotations) null);
				return;
			case Mif2Package.DOMAIN_INSTANCE_EXAMPLE__MODEL:
				setModel((XMIContent) null);
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
			case Mif2Package.DOMAIN_INSTANCE_EXAMPLE__ANNOTATIONS:
				return annotations != null;
			case Mif2Package.DOMAIN_INSTANCE_EXAMPLE__MODEL:
				return model != null;
		}
		return super.eIsSet(featureID);
	}

} // DomainInstanceExampleImpl
