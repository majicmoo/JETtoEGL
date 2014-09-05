class Class {
public static void main (String[] args) {
//&&&staticSymbol&&&<%import java.util.*;%>
//&&&staticSymbol&&&<%import org.eclipse.emf.codegen.ecore.genmodel.*;%>
//&&&staticSymbol&&&<%import org.eclipse.emf.codegen.util.CodeGenUtil;%>
//&&&staticSymbol&&&<%

/**
 * Copyright (c) 2002-2011 IBM Corporation and others.
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
final GenClass genClass = (GenClass)((Object[])argument)[0]; final GenPackage genPackage = genClass.getGenPackage(); final GenModel genModel=genPackage.getGenModel();
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
final boolean isJDK50 = genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50;
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
final boolean isInterface = Boolean.TRUE.equals(((Object[])argument)[1]); final boolean isImplementation = Boolean.TRUE.equals(((Object[])argument)[2]);
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
final boolean isGWT = genModel.getRuntimePlatform() == GenRuntimePlatform.GWT;
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
final String publicStaticFinalFlag = isImplementation ? "public static final " : "";
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
final String singleWildcard = isJDK50 ? "<?>" : "";
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
final String negativeOffsetCorrection = genClass.hasOffsetCorrection() ? " - " + genClass.getOffsetCorrectionField(null) : "";
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
final String positiveOffsetCorrection = genClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(null) : "";
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
final String negativeOperationOffsetCorrection = genClass.hasOffsetCorrection() ? " - EOPERATION_OFFSET_CORRECTION" : "";
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
final String positiveOperationOffsetCorrection = genClass.hasOffsetCorrection() ? " + EOPERATION_OFFSET_CORRECTION" : "";
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%include("../Header.javajetinc");%>
//&&&staticSymbol&&&<%
if (isInterface) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&package <%
//&&&staticSymbol&&&=genPackage.getInterfacePackageName()
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
genModel.markImportLocation(stringBuffer, genPackage);
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
if (isImplementation) { genClass.addClassPsuedoImports(); }
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
if (isInterface) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&/**
//&&&staticSymbol&&& * <!-- begin-user-doc -->
//&&&staticSymbol&&& * A representation of the model object '<em><b><%
//&&&staticSymbol&&&=genClass.getFormattedName()
//&&&staticSymbol&&&%></b></em>'.
//&&&staticSymbol&&& * <!-- end-user-doc -->
//&&&staticSymbol&&&<%
if (genClass.hasDocumentation()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&& *
//&&&staticSymbol&&& * <!-- begin-model-doc -->
//&&&staticSymbol&&& * <%
//&&&staticSymbol&&&=genClass.getDocumentation(genModel.getIndentation(stringBuffer))
//&&&staticSymbol&&&%>
//&&&staticSymbol&&& * <!-- end-model-doc -->
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&& *
//&&&staticSymbol&&&<%
if (!genClass.getGenFeatures().isEmpty()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&& * <p>
//&&&staticSymbol&&& * The following features are supported:
//&&&staticSymbol&&& * <ul>
//&&&staticSymbol&&&<%
for (GenFeature genFeature : genClass.getGenFeatures()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
if (!genFeature.isSuppressedGetVisibility()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&& *   <li>{@link <%
//&&&staticSymbol&&&=genClass.getQualifiedInterfaceName()
//&&&staticSymbol&&&%>#<%
//&&&staticSymbol&&&=genFeature.getGetAccessor()
//&&&staticSymbol&&&%> <em><%
//&&&staticSymbol&&&=genFeature.getFormattedName()
//&&&staticSymbol&&&%></em>}</li>
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&& * </ul>
//&&&staticSymbol&&& * </p>
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&& *
//&&&staticSymbol&&&<%
if (!genModel.isSuppressEMFMetaData()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&& * @see <%
//&&&staticSymbol&&&=genPackage.getQualifiedPackageInterfaceName()
//&&&staticSymbol&&&%>#get<%
//&&&staticSymbol&&&=genClass.getClassifierAccessorName()
//&&&staticSymbol&&&%>()
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
if (!genModel.isSuppressEMFModelTags()) { boolean first = true; for (StringTokenizer stringTokenizer = new StringTokenizer(genClass.getModelInfo(), "\n\r"); stringTokenizer.hasMoreTokens(); ) { String modelInfo = stringTokenizer.nextToken(); if (first) { first = false;
//&&&staticSymbol&&&%>
//&&&staticSymbol&&& * @model <%
//&&&staticSymbol&&&=modelInfo
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&& *        <%
//&&&staticSymbol&&&=modelInfo
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
}} if (first) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&& * @model
//&&&staticSymbol&&&<%
}}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
if (genClass.needsRootExtendsInterfaceExtendsTag()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&& * @extends <%
//&&&staticSymbol&&&=genModel.getImportedName(genModel.getRootExtendsInterface())
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
//&&&staticSymbol&&& * An implementation of the model object '<em><b><%
//&&&staticSymbol&&&=genClass.getFormattedName()
//&&&staticSymbol&&&%></b></em>'.
//&&&staticSymbol&&& * <!-- end-user-doc -->
//&&&staticSymbol&&& * <p>
//&&&staticSymbol&&&<%
if (!genClass.getImplementedGenFeatures().isEmpty()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&& * The following features are implemented:
//&&&staticSymbol&&& * <ul>
//&&&staticSymbol&&&<%
for (GenFeature genFeature : genClass.getImplementedGenFeatures()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&& *   <li>{@link <%
//&&&staticSymbol&&&=genClass.getQualifiedClassName()
//&&&staticSymbol&&&%>#<%
//&&&staticSymbol&&&=genFeature.getGetAccessor()
//&&&staticSymbol&&&%> <em><%
//&&&staticSymbol&&&=genFeature.getFormattedName()
//&&&staticSymbol&&&%></em>}</li>
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&& * </ul>
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&& * </p>
//&&&staticSymbol&&& *
//&&&staticSymbol&&& * @generated
//&&&staticSymbol&&& */
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
if (isImplementation) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&public<%
if (genClass.isAbstract()) {
//&&&staticSymbol&&&%> abstract<%
}
//&&&staticSymbol&&&%> class <%
//&&&staticSymbol&&&=genClass.getClassName()
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genClass.getTypeParameters().trim()
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genClass.getClassExtends()
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genClass.getClassImplements()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&public interface <%
//&&&staticSymbol&&&=genClass.getInterfaceName()
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genClass.getTypeParameters().trim()
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genClass.getInterfaceExtends()
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
if (isImplementation && genModel.getDriverNumber() != null) {
//&&&staticSymbol&&&%>
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
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
if (isImplementation && genClass.isJavaIOSerializable()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	private static final long serialVersionUID = 1L;
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
if (isImplementation && genModel.isVirtualDelegation()) { String eVirtualValuesField = genClass.getEVirtualValuesField();
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
if (eVirtualValuesField != null) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * An array of objects representing the values of non-primitive features.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&      <%
if (isGWT) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	@<%
//&&&staticSymbol&&&=genModel.getImportedName("com.google.gwt.user.client.rpc.GwtTransient")
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	protected Object[] <%
//&&&staticSymbol&&&=eVirtualValuesField
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
{ List<String> eVirtualIndexBitFields = genClass.getEVirtualIndexBitFields(new ArrayList<String>());
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
if (!eVirtualIndexBitFields.isEmpty()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
for (String eVirtualIndexBitField : eVirtualIndexBitFields) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * A bit field representing the indices of non-primitive feature values.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&      <%
if (isGWT) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	@<%
//&&&staticSymbol&&&=genModel.getImportedName("com.google.gwt.user.client.rpc.GwtTransient")
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	protected int <%
//&&&staticSymbol&&&=eVirtualIndexBitField
//&&&staticSymbol&&&%>;
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
if (isImplementation && genClass.isModelRoot() && genModel.isBooleanFlagsEnabled() && genModel.getBooleanFlagsReservedBits() == -1) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * A set of bit flags representing the values of boolean attributes and whether unsettable features have been set.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 * @ordered
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&      <%
if (isGWT) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	@<%
//&&&staticSymbol&&&=genModel.getImportedName("com.google.gwt.user.client.rpc.GwtTransient")
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	protected int <%
//&&&staticSymbol&&&=genModel.getBooleanFlagsField()
//&&&staticSymbol&&&%> = 0;
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
if (isImplementation && !genModel.isReflectiveDelegation()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
for (GenFeature genFeature : genClass.getReifiedGenFeatures()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
if (genModel.isArrayAccessors() && genFeature.isListType() && !genFeature.isFeatureMapType() && !genFeature.isMapType()) { String rawListItemType = genFeature.getRawListItemType(genClass); int index = rawListItemType.indexOf('['); String head = rawListItemType; String tail = ""; if (index != -1) { head = rawListItemType.substring(0, index); tail = rawListItemType.substring(index); } 
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * The empty value for the '{@link #<%
//&&&staticSymbol&&&=genFeature.getGetArrayAccessor()
//&&&staticSymbol&&&%>() <em><%
//&&&staticSymbol&&&=genFeature.getFormattedName()
//&&&staticSymbol&&&%></em>}' array accessor.
//&&&staticSymbol&&&	 * This is specialized for the more specific element type known in this context.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @see #<%
//&&&staticSymbol&&&=genFeature.getGetArrayAccessor()
//&&&staticSymbol&&&%>()
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 * @ordered
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&        <%
if (genFeature.getQualifiedListItemType(genClass).contains("<") || genFeature.getArrayItemType(genClass).contains("<")) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	@SuppressWarnings("rawtypes")
//&&&staticSymbol&&&        <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	protected static final <%
//&&&staticSymbol&&&=rawListItemType
//&&&staticSymbol&&&%>[] <%
//&&&staticSymbol&&&=genFeature.getUpperName()
//&&&staticSymbol&&&%>_EEMPTY_ARRAY = new <%
//&&&staticSymbol&&&=head
//&&&staticSymbol&&&%> [0]<%
//&&&staticSymbol&&&=tail
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&
//&&&staticSymbol&&&      <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
for (GenFeature genFeature : genClass.getDeclaredFieldGenFeatures()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
if (genFeature.hasSettingDelegate()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * The cached setting delegate for the '{@link #<%
//&&&staticSymbol&&&=genFeature.getGetAccessor()
//&&&staticSymbol&&&%>() <em><%
//&&&staticSymbol&&&=genFeature.getFormattedName()
//&&&staticSymbol&&&%></em>}' <%
//&&&staticSymbol&&&=genFeature.getFeatureKind()
//&&&staticSymbol&&&%>.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @see #<%
//&&&staticSymbol&&&=genFeature.getGetAccessor()
//&&&staticSymbol&&&%>()
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 * @ordered
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&      <%
if (isGWT) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	@<%
//&&&staticSymbol&&&=genModel.getImportedName("com.google.gwt.user.client.rpc.GwtTransient")
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	protected <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature")
//&&&staticSymbol&&&%>.Internal.SettingDelegate <%
//&&&staticSymbol&&&=genFeature.getUpperName()
//&&&staticSymbol&&&%>__ESETTING_DELEGATE = ((<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature")
//&&&staticSymbol&&&%>.Internal)<%
//&&&staticSymbol&&&=genFeature.getQualifiedFeatureAccessor()
//&&&staticSymbol&&&%>).getSettingDelegate();
//&&&staticSymbol&&&
//&&&staticSymbol&&&    <%
} else if (genFeature.isListType() || genFeature.isReferenceType()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
if (genClass.isField(genFeature)) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * The cached value of the '{@link #<%
//&&&staticSymbol&&&=genFeature.getGetAccessor()
//&&&staticSymbol&&&%>() <em><%
//&&&staticSymbol&&&=genFeature.getFormattedName()
//&&&staticSymbol&&&%></em>}' <%
//&&&staticSymbol&&&=genFeature.getFeatureKind()
//&&&staticSymbol&&&%>.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @see #<%
//&&&staticSymbol&&&=genFeature.getGetAccessor()
//&&&staticSymbol&&&%>()
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 * @ordered
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&      <%
if (isGWT) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	@<%
//&&&staticSymbol&&&=genModel.getImportedName("com.google.gwt.user.client.rpc.GwtTransient")
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	protected <%
//&&&staticSymbol&&&=genFeature.getImportedInternalType(genClass)
//&&&staticSymbol&&&%> <%
//&&&staticSymbol&&&=genFeature.getSafeName()
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&
//&&&staticSymbol&&&      <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
if (genModel.isArrayAccessors() && genFeature.isListType() && !genFeature.isFeatureMapType() && !genFeature.isMapType()) { String rawListItemType = genFeature.getRawListItemType(genClass); int index = rawListItemType.indexOf('['); String head = rawListItemType; String tail = ""; if (index != -1) { head = rawListItemType.substring(0, index); tail = rawListItemType.substring(index); } 
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * The empty value for the '{@link #<%
//&&&staticSymbol&&&=genFeature.getGetArrayAccessor()
//&&&staticSymbol&&&%>() <em><%
//&&&staticSymbol&&&=genFeature.getFormattedName()
//&&&staticSymbol&&&%></em>}' array accessor.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @see #<%
//&&&staticSymbol&&&=genFeature.getGetArrayAccessor()
//&&&staticSymbol&&&%>()
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 * @ordered
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&        <%
if (genFeature.getQualifiedListItemType(genClass).contains("<") || genFeature.getArrayItemType(genClass).contains("<")) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	@SuppressWarnings("rawtypes")
//&&&staticSymbol&&&        <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	protected static final <%
//&&&staticSymbol&&&=rawListItemType
//&&&staticSymbol&&&%>[] <%
//&&&staticSymbol&&&=genFeature.getUpperName()
//&&&staticSymbol&&&%>_EEMPTY_ARRAY = new <%
//&&&staticSymbol&&&=head
//&&&staticSymbol&&&%> [0]<%
//&&&staticSymbol&&&=tail
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&
//&&&staticSymbol&&&      <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
if (genFeature.hasEDefault() && (!genFeature.isVolatile() || !genModel.isReflectiveDelegation() && (!genFeature.hasDelegateFeature() || !genFeature.isUnsettable()))) { String staticDefaultValue = genFeature.getStaticDefaultValue();
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * The default value of the '{@link #<%
//&&&staticSymbol&&&=genFeature.getGetAccessor()
//&&&staticSymbol&&&%>() <em><%
//&&&staticSymbol&&&=genFeature.getFormattedName()
//&&&staticSymbol&&&%></em>}' <%
//&&&staticSymbol&&&=genFeature.getFeatureKind()
//&&&staticSymbol&&&%>.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @see #<%
//&&&staticSymbol&&&=genFeature.getGetAccessor()
//&&&staticSymbol&&&%>()
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 * @ordered
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&        <%
if (genModel.useGenerics() && genFeature.isListDataType() && genFeature.isSetDefaultValue()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	@SuppressWarnings("unchecked")
//&&&staticSymbol&&&        <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	protected static final <%
//&&&staticSymbol&&&=genFeature.getImportedType(genClass)
//&&&staticSymbol&&&%> <%
//&&&staticSymbol&&&=genFeature.getEDefault()
//&&&staticSymbol&&&%><%
if ("".equals(staticDefaultValue)) {
//&&&staticSymbol&&&%>; // TODO The default value literal "<%
//&&&staticSymbol&&&=genFeature.getEcoreFeature().getDefaultValueLiteral()
//&&&staticSymbol&&&%>" is not valid.<%
} else {
//&&&staticSymbol&&&%> = <%
//&&&staticSymbol&&&=staticDefaultValue
//&&&staticSymbol&&&%>;<%
//&&&staticSymbol&&&=genModel.getNonNLS(staticDefaultValue)
//&&&staticSymbol&&&%><%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&      <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
if (genClass.isField(genFeature)) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&        <%
if (genClass.isFlag(genFeature)) { int flagIndex = genClass.getFlagIndex(genFeature);
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&          <%
if (flagIndex > 31 && flagIndex % 32 == 0) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * An additional set of bit flags representing the values of boolean attributes and whether unsettable features have been set.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 * @ordered
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&      <%
if (isGWT) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	@<%
//&&&staticSymbol&&&=genModel.getImportedName("com.google.gwt.user.client.rpc.GwtTransient")
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	protected int <%
//&&&staticSymbol&&&=genClass.getFlagsField(genFeature)
//&&&staticSymbol&&&%> = 0;
//&&&staticSymbol&&&
//&&&staticSymbol&&&          <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&          <%
if (genFeature.isEnumType()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * The offset of the flags representing the value of the '{@link #<%
//&&&staticSymbol&&&=genFeature.getGetAccessor()
//&&&staticSymbol&&&%>() <em><%
//&&&staticSymbol&&&=genFeature.getFormattedName()
//&&&staticSymbol&&&%></em>}' <%
//&&&staticSymbol&&&=genFeature.getFeatureKind()
//&&&staticSymbol&&&%>.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 * @ordered
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	protected static final int <%
//&&&staticSymbol&&&=genFeature.getUpperName()
//&&&staticSymbol&&&%>_EFLAG_OFFSET = <%
//&&&staticSymbol&&&=flagIndex % 32
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * The flags representing the default value of the '{@link #<%
//&&&staticSymbol&&&=genFeature.getGetAccessor()
//&&&staticSymbol&&&%>() <em><%
//&&&staticSymbol&&&=genFeature.getFormattedName()
//&&&staticSymbol&&&%></em>}' <%
//&&&staticSymbol&&&=genFeature.getFeatureKind()
//&&&staticSymbol&&&%>.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 * @ordered
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	protected static final int <%
//&&&staticSymbol&&&=genFeature.getUpperName()
//&&&staticSymbol&&&%>_EFLAG_DEFAULT = <%
if (isJDK50) {
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genFeature.getEDefault()
//&&&staticSymbol&&&%>.ordinal()<%
} else {
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genFeature.getImportedType(genClass)
//&&&staticSymbol&&&%>.VALUES.indexOf(<%
//&&&staticSymbol&&&=genFeature.getEDefault()
//&&&staticSymbol&&&%>)<%
}
//&&&staticSymbol&&&%> << <%
//&&&staticSymbol&&&=genFeature.getUpperName()
//&&&staticSymbol&&&%>_EFLAG_OFFSET;
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * The array of enumeration values for '{@link <%
//&&&staticSymbol&&&=genFeature.getImportedType(genClass)
//&&&staticSymbol&&&%> <%
//&&&staticSymbol&&&=genFeature.getTypeGenClassifier().getFormattedName()
//&&&staticSymbol&&&%>}'
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 * @ordered
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	private static final <%
//&&&staticSymbol&&&=genFeature.getImportedType(genClass)
//&&&staticSymbol&&&%>[] <%
//&&&staticSymbol&&&=genFeature.getUpperName()
//&&&staticSymbol&&&%>_EFLAG_VALUES = <%
if (isJDK50) {
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genFeature.getImportedType(genClass)
//&&&staticSymbol&&&%>.values()<%
} else {
//&&&staticSymbol&&&%>(<%
//&&&staticSymbol&&&=genFeature.getImportedType(genClass)
//&&&staticSymbol&&&%>[])<%
//&&&staticSymbol&&&=genFeature.getImportedType(genClass)
//&&&staticSymbol&&&%>.VALUES.toArray(new <%
//&&&staticSymbol&&&=genFeature.getImportedType(genClass)
//&&&staticSymbol&&&%>[<%
//&&&staticSymbol&&&=genFeature.getImportedType(genClass)
//&&&staticSymbol&&&%>.VALUES.size()])<%
}
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&
//&&&staticSymbol&&&          <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * The flag<%
//&&&staticSymbol&&&*%%storeSymbol%%*0
//&&&staticSymbol&&&%> representing the value of the '{@link #<%
//&&&staticSymbol&&&=genFeature.getGetAccessor()
//&&&staticSymbol&&&%>() <em><%
//&&&staticSymbol&&&=genFeature.getFormattedName()
//&&&staticSymbol&&&%></em>}' <%
//&&&staticSymbol&&&=genFeature.getFeatureKind()
//&&&staticSymbol&&&%>.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @see #<%
//&&&staticSymbol&&&=genFeature.getGetAccessor()
//&&&staticSymbol&&&%>()
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 * @ordered
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	protected static final int <%
//&&&staticSymbol&&&=genFeature.getUpperName()
//&&&staticSymbol&&&%>_EFLAG = <%
//&&&staticSymbol&&&=genClass.getFlagMask(genFeature)
//&&&staticSymbol&&&%> << <%
if (genFeature.isEnumType()) {
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genFeature.getUpperName()
//&&&staticSymbol&&&%>_EFLAG_OFFSET<%
} else {
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=flagIndex % 32
//&&&staticSymbol&&&%><%
}
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&
//&&&staticSymbol&&&        <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * The cached value of the '{@link #<%
//&&&staticSymbol&&&=genFeature.getGetAccessor()
//&&&staticSymbol&&&%>() <em><%
//&&&staticSymbol&&&=genFeature.getFormattedName()
//&&&staticSymbol&&&%></em>}' <%
//&&&staticSymbol&&&=genFeature.getFeatureKind()
//&&&staticSymbol&&&%>.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @see #<%
//&&&staticSymbol&&&=genFeature.getGetAccessor()
//&&&staticSymbol&&&%>()
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 * @ordered
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&      <%
if (isGWT) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	@<%
//&&&staticSymbol&&&=genModel.getImportedName("com.google.gwt.user.client.rpc.GwtTransient")
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	protected <%
//&&&staticSymbol&&&=genFeature.getImportedType(genClass)
//&&&staticSymbol&&&%> <%
//&&&staticSymbol&&&=genFeature.getSafeName()
//&&&staticSymbol&&&%><%
if (genFeature.hasEDefault()) {
//&&&staticSymbol&&&%> = <%
//&&&staticSymbol&&&=genFeature.getEDefault()
//&&&staticSymbol&&&%><%
}
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&
//&&&staticSymbol&&&        <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
if (genClass.isESetField(genFeature)) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
if (genClass.isESetFlag(genFeature)) { int flagIndex = genClass.getESetFlagIndex(genFeature);
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&        <%
if (flagIndex > 31 && flagIndex % 32 == 0) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * An additional set of bit flags representing the values of boolean attributes and whether unsettable features have been set.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 * @ordered
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&      <%
if (isGWT) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	@<%
//&&&staticSymbol&&&=genModel.getImportedName("com.google.gwt.user.client.rpc.GwtTransient")
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	protected int <%
//&&&staticSymbol&&&=genClass.getESetFlagsField(genFeature)
//&&&staticSymbol&&&%> = 0;
//&&&staticSymbol&&&
//&&&staticSymbol&&&        <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * The flag representing whether the <%
//&&&staticSymbol&&&=genFeature.getFormattedName()
//&&&staticSymbol&&&%> <%
//&&&staticSymbol&&&=genFeature.getFeatureKind()
//&&&staticSymbol&&&%> has been set.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 * @ordered
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	protected static final int <%
//&&&staticSymbol&&&=genFeature.getUpperName()
//&&&staticSymbol&&&%>_ESETFLAG = 1 << <%
//&&&staticSymbol&&&=flagIndex % 32 
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&
//&&&staticSymbol&&&      <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * This is true if the <%
//&&&staticSymbol&&&=genFeature.getFormattedName()
//&&&staticSymbol&&&%> <%
//&&&staticSymbol&&&=genFeature.getFeatureKind()
//&&&staticSymbol&&&%> has been set.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 * @ordered
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&      <%
if (isGWT) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	@<%
//&&&staticSymbol&&&=genModel.getImportedName("com.google.gwt.user.client.rpc.GwtTransient")
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	protected boolean <%
//&&&staticSymbol&&&=genFeature.getUncapName()
//&&&staticSymbol&&&%>ESet;
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
if (isImplementation && genClass.hasOffsetCorrection() && !genClass.getImplementedGenFeatures().isEmpty()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	private static final int <%
//&&&staticSymbol&&&=genClass.getOffsetCorrectionField(null)
//&&&staticSymbol&&&%> = <%
//&&&staticSymbol&&&=genClass.getQualifiedClassifierAccessor()
//&&&staticSymbol&&&%>.getFeatureID(<%
//&&&staticSymbol&&&=genClass.getImplementedGenFeatures().get(0).getQualifiedFeatureAccessor()
//&&&staticSymbol&&&%>) - <%
//&&&staticSymbol&&&=genClass.getQualifiedFeatureID(genClass.getImplementedGenFeatures().get(0))
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
if (isImplementation && !genModel.isReflectiveDelegation()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
for (GenFeature genFeature : genClass.getImplementedGenFeatures()) { GenFeature reverseFeature = genFeature.getReverse();
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
if (reverseFeature != null && reverseFeature.getGenClass().hasOffsetCorrection()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	private static final int <%
//&&&staticSymbol&&&=genClass.getOffsetCorrectionField(genFeature)
//&&&staticSymbol&&&%> = <%
//&&&staticSymbol&&&=reverseFeature.getGenClass().getQualifiedClassifierAccessor()
//&&&staticSymbol&&&%>.getFeatureID(<%
//&&&staticSymbol&&&=reverseFeature.getQualifiedFeatureAccessor()
//&&&staticSymbol&&&%>) - <%
//&&&staticSymbol&&&=reverseFeature.getGenClass().getQualifiedFeatureID(reverseFeature)
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&
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
if (genModel.isOperationReflection() && isImplementation && genClass.hasOffsetCorrection() && !genClass.getImplementedGenOperations().isEmpty()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	private static final int "EOPERATION_OFFSET_CORRECTION" = <%
//&&&staticSymbol&&&=genClass.getQualifiedClassifierAccessor()
//&&&staticSymbol&&&%>.getOperationID(<%
//&&&staticSymbol&&&=genClass.getImplementedGenOperations().get(0).getQualifiedOperationAccessor()
//&&&staticSymbol&&&%>) - <%
//&&&staticSymbol&&&=genClass.getQualifiedOperationID(genClass.getImplementedGenOperations().get(0))
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
if (isImplementation) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	<%
if (genModel.isPublicConstructors()) {
//&&&staticSymbol&&&%>public<%
} else {
//&&&staticSymbol&&&%>protected<%
}
//&&&staticSymbol&&&%> <%
//&&&staticSymbol&&&=genClass.getClassName()
//&&&staticSymbol&&&%>()
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		super();
//&&&staticSymbol&&&  <%
for (GenFeature genFeature : genClass.getFlagGenFeaturesWithDefault()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=genClass.getFlagsField(genFeature)
//&&&staticSymbol&&&%> |= <%
//&&&staticSymbol&&&=genFeature.getUpperName()
//&&&staticSymbol&&&%>_EFLAG<%
if (!genFeature.isBooleanType()) {
//&&&staticSymbol&&&%>_DEFAULT<%
}
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
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
//&&&staticSymbol&&&	protected <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.EClass")
//&&&staticSymbol&&&%> eStaticClass()
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		return <%
//&&&staticSymbol&&&=genClass.getQualifiedClassifierAccessor()
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
if (isImplementation && (genModel.getFeatureDelegation() == GenDelegationKind.REFLECTIVE_LITERAL || genModel.isDynamicDelegation()) && (genClass.getClassExtendsGenClass() == null || (genClass.getClassExtendsGenClass().getGenModel().getFeatureDelegation() != GenDelegationKind.REFLECTIVE_LITERAL && !genClass.getClassExtendsGenClass().getGenModel().isDynamicDelegation()))) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
if (genClass.hasStaticFeatures()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	protected static final int ESTATIC_FEATURE_COUNT = <%
//&&&staticSymbol&&&*%%storeSymbol%%*1
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&
//&&&staticSymbol&&&  <%
}
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
//&&&staticSymbol&&&	protected int eStaticFeatureCount()
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		return <%
//&&&staticSymbol&&&*%%storeSymbol%%*2
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
if (isImplementation) {
//&&&staticSymbol&&&%>

//&&&staticSymbol&&&<%
 GenClass classExtendsGenClass = genClass.getClassExtendsGenClass(); List<GenFeature> classExtendsAllGenFeatures = classExtendsGenClass == null? Collections.emptyList() : classExtendsGenClass.getAllGenFeatures();
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
for (GenFeature genFeature : genClass.getReifiedGenFeatures()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
if (genModel.isArrayAccessors() && genFeature.isListType() && !genFeature.isFeatureMapType() && !genFeature.isMapType()) { String arrayElementType = genFeature.getArrayItemType(genClass);
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * This is specialized for the more specific element type known in this context.
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&    <%
if (genModel.useGenerics() && CodeGenUtil.isUncheckedCast(arrayElementType)) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	@SuppressWarnings("unchecked")
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
if (classExtendsAllGenFeatures.contains(genFeature)) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	@Override
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	public <%
//&&&staticSymbol&&&=arrayElementType
//&&&staticSymbol&&&%>[] <%
//&&&staticSymbol&&&=genFeature.getGetArrayAccessor()
//&&&staticSymbol&&&%>()
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&      <%
if (genFeature.isVolatile()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.common.util.BasicEList")
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genFeature.getListTemplateArguments(genClass)
//&&&staticSymbol&&&%> list = (<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.common.util.BasicEList")
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genFeature.getListTemplateArguments(genClass)
//&&&staticSymbol&&&%>)<%
//&&&staticSymbol&&&=genFeature.getGetAccessor()
//&&&staticSymbol&&&%>();
//&&&staticSymbol&&&		if (list.isEmpty()) return <%
//&&&staticSymbol&&&=genFeature.getUpperName()
//&&&staticSymbol&&&%>_EEMPTY_ARRAY;
//&&&staticSymbol&&&      <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		if (<%
//&&&staticSymbol&&&=genFeature.getSafeName()
//&&&staticSymbol&&&%> == null || <%
//&&&staticSymbol&&&=genFeature.getSafeName()
//&&&staticSymbol&&&%>.isEmpty()) return <%
//&&&staticSymbol&&&=genFeature.getUpperName()
//&&&staticSymbol&&&%>_EEMPTY_ARRAY;
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.common.util.BasicEList")
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genFeature.getListTemplateArguments(genClass)
//&&&staticSymbol&&&%> list = (<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.common.util.BasicEList")
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genFeature.getListTemplateArguments(genClass)
//&&&staticSymbol&&&%>)<%
//&&&staticSymbol&&&=genFeature.getSafeName()
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&      <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		list.shrink();
//&&&staticSymbol&&&		return (<%
//&&&staticSymbol&&&=arrayElementType
//&&&staticSymbol&&&%>[])list.data();
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
if (genFeature.isGet() && genFeature.isListType()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * This is specialized for the more specific element type known in this context.
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&<%
if (isJDK50) { //Class/getGenFeature.annotations.insert.javajetinc
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
if (genFeature.isListType() && genModel.isVirtualDelegation()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	@SuppressWarnings("unchecked")
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
if (classExtendsAllGenFeatures.contains(genFeature)) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	@Override
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	public <%
//&&&staticSymbol&&&=genFeature.getImportedType(genClass)
//&&&staticSymbol&&&%> <%
//&&&staticSymbol&&&=genFeature.getGetAccessor()
//&&&staticSymbol&&&%><%
if (genClass.hasCollidingGetAccessorOperation(genFeature)) {
//&&&staticSymbol&&&%>_<%
}
//&&&staticSymbol&&&%>()
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&        <%
if (genModel.isVirtualDelegation()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=genFeature.getImportedType(genClass)
//&&&staticSymbol&&&%> <%
//&&&staticSymbol&&&=genFeature.getSafeName()
//&&&staticSymbol&&&%> = (<%
//&&&staticSymbol&&&=genFeature.getImportedType(genClass)
//&&&staticSymbol&&&%>)eVirtualGet(<%
//&&&staticSymbol&&&=genClass.getQualifiedFeatureID(genFeature)
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=positiveOffsetCorrection
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&        <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		if (<%
//&&&staticSymbol&&&=genFeature.getSafeName()
//&&&staticSymbol&&&%> == null)
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&        <%
if (genModel.isVirtualDelegation()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			eVirtualSet(<%
//&&&staticSymbol&&&=genClass.getQualifiedFeatureID(genFeature)
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=positiveOffsetCorrection
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=genFeature.getSafeName()
//&&&staticSymbol&&&%> = new <%
//&&&staticSymbol&&&=genClass.getListConstructor(genFeature)
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&        <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			<%
//&&&staticSymbol&&&=genFeature.getSafeName()
//&&&staticSymbol&&&%> = new <%
//&&&staticSymbol&&&=genClass.getListConstructor(genFeature)
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&        <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&		return <%
//&&&staticSymbol&&&=genFeature.getSafeName()
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&*%%storeSymbol%%*3
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
if (!genModel.isReflectiveDelegation() && genFeature.isBasicSet()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * This is specialized for the more specific type known in this context.
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&<%
if (isJDK50) { //Class/basicSetGenFeature.annotations.insert.javajetinc
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
if (classExtendsAllGenFeatures.contains(genFeature)) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	@Override
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	public <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain")
//&&&staticSymbol&&&%> basicSet<%
//&&&staticSymbol&&&=genFeature.getAccessorName()
//&&&staticSymbol&&&%>(<%
//&&&staticSymbol&&&=genFeature.getImportedInternalType(genClass)
//&&&staticSymbol&&&%> new<%
//&&&staticSymbol&&&=genFeature.getCapName()
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain")
//&&&staticSymbol&&&%> msgs)
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		return super.basicSet<%
//&&&staticSymbol&&&=genFeature.getAccessorName()
//&&&staticSymbol&&&%>(new<%
//&&&staticSymbol&&&=genFeature.getCapName()
//&&&staticSymbol&&&%>, msgs);
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
if (genFeature.isSet() && !(!genModel.isReflectiveDelegation() && genFeature.isBasicSet())) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * This is specialized for the more specific type known in this context.
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&<%
if (isJDK50) { //Class/setGenFeature.annotations.insert.javajetinc
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
{ GenOperation setAccessorOperation = genClass.getSetAccessorOperation(genFeature);
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
if (classExtendsAllGenFeatures.contains(genFeature)) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	@Override
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	public void set<%
//&&&staticSymbol&&&=genFeature.getAccessorName()
//&&&staticSymbol&&&%><%
if (genClass.hasCollidingSetAccessorOperation(genFeature)) {
//&&&staticSymbol&&&%>_<%
}
//&&&staticSymbol&&&%>(<%
//&&&staticSymbol&&&=genFeature.getImportedType(genClass)
//&&&staticSymbol&&&%> <%
//&&&staticSymbol&&&*%%storeSymbol%%*4
//&&&staticSymbol&&&%>)
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		super.set<%
//&&&staticSymbol&&&=genFeature.getAccessorName()
//&&&staticSymbol&&&%><%
if (genClass.hasCollidingSetAccessorOperation(genFeature)) {
//&&&staticSymbol&&&%>_<%
}
//&&&staticSymbol&&&%>(<%
//&&&staticSymbol&&&*%%storeSymbol%%*5
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
}}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%

//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
for (GenFeature genFeature : (isImplementation ? genClass.getImplementedGenFeatures() : genClass.getDeclaredGenFeatures())) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
if (genModel.isArrayAccessors() && genFeature.isListType() && !genFeature.isFeatureMapType() && !genFeature.isMapType()) { String arrayElementType = genFeature.getArrayItemType(genClass);
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&    <%
if (!isImplementation) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	<%
//&&&staticSymbol&&&=arrayElementType
//&&&staticSymbol&&&%>[] <%
//&&&staticSymbol&&&=genFeature.getGetArrayAccessor()
//&&&staticSymbol&&&%>();
//&&&staticSymbol&&&
//&&&staticSymbol&&&    <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
if (genModel.useGenerics() && CodeGenUtil.isUncheckedCast(arrayElementType)) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	@SuppressWarnings("unchecked")
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	public <%
//&&&staticSymbol&&&=arrayElementType
//&&&staticSymbol&&&%>[] <%
//&&&staticSymbol&&&=genFeature.getGetArrayAccessor()
//&&&staticSymbol&&&%>()
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&      <%
if (genFeature.isVolatile()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.common.util.BasicEList")
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genFeature.getListTemplateArguments(genClass)
//&&&staticSymbol&&&%> list = (<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.common.util.BasicEList")
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genFeature.getListTemplateArguments(genClass)
//&&&staticSymbol&&&%>)<%
//&&&staticSymbol&&&=genFeature.getGetAccessor()
//&&&staticSymbol&&&%>();
//&&&staticSymbol&&&		if (list.isEmpty()) return <%
//&&&staticSymbol&&&=genFeature.getUpperName()
//&&&staticSymbol&&&%>_EEMPTY_ARRAY;
//&&&staticSymbol&&&      <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		if (<%
//&&&staticSymbol&&&=genFeature.getSafeName()
//&&&staticSymbol&&&%> == null || <%
//&&&staticSymbol&&&=genFeature.getSafeName()
//&&&staticSymbol&&&%>.isEmpty()) return <%
//&&&staticSymbol&&&=genFeature.getUpperName()
//&&&staticSymbol&&&%>_EEMPTY_ARRAY;
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.common.util.BasicEList")
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genFeature.getListTemplateArguments(genClass)
//&&&staticSymbol&&&%> list = (<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.common.util.BasicEList")
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genFeature.getListTemplateArguments(genClass)
//&&&staticSymbol&&&%>)<%
//&&&staticSymbol&&&=genFeature.getSafeName()
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&      <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		list.shrink();
//&&&staticSymbol&&&		return (<%
//&&&staticSymbol&&&=arrayElementType
//&&&staticSymbol&&&%>[])list.data();
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&    <%
if (!isImplementation) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	<%
//&&&staticSymbol&&&=genFeature.getListItemType(genClass)
//&&&staticSymbol&&&%> get<%
//&&&staticSymbol&&&=genFeature.getAccessorName()
//&&&staticSymbol&&&%>(int index);
//&&&staticSymbol&&&
//&&&staticSymbol&&&    <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	public <%
//&&&staticSymbol&&&=genFeature.getListItemType(genClass)
//&&&staticSymbol&&&%> get<%
//&&&staticSymbol&&&=genFeature.getAccessorName()
//&&&staticSymbol&&&%>(int index)
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		return <%
if (!genModel.useGenerics()) {
//&&&staticSymbol&&&%>(<%
//&&&staticSymbol&&&=genFeature.getListItemType(genClass)
//&&&staticSymbol&&&%>)<%
}
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genFeature.getGetAccessor()
//&&&staticSymbol&&&%>().get(index);
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&    <%
if (!isImplementation) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	int get<%
//&&&staticSymbol&&&=genFeature.getAccessorName()
//&&&staticSymbol&&&%>Length();
//&&&staticSymbol&&&
//&&&staticSymbol&&&    <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	public int get<%
//&&&staticSymbol&&&=genFeature.getAccessorName()
//&&&staticSymbol&&&%>Length()
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&      <%
if (genFeature.isVolatile()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		return <%
//&&&staticSymbol&&&=genFeature.getGetAccessor()
//&&&staticSymbol&&&%>().size();
//&&&staticSymbol&&&      <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		return <%
//&&&staticSymbol&&&=genFeature.getSafeName()
//&&&staticSymbol&&&%> == null ? 0 : <%
//&&&staticSymbol&&&=genFeature.getSafeName()
//&&&staticSymbol&&&%>.size();
//&&&staticSymbol&&&      <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&    <%
if (!isImplementation) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	void set<%
//&&&staticSymbol&&&=genFeature.getAccessorName()
//&&&staticSymbol&&&%>(<%
//&&&staticSymbol&&&=genFeature.getListItemType(genClass)
//&&&staticSymbol&&&%>[] new<%
//&&&staticSymbol&&&=genFeature.getCapName()
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&
//&&&staticSymbol&&&    <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	public void set<%
//&&&staticSymbol&&&=genFeature.getAccessorName()
//&&&staticSymbol&&&%>(<%
//&&&staticSymbol&&&=genFeature.getListItemType(genClass)
//&&&staticSymbol&&&%>[] new<%
//&&&staticSymbol&&&=genFeature.getCapName()
//&&&staticSymbol&&&%>)
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		((<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.common.util.BasicEList")
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genFeature.getListTemplateArguments(genClass)
//&&&staticSymbol&&&%>)<%
//&&&staticSymbol&&&=genFeature.getGetAccessor()
//&&&staticSymbol&&&%>()).setData(new<%
//&&&staticSymbol&&&=genFeature.getCapName()
//&&&staticSymbol&&&%>.length, new<%
//&&&staticSymbol&&&=genFeature.getCapName()
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&    <%
if (!isImplementation) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	void set<%
//&&&staticSymbol&&&=genFeature.getAccessorName()
//&&&staticSymbol&&&%>(int index, <%
//&&&staticSymbol&&&=genFeature.getListItemType(genClass)
//&&&staticSymbol&&&%> element);
//&&&staticSymbol&&&
//&&&staticSymbol&&&    <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	public void set<%
//&&&staticSymbol&&&=genFeature.getAccessorName()
//&&&staticSymbol&&&%>(int index, <%
//&&&staticSymbol&&&=genFeature.getListItemType(genClass)
//&&&staticSymbol&&&%> element)
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=genFeature.getGetAccessor()
//&&&staticSymbol&&&%>().set(index, element);
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
if (genFeature.isGet() && (isImplementation || !genFeature.isSuppressedGetVisibility())) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
if (isInterface) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * Returns the value of the '<em><b><%
//&&&staticSymbol&&&=genFeature.getFormattedName()
//&&&staticSymbol&&&%></b></em>' <%
//&&&staticSymbol&&&=genFeature.getFeatureKind()
//&&&staticSymbol&&&%>.
//&&&staticSymbol&&&    <%
if (genFeature.isListType() && genFeature.getEcoreFeature().getEGenericType().getETypeParameter() == null) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
if (genFeature.isMapType()) { GenFeature keyFeature = genFeature.getMapEntryTypeGenClass().getMapEntryKeyFeature(); GenFeature valueFeature = genFeature.getMapEntryTypeGenClass().getMapEntryValueFeature(); 
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	 * The key is of type <%
if (keyFeature.isListType()) {
//&&&staticSymbol&&&%>list of {@link <%
//&&&staticSymbol&&&=keyFeature.getQualifiedListItemType(genClass)
//&&&staticSymbol&&&%>}<%
} else {
//&&&staticSymbol&&&%>{@link <%
//&&&staticSymbol&&&=keyFeature.getType(genClass)
//&&&staticSymbol&&&%>}<%
}
//&&&staticSymbol&&&%>,
//&&&staticSymbol&&&	 * and the value is of type <%
if (valueFeature.isListType()) {
//&&&staticSymbol&&&%>list of {@link <%
//&&&staticSymbol&&&=valueFeature.getQualifiedListItemType(genClass)
//&&&staticSymbol&&&%>}<%
} else {
//&&&staticSymbol&&&%>{@link <%
//&&&staticSymbol&&&=valueFeature.getType(genClass)
//&&&staticSymbol&&&%>}<%
}
//&&&staticSymbol&&&%>,
//&&&staticSymbol&&&      <%
} else if (!genFeature.isWrappedFeatureMapType() && !(genModel.isSuppressEMFMetaData() && "org.eclipse.emf.ecore.EObject".equals(genFeature.getQualifiedListItemType(genClass)))) {
String typeName = genFeature.getQualifiedListItemType(genClass); String head = typeName; String tail = ""; int index = typeName.indexOf('<'); if (index == -1) { index = typeName.indexOf('['); } 
if (index != -1) { head = typeName.substring(0, index); tail = typeName.substring(index).replaceAll("<", "&lt;"); }

//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	 * The list contents are of type {@link <%
//&&&staticSymbol&&&=head
//&&&staticSymbol&&&%>}<%
//&&&staticSymbol&&&=tail
//&&&staticSymbol&&&%>.
//&&&staticSymbol&&&      <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
} else if (genFeature.isSetDefaultValue()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	 * The default value is <code><%
//&&&staticSymbol&&&=genFeature.getDefaultValue()
//&&&staticSymbol&&&%></code>.
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
if (genFeature.getTypeGenEnum() != null) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	 * The literals are from the enumeration {@link <%
//&&&staticSymbol&&&=genFeature.getTypeGenEnum().getQualifiedName()
//&&&staticSymbol&&&%>}.
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
if (genFeature.isBidirectional() && !genFeature.getReverse().getGenClass().isMapEntry()) { GenFeature reverseGenFeature = genFeature.getReverse(); 
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
if (!reverseGenFeature.isSuppressedGetVisibility()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	 * It is bidirectional and its opposite is '{@link <%
//&&&staticSymbol&&&=reverseGenFeature.getGenClass().getQualifiedInterfaceName()
//&&&staticSymbol&&&%>#<%
//&&&staticSymbol&&&=reverseGenFeature.getGetAccessor()
//&&&staticSymbol&&&%> <em><%
//&&&staticSymbol&&&=reverseGenFeature.getFormattedName()
//&&&staticSymbol&&&%></em>}'.
//&&&staticSymbol&&&      <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&    <%
if (!genFeature.hasDocumentation()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	 * <p>
//&&&staticSymbol&&&	 * If the meaning of the '<em><%
//&&&staticSymbol&&&=genFeature.getFormattedName()
//&&&staticSymbol&&&%></em>' <%
//&&&staticSymbol&&&=genFeature.getFeatureKind()
//&&&staticSymbol&&&%> isn't clear,
//&&&staticSymbol&&&	 * there really should be more of a description here...
//&&&staticSymbol&&&	 * </p>
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&    <%
if (genFeature.hasDocumentation()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	 * <!-- begin-model-doc -->
//&&&staticSymbol&&&	 * <%
//&&&staticSymbol&&&=genFeature.getDocumentation(genModel.getIndentation(stringBuffer))
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	 * <!-- end-model-doc -->
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	 * @return the value of the '<em><%
//&&&staticSymbol&&&=genFeature.getFormattedName()
//&&&staticSymbol&&&%></em>' <%
//&&&staticSymbol&&&=genFeature.getFeatureKind()
//&&&staticSymbol&&&%>.
//&&&staticSymbol&&&    <%
if (genFeature.getTypeGenEnum() != null) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	 * @see <%
//&&&staticSymbol&&&=genFeature.getTypeGenEnum().getQualifiedName()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
if (genFeature.isUnsettable()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
if (!genFeature.isSuppressedIsSetVisibility()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	 * @see #isSet<%
//&&&staticSymbol&&&=genFeature.getAccessorName()
//&&&staticSymbol&&&%>()
//&&&staticSymbol&&&      <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
if (genFeature.isChangeable() && !genFeature.isSuppressedUnsetVisibility()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	 * @see #unset<%
//&&&staticSymbol&&&=genFeature.getAccessorName()
//&&&staticSymbol&&&%>()
//&&&staticSymbol&&&      <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
if (genFeature.isChangeable() && !genFeature.isListType() && !genFeature.isSuppressedSetVisibility()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	 * @see #set<%
//&&&staticSymbol&&&=genFeature.getAccessorName()
//&&&staticSymbol&&&%>(<%
//&&&staticSymbol&&&=genFeature.getRawImportedBoundType()
//&&&staticSymbol&&&%>)
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
if (!genModel.isSuppressEMFMetaData()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	 * @see <%
//&&&staticSymbol&&&=genPackage.getQualifiedPackageInterfaceName()
//&&&staticSymbol&&&%>#get<%
//&&&staticSymbol&&&=genFeature.getFeatureAccessorName()
//&&&staticSymbol&&&%>()
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
if (genFeature.isBidirectional() && !genFeature.getReverse().getGenClass().isMapEntry()) { GenFeature reverseGenFeature = genFeature.getReverse(); 
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
if (!reverseGenFeature.isSuppressedGetVisibility()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	 * @see <%
//&&&staticSymbol&&&=reverseGenFeature.getGenClass().getQualifiedInterfaceName()
//&&&staticSymbol&&&%>#<%
//&&&staticSymbol&&&=reverseGenFeature.getGetAccessor()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
if (!genModel.isSuppressEMFModelTags()) { boolean first = true; for (StringTokenizer stringTokenizer = new StringTokenizer(genFeature.getModelInfo(), "\n\r"); stringTokenizer.hasMoreTokens(); ) { String modelInfo = stringTokenizer.nextToken(); if (first) { first = false;
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	 * @model <%
//&&&staticSymbol&&&=modelInfo
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	 *        <%
//&&&staticSymbol&&&=modelInfo
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
}} if (first) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	 * @model
//&&&staticSymbol&&&    <%
}}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&<%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&<%
if (isJDK50) { //Class/getGenFeature.annotations.insert.javajetinc
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
if (!isImplementation) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	<%
//&&&staticSymbol&&&=genFeature.getImportedType(genClass)
//&&&staticSymbol&&&%> <%
//&&&staticSymbol&&&=genFeature.getGetAccessor()
//&&&staticSymbol&&&%>();
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
if (genModel.useGenerics() && ((genFeature.isContainer() || genFeature.isResolveProxies()) && !genFeature.isListType() && !(genModel.isReflectiveDelegation() && genModel.isDynamicDelegation()) && genFeature.isUncheckedCast(genClass) || genFeature.isListType() && !genFeature.isFeatureMapType() && (genModel.isReflectiveDelegation() || genModel.isVirtualDelegation() || genModel.isDynamicDelegation()) || genFeature.isListDataType() && genFeature.hasDelegateFeature() || genFeature.isListType() && genFeature.hasSettingDelegate())) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	@SuppressWarnings("unchecked")
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	public <%
//&&&staticSymbol&&&=genFeature.getImportedType(genClass)
//&&&staticSymbol&&&%> <%
//&&&staticSymbol&&&=genFeature.getGetAccessor()
//&&&staticSymbol&&&%><%
if (genClass.hasCollidingGetAccessorOperation(genFeature)) {
//&&&staticSymbol&&&%>_<%
}
//&&&staticSymbol&&&%>()
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&    <%
if (genModel.isDynamicDelegation()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		return <%
if (!isJDK50 && genFeature.isPrimitiveType()) {
//&&&staticSymbol&&&%>(<%
}
//&&&staticSymbol&&&%>(<%
//&&&staticSymbol&&&=genFeature.getObjectType(genClass)
//&&&staticSymbol&&&%>)eDynamicGet(<%
//&&&staticSymbol&&&=genClass.getQualifiedFeatureID(genFeature)
//&&&staticSymbol&&&%><%
if (genClass.hasStaticFeatures()){
//&&&staticSymbol&&&%> - ESTATIC_FEATURE_COUNT<%
}
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=genFeature.getQualifiedFeatureAccessor()
//&&&staticSymbol&&&%>, true, <%
//&&&staticSymbol&&&=!genFeature.isEffectiveSuppressEMFTypes()
//&&&staticSymbol&&&%>)<%
if (!isJDK50 && genFeature.isPrimitiveType()) {
//&&&staticSymbol&&&%>).<%
//&&&staticSymbol&&&=genFeature.getPrimitiveValueFunction()
//&&&staticSymbol&&&%>()<%
}
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&    <%
} else if (genModel.isReflectiveDelegation()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
if (genFeature.hasGetterBody()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=genFeature.getGetterBody(genModel.getIndentation(stringBuffer))
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		return <%
if (!isJDK50 && genFeature.isPrimitiveType()) {
//&&&staticSymbol&&&%>(<%
}
//&&&staticSymbol&&&%>(<%
//&&&staticSymbol&&&=genFeature.getObjectType(genClass)
//&&&staticSymbol&&&%>)eGet(<%
//&&&staticSymbol&&&=genFeature.getQualifiedFeatureAccessor()
//&&&staticSymbol&&&%>, true)<%
if (!isJDK50 && genFeature.isPrimitiveType()) {
//&&&staticSymbol&&&%>).<%
//&&&staticSymbol&&&=genFeature.getPrimitiveValueFunction()
//&&&staticSymbol&&&%>()<%
}
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&      <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
} else if (genFeature.hasSettingDelegate()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		return <%
if (!isJDK50 && genFeature.isPrimitiveType()) {
//&&&staticSymbol&&&%>(<%
}
//&&&staticSymbol&&&%>(<%
//&&&staticSymbol&&&=genFeature.getObjectType(genClass)
//&&&staticSymbol&&&%>)<%
//&&&staticSymbol&&&=genFeature.getUpperName()
//&&&staticSymbol&&&%>__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false)<%
if (!isJDK50 && genFeature.isPrimitiveType()) {
//&&&staticSymbol&&&%>).<%
//&&&staticSymbol&&&=genFeature.getPrimitiveValueFunction()
//&&&staticSymbol&&&%>()<%
}
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&    <%
} else if (!genFeature.isVolatile()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
if (genFeature.isListType()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&        <%
if (genModel.isVirtualDelegation()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=genFeature.getImportedType(genClass)
//&&&staticSymbol&&&%> <%
//&&&staticSymbol&&&=genFeature.getSafeName()
//&&&staticSymbol&&&%> = (<%
//&&&staticSymbol&&&=genFeature.getImportedType(genClass)
//&&&staticSymbol&&&%>)eVirtualGet(<%
//&&&staticSymbol&&&=genClass.getQualifiedFeatureID(genFeature)
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=positiveOffsetCorrection
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&        <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		if (<%
//&&&staticSymbol&&&=genFeature.getSafeName()
//&&&staticSymbol&&&%> == null)
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&        <%
if (genModel.isVirtualDelegation()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			eVirtualSet(<%
//&&&staticSymbol&&&=genClass.getQualifiedFeatureID(genFeature)
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=positiveOffsetCorrection
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=genFeature.getSafeName()
//&&&staticSymbol&&&%> = new <%
//&&&staticSymbol&&&=genClass.getListConstructor(genFeature)
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&        <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			<%
//&&&staticSymbol&&&=genFeature.getSafeName()
//&&&staticSymbol&&&%> = new <%
//&&&staticSymbol&&&=genClass.getListConstructor(genFeature)
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&        <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&		return <%
//&&&staticSymbol&&&=genFeature.getSafeName()
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&*%%storeSymbol%%*6
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&      <%
} else if (genFeature.isContainer()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		if (eContainerFeatureID() != <%
//&&&staticSymbol&&&=genClass.getQualifiedFeatureID(genFeature)
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=positiveOffsetCorrection
//&&&staticSymbol&&&%>) return null;
//&&&staticSymbol&&&		return (<%
//&&&staticSymbol&&&=genFeature.getImportedType(genClass)
//&&&staticSymbol&&&%>)<%
if (genFeature.isResolveProxies()) {
//&&&staticSymbol&&&%>eContainer<%
} else {
//&&&staticSymbol&&&%>eInternalContainer<%
}
//&&&staticSymbol&&&%>();
//&&&staticSymbol&&&      <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&        <%
if (genFeature.isResolveProxies()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&          <%
if (genModel.isVirtualDelegation()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=genFeature.getImportedType(genClass)
//&&&staticSymbol&&&%> <%
//&&&staticSymbol&&&=genFeature.getSafeName()
//&&&staticSymbol&&&%> = (<%
//&&&staticSymbol&&&=genFeature.getImportedType(genClass)
//&&&staticSymbol&&&%>)eVirtualGet(<%
//&&&staticSymbol&&&=genClass.getQualifiedFeatureID(genFeature)
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=positiveOffsetCorrection
//&&&staticSymbol&&&%><%
if (genFeature.hasEDefault()) {
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=genFeature.getEDefault()
//&&&staticSymbol&&&%><%
}
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&          <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		if (<%
//&&&staticSymbol&&&=genFeature.getSafeName()
//&&&staticSymbol&&&%> != null && <%
//&&&staticSymbol&&&=genFeature.getSafeNameAsEObject()
//&&&staticSymbol&&&%>.eIsProxy())
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject")
//&&&staticSymbol&&&%> old<%
//&&&staticSymbol&&&=genFeature.getCapName()
//&&&staticSymbol&&&%> = (<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject")
//&&&staticSymbol&&&%>)<%
//&&&staticSymbol&&&=genFeature.getSafeName()
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&			<%
//&&&staticSymbol&&&=genFeature.getSafeName()
//&&&staticSymbol&&&%> = <%
//&&&staticSymbol&&&=genFeature.getNonEObjectInternalTypeCast(genClass)
//&&&staticSymbol&&&%>eResolveProxy(old<%
//&&&staticSymbol&&&=genFeature.getCapName()
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&			if (<%
//&&&staticSymbol&&&=genFeature.getSafeName()
//&&&staticSymbol&&&%> != old<%
//&&&staticSymbol&&&=genFeature.getCapName()
//&&&staticSymbol&&&%>)
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&          <%
if (genFeature.isEffectiveContains()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject")
//&&&staticSymbol&&&%> new<%
//&&&staticSymbol&&&=genFeature.getCapName()
//&&&staticSymbol&&&%> = (<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject")
//&&&staticSymbol&&&%>)<%
//&&&staticSymbol&&&=genFeature.getSafeName()
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&          <%
if (!genFeature.isBidirectional()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain")
//&&&staticSymbol&&&%> msgs = old<%
//&&&staticSymbol&&&=genFeature.getCapName()
//&&&staticSymbol&&&%>.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - <%
//&&&staticSymbol&&&=genClass.getQualifiedFeatureID(genFeature)
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=negativeOffsetCorrection
//&&&staticSymbol&&&%>, null, null);
//&&&staticSymbol&&&          <%
} else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(genFeature) : "";
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain")
//&&&staticSymbol&&&%> msgs =  old<%
//&&&staticSymbol&&&=genFeature.getCapName()
//&&&staticSymbol&&&%>.eInverseRemove(this, <%
//&&&staticSymbol&&&=targetClass.getQualifiedFeatureID(reverseFeature)
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=reverseOffsetCorrection
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=targetClass.getRawImportedInterfaceName()
//&&&staticSymbol&&&%>.class, null);
//&&&staticSymbol&&&          <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				if (new<%
//&&&staticSymbol&&&=genFeature.getCapName()
//&&&staticSymbol&&&%>.eInternalContainer() == null)
//&&&staticSymbol&&&				{
//&&&staticSymbol&&&          <%
if (!genFeature.isBidirectional()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&					msgs = new<%
//&&&staticSymbol&&&=genFeature.getCapName()
//&&&staticSymbol&&&%>.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - <%
//&&&staticSymbol&&&=genClass.getQualifiedFeatureID(genFeature)
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=negativeOffsetCorrection
//&&&staticSymbol&&&%>, null, msgs);
//&&&staticSymbol&&&          <%
} else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(genFeature) : "";
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&					msgs =  new<%
//&&&staticSymbol&&&=genFeature.getCapName()
//&&&staticSymbol&&&%>.eInverseAdd(this, <%
//&&&staticSymbol&&&=targetClass.getQualifiedFeatureID(reverseFeature)
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=reverseOffsetCorrection
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=targetClass.getRawImportedInterfaceName()
//&&&staticSymbol&&&%>.class, msgs);
//&&&staticSymbol&&&          <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				}
//&&&staticSymbol&&&				if (msgs != null) msgs.dispatch();
//&&&staticSymbol&&&          <%
} else if (genModel.isVirtualDelegation()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				eVirtualSet(<%
//&&&staticSymbol&&&=genClass.getQualifiedFeatureID(genFeature)
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=positiveOffsetCorrection
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=genFeature.getSafeName()
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&          <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&          <%
if (!genModel.isSuppressNotification()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				if (eNotificationRequired())
//&&&staticSymbol&&&					eNotify(new <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl")
//&&&staticSymbol&&&%>(this, <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.common.notify.Notification")
//&&&staticSymbol&&&%>.RESOLVE, <%
//&&&staticSymbol&&&=genClass.getQualifiedFeatureID(genFeature)
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=positiveOffsetCorrection
//&&&staticSymbol&&&%>, old<%
//&&&staticSymbol&&&=genFeature.getCapName()
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=genFeature.getSafeName()
//&&&staticSymbol&&&%>));
//&&&staticSymbol&&&          <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			}
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&        <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&        <%
if (!genFeature.isResolveProxies() && genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		return (<%
//&&&staticSymbol&&&=genFeature.getImportedType(genClass)
//&&&staticSymbol&&&%>)eVirtualGet(<%
//&&&staticSymbol&&&=genClass.getQualifiedFeatureID(genFeature)
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=positiveOffsetCorrection
//&&&staticSymbol&&&%><%
if (genFeature.hasEDefault()) {
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=genFeature.getEDefault()
//&&&staticSymbol&&&%><%
}
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&        <%
} else if (genClass.isFlag(genFeature)) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&          <%
if (genFeature.isBooleanType()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		return (<%
//&&&staticSymbol&&&=genClass.getFlagsField(genFeature)
//&&&staticSymbol&&&%> & <%
//&&&staticSymbol&&&=genFeature.getUpperName()
//&&&staticSymbol&&&%>_EFLAG) != 0;
//&&&staticSymbol&&&          <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		return <%
//&&&staticSymbol&&&=genFeature.getUpperName()
//&&&staticSymbol&&&%>_EFLAG_VALUES[(<%
//&&&staticSymbol&&&=genClass.getFlagsField(genFeature)
//&&&staticSymbol&&&%> & <%
//&&&staticSymbol&&&=genFeature.getUpperName()
//&&&staticSymbol&&&%>_EFLAG) >>> <%
//&&&staticSymbol&&&=genFeature.getUpperName()
//&&&staticSymbol&&&%>_EFLAG_OFFSET];
//&&&staticSymbol&&&          <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&        <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		return <%
//&&&staticSymbol&&&=genFeature.getSafeName()
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&        <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
} else {//volatile
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
if (genFeature.isResolveProxies() && !genFeature.isListType()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=genFeature.getImportedType(genClass)
//&&&staticSymbol&&&%> <%
//&&&staticSymbol&&&=genFeature.getSafeName()
//&&&staticSymbol&&&%> = basicGet<%
//&&&staticSymbol&&&=genFeature.getAccessorName()
//&&&staticSymbol&&&%>();
//&&&staticSymbol&&&		return <%
//&&&staticSymbol&&&=genFeature.getSafeName()
//&&&staticSymbol&&&%> != null && <%
//&&&staticSymbol&&&=genFeature.getSafeNameAsEObject()
//&&&staticSymbol&&&%>.eIsProxy() ? <%
//&&&staticSymbol&&&=genFeature.getNonEObjectInternalTypeCast(genClass)
//&&&staticSymbol&&&%>eResolveProxy((<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject")
//&&&staticSymbol&&&%>)<%
//&&&staticSymbol&&&=genFeature.getSafeName()
//&&&staticSymbol&&&%>) : <%
//&&&staticSymbol&&&=genFeature.getSafeName()
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&      <%
} else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&        <%
if (genFeature.isFeatureMapType()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&        <%
String featureMapEntryTemplateArgument = isJDK50 ? "<" + genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap") + ".Entry>" : "";
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&          <%
if (delegateFeature.isWrappedFeatureMapType()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		return new <%
//&&&staticSymbol&&&=genFeature.getImportedEffectiveFeatureMapWrapperClass()
//&&&staticSymbol&&&%>((<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap")
//&&&staticSymbol&&&%>.Internal)((<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap")
//&&&staticSymbol&&&%>.Internal.Wrapper)get<%
//&&&staticSymbol&&&=delegateFeature.getAccessorName()
//&&&staticSymbol&&&%>()).featureMap().<%
//&&&staticSymbol&&&=featureMapEntryTemplateArgument
//&&&staticSymbol&&&%>list(<%
//&&&staticSymbol&&&=genFeature.getQualifiedFeatureAccessor()
//&&&staticSymbol&&&%>));
//&&&staticSymbol&&&          <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		return (<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap")
//&&&staticSymbol&&&%>)get<%
//&&&staticSymbol&&&=delegateFeature.getAccessorName()
//&&&staticSymbol&&&%>().<%
//&&&staticSymbol&&&=featureMapEntryTemplateArgument
//&&&staticSymbol&&&%>list(<%
//&&&staticSymbol&&&=genFeature.getQualifiedFeatureAccessor()
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&          <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&        <%
} else if (genFeature.isListType()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&          <%
if (delegateFeature.isWrappedFeatureMapType()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		return ((<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap")
//&&&staticSymbol&&&%>.Internal.Wrapper)get<%
//&&&staticSymbol&&&=delegateFeature.getAccessorName()
//&&&staticSymbol&&&%>()).featureMap().list(<%
//&&&staticSymbol&&&=genFeature.getQualifiedFeatureAccessor()
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&          <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		return get<%
//&&&staticSymbol&&&=delegateFeature.getAccessorName()
//&&&staticSymbol&&&%>().list(<%
//&&&staticSymbol&&&=genFeature.getQualifiedFeatureAccessor()
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&          <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&        <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&          <%
if (delegateFeature.isWrappedFeatureMapType()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		return <%
if (!isJDK50 && genFeature.isPrimitiveType()) {
//&&&staticSymbol&&&%>(<%
}
//&&&staticSymbol&&&%><%
if (genFeature.getTypeGenDataType() == null || !genFeature.getTypeGenDataType().isObjectType()) {
//&&&staticSymbol&&&%>(<%
//&&&staticSymbol&&&=genFeature.getObjectType(genClass)
//&&&staticSymbol&&&%>)<%
}
//&&&staticSymbol&&&%>((<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap")
//&&&staticSymbol&&&%>.Internal.Wrapper)get<%
//&&&staticSymbol&&&=delegateFeature.getAccessorName()
//&&&staticSymbol&&&%>()).featureMap().get(<%
//&&&staticSymbol&&&=genFeature.getQualifiedFeatureAccessor()
//&&&staticSymbol&&&%>, true)<%
if (!isJDK50 && genFeature.isPrimitiveType()) {
//&&&staticSymbol&&&%>).<%
//&&&staticSymbol&&&=genFeature.getPrimitiveValueFunction()
//&&&staticSymbol&&&%>()<%
}
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&          <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		return <%
if (!isJDK50 && genFeature.isPrimitiveType()) {
//&&&staticSymbol&&&%>(<%
}
//&&&staticSymbol&&&%><%
if (genFeature.getTypeGenDataType() == null || !genFeature.getTypeGenDataType().isObjectType()) {
//&&&staticSymbol&&&%>(<%
//&&&staticSymbol&&&=genFeature.getObjectType(genClass)
//&&&staticSymbol&&&%>)<%
}
//&&&staticSymbol&&&%>get<%
//&&&staticSymbol&&&=delegateFeature.getAccessorName()
//&&&staticSymbol&&&%>().get(<%
//&&&staticSymbol&&&=genFeature.getQualifiedFeatureAccessor()
//&&&staticSymbol&&&%>, true)<%
if (!isJDK50 && genFeature.isPrimitiveType()) {
//&&&staticSymbol&&&%>).<%
//&&&staticSymbol&&&=genFeature.getPrimitiveValueFunction()
//&&&staticSymbol&&&%>()<%
}
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&          <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&        <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
} else if (genClass.getGetAccessorOperation(genFeature) != null) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=genClass.getGetAccessorOperation(genFeature).getBody(genModel.getIndentation(stringBuffer))
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
} else if (genFeature.hasGetterBody()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=genFeature.getGetterBody(genModel.getIndentation(stringBuffer))
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		// TODO: implement this method to return the '<%
//&&&staticSymbol&&&=genFeature.getFormattedName()
//&&&staticSymbol&&&%>' <%
//&&&staticSymbol&&&=genFeature.getFeatureKind()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		// Ensure that you remove @generated or mark it @generated NOT
//&&&staticSymbol&&&        <%
if (genFeature.isListType()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
//&&&staticSymbol&&&		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.<%
if (genFeature.isMapType()) {
//&&&staticSymbol&&&%>EcoreEMap<%
} else if (genFeature.isFeatureMapType()) {
//&&&staticSymbol&&&%>BasicFeatureMap<%
} else {
//&&&staticSymbol&&&%>EcoreEList<%
}
//&&&staticSymbol&&&%> should be used.
//&&&staticSymbol&&&        <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		throw new UnsupportedOperationException();
//&&&staticSymbol&&&      <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
if (isImplementation && !genModel.isReflectiveDelegation() && genFeature.isBasicGet()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&<%
if (isJDK50) { //Class/basicGetGenFeature.annotations.insert.javajetinc
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	public <%
//&&&staticSymbol&&&=genFeature.getImportedType(genClass)
//&&&staticSymbol&&&%> basicGet<%
//&&&staticSymbol&&&=genFeature.getAccessorName()
//&&&staticSymbol&&&%>()
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&    <%
if (genModel.isDynamicDelegation()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		return (<%
//&&&staticSymbol&&&=genFeature.getImportedType(genClass)
//&&&staticSymbol&&&%>)eDynamicGet(<%
//&&&staticSymbol&&&=genClass.getQualifiedFeatureID(genFeature)
//&&&staticSymbol&&&%><%
if (genClass.hasStaticFeatures()){
//&&&staticSymbol&&&%> - ESTATIC_FEATURE_COUNT<%
}
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=genFeature.getQualifiedFeatureAccessor()
//&&&staticSymbol&&&%>, false, <%
//&&&staticSymbol&&&=!genFeature.isEffectiveSuppressEMFTypes()
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&    <%
} else if (genFeature.hasSettingDelegate()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		return <%
if (!isJDK50 && genFeature.isPrimitiveType()) {
//&&&staticSymbol&&&%>(<%
}
//&&&staticSymbol&&&%>(<%
//&&&staticSymbol&&&=genFeature.getObjectType(genClass)
//&&&staticSymbol&&&%>)<%
//&&&staticSymbol&&&=genFeature.getUpperName()
//&&&staticSymbol&&&%>__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false)<%
if (!isJDK50 && genFeature.isPrimitiveType()) {
//&&&staticSymbol&&&%>).<%
//&&&staticSymbol&&&=genFeature.getPrimitiveValueFunction()
//&&&staticSymbol&&&%>()<%
}
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&    <%
} else if (genFeature.isContainer()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		if (eContainerFeatureID() != <%
//&&&staticSymbol&&&=genClass.getQualifiedFeatureID(genFeature)
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=positiveOffsetCorrection
//&&&staticSymbol&&&%>) return null;
//&&&staticSymbol&&&		return (<%
//&&&staticSymbol&&&=genFeature.getImportedType(genClass)
//&&&staticSymbol&&&%>)eInternalContainer();
//&&&staticSymbol&&&    <%
} else if (!genFeature.isVolatile()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
if (genModel.isVirtualDelegation()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		return (<%
//&&&staticSymbol&&&=genFeature.getImportedType(genClass)
//&&&staticSymbol&&&%>)eVirtualGet(<%
//&&&staticSymbol&&&=genClass.getQualifiedFeatureID(genFeature)
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=positiveOffsetCorrection
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&      <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		return <%
//&&&staticSymbol&&&=genFeature.getSafeName()
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&      <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
} else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
if (delegateFeature.isWrappedFeatureMapType()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		return (<%
//&&&staticSymbol&&&=genFeature.getImportedType(genClass)
//&&&staticSymbol&&&%>)((<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap")
//&&&staticSymbol&&&%>.Internal.Wrapper)get<%
//&&&staticSymbol&&&=delegateFeature.getAccessorName()
//&&&staticSymbol&&&%>()).featureMap().get(<%
//&&&staticSymbol&&&=genFeature.getQualifiedFeatureAccessor()
//&&&staticSymbol&&&%>, false);
//&&&staticSymbol&&&      <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		return (<%
//&&&staticSymbol&&&=genFeature.getImportedType(genClass)
//&&&staticSymbol&&&%>)get<%
//&&&staticSymbol&&&=delegateFeature.getAccessorName()
//&&&staticSymbol&&&%>().get(<%
//&&&staticSymbol&&&=genFeature.getQualifiedFeatureAccessor()
//&&&staticSymbol&&&%>, false);
//&&&staticSymbol&&&      <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
} else if (genFeature.hasGetterBody()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=genFeature.getGetterBody(genModel.getIndentation(stringBuffer))
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		// TODO: implement this method to return the '<%
//&&&staticSymbol&&&=genFeature.getFormattedName()
//&&&staticSymbol&&&%>' <%
//&&&staticSymbol&&&=genFeature.getFeatureKind()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		// -> do not perform proxy resolution
//&&&staticSymbol&&&		// Ensure that you remove @generated or mark it @generated NOT
//&&&staticSymbol&&&		throw new UnsupportedOperationException();
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
if (isImplementation && !genModel.isReflectiveDelegation() && genFeature.isBasicSet()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&<%
if (isJDK50) { //Class/basicSetGenFeature.annotations.insert.javajetinc
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	public <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain")
//&&&staticSymbol&&&%> basicSet<%
//&&&staticSymbol&&&=genFeature.getAccessorName()
//&&&staticSymbol&&&%>(<%
//&&&staticSymbol&&&=genFeature.getImportedInternalType(genClass)
//&&&staticSymbol&&&%> new<%
//&&&staticSymbol&&&=genFeature.getCapName()
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain")
//&&&staticSymbol&&&%> msgs)
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&    <%
if (genFeature.isContainer()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		msgs = eBasicSetContainer((<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject")
//&&&staticSymbol&&&%>)new<%
//&&&staticSymbol&&&=genFeature.getCapName()
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=genClass.getQualifiedFeatureID(genFeature)
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=positiveOffsetCorrection
//&&&staticSymbol&&&%>, msgs);
//&&&staticSymbol&&&		return msgs;
//&&&staticSymbol&&&    <%
} else if (genModel.isDynamicDelegation()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		msgs = eDynamicInverseAdd((<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject")
//&&&staticSymbol&&&%>)new<%
//&&&staticSymbol&&&=genFeature.getCapName()
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=genClass.getQualifiedFeatureID(genFeature)
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=positiveOffsetCorrection
//&&&staticSymbol&&&%>, msgs);
//&&&staticSymbol&&&		return msgs;
//&&&staticSymbol&&&    <%
} else if (!genFeature.isVolatile()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
if (genModel.isVirtualDelegation()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		Object old<%
//&&&staticSymbol&&&=genFeature.getCapName()
//&&&staticSymbol&&&%> = eVirtualSet(<%
//&&&staticSymbol&&&=genClass.getQualifiedFeatureID(genFeature)
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=positiveOffsetCorrection
//&&&staticSymbol&&&%>, new<%
//&&&staticSymbol&&&=genFeature.getCapName()
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&      <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=genFeature.getImportedType(genClass)
//&&&staticSymbol&&&%> old<%
//&&&staticSymbol&&&=genFeature.getCapName()
//&&&staticSymbol&&&%> = <%
//&&&staticSymbol&&&=genFeature.getSafeName()
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=genFeature.getSafeName()
//&&&staticSymbol&&&%> = new<%
//&&&staticSymbol&&&=genFeature.getCapName()
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&      <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
if (genFeature.isUnsettable()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&        <%
if (genModel.isVirtualDelegation()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&          <%
if (!genModel.isSuppressNotification()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		boolean isSetChange = old<%
//&&&staticSymbol&&&=genFeature.getCapName()
//&&&staticSymbol&&&%> == EVIRTUAL_NO_VALUE;
//&&&staticSymbol&&&          <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&        <%
} else if (genClass.isESetFlag(genFeature)) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		boolean old<%
//&&&staticSymbol&&&=genFeature.getCapName()
//&&&staticSymbol&&&%>ESet = (<%
//&&&staticSymbol&&&=genClass.getESetFlagsField(genFeature)
//&&&staticSymbol&&&%> & <%
//&&&staticSymbol&&&=genFeature.getUpperName()
//&&&staticSymbol&&&%>_ESETFLAG) != 0;
//&&&staticSymbol&&&          <%
if (!genModel.isSuppressNotification()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=genClass.getESetFlagsField(genFeature)
//&&&staticSymbol&&&%> |= <%
//&&&staticSymbol&&&=genFeature.getUpperName()
//&&&staticSymbol&&&%>_ESETFLAG;
//&&&staticSymbol&&&          <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&        <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&          <%
if (!genModel.isSuppressNotification()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		boolean old<%
//&&&staticSymbol&&&=genFeature.getCapName()
//&&&staticSymbol&&&%>ESet = <%
//&&&staticSymbol&&&=genFeature.getUncapName()
//&&&staticSymbol&&&%>ESet;
//&&&staticSymbol&&&          <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=genFeature.getUncapName()
//&&&staticSymbol&&&%>ESet = true;
//&&&staticSymbol&&&        <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
if (!genModel.isSuppressNotification()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		if (eNotificationRequired())
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&        <%
if (genFeature.isUnsettable()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl")
//&&&staticSymbol&&&%> notification = new <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl")
//&&&staticSymbol&&&%>(this, <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.common.notify.Notification")
//&&&staticSymbol&&&%>.SET, <%
//&&&staticSymbol&&&=genClass.getQualifiedFeatureID(genFeature)
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=positiveOffsetCorrection
//&&&staticSymbol&&&%>, <%
if (genModel.isVirtualDelegation()) {
//&&&staticSymbol&&&%>isSetChange ? null : old<%
//&&&staticSymbol&&&=genFeature.getCapName()
//&&&staticSymbol&&&%><%
} else {
//&&&staticSymbol&&&%>old<%
//&&&staticSymbol&&&=genFeature.getCapName()
//&&&staticSymbol&&&%><%
}
//&&&staticSymbol&&&%>, new<%
//&&&staticSymbol&&&=genFeature.getCapName()
//&&&staticSymbol&&&%>, <%
if (genModel.isVirtualDelegation()) {
//&&&staticSymbol&&&%>isSetChange<%
} else {
//&&&staticSymbol&&&%>!old<%
//&&&staticSymbol&&&=genFeature.getCapName()
//&&&staticSymbol&&&%>ESet<%
}
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&        <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl")
//&&&staticSymbol&&&%> notification = new <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl")
//&&&staticSymbol&&&%>(this, <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.common.notify.Notification")
//&&&staticSymbol&&&%>.SET, <%
//&&&staticSymbol&&&=genClass.getQualifiedFeatureID(genFeature)
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=positiveOffsetCorrection
//&&&staticSymbol&&&%>, <%
if (genModel.isVirtualDelegation()) {
//&&&staticSymbol&&&%>old<%
//&&&staticSymbol&&&=genFeature.getCapName()
//&&&staticSymbol&&&%> == EVIRTUAL_NO_VALUE ? null : old<%
//&&&staticSymbol&&&=genFeature.getCapName()
//&&&staticSymbol&&&%><%
} else {
//&&&staticSymbol&&&%>old<%
//&&&staticSymbol&&&=genFeature.getCapName()
//&&&staticSymbol&&&%><%
}
//&&&staticSymbol&&&%>, new<%
//&&&staticSymbol&&&=genFeature.getCapName()
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&        <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			if (msgs == null) msgs = notification; else msgs.add(notification);
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&      <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		return msgs;
//&&&staticSymbol&&&    <%
} else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
if (delegateFeature.isWrappedFeatureMapType()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		return ((<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap")
//&&&staticSymbol&&&%>.Internal)((<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap")
//&&&staticSymbol&&&%>.Internal.Wrapper)get<%
//&&&staticSymbol&&&=delegateFeature.getAccessorName()
//&&&staticSymbol&&&%>()).featureMap()).basicAdd(<%
//&&&staticSymbol&&&=genFeature.getQualifiedFeatureAccessor()
//&&&staticSymbol&&&%>, new<%
//&&&staticSymbol&&&=genFeature.getCapName()
//&&&staticSymbol&&&%>, msgs);
//&&&staticSymbol&&&      <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		return ((<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap")
//&&&staticSymbol&&&%>.Internal)get<%
//&&&staticSymbol&&&=delegateFeature.getAccessorName()
//&&&staticSymbol&&&%>()).basicAdd(<%
//&&&staticSymbol&&&=genFeature.getQualifiedFeatureAccessor()
//&&&staticSymbol&&&%>, new<%
//&&&staticSymbol&&&=genFeature.getCapName()
//&&&staticSymbol&&&%>, msgs);
//&&&staticSymbol&&&      <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		// TODO: implement this method to set the contained '<%
//&&&staticSymbol&&&=genFeature.getFormattedName()
//&&&staticSymbol&&&%>' <%
//&&&staticSymbol&&&=genFeature.getFeatureKind()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		// -> this method is automatically invoked to keep the containment relationship in synch
//&&&staticSymbol&&&		// -> do not modify other features
//&&&staticSymbol&&&		// -> return msgs, after adding any generated Notification to it (if it is null, a NotificationChain object must be created first)
//&&&staticSymbol&&&		// Ensure that you remove @generated or mark it @generated NOT
//&&&staticSymbol&&&		throw new UnsupportedOperationException();
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
if (genFeature.isSet() && (isImplementation || !genFeature.isSuppressedSetVisibility())) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
if (isInterface) { 
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * Sets the value of the '{@link <%
//&&&staticSymbol&&&=genClass.getQualifiedInterfaceName()
//&&&staticSymbol&&&%>#<%
//&&&staticSymbol&&&=genFeature.getGetAccessor()
//&&&staticSymbol&&&%> <em><%
//&&&staticSymbol&&&=genFeature.getFormattedName()
//&&&staticSymbol&&&%></em>}' <%
//&&&staticSymbol&&&=genFeature.getFeatureKind()
//&&&staticSymbol&&&%>.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @param value the new value of the '<em><%
//&&&staticSymbol&&&=genFeature.getFormattedName()
//&&&staticSymbol&&&%></em>' <%
//&&&staticSymbol&&&=genFeature.getFeatureKind()
//&&&staticSymbol&&&%>.
//&&&staticSymbol&&&    <%
if (genFeature.isEnumType()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	 * @see <%
//&&&staticSymbol&&&=genFeature.getTypeGenEnum().getQualifiedName()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
if (genFeature.isUnsettable()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
if (!genFeature.isSuppressedIsSetVisibility()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	 * @see #isSet<%
//&&&staticSymbol&&&=genFeature.getAccessorName()
//&&&staticSymbol&&&%>()
//&&&staticSymbol&&&      <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
if (!genFeature.isSuppressedUnsetVisibility()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	 * @see #unset<%
//&&&staticSymbol&&&=genFeature.getAccessorName()
//&&&staticSymbol&&&%>()
//&&&staticSymbol&&&      <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	 * @see #<%
//&&&staticSymbol&&&=genFeature.getGetAccessor()
//&&&staticSymbol&&&%>()
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&<%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&<%
if (isJDK50) { //Class/setGenFeature.annotations.insert.javajetinc
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
if (!isImplementation) { 
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	void set<%
//&&&staticSymbol&&&=genFeature.getAccessorName()
//&&&staticSymbol&&&%>(<%
//&&&staticSymbol&&&=genFeature.getImportedType(genClass)
//&&&staticSymbol&&&%> value);
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
} else { GenOperation setAccessorOperation = genClass.getSetAccessorOperation(genFeature);
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	public void set<%
//&&&staticSymbol&&&=genFeature.getAccessorName()
//&&&staticSymbol&&&%><%
if (genClass.hasCollidingSetAccessorOperation(genFeature)) {
//&&&staticSymbol&&&%>_<%
}
//&&&staticSymbol&&&%>(<%
//&&&staticSymbol&&&=genFeature.getImportedType(genClass)
//&&&staticSymbol&&&%> <%
//&&&staticSymbol&&&*%%storeSymbol%%*7
//&&&staticSymbol&&&%>)
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&    <%
if (genModel.isDynamicDelegation()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		eDynamicSet(<%
//&&&staticSymbol&&&=genClass.getQualifiedFeatureID(genFeature)
//&&&staticSymbol&&&%><%
if (genClass.hasStaticFeatures()){
//&&&staticSymbol&&&%> - ESTATIC_FEATURE_COUNT<%
}
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=genFeature.getQualifiedFeatureAccessor()
//&&&staticSymbol&&&%>, <%
if (!isJDK50 && genFeature.isPrimitiveType()) {
//&&&staticSymbol&&&%>new <%
//&&&staticSymbol&&&=genFeature.getObjectType(genClass)
//&&&staticSymbol&&&%>(<%
}
//&&&staticSymbol&&&%>new<%
//&&&staticSymbol&&&=genFeature.getCapName()
//&&&staticSymbol&&&%><%
if (!isJDK50 && genFeature.isPrimitiveType()) {
//&&&staticSymbol&&&%>)<%
}
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&    <%
} else if (genModel.isReflectiveDelegation()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		eSet(<%
//&&&staticSymbol&&&=genFeature.getQualifiedFeatureAccessor()
//&&&staticSymbol&&&%>, <%
if (!isJDK50 && genFeature.isPrimitiveType()) {
//&&&staticSymbol&&&%>new <%
//&&&staticSymbol&&&=genFeature.getObjectType(genClass)
//&&&staticSymbol&&&%>(<%
}
//&&&staticSymbol&&&%>new<%
//&&&staticSymbol&&&=genFeature.getCapName()
//&&&staticSymbol&&&%><%
if (!isJDK50 && genFeature.isPrimitiveType()) {
//&&&staticSymbol&&&%>)<%
}
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&    <%
} else if (genFeature.hasSettingDelegate()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=genFeature.getUpperName()
//&&&staticSymbol&&&%>__ESETTING_DELEGATE.dynamicSet(this, null, 0, <%
if (!isJDK50 && genFeature.isPrimitiveType()) {
//&&&staticSymbol&&&%>new <%
//&&&staticSymbol&&&=genFeature.getObjectType(genClass)
//&&&staticSymbol&&&%>(<%
}
//&&&staticSymbol&&&%>new<%
//&&&staticSymbol&&&=genFeature.getCapName()
//&&&staticSymbol&&&%><%
if (!isJDK50 && genFeature.isPrimitiveType()) {
//&&&staticSymbol&&&%>)<%
}
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&    <%
} else if (!genFeature.isVolatile()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
if (genFeature.isContainer()) { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(genFeature) : "";
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		if (new<%
//&&&staticSymbol&&&=genFeature.getCapName()
//&&&staticSymbol&&&%> != eInternalContainer() || (eContainerFeatureID() != <%
//&&&staticSymbol&&&=genClass.getQualifiedFeatureID(genFeature)
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=positiveOffsetCorrection
//&&&staticSymbol&&&%> && new<%
//&&&staticSymbol&&&=genFeature.getCapName()
//&&&staticSymbol&&&%> != null))
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			if (<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.util.EcoreUtil")
//&&&staticSymbol&&&%>.isAncestor(this, <%
//&&&staticSymbol&&&=genFeature.getEObjectCast()
//&&&staticSymbol&&&%>new<%
//&&&staticSymbol&&&=genFeature.getCapName()
//&&&staticSymbol&&&%>))
//&&&staticSymbol&&&				throw new <%
//&&&staticSymbol&&&=genModel.getImportedName("java.lang.IllegalArgumentException")
//&&&staticSymbol&&&%>("Recursive containment not allowed for " + toString());<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain")
//&&&staticSymbol&&&%> msgs = null;
//&&&staticSymbol&&&			if (eInternalContainer() != null)
//&&&staticSymbol&&&				msgs = eBasicRemoveFromContainer(msgs);
//&&&staticSymbol&&&			if (new<%
//&&&staticSymbol&&&=genFeature.getCapName()
//&&&staticSymbol&&&%> != null)
//&&&staticSymbol&&&				msgs = ((<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject")
//&&&staticSymbol&&&%>)new<%
//&&&staticSymbol&&&=genFeature.getCapName()
//&&&staticSymbol&&&%>).eInverseAdd(this, <%
//&&&staticSymbol&&&=targetClass.getQualifiedFeatureID(reverseFeature)
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=reverseOffsetCorrection
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=targetClass.getRawImportedInterfaceName()
//&&&staticSymbol&&&%>.class, msgs);
//&&&staticSymbol&&&			msgs = basicSet<%
//&&&staticSymbol&&&=genFeature.getAccessorName()
//&&&staticSymbol&&&%>(<%
//&&&staticSymbol&&&=genFeature.getInternalTypeCast()
//&&&staticSymbol&&&%>new<%
//&&&staticSymbol&&&=genFeature.getCapName()
//&&&staticSymbol&&&%>, msgs);
//&&&staticSymbol&&&			if (msgs != null) msgs.dispatch();
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&        <%
if (!genModel.isSuppressNotification()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		else if (eNotificationRequired())
//&&&staticSymbol&&&			eNotify(new <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl")
//&&&staticSymbol&&&%>(this, <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.common.notify.Notification")
//&&&staticSymbol&&&%>.SET, <%
//&&&staticSymbol&&&=genClass.getQualifiedFeatureID(genFeature)
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=positiveOffsetCorrection
//&&&staticSymbol&&&%>, new<%
//&&&staticSymbol&&&=genFeature.getCapName()
//&&&staticSymbol&&&%>, new<%
//&&&staticSymbol&&&=genFeature.getCapName()
//&&&staticSymbol&&&%>));
//&&&staticSymbol&&&        <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
} else if (genFeature.isBidirectional() || genFeature.isEffectiveContains()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&        <%
if (genModel.isVirtualDelegation()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=genFeature.getImportedType(genClass)
//&&&staticSymbol&&&%> <%
//&&&staticSymbol&&&=genFeature.getSafeName()
//&&&staticSymbol&&&%> = (<%
//&&&staticSymbol&&&=genFeature.getImportedType(genClass)
//&&&staticSymbol&&&%>)eVirtualGet(<%
//&&&staticSymbol&&&=genClass.getQualifiedFeatureID(genFeature)
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=positiveOffsetCorrection
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&        <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		if (new<%
//&&&staticSymbol&&&=genFeature.getCapName()
//&&&staticSymbol&&&%> != <%
//&&&staticSymbol&&&=genFeature.getSafeName()
//&&&staticSymbol&&&%>)
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain")
//&&&staticSymbol&&&%> msgs = null;
//&&&staticSymbol&&&			if (<%
//&&&staticSymbol&&&=genFeature.getSafeName()
//&&&staticSymbol&&&%> != null)
//&&&staticSymbol&&&        <%
if (!genFeature.isBidirectional()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				msgs = ((<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject")
//&&&staticSymbol&&&%>)<%
//&&&staticSymbol&&&=genFeature.getSafeName()
//&&&staticSymbol&&&%>).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - <%
//&&&staticSymbol&&&=genClass.getQualifiedFeatureID(genFeature)
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=negativeOffsetCorrection
//&&&staticSymbol&&&%>, null, msgs);
//&&&staticSymbol&&&			if (new<%
//&&&staticSymbol&&&=genFeature.getCapName()
//&&&staticSymbol&&&%> != null)
//&&&staticSymbol&&&				msgs = ((<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject")
//&&&staticSymbol&&&%>)new<%
//&&&staticSymbol&&&=genFeature.getCapName()
//&&&staticSymbol&&&%>).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - <%
//&&&staticSymbol&&&=genClass.getQualifiedFeatureID(genFeature)
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=negativeOffsetCorrection
//&&&staticSymbol&&&%>, null, msgs);
//&&&staticSymbol&&&        <%
} else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(genFeature) : "";
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				msgs = ((<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject")
//&&&staticSymbol&&&%>)<%
//&&&staticSymbol&&&=genFeature.getSafeName()
//&&&staticSymbol&&&%>).eInverseRemove(this, <%
//&&&staticSymbol&&&=targetClass.getQualifiedFeatureID(reverseFeature)
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=reverseOffsetCorrection
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=targetClass.getRawImportedInterfaceName()
//&&&staticSymbol&&&%>.class, msgs);
//&&&staticSymbol&&&			if (new<%
//&&&staticSymbol&&&=genFeature.getCapName()
//&&&staticSymbol&&&%> != null)
//&&&staticSymbol&&&				msgs = ((<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject")
//&&&staticSymbol&&&%>)new<%
//&&&staticSymbol&&&=genFeature.getCapName()
//&&&staticSymbol&&&%>).eInverseAdd(this, <%
//&&&staticSymbol&&&=targetClass.getQualifiedFeatureID(reverseFeature)
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=reverseOffsetCorrection
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=targetClass.getRawImportedInterfaceName()
//&&&staticSymbol&&&%>.class, msgs);
//&&&staticSymbol&&&        <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			msgs = basicSet<%
//&&&staticSymbol&&&=genFeature.getAccessorName()
//&&&staticSymbol&&&%>(<%
//&&&staticSymbol&&&=genFeature.getInternalTypeCast()
//&&&staticSymbol&&&%>new<%
//&&&staticSymbol&&&=genFeature.getCapName()
//&&&staticSymbol&&&%>, msgs);
//&&&staticSymbol&&&			if (msgs != null) msgs.dispatch();
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&        <%
if (genFeature.isUnsettable()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		else
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&          <%
if (genModel.isVirtualDelegation()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			boolean old<%
//&&&staticSymbol&&&=genFeature.getCapName()
//&&&staticSymbol&&&%>ESet = eVirtualIsSet(<%
//&&&staticSymbol&&&=genClass.getQualifiedFeatureID(genFeature)
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=positiveOffsetCorrection
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&          <%
} else if (genClass.isESetFlag(genFeature)) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&            <%
if (!genModel.isSuppressNotification()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			boolean old<%
//&&&staticSymbol&&&=genFeature.getCapName()
//&&&staticSymbol&&&%>ESet = (<%
//&&&staticSymbol&&&=genClass.getESetFlagsField(genFeature)
//&&&staticSymbol&&&%> & <%
//&&&staticSymbol&&&=genFeature.getUpperName()
//&&&staticSymbol&&&%>_ESETFLAG) != 0;
//&&&staticSymbol&&&            <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			<%
//&&&staticSymbol&&&=genClass.getESetFlagsField(genFeature)
//&&&staticSymbol&&&%> |= <%
//&&&staticSymbol&&&=genFeature.getUpperName()
//&&&staticSymbol&&&%>_ESETFLAG;
//&&&staticSymbol&&&          <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&            <%
if (!genModel.isSuppressNotification()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			boolean old<%
//&&&staticSymbol&&&=genFeature.getCapName()
//&&&staticSymbol&&&%>ESet = <%
//&&&staticSymbol&&&=genFeature.getUncapName()
//&&&staticSymbol&&&%>ESet;
//&&&staticSymbol&&&            <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			<%
//&&&staticSymbol&&&=genFeature.getUncapName()
//&&&staticSymbol&&&%>ESet = true;
//&&&staticSymbol&&&          <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&          <%
if (!genModel.isSuppressNotification()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			if (eNotificationRequired())
//&&&staticSymbol&&&				eNotify(new <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl")
//&&&staticSymbol&&&%>(this, <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.common.notify.Notification")
//&&&staticSymbol&&&%>.SET, <%
//&&&staticSymbol&&&=genClass.getQualifiedFeatureID(genFeature)
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=positiveOffsetCorrection
//&&&staticSymbol&&&%>, new<%
//&&&staticSymbol&&&=genFeature.getCapName()
//&&&staticSymbol&&&%>, new<%
//&&&staticSymbol&&&=genFeature.getCapName()
//&&&staticSymbol&&&%>, !old<%
//&&&staticSymbol&&&=genFeature.getCapName()
//&&&staticSymbol&&&%>ESet));
//&&&staticSymbol&&&          <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&        <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&          <%
if (!genModel.isSuppressNotification()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		else if (eNotificationRequired())
//&&&staticSymbol&&&			eNotify(new <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl")
//&&&staticSymbol&&&%>(this, <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.common.notify.Notification")
//&&&staticSymbol&&&%>.SET, <%
//&&&staticSymbol&&&=genClass.getQualifiedFeatureID(genFeature)
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=positiveOffsetCorrection
//&&&staticSymbol&&&%>, new<%
//&&&staticSymbol&&&=genFeature.getCapName()
//&&&staticSymbol&&&%>, new<%
//&&&staticSymbol&&&=genFeature.getCapName()
//&&&staticSymbol&&&%>));
//&&&staticSymbol&&&          <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&        <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&        <%
if (genClass.isFlag(genFeature)) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&          <%
if (!genModel.isSuppressNotification()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&            <%
if (genFeature.isBooleanType()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=genFeature.getImportedType(genClass)
//&&&staticSymbol&&&%> old<%
//&&&staticSymbol&&&=genFeature.getCapName()
//&&&staticSymbol&&&%> = (<%
//&&&staticSymbol&&&=genClass.getFlagsField(genFeature)
//&&&staticSymbol&&&%> & <%
//&&&staticSymbol&&&=genFeature.getUpperName()
//&&&staticSymbol&&&%>_EFLAG) != 0;
//&&&staticSymbol&&&            <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=genFeature.getImportedType(genClass)
//&&&staticSymbol&&&%> old<%
//&&&staticSymbol&&&=genFeature.getCapName()
//&&&staticSymbol&&&%> = <%
//&&&staticSymbol&&&=genFeature.getUpperName()
//&&&staticSymbol&&&%>_EFLAG_VALUES[(<%
//&&&staticSymbol&&&=genClass.getFlagsField(genFeature)
//&&&staticSymbol&&&%> & <%
//&&&staticSymbol&&&=genFeature.getUpperName()
//&&&staticSymbol&&&%>_EFLAG) >>> <%
//&&&staticSymbol&&&=genFeature.getUpperName()
//&&&staticSymbol&&&%>_EFLAG_OFFSET];
//&&&staticSymbol&&&            <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&          <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&          <%
if (genFeature.isBooleanType()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		if (new<%
//&&&staticSymbol&&&=genFeature.getCapName()
//&&&staticSymbol&&&%>) <%
//&&&staticSymbol&&&=genClass.getFlagsField(genFeature)
//&&&staticSymbol&&&%> |= <%
//&&&staticSymbol&&&=genFeature.getUpperName()
//&&&staticSymbol&&&%>_EFLAG; else <%
//&&&staticSymbol&&&=genClass.getFlagsField(genFeature)
//&&&staticSymbol&&&%> &= ~<%
//&&&staticSymbol&&&=genFeature.getUpperName()
//&&&staticSymbol&&&%>_EFLAG;
//&&&staticSymbol&&&          <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		if (new<%
//&&&staticSymbol&&&=genFeature.getCapName()
//&&&staticSymbol&&&%> == null) new<%
//&&&staticSymbol&&&=genFeature.getCapName()
//&&&staticSymbol&&&%> = <%
//&&&staticSymbol&&&=genFeature.getUpperName()
//&&&staticSymbol&&&%>_EDEFAULT;
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=genClass.getFlagsField(genFeature)
//&&&staticSymbol&&&%> = <%
//&&&staticSymbol&&&=genClass.getFlagsField(genFeature)
//&&&staticSymbol&&&%> & ~<%
//&&&staticSymbol&&&=genFeature.getUpperName()
//&&&staticSymbol&&&%>_EFLAG | <%
if (isJDK50) {
//&&&staticSymbol&&&%>new<%
//&&&staticSymbol&&&=genFeature.getCapName()
//&&&staticSymbol&&&%>.ordinal()<%
} else {
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genFeature.getImportedType(genClass)
//&&&staticSymbol&&&%>.VALUES.indexOf(new<%
//&&&staticSymbol&&&=genFeature.getCapName()
//&&&staticSymbol&&&%>)<%
}
//&&&staticSymbol&&&%> << <%
//&&&staticSymbol&&&=genFeature.getUpperName()
//&&&staticSymbol&&&%>_EFLAG_OFFSET;
//&&&staticSymbol&&&          <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&        <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&          <%
if (!genModel.isVirtualDelegation() || genFeature.isPrimitiveType()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&            <%
if (!genModel.isSuppressNotification()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=genFeature.getImportedType(genClass)
//&&&staticSymbol&&&%> old<%
//&&&staticSymbol&&&=genFeature.getCapName()
//&&&staticSymbol&&&%> = <%
//&&&staticSymbol&&&=genFeature.getSafeName()
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&            <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&          <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&          <%
if (genFeature.isEnumType()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&            <%
if (genModel.isVirtualDelegation()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=genFeature.getImportedType(genClass)
//&&&staticSymbol&&&%> <%
//&&&staticSymbol&&&=genFeature.getSafeName()
//&&&staticSymbol&&&%> = new<%
//&&&staticSymbol&&&=genFeature.getCapName()
//&&&staticSymbol&&&%> == null ? <%
//&&&staticSymbol&&&=genFeature.getEDefault()
//&&&staticSymbol&&&%> : new<%
//&&&staticSymbol&&&=genFeature.getCapName()
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&            <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=genFeature.getSafeName()
//&&&staticSymbol&&&%> = new<%
//&&&staticSymbol&&&=genFeature.getCapName()
//&&&staticSymbol&&&%> == null ? <%
//&&&staticSymbol&&&=genFeature.getEDefault()
//&&&staticSymbol&&&%> : new<%
//&&&staticSymbol&&&=genFeature.getCapName()
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&            <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&          <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&            <%
if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=genFeature.getImportedType(genClass)
//&&&staticSymbol&&&%> <%
//&&&staticSymbol&&&=genFeature.getSafeName()
//&&&staticSymbol&&&%> = <%
//&&&staticSymbol&&&=genFeature.getInternalTypeCast()
//&&&staticSymbol&&&%>new<%
//&&&staticSymbol&&&=genFeature.getCapName()
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&            <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=genFeature.getSafeName()
//&&&staticSymbol&&&%> = <%
//&&&staticSymbol&&&=genFeature.getInternalTypeCast()
//&&&staticSymbol&&&%>new<%
//&&&staticSymbol&&&=genFeature.getCapName()
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&            <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&          <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&          <%
if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		Object old<%
//&&&staticSymbol&&&=genFeature.getCapName()
//&&&staticSymbol&&&%> = eVirtualSet(<%
//&&&staticSymbol&&&=genClass.getQualifiedFeatureID(genFeature)
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=positiveOffsetCorrection
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=genFeature.getSafeName()
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&          <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&        <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&        <%
if (genFeature.isUnsettable()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&          <%
if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		boolean isSetChange = old<%
//&&&staticSymbol&&&=genFeature.getCapName()
//&&&staticSymbol&&&%> == EVIRTUAL_NO_VALUE;
//&&&staticSymbol&&&          <%
} else if (genClass.isESetFlag(genFeature)) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&            <%
if (!genModel.isSuppressNotification()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		boolean old<%
//&&&staticSymbol&&&=genFeature.getCapName()
//&&&staticSymbol&&&%>ESet = (<%
//&&&staticSymbol&&&=genClass.getESetFlagsField(genFeature)
//&&&staticSymbol&&&%> & <%
//&&&staticSymbol&&&=genFeature.getUpperName()
//&&&staticSymbol&&&%>_ESETFLAG) != 0;
//&&&staticSymbol&&&            <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=genClass.getESetFlagsField(genFeature)
//&&&staticSymbol&&&%> |= <%
//&&&staticSymbol&&&=genFeature.getUpperName()
//&&&staticSymbol&&&%>_ESETFLAG;
//&&&staticSymbol&&&          <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&            <%
if (!genModel.isSuppressNotification()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		boolean old<%
//&&&staticSymbol&&&=genFeature.getCapName()
//&&&staticSymbol&&&%>ESet = <%
//&&&staticSymbol&&&=genFeature.getUncapName()
//&&&staticSymbol&&&%>ESet;
//&&&staticSymbol&&&            <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=genFeature.getUncapName()
//&&&staticSymbol&&&%>ESet = true;
//&&&staticSymbol&&&          <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&          <%
if (!genModel.isSuppressNotification()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		if (eNotificationRequired())
//&&&staticSymbol&&&			eNotify(new <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl")
//&&&staticSymbol&&&%>(this, <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.common.notify.Notification")
//&&&staticSymbol&&&%>.SET, <%
//&&&staticSymbol&&&=genClass.getQualifiedFeatureID(genFeature)
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=positiveOffsetCorrection
//&&&staticSymbol&&&%>, <%
if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
//&&&staticSymbol&&&%>isSetChange ? <%
//&&&staticSymbol&&&=genFeature.getEDefault()
//&&&staticSymbol&&&%> : old<%
//&&&staticSymbol&&&=genFeature.getCapName()
//&&&staticSymbol&&&%><%
} else {
//&&&staticSymbol&&&%>old<%
//&&&staticSymbol&&&=genFeature.getCapName()
//&&&staticSymbol&&&%><%
}
//&&&staticSymbol&&&%>, <%
if (genClass.isFlag(genFeature)) {
//&&&staticSymbol&&&%>new<%
//&&&staticSymbol&&&=genFeature.getCapName()
//&&&staticSymbol&&&%><%
} else {
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genFeature.getSafeName()
//&&&staticSymbol&&&%><%
}
//&&&staticSymbol&&&%>, <%
if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
//&&&staticSymbol&&&%>isSetChange<%
} else {
//&&&staticSymbol&&&%>!old<%
//&&&staticSymbol&&&=genFeature.getCapName()
//&&&staticSymbol&&&%>ESet<%
}
//&&&staticSymbol&&&%>));
//&&&staticSymbol&&&          <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&        <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&          <%
if (!genModel.isSuppressNotification()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		if (eNotificationRequired())
//&&&staticSymbol&&&			eNotify(new <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl")
//&&&staticSymbol&&&%>(this, <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.common.notify.Notification")
//&&&staticSymbol&&&%>.SET, <%
//&&&staticSymbol&&&=genClass.getQualifiedFeatureID(genFeature)
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=positiveOffsetCorrection
//&&&staticSymbol&&&%>, <%
if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
//&&&staticSymbol&&&%>old<%
//&&&staticSymbol&&&=genFeature.getCapName()
//&&&staticSymbol&&&%> == EVIRTUAL_NO_VALUE ? <%
//&&&staticSymbol&&&=genFeature.getEDefault()
//&&&staticSymbol&&&%> : old<%
//&&&staticSymbol&&&=genFeature.getCapName()
//&&&staticSymbol&&&%><%
} else {
//&&&staticSymbol&&&%>old<%
//&&&staticSymbol&&&=genFeature.getCapName()
//&&&staticSymbol&&&%><%
}
//&&&staticSymbol&&&%>, <%
if (genClass.isFlag(genFeature)) {
//&&&staticSymbol&&&%>new<%
//&&&staticSymbol&&&=genFeature.getCapName()
//&&&staticSymbol&&&%><%
} else {
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genFeature.getSafeName()
//&&&staticSymbol&&&%><%
}
//&&&staticSymbol&&&%>));
//&&&staticSymbol&&&          <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&        <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
} else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
if (delegateFeature.isWrappedFeatureMapType()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		((<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap")
//&&&staticSymbol&&&%>.Internal)((<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap")
//&&&staticSymbol&&&%>.Internal.Wrapper)get<%
//&&&staticSymbol&&&=delegateFeature.getAccessorName()
//&&&staticSymbol&&&%>()).featureMap()).set(<%
//&&&staticSymbol&&&=genFeature.getQualifiedFeatureAccessor()
//&&&staticSymbol&&&%>, <%
if (!isJDK50 && genFeature.isPrimitiveType()) {
//&&&staticSymbol&&&%>new <%
//&&&staticSymbol&&&=genFeature.getObjectType(genClass)
//&&&staticSymbol&&&%>(<%
}
//&&&staticSymbol&&&%>new<%
//&&&staticSymbol&&&=genFeature.getCapName()
//&&&staticSymbol&&&%><%
if (!isJDK50 && genFeature.isPrimitiveType()) {
//&&&staticSymbol&&&%>)<%
}
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&      <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		((<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap")
//&&&staticSymbol&&&%>.Internal)get<%
//&&&staticSymbol&&&=delegateFeature.getAccessorName()
//&&&staticSymbol&&&%>()).set(<%
//&&&staticSymbol&&&=genFeature.getQualifiedFeatureAccessor()
//&&&staticSymbol&&&%>, <%
if (!isJDK50 && genFeature.isPrimitiveType()) {
//&&&staticSymbol&&&%>new <%
//&&&staticSymbol&&&=genFeature.getObjectType(genClass)
//&&&staticSymbol&&&%>(<%
}
//&&&staticSymbol&&&%>new<%
//&&&staticSymbol&&&=genFeature.getCapName()
//&&&staticSymbol&&&%><%
if (!isJDK50 && genFeature.isPrimitiveType()) {
//&&&staticSymbol&&&%>)<%
}
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&      <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
} else if (setAccessorOperation != null) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=setAccessorOperation.getBody(genModel.getIndentation(stringBuffer))
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		// TODO: implement this method to set the '<%
//&&&staticSymbol&&&=genFeature.getFormattedName()
//&&&staticSymbol&&&%>' <%
//&&&staticSymbol&&&=genFeature.getFeatureKind()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		// Ensure that you remove @generated or mark it @generated NOT
//&&&staticSymbol&&&		throw new UnsupportedOperationException();
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
if (isImplementation && !genModel.isReflectiveDelegation() && genFeature.isBasicUnset()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&<%
if (isJDK50) { //Class/basicUnsetGenFeature.annotations.insert.javajetinc
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	public <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain")
//&&&staticSymbol&&&%> basicUnset<%
//&&&staticSymbol&&&=genFeature.getAccessorName()
//&&&staticSymbol&&&%>(<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain")
//&&&staticSymbol&&&%> msgs)
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&    <%
if (genModel.isDynamicDelegation()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		return eDynamicInverseRemove((<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject")
//&&&staticSymbol&&&%>)<%
if (genFeature.isResolveProxies()) {
//&&&staticSymbol&&&%>basicGet<%
//&&&staticSymbol&&&=genFeature.getAccessorName()
//&&&staticSymbol&&&%><%
} else {
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genFeature.getGetAccessor()
//&&&staticSymbol&&&%><%
}
//&&&staticSymbol&&&%>(), <%
//&&&staticSymbol&&&=genClass.getQualifiedFeatureID(genFeature)
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=positiveOffsetCorrection
//&&&staticSymbol&&&%>, msgs);
//&&&staticSymbol&&&    <%
} else if (!genFeature.isVolatile()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
if (genModel.isVirtualDelegation()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&        <%
if (!genModel.isSuppressNotification()) {
//&&&staticSymbol&&&%>Object old<%
//&&&staticSymbol&&&=genFeature.getCapName()
//&&&staticSymbol&&&%> = <%
}
//&&&staticSymbol&&&%>eVirtualUnset(<%
//&&&staticSymbol&&&=genClass.getQualifiedFeatureID(genFeature)
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=positiveOffsetCorrection
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&      <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&        <%
if (!genModel.isSuppressNotification()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=genFeature.getImportedType(genClass)
//&&&staticSymbol&&&%> old<%
//&&&staticSymbol&&&=genFeature.getCapName()
//&&&staticSymbol&&&%> = <%
//&&&staticSymbol&&&=genFeature.getSafeName()
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&        <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=genFeature.getSafeName()
//&&&staticSymbol&&&%> = null;
//&&&staticSymbol&&&      <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
if (genModel.isVirtualDelegation()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&        <%
if (!genModel.isSuppressNotification()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		boolean isSetChange = old<%
//&&&staticSymbol&&&=genFeature.getCapName()
//&&&staticSymbol&&&%> != EVIRTUAL_NO_VALUE;
//&&&staticSymbol&&&        <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
} else if (genClass.isESetFlag(genFeature)) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&        <%
if (!genModel.isSuppressNotification()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		boolean old<%
//&&&staticSymbol&&&=genFeature.getCapName()
//&&&staticSymbol&&&%>ESet = (<%
//&&&staticSymbol&&&=genClass.getESetFlagsField(genFeature)
//&&&staticSymbol&&&%> & <%
//&&&staticSymbol&&&=genFeature.getUpperName()
//&&&staticSymbol&&&%>_ESETFLAG) != 0;
//&&&staticSymbol&&&        <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=genClass.getESetFlagsField(genFeature)
//&&&staticSymbol&&&%> &= ~<%
//&&&staticSymbol&&&=genFeature.getUpperName()
//&&&staticSymbol&&&%>_ESETFLAG;
//&&&staticSymbol&&&      <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&        <%
if (!genModel.isSuppressNotification()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		boolean old<%
//&&&staticSymbol&&&=genFeature.getCapName()
//&&&staticSymbol&&&%>ESet = <%
//&&&staticSymbol&&&=genFeature.getUncapName()
//&&&staticSymbol&&&%>ESet;
//&&&staticSymbol&&&        <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=genFeature.getUncapName()
//&&&staticSymbol&&&%>ESet = false;
//&&&staticSymbol&&&      <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&        <%
if (!genModel.isSuppressNotification()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		if (eNotificationRequired())
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl")
//&&&staticSymbol&&&%> notification = new <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl")
//&&&staticSymbol&&&%>(this, <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.common.notify.Notification")
//&&&staticSymbol&&&%>.UNSET, <%
//&&&staticSymbol&&&=genClass.getQualifiedFeatureID(genFeature)
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=positiveOffsetCorrection
//&&&staticSymbol&&&%>, <%
if (genModel.isVirtualDelegation()) {
//&&&staticSymbol&&&%>isSetChange ? old<%
//&&&staticSymbol&&&=genFeature.getCapName()
//&&&staticSymbol&&&%> : null<%
} else {
//&&&staticSymbol&&&%>old<%
//&&&staticSymbol&&&=genFeature.getCapName()
//&&&staticSymbol&&&%><%
}
//&&&staticSymbol&&&%>, null, <%
if (genModel.isVirtualDelegation()) {
//&&&staticSymbol&&&%>isSetChange<%
} else {
//&&&staticSymbol&&&%>old<%
//&&&staticSymbol&&&=genFeature.getCapName()
//&&&staticSymbol&&&%>ESet<%
}
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&			if (msgs == null) msgs = notification; else msgs.add(notification);
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&		return msgs;
//&&&staticSymbol&&&        <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		// TODO: implement this method to unset the contained '<%
//&&&staticSymbol&&&=genFeature.getFormattedName()
//&&&staticSymbol&&&%>' <%
//&&&staticSymbol&&&=genFeature.getFeatureKind()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		// -> this method is automatically invoked to keep the containment relationship in synch
//&&&staticSymbol&&&		// -> do not modify other features
//&&&staticSymbol&&&		// -> return msgs, after adding any generated Notification to it (if it is null, a NotificationChain object must be created first)
//&&&staticSymbol&&&		// Ensure that you remove @generated or mark it @generated NOT
//&&&staticSymbol&&&		throw new UnsupportedOperationException();
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
if (genFeature.isUnset() && (isImplementation || !genFeature.isSuppressedUnsetVisibility())) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
if (isInterface) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * Unsets the value of the '{@link <%
//&&&staticSymbol&&&=genClass.getQualifiedInterfaceName()
//&&&staticSymbol&&&%>#<%
//&&&staticSymbol&&&=genFeature.getGetAccessor()
//&&&staticSymbol&&&%> <em><%
//&&&staticSymbol&&&=genFeature.getFormattedName()
//&&&staticSymbol&&&%></em>}' <%
//&&&staticSymbol&&&=genFeature.getFeatureKind()
//&&&staticSymbol&&&%>.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&  <%
if (!genFeature.isSuppressedIsSetVisibility()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	 * @see #isSet<%
//&&&staticSymbol&&&=genFeature.getAccessorName()
//&&&staticSymbol&&&%>()
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	 * @see #<%
//&&&staticSymbol&&&=genFeature.getGetAccessor()
//&&&staticSymbol&&&%>()
//&&&staticSymbol&&&  <%
if (!genFeature.isListType() && !genFeature.isSuppressedSetVisibility()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	 * @see #set<%
//&&&staticSymbol&&&=genFeature.getAccessorName()
//&&&staticSymbol&&&%>(<%
//&&&staticSymbol&&&=genFeature.getRawImportedBoundType()
//&&&staticSymbol&&&%>)
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&<%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&<%
if (isJDK50) { //Class/unsetGenFeature.annotations.insert.javajetinc
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
if (!isImplementation) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	void unset<%
//&&&staticSymbol&&&=genFeature.getAccessorName()
//&&&staticSymbol&&&%>();
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	public void unset<%
//&&&staticSymbol&&&=genFeature.getAccessorName()
//&&&staticSymbol&&&%><%
if (genClass.hasCollidingUnsetAccessorOperation(genFeature)) {
//&&&staticSymbol&&&%>_<%
}
//&&&staticSymbol&&&%>()
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&    <%
if (genModel.isDynamicDelegation()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		eDynamicUnset(<%
//&&&staticSymbol&&&=genClass.getQualifiedFeatureID(genFeature)
//&&&staticSymbol&&&%><%
if (genClass.hasStaticFeatures()){
//&&&staticSymbol&&&%> - ESTATIC_FEATURE_COUNT<%
}
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=genFeature.getQualifiedFeatureAccessor()
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&    <%
} else if (genModel.isReflectiveDelegation()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		eUnset(<%
//&&&staticSymbol&&&=genFeature.getQualifiedFeatureAccessor()
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&    <%
} else if (genFeature.hasSettingDelegate()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=genFeature.getUpperName()
//&&&staticSymbol&&&%>__ESETTING_DELEGATE.dynamicUnset(this, null, 0);
//&&&staticSymbol&&&    <%
} else if (!genFeature.isVolatile()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
if (genFeature.isListType()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&        <%
if (genModel.isVirtualDelegation()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=genFeature.getImportedType(genClass)
//&&&staticSymbol&&&%> <%
//&&&staticSymbol&&&=genFeature.getSafeName()
//&&&staticSymbol&&&%> = (<%
//&&&staticSymbol&&&=genFeature.getImportedType(genClass)
//&&&staticSymbol&&&%>)eVirtualGet(<%
//&&&staticSymbol&&&=genClass.getQualifiedFeatureID(genFeature)
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=positiveOffsetCorrection
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&        <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		if (<%
//&&&staticSymbol&&&=genFeature.getSafeName()
//&&&staticSymbol&&&%> != null) ((<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList")
//&&&staticSymbol&&&%>.Unsettable<%
//&&&staticSymbol&&&=singleWildcard
//&&&staticSymbol&&&%>)<%
//&&&staticSymbol&&&=genFeature.getSafeName()
//&&&staticSymbol&&&%>).unset();
//&&&staticSymbol&&&      <%
} else if (genFeature.isBidirectional() || genFeature.isEffectiveContains()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&        <%
if (genModel.isVirtualDelegation()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=genFeature.getImportedType(genClass)
//&&&staticSymbol&&&%> <%
//&&&staticSymbol&&&=genFeature.getSafeName()
//&&&staticSymbol&&&%> = (<%
//&&&staticSymbol&&&=genFeature.getImportedType(genClass)
//&&&staticSymbol&&&%>)eVirtualGet(<%
//&&&staticSymbol&&&=genClass.getQualifiedFeatureID(genFeature)
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=positiveOffsetCorrection
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&        <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		if (<%
//&&&staticSymbol&&&=genFeature.getSafeName()
//&&&staticSymbol&&&%> != null)
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain")
//&&&staticSymbol&&&%> msgs = null;
//&&&staticSymbol&&&        <%
if (!genFeature.isBidirectional()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			msgs = ((<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject")
//&&&staticSymbol&&&%>)<%
//&&&staticSymbol&&&=genFeature.getSafeName()
//&&&staticSymbol&&&%>).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - <%
//&&&staticSymbol&&&=genClass.getQualifiedFeatureID(genFeature)
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=negativeOffsetCorrection
//&&&staticSymbol&&&%>, null, msgs);
//&&&staticSymbol&&&        <%
} else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(genFeature) : "";
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			msgs = ((<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject")
//&&&staticSymbol&&&%>)<%
//&&&staticSymbol&&&=genFeature.getSafeName()
//&&&staticSymbol&&&%>).eInverseRemove(this, <%
//&&&staticSymbol&&&=targetClass.getQualifiedFeatureID(reverseFeature)
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=reverseOffsetCorrection
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=targetClass.getRawImportedInterfaceName()
//&&&staticSymbol&&&%>.class, msgs);
//&&&staticSymbol&&&        <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			msgs = basicUnset<%
//&&&staticSymbol&&&=genFeature.getAccessorName()
//&&&staticSymbol&&&%>(msgs);
//&&&staticSymbol&&&			if (msgs != null) msgs.dispatch();
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&		else
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&        <%
if (genModel.isVirtualDelegation()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			boolean old<%
//&&&staticSymbol&&&=genFeature.getCapName()
//&&&staticSymbol&&&%>ESet = eVirtualIsSet(<%
//&&&staticSymbol&&&=genClass.getQualifiedFeatureID(genFeature)
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=positiveOffsetCorrection
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&        <%
} else if (genClass.isESetFlag(genFeature)) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&          <%
if (!genModel.isSuppressNotification()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			boolean old<%
//&&&staticSymbol&&&=genFeature.getCapName()
//&&&staticSymbol&&&%>ESet = (<%
//&&&staticSymbol&&&=genClass.getESetFlagsField(genFeature)
//&&&staticSymbol&&&%> & <%
//&&&staticSymbol&&&=genFeature.getUpperName()
//&&&staticSymbol&&&%>_ESETFLAG) != 0;
//&&&staticSymbol&&&          <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			<%
//&&&staticSymbol&&&=genClass.getESetFlagsField(genFeature)
//&&&staticSymbol&&&%> &= ~<%
//&&&staticSymbol&&&=genFeature.getUpperName()
//&&&staticSymbol&&&%>_ESETFLAG;
//&&&staticSymbol&&&        <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&          <%
if (!genModel.isSuppressNotification()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			boolean old<%
//&&&staticSymbol&&&=genFeature.getCapName()
//&&&staticSymbol&&&%>ESet = <%
//&&&staticSymbol&&&=genFeature.getUncapName()
//&&&staticSymbol&&&%>ESet;
//&&&staticSymbol&&&          <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			<%
//&&&staticSymbol&&&=genFeature.getUncapName()
//&&&staticSymbol&&&%>ESet = false;
//&&&staticSymbol&&&        <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&        <%
if (!genModel.isSuppressNotification()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			if (eNotificationRequired())
//&&&staticSymbol&&&				eNotify(new <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl")
//&&&staticSymbol&&&%>(this, <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.common.notify.Notification")
//&&&staticSymbol&&&%>.UNSET, <%
//&&&staticSymbol&&&=genClass.getQualifiedFeatureID(genFeature)
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=positiveOffsetCorrection
//&&&staticSymbol&&&%>, null, null, old<%
//&&&staticSymbol&&&=genFeature.getCapName()
//&&&staticSymbol&&&%>ESet));
//&&&staticSymbol&&&        <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&      <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&        <%
if (genClass.isFlag(genFeature)) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&          <%
if (!genModel.isSuppressNotification()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&            <%
if (genFeature.isBooleanType()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=genFeature.getImportedType(genClass)
//&&&staticSymbol&&&%> old<%
//&&&staticSymbol&&&=genFeature.getCapName()
//&&&staticSymbol&&&%> = (<%
//&&&staticSymbol&&&=genClass.getFlagsField(genFeature)
//&&&staticSymbol&&&%> & <%
//&&&staticSymbol&&&=genFeature.getUpperName()
//&&&staticSymbol&&&%>_EFLAG) != 0;
//&&&staticSymbol&&&            <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=genFeature.getImportedType(genClass)
//&&&staticSymbol&&&%> old<%
//&&&staticSymbol&&&=genFeature.getCapName()
//&&&staticSymbol&&&%> = <%
//&&&staticSymbol&&&=genFeature.getUpperName()
//&&&staticSymbol&&&%>_EFLAG_VALUES[(<%
//&&&staticSymbol&&&=genClass.getFlagsField(genFeature)
//&&&staticSymbol&&&%> & <%
//&&&staticSymbol&&&=genFeature.getUpperName()
//&&&staticSymbol&&&%>_EFLAG) >>> <%
//&&&staticSymbol&&&=genFeature.getUpperName()
//&&&staticSymbol&&&%>_EFLAG_OFFSET];
//&&&staticSymbol&&&            <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&          <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&        <%
} else if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		Object old<%
//&&&staticSymbol&&&=genFeature.getCapName()
//&&&staticSymbol&&&%> = eVirtualUnset(<%
//&&&staticSymbol&&&=genClass.getQualifiedFeatureID(genFeature)
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=positiveOffsetCorrection
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&        <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&          <%
if (!genModel.isSuppressNotification()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=genFeature.getImportedType(genClass)
//&&&staticSymbol&&&%> old<%
//&&&staticSymbol&&&=genFeature.getCapName()
//&&&staticSymbol&&&%> = <%
//&&&staticSymbol&&&=genFeature.getSafeName()
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&          <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&        <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&       <%
if (!genModel.isSuppressNotification()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&        <%
if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		boolean isSetChange = old<%
//&&&staticSymbol&&&=genFeature.getCapName()
//&&&staticSymbol&&&%> != EVIRTUAL_NO_VALUE;
//&&&staticSymbol&&&          <%
} else if (genClass.isESetFlag(genFeature)) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		boolean old<%
//&&&staticSymbol&&&=genFeature.getCapName()
//&&&staticSymbol&&&%>ESet = (<%
//&&&staticSymbol&&&=genClass.getESetFlagsField(genFeature)
//&&&staticSymbol&&&%> & <%
//&&&staticSymbol&&&=genFeature.getUpperName()
//&&&staticSymbol&&&%>_ESETFLAG) != 0;
//&&&staticSymbol&&&          <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		boolean old<%
//&&&staticSymbol&&&=genFeature.getCapName()
//&&&staticSymbol&&&%>ESet = <%
//&&&staticSymbol&&&=genFeature.getUncapName()
//&&&staticSymbol&&&%>ESet;
//&&&staticSymbol&&&          <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&        <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&        <%
if (genFeature.isReferenceType()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=genFeature.getSafeName()
//&&&staticSymbol&&&%> = null;
//&&&staticSymbol&&&          <%
if (!genModel.isVirtualDelegation()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&            <%
if (genClass.isESetFlag(genFeature)) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=genClass.getESetFlagsField(genFeature)
//&&&staticSymbol&&&%> &= ~<%
//&&&staticSymbol&&&=genFeature.getUpperName()
//&&&staticSymbol&&&%>_ESETFLAG;
//&&&staticSymbol&&&            <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=genFeature.getUncapName()
//&&&staticSymbol&&&%>ESet = false;
//&&&staticSymbol&&&            <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&          <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&          <%
if (!genModel.isSuppressNotification()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		if (eNotificationRequired())
//&&&staticSymbol&&&			eNotify(new <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl")
//&&&staticSymbol&&&%>(this, <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.common.notify.Notification")
//&&&staticSymbol&&&%>.UNSET, <%
//&&&staticSymbol&&&=genClass.getQualifiedFeatureID(genFeature)
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=positiveOffsetCorrection
//&&&staticSymbol&&&%>, <%
if (genModel.isVirtualDelegation()) {
//&&&staticSymbol&&&%>isSetChange ? old<%
//&&&staticSymbol&&&=genFeature.getCapName()
//&&&staticSymbol&&&%> : null<%
} else {
//&&&staticSymbol&&&%>old<%
//&&&staticSymbol&&&=genFeature.getCapName()
//&&&staticSymbol&&&%><%
}
//&&&staticSymbol&&&%>, null, <%
if (genModel.isVirtualDelegation()) {
//&&&staticSymbol&&&%>isSetChange<%
} else {
//&&&staticSymbol&&&%>old<%
//&&&staticSymbol&&&=genFeature.getCapName()
//&&&staticSymbol&&&%>ESet<%
}
//&&&staticSymbol&&&%>));
//&&&staticSymbol&&&          <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&        <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&          <%
if (genClass.isFlag(genFeature)) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&            <%
if (genFeature.isBooleanType()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		if (<%
//&&&staticSymbol&&&=genFeature.getEDefault()
//&&&staticSymbol&&&%>) <%
//&&&staticSymbol&&&=genClass.getFlagsField(genFeature)
//&&&staticSymbol&&&%> |= <%
//&&&staticSymbol&&&=genFeature.getUpperName()
//&&&staticSymbol&&&%>_EFLAG; else <%
//&&&staticSymbol&&&=genClass.getFlagsField(genFeature)
//&&&staticSymbol&&&%> &= ~<%
//&&&staticSymbol&&&=genFeature.getUpperName()
//&&&staticSymbol&&&%>_EFLAG;
//&&&staticSymbol&&&            <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=genClass.getFlagsField(genFeature)
//&&&staticSymbol&&&%> = <%
//&&&staticSymbol&&&=genClass.getFlagsField(genFeature)
//&&&staticSymbol&&&%> & ~<%
//&&&staticSymbol&&&=genFeature.getUpperName()
//&&&staticSymbol&&&%>_EFLAG | <%
//&&&staticSymbol&&&=genFeature.getUpperName()
//&&&staticSymbol&&&%>_EFLAG_DEFAULT;
//&&&staticSymbol&&&            <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&          <%
} else if (!genModel.isVirtualDelegation() || genFeature.isPrimitiveType()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=genFeature.getSafeName()
//&&&staticSymbol&&&%> = <%
//&&&staticSymbol&&&=genFeature.getEDefault()
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&          <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&          <%
if (!genModel.isVirtualDelegation() || genFeature.isPrimitiveType()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&            <%
if (genClass.isESetFlag(genFeature)) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=genClass.getESetFlagsField(genFeature)
//&&&staticSymbol&&&%> &= ~<%
//&&&staticSymbol&&&=genFeature.getUpperName()
//&&&staticSymbol&&&%>_ESETFLAG;
//&&&staticSymbol&&&            <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=genFeature.getUncapName()
//&&&staticSymbol&&&%>ESet = false;
//&&&staticSymbol&&&            <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&          <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&          <%
if (!genModel.isSuppressNotification()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		if (eNotificationRequired())
//&&&staticSymbol&&&			eNotify(new <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl")
//&&&staticSymbol&&&%>(this, <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.common.notify.Notification")
//&&&staticSymbol&&&%>.UNSET, <%
//&&&staticSymbol&&&=genClass.getQualifiedFeatureID(genFeature)
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=positiveOffsetCorrection
//&&&staticSymbol&&&%>, <%
if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
//&&&staticSymbol&&&%>isSetChange ? old<%
//&&&staticSymbol&&&=genFeature.getCapName()
//&&&staticSymbol&&&%> : <%
//&&&staticSymbol&&&=genFeature.getEDefault()
//&&&staticSymbol&&&%><%
} else {
//&&&staticSymbol&&&%>old<%
//&&&staticSymbol&&&=genFeature.getCapName()
//&&&staticSymbol&&&%><%
}
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=genFeature.getEDefault()
//&&&staticSymbol&&&%>, <%
if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
//&&&staticSymbol&&&%>isSetChange<%
} else {
//&&&staticSymbol&&&%>old<%
//&&&staticSymbol&&&=genFeature.getCapName()
//&&&staticSymbol&&&%>ESet<%
}
//&&&staticSymbol&&&%>));
//&&&staticSymbol&&&          <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&        <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
} else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
if (delegateFeature.isWrappedFeatureMapType()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		((<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap")
//&&&staticSymbol&&&%>.Internal)((<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap")
//&&&staticSymbol&&&%>.Internal.Wrapper)get<%
//&&&staticSymbol&&&=delegateFeature.getAccessorName()
//&&&staticSymbol&&&%>()).featureMap()).clear(<%
//&&&staticSymbol&&&=genFeature.getQualifiedFeatureAccessor()
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&      <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		((<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap")
//&&&staticSymbol&&&%>.Internal)get<%
//&&&staticSymbol&&&=delegateFeature.getAccessorName()
//&&&staticSymbol&&&%>()).clear(<%
//&&&staticSymbol&&&=genFeature.getQualifiedFeatureAccessor()
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&      <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
} else if (genClass.getUnsetAccessorOperation(genFeature) != null) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=genClass.getUnsetAccessorOperation(genFeature).getBody(genModel.getIndentation(stringBuffer))
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		// TODO: implement this method to unset the '<%
//&&&staticSymbol&&&=genFeature.getFormattedName()
//&&&staticSymbol&&&%>' <%
//&&&staticSymbol&&&=genFeature.getFeatureKind()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		// Ensure that you remove @generated or mark it @generated NOT
//&&&staticSymbol&&&		throw new UnsupportedOperationException();
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
if (genFeature.isIsSet() && (isImplementation || !genFeature.isSuppressedIsSetVisibility())) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
if (isInterface) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * Returns whether the value of the '{@link <%
//&&&staticSymbol&&&=genClass.getQualifiedInterfaceName()
//&&&staticSymbol&&&%>#<%
//&&&staticSymbol&&&=genFeature.getGetAccessor()
//&&&staticSymbol&&&%> <em><%
//&&&staticSymbol&&&=genFeature.getFormattedName()
//&&&staticSymbol&&&%></em>}' <%
//&&&staticSymbol&&&=genFeature.getFeatureKind()
//&&&staticSymbol&&&%> is set.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @return whether the value of the '<em><%
//&&&staticSymbol&&&=genFeature.getFormattedName()
//&&&staticSymbol&&&%></em>' <%
//&&&staticSymbol&&&=genFeature.getFeatureKind()
//&&&staticSymbol&&&%> is set.
//&&&staticSymbol&&&    <%
if (genFeature.isChangeable() && !genFeature.isSuppressedUnsetVisibility()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	 * @see #unset<%
//&&&staticSymbol&&&=genFeature.getAccessorName()
//&&&staticSymbol&&&%>()
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	 * @see #<%
//&&&staticSymbol&&&=genFeature.getGetAccessor()
//&&&staticSymbol&&&%>()
//&&&staticSymbol&&&    <%
if (!genFeature.isListType() && genFeature.isChangeable() && !genFeature.isSuppressedSetVisibility()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	 * @see #set<%
//&&&staticSymbol&&&=genFeature.getAccessorName()
//&&&staticSymbol&&&%>(<%
//&&&staticSymbol&&&=genFeature.getRawImportedBoundType()
//&&&staticSymbol&&&%>)
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&<%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&<%
if (isJDK50) { //Class/isSetGenFeature.annotations.insert.javajetinc
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
if (!isImplementation) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	boolean isSet<%
//&&&staticSymbol&&&=genFeature.getAccessorName()
//&&&staticSymbol&&&%>();
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	public boolean isSet<%
//&&&staticSymbol&&&=genFeature.getAccessorName()
//&&&staticSymbol&&&%><%
if (genClass.hasCollidingIsSetAccessorOperation(genFeature)) {
//&&&staticSymbol&&&%>_<%
}
//&&&staticSymbol&&&%>()
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&    <%
if (genModel.isDynamicDelegation()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		return eDynamicIsSet(<%
//&&&staticSymbol&&&=genClass.getQualifiedFeatureID(genFeature)
//&&&staticSymbol&&&%><%
if (genClass.hasStaticFeatures()){
//&&&staticSymbol&&&%> - ESTATIC_FEATURE_COUNT<%
}
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=genFeature.getQualifiedFeatureAccessor()
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&    <%
} else if (genModel.isReflectiveDelegation()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		return eIsSet(<%
//&&&staticSymbol&&&=genFeature.getQualifiedFeatureAccessor()
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&    <%
} else if (genFeature.hasSettingDelegate()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		return <%
//&&&staticSymbol&&&=genFeature.getUpperName()
//&&&staticSymbol&&&%>__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
//&&&staticSymbol&&&    <%
} else if (!genFeature.isVolatile()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
if (genFeature.isListType()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&        <%
if (genModel.isVirtualDelegation()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=genFeature.getImportedType(genClass)
//&&&staticSymbol&&&%> <%
//&&&staticSymbol&&&=genFeature.getSafeName()
//&&&staticSymbol&&&%> = (<%
//&&&staticSymbol&&&=genFeature.getImportedType(genClass)
//&&&staticSymbol&&&%>)eVirtualGet(<%
//&&&staticSymbol&&&=genClass.getQualifiedFeatureID(genFeature)
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=positiveOffsetCorrection
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&        <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		return <%
//&&&staticSymbol&&&=genFeature.getSafeName()
//&&&staticSymbol&&&%> != null && ((<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList")
//&&&staticSymbol&&&%>.Unsettable<%
//&&&staticSymbol&&&=singleWildcard
//&&&staticSymbol&&&%>)<%
//&&&staticSymbol&&&=genFeature.getSafeName()
//&&&staticSymbol&&&%>).isSet();
//&&&staticSymbol&&&      <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&        <%
if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		return eVirtualIsSet(<%
//&&&staticSymbol&&&=genClass.getQualifiedFeatureID(genFeature)
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=positiveOffsetCorrection
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&        <%
} else if (genClass.isESetFlag(genFeature)) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		return (<%
//&&&staticSymbol&&&=genClass.getESetFlagsField(genFeature)
//&&&staticSymbol&&&%> & <%
//&&&staticSymbol&&&=genFeature.getUpperName()
//&&&staticSymbol&&&%>_ESETFLAG) != 0;
//&&&staticSymbol&&&        <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		return <%
//&&&staticSymbol&&&=genFeature.getUncapName()
//&&&staticSymbol&&&%>ESet;
//&&&staticSymbol&&&        <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
} else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
if (delegateFeature.isWrappedFeatureMapType()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		return !((<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap")
//&&&staticSymbol&&&%>.Internal)((<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap")
//&&&staticSymbol&&&%>.Internal.Wrapper)get<%
//&&&staticSymbol&&&=delegateFeature.getAccessorName()
//&&&staticSymbol&&&%>()).featureMap()).isEmpty(<%
//&&&staticSymbol&&&=genFeature.getQualifiedFeatureAccessor()
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&      <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		return !((<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap")
//&&&staticSymbol&&&%>.Internal)get<%
//&&&staticSymbol&&&=delegateFeature.getAccessorName()
//&&&staticSymbol&&&%>()).isEmpty(<%
//&&&staticSymbol&&&=genFeature.getQualifiedFeatureAccessor()
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&      <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
} else if (genClass.getIsSetAccessorOperation(genFeature) != null) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=genClass.getIsSetAccessorOperation(genFeature).getBody(genModel.getIndentation(stringBuffer))
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		// TODO: implement this method to return whether the '<%
//&&&staticSymbol&&&=genFeature.getFormattedName()
//&&&staticSymbol&&&%>' <%
//&&&staticSymbol&&&=genFeature.getFeatureKind()
//&&&staticSymbol&&&%> is set
//&&&staticSymbol&&&		// Ensure that you remove @generated or mark it @generated NOT
//&&&staticSymbol&&&		throw new UnsupportedOperationException();
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
}//for
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%

//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
for (GenOperation genOperation : (isImplementation ? genClass.getImplementedGenOperations() : genClass.getDeclaredGenOperations())) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
if (isImplementation) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
if (genOperation.isInvariant() && genOperation.hasInvariantExpression()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * The cached validation expression for the '{@link #<%
//&&&staticSymbol&&&=genOperation.getName()
//&&&staticSymbol&&&%>(<%
//&&&staticSymbol&&&=genOperation.getParameterTypes(", ")
//&&&staticSymbol&&&%>) <em><%
//&&&staticSymbol&&&=genOperation.getFormattedName()
//&&&staticSymbol&&&%></em>}' invariant operation.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @see #<%
//&&&staticSymbol&&&=genOperation.getName()
//&&&staticSymbol&&&%>(<%
//&&&staticSymbol&&&=genOperation.getParameterTypes(", ")
//&&&staticSymbol&&&%>)
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 * @ordered
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	protected static final <%
//&&&staticSymbol&&&=genModel.getImportedName("java.lang.String")
//&&&staticSymbol&&&%> <%
//&&&staticSymbol&&&=CodeGenUtil.upperName(genClass.getUniqueName(genOperation), genModel.getLocale())
//&&&staticSymbol&&&%>__EEXPRESSION = "<%
//&&&staticSymbol&&&=genOperation.getInvariantExpression("\t\t")
//&&&staticSymbol&&&%>";<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&    <%
} else if (genOperation.hasInvocationDelegate()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * The cached invocation delegate for the '{@link #<%
//&&&staticSymbol&&&=genOperation.getName()
//&&&staticSymbol&&&%>(<%
//&&&staticSymbol&&&=genOperation.getParameterTypes(", ")
//&&&staticSymbol&&&%>) <em><%
//&&&staticSymbol&&&=genOperation.getFormattedName()
//&&&staticSymbol&&&%></em>}' operation.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @see #<%
//&&&staticSymbol&&&=genOperation.getName()
//&&&staticSymbol&&&%>(<%
//&&&staticSymbol&&&=genOperation.getParameterTypes(", ")
//&&&staticSymbol&&&%>)
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 * @ordered
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	protected static final <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.EOperation")
//&&&staticSymbol&&&%>.Internal.InvocationDelegate <%
//&&&staticSymbol&&&=CodeGenUtil.upperName(genClass.getUniqueName(genOperation), genModel.getLocale())
//&&&staticSymbol&&&%>__EINVOCATION_DELEGATE = ((<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.EOperation")
//&&&staticSymbol&&&%>.Internal)<%
//&&&staticSymbol&&&=genOperation.getQualifiedOperationAccessor()
//&&&staticSymbol&&&%>).getInvocationDelegate();
//&&&staticSymbol&&&
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
if (isInterface) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&  <%
if (genOperation.hasDocumentation() || genOperation.hasParameterDocumentation()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	 * <!-- begin-model-doc -->
//&&&staticSymbol&&&    <%
if (genOperation.hasDocumentation()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	 * <%
//&&&staticSymbol&&&=genOperation.getDocumentation(genModel.getIndentation(stringBuffer))
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
for (GenParameter genParameter : genOperation.getGenParameters()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
if (genParameter.hasDocumentation()) { String documentation = genParameter.getDocumentation("");
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&        <%
if (documentation.contains("\n") || documentation.contains("\r")) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	 * @param <%
//&&&staticSymbol&&&=genParameter.getName()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	 *   <%
//&&&staticSymbol&&&=genParameter.getDocumentation(genModel.getIndentation(stringBuffer))
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&        <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	 * @param <%
//&&&staticSymbol&&&=genParameter.getName()
//&&&staticSymbol&&&%> <%
//&&&staticSymbol&&&=genParameter.getDocumentation(genModel.getIndentation(stringBuffer))
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&        <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	 * <!-- end-model-doc -->
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
if (!genModel.isSuppressEMFModelTags()) { boolean first = true; for (StringTokenizer stringTokenizer = new StringTokenizer(genOperation.getModelInfo(), "\n\r"); stringTokenizer.hasMoreTokens(); ) { String modelInfo = stringTokenizer.nextToken(); if (first) { first = false;
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	 * @model <%
//&&&staticSymbol&&&=modelInfo
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	 *        <%
//&&&staticSymbol&&&=modelInfo
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
}} if (first) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	 * @model
//&&&staticSymbol&&&  <%
}}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&<%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&<%
if (isJDK50) { //Class/genOperation.annotations.insert.javajetinc
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
if (!isImplementation) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	<%
//&&&staticSymbol&&&=genOperation.getTypeParameters(genClass)
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genOperation.getImportedType(genClass)
//&&&staticSymbol&&&%> <%
//&&&staticSymbol&&&=genOperation.getName()
//&&&staticSymbol&&&%>(<%
//&&&staticSymbol&&&=genOperation.getParameters(genClass)
//&&&staticSymbol&&&%>)<%
//&&&staticSymbol&&&=genOperation.getThrows(genClass)
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
if (genModel.useGenerics() && !genOperation.hasBody() && !genOperation.isInvariant() && genOperation.hasInvocationDelegate() && genOperation.isUncheckedCast(genClass)) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	@SuppressWarnings("unchecked")
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	public <%
//&&&staticSymbol&&&=genOperation.getTypeParameters(genClass)
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genOperation.getImportedType(genClass)
//&&&staticSymbol&&&%> <%
//&&&staticSymbol&&&=genOperation.getName()
//&&&staticSymbol&&&%>(<%
//&&&staticSymbol&&&=genOperation.getParameters(isImplementation, genClass)
//&&&staticSymbol&&&%>)<%
//&&&staticSymbol&&&=genOperation.getThrows(genClass)
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&  <%
if (genOperation.hasBody()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=genOperation.getBody(genModel.getIndentation(stringBuffer))
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
} else if (genOperation.isInvariant()) {GenClass opClass = genOperation.getGenClass(); String diagnostics = genOperation.getGenParameters().get(0).getName(); String context = genOperation.getGenParameters().get(1).getName();
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
if (genOperation.hasInvariantExpression()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		return
//&&&staticSymbol&&&			<%
//&&&staticSymbol&&&=opClass.getGenPackage().getImportedValidatorClassName()
//&&&staticSymbol&&&%>.validate
//&&&staticSymbol&&&				(<%
//&&&staticSymbol&&&=genClass.getQualifiedClassifierAccessor()
//&&&staticSymbol&&&%>,
//&&&staticSymbol&&&				 this,
//&&&staticSymbol&&&				 <%
//&&&staticSymbol&&&=diagnostics
//&&&staticSymbol&&&%>,
//&&&staticSymbol&&&				 <%
//&&&staticSymbol&&&=context
//&&&staticSymbol&&&%>,
//&&&staticSymbol&&&				 "<%
//&&&staticSymbol&&&=genOperation.getValidationDelegate()
//&&&staticSymbol&&&%>",<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				 <%
//&&&staticSymbol&&&=genOperation.getQualifiedOperationAccessor()
//&&&staticSymbol&&&%>,
//&&&staticSymbol&&&				 <%
//&&&staticSymbol&&&=CodeGenUtil.upperName(genClass.getUniqueName(genOperation), genModel.getLocale())
//&&&staticSymbol&&&%>__EEXPRESSION,
//&&&staticSymbol&&&				 <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.common.util.Diagnostic")
//&&&staticSymbol&&&%>.ERROR,
//&&&staticSymbol&&&				 <%
//&&&staticSymbol&&&=opClass.getGenPackage().getImportedValidatorClassName()
//&&&staticSymbol&&&%>.DIAGNOSTIC_SOURCE,
//&&&staticSymbol&&&				 <%
//&&&staticSymbol&&&=opClass.getGenPackage().getImportedValidatorClassName()
//&&&staticSymbol&&&%>.<%
//&&&staticSymbol&&&=opClass.getOperationID(genOperation)
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&    <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		// TODO: implement this method
//&&&staticSymbol&&&		// -> specify the condition that violates the invariant
//&&&staticSymbol&&&		// -> verify the details of the diagnostic, including severity and message
//&&&staticSymbol&&&		// Ensure that you remove @generated or mark it @generated NOT
//&&&staticSymbol&&&		if (false)
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			if (<%
//&&&staticSymbol&&&=diagnostics
//&&&staticSymbol&&&%> != null)
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&				<%
//&&&staticSymbol&&&=diagnostics
//&&&staticSymbol&&&%>.add
//&&&staticSymbol&&&					(new <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.common.util.BasicDiagnostic")
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&						(<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.common.util.Diagnostic")
//&&&staticSymbol&&&%>.ERROR,
//&&&staticSymbol&&&						 <%
//&&&staticSymbol&&&=opClass.getGenPackage().getImportedValidatorClassName()
//&&&staticSymbol&&&%>.DIAGNOSTIC_SOURCE,
//&&&staticSymbol&&&						 <%
//&&&staticSymbol&&&=opClass.getGenPackage().getImportedValidatorClassName()
//&&&staticSymbol&&&%>.<%
//&&&staticSymbol&&&=opClass.getOperationID(genOperation)
//&&&staticSymbol&&&%>,
//&&&staticSymbol&&&						 <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.plugin.EcorePlugin")
//&&&staticSymbol&&&%>.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "<%
//&&&staticSymbol&&&=genOperation.getName()
//&&&staticSymbol&&&%>", <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.util.EObjectValidator")
//&&&staticSymbol&&&%>.getObjectLabel(this, <%
//&&&staticSymbol&&&=context
//&&&staticSymbol&&&%>) }),<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genModel.getNonNLS(2)
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&						 new Object [] { this }));
//&&&staticSymbol&&&			}
//&&&staticSymbol&&&			return false;
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&		return true;
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
} else if (genOperation.hasInvocationDelegate()) { int size = genOperation.getGenParameters().size();
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		try
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&    <%
if (genOperation.isVoid()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			<%
//&&&staticSymbol&&&=CodeGenUtil.upperName(genClass.getUniqueName(genOperation), genModel.getLocale())
//&&&staticSymbol&&&%>__EINVOCATION_DELEGATE.dynamicInvoke(this, <%
if (size > 0) {
//&&&staticSymbol&&&%>new <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.common.util.BasicEList")
//&&&staticSymbol&&&%>.UnmodifiableEList<Object>(<%
//&&&staticSymbol&&&=size
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=genOperation.getParametersArray(genClass)
//&&&staticSymbol&&&%>)<%
} else {
//&&&staticSymbol&&&%>null<%
}
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&    <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			return <%
if (!isJDK50 && genOperation.isPrimitiveType()) {
//&&&staticSymbol&&&%>(<%
}
//&&&staticSymbol&&&%>(<%
//&&&staticSymbol&&&=genOperation.getObjectType(genClass)
//&&&staticSymbol&&&%>)<%
//&&&staticSymbol&&&=CodeGenUtil.upperName(genClass.getUniqueName(genOperation), genModel.getLocale())
//&&&staticSymbol&&&%>__EINVOCATION_DELEGATE.dynamicInvoke(this, <%
if (size > 0) {
//&&&staticSymbol&&&%>new <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.common.util.BasicEList")
//&&&staticSymbol&&&%>.UnmodifiableEList<Object>(<%
//&&&staticSymbol&&&=size
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=genOperation.getParametersArray(genClass)
//&&&staticSymbol&&&%>)<%
} else {
//&&&staticSymbol&&&%>null<%
}
//&&&staticSymbol&&&%>)<%
if (!isJDK50 && genOperation.isPrimitiveType()) {
//&&&staticSymbol&&&%>).<%
//&&&staticSymbol&&&=genOperation.getPrimitiveValueFunction()
//&&&staticSymbol&&&%>()<%
}
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&		catch (<%
//&&&staticSymbol&&&*%%storeSymbol%%*8
//&&&staticSymbol&&&%> ite)
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			throw new <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.common.util.WrappedException")
//&&&staticSymbol&&&%>(ite);
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&  <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		// TODO: implement this method
//&&&staticSymbol&&&		// Ensure that you remove @generated or mark it @generated NOT
//&&&staticSymbol&&&		throw new UnsupportedOperationException();
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
}//for
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEInverseAddGenFeatures())) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&  <%
if (genModel.useGenerics()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
for (GenFeature genFeature : genClass.getEInverseAddGenFeatures()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
if (genFeature.isUncheckedCast(genClass)) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	@SuppressWarnings("unchecked")
//&&&staticSymbol&&&      <%
break; }
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
if (genModel.useClassOverrideAnnotation()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	@Override
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	public <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain")
//&&&staticSymbol&&&%> eInverseAdd(<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject")
//&&&staticSymbol&&&%> otherEnd, int featureID, <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain")
//&&&staticSymbol&&&%> msgs)
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		switch (featureID<%
//&&&staticSymbol&&&=negativeOffsetCorrection
//&&&staticSymbol&&&%>)
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&<%
for (GenFeature genFeature : genClass.getEInverseAddGenFeatures()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			case <%
//&&&staticSymbol&&&=genClass.getQualifiedFeatureID(genFeature)
//&&&staticSymbol&&&%>:
//&&&staticSymbol&&&  <%
if (genFeature.isListType()) { String cast = "("  + genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList") + (!genModel.useGenerics() ? ")" : "<" + genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject") + ">)(" + genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList") + "<?>)");
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
if (genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				return ((<%
//&&&staticSymbol&&&=cast
//&&&staticSymbol&&&%>(<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.common.util.EMap")
//&&&staticSymbol&&&%>.InternalMapView<%
//&&&staticSymbol&&&=genFeature.getImportedMapTemplateArguments(genClass)
//&&&staticSymbol&&&%>)<%
//&&&staticSymbol&&&=genFeature.getGetAccessor()
//&&&staticSymbol&&&%>()).eMap()).basicAdd(otherEnd, msgs);
//&&&staticSymbol&&&    <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				return (<%
//&&&staticSymbol&&&=cast
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genFeature.getGetAccessor()
//&&&staticSymbol&&&%>()).basicAdd(otherEnd, msgs);
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
} else if (genFeature.isContainer()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				if (eInternalContainer() != null)
//&&&staticSymbol&&&					msgs = eBasicRemoveFromContainer(msgs);
//&&&staticSymbol&&&    <%
if (genFeature.isBasicSet()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				return basicSet<%
//&&&staticSymbol&&&=genFeature.getAccessorName()
//&&&staticSymbol&&&%>((<%
//&&&staticSymbol&&&=genFeature.getImportedType(genClass)
//&&&staticSymbol&&&%>)otherEnd, msgs);
//&&&staticSymbol&&&    <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				return eBasicSetContainer(otherEnd, <%
//&&&staticSymbol&&&=genClass.getQualifiedFeatureID(genFeature)
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=positiveOffsetCorrection
//&&&staticSymbol&&&%>, msgs);
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
if (genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				<%
//&&&staticSymbol&&&=genFeature.getImportedType(genClass)
//&&&staticSymbol&&&%> <%
//&&&staticSymbol&&&=genFeature.getSafeName()
//&&&staticSymbol&&&%> = (<%
//&&&staticSymbol&&&=genFeature.getImportedType(genClass)
//&&&staticSymbol&&&%>)eVirtualGet(<%
//&&&staticSymbol&&&=genClass.getQualifiedFeatureID(genFeature)
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=positiveOffsetCorrection
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&    <%
} else if (genFeature.isVolatile() || genClass.getImplementingGenModel(genFeature).isDynamicDelegation()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				<%
//&&&staticSymbol&&&=genFeature.getImportedType(genClass)
//&&&staticSymbol&&&%> <%
//&&&staticSymbol&&&=genFeature.getSafeName()
//&&&staticSymbol&&&%> = <%
if (genFeature.isResolveProxies()) {
//&&&staticSymbol&&&%>basicGet<%
//&&&staticSymbol&&&=genFeature.getAccessorName()
//&&&staticSymbol&&&%><%
} else {
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genFeature.getGetAccessor()
//&&&staticSymbol&&&%><%
}
//&&&staticSymbol&&&%>();
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				if (<%
//&&&staticSymbol&&&=genFeature.getSafeName()
//&&&staticSymbol&&&%> != null)
//&&&staticSymbol&&&    <%
if (genFeature.isEffectiveContains()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&					msgs = ((<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject")
//&&&staticSymbol&&&%>)<%
//&&&staticSymbol&&&=genFeature.getSafeName()
//&&&staticSymbol&&&%>).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - <%
//&&&staticSymbol&&&=genClass.getQualifiedFeatureID(genFeature)
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=negativeOffsetCorrection
//&&&staticSymbol&&&%>, null, msgs);
//&&&staticSymbol&&&    <%
} else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(genFeature) : "";
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&					msgs = ((<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject")
//&&&staticSymbol&&&%>)<%
//&&&staticSymbol&&&=genFeature.getSafeName()
//&&&staticSymbol&&&%>).eInverseRemove(this, <%
//&&&staticSymbol&&&=targetClass.getQualifiedFeatureID(reverseFeature)
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=reverseOffsetCorrection
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=targetClass.getRawImportedInterfaceName()
//&&&staticSymbol&&&%>.class, msgs);
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				return basicSet<%
//&&&staticSymbol&&&=genFeature.getAccessorName()
//&&&staticSymbol&&&%>((<%
//&&&staticSymbol&&&=genFeature.getImportedType(genClass)
//&&&staticSymbol&&&%>)otherEnd, msgs);
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&<%
if (genModel.isMinimalReflectiveMethods()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		return super.eInverseAdd(otherEnd, featureID, msgs);
//&&&staticSymbol&&&<%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		return eDynamicInverseAdd(otherEnd, featureID, msgs);
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEInverseRemoveGenFeatures())) {
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
//&&&staticSymbol&&&	public <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain")
//&&&staticSymbol&&&%> eInverseRemove(<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject")
//&&&staticSymbol&&&%> otherEnd, int featureID, <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain")
//&&&staticSymbol&&&%> msgs)
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		switch (featureID<%
//&&&staticSymbol&&&=negativeOffsetCorrection
//&&&staticSymbol&&&%>)
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&<%
for (GenFeature genFeature : genClass.getEInverseRemoveGenFeatures()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			case <%
//&&&staticSymbol&&&=genClass.getQualifiedFeatureID(genFeature)
//&&&staticSymbol&&&%>:
//&&&staticSymbol&&&  <%
if (genFeature.isListType()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
if (genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				return ((<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList")
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=singleWildcard
//&&&staticSymbol&&&%>)((<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.common.util.EMap")
//&&&staticSymbol&&&%>.InternalMapView<%
//&&&staticSymbol&&&=genFeature.getImportedMapTemplateArguments(genClass)
//&&&staticSymbol&&&%>)<%
//&&&staticSymbol&&&=genFeature.getGetAccessor()
//&&&staticSymbol&&&%>()).eMap()).basicRemove(otherEnd, msgs);
//&&&staticSymbol&&&    <%
} else if (genFeature.isWrappedFeatureMapType()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				return ((<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList")
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=singleWildcard
//&&&staticSymbol&&&%>)((<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap")
//&&&staticSymbol&&&%>.Internal.Wrapper)<%
//&&&staticSymbol&&&=genFeature.getGetAccessor()
//&&&staticSymbol&&&%>()).featureMap()).basicRemove(otherEnd, msgs);
//&&&staticSymbol&&&    <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				return ((<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList")
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=singleWildcard
//&&&staticSymbol&&&%>)<%
//&&&staticSymbol&&&=genFeature.getGetAccessor()
//&&&staticSymbol&&&%>()).basicRemove(otherEnd, msgs);
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
} else if (genFeature.isContainer() && !genFeature.isBasicSet()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				return eBasicSetContainer(null, <%
//&&&staticSymbol&&&=genClass.getQualifiedFeatureID(genFeature)
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=positiveOffsetCorrection
//&&&staticSymbol&&&%>, msgs);
//&&&staticSymbol&&&  <%
} else if (genFeature.isUnsettable()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				return basicUnset<%
//&&&staticSymbol&&&=genFeature.getAccessorName()
//&&&staticSymbol&&&%>(msgs);
//&&&staticSymbol&&&  <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				return basicSet<%
//&&&staticSymbol&&&=genFeature.getAccessorName()
//&&&staticSymbol&&&%>(null, msgs);
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&<%
if (genModel.isMinimalReflectiveMethods()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		return super.eInverseRemove(otherEnd, featureID, msgs);
//&&&staticSymbol&&&<%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		return eDynamicInverseRemove(otherEnd, featureID, msgs);
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEBasicRemoveFromContainerGenFeatures())) {
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
//&&&staticSymbol&&&	public <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain")
//&&&staticSymbol&&&%> eBasicRemoveFromContainerFeature(<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain")
//&&&staticSymbol&&&%> msgs)
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		switch (eContainerFeatureID()<%
//&&&staticSymbol&&&=negativeOffsetCorrection
//&&&staticSymbol&&&%>)
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&<%
for (GenFeature genFeature : genClass.getEBasicRemoveFromContainerGenFeatures()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(genFeature) : "";
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			case <%
//&&&staticSymbol&&&=genClass.getQualifiedFeatureID(genFeature)
//&&&staticSymbol&&&%>:
//&&&staticSymbol&&&				return eInternalContainer().eInverseRemove(this, <%
//&&&staticSymbol&&&=targetClass.getQualifiedFeatureID(reverseFeature)
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=reverseOffsetCorrection
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=targetClass.getRawImportedInterfaceName()
//&&&staticSymbol&&&%>.class, msgs);
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&<%
if (genModel.isMinimalReflectiveMethods()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		return super.eBasicRemoveFromContainerFeature(msgs);
//&&&staticSymbol&&&<%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		return eDynamicBasicRemoveFromContainer(msgs);
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEGetGenFeatures())) {
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
//&&&staticSymbol&&&	public Object eGet(int featureID, boolean resolve, boolean coreType)
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		switch (featureID<%
//&&&staticSymbol&&&=negativeOffsetCorrection
//&&&staticSymbol&&&%>)
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&<%
for (GenFeature genFeature : genClass.getEGetGenFeatures()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			case <%
//&&&staticSymbol&&&=genClass.getQualifiedFeatureID(genFeature)
//&&&staticSymbol&&&%>:
//&&&staticSymbol&&&  <%
if (genFeature.isPrimitiveType()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
if (isJDK50) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				return <%
//&&&staticSymbol&&&=genFeature.getGetAccessor()
//&&&staticSymbol&&&%>();
//&&&staticSymbol&&&    <%
} else if (genFeature.isBooleanType()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				return <%
//&&&staticSymbol&&&=genFeature.getGetAccessor()
//&&&staticSymbol&&&%>() ? Boolean.TRUE : Boolean.FALSE;
//&&&staticSymbol&&&    <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				return new <%
//&&&staticSymbol&&&=genFeature.getObjectType(genClass)
//&&&staticSymbol&&&%>(<%
//&&&staticSymbol&&&=genFeature.getGetAccessor()
//&&&staticSymbol&&&%>());
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
} else if (genFeature.isResolveProxies() && !genFeature.isListType()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				if (resolve) return <%
//&&&staticSymbol&&&=genFeature.getGetAccessor()
//&&&staticSymbol&&&%>();
//&&&staticSymbol&&&				return basicGet<%
//&&&staticSymbol&&&=genFeature.getAccessorName()
//&&&staticSymbol&&&%>();
//&&&staticSymbol&&&  <%
} else if (genFeature.isMapType()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
if (genFeature.isEffectiveSuppressEMFTypes()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				if (coreType) return ((<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.common.util.EMap")
//&&&staticSymbol&&&%>.InternalMapView<%
//&&&staticSymbol&&&=genFeature.getImportedMapTemplateArguments(genClass)
//&&&staticSymbol&&&%>)<%
//&&&staticSymbol&&&=genFeature.getGetAccessor()
//&&&staticSymbol&&&%>()).eMap();
//&&&staticSymbol&&&				else return <%
//&&&staticSymbol&&&=genFeature.getGetAccessor()
//&&&staticSymbol&&&%>();
//&&&staticSymbol&&&    <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				if (coreType) return <%
//&&&staticSymbol&&&=genFeature.getGetAccessor()
//&&&staticSymbol&&&%>();
//&&&staticSymbol&&&				else return <%
//&&&staticSymbol&&&=genFeature.getGetAccessor()
//&&&staticSymbol&&&%>().map();
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
} else if (genFeature.isWrappedFeatureMapType()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				if (coreType) return ((<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap")
//&&&staticSymbol&&&%>.Internal.Wrapper)<%
//&&&staticSymbol&&&=genFeature.getGetAccessor()
//&&&staticSymbol&&&%>()).featureMap();
//&&&staticSymbol&&&				return <%
//&&&staticSymbol&&&=genFeature.getGetAccessor()
//&&&staticSymbol&&&%>();
//&&&staticSymbol&&&  <%
} else if (genFeature.isFeatureMapType()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				if (coreType) return <%
//&&&staticSymbol&&&=genFeature.getGetAccessor()
//&&&staticSymbol&&&%>();
//&&&staticSymbol&&&				return ((<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap")
//&&&staticSymbol&&&%>.Internal)<%
//&&&staticSymbol&&&=genFeature.getGetAccessor()
//&&&staticSymbol&&&%>()).getWrapper();
//&&&staticSymbol&&&  <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				return <%
//&&&staticSymbol&&&=genFeature.getGetAccessor()
//&&&staticSymbol&&&%>();
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&<%
if (genModel.isMinimalReflectiveMethods()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		return super.eGet(featureID, resolve, coreType);
//&&&staticSymbol&&&<%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		return eDynamicGet(featureID, resolve, coreType);
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getESetGenFeatures())) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&  <%
if (genModel.useGenerics()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
for (GenFeature genFeature : genClass.getESetGenFeatures()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
if (genFeature.isUncheckedCast(genClass) && !genFeature.isFeatureMapType() && !genFeature.isMapType()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	@SuppressWarnings("unchecked")
//&&&staticSymbol&&&      <%
break; }
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
if (genModel.useClassOverrideAnnotation()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	@Override
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	public void eSet(int featureID, Object newValue)
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		switch (featureID<%
//&&&staticSymbol&&&=negativeOffsetCorrection
//&&&staticSymbol&&&%>)
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&  <%
for (GenFeature genFeature : genClass.getESetGenFeatures()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			case <%
//&&&staticSymbol&&&=genClass.getQualifiedFeatureID(genFeature)
//&&&staticSymbol&&&%>:
//&&&staticSymbol&&&    <%
if (genFeature.isListType()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
if (genFeature.isWrappedFeatureMapType()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				((<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap")
//&&&staticSymbol&&&%>.Internal)((<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap")
//&&&staticSymbol&&&%>.Internal.Wrapper)<%
//&&&staticSymbol&&&=genFeature.getGetAccessor()
//&&&staticSymbol&&&%>()).featureMap()).set(newValue);
//&&&staticSymbol&&&      <%
} else if (genFeature.isFeatureMapType()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				((<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap")
//&&&staticSymbol&&&%>.Internal)<%
//&&&staticSymbol&&&=genFeature.getGetAccessor()
//&&&staticSymbol&&&%>()).set(newValue);
//&&&staticSymbol&&&      <%
} else if (genFeature.isMapType()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&        <%
if (genFeature.isEffectiveSuppressEMFTypes()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				((<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature")
//&&&staticSymbol&&&%>.Setting)((<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.common.util.EMap")
//&&&staticSymbol&&&%>.InternalMapView<%
//&&&staticSymbol&&&=genFeature.getImportedMapTemplateArguments(genClass)
//&&&staticSymbol&&&%>)<%
//&&&staticSymbol&&&=genFeature.getGetAccessor()
//&&&staticSymbol&&&%>()).eMap()).set(newValue);
//&&&staticSymbol&&&        <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				((<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature")
//&&&staticSymbol&&&%>.Setting)<%
//&&&staticSymbol&&&=genFeature.getGetAccessor()
//&&&staticSymbol&&&%>()).set(newValue);
//&&&staticSymbol&&&        <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				<%
//&&&staticSymbol&&&=genFeature.getGetAccessor()
//&&&staticSymbol&&&%>().clear();
//&&&staticSymbol&&&				<%
//&&&staticSymbol&&&=genFeature.getGetAccessor()
//&&&staticSymbol&&&%>().addAll((<%
//&&&staticSymbol&&&=genModel.getImportedName("java.util.Collection")
//&&&staticSymbol&&&%><%
if (isJDK50) {
//&&&staticSymbol&&&%><? extends <%
//&&&staticSymbol&&&=genFeature.getListItemType(genClass)
//&&&staticSymbol&&&%>><%
}
//&&&staticSymbol&&&%>)newValue);
//&&&staticSymbol&&&      <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
} else if (!isJDK50 && genFeature.isPrimitiveType()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				set<%
//&&&staticSymbol&&&=genFeature.getAccessorName()
//&&&staticSymbol&&&%>(((<%
//&&&staticSymbol&&&=genFeature.getObjectType(genClass)
//&&&staticSymbol&&&%>)newValue).<%
//&&&staticSymbol&&&=genFeature.getPrimitiveValueFunction()
//&&&staticSymbol&&&%>());
//&&&staticSymbol&&&    <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				set<%
//&&&staticSymbol&&&=genFeature.getAccessorName()
//&&&staticSymbol&&&%>(<%
if (genFeature.getTypeGenDataType() == null || !genFeature.getTypeGenDataType().isObjectType() || !genFeature.getRawType().equals(genFeature.getType(genClass))) {
//&&&staticSymbol&&&%>(<%
//&&&staticSymbol&&&=genFeature.getObjectType(genClass)
//&&&staticSymbol&&&%>)<%
}
//&&&staticSymbol&&&%>newValue);
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				return;
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&  <%
if (genModel.isMinimalReflectiveMethods()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		super.eSet(featureID, newValue);
//&&&staticSymbol&&&  <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		eDynamicSet(featureID, newValue);
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEUnsetGenFeatures())) {
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
//&&&staticSymbol&&&	public void eUnset(int featureID)
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		switch (featureID<%
//&&&staticSymbol&&&=negativeOffsetCorrection
//&&&staticSymbol&&&%>)
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&  <%
for (GenFeature genFeature : genClass.getEUnsetGenFeatures()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			case <%
//&&&staticSymbol&&&=genClass.getQualifiedFeatureID(genFeature)
//&&&staticSymbol&&&%>:
//&&&staticSymbol&&&    <%
if (genFeature.isListType() && !genFeature.isUnsettable()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
if (genFeature.isWrappedFeatureMapType()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				((<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap")
//&&&staticSymbol&&&%>.Internal.Wrapper)<%
//&&&staticSymbol&&&=genFeature.getGetAccessor()
//&&&staticSymbol&&&%>()).featureMap().clear();
//&&&staticSymbol&&&      <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				<%
//&&&staticSymbol&&&=genFeature.getGetAccessor()
//&&&staticSymbol&&&%>().clear();
//&&&staticSymbol&&&      <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
} else if (genFeature.isUnsettable()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				unset<%
//&&&staticSymbol&&&=genFeature.getAccessorName()
//&&&staticSymbol&&&%>();
//&&&staticSymbol&&&    <%
} else if (!genFeature.hasEDefault()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				set<%
//&&&staticSymbol&&&=genFeature.getAccessorName()
//&&&staticSymbol&&&%>((<%
//&&&staticSymbol&&&=genFeature.getImportedType(genClass)
//&&&staticSymbol&&&%>)null);
//&&&staticSymbol&&&    <%
} else if (genFeature.hasSettingDelegate()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				<%
//&&&staticSymbol&&&=genFeature.getUpperName()
//&&&staticSymbol&&&%>__ESETTING_DELEGATE.dynamicUnset(this, null, 0);
//&&&staticSymbol&&&    <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				set<%
//&&&staticSymbol&&&=genFeature.getAccessorName()
//&&&staticSymbol&&&%>(<%
//&&&staticSymbol&&&=genFeature.getEDefault()
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				return;
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&  <%
if (genModel.isMinimalReflectiveMethods()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		super.eUnset(featureID);
//&&&staticSymbol&&&  <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		eDynamicUnset(featureID);
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEIsSetGenFeatures())) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&  <%
if (genModel.useGenerics()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
for (GenFeature genFeature : genClass.getEIsSetGenFeatures()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
if (genFeature.isListType() && !genFeature.isUnsettable() && !genFeature.isWrappedFeatureMapType() && !genClass.isField(genFeature) && genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	@SuppressWarnings("unchecked")
//&&&staticSymbol&&&      <%
break; }
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
if (genModel.useClassOverrideAnnotation()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	@Override
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	public boolean eIsSet(int featureID)
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		switch (featureID<%
//&&&staticSymbol&&&=negativeOffsetCorrection
//&&&staticSymbol&&&%>)
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&<%
for (GenFeature genFeature : genClass.getEIsSetGenFeatures()) { String safeNameAccessor = genFeature.getSafeName(); if ("featureID".equals(safeNameAccessor)) { safeNameAccessor = "this." + safeNameAccessor; }
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			case <%
//&&&staticSymbol&&&=genClass.getQualifiedFeatureID(genFeature)
//&&&staticSymbol&&&%>:
//&&&staticSymbol&&&  <%
if (genFeature.hasSettingDelegate()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
if (genFeature.isUnsettable()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				return isSet<%
//&&&staticSymbol&&&=genFeature.getAccessorName()
//&&&staticSymbol&&&%>();
//&&&staticSymbol&&&    <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				return <%
//&&&staticSymbol&&&=genFeature.getUpperName()
//&&&staticSymbol&&&%>__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
} else if (genFeature.isListType() && !genFeature.isUnsettable()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
if (genFeature.isWrappedFeatureMapType()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
if (genFeature.isVolatile()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				return !((<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap")
//&&&staticSymbol&&&%>.Internal.Wrapper)<%
//&&&staticSymbol&&&=genFeature.getGetAccessor()
//&&&staticSymbol&&&%>()).featureMap().isEmpty();
//&&&staticSymbol&&&      <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				return <%
//&&&staticSymbol&&&=safeNameAccessor
//&&&staticSymbol&&&%> != null && !<%
//&&&staticSymbol&&&=safeNameAccessor
//&&&staticSymbol&&&%>.featureMap().isEmpty();
//&&&staticSymbol&&&      <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
if (genClass.isField(genFeature)) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				return <%
//&&&staticSymbol&&&=safeNameAccessor
//&&&staticSymbol&&&%> != null && !<%
//&&&staticSymbol&&&=safeNameAccessor
//&&&staticSymbol&&&%>.isEmpty();
//&&&staticSymbol&&&      <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&        <%
if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				<%
//&&&staticSymbol&&&=genFeature.getImportedType(genClass)
//&&&staticSymbol&&&%> <%
//&&&staticSymbol&&&=safeNameAccessor
//&&&staticSymbol&&&%> = (<%
//&&&staticSymbol&&&=genFeature.getImportedType(genClass)
//&&&staticSymbol&&&%>)eVirtualGet(<%
//&&&staticSymbol&&&=genClass.getQualifiedFeatureID(genFeature)
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=positiveOffsetCorrection
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&				return <%
//&&&staticSymbol&&&=safeNameAccessor
//&&&staticSymbol&&&%> != null && !<%
//&&&staticSymbol&&&=safeNameAccessor
//&&&staticSymbol&&&%>.isEmpty();
//&&&staticSymbol&&&        <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				return !<%
//&&&staticSymbol&&&=genFeature.getGetAccessor()
//&&&staticSymbol&&&%>().isEmpty();
//&&&staticSymbol&&&        <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
} else if (genFeature.isUnsettable()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				return isSet<%
//&&&staticSymbol&&&=genFeature.getAccessorName()
//&&&staticSymbol&&&%>();
//&&&staticSymbol&&&  <%
} else if (genFeature.isResolveProxies()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
if (genClass.isField(genFeature)) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				return <%
//&&&staticSymbol&&&=safeNameAccessor
//&&&staticSymbol&&&%> != null;
//&&&staticSymbol&&&    <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				return eVirtualGet(<%
//&&&staticSymbol&&&=genClass.getQualifiedFeatureID(genFeature)
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=positiveOffsetCorrection
//&&&staticSymbol&&&%>) != null;
//&&&staticSymbol&&&      <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				return basicGet<%
//&&&staticSymbol&&&=genFeature.getAccessorName()
//&&&staticSymbol&&&%>() != null;
//&&&staticSymbol&&&      <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
} else if (!genFeature.hasEDefault()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
if (genClass.isField(genFeature)) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				return <%
//&&&staticSymbol&&&=safeNameAccessor
//&&&staticSymbol&&&%> != null;
//&&&staticSymbol&&&    <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				return eVirtualGet(<%
//&&&staticSymbol&&&=genClass.getQualifiedFeatureID(genFeature)
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=positiveOffsetCorrection
//&&&staticSymbol&&&%>) != null;
//&&&staticSymbol&&&      <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				return <%
//&&&staticSymbol&&&=genFeature.getGetAccessor()
//&&&staticSymbol&&&%>() != null;
//&&&staticSymbol&&&      <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
} else if (genFeature.isPrimitiveType() || genFeature.isEnumType()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
if (genClass.isField(genFeature)) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
if (genClass.isFlag(genFeature)) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&        <%
if (genFeature.isBooleanType()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				return ((<%
//&&&staticSymbol&&&=genClass.getFlagsField(genFeature)
//&&&staticSymbol&&&%> & <%
//&&&staticSymbol&&&=genFeature.getUpperName()
//&&&staticSymbol&&&%>_EFLAG) != 0) != <%
//&&&staticSymbol&&&=genFeature.getEDefault()
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&        <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				return (<%
//&&&staticSymbol&&&=genClass.getFlagsField(genFeature)
//&&&staticSymbol&&&%> & <%
//&&&staticSymbol&&&=genFeature.getUpperName()
//&&&staticSymbol&&&%>_EFLAG) != <%
//&&&staticSymbol&&&=genFeature.getUpperName()
//&&&staticSymbol&&&%>_EFLAG_DEFAULT;
//&&&staticSymbol&&&        <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				return <%
//&&&staticSymbol&&&=safeNameAccessor
//&&&staticSymbol&&&%> != <%
//&&&staticSymbol&&&=genFeature.getEDefault()
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&      <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
if (genFeature.isEnumType() && genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				return eVirtualGet(<%
//&&&staticSymbol&&&=genClass.getQualifiedFeatureID(genFeature)
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=positiveOffsetCorrection
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=genFeature.getEDefault()
//&&&staticSymbol&&&%>) != <%
//&&&staticSymbol&&&=genFeature.getEDefault()
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&      <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				return <%
//&&&staticSymbol&&&=genFeature.getGetAccessor()
//&&&staticSymbol&&&%>() != <%
//&&&staticSymbol&&&=genFeature.getEDefault()
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&      <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
} else {//datatype
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
if (genClass.isField(genFeature)) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				return <%
//&&&staticSymbol&&&=genFeature.getEDefault()
//&&&staticSymbol&&&%> == null ? <%
//&&&staticSymbol&&&=safeNameAccessor
//&&&staticSymbol&&&%> != null : !<%
//&&&staticSymbol&&&=genFeature.getEDefault()
//&&&staticSymbol&&&%>.equals(<%
//&&&staticSymbol&&&=safeNameAccessor
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&    <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				<%
//&&&staticSymbol&&&=genFeature.getImportedType(genClass)
//&&&staticSymbol&&&%> <%
//&&&staticSymbol&&&=safeNameAccessor
//&&&staticSymbol&&&%> = (<%
//&&&staticSymbol&&&=genFeature.getImportedType(genClass)
//&&&staticSymbol&&&%>)eVirtualGet(<%
//&&&staticSymbol&&&=genClass.getQualifiedFeatureID(genFeature)
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=positiveOffsetCorrection
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=genFeature.getEDefault()
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&				return <%
//&&&staticSymbol&&&=genFeature.getEDefault()
//&&&staticSymbol&&&%> == null ? <%
//&&&staticSymbol&&&=safeNameAccessor
//&&&staticSymbol&&&%> != null : !<%
//&&&staticSymbol&&&=genFeature.getEDefault()
//&&&staticSymbol&&&%>.equals(<%
//&&&staticSymbol&&&=safeNameAccessor
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&      <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				return <%
//&&&staticSymbol&&&=genFeature.getEDefault()
//&&&staticSymbol&&&%> == null ? <%
//&&&staticSymbol&&&=genFeature.getGetAccessor()
//&&&staticSymbol&&&%>() != null : !<%
//&&&staticSymbol&&&=genFeature.getEDefault()
//&&&staticSymbol&&&%>.equals(<%
//&&&staticSymbol&&&=genFeature.getGetAccessor()
//&&&staticSymbol&&&%>());
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
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&<%
if (genModel.isMinimalReflectiveMethods()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		return super.eIsSet(featureID);
//&&&staticSymbol&&&<%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		return eDynamicIsSet(featureID);
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
if (isImplementation && (!genClass.getMixinGenFeatures().isEmpty() || genClass.hasOffsetCorrection() && !genClass.getGenFeatures().isEmpty())) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
if (!genClass.getMixinGenFeatures().isEmpty()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&    <%
if (genModel.useClassOverrideAnnotation()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	@Override
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<%
//&&&staticSymbol&&&=singleWildcard
//&&&staticSymbol&&&%> baseClass)
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&    <%
for (GenClass mixinGenClass : genClass.getMixinGenClasses()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		if (baseClass == <%
//&&&staticSymbol&&&=mixinGenClass.getRawImportedInterfaceName()
//&&&staticSymbol&&&%>.class)
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			switch (derivedFeatureID<%
//&&&staticSymbol&&&=negativeOffsetCorrection
//&&&staticSymbol&&&%>)
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&      <%
for (GenFeature genFeature : mixinGenClass.getGenFeatures()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				case <%
//&&&staticSymbol&&&=genClass.getQualifiedFeatureID(genFeature)
//&&&staticSymbol&&&%>: return <%
//&&&staticSymbol&&&=mixinGenClass.getQualifiedFeatureID(genFeature)
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&      <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				default: return -1;
//&&&staticSymbol&&&			}
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
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
//&&&staticSymbol&&&	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<%
//&&&staticSymbol&&&=singleWildcard
//&&&staticSymbol&&&%> baseClass)
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&  <%
for (GenClass mixinGenClass : genClass.getMixinGenClasses()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		if (baseClass == <%
//&&&staticSymbol&&&=mixinGenClass.getRawImportedInterfaceName()
//&&&staticSymbol&&&%>.class)
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			switch (baseFeatureID)
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&    <%
for (GenFeature genFeature : mixinGenClass.getGenFeatures()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				case <%
//&&&staticSymbol&&&=mixinGenClass.getQualifiedFeatureID(genFeature)
//&&&staticSymbol&&&%>: return <%
//&&&staticSymbol&&&=genClass.getQualifiedFeatureID(genFeature)
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=positiveOffsetCorrection
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				default: return -1;
//&&&staticSymbol&&&			}
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
if (genClass.hasOffsetCorrection() && !genClass.getGenFeatures().isEmpty()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		if (baseClass == <%
//&&&staticSymbol&&&=genClass.getRawImportedInterfaceName()
//&&&staticSymbol&&&%>.class)
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			switch (baseFeatureID<%
//&&&staticSymbol&&&=negativeOffsetCorrection
//&&&staticSymbol&&&%>)
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&    <%
for (GenFeature genFeature : genClass.getGenFeatures()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				case <%
//&&&staticSymbol&&&=genClass.getQualifiedFeatureID(genFeature)
//&&&staticSymbol&&&%>: return <%
//&&&staticSymbol&&&=genClass.getQualifiedFeatureID(genFeature)
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=positiveOffsetCorrection
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				default: return -1;
//&&&staticSymbol&&&			}
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
if (genModel.isOperationReflection() && isImplementation && (!genClass.getMixinGenOperations().isEmpty() || !genClass.getOverrideGenOperations(genClass.getExtendedGenOperations(), genClass.getImplementedGenOperations()).isEmpty() || genClass.hasOffsetCorrection() && !genClass.getGenOperations().isEmpty())) {
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
//&&&staticSymbol&&&	public int eDerivedOperationID(int baseOperationID, Class<%
//&&&staticSymbol&&&=singleWildcard
//&&&staticSymbol&&&%> baseClass)
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&  <%
for (GenClass extendedGenClass : genClass.getExtendedGenClasses()) { List<GenOperation> extendedImplementedGenOperations = extendedGenClass.getImplementedGenOperations(); List<GenOperation> implementedGenOperations = genClass.getImplementedGenOperations();
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
if (!genClass.getOverrideGenOperations(extendedImplementedGenOperations, implementedGenOperations).isEmpty()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		if (baseClass == <%
//&&&staticSymbol&&&=extendedGenClass.getRawImportedInterfaceName()
//&&&staticSymbol&&&%>.class)
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			switch (baseOperationID)
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&      <%
for (GenOperation genOperation : extendedImplementedGenOperations) { GenOperation overrideGenOperation = genClass.getOverrideGenOperation(genOperation);
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&        <%
if (implementedGenOperations.contains(overrideGenOperation)) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				case <%
//&&&staticSymbol&&&=extendedGenClass.getQualifiedOperationID(genOperation)
//&&&staticSymbol&&&%>: return <%
//&&&staticSymbol&&&=genClass.getQualifiedOperationID(overrideGenOperation)
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=positiveOperationOffsetCorrection
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&        <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				default: return super.eDerivedOperationID(baseOperationID, baseClass);
//&&&staticSymbol&&&			}
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
for (GenClass mixinGenClass : genClass.getMixinGenClasses()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		if (baseClass == <%
//&&&staticSymbol&&&=mixinGenClass.getRawImportedInterfaceName()
//&&&staticSymbol&&&%>.class)
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			switch (baseOperationID)
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&    <%
for (GenOperation genOperation : mixinGenClass.getGenOperations()) { GenOperation overrideGenOperation = genClass.getOverrideGenOperation(genOperation);
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				case <%
//&&&staticSymbol&&&=mixinGenClass.getQualifiedOperationID(genOperation)
//&&&staticSymbol&&&%>: return <%
//&&&staticSymbol&&&*%%storeSymbol%%*9
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=positiveOperationOffsetCorrection
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				default: return -1;
//&&&staticSymbol&&&			}
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
if (genClass.hasOffsetCorrection() && !genClass.getGenOperations().isEmpty()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		if (baseClass == <%
//&&&staticSymbol&&&=genClass.getRawImportedInterfaceName()
//&&&staticSymbol&&&%>.class)
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			switch (baseOperationID<%
//&&&staticSymbol&&&=negativeOperationOffsetCorrection
//&&&staticSymbol&&&%>)
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&    <%
for (GenOperation genOperation : genClass.getGenOperations()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				case <%
//&&&staticSymbol&&&=genClass.getQualifiedOperationID(genOperation)
//&&&staticSymbol&&&%>: return <%
//&&&staticSymbol&&&=genClass.getQualifiedOperationID(genOperation)
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=positiveOperationOffsetCorrection
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				default: return -1;
//&&&staticSymbol&&&			}
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		return super.eDerivedOperationID(baseOperationID, baseClass);
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
if (isImplementation && genModel.isVirtualDelegation()) { String eVirtualValuesField = genClass.getEVirtualValuesField();
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
if (eVirtualValuesField != null) {
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
//&&&staticSymbol&&&	protected Object[] eVirtualValues()
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		return <%
//&&&staticSymbol&&&=eVirtualValuesField
//&&&staticSymbol&&&%>;
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
//&&&staticSymbol&&&	protected void eSetVirtualValues(Object[] newValues)
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=eVirtualValuesField
//&&&staticSymbol&&&%> = newValues;
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
{ List<String> eVirtualIndexBitFields = genClass.getEVirtualIndexBitFields(new ArrayList<String>());
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
if (!eVirtualIndexBitFields.isEmpty()) { List<String> allEVirtualIndexBitFields = genClass.getAllEVirtualIndexBitFields(new ArrayList<String>());
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
//&&&staticSymbol&&&	protected int eVirtualIndexBits(int offset)
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		switch (offset)
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&      <%
for (int i = 0; i < allEVirtualIndexBitFields.size(); i++) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			case <%
//&&&staticSymbol&&&=i
//&&&staticSymbol&&&%> :
//&&&staticSymbol&&&				return <%
//&&&staticSymbol&&&=allEVirtualIndexBitFields.get(i)
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&      <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			default :
//&&&staticSymbol&&&				throw new IndexOutOfBoundsException();
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
//&&&staticSymbol&&&	protected void eSetVirtualIndexBits(int offset, int newIndexBits)
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		switch (offset)
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&      <%
for (int i = 0; i < allEVirtualIndexBitFields.size(); i++) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			case <%
//&&&staticSymbol&&&=i
//&&&staticSymbol&&&%> :
//&&&staticSymbol&&&				<%
//&&&staticSymbol&&&=allEVirtualIndexBitFields.get(i)
//&&&staticSymbol&&&%> = newIndexBits;
//&&&staticSymbol&&&				break;
//&&&staticSymbol&&&      <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			default :
//&&&staticSymbol&&&				throw new IndexOutOfBoundsException();
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
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
if (genModel.isOperationReflection() && isImplementation && !genClass.getImplementedGenOperations().isEmpty()) {
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
//&&&staticSymbol&&&  <%
if (genModel.useGenerics()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
boolean isUnchecked = false; boolean isRaw = false; LOOP: for (GenOperation genOperation : (genModel.isMinimalReflectiveMethods() ? genClass.getImplementedGenOperations() : genClass.getAllGenOperations())) { for (GenParameter genParameter : genOperation.getGenParameters()) { if (genParameter.isUncheckedCast()) { if (genParameter.getTypeGenDataType() == null || !genParameter.getTypeGenDataType().isObjectType()) { isUnchecked = true; } if (genParameter.usesOperationTypeParameters() && !genParameter.getEcoreParameter().getEGenericType().getETypeArguments().isEmpty()) { isRaw = true; break LOOP; }}}}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
if (isUnchecked) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	@SuppressWarnings(<%
if (!isRaw) {
//&&&staticSymbol&&&%>"unchecked"<%
} else {
//&&&staticSymbol&&&%>{"rawtypes", "unchecked" }<%
}
//&&&staticSymbol&&&%>)
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	public Object eInvoke(int operationID, <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.common.util.EList")
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=singleWildcard
//&&&staticSymbol&&&%> arguments) throws <%
//&&&staticSymbol&&&*%%storeSymbol%%*10
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		switch (operationID<%
//&&&staticSymbol&&&=negativeOperationOffsetCorrection
//&&&staticSymbol&&&%>)
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&<%
for (GenOperation genOperation : (genModel.isMinimalReflectiveMethods() ? genClass.getImplementedGenOperations() : genClass.getAllGenOperations())) { List<GenParameter> genParameters = genOperation.getGenParameters(); int size = genParameters.size();  boolean hasCheckedException = genOperation.hasCheckedException(); String indent = hasCheckedException ? "\t" : "";
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			case <%
//&&&staticSymbol&&&=genClass.getQualifiedOperationID(genOperation)
//&&&staticSymbol&&&%>:
//&&&staticSymbol&&&  <%
if (hasCheckedException) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				try
//&&&staticSymbol&&&				{
//&&&staticSymbol&&&  <%
/*}*/}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
if (genOperation.isVoid()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				<%
//&&&staticSymbol&&&=indent
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genOperation.getName()
//&&&staticSymbol&&&%>(<%
for (int i = 0; i < size; i++) { GenParameter genParameter = genParameters.get(i);
//&&&staticSymbol&&&%><%
if (!isJDK50 && genParameter.isPrimitiveType()) {
//&&&staticSymbol&&&%>(<%
}
//&&&staticSymbol&&&%><%
if (genParameter.getTypeGenDataType() == null || !genParameter.getTypeGenDataType().isObjectType() || !genParameter.usesOperationTypeParameters() && !genParameter.getRawType().equals(genParameter.getType(genClass))) {
//&&&staticSymbol&&&%>(<%
//&&&staticSymbol&&&*%%storeSymbol%%*11
//&&&staticSymbol&&&%>)<%
}
//&&&staticSymbol&&&%>arguments.get(<%
//&&&staticSymbol&&&=i
//&&&staticSymbol&&&%>)<%
if (!isJDK50 && genParameter.isPrimitiveType()) {
//&&&staticSymbol&&&%>).<%
//&&&staticSymbol&&&=genParameter.getPrimitiveValueFunction()
//&&&staticSymbol&&&%>()<%
}
//&&&staticSymbol&&&%><%
if (i < (size - 1)) {
//&&&staticSymbol&&&%>, <%
}
//&&&staticSymbol&&&%><%
}
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&				<%
//&&&staticSymbol&&&=indent
//&&&staticSymbol&&&%>return null;
//&&&staticSymbol&&&  <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				<%
//&&&staticSymbol&&&=indent
//&&&staticSymbol&&&%>return <%
if (!isJDK50 && genOperation.isPrimitiveType()) {
//&&&staticSymbol&&&%>new <%
//&&&staticSymbol&&&=genOperation.getObjectType(genClass)
//&&&staticSymbol&&&%>(<%
}
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genOperation.getName()
//&&&staticSymbol&&&%>(<%
for (int i = 0; i < size; i++) { GenParameter genParameter = genParameters.get(i);
//&&&staticSymbol&&&%><%
if (!isJDK50 && genParameter.isPrimitiveType()) {
//&&&staticSymbol&&&%>(<%
}
//&&&staticSymbol&&&%><%
if (genParameter.getTypeGenDataType() == null || !genParameter.getTypeGenDataType().isObjectType() || !genParameter.usesOperationTypeParameters() && !genParameter.getRawType().equals(genParameter.getType(genClass))) {
//&&&staticSymbol&&&%>(<%
//&&&staticSymbol&&&*%%storeSymbol%%*12
//&&&staticSymbol&&&%>)<%
}
//&&&staticSymbol&&&%>arguments.get(<%
//&&&staticSymbol&&&=i
//&&&staticSymbol&&&%>)<%
if (!isJDK50 && genParameter.isPrimitiveType()) {
//&&&staticSymbol&&&%>).<%
//&&&staticSymbol&&&=genParameter.getPrimitiveValueFunction()
//&&&staticSymbol&&&%>()<%
}
//&&&staticSymbol&&&%><%
if (i < (size - 1)) {
//&&&staticSymbol&&&%>, <%
}
//&&&staticSymbol&&&%><%
}
//&&&staticSymbol&&&%>)<%
if (!isJDK50 && genOperation.isPrimitiveType()) {
//&&&staticSymbol&&&%>)<%
}
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
if (hasCheckedException) {/*{*/
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				}
//&&&staticSymbol&&&				catch (<%
//&&&staticSymbol&&&=genModel.getImportedName("java.lang.Throwable")
//&&&staticSymbol&&&%> throwable)
//&&&staticSymbol&&&				{
//&&&staticSymbol&&&					throw new <%
//&&&staticSymbol&&&*%%storeSymbol%%*13
//&&&staticSymbol&&&%>(throwable);
//&&&staticSymbol&&&				}
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&<%
if (genModel.isMinimalReflectiveMethods()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		return super.eInvoke(operationID, arguments);
//&&&staticSymbol&&&<%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		return eDynamicInvoke(operationID, arguments);
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
if (!genClass.hasImplementedToStringGenOperation() && isImplementation && !genModel.isReflectiveDelegation() && !genModel.isDynamicDelegation() && !genClass.getToStringGenFeatures().isEmpty()) {
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
//&&&staticSymbol&&&	public String toString()
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		if (eIsProxy()) return super.toString();
//&&&staticSymbol&&&
//&&&staticSymbol&&&		StringBuffer result = new StringBuffer(super.toString());
//&&&staticSymbol&&&  <%
{ boolean first = true;
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
for (GenFeature genFeature : genClass.getToStringGenFeatures()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
if (first) { first = false;
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		result.append(" (<%
//&&&staticSymbol&&&=genFeature.getName()
//&&&staticSymbol&&&%>: ");<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		result.append(", <%
//&&&staticSymbol&&&=genFeature.getName()
//&&&staticSymbol&&&%>: ");<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
if (genFeature.isUnsettable() && !genFeature.isListType()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&        <%
if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		if (eVirtualIsSet(<%
//&&&staticSymbol&&&=genClass.getQualifiedFeatureID(genFeature)
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=positiveOffsetCorrection
//&&&staticSymbol&&&%>)) result.append(eVirtualGet(<%
//&&&staticSymbol&&&=genClass.getQualifiedFeatureID(genFeature)
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=positiveOffsetCorrection
//&&&staticSymbol&&&%>)); else result.append("<unset>");<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&        <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&          <%
if (genClass.isFlag(genFeature)) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&            <%
if (genFeature.isBooleanType()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		if (<%
if (genClass.isESetFlag(genFeature)) {
//&&&staticSymbol&&&%>(<%
//&&&staticSymbol&&&=genClass.getESetFlagsField(genFeature)
//&&&staticSymbol&&&%> & <%
//&&&staticSymbol&&&=genFeature.getUpperName()
//&&&staticSymbol&&&%>_ESETFLAG) != 0<%
} else {
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genFeature.getUncapName()
//&&&staticSymbol&&&%>ESet<%
}
//&&&staticSymbol&&&%>) result.append((<%
//&&&staticSymbol&&&=genClass.getFlagsField(genFeature)
//&&&staticSymbol&&&%> & <%
//&&&staticSymbol&&&=genFeature.getUpperName()
//&&&staticSymbol&&&%>_EFLAG) != 0); else result.append("<unset>");<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&            <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		if (<%
if (genClass.isESetFlag(genFeature)) {
//&&&staticSymbol&&&%>(<%
//&&&staticSymbol&&&=genClass.getESetFlagsField(genFeature)
//&&&staticSymbol&&&%> & <%
//&&&staticSymbol&&&=genFeature.getUpperName()
//&&&staticSymbol&&&%>_ESETFLAG) != 0<%
} else {
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genFeature.getUncapName()
//&&&staticSymbol&&&%>ESet<%
}
//&&&staticSymbol&&&%>) result.append(<%
//&&&staticSymbol&&&=genFeature.getUpperName()
//&&&staticSymbol&&&%>_EFLAG_VALUES[(<%
//&&&staticSymbol&&&=genClass.getFlagsField(genFeature)
//&&&staticSymbol&&&%> & <%
//&&&staticSymbol&&&=genFeature.getUpperName()
//&&&staticSymbol&&&%>_EFLAG) >>> <%
//&&&staticSymbol&&&=genFeature.getUpperName()
//&&&staticSymbol&&&%>_EFLAG_OFFSET]); else result.append("<unset>");<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&            <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&          <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		if (<%
if (genClass.isESetFlag(genFeature)) {
//&&&staticSymbol&&&%>(<%
//&&&staticSymbol&&&=genClass.getESetFlagsField(genFeature)
//&&&staticSymbol&&&%> & <%
//&&&staticSymbol&&&=genFeature.getUpperName()
//&&&staticSymbol&&&%>_ESETFLAG) != 0<%
} else {
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genFeature.getUncapName()
//&&&staticSymbol&&&%>ESet<%
}
//&&&staticSymbol&&&%>) result.append(<%
//&&&staticSymbol&&&=genFeature.getSafeName()
//&&&staticSymbol&&&%>); else result.append("<unset>");<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&          <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&        <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&        <%
if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		result.append(eVirtualGet(<%
//&&&staticSymbol&&&=genClass.getQualifiedFeatureID(genFeature)
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=positiveOffsetCorrection
//&&&staticSymbol&&&%><%
if (!genFeature.isListType() && !genFeature.isReferenceType()){
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=genFeature.getEDefault()
//&&&staticSymbol&&&%><%
}
//&&&staticSymbol&&&%>));
//&&&staticSymbol&&&        <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&          <%
if (genClass.isFlag(genFeature)) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&          <%
if (genFeature.isBooleanType()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		result.append((<%
//&&&staticSymbol&&&=genClass.getFlagsField(genFeature)
//&&&staticSymbol&&&%> & <%
//&&&staticSymbol&&&=genFeature.getUpperName()
//&&&staticSymbol&&&%>_EFLAG) != 0);
//&&&staticSymbol&&&          <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		result.append(<%
//&&&staticSymbol&&&=genFeature.getUpperName()
//&&&staticSymbol&&&%>_EFLAG_VALUES[(<%
//&&&staticSymbol&&&=genClass.getFlagsField(genFeature)
//&&&staticSymbol&&&%> & <%
//&&&staticSymbol&&&=genFeature.getUpperName()
//&&&staticSymbol&&&%>_EFLAG) >>> <%
//&&&staticSymbol&&&=genFeature.getUpperName()
//&&&staticSymbol&&&%>_EFLAG_OFFSET]);
//&&&staticSymbol&&&          <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&          <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		result.append(<%
//&&&staticSymbol&&&=genFeature.getSafeName()
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&          <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&        <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		result.append(')');
//&&&staticSymbol&&&		return result.toString();
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
if (isImplementation && genClass.isMapEntry()) { GenFeature keyFeature = genClass.getMapEntryKeyFeature(); GenFeature valueFeature = genClass.getMapEntryValueFeature();
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
String objectType = genModel.getImportedName("java.lang.Object");
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
String keyType = isJDK50 ? keyFeature.getObjectType(genClass) : objectType;
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
String valueType = isJDK50 ? valueFeature.getObjectType(genClass) : objectType;
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
String eMapType = genModel.getImportedName("org.eclipse.emf.common.util.EMap") + (isJDK50 ? "<" + keyType + ", " + valueType + ">" : "");
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&      <%
if (isGWT) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	@<%
//&&&staticSymbol&&&=genModel.getImportedName("com.google.gwt.user.client.rpc.GwtTransient")
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	protected int hash = -1;
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	public int getHash()
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		if (hash == -1)
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			<%
//&&&staticSymbol&&&=objectType
//&&&staticSymbol&&&%> theKey = getKey();
//&&&staticSymbol&&&			hash = (theKey == null ? 0 : theKey.hashCode());
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&		return hash;
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	public void setHash(int hash)
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		this.hash = hash;
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	public <%
//&&&staticSymbol&&&=keyType
//&&&staticSymbol&&&%> getKey()
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&  <%
if (!isJDK50 && keyFeature.isPrimitiveType()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		return new <%
//&&&staticSymbol&&&=keyFeature.getObjectType(genClass)
//&&&staticSymbol&&&%>(getTypedKey());
//&&&staticSymbol&&&  <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		return getTypedKey();
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	public void setKey(<%
//&&&staticSymbol&&&=keyType
//&&&staticSymbol&&&%> key)
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&  <%
if (keyFeature.isListType()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		getTypedKey().addAll(<%
if (!genModel.useGenerics()) {
//&&&staticSymbol&&&%>(<%
//&&&staticSymbol&&&=genModel.getImportedName("java.util.Collection")
//&&&staticSymbol&&&%>)<%
}
//&&&staticSymbol&&&%>key);
//&&&staticSymbol&&&  <%
} else if (isJDK50) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		setTypedKey(key);
//&&&staticSymbol&&&  <%
} else if (keyFeature.isPrimitiveType()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		setTypedKey(((<%
//&&&staticSymbol&&&=keyFeature.getObjectType(genClass)
//&&&staticSymbol&&&%>)key).<%
//&&&staticSymbol&&&=keyFeature.getPrimitiveValueFunction()
//&&&staticSymbol&&&%>());
//&&&staticSymbol&&&  <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		setTypedKey((<%
//&&&staticSymbol&&&=keyFeature.getImportedType(genClass)
//&&&staticSymbol&&&%>)key);
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	public <%
//&&&staticSymbol&&&=valueType
//&&&staticSymbol&&&%> getValue()
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&  <%
if (!isJDK50 && valueFeature.isPrimitiveType()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		return new <%
//&&&staticSymbol&&&=valueFeature.getObjectType(genClass)
//&&&staticSymbol&&&%>(getTypedValue());
//&&&staticSymbol&&&  <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		return getTypedValue();
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	public <%
//&&&staticSymbol&&&=valueType
//&&&staticSymbol&&&%> setValue(<%
//&&&staticSymbol&&&=valueType
//&&&staticSymbol&&&%> value)
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=valueType
//&&&staticSymbol&&&%> oldValue = getValue();
//&&&staticSymbol&&&  <%
if (valueFeature.isListType()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		getTypedValue().clear();
//&&&staticSymbol&&&		getTypedValue().addAll(<%
if (!genModel.useGenerics()) {
//&&&staticSymbol&&&%>(<%
//&&&staticSymbol&&&=genModel.getImportedName("java.util.Collection")
//&&&staticSymbol&&&%>)<%
}
//&&&staticSymbol&&&%>value);
//&&&staticSymbol&&&  <%
} else if (isJDK50) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		setTypedValue(value);
//&&&staticSymbol&&&  <%
} else if (valueFeature.isPrimitiveType()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		setTypedValue(((<%
//&&&staticSymbol&&&=valueFeature.getObjectType(genClass)
//&&&staticSymbol&&&%>)value).<%
//&&&staticSymbol&&&=valueFeature.getPrimitiveValueFunction()
//&&&staticSymbol&&&%>());
//&&&staticSymbol&&&  <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		setTypedValue((<%
//&&&staticSymbol&&&=valueFeature.getImportedType(genClass)
//&&&staticSymbol&&&%>)value);
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		return oldValue;
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&  <%
if (genModel.useGenerics()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	@SuppressWarnings("unchecked")
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	public <%
//&&&staticSymbol&&&=eMapType
//&&&staticSymbol&&&%> getEMap()
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.EObject")
//&&&staticSymbol&&&%> container = eContainer();
//&&&staticSymbol&&&		return container == null ? null : (<%
//&&&staticSymbol&&&=eMapType
//&&&staticSymbol&&&%>)container.eGet(eContainmentFeature());
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&} //<%
//&&&staticSymbol&&&*%%storeSymbol%%*14
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
// TODO fix the space above
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
genModel.emitSortedImports();
//&&&staticSymbol&&&%>

}
}