
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
	
<% 
import org.openecomp.ncomp.utils.StringUtil
%>// Autogenerated
// Do not edit but extend this class as needed
package $packageName;


import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;

import org.openecomp.ncomp.sirius.manager.console.Console;
import org.openecomp.ncomp.sirius.manager.AbstractClient;
import org.openecomp.ncomp.sirius.manager.ManagementServerError;

<% g.subApis.each { api -> 
  if (api.o.eClass().getEPackage() == o.eClass().getEPackage()) return
%>    

import ${api.packageName()}.${prefix}${api.o.eClass().name}Console;   <% } %>


public class ${cName} extends Console {
	public static final Logger logger = Logger.getLogger(${cName}.class);
    protected ${prefix}${name}Client controller;
    
<% g.subApis.each { api -> if (api.type == "P") return; %>    
        ${prefix}${api.o.eClass().name}Console ${api.subName};   <% } %>


    public ${cName}(String filename, String name) {
            super(filename, name);
            controller = new ${prefix}${name}Client(filename,name);
            client = controller.client;
<% g.subApis.each { api -> if (api.type == "P") return; %>    
            ${api.subName} = new  ${prefix}${api.o.eClass().name}Console(filename,name);   <% } %>
    }
    
	public ${cName}(AbstractClient c) {
        controller = new ${prefix}${name}Client(c);
        client = controller.client;
    }

<% g.operations().each { op -> 
  def decl = []
  def vars = []
  if (g.root != g && g.root.o.eClass().EPackage == o.eClass().EPackage) {
    decl += "String path"
    vars += "path"
  }
  op.getEParameters().each  { p ->
    if (p.name == "cx") return
    vars += p.name
    if (p.isMany()) 
    	decl += "EList<${p.getEType().getInstanceClassName()}> $p.name"
    else 
    	decl += "${p.getEType().getInstanceClassName()} $p.name"
  }
  def rType = op.getEType() == null ? "void" : op.getEType().getInstanceClassName()
  if (op.isMany()) rType = "EList<$rType>"
  def ret = rType == "void" ? "" : "return res;"
  def decl1 = rType == "void" ? "" : "$rType res = null;"
  def assign = rType == "void" ? "" : "res = "
  if (op.getEParameters().find { it.name == "cx" })  vars = ["null"] + vars
%>
	public $rType ${op.name}(${StringUtil.join(decl, ", ")}) {
		$decl1
		try {
			$assign controller.${op.name}(${StringUtil.join(vars,",")});
		}
		catch (ManagementServerError e) {
			System.err.println("ERROR: " + e.getJson().toString(2));
		}
		$ret
	}
<% } %>
}
