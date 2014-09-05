class mdeltestsplugin {
public static void main (String[] args) {
//&&&staticSymbol&&&<%import java.util.*;%>
//&&&staticSymbol&&&<%import org.eclipse.emf.codegen.ecore.genmodel.*;%>
//&&&staticSymbol&&&<%

/**
* Copyright (c) 2005 IBM Corporation and others.
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
GenModel genModel = (GenModel)argument; /* Trick to import java.util.* without warnings */Iterator.class.getName();
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<?xml version="1.0" encoding="UTF-8"?>
//&&&staticSymbol&&&<?eclipse version="3.0"?>
//&&&staticSymbol&&&<%include("../Header.xmljetinc");%>
//&&&staticSymbol&&&<%
if (genModel.isBundleManifest()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<plugin>
//&&&staticSymbol&&&<%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<plugin
//&&&staticSymbol&&&name="%pluginName"
//&&&staticSymbol&&&id="<%
//&&&staticSymbol&&&=genModel.getTestsPluginID()
//&&&staticSymbol&&&%>"
//&&&staticSymbol&&&version="1.0.0"
//&&&staticSymbol&&&provider-name="%providerName">
//&&&staticSymbol&&&<requires>
//&&&staticSymbol&&&<%
for (String pluginID : genModel.getTestsRequiredPlugins()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&</requires>
//&&&staticSymbol&&&<runtime>
//&&&staticSymbol&&&<%
if (genModel.isRuntimeJar()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<library name="<%
//&&&staticSymbol&&&=genModel.getTestsPluginID()
//&&&staticSymbol&&&%>.jar">
//&&&staticSymbol&&&<%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<library name=".">
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<export name="*"/>
//&&&staticSymbol&&&</library>
//&&&staticSymbol&&&</runtime>
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&</plugin>

}
}