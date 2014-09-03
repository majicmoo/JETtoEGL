class TestCase {
public static void main (String[] args) {
//&&&staticSymbol&&&<%import java.util.*;%>
//&&&staticSymbol&&&<%import org.eclipse.emf.codegen.ecore.genmodel.*;%>
//&&&staticSymbol&&&<%include("../Header.javajetinc");%>
//&&&staticSymbol&&&<%include("TestCase/unsetGenFeature.TODO.override.javajetinc");%>
//&&&staticSymbol&&&<%include("TestCase/implementedGenFeature.insert.javajetinc");%>
//&&&staticSymbol&&&<%include("TestCase/unsetGenFeature.override.javajetinc");%>
//&&&staticSymbol&&&<%include("TestCase/getGenFeature.TODO.override.javajetinc");%>
//&&&staticSymbol&&&<%include("TestCase/implementedGenFeature.override.javajetinc");%>
//&&&staticSymbol&&&<%include("TestCase/genOperation.annotations.insert.javajetinc");%>
//&&&staticSymbol&&&<%include("TestCase/isSetGenFeature.TODO.override.javajetinc");%>
//&&&staticSymbol&&&<%include("TestCase/isSetGenFeature.annotations.insert.javajetinc");%>
//&&&staticSymbol&&&<%include("TestCase/implementedGenOperation.override.javajetinc");%>
//&&&staticSymbol&&&<%include("TestCase/setGenFeature.annotations.insert.javajetinc");%>
//&&&staticSymbol&&&<%include("TestCase/getGenFeature.override.javajetinc");%>
//&&&staticSymbol&&&<%include("TestCase/implementedGenOperation.insert.javajetinc");%>
//&&&staticSymbol&&&<%include("TestCase/insert.javajetinc");%>
//&&&staticSymbol&&&<%include("TestCase/implementedGenOperation.TODO.override.javajetinc");%>
//&&&staticSymbol&&&<%include("TestCase/setGenFeature.TODO.override.javajetinc");%>
//&&&staticSymbol&&&<%include("TestCase/isSetGenFeature.override.javajetinc");%>
//&&&staticSymbol&&&<%include("TestCase/getGenFeature.annotations.insert.javajetinc");%>
//&&&staticSymbol&&&<%include("TestCase/setGenFeature.override.javajetinc");%>
//&&&staticSymbol&&&<%include("TestCase/unsetGenFeature.annotations.insert.javajetinc");%>
//&&&staticSymbol&&&<%

/**
 * Copyright (c) 2005, 2007 IBM Corporation and others.
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
GenClass genClass = (GenClass)argument; GenPackage genPackage = genClass.getGenPackage(); GenModel genModel=genPackage.getGenModel(); /* Trick to import java.util.* without warnings */Iterator.class.getName();
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
//&&&staticSymbol&&& * A test case for the model object '<em><b><%
//&&&staticSymbol&&&=genClass.getFormattedName()
//&&&staticSymbol&&&%></b></em>'.
//&&&staticSymbol&&& * <!-- end-user-doc -->
//&&&staticSymbol&&&<%
if (!genClass.getImplementedGenFeatures().isEmpty()) { boolean first = true;
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
for (GenFeature genFeature : genClass.getImplementedGenFeatures()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
if (genFeature.isTested() && !genFeature.isSuppressedGetVisibility()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
if (first) { first = false;
//&&&staticSymbol&&&%>
//&&&staticSymbol&&& * <p>
//&&&staticSymbol&&& * The following features are tested:
//&&&staticSymbol&&& * <ul>
//&&&staticSymbol&&&      <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&& *   <li>{@link <%
//&&&staticSymbol&&&=genFeature.getGenClass().getQualifiedInterfaceName()
//&&&staticSymbol&&&%>#<%
//&&&staticSymbol&&&=genFeature.getGetAccessor()
//&&&staticSymbol&&&%>() <em><%
//&&&staticSymbol&&&=genFeature.getFormattedName()
//&&&staticSymbol&&&%></em>}</li>
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
 if (!first) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&& * </ul>
//&&&staticSymbol&&& * </p>
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
if (!genClass.getImplementedGenOperations().isEmpty()) { boolean first = true;
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
for (GenOperation genOperation : genClass.getImplementedGenOperations()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
if (first) { first = false;
//&&&staticSymbol&&&%>
//&&&staticSymbol&&& * <p>
//&&&staticSymbol&&& * The following operations are tested:
//&&&staticSymbol&&& * <ul>
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&& *   <li>{@link <%
//&&&staticSymbol&&&=genOperation.getGenClass().getQualifiedInterfaceName()
//&&&staticSymbol&&&%>#<%
//&&&staticSymbol&&&=genOperation.getName()
//&&&staticSymbol&&&%>(<%
//&&&staticSymbol&&&=genOperation.getParameterTypes(", ")
//&&&staticSymbol&&&%>) <em><%
//&&&staticSymbol&&&=genOperation.getFormattedName()
//&&&staticSymbol&&&%></em>}</li>
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
 if (!first) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&& * </ul>
//&&&staticSymbol&&& * </p>
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&& * @generated
//&&&staticSymbol&&& */
//&&&staticSymbol&&&public<%
if (genClass.isAbstract()) {
//&&&staticSymbol&&&%> abstract<%
}
//&&&staticSymbol&&&%> class <%
//&&&staticSymbol&&&=genClass.getTestCaseClassName()
//&&&staticSymbol&&&%> extends <%
//&&&staticSymbol&&&*%%storeSymbol%%*0
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
//&&&staticSymbol&&&<%
if (genModel.getDriverNumber() != null) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	public static final <%
//&&&staticSymbol&&&=genModel.getImportedName("java.lang.String")
//&&&staticSymbol&&&%> mofDriverNumber = "<%
//&&&staticSymbol&&&=genModel.getDriverNumber()
//&&&staticSymbol&&&%>";<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
if (genClass.isModelRoot()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * The fixture for this <%
//&&&staticSymbol&&&=genClass.getFormattedName()
//&&&staticSymbol&&&%> test case.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	protected <%
//&&&staticSymbol&&&=genClass.getImportedInterfaceName()
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genClass.getInterfaceWildTypeArguments()
//&&&staticSymbol&&&%> fixture = null;
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
if (!genClass.isAbstract()) {
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
//&&&staticSymbol&&&%>.run(<%
//&&&staticSymbol&&&=genClass.getTestCaseClassName()
//&&&staticSymbol&&&%>.class);
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * Constructs a new <%
//&&&staticSymbol&&&=genClass.getFormattedName()
//&&&staticSymbol&&&%> test case with the given name.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	public <%
//&&&staticSymbol&&&=genClass.getTestCaseClassName()
//&&&staticSymbol&&&%>(String name)
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		super(name);
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&<%
if (genClass.isModelRoot()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * Sets the fixture for this <%
//&&&staticSymbol&&&=genClass.getFormattedName()
//&&&staticSymbol&&&%> test case.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	protected void setFixture(<%
//&&&staticSymbol&&&=genClass.getImportedInterfaceName()
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genClass.getInterfaceWildTypeArguments()
//&&&staticSymbol&&&%> fixture)
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		this.fixture = fixture;
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * Returns the fixture for this <%
//&&&staticSymbol&&&=genClass.getFormattedName()
//&&&staticSymbol&&&%> test case.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&<%
if (!genClass.isModelRoot() && genModel.useClassOverrideAnnotation()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	@Override
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	<%
if (genModel.useGenerics()) {
//&&&staticSymbol&&&%>protected<%
} else {
//&&&staticSymbol&&&%>private<%
}
//&&&staticSymbol&&&%> <%
//&&&staticSymbol&&&=genClass.getImportedInterfaceName()
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genClass.getInterfaceWildTypeArguments()
//&&&staticSymbol&&&%> getFixture()
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&<%
if (genClass.isModelRoot()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		return fixture;
//&&&staticSymbol&&&<%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		return (<%
//&&&staticSymbol&&&=genClass.getImportedInterfaceName()
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genClass.getInterfaceWildTypeArguments()
//&&&staticSymbol&&&%>)fixture;
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&<%
if (!genClass.isAbstract()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @see junit.framework.TestCase#setUp()
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&<%
if (genModel.useClassOverrideAnnotation()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	@Override
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
if (genModel.useGenerics() && genClass.isMapEntry()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	@SuppressWarnings("unchecked")
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	protected void setUp() throws Exception
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&  <%
if (genClass.isMapEntry()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		setFixture((<%
//&&&staticSymbol&&&=genClass.getImportedInterfaceName()
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genClass.getInterfaceWildTypeArguments()
//&&&staticSymbol&&&%>)<%
//&&&staticSymbol&&&=genPackage.getQualifiedEFactoryInternalInstanceAccessor()
//&&&staticSymbol&&&%>.create(<%
//&&&staticSymbol&&&=genClass.getQualifiedClassifierAccessor()
//&&&staticSymbol&&&%>));
//&&&staticSymbol&&&  <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		setFixture(<%
//&&&staticSymbol&&&=genPackage.getQualifiedEFactoryInternalInstanceAccessor()
//&&&staticSymbol&&&%>.create<%
//&&&staticSymbol&&&=genClass.getName()
//&&&staticSymbol&&&%>());
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @see junit.framework.TestCase#tearDown()
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&<%
if (genModel.useClassOverrideAnnotation()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	@Override
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	protected void tearDown() throws Exception
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		setFixture(null);
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
for (GenFeature genFeature : genClass.getImplementedGenFeatures()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
//&&&staticSymbol&&&@ start 
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
if (genFeature.isTested()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
if (genFeature.isGet() && !genFeature.isSuppressedGetVisibility()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
//&&&staticSymbol&&&@ start 
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * Tests the '{@link <%
//&&&staticSymbol&&&=genFeature.getGenClass().getQualifiedInterfaceName()
//&&&staticSymbol&&&%>#<%
//&&&staticSymbol&&&=genFeature.getGetAccessor()
//&&&staticSymbol&&&%>() <em><%
//&&&staticSymbol&&&=genFeature.getFormattedName()
//&&&staticSymbol&&&%></em>}' feature getter.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @see <%
//&&&staticSymbol&&&=genFeature.getGenClass().getQualifiedInterfaceName()
//&&&staticSymbol&&&%>#<%
//&&&staticSymbol&&&=genFeature.getGetAccessor()
//&&&staticSymbol&&&%>()
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&      <%
if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) { //TestCase/getGenFeature.annotations.insert.javajetinc
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	public void test<%
//&&&staticSymbol&&&=genModel.capName(genFeature.getGetAccessor())
//&&&staticSymbol&&&%>()
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&<%
//&&&staticSymbol&&&@ start 
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		// TODO: implement this feature getter test method
//&&&staticSymbol&&&		// Ensure that you remove @generated or mark it @generated NOT
//&&&staticSymbol&&&		fail();
//&&&staticSymbol&&&<%
//&&&staticSymbol&&&@ end 
//&&&staticSymbol&&&%><%
//TestCase/getGenFeature.todo.override.javajetinc
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&<%
//&&&staticSymbol&&&@ end 
//&&&staticSymbol&&&%><%
//TestCase/getGenFeature.override.javajetinc
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
if (genFeature.isSet() && !genFeature.isSuppressedSetVisibility()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
//&&&staticSymbol&&&@ start 
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * Tests the '{@link <%
//&&&staticSymbol&&&=genFeature.getGenClass().getQualifiedInterfaceName()
//&&&staticSymbol&&&%>#set<%
//&&&staticSymbol&&&=genFeature.getAccessorName()
//&&&staticSymbol&&&%>(<%
//&&&staticSymbol&&&=genFeature.getRawBoundType()
//&&&staticSymbol&&&%>) <em><%
//&&&staticSymbol&&&=genFeature.getFormattedName()
//&&&staticSymbol&&&%></em>}' feature setter.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @see <%
//&&&staticSymbol&&&=genFeature.getGenClass().getQualifiedInterfaceName()
//&&&staticSymbol&&&%>#set<%
//&&&staticSymbol&&&=genFeature.getAccessorName()
//&&&staticSymbol&&&%>(<%
//&&&staticSymbol&&&=genFeature.getRawBoundType()
//&&&staticSymbol&&&%>)
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&      <%
if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) { //TestCase/setGenFeature.annotations.insert.javajetinc
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	public void testSet<%
//&&&staticSymbol&&&=genFeature.getAccessorName()
//&&&staticSymbol&&&%>()
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&<%
//&&&staticSymbol&&&@ start 
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		// TODO: implement this feature setter test method
//&&&staticSymbol&&&		// Ensure that you remove @generated or mark it @generated NOT
//&&&staticSymbol&&&		fail();
//&&&staticSymbol&&&<%
//&&&staticSymbol&&&@ end 
//&&&staticSymbol&&&%><%
//TestCase/setGenFeature.todo.override.javajetinc
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&<%
//&&&staticSymbol&&&@ end 
//&&&staticSymbol&&&%><%
//TestCase/setGenFeature.override.javajetinc
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
if (genFeature.isUnset() && !genFeature.isSuppressedUnsetVisibility()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
//&&&staticSymbol&&&@ start 
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * Tests the '{@link <%
//&&&staticSymbol&&&=genFeature.getGenClass().getQualifiedInterfaceName()
//&&&staticSymbol&&&%>#unset<%
//&&&staticSymbol&&&=genFeature.getAccessorName()
//&&&staticSymbol&&&%>() <em>unset<%
//&&&staticSymbol&&&=genFeature.getAccessorName()
//&&&staticSymbol&&&%>()</em>}' method.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @see <%
//&&&staticSymbol&&&=genFeature.getGenClass().getQualifiedInterfaceName()
//&&&staticSymbol&&&%>#unset<%
//&&&staticSymbol&&&=genFeature.getAccessorName()
//&&&staticSymbol&&&%>()
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&      <%
if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) { //TestCase/unsetGenFeature.annotations.insert.javajetinc
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	public void testUnset<%
//&&&staticSymbol&&&=genFeature.getAccessorName()
//&&&staticSymbol&&&%>()
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&<%
//&&&staticSymbol&&&@ start 
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		// TODO: implement this test method
//&&&staticSymbol&&&		// Ensure that you remove @generated or mark it @generated NOT
//&&&staticSymbol&&&		fail();
//&&&staticSymbol&&&<%
//&&&staticSymbol&&&@ end 
//&&&staticSymbol&&&%><%
//TestCase/unsetGenFeature.todo.override.javajetinc
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&<%
//&&&staticSymbol&&&@ end 
//&&&staticSymbol&&&%><%
//TestCase/unsetGenFeature.override.javajetinc
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
if (genFeature.isIsSet() && !genFeature.isSuppressedIsSetVisibility()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
//&&&staticSymbol&&&@ start 
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * Tests the '{@link <%
//&&&staticSymbol&&&=genFeature.getGenClass().getQualifiedInterfaceName()
//&&&staticSymbol&&&%>#isSet<%
//&&&staticSymbol&&&=genFeature.getAccessorName()
//&&&staticSymbol&&&%>() <em>isSet<%
//&&&staticSymbol&&&=genFeature.getAccessorName()
//&&&staticSymbol&&&%>()</em>}' method.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @see <%
//&&&staticSymbol&&&=genFeature.getGenClass().getQualifiedInterfaceName()
//&&&staticSymbol&&&%>#isSet<%
//&&&staticSymbol&&&=genFeature.getAccessorName()
//&&&staticSymbol&&&%>()
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&      <%
if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) { //TestCase/isSetGenFeature.annotations.insert.javajetinc
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	public void testIsSet<%
//&&&staticSymbol&&&=genFeature.getAccessorName()
//&&&staticSymbol&&&%>()
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&<%
//&&&staticSymbol&&&@ start 
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		// TODO: implement this test method
//&&&staticSymbol&&&		// Ensure that you remove @generated or mark it @generated NOT
//&&&staticSymbol&&&		fail();
//&&&staticSymbol&&&<%
//&&&staticSymbol&&&@ end 
//&&&staticSymbol&&&%><%
//TestCase/isSetGenFeature.todo.override.javajetinc
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&<%
//&&&staticSymbol&&&@ end 
//&&&staticSymbol&&&%><%
//TestCase/isSetGenFeature.override.javajetinc
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
//&&&staticSymbol&&&@ end 
//&&&staticSymbol&&&%><%
//TestCase/implementedGenFeature.override.javajetinc
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
for (GenOperation genOperation : genClass.getImplementedGenOperations()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
//&&&staticSymbol&&&@ start 
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * Tests the '{@link <%
//&&&staticSymbol&&&=genOperation.getGenClass().getQualifiedInterfaceName()
//&&&staticSymbol&&&%>#<%
//&&&staticSymbol&&&=genOperation.getName()
//&&&staticSymbol&&&%>(<%
//&&&staticSymbol&&&=genOperation.getParameterTypes(", ")
//&&&staticSymbol&&&%>) <em><%
//&&&staticSymbol&&&=genOperation.getFormattedName()
//&&&staticSymbol&&&%></em>}' operation.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @see <%
//&&&staticSymbol&&&=genOperation.getGenClass().getQualifiedInterfaceName()
//&&&staticSymbol&&&%>#<%
//&&&staticSymbol&&&=genOperation.getName()
//&&&staticSymbol&&&%>(<%
//&&&staticSymbol&&&=genOperation.getParameterTypes(", ")
//&&&staticSymbol&&&%>)
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&  <%
if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) { //TestCase/genOperation.annotations.insert.javajetinc
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	public void test<%
//&&&staticSymbol&&&=genClass.getUniqueName(genOperation)
//&&&staticSymbol&&&%>()
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&<%
//&&&staticSymbol&&&@ start 
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		// TODO: implement this operation test method
//&&&staticSymbol&&&		// Ensure that you remove @generated or mark it @generated NOT
//&&&staticSymbol&&&		fail();
//&&&staticSymbol&&&<%
//&&&staticSymbol&&&@ end 
//&&&staticSymbol&&&%><%
//TestCase/implementedGenOperation.todo.override.javajetinc
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&<%
//&&&staticSymbol&&&@ end 
//&&&staticSymbol&&&%><%
//TestCase/implementedGenOperation.override.javajetinc
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&} //<%
//&&&staticSymbol&&&=genClass.getTestCaseClassName()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
genModel.emitSortedImports();
//&&&staticSymbol&&&%>

}
}