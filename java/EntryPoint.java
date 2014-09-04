class EntryPoint {
public static void main (String[] args) {
//&&&staticSymbol&&&<%import java.util.*;%>
//&&&staticSymbol&&&<%import org.eclipse.emf.codegen.ecore.genmodel.*;%>
//&&&staticSymbol&&&<%

/**
 * Copyright (c) 20010 Ed Merks and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Ed Merks - Initial API and implementation
 */

//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
GenModel genModel = (GenModel)argument; /* Trick to import java.util.* without warnings */Iterator.class.getName();
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%include("../Header.javajetinc");%>
//&&&staticSymbol&&&package <%
//&&&staticSymbol&&&=genModel.getEditorPluginPackageName()
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
genModel.markImportLocation(stringBuffer);
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&/**
//&&&staticSymbol&&& * This is the entry point.
//&&&staticSymbol&&& * <!-- begin-user-doc -->
//&&&staticSymbol&&& * <!-- end-user-doc -->
//&&&staticSymbol&&& * @generated
//&&&staticSymbol&&& */
//&&&staticSymbol&&&public class <%
//&&&staticSymbol&&&=genModel.getEditorEntryPointClassName()
//&&&staticSymbol&&&%> extends EditorEntryPoint
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
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	@Override
//&&&staticSymbol&&&	public void onModuleLoad()
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		super.onModuleLoad();
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	@Override
//&&&staticSymbol&&&	protected void registerPackages(<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.EPackage")
//&&&staticSymbol&&&%>.Registry packageRegistry)
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&<%
for (GenPackage genPackage : genModel.getAllGenAndUsedGenPackagesWithClassifiers()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		packageRegistry.put(<%
//&&&staticSymbol&&&=genPackage.getImportedPackageInterfaceName()
//&&&staticSymbol&&&%>.eNS_URI, <%
//&&&staticSymbol&&&=genPackage.getImportedPackageInterfaceName()
//&&&staticSymbol&&&%>.eINSTANCE);
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	@Override
//&&&staticSymbol&&&	protected void configureItemProviderAdapterFactories(<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.edit.provider.ComposedAdapterFactory")
//&&&staticSymbol&&&%> adapterFactory)
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&<%
for (GenPackage genPackage : genModel.getAllGenAndUsedGenPackagesWithClassifiers()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		adapterFactory.addAdapterFactory(new <%
//&&&staticSymbol&&&=genPackage.getImportedItemProviderAdapterFactoryClassName()
//&&&staticSymbol&&&%>());
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	@Override
//&&&staticSymbol&&&	protected String getApplicationTitle()
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		return "<%
//&&&staticSymbol&&&=genModel.getModelName()
//&&&staticSymbol&&&%> Application";<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&}
//&&&staticSymbol&&&<%
genModel.emitSortedImports();
//&&&staticSymbol&&&%>

}
}