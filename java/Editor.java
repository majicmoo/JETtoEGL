class Editor {
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
GenPackage genPackage = (GenPackage)argument; GenModel genModel=genPackage.getGenModel(); /* Trick to import java.util.* without warnings */Iterator.class.getName(); 
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
String operationMethodName = genModel.isRichClientPlatform() ? "run" : "execute";
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
String _ArrayListOfObject = "ArrayList" + (genModel.useGenerics() ? "<Object>" : "");
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
String _ArrayListOfSelectionChangedListener = "ArrayList" + (genModel.useGenerics() ? "<ISelectionChangedListener>" : "");
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
String _CollectionOfSelectionChangedListener = "Collection" + (genModel.useGenerics() ? "<ISelectionChangedListener>" : "");
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
String _ArrayListOfResource = "ArrayList" + (genModel.useGenerics() ? "<Resource>" : "");
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
String _CollectionOfResource = "Collection" + (genModel.useGenerics() ? "<Resource>" : "");
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
String _MapOfResourceToDiagnostic = "Map" + (genModel.useGenerics() ? "<Resource, Diagnostic>" : "");
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
String _HashMapOfResourceToBoolean = "HashMap" + (genModel.useGenerics() ? "<Resource, Boolean>" : "");
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
String _MapOfObjectToObject = "Map" + (genModel.useGenerics() ? "<Object, Object>" : "");
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
String _HashMapOfObjectToObject = "HashMap" + (genModel.useGenerics() ? "<Object, Object>" : "");
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
String _LinkedHashMapOfResourceToDiagnostic = "LinkedHashMap" + (genModel.useGenerics() ? "<Resource, Diagnostic>" : "");
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
String _CollectionOfAnything = "Collection" + (genModel.useGenerics() ? "<?>" : "");
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
String _ListOfAnything = "List" + (genModel.useGenerics() ? "<?>" : "");
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
boolean useExtendedLabelProvider = genModel.isStyleProviders() || genModel.isFontProviders() || genModel.isColorProviders();
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
boolean useStyledLabelProvider = genModel.isStyleProviders();
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
String _AdapterFactoryLabelProvider = (useStyledLabelProvider ? "AdapterFactoryLabelProvider.StyledLabelProvider" : "AdapterFactoryLabelProvider" + (genModel.isFontProviders() && genModel.isColorProviders() ? ".FontAndColorProvider" : genModel.isFontProviders() ? ".FontProvider" : genModel.isColorProviders() ? ".ColorProvider" : ""));
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
String _DelegatingAdapterFactoryLabelProvider = useStyledLabelProvider ? genModel.getImportedName("org.eclipse.emf.edit.ui.provider.DelegatingStyledCellLabelProvider") + (genModel.isFontProviders() && genModel.isColorProviders() ? ".FontAndColorProvider" : genModel.isFontProviders() ? ".FontProvider" : genModel.isColorProviders() ? ".ColorProvider" : "") : "";
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
String _DecoratingColumLabelProvider = genModel.getDecoration() != GenDecoration.NONE ? genModel.getImportedName("org.eclipse.emf.edit.ui.provider.DecoratingColumLabelProvider") + (useStyledLabelProvider ? ".StyledLabelProvider" : "") : "";
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
String _DiagnosticDecorator = genModel.getDecoration() != GenDecoration.NONE ? genModel.getImportedName("org.eclipse.emf.edit.ui.provider.DiagnosticDecorator") + (useStyledLabelProvider ? ".Styled" : "") : "";
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
String _ArrayListOfString = "ArrayList" + (genModel.useGenerics() ? "<String>" : "");
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
String _ListOfString = "List" + (genModel.useGenerics() ? "<String>" : "");
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
String _ListOfPropertySheetPage = "List" + (genModel.useGenerics() ? "<PropertySheetPage>" : "");
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
String _ArrayListOfPropertySheetPage = "ArrayList" + (genModel.useGenerics() ? "<PropertySheetPage>" : "");
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%include("../Header.javajetinc");%>
//&&&staticSymbol&&&package <%
//&&&staticSymbol&&&=genPackage.getPresentationPackageName()
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&
//&&&staticSymbol&&&
//&&&staticSymbol&&&import java.io.IOException;
//&&&staticSymbol&&&import java.io.InputStream;
//&&&staticSymbol&&&
//&&&staticSymbol&&&import java.util.ArrayList;
//&&&staticSymbol&&&import java.util.Collection;
//&&&staticSymbol&&&import java.util.Collections;
//&&&staticSymbol&&&import java.util.EventObject;
//&&&staticSymbol&&&import java.util.HashMap;
//&&&staticSymbol&&&import java.util.Iterator;
//&&&staticSymbol&&&import java.util.LinkedHashMap;
//&&&staticSymbol&&&import java.util.List;
//&&&staticSymbol&&&import java.util.Map;
//&&&staticSymbol&&&<%
if (!genModel.isRichClientPlatform()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&import org.eclipse.core.resources.IFile;
//&&&staticSymbol&&&import org.eclipse.core.resources.IMarker;
//&&&staticSymbol&&&import org.eclipse.core.resources.IResource;
//&&&staticSymbol&&&import org.eclipse.core.resources.IResourceChangeEvent;
//&&&staticSymbol&&&import org.eclipse.core.resources.IResourceChangeListener;
//&&&staticSymbol&&&import org.eclipse.core.resources.IResourceDelta;
//&&&staticSymbol&&&import org.eclipse.core.resources.IResourceDeltaVisitor;
//&&&staticSymbol&&&import org.eclipse.core.resources.ResourcesPlugin;
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
if (!genModel.isRichClientPlatform()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&import org.eclipse.core.runtime.CoreException;
//&&&staticSymbol&&&import org.eclipse.core.runtime.IPath;
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&import org.eclipse.core.runtime.IProgressMonitor;
//&&&staticSymbol&&&import org.eclipse.core.runtime.NullProgressMonitor;
//&&&staticSymbol&&&
//&&&staticSymbol&&&import org.eclipse.jface.action.IMenuListener;
//&&&staticSymbol&&&import org.eclipse.jface.action.IMenuManager;
//&&&staticSymbol&&&import org.eclipse.jface.action.IStatusLineManager;
//&&&staticSymbol&&&import org.eclipse.jface.action.IToolBarManager;
//&&&staticSymbol&&&import org.eclipse.jface.action.MenuManager;
//&&&staticSymbol&&&import org.eclipse.jface.action.Separator;
//&&&staticSymbol&&&
//&&&staticSymbol&&&import org.eclipse.jface.dialogs.MessageDialog;
//&&&staticSymbol&&&import org.eclipse.jface.dialogs.ProgressMonitorDialog;
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
if (genModel.getRuntimeVersion().getValue() >= GenRuntimeVersion.EMF29_VALUE) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&import org.eclipse.jface.util.LocalSelectionTransfer;
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
if (genPackage.isMultipleEditorPages()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&import org.eclipse.jface.viewers.ColumnWeightData;
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&import org.eclipse.jface.viewers.ISelection;
//&&&staticSymbol&&&import org.eclipse.jface.viewers.ISelectionChangedListener;
//&&&staticSymbol&&&import org.eclipse.jface.viewers.ISelectionProvider;
//&&&staticSymbol&&&import org.eclipse.jface.viewers.IStructuredSelection;
//&&&staticSymbol&&&<%
if (genPackage.isMultipleEditorPages()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&import org.eclipse.jface.viewers.ListViewer;
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&import org.eclipse.jface.viewers.SelectionChangedEvent;
//&&&staticSymbol&&&import org.eclipse.jface.viewers.StructuredSelection;
//&&&staticSymbol&&&import org.eclipse.jface.viewers.StructuredViewer;
//&&&staticSymbol&&&<%
if (genPackage.isMultipleEditorPages()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&import org.eclipse.jface.viewers.TableLayout;
//&&&staticSymbol&&&import org.eclipse.jface.viewers.TableViewer;
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&import org.eclipse.jface.viewers.TreeViewer;
//&&&staticSymbol&&&import org.eclipse.jface.viewers.Viewer;
//&&&staticSymbol&&&
//&&&staticSymbol&&&import org.eclipse.swt.SWT;
//&&&staticSymbol&&&
//&&&staticSymbol&&&import org.eclipse.swt.custom.CTabFolder;
//&&&staticSymbol&&&
//&&&staticSymbol&&&import org.eclipse.swt.dnd.DND;
//&&&staticSymbol&&&<%
if (genModel.getRuntimeVersion().getValue() >= GenRuntimeVersion.EMF29_VALUE) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&import org.eclipse.swt.dnd.FileTransfer;
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&import org.eclipse.swt.dnd.Transfer;
//&&&staticSymbol&&&
//&&&staticSymbol&&&import org.eclipse.swt.events.ControlAdapter;
//&&&staticSymbol&&&import org.eclipse.swt.events.ControlEvent;
//&&&staticSymbol&&&
//&&&staticSymbol&&&import org.eclipse.swt.graphics.Point;
//&&&staticSymbol&&&<%
if (genPackage.isMultipleEditorPages()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&import org.eclipse.swt.layout.FillLayout;
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&import org.eclipse.swt.widgets.Composite;
//&&&staticSymbol&&&import org.eclipse.swt.widgets.Menu;
//&&&staticSymbol&&&<%
if (genPackage.isMultipleEditorPages()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&import org.eclipse.swt.widgets.Table;
//&&&staticSymbol&&&import org.eclipse.swt.widgets.TableColumn;
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&import org.eclipse.swt.widgets.Tree;
//&&&staticSymbol&&&<%
if (genPackage.isMultipleEditorPages()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&import org.eclipse.swt.widgets.TreeColumn;
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&import org.eclipse.ui.IActionBars;
//&&&staticSymbol&&&import org.eclipse.ui.IEditorInput;
//&&&staticSymbol&&&import org.eclipse.ui.IEditorPart;
//&&&staticSymbol&&&import org.eclipse.ui.IEditorSite;
//&&&staticSymbol&&&<%
if (!genModel.isRichClientPlatform() && genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&import org.eclipse.ui.IFileEditorInput;
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&import org.eclipse.ui.IPartListener;
//&&&staticSymbol&&&import org.eclipse.ui.IWorkbenchPart;
//&&&staticSymbol&&&import org.eclipse.ui.PartInitException;
//&&&staticSymbol&&&<%
if (!genModel.isRichClientPlatform()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&import org.eclipse.ui.dialogs.SaveAsDialog;
//&&&staticSymbol&&&
//&&&staticSymbol&&&import org.eclipse.ui.ide.IGotoMarker;
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
if (!genModel.isRichClientPlatform()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&import org.eclipse.ui.part.FileEditorInput;
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&import org.eclipse.ui.part.MultiPageEditorPart;
//&&&staticSymbol&&&
//&&&staticSymbol&&&import org.eclipse.ui.views.contentoutline.ContentOutline;
//&&&staticSymbol&&&import org.eclipse.ui.views.contentoutline.ContentOutlinePage;
//&&&staticSymbol&&&import org.eclipse.ui.views.contentoutline.IContentOutlinePage;
//&&&staticSymbol&&&
//&&&staticSymbol&&&import org.eclipse.ui.views.properties.IPropertySheetPage;
//&&&staticSymbol&&&import org.eclipse.ui.views.properties.PropertySheet;
//&&&staticSymbol&&&import org.eclipse.ui.views.properties.PropertySheetPage;
//&&&staticSymbol&&&
//&&&staticSymbol&&&import org.eclipse.emf.common.command.BasicCommandStack;
//&&&staticSymbol&&&import org.eclipse.emf.common.command.Command;
//&&&staticSymbol&&&import org.eclipse.emf.common.command.CommandStack;
//&&&staticSymbol&&&import org.eclipse.emf.common.command.CommandStackListener;
//&&&staticSymbol&&&
//&&&staticSymbol&&&import org.eclipse.emf.common.notify.AdapterFactory;
//&&&staticSymbol&&&import org.eclipse.emf.common.notify.Notification;
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
if (!genModel.isRichClientPlatform()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&import org.eclipse.emf.common.ui.MarkerHelper;
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
if (genPackage.isMultipleEditorPages()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&import org.eclipse.emf.common.ui.ViewerPane;
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&import org.eclipse.emf.common.ui.editor.ProblemEditorPart;
//&&&staticSymbol&&&
//&&&staticSymbol&&&import org.eclipse.emf.common.ui.viewer.IViewerProvider;
//&&&staticSymbol&&&
//&&&staticSymbol&&&import org.eclipse.emf.common.util.BasicDiagnostic;
//&&&staticSymbol&&&import org.eclipse.emf.common.util.Diagnostic;
//&&&staticSymbol&&&import org.eclipse.emf.common.util.URI;
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
if (!genModel.isRichClientPlatform() && genModel.getRuntimeVersion().getValue() < GenRuntimeVersion.EMF23_VALUE) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&import org.eclipse.emf.ecore.EObject;
//&&&staticSymbol&&&import org.eclipse.emf.ecore.EValidator;
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&import org.eclipse.emf.ecore.resource.Resource;
//&&&staticSymbol&&&<%
if (!genModel.isRichClientPlatform()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&import org.eclipse.emf.ecore.resource.ResourceSet;
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&import org.eclipse.emf.ecore.util.EContentAdapter;
//&&&staticSymbol&&&import org.eclipse.emf.ecore.util.EcoreUtil;
//&&&staticSymbol&&&
//&&&staticSymbol&&&import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
//&&&staticSymbol&&&import org.eclipse.emf.edit.domain.EditingDomain;
//&&&staticSymbol&&&import org.eclipse.emf.edit.domain.IEditingDomainProvider;
//&&&staticSymbol&&&
//&&&staticSymbol&&&import org.eclipse.emf.edit.provider.AdapterFactoryItemDelegator;
//&&&staticSymbol&&&import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
//&&&staticSymbol&&&import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
//&&&staticSymbol&&&
//&&&staticSymbol&&&import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
//&&&staticSymbol&&&
//&&&staticSymbol&&&import org.eclipse.emf.edit.ui.action.EditingDomainActionBarContributor;
//&&&staticSymbol&&&
//&&&staticSymbol&&&import org.eclipse.emf.edit.ui.celleditor.AdapterFactoryTreeEditor;
//&&&staticSymbol&&&
//&&&staticSymbol&&&import org.eclipse.emf.edit.ui.dnd.EditingDomainViewerDropAdapter;
//&&&staticSymbol&&&import org.eclipse.emf.edit.ui.dnd.LocalTransfer;
//&&&staticSymbol&&&import org.eclipse.emf.edit.ui.dnd.ViewerDragAdapter;
//&&&staticSymbol&&&
//&&&staticSymbol&&&import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
//&&&staticSymbol&&&import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
//&&&staticSymbol&&&<%
if (genModel.getRuntimeVersion().getValue() >= GenRuntimeVersion.EMF23_VALUE) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&import org.eclipse.emf.edit.ui.provider.UnwrappingSelectionProvider;
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
if (!genModel.isRichClientPlatform()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&import org.eclipse.emf.edit.ui.util.EditUIMarkerHelper;
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&import org.eclipse.emf.edit.ui.util.EditUIUtil;
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&import org.eclipse.emf.edit.ui.view.ExtendedPropertySheetPage;
//&&&staticSymbol&&&
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
genModel.markImportLocation(stringBuffer);
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&
//&&&staticSymbol&&&/**
//&&&staticSymbol&&& * This is an example of a <%
//&&&staticSymbol&&&=genPackage.getPrefix()
//&&&staticSymbol&&&%> model editor.
//&&&staticSymbol&&& * <!-- begin-user-doc -->
//&&&staticSymbol&&& * <!-- end-user-doc -->
//&&&staticSymbol&&& * @generated
//&&&staticSymbol&&& */
//&&&staticSymbol&&&public class <%
//&&&staticSymbol&&&=genPackage.getEditorClassName()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	extends MultiPageEditorPart
//&&&staticSymbol&&&	implements IEditingDomainProvider, ISelectionProvider, IMenuListener, IViewerProvider<%
if (!genModel.isRichClientPlatform()) {
//&&&staticSymbol&&&%>, IGotoMarker<%
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
//&&&staticSymbol&&&<%
if (genModel.isRichClientPlatform()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * The filters for file extensions supported by the editor.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */<%
if (genPackage.isGenerateModelWizard()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	public static final <%
//&&&staticSymbol&&&=_ListOfString
//&&&staticSymbol&&&%> FILE_EXTENSION_FILTERS = prefixExtensions(<%
//&&&staticSymbol&&&=genPackage.getImportedModelWizardClassName()
//&&&staticSymbol&&&%>.FILE_EXTENSIONS, "*.");<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	<%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	public static final <%
//&&&staticSymbol&&&=_ListOfString
//&&&staticSymbol&&&%> FILE_EXTENSION_FILTERS = prefixExtensions(<%
//&&&staticSymbol&&&=genModel.getImportedName("java.util.Arrays")
//&&&staticSymbol&&&%>.asList(<%
//&&&staticSymbol&&&=genPackage.getImportedEditorPluginClassName()
//&&&staticSymbol&&&%>.INSTANCE.getString("_UI_<%
//&&&staticSymbol&&&=genPackage.getEditorClassName()
//&&&staticSymbol&&&%>FilenameExtensions").split("\\s*,\\s*")), "*.");<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genModel.getNonNLS(2)
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genModel.getNonNLS(3)
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * Returns a new unmodifiable list containing prefixed versions of the extensions in the given list.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	private static <%
//&&&staticSymbol&&&=_ListOfString
//&&&staticSymbol&&&%> prefixExtensions(<%
//&&&staticSymbol&&&=_ListOfString
//&&&staticSymbol&&&%> extensions, String prefix)
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=_ListOfString
//&&&staticSymbol&&&%> result = new <%
//&&&staticSymbol&&&=_ArrayListOfString
//&&&staticSymbol&&&%>();
//&&&staticSymbol&&&  <%
if (genModel.useGenerics()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		for (String extension : extensions)
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			result.add(prefix + extension);
//&&&staticSymbol&&&  <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		for (Iterator iterator = extensions.iterator() ; iterator.hasNext(); )
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			result.add(prefix + (String)iterator.next());
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&		return Collections.unmodifiableList(result);
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * This keeps track of the editing domain that is used to track all changes to the model.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	protected AdapterFactoryEditingDomain editingDomain;
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * This is the one adapter factory used for providing views of the model.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	protected ComposedAdapterFactory adapterFactory;
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * This is the content outline page.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	protected IContentOutlinePage contentOutlinePage;
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * This is a kludge...
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	protected IStatusLineManager contentOutlineStatusLineManager;
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * This is the content outline page's viewer.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	protected TreeViewer contentOutlineViewer;
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * This is the property sheet page.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	protected <%
//&&&staticSymbol&&&=_ListOfPropertySheetPage
//&&&staticSymbol&&&%> propertySheetPages = new <%
//&&&staticSymbol&&&=_ArrayListOfPropertySheetPage
//&&&staticSymbol&&&%>();
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * This is the viewer that shadows the selection in the content outline.
//&&&staticSymbol&&&	 * The parent relation must be correctly defined for this to work.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	protected TreeViewer selectionViewer;
//&&&staticSymbol&&&<%
if (genPackage.isMultipleEditorPages()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * This inverts the roll of parent and child in the content provider and show parents as a tree.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	protected TreeViewer parentViewer;
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * This shows how a tree view works.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	protected TreeViewer treeViewer;
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * This shows how a list view works.
//&&&staticSymbol&&&	 * A list viewer doesn't support icons.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	protected ListViewer listViewer;
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * This shows how a table view works.
//&&&staticSymbol&&&	 * A table can be used as a list with icons.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	protected TableViewer tableViewer;
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * This shows how a tree view with columns works.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	protected TreeViewer treeViewerWithColumns;
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * This keeps track of the active viewer pane, in the book.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	protected ViewerPane currentViewerPane;
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * This keeps track of the active content viewer, which may be either one of the viewers in the pages or the content outline viewer.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	protected Viewer currentViewer;
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * This listens to which ever viewer is active.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	protected ISelectionChangedListener selectionChangedListener;
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * This keeps track of all the {@link org.eclipse.jface.viewers.ISelectionChangedListener}s that are listening to this editor.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	protected <%
//&&&staticSymbol&&&=_CollectionOfSelectionChangedListener
//&&&staticSymbol&&&%> selectionChangedListeners = new <%
//&&&staticSymbol&&&=_ArrayListOfSelectionChangedListener
//&&&staticSymbol&&&%>();
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * This keeps track of the selection of the editor as a whole.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	protected ISelection editorSelection = StructuredSelection.EMPTY;
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
if (!genModel.isRichClientPlatform()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * The MarkerHelper is responsible for creating workspace resource markers presented
//&&&staticSymbol&&&	 * in Eclipse's Problems View.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	protected MarkerHelper markerHelper = new EditUIMarkerHelper();
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * This listens for when the outline becomes active
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	protected IPartListener partListener =
//&&&staticSymbol&&&		new IPartListener()
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			public void partActivated(IWorkbenchPart p)
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&				if (p instanceof ContentOutline)
//&&&staticSymbol&&&				{
//&&&staticSymbol&&&					if (((ContentOutline)p).getCurrentPage() == contentOutlinePage)
//&&&staticSymbol&&&					{
//&&&staticSymbol&&&						getActionBarContributor().setActiveEditor(<%
//&&&staticSymbol&&&=genPackage.getEditorClassName()
//&&&staticSymbol&&&%>.this);
//&&&staticSymbol&&&
//&&&staticSymbol&&&						setCurrentViewer(contentOutlineViewer);
//&&&staticSymbol&&&					}
//&&&staticSymbol&&&				}
//&&&staticSymbol&&&				else if (p instanceof PropertySheet)
//&&&staticSymbol&&&				{
//&&&staticSymbol&&&					if (propertySheetPages.contains(((PropertySheet)p).getCurrentPage()))
//&&&staticSymbol&&&					{
//&&&staticSymbol&&&						getActionBarContributor().setActiveEditor(<%
//&&&staticSymbol&&&=genPackage.getEditorClassName()
//&&&staticSymbol&&&%>.this);
//&&&staticSymbol&&&						handleActivate();
//&&&staticSymbol&&&					}
//&&&staticSymbol&&&				}
//&&&staticSymbol&&&				else if (p == <%
//&&&staticSymbol&&&=genPackage.getEditorClassName()
//&&&staticSymbol&&&%>.this)
//&&&staticSymbol&&&				{
//&&&staticSymbol&&&					handleActivate();
//&&&staticSymbol&&&				}
//&&&staticSymbol&&&			}
//&&&staticSymbol&&&			public void partBroughtToTop(IWorkbenchPart p)
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&				// Ignore.
//&&&staticSymbol&&&			}
//&&&staticSymbol&&&			public void partClosed(IWorkbenchPart p)
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&				// Ignore.
//&&&staticSymbol&&&			}
//&&&staticSymbol&&&			public void partDeactivated(IWorkbenchPart p)
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&				// Ignore.
//&&&staticSymbol&&&			}
//&&&staticSymbol&&&			public void partOpened(IWorkbenchPart p)
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&				// Ignore.
//&&&staticSymbol&&&			}
//&&&staticSymbol&&&		};
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * Resources that have been removed since last activation.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	protected <%
//&&&staticSymbol&&&=_CollectionOfResource
//&&&staticSymbol&&&%> removedResources = new <%
//&&&staticSymbol&&&=_ArrayListOfResource
//&&&staticSymbol&&&%>();
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * Resources that have been changed since last activation.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	protected <%
//&&&staticSymbol&&&=_CollectionOfResource
//&&&staticSymbol&&&%> changedResources = new <%
//&&&staticSymbol&&&=_ArrayListOfResource
//&&&staticSymbol&&&%>();
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * Resources that have been saved.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	protected <%
//&&&staticSymbol&&&=_CollectionOfResource
//&&&staticSymbol&&&%> savedResources = new <%
//&&&staticSymbol&&&=_ArrayListOfResource
//&&&staticSymbol&&&%>();
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * Map to store the diagnostic associated with a resource.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	protected <%
//&&&staticSymbol&&&=_MapOfResourceToDiagnostic
//&&&staticSymbol&&&%> resourceToDiagnosticMap = new <%
//&&&staticSymbol&&&=_LinkedHashMapOfResourceToDiagnostic
//&&&staticSymbol&&&%>();
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * Controls whether the problem indication should be updated.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	protected boolean updateProblemIndication = true;
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * Adapter used to update the problem indication when resources are demanded loaded.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	protected EContentAdapter problemIndicationAdapter =
//&&&staticSymbol&&&		new EContentAdapter()
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&<%
if (genModel.useClassOverrideAnnotation()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			@Override
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			public void notifyChanged(Notification notification)
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&				if (notification.getNotifier() instanceof Resource)
//&&&staticSymbol&&&				{
//&&&staticSymbol&&&					switch (notification.getFeatureID(Resource.class))
//&&&staticSymbol&&&					{
//&&&staticSymbol&&&						case Resource.RESOURCE__IS_LOADED:
//&&&staticSymbol&&&						case Resource.RESOURCE__ERRORS:
//&&&staticSymbol&&&						case Resource.RESOURCE__WARNINGS:
//&&&staticSymbol&&&						{
//&&&staticSymbol&&&							Resource resource = (Resource)notification.getNotifier();
//&&&staticSymbol&&&							Diagnostic diagnostic = analyzeResourceProblems(resource, null);
//&&&staticSymbol&&&							if (diagnostic.getSeverity() != Diagnostic.OK)
//&&&staticSymbol&&&							{
//&&&staticSymbol&&&								resourceToDiagnosticMap.put(resource, diagnostic);
//&&&staticSymbol&&&							}
//&&&staticSymbol&&&							else
//&&&staticSymbol&&&							{
//&&&staticSymbol&&&								resourceToDiagnosticMap.remove(resource);
//&&&staticSymbol&&&							}
//&&&staticSymbol&&&
//&&&staticSymbol&&&							if (updateProblemIndication)
//&&&staticSymbol&&&							{
//&&&staticSymbol&&&								getSite().getShell().getDisplay().asyncExec
//&&&staticSymbol&&&									(new Runnable()
//&&&staticSymbol&&&									 {
//&&&staticSymbol&&&										 public void run()
//&&&staticSymbol&&&										 {
//&&&staticSymbol&&&											 updateProblemIndication();
//&&&staticSymbol&&&										 }
//&&&staticSymbol&&&									 });
//&&&staticSymbol&&&							}
//&&&staticSymbol&&&							break;
//&&&staticSymbol&&&						}
//&&&staticSymbol&&&					}
//&&&staticSymbol&&&				}
//&&&staticSymbol&&&				else
//&&&staticSymbol&&&				{
//&&&staticSymbol&&&					super.notifyChanged(notification);
//&&&staticSymbol&&&				}
//&&&staticSymbol&&&			}
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
if (genModel.useClassOverrideAnnotation()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			@Override
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			protected void setTarget(Resource target)
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&				basicSetTarget(target);
//&&&staticSymbol&&&			}
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
if (genModel.useClassOverrideAnnotation()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			@Override
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			protected void unsetTarget(Resource target)
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&				basicUnsetTarget(target);
//&&&staticSymbol&&&				resourceToDiagnosticMap.remove(target);
//&&&staticSymbol&&&				if (updateProblemIndication)
//&&&staticSymbol&&&				{
//&&&staticSymbol&&&					getSite().getShell().getDisplay().asyncExec
//&&&staticSymbol&&&						(new Runnable()
//&&&staticSymbol&&&						 {
//&&&staticSymbol&&&							 public void run()
//&&&staticSymbol&&&							 {
//&&&staticSymbol&&&								 updateProblemIndication();
//&&&staticSymbol&&&							 }
//&&&staticSymbol&&&						 });
//&&&staticSymbol&&&				}
//&&&staticSymbol&&&			}
//&&&staticSymbol&&&		};
//&&&staticSymbol&&&<%
if (!genModel.isRichClientPlatform()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * This listens for workspace changes.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	protected IResourceChangeListener resourceChangeListener =
//&&&staticSymbol&&&		new IResourceChangeListener()
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			public void resourceChanged(IResourceChangeEvent event)
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&				IResourceDelta delta = event.getDelta();
//&&&staticSymbol&&&				try
//&&&staticSymbol&&&				{
//&&&staticSymbol&&&					class ResourceDeltaVisitor implements IResourceDeltaVisitor
//&&&staticSymbol&&&					{
//&&&staticSymbol&&&						protected ResourceSet resourceSet = editingDomain.getResourceSet();
//&&&staticSymbol&&&						protected <%
//&&&staticSymbol&&&=_CollectionOfResource
//&&&staticSymbol&&&%> changedResources = new <%
//&&&staticSymbol&&&=_ArrayListOfResource
//&&&staticSymbol&&&%>();
//&&&staticSymbol&&&						protected <%
//&&&staticSymbol&&&=_CollectionOfResource
//&&&staticSymbol&&&%> removedResources = new <%
//&&&staticSymbol&&&=_ArrayListOfResource
//&&&staticSymbol&&&%>();
//&&&staticSymbol&&&
//&&&staticSymbol&&&						public boolean visit(<%
if (genModel.getDecoration() != GenDecoration.NONE) {
//&&&staticSymbol&&&%>final <%
}
//&&&staticSymbol&&&%>IResourceDelta delta)
//&&&staticSymbol&&&						{
//&&&staticSymbol&&&							if (delta.getResource().getType() == IResource.FILE)
//&&&staticSymbol&&&							{
//&&&staticSymbol&&&								if (delta.getKind() == IResourceDelta.REMOVED ||
//&&&staticSymbol&&&								    delta.getKind() == IResourceDelta.CHANGED<%
if (genModel.getDecoration() == GenDecoration.NONE) {
//&&&staticSymbol&&&%> && delta.getFlags() != IResourceDelta.MARKERS<%
}
//&&&staticSymbol&&&%>)
//&&&staticSymbol&&&								{
//&&&staticSymbol&&&									<%
if (genModel.getDecoration() != GenDecoration.NONE) {
//&&&staticSymbol&&&%>final <%
}
//&&&staticSymbol&&&%>Resource resource = resourceSet.getResource(URI.createPlatformResourceURI(delta.getFullPath().toString(), true), false);
//&&&staticSymbol&&&									if (resource != null)
//&&&staticSymbol&&&									{
//&&&staticSymbol&&&										if (delta.getKind() == IResourceDelta.REMOVED)
//&&&staticSymbol&&&										{
//&&&staticSymbol&&&											removedResources.add(resource);
//&&&staticSymbol&&&										}
//&&&staticSymbol&&&<%
if (genModel.getDecoration() == GenDecoration.NONE) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&										else if (!savedResources.remove(resource))
//&&&staticSymbol&&&										{
//&&&staticSymbol&&&											changedResources.add(resource);
//&&&staticSymbol&&&										}
//&&&staticSymbol&&&<%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&										else
//&&&staticSymbol&&&										{
//&&&staticSymbol&&&											if ((delta.getFlags() & IResourceDelta.MARKERS) != 0)
//&&&staticSymbol&&&											{
//&&&staticSymbol&&&												<%
//&&&staticSymbol&&&=_DiagnosticDecorator
//&&&staticSymbol&&&%>.DiagnosticAdapter.update(resource, markerHelper.getMarkerDiagnostics(resource, (IFile)delta.getResource()));
//&&&staticSymbol&&&											}
//&&&staticSymbol&&&											if ((delta.getFlags() & IResourceDelta.CONTENT) != 0)
//&&&staticSymbol&&&											{
//&&&staticSymbol&&&												if (!savedResources.remove(resource))
//&&&staticSymbol&&&												{
//&&&staticSymbol&&&													changedResources.add(resource);
//&&&staticSymbol&&&												}
//&&&staticSymbol&&&											}
//&&&staticSymbol&&&										}
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&									}
//&&&staticSymbol&&&								}
//&&&staticSymbol&&&								return false;
//&&&staticSymbol&&&							}
//&&&staticSymbol&&&
//&&&staticSymbol&&&							return true;
//&&&staticSymbol&&&						}
//&&&staticSymbol&&&
//&&&staticSymbol&&&						public <%
//&&&staticSymbol&&&=_CollectionOfResource
//&&&staticSymbol&&&%> getChangedResources()
//&&&staticSymbol&&&						{
//&&&staticSymbol&&&							return changedResources;
//&&&staticSymbol&&&						}
//&&&staticSymbol&&&
//&&&staticSymbol&&&						public <%
//&&&staticSymbol&&&=_CollectionOfResource
//&&&staticSymbol&&&%> getRemovedResources()
//&&&staticSymbol&&&						{
//&&&staticSymbol&&&							return removedResources;
//&&&staticSymbol&&&						}
//&&&staticSymbol&&&					}
//&&&staticSymbol&&&
//&&&staticSymbol&&&					final ResourceDeltaVisitor visitor = new ResourceDeltaVisitor();
//&&&staticSymbol&&&					delta.accept(visitor);
//&&&staticSymbol&&&
//&&&staticSymbol&&&					if (!visitor.getRemovedResources().isEmpty())
//&&&staticSymbol&&&					{
//&&&staticSymbol&&&						getSite().getShell().getDisplay().asyncExec
//&&&staticSymbol&&&							(new Runnable()
//&&&staticSymbol&&&							 {
//&&&staticSymbol&&&								 public void run()
//&&&staticSymbol&&&								 {
//&&&staticSymbol&&&									 removedResources.addAll(visitor.getRemovedResources());
//&&&staticSymbol&&&									 if (!isDirty())
//&&&staticSymbol&&&									 {
//&&&staticSymbol&&&										 getSite().getPage().closeEditor(<%
//&&&staticSymbol&&&=genPackage.getEditorClassName()
//&&&staticSymbol&&&%>.this, false);
//&&&staticSymbol&&&									 }
//&&&staticSymbol&&&								 }
//&&&staticSymbol&&&							 });
//&&&staticSymbol&&&					}
//&&&staticSymbol&&&
//&&&staticSymbol&&&					if (!visitor.getChangedResources().isEmpty())
//&&&staticSymbol&&&					{
//&&&staticSymbol&&&						getSite().getShell().getDisplay().asyncExec
//&&&staticSymbol&&&							(new Runnable()
//&&&staticSymbol&&&							 {
//&&&staticSymbol&&&								 public void run()
//&&&staticSymbol&&&								 {
//&&&staticSymbol&&&									 changedResources.addAll(visitor.getChangedResources());
//&&&staticSymbol&&&									 if (getSite().getPage().getActiveEditor() == <%
//&&&staticSymbol&&&=genPackage.getEditorClassName()
//&&&staticSymbol&&&%>.this)
//&&&staticSymbol&&&									 {
//&&&staticSymbol&&&										 handleActivate();
//&&&staticSymbol&&&									 }
//&&&staticSymbol&&&								 }
//&&&staticSymbol&&&							 });
//&&&staticSymbol&&&					}
//&&&staticSymbol&&&				}
//&&&staticSymbol&&&				catch (CoreException exception)
//&&&staticSymbol&&&				{
//&&&staticSymbol&&&					<%
//&&&staticSymbol&&&=genPackage.getImportedEditorPluginClassName()
//&&&staticSymbol&&&%>.INSTANCE.log(exception);
//&&&staticSymbol&&&				}
//&&&staticSymbol&&&			}
//&&&staticSymbol&&&		};
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * Handles activation of the editor or it's associated views.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	protected void handleActivate()
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		// Recompute the read only state.
//&&&staticSymbol&&&		//
//&&&staticSymbol&&&		if (editingDomain.getResourceToReadOnlyMap() != null)
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&		  editingDomain.getResourceToReadOnlyMap().clear();
//&&&staticSymbol&&&
//&&&staticSymbol&&&		  // Refresh any actions that may become enabled or disabled.
//&&&staticSymbol&&&		  //
//&&&staticSymbol&&&		  setSelection(getSelection());
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&
//&&&staticSymbol&&&		if (!removedResources.isEmpty())
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			if (handleDirtyConflict())
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&				getSite().getPage().closeEditor(<%
//&&&staticSymbol&&&=genPackage.getEditorClassName()
//&&&staticSymbol&&&%>.this, false);
//&&&staticSymbol&&&			}
//&&&staticSymbol&&&			else
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&				removedResources.clear();
//&&&staticSymbol&&&				changedResources.clear();
//&&&staticSymbol&&&				savedResources.clear();
//&&&staticSymbol&&&			}
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&		else if (!changedResources.isEmpty())
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			changedResources.removeAll(savedResources);
//&&&staticSymbol&&&			handleChangedResources();
//&&&staticSymbol&&&			changedResources.clear();
//&&&staticSymbol&&&			savedResources.clear();
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * Handles what to do with changed resources on activation.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	protected void handleChangedResources()
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		if (!changedResources.isEmpty() && (!isDirty() || handleDirtyConflict()))
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			if (isDirty())
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&				changedResources.addAll(editingDomain.getResourceSet().getResources());
//&&&staticSymbol&&&			}
//&&&staticSymbol&&&			editingDomain.getCommandStack().flush();
//&&&staticSymbol&&&
//&&&staticSymbol&&&			updateProblemIndication = false;
//&&&staticSymbol&&&<%
if (genModel.useGenerics()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			for (Resource resource : changedResources)
//&&&staticSymbol&&&<%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			for (Iterator i = changedResources.iterator(); i.hasNext(); )
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&<%
if (!genModel.useGenerics()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				Resource resource = (Resource)i.next();
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				if (resource.isLoaded())
//&&&staticSymbol&&&				{
//&&&staticSymbol&&&					resource.unload();
//&&&staticSymbol&&&					try
//&&&staticSymbol&&&					{
//&&&staticSymbol&&&						resource.load(Collections.EMPTY_MAP);
//&&&staticSymbol&&&					}
//&&&staticSymbol&&&					catch (IOException exception)
//&&&staticSymbol&&&					{
//&&&staticSymbol&&&						if (!resourceToDiagnosticMap.containsKey(resource))
//&&&staticSymbol&&&						{
//&&&staticSymbol&&&							resourceToDiagnosticMap.put(resource, analyzeResourceProblems(resource, exception));
//&&&staticSymbol&&&						}
//&&&staticSymbol&&&					}
//&&&staticSymbol&&&				}
//&&&staticSymbol&&&			}
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
if (genModel.getRuntimeVersion().getValue() >= GenRuntimeVersion.EMF24_VALUE) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			if (AdapterFactoryEditingDomain.isStale(editorSelection))
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&				setSelection(StructuredSelection.EMPTY);
//&&&staticSymbol&&&			}
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&			updateProblemIndication = true;
//&&&staticSymbol&&&			updateProblemIndication();
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * Updates the problems indication with the information described in the specified diagnostic.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	protected void updateProblemIndication()
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		if (updateProblemIndication)
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			BasicDiagnostic diagnostic =
//&&&staticSymbol&&&				new BasicDiagnostic
//&&&staticSymbol&&&					(Diagnostic.OK,
//&&&staticSymbol&&&					 "<%
//&&&staticSymbol&&&=genPackage.getGenModel().getEditorPluginID()
//&&&staticSymbol&&&%>",<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&					 0,
//&&&staticSymbol&&&					 null,
//&&&staticSymbol&&&					 new Object [] { editingDomain.getResourceSet() });
//&&&staticSymbol&&&<%
if (genModel.useGenerics()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			for (Diagnostic childDiagnostic : resourceToDiagnosticMap.values())
//&&&staticSymbol&&&<%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			for (Iterator i = resourceToDiagnosticMap.values().iterator(); i.hasNext(); )
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&<%
if (!genModel.useGenerics()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				Diagnostic childDiagnostic = (Diagnostic)i.next();
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				if (childDiagnostic.getSeverity() != Diagnostic.OK)
//&&&staticSymbol&&&				{
//&&&staticSymbol&&&					diagnostic.add(childDiagnostic);
//&&&staticSymbol&&&				}
//&&&staticSymbol&&&			}
//&&&staticSymbol&&&
//&&&staticSymbol&&&			int lastEditorPage = getPageCount() - 1;
//&&&staticSymbol&&&			if (lastEditorPage >= 0 && getEditor(lastEditorPage) instanceof ProblemEditorPart)
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&				((ProblemEditorPart)getEditor(lastEditorPage)).setDiagnostic(diagnostic);
//&&&staticSymbol&&&				if (diagnostic.getSeverity() != Diagnostic.OK)
//&&&staticSymbol&&&				{
//&&&staticSymbol&&&					setActivePage(lastEditorPage);
//&&&staticSymbol&&&				}
//&&&staticSymbol&&&			}
//&&&staticSymbol&&&			else if (diagnostic.getSeverity() != Diagnostic.OK)
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&				ProblemEditorPart problemEditorPart = new ProblemEditorPart();
//&&&staticSymbol&&&				problemEditorPart.setDiagnostic(diagnostic);
//&&&staticSymbol&&&<%
if (!genModel.isRichClientPlatform()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				problemEditorPart.setMarkerHelper(markerHelper);
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				try
//&&&staticSymbol&&&				{
//&&&staticSymbol&&&					addPage(++lastEditorPage, problemEditorPart, getEditorInput());
//&&&staticSymbol&&&					setPageText(lastEditorPage, problemEditorPart.getPartName());
//&&&staticSymbol&&&					setActivePage(lastEditorPage);
//&&&staticSymbol&&&					showTabs();
//&&&staticSymbol&&&				}
//&&&staticSymbol&&&				catch (PartInitException exception)
//&&&staticSymbol&&&				{
//&&&staticSymbol&&&					<%
//&&&staticSymbol&&&=genPackage.getImportedEditorPluginClassName()
//&&&staticSymbol&&&%>.INSTANCE.log(exception);
//&&&staticSymbol&&&				}
//&&&staticSymbol&&&			}
//&&&staticSymbol&&&<%
if (!genModel.isRichClientPlatform()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&			if (markerHelper.hasMarkers(editingDomain.getResourceSet()))
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&				markerHelper.deleteMarkers(editingDomain.getResourceSet());
//&&&staticSymbol&&&				if (diagnostic.getSeverity() != Diagnostic.OK)
//&&&staticSymbol&&&				{
//&&&staticSymbol&&&					try
//&&&staticSymbol&&&					{
//&&&staticSymbol&&&						markerHelper.createMarkers(diagnostic);
//&&&staticSymbol&&&					}
//&&&staticSymbol&&&					catch (CoreException exception)
//&&&staticSymbol&&&					{
//&&&staticSymbol&&&						<%
//&&&staticSymbol&&&=genPackage.getImportedEditorPluginClassName()
//&&&staticSymbol&&&%>.INSTANCE.log(exception);
//&&&staticSymbol&&&					}
//&&&staticSymbol&&&				}
//&&&staticSymbol&&&			}
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * Shows a dialog that asks if conflicting changes should be discarded.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	protected boolean handleDirtyConflict()
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		return
//&&&staticSymbol&&&			MessageDialog.openQuestion
//&&&staticSymbol&&&				(getSite().getShell(),
//&&&staticSymbol&&&				 getString("_UI_FileConflict_label"),<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				 getString("_WARN_FileConflict"));<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * This creates a model editor.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	public <%
//&&&staticSymbol&&&=genPackage.getEditorClassName()
//&&&staticSymbol&&&%>()
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		super();
//&&&staticSymbol&&&		initializeEditingDomain();
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * This sets up the editing domain for the model editor.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	protected void initializeEditingDomain()
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		// Create an adapter factory that yields item providers.
//&&&staticSymbol&&&		//
//&&&staticSymbol&&&		adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
//&&&staticSymbol&&&
//&&&staticSymbol&&&		adapterFactory.addAdapterFactory(new ResourceItemProviderAdapterFactory());
//&&&staticSymbol&&&<%
for (GenPackage aGenPackage : genModel.getAllGenPackagesWithClassifiers()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
if (!aGenPackage.getGenClasses().isEmpty() && aGenPackage.getGenModel().hasEditSupport()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		adapterFactory.addAdapterFactory(new <%
//&&&staticSymbol&&&=aGenPackage.getImportedItemProviderAdapterFactoryClassName()
//&&&staticSymbol&&&%>());
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
for (GenPackage aGenPackage : genModel.getAllUsedGenPackagesWithClassifiers()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
if (!aGenPackage.getGenClasses().isEmpty() && aGenPackage.getGenModel().hasEditSupport()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		adapterFactory.addAdapterFactory(new <%
//&&&staticSymbol&&&=aGenPackage.getImportedItemProviderAdapterFactoryClassName()
//&&&staticSymbol&&&%>());
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
//&&&staticSymbol&&&@end
//&&&staticSymbol&&&%><%
//Editor/addItemproviderFactories.override.javajetinc"
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		adapterFactory.addAdapterFactory(new ReflectiveItemProviderAdapterFactory());
//&&&staticSymbol&&&
//&&&staticSymbol&&&		// Create the command stack that will notify this editor as commands are executed.
//&&&staticSymbol&&&		//
//&&&staticSymbol&&&		BasicCommandStack commandStack = new BasicCommandStack();
//&&&staticSymbol&&&
//&&&staticSymbol&&&		// Add a listener to set the most recent command's affected objects to be the selection of the viewer with focus.
//&&&staticSymbol&&&		//
//&&&staticSymbol&&&		commandStack.addCommandStackListener
//&&&staticSymbol&&&			(new CommandStackListener()
//&&&staticSymbol&&&			 {
//&&&staticSymbol&&&				 public void commandStackChanged(final EventObject event)
//&&&staticSymbol&&&				 {
//&&&staticSymbol&&&					 getContainer().getDisplay().asyncExec
//&&&staticSymbol&&&						 (new Runnable()
//&&&staticSymbol&&&						  {
//&&&staticSymbol&&&							  public void run()
//&&&staticSymbol&&&							  {
//&&&staticSymbol&&&								  firePropertyChange(IEditorPart.PROP_DIRTY);
//&&&staticSymbol&&&
//&&&staticSymbol&&&								  // Try to select the affected objects.
//&&&staticSymbol&&&								  //
//&&&staticSymbol&&&								  Command mostRecentCommand = ((CommandStack)event.getSource()).getMostRecentCommand();
//&&&staticSymbol&&&								  if (mostRecentCommand != null)
//&&&staticSymbol&&&								  {
//&&&staticSymbol&&&									  setSelectionToViewer(mostRecentCommand.getAffectedObjects());
//&&&staticSymbol&&&								  }
//&&&staticSymbol&&&								  for (Iterator<%
if (genModel.useGenerics()) {
//&&&staticSymbol&&&%><PropertySheetPage><%
}
//&&&staticSymbol&&&%> i = propertySheetPages.iterator(); i.hasNext(); )
//&&&staticSymbol&&&								  {
//&&&staticSymbol&&&									  PropertySheetPage propertySheetPage = <%
if (!genModel.useGenerics()) {
//&&&staticSymbol&&&%>(PropertySheetPage)<%
}
//&&&staticSymbol&&&%>i.next();
//&&&staticSymbol&&&									  if (propertySheetPage.getControl().isDisposed())
//&&&staticSymbol&&&									  {
//&&&staticSymbol&&&										  i.remove();
//&&&staticSymbol&&&									  }
//&&&staticSymbol&&&									  else
//&&&staticSymbol&&&									  {
//&&&staticSymbol&&&										  propertySheetPage.refresh();
//&&&staticSymbol&&&									  }
//&&&staticSymbol&&&								  }
//&&&staticSymbol&&&							  }
//&&&staticSymbol&&&						  });
//&&&staticSymbol&&&				 }
//&&&staticSymbol&&&			 });
//&&&staticSymbol&&&
//&&&staticSymbol&&&		// Create the editing domain with a special command stack.
//&&&staticSymbol&&&		//
//&&&staticSymbol&&&		editingDomain = new AdapterFactoryEditingDomain(adapterFactory, commandStack, new <%
//&&&staticSymbol&&&=_HashMapOfResourceToBoolean
//&&&staticSymbol&&&%>());
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * This is here for the listener to be able to call it.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&<%
if (genModel.useClassOverrideAnnotation()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			@Override
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	protected void firePropertyChange(int action)
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		super.firePropertyChange(action);
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * This sets the selection into whichever viewer is active.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	public void setSelectionToViewer(<%
//&&&staticSymbol&&&=_CollectionOfAnything
//&&&staticSymbol&&&%> collection)
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		final <%
//&&&staticSymbol&&&=_CollectionOfAnything
//&&&staticSymbol&&&%> theSelection = collection;
//&&&staticSymbol&&&		// Make sure it's okay.
//&&&staticSymbol&&&		//
//&&&staticSymbol&&&		if (theSelection != null && !theSelection.isEmpty())
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			Runnable runnable =
//&&&staticSymbol&&&				new Runnable()
//&&&staticSymbol&&&				{
//&&&staticSymbol&&&					public void run()
//&&&staticSymbol&&&					{
//&&&staticSymbol&&&						// Try to select the items in the current content viewer of the editor.
//&&&staticSymbol&&&						//
//&&&staticSymbol&&&						if (currentViewer != null)
//&&&staticSymbol&&&						{
//&&&staticSymbol&&&							currentViewer.setSelection(new StructuredSelection(theSelection.toArray()), true);
//&&&staticSymbol&&&						}
//&&&staticSymbol&&&					}
//&&&staticSymbol&&&				};
//&&&staticSymbol&&&			getSite().getShell().getDisplay().asyncExec(runnable);
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * This returns the editing domain as required by the {@link IEditingDomainProvider} interface.
//&&&staticSymbol&&&	 * This is important for implementing the static methods of {@link AdapterFactoryEditingDomain}
//&&&staticSymbol&&&	 * and for supporting {@link org.eclipse.emf.edit.ui.action.CommandAction}.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	public EditingDomain getEditingDomain()
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		return editingDomain;
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	public class ReverseAdapterFactoryContentProvider extends AdapterFactoryContentProvider
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		/**
//&&&staticSymbol&&&		 * <!-- begin-user-doc -->
//&&&staticSymbol&&&		 * <!-- end-user-doc -->
//&&&staticSymbol&&&		 * @generated
//&&&staticSymbol&&&		 */
//&&&staticSymbol&&&		public ReverseAdapterFactoryContentProvider(AdapterFactory adapterFactory)
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			super(adapterFactory);
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
//&&&staticSymbol&&&		public Object [] getElements(Object object)
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			Object parent = super.getParent(object);
//&&&staticSymbol&&&			return (parent == null ? Collections.EMPTY_SET : Collections.singleton(parent)).toArray();
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
//&&&staticSymbol&&&		public Object [] getChildren(Object object)
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			Object parent = super.getParent(object);
//&&&staticSymbol&&&			return (parent == null ? Collections.EMPTY_SET : Collections.singleton(parent)).toArray();
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
//&&&staticSymbol&&&		public boolean hasChildren(Object object)
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			Object parent = super.getParent(object);
//&&&staticSymbol&&&			return parent != null;
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
//&&&staticSymbol&&&		public Object getParent(Object object)
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			return null;
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&<%
if (genPackage.isMultipleEditorPages()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	public void setCurrentViewerPane(ViewerPane viewerPane)
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		if (currentViewerPane != viewerPane)
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			if (currentViewerPane != null)
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&				currentViewerPane.showFocus(false);
//&&&staticSymbol&&&			}
//&&&staticSymbol&&&			currentViewerPane = viewerPane;
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&		setCurrentViewer(currentViewerPane.getViewer());
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * This makes sure that one content viewer, either for the current page or the outline view, if it has focus,
//&&&staticSymbol&&&	 * is the current one.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	public void setCurrentViewer(Viewer viewer)
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		// If it is changing...
//&&&staticSymbol&&&		//
//&&&staticSymbol&&&		if (currentViewer != viewer)
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			if (selectionChangedListener == null)
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&				// Create the listener on demand.
//&&&staticSymbol&&&				//
//&&&staticSymbol&&&				selectionChangedListener =
//&&&staticSymbol&&&					new ISelectionChangedListener()
//&&&staticSymbol&&&					{
//&&&staticSymbol&&&						// This just notifies those things that are affected by the section.
//&&&staticSymbol&&&						//
//&&&staticSymbol&&&						public void selectionChanged(SelectionChangedEvent selectionChangedEvent)
//&&&staticSymbol&&&						{
//&&&staticSymbol&&&							setSelection(selectionChangedEvent.getSelection());
//&&&staticSymbol&&&						}
//&&&staticSymbol&&&					};
//&&&staticSymbol&&&			}
//&&&staticSymbol&&&
//&&&staticSymbol&&&			// Stop listening to the old one.
//&&&staticSymbol&&&			//
//&&&staticSymbol&&&			if (currentViewer != null)
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&				currentViewer.removeSelectionChangedListener(selectionChangedListener);
//&&&staticSymbol&&&			}
//&&&staticSymbol&&&
//&&&staticSymbol&&&			// Start listening to the new one.
//&&&staticSymbol&&&			//
//&&&staticSymbol&&&			if (viewer != null)
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&				viewer.addSelectionChangedListener(selectionChangedListener);
//&&&staticSymbol&&&			}
//&&&staticSymbol&&&
//&&&staticSymbol&&&			// Remember it.
//&&&staticSymbol&&&			//
//&&&staticSymbol&&&			currentViewer = viewer;
//&&&staticSymbol&&&
//&&&staticSymbol&&&			// Set the editors selection based on the current viewer's selection.
//&&&staticSymbol&&&			//
//&&&staticSymbol&&&			setSelection(currentViewer == null ? StructuredSelection.EMPTY : currentViewer.getSelection());
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * This returns the viewer as required by the {@link IViewerProvider} interface.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	public Viewer getViewer()
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		return currentViewer;
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * This creates a context menu for the viewer and adds a listener as well registering the menu for extension.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	protected void createContextMenuFor(StructuredViewer viewer)
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		MenuManager contextMenu = new MenuManager("#PopUp");<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		contextMenu.add(new Separator("additions"));<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		contextMenu.setRemoveAllWhenShown(true);
//&&&staticSymbol&&&		contextMenu.addMenuListener(this);
//&&&staticSymbol&&&		Menu menu= contextMenu.createContextMenu(viewer.getControl());
//&&&staticSymbol&&&		viewer.getControl().setMenu(menu);
//&&&staticSymbol&&&<%
if (genModel.getRuntimeVersion().getValue() >= GenRuntimeVersion.EMF23_VALUE) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		getSite().registerContextMenu(contextMenu, new UnwrappingSelectionProvider(viewer));
//&&&staticSymbol&&&<%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		getSite().registerContextMenu(contextMenu, viewer);
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&		int dndOperations = DND.DROP_COPY | DND.DROP_MOVE | DND.DROP_LINK;
//&&&staticSymbol&&&		Transfer[] transfers = new Transfer[] { LocalTransfer.getInstance()<%
if (genModel.getRuntimeVersion().getValue() >= GenRuntimeVersion.EMF29_VALUE) {
//&&&staticSymbol&&&%>, LocalSelectionTransfer.getTransfer(), FileTransfer.getInstance()<%
}
//&&&staticSymbol&&&%> };
//&&&staticSymbol&&&		viewer.addDragSupport(dndOperations, transfers, new ViewerDragAdapter(viewer));
//&&&staticSymbol&&&		viewer.addDropSupport(dndOperations, transfers, new EditingDomainViewerDropAdapter(editingDomain, viewer));
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * This is the method called to load a resource into the editing domain's resource set based on the editor's input.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	public void createModel()
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&<%
if (genModel.getRuntimeVersion().getValue() >= GenRuntimeVersion.EMF23_VALUE) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		URI resourceURI = EditUIUtil.getURI(getEditorInput());
//&&&staticSymbol&&&<%
} else if (genModel.isRichClientPlatform()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		URI resourceURI = URI.createURI(getEditorInput().getName());
//&&&staticSymbol&&&<%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		// Assumes that the input is a file object.
//&&&staticSymbol&&&		//
//&&&staticSymbol&&&		IFileEditorInput modelFile = (IFileEditorInput)getEditorInput();
//&&&staticSymbol&&&		URI resourceURI = URI.createPlatformResourceURI(modelFile.getFile().getFullPath().toString(), true);
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		Exception exception = null;
//&&&staticSymbol&&&		Resource resource = null;
//&&&staticSymbol&&&		try
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			// Load the resource through the editing domain.
//&&&staticSymbol&&&			//
//&&&staticSymbol&&&			resource = editingDomain.getResourceSet().getResource(resourceURI, true);
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&		catch (Exception e)
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			exception = e;
//&&&staticSymbol&&&			resource = editingDomain.getResourceSet().getResource(resourceURI, false);
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&
//&&&staticSymbol&&&		Diagnostic diagnostic = analyzeResourceProblems(resource, exception);
//&&&staticSymbol&&&		if (diagnostic.getSeverity() != Diagnostic.OK)
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			resourceToDiagnosticMap.put(resource,  analyzeResourceProblems(resource, exception));
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&		editingDomain.getResourceSet().eAdapters().add(problemIndicationAdapter);
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * Returns a diagnostic describing the errors and warnings listed in the resource
//&&&staticSymbol&&&	 * and the specified exception (if any).
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	public Diagnostic analyzeResourceProblems(Resource resource, Exception exception)
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		if (!resource.getErrors().isEmpty() || !resource.getWarnings().isEmpty())
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			BasicDiagnostic basicDiagnostic =
//&&&staticSymbol&&&				new BasicDiagnostic
//&&&staticSymbol&&&					(Diagnostic.ERROR,
//&&&staticSymbol&&&					 "<%
//&&&staticSymbol&&&=genPackage.getGenModel().getEditorPluginID()
//&&&staticSymbol&&&%>",<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&					 0,
//&&&staticSymbol&&&					 getString("_UI_CreateModelError_message", resource.getURI()),<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&					 new Object [] { exception == null ? (Object)resource : exception });
//&&&staticSymbol&&&			basicDiagnostic.merge(EcoreUtil.computeDiagnostic(resource, true));
//&&&staticSymbol&&&			return basicDiagnostic;
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&		else if (exception != null)
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			return
//&&&staticSymbol&&&				new BasicDiagnostic
//&&&staticSymbol&&&					(Diagnostic.ERROR,
//&&&staticSymbol&&&					 "<%
//&&&staticSymbol&&&=genPackage.getGenModel().getEditorPluginID()
//&&&staticSymbol&&&%>",<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&					 0,
//&&&staticSymbol&&&					 getString("_UI_CreateModelError_message", resource.getURI()),<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&					 new Object[] { exception });
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&		else
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			return Diagnostic.OK_INSTANCE;
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * This is the method used by the framework to install your own controls.
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
//&&&staticSymbol&&&	public void createPages()
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		// Creates the model from the editor input
//&&&staticSymbol&&&		//
//&&&staticSymbol&&&		createModel();
//&&&staticSymbol&&&
//&&&staticSymbol&&&		// Only creates the other pages if there is something that can be edited
//&&&staticSymbol&&&		//
//&&&staticSymbol&&&		if (!getEditingDomain().getResourceSet().getResources().isEmpty())
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			// Create a page for the selection tree view.
//&&&staticSymbol&&&			//
//&&&staticSymbol&&&<%
if (genPackage.isMultipleEditorPages()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&				ViewerPane viewerPane =
//&&&staticSymbol&&&					new ViewerPane(getSite().getPage(), <%
//&&&staticSymbol&&&=genPackage.getEditorClassName()
//&&&staticSymbol&&&%>.this)
//&&&staticSymbol&&&					{
//&&&staticSymbol&&&<%
if (genModel.useClassOverrideAnnotation()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&						@Override
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&						public Viewer createViewer(Composite composite)
//&&&staticSymbol&&&						{
//&&&staticSymbol&&&							Tree tree = new Tree(composite, SWT.MULTI);
//&&&staticSymbol&&&							TreeViewer newTreeViewer = new TreeViewer(tree);
//&&&staticSymbol&&&							return newTreeViewer;
//&&&staticSymbol&&&						}
//&&&staticSymbol&&&<%
if (genModel.useClassOverrideAnnotation()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&						@Override
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&						public void requestActivation()
//&&&staticSymbol&&&						{
//&&&staticSymbol&&&							super.requestActivation();
//&&&staticSymbol&&&							setCurrentViewerPane(this);
//&&&staticSymbol&&&						}
//&&&staticSymbol&&&					};
//&&&staticSymbol&&&				viewerPane.createControl(getContainer());
//&&&staticSymbol&&&
//&&&staticSymbol&&&				selectionViewer = (TreeViewer)viewerPane.getViewer();
//&&&staticSymbol&&&				selectionViewer.setContentProvider(new AdapterFactoryContentProvider(adapterFactory));
//&&&staticSymbol&&&
//&&&staticSymbol&&&				selectionViewer.setLabelProvider(<%
if (useStyledLabelProvider) {
//&&&staticSymbol&&&%>new <%
//&&&staticSymbol&&&=_DelegatingAdapterFactoryLabelProvider
//&&&staticSymbol&&&%>(<%
}
//&&&staticSymbol&&&%><%
if (genModel.getDecoration() != GenDecoration.NONE) {
//&&&staticSymbol&&&%>new <%
//&&&staticSymbol&&&=_DecoratingColumLabelProvider
//&&&staticSymbol&&&%>(<%
}
//&&&staticSymbol&&&%>new <%
//&&&staticSymbol&&&=_AdapterFactoryLabelProvider
//&&&staticSymbol&&&%>(adapterFactory<%
if (useExtendedLabelProvider) {
//&&&staticSymbol&&&%>, selectionViewer<%
}
//&&&staticSymbol&&&%>)<%
if (genModel.getDecoration() != GenDecoration.NONE) {
//&&&staticSymbol&&&%>, new <%
//&&&staticSymbol&&&=_DiagnosticDecorator
//&&&staticSymbol&&&%>(editingDomain<%
if (genModel.getDecoration() == GenDecoration.MANUAL) {
//&&&staticSymbol&&&%>.getResourceSet()<%
}
//&&&staticSymbol&&&%>, selectionViewer<%
if (genModel.getDecoration() == GenDecoration.LIVE) {
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=genPackage.getImportedEditorPluginClassName()
//&&&staticSymbol&&&%>.getPlugin().getDialogSettings()<%
}
//&&&staticSymbol&&&%>))<%
}
//&&&staticSymbol&&&%><%
if (useStyledLabelProvider) {
//&&&staticSymbol&&&%>)<%
}
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&				selectionViewer.setInput(editingDomain.getResourceSet());
//&&&staticSymbol&&&				selectionViewer.setSelection(new StructuredSelection(editingDomain.getResourceSet().getResources().get(0)), true);
//&&&staticSymbol&&&				viewerPane.setTitle(editingDomain.getResourceSet());
//&&&staticSymbol&&&
//&&&staticSymbol&&&				new AdapterFactoryTreeEditor(selectionViewer.getTree(), adapterFactory);
//&&&staticSymbol&&&<%
if (genModel.getDecoration() != GenDecoration.NONE) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				new <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.common.ui.viewer.ColumnViewerInformationControlToolTipSupport")
//&&&staticSymbol&&&%>(selectionViewer, new <%
//&&&staticSymbol&&&=_DiagnosticDecorator
//&&&staticSymbol&&&%>.EditingDomainLocationListener(editingDomain, selectionViewer));
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&				createContextMenuFor(selectionViewer);
//&&&staticSymbol&&&				int pageIndex = addPage(viewerPane.getControl());
//&&&staticSymbol&&&				setPageText(pageIndex, getString("_UI_SelectionPage_label"));<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			}
//&&&staticSymbol&&&
//&&&staticSymbol&&&			// Create a page for the parent tree view.
//&&&staticSymbol&&&			//
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&				ViewerPane viewerPane =
//&&&staticSymbol&&&					new ViewerPane(getSite().getPage(), <%
//&&&staticSymbol&&&=genPackage.getEditorClassName()
//&&&staticSymbol&&&%>.this)
//&&&staticSymbol&&&					{
//&&&staticSymbol&&&<%
if (genModel.useClassOverrideAnnotation()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&						@Override
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&						public Viewer createViewer(Composite composite)
//&&&staticSymbol&&&						{
//&&&staticSymbol&&&							Tree tree = new Tree(composite, SWT.MULTI);
//&&&staticSymbol&&&							TreeViewer newTreeViewer = new TreeViewer(tree);
//&&&staticSymbol&&&							return newTreeViewer;
//&&&staticSymbol&&&						}
//&&&staticSymbol&&&<%
if (genModel.useClassOverrideAnnotation()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&						@Override
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&						public void requestActivation()
//&&&staticSymbol&&&						{
//&&&staticSymbol&&&							super.requestActivation();
//&&&staticSymbol&&&							setCurrentViewerPane(this);
//&&&staticSymbol&&&						}
//&&&staticSymbol&&&					};
//&&&staticSymbol&&&				viewerPane.createControl(getContainer());
//&&&staticSymbol&&&
//&&&staticSymbol&&&				parentViewer = (TreeViewer)viewerPane.getViewer();
//&&&staticSymbol&&&				parentViewer.setAutoExpandLevel(30);
//&&&staticSymbol&&&				parentViewer.setContentProvider(new ReverseAdapterFactoryContentProvider(adapterFactory));
//&&&staticSymbol&&&				parentViewer.setLabelProvider(<%
if (useStyledLabelProvider) {
//&&&staticSymbol&&&%>new <%
//&&&staticSymbol&&&=_DelegatingAdapterFactoryLabelProvider
//&&&staticSymbol&&&%>(<%
}
//&&&staticSymbol&&&%>new <%
//&&&staticSymbol&&&=_AdapterFactoryLabelProvider
//&&&staticSymbol&&&%>(adapterFactory<%
if (useExtendedLabelProvider) {
//&&&staticSymbol&&&%>, parentViewer<%
}
//&&&staticSymbol&&&%>)<%
if (useStyledLabelProvider) {
//&&&staticSymbol&&&%>)<%
}
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&
//&&&staticSymbol&&&				createContextMenuFor(parentViewer);
//&&&staticSymbol&&&				int pageIndex = addPage(viewerPane.getControl());
//&&&staticSymbol&&&				setPageText(pageIndex, getString("_UI_ParentPage_label"));<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			}
//&&&staticSymbol&&&
//&&&staticSymbol&&&			// This is the page for the list viewer
//&&&staticSymbol&&&			//
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&				ViewerPane viewerPane =
//&&&staticSymbol&&&					new ViewerPane(getSite().getPage(), <%
//&&&staticSymbol&&&=genPackage.getEditorClassName()
//&&&staticSymbol&&&%>.this)
//&&&staticSymbol&&&					{
//&&&staticSymbol&&&<%
if (genModel.useClassOverrideAnnotation()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&						@Override
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&						public Viewer createViewer(Composite composite)
//&&&staticSymbol&&&						{
//&&&staticSymbol&&&							return new ListViewer(composite);
//&&&staticSymbol&&&						}
//&&&staticSymbol&&&<%
if (genModel.useClassOverrideAnnotation()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&						@Override
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&						public void requestActivation()
//&&&staticSymbol&&&						{
//&&&staticSymbol&&&							super.requestActivation();
//&&&staticSymbol&&&							setCurrentViewerPane(this);
//&&&staticSymbol&&&						}
//&&&staticSymbol&&&					};
//&&&staticSymbol&&&				viewerPane.createControl(getContainer());
//&&&staticSymbol&&&				listViewer = (ListViewer)viewerPane.getViewer();
//&&&staticSymbol&&&				listViewer.setContentProvider(new AdapterFactoryContentProvider(adapterFactory));
//&&&staticSymbol&&&				listViewer.setLabelProvider(<%
if (useStyledLabelProvider) {
//&&&staticSymbol&&&%>new <%
//&&&staticSymbol&&&=_DelegatingAdapterFactoryLabelProvider
//&&&staticSymbol&&&%>(<%
}
//&&&staticSymbol&&&%>new <%
//&&&staticSymbol&&&=_AdapterFactoryLabelProvider
//&&&staticSymbol&&&%>(adapterFactory<%
if (useExtendedLabelProvider) {
//&&&staticSymbol&&&%>, listViewer<%
}
//&&&staticSymbol&&&%>)<%
if (useStyledLabelProvider) {
//&&&staticSymbol&&&%>)<%
}
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&
//&&&staticSymbol&&&				createContextMenuFor(listViewer);
//&&&staticSymbol&&&				int pageIndex = addPage(viewerPane.getControl());
//&&&staticSymbol&&&				setPageText(pageIndex, getString("_UI_ListPage_label"));<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			}
//&&&staticSymbol&&&
//&&&staticSymbol&&&			// This is the page for the tree viewer
//&&&staticSymbol&&&			//
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&				ViewerPane viewerPane =
//&&&staticSymbol&&&					new ViewerPane(getSite().getPage(), <%
//&&&staticSymbol&&&=genPackage.getEditorClassName()
//&&&staticSymbol&&&%>.this)
//&&&staticSymbol&&&					{
//&&&staticSymbol&&&<%
if (genModel.useClassOverrideAnnotation()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&						@Override
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&						public Viewer createViewer(Composite composite)
//&&&staticSymbol&&&						{
//&&&staticSymbol&&&							return new TreeViewer(composite);
//&&&staticSymbol&&&						}
//&&&staticSymbol&&&<%
if (genModel.useClassOverrideAnnotation()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&						@Override
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&						public void requestActivation()
//&&&staticSymbol&&&						{
//&&&staticSymbol&&&							super.requestActivation();
//&&&staticSymbol&&&							setCurrentViewerPane(this);
//&&&staticSymbol&&&						}
//&&&staticSymbol&&&					};
//&&&staticSymbol&&&				viewerPane.createControl(getContainer());
//&&&staticSymbol&&&				treeViewer = (TreeViewer)viewerPane.getViewer();
//&&&staticSymbol&&&				treeViewer.setContentProvider(new AdapterFactoryContentProvider(adapterFactory));
//&&&staticSymbol&&&				treeViewer.setLabelProvider(<%
if (useStyledLabelProvider) {
//&&&staticSymbol&&&%>new <%
//&&&staticSymbol&&&=_DelegatingAdapterFactoryLabelProvider
//&&&staticSymbol&&&%>(<%
}
//&&&staticSymbol&&&%><%
if (genModel.getDecoration() != GenDecoration.NONE) {
//&&&staticSymbol&&&%>new <%
//&&&staticSymbol&&&=_DecoratingColumLabelProvider
//&&&staticSymbol&&&%>(<%
}
//&&&staticSymbol&&&%>new <%
//&&&staticSymbol&&&=_AdapterFactoryLabelProvider
//&&&staticSymbol&&&%>(adapterFactory<%
if (useExtendedLabelProvider) {
//&&&staticSymbol&&&%>, treeViewer<%
}
//&&&staticSymbol&&&%>)<%
if (genModel.getDecoration() != GenDecoration.NONE) {
//&&&staticSymbol&&&%>, new <%
//&&&staticSymbol&&&=_DiagnosticDecorator
//&&&staticSymbol&&&%>(editingDomain<%
if (genModel.getDecoration() == GenDecoration.MANUAL) {
//&&&staticSymbol&&&%>.getResourceSet()<%
}
//&&&staticSymbol&&&%>, treeViewer))<%
}
//&&&staticSymbol&&&%><%
if (useStyledLabelProvider) {
//&&&staticSymbol&&&%>)<%
}
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&
//&&&staticSymbol&&&				new AdapterFactoryTreeEditor(treeViewer.getTree(), adapterFactory);
//&&&staticSymbol&&&<%
if (genModel.getDecoration() != GenDecoration.NONE) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				new <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.common.ui.viewer.ColumnViewerInformationControlToolTipSupport")
//&&&staticSymbol&&&%>(treeViewer, new <%
//&&&staticSymbol&&&=_DiagnosticDecorator
//&&&staticSymbol&&&%>.EditingDomainLocationListener(editingDomain, treeViewer));
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&				createContextMenuFor(treeViewer);
//&&&staticSymbol&&&				int pageIndex = addPage(viewerPane.getControl());
//&&&staticSymbol&&&				setPageText(pageIndex, getString("_UI_TreePage_label"));<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			}
//&&&staticSymbol&&&
//&&&staticSymbol&&&			// This is the page for the table viewer.
//&&&staticSymbol&&&			//
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&				ViewerPane viewerPane =
//&&&staticSymbol&&&					new ViewerPane(getSite().getPage(), <%
//&&&staticSymbol&&&=genPackage.getEditorClassName()
//&&&staticSymbol&&&%>.this)
//&&&staticSymbol&&&					{
//&&&staticSymbol&&&<%
if (genModel.useClassOverrideAnnotation()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&						@Override
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&						public Viewer createViewer(Composite composite)
//&&&staticSymbol&&&						{
//&&&staticSymbol&&&							return new TableViewer(composite);
//&&&staticSymbol&&&						}
//&&&staticSymbol&&&<%
if (genModel.useClassOverrideAnnotation()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&						@Override
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&						public void requestActivation()
//&&&staticSymbol&&&						{
//&&&staticSymbol&&&							super.requestActivation();
//&&&staticSymbol&&&							setCurrentViewerPane(this);
//&&&staticSymbol&&&						}
//&&&staticSymbol&&&					};
//&&&staticSymbol&&&				viewerPane.createControl(getContainer());
//&&&staticSymbol&&&				tableViewer = (TableViewer)viewerPane.getViewer();
//&&&staticSymbol&&&
//&&&staticSymbol&&&				Table table = tableViewer.getTable();
//&&&staticSymbol&&&				TableLayout layout = new TableLayout();
//&&&staticSymbol&&&				table.setLayout(layout);
//&&&staticSymbol&&&				table.setHeaderVisible(true);
//&&&staticSymbol&&&				table.setLinesVisible(true);
//&&&staticSymbol&&&
//&&&staticSymbol&&&				TableColumn objectColumn = new TableColumn(table, SWT.NONE);
//&&&staticSymbol&&&				layout.addColumnData(new ColumnWeightData(3, 100, true));
//&&&staticSymbol&&&				objectColumn.setText(getString("_UI_ObjectColumn_label"));<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				objectColumn.setResizable(true);
//&&&staticSymbol&&&
//&&&staticSymbol&&&				TableColumn selfColumn = new TableColumn(table, SWT.NONE);
//&&&staticSymbol&&&				layout.addColumnData(new ColumnWeightData(2, 100, true));
//&&&staticSymbol&&&				selfColumn.setText(getString("_UI_SelfColumn_label"));<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				selfColumn.setResizable(true);
//&&&staticSymbol&&&
//&&&staticSymbol&&&				tableViewer.setColumnProperties(new String [] {"a", "b"});<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genModel.getNonNLS(2)
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				tableViewer.setContentProvider(new AdapterFactoryContentProvider(adapterFactory));
//&&&staticSymbol&&&				tableViewer.setLabelProvider(<%
if (useStyledLabelProvider) {
//&&&staticSymbol&&&%>new <%
//&&&staticSymbol&&&=_DelegatingAdapterFactoryLabelProvider
//&&&staticSymbol&&&%>(<%
}
//&&&staticSymbol&&&%><%
if (genModel.getDecoration() != GenDecoration.NONE) {
//&&&staticSymbol&&&%>new <%
//&&&staticSymbol&&&=_DecoratingColumLabelProvider
//&&&staticSymbol&&&%>(<%
}
//&&&staticSymbol&&&%>new <%
//&&&staticSymbol&&&=_AdapterFactoryLabelProvider
//&&&staticSymbol&&&%>(adapterFactory<%
if (useExtendedLabelProvider) {
//&&&staticSymbol&&&%>, tableViewer<%
}
//&&&staticSymbol&&&%>)<%
if (genModel.getDecoration() != GenDecoration.NONE) {
//&&&staticSymbol&&&%>, new <%
//&&&staticSymbol&&&=_DiagnosticDecorator
//&&&staticSymbol&&&%>(editingDomain<%
if (genModel.getDecoration() == GenDecoration.MANUAL) {
//&&&staticSymbol&&&%>.getResourceSet()<%
}
//&&&staticSymbol&&&%>, tableViewer<%
if (genModel.getDecoration() == GenDecoration.LIVE) {
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=genPackage.getImportedEditorPluginClassName()
//&&&staticSymbol&&&%>.getPlugin().getDialogSettings()<%
}
//&&&staticSymbol&&&%>))<%
}
//&&&staticSymbol&&&%><%
if (useStyledLabelProvider) {
//&&&staticSymbol&&&%>)<%
}
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
if (genModel.getDecoration() != GenDecoration.NONE) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				new <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.common.ui.viewer.ColumnViewerInformationControlToolTipSupport")
//&&&staticSymbol&&&%>(tableViewer, new <%
//&&&staticSymbol&&&=_DiagnosticDecorator
//&&&staticSymbol&&&%>.EditingDomainLocationListener(editingDomain, tableViewer));
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				createContextMenuFor(tableViewer);
//&&&staticSymbol&&&				int pageIndex = addPage(viewerPane.getControl());
//&&&staticSymbol&&&				setPageText(pageIndex, getString("_UI_TablePage_label"));<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			}
//&&&staticSymbol&&&
//&&&staticSymbol&&&			// This is the page for the table tree viewer.
//&&&staticSymbol&&&			//
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&				ViewerPane viewerPane =
//&&&staticSymbol&&&					new ViewerPane(getSite().getPage(), <%
//&&&staticSymbol&&&=genPackage.getEditorClassName()
//&&&staticSymbol&&&%>.this)
//&&&staticSymbol&&&					{
//&&&staticSymbol&&&<%
if (genModel.useClassOverrideAnnotation()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&						@Override
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&						public Viewer createViewer(Composite composite)
//&&&staticSymbol&&&						{
//&&&staticSymbol&&&							return new TreeViewer(composite);
//&&&staticSymbol&&&						}
//&&&staticSymbol&&&<%
if (genModel.useClassOverrideAnnotation()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&						@Override
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&						public void requestActivation()
//&&&staticSymbol&&&						{
//&&&staticSymbol&&&							super.requestActivation();
//&&&staticSymbol&&&							setCurrentViewerPane(this);
//&&&staticSymbol&&&						}
//&&&staticSymbol&&&					};
//&&&staticSymbol&&&				viewerPane.createControl(getContainer());
//&&&staticSymbol&&&
//&&&staticSymbol&&&				treeViewerWithColumns = (TreeViewer)viewerPane.getViewer();
//&&&staticSymbol&&&
//&&&staticSymbol&&&				Tree tree = treeViewerWithColumns.getTree();
//&&&staticSymbol&&&				tree.setLayoutData(new FillLayout());
//&&&staticSymbol&&&				tree.setHeaderVisible(true);
//&&&staticSymbol&&&				tree.setLinesVisible(true);
//&&&staticSymbol&&&
//&&&staticSymbol&&&				TreeColumn objectColumn = new TreeColumn(tree, SWT.NONE);
//&&&staticSymbol&&&				objectColumn.setText(getString("_UI_ObjectColumn_label"));<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				objectColumn.setResizable(true);
//&&&staticSymbol&&&				objectColumn.setWidth(250);
//&&&staticSymbol&&&
//&&&staticSymbol&&&				TreeColumn selfColumn = new TreeColumn(tree, SWT.NONE);
//&&&staticSymbol&&&				selfColumn.setText(getString("_UI_SelfColumn_label"));<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				selfColumn.setResizable(true);
//&&&staticSymbol&&&				selfColumn.setWidth(200);
//&&&staticSymbol&&&
//&&&staticSymbol&&&				treeViewerWithColumns.setColumnProperties(new String [] {"a", "b"});<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genModel.getNonNLS(2)
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				treeViewerWithColumns.setContentProvider(new AdapterFactoryContentProvider(adapterFactory));
//&&&staticSymbol&&&				treeViewerWithColumns.setLabelProvider(<%
if (useStyledLabelProvider) {
//&&&staticSymbol&&&%>new <%
//&&&staticSymbol&&&=_DelegatingAdapterFactoryLabelProvider
//&&&staticSymbol&&&%>(<%
}
//&&&staticSymbol&&&%><%
if (genModel.getDecoration() != GenDecoration.NONE) {
//&&&staticSymbol&&&%>new <%
//&&&staticSymbol&&&=_DecoratingColumLabelProvider
//&&&staticSymbol&&&%>(<%
}
//&&&staticSymbol&&&%>new <%
//&&&staticSymbol&&&=_AdapterFactoryLabelProvider
//&&&staticSymbol&&&%>(adapterFactory<%
if (useExtendedLabelProvider) {
//&&&staticSymbol&&&%>, treeViewerWithColumns<%
}
//&&&staticSymbol&&&%>)<%
if (genModel.getDecoration() != GenDecoration.NONE) {
//&&&staticSymbol&&&%>, new <%
//&&&staticSymbol&&&=_DiagnosticDecorator
//&&&staticSymbol&&&%>(editingDomain<%
if (genModel.getDecoration() == GenDecoration.MANUAL) {
//&&&staticSymbol&&&%>.getResourceSet()<%
}
//&&&staticSymbol&&&%>, treeViewerWithColumns<%
if (genModel.getDecoration() == GenDecoration.LIVE) {
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=genPackage.getImportedEditorPluginClassName()
//&&&staticSymbol&&&%>.getPlugin().getDialogSettings()<%
}
//&&&staticSymbol&&&%>))<%
}
//&&&staticSymbol&&&%><%
if (useStyledLabelProvider) {
//&&&staticSymbol&&&%>)<%
}
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
if (genModel.getDecoration() != GenDecoration.NONE) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				new <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.common.ui.viewer.ColumnViewerInformationControlToolTipSupport")
//&&&staticSymbol&&&%>(treeViewerWithColumns, new <%
//&&&staticSymbol&&&=_DiagnosticDecorator
//&&&staticSymbol&&&%>.EditingDomainLocationListener(editingDomain, treeViewerWithColumns));
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				createContextMenuFor(treeViewerWithColumns);
//&&&staticSymbol&&&				int pageIndex = addPage(viewerPane.getControl());
//&&&staticSymbol&&&				setPageText(pageIndex, getString("_UI_TreeWithColumnsPage_label"));<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			}
//&&&staticSymbol&&&<%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			Tree tree = new Tree(getContainer(), SWT.MULTI);
//&&&staticSymbol&&&			selectionViewer = new TreeViewer(tree);
//&&&staticSymbol&&&			setCurrentViewer(selectionViewer);
//&&&staticSymbol&&&
//&&&staticSymbol&&&			selectionViewer.setContentProvider(new AdapterFactoryContentProvider(adapterFactory));
//&&&staticSymbol&&&			selectionViewer.setLabelProvider(<%
if (useStyledLabelProvider) {
//&&&staticSymbol&&&%>new <%
//&&&staticSymbol&&&=_DelegatingAdapterFactoryLabelProvider
//&&&staticSymbol&&&%>(<%
}
//&&&staticSymbol&&&%><%
if (genModel.getDecoration() != GenDecoration.NONE) {
//&&&staticSymbol&&&%>new <%
//&&&staticSymbol&&&=_DecoratingColumLabelProvider
//&&&staticSymbol&&&%>(<%
}
//&&&staticSymbol&&&%>new <%
//&&&staticSymbol&&&=_AdapterFactoryLabelProvider
//&&&staticSymbol&&&%>(adapterFactory<%
if (useExtendedLabelProvider) {
//&&&staticSymbol&&&%>, selectionViewer<%
}
//&&&staticSymbol&&&%>)<%
if (genModel.getDecoration() != GenDecoration.NONE) {
//&&&staticSymbol&&&%>, new <%
//&&&staticSymbol&&&=_DiagnosticDecorator
//&&&staticSymbol&&&%>(editingDomain<%
if (genModel.getDecoration() == GenDecoration.MANUAL) {
//&&&staticSymbol&&&%>.getResourceSet()<%
}
//&&&staticSymbol&&&%>, selectionViewer<%
if (genModel.getDecoration() == GenDecoration.LIVE) {
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=genPackage.getImportedEditorPluginClassName()
//&&&staticSymbol&&&%>.getPlugin().getDialogSettings()<%
}
//&&&staticSymbol&&&%>))<%
}
//&&&staticSymbol&&&%><%
if (useStyledLabelProvider) {
//&&&staticSymbol&&&%>)<%
}
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&			selectionViewer.setInput(editingDomain.getResourceSet());
//&&&staticSymbol&&&			selectionViewer.setSelection(new StructuredSelection(editingDomain.getResourceSet().getResources().get(0)), true);
//&&&staticSymbol&&&
//&&&staticSymbol&&&			new AdapterFactoryTreeEditor(selectionViewer.getTree(), adapterFactory);
//&&&staticSymbol&&&<%
if (genModel.getDecoration() != GenDecoration.NONE) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			new <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.common.ui.viewer.ColumnViewerInformationControlToolTipSupport")
//&&&staticSymbol&&&%>(selectionViewer, new <%
//&&&staticSymbol&&&=_DiagnosticDecorator
//&&&staticSymbol&&&%>.EditingDomainLocationListener(editingDomain, selectionViewer));
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&			createContextMenuFor(selectionViewer);
//&&&staticSymbol&&&			int pageIndex = addPage(tree);
//&&&staticSymbol&&&			setPageText(pageIndex, getString("_UI_SelectionPage_label"));<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&			getSite().getShell().getDisplay().asyncExec
//&&&staticSymbol&&&				(new Runnable()
//&&&staticSymbol&&&				 {
//&&&staticSymbol&&&					 public void run()
//&&&staticSymbol&&&					 {
//&&&staticSymbol&&&						 setActivePage(0);
//&&&staticSymbol&&&					 }
//&&&staticSymbol&&&				 });
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&
//&&&staticSymbol&&&		// Ensures that this editor will only display the page's tab
//&&&staticSymbol&&&		// area if there are more than one page
//&&&staticSymbol&&&		//
//&&&staticSymbol&&&		getContainer().addControlListener
//&&&staticSymbol&&&			(new ControlAdapter()
//&&&staticSymbol&&&			 {
//&&&staticSymbol&&&				boolean guard = false;
//&&&staticSymbol&&&<%
if (genModel.useClassOverrideAnnotation()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				@Override
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				public void controlResized(ControlEvent event)
//&&&staticSymbol&&&				{
//&&&staticSymbol&&&					if (!guard)
//&&&staticSymbol&&&					{
//&&&staticSymbol&&&						guard = true;
//&&&staticSymbol&&&						hideTabs();
//&&&staticSymbol&&&						guard = false;
//&&&staticSymbol&&&					}
//&&&staticSymbol&&&				}
//&&&staticSymbol&&&			 });
//&&&staticSymbol&&&
//&&&staticSymbol&&&		getSite().getShell().getDisplay().asyncExec
//&&&staticSymbol&&&			(new Runnable()
//&&&staticSymbol&&&			 {
//&&&staticSymbol&&&				 public void run()
//&&&staticSymbol&&&				 {
//&&&staticSymbol&&&					 updateProblemIndication();
//&&&staticSymbol&&&				 }
//&&&staticSymbol&&&			 });
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * If there is just one page in the multi-page editor part,
//&&&staticSymbol&&&	 * this hides the single tab at the bottom.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	protected void hideTabs()
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		if (getPageCount() <= 1)
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			setPageText(0, "");<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			if (getContainer() instanceof CTabFolder)
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&				((CTabFolder)getContainer()).setTabHeight(1);
//&&&staticSymbol&&&				Point point = getContainer().getSize();
//&&&staticSymbol&&&				getContainer().setSize(point.x, point.y + 6);
//&&&staticSymbol&&&			}
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * If there is more than one page in the multi-page editor part,
//&&&staticSymbol&&&	 * this shows the tabs at the bottom.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	protected void showTabs()
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		if (getPageCount() > 1)
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			setPageText(0, getString("_UI_SelectionPage_label"));<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			if (getContainer() instanceof CTabFolder)
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&				((CTabFolder)getContainer()).setTabHeight(SWT.DEFAULT);
//&&&staticSymbol&&&				Point point = getContainer().getSize();
//&&&staticSymbol&&&				getContainer().setSize(point.x, point.y - 6);
//&&&staticSymbol&&&			}
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * This is used to track the active viewer.
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
//&&&staticSymbol&&&	protected void pageChange(int pageIndex)
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		super.pageChange(pageIndex);
//&&&staticSymbol&&&
//&&&staticSymbol&&&		if (contentOutlinePage != null)
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			handleContentOutlineSelection(contentOutlinePage.getSelection());
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * This is how the framework determines which interfaces we implement.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&<%
if (genModel.useGenerics()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	@SuppressWarnings("<%
if (genModel.getRuntimeVersion().getValue() >= GenRuntimeVersion.EMF26_VALUE) {
//&&&staticSymbol&&&%>rawtypes<%
} else {
//&&&staticSymbol&&&%>unchecked<%
}
//&&&staticSymbol&&&%>")
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
if (genModel.useClassOverrideAnnotation()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	@Override
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	public Object getAdapter(Class key)
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		if (key.equals(IContentOutlinePage.class))
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			return showOutlineView() ? getContentOutlinePage() : null;
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&		else if (key.equals(IPropertySheetPage.class))
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			return getPropertySheetPage();
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&<%
if (!genModel.isRichClientPlatform()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		else if (key.equals(IGotoMarker.class))
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			return this;
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		else
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			return super.getAdapter(key);
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * This accesses a cached version of the content outliner.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	public IContentOutlinePage getContentOutlinePage()
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		if (contentOutlinePage == null)
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			// The content outline is just a tree.
//&&&staticSymbol&&&			//
//&&&staticSymbol&&&			class MyContentOutlinePage extends ContentOutlinePage
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&<%
if (genModel.useClassOverrideAnnotation()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				@Override
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				public void createControl(Composite parent)
//&&&staticSymbol&&&				{
//&&&staticSymbol&&&					super.createControl(parent);
//&&&staticSymbol&&&					contentOutlineViewer = getTreeViewer();
//&&&staticSymbol&&&					contentOutlineViewer.addSelectionChangedListener(this);
//&&&staticSymbol&&&
//&&&staticSymbol&&&					// Set up the tree viewer.
//&&&staticSymbol&&&					//
//&&&staticSymbol&&&					contentOutlineViewer.setContentProvider(new AdapterFactoryContentProvider(adapterFactory));
//&&&staticSymbol&&&					contentOutlineViewer.setLabelProvider(<%
if (useStyledLabelProvider) {
//&&&staticSymbol&&&%>new <%
//&&&staticSymbol&&&=_DelegatingAdapterFactoryLabelProvider
//&&&staticSymbol&&&%>(<%
}
//&&&staticSymbol&&&%><%
if (genModel.getDecoration() != GenDecoration.NONE) {
//&&&staticSymbol&&&%>new <%
//&&&staticSymbol&&&=_DecoratingColumLabelProvider
//&&&staticSymbol&&&%>(<%
}
//&&&staticSymbol&&&%>new <%
//&&&staticSymbol&&&=_AdapterFactoryLabelProvider
//&&&staticSymbol&&&%>(adapterFactory<%
if (useExtendedLabelProvider) {
//&&&staticSymbol&&&%>, contentOutlineViewer<%
}
//&&&staticSymbol&&&%>)<%
if (genModel.getDecoration() != GenDecoration.NONE) {
//&&&staticSymbol&&&%>, new <%
//&&&staticSymbol&&&=_DiagnosticDecorator
//&&&staticSymbol&&&%>(editingDomain<%
if (genModel.getDecoration() == GenDecoration.MANUAL) {
//&&&staticSymbol&&&%>.getResourceSet()<%
}
//&&&staticSymbol&&&%>, contentOutlineViewer<%
if (genModel.getDecoration() == GenDecoration.LIVE) {
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=genPackage.getImportedEditorPluginClassName()
//&&&staticSymbol&&&%>.getPlugin().getDialogSettings()<%
}
//&&&staticSymbol&&&%>))<%
}
//&&&staticSymbol&&&%><%
if (useStyledLabelProvider) {
//&&&staticSymbol&&&%>)<%
}
//&&&staticSymbol&&&%>);
//&&&staticSymbol&&&					contentOutlineViewer.setInput(editingDomain.getResourceSet());
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
if (genModel.getDecoration() != GenDecoration.NONE) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&					new <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.common.ui.viewer.ColumnViewerInformationControlToolTipSupport")
//&&&staticSymbol&&&%>(contentOutlineViewer, new <%
//&&&staticSymbol&&&=_DiagnosticDecorator
//&&&staticSymbol&&&%>.EditingDomainLocationListener(editingDomain, contentOutlineViewer));
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&					// Make sure our popups work.
//&&&staticSymbol&&&					//
//&&&staticSymbol&&&					createContextMenuFor(contentOutlineViewer);
//&&&staticSymbol&&&
//&&&staticSymbol&&&					if (!editingDomain.getResourceSet().getResources().isEmpty())
//&&&staticSymbol&&&					{
//&&&staticSymbol&&&					  // Select the root object in the view.
//&&&staticSymbol&&&					  //
//&&&staticSymbol&&&					  contentOutlineViewer.setSelection(new StructuredSelection(editingDomain.getResourceSet().getResources().get(0)), true);
//&&&staticSymbol&&&					}
//&&&staticSymbol&&&				}
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
if (genModel.useClassOverrideAnnotation()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				@Override
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				public void makeContributions(IMenuManager menuManager, IToolBarManager toolBarManager, IStatusLineManager statusLineManager)
//&&&staticSymbol&&&				{
//&&&staticSymbol&&&					super.makeContributions(menuManager, toolBarManager, statusLineManager);
//&&&staticSymbol&&&					contentOutlineStatusLineManager = statusLineManager;
//&&&staticSymbol&&&				}
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
if (genModel.useClassOverrideAnnotation()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				@Override
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				public void setActionBars(IActionBars actionBars)
//&&&staticSymbol&&&				{
//&&&staticSymbol&&&					super.setActionBars(actionBars);
//&&&staticSymbol&&&					getActionBarContributor().shareGlobalActions(this, actionBars);
//&&&staticSymbol&&&				}
//&&&staticSymbol&&&			}
//&&&staticSymbol&&&
//&&&staticSymbol&&&			contentOutlinePage = new MyContentOutlinePage();
//&&&staticSymbol&&&
//&&&staticSymbol&&&			// Listen to selection so that we can handle it is a special way.
//&&&staticSymbol&&&			//
//&&&staticSymbol&&&			contentOutlinePage.addSelectionChangedListener
//&&&staticSymbol&&&				(new ISelectionChangedListener()
//&&&staticSymbol&&&				 {
//&&&staticSymbol&&&					 // This ensures that we handle selections correctly.
//&&&staticSymbol&&&					 //
//&&&staticSymbol&&&					 public void selectionChanged(SelectionChangedEvent event)
//&&&staticSymbol&&&					 {
//&&&staticSymbol&&&						 handleContentOutlineSelection(event.getSelection());
//&&&staticSymbol&&&					 }
//&&&staticSymbol&&&				 });
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&
//&&&staticSymbol&&&		return contentOutlinePage;
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * This accesses a cached version of the property sheet.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	public IPropertySheetPage getPropertySheetPage()
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		PropertySheetPage propertySheetPage =
//&&&staticSymbol&&&			new ExtendedPropertySheetPage(editingDomain<%
if (genModel.getDecoration() == GenDecoration.MANUAL) {
//&&&staticSymbol&&&%>, ExtendedPropertySheetPage.Decoration.MANUAL<%
} else if (genModel.getDecoration() == GenDecoration.LIVE) {
//&&&staticSymbol&&&%>, ExtendedPropertySheetPage.Decoration.LIVE, <%
//&&&staticSymbol&&&=genPackage.getImportedEditorPluginClassName()
//&&&staticSymbol&&&%>.getPlugin().getDialogSettings()<%
}
//&&&staticSymbol&&&%>)
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&<%
if (genModel.useClassOverrideAnnotation()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				@Override
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				public void setSelectionToViewer(<%
//&&&staticSymbol&&&=_ListOfAnything
//&&&staticSymbol&&&%> selection)
//&&&staticSymbol&&&				{
//&&&staticSymbol&&&					<%
//&&&staticSymbol&&&=genPackage.getEditorClassName()
//&&&staticSymbol&&&%>.this.setSelectionToViewer(selection);
//&&&staticSymbol&&&					<%
//&&&staticSymbol&&&=genPackage.getEditorClassName()
//&&&staticSymbol&&&%>.this.setFocus();
//&&&staticSymbol&&&				}
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
if (genModel.useClassOverrideAnnotation()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				@Override
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				public void setActionBars(IActionBars actionBars)
//&&&staticSymbol&&&				{
//&&&staticSymbol&&&					super.setActionBars(actionBars);
//&&&staticSymbol&&&					getActionBarContributor().shareGlobalActions(this, actionBars);
//&&&staticSymbol&&&				}
//&&&staticSymbol&&&			};
//&&&staticSymbol&&&		propertySheetPage.setPropertySourceProvider(new AdapterFactoryContentProvider(adapterFactory));
//&&&staticSymbol&&&		propertySheetPages.add(propertySheetPage);
//&&&staticSymbol&&&
//&&&staticSymbol&&&		return propertySheetPage;
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * This deals with how we want selection in the outliner to affect the other views.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	public void handleContentOutlineSelection(ISelection selection)
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&<%
if (genPackage.isMultipleEditorPages()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		if (currentViewerPane != null && !selection.isEmpty() && selection instanceof IStructuredSelection)
//&&&staticSymbol&&&<%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		if (selectionViewer != null && !selection.isEmpty() && selection instanceof IStructuredSelection)
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			Iterator<%
if (genModel.useGenerics()) {
//&&&staticSymbol&&&%><?><%
}
//&&&staticSymbol&&&%> selectedElements = ((IStructuredSelection)selection).iterator();
//&&&staticSymbol&&&			if (selectedElements.hasNext())
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&				// Get the first selected element.
//&&&staticSymbol&&&				//
//&&&staticSymbol&&&				Object selectedElement = selectedElements.next();
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
if (genPackage.isMultipleEditorPages()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				// If it's the selection viewer, then we want it to select the same selection as this selection.
//&&&staticSymbol&&&				//
//&&&staticSymbol&&&				if (currentViewerPane.getViewer() == selectionViewer)
//&&&staticSymbol&&&				{
//&&&staticSymbol&&&					<%
//&&&staticSymbol&&&=_ArrayListOfObject
//&&&staticSymbol&&&%> selectionList = new <%
//&&&staticSymbol&&&=_ArrayListOfObject
//&&&staticSymbol&&&%>();
//&&&staticSymbol&&&					selectionList.add(selectedElement);
//&&&staticSymbol&&&					while (selectedElements.hasNext())
//&&&staticSymbol&&&					{
//&&&staticSymbol&&&						selectionList.add(selectedElements.next());
//&&&staticSymbol&&&					}
//&&&staticSymbol&&&
//&&&staticSymbol&&&					// Set the selection to the widget.
//&&&staticSymbol&&&					//
//&&&staticSymbol&&&					selectionViewer.setSelection(new StructuredSelection(selectionList));
//&&&staticSymbol&&&				}
//&&&staticSymbol&&&				else
//&&&staticSymbol&&&				{
//&&&staticSymbol&&&					// Set the input to the widget.
//&&&staticSymbol&&&					//
//&&&staticSymbol&&&					if (currentViewerPane.getViewer().getInput() != selectedElement)
//&&&staticSymbol&&&					{
//&&&staticSymbol&&&						currentViewerPane.getViewer().setInput(selectedElement);
//&&&staticSymbol&&&						currentViewerPane.setTitle(selectedElement);
//&&&staticSymbol&&&					}
//&&&staticSymbol&&&				}
//&&&staticSymbol&&&<%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				<%
//&&&staticSymbol&&&=_ArrayListOfObject
//&&&staticSymbol&&&%> selectionList = new <%
//&&&staticSymbol&&&=_ArrayListOfObject
//&&&staticSymbol&&&%>();
//&&&staticSymbol&&&				selectionList.add(selectedElement);
//&&&staticSymbol&&&				while (selectedElements.hasNext())
//&&&staticSymbol&&&				{
//&&&staticSymbol&&&					selectionList.add(selectedElements.next());
//&&&staticSymbol&&&				}
//&&&staticSymbol&&&
//&&&staticSymbol&&&				// Set the selection to the widget.
//&&&staticSymbol&&&				//
//&&&staticSymbol&&&				selectionViewer.setSelection(new StructuredSelection(selectionList));
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			}
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * This is for implementing {@link IEditorPart} and simply tests the command stack.
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
//&&&staticSymbol&&&	public boolean isDirty()
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		return ((BasicCommandStack)editingDomain.getCommandStack()).isSaveNeeded();
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * This is for implementing {@link IEditorPart} and simply saves the model file.
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
//&&&staticSymbol&&&	public void doSave(IProgressMonitor progressMonitor)
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		// Save only resources that have actually changed.
//&&&staticSymbol&&&		//
//&&&staticSymbol&&&		final <%
//&&&staticSymbol&&&=_MapOfObjectToObject
//&&&staticSymbol&&&%> saveOptions = new <%
//&&&staticSymbol&&&=_HashMapOfObjectToObject
//&&&staticSymbol&&&%>();
//&&&staticSymbol&&&<%
if (genModel.getRuntimeVersion().getValue() >= GenRuntimeVersion.EMF23_VALUE) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		saveOptions.put(Resource.OPTION_SAVE_ONLY_IF_CHANGED, Resource.OPTION_SAVE_ONLY_IF_CHANGED_MEMORY_BUFFER);
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
if (genModel.getRuntimeVersion().getValue() >= GenRuntimeVersion.EMF29_VALUE) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		saveOptions.put(Resource.OPTION_LINE_DELIMITER, Resource.OPTION_LINE_DELIMITER_UNSPECIFIED);
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&		// Do the work within an operation because this is a long running activity that modifies the workbench.
//&&&staticSymbol&&&		//
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&				// This is the method that gets invoked when the operation runs.
//&&&staticSymbol&&&				//
//&&&staticSymbol&&&<%
if (!genModel.isRichClientPlatform() && genModel.useClassOverrideAnnotation()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				@Override
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				public void <%
//&&&staticSymbol&&&=operationMethodName
//&&&staticSymbol&&&%>(IProgressMonitor monitor)
//&&&staticSymbol&&&				{
//&&&staticSymbol&&&					// Save the resources to the file system.
//&&&staticSymbol&&&					//
//&&&staticSymbol&&&					boolean first = true;
//&&&staticSymbol&&&<%
if (genModel.useGenerics()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&					for (Resource resource : editingDomain.getResourceSet().getResources())
//&&&staticSymbol&&&<%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&					for (Iterator i = editingDomain.getResourceSet().getResources().iterator(); i.hasNext(); )
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&					{
//&&&staticSymbol&&&<%
if (!genModel.useGenerics()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&						Resource resource = (Resource)i.next();
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&						if ((first || !resource.getContents().isEmpty() || isPersisted(resource)) && !editingDomain.isReadOnly(resource))
//&&&staticSymbol&&&						{
//&&&staticSymbol&&&							try
//&&&staticSymbol&&&							{
//&&&staticSymbol&&&<%
if (genModel.getRuntimeVersion().getValue() >= GenRuntimeVersion.EMF24_VALUE) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&								long timeStamp = resource.getTimeStamp();
//&&&staticSymbol&&&								resource.save(saveOptions);
//&&&staticSymbol&&&								if (resource.getTimeStamp() != timeStamp)
//&&&staticSymbol&&&								{
//&&&staticSymbol&&&									savedResources.add(resource);
//&&&staticSymbol&&&								}
//&&&staticSymbol&&&<%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&								resource.save(saveOptions);
//&&&staticSymbol&&&								savedResources.add(resource);
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&							}
//&&&staticSymbol&&&							catch (Exception exception)
//&&&staticSymbol&&&							{
//&&&staticSymbol&&&								resourceToDiagnosticMap.put(resource, analyzeResourceProblems(resource, exception));
//&&&staticSymbol&&&							}
//&&&staticSymbol&&&							first = false;
//&&&staticSymbol&&&						}
//&&&staticSymbol&&&					}
//&&&staticSymbol&&&				}
//&&&staticSymbol&&&			};
//&&&staticSymbol&&&
//&&&staticSymbol&&&		updateProblemIndication = false;
//&&&staticSymbol&&&		try
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			// This runs the options, and shows progress.
//&&&staticSymbol&&&			//
//&&&staticSymbol&&&			new ProgressMonitorDialog(getSite().getShell()).run(true, false, operation);
//&&&staticSymbol&&&
//&&&staticSymbol&&&			// Refresh the necessary state.
//&&&staticSymbol&&&			//
//&&&staticSymbol&&&			((BasicCommandStack)editingDomain.getCommandStack()).saveIsDone();
//&&&staticSymbol&&&			firePropertyChange(IEditorPart.PROP_DIRTY);
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&		catch (Exception exception)
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			// Something went wrong that shouldn't.
//&&&staticSymbol&&&			//
//&&&staticSymbol&&&			<%
//&&&staticSymbol&&&=genPackage.getImportedEditorPluginClassName()
//&&&staticSymbol&&&%>.INSTANCE.log(exception);
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&		updateProblemIndication = true;
//&&&staticSymbol&&&		updateProblemIndication();
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * This returns whether something has been persisted to the URI of the specified resource.
//&&&staticSymbol&&&	 * The implementation uses the URI converter from the editor's resource set to try to open an input stream.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	protected boolean isPersisted(Resource resource)
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		boolean result = false;
//&&&staticSymbol&&&		try
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			InputStream stream = editingDomain.getResourceSet().getURIConverter().createInputStream(resource.getURI());
//&&&staticSymbol&&&			if (stream != null)
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&				result = true;
//&&&staticSymbol&&&				stream.close();
//&&&staticSymbol&&&			}
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&		catch (IOException e)
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			// Ignore
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&		return result;
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * This always returns true because it is not currently supported.
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
//&&&staticSymbol&&&	public boolean isSaveAsAllowed()
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		return true;
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * This also changes the editor's input.
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
//&&&staticSymbol&&&	public void doSaveAs()
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&<%
if (genModel.isRichClientPlatform()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
if (genModel.isRichAjaxPlatform()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		new <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.common.ui.dialogs.ResourceDialog")
//&&&staticSymbol&&&%>(getSite().getShell(), null, SWT.NONE)
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&    <%
if (genModel.useClassOverrideAnnotation()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				@Override
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				protected boolean isSave()
//&&&staticSymbol&&&				{
//&&&staticSymbol&&&					return true;
//&&&staticSymbol&&&				}
//&&&staticSymbol&&&
//&&&staticSymbol&&&    <%
if (genModel.useClassOverrideAnnotation()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				@Override
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				protected boolean processResources()
//&&&staticSymbol&&&				{
//&&&staticSymbol&&&					<%
//&&&staticSymbol&&&*%%storeSymbol%%*0
//&&&staticSymbol&&&%> uris = getURIs();
//&&&staticSymbol&&&					if (uris.size() > 0)
//&&&staticSymbol&&&					{
//&&&staticSymbol&&&						URI uri = <%
//&&&staticSymbol&&&*%%storeSymbol%%*1
//&&&staticSymbol&&&%>uris.get(0);
//&&&staticSymbol&&&						doSaveAs(uri, new <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.common.ui.URIEditorInput")
//&&&staticSymbol&&&%>(uri));
//&&&staticSymbol&&&						return true;
//&&&staticSymbol&&&					}
//&&&staticSymbol&&&					else
//&&&staticSymbol&&&					{
//&&&staticSymbol&&&						return false;
//&&&staticSymbol&&&					}
//&&&staticSymbol&&&				}
//&&&staticSymbol&&&			}.open();
//&&&staticSymbol&&&  <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		String[] filters = <%
if (!genModel.useGenerics()) {
//&&&staticSymbol&&&%>(String[])<%
}
//&&&staticSymbol&&&%>FILE_EXTENSION_FILTERS.toArray(new String[FILE_EXTENSION_FILTERS.size()]);
//&&&staticSymbol&&&		String[] files = <%
//&&&staticSymbol&&&=genModel.getImportedName(genModel.getQualifiedEditorAdvisorClassName())
//&&&staticSymbol&&&%>.openFilePathDialog(getSite().getShell(), <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.swt.SWT")
//&&&staticSymbol&&&%>.SAVE, filters);
//&&&staticSymbol&&&		if (files.length > 0)
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			URI uri = URI.createFileURI(files[0]);
//&&&staticSymbol&&&			doSaveAs(uri, new <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.common.ui.URIEditorInput")
//&&&staticSymbol&&&%>(uri));
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		SaveAsDialog saveAsDialog = new SaveAsDialog(getSite().getShell());
//&&&staticSymbol&&&		saveAsDialog.open();
//&&&staticSymbol&&&		IPath path = saveAsDialog.getResult();
//&&&staticSymbol&&&		if (path != null)
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(path);
//&&&staticSymbol&&&			if (file != null)
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&				doSaveAs(URI.createPlatformResourceURI(file.getFullPath().toString(), true), new FileEditorInput(file));
//&&&staticSymbol&&&			}
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	protected void doSaveAs(URI uri, IEditorInput editorInput)
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		(<%
if (!genModel.useGenerics()) {
//&&&staticSymbol&&&%>(Resource)<%
}
//&&&staticSymbol&&&%>editingDomain.getResourceSet().getResources().get(0)).setURI(uri);
//&&&staticSymbol&&&		setInputWithNotify(editorInput);
//&&&staticSymbol&&&		setPartName(editorInput.getName());
//&&&staticSymbol&&&		IProgressMonitor progressMonitor =
//&&&staticSymbol&&&			getActionBars().getStatusLineManager() != null ?
//&&&staticSymbol&&&				getActionBars().getStatusLineManager().getProgressMonitor() :
//&&&staticSymbol&&&				new <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.core.runtime.NullProgressMonitor")
//&&&staticSymbol&&&%>();
//&&&staticSymbol&&&		doSave(progressMonitor);
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&<%
if (!genModel.isRichClientPlatform()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	public void gotoMarker(IMarker marker)
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&<%
if (genModel.getRuntimeVersion().getValue() >= GenRuntimeVersion.EMF23_VALUE) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=_ListOfAnything
//&&&staticSymbol&&&%> targetObjects = markerHelper.getTargetObjects(editingDomain, marker);
//&&&staticSymbol&&&		if (!targetObjects.isEmpty())
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			setSelectionToViewer(targetObjects);
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&<%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		try
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			if (marker.isSubtypeOf(EValidator.MARKER))
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&				String uriAttribute = marker.getAttribute(EValidator.URI_ATTRIBUTE, null);
//&&&staticSymbol&&&				if (uriAttribute != null)
//&&&staticSymbol&&&				{
//&&&staticSymbol&&&					URI uri = URI.createURI(uriAttribute);
//&&&staticSymbol&&&					EObject eObject = editingDomain.getResourceSet().getEObject(uri, true);
//&&&staticSymbol&&&					if (eObject != null)
//&&&staticSymbol&&&					{
//&&&staticSymbol&&&					  setSelectionToViewer(Collections.singleton(editingDomain.getWrapper(eObject)));
//&&&staticSymbol&&&					}
//&&&staticSymbol&&&				}
//&&&staticSymbol&&&			}
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&		catch (CoreException exception)
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			<%
//&&&staticSymbol&&&=genPackage.getImportedEditorPluginClassName()
//&&&staticSymbol&&&%>.INSTANCE.log(exception);
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * This is called during startup.
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
//&&&staticSymbol&&&	public void init(IEditorSite site, IEditorInput editorInput)
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		setSite(site);
//&&&staticSymbol&&&		setInputWithNotify(editorInput);
//&&&staticSymbol&&&		setPartName(editorInput.getName());
//&&&staticSymbol&&&		site.setSelectionProvider(this);
//&&&staticSymbol&&&		site.getPage().addPartListener(partListener);
//&&&staticSymbol&&&<%
if (!genModel.isRichClientPlatform()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		ResourcesPlugin.getWorkspace().addResourceChangeListener(resourceChangeListener, IResourceChangeEvent.POST_CHANGE);
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
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
//&&&staticSymbol&&&	public void setFocus()
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&<%
if (genPackage.isMultipleEditorPages()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		if (currentViewerPane != null)
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			currentViewerPane.setFocus();
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&		else
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			getControl(getActivePage()).setFocus();
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&<%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		getControl(getActivePage()).setFocus();
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * This implements {@link org.eclipse.jface.viewers.ISelectionProvider}.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	public void addSelectionChangedListener(ISelectionChangedListener listener)
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		selectionChangedListeners.add(listener);
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * This implements {@link org.eclipse.jface.viewers.ISelectionProvider}.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	public void removeSelectionChangedListener(ISelectionChangedListener listener)
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		selectionChangedListeners.remove(listener);
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * This implements {@link org.eclipse.jface.viewers.ISelectionProvider} to return this editor's overall selection.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	public ISelection getSelection()
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		return editorSelection;
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * This implements {@link org.eclipse.jface.viewers.ISelectionProvider} to set this editor's overall selection.
//&&&staticSymbol&&&	 * Calling this result will notify the listeners.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	public void setSelection(ISelection selection)
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		editorSelection = selection;
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
if (genModel.useGenerics()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		for (ISelectionChangedListener listener : selectionChangedListeners)
//&&&staticSymbol&&&<%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		for (Iterator listeners = selectionChangedListeners.iterator(); listeners.hasNext(); )
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&<%
if (!genModel.useGenerics()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			ISelectionChangedListener listener = (ISelectionChangedListener)listeners.next();
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			listener.selectionChanged(new SelectionChangedEvent(this, selection));
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&		setStatusLineManager(selection);
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	public void setStatusLineManager(ISelection selection)
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		IStatusLineManager statusLineManager = currentViewer != null && currentViewer == contentOutlineViewer ?
//&&&staticSymbol&&&			contentOutlineStatusLineManager : getActionBars().getStatusLineManager();
//&&&staticSymbol&&&
//&&&staticSymbol&&&		if (statusLineManager != null)
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			if (selection instanceof IStructuredSelection)
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&				<%
//&&&staticSymbol&&&=_CollectionOfAnything
//&&&staticSymbol&&&%> collection = ((IStructuredSelection)selection).toList();
//&&&staticSymbol&&&				switch (collection.size())
//&&&staticSymbol&&&				{
//&&&staticSymbol&&&					case 0:
//&&&staticSymbol&&&					{
//&&&staticSymbol&&&						statusLineManager.setMessage(getString("_UI_NoObjectSelected"));<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&						break;
//&&&staticSymbol&&&					}
//&&&staticSymbol&&&					case 1:
//&&&staticSymbol&&&					{
//&&&staticSymbol&&&						String text = new AdapterFactoryItemDelegator(adapterFactory).getText(collection.iterator().next());
//&&&staticSymbol&&&						statusLineManager.setMessage(getString("_UI_SingleObjectSelected", text));<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&						break;
//&&&staticSymbol&&&					}
//&&&staticSymbol&&&					default:
//&&&staticSymbol&&&					{
//&&&staticSymbol&&&						statusLineManager.setMessage(getString("_UI_MultiObjectSelected", Integer.toString(collection.size())));<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&						break;
//&&&staticSymbol&&&					}
//&&&staticSymbol&&&				}
//&&&staticSymbol&&&			}
//&&&staticSymbol&&&			else
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&				statusLineManager.setMessage("");<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			}
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * This looks up a string in the plugin's plugin.properties file.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	private static String getString(String key)
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		return <%
//&&&staticSymbol&&&=genPackage.getImportedEditorPluginClassName()
//&&&staticSymbol&&&%>.INSTANCE.getString(key);
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * This looks up a string in plugin.properties, making a substitution.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	private static String getString(String key, Object s1)
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		return <%
//&&&staticSymbol&&&=genPackage.getImportedEditorPluginClassName()
//&&&staticSymbol&&&%>.INSTANCE.getString(key, new Object [] { s1 });
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * This implements {@link org.eclipse.jface.action.IMenuListener} to help fill the context menus with contributions from the Edit menu.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	public void menuAboutToShow(IMenuManager menuManager)
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		((IMenuListener)getEditorSite().getActionBarContributor()).menuAboutToShow(menuManager);
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	public EditingDomainActionBarContributor getActionBarContributor()
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		return (EditingDomainActionBarContributor)getEditorSite().getActionBarContributor();
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	public IActionBars getActionBars()
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		return getActionBarContributor().getActionBars();
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	public AdapterFactory getAdapterFactory()
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		return adapterFactory;
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
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
//&&&staticSymbol&&&	public void dispose()
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		updateProblemIndication = false;
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
if (!genModel.isRichClientPlatform()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		ResourcesPlugin.getWorkspace().removeResourceChangeListener(resourceChangeListener);
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		getSite().getPage().removePartListener(partListener);
//&&&staticSymbol&&&
//&&&staticSymbol&&&		adapterFactory.dispose();
//&&&staticSymbol&&&
//&&&staticSymbol&&&		if (getActionBarContributor().getActiveEditor() == this)
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			getActionBarContributor().setActiveEditor(null);
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
if (genModel.useGenerics()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		for (PropertySheetPage propertySheetPage : propertySheetPages)
//&&&staticSymbol&&&<%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		for (Iterator i = propertySheetPages.iterator(); i.hasNext(); )
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&<%
if (!genModel.useGenerics()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			PropertySheetPage propertySheetPage = (PropertySheetPage)i.next();
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			propertySheetPage.dispose();
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&
//&&&staticSymbol&&&		if (contentOutlinePage != null)
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			contentOutlinePage.dispose();
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&
//&&&staticSymbol&&&		super.dispose();
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * Returns whether the outline view should be presented to the user.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	protected boolean showOutlineView()
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		return <%
//&&&staticSymbol&&&=genPackage.isMultipleEditorPages()
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&}
//&&&staticSymbol&&&<%
genModel.emitSortedImports();
//&&&staticSymbol&&&%>

}
}