class PackageTestSuite {
public static void main (String[] args) {
//&&&staticSymbol&&&<%import java.util.*;%>
//&&&staticSymbol&&&<%import org.eclipse.emf.codegen.ecore.genmodel.*;%>
//&&&staticSymbol&&&<%include("../Header.javajetinc");%>
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
GenPackage genPackage = (GenPackage)argument; GenModel genModel = genPackage.getGenModel(); /* Trick to import java.util.* without warnings */Iterator.class.getName();
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&package <%
//&&&staticSymbol&&&=genPackage.getTestsPackageName()
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
genModel.markImportLocation(stringBuffer);
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&/**
//&&&staticSymbol&&& * <!-- begin-user-doc -->
//&&&staticSymbol&&& * A test suite for the '<em><b><%
//&&&staticSymbol&&&=genPackage.getPackageName()
//&&&staticSymbol&&&%></b></em>' package.
//&&&staticSymbol&&& * <!-- end-user-doc -->
//&&&staticSymbol&&& * @generated
//&&&staticSymbol&&& */
//&&&staticSymbol&&&public class <%
//&&&staticSymbol&&&=genPackage.getTestSuiteClassName()
//&&&staticSymbol&&&%> extends <%
//&&&staticSymbol&&&=genModel.getImportedName("junit.framework.TestSuite")
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&{
//&&&staticSymbol&&&<%
if (genModel.hasCopyrightField()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
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
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	public static void main(String[] args)
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=genModel.getImportedName("junit.textui.TestRunner")
//&&&staticSymbol&&&%>.run(suite());
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	public static <%
//&&&staticSymbol&&&=genModel.getImportedName("junit.framework.Test")
//&&&staticSymbol&&&%> suite()
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=genModel.getImportedName("junit.framework.TestSuite")
//&&&staticSymbol&&&%> suite = new <%
//&&&staticSymbol&&&=genPackage.getTestSuiteClassName()
//&&&staticSymbol&&&%>("<%
//&&&staticSymbol&&&=genPackage.getPackageName()
//&&&staticSymbol&&&%> Tests");<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
for (GenClass genClass : genPackage.getGenClasses()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
if (!genClass.isExternalInterface() && !genClass.isAbstract() && genClass.hasTests()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		suite.addTestSuite(<%
//&&&staticSymbol&&&=genClass.getImportedTestCaseClassName()
//&&&staticSymbol&&&%>.class);
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		return suite;
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	public <%
//&&&staticSymbol&&&=genPackage.getTestSuiteClassName()
//&&&staticSymbol&&&%>(String name)
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		super(name);
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&} //<%
//&&&staticSymbol&&&=genPackage.getTestSuiteClassName()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
genModel.emitSortedImports();
//&&&staticSymbol&&&%>

}
}