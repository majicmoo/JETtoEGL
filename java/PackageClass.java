class PackageClass {
public static void main (String[] args) {
//&&&staticSymbol&&&<%import java.util.*;%>
//&&&staticSymbol&&&<%import org.eclipse.emf.ecore.*;%>
//&&&staticSymbol&&&<%import org.eclipse.emf.ecore.util.EcoreUtil;%>
//&&&staticSymbol&&&<%import org.eclipse.emf.codegen.ecore.genmodel.*;%>
//&&&staticSymbol&&&<%import org.eclipse.emf.codegen.ecore.genmodel.impl.Literals;%>
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
final GenPackage genPackage = (GenPackage)((Object[])argument)[0]; final GenModel genModel=genPackage.getGenModel();
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
boolean isInterface = Boolean.TRUE.equals(((Object[])argument)[1]); boolean isImplementation = Boolean.TRUE.equals(((Object[])argument)[2]);
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
String publicStaticFinalFlag = isImplementation ? "public static final " : "";
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
boolean needsAddEOperation = false;
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
boolean needsAddEParameter = false;
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%include("../Header.javajetinc");%>
//&&&staticSymbol&&&<%
if (isImplementation && !genModel.isSuppressInterfaces()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&package <%
//&&&staticSymbol&&&=genPackage.getClassPackageName()
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&<%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&package <%
//&&&staticSymbol&&&=genPackage.getReflectionPackageName()
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
genModel.markImportLocation(stringBuffer, genPackage);
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
if (isImplementation) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
genModel.addPseudoImport("org.eclipse.emf.ecore.EPackage.Registry");
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
genModel.addPseudoImport("org.eclipse.emf.ecore.EPackage.Descriptor");
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
genModel.addPseudoImport("org.eclipse.emf.ecore.impl.EPackageImpl.EBasicWhiteList");
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
genModel.addPseudoImport("org.eclipse.emf.ecore.impl.MinimalEObjectImpl.Container");
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
genModel.addPseudoImport("org.eclipse.emf.ecore.impl.MinimalEObjectImpl.Container.Dynamic");
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
if (genPackage.isLiteralsInterface()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
genModel.addPseudoImport(genPackage.getQualifiedPackageInterfaceName() + ".Literals");
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
for (GenClassifier genClassifier : genPackage.getOrderedGenClassifiers()) genModel.addPseudoImport(genPackage.getQualifiedPackageInterfaceName() + "." + genPackage.getClassifierID(genClassifier));
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
if (isInterface) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&/**
//&&&staticSymbol&&& * <!-- begin-user-doc -->
//&&&staticSymbol&&& * The <b>Package</b> for the model.
//&&&staticSymbol&&& * It contains accessors for the meta objects to represent
//&&&staticSymbol&&& * <ul>
//&&&staticSymbol&&& *   <li>each class,</li>
//&&&staticSymbol&&& *   <li>each feature of each class,</li>
//&&&staticSymbol&&&  <%
if (genModel.isOperationReflection()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&& *   <li>each operation of each class,</li>
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&& *   <li>each enum,</li>
//&&&staticSymbol&&& *   <li>and each data type</li>
//&&&staticSymbol&&& * </ul>
//&&&staticSymbol&&& * <!-- end-user-doc -->
//&&&staticSymbol&&&<%
if (genPackage.hasDocumentation()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&& * <!-- begin-model-doc -->
//&&&staticSymbol&&& * <%
//&&&staticSymbol&&&=genPackage.getDocumentation(genModel.getIndentation(stringBuffer))
//&&&staticSymbol&&&%>
//&&&staticSymbol&&& * <!-- end-model-doc -->
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&& * @see <%
//&&&staticSymbol&&&=genPackage.getQualifiedFactoryInterfaceName()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
if (!genModel.isSuppressEMFModelTags()) { boolean first = true; for (StringTokenizer stringTokenizer = new StringTokenizer(genPackage.getModelInfo(), "\n\r"); stringTokenizer.hasMoreTokens(); ) { String modelInfo = stringTokenizer.nextToken(); if (first) { first = false;
//&&&staticSymbol&&&%>
//&&&staticSymbol&&& * @model <%
//&&&staticSymbol&&&=modelInfo
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&& *        <%
//&&&staticSymbol&&&=modelInfo
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
}} if (first) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&& * @model
//&&&staticSymbol&&&  <%
}}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&& * @generated
//&&&staticSymbol&&& */
//&&&staticSymbol&&&<%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&/**
//&&&staticSymbol&&& * <!-- begin-user-doc -->
//&&&staticSymbol&&& * An implementation of the model <b>Package</b>.
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
//&&&staticSymbol&&&=genPackage.getPackageClassName()
//&&&staticSymbol&&&%> extends <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.impl.EPackageImpl")
//&&&staticSymbol&&&%><%
if (!isInterface){
//&&&staticSymbol&&&%> implements <%
//&&&staticSymbol&&&=genPackage.getImportedPackageInterfaceName()
//&&&staticSymbol&&&%><%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&public interface <%
//&&&staticSymbol&&&=genPackage.getPackageInterfaceName()
//&&&staticSymbol&&&%> extends <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.EPackage")
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
if (isInterface) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * The package name.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	<%
//&&&staticSymbol&&&=publicStaticFinalFlag
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genModel.getImportedName("java.lang.String")
//&&&staticSymbol&&&%> eNAME = "<%
//&&&staticSymbol&&&=genPackage.getPackageName()
//&&&staticSymbol&&&%>";<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * The package namespace URI.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	<%
//&&&staticSymbol&&&=publicStaticFinalFlag
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genModel.getImportedName("java.lang.String")
//&&&staticSymbol&&&%> eNS_URI = "<%
//&&&staticSymbol&&&=genPackage.getNSURI()
//&&&staticSymbol&&&%>";<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * The package namespace name.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	<%
//&&&staticSymbol&&&=publicStaticFinalFlag
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genModel.getImportedName("java.lang.String")
//&&&staticSymbol&&&%> eNS_PREFIX = "<%
//&&&staticSymbol&&&=genPackage.getNSName()
//&&&staticSymbol&&&%>";<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
if (genPackage.isContentType()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * The package content type ID.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	<%
//&&&staticSymbol&&&=publicStaticFinalFlag
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genModel.getImportedName("java.lang.String")
//&&&staticSymbol&&&%> eCONTENT_TYPE = "<%
//&&&staticSymbol&&&=genPackage.getContentTypeIdentifier()
//&&&staticSymbol&&&%>";<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * The singleton instance of the package.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	<%
//&&&staticSymbol&&&=publicStaticFinalFlag
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genPackage.getPackageInterfaceName()
//&&&staticSymbol&&&%> eINSTANCE = <%
//&&&staticSymbol&&&=genPackage.getQualifiedPackageClassName()
//&&&staticSymbol&&&%>.init();
//&&&staticSymbol&&&
//&&&staticSymbol&&&  <%
for (GenClassifier genClassifier : genPackage.getOrderedGenClassifiers()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&    <%
if (genClassifier instanceof GenClass) { GenClass genClass = (GenClass)genClassifier;
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
if (!genClass.isInterface()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	 * The meta object id for the '{@link <%
//&&&staticSymbol&&&=genClass.getQualifiedClassName()
//&&&staticSymbol&&&%> <em><%
//&&&staticSymbol&&&=genClass.getFormattedName()
//&&&staticSymbol&&&%></em>}' class.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @see <%
//&&&staticSymbol&&&=genClass.getQualifiedClassName()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	 * The meta object id for the '{@link <%
//&&&staticSymbol&&&=genClass.getQualifiedInterfaceName()
//&&&staticSymbol&&&%> <em><%
//&&&staticSymbol&&&=genClass.getFormattedName()
//&&&staticSymbol&&&%></em>}' class.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @see <%
//&&&staticSymbol&&&=genClass.getQualifiedInterfaceName()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
} else if (genClassifier instanceof GenEnum) { GenEnum genEnum = (GenEnum)genClassifier;
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	 * The meta object id for the '{@link <%
//&&&staticSymbol&&&=genEnum.getQualifiedName()
//&&&staticSymbol&&&%> <em><%
//&&&staticSymbol&&&=genEnum.getFormattedName()
//&&&staticSymbol&&&%></em>}' enum.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @see <%
//&&&staticSymbol&&&=genEnum.getQualifiedName()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
} else if (genClassifier instanceof GenDataType) { GenDataType genDataType = (GenDataType)genClassifier;
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	 * The meta object id for the '<em><%
//&&&staticSymbol&&&=genDataType.getFormattedName()
//&&&staticSymbol&&&%></em>' data type.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&      <%
if (!genDataType.isPrimitiveType() && !genDataType.isArrayType()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	 * @see <%
//&&&staticSymbol&&&=genDataType.getRawInstanceClassName()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	 * @see <%
//&&&staticSymbol&&&=genPackage.getQualifiedPackageClassName()
//&&&staticSymbol&&&%>#get<%
//&&&staticSymbol&&&=genClassifier.getClassifierAccessorName()
//&&&staticSymbol&&&%>()
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	<%
//&&&staticSymbol&&&=publicStaticFinalFlag
//&&&staticSymbol&&&%>int <%
//&&&staticSymbol&&&=genPackage.getClassifierID(genClassifier)
//&&&staticSymbol&&&%> = <%
//&&&staticSymbol&&&=genPackage.getClassifierValue(genClassifier)
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&
//&&&staticSymbol&&&    <%
if (genClassifier instanceof GenClass) { GenClass genClass = (GenClass)genClassifier;
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
for (GenFeature genFeature : genClass.getAllGenFeatures()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * The feature id for the '<em><b><%
//&&&staticSymbol&&&=genFeature.getFormattedName()
//&&&staticSymbol&&&%></b></em>' <%
//&&&staticSymbol&&&=genFeature.getFeatureKind()
//&&&staticSymbol&&&%>.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 * @ordered
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	<%
//&&&staticSymbol&&&=publicStaticFinalFlag
//&&&staticSymbol&&&%>int <%
//&&&staticSymbol&&&=genClass.getFeatureID(genFeature)
//&&&staticSymbol&&&%> = <%
//&&&staticSymbol&&&=genClass.getFeatureValue(genFeature)
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&
//&&&staticSymbol&&&      <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * The number of structural features of the '<em><%
//&&&staticSymbol&&&=genClass.getFormattedName()
//&&&staticSymbol&&&%></em>' class.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 * @ordered
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	<%
//&&&staticSymbol&&&=publicStaticFinalFlag
//&&&staticSymbol&&&%>int <%
//&&&staticSymbol&&&=genClass.getFeatureCountID()
//&&&staticSymbol&&&%> = <%
//&&&staticSymbol&&&=genClass.getFeatureCountValue()
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&
//&&&staticSymbol&&&      <%
if (genModel.isOperationReflection()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&        <%
for (GenOperation genOperation : genClass.getAllGenOperations(false)) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&          <%
if (genClass.getOverrideGenOperation(genOperation) == null) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * The operation id for the '<em><%
//&&&staticSymbol&&&=genOperation.getFormattedName()
//&&&staticSymbol&&&%></em>' operation.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 * @ordered
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	<%
//&&&staticSymbol&&&=publicStaticFinalFlag
//&&&staticSymbol&&&%>int <%
//&&&staticSymbol&&&=genClass.getOperationID(genOperation, false)
//&&&staticSymbol&&&%> = <%
//&&&staticSymbol&&&=genClass.getOperationValue(genOperation)
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&
//&&&staticSymbol&&&          <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&        <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * The number of operations of the '<em><%
//&&&staticSymbol&&&=genClass.getFormattedName()
//&&&staticSymbol&&&%></em>' class.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 * @ordered
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	<%
//&&&staticSymbol&&&=publicStaticFinalFlag
//&&&staticSymbol&&&%>int <%
//&&&staticSymbol&&&=genClass.getOperationCountID()
//&&&staticSymbol&&&%> = <%
//&&&staticSymbol&&&=genClass.getOperationCountValue()
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
if (isImplementation) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
if (genPackage.isLoadingInitialization()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	protected String packageFilename = "<%
//&&&staticSymbol&&&=genPackage.getSerializedPackageFilename()
//&&&staticSymbol&&&%>";<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
for (GenClassifier genClassifier : genPackage.getGenClassifiers()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	private <%
//&&&staticSymbol&&&=genClassifier.getImportedMetaType()
//&&&staticSymbol&&&%> <%
//&&&staticSymbol&&&=genClassifier.getClassifierInstanceName()
//&&&staticSymbol&&&%> = null;
//&&&staticSymbol&&&
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * Creates an instance of the model <b>Package</b>, registered with
//&&&staticSymbol&&&	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
//&&&staticSymbol&&&	 * package URI value.
//&&&staticSymbol&&&	 * <p>Note: the correct way to create the package is via the static
//&&&staticSymbol&&&	 * factory method {@link #init init()}, which also performs
//&&&staticSymbol&&&	 * initialization of the package, or returns the registered package,
//&&&staticSymbol&&&	 * if one already exists.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @see org.eclipse.emf.ecore.EPackage.Registry
//&&&staticSymbol&&&	 * @see <%
//&&&staticSymbol&&&=genPackage.getQualifiedPackageInterfaceName()
//&&&staticSymbol&&&%>#eNS_URI
//&&&staticSymbol&&&	 * @see #init()
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	private <%
//&&&staticSymbol&&&=genPackage.getPackageClassName()
//&&&staticSymbol&&&%>()
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		super(eNS_URI, <%
//&&&staticSymbol&&&=genPackage.getQualifiedEFactoryInstanceAccessor()
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	private static boolean isInited = false;
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
//&&&staticSymbol&&&	 * 
//&&&staticSymbol&&&	 * <p>This method is used to initialize {@link <%
//&&&staticSymbol&&&=genPackage.getImportedPackageInterfaceName()
//&&&staticSymbol&&&%>#eINSTANCE} when that field is accessed.
//&&&staticSymbol&&&	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @see #eNS_URI
//&&&staticSymbol&&&  <%
if (!genPackage.isLoadedInitialization()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	 * @see #createPackageContents()
//&&&staticSymbol&&&	 * @see #initializePackageContents()
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	public static <%
//&&&staticSymbol&&&=genPackage.getImportedPackageInterfaceName()
//&&&staticSymbol&&&%> init()
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		if (isInited) return (<%
//&&&staticSymbol&&&=genPackage.getImportedPackageInterfaceName()
//&&&staticSymbol&&&%>)<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.EPackage")
//&&&staticSymbol&&&%>.Registry.INSTANCE.getEPackage(<%
//&&&staticSymbol&&&=genPackage.getImportedPackageInterfaceName()
//&&&staticSymbol&&&%>.eNS_URI);
//&&&staticSymbol&&&
//&&&staticSymbol&&&    <%
if (genModel.getRuntimePlatform() == GenRuntimePlatform.GWT) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		initializeRegistryHelpers();
//&&&staticSymbol&&&
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		// Obtain or create and register package
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=genPackage.getPackageClassName()
//&&&staticSymbol&&&%> the<%
//&&&staticSymbol&&&=genPackage.getBasicPackageName()
//&&&staticSymbol&&&%> = (<%
//&&&staticSymbol&&&=genPackage.getPackageClassName()
//&&&staticSymbol&&&%>)(<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.EPackage")
//&&&staticSymbol&&&%>.Registry.INSTANCE.get(eNS_URI) instanceof <%
//&&&staticSymbol&&&=genPackage.getPackageClassName()
//&&&staticSymbol&&&%> ? <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.EPackage")
//&&&staticSymbol&&&%>.Registry.INSTANCE.get(eNS_URI) : new <%
//&&&staticSymbol&&&=genPackage.getPackageClassName()
//&&&staticSymbol&&&%>());
//&&&staticSymbol&&&
//&&&staticSymbol&&&		isInited = true;
//&&&staticSymbol&&&
//&&&staticSymbol&&&    <%
if (!genPackage.getPackageSimpleDependencies().isEmpty()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		// Initialize simple dependencies
//&&&staticSymbol&&&    <%
for (GenPackage dep : genPackage.getPackageSimpleDependencies()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=dep.getImportedPackageInterfaceName()
//&&&staticSymbol&&&%>.eINSTANCE.eClass();
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
if (!genPackage.getPackageInterDependencies().isEmpty()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		// Obtain or create and register interdependencies
//&&&staticSymbol&&&    <%
for (GenPackage interdep : genPackage.getPackageInterDependencies()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=interdep.getImportedPackageClassName()
//&&&staticSymbol&&&%> <%
//&&&staticSymbol&&&=genPackage.getPackageInstanceVariable(interdep)
//&&&staticSymbol&&&%> = (<%
//&&&staticSymbol&&&=interdep.getImportedPackageClassName()
//&&&staticSymbol&&&%>)(<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.EPackage")
//&&&staticSymbol&&&%>.Registry.INSTANCE.getEPackage(<%
//&&&staticSymbol&&&=interdep.getImportedPackageInterfaceName()
//&&&staticSymbol&&&%>.eNS_URI) instanceof <%
//&&&staticSymbol&&&=interdep.getImportedPackageClassName()
//&&&staticSymbol&&&%> ? <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.EPackage")
//&&&staticSymbol&&&%>.Registry.INSTANCE.getEPackage(<%
//&&&staticSymbol&&&=interdep.getImportedPackageInterfaceName()
//&&&staticSymbol&&&%>.eNS_URI) : <%
//&&&staticSymbol&&&=interdep.getImportedPackageInterfaceName()
//&&&staticSymbol&&&%>.eINSTANCE);
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
if (genPackage.isLoadedInitialization() || !genPackage.getPackageLoadInterDependencies().isEmpty()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		// Load packages
//&&&staticSymbol&&&    <%
if (genPackage.isLoadingInitialization()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		the<%
//&&&staticSymbol&&&=genPackage.getBasicPackageName()
//&&&staticSymbol&&&%>.loadPackage();
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
for (GenPackage interdep : genPackage.getPackageLoadInterDependencies()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
if (interdep.isLoadingInitialization()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=genPackage.getPackageInstanceVariable(interdep)
//&&&staticSymbol&&&%>.loadPackage();
//&&&staticSymbol&&&      <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
if (!genPackage.isLoadedInitialization() || !genPackage.getPackageBuildInterDependencies().isEmpty()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		// Create package meta-data objects
//&&&staticSymbol&&&    <%
if (!genPackage.isLoadedInitialization()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		the<%
//&&&staticSymbol&&&=genPackage.getBasicPackageName()
//&&&staticSymbol&&&%>.createPackageContents();
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
for (GenPackage interdep : genPackage.getPackageBuildInterDependencies()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=genPackage.getPackageInstanceVariable(interdep)
//&&&staticSymbol&&&%>.createPackageContents();
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&		// Initialize created meta-data
//&&&staticSymbol&&&    <%
if (!genPackage.isLoadedInitialization()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		the<%
//&&&staticSymbol&&&=genPackage.getBasicPackageName()
//&&&staticSymbol&&&%>.initializePackageContents();
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
for (GenPackage interdep : genPackage.getPackageBuildInterDependencies()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=genPackage.getPackageInstanceVariable(interdep)
//&&&staticSymbol&&&%>.initializePackageContents();
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
if (genPackage.isLoadedInitialization() || !genPackage.getPackageLoadInterDependencies().isEmpty()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		// Fix loaded packages
//&&&staticSymbol&&&    <%
if (genPackage.isLoadedInitialization()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		the<%
//&&&staticSymbol&&&=genPackage.getBasicPackageName()
//&&&staticSymbol&&&%>.fixPackageContents();
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
for (GenPackage interdep : genPackage.getPackageLoadInterDependencies()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=genPackage.getPackageInstanceVariable(interdep)
//&&&staticSymbol&&&%>.fixPackageContents();
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
if (genPackage.hasConstraints()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		// Register package validator
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.EValidator")
//&&&staticSymbol&&&%>.Registry.INSTANCE.put
//&&&staticSymbol&&&			(the<%
//&&&staticSymbol&&&=genPackage.getBasicPackageName()
//&&&staticSymbol&&&%>, 
//&&&staticSymbol&&&			 new <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.EValidator")
//&&&staticSymbol&&&%>.Descriptor()
//&&&staticSymbol&&&			 {
//&&&staticSymbol&&&				 public <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.EValidator")
//&&&staticSymbol&&&%> getEValidator()
//&&&staticSymbol&&&				 {
//&&&staticSymbol&&&					 return <%
//&&&staticSymbol&&&=genPackage.getImportedValidatorClassName()
//&&&staticSymbol&&&%>.INSTANCE;
//&&&staticSymbol&&&				 }
//&&&staticSymbol&&&			 });
//&&&staticSymbol&&&
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
if (!genPackage.isEcorePackage()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		// Mark meta-data to indicate it can't be changed
//&&&staticSymbol&&&		the<%
//&&&staticSymbol&&&=genPackage.getBasicPackageName()
//&&&staticSymbol&&&%>.freeze();
//&&&staticSymbol&&&
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  
//&&&staticSymbol&&&		// Update the registry and return the package
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.EPackage")
//&&&staticSymbol&&&%>.Registry.INSTANCE.put(<%
//&&&staticSymbol&&&=genPackage.getImportedPackageInterfaceName()
//&&&staticSymbol&&&%>.eNS_URI, the<%
//&&&staticSymbol&&&=genPackage.getBasicPackageName()
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&		return the<%
//&&&staticSymbol&&&=genPackage.getBasicPackageName()
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&  <%
if (genModel.getRuntimePlatform() == GenRuntimePlatform.GWT) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	public static void initializeRegistryHelpers()
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&    <%
Set<String> helpers = new HashSet<String>(); for (GenClassifier genClassifier : genPackage.getGenClassifiers()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
if (genClassifier instanceof GenClass) { GenClass genClass = (GenClass)genClassifier;
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&        <%
if (!genClass.isDynamic()) { String theClass = genClass.isMapEntry() ? genClass.getImportedClassName() : genClass.getRawImportedInterfaceName(); if (helpers.add(theClass)) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.common.util.Reflect")
//&&&staticSymbol&&&%>.register
//&&&staticSymbol&&&			(<%
//&&&staticSymbol&&&=theClass
//&&&staticSymbol&&&%>.class, 
//&&&staticSymbol&&&			 new <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.common.util.Reflect")
//&&&staticSymbol&&&%>.Helper() 
//&&&staticSymbol&&&			 {
//&&&staticSymbol&&&				 public boolean isInstance(Object instance)
//&&&staticSymbol&&&				 {
//&&&staticSymbol&&&					 return instance instanceof <%
//&&&staticSymbol&&&*%%storeSymbol%%*0
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&				 }
//&&&staticSymbol&&&
//&&&staticSymbol&&&				 public Object newArrayInstance(int size)
//&&&staticSymbol&&&				 {
//&&&staticSymbol&&&					 return new <%
//&&&staticSymbol&&&=theClass
//&&&staticSymbol&&&%>[size];
//&&&staticSymbol&&&				 }
//&&&staticSymbol&&&			 });
//&&&staticSymbol&&&        <%
}}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
} else if (genClassifier instanceof GenDataType) { GenDataType genDataType = (GenDataType)genClassifier;
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&        <%
if (!genDataType.isPrimitiveType() && !genDataType.isObjectType()) { String theClass = genDataType.getRawImportedInstanceClassName(); if (helpers.add(theClass)) { 
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.common.util.Reflect")
//&&&staticSymbol&&&%>.register
//&&&staticSymbol&&&			(<%
//&&&staticSymbol&&&=theClass
//&&&staticSymbol&&&%>.class, 
//&&&staticSymbol&&&			 new <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.common.util.Reflect")
//&&&staticSymbol&&&%>.Helper() 
//&&&staticSymbol&&&			 {
//&&&staticSymbol&&&				 public boolean isInstance(Object instance)
//&&&staticSymbol&&&				 {
//&&&staticSymbol&&&					 return instance instanceof <%
//&&&staticSymbol&&&=theClass
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&				 }
//&&&staticSymbol&&&
//&&&staticSymbol&&&				 public Object newArrayInstance(int size)
//&&&staticSymbol&&&				 {
//&&&staticSymbol&&&        <%
if (genDataType.isArrayType()) { String componentType = theClass; String indices = ""; while(componentType.endsWith("[]")) { componentType = componentType.substring(0, componentType.length() - 2); indices += "[]";}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&					 return new <%
//&&&staticSymbol&&&=componentType
//&&&staticSymbol&&&%>[size]<%
//&&&staticSymbol&&&=indices
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&        <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&					 return new <%
//&&&staticSymbol&&&=theClass
//&&&staticSymbol&&&%>[size];
//&&&staticSymbol&&&        <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				 }
//&&&staticSymbol&&&		});
//&&&staticSymbol&&&        <%
}}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	public static class WhiteList implements <%
//&&&staticSymbol&&&=genModel.getImportedName("com.google.gwt.user.client.rpc.IsSerializable")
//&&&staticSymbol&&&%>, EBasicWhiteList
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&    <%
for (GenClassifier genClassifier : genPackage.getGenClassifiers()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
if (genClassifier instanceof GenClass) { GenClass genClass = (GenClass)genClassifier;
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&        <%
if (!genClass.isDynamic()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		/**
//&&&staticSymbol&&&		 * <!-- begin-user-doc -->
//&&&staticSymbol&&&		 * <!-- end-user-doc -->
//&&&staticSymbol&&&		 * @generated
//&&&staticSymbol&&&		 */
//&&&staticSymbol&&&		protected <%
//&&&staticSymbol&&&*%%storeSymbol%%*1
//&&&staticSymbol&&&%> <%
//&&&staticSymbol&&&=genClass.getSafeUncapName()
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&
//&&&staticSymbol&&&        <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
} else if (genClassifier instanceof GenDataType) { GenDataType genDataType = (GenDataType)genClassifier;
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&        <%
if (!genDataType.isObjectType() && genDataType.isSerializable()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		/**
//&&&staticSymbol&&&		 * <!-- begin-user-doc -->
//&&&staticSymbol&&&		 * <!-- end-user-doc -->
//&&&staticSymbol&&&		 * @generated
//&&&staticSymbol&&&		 */
//&&&staticSymbol&&&		protected <%
//&&&staticSymbol&&&=genDataType.getImportedWildcardInstanceClassName()
//&&&staticSymbol&&&%> <%
//&&&staticSymbol&&&=genDataType.getSafeUncapName()
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
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
if (isInterface) { // TODO REMOVE THIS BOGUS EMPTY LINE
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
for (GenClassifier genClassifier : genPackage.getGenClassifiers()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
if (isInterface) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&    <%
if (genClassifier instanceof GenClass) { GenClass genClass = (GenClass)genClassifier;
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	 * Returns the meta object for class '{@link <%
//&&&staticSymbol&&&=genClass.getQualifiedInterfaceName()
//&&&staticSymbol&&&%> <em><%
//&&&staticSymbol&&&=genClass.getFormattedName()
//&&&staticSymbol&&&%></em>}'.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @return the meta object for class '<em><%
//&&&staticSymbol&&&=genClass.getFormattedName()
//&&&staticSymbol&&&%></em>'.
//&&&staticSymbol&&&	 * @see <%
//&&&staticSymbol&&&=genClass.getQualifiedInterfaceName()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
if (!genModel.isSuppressEMFModelTags() && (genClass.isExternalInterface() || genClass.isDynamic())) { boolean first = true; for (StringTokenizer stringTokenizer = new StringTokenizer(genClass.getModelInfo(), "\n\r"); stringTokenizer.hasMoreTokens(); ) { String modelInfo = stringTokenizer.nextToken(); if (first) { first = false;
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	 * @model <%
//&&&staticSymbol&&&=modelInfo
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&        <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	 *        <%
//&&&staticSymbol&&&=modelInfo
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&        <%
}} if (first) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	 * @model
//&&&staticSymbol&&&      <%
}}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
} else if (genClassifier instanceof GenEnum) { GenEnum genEnum = (GenEnum)genClassifier;
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	 * Returns the meta object for enum '{@link <%
//&&&staticSymbol&&&=genEnum.getQualifiedName()
//&&&staticSymbol&&&%> <em><%
//&&&staticSymbol&&&=genEnum.getFormattedName()
//&&&staticSymbol&&&%></em>}'.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @return the meta object for enum '<em><%
//&&&staticSymbol&&&=genEnum.getFormattedName()
//&&&staticSymbol&&&%></em>'.
//&&&staticSymbol&&&	 * @see <%
//&&&staticSymbol&&&=genEnum.getQualifiedName()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
} else if (genClassifier instanceof GenDataType) { GenDataType genDataType = (GenDataType)genClassifier;
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
if (genDataType.isPrimitiveType() || genDataType.isArrayType()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	 * Returns the meta object for data type '<em><%
//&&&staticSymbol&&&=genDataType.getFormattedName()
//&&&staticSymbol&&&%></em>'.
//&&&staticSymbol&&&      <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	 * Returns the meta object for data type '{@link <%
//&&&staticSymbol&&&=genDataType.getRawInstanceClassName()
//&&&staticSymbol&&&%> <em><%
//&&&staticSymbol&&&=genDataType.getFormattedName()
//&&&staticSymbol&&&%></em>}'.
//&&&staticSymbol&&&      <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @return the meta object for data type '<em><%
//&&&staticSymbol&&&=genDataType.getFormattedName()
//&&&staticSymbol&&&%></em>'.
//&&&staticSymbol&&&      <%
if (!genDataType.isPrimitiveType() && !genDataType.isArrayType()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	 * @see <%
//&&&staticSymbol&&&=genDataType.getRawInstanceClassName()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
if (!genModel.isSuppressEMFModelTags()) {boolean first = true; for (StringTokenizer stringTokenizer = new StringTokenizer(genDataType.getModelInfo(), "\n\r"); stringTokenizer.hasMoreTokens(); ) { String modelInfo = stringTokenizer.nextToken(); if (first) { first = false;
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	 * @model <%
//&&&staticSymbol&&&=modelInfo
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	 *        <%
//&&&staticSymbol&&&=modelInfo
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
}} if (first) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	 * @model
//&&&staticSymbol&&&      <%
}}
//&&&staticSymbol&&&%>
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
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
if (isImplementation) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	public <%
//&&&staticSymbol&&&=genClassifier.getImportedMetaType()
//&&&staticSymbol&&&%> get<%
//&&&staticSymbol&&&=genClassifier.getClassifierAccessorName()
//&&&staticSymbol&&&%>()
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&    <%
if (genPackage.isLoadedInitialization()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		if (<%
//&&&staticSymbol&&&=genClassifier.getClassifierInstanceName()
//&&&staticSymbol&&&%> == null)
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			<%
//&&&staticSymbol&&&=genClassifier.getClassifierInstanceName()
//&&&staticSymbol&&&%> = (<%
//&&&staticSymbol&&&=genClassifier.getImportedMetaType()
//&&&staticSymbol&&&%>)<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.EPackage")
//&&&staticSymbol&&&%>.Registry.INSTANCE.getEPackage(<%
//&&&staticSymbol&&&=genPackage.getImportedPackageInterfaceName()
//&&&staticSymbol&&&%>.eNS_URI).getEClassifiers().get(<%
//&&&staticSymbol&&&=genPackage.getLocalClassifierIndex(genClassifier)
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		return <%
//&&&staticSymbol&&&=genClassifier.getClassifierInstanceName()
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	<%
//&&&staticSymbol&&&=genClassifier.getImportedMetaType()
//&&&staticSymbol&&&%> get<%
//&&&staticSymbol&&&=genClassifier.getClassifierAccessorName()
//&&&staticSymbol&&&%>();
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
if (genClassifier instanceof GenClass) { GenClass genClass = (GenClass)genClassifier;
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
for (GenFeature genFeature : genClass.getGenFeatures()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
if (isInterface) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * Returns the meta object for the <%
//&&&staticSymbol&&&=genFeature.getFeatureKind()
//&&&staticSymbol&&&%> '{@link <%
//&&&staticSymbol&&&=genClass.getQualifiedInterfaceName()
//&&&staticSymbol&&&%><%
if (!genClass.isMapEntry() && !genFeature.isSuppressedGetVisibility()) {
//&&&staticSymbol&&&%>#<%
//&&&staticSymbol&&&=genFeature.getGetAccessor()
//&&&staticSymbol&&&%><%
}
//&&&staticSymbol&&&%> <em><%
//&&&staticSymbol&&&=genFeature.getFormattedName()
//&&&staticSymbol&&&%></em>}'.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @return the meta object for the <%
//&&&staticSymbol&&&=genFeature.getFeatureKind()
//&&&staticSymbol&&&%> '<em><%
//&&&staticSymbol&&&=genFeature.getFormattedName()
//&&&staticSymbol&&&%></em>'.
//&&&staticSymbol&&&	 * @see <%
//&&&staticSymbol&&&=genClass.getQualifiedInterfaceName()
//&&&staticSymbol&&&%><%
if (!genClass.isMapEntry() && !genFeature.isSuppressedGetVisibility()) {
//&&&staticSymbol&&&%>#<%
//&&&staticSymbol&&&=genFeature.getGetAccessor()
//&&&staticSymbol&&&%>()<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	 * @see #get<%
//&&&staticSymbol&&&=genClass.getClassifierAccessorName()
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
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
if (isImplementation) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	public <%
//&&&staticSymbol&&&=genFeature.getImportedMetaType()
//&&&staticSymbol&&&%> get<%
//&&&staticSymbol&&&=genFeature.getFeatureAccessorName()
//&&&staticSymbol&&&%>()
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&        <%
if (!genPackage.isLoadedInitialization()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		return (<%
//&&&staticSymbol&&&=genFeature.getImportedMetaType()
//&&&staticSymbol&&&%>)<%
//&&&staticSymbol&&&=genClass.getClassifierInstanceName()
//&&&staticSymbol&&&%>.getEStructuralFeatures().get(<%
//&&&staticSymbol&&&=genClass.getLocalFeatureIndex(genFeature)
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&        <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&        return (<%
//&&&staticSymbol&&&=genFeature.getImportedMetaType()
//&&&staticSymbol&&&%>)get<%
//&&&staticSymbol&&&=genClassifier.getClassifierAccessorName()
//&&&staticSymbol&&&%>().getEStructuralFeatures().get(<%
//&&&staticSymbol&&&=genClass.getLocalFeatureIndex(genFeature)
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&        <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&<%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	<%
//&&&staticSymbol&&&=genFeature.getImportedMetaType()
//&&&staticSymbol&&&%> get<%
//&&&staticSymbol&&&=genFeature.getFeatureAccessorName()
//&&&staticSymbol&&&%>();
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&      <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
if (genModel.isOperationReflection()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&        <%
for (GenOperation genOperation : genClass.getGenOperations()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
if (isInterface) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * Returns the meta object for the '{@link <%
//&&&staticSymbol&&&=genClass.getQualifiedInterfaceName()
//&&&staticSymbol&&&%>#<%
//&&&staticSymbol&&&=genOperation.getName()
//&&&staticSymbol&&&%>(<%
//&&&staticSymbol&&&=genOperation.getParameterTypes(", ")
//&&&staticSymbol&&&%>) <em><%
//&&&staticSymbol&&&=genOperation.getFormattedName()
//&&&staticSymbol&&&%></em>}' operation.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @return the meta object for the '<em><%
//&&&staticSymbol&&&=genOperation.getFormattedName()
//&&&staticSymbol&&&%></em>' operation.
//&&&staticSymbol&&&	 * @see <%
//&&&staticSymbol&&&=genClass.getQualifiedInterfaceName()
//&&&staticSymbol&&&%>#<%
//&&&staticSymbol&&&=genOperation.getName()
//&&&staticSymbol&&&%>(<%
//&&&staticSymbol&&&=genOperation.getParameterTypes(", ")
//&&&staticSymbol&&&%>)
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
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
if (isImplementation) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	public <%
//&&&staticSymbol&&&=genOperation.getImportedMetaType()
//&&&staticSymbol&&&%> get<%
//&&&staticSymbol&&&=genOperation.getOperationAccessorName()
//&&&staticSymbol&&&%>()
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&        <%
if (!genPackage.isLoadedInitialization()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		return <%
//&&&staticSymbol&&&=genClass.getClassifierInstanceName()
//&&&staticSymbol&&&%>.getEOperations().get(<%
//&&&staticSymbol&&&=genClass.getLocalOperationIndex(genOperation)
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&        <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&        return get<%
//&&&staticSymbol&&&=genClassifier.getClassifierAccessorName()
//&&&staticSymbol&&&%>().getEOperations().get(<%
//&&&staticSymbol&&&=genClass.getLocalOperationIndex(genOperation)
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&        <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&<%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	<%
//&&&staticSymbol&&&=genOperation.getImportedMetaType()
//&&&staticSymbol&&&%> get<%
//&&&staticSymbol&&&=genOperation.getOperationAccessorName()
//&&&staticSymbol&&&%>();
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
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
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
if (isInterface) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * Returns the factory that creates the instances of the model.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @return the factory that creates the instances of the model.
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
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
if (isImplementation) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	public <%
//&&&staticSymbol&&&=genPackage.getImportedFactoryInterfaceName()
//&&&staticSymbol&&&%> get<%
//&&&staticSymbol&&&=genPackage.getFactoryName()
//&&&staticSymbol&&&%>()
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		return (<%
//&&&staticSymbol&&&=genPackage.getImportedFactoryInterfaceName()
//&&&staticSymbol&&&%>)getEFactoryInstance();
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&<%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	<%
//&&&staticSymbol&&&=genPackage.getFactoryInterfaceName()
//&&&staticSymbol&&&%> get<%
//&&&staticSymbol&&&=genPackage.getFactoryName()
//&&&staticSymbol&&&%>();
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
if (isImplementation) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
if (!genPackage.isLoadedInitialization()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	private boolean isCreated = false;
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * Creates the meta-model objects for the package.  This method is
//&&&staticSymbol&&&	 * guarded to have no affect on any invocation but its first.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	public void createPackageContents()
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		if (isCreated) return;
//&&&staticSymbol&&&		isCreated = true;
//&&&staticSymbol&&&    <%
if (!genPackage.getGenClasses().isEmpty()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&		// Create classes and their features
//&&&staticSymbol&&&      <%
for (Iterator<GenClass> c=genPackage.getGenClasses().iterator(); c.hasNext();) { GenClass genClass = c.next();
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=genClass.getClassifierInstanceName()
//&&&staticSymbol&&&%> = create<%
//&&&staticSymbol&&&=genClass.getMetaType()
//&&&staticSymbol&&&%>(<%
//&&&staticSymbol&&&=genClass.getClassifierID()
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&        <%
for (GenFeature genFeature : genClass.getGenFeatures()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		create<%
//&&&staticSymbol&&&=genFeature.getMetaType()
//&&&staticSymbol&&&%>(<%
//&&&staticSymbol&&&=genClass.getClassifierInstanceName()
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=genClass.getFeatureID(genFeature)
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&        <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&        <%
if (genModel.isOperationReflection()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&          <%
for (GenOperation genOperation : genClass.getGenOperations()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		createEOperation(<%
//&&&staticSymbol&&&=genClass.getClassifierInstanceName()
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=genClass.getOperationID(genOperation, false)
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&          <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&        <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&        <%
if (c.hasNext()) {
//&&&staticSymbol&&&%>
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
if (!genPackage.getGenEnums().isEmpty()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&		// Create enums
//&&&staticSymbol&&&      <%
for (GenEnum genEnum : genPackage.getGenEnums()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=genEnum.getClassifierInstanceName()
//&&&staticSymbol&&&%> = createEEnum(<%
//&&&staticSymbol&&&=genEnum.getClassifierID()
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&      <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
if (!genPackage.getGenDataTypes().isEmpty()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&		// Create data types
//&&&staticSymbol&&&      <%
for (GenDataType genDataType : genPackage.getGenDataTypes()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=genDataType.getClassifierInstanceName()
//&&&staticSymbol&&&%> = createEDataType(<%
//&&&staticSymbol&&&=genDataType.getClassifierID()
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&      <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	private boolean isInitialized = false;
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%

///////////////////////
class Information
{
  @SuppressWarnings("unused")
  EGenericType eGenericType;
  int depth;
  String type;
  String accessor;
}

class InformationIterator
{
  Iterator<?> iterator;
  InformationIterator(EGenericType eGenericType)
  {
    iterator = EcoreUtil.getAllContents(Collections.singleton(eGenericType));
  }

  boolean hasNext()
  {
    return iterator.hasNext();
  }

  Information next()
  {
    Information information = new Information();
    EGenericType eGenericType = information.eGenericType = (EGenericType)iterator.next();
    for (EObject container = eGenericType.eContainer(); container instanceof EGenericType; container = container.eContainer())
    {
      ++information.depth;
    }
    if (eGenericType.getEClassifier() != null )
    {
      GenClassifier genClassifier = genModel.findGenClassifier(eGenericType.getEClassifier());
      information.type = genPackage.getPackageInstanceVariable(genClassifier.getGenPackage()) + ".get" + genClassifier.getClassifierAccessorName() + "()";
    }
    else if (eGenericType.getETypeParameter() != null)
    {
      ETypeParameter eTypeParameter = eGenericType.getETypeParameter();
      if (eTypeParameter.eContainer() instanceof EClass)
      {
        information.type = genModel.findGenClassifier((EClass)eTypeParameter.eContainer()).getClassifierInstanceName() + "_" + eGenericType.getETypeParameter().getName();
      }
      else
      {
        information.type = "t" + (((EOperation)eTypeParameter.eContainer()).getETypeParameters().indexOf(eTypeParameter) + 1);
      }
    }
    else
    {
      information.type ="";
    }
    if (information.depth > 0)
    {
      if (eGenericType.eContainmentFeature().isMany())
      {
        information.accessor = "getE" + eGenericType.eContainmentFeature().getName().substring(1) + "().add";
      }
      else
      {
        information.accessor = "setE" + eGenericType.eContainmentFeature().getName().substring(1);
      }
    }
    return information;
  }
}
///////////////////////
int maxGenericTypeAssignment = 0;

//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * Complete the initialization of the package and its meta-model.  This
//&&&staticSymbol&&&	 * method is guarded to have no affect on any invocation but its first.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	public void initializePackageContents()
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		if (isInitialized) return;
//&&&staticSymbol&&&		isInitialized = true;
//&&&staticSymbol&&&
//&&&staticSymbol&&&		// Initialize package
//&&&staticSymbol&&&		setName(eNAME);
//&&&staticSymbol&&&		setNsPrefix(eNS_PREFIX);
//&&&staticSymbol&&&		setNsURI(eNS_URI);
//&&&staticSymbol&&&    <%
if (!genPackage.getPackageInitializationDependencies().isEmpty()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&		// Obtain other dependent packages
//&&&staticSymbol&&&      <%
for (GenPackage dep : genPackage.getPackageInitializationDependencies()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=dep.getImportedPackageInterfaceName()
//&&&staticSymbol&&&%> <%
//&&&staticSymbol&&&=genPackage.getPackageInstanceVariable(dep)
//&&&staticSymbol&&&%> = (<%
//&&&staticSymbol&&&=dep.getImportedPackageInterfaceName()
//&&&staticSymbol&&&%>)<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.EPackage")
//&&&staticSymbol&&&%>.Registry.INSTANCE.getEPackage(<%
//&&&staticSymbol&&&=dep.getImportedPackageInterfaceName()
//&&&staticSymbol&&&%>.eNS_URI);
//&&&staticSymbol&&&      <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
if (!genPackage.getSubGenPackages().isEmpty()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&		// Add subpackages
//&&&staticSymbol&&&      <%
for (GenPackage sub : genPackage.getSubGenPackages()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		getESubpackages().add(<%
//&&&staticSymbol&&&=genPackage.getPackageInstanceVariable(sub)
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&      <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
if (!genPackage.getGenClasses().isEmpty()) { boolean firstOperationAssignment = true; int maxTypeParameterAssignment = 0;
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
if (genModel.useGenerics()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&		// Create type parameters
//&&&staticSymbol&&&        <%
for (GenClassifier genClassifier : genPackage.getGenClassifiers()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&          <%
for (GenTypeParameter genTypeParameter : genClassifier.getGenTypeParameters()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&            <%
if (!genTypeParameter.getEcoreTypeParameter().getEBounds().isEmpty() || genTypeParameter.isUsed()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.ETypeParameter")
//&&&staticSymbol&&&%> <%
//&&&staticSymbol&&&=genClassifier.getClassifierInstanceName()
//&&&staticSymbol&&&%>_<%
//&&&staticSymbol&&&=genTypeParameter.getName()
//&&&staticSymbol&&&%> = addETypeParameter(<%
//&&&staticSymbol&&&=genClassifier.getClassifierInstanceName()
//&&&staticSymbol&&&%>, "<%
//&&&staticSymbol&&&=genTypeParameter.getName()
//&&&staticSymbol&&&%>");<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&            <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		addETypeParameter(<%
//&&&staticSymbol&&&=genClassifier.getClassifierInstanceName()
//&&&staticSymbol&&&%>, "<%
//&&&staticSymbol&&&=genTypeParameter.getName()
//&&&staticSymbol&&&%>");<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&            <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&          <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&        <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
if (genModel.useGenerics()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&		// Set bounds for type parameters
//&&&staticSymbol&&&        <%
for (GenClassifier genClassifier : genPackage.getGenClassifiers()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&          <%
for (GenTypeParameter genTypeParameter : genClassifier.getGenTypeParameters()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&            <%
for (EGenericType bound : genTypeParameter.getEcoreTypeParameter().getEBounds()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&              <%
for (InformationIterator i=new InformationIterator(bound); i.hasNext(); ) { Information info = i.next(); String prefix = ""; if (maxGenericTypeAssignment <= info.depth) { ++maxGenericTypeAssignment; prefix = genModel.getImportedName("org.eclipse.emf.ecore.EGenericType") + " "; }
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=prefix
//&&&staticSymbol&&&%>g<%
//&&&staticSymbol&&&=info.depth + 1
//&&&staticSymbol&&&%> = createEGenericType(<%
//&&&staticSymbol&&&=info.type
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&                <%
if (info.depth > 0) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		g<%
//&&&staticSymbol&&&=info.depth
//&&&staticSymbol&&&%>.<%
//&&&staticSymbol&&&=info.accessor
//&&&staticSymbol&&&%>(g<%
//&&&staticSymbol&&&=info.depth + 1
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&                <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&              <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=genClassifier.getClassifierInstanceName()
//&&&staticSymbol&&&%>_<%
//&&&staticSymbol&&&=genTypeParameter.getName()
//&&&staticSymbol&&&%>.getEBounds().add(g1);
//&&&staticSymbol&&&            <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&          <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&        <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&		// Add supertypes to classes
//&&&staticSymbol&&&      <%
for (GenClass genClass : genPackage.getGenClasses()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&        <%
if (!genClass.hasGenericSuperTypes()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&          <%
for (GenClass baseGenClass : genClass.getBaseGenClasses()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=genClass.getClassifierInstanceName()
//&&&staticSymbol&&&%>.getESuperTypes().add(<%
//&&&staticSymbol&&&=genPackage.getPackageInstanceVariable(baseGenClass.getGenPackage())
//&&&staticSymbol&&&%>.get<%
//&&&staticSymbol&&&=baseGenClass.getClassifierAccessorName()
//&&&staticSymbol&&&%>());
//&&&staticSymbol&&&          <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&        <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&          <%
for (EGenericType superType : genClass.getEcoreClass().getEGenericSuperTypes()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&            <%
for (InformationIterator i=new InformationIterator(superType); i.hasNext(); ) { Information info = i.next(); String prefix = ""; if (maxGenericTypeAssignment <= info.depth) { ++maxGenericTypeAssignment; prefix = genModel.getImportedName("org.eclipse.emf.ecore.EGenericType") + " "; }
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=prefix
//&&&staticSymbol&&&%>g<%
//&&&staticSymbol&&&=info.depth + 1
//&&&staticSymbol&&&%> = createEGenericType(<%
//&&&staticSymbol&&&=info.type
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&              <%
if (info.depth > 0) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		g<%
//&&&staticSymbol&&&=info.depth
//&&&staticSymbol&&&%>.<%
//&&&staticSymbol&&&=info.accessor
//&&&staticSymbol&&&%>(g<%
//&&&staticSymbol&&&=info.depth + 1
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&              <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&            <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=genClass.getClassifierInstanceName()
//&&&staticSymbol&&&%>.getEGenericSuperTypes().add(g1);
//&&&staticSymbol&&&          <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&        <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&		// Initialize classes<%
if (genModel.isOperationReflection()) {
//&&&staticSymbol&&&%>, features, and operations; add parameters<%
} else {
//&&&staticSymbol&&&%> and features; add operations and parameters<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
for (Iterator<GenClass> c=genPackage.getGenClasses().iterator(); c.hasNext();) { GenClass genClass = c.next(); boolean hasInstanceTypeName = genModel.useGenerics() && genClass.getEcoreClass().getInstanceTypeName() != null && genClass.getEcoreClass().getInstanceTypeName().contains("<");
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		initEClass(<%
//&&&staticSymbol&&&=genClass.getClassifierInstanceName()
//&&&staticSymbol&&&%>, <%
if (genClass.isDynamic()) {
//&&&staticSymbol&&&%>null<%
} else {
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genClass.getRawImportedInterfaceName()
//&&&staticSymbol&&&%>.class<%
}
//&&&staticSymbol&&&%>, "<%
//&&&staticSymbol&&&=genClass.getName()
//&&&staticSymbol&&&%>", <%
//&&&staticSymbol&&&=genClass.getAbstractFlag()
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=genClass.getInterfaceFlag()
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=genClass.getGeneratedInstanceClassFlag()
//&&&staticSymbol&&&%><%
if (hasInstanceTypeName) {
//&&&staticSymbol&&&%>, "<%
//&&&staticSymbol&&&=genClass.getEcoreClass().getInstanceTypeName()
//&&&staticSymbol&&&%>"<%
}
//&&&staticSymbol&&&%>);<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%><%
if (hasInstanceTypeName) {
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genModel.getNonNLS(2)
//&&&staticSymbol&&&%><%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&        <%
for (GenFeature genFeature : genClass.getGenFeatures()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&          <%
if (genFeature.hasGenericType()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&            <%
for (InformationIterator i=new InformationIterator(genFeature.getEcoreFeature().getEGenericType()); i.hasNext(); ) { Information info = i.next(); String prefix = ""; if (maxGenericTypeAssignment <= info.depth) { ++maxGenericTypeAssignment; prefix = genModel.getImportedName("org.eclipse.emf.ecore.EGenericType") + " "; }
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=prefix
//&&&staticSymbol&&&%>g<%
//&&&staticSymbol&&&=info.depth + 1
//&&&staticSymbol&&&%> = createEGenericType(<%
//&&&staticSymbol&&&=info.type
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&              <%
if (info.depth > 0) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		g<%
//&&&staticSymbol&&&=info.depth
//&&&staticSymbol&&&%>.<%
//&&&staticSymbol&&&=info.accessor
//&&&staticSymbol&&&%>(g<%
//&&&staticSymbol&&&=info.depth + 1
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&              <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&            <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&          <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&          <%
if (genFeature.isReferenceType()) { GenFeature reverseGenFeature = genFeature.getReverse();
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&          <%
String reverse = reverseGenFeature == null ? "null" : genPackage.getPackageInstanceVariable(reverseGenFeature.getGenPackage()) + ".get" + reverseGenFeature.getFeatureAccessorName() + "()";
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		initEReference(get<%
//&&&staticSymbol&&&=genFeature.getFeatureAccessorName()
//&&&staticSymbol&&&%>(), <%
if (genFeature.hasGenericType()) {
//&&&staticSymbol&&&%>g1<%
} else {
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genPackage.getPackageInstanceVariable(genFeature.getTypeGenPackage())
//&&&staticSymbol&&&%>.get<%
//&&&staticSymbol&&&=genFeature.getTypeClassifierAccessorName()
//&&&staticSymbol&&&%>()<%
}
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=reverse
//&&&staticSymbol&&&%>, "<%
//&&&staticSymbol&&&=genFeature.getName()
//&&&staticSymbol&&&%>", <%
//&&&staticSymbol&&&=genFeature.getDefaultValue()
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=genFeature.getLowerBound()
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=genFeature.getUpperBound()
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=genFeature.getContainerClass()
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=genFeature.getTransientFlag()
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=genFeature.getVolatileFlag()
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=genFeature.getChangeableFlag()
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=genFeature.getContainmentFlag()
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=genFeature.getResolveProxiesFlag()
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=genFeature.getUnsettableFlag()
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=genFeature.getUniqueFlag()
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=genFeature.getDerivedFlag()
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=genFeature.getOrderedFlag()
//&&&staticSymbol&&&%>);<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genModel.getNonNLS(genFeature.getDefaultValue(), 2)
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&            <%
for (GenFeature keyFeature : genFeature.getKeys()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		get<%
//&&&staticSymbol&&&=genFeature.getFeatureAccessorName()
//&&&staticSymbol&&&%>().getEKeys().add(<%
//&&&staticSymbol&&&=genPackage.getPackageInstanceVariable(keyFeature.getGenPackage())
//&&&staticSymbol&&&%>.get<%
//&&&staticSymbol&&&=keyFeature.getFeatureAccessorName()
//&&&staticSymbol&&&%>());
//&&&staticSymbol&&&            <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&          <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		initEAttribute(get<%
//&&&staticSymbol&&&=genFeature.getFeatureAccessorName()
//&&&staticSymbol&&&%>(), <%
if (genFeature.hasGenericType()) {
//&&&staticSymbol&&&%>g1<%
} else {
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genPackage.getPackageInstanceVariable(genFeature.getTypeGenPackage())
//&&&staticSymbol&&&%>.get<%
//&&&staticSymbol&&&=genFeature.getTypeClassifierAccessorName()
//&&&staticSymbol&&&%>()<%
}
//&&&staticSymbol&&&%>, "<%
//&&&staticSymbol&&&=genFeature.getName()
//&&&staticSymbol&&&%>", <%
//&&&staticSymbol&&&=genFeature.getDefaultValue()
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=genFeature.getLowerBound()
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=genFeature.getUpperBound()
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=genFeature.getContainerClass()
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=genFeature.getTransientFlag()
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=genFeature.getVolatileFlag()
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=genFeature.getChangeableFlag()
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=genFeature.getUnsettableFlag()
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=genFeature.getIDFlag()
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=genFeature.getUniqueFlag()
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=genFeature.getDerivedFlag()
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=genFeature.getOrderedFlag()
//&&&staticSymbol&&&%>);<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genModel.getNonNLS(genFeature.getDefaultValue(), 2)
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&          <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&        <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&        <%
for (GenOperation genOperation : genClass.getGenOperations()) {String prefix = ""; if (genOperation.hasGenericType() || !genOperation.getGenParameters().isEmpty() || !genOperation.getGenExceptions().isEmpty() || !genOperation.getGenTypeParameters().isEmpty()) { if (firstOperationAssignment) { firstOperationAssignment = false; prefix = genModel.getImportedName("org.eclipse.emf.ecore.EOperation") + " op = "; } else { prefix = "op = "; }} 
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&          <%
if (genModel.useGenerics()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=prefix
//&&&staticSymbol&&&%><%
if (genModel.isOperationReflection()) {
//&&&staticSymbol&&&%>initEOperation(get<%
//&&&staticSymbol&&&=genOperation.getOperationAccessorName()
//&&&staticSymbol&&&%>()<%
} else {
//&&&staticSymbol&&&%>addEOperation(<%
//&&&staticSymbol&&&=genClass.getClassifierInstanceName()
//&&&staticSymbol&&&%><%
}
//&&&staticSymbol&&&%>, <%
if (genOperation.isVoid() || genOperation.hasGenericType()) {
//&&&staticSymbol&&&%>null<%
} else {
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genPackage.getPackageInstanceVariable(genOperation.getTypeGenPackage())
//&&&staticSymbol&&&%>.get<%
//&&&staticSymbol&&&=genOperation.getTypeClassifierAccessorName()
//&&&staticSymbol&&&%>()<%
}
//&&&staticSymbol&&&%>, "<%
//&&&staticSymbol&&&=genOperation.getName()
//&&&staticSymbol&&&%>", <%
//&&&staticSymbol&&&=genOperation.getLowerBound()
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=genOperation.getUpperBound()
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=genOperation.getUniqueFlag()
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=genOperation.getOrderedFlag()
//&&&staticSymbol&&&%>);<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&          <%
} else if (!genOperation.isVoid()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&            <%
if (!genOperation.getEcoreOperation().isOrdered() || !genOperation.getEcoreOperation().isUnique()) { needsAddEOperation = true;
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=prefix
//&&&staticSymbol&&&%><%
if (genModel.isOperationReflection()) {
//&&&staticSymbol&&&%>initEOperation(get<%
//&&&staticSymbol&&&=genOperation.getOperationAccessorName()
//&&&staticSymbol&&&%>()<%
} else {
//&&&staticSymbol&&&%>addEOperation(<%
//&&&staticSymbol&&&=genClass.getClassifierInstanceName()
//&&&staticSymbol&&&%><%
}
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=genPackage.getPackageInstanceVariable(genOperation.getTypeGenPackage())
//&&&staticSymbol&&&%>.get<%
//&&&staticSymbol&&&=genOperation.getTypeClassifierAccessorName()
//&&&staticSymbol&&&%>(), "<%
//&&&staticSymbol&&&=genOperation.getName()
//&&&staticSymbol&&&%>", <%
//&&&staticSymbol&&&=genOperation.getLowerBound()
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=genOperation.getUpperBound()
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=genOperation.getUniqueFlag()
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=genOperation.getOrderedFlag()
//&&&staticSymbol&&&%>);<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&            <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=prefix
//&&&staticSymbol&&&%><%
if (genModel.isOperationReflection()) {
//&&&staticSymbol&&&%>initEOperation(get<%
//&&&staticSymbol&&&=genOperation.getOperationAccessorName()
//&&&staticSymbol&&&%>()<%
} else {
//&&&staticSymbol&&&%>addEOperation(<%
//&&&staticSymbol&&&=genClass.getClassifierInstanceName()
//&&&staticSymbol&&&%><%
}
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=genPackage.getPackageInstanceVariable(genOperation.getTypeGenPackage())
//&&&staticSymbol&&&%>.get<%
//&&&staticSymbol&&&=genOperation.getTypeClassifierAccessorName()
//&&&staticSymbol&&&%>(), "<%
//&&&staticSymbol&&&=genOperation.getName()
//&&&staticSymbol&&&%>", <%
//&&&staticSymbol&&&=genOperation.getLowerBound()
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=genOperation.getUpperBound()
//&&&staticSymbol&&&%>);<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&            <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&          <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=prefix
//&&&staticSymbol&&&%><%
if (genModel.isOperationReflection()) {
//&&&staticSymbol&&&%>initEOperation(get<%
//&&&staticSymbol&&&=genOperation.getOperationAccessorName()
//&&&staticSymbol&&&%>()<%
} else {
//&&&staticSymbol&&&%>addEOperation(<%
//&&&staticSymbol&&&=genClass.getClassifierInstanceName()
//&&&staticSymbol&&&%><%
}
//&&&staticSymbol&&&%>, null, "<%
//&&&staticSymbol&&&=genOperation.getName()
//&&&staticSymbol&&&%>");<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&          <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&          <%
if (genModel.useGenerics()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&            <%
for (ListIterator<GenTypeParameter> t=genOperation.getGenTypeParameters().listIterator(); t.hasNext(); ) { GenTypeParameter genTypeParameter = t.next(); String typeParameterVariable = ""; if (!genTypeParameter.getEcoreTypeParameter().getEBounds().isEmpty() || genTypeParameter.isUsed()) { if (maxTypeParameterAssignment <= t.previousIndex()) { ++maxTypeParameterAssignment; typeParameterVariable = genModel.getImportedName("org.eclipse.emf.ecore.ETypeParameter") + " t" + t.nextIndex() + " = "; } else { typeParameterVariable = "t" + t.nextIndex() + " = "; }} 
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=typeParameterVariable
//&&&staticSymbol&&&%>addETypeParameter(op, "<%
//&&&staticSymbol&&&=genTypeParameter.getName()
//&&&staticSymbol&&&%>");<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&              <%
for (EGenericType typeParameter : genTypeParameter.getEcoreTypeParameter().getEBounds()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&                <%
for (InformationIterator i=new InformationIterator(typeParameter); i.hasNext(); ) { Information info = i.next(); String typePrefix = ""; if (maxGenericTypeAssignment <= info.depth) { ++maxGenericTypeAssignment; typePrefix = genModel.getImportedName("org.eclipse.emf.ecore.EGenericType") + " "; }
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=typePrefix
//&&&staticSymbol&&&%>g<%
//&&&staticSymbol&&&=info.depth + 1
//&&&staticSymbol&&&%> = createEGenericType(<%
//&&&staticSymbol&&&=info.type
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&                  <%
if (info.depth > 0) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		g<%
//&&&staticSymbol&&&=info.depth
//&&&staticSymbol&&&%>.<%
//&&&staticSymbol&&&=info.accessor
//&&&staticSymbol&&&%>(g<%
//&&&staticSymbol&&&=info.depth + 1
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&                  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&                <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		t<%
//&&&staticSymbol&&&=t.nextIndex()
//&&&staticSymbol&&&%>.getEBounds().add(g1);
//&&&staticSymbol&&&              <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&            <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&          <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&          <%
for (GenParameter genParameter : genOperation.getGenParameters()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&            <%
if (genParameter.hasGenericType()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&              <%
for (InformationIterator i=new InformationIterator(genParameter.getEcoreParameter().getEGenericType()); i.hasNext(); ) { Information info = i.next(); String typePrefix = ""; if (maxGenericTypeAssignment <= info.depth) { ++maxGenericTypeAssignment; typePrefix = genModel.getImportedName("org.eclipse.emf.ecore.EGenericType") + " "; }
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=typePrefix
//&&&staticSymbol&&&%>g<%
//&&&staticSymbol&&&=info.depth + 1
//&&&staticSymbol&&&%> = createEGenericType(<%
//&&&staticSymbol&&&=info.type
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&                <%
if (info.depth > 0) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		g<%
//&&&staticSymbol&&&=info.depth
//&&&staticSymbol&&&%>.<%
//&&&staticSymbol&&&=info.accessor
//&&&staticSymbol&&&%>(g<%
//&&&staticSymbol&&&=info.depth + 1
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&                <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&              <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&            <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&            <%
if (genModel.useGenerics()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		addEParameter(op, <%
if (genParameter.hasGenericType()){
//&&&staticSymbol&&&%>g1<%
} else {
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genPackage.getPackageInstanceVariable(genParameter.getTypeGenPackage())
//&&&staticSymbol&&&%>.get<%
//&&&staticSymbol&&&=genParameter.getTypeClassifierAccessorName()
//&&&staticSymbol&&&%>()<%
}
//&&&staticSymbol&&&%>, "<%
//&&&staticSymbol&&&=genParameter.getName()
//&&&staticSymbol&&&%>", <%
//&&&staticSymbol&&&=genParameter.getLowerBound()
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=genParameter.getUpperBound()
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=genParameter.getUniqueFlag()
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=genParameter.getOrderedFlag()
//&&&staticSymbol&&&%>);<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&            <%
} else if (!genParameter.getEcoreParameter().isOrdered() || !genParameter.getEcoreParameter().isUnique()) { needsAddEParameter = true;
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		addEParameter(op, <%
if (genParameter.hasGenericType()){
//&&&staticSymbol&&&%>g1<%
} else {
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genPackage.getPackageInstanceVariable(genParameter.getTypeGenPackage())
//&&&staticSymbol&&&%>.get<%
//&&&staticSymbol&&&=genParameter.getTypeClassifierAccessorName()
//&&&staticSymbol&&&%>()<%
}
//&&&staticSymbol&&&%>, "<%
//&&&staticSymbol&&&=genParameter.getName()
//&&&staticSymbol&&&%>", <%
//&&&staticSymbol&&&=genParameter.getLowerBound()
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=genParameter.getUpperBound()
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=genParameter.getUniqueFlag()
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=genParameter.getOrderedFlag()
//&&&staticSymbol&&&%>);<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&            <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		addEParameter(op, <%
if (genParameter.hasGenericType()){
//&&&staticSymbol&&&%>g1<%
} else {
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genPackage.getPackageInstanceVariable(genParameter.getTypeGenPackage())
//&&&staticSymbol&&&%>.get<%
//&&&staticSymbol&&&=genParameter.getTypeClassifierAccessorName()
//&&&staticSymbol&&&%>()<%
}
//&&&staticSymbol&&&%>, "<%
//&&&staticSymbol&&&=genParameter.getName()
//&&&staticSymbol&&&%>", <%
//&&&staticSymbol&&&=genParameter.getLowerBound()
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=genParameter.getUpperBound()
//&&&staticSymbol&&&%>);<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&            <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&          <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&          <%
if (genOperation.hasGenericExceptions()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&              <%
for (EGenericType genericExceptions : genOperation.getEcoreOperation().getEGenericExceptions()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&                <%
for (InformationIterator i=new InformationIterator(genericExceptions); i.hasNext(); ) { Information info = i.next(); String typePrefix = ""; if (maxGenericTypeAssignment <= info.depth) { ++maxGenericTypeAssignment; typePrefix = genModel.getImportedName("org.eclipse.emf.ecore.EGenericType") + " "; }
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=typePrefix
//&&&staticSymbol&&&%>g<%
//&&&staticSymbol&&&=info.depth + 1
//&&&staticSymbol&&&%> = createEGenericType(<%
//&&&staticSymbol&&&=info.type
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&                  <%
if (info.depth > 0) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		g<%
//&&&staticSymbol&&&=info.depth
//&&&staticSymbol&&&%>.<%
//&&&staticSymbol&&&=info.accessor
//&&&staticSymbol&&&%>(g<%
//&&&staticSymbol&&&=info.depth + 1
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&                  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		addEException(op, g<%
//&&&staticSymbol&&&=info.depth + 1
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&                <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&              <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&          <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&            <%
for (GenClassifier genException : genOperation.getGenExceptions()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		addEException(op, <%
//&&&staticSymbol&&&=genPackage.getPackageInstanceVariable(genException.getGenPackage())
//&&&staticSymbol&&&%>.get<%
//&&&staticSymbol&&&=genException.getClassifierAccessorName()
//&&&staticSymbol&&&%>());
//&&&staticSymbol&&&            <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&          <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&          <%
if (!genOperation.isVoid() && genOperation.hasGenericType()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&            <%
for (InformationIterator i=new InformationIterator(genOperation.getEcoreOperation().getEGenericType()); i.hasNext(); ) { Information info = i.next(); String typePrefix = ""; if (maxGenericTypeAssignment <= info.depth) { ++maxGenericTypeAssignment; typePrefix = genModel.getImportedName("org.eclipse.emf.ecore.EGenericType") + " "; }
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=typePrefix
//&&&staticSymbol&&&%>g<%
//&&&staticSymbol&&&=info.depth + 1
//&&&staticSymbol&&&%> = createEGenericType(<%
//&&&staticSymbol&&&=info.type
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&              <%
if (info.depth > 0) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		g<%
//&&&staticSymbol&&&=info.depth
//&&&staticSymbol&&&%>.<%
//&&&staticSymbol&&&=info.accessor
//&&&staticSymbol&&&%>(g<%
//&&&staticSymbol&&&=info.depth + 1
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&              <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&            <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		initEOperation(op, g1);
//&&&staticSymbol&&&          <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&        <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&        <%
if (c.hasNext()) {
//&&&staticSymbol&&&%>
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
if (!genPackage.getGenEnums().isEmpty()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&		// Initialize enums and add enum literals
//&&&staticSymbol&&&      <%
for (Iterator<GenEnum> e=genPackage.getGenEnums().iterator(); e.hasNext();) { GenEnum genEnum = e.next();
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		initEEnum(<%
//&&&staticSymbol&&&=genEnum.getClassifierInstanceName()
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=genEnum.getImportedName()
//&&&staticSymbol&&&%>.class, "<%
//&&&staticSymbol&&&=genEnum.getName()
//&&&staticSymbol&&&%>");<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&        <%
for (GenEnumLiteral genEnumLiteral : genEnum.getGenEnumLiterals()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		addEEnumLiteral(<%
//&&&staticSymbol&&&=genEnum.getClassifierInstanceName()
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&*%%storeSymbol%%*2
//&&&staticSymbol&&&%>.<%
//&&&staticSymbol&&&=genEnumLiteral.getEnumLiteralInstanceConstantName()
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&        <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&        <%
if (e.hasNext()) {
//&&&staticSymbol&&&%>
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
if (!genPackage.getGenDataTypes().isEmpty()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&		// Initialize data types
//&&&staticSymbol&&&      <%
for (GenDataType genDataType : genPackage.getGenDataTypes()) {boolean hasInstanceTypeName = genModel.useGenerics() && genDataType.getEcoreDataType().getInstanceTypeName() != null && genDataType.getEcoreDataType().getInstanceTypeName().contains("<");
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		initEDataType(<%
//&&&staticSymbol&&&=genDataType.getClassifierInstanceName()
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=genDataType.getRawImportedInstanceClassName()
//&&&staticSymbol&&&%>.class, "<%
//&&&staticSymbol&&&=genDataType.getName()
//&&&staticSymbol&&&%>", <%
//&&&staticSymbol&&&=genDataType.getSerializableFlag()
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=genDataType.getGeneratedInstanceClassFlag()
//&&&staticSymbol&&&%><%
if (hasInstanceTypeName) {
//&&&staticSymbol&&&%>, "<%
//&&&staticSymbol&&&=genDataType.getEcoreDataType().getInstanceTypeName()
//&&&staticSymbol&&&%>"<%
}
//&&&staticSymbol&&&%>);<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%><%
if (hasInstanceTypeName) {
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genModel.getNonNLS(2)
//&&&staticSymbol&&&%><%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
if (genPackage.getSuperGenPackage() == null) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&		// Create resource
//&&&staticSymbol&&&		createResource(<%
//&&&staticSymbol&&&=genPackage.getSchemaLocation()
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
if (!genPackage.isEcorePackage() && !genPackage.getAnnotationSources().isEmpty()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&		// Create annotations
//&&&staticSymbol&&&      <%
for (String annotationSource : genPackage.getAnnotationSources()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		// <%
//&&&staticSymbol&&&=annotationSource
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		create<%
//&&&staticSymbol&&&=genPackage.getAnnotationSourceIdentifier(annotationSource)
//&&&staticSymbol&&&%>Annotations();
//&&&staticSymbol&&&      <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&    <%
for (String annotationSource : genPackage.getAnnotationSources()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * Initializes the annotations for <b><%
//&&&staticSymbol&&&=annotationSource
//&&&staticSymbol&&&%></b>.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	protected void create<%
//&&&staticSymbol&&&=genPackage.getAnnotationSourceIdentifier(annotationSource)
//&&&staticSymbol&&&%>Annotations()
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		String source = <%
if (annotationSource == null) {
//&&&staticSymbol&&&%>null;<%
} else {
//&&&staticSymbol&&&%>"<%
//&&&staticSymbol&&&=annotationSource
//&&&staticSymbol&&&%>";<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%><%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
for (EAnnotation eAnnotation : genPackage.getAllAnnotations()) { List<GenPackage.AnnotationReferenceData> annotationReferenceDataList = genPackage.getReferenceData(eAnnotation);
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&        <%
if (annotationSource == null ? eAnnotation.getSource() == null : annotationSource.equals(eAnnotation.getSource())) {
//&&&staticSymbol&&&%>	
//&&&staticSymbol&&&		addAnnotation
//&&&staticSymbol&&&		  (<%
//&&&staticSymbol&&&=genPackage.getAnnotatedModelElementAccessor(eAnnotation)
//&&&staticSymbol&&&%>, 
//&&&staticSymbol&&&		   source, 
//&&&staticSymbol&&&		   new String[] 
//&&&staticSymbol&&&		   {
//&&&staticSymbol&&&          <%
for (Iterator<Map.Entry<String, String>> k = eAnnotation.getDetails().iterator(); k.hasNext();) { Map.Entry<String, String> detail = k.next(); String key = Literals.toStringLiteral(detail.getKey(), genModel); String value = Literals.toStringLiteral(detail.getValue(), genModel);
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			 <%
//&&&staticSymbol&&&=key
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=value
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&*%%storeSymbol%%*3
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genModel.getNonNLS(key + value)
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&          <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		   }<%
if (annotationReferenceDataList.isEmpty()) {
//&&&staticSymbol&&&%>);<%
} else {
//&&&staticSymbol&&&%>,<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&          <%
if (!annotationReferenceDataList.isEmpty()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		   new <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.common.util.URI")
//&&&staticSymbol&&&%>[] 
//&&&staticSymbol&&&		   {
//&&&staticSymbol&&&            <%
for (Iterator<GenPackage.AnnotationReferenceData> k = annotationReferenceDataList.iterator(); k.hasNext();) { GenPackage.AnnotationReferenceData annotationReferenceData = k.next();
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			 <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.common.util.URI")
//&&&staticSymbol&&&%>.createURI(<%
if (annotationReferenceData.containingGenPackage != genPackage) {
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=annotationReferenceData.containingGenPackage.getImportedPackageInterfaceName()
//&&&staticSymbol&&&%>.<%
}
//&&&staticSymbol&&&%>eNS_URI).appendFragment("<%
//&&&staticSymbol&&&=annotationReferenceData.uriFragment
//&&&staticSymbol&&&%>")<%
if (k.hasNext()) {
//&&&staticSymbol&&&%>,<%
}
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&            <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		   });
//&&&staticSymbol&&&          <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&          <%
for (EAnnotation nestedEAnnotation : genPackage.getAllNestedAnnotations(eAnnotation)) {String nestedAnnotationSource = nestedEAnnotation.getSource();  int depth = 0; boolean nonContentAnnotation = false; StringBuilder path = new StringBuilder();  for (EObject eContainer = nestedEAnnotation.eContainer(), child = nestedEAnnotation; child != eAnnotation; child = eContainer, eContainer = eContainer.eContainer())  {  boolean nonContentChild = child.eContainmentFeature() != EcorePackage.Literals.EANNOTATION__CONTENTS; if (path.length() != 0) { path.insert(0, ", ");  } path.insert(0, nonContentChild); if (nonContentChild) { nonContentAnnotation = true; } ++depth;  } List<GenPackage.AnnotationReferenceData> nestedAnnotationReferenceDataList = genPackage.getReferenceData(nestedEAnnotation);
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		addAnnotation
//&&&staticSymbol&&&		  (<%
//&&&staticSymbol&&&=genPackage.getAnnotatedModelElementAccessor(eAnnotation)
//&&&staticSymbol&&&%>, 
//&&&staticSymbol&&&		   <%
if (nonContentAnnotation && genModel.getRuntimeVersion().getValue() >= GenRuntimeVersion.EMF210_VALUE) {
//&&&staticSymbol&&&%>new boolean[] { <%
//&&&staticSymbol&&&=path.toString()
//&&&staticSymbol&&&%> }<%
} else {
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=depth
//&&&staticSymbol&&&%><%
}
//&&&staticSymbol&&&%>,
//&&&staticSymbol&&&		   <%
if (nestedAnnotationSource == null) {
//&&&staticSymbol&&&%>null,<%
} else {
//&&&staticSymbol&&&%>"<%
//&&&staticSymbol&&&=nestedAnnotationSource
//&&&staticSymbol&&&%>",<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%><%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		   new String[] 
//&&&staticSymbol&&&		   {
//&&&staticSymbol&&&            <%
for (Iterator<Map.Entry<String, String>> l = nestedEAnnotation.getDetails().iterator(); l.hasNext();) { Map.Entry<String, String> detail = l.next(); String key = Literals.toStringLiteral(detail.getKey(), genModel); String value = Literals.toStringLiteral(detail.getValue(), genModel);
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			 <%
//&&&staticSymbol&&&=key
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=value
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&*%%storeSymbol%%*4
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genModel.getNonNLS(key + value)
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&            <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		   }<%
if (nestedAnnotationReferenceDataList.isEmpty()) {
//&&&staticSymbol&&&%>);<%
} else {
//&&&staticSymbol&&&%>,<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&            <%
if (!nestedAnnotationReferenceDataList.isEmpty()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		   new <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.common.util.URI")
//&&&staticSymbol&&&%>[] 
//&&&staticSymbol&&&		   {
//&&&staticSymbol&&&            <%
for (Iterator<GenPackage.AnnotationReferenceData> l = nestedAnnotationReferenceDataList.iterator(); l.hasNext();) { GenPackage.AnnotationReferenceData annotationReferenceData = l.next();
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			 <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.common.util.URI")
//&&&staticSymbol&&&%>.createURI(<%
if (annotationReferenceData.containingGenPackage != genPackage) {
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=annotationReferenceData.containingGenPackage.getImportedPackageInterfaceName()
//&&&staticSymbol&&&%>.<%
}
//&&&staticSymbol&&&%>eNS_URI).appendFragment("<%
//&&&staticSymbol&&&=annotationReferenceData.uriFragment
//&&&staticSymbol&&&%>")<%
if (l.hasNext()) {
//&&&staticSymbol&&&%>,<%
}
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&            <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		   });
//&&&staticSymbol&&&            <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&          <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&        <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
if (genPackage.isLoadingInitialization()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	private boolean isLoaded = false;
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * Laods the package and any sub-packages from their serialized form.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	public void loadPackage()
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		if (isLoaded) return;
//&&&staticSymbol&&&		isLoaded = true;
//&&&staticSymbol&&&
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=genModel.getImportedName("java.net.URL")
//&&&staticSymbol&&&%> url = getClass().getResource(packageFilename);
//&&&staticSymbol&&&		if (url == null)
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			throw new RuntimeException("Missing serialized package: " + packageFilename);<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.common.util.URI")
//&&&staticSymbol&&&%> uri = <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.common.util.URI")
//&&&staticSymbol&&&%>.createURI(url.toString());
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.resource.Resource")
//&&&staticSymbol&&&%> resource = new <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl")
//&&&staticSymbol&&&%>().createResource(uri);
//&&&staticSymbol&&&		try
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			resource.load(null);
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&		catch (<%
//&&&staticSymbol&&&=genModel.getImportedName("java.io.IOException")
//&&&staticSymbol&&&%> exception)
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			throw new <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.common.util.WrappedException")
//&&&staticSymbol&&&%>(exception);
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&		initializeFromLoadedEPackage(this, (<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.EPackage")
//&&&staticSymbol&&&%>)resource.getContents().get(0));
//&&&staticSymbol&&&		createResource(eNS_URI);
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	private boolean isFixed = false;
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	public void fixPackageContents()
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		if (isFixed) return;
//&&&staticSymbol&&&		isFixed = true;
//&&&staticSymbol&&&		fixEClassifiers();
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * Sets the instance class on the given classifier.
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
//&&&staticSymbol&&&	protected void fixInstanceClass(<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.EClassifier")
//&&&staticSymbol&&&%> eClassifier)
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		if (eClassifier.getInstanceClassName() == null)
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&    <%
ArrayList<GenClass> dynamicGenClasses = new ArrayList<GenClass>(); for (GenClass genClass : genPackage.getGenClasses()) { if (genClass.isDynamic()) { dynamicGenClasses.add(genClass); } }
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
if (dynamicGenClasses.isEmpty()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			eClassifier.setInstanceClassName("<%
//&&&staticSymbol&&&=genPackage.getInterfacePackageName()
//&&&staticSymbol&&&%>." + eClassifier.getName());<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			setGeneratedClassName(eClassifier);
//&&&staticSymbol&&&    <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			switch (eClassifier.getClassifierID())
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&      <%
for (GenClass genClass : dynamicGenClasses) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&        <%
if (genClass.isDynamic()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				case <%
//&&&staticSymbol&&&=genPackage.getClassifierID(genClass)
//&&&staticSymbol&&&%>:
//&&&staticSymbol&&&        <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				{
//&&&staticSymbol&&&					break;
//&&&staticSymbol&&&				}
//&&&staticSymbol&&&				default:
//&&&staticSymbol&&&				{
//&&&staticSymbol&&&					eClassifier.setInstanceClassName("<%
//&&&staticSymbol&&&=genPackage.getInterfacePackageName()
//&&&staticSymbol&&&%>." + eClassifier.getName());<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&					setGeneratedClassName(eClassifier);
//&&&staticSymbol&&&					break;
//&&&staticSymbol&&&				}
//&&&staticSymbol&&&			}
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
if (needsAddEOperation) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	protected <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.EOperation")
//&&&staticSymbol&&&%> addEOperation(<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.EClass")
//&&&staticSymbol&&&%> owner, <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.EClassifier")
//&&&staticSymbol&&&%> type, String name, int lowerBound, int upperBound, boolean isUnique, boolean isOrdered)
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.EOperation")
//&&&staticSymbol&&&%> o = addEOperation(owner, type, name, lowerBound, upperBound);
//&&&staticSymbol&&&		o.setUnique(isUnique);
//&&&staticSymbol&&&		o.setOrdered(isOrdered);
//&&&staticSymbol&&&		return o;
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&	
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
if (needsAddEParameter) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	protected <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.EParameter")
//&&&staticSymbol&&&%> addEParameter(<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.EOperation")
//&&&staticSymbol&&&%> owner, <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.EClassifier")
//&&&staticSymbol&&&%> type, String name, int lowerBound, int upperBound, boolean isUnique, boolean isOrdered)
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.EParameter")
//&&&staticSymbol&&&%> p = ecoreFactory.createEParameter();
//&&&staticSymbol&&&		p.setEType(type);
//&&&staticSymbol&&&		p.setName(name);
//&&&staticSymbol&&&		p.setLowerBound(lowerBound);
//&&&staticSymbol&&&		p.setUpperBound(upperBound);
//&&&staticSymbol&&&		p.setUnique(isUnique);
//&&&staticSymbol&&&		p.setOrdered(isOrdered);
//&&&staticSymbol&&&		owner.getEParameters().add(p);
//&&&staticSymbol&&&		return p;
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&	
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
if (isInterface && genPackage.isLiteralsInterface()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * Defines literals for the meta objects that represent
//&&&staticSymbol&&&	 * <ul>
//&&&staticSymbol&&&	 *   <li>each class,</li>
//&&&staticSymbol&&&	 *   <li>each feature of each class,</li>
//&&&staticSymbol&&&  <%
if (genModel.isOperationReflection()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	 *   <li>each operation of each class,</li>
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	 *   <li>each enum,</li>
//&&&staticSymbol&&&	 *   <li>and each data type</li>
//&&&staticSymbol&&&	 * </ul>
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	<%
if (isImplementation) {
//&&&staticSymbol&&&%>public <%
}
//&&&staticSymbol&&&%>interface Literals
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&  <%
for (GenClassifier genClassifier : genPackage.getGenClassifiers()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		/**
//&&&staticSymbol&&&    <%
if (genClassifier instanceof GenClass) { GenClass genClass = (GenClass)genClassifier;
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
if (!genClass.isInterface()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		 * The meta object literal for the '{@link <%
//&&&staticSymbol&&&=genClass.getQualifiedClassName()
//&&&staticSymbol&&&%> <em><%
//&&&staticSymbol&&&=genClass.getFormattedName()
//&&&staticSymbol&&&%></em>}' class.
//&&&staticSymbol&&&		 * <!-- begin-user-doc -->
//&&&staticSymbol&&&		 * <!-- end-user-doc -->
//&&&staticSymbol&&&		 * @see <%
//&&&staticSymbol&&&=genClass.getQualifiedClassName()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		 * The meta object literal for the '{@link <%
//&&&staticSymbol&&&=genClass.getQualifiedInterfaceName()
//&&&staticSymbol&&&%> <em><%
//&&&staticSymbol&&&=genClass.getFormattedName()
//&&&staticSymbol&&&%></em>}' class.
//&&&staticSymbol&&&		 * <!-- begin-user-doc -->
//&&&staticSymbol&&&		 * <!-- end-user-doc -->
//&&&staticSymbol&&&		 * @see <%
//&&&staticSymbol&&&=genClass.getQualifiedInterfaceName()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
} else if (genClassifier instanceof GenEnum) { GenEnum genEnum = (GenEnum)genClassifier;
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		 * The meta object literal for the '{@link <%
//&&&staticSymbol&&&=genEnum.getQualifiedName()
//&&&staticSymbol&&&%> <em><%
//&&&staticSymbol&&&=genEnum.getFormattedName()
//&&&staticSymbol&&&%></em>}' enum.
//&&&staticSymbol&&&		 * <!-- begin-user-doc -->
//&&&staticSymbol&&&		 * <!-- end-user-doc -->
//&&&staticSymbol&&&		 * @see <%
//&&&staticSymbol&&&=genEnum.getQualifiedName()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
} else if (genClassifier instanceof GenDataType) { GenDataType genDataType = (GenDataType)genClassifier;
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		 * The meta object literal for the '<em><%
//&&&staticSymbol&&&=genDataType.getFormattedName()
//&&&staticSymbol&&&%></em>' data type.
//&&&staticSymbol&&&		 * <!-- begin-user-doc -->
//&&&staticSymbol&&&		 * <!-- end-user-doc -->
//&&&staticSymbol&&&      <%
if (!genDataType.isPrimitiveType() && !genDataType.isArrayType()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		 * @see <%
//&&&staticSymbol&&&=genDataType.getRawInstanceClassName()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		 * @see <%
//&&&staticSymbol&&&=genPackage.getQualifiedPackageClassName()
//&&&staticSymbol&&&%>#get<%
//&&&staticSymbol&&&=genClassifier.getClassifierAccessorName()
//&&&staticSymbol&&&%>()
//&&&staticSymbol&&&		 * @generated
//&&&staticSymbol&&&		 */
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=publicStaticFinalFlag
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genClassifier.getImportedMetaType()
//&&&staticSymbol&&&%> <%
//&&&staticSymbol&&&=genPackage.getClassifierID(genClassifier)
//&&&staticSymbol&&&%> = eINSTANCE.get<%
//&&&staticSymbol&&&=genClassifier.getClassifierAccessorName()
//&&&staticSymbol&&&%>();
//&&&staticSymbol&&&
//&&&staticSymbol&&&    <%
if (genClassifier instanceof GenClass) { GenClass genClass = (GenClass)genClassifier;
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
for (GenFeature genFeature : genClass.getGenFeatures()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		/**
//&&&staticSymbol&&&		 * The meta object literal for the '<em><b><%
//&&&staticSymbol&&&=genFeature.getFormattedName()
//&&&staticSymbol&&&%></b></em>' <%
//&&&staticSymbol&&&=genFeature.getFeatureKind()
//&&&staticSymbol&&&%> feature.
//&&&staticSymbol&&&		 * <!-- begin-user-doc -->
//&&&staticSymbol&&&		 * <!-- end-user-doc -->
//&&&staticSymbol&&&		 * @generated
//&&&staticSymbol&&&		 */
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=publicStaticFinalFlag
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genFeature.getImportedMetaType()
//&&&staticSymbol&&&%> <%
//&&&staticSymbol&&&=genClass.getFeatureID(genFeature)
//&&&staticSymbol&&&%> = eINSTANCE.get<%
//&&&staticSymbol&&&=genFeature.getFeatureAccessorName()
//&&&staticSymbol&&&%>();
//&&&staticSymbol&&&
//&&&staticSymbol&&&      <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
if (genModel.isOperationReflection()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&        <%
for (GenOperation genOperation : genClass.getGenOperations()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		/**
//&&&staticSymbol&&&		 * The meta object literal for the '<em><b><%
//&&&staticSymbol&&&=genOperation.getFormattedName()
//&&&staticSymbol&&&%></b></em>' operation.
//&&&staticSymbol&&&		 * <!-- begin-user-doc -->
//&&&staticSymbol&&&		 * <!-- end-user-doc -->
//&&&staticSymbol&&&		 * @generated
//&&&staticSymbol&&&		 */
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=publicStaticFinalFlag
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genOperation.getImportedMetaType()
//&&&staticSymbol&&&%> <%
//&&&staticSymbol&&&=genClass.getOperationID(genOperation, false)
//&&&staticSymbol&&&%> = eINSTANCE.get<%
//&&&staticSymbol&&&=genOperation.getOperationAccessorName()
//&&&staticSymbol&&&%>();
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
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&} //<%
//&&&staticSymbol&&&*%%storeSymbol%%*5
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
genModel.emitSortedImports();
//&&&staticSymbol&&&%>

}
}