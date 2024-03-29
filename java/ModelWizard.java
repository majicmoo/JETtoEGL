class ModelWizard {
public static void main (String[] args) {
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
GenPackage genPackage = (GenPackage)argument; GenModel genModel=genPackage.getGenModel();
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%include("../Header.javajetinc");%>
//&&&staticSymbol&&&<%
String _ListOfString = "List" + (genModel.useGenerics() ? "<" + genModel.getImportedName("java.lang.String") + ">" : "");
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
String _ArrayListOfString = "ArrayList" + (genModel.useGenerics() ? "<" + genModel.getImportedName("java.lang.String") + ">" : "");
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
String _CollectionOfString = "Collection" + (genModel.useGenerics() ? "<" + genModel.getImportedName("java.lang.String") + ">" : "");
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
String _MapOfObjectToObject = "Map" + (genModel.useGenerics() ? "<" + genModel.getImportedName("java.lang.Object") + ", " + genModel.getImportedName("java.lang.Object") + ">" : "");
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
String _HashMapOfObjectToObject = "HashMap" + (genModel.useGenerics() ? "<" + genModel.getImportedName("java.lang.Object") + ", " + genModel.getImportedName("java.lang.Object") + ">" : "");
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&package <%
//&&&staticSymbol&&&=genPackage.getPresentationPackageName()
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&
//&&&staticSymbol&&&
//&&&staticSymbol&&&import java.util.ArrayList;
//&&&staticSymbol&&&import java.util.Arrays;
//&&&staticSymbol&&&import java.util.Collection;
//&&&staticSymbol&&&import java.util.Collections;
//&&&staticSymbol&&&import java.util.HashMap;
//&&&staticSymbol&&&<%
if (!genModel.useGenerics()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&import java.util.Iterator;
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&import java.util.List;
//&&&staticSymbol&&&import java.util.Map;
//&&&staticSymbol&&&import java.util.MissingResourceException;
//&&&staticSymbol&&&import java.util.StringTokenizer;
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
if (!genModel.isRichClientPlatform() && genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&import org.eclipse.emf.common.CommonPlugin;
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&import org.eclipse.emf.common.util.URI;
//&&&staticSymbol&&&
//&&&staticSymbol&&&import org.eclipse.emf.ecore.EClass;
//&&&staticSymbol&&&import org.eclipse.emf.ecore.EClassifier;
//&&&staticSymbol&&&
//&&&staticSymbol&&&import org.eclipse.emf.ecore.resource.Resource;
//&&&staticSymbol&&&import org.eclipse.emf.ecore.resource.ResourceSet;
//&&&staticSymbol&&&
//&&&staticSymbol&&&import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
//&&&staticSymbol&&&
//&&&staticSymbol&&&import org.eclipse.emf.ecore.EObject;
//&&&staticSymbol&&&
//&&&staticSymbol&&&import org.eclipse.emf.ecore.xmi.XMLResource;
//&&&staticSymbol&&&
//&&&staticSymbol&&&import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
if (!genModel.isRichClientPlatform()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&import org.eclipse.core.resources.IContainer;
//&&&staticSymbol&&&import org.eclipse.core.resources.IFile;
//&&&staticSymbol&&&import org.eclipse.core.resources.IFolder;
//&&&staticSymbol&&&import org.eclipse.core.resources.IProject;
//&&&staticSymbol&&&import org.eclipse.core.resources.IResource;
//&&&staticSymbol&&&import org.eclipse.core.resources.ResourcesPlugin;
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&import org.eclipse.core.runtime.IProgressMonitor;
//&&&staticSymbol&&&
//&&&staticSymbol&&&import org.eclipse.jface.dialogs.MessageDialog;
//&&&staticSymbol&&&
//&&&staticSymbol&&&import org.eclipse.jface.viewers.IStructuredSelection;
//&&&staticSymbol&&&
//&&&staticSymbol&&&import org.eclipse.jface.wizard.Wizard;
//&&&staticSymbol&&&import org.eclipse.jface.wizard.WizardPage;
//&&&staticSymbol&&&
//&&&staticSymbol&&&import org.eclipse.swt.SWT;
//&&&staticSymbol&&&
//&&&staticSymbol&&&import org.eclipse.swt.events.ModifyListener;
//&&&staticSymbol&&&import org.eclipse.swt.events.ModifyEvent;
//&&&staticSymbol&&&
//&&&staticSymbol&&&import org.eclipse.swt.layout.GridData;
//&&&staticSymbol&&&import org.eclipse.swt.layout.GridLayout;
//&&&staticSymbol&&&
//&&&staticSymbol&&&import org.eclipse.swt.widgets.Combo;
//&&&staticSymbol&&&import org.eclipse.swt.widgets.Composite;
//&&&staticSymbol&&&import org.eclipse.swt.widgets.Label;
//&&&staticSymbol&&&
//&&&staticSymbol&&&import org.eclipse.ui.INewWizard;
//&&&staticSymbol&&&import org.eclipse.ui.IWorkbench;
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
if (!genModel.isRichClientPlatform()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&import org.eclipse.ui.actions.WorkspaceModifyOperation;
//&&&staticSymbol&&&
//&&&staticSymbol&&&import org.eclipse.ui.dialogs.WizardNewFileCreationPage;
//&&&staticSymbol&&&
//&&&staticSymbol&&&import org.eclipse.ui.part.FileEditorInput;
//&&&staticSymbol&&&import org.eclipse.ui.part.ISetSelectionTarget;
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
if (!genModel.isSuppressEMFMetaData()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
genModel.markImportLocation(stringBuffer);
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&
//&&&staticSymbol&&&/**
//&&&staticSymbol&&& * This is a simple wizard for creating a new model file.
//&&&staticSymbol&&& * <!-- begin-user-doc -->
//&&&staticSymbol&&& * <!-- end-user-doc -->
//&&&staticSymbol&&& * @generated
//&&&staticSymbol&&& */
//&&&staticSymbol&&&public class <%
//&&&staticSymbol&&&=genPackage.getModelWizardClassName()
//&&&staticSymbol&&&%> extends Wizard implements INewWizard
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
//&&&staticSymbol&&&	 * The supported extensions for created files.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	public static final <%
//&&&staticSymbol&&&=_ListOfString
//&&&staticSymbol&&&%> FILE_EXTENSIONS =
//&&&staticSymbol&&&		Collections.unmodifiableList(Arrays.asList(<%
//&&&staticSymbol&&&=genPackage.getImportedEditorPluginClassName()
//&&&staticSymbol&&&%>.INSTANCE.getString("_UI_<%
//&&&staticSymbol&&&=genPackage.getEditorClassName()
//&&&staticSymbol&&&%>FilenameExtensions").split("\\s*,\\s*")));<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genModel.getNonNLS(2)
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * A formatted list of supported file extensions, suitable for display.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	public static final String FORMATTED_FILE_EXTENSIONS =
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=genPackage.getImportedEditorPluginClassName()
//&&&staticSymbol&&&%>.INSTANCE.getString("_UI_<%
//&&&staticSymbol&&&=genPackage.getEditorClassName()
//&&&staticSymbol&&&%>FilenameExtensions").replaceAll("\\s*,\\s*", ", ");<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genModel.getNonNLS(2)
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genModel.getNonNLS(3)
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * This caches an instance of the model package.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	protected <%
//&&&staticSymbol&&&*%%storeSymbol%%*0
//&&&staticSymbol&&&%> <%
//&&&staticSymbol&&&=genPackage.getUncapPackageName()
//&&&staticSymbol&&&%> = <%
//&&&staticSymbol&&&=genPackage.getPackageInterfaceName()
//&&&staticSymbol&&&%>.eINSTANCE;
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * This caches an instance of the model factory.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	protected <%
//&&&staticSymbol&&&*%%storeSymbol%%*1
//&&&staticSymbol&&&%> <%
//&&&staticSymbol&&&=genPackage.getUncapFactoryName()
//&&&staticSymbol&&&%> = <%
//&&&staticSymbol&&&=genPackage.getUncapPackageName()
//&&&staticSymbol&&&%>.get<%
//&&&staticSymbol&&&*%%storeSymbol%%*2
//&&&staticSymbol&&&%>();
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
if (!genModel.isRichClientPlatform()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * This is the file creation page.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	protected <%
//&&&staticSymbol&&&=genPackage.getModelWizardClassName()
//&&&staticSymbol&&&%>NewFileCreationPage newFileCreationPage;
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * This is the initial object creation page.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	protected <%
//&&&staticSymbol&&&=genPackage.getModelWizardClassName()
//&&&staticSymbol&&&%>InitialObjectCreationPage initialObjectCreationPage;
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * Remember the selection during initialization for populating the default container.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	protected IStructuredSelection selection;
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * Remember the workbench during initialization.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	protected IWorkbench workbench;
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&<%
if (!genPackage.hasDocumentRoot()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	 * Caches the names of the types that can be created as the root object.
//&&&staticSymbol&&&<%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	 * Caches the names of the features representing global elements.
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	protected <%
//&&&staticSymbol&&&=_ListOfString
//&&&staticSymbol&&&%> initialObjectNames;
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * This just records the information.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	public void init(IWorkbench workbench, IStructuredSelection selection)
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		this.workbench = workbench;
//&&&staticSymbol&&&		this.selection = selection;
//&&&staticSymbol&&&		setWindowTitle(<%
//&&&staticSymbol&&&=genPackage.getImportedEditorPluginClassName()
//&&&staticSymbol&&&%>.INSTANCE.getString("_UI_Wizard_label"));<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		setDefaultPageImageDescriptor(ExtendedImageRegistry.INSTANCE.getImageDescriptor(<%
//&&&staticSymbol&&&=genPackage.getImportedEditorPluginClassName()
//&&&staticSymbol&&&%>.INSTANCE.getImage("full/wizban/New<%
//&&&staticSymbol&&&=genPackage.getPrefix()
//&&&staticSymbol&&&%>")));<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&<%
if (!genPackage.hasDocumentRoot()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	 * Returns the names of the types that can be created as the root object.
//&&&staticSymbol&&&<%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	 * Returns the names of the features representing global elements.
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	protected <%
//&&&staticSymbol&&&=_CollectionOfString
//&&&staticSymbol&&&%> getInitialObjectNames()
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		if (initialObjectNames == null)
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			initialObjectNames = new <%
//&&&staticSymbol&&&=_ArrayListOfString
//&&&staticSymbol&&&%>();
//&&&staticSymbol&&&<%
if (!genPackage.hasDocumentRoot()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
if (genModel.useGenerics()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			for (EClassifier eClassifier : <%
//&&&staticSymbol&&&=genPackage.getUncapPackageName()
//&&&staticSymbol&&&%>.getEClassifiers())
//&&&staticSymbol&&&  <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			for (Iterator classifiers = <%
//&&&staticSymbol&&&=genPackage.getUncapPackageName()
//&&&staticSymbol&&&%>.getEClassifiers().iterator(); classifiers.hasNext(); )
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&  <%
if (!genModel.useGenerics()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				EClassifier eClassifier = (EClassifier)classifiers.next();
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				if (eClassifier instanceof EClass)
//&&&staticSymbol&&&				{
//&&&staticSymbol&&&					EClass eClass = (EClass)eClassifier;
//&&&staticSymbol&&&					if (!eClass.isAbstract())
//&&&staticSymbol&&&					{
//&&&staticSymbol&&&						initialObjectNames.add(eClass.getName());
//&&&staticSymbol&&&					}
//&&&staticSymbol&&&				}
//&&&staticSymbol&&&			}
//&&&staticSymbol&&&<%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
if (genModel.useGenerics()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			for (<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature")
//&&&staticSymbol&&&%> eStructuralFeature : <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.util.ExtendedMetaData")
//&&&staticSymbol&&&%>.INSTANCE.getAllElements(<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.util.ExtendedMetaData")
//&&&staticSymbol&&&%>.INSTANCE.getDocumentRoot(<%
//&&&staticSymbol&&&=genPackage.getUncapPackageName()
//&&&staticSymbol&&&%>)))
//&&&staticSymbol&&&  <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			for (Iterator elements = <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.util.ExtendedMetaData")
//&&&staticSymbol&&&%>.INSTANCE.getAllElements(<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.util.ExtendedMetaData")
//&&&staticSymbol&&&%>.INSTANCE.getDocumentRoot(<%
//&&&staticSymbol&&&=genPackage.getUncapPackageName()
//&&&staticSymbol&&&%>)).iterator(); elements.hasNext(); )
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&  <%
if (!genModel.useGenerics()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature")
//&&&staticSymbol&&&%> eStructuralFeature = (<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature")
//&&&staticSymbol&&&%>)elements.next();
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				if (eStructuralFeature.isChangeable())
//&&&staticSymbol&&&				{
//&&&staticSymbol&&&					EClassifier eClassifier = eStructuralFeature.getEType();
//&&&staticSymbol&&&					if (eClassifier instanceof EClass)
//&&&staticSymbol&&&					{
//&&&staticSymbol&&&						EClass eClass = (EClass)eClassifier;
//&&&staticSymbol&&&						if (!eClass.isAbstract())
//&&&staticSymbol&&&						{
//&&&staticSymbol&&&							initialObjectNames.add(eStructuralFeature.getName());
//&&&staticSymbol&&&						}
//&&&staticSymbol&&&					}
//&&&staticSymbol&&&				}
//&&&staticSymbol&&&			}
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			Collections.sort(initialObjectNames, <%
if (!genModel.isRichClientPlatform() && genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) {
//&&&staticSymbol&&&%>CommonPlugin.INSTANCE.getComparator()<%
} else {
//&&&staticSymbol&&&%>java.text.Collator.getInstance()<%
}
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&		return initialObjectNames;
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * Create a new model.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	protected EObject createInitialModel()
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&<%
if (!genPackage.hasDocumentRoot()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		EClass eClass = (EClass)<%
//&&&staticSymbol&&&=genPackage.getUncapPackageName()
//&&&staticSymbol&&&%>.getEClassifier(initialObjectCreationPage.getInitialObjectName());
//&&&staticSymbol&&&		EObject rootObject = <%
//&&&staticSymbol&&&=genPackage.getUncapFactoryName()
//&&&staticSymbol&&&%>.create(eClass);
//&&&staticSymbol&&&<%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		EClass eClass = <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.util.ExtendedMetaData")
//&&&staticSymbol&&&%>.INSTANCE.getDocumentRoot(<%
//&&&staticSymbol&&&=genPackage.getUncapPackageName()
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&		EStructuralFeature eStructuralFeature = eClass.getEStructuralFeature(initialObjectCreationPage.getInitialObjectName());
//&&&staticSymbol&&&		EObject rootObject = <%
//&&&staticSymbol&&&=genPackage.getUncapFactoryName()
//&&&staticSymbol&&&%>.create(eClass);
//&&&staticSymbol&&&		rootObject.eSet(eStructuralFeature, <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.util.EcoreUtil")
//&&&staticSymbol&&&%>.create((EClass)eStructuralFeature.getEType()));
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		return rootObject;
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * Do the work after everything is specified.
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
//&&&staticSymbol&&&	public boolean performFinish()
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		try
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&<%
if (genModel.isRichClientPlatform()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			// Get the URI of the model file.
//&&&staticSymbol&&&			//
//&&&staticSymbol&&&			final URI fileURI = getModelURI();
//&&&staticSymbol&&&			if (new <%
//&&&staticSymbol&&&=genModel.getImportedName("java.io.File")
//&&&staticSymbol&&&%>(fileURI.toFileString()).exists())
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&				if (!MessageDialog.openQuestion
//&&&staticSymbol&&&						(getShell(),
//&&&staticSymbol&&&						 <%
//&&&staticSymbol&&&=genPackage.getImportedEditorPluginClassName()
//&&&staticSymbol&&&%>.INSTANCE.getString("_UI_Question_title"),<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&						 <%
//&&&staticSymbol&&&=genPackage.getImportedEditorPluginClassName()
//&&&staticSymbol&&&%>.INSTANCE.getString("_WARN_FileConflict", new String []{ fileURI.toFileString() })))<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				{
//&&&staticSymbol&&&					initialObjectCreationPage.selectFileField();
//&&&staticSymbol&&&					return false;
//&&&staticSymbol&&&				}
//&&&staticSymbol&&&			}
//&&&staticSymbol&&&			
//&&&staticSymbol&&&			// Do the work within an operation.
//&&&staticSymbol&&&			//
//&&&staticSymbol&&&			<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.jface.operation.IRunnableWithProgress")
//&&&staticSymbol&&&%> operation = new <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.jface.operation.IRunnableWithProgress")
//&&&staticSymbol&&&%>()
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&				public void run(IProgressMonitor progressMonitor)
//&&&staticSymbol&&&<%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			// Remember the file.
//&&&staticSymbol&&&			//
//&&&staticSymbol&&&			final IFile modelFile = getModelFile();
//&&&staticSymbol&&&
//&&&staticSymbol&&&			// Do the work within an operation.
//&&&staticSymbol&&&			//
//&&&staticSymbol&&&			WorkspaceModifyOperation operation =
//&&&staticSymbol&&&				new WorkspaceModifyOperation()
//&&&staticSymbol&&&				{
//&&&staticSymbol&&&<%
if (genModel.useClassOverrideAnnotation()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&					@Override
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&					protected void execute(IProgressMonitor progressMonitor)
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&					{
//&&&staticSymbol&&&						try
//&&&staticSymbol&&&						{
//&&&staticSymbol&&&							// Create a resource set
//&&&staticSymbol&&&							//
//&&&staticSymbol&&&							ResourceSet resourceSet = new ResourceSetImpl();
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
if (!genModel.isRichClientPlatform()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&							// Get the URI of the model file.
//&&&staticSymbol&&&							//
//&&&staticSymbol&&&							URI fileURI = URI.createPlatformResourceURI(modelFile.getFullPath().toString(), true);
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&							// Create a resource for this file.
//&&&staticSymbol&&&							//
//&&&staticSymbol&&&							Resource resource = resourceSet.createResource(fileURI<%
if (genPackage.isContentType()) {
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=genPackage.getImportedPackageInterfaceName()
//&&&staticSymbol&&&%>.eCONTENT_TYPE<%
}
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&
//&&&staticSymbol&&&							// Add the initial model object to the contents.
//&&&staticSymbol&&&							//
//&&&staticSymbol&&&							EObject rootObject = createInitialModel();
//&&&staticSymbol&&&							if (rootObject != null)
//&&&staticSymbol&&&							{
//&&&staticSymbol&&&								resource.getContents().add(rootObject);
//&&&staticSymbol&&&							}
//&&&staticSymbol&&&
//&&&staticSymbol&&&							// Save the contents of the resource to the file system.
//&&&staticSymbol&&&							//
//&&&staticSymbol&&&							<%
//&&&staticSymbol&&&=_MapOfObjectToObject
//&&&staticSymbol&&&%> options = new <%
//&&&staticSymbol&&&=_HashMapOfObjectToObject
//&&&staticSymbol&&&%>();
//&&&staticSymbol&&&							options.put(XMLResource.OPTION_ENCODING, initialObjectCreationPage.getEncoding());
//&&&staticSymbol&&&							resource.save(options);
//&&&staticSymbol&&&						}
//&&&staticSymbol&&&						catch (Exception exception)
//&&&staticSymbol&&&						{
//&&&staticSymbol&&&							<%
//&&&staticSymbol&&&=genPackage.getImportedEditorPluginClassName()
//&&&staticSymbol&&&%>.INSTANCE.log(exception);
//&&&staticSymbol&&&						}
//&&&staticSymbol&&&						finally
//&&&staticSymbol&&&						{
//&&&staticSymbol&&&							progressMonitor.done();
//&&&staticSymbol&&&						}
//&&&staticSymbol&&&					}
//&&&staticSymbol&&&				};
//&&&staticSymbol&&&
//&&&staticSymbol&&&			getContainer().run(false, false, operation);
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
if (genModel.isRichClientPlatform()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			return <%
//&&&staticSymbol&&&=genModel.getImportedName(genModel.getQualifiedEditorAdvisorClassName())
//&&&staticSymbol&&&%>.openEditor(workbench, fileURI);			
//&&&staticSymbol&&&<%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			// Select the new file resource in the current view.
//&&&staticSymbol&&&			//
//&&&staticSymbol&&&			<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.ui.IWorkbenchWindow")
//&&&staticSymbol&&&%> workbenchWindow = workbench.getActiveWorkbenchWindow();
//&&&staticSymbol&&&			<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.ui.IWorkbenchPage")
//&&&staticSymbol&&&%> page = workbenchWindow.getActivePage();
//&&&staticSymbol&&&			final <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.ui.IWorkbenchPart")
//&&&staticSymbol&&&%> activePart = page.getActivePart();
//&&&staticSymbol&&&			if (activePart instanceof ISetSelectionTarget)
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&				final <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.jface.viewers.ISelection")
//&&&staticSymbol&&&%> targetSelection = new <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.jface.viewers.StructuredSelection")
//&&&staticSymbol&&&%>(modelFile);
//&&&staticSymbol&&&				getShell().getDisplay().asyncExec
//&&&staticSymbol&&&					(new Runnable()
//&&&staticSymbol&&&					 {
//&&&staticSymbol&&&						 public void run()
//&&&staticSymbol&&&						 {
//&&&staticSymbol&&&							 ((ISetSelectionTarget)activePart).selectReveal(targetSelection);
//&&&staticSymbol&&&						 }
//&&&staticSymbol&&&					 });
//&&&staticSymbol&&&			}
//&&&staticSymbol&&&
//&&&staticSymbol&&&			// Open an editor on the new file.
//&&&staticSymbol&&&			//
//&&&staticSymbol&&&			try
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&				page.openEditor
//&&&staticSymbol&&&					(new FileEditorInput(modelFile),
//&&&staticSymbol&&&					 workbench.getEditorRegistry().getDefaultEditor<%
if (!genPackage.isContentType()) {
//&&&staticSymbol&&&%>(modelFile.getFullPath().toString()).getId());<%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&					 	(modelFile.getFullPath().toString(),
//&&&staticSymbol&&&					 	 <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.core.runtime.Platform")
//&&&staticSymbol&&&%>.getContentTypeManager().getContentType(<%
//&&&staticSymbol&&&=genPackage.getImportedPackageInterfaceName()
//&&&staticSymbol&&&%>.eCONTENT_TYPE)).getId());
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>					 	 
//&&&staticSymbol&&&			}
//&&&staticSymbol&&&			catch (<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.ui.PartInitException")
//&&&staticSymbol&&&%> exception)
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&				MessageDialog.openError(workbenchWindow.getShell(), <%
//&&&staticSymbol&&&=genPackage.getImportedEditorPluginClassName()
//&&&staticSymbol&&&%>.INSTANCE.getString("_UI_OpenEditorError_label"), exception.getMessage());<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				return false;
//&&&staticSymbol&&&			}
//&&&staticSymbol&&&
//&&&staticSymbol&&&			return true;
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&		catch (Exception exception)
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			<%
//&&&staticSymbol&&&=genPackage.getImportedEditorPluginClassName()
//&&&staticSymbol&&&%>.INSTANCE.log(exception);
//&&&staticSymbol&&&			return false;
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
if (!genModel.isRichClientPlatform()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * This is the one page of the wizard.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	public class <%
//&&&staticSymbol&&&=genPackage.getModelWizardClassName()
//&&&staticSymbol&&&%>NewFileCreationPage extends WizardNewFileCreationPage
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		/**
//&&&staticSymbol&&&		 * Pass in the selection.
//&&&staticSymbol&&&		 * <!-- begin-user-doc -->
//&&&staticSymbol&&&		 * <!-- end-user-doc -->
//&&&staticSymbol&&&		 * @generated
//&&&staticSymbol&&&		 */
//&&&staticSymbol&&&		public <%
//&&&staticSymbol&&&=genPackage.getModelWizardClassName()
//&&&staticSymbol&&&%>NewFileCreationPage(String pageId, IStructuredSelection selection)
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			super(pageId, selection);
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&
//&&&staticSymbol&&&		/**
//&&&staticSymbol&&&		 * The framework calls this to see if the file is correct.
//&&&staticSymbol&&&		 * <!-- begin-user-doc -->
//&&&staticSymbol&&&		 * <!-- end-user-doc -->
//&&&staticSymbol&&&		 * @generated
//&&&staticSymbol&&&		 */
//&&&staticSymbol&&&<%
if (genModel.useClassOverrideAnnotation()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		@Override
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		protected boolean validatePage()
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			if (super.validatePage())
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&				String extension = new <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.core.runtime.Path")
//&&&staticSymbol&&&%>(getFileName()).getFileExtension();
//&&&staticSymbol&&&				if (extension == null || !FILE_EXTENSIONS.contains(extension))
//&&&staticSymbol&&&				{
//&&&staticSymbol&&&					String key = FILE_EXTENSIONS.size() > 1 ? "_WARN_FilenameExtensions" : "_WARN_FilenameExtension";<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genModel.getNonNLS(2)
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&					setErrorMessage(<%
//&&&staticSymbol&&&=genPackage.getImportedEditorPluginClassName()
//&&&staticSymbol&&&%>.INSTANCE.getString(key, new Object [] { FORMATTED_FILE_EXTENSIONS }));
//&&&staticSymbol&&&					return false;
//&&&staticSymbol&&&				}
//&&&staticSymbol&&&				return true;
//&&&staticSymbol&&&			}
//&&&staticSymbol&&&			return false;
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&
//&&&staticSymbol&&&		/**
//&&&staticSymbol&&&		 * <!-- begin-user-doc -->
//&&&staticSymbol&&&		 * <!-- end-user-doc -->
//&&&staticSymbol&&&		 * @generated
//&&&staticSymbol&&&		 */
//&&&staticSymbol&&&		public IFile getModelFile()
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			return ResourcesPlugin.getWorkspace().getRoot().getFile(getContainerFullPath().append(getFileName()));
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * This is the page where the type of object to create is selected.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	public class <%
//&&&staticSymbol&&&=genPackage.getModelWizardClassName()
//&&&staticSymbol&&&%>InitialObjectCreationPage extends WizardPage
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&<%
if (genModel.isRichClientPlatform()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		/**
//&&&staticSymbol&&&		 * <!-- begin-user-doc -->
//&&&staticSymbol&&&		 * <!-- end-user-doc -->
//&&&staticSymbol&&&		 * @generated
//&&&staticSymbol&&&		 */
//&&&staticSymbol&&&		protected <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.swt.widgets.Text")
//&&&staticSymbol&&&%> fileField;
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		/**
//&&&staticSymbol&&&		 * <!-- begin-user-doc -->
//&&&staticSymbol&&&		 * <!-- end-user-doc -->
//&&&staticSymbol&&&		 * @generated
//&&&staticSymbol&&&		 */
//&&&staticSymbol&&&		protected Combo initialObjectField;
//&&&staticSymbol&&&
//&&&staticSymbol&&&		/**
//&&&staticSymbol&&&		 * @generated
//&&&staticSymbol&&&		 * <!-- begin-user-doc -->
//&&&staticSymbol&&&		 * <!-- end-user-doc -->
//&&&staticSymbol&&&		 */
//&&&staticSymbol&&&		protected <%
//&&&staticSymbol&&&=_ListOfString
//&&&staticSymbol&&&%> encodings;
//&&&staticSymbol&&&
//&&&staticSymbol&&&		/**
//&&&staticSymbol&&&		 * <!-- begin-user-doc -->
//&&&staticSymbol&&&		 * <!-- end-user-doc -->
//&&&staticSymbol&&&		 * @generated
//&&&staticSymbol&&&		 */
//&&&staticSymbol&&&		protected Combo encodingField;
//&&&staticSymbol&&&
//&&&staticSymbol&&&		/**
//&&&staticSymbol&&&		 * Pass in the selection.
//&&&staticSymbol&&&		 * <!-- begin-user-doc -->
//&&&staticSymbol&&&		 * <!-- end-user-doc -->
//&&&staticSymbol&&&		 * @generated
//&&&staticSymbol&&&		 */
//&&&staticSymbol&&&		public <%
//&&&staticSymbol&&&=genPackage.getModelWizardClassName()
//&&&staticSymbol&&&%>InitialObjectCreationPage(String pageId)
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			super(pageId);
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&
//&&&staticSymbol&&&		/**
//&&&staticSymbol&&&		 * <!-- begin-user-doc -->
//&&&staticSymbol&&&		 * <!-- end-user-doc -->
//&&&staticSymbol&&&		 * @generated
//&&&staticSymbol&&&		 */
//&&&staticSymbol&&&		public void createControl(Composite parent)
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			Composite composite = new Composite(parent, SWT.NONE);
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&				GridLayout layout = new GridLayout();
//&&&staticSymbol&&&				layout.numColumns = 1;
//&&&staticSymbol&&&				layout.verticalSpacing = 12;
//&&&staticSymbol&&&				composite.setLayout(layout);
//&&&staticSymbol&&&
//&&&staticSymbol&&&				GridData data = new GridData();
//&&&staticSymbol&&&				data.verticalAlignment = GridData.FILL;
//&&&staticSymbol&&&				data.grabExcessVerticalSpace = true;
//&&&staticSymbol&&&				data.horizontalAlignment = GridData.FILL;
//&&&staticSymbol&&&				composite.setLayoutData(data);
//&&&staticSymbol&&&			}
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
if (genModel.isRichClientPlatform()) {
//&&&staticSymbol&&&%>			
//&&&staticSymbol&&&			Label resourceURILabel = new Label(composite, SWT.LEFT);
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&				resourceURILabel.setText(<%
//&&&staticSymbol&&&=genPackage.getImportedEditorPluginClassName()
//&&&staticSymbol&&&%>.INSTANCE.getString("_UI_File_label"));<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&				GridData data = new GridData();
//&&&staticSymbol&&&				data.horizontalAlignment = GridData.FILL;
//&&&staticSymbol&&&				resourceURILabel.setLayoutData(data);
//&&&staticSymbol&&&			}
//&&&staticSymbol&&&
//&&&staticSymbol&&&			Composite fileComposite = new Composite(composite, SWT.NONE);
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&				GridData data = new GridData();
//&&&staticSymbol&&&				data.horizontalAlignment = GridData.END;
//&&&staticSymbol&&&				fileComposite.setLayoutData(data);
//&&&staticSymbol&&&
//&&&staticSymbol&&&				GridLayout layout = new GridLayout();
//&&&staticSymbol&&&				data.horizontalAlignment = GridData.FILL;
//&&&staticSymbol&&&				layout.marginHeight = 0;
//&&&staticSymbol&&&				layout.marginWidth = 0;
//&&&staticSymbol&&&				layout.numColumns = 2;
//&&&staticSymbol&&&				fileComposite.setLayout(layout);
//&&&staticSymbol&&&			}
//&&&staticSymbol&&&
//&&&staticSymbol&&&			fileField = new <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.swt.widgets.Text")
//&&&staticSymbol&&&%>(fileComposite, SWT.BORDER);
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&				GridData data = new GridData();
//&&&staticSymbol&&&				data.horizontalAlignment = GridData.FILL;
//&&&staticSymbol&&&				data.grabExcessHorizontalSpace = true;
//&&&staticSymbol&&&				data.horizontalSpan = 1;
//&&&staticSymbol&&&				fileField.setLayoutData(data);
//&&&staticSymbol&&&			}
//&&&staticSymbol&&&
//&&&staticSymbol&&&			fileField.addModifyListener(validator);
//&&&staticSymbol&&&
//&&&staticSymbol&&&  <%
if (!genModel.isRichAjaxPlatform()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.swt.widgets.Button")
//&&&staticSymbol&&&%> resourceURIBrowseFileSystemButton = new <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.swt.widgets.Button")
//&&&staticSymbol&&&%>(fileComposite, SWT.PUSH);
//&&&staticSymbol&&&			resourceURIBrowseFileSystemButton.setText(<%
//&&&staticSymbol&&&=genPackage.getImportedEditorPluginClassName()
//&&&staticSymbol&&&%>.INSTANCE.getString("_UI_Browse_label"));<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&			resourceURIBrowseFileSystemButton.addSelectionListener
//&&&staticSymbol&&&				(new <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.swt.events.SelectionAdapter")
//&&&staticSymbol&&&%>()
//&&&staticSymbol&&&				 {
//&&&staticSymbol&&&    <%
if (genModel.useClassOverrideAnnotation()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&					 @Override
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&					 public void widgetSelected(<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.swt.events.SelectionEvent")
//&&&staticSymbol&&&%> event)
//&&&staticSymbol&&&					 {
//&&&staticSymbol&&&						 String[] filters = <%
if (!genModel.useGenerics()) {
//&&&staticSymbol&&&%>(String[])<%
}
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genPackage.getImportedEditorClassName()
//&&&staticSymbol&&&%>.FILE_EXTENSION_FILTERS.toArray(new String[<%
//&&&staticSymbol&&&=genPackage.getImportedEditorClassName()
//&&&staticSymbol&&&%>.FILE_EXTENSION_FILTERS.size()]);
//&&&staticSymbol&&&						 String[] files = <%
//&&&staticSymbol&&&=genModel.getImportedName(genModel.getQualifiedEditorAdvisorClassName())
//&&&staticSymbol&&&%>.openFilePathDialog(getShell(), <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.swt.SWT")
//&&&staticSymbol&&&%>.SAVE, filters);
//&&&staticSymbol&&&						 if (files.length > 0)
//&&&staticSymbol&&&						 {
//&&&staticSymbol&&&							 fileField.setText(files[0]);
//&&&staticSymbol&&&						 }
//&&&staticSymbol&&&					 }
//&&&staticSymbol&&&				 });
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			Label containerLabel = new Label(composite, SWT.LEFT);
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&				containerLabel.setText(<%
//&&&staticSymbol&&&=genPackage.getImportedEditorPluginClassName()
//&&&staticSymbol&&&%>.INSTANCE.getString("_UI_ModelObject"));<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&				GridData data = new GridData();
//&&&staticSymbol&&&				data.horizontalAlignment = GridData.FILL;
//&&&staticSymbol&&&				containerLabel.setLayoutData(data);
//&&&staticSymbol&&&			}
//&&&staticSymbol&&&
//&&&staticSymbol&&&			initialObjectField = new Combo(composite, SWT.BORDER);
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&				GridData data = new GridData();
//&&&staticSymbol&&&				data.horizontalAlignment = GridData.FILL;
//&&&staticSymbol&&&				data.grabExcessHorizontalSpace = true;
//&&&staticSymbol&&&				initialObjectField.setLayoutData(data);
//&&&staticSymbol&&&			}
//&&&staticSymbol&&&
//&&&staticSymbol&&&  <%
if (genModel.useGenerics()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			for (String objectName : getInitialObjectNames())
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&				initialObjectField.add(getLabel(objectName));
//&&&staticSymbol&&&			}
//&&&staticSymbol&&&  <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			for (Iterator i = getInitialObjectNames().iterator(); i.hasNext(); )
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&				initialObjectField.add(getLabel((String)i.next()));
//&&&staticSymbol&&&			}
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&			if (initialObjectField.getItemCount() == 1)
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&				initialObjectField.select(0);
//&&&staticSymbol&&&			}
//&&&staticSymbol&&&			initialObjectField.addModifyListener(validator);
//&&&staticSymbol&&&
//&&&staticSymbol&&&			Label encodingLabel = new Label(composite, SWT.LEFT);
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&				encodingLabel.setText(<%
//&&&staticSymbol&&&=genPackage.getImportedEditorPluginClassName()
//&&&staticSymbol&&&%>.INSTANCE.getString("_UI_XMLEncoding"));<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&				GridData data = new GridData();
//&&&staticSymbol&&&				data.horizontalAlignment = GridData.FILL;
//&&&staticSymbol&&&				encodingLabel.setLayoutData(data);
//&&&staticSymbol&&&			}
//&&&staticSymbol&&&			encodingField = new Combo(composite, SWT.BORDER);
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&				GridData data = new GridData();
//&&&staticSymbol&&&				data.horizontalAlignment = GridData.FILL;
//&&&staticSymbol&&&				data.grabExcessHorizontalSpace = true;
//&&&staticSymbol&&&				encodingField.setLayoutData(data);
//&&&staticSymbol&&&			}
//&&&staticSymbol&&&
//&&&staticSymbol&&&  <%
if (genModel.useGenerics()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			for (String encoding : getEncodings())
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&				encodingField.add(encoding);
//&&&staticSymbol&&&			}
//&&&staticSymbol&&&  <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			for (Iterator i = getEncodings().iterator(); i.hasNext(); )
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&				encodingField.add((String)i.next());
//&&&staticSymbol&&&			}
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&			encodingField.select(0);
//&&&staticSymbol&&&			encodingField.addModifyListener(validator);
//&&&staticSymbol&&&
//&&&staticSymbol&&&			setPageComplete(validatePage());
//&&&staticSymbol&&&			setControl(composite);
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&
//&&&staticSymbol&&&		/**
//&&&staticSymbol&&&		 * <!-- begin-user-doc -->
//&&&staticSymbol&&&		 * <!-- end-user-doc -->
//&&&staticSymbol&&&		 * @generated
//&&&staticSymbol&&&		 */
//&&&staticSymbol&&&		protected ModifyListener validator =
//&&&staticSymbol&&&			new ModifyListener()
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&				public void modifyText(ModifyEvent e)
//&&&staticSymbol&&&				{
//&&&staticSymbol&&&					setPageComplete(validatePage());
//&&&staticSymbol&&&				}
//&&&staticSymbol&&&			};
//&&&staticSymbol&&&
//&&&staticSymbol&&&		/**
//&&&staticSymbol&&&		 * <!-- begin-user-doc -->
//&&&staticSymbol&&&		 * <!-- end-user-doc -->
//&&&staticSymbol&&&		 * @generated
//&&&staticSymbol&&&		 */
//&&&staticSymbol&&&		protected boolean validatePage()
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&<%
if (genModel.isRichClientPlatform()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			URI fileURI = getFileURI();
//&&&staticSymbol&&&			if (fileURI == null || fileURI.isEmpty())
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&				setErrorMessage(null);
//&&&staticSymbol&&&				return false;
//&&&staticSymbol&&&			}
//&&&staticSymbol&&&
//&&&staticSymbol&&&			String extension = fileURI.fileExtension();
//&&&staticSymbol&&&			if (extension == null || !FILE_EXTENSIONS.contains(extension))
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&				String key = FILE_EXTENSIONS.size() > 1 ? "_WARN_FilenameExtensions" : "_WARN_FilenameExtension";<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genModel.getNonNLS(2)
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				setErrorMessage(<%
//&&&staticSymbol&&&=genPackage.getImportedEditorPluginClassName()
//&&&staticSymbol&&&%>.INSTANCE.getString(key, new Object [] { FORMATTED_FILE_EXTENSIONS }));
//&&&staticSymbol&&&				return false;
//&&&staticSymbol&&&			}
//&&&staticSymbol&&&
//&&&staticSymbol&&&			setErrorMessage(null);
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			return getInitialObjectName() != null && getEncodings().contains(encodingField.getText());
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&
//&&&staticSymbol&&&		/**
//&&&staticSymbol&&&		 * <!-- begin-user-doc -->
//&&&staticSymbol&&&		 * <!-- end-user-doc -->
//&&&staticSymbol&&&		 * @generated
//&&&staticSymbol&&&		 */
//&&&staticSymbol&&&<%
if (genModel.useClassOverrideAnnotation()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		@Override
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		public void setVisible(boolean visible)
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			super.setVisible(visible);
//&&&staticSymbol&&&			if (visible)
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&<%
if (!genModel.isRichClientPlatform()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				if (initialObjectField.getItemCount() == 1)
//&&&staticSymbol&&&				{
//&&&staticSymbol&&&					initialObjectField.clearSelection();
//&&&staticSymbol&&&					encodingField.setFocus();
//&&&staticSymbol&&&				}
//&&&staticSymbol&&&				else
//&&&staticSymbol&&&				{
//&&&staticSymbol&&&					encodingField.clearSelection();
//&&&staticSymbol&&&					initialObjectField.setFocus();
//&&&staticSymbol&&&				}
//&&&staticSymbol&&&<%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				initialObjectField.clearSelection();
//&&&staticSymbol&&&				encodingField.clearSelection();
//&&&staticSymbol&&&				fileField.setFocus();
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			}
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&
//&&&staticSymbol&&&		/**
//&&&staticSymbol&&&		 * <!-- begin-user-doc -->
//&&&staticSymbol&&&		 * <!-- end-user-doc -->
//&&&staticSymbol&&&		 * @generated
//&&&staticSymbol&&&		 */
//&&&staticSymbol&&&		public String getInitialObjectName()
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			String label = initialObjectField.getText();
//&&&staticSymbol&&&
//&&&staticSymbol&&&  <%
if (genModel.useGenerics()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			for (String name : getInitialObjectNames())
//&&&staticSymbol&&&  <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			for (Iterator i = getInitialObjectNames().iterator(); i.hasNext(); )
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&  <%
if (!genModel.useGenerics()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				String name = (String)i.next();
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				if (getLabel(name).equals(label))
//&&&staticSymbol&&&				{
//&&&staticSymbol&&&					return name;
//&&&staticSymbol&&&				}
//&&&staticSymbol&&&			}
//&&&staticSymbol&&&			return null;
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&
//&&&staticSymbol&&&		/**
//&&&staticSymbol&&&		 * <!-- begin-user-doc -->
//&&&staticSymbol&&&		 * <!-- end-user-doc -->
//&&&staticSymbol&&&		 * @generated
//&&&staticSymbol&&&		 */
//&&&staticSymbol&&&		public String getEncoding()
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			return encodingField.getText();
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&<%
if (genModel.isRichClientPlatform()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&		/**
//&&&staticSymbol&&&		 * <!-- begin-user-doc -->
//&&&staticSymbol&&&		 * <!-- end-user-doc -->
//&&&staticSymbol&&&		 * @generated
//&&&staticSymbol&&&		 */
//&&&staticSymbol&&&		public URI getFileURI()
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			try
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&				return URI.createFileURI(fileField.getText());
//&&&staticSymbol&&&			}
//&&&staticSymbol&&&			catch (Exception exception)
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&				// Ignore
//&&&staticSymbol&&&			}
//&&&staticSymbol&&&			return null;
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&
//&&&staticSymbol&&&		/**
//&&&staticSymbol&&&		 * <!-- begin-user-doc -->
//&&&staticSymbol&&&		 * <!-- end-user-doc -->
//&&&staticSymbol&&&		 * @generated
//&&&staticSymbol&&&		 */
//&&&staticSymbol&&&		public void selectFileField()
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&				initialObjectField.clearSelection();
//&&&staticSymbol&&&				encodingField.clearSelection();
//&&&staticSymbol&&&				fileField.selectAll();
//&&&staticSymbol&&&				fileField.setFocus();
//&&&staticSymbol&&&		}		
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
{ String type = genPackage.hasDocumentRoot() ? "feature" : "type"; String prefix = genPackage.hasDocumentRoot() ? "_UI_DocumentRoot_" : "_UI_";
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&		/**
//&&&staticSymbol&&&		 * Returns the label for the specified <%
//&&&staticSymbol&&&=type
//&&&staticSymbol&&&%> name.
//&&&staticSymbol&&&		 * <!-- begin-user-doc -->
//&&&staticSymbol&&&		 * <!-- end-user-doc -->
//&&&staticSymbol&&&		 * @generated
//&&&staticSymbol&&&		 */
//&&&staticSymbol&&&		protected String getLabel(String <%
//&&&staticSymbol&&&=type
//&&&staticSymbol&&&%>Name)
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			try
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&				return <%
//&&&staticSymbol&&&=genPackage.getEditPluginClassName()
//&&&staticSymbol&&&%>.INSTANCE.getString("<%
//&&&staticSymbol&&&=prefix
//&&&staticSymbol&&&%>" + <%
//&&&staticSymbol&&&=type
//&&&staticSymbol&&&%>Name + "_<%
//&&&staticSymbol&&&=type
//&&&staticSymbol&&&%>");<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genModel.getNonNLS(2)
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			}
//&&&staticSymbol&&&			catch(MissingResourceException mre)
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&				<%
//&&&staticSymbol&&&=genModel.getImportedName(genModel.getQualifiedEditorPluginClassName())
//&&&staticSymbol&&&%>.INSTANCE.log(mre);
//&&&staticSymbol&&&			}
//&&&staticSymbol&&&			return <%
//&&&staticSymbol&&&=type
//&&&staticSymbol&&&%>Name;
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&		/**
//&&&staticSymbol&&&		 * <!-- begin-user-doc -->
//&&&staticSymbol&&&		 * <!-- end-user-doc -->
//&&&staticSymbol&&&		 * @generated
//&&&staticSymbol&&&		 */
//&&&staticSymbol&&&		protected <%
//&&&staticSymbol&&&=_CollectionOfString
//&&&staticSymbol&&&%> getEncodings()
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			if (encodings == null)
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&				encodings = new <%
//&&&staticSymbol&&&=_ArrayListOfString
//&&&staticSymbol&&&%>();
//&&&staticSymbol&&&				for (StringTokenizer stringTokenizer = new StringTokenizer(<%
//&&&staticSymbol&&&=genPackage.getImportedEditorPluginClassName()
//&&&staticSymbol&&&%>.INSTANCE.getString("_UI_XMLEncodingChoices")); stringTokenizer.hasMoreTokens(); )<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				{
//&&&staticSymbol&&&					encodings.add(stringTokenizer.nextToken());
//&&&staticSymbol&&&				}
//&&&staticSymbol&&&			}
//&&&staticSymbol&&&			return encodings;
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * The framework calls this to create the contents of the wizard.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&<%
if (genModel.useClassOverrideAnnotation()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		@Override
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	public void addPages()
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&<%
if (!genModel.isRichClientPlatform()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		// Create a page, set the title, and the initial model file name.
//&&&staticSymbol&&&		//
//&&&staticSymbol&&&		newFileCreationPage = new <%
//&&&staticSymbol&&&=genPackage.getModelWizardClassName()
//&&&staticSymbol&&&%>NewFileCreationPage("Whatever", selection);<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		newFileCreationPage.setTitle(<%
//&&&staticSymbol&&&=genPackage.getImportedEditorPluginClassName()
//&&&staticSymbol&&&%>.INSTANCE.getString("_UI_<%
//&&&staticSymbol&&&=genPackage.getModelWizardClassName()
//&&&staticSymbol&&&%>_label"));<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		newFileCreationPage.setDescription(<%
//&&&staticSymbol&&&=genPackage.getImportedEditorPluginClassName()
//&&&staticSymbol&&&%>.INSTANCE.getString("_UI_<%
//&&&staticSymbol&&&=genPackage.getModelWizardClassName()
//&&&staticSymbol&&&%>_description"));<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		newFileCreationPage.setFileName(<%
//&&&staticSymbol&&&=genPackage.getImportedEditorPluginClassName()
//&&&staticSymbol&&&%>.INSTANCE.getString("_UI_<%
//&&&staticSymbol&&&=genPackage.getEditorClassName()
//&&&staticSymbol&&&%>FilenameDefaultBase") + "." + <%
if (!genModel.useGenerics()) {
//&&&staticSymbol&&&%>(String)<%
}
//&&&staticSymbol&&&%>FILE_EXTENSIONS.get(0));<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genModel.getNonNLS(2)
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		addPage(newFileCreationPage);
//&&&staticSymbol&&&
//&&&staticSymbol&&&		// Try and get the resource selection to determine a current directory for the file dialog.
//&&&staticSymbol&&&		//
//&&&staticSymbol&&&		if (selection != null && !selection.isEmpty())
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			// Get the resource...
//&&&staticSymbol&&&			//
//&&&staticSymbol&&&			Object selectedElement = selection.iterator().next();
//&&&staticSymbol&&&			if (selectedElement instanceof IResource)
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&				// Get the resource parent, if its a file.
//&&&staticSymbol&&&				//
//&&&staticSymbol&&&				IResource selectedResource = (IResource)selectedElement;
//&&&staticSymbol&&&				if (selectedResource.getType() == IResource.FILE)
//&&&staticSymbol&&&				{
//&&&staticSymbol&&&					selectedResource = selectedResource.getParent();
//&&&staticSymbol&&&				}
//&&&staticSymbol&&&
//&&&staticSymbol&&&				// This gives us a directory...
//&&&staticSymbol&&&				//
//&&&staticSymbol&&&				if (selectedResource instanceof IFolder || selectedResource instanceof IProject)
//&&&staticSymbol&&&				{
//&&&staticSymbol&&&					// Set this for the container.
//&&&staticSymbol&&&					//
//&&&staticSymbol&&&					newFileCreationPage.setContainerFullPath(selectedResource.getFullPath());
//&&&staticSymbol&&&
//&&&staticSymbol&&&					// Make up a unique new name here.
//&&&staticSymbol&&&					//
//&&&staticSymbol&&&					String defaultModelBaseFilename = <%
//&&&staticSymbol&&&=genPackage.getImportedEditorPluginClassName()
//&&&staticSymbol&&&%>.INSTANCE.getString("_UI_<%
//&&&staticSymbol&&&=genPackage.getEditorClassName()
//&&&staticSymbol&&&%>FilenameDefaultBase");<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&					String defaultModelFilenameExtension = <%
if (!genModel.useGenerics()) {
//&&&staticSymbol&&&%>(String)<%
}
//&&&staticSymbol&&&%>FILE_EXTENSIONS.get(0);
//&&&staticSymbol&&&					String modelFilename = defaultModelBaseFilename + "." + defaultModelFilenameExtension;<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&					for (int i = 1; ((IContainer)selectedResource).findMember(modelFilename) != null; ++i)
//&&&staticSymbol&&&					{
//&&&staticSymbol&&&						modelFilename = defaultModelBaseFilename + i + "." + defaultModelFilenameExtension;<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&					}
//&&&staticSymbol&&&					newFileCreationPage.setFileName(modelFilename);
//&&&staticSymbol&&&				}
//&&&staticSymbol&&&			}
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		initialObjectCreationPage = new <%
//&&&staticSymbol&&&=genPackage.getModelWizardClassName()
//&&&staticSymbol&&&%>InitialObjectCreationPage("Whatever2");<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		initialObjectCreationPage.setTitle(<%
//&&&staticSymbol&&&=genPackage.getImportedEditorPluginClassName()
//&&&staticSymbol&&&%>.INSTANCE.getString("_UI_<%
//&&&staticSymbol&&&=genPackage.getModelWizardClassName()
//&&&staticSymbol&&&%>_label"));<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		initialObjectCreationPage.setDescription(<%
//&&&staticSymbol&&&=genPackage.getImportedEditorPluginClassName()
//&&&staticSymbol&&&%>.INSTANCE.getString("_UI_Wizard_initial_object_description"));<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		addPage(initialObjectCreationPage);
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
if (genModel.isRichClientPlatform()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * Get the URI from the page.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	public URI getModelURI()
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		return initialObjectCreationPage.getFileURI();
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * Get the file from the page.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	public IFile getModelFile()
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		return newFileCreationPage.getModelFile();
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