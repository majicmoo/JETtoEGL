class plugin {
public static void main (String[] args) {
//&&&staticSymbol&&&<%import java.util.*;%>
//&&&staticSymbol&&&<%import org.eclipse.emf.codegen.ecore.genmodel.*;%>
//&&&staticSymbol&&&<%include("../Header.xmljetinc");%>
//&&&staticSymbol&&&<%

/**
 * Copyright (c) 2002-2005 IBM Corporation and others.
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
GenModel genModel = (GenModel)argument; String key = genModel.getPluginKey(); boolean hasKey = key != null && !key.equals(""); /* Trick to import java.util.* without warnings */Iterator.class.getName();
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<?xml version="1.0" encoding="UTF-8"?>
//&&&staticSymbol&&&<?eclipse version="3.0"?>
//&&&staticSymbol&&&
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
if (genModel.isBundleManifest()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<plugin>
//&&&staticSymbol&&&<%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<plugin
//&&&staticSymbol&&&      name="%pluginName"
//&&&staticSymbol&&&      id="<%
//&&&staticSymbol&&&=genModel.getModelPluginID()
//&&&staticSymbol&&&%>"
//&&&staticSymbol&&&      version="1.0.0"
//&&&staticSymbol&&&  <%
if (genModel.hasModelPluginClass()) { 
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      provider-name="%providerName"
//&&&staticSymbol&&&      class="<%
//&&&staticSymbol&&&=genModel.getQualifiedModelPluginClassName()
//&&&staticSymbol&&&%>$Implementation">
//&&&staticSymbol&&&  <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      provider-name="%providerName">
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&   <requires>
//&&&staticSymbol&&&  <%
for (String pluginID : genModel.getModelRequiredPlugins()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&   </requires>
//&&&staticSymbol&&&
//&&&staticSymbol&&&   <runtime>
//&&&staticSymbol&&&  <%
if (genModel.isRuntimeJar()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <library name="<%
//&&&staticSymbol&&&=genModel.getModelPluginID()
//&&&staticSymbol&&&%>.jar">
//&&&staticSymbol&&&  <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <library name=".">
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&         <export name="*"/>
//&&&staticSymbol&&&      </library>
//&&&staticSymbol&&&   </runtime>
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
for (GenPackage genPackage : genModel.getAllGenPackagesWithClassifiers()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&   <extension point="org.eclipse.emf.ecore.generated_package">
//&&&staticSymbol&&&  <%
if (hasKey) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <!-- @generated <%
//&&&staticSymbol&&&=key
//&&&staticSymbol&&&%> -->
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <package
//&&&staticSymbol&&&            uri="<%
//&&&staticSymbol&&&=genPackage.getNSURI()
//&&&staticSymbol&&&%>"
//&&&staticSymbol&&&  <%
if (genModel.hasLocalGenModel()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&            class="<%
//&&&staticSymbol&&&=genPackage.getQualifiedPackageInterfaceName()
//&&&staticSymbol&&&%>"
//&&&staticSymbol&&&            genModel="<%
//&&&staticSymbol&&&=genModel.getRelativeGenModelLocation()
//&&&staticSymbol&&&%>"/>
//&&&staticSymbol&&&  <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&            class="<%
//&&&staticSymbol&&&=genPackage.getQualifiedPackageInterfaceName()
//&&&staticSymbol&&&%>"/>
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&   </extension>
//&&&staticSymbol&&&  <%
if (genPackage.isContentType()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&   <extension point="org.eclipse.emf.ecore.content_parser">
//&&&staticSymbol&&&  <%
if (hasKey) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <!-- @generated <%
//&&&staticSymbol&&&=key
//&&&staticSymbol&&&%> -->
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <parser
//&&&staticSymbol&&&            contentTypeIdentifier="<%
//&&&staticSymbol&&&=genPackage.getContentTypeIdentifier()
//&&&staticSymbol&&&%>"
//&&&staticSymbol&&&            class="<%
//&&&staticSymbol&&&=genPackage.getQualifiedEffectiveResourceFactoryClassName()
//&&&staticSymbol&&&%>"/>
//&&&staticSymbol&&&   </extension>
//&&&staticSymbol&&&
//&&&staticSymbol&&&   <extension point="org.eclipse.core.contenttype.contentTypes">
//&&&staticSymbol&&&  <%
if (hasKey) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <!-- @generated <%
//&&&staticSymbol&&&=key
//&&&staticSymbol&&&%> -->
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <content-type
//&&&staticSymbol&&&            base-type="<%
//&&&staticSymbol&&&*%%storeSymbol%%*0
//&&&staticSymbol&&&%>"
//&&&staticSymbol&&&            file-extensions="<%
//&&&staticSymbol&&&=genPackage.getFileExtensions()
//&&&staticSymbol&&&%>"
//&&&staticSymbol&&&            id="<%
//&&&staticSymbol&&&=genPackage.getContentTypeIdentifier()
//&&&staticSymbol&&&%>"
//&&&staticSymbol&&&            name="%_UI_<%
//&&&staticSymbol&&&=genPackage.getPrefix()
//&&&staticSymbol&&&%>_content_type"
//&&&staticSymbol&&&            priority="normal">
//&&&staticSymbol&&&         <describer class="org.eclipse.emf.ecore.xmi.impl.RootXMLContentHandlerImpl$Describer">
//&&&staticSymbol&&&    <%
if (genPackage.hasTargetNamespace()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&            <parameter name="namespace" value="<%
//&&&staticSymbol&&&=genPackage.getNSURI()
//&&&staticSymbol&&&%>"/>
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
if (genPackage.isXMIResource()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&            <parameter name="kind" value="xmi"/>
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&         </describer>
//&&&staticSymbol&&&      </content-type>
//&&&staticSymbol&&&   </extension>
//&&&staticSymbol&&&  <%
} else if (genPackage.getResource() != GenResourceKind.NONE_LITERAL) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&   <extension point="org.eclipse.emf.ecore.extension_parser">
//&&&staticSymbol&&&    <%
if (hasKey) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <!-- @generated <%
//&&&staticSymbol&&&=key
//&&&staticSymbol&&&%> -->
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
for (String fileExtension : genPackage.getFileExtensionList()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <parser
//&&&staticSymbol&&&            type="<%
//&&&staticSymbol&&&=fileExtension
//&&&staticSymbol&&&%>"
//&&&staticSymbol&&&            class="<%
//&&&staticSymbol&&&=genPackage.getQualifiedResourceFactoryClassName()
//&&&staticSymbol&&&%>"/>
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&   </extension>
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&</plugin>

}
}