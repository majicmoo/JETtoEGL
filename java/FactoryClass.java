class FactoryClass {
public static void main (String[] args) {
//&&&staticSymbol&&&<%import java.util.*;%>
//&&&staticSymbol&&&<%import org.eclipse.emf.codegen.ecore.genmodel.*;%>
//&&&staticSymbol&&&<%

/**
 * Copyright (c) 2002-2010 IBM Corporation and others.
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
GenPackage genPackage = (GenPackage)((Object[])argument)[0]; GenModel genModel=genPackage.getGenModel(); /* Trick to import java.util.* without warnings */Iterator.class.getName();
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
boolean isInterface = Boolean.TRUE.equals(((Object[])argument)[1]); boolean isImplementation = Boolean.TRUE.equals(((Object[])argument)[2]);
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
String publicStaticFinalFlag = isImplementation ? "public static final " : "";
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%include("../Header.javajetinc");%>
//&&&staticSymbol&&&<%
if (isInterface || genModel.isSuppressInterfaces()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&package <%
//&&&staticSymbol&&&=genPackage.getReflectionPackageName()
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&<%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&package <%
//&&&staticSymbol&&&=genPackage.getClassPackageName()
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
if (isImplementation) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
genModel.addPseudoImport("org.eclipse.emf.ecore.impl.MinimalEObjectImpl.Container");
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
genModel.addPseudoImport("org.eclipse.emf.ecore.impl.MinimalEObjectImpl.Container.Dynamic");
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
genModel.addImport("org.eclipse.emf.ecore.EClass");
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
genModel.addImport("org.eclipse.emf.ecore.EObject");
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
if (!genPackage.hasJavaLangConflict() && !genPackage.hasInterfaceImplConflict() && !genPackage.getClassPackageName().equals(genPackage.getInterfacePackageName())) genModel.addImport(genPackage.getInterfacePackageName() + ".*");
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
genModel.markImportLocation(stringBuffer);
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
if (isInterface) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&/**
//&&&staticSymbol&&& * <!-- begin-user-doc -->
//&&&staticSymbol&&& * The <b>Factory</b> for the model.
//&&&staticSymbol&&& * It provides a create method for each non-abstract class of the model.
//&&&staticSymbol&&& * <!-- end-user-doc -->
//&&&staticSymbol&&&<%
if (!genModel.isSuppressEMFMetaData()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&& * @see <%
//&&&staticSymbol&&&=genPackage.getQualifiedPackageInterfaceName()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&& * @generated
//&&&staticSymbol&&& */
//&&&staticSymbol&&&<%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&/**
//&&&staticSymbol&&& * <!-- begin-user-doc -->
//&&&staticSymbol&&& * An implementation of the model <b>Factory</b>.
//&&&staticSymbol&&& * <!-- end-user-doc -->
//&&&staticSymbol&&& * @generated
//&&&staticSymbol&&& */
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
if (isImplementation) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&public class <%
//&&&staticSymbol&&&=genPackage.getFactoryClassName()
//&&&staticSymbol&&&%> extends <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.impl.EFactoryImpl")
//&&&staticSymbol&&&%><%
if (!genModel.isSuppressInterfaces()) {
//&&&staticSymbol&&&%> implements <%
//&&&staticSymbol&&&=genPackage.getImportedFactoryInterfaceName()
//&&&staticSymbol&&&%><%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&public interface <%
//&&&staticSymbol&&&=genPackage.getFactoryInterfaceName()
//&&&staticSymbol&&&%><%
if (!genModel.isSuppressEMFMetaData()) {
//&&&staticSymbol&&&%> extends <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.EFactory")
//&&&staticSymbol&&&%><%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
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
//&&&staticSymbol&&&	<%
//&&&staticSymbol&&&=publicStaticFinalFlag
//&&&staticSymbol&&&%><%
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
if (isImplementation && (genModel.isSuppressEMFMetaData() || genModel.isSuppressInterfaces())) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * The singleton instance of the factory.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	<%
//&&&staticSymbol&&&=publicStaticFinalFlag
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genPackage.getFactoryClassName()
//&&&staticSymbol&&&%> eINSTANCE = init();
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
if (isInterface && genModel.isSuppressEMFMetaData()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * The singleton instance of the factory.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	<%
//&&&staticSymbol&&&=publicStaticFinalFlag
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genPackage.getFactoryInterfaceName()
//&&&staticSymbol&&&%> INSTANCE = <%
//&&&staticSymbol&&&=genPackage.getQualifiedFactoryClassName()
//&&&staticSymbol&&&%>.eINSTANCE;
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
} else if (isInterface && !genModel.isSuppressInterfaces()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * The singleton instance of the factory.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	<%
//&&&staticSymbol&&&=publicStaticFinalFlag
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genPackage.getFactoryInterfaceName()
//&&&staticSymbol&&&%> eINSTANCE = <%
//&&&staticSymbol&&&=genPackage.getQualifiedFactoryClassName()
//&&&staticSymbol&&&%>.init();
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
if (isImplementation) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * Creates the default factory implementation.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&<%
String factoryType = genModel.isSuppressEMFMetaData() ? genPackage.getFactoryClassName() : genPackage.getImportedFactoryInterfaceName();
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	public static <%
//&&&staticSymbol&&&=factoryType
//&&&staticSymbol&&&%> init()
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		try
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			<%
//&&&staticSymbol&&&=factoryType
//&&&staticSymbol&&&%> the<%
//&&&staticSymbol&&&=genPackage.getFactoryName()
//&&&staticSymbol&&&%> = (<%
//&&&staticSymbol&&&=factoryType
//&&&staticSymbol&&&%>)<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.EPackage")
//&&&staticSymbol&&&%>.Registry.INSTANCE.getEFactory(<%
//&&&staticSymbol&&&=genPackage.getPackageInterfaceName()
//&&&staticSymbol&&&%>.eNS_URI);
//&&&staticSymbol&&&			if (the<%
//&&&staticSymbol&&&=genPackage.getFactoryName()
//&&&staticSymbol&&&%> != null)
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&				return the<%
//&&&staticSymbol&&&=genPackage.getFactoryName()
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&			}
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&		catch (Exception exception)
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.plugin.EcorePlugin")
//&&&staticSymbol&&&%>.INSTANCE.log(exception);
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&		return new <%
//&&&staticSymbol&&&=genPackage.getImportedFactoryClassName()
//&&&staticSymbol&&&%>();
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * Creates an instance of the factory.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	public <%
//&&&staticSymbol&&&=genPackage.getFactoryClassName()
//&&&staticSymbol&&&%>()
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		super();
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
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
//&&&staticSymbol&&&	public EObject create(EClass eClass)
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		switch (eClass.getClassifierID())
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&<%
for (GenClass genClass : genPackage.getGenClasses()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
if (!genClass.isAbstract()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			case <%
//&&&staticSymbol&&&=genPackage.getImportedPackageInterfaceName()
//&&&staticSymbol&&&%>.<%
//&&&staticSymbol&&&=genClass.getClassifierID()
//&&&staticSymbol&&&%>: return <%
//&&&staticSymbol&&&*%%storeSymbol%%*0
//&&&staticSymbol&&&%>create<%
//&&&staticSymbol&&&=genClass.getName()
//&&&staticSymbol&&&%>();
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			default:
//&&&staticSymbol&&&				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genModel.getNonNLS(2)
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
if (!genPackage.getAllGenDataTypes().isEmpty()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
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
//&&&staticSymbol&&&	public Object createFromString(<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.EDataType")
//&&&staticSymbol&&&%> eDataType, String initialValue)
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		switch (eDataType.getClassifierID())
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&<%
for (GenDataType genDataType : genPackage.getAllGenDataTypes()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
if (genDataType.isSerializable()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			case <%
//&&&staticSymbol&&&=genPackage.getImportedPackageInterfaceName()
//&&&staticSymbol&&&%>.<%
//&&&staticSymbol&&&=genDataType.getClassifierID()
//&&&staticSymbol&&&%>:
//&&&staticSymbol&&&				return create<%
//&&&staticSymbol&&&=genDataType.getName()
//&&&staticSymbol&&&%>FromString(eDataType, initialValue);
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			default:
//&&&staticSymbol&&&				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genModel.getNonNLS(2)
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
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
//&&&staticSymbol&&&	public String convertToString(<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.EDataType")
//&&&staticSymbol&&&%> eDataType, Object instanceValue)
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		switch (eDataType.getClassifierID())
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&<%
for (GenDataType genDataType : genPackage.getAllGenDataTypes()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
if (genDataType.isSerializable()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			case <%
//&&&staticSymbol&&&=genPackage.getImportedPackageInterfaceName()
//&&&staticSymbol&&&%>.<%
//&&&staticSymbol&&&=genDataType.getClassifierID()
//&&&staticSymbol&&&%>:
//&&&staticSymbol&&&				return convert<%
//&&&staticSymbol&&&=genDataType.getName()
//&&&staticSymbol&&&%>ToString(eDataType, instanceValue);
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			default:
//&&&staticSymbol&&&				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genModel.getNonNLS(2)
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
for (GenClass genClass : genPackage.getGenClasses()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
if (!genClass.isAbstract()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	public <%
//&&&staticSymbol&&&=genClass.getTypeParameters()
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genClass.getImportedInterfaceName()
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genClass.getInterfaceTypeArguments()
//&&&staticSymbol&&&%> create<%
//&&&staticSymbol&&&=genClass.getName()
//&&&staticSymbol&&&%>()
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&    <%
if (genClass.isDynamic()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=genClass.getImportedInterfaceName()
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genClass.getInterfaceTypeArguments()
//&&&staticSymbol&&&%> <%
//&&&staticSymbol&&&=genClass.getSafeUncapName()
//&&&staticSymbol&&&%> = <%
//&&&staticSymbol&&&=genClass.getCastFromEObject()
//&&&staticSymbol&&&%>super.create(<%
//&&&staticSymbol&&&=genClass.getQualifiedClassifierAccessor()
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&    <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=genClass.getImportedClassName()
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genClass.getClassTypeArguments()
//&&&staticSymbol&&&%> <%
//&&&staticSymbol&&&=genClass.getSafeUncapName()
//&&&staticSymbol&&&%> = new <%
//&&&staticSymbol&&&=genClass.getImportedClassName()
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genClass.getClassTypeArguments()
//&&&staticSymbol&&&%>()<%
if (genModel.isSuppressInterfaces() && !genPackage.getReflectionPackageName().equals(genPackage.getInterfacePackageName())) {
//&&&staticSymbol&&&%>{}<%
}
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		return <%
//&&&staticSymbol&&&=genClass.getSafeUncapName()
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
for (GenDataType genDataType : genPackage.getAllGenDataTypes()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
if (genDataType.isSerializable()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
if (genPackage.isDataTypeConverters() || genDataType.hasCreatorBody()) { String eDataType = genDataType.getQualifiedClassifierAccessor();
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&    <%
if (genModel.useGenerics() && genDataType.isUncheckedCast() && !genDataType.hasCreatorBody()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	@SuppressWarnings("unchecked")
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	public <%
//&&&staticSymbol&&&=genDataType.getImportedParameterizedInstanceClassName()
//&&&staticSymbol&&&%> create<%
//&&&staticSymbol&&&=genDataType.getName()
//&&&staticSymbol&&&%>(<%
if (genDataType.hasCreatorBody()) {
//&&&staticSymbol&&&%>final <%
}
//&&&staticSymbol&&&%>String <%
if (genDataType.hasCreatorBody()) {
//&&&staticSymbol&&&%>it<%
} else {
//&&&staticSymbol&&&%>literal<%
}
//&&&staticSymbol&&&%>)
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&    <%
if (genDataType.hasCreatorBody()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=genDataType.getCreatorBody(genModel.getIndentation(stringBuffer))
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
} else if (genDataType instanceof GenEnum) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=genDataType.getImportedInstanceClassName()
//&&&staticSymbol&&&%> result = <%
//&&&staticSymbol&&&=genDataType.getImportedInstanceClassName()
//&&&staticSymbol&&&%>.get(literal);
//&&&staticSymbol&&&		if (result == null) throw new IllegalArgumentException("The value '" + literal + "' is not a valid enumerator of '" + <%
//&&&staticSymbol&&&=eDataType
//&&&staticSymbol&&&%>.getName() + "'");<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genModel.getNonNLS(2)
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genModel.getNonNLS(3)
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		return result;
//&&&staticSymbol&&&    <%
} else if (genDataType.getBaseType() != null) { GenDataType genBaseType = genDataType.getBaseType(); boolean isPrimitiveConversion = !genDataType.isPrimitiveType() && genBaseType.isPrimitiveType();
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
if (genBaseType.getGenPackage() == genPackage) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&        <%
if (isPrimitiveConversion && genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		return new <%
//&&&staticSymbol&&&=genDataType.getObjectInstanceClassName()
//&&&staticSymbol&&&%>(create<%
//&&&staticSymbol&&&=genBaseType.getName()
//&&&staticSymbol&&&%>(literal));
//&&&staticSymbol&&&        <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		return create<%
//&&&staticSymbol&&&=genBaseType.getName()
//&&&staticSymbol&&&%>(literal);
//&&&staticSymbol&&&        <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
} else if (genBaseType.getGenPackage().isDataTypeConverters()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&        <%
if (isPrimitiveConversion && genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		return new <%
//&&&staticSymbol&&&=genDataType.getObjectInstanceClassName()
//&&&staticSymbol&&&%>(<%
//&&&staticSymbol&&&=genBaseType.getGenPackage().getQualifiedEFactoryInternalInstanceAccessor()
//&&&staticSymbol&&&%>.create<%
//&&&staticSymbol&&&=genBaseType.getName()
//&&&staticSymbol&&&%>(literal));
//&&&staticSymbol&&&        <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		return <%
//&&&staticSymbol&&&=genBaseType.getGenPackage().getQualifiedEFactoryInternalInstanceAccessor()
//&&&staticSymbol&&&%>.create<%
//&&&staticSymbol&&&=genBaseType.getName()
//&&&staticSymbol&&&%>(literal);
//&&&staticSymbol&&&        <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		return <%
if (!genDataType.isObjectType()) {
//&&&staticSymbol&&&%>(<%
//&&&staticSymbol&&&=genDataType.getObjectInstanceClassName()
//&&&staticSymbol&&&%>)<%
}
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genBaseType.getGenPackage().getQualifiedEFactoryInternalInstanceAccessor()
//&&&staticSymbol&&&%>.createFromString(<%
//&&&staticSymbol&&&=genBaseType.getQualifiedClassifierAccessor()
//&&&staticSymbol&&&%>, literal);
//&&&staticSymbol&&&      <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
} else if (genDataType.getItemType() != null) { GenDataType genItemType = genDataType.getItemType(); 
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		if (literal == null) return null;
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=genDataType.getImportedParameterizedInstanceClassName()
//&&&staticSymbol&&&%> result = new <%
//&&&staticSymbol&&&=genModel.getImportedName("java.util.ArrayList")
//&&&staticSymbol&&&%><%
if (genModel.useGenerics()) {
//&&&staticSymbol&&&%><<%=genItemType.getObjectType().getImportedParameterizedInstanceClassName()%>><%
}
//&&&staticSymbol&&&%>();
//&&&staticSymbol&&&      <%
if (genModel.getRuntimeVersion().getValue() < GenRuntimeVersion.EMF26_VALUE) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		for (<%
//&&&staticSymbol&&&=genModel.getImportedName("java.util.StringTokenizer")
//&&&staticSymbol&&&%> stringTokenizer = new <%
//&&&staticSymbol&&&=genModel.getImportedName("java.util.StringTokenizer")
//&&&staticSymbol&&&%>(literal); stringTokenizer.hasMoreTokens(); )
//&&&staticSymbol&&&      <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		for (String item : split(literal))
//&&&staticSymbol&&&      <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&      <%
if (genModel.getRuntimeVersion().getValue() < GenRuntimeVersion.EMF26_VALUE) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			String item = stringTokenizer.nextToken();
//&&&staticSymbol&&&      <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
if (genItemType.getGenPackage() == genPackage) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&        <%
if (genPackage.isDataTypeConverters()) { genItemType = genItemType.getObjectType();
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			result.add(create<%
//&&&staticSymbol&&&=genItemType.getName()
//&&&staticSymbol&&&%>(item));
//&&&staticSymbol&&&        <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			result.add(create<%
//&&&staticSymbol&&&=genItemType.getName()
//&&&staticSymbol&&&%>FromString(<%
//&&&staticSymbol&&&=genItemType.getQualifiedClassifierAccessor()
//&&&staticSymbol&&&%>, item));
//&&&staticSymbol&&&        <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&        <%
if (genItemType.getGenPackage().isDataTypeConverters()) { genItemType = genItemType.getObjectType();
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			result.add(<%
//&&&staticSymbol&&&=genItemType.getGenPackage().getQualifiedEFactoryInternalInstanceAccessor()
//&&&staticSymbol&&&%>.create<%
//&&&staticSymbol&&&=genItemType.getName()
//&&&staticSymbol&&&%>(item));
//&&&staticSymbol&&&        <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			result.add(<%
//&&&staticSymbol&&&=genItemType.getGenPackage().getQualifiedEFactoryInternalInstanceAccessor()
//&&&staticSymbol&&&%>.createFromString(<%
//&&&staticSymbol&&&=genItemType.getQualifiedClassifierAccessor()
//&&&staticSymbol&&&%>, item));
//&&&staticSymbol&&&        <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&		return result;
//&&&staticSymbol&&&    <%
} else if (!genDataType.getMemberTypes().isEmpty()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		if (literal == null) return <%
//&&&staticSymbol&&&=genDataType.getStaticValue(null)
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=genDataType.getImportedInstanceClassName()
//&&&staticSymbol&&&%> result = <%
//&&&staticSymbol&&&=genDataType.getStaticValue(null)
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&		RuntimeException exception = null;
//&&&staticSymbol&&&      <%
for (GenDataType genMemberType : genDataType.getMemberTypes()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		try
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&      <%
if (genMemberType.getGenPackage() == genPackage) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&        <%
if (genPackage.isDataTypeConverters()) { if (!genDataType.isPrimitiveType()) genMemberType = genMemberType.getObjectType();
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			result = create<%
//&&&staticSymbol&&&=genMemberType.getName()
//&&&staticSymbol&&&%>(literal);
//&&&staticSymbol&&&        <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			result = (<%
//&&&staticSymbol&&&=genDataType.getObjectInstanceClassName()
//&&&staticSymbol&&&%>)create<%
//&&&staticSymbol&&&=genMemberType.getName()
//&&&staticSymbol&&&%>FromString(<%
//&&&staticSymbol&&&=genMemberType.getQualifiedClassifierAccessor()
//&&&staticSymbol&&&%>, literal);
//&&&staticSymbol&&&        <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&        <%
if (genPackage.isDataTypeConverters()) { if (!genDataType.isPrimitiveType()) genMemberType = genMemberType.getObjectType();
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			result = <%
//&&&staticSymbol&&&=genMemberType.getGenPackage().getQualifiedEFactoryInternalInstanceAccessor()
//&&&staticSymbol&&&%>.create<%
//&&&staticSymbol&&&=genMemberType.getName()
//&&&staticSymbol&&&%>(literal);
//&&&staticSymbol&&&        <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			result = (<%
//&&&staticSymbol&&&=genDataType.getObjectInstanceClassName()
//&&&staticSymbol&&&%>)<%
//&&&staticSymbol&&&=genMemberType.getGenPackage().getQualifiedEFactoryInternalInstanceAccessor()
//&&&staticSymbol&&&%>.createFromString(<%
//&&&staticSymbol&&&=genMemberType.getQualifiedClassifierAccessor()
//&&&staticSymbol&&&%>, literal);
//&&&staticSymbol&&&        <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			if (<%
if (!genDataType.isPrimitiveType()) {
//&&&staticSymbol&&&%>result != null && <%
}
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.util.Diagnostician")
//&&&staticSymbol&&&%>.INSTANCE.validate(<%
//&&&staticSymbol&&&=eDataType
//&&&staticSymbol&&&%>, <%
if (genDataType.isPrimitiveType() && genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
//&&&staticSymbol&&&%>new <%
//&&&staticSymbol&&&=genDataType.getObjectInstanceClassName()
//&&&staticSymbol&&&%>(result)<%
} else {
//&&&staticSymbol&&&%>result<%
}
//&&&staticSymbol&&&%>, null, null))
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&				return result;
//&&&staticSymbol&&&			}
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&		catch (RuntimeException e)
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			exception = e;
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&      <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		if (<%
if (!genDataType.isPrimitiveType()) {
//&&&staticSymbol&&&%>result != null || <%
}
//&&&staticSymbol&&&%>exception == null) return result;
//&&&staticSymbol&&&    
//&&&staticSymbol&&&		throw exception;
//&&&staticSymbol&&&    <%
} else if (!genDataType.hasConversionDelegate() && genModel.useGenerics() && (genDataType.isArrayType() || !genDataType.getEcoreDataType().getETypeParameters().isEmpty() || genDataType.getEcoreDataType().getInstanceTypeName().contains("<"))) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		return (<%
//&&&staticSymbol&&&=genDataType.getImportedParameterizedObjectInstanceClassName()
//&&&staticSymbol&&&%>)super.createFromString(literal);
//&&&staticSymbol&&&    <%
} else if (!genDataType.hasConversionDelegate() && genDataType.isArrayType()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		// TODO: implement this method
//&&&staticSymbol&&&		// Ensure that you remove @generated or mark it @generated NOT
//&&&staticSymbol&&&		throw new <%
//&&&staticSymbol&&&=genModel.getImportedName("java.lang.UnsupportedOperationException")
//&&&staticSymbol&&&%>();
//&&&staticSymbol&&&    <%
} else if (genDataType.isPrimitiveType() && genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		return ((<%
//&&&staticSymbol&&&=genDataType.getObjectInstanceClassName()
//&&&staticSymbol&&&%>)super.createFromString(<%
//&&&staticSymbol&&&=eDataType
//&&&staticSymbol&&&%>, literal)).<%
//&&&staticSymbol&&&=genDataType.getPrimitiveValueFunction()
//&&&staticSymbol&&&%>();
//&&&staticSymbol&&&    <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		return <%
if (!genDataType.isObjectType()) {
//&&&staticSymbol&&&%>(<%
//&&&staticSymbol&&&=genDataType.getImportedParameterizedObjectInstanceClassName()
//&&&staticSymbol&&&%>)<%
}
//&&&staticSymbol&&&%>super.createFromString(<%
//&&&staticSymbol&&&=eDataType
//&&&staticSymbol&&&%>, literal);
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&    <%
if (!genPackage.isDataTypeConverters() && genModel.useGenerics() && genDataType.isUncheckedCast() && !genDataType.hasCreatorBody()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	@SuppressWarnings("unchecked")
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	public <%
//&&&staticSymbol&&&=genDataType.getImportedParameterizedObjectInstanceClassName()
//&&&staticSymbol&&&%> create<%
//&&&staticSymbol&&&=genDataType.getName()
//&&&staticSymbol&&&%>FromString(<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.EDataType")
//&&&staticSymbol&&&%> eDataType, String initialValue)
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&    <%
if (genDataType instanceof GenEnum) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
if (genPackage.isDataTypeConverters() || genDataType.hasCreatorBody()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		return create<%
//&&&staticSymbol&&&=genDataType.getName()
//&&&staticSymbol&&&%>(initialValue);
//&&&staticSymbol&&&      <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=((GenEnum)genDataType).getImportedInstanceClassName()
//&&&staticSymbol&&&%> result = <%
//&&&staticSymbol&&&=((GenEnum)genDataType).getImportedInstanceClassName()
//&&&staticSymbol&&&%>.get(initialValue);
//&&&staticSymbol&&&		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genModel.getNonNLS(2)
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genModel.getNonNLS(3)
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		return result;
//&&&staticSymbol&&&      <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
} else if (genDataType.getBaseType() != null) { GenDataType genBaseType = genDataType.getBaseType(); 
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
if (genBaseType.getGenPackage() == genPackage) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		return <%
if (!genDataType.getObjectInstanceClassName().equals(genBaseType.getObjectInstanceClassName())) {
//&&&staticSymbol&&&%>(<%
//&&&staticSymbol&&&=genDataType.getObjectInstanceClassName()
//&&&staticSymbol&&&%>)<%
}
//&&&staticSymbol&&&%>create<%
//&&&staticSymbol&&&=genBaseType.getName()
//&&&staticSymbol&&&%>FromString(<%
//&&&staticSymbol&&&=genBaseType.getQualifiedClassifierAccessor()
//&&&staticSymbol&&&%>, initialValue);
//&&&staticSymbol&&&      <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		return <%
if (!genDataType.isObjectType()) {
//&&&staticSymbol&&&%>(<%
//&&&staticSymbol&&&=genDataType.getObjectInstanceClassName()
//&&&staticSymbol&&&%>)<%
}
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genBaseType.getGenPackage().getQualifiedEFactoryInternalInstanceAccessor()
//&&&staticSymbol&&&%>.createFromString(<%
//&&&staticSymbol&&&=genBaseType.getQualifiedClassifierAccessor()
//&&&staticSymbol&&&%>, initialValue);
//&&&staticSymbol&&&      <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
} else if (genDataType.getItemType() != null) { GenDataType genItemType = genDataType.getItemType(); 
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
if (genPackage.isDataTypeConverters()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		return create<%
//&&&staticSymbol&&&=genDataType.getName()
//&&&staticSymbol&&&%>(initialValue);
//&&&staticSymbol&&&      <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		if (initialValue == null) return null;
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=genDataType.getImportedParameterizedObjectInstanceClassName()
//&&&staticSymbol&&&%> result = new <%
//&&&staticSymbol&&&=genModel.getImportedName("java.util.ArrayList")
//&&&staticSymbol&&&%><%
if (genModel.useGenerics()) {
//&&&staticSymbol&&&%><<%=genItemType.getObjectType().getImportedParameterizedInstanceClassName()%>><%
}
//&&&staticSymbol&&&%>();
//&&&staticSymbol&&&        <%
if (genModel.getRuntimeVersion().getValue() < GenRuntimeVersion.EMF26_VALUE) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		for (<%
//&&&staticSymbol&&&=genModel.getImportedName("java.util.StringTokenizer")
//&&&staticSymbol&&&%> stringTokenizer = new <%
//&&&staticSymbol&&&=genModel.getImportedName("java.util.StringTokenizer")
//&&&staticSymbol&&&%>(initialValue); stringTokenizer.hasMoreTokens(); )
//&&&staticSymbol&&&        <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		for (String item : split(initialValue))
//&&&staticSymbol&&&        <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&        <%
if (genModel.getRuntimeVersion().getValue() < GenRuntimeVersion.EMF26_VALUE) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			String item = stringTokenizer.nextToken();
//&&&staticSymbol&&&        <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
if (genItemType.getGenPackage() == genPackage) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			result.add(create<%
//&&&staticSymbol&&&=genItemType.getName()
//&&&staticSymbol&&&%>FromString(<%
//&&&staticSymbol&&&=genItemType.getQualifiedClassifierAccessor()
//&&&staticSymbol&&&%>, item));
//&&&staticSymbol&&&      <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			result.add(<%
if (!genItemType.isObjectType()) {
//&&&staticSymbol&&&%>(<%
//&&&staticSymbol&&&=genItemType.getObjectInstanceClassName()
//&&&staticSymbol&&&%>)<%
}
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genItemType.getGenPackage().getQualifiedEFactoryInternalInstanceAccessor()
//&&&staticSymbol&&&%>.createFromString(<%
//&&&staticSymbol&&&=genItemType.getQualifiedClassifierAccessor()
//&&&staticSymbol&&&%>, item));
//&&&staticSymbol&&&      <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&		return result;
//&&&staticSymbol&&&      <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
} else if (!genDataType.getMemberTypes().isEmpty()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
if (genPackage.isDataTypeConverters()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&        <%
if (genDataType.isPrimitiveType() && genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		return new <%
//&&&staticSymbol&&&=genDataType.getObjectInstanceClassName()
//&&&staticSymbol&&&%>(create<%
//&&&staticSymbol&&&=genDataType.getName()
//&&&staticSymbol&&&%>(initialValue));
//&&&staticSymbol&&&        <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		return create<%
//&&&staticSymbol&&&=genDataType.getName()
//&&&staticSymbol&&&%>(initialValue);
//&&&staticSymbol&&&        <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		if (initialValue == null) return null;
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=genDataType.getObjectInstanceClassName()
//&&&staticSymbol&&&%> result = null;
//&&&staticSymbol&&&		RuntimeException exception = null;
//&&&staticSymbol&&&      <%
for (GenDataType genMemberType : genDataType.getMemberTypes()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		try
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&      <%
if (genMemberType.getGenPackage() == genPackage) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			result = <%
if (!genDataType.isObjectType() && !genDataType.getObjectInstanceClassName().equals(genMemberType.getObjectInstanceClassName())) {
//&&&staticSymbol&&&%>(<%
//&&&staticSymbol&&&=genDataType.getObjectInstanceClassName()
//&&&staticSymbol&&&%>)<%
}
//&&&staticSymbol&&&%>create<%
//&&&staticSymbol&&&=genMemberType.getName()
//&&&staticSymbol&&&%>FromString(<%
//&&&staticSymbol&&&=genMemberType.getQualifiedClassifierAccessor()
//&&&staticSymbol&&&%>, initialValue);
//&&&staticSymbol&&&      <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			result = <%
if (!genDataType.isObjectType()) {
//&&&staticSymbol&&&%>(<%
//&&&staticSymbol&&&=genDataType.getObjectInstanceClassName()
//&&&staticSymbol&&&%>)<%
}
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genMemberType.getGenPackage().getQualifiedEFactoryInternalInstanceAccessor()
//&&&staticSymbol&&&%>.createFromString(<%
//&&&staticSymbol&&&=genMemberType.getQualifiedClassifierAccessor()
//&&&staticSymbol&&&%>, initialValue);
//&&&staticSymbol&&&      <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			if (result != null && <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.util.Diagnostician")
//&&&staticSymbol&&&%>.INSTANCE.validate(eDataType, result, null, null))
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&				return result;
//&&&staticSymbol&&&			}
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&		catch (RuntimeException e)
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			exception = e;
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&      <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		if (result != null || exception == null) return result;
//&&&staticSymbol&&&    
//&&&staticSymbol&&&		throw exception;
//&&&staticSymbol&&&      <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
} else if (genPackage.isDataTypeConverters() || genDataType.hasCreatorBody()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		return create<%
//&&&staticSymbol&&&=genDataType.getName()
//&&&staticSymbol&&&%>(initialValue);
//&&&staticSymbol&&&    <%
} else if (!genDataType.hasConversionDelegate() && genModel.useGenerics() && (genDataType.isArrayType() || !genDataType.getEcoreDataType().getETypeParameters().isEmpty() || genDataType.getEcoreDataType().getInstanceTypeName().contains("<"))) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		return <%
if (!genDataType.isObjectType()) {
//&&&staticSymbol&&&%>(<%
//&&&staticSymbol&&&=genDataType.getImportedParameterizedObjectInstanceClassName()
//&&&staticSymbol&&&%>)<%
}
//&&&staticSymbol&&&%>super.createFromString(initialValue);
//&&&staticSymbol&&&    <%
} else if (!genDataType.hasConversionDelegate() && genDataType.isArrayType()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		// TODO: implement this method
//&&&staticSymbol&&&		// Ensure that you remove @generated or mark it @generated NOT
//&&&staticSymbol&&&		throw new <%
//&&&staticSymbol&&&=genModel.getImportedName("java.lang.UnsupportedOperationException")
//&&&staticSymbol&&&%>();
//&&&staticSymbol&&&    <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		return <%
if (!genDataType.isObjectType()) {
//&&&staticSymbol&&&%>(<%
//&&&staticSymbol&&&=genDataType.getImportedParameterizedObjectInstanceClassName()
//&&&staticSymbol&&&%>)<%
}
//&&&staticSymbol&&&%>super.createFromString(eDataType, initialValue);
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
if (genPackage.isDataTypeConverters() || genDataType.hasConverterBody()) { String eDataType = genDataType.getQualifiedClassifierAccessor();
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	public String convert<%
//&&&staticSymbol&&&=genDataType.getName()
//&&&staticSymbol&&&%>(<%
if (genDataType.hasCreatorBody()) {
//&&&staticSymbol&&&%>final <%
}
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genDataType.getImportedBoundedWildcardInstanceClassName()
//&&&staticSymbol&&&%> <%
if (genDataType.hasConverterBody()) {
//&&&staticSymbol&&&%>it<%
} else {
//&&&staticSymbol&&&%>instanceValue<%
}
//&&&staticSymbol&&&%>)
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&    <%
if (genDataType.hasConverterBody()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=genDataType.getConverterBody(genModel.getIndentation(stringBuffer))
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
} else if (genDataType instanceof GenEnum) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		return instanceValue == null ? null : instanceValue.toString();
//&&&staticSymbol&&&    <%
} else if (genDataType.getBaseType() != null) { GenDataType genBaseType = genDataType.getBaseType(); boolean isPrimitiveConversion = !genDataType.isPrimitiveType() && genBaseType.isPrimitiveType();
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
if (genBaseType.getGenPackage() == genPackage) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&        <%
if (isPrimitiveConversion) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		return instanceValue == null ? null : convert<%
//&&&staticSymbol&&&=genBaseType.getName()
//&&&staticSymbol&&&%>(instanceValue<%
if (genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
//&&&staticSymbol&&&%>.<%
//&&&staticSymbol&&&=genBaseType.getPrimitiveValueFunction()
//&&&staticSymbol&&&%>()<%
}
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&        <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		return convert<%
//&&&staticSymbol&&&=genBaseType.getName()
//&&&staticSymbol&&&%>(instanceValue);
//&&&staticSymbol&&&        <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
} else if (genBaseType.getGenPackage().isDataTypeConverters()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		return <%
//&&&staticSymbol&&&=genBaseType.getGenPackage().getQualifiedFactoryInstanceAccessor()
//&&&staticSymbol&&&%>.convert<%
//&&&staticSymbol&&&=genBaseType.getName()
//&&&staticSymbol&&&%>(instanceValue);
//&&&staticSymbol&&&      <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		return <%
//&&&staticSymbol&&&=genBaseType.getGenPackage().getQualifiedEFactoryInternalInstanceAccessor()
//&&&staticSymbol&&&%>.convertToString(<%
//&&&staticSymbol&&&=genBaseType.getQualifiedClassifierAccessor()
//&&&staticSymbol&&&%>, instanceValue);
//&&&staticSymbol&&&      <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
} else if (genDataType.getItemType() != null) { GenDataType genItemType = genDataType.getItemType(); 
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		if (instanceValue == null) return null;
//&&&staticSymbol&&&		if (instanceValue.isEmpty()) return "";
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=genModel.getImportedName("java.lang.StringBuffer")
//&&&staticSymbol&&&%> result = new <%
//&&&staticSymbol&&&=genModel.getImportedName("java.lang.StringBuffer")
//&&&staticSymbol&&&%>();
//&&&staticSymbol&&&        <%
String item; if (!genModel.useGenerics()) { item = "i.next()"; 
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		for (<%
//&&&staticSymbol&&&=genModel.getImportedName("java.util.Iterator")
//&&&staticSymbol&&&%> i = instanceValue.iterator(); i.hasNext(); )
//&&&staticSymbol&&&        <%
} else { item = "item";
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		for (<%
//&&&staticSymbol&&&=genModel.getImportedName("java.lang.Object")
//&&&staticSymbol&&&%> item : instanceValue)
//&&&staticSymbol&&&        <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&      <%
if (genItemType.getGenPackage() == genPackage) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&        <%
if (genPackage.isDataTypeConverters()) { genItemType = genItemType.getObjectType();
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			result.append(convert<%
//&&&staticSymbol&&&=genItemType.getName()
//&&&staticSymbol&&&%>((<%
//&&&staticSymbol&&&=genItemType.getObjectInstanceClassName()
//&&&staticSymbol&&&%>)<%
//&&&staticSymbol&&&=item
//&&&staticSymbol&&&%>));
//&&&staticSymbol&&&        <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			result.append(convert<%
//&&&staticSymbol&&&=genItemType.getName()
//&&&staticSymbol&&&%>ToString(<%
//&&&staticSymbol&&&=genItemType.getQualifiedClassifierAccessor()
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=item
//&&&staticSymbol&&&%>));
//&&&staticSymbol&&&        <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&        <%
if (genItemType.getGenPackage().isDataTypeConverters()) { genItemType = genItemType.getObjectType();
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			result.append(<%
//&&&staticSymbol&&&=genItemType.getGenPackage().getQualifiedEFactoryInternalInstanceAccessor()
//&&&staticSymbol&&&%>.convert<%
//&&&staticSymbol&&&=genItemType.getName()
//&&&staticSymbol&&&%>((<%
//&&&staticSymbol&&&=genItemType.getObjectInstanceClassName()
//&&&staticSymbol&&&%>)<%
//&&&staticSymbol&&&=item
//&&&staticSymbol&&&%>));
//&&&staticSymbol&&&        <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			result.append(<%
//&&&staticSymbol&&&=genItemType.getGenPackage().getQualifiedEFactoryInternalInstanceAccessor()
//&&&staticSymbol&&&%>.convertToString(<%
//&&&staticSymbol&&&=genItemType.getQualifiedClassifierAccessor()
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=item
//&&&staticSymbol&&&%>));
//&&&staticSymbol&&&        <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			result.append(' ');
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&		return result.substring(0, result.length() - 1);
//&&&staticSymbol&&&    <%
} else if (!genDataType.getMemberTypes().isEmpty()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
if (!genDataType.isPrimitiveType()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		if (instanceValue == null) return null;
//&&&staticSymbol&&&        <%
for (GenDataType genMemberType : genDataType.getMemberTypes()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		if (<%
//&&&staticSymbol&&&=genMemberType.getQualifiedClassifierAccessor()
//&&&staticSymbol&&&%>.isInstance(instanceValue))
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			try
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&          <%
if (genMemberType.getGenPackage() == genPackage) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&            <%
if (genPackage.isDataTypeConverters()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&              <%
if (genMemberType.getQualifiedInstanceClassName().equals(genDataType.getQualifiedInstanceClassName())) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				String value = convert<%
//&&&staticSymbol&&&=genMemberType.getName()
//&&&staticSymbol&&&%>(instanceValue);
//&&&staticSymbol&&&              <%
} else if (genMemberType.isPrimitiveType() && genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				String value = convert<%
//&&&staticSymbol&&&=genMemberType.getName()
//&&&staticSymbol&&&%>(((<%
//&&&staticSymbol&&&=genMemberType.getObjectType().getImportedInstanceClassName()
//&&&staticSymbol&&&%>)instanceValue).<%
//&&&staticSymbol&&&=genMemberType.getPrimitiveValueFunction()
//&&&staticSymbol&&&%>());
//&&&staticSymbol&&&              <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				String value = convert<%
//&&&staticSymbol&&&=genMemberType.getName()
//&&&staticSymbol&&&%>((<%
//&&&staticSymbol&&&=genMemberType.getObjectType().getImportedBoundedWildcardInstanceClassName()
//&&&staticSymbol&&&%>)instanceValue);
//&&&staticSymbol&&&              <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&            <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				String value = convert<%
//&&&staticSymbol&&&=genMemberType.getName()
//&&&staticSymbol&&&%>ToString(<%
//&&&staticSymbol&&&=genMemberType.getQualifiedClassifierAccessor()
//&&&staticSymbol&&&%>, instanceValue);
//&&&staticSymbol&&&            <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&          <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&            <%
if (genMemberType.getGenPackage().isDataTypeConverters()) { genMemberType = genMemberType.getObjectType();
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				String value = <%
//&&&staticSymbol&&&=genMemberType.getGenPackage().getQualifiedEFactoryInternalInstanceAccessor()
//&&&staticSymbol&&&%>.convert<%
//&&&staticSymbol&&&=genMemberType.getName()
//&&&staticSymbol&&&%>((<%
//&&&staticSymbol&&&=genMemberType.getObjectInstanceClassName()
//&&&staticSymbol&&&%>)instanceValue);
//&&&staticSymbol&&&            <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				String value = <%
//&&&staticSymbol&&&=genMemberType.getGenPackage().getQualifiedEFactoryInternalInstanceAccessor()
//&&&staticSymbol&&&%>.convertToString(<%
//&&&staticSymbol&&&=genMemberType.getQualifiedClassifierAccessor()
//&&&staticSymbol&&&%>, instanceValue);
//&&&staticSymbol&&&            <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&          <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				if (value != null) return value;
//&&&staticSymbol&&&			}
//&&&staticSymbol&&&			catch (Exception e)
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&				// Keep trying other member types until all have failed.
//&&&staticSymbol&&&			}
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&        <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&        <%
for (GenDataType genMemberType : genDataType.getMemberTypes()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		try
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&          <%
if (genMemberType.getGenPackage() == genPackage) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&            <%
if (genPackage.isDataTypeConverters()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			String value = convert<%
//&&&staticSymbol&&&=genMemberType.getName()
//&&&staticSymbol&&&%>(instanceValue);
//&&&staticSymbol&&&            <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			String value = convert<%
//&&&staticSymbol&&&=genMemberType.getName()
//&&&staticSymbol&&&%>ToString(<%
//&&&staticSymbol&&&=genMemberType.getQualifiedClassifierAccessor()
//&&&staticSymbol&&&%>, <%
if (genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
//&&&staticSymbol&&&%>new <%
//&&&staticSymbol&&&=genMemberType.getObjectInstanceClassName()
//&&&staticSymbol&&&%>(instanceValue)<%
} else {
//&&&staticSymbol&&&%>instanceValue<%
}
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&            <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&          <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&            <%
if (genMemberType.getGenPackage().isDataTypeConverters()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			String value = <%
//&&&staticSymbol&&&=genMemberType.getGenPackage().getQualifiedEFactoryInternalInstanceAccessor()
//&&&staticSymbol&&&%>.convert<%
//&&&staticSymbol&&&=genMemberType.getName()
//&&&staticSymbol&&&%>(instanceValue);
//&&&staticSymbol&&&            <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			String value = <%
//&&&staticSymbol&&&=genMemberType.getGenPackage().getQualifiedEFactoryInternalInstanceAccessor()
//&&&staticSymbol&&&%>.convertToString(<%
//&&&staticSymbol&&&=genMemberType.getQualifiedClassifierAccessor()
//&&&staticSymbol&&&%>, <%
if (genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
//&&&staticSymbol&&&%>new <%
//&&&staticSymbol&&&=genMemberType.getObjectInstanceClassName()
//&&&staticSymbol&&&%>(instanceValue)<%
} else {
//&&&staticSymbol&&&%>instanceValue<%
}
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&            <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&          <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			if (value != null) return value;
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&		catch (Exception e)
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			// Keep trying other member types until all have failed.
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&        <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+<%
//&&&staticSymbol&&&=eDataType
//&&&staticSymbol&&&%>.getName());
//&&&staticSymbol&&&    <%
} else if (!genDataType.hasConversionDelegate() && genModel.useGenerics() && (genDataType.isArrayType() || !genDataType.getEcoreDataType().getETypeParameters().isEmpty() || genDataType.getEcoreDataType().getInstanceTypeName().contains("<"))) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		return super.convertToString(instanceValue);
//&&&staticSymbol&&&    <%
} else if (!genDataType.hasConversionDelegate() && genDataType.isArrayType()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		// TODO: implement this method
//&&&staticSymbol&&&		// Ensure that you remove @generated or mark it @generated NOT
//&&&staticSymbol&&&		throw new <%
//&&&staticSymbol&&&=genModel.getImportedName("java.lang.UnsupportedOperationException")
//&&&staticSymbol&&&%>();
//&&&staticSymbol&&&    <%
} else if (genDataType.isPrimitiveType() && genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		return super.convertToString(<%
//&&&staticSymbol&&&=eDataType
//&&&staticSymbol&&&%>, new <%
//&&&staticSymbol&&&=genDataType.getObjectInstanceClassName()
//&&&staticSymbol&&&%>(instanceValue));
//&&&staticSymbol&&&    <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		return super.convertToString(<%
//&&&staticSymbol&&&=eDataType
//&&&staticSymbol&&&%>, instanceValue);
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&    <%
if (genModel.useGenerics() && (genDataType.getItemType() != null || genDataType.isUncheckedCast()) && (genPackage.isDataTypeConverters() || genDataType.hasCreatorBody())) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	@SuppressWarnings("unchecked")
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	public String convert<%
//&&&staticSymbol&&&=genDataType.getName()
//&&&staticSymbol&&&%>ToString(<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.EDataType")
//&&&staticSymbol&&&%> eDataType, Object instanceValue)
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&    <%
if (genDataType instanceof GenEnum) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
if (genPackage.isDataTypeConverters() || genDataType.hasConverterBody()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		return convert<%
//&&&staticSymbol&&&=genDataType.getName()
//&&&staticSymbol&&&%>((<%
//&&&staticSymbol&&&=genDataType.getImportedInstanceClassName()
//&&&staticSymbol&&&%>)instanceValue);
//&&&staticSymbol&&&      <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		return instanceValue == null ? null : instanceValue.toString();
//&&&staticSymbol&&&      <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
} else if (genDataType.getBaseType() != null) { GenDataType genBaseType = genDataType.getBaseType(); 
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
if (genBaseType.getGenPackage() == genPackage) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		return convert<%
//&&&staticSymbol&&&=genBaseType.getName()
//&&&staticSymbol&&&%>ToString(<%
//&&&staticSymbol&&&=genBaseType.getQualifiedClassifierAccessor()
//&&&staticSymbol&&&%>, instanceValue);
//&&&staticSymbol&&&      <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		return <%
//&&&staticSymbol&&&=genBaseType.getGenPackage().getQualifiedEFactoryInternalInstanceAccessor()
//&&&staticSymbol&&&%>.convertToString(<%
//&&&staticSymbol&&&=genBaseType.getQualifiedClassifierAccessor()
//&&&staticSymbol&&&%>, instanceValue);
//&&&staticSymbol&&&      <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
} else if (genDataType.getItemType() != null) { GenDataType genItemType = genDataType.getItemType(); 
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
if (genPackage.isDataTypeConverters() || genDataType.hasCreatorBody()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		return convert<%
//&&&staticSymbol&&&=genDataType.getName()
//&&&staticSymbol&&&%>((<%
//&&&staticSymbol&&&=genDataType.getImportedBoundedWildcardInstanceClassName()
//&&&staticSymbol&&&%>)instanceValue);
//&&&staticSymbol&&&      <%
} else { final String singleWildcard = genModel.useGenerics() ? "<?>" : "";
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		if (instanceValue == null) return null;
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=genModel.getImportedName("java.util.List")
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=singleWildcard
//&&&staticSymbol&&&%> list = (<%
//&&&staticSymbol&&&=genModel.getImportedName("java.util.List")
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=singleWildcard
//&&&staticSymbol&&&%>)instanceValue;
//&&&staticSymbol&&&		if (list.isEmpty()) return "";
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=genModel.getImportedName("java.lang.StringBuffer")
//&&&staticSymbol&&&%> result = new <%
//&&&staticSymbol&&&=genModel.getImportedName("java.lang.StringBuffer")
//&&&staticSymbol&&&%>();
//&&&staticSymbol&&&        <%
String item; if (!genModel.useGenerics()) { item = "i.next()"; 
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		for (<%
//&&&staticSymbol&&&=genModel.getImportedName("java.util.Iterator")
//&&&staticSymbol&&&%> i = list.iterator(); i.hasNext(); )
//&&&staticSymbol&&&        <%
} else { item = "item";
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		for (<%
//&&&staticSymbol&&&=genModel.getImportedName("java.lang.Object")
//&&&staticSymbol&&&%> item : list)
//&&&staticSymbol&&&        <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&        <%
if (genItemType.getGenPackage() == genPackage) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			result.append(convert<%
//&&&staticSymbol&&&=genItemType.getName()
//&&&staticSymbol&&&%>ToString(<%
//&&&staticSymbol&&&=genItemType.getQualifiedClassifierAccessor()
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=item
//&&&staticSymbol&&&%>));
//&&&staticSymbol&&&        <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			result.append(<%
//&&&staticSymbol&&&=genItemType.getGenPackage().getQualifiedEFactoryInternalInstanceAccessor()
//&&&staticSymbol&&&%>.convertToString(<%
//&&&staticSymbol&&&=genItemType.getQualifiedClassifierAccessor()
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=item
//&&&staticSymbol&&&%>));
//&&&staticSymbol&&&        <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			result.append(' ');
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&		return result.substring(0, result.length() - 1);
//&&&staticSymbol&&&      <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
} else if (!genDataType.getMemberTypes().isEmpty()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
if (genPackage.isDataTypeConverters() || genDataType.hasConverterBody()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&        <%
if (genDataType.isPrimitiveType()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		return instanceValue == null ? null : convert<%
//&&&staticSymbol&&&=genDataType.getName()
//&&&staticSymbol&&&%>(((<%
//&&&staticSymbol&&&=genDataType.getObjectInstanceClassName()
//&&&staticSymbol&&&%>)instanceValue)<%
if (genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
//&&&staticSymbol&&&%>.<%
//&&&staticSymbol&&&=genDataType.getPrimitiveValueFunction()
//&&&staticSymbol&&&%>()<%
}
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&        <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		return convert<%
//&&&staticSymbol&&&=genDataType.getName()
//&&&staticSymbol&&&%>(instanceValue);
//&&&staticSymbol&&&        <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		if (instanceValue == null) return null;
//&&&staticSymbol&&&        <%
for (GenDataType genMemberType : genDataType.getMemberTypes()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		if (<%
//&&&staticSymbol&&&=genMemberType.getQualifiedClassifierAccessor()
//&&&staticSymbol&&&%>.isInstance(instanceValue))
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			try
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&        <%
if (genMemberType.getGenPackage() == genPackage) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				String value = convert<%
//&&&staticSymbol&&&=genMemberType.getName()
//&&&staticSymbol&&&%>ToString(<%
//&&&staticSymbol&&&=genMemberType.getQualifiedClassifierAccessor()
//&&&staticSymbol&&&%>, instanceValue);
//&&&staticSymbol&&&        <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				String value = <%
//&&&staticSymbol&&&=genMemberType.getGenPackage().getQualifiedEFactoryInternalInstanceAccessor()
//&&&staticSymbol&&&%>.convertToString(<%
//&&&staticSymbol&&&=genMemberType.getQualifiedClassifierAccessor()
//&&&staticSymbol&&&%>, instanceValue);
//&&&staticSymbol&&&        <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				if (value != null) return value;
//&&&staticSymbol&&&			}
//&&&staticSymbol&&&			catch (Exception e)
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&				// Keep trying other member types until all have failed.
//&&&staticSymbol&&&			}
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&        <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
//&&&staticSymbol&&&      <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
} else if (genPackage.isDataTypeConverters() || genDataType.hasConverterBody()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&        <%
if (genDataType.isPrimitiveType()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		return instanceValue == null ? null : convert<%
//&&&staticSymbol&&&=genDataType.getName()
//&&&staticSymbol&&&%>(<%
if (genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
//&&&staticSymbol&&&%>(<%
}
//&&&staticSymbol&&&%>(<%
//&&&staticSymbol&&&=genDataType.getObjectInstanceClassName()
//&&&staticSymbol&&&%>)instanceValue<%
if (genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
//&&&staticSymbol&&&%>).<%
//&&&staticSymbol&&&=genDataType.getPrimitiveValueFunction()
//&&&staticSymbol&&&%>()<%
}
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&        <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		return convert<%
//&&&staticSymbol&&&=genDataType.getName()
//&&&staticSymbol&&&%>((<%
//&&&staticSymbol&&&=genDataType.getImportedBoundedWildcardInstanceClassName()
//&&&staticSymbol&&&%>)instanceValue);
//&&&staticSymbol&&&        <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
} else if (!genDataType.hasConversionDelegate() && genModel.useGenerics() && (genDataType.isArrayType() || !genDataType.getEcoreDataType().getETypeParameters().isEmpty() || genDataType.getEcoreDataType().getInstanceTypeName().contains("<"))) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		return super.convertToString(instanceValue);
//&&&staticSymbol&&&    <%
} else if (!genDataType.hasConversionDelegate() && genDataType.isArrayType()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		// TODO: implement this method
//&&&staticSymbol&&&		// Ensure that you remove @generated or mark it @generated NOT
//&&&staticSymbol&&&		throw new <%
//&&&staticSymbol&&&=genModel.getImportedName("java.lang.UnsupportedOperationException")
//&&&staticSymbol&&&%>();
//&&&staticSymbol&&&    <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		return super.convertToString(eDataType, instanceValue);
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
for (GenClass genClass : genPackage.getGenClasses()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
if (genClass.hasFactoryInterfaceCreateMethod()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * Returns a new object of class '<em><%
//&&&staticSymbol&&&=genClass.getFormattedName()
//&&&staticSymbol&&&%></em>'.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @return a new object of class '<em><%
//&&&staticSymbol&&&=genClass.getFormattedName()
//&&&staticSymbol&&&%></em>'.
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	<%
//&&&staticSymbol&&&=genClass.getTypeParameters()
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genClass.getImportedInterfaceName()
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genClass.getInterfaceTypeArguments()
//&&&staticSymbol&&&%> create<%
//&&&staticSymbol&&&=genClass.getName()
//&&&staticSymbol&&&%>();
//&&&staticSymbol&&&
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
if (genPackage.isDataTypeConverters()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
for (GenDataType genDataType : genPackage.getAllGenDataTypes()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
if (genDataType.isSerializable()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * Returns an instance of data type '<em><%
//&&&staticSymbol&&&=genDataType.getFormattedName()
//&&&staticSymbol&&&%></em>' corresponding the given literal.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @param literal a literal of the data type.
//&&&staticSymbol&&&	 * @return a new instance value of the data type.
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	<%
//&&&staticSymbol&&&=genDataType.getImportedParameterizedInstanceClassName()
//&&&staticSymbol&&&%> create<%
//&&&staticSymbol&&&=genDataType.getName()
//&&&staticSymbol&&&%>(String literal);
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * Returns a literal representation of an instance of data type '<em><%
//&&&staticSymbol&&&=genDataType.getFormattedName()
//&&&staticSymbol&&&%></em>'.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @param instanceValue an instance value of the data type.
//&&&staticSymbol&&&	 * @return a literal representation of the instance value.
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	String convert<%
//&&&staticSymbol&&&=genDataType.getName()
//&&&staticSymbol&&&%>(<%
//&&&staticSymbol&&&=genDataType.getImportedBoundedWildcardInstanceClassName()
//&&&staticSymbol&&&%> instanceValue);
//&&&staticSymbol&&&
//&&&staticSymbol&&&      <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
if (!isImplementation && !genModel.isSuppressEMFMetaData()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * Returns the package supported by this factory.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @return the package supported by this factory.
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	<%
//&&&staticSymbol&&&=genPackage.getPackageInterfaceName()
//&&&staticSymbol&&&%> get<%
//&&&staticSymbol&&&=genPackage.getBasicPackageName()
//&&&staticSymbol&&&%>();
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
} else if (isImplementation) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	public <%
//&&&staticSymbol&&&=genPackage.getImportedPackageInterfaceName()
//&&&staticSymbol&&&%> get<%
//&&&staticSymbol&&&=genPackage.getBasicPackageName()
//&&&staticSymbol&&&%>()
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		return (<%
//&&&staticSymbol&&&=genPackage.getImportedPackageInterfaceName()
//&&&staticSymbol&&&%>)getEPackage();
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @deprecated
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&  <%
if (genModel.useClassOverrideAnnotation()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	@Deprecated
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	public static <%
//&&&staticSymbol&&&=genPackage.getImportedPackageInterfaceName()
//&&&staticSymbol&&&%> getPackage()
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		return <%
//&&&staticSymbol&&&=genPackage.getImportedPackageInterfaceName()
//&&&staticSymbol&&&%>.eINSTANCE;
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&} //<%
//&&&staticSymbol&&&*%%storeSymbol%%*1
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
genModel.emitSortedImports();
//&&&staticSymbol&&&%>

}
}