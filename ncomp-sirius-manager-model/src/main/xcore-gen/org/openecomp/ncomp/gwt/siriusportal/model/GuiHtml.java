
/*-
 * ============LICENSE_START==========================================
 * OPENECOMP - DCAE
 * ===================================================================
 * Copyright (c) 2017 AT&T Intellectual Property. All rights reserved.
 * ===================================================================
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0 
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ============LICENSE_END============================================
 */
	
/**
 */
package org.openecomp.ncomp.gwt.siriusportal.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gui Html</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiHtml#getHtml <em>Html</em>}</li>
 * </ul>
 *
 * @see org.openecomp.ncomp.gwt.siriusportal.model.ModelPackage#getGuiHtml()
 * @model
 * @generated
 */
public interface GuiHtml extends EObject {
	/**
	 * Returns the value of the '<em><b>Html</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Html</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Html</em>' attribute.
	 * @see #setHtml(String)
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.ModelPackage#getGuiHtml_Html()
	 * @model unique="false"
	 * @generated
	 */
	String getHtml();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiHtml#getHtml <em>Html</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Html</em>' attribute.
	 * @see #getHtml()
	 * @generated
	 */
	void setHtml(String value);

} // GuiHtml
