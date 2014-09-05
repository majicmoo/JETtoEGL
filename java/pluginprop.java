class pluginprop {
public static void main (String[] args) {
//&&&staticSymbol&&&<%import org.eclipse.emf.codegen.ecore.genmodel.*;%>
//&&&staticSymbol&&&<%

/**
 * Copyright (c) 2002-2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: 
 *   IBM - Initial API and implementation
 */

//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
GenModel genModel = (GenModel)argument;
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%include("../Header.propertiesjetinc");%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&pluginName = <%
//&&&staticSymbol&&&=genModel.getModelName()
//&&&staticSymbol&&&%> Model
//&&&staticSymbol&&&providerName = www.example.org
//&&&staticSymbol&&&<%
boolean first = true; for (GenPackage genPackage : genModel.getAllGenPackagesWithClassifiers()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
if (genPackage.isContentType()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
if (first) { first = false;
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&_UI_<%
//&&&staticSymbol&&&=genPackage.getPrefix()
//&&&staticSymbol&&&%>_content_type = <%
//&&&staticSymbol&&&=genPackage.getPrefix()
//&&&staticSymbol&&&%> File
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>

}
}