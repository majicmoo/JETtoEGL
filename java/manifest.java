class manifest {
public static void main (String[] args) {
//&&&staticSymbol&&&<%import java.util.*;%>
//&&&staticSymbol&&&<%import org.eclipse.emf.codegen.ecore.genmodel.*;%>
//&&&staticSymbol&&&<%

/**
 * Copyright (c) 2005-2007 IBM Corporation and others.
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
//&&&staticSymbol&&&Manifest-Version: 1.0
//&&&staticSymbol&&&Bundle-ManifestVersion: 2
//&&&staticSymbol&&&Bundle-Name: %pluginName
//&&&staticSymbol&&&Bundle-SymbolicName: <%
//&&&staticSymbol&&&=genModel.getModelPluginID()
//&&&staticSymbol&&&%>;singleton:=true
//&&&staticSymbol&&&Bundle-Version: 1.0.0.qualifier
//&&&staticSymbol&&&Bundle-ClassPath: <%
if (genModel.isRuntimeJar()) {
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genModel.getModelPluginID()
//&&&staticSymbol&&&%>.jar<%
}else{
//&&&staticSymbol&&&%>.<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
if (genModel.hasModelPluginClass()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&Bundle-Activator: <%
//&&&staticSymbol&&&=genModel.getQualifiedModelPluginClassName()
//&&&staticSymbol&&&%>$Implementation<%
if (genModel.isOSGiCompatible()) {
//&&&staticSymbol&&&%>$Activator<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&Bundle-Vendor: %providerName
//&&&staticSymbol&&&Bundle-Localization: plugin
//&&&staticSymbol&&&<%
if (genModel.getComplianceLevel() == GenJDKLevel.JDK50_LITERAL) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&Bundle-RequiredExecutionEnvironment: J2SE-1.5
//&&&staticSymbol&&&<%
} else if (genModel.getComplianceLevel() == GenJDKLevel.JDK60_LITERAL) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&Bundle-RequiredExecutionEnvironment: JavaSE-1.6
//&&&staticSymbol&&&<%
} else if (genModel.getComplianceLevel() == GenJDKLevel.JDK70_LITERAL) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&Bundle-RequiredExecutionEnvironment: JavaSE-1.7
//&&&staticSymbol&&&<%
} else if (genModel.getComplianceLevel() == GenJDKLevel.JDK80_LITERAL) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&Bundle-RequiredExecutionEnvironment: JavaSE-1.8
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
Iterator<String> packagesIterator = genModel.getModelQualifiedPackageNames().iterator(); if (packagesIterator.hasNext()) { String pack = packagesIterator.next();
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&Export-Package: <%
//&&&staticSymbol&&&=pack
//&&&staticSymbol&&&%><%
while(packagesIterator.hasNext()) { pack = packagesIterator.next();
//&&&staticSymbol&&&%>,
//&&&staticSymbol&&& <%
//&&&staticSymbol&&&=pack
//&&&staticSymbol&&&%><%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
Iterator<String> requiredPluginIterator = genModel.getModelRequiredPlugins().iterator(); if (requiredPluginIterator.hasNext()) { String pluginID = requiredPluginIterator.next();
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&Require-Bundle: <%
//&&&staticSymbol&&&=pluginID
//&&&staticSymbol&&&%><%
if (pluginID.startsWith("org.eclipse.core.runtime")) {if (genModel.isOSGiCompatible()) {
//&&&staticSymbol&&&%>;resolution:=optional;x-installation:=greedy<%
}} else {
//&&&staticSymbol&&&%>;visibility:=reexport<%
} while(requiredPluginIterator.hasNext()) { pluginID = requiredPluginIterator.next();
//&&&staticSymbol&&&%>,
//&&&staticSymbol&&& <%
//&&&staticSymbol&&&=pluginID
//&&&staticSymbol&&&%><%
if (pluginID.startsWith("org.eclipse.core.runtime")) {if (genModel.isOSGiCompatible()) {
//&&&staticSymbol&&&%>;resolution:=optional;x-installation:=greedy<%
}} else if (!pluginID.equals("org.eclipse.xtext.xbase.lib") && !pluginID.equals("org.eclipse.emf.ecore.xcore.lib")) {
//&&&staticSymbol&&&%>;visibility:=reexport<%
}}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
if (genModel.isOSGiCompatible() && genModel.hasModelPluginClass()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&Import-Package: org.osgi.framework
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
if (genModel.getRuntimeVersion() == GenRuntimeVersion.EMF22 || genModel.getRuntimeVersion() == GenRuntimeVersion.EMF23) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&Eclipse-LazyStart: true
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&Bundle-ActivationPolicy: lazy

}
}