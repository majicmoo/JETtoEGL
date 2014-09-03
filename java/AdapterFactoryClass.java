class AdapterFactoryClass {
public static void main (String[] args) {
//&&&staticSymbol&&&<%import java.util.*;%>
//&&&staticSymbol&&&<%import org.eclipse.emf.codegen.ecore.genmodel.*;%>
//&&&staticSymbol&&&<%include("../Header.javajetinc");%>
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
GenPackage genPackage = (GenPackage)argument; GenModel genModel=genPackage.getGenModel(); /* Trick to import java.util.* without warnings */Iterator.class.getName();
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&package <%
//&&&staticSymbol&&&=genPackage.getUtilitiesPackageName()
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
genModel.addImport("org.eclipse.emf.common.notify.Adapter");
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
genModel.addImport("org.eclipse.emf.common.notify.Notifier");
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
genModel.addImport("org.eclipse.emf.common.notify.impl.AdapterFactoryImpl");
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
genModel.addImport("org.eclipse.emf.ecore.EObject");
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
if (!genPackage.hasJavaLangConflict() && !genPackage.getUtilitiesPackageName().equals(genPackage.getInterfacePackageName())) genModel.addImport(genPackage.getInterfacePackageName() + ".*");
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
String typeArgument = genModel.useGenerics() ? "<Adapter>" : "";
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
String returnType = genModel.useGenerics() ? "Adapter" : genModel.getImportedName("java.lang.Object");
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
String adapterCast = genModel.useGenerics() ? "" : "(Adapter)";
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
genModel.markImportLocation(stringBuffer);
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&/**
//&&&staticSymbol&&& * <!-- begin-user-doc -->
//&&&staticSymbol&&& * The <b>Adapter Factory</b> for the model.
//&&&staticSymbol&&& * It provides an adapter <code>createXXX</code> method for each class of the model.
//&&&staticSymbol&&& * <!-- end-user-doc -->
//&&&staticSymbol&&& * @see <%
//&&&staticSymbol&&&=genPackage.getQualifiedPackageInterfaceName()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&& * @generated
//&&&staticSymbol&&& */
//&&&staticSymbol&&&public class <%
//&&&staticSymbol&&&=genPackage.getAdapterFactoryClassName()
//&&&staticSymbol&&&%> extends AdapterFactoryImpl
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
//&&&staticSymbol&&&	 * The cached model package.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	protected static <%
//&&&staticSymbol&&&=genPackage.getImportedPackageInterfaceName()
//&&&staticSymbol&&&%> modelPackage;
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * Creates an instance of the adapter factory.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	public <%
//&&&staticSymbol&&&=genPackage.getAdapterFactoryClassName()
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
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * Returns whether this factory is applicable for the type of the object.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @return whether this factory is applicable for the type of the object.
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&  <%
if (genModel.useClassOverrideAnnotation()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	@Override
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	public boolean isFactoryForType(Object object)
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		if (object == modelPackage)
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			return true;
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&		if (object instanceof EObject)
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			return ((EObject)object).eClass().getEPackage() == modelPackage;
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&		return false;
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * The switch that delegates to the <code>createXXX</code> methods.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	protected <%
//&&&staticSymbol&&&=genPackage.getSwitchClassName()
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=typeArgument
//&&&staticSymbol&&&%> modelSwitch =
//&&&staticSymbol&&&		new <%
//&&&staticSymbol&&&=genPackage.getSwitchClassName()
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=typeArgument
//&&&staticSymbol&&&%>()
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&<%
for (GenClass genClass : genPackage.getAllSwitchGenClasses()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
if (genModel.useClassOverrideAnnotation()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			@Override
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			public <%
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
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&				return create<%
//&&&staticSymbol&&&=genPackage.getClassUniqueName(genClass)
//&&&staticSymbol&&&%>Adapter();
//&&&staticSymbol&&&			}
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
if (genModel.useClassOverrideAnnotation()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			@Override
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			public <%
//&&&staticSymbol&&&=returnType
//&&&staticSymbol&&&%> defaultCase(EObject object)
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&				return create<%
//&&&staticSymbol&&&=genPackage.getClassUniqueName(null)
//&&&staticSymbol&&&%>Adapter();
//&&&staticSymbol&&&			}
//&&&staticSymbol&&&		};
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * Creates an adapter for the <code>target</code>.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @param target the object to adapt.
//&&&staticSymbol&&&	 * @return the adapter for the <code>target</code>.
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&  <%
if (genModel.useClassOverrideAnnotation()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	@Override
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	public Adapter createAdapter(Notifier target)
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		return <%
//&&&staticSymbol&&&=adapterCast
//&&&staticSymbol&&&%>modelSwitch.doSwitch((EObject)target);
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
for (GenClass genClass : genPackage.getAllSwitchGenClasses()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * Creates a new adapter for an object of class '{@link <%
//&&&staticSymbol&&&=genClass.getQualifiedInterfaceName()
//&&&staticSymbol&&&%> <em><%
//&&&staticSymbol&&&=genClass.getFormattedName()
//&&&staticSymbol&&&%></em>}'.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * This default implementation returns null so that we can easily ignore cases;
//&&&staticSymbol&&&	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @return the new adapter.
//&&&staticSymbol&&&	 * @see <%
//&&&staticSymbol&&&=genClass.getQualifiedInterfaceName()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	public Adapter create<%
//&&&staticSymbol&&&=genPackage.getClassUniqueName(genClass)
//&&&staticSymbol&&&%>Adapter()
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		return null;
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * Creates a new adapter for the default case.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * This default implementation returns null.
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @return the new adapter.
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	public Adapter create<%
//&&&staticSymbol&&&=genPackage.getClassUniqueName(null)
//&&&staticSymbol&&&%>Adapter()
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		return null;
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&} //<%
//&&&staticSymbol&&&=genPackage.getAdapterFactoryClassName()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
genModel.emitSortedImports();
//&&&staticSymbol&&&%>

}
}