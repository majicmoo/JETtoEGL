class ItemProvider {
public static void main (String[] args) {
//&&&staticSymbol&&&<%import java.util.*;%>
//&&&staticSymbol&&&<%import org.eclipse.emf.codegen.ecore.genmodel.*;%>
//&&&staticSymbol&&&<%include("../Header.javajetinc");%>
//&&&staticSymbol&&&<%include("ItemProvider/getText.override.javajetinc");%>
//&&&staticSymbol&&&<%include("ItemProvider/newChildDescriptorsAttributeDelegatedFeature.insert.javajetinc");%>
//&&&staticSymbol&&&<%include("ItemProvider/newChildDescriptorsAttributeFeature.insert.javajetinc");%>
//&&&staticSymbol&&&<%include("ItemProvider/newChildDescriptorsAttributeDelegatedFeature.override.javajetinc");%>
//&&&staticSymbol&&&<%include("ItemProvider/newChildDescriptorsAttributeFeature.override.javajetinc");%>
//&&&staticSymbol&&&<%include("ItemProvider/newChildDescriptorsReferenceDelegatedFeature.override.javajetinc");%>
//&&&staticSymbol&&&<%include("ItemProvider/addPropertyDescriptor.override.javajetinc");%>
//&&&staticSymbol&&&<%include("ItemProvider/newChildDescriptorsReferenceFeature.override.javajetinc");%>
//&&&staticSymbol&&&<%include("ItemProvider/getStyledText.override.javajetinc");%>
//&&&staticSymbol&&&<%include("ItemProvider/newChildDescriptorsReferenceDelegatedFeature.insert.javajetinc");%>
//&&&staticSymbol&&&<%include("ItemProvider/insert.javajetinc");%>
//&&&staticSymbol&&&<%include("ItemProvider/newChildDescriptorsReferenceFeature.insert.javajetinc");%>
//&&&staticSymbol&&&<%

/**
 * Copyright (c) 2002-2007 IBM Corporation and others.
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
GenClass genClass = (GenClass)argument; GenPackage genPackage = genClass.getGenPackage(); GenModel genModel=genPackage.getGenModel();
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&package <%
//&&&staticSymbol&&&=genPackage.getProviderPackageName()
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
genModel.addImport("org.eclipse.emf.common.notify.AdapterFactory");
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
genModel.addImport("org.eclipse.emf.common.notify.Notification");
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
String _List = genModel.getImportedName(genModel.useGenerics() ? "java.util.List<org.eclipse.emf.edit.provider.IItemPropertyDescriptor>" : "java.util.List");
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
genModel.markImportLocation(stringBuffer);
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&/**
//&&&staticSymbol&&& * This is the item provider adapter for a {@link <%
//&&&staticSymbol&&&=genClass.getQualifiedInterfaceName()
//&&&staticSymbol&&&%>} object.
//&&&staticSymbol&&& * <!-- begin-user-doc -->
//&&&staticSymbol&&& * <!-- end-user-doc -->
//&&&staticSymbol&&& * @generated
//&&&staticSymbol&&& */
//&&&staticSymbol&&&public class <%
//&&&staticSymbol&&&=genClass.getProviderClassName()
//&&&staticSymbol&&&%> <%
if (genClass.getProviderImplementsClassNames().isEmpty()) {
//&&&staticSymbol&&&%>extends <%
//&&&staticSymbol&&&*%%storeSymbol%%*0
//&&&staticSymbol&&&%><%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
if (!genClass.getProviderImplementsClassNames().isEmpty()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	extends <%
//&&&staticSymbol&&&*%%storeSymbol%%*1
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	implements
//&&&staticSymbol&&&  <%
for (Iterator<String> i = genClass.getProviderImplementsClassNames().iterator(); i.hasNext(); ) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=genModel.getImportedName(i.next())
//&&&staticSymbol&&&%><%
if (i.hasNext()){
//&&&staticSymbol&&&%>,<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
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
//&&&staticSymbol&&&	 * This constructs an instance from a factory and a notifier.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	public <%
//&&&staticSymbol&&&=genClass.getProviderClassName()
//&&&staticSymbol&&&%>(AdapterFactory adapterFactory)
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		super(adapterFactory);
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * This returns the property descriptors for the adapted class.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&<%
if (genModel.useClassOverrideAnnotation()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	@Override
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	public <%
//&&&staticSymbol&&&=_List
//&&&staticSymbol&&&%> getPropertyDescriptors(Object object)
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		if (itemPropertyDescriptors == null)
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			super.getPropertyDescriptors(object);
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
for (GenFeature genFeature : genClass.getPropertyFeatures()) { 
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			add<%
//&&&staticSymbol&&&=genFeature.getCapName()
//&&&staticSymbol&&&%>PropertyDescriptor(object);
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&		return itemPropertyDescriptors;
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
for (GenFeature genFeature : genClass.getPropertyFeatures()) { 
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * This adds a property descriptor for the <%
//&&&staticSymbol&&&=genFeature.getFormattedName()
//&&&staticSymbol&&&%> feature.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	protected void add<%
//&&&staticSymbol&&&=genFeature.getCapName()
//&&&staticSymbol&&&%>PropertyDescriptor(Object object)
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&<%
//&&&staticSymbol&&&@ start 
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		itemPropertyDescriptors.add
//&&&staticSymbol&&&			(createItemPropertyDescriptor
//&&&staticSymbol&&&				(((<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.edit.provider.ComposeableAdapterFactory")
//&&&staticSymbol&&&%>)adapterFactory).getRootAdapterFactory(),
//&&&staticSymbol&&&				 getResourceLocator(),
//&&&staticSymbol&&&				 getString("_UI_<%
//&&&staticSymbol&&&=genFeature.getGenClass().getName()
//&&&staticSymbol&&&%>_<%
//&&&staticSymbol&&&=genFeature.getName()
//&&&staticSymbol&&&%>_feature"),<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
if (genFeature.getPropertyDescription() == null || genFeature.getPropertyDescription().length() == 0) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				 getString("_UI_PropertyDescriptor_description", "_UI_<%
//&&&staticSymbol&&&=genFeature.getGenClass().getName()
//&&&staticSymbol&&&%>_<%
//&&&staticSymbol&&&=genFeature.getName()
//&&&staticSymbol&&&%>_feature", "_UI_<%
//&&&staticSymbol&&&=genFeature.getGenClass().getName()
//&&&staticSymbol&&&%>_type"),<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genModel.getNonNLS(2)
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genModel.getNonNLS(3)
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				 getString("_UI_<%
//&&&staticSymbol&&&=genFeature.getGenClass().getName()
//&&&staticSymbol&&&%>_<%
//&&&staticSymbol&&&=genFeature.getName()
//&&&staticSymbol&&&%>_description"),<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				 <%
//&&&staticSymbol&&&=genFeature.getQualifiedFeatureAccessor()
//&&&staticSymbol&&&%>,
//&&&staticSymbol&&&				 <%
//&&&staticSymbol&&&*%%storeSymbol%%*2
//&&&staticSymbol&&&%>,
//&&&staticSymbol&&&				 <%
//&&&staticSymbol&&&*%%storeSymbol%%*3
//&&&staticSymbol&&&%>,
//&&&staticSymbol&&&				 <%
//&&&staticSymbol&&&*%%storeSymbol%%*4
//&&&staticSymbol&&&%>,
//&&&staticSymbol&&&  <%
if (genFeature.isReferenceType()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				 null,
//&&&staticSymbol&&&  <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				 <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.edit.provider.ItemPropertyDescriptor")
//&&&staticSymbol&&&%>.<%
//&&&staticSymbol&&&=genFeature.getPropertyImageName()
//&&&staticSymbol&&&%>,
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
if (genFeature.getPropertyCategory() == null || genFeature.getPropertyCategory().length() == 0) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				 null,
//&&&staticSymbol&&&  <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				 getString("<%
//&&&staticSymbol&&&=genModel.getPropertyCategoryKey(genFeature.getPropertyCategory())
//&&&staticSymbol&&&%>"),<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
if (genFeature.getPropertyFilterFlags().isEmpty()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				 null));
//&&&staticSymbol&&&  <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				 new String[] {
//&&&staticSymbol&&&    <%
for (Iterator<String> j = genFeature.getPropertyFilterFlags().iterator(); j.hasNext();) { String filterFlag = j.next();
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
if (filterFlag != null && filterFlag.length() > 0) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&					"<%
//&&&staticSymbol&&&=filterFlag
//&&&staticSymbol&&&%>"<%
if (j.hasNext()) {
//&&&staticSymbol&&&%>,<%
}
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				 }));
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
//&&&staticSymbol&&&@ end 
//&&&staticSymbol&&&%><%
//ItemProvider/addPropertyDescriptor.override.javajetinc
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
if (!genClass.getChildrenFeatures().isEmpty()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
//&&&staticSymbol&&&	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
//&&&staticSymbol&&&	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&<%
if (genModel.useClassOverrideAnnotation()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	@Override
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	public <%
//&&&staticSymbol&&&*%%storeSymbol%%*5
//&&&staticSymbol&&&%> getChildrenFeatures(Object object)
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		if (childrenFeatures == null)
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			super.getChildrenFeatures(object);
//&&&staticSymbol&&&<%
for (GenFeature genFeature : genClass.getChildrenFeatures()) { 
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			childrenFeatures.add(<%
//&&&staticSymbol&&&=genFeature.getQualifiedFeatureAccessor()
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&		return childrenFeatures;
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
if (!genClass.getChildrenFeatures().isEmpty()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&<%
if (genModel.useClassOverrideAnnotation()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	@Override
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	protected <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature")
//&&&staticSymbol&&&%> getChildFeature(Object object, Object child)
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		// Check the type of the specified child object and return the proper feature to use for
//&&&staticSymbol&&&		// adding (see {@link AddCommand}) it as a child.
//&&&staticSymbol&&&
//&&&staticSymbol&&&		return super.getChildFeature(object, child);
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
if (genClass.needsHasChildrenMethodOverride()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&<%
if (genModel.useClassOverrideAnnotation()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	@Override
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	public boolean hasChildren(Object object)
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		return hasChildren(object, <%
//&&&staticSymbol&&&=genModel.isOptimizedHasChildren()
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
if (genClass.isImage()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * This returns <%
//&&&staticSymbol&&&=genClass.getName()
//&&&staticSymbol&&&%>.gif.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&<%
if (genModel.useClassOverrideAnnotation()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	@Override
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	public Object getImage(Object object)
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		return overlayImage(object, getResourceLocator().getImage("full/obj16/<%
//&&&staticSymbol&&&=genClass.getName()
//&&&staticSymbol&&&%>"));<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
if (genModel.getRuntimeVersion().getValue() >= GenRuntimeVersion.EMF26_VALUE && !genModel.isCreationIcons()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&<%
if (genModel.useClassOverrideAnnotation()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	@Override
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	protected boolean shouldComposeCreationImage() 
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		return true;
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * This returns the label text for the adapted class.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&<%
if (genModel.useClassOverrideAnnotation()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	@Override
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	public String getText(Object object)
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&<%
//&&&staticSymbol&&&@ start 
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
if (genModel.isStyleProviders()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		return ((<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.edit.provider.StyledString")
//&&&staticSymbol&&&%>)getStyledText(object)).getString();
//&&&staticSymbol&&&<%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
if (genClass.isMapEntry()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=genClass.getImportedInterfaceName()
//&&&staticSymbol&&&%><%
if (genModel.useGenerics()) {
//&&&staticSymbol&&&%><?, ?><%
}
//&&&staticSymbol&&&%> <%
//&&&staticSymbol&&&=genClass.getSafeUncapName()
//&&&staticSymbol&&&%> = (<%
//&&&staticSymbol&&&=genClass.getImportedInterfaceName()
//&&&staticSymbol&&&%><%
if (genModel.useGenerics()) {
//&&&staticSymbol&&&%><?, ?><%
}
//&&&staticSymbol&&&%>)object;
//&&&staticSymbol&&&  <%
if (!genClass.getMapEntryKeyFeature().isPropertyMultiLine() && !genClass.getMapEntryValueFeature().isPropertyMultiLine()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		return "" + <%
//&&&staticSymbol&&&=genClass.getSafeUncapName()
//&&&staticSymbol&&&%>.getKey() + " -> " + <%
//&&&staticSymbol&&&=genClass.getSafeUncapName()
//&&&staticSymbol&&&%>.getValue();<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genModel.getNonNLS(2)
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
if (genClass.getMapEntryKeyFeature().isPropertyMultiLine()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		String key = crop("" + <%
//&&&staticSymbol&&&=genClass.getSafeUncapName()
//&&&staticSymbol&&&%>.getKey());<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		String key = "" + <%
//&&&staticSymbol&&&=genClass.getSafeUncapName()
//&&&staticSymbol&&&%>.getKey();<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
if (genClass.getMapEntryValueFeature().isPropertyMultiLine()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		String value = crop("" + <%
//&&&staticSymbol&&&=genClass.getSafeUncapName()
//&&&staticSymbol&&&%>.getValue());<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		String value = "" + <%
//&&&staticSymbol&&&=genClass.getSafeUncapName()
//&&&staticSymbol&&&%>.getValue();<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		return key + " -> " + value;<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
} else if (genClass.getLabelFeature() != null) { GenFeature labelFeature = genClass.getLabelFeature();
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
if (labelFeature.isPrimitiveType() && !labelFeature.getGenClass().isDynamic() && !labelFeature.isSuppressedGetVisibility()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=genClass.getImportedInterfaceName()
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genClass.getInterfaceWildTypeArguments()
//&&&staticSymbol&&&%> <%
//&&&staticSymbol&&&=genClass.getSafeUncapName()
//&&&staticSymbol&&&%> = (<%
//&&&staticSymbol&&&=genClass.getImportedInterfaceName()
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genClass.getInterfaceWildTypeArguments()
//&&&staticSymbol&&&%>)object;
//&&&staticSymbol&&&		return getString("_UI_<%
//&&&staticSymbol&&&=genClass.getName()
//&&&staticSymbol&&&%>_type") + " " + <%
//&&&staticSymbol&&&=genClass.getSafeUncapName()
//&&&staticSymbol&&&%>.<%
//&&&staticSymbol&&&=genClass.getLabelFeature().getGetAccessor()
//&&&staticSymbol&&&%>();<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genModel.getNonNLS(2)
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
if (labelFeature.isStringType() && !labelFeature.getGenClass().isDynamic() && !labelFeature.isSuppressedGetVisibility()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
if (labelFeature.isPropertyMultiLine()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		String label = crop(((<%
//&&&staticSymbol&&&=genClass.getImportedInterfaceName()
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genClass.getInterfaceWildTypeArguments()
//&&&staticSymbol&&&%>)object).<%
//&&&staticSymbol&&&=labelFeature.getGetAccessor()
//&&&staticSymbol&&&%>());
//&&&staticSymbol&&&      <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		String label = ((<%
//&&&staticSymbol&&&=genClass.getImportedInterfaceName()
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genClass.getInterfaceWildTypeArguments()
//&&&staticSymbol&&&%>)object).<%
//&&&staticSymbol&&&=labelFeature.getGetAccessor()
//&&&staticSymbol&&&%>();
//&&&staticSymbol&&&      <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
if (labelFeature.isSuppressedGetVisibility() || labelFeature.getGenClass().isDynamic()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=genModel.getImportedName("java.lang.Object")
//&&&staticSymbol&&&%> labelValue = ((<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.EObject")
//&&&staticSymbol&&&%>)object).eGet(<%
//&&&staticSymbol&&&=labelFeature.getQualifiedFeatureAccessor()
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&      <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=labelFeature.getRawImportedType()
//&&&staticSymbol&&&%> labelValue = ((<%
//&&&staticSymbol&&&=genClass.getImportedInterfaceName()
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genClass.getInterfaceWildTypeArguments()
//&&&staticSymbol&&&%>)object).<%
//&&&staticSymbol&&&=labelFeature.getGetAccessor()
//&&&staticSymbol&&&%>();
//&&&staticSymbol&&&      <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		String label = labelValue == null ? null : labelValue.toString();
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		return label == null || label.length() == 0 ?
//&&&staticSymbol&&&			getString("_UI_<%
//&&&staticSymbol&&&=genClass.getName()
//&&&staticSymbol&&&%>_type") :<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			getString("_UI_<%
//&&&staticSymbol&&&=genClass.getName()
//&&&staticSymbol&&&%>_type") + " " + label;<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genModel.getNonNLS(2)
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		return getString("_UI_<%
//&&&staticSymbol&&&=genClass.getName()
//&&&staticSymbol&&&%>_type");<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
//&&&staticSymbol&&&@ end 
//&&&staticSymbol&&&%><%
//ItemProvider/getText.override.javajetinc
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&	
//&&&staticSymbol&&&<%
if (genModel.isStyleProviders()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * This returns the label styled text for the adapted class.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&<%
if (genModel.useClassOverrideAnnotation()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	@Override
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	public Object getStyledText(Object object)
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&<%
//&&&staticSymbol&&&@ start 
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
if (genClass.isMapEntry()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=genClass.getImportedInterfaceName()
//&&&staticSymbol&&&%><%
if (genModel.useGenerics()) {
//&&&staticSymbol&&&%><?, ?><%
}
//&&&staticSymbol&&&%> <%
//&&&staticSymbol&&&=genClass.getSafeUncapName()
//&&&staticSymbol&&&%> = (<%
//&&&staticSymbol&&&=genClass.getImportedInterfaceName()
//&&&staticSymbol&&&%><%
if (genModel.useGenerics()) {
//&&&staticSymbol&&&%><?, ?><%
}
//&&&staticSymbol&&&%>)object;
//&&&staticSymbol&&&  <%
if (!genClass.getMapEntryKeyFeature().isPropertyMultiLine() && !genClass.getMapEntryValueFeature().isPropertyMultiLine()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		return new <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.edit.provider.StyledString")
//&&&staticSymbol&&&%>("" + <%
//&&&staticSymbol&&&=genClass.getSafeUncapName()
//&&&staticSymbol&&&%>.getKey()).append(" -> ", <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.edit.provider.StyledString$Style")
//&&&staticSymbol&&&%>.QUALIFIER_STYLER).append("" + <%
//&&&staticSymbol&&&=genClass.getSafeUncapName()
//&&&staticSymbol&&&%>.getValue());<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genModel.getNonNLS(2)
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
if (genClass.getMapEntryKeyFeature().isPropertyMultiLine()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		String key = crop("" + <%
//&&&staticSymbol&&&=genClass.getSafeUncapName()
//&&&staticSymbol&&&%>.getKey());<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		String key = "" + <%
//&&&staticSymbol&&&=genClass.getSafeUncapName()
//&&&staticSymbol&&&%>.getKey();<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
if (genClass.getMapEntryValueFeature().isPropertyMultiLine()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		String value = crop("" + <%
//&&&staticSymbol&&&=genClass.getSafeUncapName()
//&&&staticSymbol&&&%>.getValue());<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		String value = "" + <%
//&&&staticSymbol&&&=genClass.getSafeUncapName()
//&&&staticSymbol&&&%>.getValue();<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		return new <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.edit.provider.StyledString")
//&&&staticSymbol&&&%>(key).append(" -> ", <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.edit.provider.StyledString$Style")
//&&&staticSymbol&&&%>.QUALIFIER_STYLER).append(value);<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
} else if (genClass.getLabelFeature() != null) { GenFeature labelFeature = genClass.getLabelFeature();
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
if (labelFeature.isPrimitiveType() && !labelFeature.getGenClass().isDynamic() && !labelFeature.isSuppressedGetVisibility()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=genClass.getImportedInterfaceName()
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genClass.getInterfaceWildTypeArguments()
//&&&staticSymbol&&&%> <%
//&&&staticSymbol&&&=genClass.getSafeUncapName()
//&&&staticSymbol&&&%> = (<%
//&&&staticSymbol&&&=genClass.getImportedInterfaceName()
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genClass.getInterfaceWildTypeArguments()
//&&&staticSymbol&&&%>)object;
//&&&staticSymbol&&&		return new <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.edit.provider.StyledString")
//&&&staticSymbol&&&%>(getString("_UI_<%
//&&&staticSymbol&&&=genClass.getName()
//&&&staticSymbol&&&%>_type"), <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.edit.provider.StyledString$Style")
//&&&staticSymbol&&&%>.QUALIFIER_STYLER).append(" ").append(<%
//&&&staticSymbol&&&=labelFeature.getObjectType(genClass)
//&&&staticSymbol&&&%>.toString(<%
//&&&staticSymbol&&&=genClass.getSafeUncapName()
//&&&staticSymbol&&&%>.<%
//&&&staticSymbol&&&=genClass.getLabelFeature().getGetAccessor()
//&&&staticSymbol&&&%>()));<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genModel.getNonNLS(2)
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
if (labelFeature.isStringType() && !labelFeature.getGenClass().isDynamic() && !labelFeature.isSuppressedGetVisibility()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
if (labelFeature.isPropertyMultiLine()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		String label = crop(((<%
//&&&staticSymbol&&&=genClass.getImportedInterfaceName()
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genClass.getInterfaceWildTypeArguments()
//&&&staticSymbol&&&%>)object).<%
//&&&staticSymbol&&&=labelFeature.getGetAccessor()
//&&&staticSymbol&&&%>());
//&&&staticSymbol&&&      <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		String label = ((<%
//&&&staticSymbol&&&=genClass.getImportedInterfaceName()
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genClass.getInterfaceWildTypeArguments()
//&&&staticSymbol&&&%>)object).<%
//&&&staticSymbol&&&=labelFeature.getGetAccessor()
//&&&staticSymbol&&&%>();
//&&&staticSymbol&&&      <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
if (labelFeature.isSuppressedGetVisibility() || labelFeature.getGenClass().isDynamic()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=genModel.getImportedName("java.lang.Object")
//&&&staticSymbol&&&%> labelValue = ((<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.EObject")
//&&&staticSymbol&&&%>)object).eGet(<%
//&&&staticSymbol&&&=labelFeature.getQualifiedFeatureAccessor()
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&      <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=labelFeature.getRawImportedType()
//&&&staticSymbol&&&%> labelValue = ((<%
//&&&staticSymbol&&&=genClass.getImportedInterfaceName()
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genClass.getInterfaceWildTypeArguments()
//&&&staticSymbol&&&%>)object).<%
//&&&staticSymbol&&&=labelFeature.getGetAccessor()
//&&&staticSymbol&&&%>();
//&&&staticSymbol&&&      <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		String label = labelValue == null ? null : labelValue.toString();
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    	<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.edit.provider.StyledString")
//&&&staticSymbol&&&%> styledLabel = new <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.edit.provider.StyledString")
//&&&staticSymbol&&&%>();
//&&&staticSymbol&&&		if (label == null || label.length() == 0) 
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			styledLabel.append(getString("_UI_<%
//&&&staticSymbol&&&=genClass.getName()
//&&&staticSymbol&&&%>_type"), <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.edit.provider.StyledString$Style")
//&&&staticSymbol&&&%>.QUALIFIER_STYLER); <%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		} else {
//&&&staticSymbol&&&			styledLabel.append(getString("_UI_<%
//&&&staticSymbol&&&=genClass.getName()
//&&&staticSymbol&&&%>_type"), <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.edit.provider.StyledString$Style")
//&&&staticSymbol&&&%>.QUALIFIER_STYLER).append(" " + label);<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genModel.getNonNLS(2)
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&		return styledLabel;
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		return new <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.edit.provider.StyledString")
//&&&staticSymbol&&&%>(getString("_UI_<%
//&&&staticSymbol&&&=genClass.getName()
//&&&staticSymbol&&&%>_type"));<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
//&&&staticSymbol&&&@ end 
//&&&staticSymbol&&&%><%
//ItemProvider/getStyledText.override.javajetinc
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	}	
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * This handles model notifications by calling {@link #updateChildren} to update any cached
//&&&staticSymbol&&&	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&<%
if (genModel.useClassOverrideAnnotation()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	@Override
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	public void notifyChanged(Notification notification)
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		updateChildren(notification);
//&&&staticSymbol&&&<%
if (!genClass.getLabelNotifyFeatures().isEmpty() || !genClass.getContentNotifyFeatures().isEmpty() || !genClass.getLabelAndContentNotifyFeatures().isEmpty()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&		switch (notification.getFeatureID(<%
//&&&staticSymbol&&&=genClass.getRawImportedInterfaceName()
//&&&staticSymbol&&&%>.class))
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&  <%
if (!genClass.getLabelNotifyFeatures().isEmpty()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
for (GenFeature genFeature : genClass.getLabelNotifyFeatures()) { 
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			case <%
//&&&staticSymbol&&&=genClass.getQualifiedFeatureID(genFeature)
//&&&staticSymbol&&&%>:
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				fireNotifyChanged(new <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.edit.provider.ViewerNotification")
//&&&staticSymbol&&&%>(notification, notification.getNotifier(), false, true));
//&&&staticSymbol&&&				return;
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
if (!genClass.getContentNotifyFeatures().isEmpty()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
for (GenFeature genFeature : genClass.getContentNotifyFeatures()) { 
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			case <%
//&&&staticSymbol&&&=genClass.getQualifiedFeatureID(genFeature)
//&&&staticSymbol&&&%>:
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				fireNotifyChanged(new <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.edit.provider.ViewerNotification")
//&&&staticSymbol&&&%>(notification, notification.getNotifier(), true, false));
//&&&staticSymbol&&&				return;
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
if (!genClass.getLabelAndContentNotifyFeatures().isEmpty()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
for (GenFeature genFeature : genClass.getLabelAndContentNotifyFeatures()) { 
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			case <%
//&&&staticSymbol&&&=genClass.getQualifiedFeatureID(genFeature)
//&&&staticSymbol&&&%>:
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				fireNotifyChanged(new <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.edit.provider.ViewerNotification")
//&&&staticSymbol&&&%>(notification, notification.getNotifier(), true, true));
//&&&staticSymbol&&&				return;
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		super.notifyChanged(notification);
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
if (genModel.isCreationCommands()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
//&&&staticSymbol&&&	 * that can be created under this object.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&<%
if (genModel.useClassOverrideAnnotation()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	@Override
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	protected void collectNewChildDescriptors(<%
//&&&staticSymbol&&&*%%storeSymbol%%*6
//&&&staticSymbol&&&%> newChildDescriptors, Object object)
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		super.collectNewChildDescriptors(newChildDescriptors, object);
//&&&staticSymbol&&&    <%
for (GenClass.ChildCreationData childCreationData : genClass.getChildCreationData()) { GenFeature createFeature = childCreationData.createFeature; GenFeature delegatedFeature = childCreationData.delegatedFeature; GenClassifier createClassifier = childCreationData.createClassifier;
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
if (createFeature.isFeatureMapType()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&        <%
if (delegatedFeature.isReferenceType()) { GenClass createClass = (GenClass)createClassifier;
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
//&&&staticSymbol&&&@ start 
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&		newChildDescriptors.add
//&&&staticSymbol&&&			(createChildParameter
//&&&staticSymbol&&&				(<%
//&&&staticSymbol&&&=createFeature.getQualifiedFeatureAccessor()
//&&&staticSymbol&&&%>,
//&&&staticSymbol&&&				 <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMapUtil")
//&&&staticSymbol&&&%>.createEntry
//&&&staticSymbol&&&					(<%
//&&&staticSymbol&&&=delegatedFeature.getQualifiedFeatureAccessor()
//&&&staticSymbol&&&%>,
//&&&staticSymbol&&&          <%
if (createClass.isMapEntry()) { 
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&					 <%
//&&&staticSymbol&&&=createClass.getGenPackage().getQualifiedEFactoryInstanceAccessor()
//&&&staticSymbol&&&%>.create(<%
//&&&staticSymbol&&&=createClass.getQualifiedClassifierAccessor()
//&&&staticSymbol&&&%>))));
//&&&staticSymbol&&&          <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&					 <%
//&&&staticSymbol&&&=createClass.getGenPackage().getQualifiedFactoryInstanceAccessor()
//&&&staticSymbol&&&%>.create<%
//&&&staticSymbol&&&=createClass.getName()
//&&&staticSymbol&&&%>())));
//&&&staticSymbol&&&          <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
//&&&staticSymbol&&&@ end 
//&&&staticSymbol&&&%><%
//ItemProvider/newChildDescriptorsReferenceDelegatedFeature.override.javajetinc
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&        <%
} else { GenDataType createDataType = (GenDataType)createClassifier;
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
//&&&staticSymbol&&&@ start 
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&		newChildDescriptors.add
//&&&staticSymbol&&&			(createChildParameter
//&&&staticSymbol&&&				(<%
//&&&staticSymbol&&&=createFeature.getQualifiedFeatureAccessor()
//&&&staticSymbol&&&%>,
//&&&staticSymbol&&&				 <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMapUtil")
//&&&staticSymbol&&&%>.createEntry
//&&&staticSymbol&&&					(<%
//&&&staticSymbol&&&=delegatedFeature.getQualifiedFeatureAccessor()
//&&&staticSymbol&&&%>,
//&&&staticSymbol&&&          <%
if (delegatedFeature.isEnumBasedType()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&					 <%
//&&&staticSymbol&&&=delegatedFeature.getTypeGenEnum().getStaticValue(delegatedFeature.getEcoreFeature().getDefaultValueLiteral())
//&&&staticSymbol&&&%>)));
//&&&staticSymbol&&&          <%
} else if (delegatedFeature.isStringBasedType()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&					 <%
//&&&staticSymbol&&&=delegatedFeature.getCreateChildValueLiteral()
//&&&staticSymbol&&&%>)));<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&          <%
} else { String literal = delegatedFeature.getCreateChildValueLiteral();
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&					 <%
//&&&staticSymbol&&&=createDataType.getGenPackage().getQualifiedEFactoryInstanceAccessor()
//&&&staticSymbol&&&%>.createFromString(<%
//&&&staticSymbol&&&=createDataType.getQualifiedClassifierAccessor()
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=literal
//&&&staticSymbol&&&%>))));<%
if (literal != null) {
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%><%
} else {
//&&&staticSymbol&&&%> // TODO: ensure this is a valid literal value<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&          <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
//&&&staticSymbol&&&@ end 
//&&&staticSymbol&&&%><%
//ItemProvider/newChildDescriptorsAttributeDelegatedFeature.override.javajetinc
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&        <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
} else if (createFeature.isReferenceType()) { GenClass createClass = (GenClass)createClassifier;
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
//&&&staticSymbol&&&@ start 
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&		newChildDescriptors.add
//&&&staticSymbol&&&			(createChildParameter
//&&&staticSymbol&&&				(<%
//&&&staticSymbol&&&=createFeature.getQualifiedFeatureAccessor()
//&&&staticSymbol&&&%>,
//&&&staticSymbol&&&        <%
if (createClass.isMapEntry()) { 
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				 <%
//&&&staticSymbol&&&=createClass.getGenPackage().getQualifiedEFactoryInstanceAccessor()
//&&&staticSymbol&&&%>.create(<%
//&&&staticSymbol&&&=createClass.getQualifiedClassifierAccessor()
//&&&staticSymbol&&&%>)));
//&&&staticSymbol&&&        <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				 <%
//&&&staticSymbol&&&=createClass.getGenPackage().getQualifiedFactoryInstanceAccessor()
//&&&staticSymbol&&&%>.create<%
//&&&staticSymbol&&&=createClass.getName()
//&&&staticSymbol&&&%>()));
//&&&staticSymbol&&&        <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
//&&&staticSymbol&&&@ end 
//&&&staticSymbol&&&%><%
//ItemProvider/newChildDescriptorsReferenceFeature.override.javajetinc 
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
} else { GenDataType createDataType = (GenDataType)createClassifier;
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
//&&&staticSymbol&&&@ start 
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&		newChildDescriptors.add
//&&&staticSymbol&&&			(createChildParameter
//&&&staticSymbol&&&				(<%
//&&&staticSymbol&&&=createFeature.getQualifiedFeatureAccessor()
//&&&staticSymbol&&&%>,
//&&&staticSymbol&&&        <%
if (createFeature.isEnumBasedType()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				 <%
//&&&staticSymbol&&&=createFeature.getTypeGenEnum().getStaticValue(createFeature.getEcoreFeature().getDefaultValueLiteral())
//&&&staticSymbol&&&%>));
//&&&staticSymbol&&&        <%
} else if (createFeature.isStringBasedType()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				 <%
//&&&staticSymbol&&&=createFeature.getCreateChildValueLiteral()
//&&&staticSymbol&&&%>));<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&        <%
} else { String literal = createFeature.getCreateChildValueLiteral();
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				 <%
//&&&staticSymbol&&&=createDataType.getGenPackage().getQualifiedEFactoryInstanceAccessor()
//&&&staticSymbol&&&%>.createFromString(<%
//&&&staticSymbol&&&=createDataType.getQualifiedClassifierAccessor()
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=literal
//&&&staticSymbol&&&%>)));<%
if (literal != null) {
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%><%
} else {
//&&&staticSymbol&&&%> // TODO: ensure this is a valid literal value<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&        <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
//&&&staticSymbol&&&@ end 
//&&&staticSymbol&&&%><%
//ItemProvider/newChildDescriptorsAttributeFeature.override.javajetinc
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&      <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&  <%
if (!genClass.getSharedClassCreateChildFeatures().isEmpty()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&<%
if (genModel.useClassOverrideAnnotation()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	@Override
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	public String getCreateChildText(Object owner, Object feature, Object child, <%
//&&&staticSymbol&&&*%%storeSymbol%%*7
//&&&staticSymbol&&&%> selection)
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		Object childFeature = feature;
//&&&staticSymbol&&&		Object childObject = child;
//&&&staticSymbol&&&
//&&&staticSymbol&&&    <%
if (genClass.hasFeatureMapCreateChildFeatures()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		if (childFeature instanceof <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature")
//&&&staticSymbol&&&%> && <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMapUtil")
//&&&staticSymbol&&&%>.isFeatureMap((EStructuralFeature)childFeature))
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap")
//&&&staticSymbol&&&%>.Entry entry = (FeatureMap.Entry)childObject;
//&&&staticSymbol&&&			childFeature = entry.getEStructuralFeature();
//&&&staticSymbol&&&			childObject = entry.getValue();
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		boolean qualify =
//&&&staticSymbol&&&    <%
for (Iterator<GenFeature> i = genClass.getSharedClassCreateChildFeatures().iterator(); i.hasNext();) { GenFeature createFeature = i.next();
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			childFeature == <%
//&&&staticSymbol&&&=createFeature.getQualifiedFeatureAccessor()
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&*%%storeSymbol%%*8
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&		if (qualify)
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			return getString
//&&&staticSymbol&&&				("_UI_CreateChild_text2",<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&		return super.getCreateChildText(owner, feature, child, selection);
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
if (genClass.getProviderExtendsGenClass() == null || genClass.getProviderExtendsGenClass().getGenPackage() != genPackage && (!genPackage.isExtensibleProviderFactory() || genClass.getProviderExtendsGenClass().getGenPackage().isExtensibleProviderFactory() != genPackage.isExtensibleProviderFactory())) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * Return the resource locator for this item provider's resources.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&<%
if (genModel.useClassOverrideAnnotation()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	@Override
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	public <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.common.util.ResourceLocator")
//&&&staticSymbol&&&%> getResourceLocator()
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&<%
if (genPackage.isExtensibleProviderFactory()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		return ((<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.edit.provider.IChildCreationExtender")
//&&&staticSymbol&&&%>)adapterFactory).getResourceLocator();
//&&&staticSymbol&&&<%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		return <%
//&&&staticSymbol&&&=genPackage.getImportedEditPluginClassName()
//&&&staticSymbol&&&%>.INSTANCE;
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	}
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