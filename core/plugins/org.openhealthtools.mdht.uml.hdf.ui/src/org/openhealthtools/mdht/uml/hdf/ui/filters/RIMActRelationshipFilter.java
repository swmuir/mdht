/*******************************************************************************
 * Copyright (c) 2006, 2008 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     
 * $Id$
 *******************************************************************************/
package org.openhealthtools.mdht.uml.hdf.ui.filters;

import org.eclipse.jface.viewers.IFilter;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Element;
import org.openhealthtools.mdht.uml.common.ui.filters.FilterUtil;
import org.openhealthtools.mdht.uml.hdf.util.IRIMProfileConstants;
import org.openhealthtools.mdht.uml.hdf.util.RIMProfileUtil;

/**
 * Selects an object if it is a UML Class with applied RIM ActRelationship stereotype (or specialization).
 */
public class RIMActRelationshipFilter implements IFilter {

	public boolean select(Object object) {
		Element element = FilterUtil.getElement(object);

		return (element instanceof Class || element instanceof Association) &&
				RIMProfileUtil.isRIMType(element, IRIMProfileConstants.ACT_RELATIONSHIP);
	}

}
