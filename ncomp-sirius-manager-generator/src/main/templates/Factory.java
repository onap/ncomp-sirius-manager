
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
	
// Autogenerated
// Do not edit. No need to extend this class.
package $packageName;

import org.eclipse.emf.ecore.EPackage;
import org.apache.log4j.Logger;

import org.openecomp.ncomp.sirius.manager.ISiriusServer;

import ${p.nsURI}.${name};
import ${p.nsURI}.${nsPrefix.capitalize()}Package;
import ${p.nsURI}.impl.${fName}Impl;

<% if (sPackage != "") { %>import ${sPackage}.$sClass; <% } %>

<% g.subApis.each { api ->  
if (api.o.eClass().EPackage != o.eClass().EPackage) return
%>
import ${api.o.eClass().EPackage.nsURI}.${api.o.eClass().name};<% } %>

public class ${cName} extends ${fName}Impl {
	public static final Logger logger = Logger.getLogger(${cName}.class);
	ISiriusServer server = null;
	@Override
	public EPackage getEPackage() { return ${nsPrefix.capitalize()}Package.eINSTANCE; }
	public ${cName}(ISiriusServer server) {
		this.server = server;
	}
	@Override
	public ${name} create${name}() {
		return new ${prefix}${name}(server);
	}
	
<% g.subApis.each { api -> 
	if (api.o.eClass().EPackage != o.eClass().EPackage) return
%>    
	@Override
	public ${api.o.eClass().name} create${api.o.eClass().name}() {
		return new ${prefix}${api.o.eClass().name}(server);
	}
<% } %>	

}
