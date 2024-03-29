class ResourceFactoryClass {
public static void main (String[] args) {
//&&&staticSymbol&&&<%import org.eclipse.emf.codegen.ecore.genmodel.*;%>
//&&&staticSymbol&&&<%

/**
 * Copyright (c) 2002-2006 IBM Corporation and others.
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
GenPackage genPackage = (GenPackage)argument; GenModel genModel=genPackage.getGenModel();
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%include("../Header.javajetinc");%>
//&&&staticSymbol&&&package <%
//&&&staticSymbol&&&=genPackage.getUtilitiesPackageName()
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
genModel.getImportedName("org.eclipse.emf.common.util.URI");
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
genModel.getImportedName("org.eclipse.emf.ecore.resource.Resource");
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
genModel.markImportLocation(stringBuffer);
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&/**
//&&&staticSymbol&&& * <!-- begin-user-doc -->
//&&&staticSymbol&&& * The <b>Resource Factory</b> associated with the package.
//&&&staticSymbol&&& * <!-- end-user-doc -->
//&&&staticSymbol&&& * @see <%
//&&&staticSymbol&&&=genPackage.getQualifiedResourceClassName()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&& * @generated
//&&&staticSymbol&&& */
//&&&staticSymbol&&&public class <%
//&&&staticSymbol&&&=genPackage.getResourceFactoryClassName()
//&&&staticSymbol&&&%> extends <%
//&&&staticSymbol&&&=genPackage.getImportedResourceFactoryBaseClassName()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&{
//&&&staticSymbol&&&<%
if (genModel.hasCopyrightField()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	public static final <%
//&&&staticSymbol&&&=genModel.getImportedName("java.lang.String")
//&&&staticSymbol&&&%> copyright = <%
//&&&staticSymbol&&&=genModel.getCopyrightFieldLiteral()
//&&&staticSymbol&&&%>;<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
if (genPackage.hasExtendedMetaData() && !genPackage.hasTargetNamespace()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	protected <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.util.ExtendedMetaData")
//&&&staticSymbol&&&%> extendedMetaData;
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
} else if (genPackage.hasXMLMap()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	protected <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.xmi.XMLResource$XMLMap")
//&&&staticSymbol&&&%> xmlMap = new <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.xmi.impl.XMLMapImpl")
//&&&staticSymbol&&&%>();
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * Creates an instance of the resource factory.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	public <%
//&&&staticSymbol&&&=genPackage.getResourceFactoryClassName()
//&&&staticSymbol&&&%>()
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		super();
//&&&staticSymbol&&&<%
if (genPackage.hasExtendedMetaData() && !genPackage.hasTargetNamespace()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		extendedMetaData = new <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.util.BasicExtendedMetaData")
//&&&staticSymbol&&&%>(new <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.impl.EPackageRegistryImpl")
//&&&staticSymbol&&&%>(<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.EPackage")
//&&&staticSymbol&&&%>.Registry.INSTANCE));
//&&&staticSymbol&&&		extendedMetaData.putPackage(null, <%
//&&&staticSymbol&&&=genPackage.getImportedPackageInterfaceName()
//&&&staticSymbol&&&%>.eINSTANCE);
//&&&staticSymbol&&&<%
} else if (genPackage.hasXMLMap() && !genPackage.hasTargetNamespace()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		xmlMap.setNoNamespacePackage(<%
//&&&staticSymbol&&&=genPackage.getImportedPackageInterfaceName()
//&&&staticSymbol&&&%>.eINSTANCE);
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * Creates an instance of the resource.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&  <%
if (genModel.useClassOverrideAnnotation()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	@Override
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	public Resource createResource(URI uri)
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&<%
if (genPackage.hasExtendedMetaData()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.xmi.XMLResource")
//&&&staticSymbol&&&%> result = new <%
//&&&staticSymbol&&&=genPackage.getResourceClassName()
//&&&staticSymbol&&&%>(uri);
//&&&staticSymbol&&&		result.getDefaultSaveOptions().put(<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.xmi.XMLResource")
//&&&staticSymbol&&&%>.OPTION_EXTENDED_META_DATA, <%
if (genPackage.hasTargetNamespace()){
//&&&staticSymbol&&&%>Boolean.TRUE<%
}else{
//&&&staticSymbol&&&%>extendedMetaData<%
}
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&		result.getDefaultLoadOptions().put(<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.xmi.XMLResource")
//&&&staticSymbol&&&%>.OPTION_EXTENDED_META_DATA, <%
if (genPackage.hasTargetNamespace()){
//&&&staticSymbol&&&%>Boolean.TRUE<%
}else{
//&&&staticSymbol&&&%>extendedMetaData<%
}
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&
//&&&staticSymbol&&&		result.getDefaultSaveOptions().put(<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.xmi.XMLResource")
//&&&staticSymbol&&&%>.OPTION_SCHEMA_LOCATION, Boolean.TRUE);
//&&&staticSymbol&&&
//&&&staticSymbol&&&		result.getDefaultLoadOptions().put(<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.xmi.XMLResource")
//&&&staticSymbol&&&%>.OPTION_USE_ENCODED_ATTRIBUTE_STYLE, Boolean.TRUE);
//&&&staticSymbol&&&		result.getDefaultSaveOptions().put(<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.xmi.XMLResource")
//&&&staticSymbol&&&%>.OPTION_USE_ENCODED_ATTRIBUTE_STYLE, Boolean.TRUE);
//&&&staticSymbol&&&
//&&&staticSymbol&&&		result.getDefaultLoadOptions().put(<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.xmi.XMLResource")
//&&&staticSymbol&&&%>.OPTION_USE_LEXICAL_HANDLER, Boolean.TRUE);
//&&&staticSymbol&&&<%
if (genPackage.isDataTypeConverters() && genPackage.hasDocumentRoot()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		result.getDefaultLoadOptions().put(<%
//&&&staticSymbol&&&=genPackage.getResourceClassName()
//&&&staticSymbol&&&%>.OPTION_USE_DATA_CONVERTER, Boolean.TRUE);
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
} else if (genPackage.hasXMLMap()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.xmi.XMLResource")
//&&&staticSymbol&&&%> result = new <%
//&&&staticSymbol&&&=genPackage.getResourceClassName()
//&&&staticSymbol&&&%>(uri);
//&&&staticSymbol&&&		result.getDefaultSaveOptions().put(<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.xmi.XMLResource")
//&&&staticSymbol&&&%>.OPTION_XML_MAP, xmlMap);
//&&&staticSymbol&&&		result.getDefaultLoadOptions().put(<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.xmi.XMLResource")
//&&&staticSymbol&&&%>.OPTION_XML_MAP, xmlMap);
//&&&staticSymbol&&&<%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		Resource result = new <%
//&&&staticSymbol&&&=genPackage.getResourceClassName()
//&&&staticSymbol&&&%>(uri);
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		return result;
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&} //<%
//&&&staticSymbol&&&=genPackage.getResourceFactoryClassName()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
genModel.emitSortedImports();
//&&&staticSymbol&&&%>

}
}