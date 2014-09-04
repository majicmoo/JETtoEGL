class ValidatorClass {
public static void main (String[] args) {
//&&&staticSymbol&&&<%import java.util.*;%>
//&&&staticSymbol&&&<%import org.eclipse.emf.codegen.ecore.genmodel.*;%>
//&&&staticSymbol&&&<%import org.eclipse.emf.codegen.util.CodeGenUtil;%>
//&&&staticSymbol&&&<%

/**
 * Copyright (c) 2002-2013 IBM Corporation and others.
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
final String singleWildcard = genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50 ? "<?>" : "";
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%include("../Header.javajetinc");%>
//&&&staticSymbol&&&package <%
//&&&staticSymbol&&&=genPackage.getUtilitiesPackageName()
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
genModel.addImport("java.util.Map");
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
final String _Map = genModel.useGenerics() ? "Map<" + genModel.getImportedName("java.lang.Object") + ", " + genModel.getImportedName("java.lang.Object") + ">" : "Map";
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
final String objectArgument = genModel.useGenerics() ? "<" + genModel.getImportedName("java.lang.Object") + ">" : "";
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
genModel.addImport("org.eclipse.emf.common.util.DiagnosticChain");
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
genModel.addImport("org.eclipse.emf.ecore.EPackage");
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
if (!genPackage.hasJavaLangConflict() && !genPackage.getUtilitiesPackageName().equals(genPackage.getInterfacePackageName())) genModel.addImport(genPackage.getInterfacePackageName() + ".*");
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
genModel.markImportLocation(stringBuffer);
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
genModel.addPseudoImport("org.eclipse.emf.ecore.EValidator.Descriptor");
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
genModel.addPseudoImport("org.eclipse.emf.ecore.EValidator.Registry");
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
genModel.addPseudoImport("org.eclipse.emf.ecore.EValidator.SubstitutionLabelProvider");
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
genModel.addPseudoImport("org.eclipse.emf.ecore.EValidator.PatternMatcher");
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&/**
//&&&staticSymbol&&& * <!-- begin-user-doc -->
//&&&staticSymbol&&& * The <b>Validator</b> for the model.
//&&&staticSymbol&&& * <!-- end-user-doc -->
//&&&staticSymbol&&& * @see <%
//&&&staticSymbol&&&=genPackage.getQualifiedPackageInterfaceName()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&& * @generated
//&&&staticSymbol&&& */
//&&&staticSymbol&&&public class <%
//&&&staticSymbol&&&=genPackage.getValidatorClassName()
//&&&staticSymbol&&&%> extends <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.util.EObjectValidator")
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
//&&&staticSymbol&&&	public static final <%
//&&&staticSymbol&&&=genPackage.getValidatorClassName()
//&&&staticSymbol&&&%> INSTANCE = new <%
//&&&staticSymbol&&&=genPackage.getValidatorClassName()
//&&&staticSymbol&&&%>();
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
//&&&staticSymbol&&&	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	public static final String DIAGNOSTIC_SOURCE = "<%
//&&&staticSymbol&&&=genPackage.getInterfacePackageName()
//&&&staticSymbol&&&%>";<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
int count = 0; for (GenClass genClass : genPackage.getGenClasses()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
for (GenOperation genOperation : genClass.getInvariantOperations()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint '<%
//&&&staticSymbol&&&=genOperation.getFormattedName()
//&&&staticSymbol&&&%>' of '<%
//&&&staticSymbol&&&=genClass.getFormattedName()
//&&&staticSymbol&&&%>'.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	public static final int <%
//&&&staticSymbol&&&=genClass.getOperationID(genOperation)
//&&&staticSymbol&&&%> = <%
//&&&staticSymbol&&&=++count
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
}}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = <%
//&&&staticSymbol&&&=count
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
for (GenPackage baseGenPackage : genPackage.getAllValidatorBaseGenPackages()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * The cached base package validator.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	protected <%
//&&&staticSymbol&&&=baseGenPackage.getImportedValidatorClassName()
//&&&staticSymbol&&&%> <%
//&&&staticSymbol&&&=genPackage.getValidatorPackageUniqueSafeName(baseGenPackage)
//&&&staticSymbol&&&%>Validator;
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
if (genPackage.hasInvariantExpressions()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * Delegates evaluation of the given invariant expression against the object in the given context.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	public static boolean validate(<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.EClass")
//&&&staticSymbol&&&%> eClass, <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.EObject")
//&&&staticSymbol&&&%> eObject, DiagnosticChain diagnostics, <%
//&&&staticSymbol&&&=_Map
//&&&staticSymbol&&&%> context, <%
//&&&staticSymbol&&&=genModel.getImportedName("java.lang.String")
//&&&staticSymbol&&&%> validationDelegate, <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.EOperation")
//&&&staticSymbol&&&%> invariant, <%
//&&&staticSymbol&&&=genModel.getImportedName("java.lang.String")
//&&&staticSymbol&&&%> expression, int severity, <%
//&&&staticSymbol&&&=genModel.getImportedName("java.lang.String")
//&&&staticSymbol&&&%> source, int code)
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		return <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.util.EObjectValidator")
//&&&staticSymbol&&&%>.validate(eClass, eObject, diagnostics, context, validationDelegate, invariant, expression, severity, source, code);
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * Creates an instance of the switch.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	public <%
//&&&staticSymbol&&&=genPackage.getValidatorClassName()
//&&&staticSymbol&&&%>()
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		super();
//&&&staticSymbol&&&<%
for (GenPackage baseGenPackage : genPackage.getAllValidatorBaseGenPackages()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=genPackage.getValidatorPackageUniqueSafeName(baseGenPackage)
//&&&staticSymbol&&&%>Validator = <%
//&&&staticSymbol&&&=baseGenPackage.getImportedValidatorClassName()
//&&&staticSymbol&&&%>.INSTANCE;
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * Returns the package of this validator switch.
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
//&&&staticSymbol&&&	protected EPackage getEPackage()
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&	  return <%
//&&&staticSymbol&&&=genPackage.getImportedPackageInterfaceName()
//&&&staticSymbol&&&%>.eINSTANCE;
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
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
for (GenClassifier genClassifier : genPackage.getGenClassifiers()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
if (genClassifier.isUncheckedCast()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	@SuppressWarnings("unchecked")
//&&&staticSymbol&&&    <%
break; }
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, <%
//&&&staticSymbol&&&=_Map
//&&&staticSymbol&&&%> context)
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		switch (classifierID)
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&<%
for (GenClassifier genClassifier : genPackage.getGenClassifiers()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			case <%
//&&&staticSymbol&&&=genPackage.getImportedPackageInterfaceName()
//&&&staticSymbol&&&%>.<%
//&&&staticSymbol&&&=genPackage.getClassifierID(genClassifier)
//&&&staticSymbol&&&%>:
//&&&staticSymbol&&&  <%
if (genClassifier instanceof GenDataType) { GenDataType genDataType = (GenDataType)genClassifier;
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
if (genDataType.isPrimitiveType()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
if (genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				return validate<%
//&&&staticSymbol&&&=genDataType.getName()
//&&&staticSymbol&&&%>(((<%
//&&&staticSymbol&&&=genDataType.getObjectInstanceClassName()
//&&&staticSymbol&&&%>)value).<%
//&&&staticSymbol&&&=genDataType.getPrimitiveValueFunction()
//&&&staticSymbol&&&%>(), diagnostics, context);
//&&&staticSymbol&&&      <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				return validate<%
//&&&staticSymbol&&&=genDataType.getName()
//&&&staticSymbol&&&%>((<%
//&&&staticSymbol&&&=genDataType.getObjectInstanceClassName()
//&&&staticSymbol&&&%>)value, diagnostics, context);
//&&&staticSymbol&&&      <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
} else if (genDataType.isObjectType()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				return validate<%
//&&&staticSymbol&&&=genDataType.getName()
//&&&staticSymbol&&&%>(value, diagnostics, context);
//&&&staticSymbol&&&    <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				return validate<%
//&&&staticSymbol&&&=genDataType.getName()
//&&&staticSymbol&&&%>((<%
//&&&staticSymbol&&&=genDataType.getObjectType().getImportedWildcardInstanceClassName()
//&&&staticSymbol&&&%>)value, diagnostics, context);
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
} else { GenClass genClass = (GenClass)genClassifier;
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				return validate<%
//&&&staticSymbol&&&=genClass.getName()
//&&&staticSymbol&&&%>((<%
//&&&staticSymbol&&&=genClass.getImportedWildcardInstanceClassName()
//&&&staticSymbol&&&%>)value, diagnostics, context);
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			default:
//&&&staticSymbol&&&				return true;
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
for (GenClassifier genClassifier : genPackage.getGenClassifiers()) {String result = "result".equals(genClassifier.getSafeUncapName()) ? "theResult" : "result"; String diagnostics = "diagnostics".equals(genClassifier.getSafeUncapName()) ? "theDiagnostics" : "diagnostics"; String item = "item".equals(genClassifier.getSafeUncapName()) ? "theItem" : "item"; String context = "context".equals(genClassifier.getSafeUncapName()) ? "theContext" : "context";
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	public boolean validate<%
//&&&staticSymbol&&&=genClassifier.getName()
//&&&staticSymbol&&&%>(<%
//&&&staticSymbol&&&=genClassifier.getImportedWildcardInstanceClassName()
//&&&staticSymbol&&&%> <%
//&&&staticSymbol&&&=genClassifier.getSafeUncapName()
//&&&staticSymbol&&&%>, DiagnosticChain <%
//&&&staticSymbol&&&=diagnostics
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=_Map
//&&&staticSymbol&&&%> <%
//&&&staticSymbol&&&=context
//&&&staticSymbol&&&%>)
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&<%
if (genClassifier.getAllGenConstraints().isEmpty()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		return true;
//&&&staticSymbol&&&<%
} else if (genClassifier.hasOnlyDefaultConstraints()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		return validate_EveryDefaultConstraint(<%
if (!((GenClass)genClassifier).isEObjectExtension()){
//&&&staticSymbol&&&%>(<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.EObject")
//&&&staticSymbol&&&%>)<%
}
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genClassifier.getSafeUncapName()
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=diagnostics
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=context
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&<%
} else { boolean first = true;
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
for (String constraint : genClassifier.getAllGenConstraints()) {GenClassifier constraintImplementor = genClassifier.getConstraintImplementor(constraint);
  String delegate = constraintImplementor == null || constraintImplementor.getGenPackage() == genPackage ? "" : genPackage.getValidatorPackageUniqueSafeName(constraintImplementor.getGenPackage()) + "Validator.";
  String cast = constraintImplementor == null && genClassifier instanceof GenClass && !((GenClass)genClassifier).isEObjectExtension() ? "(" + genModel.getImportedName("org.eclipse.emf.ecore.EObject") + ")" : "";
  String accessor = constraintImplementor != null && genClassifier instanceof GenDataType && !((GenDataType)genClassifier).isPrimitiveType() && ((GenDataType)constraintImplementor).isPrimitiveType() && genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50 ? "." + ((GenDataType)constraintImplementor).getPrimitiveValueFunction() + "()" : "";
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
if ("NoCircularContainment".equals(constraint)) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		if (!validate_NoCircularContainment(<%
if (!((GenClass)genClassifier).isEObjectExtension()){
//&&&staticSymbol&&&%>(<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.EObject")
//&&&staticSymbol&&&%>)<%
}
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genClassifier.getSafeUncapName()
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=diagnostics
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=context
//&&&staticSymbol&&&%>)) return false;
//&&&staticSymbol&&&<%
} else if (first) { first = false;
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		boolean <%
//&&&staticSymbol&&&=result
//&&&staticSymbol&&&%> = <%
//&&&staticSymbol&&&=delegate
//&&&staticSymbol&&&%>validate<%
//&&&staticSymbol&&&*%%storeSymbol%%*0
//&&&staticSymbol&&&%>_<%
//&&&staticSymbol&&&=constraint
//&&&staticSymbol&&&%>(<%
//&&&staticSymbol&&&=cast
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genClassifier.getSafeUncapName()
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=accessor
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=diagnostics
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=context
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&<%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		if (<%
//&&&staticSymbol&&&=result
//&&&staticSymbol&&&%> || <%
//&&&staticSymbol&&&=diagnostics
//&&&staticSymbol&&&%> != null) <%
//&&&staticSymbol&&&=result
//&&&staticSymbol&&&%> &= <%
//&&&staticSymbol&&&=delegate
//&&&staticSymbol&&&%>validate<%
//&&&staticSymbol&&&*%%storeSymbol%%*1
//&&&staticSymbol&&&%>_<%
//&&&staticSymbol&&&=constraint
//&&&staticSymbol&&&%>(<%
//&&&staticSymbol&&&=cast
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genClassifier.getSafeUncapName()
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=accessor
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=diagnostics
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=context
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		return <%
//&&&staticSymbol&&&=result
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
for (String constraint : genClassifier.getGenConstraints())
{GenClassifier constraintDelegate = genClassifier.getConstraintDelegate(constraint);
  String constant = genClassifier.getClassifierID() + "__" + CodeGenUtil.format(constraint, '_', null, false, false).toUpperCase(genClassifier.getGenModel().getLocale());
  String delegate = constraintDelegate == null || constraintDelegate.getGenPackage() == genPackage ? "" : genPackage.getValidatorPackageUniqueSafeName(constraintDelegate.getGenPackage()) + "Validator.";
  String cast = constraintDelegate == null && genClassifier instanceof GenClass && !((GenClass)genClassifier).isEObjectExtension() ? "(" + genModel.getImportedName("org.eclipse.emf.ecore.EObject") + ")" : "";
  String accessor = constraintDelegate != null && genClassifier instanceof GenDataType && !((GenDataType)genClassifier).isPrimitiveType() && ((GenDataType)constraintDelegate).isPrimitiveType()  && genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50 ? "." + ((GenDataType)constraintDelegate).getPrimitiveValueFunction() + "()" : "";
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
if (genClassifier instanceof GenDataType) { GenDataType genDataType = (GenDataType)genClassifier;
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
if (constraint.equals("Min") && genDataType.getMinLiteral() != null) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 * @see #validate<%
//&&&staticSymbol&&&=genDataType.getName()
//&&&staticSymbol&&&%>_<%
//&&&staticSymbol&&&=constraint
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	public static final <%
//&&&staticSymbol&&&=genDataType.getImportedInstanceClassName()
//&&&staticSymbol&&&%> <%
//&&&staticSymbol&&&=constant
//&&&staticSymbol&&&%>__VALUE = <%
//&&&staticSymbol&&&=genDataType.getStaticValue(genDataType.getMinLiteral())
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
} else if (constraint.equals("Max") && genDataType.getMaxLiteral() != null) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 * @see #validate<%
//&&&staticSymbol&&&=genDataType.getName()
//&&&staticSymbol&&&%>_<%
//&&&staticSymbol&&&=constraint
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	public static final <%
//&&&staticSymbol&&&=genDataType.getImportedInstanceClassName()
//&&&staticSymbol&&&%> <%
//&&&staticSymbol&&&=constant
//&&&staticSymbol&&&%>__VALUE = <%
//&&&staticSymbol&&&=genDataType.getStaticValue(genDataType.getMaxLiteral())
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
} else if (constraint.equals("TotalDigits") && genDataType.getTotalDigits() != -1 && !"java.math.BigDecimal".equals(genDataType.getQualifiedInstanceClassName())) { String value = "1"; for (int digitCount = genDataType.getTotalDigits(); digitCount > 0; --digitCount) value += "0"; 
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 * @see #validate<%
//&&&staticSymbol&&&=genDataType.getName()
//&&&staticSymbol&&&%>_<%
//&&&staticSymbol&&&=constraint
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	public static final <%
//&&&staticSymbol&&&=genDataType.getImportedInstanceClassName()
//&&&staticSymbol&&&%> <%
//&&&staticSymbol&&&=constant
//&&&staticSymbol&&&%>__UPPER_BOUND = <%
//&&&staticSymbol&&&=genDataType.getStaticValue(value)
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 * @see #validate<%
//&&&staticSymbol&&&=genDataType.getName()
//&&&staticSymbol&&&%>_<%
//&&&staticSymbol&&&=constraint
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	public static final <%
//&&&staticSymbol&&&=genDataType.getImportedInstanceClassName()
//&&&staticSymbol&&&%> <%
//&&&staticSymbol&&&=constant
//&&&staticSymbol&&&%>__LOWER_BOUND = <%
//&&&staticSymbol&&&=genDataType.getStaticValue("-" + value)
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
} else if (constraint.equals("Pattern") && !genDataType.getPatterns().isEmpty()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 * @see #validate<%
//&&&staticSymbol&&&=genDataType.getName()
//&&&staticSymbol&&&%>_<%
//&&&staticSymbol&&&=constraint
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	public static final  PatternMatcher [][] <%
//&&&staticSymbol&&&=constant
//&&&staticSymbol&&&%>__VALUES =
//&&&staticSymbol&&&		new PatternMatcher [][]
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&<%
for (Iterator<List<String>> k = genDataType.getPatterns().iterator(); k.hasNext(); ) { List<String> patternList = k.next();
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			new PatternMatcher []
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&<%
for (Iterator<String> p = patternList.iterator(); p.hasNext(); ) { String pattern = p.next();
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.xml.type.util.XMLTypeUtil")
//&&&staticSymbol&&&%>.createPatternMatcher(<%
//&&&staticSymbol&&&=pattern
//&&&staticSymbol&&&%>)<%
//&&&staticSymbol&&&*%%storeSymbol%%*2
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			}<%
//&&&staticSymbol&&&*%%storeSymbol%%*3
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		};
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
} else if (constraint.equals("Enumeration") && !genDataType.getEnumerationLiterals().isEmpty()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 * @see #validate<%
//&&&staticSymbol&&&=genDataType.getName()
//&&&staticSymbol&&&%>_<%
//&&&staticSymbol&&&=constraint
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&  <%
if (genDataType.isUncheckedCast()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	@SuppressWarnings("unchecked")
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	public static final <%
//&&&staticSymbol&&&=genModel.getImportedName("java.util.Collection")
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=objectArgument
//&&&staticSymbol&&&%> <%
//&&&staticSymbol&&&=constant
//&&&staticSymbol&&&%>__VALUES =
//&&&staticSymbol&&&		wrapEnumerationValues
//&&&staticSymbol&&&			(new Object[]
//&&&staticSymbol&&&			 {
//&&&staticSymbol&&&<%
for (Iterator<String> k = genDataType.getEnumerationLiterals().iterator(); k.hasNext(); ) { String literal = k.next();
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				 <%
if (genDataType.isPrimitiveType() && genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
//&&&staticSymbol&&&%>new <%
//&&&staticSymbol&&&=genDataType.getObjectInstanceClassName()
//&&&staticSymbol&&&%>(<%
}
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genDataType.getStaticValue(literal, false)
//&&&staticSymbol&&&%><%
if (genDataType.isPrimitiveType() && genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
//&&&staticSymbol&&&%>)<%
}
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&*%%storeSymbol%%*4
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			 });
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
if (genClassifier.hasConstraintExpression(constraint)) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * The cached validation expression for the <%
//&&&staticSymbol&&&=constraint
//&&&staticSymbol&&&%> constraint of '<em><%
//&&&staticSymbol&&&=genClassifier.getFormattedName()
//&&&staticSymbol&&&%></em>'.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	protected static final <%
//&&&staticSymbol&&&=genModel.getImportedName("java.lang.String")
//&&&staticSymbol&&&%> <%
//&&&staticSymbol&&&=genClassifier.getClassifierID()
//&&&staticSymbol&&&%>__<%
//&&&staticSymbol&&&=CodeGenUtil.upperName(constraint)
//&&&staticSymbol&&&%>__EEXPRESSION = "<%
//&&&staticSymbol&&&=genClassifier.getConstraintExpression(constraint, "\t\t")
//&&&staticSymbol&&&%>";<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * Validates the <%
//&&&staticSymbol&&&=constraint
//&&&staticSymbol&&&%> constraint of '<em><%
//&&&staticSymbol&&&=genClassifier.getFormattedName()
//&&&staticSymbol&&&%></em>'.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	public boolean validate<%
//&&&staticSymbol&&&=genClassifier.getName()
//&&&staticSymbol&&&%>_<%
//&&&staticSymbol&&&=constraint
//&&&staticSymbol&&&%>(<%
//&&&staticSymbol&&&=genClassifier.getImportedWildcardInstanceClassName()
//&&&staticSymbol&&&%> <%
//&&&staticSymbol&&&=genClassifier.getSafeUncapName()
//&&&staticSymbol&&&%>, DiagnosticChain <%
//&&&staticSymbol&&&=diagnostics
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=_Map
//&&&staticSymbol&&&%> <%
//&&&staticSymbol&&&=context
//&&&staticSymbol&&&%>)
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&<%
if (genClassifier instanceof GenDataType) { GenDataType genDataType = (GenDataType)genClassifier;
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
if (constraint.equals("ItemType") && genDataType.getItemType() != null) { GenDataType itemType = genDataType.getItemType(); String itemDelegate = itemType.getGenPackage() == genPackage ? "" : genPackage.getValidatorPackageUniqueSafeName(itemType.getGenPackage()) + "Validator.";
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		boolean <%
//&&&staticSymbol&&&=result
//&&&staticSymbol&&&%> = true;
//&&&staticSymbol&&&		for (<%
//&&&staticSymbol&&&=genModel.getImportedName("java.util.Iterator")
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=singleWildcard
//&&&staticSymbol&&&%> i = <%
//&&&staticSymbol&&&=genClassifier.getSafeUncapName()
//&&&staticSymbol&&&%>.iterator(); i.hasNext() && (result || diagnostics != null); )
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			Object item = i.next();
//&&&staticSymbol&&&  <%
if (itemType.getGenPackage().hasConstraints()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			if (<%
//&&&staticSymbol&&&=itemType.getQualifiedClassifierAccessor()
//&&&staticSymbol&&&%>.isInstance(item))
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&				result &= <%
//&&&staticSymbol&&&=itemDelegate
//&&&staticSymbol&&&%>validate<%
//&&&staticSymbol&&&=itemType.getName()
//&&&staticSymbol&&&%>(<%
if (itemType.isPrimitiveType() && genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
//&&&staticSymbol&&&%>(<%
}
//&&&staticSymbol&&&%><%
if (!itemType.isObjectType()) {
//&&&staticSymbol&&&%>(<%
//&&&staticSymbol&&&=itemType.getObjectInstanceClassName()
//&&&staticSymbol&&&%>)<%
}
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=item
//&&&staticSymbol&&&%><%
if (itemType.isPrimitiveType() && genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
//&&&staticSymbol&&&%>).<%
//&&&staticSymbol&&&=itemType.getPrimitiveValueFunction()
//&&&staticSymbol&&&%>()<%
}
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=diagnostics
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=context
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&			}
//&&&staticSymbol&&&			else
//&&&staticSymbol&&&  <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			if (!<%
//&&&staticSymbol&&&=itemType.getQualifiedClassifierAccessor()
//&&&staticSymbol&&&%>.isInstance(item))
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&				result = false;
//&&&staticSymbol&&&				reportDataValueTypeViolation(<%
//&&&staticSymbol&&&=itemType.getQualifiedClassifierAccessor()
//&&&staticSymbol&&&%>, item, <%
//&&&staticSymbol&&&=diagnostics
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=context
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&			}
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&		return result;
//&&&staticSymbol&&&<%
} else if (constraint.equals("MemberTypes") && !genDataType.getMemberTypes().isEmpty()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		if (diagnostics != null)
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.common.util.BasicDiagnostic")
//&&&staticSymbol&&&%> tempDiagnostics = new BasicDiagnostic();
//&&&staticSymbol&&&<%
for (ListIterator<GenDataType> k = genDataType.getMemberTypes().listIterator(); k.hasNext(); ) { GenDataType memberType = k.next(); String memberDelegate = memberType.getGenPackage() == genPackage ? "" : genPackage.getValidatorPackageUniqueSafeName(memberType.getGenPackage()) + "Validator.";
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
if (genDataType.isPrimitiveType()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			if (<%
//&&&staticSymbol&&&=memberDelegate
//&&&staticSymbol&&&%>validate<%
//&&&staticSymbol&&&=memberType.getName()
//&&&staticSymbol&&&%>(<%
//&&&staticSymbol&&&=genClassifier.getSafeUncapName()
//&&&staticSymbol&&&%>, tempDiagnostics, <%
//&&&staticSymbol&&&=context
//&&&staticSymbol&&&%>)) return true;
//&&&staticSymbol&&&  <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			if (<%
//&&&staticSymbol&&&=memberType.getQualifiedClassifierAccessor()
//&&&staticSymbol&&&%>.isInstance(<%
//&&&staticSymbol&&&=genClassifier.getSafeUncapName()
//&&&staticSymbol&&&%>))
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&				<%
if (memberType.getGenPackage().hasConstraints()) {
//&&&staticSymbol&&&%>if (<%
//&&&staticSymbol&&&=memberDelegate
//&&&staticSymbol&&&%>validate<%
//&&&staticSymbol&&&=memberType.getName()
//&&&staticSymbol&&&%>(<%
if (memberType.isPrimitiveType() && genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
//&&&staticSymbol&&&%>(<%
}
//&&&staticSymbol&&&%><%
if (!memberType.isObjectType() && !memberType.getQualifiedInstanceClassName().equals(genDataType.getQualifiedInstanceClassName())) {
//&&&staticSymbol&&&%>(<%
//&&&staticSymbol&&&=memberType.getImportedWildcardObjectInstanceClassName()
//&&&staticSymbol&&&%>)<%
}
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genClassifier.getSafeUncapName()
//&&&staticSymbol&&&%><%
if (memberType.isPrimitiveType() && genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
//&&&staticSymbol&&&%>).<%
//&&&staticSymbol&&&=memberType.getPrimitiveValueFunction()
//&&&staticSymbol&&&%>()<%
}
//&&&staticSymbol&&&%>, tempDiagnostics, <%
//&&&staticSymbol&&&=context
//&&&staticSymbol&&&%>)) <%
}
//&&&staticSymbol&&&%>return true;
//&&&staticSymbol&&&			}
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
if (genModel.useGenerics()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			for (<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.common.util.Diagnostic")
//&&&staticSymbol&&&%> diagnostic : tempDiagnostics.getChildren())
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&				diagnostics.add(diagnostic);
//&&&staticSymbol&&&			}
//&&&staticSymbol&&&<%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			<%
//&&&staticSymbol&&&=genModel.getImportedName("java.util.List")
//&&&staticSymbol&&&%> children = tempDiagnostics.getChildren();
//&&&staticSymbol&&&			for (int i = 0; i < children.size(); i++)
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&				diagnostics.add((<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.common.util.Diagnostic")
//&&&staticSymbol&&&%>)children.get(i));
//&&&staticSymbol&&&			}
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&		else
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&<%
for (ListIterator<GenDataType> k = genDataType.getMemberTypes().listIterator(); k.hasNext(); ) { GenDataType memberType = k.next(); String memberDelegate = memberType.getGenPackage() == genPackage ? "" : genPackage.getValidatorPackageUniqueSafeName(memberType.getGenPackage()) + "Validator.";
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
if (genDataType.isPrimitiveType()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			if (<%
//&&&staticSymbol&&&=memberDelegate
//&&&staticSymbol&&&%>validate<%
//&&&staticSymbol&&&=memberType.getName()
//&&&staticSymbol&&&%>(<%
//&&&staticSymbol&&&=genClassifier.getSafeUncapName()
//&&&staticSymbol&&&%>, null, <%
//&&&staticSymbol&&&=context
//&&&staticSymbol&&&%>)) return true;
//&&&staticSymbol&&&  <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			if (<%
//&&&staticSymbol&&&=memberType.getQualifiedClassifierAccessor()
//&&&staticSymbol&&&%>.isInstance(<%
//&&&staticSymbol&&&=genClassifier.getSafeUncapName()
//&&&staticSymbol&&&%>))
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&				<%
if (memberType.getGenPackage().hasConstraints()) {
//&&&staticSymbol&&&%>if (<%
//&&&staticSymbol&&&=memberDelegate
//&&&staticSymbol&&&%>validate<%
//&&&staticSymbol&&&=memberType.getName()
//&&&staticSymbol&&&%>(<%
if (memberType.isPrimitiveType() && genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
//&&&staticSymbol&&&%>(<%
}
//&&&staticSymbol&&&%><%
if (!memberType.isObjectType() && !memberType.getQualifiedInstanceClassName().equals(genDataType.getQualifiedInstanceClassName())) {
//&&&staticSymbol&&&%>(<%
//&&&staticSymbol&&&=memberType.getImportedWildcardObjectInstanceClassName()
//&&&staticSymbol&&&%>)<%
}
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genClassifier.getSafeUncapName()
//&&&staticSymbol&&&%><%
if (memberType.isPrimitiveType() && genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
//&&&staticSymbol&&&%>).<%
//&&&staticSymbol&&&=memberType.getPrimitiveValueFunction()
//&&&staticSymbol&&&%>()<%
}
//&&&staticSymbol&&&%>, null, <%
//&&&staticSymbol&&&=context
//&&&staticSymbol&&&%>)) <%
}
//&&&staticSymbol&&&%>return true;
//&&&staticSymbol&&&			}
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&		return false;
//&&&staticSymbol&&&<%
} else if (constraint.equals("Pattern") && !genDataType.getPatterns().isEmpty()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		return validatePattern(<%
//&&&staticSymbol&&&=genDataType.getQualifiedClassifierAccessor()
//&&&staticSymbol&&&%>, <%
if (genDataType.isPrimitiveType() && genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
//&&&staticSymbol&&&%>new <%
//&&&staticSymbol&&&=genDataType.getObjectInstanceClassName()
//&&&staticSymbol&&&%>(<%
}
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genDataType.getSafeUncapName()
//&&&staticSymbol&&&%><%
if (genDataType.isPrimitiveType() && genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
//&&&staticSymbol&&&%>)<%
}
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=constant
//&&&staticSymbol&&&%>__VALUES, <%
//&&&staticSymbol&&&=diagnostics
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=context
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&<%
} else if (constraint.equals("Enumeration") && !genDataType.getEnumerationLiterals().isEmpty()) { String variable = genDataType.getSafeUncapName();
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
if (genDataType.isPrimitiveType() && genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) { variable = variable + "Object";
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=genDataType.getObjectInstanceClassName()
//&&&staticSymbol&&&%> <%
//&&&staticSymbol&&&=variable
//&&&staticSymbol&&&%> = new <%
//&&&staticSymbol&&&=genDataType.getObjectInstanceClassName()
//&&&staticSymbol&&&%>(<%
//&&&staticSymbol&&&=genDataType.getSafeUncapName()
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		boolean <%
//&&&staticSymbol&&&=result
//&&&staticSymbol&&&%> = <%
//&&&staticSymbol&&&=constant
//&&&staticSymbol&&&%>__VALUES.contains(<%
//&&&staticSymbol&&&=variable
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&		if (!<%
//&&&staticSymbol&&&=result
//&&&staticSymbol&&&%> && <%
//&&&staticSymbol&&&=diagnostics
//&&&staticSymbol&&&%> != null)
//&&&staticSymbol&&&			reportEnumerationViolation(<%
//&&&staticSymbol&&&=genDataType.getQualifiedClassifierAccessor()
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=variable
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=constant
//&&&staticSymbol&&&%>__VALUES, <%
//&&&staticSymbol&&&=diagnostics
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=context
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&		return <%
//&&&staticSymbol&&&=result
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&<%
} else if (constraint.equals("Min") && genDataType.getMinLiteral() != null) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
if (genDataType.isPrimitiveType()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		boolean <%
//&&&staticSymbol&&&=result
//&&&staticSymbol&&&%> = <%
//&&&staticSymbol&&&=genDataType.getSafeUncapName()
//&&&staticSymbol&&&%> <%
//&&&staticSymbol&&&*%%storeSymbol%%*5
//&&&staticSymbol&&&%> <%
//&&&staticSymbol&&&=constant
//&&&staticSymbol&&&%>__VALUE;
//&&&staticSymbol&&&		if (!<%
//&&&staticSymbol&&&=result
//&&&staticSymbol&&&%> && <%
//&&&staticSymbol&&&=diagnostics
//&&&staticSymbol&&&%> != null)
//&&&staticSymbol&&&<%
if (genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			reportMinViolation(<%
//&&&staticSymbol&&&=genDataType.getQualifiedClassifierAccessor()
//&&&staticSymbol&&&%>, new <%
//&&&staticSymbol&&&=genDataType.getObjectInstanceClassName()
//&&&staticSymbol&&&%>(<%
//&&&staticSymbol&&&=genDataType.getSafeUncapName()
//&&&staticSymbol&&&%>), new <%
//&&&staticSymbol&&&=genDataType.getObjectInstanceClassName()
//&&&staticSymbol&&&%>(<%
//&&&staticSymbol&&&=constant
//&&&staticSymbol&&&%>__VALUE), <%
//&&&staticSymbol&&&*%%storeSymbol%%*6
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=diagnostics
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=context
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&<%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			reportMinViolation(<%
//&&&staticSymbol&&&=genDataType.getQualifiedClassifierAccessor()
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=genDataType.getSafeUncapName()
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=constant
//&&&staticSymbol&&&%>__VALUE, <%
//&&&staticSymbol&&&*%%storeSymbol%%*7
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=diagnostics
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=context
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		return <%
//&&&staticSymbol&&&=result
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&<%
} else { String comparison = "comparison".equals(genClassifier.getSafeUncapName()) ? "theComparison" : "comparison";
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
if (genDataType.isXMLCalendar()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		int <%
//&&&staticSymbol&&&=comparison
//&&&staticSymbol&&&%> = <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.xml.type.util.XMLTypeUtil")
//&&&staticSymbol&&&%>.compareCalendar(<%
//&&&staticSymbol&&&=genDataType.getSafeUncapName()
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=constant
//&&&staticSymbol&&&%>__VALUE);
//&&&staticSymbol&&&		boolean <%
//&&&staticSymbol&&&=result
//&&&staticSymbol&&&%> = <%
if (genDataType.isMinInclusive()) {
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=comparison
//&&&staticSymbol&&&%> == 0 || <%
}
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=comparison
//&&&staticSymbol&&&%> == 1;
//&&&staticSymbol&&&<%
} else if (genDataType.isXMLDuration()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		int <%
//&&&staticSymbol&&&=comparison
//&&&staticSymbol&&&%> = <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.xml.type.util.XMLTypeUtil")
//&&&staticSymbol&&&%>.compareDuration(<%
//&&&staticSymbol&&&=genDataType.getSafeUncapName()
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=constant
//&&&staticSymbol&&&%>__VALUE);
//&&&staticSymbol&&&		boolean <%
//&&&staticSymbol&&&=result
//&&&staticSymbol&&&%> = <%
if (genDataType.isMinInclusive()) {
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=comparison
//&&&staticSymbol&&&%> == 0 || <%
}
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=comparison
//&&&staticSymbol&&&%> == 1;
//&&&staticSymbol&&&<%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		boolean <%
//&&&staticSymbol&&&=result
//&&&staticSymbol&&&%> = <%
//&&&staticSymbol&&&=genDataType.getSafeUncapName()
//&&&staticSymbol&&&%>.compareTo(<%
//&&&staticSymbol&&&=constant
//&&&staticSymbol&&&%>__VALUE) <%
//&&&staticSymbol&&&*%%storeSymbol%%*8
//&&&staticSymbol&&&%> 0;
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		if (!<%
//&&&staticSymbol&&&=result
//&&&staticSymbol&&&%> && <%
//&&&staticSymbol&&&=diagnostics
//&&&staticSymbol&&&%> != null)
//&&&staticSymbol&&&			reportMinViolation(<%
//&&&staticSymbol&&&=genDataType.getQualifiedClassifierAccessor()
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=genDataType.getSafeUncapName()
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=constant
//&&&staticSymbol&&&%>__VALUE, <%
//&&&staticSymbol&&&*%%storeSymbol%%*9
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=diagnostics
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=context
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&		return <%
//&&&staticSymbol&&&=result
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
} else if (constraint.equals("Max") && genDataType.getMaxLiteral() != null) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
if (genDataType.isPrimitiveType()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		boolean <%
//&&&staticSymbol&&&=result
//&&&staticSymbol&&&%> = <%
//&&&staticSymbol&&&=genDataType.getSafeUncapName()
//&&&staticSymbol&&&%> <%
//&&&staticSymbol&&&*%%storeSymbol%%*10
//&&&staticSymbol&&&%> <%
//&&&staticSymbol&&&=constant
//&&&staticSymbol&&&%>__VALUE;
//&&&staticSymbol&&&		if (!<%
//&&&staticSymbol&&&=result
//&&&staticSymbol&&&%> && <%
//&&&staticSymbol&&&=diagnostics
//&&&staticSymbol&&&%> != null)
//&&&staticSymbol&&&<%
if (genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			reportMaxViolation(<%
//&&&staticSymbol&&&=genDataType.getQualifiedClassifierAccessor()
//&&&staticSymbol&&&%>, new <%
//&&&staticSymbol&&&=genDataType.getObjectInstanceClassName()
//&&&staticSymbol&&&%>(<%
//&&&staticSymbol&&&=genDataType.getSafeUncapName()
//&&&staticSymbol&&&%>), new <%
//&&&staticSymbol&&&=genDataType.getObjectInstanceClassName()
//&&&staticSymbol&&&%>(<%
//&&&staticSymbol&&&=constant
//&&&staticSymbol&&&%>__VALUE), <%
//&&&staticSymbol&&&*%%storeSymbol%%*11
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=diagnostics
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=context
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&<%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			reportMaxViolation(<%
//&&&staticSymbol&&&=genDataType.getQualifiedClassifierAccessor()
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=genDataType.getSafeUncapName()
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=constant
//&&&staticSymbol&&&%>__VALUE, <%
//&&&staticSymbol&&&*%%storeSymbol%%*12
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=diagnostics
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=context
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		return <%
//&&&staticSymbol&&&=result
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&<%
} else { String comparison = "comparison".equals(genClassifier.getSafeUncapName()) ? "theComparison" : "comparison";
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
if (genDataType.isXMLCalendar()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		int <%
//&&&staticSymbol&&&=comparison
//&&&staticSymbol&&&%> = <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.xml.type.util.XMLTypeUtil")
//&&&staticSymbol&&&%>.compareCalendar(<%
//&&&staticSymbol&&&=genDataType.getSafeUncapName()
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=constant
//&&&staticSymbol&&&%>__VALUE);
//&&&staticSymbol&&&		boolean <%
//&&&staticSymbol&&&=result
//&&&staticSymbol&&&%> = <%
if (genDataType.isMaxInclusive()) {
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=comparison
//&&&staticSymbol&&&%> == 0 || <%
}
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=comparison
//&&&staticSymbol&&&%> == -1;
//&&&staticSymbol&&&<%
} else if (genDataType.isXMLDuration()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		int <%
//&&&staticSymbol&&&=comparison
//&&&staticSymbol&&&%> = <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.xml.type.util.XMLTypeUtil")
//&&&staticSymbol&&&%>.compareDuration(<%
//&&&staticSymbol&&&=genDataType.getSafeUncapName()
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=constant
//&&&staticSymbol&&&%>__VALUE);
//&&&staticSymbol&&&		boolean <%
//&&&staticSymbol&&&=result
//&&&staticSymbol&&&%> = <%
if (genDataType.isMaxInclusive()) {
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=comparison
//&&&staticSymbol&&&%> == 0 || <%
}
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=comparison
//&&&staticSymbol&&&%> == -1;
//&&&staticSymbol&&&<%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		boolean <%
//&&&staticSymbol&&&=result
//&&&staticSymbol&&&%> = <%
//&&&staticSymbol&&&=genDataType.getSafeUncapName()
//&&&staticSymbol&&&%>.compareTo(<%
//&&&staticSymbol&&&=constant
//&&&staticSymbol&&&%>__VALUE) <%
//&&&staticSymbol&&&*%%storeSymbol%%*13
//&&&staticSymbol&&&%> 0;
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		if (!<%
//&&&staticSymbol&&&=result
//&&&staticSymbol&&&%> && <%
//&&&staticSymbol&&&=diagnostics
//&&&staticSymbol&&&%> != null)
//&&&staticSymbol&&&			reportMaxViolation(<%
//&&&staticSymbol&&&=genDataType.getQualifiedClassifierAccessor()
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=genDataType.getSafeUncapName()
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=constant
//&&&staticSymbol&&&%>__VALUE, <%
//&&&staticSymbol&&&*%%storeSymbol%%*14
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=diagnostics
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=context
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&		return <%
//&&&staticSymbol&&&=result
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
} else if (constraint.equals("MinLength") && genDataType.getMinLength() != -1) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		int length = <%
//&&&staticSymbol&&&=genDataType.getSafeUncapName()
//&&&staticSymbol&&&%>.<%
//&&&staticSymbol&&&=genDataType.getLengthAccessorFunction()
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&		boolean <%
//&&&staticSymbol&&&=result
//&&&staticSymbol&&&%> = length >= <%
//&&&staticSymbol&&&=genDataType.getMinLength()
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&		if (!<%
//&&&staticSymbol&&&=result
//&&&staticSymbol&&&%> && <%
//&&&staticSymbol&&&=diagnostics
//&&&staticSymbol&&&%> != null)
//&&&staticSymbol&&&			reportMinLengthViolation(<%
//&&&staticSymbol&&&=genDataType.getQualifiedClassifierAccessor()
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=genDataType.getSafeUncapName()
//&&&staticSymbol&&&%>, length, <%
//&&&staticSymbol&&&=genDataType.getMinLength()
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=diagnostics
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=context
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&		return <%
//&&&staticSymbol&&&=result
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&<%
} else if (constraint.equals("MaxLength") && genDataType.getMaxLength() != -1) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		int length = <%
//&&&staticSymbol&&&=genDataType.getSafeUncapName()
//&&&staticSymbol&&&%>.<%
//&&&staticSymbol&&&=genDataType.getLengthAccessorFunction()
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&		boolean <%
//&&&staticSymbol&&&=result
//&&&staticSymbol&&&%> = length <= <%
//&&&staticSymbol&&&=genDataType.getMaxLength()
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&		if (!<%
//&&&staticSymbol&&&=result
//&&&staticSymbol&&&%> && <%
//&&&staticSymbol&&&=diagnostics
//&&&staticSymbol&&&%> != null)
//&&&staticSymbol&&&			reportMaxLengthViolation(<%
//&&&staticSymbol&&&=genDataType.getQualifiedClassifierAccessor()
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=genDataType.getSafeUncapName()
//&&&staticSymbol&&&%>, length, <%
//&&&staticSymbol&&&=genDataType.getMaxLength()
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=diagnostics
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=context
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&		return <%
//&&&staticSymbol&&&=result
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&<%
} else if (constraint.equals("TotalDigits") && genDataType.getTotalDigits() != -1) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
if (genDataType.isPrimitiveType()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		boolean <%
//&&&staticSymbol&&&=result
//&&&staticSymbol&&&%> = <%
//&&&staticSymbol&&&=genDataType.getSafeUncapName()
//&&&staticSymbol&&&%> > <%
//&&&staticSymbol&&&=constant
//&&&staticSymbol&&&%>__LOWER_BOUND && <%
//&&&staticSymbol&&&=genDataType.getSafeUncapName()
//&&&staticSymbol&&&%> < <%
//&&&staticSymbol&&&=constant
//&&&staticSymbol&&&%>__UPPER_BOUND;
//&&&staticSymbol&&&		if (!<%
//&&&staticSymbol&&&=result
//&&&staticSymbol&&&%> && <%
//&&&staticSymbol&&&=diagnostics
//&&&staticSymbol&&&%> != null)
//&&&staticSymbol&&&<%
if (genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			reportTotalDigitsViolation(<%
//&&&staticSymbol&&&=genDataType.getQualifiedClassifierAccessor()
//&&&staticSymbol&&&%>, new <%
//&&&staticSymbol&&&=genDataType.getObjectInstanceClassName()
//&&&staticSymbol&&&%>(<%
//&&&staticSymbol&&&=genDataType.getSafeUncapName()
//&&&staticSymbol&&&%>), <%
//&&&staticSymbol&&&=genDataType.getTotalDigits()
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=diagnostics
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=context
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&<%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			reportTotalDigitsViolation(<%
//&&&staticSymbol&&&=genDataType.getQualifiedClassifierAccessor()
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=genDataType.getSafeUncapName()
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=genDataType.getTotalDigits()
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=diagnostics
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=context
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
} else if ("java.math.BigDecimal".equals(genDataType.getQualifiedInstanceClassName())) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		boolean <%
//&&&staticSymbol&&&=result
//&&&staticSymbol&&&%> = <%
//&&&staticSymbol&&&=genDataType.getSafeUncapName()
//&&&staticSymbol&&&%>.unscaledValue().abs().toString().length() <= <%
//&&&staticSymbol&&&=genDataType.getTotalDigits()
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&		if (!<%
//&&&staticSymbol&&&=result
//&&&staticSymbol&&&%> && <%
//&&&staticSymbol&&&=diagnostics
//&&&staticSymbol&&&%> != null)
//&&&staticSymbol&&&			reportTotalDigitsViolation(<%
//&&&staticSymbol&&&=genDataType.getQualifiedClassifierAccessor()
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=genDataType.getSafeUncapName()
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=genDataType.getTotalDigits()
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=diagnostics
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=context
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&<%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		boolean <%
//&&&staticSymbol&&&=result
//&&&staticSymbol&&&%> = <%
//&&&staticSymbol&&&=genDataType.getSafeUncapName()
//&&&staticSymbol&&&%>.compareTo(<%
//&&&staticSymbol&&&=constant
//&&&staticSymbol&&&%>__LOWER_BOUND) > 0 && <%
//&&&staticSymbol&&&=genDataType.getSafeUncapName()
//&&&staticSymbol&&&%>.compareTo(<%
//&&&staticSymbol&&&=constant
//&&&staticSymbol&&&%>__UPPER_BOUND) < 0;
//&&&staticSymbol&&&		if (!<%
//&&&staticSymbol&&&=result
//&&&staticSymbol&&&%> && <%
//&&&staticSymbol&&&=diagnostics
//&&&staticSymbol&&&%> != null)
//&&&staticSymbol&&&			reportTotalDigitsViolation(<%
//&&&staticSymbol&&&=genDataType.getQualifiedClassifierAccessor()
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=genDataType.getSafeUncapName()
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=genDataType.getTotalDigits()
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=diagnostics
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=context
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		return <%
//&&&staticSymbol&&&=result
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&<%
} else if (constraint.equals("FractionDigits") && genDataType.getFractionDigits() != -1 && "java.math.BigDecimal".equals(genDataType.getQualifiedInstanceClassName())) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		boolean <%
//&&&staticSymbol&&&=result
//&&&staticSymbol&&&%> = <%
//&&&staticSymbol&&&=genDataType.getSafeUncapName()
//&&&staticSymbol&&&%>.scale() <= <%
//&&&staticSymbol&&&=genDataType.getFractionDigits()
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&		if (!<%
//&&&staticSymbol&&&=result
//&&&staticSymbol&&&%> && <%
//&&&staticSymbol&&&=diagnostics
//&&&staticSymbol&&&%> != null)
//&&&staticSymbol&&&			reportFractionDigitsViolation(<%
//&&&staticSymbol&&&=genDataType.getQualifiedClassifierAccessor()
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=genDataType.getSafeUncapName()
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=genDataType.getFractionDigits()
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=diagnostics
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=context
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&		return <%
//&&&staticSymbol&&&=result
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&<%
} else if (constraintDelegate != null) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		// TODO override the constraint, if desired
//&&&staticSymbol&&&		// -> uncomment the scaffolding
//&&&staticSymbol&&&		// -> specify the condition that violates the constraint
//&&&staticSymbol&&&		// -> verify the diagnostic details, including severity, code, and message
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
//&&&staticSymbol&&&<%
if (genModel.getRuntimeVersion().getValue() >= GenRuntimeVersion.EMF24_VALUE) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&					(createDiagnostic
//&&&staticSymbol&&&						(<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.common.util.Diagnostic")
//&&&staticSymbol&&&%>.ERROR,
//&&&staticSymbol&&&						 DIAGNOSTIC_SOURCE,
//&&&staticSymbol&&&						 0,
//&&&staticSymbol&&&						 "_UI_GenericConstraint_diagnostic",<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&						 new Object[] { "<%
//&&&staticSymbol&&&=constraint
//&&&staticSymbol&&&%>", getValueLabel(<%
//&&&staticSymbol&&&=genDataType.getQualifiedClassifierAccessor()
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=genClassifier.getSafeUncapName()
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=context
//&&&staticSymbol&&&%>) },<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&						 new Object[] { <%
//&&&staticSymbol&&&=genClassifier.getSafeUncapName()
//&&&staticSymbol&&&%> },
//&&&staticSymbol&&&						 context));
//&&&staticSymbol&&&<%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&					(new <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.common.util.BasicDiagnostic")
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&						(<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.common.util.Diagnostic")
//&&&staticSymbol&&&%>.ERROR,
//&&&staticSymbol&&&						 DIAGNOSTIC_SOURCE,
//&&&staticSymbol&&&						 0,
//&&&staticSymbol&&&						 <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.plugin.EcorePlugin")
//&&&staticSymbol&&&%>.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "<%
//&&&staticSymbol&&&=constraint
//&&&staticSymbol&&&%>", getValueLabel(<%
//&&&staticSymbol&&&=genDataType.getQualifiedClassifierAccessor()
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=genClassifier.getSafeUncapName()
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=context
//&&&staticSymbol&&&%>) }),<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genModel.getNonNLS(2)
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&						 new Object[] { <%
//&&&staticSymbol&&&=genClassifier.getSafeUncapName()
//&&&staticSymbol&&&%> }));
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			}
//&&&staticSymbol&&&			return false;
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&		return <%
//&&&staticSymbol&&&=delegate
//&&&staticSymbol&&&%>validate<%
//&&&staticSymbol&&&=constraintDelegate.getName()
//&&&staticSymbol&&&%>_<%
//&&&staticSymbol&&&=constraint
//&&&staticSymbol&&&%>(<%
//&&&staticSymbol&&&=genClassifier.getSafeUncapName()
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=accessor
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=diagnostics
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=context
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&<%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
if (genClassifier.hasConstraintExpression(constraint)) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		return
//&&&staticSymbol&&&			validate
//&&&staticSymbol&&&				(<%
//&&&staticSymbol&&&=genClassifier.getQualifiedClassifierAccessor()
//&&&staticSymbol&&&%>,
//&&&staticSymbol&&&				 <%
//&&&staticSymbol&&&=genClassifier.getSafeUncapName()
//&&&staticSymbol&&&%>,
//&&&staticSymbol&&&				 <%
//&&&staticSymbol&&&=diagnostics
//&&&staticSymbol&&&%>,
//&&&staticSymbol&&&				 <%
//&&&staticSymbol&&&=context
//&&&staticSymbol&&&%>,
//&&&staticSymbol&&&				 "<%
//&&&staticSymbol&&&=genClassifier.getValidationDelegate(constraint)
//&&&staticSymbol&&&%>",<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				 "<%
//&&&staticSymbol&&&=constraint
//&&&staticSymbol&&&%>",<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				 <%
//&&&staticSymbol&&&=genClassifier.getClassifierID()
//&&&staticSymbol&&&%>__<%
//&&&staticSymbol&&&=CodeGenUtil.upperName(constraint)
//&&&staticSymbol&&&%>__EEXPRESSION,
//&&&staticSymbol&&&				 <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.common.util.Diagnostic")
//&&&staticSymbol&&&%>.ERROR,
//&&&staticSymbol&&&				 DIAGNOSTIC_SOURCE,
//&&&staticSymbol&&&				 0);
//&&&staticSymbol&&&  <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		// TODO implement the constraint
//&&&staticSymbol&&&		// -> specify the condition that violates the constraint
//&&&staticSymbol&&&		// -> verify the diagnostic details, including severity, code, and message
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
//&&&staticSymbol&&&    <%
if (genModel.getRuntimeVersion().getValue() >= GenRuntimeVersion.EMF24_VALUE) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&					(createDiagnostic
//&&&staticSymbol&&&						(<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.common.util.Diagnostic")
//&&&staticSymbol&&&%>.ERROR,
//&&&staticSymbol&&&						 DIAGNOSTIC_SOURCE,
//&&&staticSymbol&&&						 0,
//&&&staticSymbol&&&						 "_UI_GenericConstraint_diagnostic",<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&						 new Object[] { "<%
//&&&staticSymbol&&&=constraint
//&&&staticSymbol&&&%>", getValueLabel(<%
//&&&staticSymbol&&&=genDataType.getQualifiedClassifierAccessor()
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=genClassifier.getSafeUncapName()
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=context
//&&&staticSymbol&&&%>) },<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&						 new Object[] { <%
//&&&staticSymbol&&&=genClassifier.getSafeUncapName()
//&&&staticSymbol&&&%> },
//&&&staticSymbol&&&						 context));
//&&&staticSymbol&&&    <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&					(new <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.common.util.BasicDiagnostic")
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&						(<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.common.util.Diagnostic")
//&&&staticSymbol&&&%>.ERROR,
//&&&staticSymbol&&&						 DIAGNOSTIC_SOURCE,
//&&&staticSymbol&&&						 0,
//&&&staticSymbol&&&						 <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.plugin.EcorePlugin")
//&&&staticSymbol&&&%>.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "<%
//&&&staticSymbol&&&=constraint
//&&&staticSymbol&&&%>", getValueLabel(<%
//&&&staticSymbol&&&=genDataType.getQualifiedClassifierAccessor()
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=genClassifier.getSafeUncapName()
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=context
//&&&staticSymbol&&&%>) }),<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genModel.getNonNLS(2)
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&						 new Object[] { <%
//&&&staticSymbol&&&=genClassifier.getSafeUncapName()
//&&&staticSymbol&&&%> }));
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			}
//&&&staticSymbol&&&			return false;
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&		return true;
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
} else { GenOperation genOperation = ((GenClass)genClassifier).getInvariantOperation(constraint); if (genOperation != null) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		return <%
//&&&staticSymbol&&&=genClassifier.getSafeUncapName()
//&&&staticSymbol&&&%>.<%
//&&&staticSymbol&&&=constraint
//&&&staticSymbol&&&%>(<%
//&&&staticSymbol&&&=diagnostics
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=context
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&<%
} else if (constraintDelegate != null) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		// TODO override the constraint, if desired
//&&&staticSymbol&&&		// -> uncomment the scaffolding
//&&&staticSymbol&&&		// -> specify the condition that violates the constraint
//&&&staticSymbol&&&		// -> verify the diagnostic details, including severity, code, and message
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
//&&&staticSymbol&&&  <%
if (genModel.getRuntimeVersion().getValue() >= GenRuntimeVersion.EMF24_VALUE) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&					(createDiagnostic
//&&&staticSymbol&&&						(<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.common.util.Diagnostic")
//&&&staticSymbol&&&%>.ERROR,
//&&&staticSymbol&&&						 DIAGNOSTIC_SOURCE,
//&&&staticSymbol&&&						 0,
//&&&staticSymbol&&&						 "_UI_GenericConstraint_diagnostic",<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&						 new Object[] { "<%
//&&&staticSymbol&&&=constraint
//&&&staticSymbol&&&%>", getObjectLabel(<%
//&&&staticSymbol&&&=genClassifier.getSafeUncapName()
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=context
//&&&staticSymbol&&&%>) },<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&						 new Object[] { <%
//&&&staticSymbol&&&=genClassifier.getSafeUncapName()
//&&&staticSymbol&&&%> },
//&&&staticSymbol&&&						 context));
//&&&staticSymbol&&&  <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&					(new <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.common.util.BasicDiagnostic")
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&						(<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.common.util.Diagnostic")
//&&&staticSymbol&&&%>.ERROR,
//&&&staticSymbol&&&						 DIAGNOSTIC_SOURCE,
//&&&staticSymbol&&&						 0,
//&&&staticSymbol&&&						 <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.plugin.EcorePlugin")
//&&&staticSymbol&&&%>.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "<%
//&&&staticSymbol&&&=constraint
//&&&staticSymbol&&&%>", getObjectLabel(<%
//&&&staticSymbol&&&=genClassifier.getSafeUncapName()
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=context
//&&&staticSymbol&&&%>) }),<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genModel.getNonNLS(2)
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&						 new Object[] { <%
//&&&staticSymbol&&&=genClassifier.getSafeUncapName()
//&&&staticSymbol&&&%> }));
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			}
//&&&staticSymbol&&&			return false;
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&		return <%
//&&&staticSymbol&&&=delegate
//&&&staticSymbol&&&%>validate<%
//&&&staticSymbol&&&=constraintDelegate.getName()
//&&&staticSymbol&&&%>_<%
//&&&staticSymbol&&&=constraint
//&&&staticSymbol&&&%>(<%
//&&&staticSymbol&&&=cast
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genClassifier.getSafeUncapName()
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=diagnostics
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=context
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&<%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
if (genClassifier.hasConstraintExpression(constraint)) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		return
//&&&staticSymbol&&&			validate
//&&&staticSymbol&&&				(<%
//&&&staticSymbol&&&=genClassifier.getQualifiedClassifierAccessor()
//&&&staticSymbol&&&%>,
//&&&staticSymbol&&&				 <%
//&&&staticSymbol&&&=genClassifier.getSafeUncapName()
//&&&staticSymbol&&&%>,
//&&&staticSymbol&&&				 <%
//&&&staticSymbol&&&=diagnostics
//&&&staticSymbol&&&%>,
//&&&staticSymbol&&&				 <%
//&&&staticSymbol&&&=context
//&&&staticSymbol&&&%>,
//&&&staticSymbol&&&				 "<%
//&&&staticSymbol&&&=genClassifier.getValidationDelegate(constraint)
//&&&staticSymbol&&&%>",<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				 "<%
//&&&staticSymbol&&&=constraint
//&&&staticSymbol&&&%>",<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				 <%
//&&&staticSymbol&&&=genClassifier.getClassifierID()
//&&&staticSymbol&&&%>__<%
//&&&staticSymbol&&&=CodeGenUtil.upperName(constraint)
//&&&staticSymbol&&&%>__EEXPRESSION,
//&&&staticSymbol&&&				 <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.common.util.Diagnostic")
//&&&staticSymbol&&&%>.ERROR,
//&&&staticSymbol&&&				 DIAGNOSTIC_SOURCE,
//&&&staticSymbol&&&				 0);
//&&&staticSymbol&&&  <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		// TODO implement the constraint
//&&&staticSymbol&&&		// -> specify the condition that violates the constraint
//&&&staticSymbol&&&		// -> verify the diagnostic details, including severity, code, and message
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
//&&&staticSymbol&&&    <%
if (genModel.getRuntimeVersion().getValue() >= GenRuntimeVersion.EMF24_VALUE) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&					(createDiagnostic
//&&&staticSymbol&&&						(<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.common.util.Diagnostic")
//&&&staticSymbol&&&%>.ERROR,
//&&&staticSymbol&&&						 DIAGNOSTIC_SOURCE,
//&&&staticSymbol&&&						 0,
//&&&staticSymbol&&&						 "_UI_GenericConstraint_diagnostic",<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&						 new Object[] { "<%
//&&&staticSymbol&&&=constraint
//&&&staticSymbol&&&%>", getObjectLabel(<%
//&&&staticSymbol&&&=genClassifier.getSafeUncapName()
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=context
//&&&staticSymbol&&&%>) },<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&						 new Object[] { <%
//&&&staticSymbol&&&=genClassifier.getSafeUncapName()
//&&&staticSymbol&&&%> },
//&&&staticSymbol&&&						 context));
//&&&staticSymbol&&&    <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&					(new <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.common.util.BasicDiagnostic")
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&						(<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.common.util.Diagnostic")
//&&&staticSymbol&&&%>.ERROR,
//&&&staticSymbol&&&						 DIAGNOSTIC_SOURCE,
//&&&staticSymbol&&&						 0,
//&&&staticSymbol&&&						 <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.plugin.EcorePlugin")
//&&&staticSymbol&&&%>.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "<%
//&&&staticSymbol&&&=constraint
//&&&staticSymbol&&&%>", getObjectLabel(<%
//&&&staticSymbol&&&=genClassifier.getSafeUncapName()
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=context
//&&&staticSymbol&&&%>) }),<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genModel.getNonNLS(2)
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&						 new Object[] { <%
//&&&staticSymbol&&&=genClassifier.getSafeUncapName()
//&&&staticSymbol&&&%> }));
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			}
//&&&staticSymbol&&&			return false;
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&		return true;
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
}}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
if (genModel.getRuntimeVersion().getValue() >= GenRuntimeVersion.EMF24_VALUE) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
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
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.common.util.ResourceLocator")
//&&&staticSymbol&&&%> getResourceLocator()
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&  <%
if (genModel.hasModelPluginClass()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		return <%
//&&&staticSymbol&&&=genModel.getImportedName(genModel.getQualifiedModelPluginClassName())
//&&&staticSymbol&&&%>.INSTANCE;
//&&&staticSymbol&&&  <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		// TODO
//&&&staticSymbol&&&		// Specialize this to return a resource locator for messages specific to this validator.
//&&&staticSymbol&&&		// Ensure that you remove @generated or mark it @generated NOT
//&&&staticSymbol&&&		return super.getResourceLocator();
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&} //<%
//&&&staticSymbol&&&=genPackage.getValidatorClassName()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
genModel.emitSortedImports();
//&&&staticSymbol&&&%>

}
}