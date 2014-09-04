class SwitchClass {
public static void main (String[] args) {
//&&&staticSymbol&&&<%import java.util.*;%>
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
//&&&staticSymbol&&&<%
boolean supportsComposition = genModel.getRuntimeVersion().getValue() >= GenRuntimeVersion.EMF27_VALUE;
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%include("../Header.javajetinc");%>
//&&&staticSymbol&&&package <%
//&&&staticSymbol&&&=genPackage.getUtilitiesPackageName()
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
if (supportsComposition) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
genModel.addImport("org.eclipse.emf.ecore.EObject");
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
genModel.addImport("org.eclipse.emf.ecore.EPackage");
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
genModel.addImport("org.eclipse.emf.ecore.util.Switch");
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
genModel.addImport("org.eclipse.emf.ecore.EClass");
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
genModel.addImport("org.eclipse.emf.ecore.EObject");
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
if (!genPackage.hasJavaLangConflict() && !genPackage.getUtilitiesPackageName().equals(genPackage.getInterfacePackageName())) genModel.addImport(genPackage.getInterfacePackageName() + ".*");
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%

String templateParameterName = null;
if (genModel.useGenerics())
{
  Set<String> usedNames = new HashSet<String>();
  for (GenEnum genEnum : genPackage.getGenEnums())
  {
    usedNames.add(genEnum.getName());
  }
  for (GenClass genClass : genPackage.getAllSwitchGenClasses())
  {
    if (!genClass.isDynamic() && !genClass.isExternalInterface())
    {
      usedNames.add(genClass.getName());
    }
    for (GenTypeParameter genTypeParameter : genClass.getGenTypeParameters())
    {
      usedNames.add(genTypeParameter.getName());
    }
  }
  templateParameterName = "T";
  for (int i = 1; usedNames.contains(templateParameterName); ++i)
  {
    templateParameterName = "T" + i;
  }
}

//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
String templateParameters = genModel.useGenerics() ? "<" + templateParameterName + ">" : "";
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
String returnType = genModel.useGenerics() ? templateParameterName : genModel.getImportedName("java.lang.Object");
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
genModel.markImportLocation(stringBuffer);
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&/**
//&&&staticSymbol&&& * <!-- begin-user-doc -->
//&&&staticSymbol&&& * The <b>Switch</b> for the model's inheritance hierarchy.
//&&&staticSymbol&&& * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
//&&&staticSymbol&&& * to invoke the <code>caseXXX</code> method for each class of the model,
//&&&staticSymbol&&& * starting with the actual class of the object
//&&&staticSymbol&&& * and proceeding up the inheritance hierarchy
//&&&staticSymbol&&& * until a non-null result is returned,
//&&&staticSymbol&&& * which is the result of the switch.
//&&&staticSymbol&&& * <!-- end-user-doc -->
//&&&staticSymbol&&& * @see <%
//&&&staticSymbol&&&=genPackage.getQualifiedPackageInterfaceName()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&& * @generated
//&&&staticSymbol&&& */
//&&&staticSymbol&&&public class <%
//&&&staticSymbol&&&=genPackage.getSwitchClassName()
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=templateParameters
//&&&staticSymbol&&&%><%
if (supportsComposition){
//&&&staticSymbol&&&%> extends Switch<%
//&&&staticSymbol&&&=templateParameters
//&&&staticSymbol&&&%><%
}
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
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * The cached model package
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	protected static <%
//&&&staticSymbol&&&=genPackage.getImportedPackageInterfaceName()
//&&&staticSymbol&&&%> modelPackage;
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * Creates an instance of the switch.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	public <%
//&&&staticSymbol&&&=genPackage.getSwitchClassName()
//&&&staticSymbol&&&%>()
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		if (modelPackage == null)
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			modelPackage = <%
//&&&staticSymbol&&&=genPackage.getImportedPackageInterfaceName()
//&&&staticSymbol&&&%>.eINSTANCE;
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
if (supportsComposition) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * Checks whether this is a switch for the given package.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @parameter ePackage the package in question.
//&&&staticSymbol&&&	 * @return whether this is a switch for the given package.
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	@Override
//&&&staticSymbol&&&	protected boolean isSwitchFor(EPackage ePackage)
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		return ePackage == modelPackage;
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&<%
} else { boolean isUnnecessaryElse = genModel.isUnnecessaryElse(); String indent = isUnnecessaryElse ? "" : "\t";
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @return the first non-null result returned by a <code>caseXXX</code> call.
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	public <%
//&&&staticSymbol&&&=returnType
//&&&staticSymbol&&&%> doSwitch(EObject theEObject)
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		return doSwitch(theEObject.eClass(), theEObject);
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @return the first non-null result returned by a <code>caseXXX</code> call.
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	protected <%
//&&&staticSymbol&&&=returnType
//&&&staticSymbol&&&%> doSwitch(EClass theEClass, EObject theEObject)
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		if (theEClass.eContainer() == modelPackage)
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			return doSwitch(theEClass.getClassifierID(), theEObject);
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&  <%
if (!isUnnecessaryElse) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		else
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=indent
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genModel.getImportedName("java.util.List")
//&&&staticSymbol&&&%><%
if (genModel.useGenerics()) {
//&&&staticSymbol&&&%><<%=genModel.getImportedName("org.eclipse.emf.ecore.EClass")%>><%
}
//&&&staticSymbol&&&%> eSuperTypes = theEClass.getESuperTypes();
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=indent
//&&&staticSymbol&&&%>return
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=indent
//&&&staticSymbol&&&%>	eSuperTypes.isEmpty() ?
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=indent
//&&&staticSymbol&&&%>		defaultCase(theEObject) :
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=indent
//&&&staticSymbol&&&%>		doSwitch(<%
if (!genModel.useGenerics()) {
//&&&staticSymbol&&&%>(EClass)<%
}
//&&&staticSymbol&&&%>eSuperTypes.get(0), theEObject);
//&&&staticSymbol&&&  <%
if (!isUnnecessaryElse) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @return the first non-null result returned by a <code>caseXXX</code> call.
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&<%
if (supportsComposition) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	@Override
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	protected <%
//&&&staticSymbol&&&=returnType
//&&&staticSymbol&&&%> doSwitch(int classifierID, EObject theEObject)
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		switch (classifierID)
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&<%
for (GenClass genClass : genPackage.getGenClasses()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
if (!genClass.isEObject()) { String result = "result".equals(genClass.getSafeUncapName()) ? "theResult" : "result"; 
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			case <%
//&&&staticSymbol&&&=genPackage.getImportedPackageInterfaceName()
//&&&staticSymbol&&&%>.<%
//&&&staticSymbol&&&=genPackage.getClassifierID(genClass)
//&&&staticSymbol&&&%>:
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&				<%
if (genClass.isUncheckedCast() || genClass.isMapEntry() && genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) {
//&&&staticSymbol&&&%>@SuppressWarnings("unchecked") <%
}
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genClass.getImportedInterfaceName()
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genClass.getInterfaceWildTypeArguments()
//&&&staticSymbol&&&%> <%
//&&&staticSymbol&&&=genClass.getSafeUncapName()
//&&&staticSymbol&&&%> = (<%
//&&&staticSymbol&&&=genClass.getImportedInterfaceName()
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genClass.getInterfaceWildTypeArguments()
//&&&staticSymbol&&&%>)theEObject;
//&&&staticSymbol&&&				<%
//&&&staticSymbol&&&=returnType
//&&&staticSymbol&&&%> <%
//&&&staticSymbol&&&=result
//&&&staticSymbol&&&%> = case<%
//&&&staticSymbol&&&=genPackage.getClassUniqueName(genClass)
//&&&staticSymbol&&&%>(<%
//&&&staticSymbol&&&=genClass.getSafeUncapName()
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&<%
for (GenClass baseGenClass : genClass.getSwitchGenClasses()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				if (<%
//&&&staticSymbol&&&=result
//&&&staticSymbol&&&%> == null) <%
//&&&staticSymbol&&&=result
//&&&staticSymbol&&&%> = <%
if (genClass.isRawBaseClass(baseGenClass)) {
//&&&staticSymbol&&&%>(<%
//&&&staticSymbol&&&=returnType
//&&&staticSymbol&&&%>)<%
}
//&&&staticSymbol&&&%>case<%
//&&&staticSymbol&&&=genPackage.getClassUniqueName(baseGenClass)
//&&&staticSymbol&&&%>(<%
if (genClass.isMapEntry()) {
//&&&staticSymbol&&&%>(<%
//&&&staticSymbol&&&=baseGenClass.getImportedInterfaceName()
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=baseGenClass.getInterfaceTypeArguments()
//&&&staticSymbol&&&%>)<%
}
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genClass.getSafeUncapName()
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				if (<%
//&&&staticSymbol&&&=result
//&&&staticSymbol&&&%> == null) <%
//&&&staticSymbol&&&=result
//&&&staticSymbol&&&%> = defaultCase(theEObject);
//&&&staticSymbol&&&				return <%
//&&&staticSymbol&&&=result
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&			}
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			default: return defaultCase(theEObject);
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&<%
for (GenClass genClass : genPackage.getAllSwitchGenClasses()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * Returns the result of interpreting the object as an instance of '<em><%
//&&&staticSymbol&&&=genClass.getFormattedName()
//&&&staticSymbol&&&%></em>'.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * This implementation returns null;
//&&&staticSymbol&&&	 * returning a non-null result will terminate the switch.
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @param object the target of the switch.
//&&&staticSymbol&&&	 * @return the result of interpreting the object as an instance of '<em><%
//&&&staticSymbol&&&=genClass.getFormattedName()
//&&&staticSymbol&&&%></em>'.
//&&&staticSymbol&&&	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	public <%
//&&&staticSymbol&&&=genClass.getTypeParameters()
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=returnType
//&&&staticSymbol&&&%> case<%
//&&&staticSymbol&&&=genPackage.getClassUniqueName(genClass)
//&&&staticSymbol&&&%>(<%
//&&&staticSymbol&&&=genClass.getImportedInterfaceName()
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genClass.getInterfaceTypeArguments()
//&&&staticSymbol&&&%> object)
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		return null;
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * This implementation returns null;
//&&&staticSymbol&&&	 * returning a non-null result will terminate the switch, but this is the last case anyway.
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @param object the target of the switch.
//&&&staticSymbol&&&	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
//&&&staticSymbol&&&	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&<%
if (supportsComposition) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	@Override
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	public <%
//&&&staticSymbol&&&=returnType
//&&&staticSymbol&&&%> defaultCase(EObject object)
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		return null;
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&} //<%
//&&&staticSymbol&&&=genPackage.getSwitchClassName()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
genModel.emitSortedImports();
//&&&staticSymbol&&&%>

}
}