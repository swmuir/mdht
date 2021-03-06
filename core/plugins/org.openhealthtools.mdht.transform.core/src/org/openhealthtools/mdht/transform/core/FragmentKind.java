/*******************************************************************************
 * Copyright (c) 2012 Christian W. Damus and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Christian W. Damus - initial API and implementation
 *     
 *******************************************************************************/
package org.openhealthtools.mdht.transform.core;

/**
 * Enumeration of the functional roles of rule fragments.
 */
public enum FragmentKind {
	/** A fragment that runs before its target rule. */
	BEFORE,
	/** A frogment that runs after its target rule. */
	AFTER;
}
