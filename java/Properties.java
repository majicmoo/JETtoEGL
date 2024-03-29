class Properties {
public static void main (String[] args) {
//&&&staticSymbol&&&<%import java.util.*;%>
//&&&staticSymbol&&&<%import org.eclipse.emf.codegen.ecore.genmodel.*;%>
//&&&staticSymbol&&&<%

/**
 * Copyright (c) 2010 Ed Merks and others.
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
//&&&staticSymbol&&&=genModel.getEditPluginPackageName()
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
genModel.markImportLocation(stringBuffer);
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&/**
//&&&staticSymbol&&& * <!-- begin-user-doc -->
//&&&staticSymbol&&& * <!-- end-user-doc -->
//&&&staticSymbol&&& * @generated
//&&&staticSymbol&&& */
//&&&staticSymbol&&&public interface <%
//&&&staticSymbol&&&=genModel.getEditPluginClassName()
//&&&staticSymbol&&&%>Properties extends <%
//&&&staticSymbol&&&=genModel.getImportedName("com.google.gwt.i18n.client.Messages")
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&{
//&&&staticSymbol&&&<%
if (genModel.isCreationCommands()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	@Key("_UI_CreateChild_text")
//&&&staticSymbol&&&	@DefaultMessage("{0}")
//&&&staticSymbol&&&	String createChildText(Object type);
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	@Key("_UI_CreateChild_text2")
//&&&staticSymbol&&&	@DefaultMessage("{1} <%
if (genModel.isCreationSubmenus()) {
//&&&staticSymbol&&&%>| <%
}
//&&&staticSymbol&&&%>{0}")
//&&&staticSymbol&&&	String createChildText2(Object type, Object feature);
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	@Key("_UI_CreateChild_text3")
//&&&staticSymbol&&&	@DefaultMessage("{0}")
//&&&staticSymbol&&&	String createChildText3(Object feature);
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	@Key("_UI_CreateChild_tooltip")
//&&&staticSymbol&&&	@DefaultMessage("Create New {0} Under {1} Feature")
//&&&staticSymbol&&&	String createChildTooltip(Object type, Object feature);
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	@Key("_UI_CreateChild_description")
//&&&staticSymbol&&&	@DefaultMessage("Create a new child of type {0} for the {1} feature of the selected {2}.")
//&&&staticSymbol&&&	String createChildDescripition(Object type, Object feature, Object selection);
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	@Key("_UI_CreateSibling_description")
//&&&staticSymbol&&&	@DefaultMessage("Create a new sibling of type {0} for the selected {2}, under the {1} feature of their parent.")
//&&&staticSymbol&&&	String createSiblingDescription(Object type, Object feature, Object selection);
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	@Key("_UI_PropertyDescriptor_description")
//&&&staticSymbol&&&	@DefaultMessage("The {0} of the {1}")
//&&&staticSymbol&&&	String propertyDescriptorDescription(Object feature, Object type);
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
for (GenPackage genPackage : genModel.getAllGenAndUsedGenPackagesWithClassifiers()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
if (genPackage.getGenModel() == genModel || !genPackage.getGenModel().hasEditSupport()) { 
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
for (GenClass genClass : genPackage.getGenClasses()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	@Key("_UI_<%
//&&&staticSymbol&&&=genClass.getName()
//&&&staticSymbol&&&%>_type")
//&&&staticSymbol&&&	@DefaultMessage("<%
//&&&staticSymbol&&&=genClass.getFormattedName()
//&&&staticSymbol&&&%>")
//&&&staticSymbol&&&	String <%
//&&&staticSymbol&&&=genClass.getUncapName()
//&&&staticSymbol&&&%>Type();
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
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	@Key("_UI_Unknown_type")
//&&&staticSymbol&&&	@DefaultMessage("Object")
//&&&staticSymbol&&&	String unknownType();
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	@Key("_UI_Unknown_datatype")
//&&&staticSymbol&&&	@DefaultMessage("Value")
//&&&staticSymbol&&&	String unknownDatatype();
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
for (GenFeature genFeature : genModel.getFilteredAllGenFeatures()) { String description = genFeature.getPropertyDescription();
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	@Key("_UI_<%
//&&&staticSymbol&&&=genFeature.getGenClass().getName()
//&&&staticSymbol&&&%>_<%
//&&&staticSymbol&&&=genFeature.getName()
//&&&staticSymbol&&&%>_feature")
//&&&staticSymbol&&&	@DefaultMessage("<%
//&&&staticSymbol&&&=genFeature.getFormattedName()
//&&&staticSymbol&&&%>")
//&&&staticSymbol&&&	String <%
//&&&staticSymbol&&&=genFeature.getGenClass().getUncapName()
//&&&staticSymbol&&&%>_<%
//&&&staticSymbol&&&=genFeature.getCapName()
//&&&staticSymbol&&&%>Feature();
//&&&staticSymbol&&&
//&&&staticSymbol&&&  <%
if (description != null && description.length() > 0) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	@Key("_UI_<%
//&&&staticSymbol&&&=genFeature.getGenClass().getName()
//&&&staticSymbol&&&%>_<%
//&&&staticSymbol&&&=genFeature.getName()
//&&&staticSymbol&&&%>_description")
//&&&staticSymbol&&&	@DefaultMessage("<%
//&&&staticSymbol&&&=description
//&&&staticSymbol&&&%>")
//&&&staticSymbol&&&	String <%
//&&&staticSymbol&&&=genFeature.getGenClass().getUncapName()
//&&&staticSymbol&&&%>_<%
//&&&staticSymbol&&&=genFeature.getCapName()
//&&&staticSymbol&&&%>Description();
//&&&staticSymbol&&&
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	@Key("_UI_Unknown_feature")
//&&&staticSymbol&&&	@DefaultMessage("Unspecified")
//&&&staticSymbol&&&	String unknownFeature();
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
for (GenPackage genPackage : genModel.getAllGenAndUsedGenPackagesWithClassifiers()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
if (genPackage.getGenModel() == genModel || !genPackage.getGenModel().hasEditSupport()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
for (GenEnum genEnum : genPackage.getGenEnums()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
for (GenEnumLiteral genEnumLiteral : genEnum.getGenEnumLiterals()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	@Key("_UI_<%
//&&&staticSymbol&&&=genEnum.getName()
//&&&staticSymbol&&&%>_<%
//&&&staticSymbol&&&=genEnumLiteral.getName()
//&&&staticSymbol&&&%>_literal")
//&&&staticSymbol&&&	@DefaultMessage("<%
//&&&staticSymbol&&&=genEnumLiteral.getLiteral()
//&&&staticSymbol&&&%>")
//&&&staticSymbol&&&	String <%
//&&&staticSymbol&&&=genEnum.getSafeUncapName()
//&&&staticSymbol&&&%>_<%
//&&&staticSymbol&&&=genEnumLiteral.getName()
//&&&staticSymbol&&&%>Literal();
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
for (String category : genModel.getPropertyCategories()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
//&&&staticSymbol&&&=genModel.getPropertyCategoryKey(category)
//&&&staticSymbol&&&%> = <%
//&&&staticSymbol&&&=category
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	@Key("<%
//&&&staticSymbol&&&=genModel.getPropertyCategoryKey(category)
//&&&staticSymbol&&&%>")
//&&&staticSymbol&&&	@DefaultMessage("<%
//&&&staticSymbol&&&=category
//&&&staticSymbol&&&%>")
//&&&staticSymbol&&&	String <%
//&&&staticSymbol&&&=genModel.getPropertyCategoryKey(category)
//&&&staticSymbol&&&%>();
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&}
//&&&staticSymbol&&&<%
genModel.emitSortedImports();
//&&&staticSymbol&&&%>

}
}