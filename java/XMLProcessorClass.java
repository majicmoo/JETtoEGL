class XMLProcessorClass {
public static void main (String[] args) {
//&&&staticSymbol&&&<%import org.eclipse.emf.codegen.ecore.genmodel.*;%>
//&&&staticSymbol&&&<%

/**
 * Copyright (c) 2005-2006 IBM Corporation and others. 
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
genModel.getImportedName("java.util.Map");
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
genModel.markImportLocation(stringBuffer);
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&/**
//&&&staticSymbol&&& * This class contains helper methods to serialize and deserialize XML documents
//&&&staticSymbol&&& * <!-- begin-user-doc -->
//&&&staticSymbol&&& * <!-- end-user-doc -->
//&&&staticSymbol&&& * @generated
//&&&staticSymbol&&& */
//&&&staticSymbol&&&public class <%
//&&&staticSymbol&&&=genPackage.getXMLProcessorClassName()
//&&&staticSymbol&&&%> extends <%
//&&&staticSymbol&&&=genPackage.getImportedXMLProcessorBaseClassName()
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
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * Public constructor to instantiate the helper.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	public <%
//&&&staticSymbol&&&=genPackage.getXMLProcessorClassName()
//&&&staticSymbol&&&%>()
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&<%
if (genPackage.hasExtendedMetaData() && !genPackage.hasTargetNamespace()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		super(new <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.impl.EPackageRegistryImpl")
//&&&staticSymbol&&&%>(<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.EPackage")
//&&&staticSymbol&&&%>.Registry.INSTANCE));
//&&&staticSymbol&&&		extendedMetaData.putPackage(null, <%
//&&&staticSymbol&&&=genPackage.getImportedPackageInterfaceName()
//&&&staticSymbol&&&%>.eINSTANCE);
//&&&staticSymbol&&&<%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		super((<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.EPackage")
//&&&staticSymbol&&&%>.Registry.INSTANCE));
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=genPackage.getImportedPackageInterfaceName()
//&&&staticSymbol&&&%>.eINSTANCE.eClass();
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&	
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * Register for "*" and "xml" file extensions the <%
//&&&staticSymbol&&&=genPackage.getResourceFactoryClassName()
//&&&staticSymbol&&&%> factory.
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
//&&&staticSymbol&&&	protected Map<%
if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) {
//&&&staticSymbol&&&%><<%=genModel.getImportedName("java.lang.String")%>, <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.resource.Resource")
//&&&staticSymbol&&&%>.Factory><%
}
//&&&staticSymbol&&&%> getRegistrations()
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		if (registrations == null)
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			super.getRegistrations();
//&&&staticSymbol&&&			registrations.put(XML_EXTENSION, new <%
//&&&staticSymbol&&&=genPackage.getResourceFactoryClassName()
//&&&staticSymbol&&&%>());
//&&&staticSymbol&&&			registrations.put(STAR_EXTENSION, new <%
//&&&staticSymbol&&&=genPackage.getResourceFactoryClassName()
//&&&staticSymbol&&&%>());
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&		return registrations;
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&} //<%
//&&&staticSymbol&&&=genPackage.getXMLProcessorClassName()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
genModel.emitSortedImports();
//&&&staticSymbol&&&%>

}
}