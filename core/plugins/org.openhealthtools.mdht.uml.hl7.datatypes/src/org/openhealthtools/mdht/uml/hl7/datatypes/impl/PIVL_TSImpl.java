/**
 * Copyright (c) 2009 IBM Corporation
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.hl7.datatypes.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;
import org.openhealthtools.mdht.uml.hl7.datatypes.PIVL_TS;
import org.openhealthtools.mdht.uml.hl7.datatypes.PQ;

import org.openhealthtools.mdht.uml.hl7.vocab.CalendarCycle;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PIVL TS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.PIVL_TSImpl#getPhase <em>Phase</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.PIVL_TSImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.PIVL_TSImpl#getAlignment <em>Alignment</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.PIVL_TSImpl#getInstitutionSpecified <em>Institution Specified</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PIVL_TSImpl extends SXCM_TSImpl implements PIVL_TS {
	/**
	 * The cached value of the '{@link #getPhase() <em>Phase</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhase()
	 * @generated
	 * @ordered
	 */
	protected IVL_TS phase;

	/**
	 * The cached value of the '{@link #getPeriod() <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected PQ period;

	/**
	 * The default value of the '{@link #getAlignment() <em>Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlignment()
	 * @generated
	 * @ordered
	 */
	protected static final CalendarCycle ALIGNMENT_EDEFAULT = CalendarCycle.CD;

	/**
	 * The cached value of the '{@link #getAlignment() <em>Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlignment()
	 * @generated
	 * @ordered
	 */
	protected CalendarCycle alignment = ALIGNMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getInstitutionSpecified() <em>Institution Specified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstitutionSpecified()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INSTITUTION_SPECIFIED_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getInstitutionSpecified() <em>Institution Specified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstitutionSpecified()
	 * @generated
	 * @ordered
	 */
	protected Boolean institutionSpecified = INSTITUTION_SPECIFIED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PIVL_TSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatatypesPackage.Literals.PIVL_TS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IVL_TS getPhase() {
		return phase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPhase(IVL_TS newPhase, NotificationChain msgs) {
		IVL_TS oldPhase = phase;
		phase = newPhase;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DatatypesPackage.PIVL_TS__PHASE, oldPhase, newPhase);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhase(IVL_TS newPhase) {
		if (newPhase != phase) {
			NotificationChain msgs = null;
			if (phase != null)
				msgs = ((InternalEObject)phase).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DatatypesPackage.PIVL_TS__PHASE, null, msgs);
			if (newPhase != null)
				msgs = ((InternalEObject)newPhase).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DatatypesPackage.PIVL_TS__PHASE, null, msgs);
			msgs = basicSetPhase(newPhase, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.PIVL_TS__PHASE, newPhase, newPhase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PQ getPeriod() {
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPeriod(PQ newPeriod, NotificationChain msgs) {
		PQ oldPeriod = period;
		period = newPeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DatatypesPackage.PIVL_TS__PERIOD, oldPeriod, newPeriod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriod(PQ newPeriod) {
		if (newPeriod != period) {
			NotificationChain msgs = null;
			if (period != null)
				msgs = ((InternalEObject)period).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DatatypesPackage.PIVL_TS__PERIOD, null, msgs);
			if (newPeriod != null)
				msgs = ((InternalEObject)newPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DatatypesPackage.PIVL_TS__PERIOD, null, msgs);
			msgs = basicSetPeriod(newPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.PIVL_TS__PERIOD, newPeriod, newPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalendarCycle getAlignment() {
		return alignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlignment(CalendarCycle newAlignment) {
		CalendarCycle oldAlignment = alignment;
		alignment = newAlignment == null ? ALIGNMENT_EDEFAULT : newAlignment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.PIVL_TS__ALIGNMENT, oldAlignment, alignment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getInstitutionSpecified() {
		return institutionSpecified;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstitutionSpecified(Boolean newInstitutionSpecified) {
		Boolean oldInstitutionSpecified = institutionSpecified;
		institutionSpecified = newInstitutionSpecified;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.PIVL_TS__INSTITUTION_SPECIFIED, oldInstitutionSpecified, institutionSpecified));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DatatypesPackage.PIVL_TS__PHASE:
				return basicSetPhase(null, msgs);
			case DatatypesPackage.PIVL_TS__PERIOD:
				return basicSetPeriod(null, msgs);
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
			case DatatypesPackage.PIVL_TS__PHASE:
				return getPhase();
			case DatatypesPackage.PIVL_TS__PERIOD:
				return getPeriod();
			case DatatypesPackage.PIVL_TS__ALIGNMENT:
				return getAlignment();
			case DatatypesPackage.PIVL_TS__INSTITUTION_SPECIFIED:
				return getInstitutionSpecified();
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
			case DatatypesPackage.PIVL_TS__PHASE:
				setPhase((IVL_TS)newValue);
				return;
			case DatatypesPackage.PIVL_TS__PERIOD:
				setPeriod((PQ)newValue);
				return;
			case DatatypesPackage.PIVL_TS__ALIGNMENT:
				setAlignment((CalendarCycle)newValue);
				return;
			case DatatypesPackage.PIVL_TS__INSTITUTION_SPECIFIED:
				setInstitutionSpecified((Boolean)newValue);
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
			case DatatypesPackage.PIVL_TS__PHASE:
				setPhase((IVL_TS)null);
				return;
			case DatatypesPackage.PIVL_TS__PERIOD:
				setPeriod((PQ)null);
				return;
			case DatatypesPackage.PIVL_TS__ALIGNMENT:
				setAlignment(ALIGNMENT_EDEFAULT);
				return;
			case DatatypesPackage.PIVL_TS__INSTITUTION_SPECIFIED:
				setInstitutionSpecified(INSTITUTION_SPECIFIED_EDEFAULT);
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
			case DatatypesPackage.PIVL_TS__PHASE:
				return phase != null;
			case DatatypesPackage.PIVL_TS__PERIOD:
				return period != null;
			case DatatypesPackage.PIVL_TS__ALIGNMENT:
				return alignment != ALIGNMENT_EDEFAULT;
			case DatatypesPackage.PIVL_TS__INSTITUTION_SPECIFIED:
				return INSTITUTION_SPECIFIED_EDEFAULT == null ? institutionSpecified != null : !INSTITUTION_SPECIFIED_EDEFAULT.equals(institutionSpecified);
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
		result.append(" (alignment: ");
		result.append(alignment);
		result.append(", institutionSpecified: ");
		result.append(institutionSpecified);
		result.append(')');
		return result.toString();
	}

} //PIVL_TSImpl
