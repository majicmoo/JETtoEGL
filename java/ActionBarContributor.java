class ActionBarContributor {
public static void main (String[] args) {
//&&&staticSymbol&&&<%import org.eclipse.emf.codegen.ecore.genmodel.*;%>
//&&&staticSymbol&&&<%include("../Header.javajetinc");%>
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
GenPackage genPackage = (GenPackage)argument; GenModel genModel=genPackage.getGenModel();
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%

String _CollectionOfAnything = null;
String _CollectionOfIAction = null;
String _ArrayListOfIAction = null;
String _CollectionOfExtendsIAction = null;
String _IteratorOfIAction = null;
String _MapOfStringToCollectionOfIAction = null;
String _MapEntryOfStringToCollectionOfIAction = null;
String _LinkedHashMapOfStringToCollectionOfIAction = null;
if (genModel.isCreationCommands())
{
  _CollectionOfAnything = genModel.getImportedName("Collection" + (genModel.useGenerics() ? "<?>" : ""));
  _CollectionOfIAction = genModel.getImportedName(genModel.useGenerics() ? "java.util.Collection<org.eclipse.jface.action.IAction>" : "java.util.Collection");
  _ArrayListOfIAction = genModel.getImportedName(genModel.useGenerics() ? "java.util.ArrayList<org.eclipse.jface.action.IAction>" : "java.util.ArrayList");
  _CollectionOfExtendsIAction = genModel.getImportedName(genModel.useGenerics() ? "java.util.Collection<? extends org.eclipse.jface.action.IAction>" : "java.util.Collection");
  if (genModel.isCreationSubmenus())
  {
    _IteratorOfIAction = genModel.getImportedName(genModel.useGenerics() ? "java.util.Iterator<org.eclipse.jface.action.IAction>" : "java.util.Iterator");
    _MapOfStringToCollectionOfIAction = genModel.getImportedName("java.util.Map") + (genModel.useGenerics() ? ("<String, " + _CollectionOfIAction + ">") : "");
    _MapEntryOfStringToCollectionOfIAction = genModel.getImportedName("java.util.Map") + ".Entry" + (genModel.useGenerics() ? ("<String, " + _CollectionOfIAction + ">") : "");
    _LinkedHashMapOfStringToCollectionOfIAction = genModel.getImportedName("java.util.LinkedHashMap") + (genModel.useGenerics() ? ("<String, " + _CollectionOfIAction + ">") : "");
  }
}

//&&&staticSymbol&&&%>
//&&&staticSymbol&&&package <%
//&&&staticSymbol&&&=genPackage.getPresentationPackageName()
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
genModel.markImportLocation(stringBuffer);
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&/**
//&&&staticSymbol&&& * This is the action bar contributor for the <%
//&&&staticSymbol&&&=genPackage.getPrefix()
//&&&staticSymbol&&&%> model editor.
//&&&staticSymbol&&& * <!-- begin-user-doc -->
//&&&staticSymbol&&& * <!-- end-user-doc -->
//&&&staticSymbol&&& * @generated
//&&&staticSymbol&&& */
//&&&staticSymbol&&&public class <%
//&&&staticSymbol&&&=genPackage.getActionBarContributorClassName()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	extends <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.edit.ui.action.EditingDomainActionBarContributor")
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	implements <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.jface.viewers.ISelectionChangedListener")
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
//&&&staticSymbol&&&	public static final String copyright = <%
//&&&staticSymbol&&&=genModel.getCopyrightFieldLiteral()
//&&&staticSymbol&&&%>;<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
if (genModel.isRichClientPlatform() && genPackage.isGenerateModelWizard()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * Action to create objects from the <%
//&&&staticSymbol&&&=genPackage.getPrefix()
//&&&staticSymbol&&&%> model.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	public static class NewAction extends <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.common.ui.action.WorkbenchWindowActionDelegate")
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		/**
//&&&staticSymbol&&&		 * @see org.eclipse.ui.IActionDelegate#run(org.eclipse.jface.action.IAction)
//&&&staticSymbol&&&		 * <!-- begin-user-doc -->
//&&&staticSymbol&&&		 * <!-- end-user-doc -->
//&&&staticSymbol&&&		 * @generated
//&&&staticSymbol&&&		 */
//&&&staticSymbol&&&		public void run(<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.jface.action.IAction")
//&&&staticSymbol&&&%> action)
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			<%
//&&&staticSymbol&&&=genPackage.getModelWizardClassName()
//&&&staticSymbol&&&%> wizard = new <%
//&&&staticSymbol&&&=genPackage.getModelWizardClassName()
//&&&staticSymbol&&&%>();
//&&&staticSymbol&&&			wizard.init(getWindow().getWorkbench(), <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.jface.viewers.StructuredSelection")
//&&&staticSymbol&&&%>.EMPTY);
//&&&staticSymbol&&&			<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.jface.wizard.WizardDialog")
//&&&staticSymbol&&&%> wizardDialog = new <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.jface.wizard.WizardDialog")
//&&&staticSymbol&&&%>(getWindow().getShell(), wizard);
//&&&staticSymbol&&&			wizardDialog.open();
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * This keeps track of the active editor.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	protected <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.ui.IEditorPart")
//&&&staticSymbol&&&%> activeEditorPart;
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * This keeps track of the current selection provider.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	protected <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.jface.viewers.ISelectionProvider")
//&&&staticSymbol&&&%> selectionProvider;
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * This action opens the Properties view.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	protected <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.jface.action.IAction")
//&&&staticSymbol&&&%> showPropertiesViewAction =
//&&&staticSymbol&&&		new <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.jface.action.Action")
//&&&staticSymbol&&&%>(<%
//&&&staticSymbol&&&=genPackage.getImportedEditorPluginClassName()
//&&&staticSymbol&&&%>.INSTANCE.getString("_UI_ShowPropertiesView_menu_item"))<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&<%
if (genModel.useClassOverrideAnnotation()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			@Override
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			public void run()
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&				try
//&&&staticSymbol&&&				{
//&&&staticSymbol&&&					getPage().showView("org.eclipse.ui.views.PropertySheet");<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				}
//&&&staticSymbol&&&				catch (<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.ui.PartInitException")
//&&&staticSymbol&&&%> exception)
//&&&staticSymbol&&&				{
//&&&staticSymbol&&&					<%
//&&&staticSymbol&&&=genPackage.getImportedEditorPluginClassName()
//&&&staticSymbol&&&%>.INSTANCE.log(exception);
//&&&staticSymbol&&&				}
//&&&staticSymbol&&&			}
//&&&staticSymbol&&&		};
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * This action refreshes the viewer of the current editor if the editor
//&&&staticSymbol&&&	 * implements {@link org.eclipse.emf.common.ui.viewer.IViewerProvider}.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	protected <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.jface.action.IAction")
//&&&staticSymbol&&&%> refreshViewerAction =
//&&&staticSymbol&&&		new <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.jface.action.Action")
//&&&staticSymbol&&&%>(<%
//&&&staticSymbol&&&=genPackage.getImportedEditorPluginClassName()
//&&&staticSymbol&&&%>.INSTANCE.getString("_UI_RefreshViewer_menu_item"))<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&<%
if (genModel.useClassOverrideAnnotation()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			@Override
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			public boolean isEnabled()
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&				return activeEditorPart instanceof <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.common.ui.viewer.IViewerProvider")
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&			}
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
if (genModel.useClassOverrideAnnotation()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			@Override
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			public void run()
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&				if (activeEditorPart instanceof <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.common.ui.viewer.IViewerProvider")
//&&&staticSymbol&&&%>)
//&&&staticSymbol&&&				{
//&&&staticSymbol&&&					<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.jface.viewers.Viewer")
//&&&staticSymbol&&&%> viewer = ((<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.common.ui.viewer.IViewerProvider")
//&&&staticSymbol&&&%>)activeEditorPart).getViewer();
//&&&staticSymbol&&&					if (viewer != null)
//&&&staticSymbol&&&					{
//&&&staticSymbol&&&						viewer.refresh();
//&&&staticSymbol&&&					}
//&&&staticSymbol&&&				}
//&&&staticSymbol&&&			}
//&&&staticSymbol&&&		};
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
if (genModel.isCreationCommands()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * This will contain one {@link org.eclipse.emf.edit.ui.action.CreateChildAction} corresponding to each descriptor
//&&&staticSymbol&&&	 * generated for the current selection by the item provider.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	protected <%
//&&&staticSymbol&&&=_CollectionOfIAction
//&&&staticSymbol&&&%> createChildActions;
//&&&staticSymbol&&&
//&&&staticSymbol&&&  <%
if (genModel.isCreationSubmenus()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * This will contain a map of {@link org.eclipse.emf.edit.ui.action.CreateChildAction}s, keyed by sub-menu text.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	protected <%
//&&&staticSymbol&&&=_MapOfStringToCollectionOfIAction
//&&&staticSymbol&&&%> createChildSubmenuActions;
//&&&staticSymbol&&&
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * This is the menu manager into which menu contribution items should be added for CreateChild actions.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	protected <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.jface.action.IMenuManager")
//&&&staticSymbol&&&%> createChildMenuManager;
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * This will contain one {@link org.eclipse.emf.edit.ui.action.CreateSiblingAction} corresponding to each descriptor
//&&&staticSymbol&&&	 * generated for the current selection by the item provider.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	protected <%
//&&&staticSymbol&&&=_CollectionOfIAction
//&&&staticSymbol&&&%> createSiblingActions;
//&&&staticSymbol&&&
//&&&staticSymbol&&&  <%
if (genModel.isCreationSubmenus()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * This will contain a map of {@link org.eclipse.emf.edit.ui.action.CreateSiblingAction}s, keyed by submenu text.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	protected <%
//&&&staticSymbol&&&=_MapOfStringToCollectionOfIAction
//&&&staticSymbol&&&%> createSiblingSubmenuActions;
//&&&staticSymbol&&&
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * This is the menu manager into which menu contribution items should be added for CreateSibling actions.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	protected <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.jface.action.IMenuManager")
//&&&staticSymbol&&&%> createSiblingMenuManager;
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * This creates an instance of the contributor.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	public <%
//&&&staticSymbol&&&=genPackage.getActionBarContributorClassName()
//&&&staticSymbol&&&%>()
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		super(ADDITIONS_LAST_STYLE);
//&&&staticSymbol&&&		loadResourceAction = new <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.edit.ui.action.LoadResourceAction")
//&&&staticSymbol&&&%>();
//&&&staticSymbol&&&		validateAction = new <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.edit.ui.action.ValidateAction")
//&&&staticSymbol&&&%>();
//&&&staticSymbol&&&<%
if (genModel.getDecoration() == GenDecoration.LIVE) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		liveValidationAction = new <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.edit.ui.provider.DiagnosticDecorator")
//&&&staticSymbol&&&%>.LiveValidator.LiveValidationAction(<%
//&&&staticSymbol&&&=genPackage.getImportedEditorPluginClassName()
//&&&staticSymbol&&&%>.getPlugin().getDialogSettings());
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		controlAction = new <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.edit.ui.action.ControlAction")
//&&&staticSymbol&&&%>();
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * This adds Separators for editor additions to the tool bar.
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
//&&&staticSymbol&&&	public void contributeToToolBar(<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.jface.action.IToolBarManager")
//&&&staticSymbol&&&%> toolBarManager)
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		toolBarManager.add(new <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.jface.action.Separator")
//&&&staticSymbol&&&%>("<%
//&&&staticSymbol&&&=genPackage.getPrefix().toLowerCase(genModel.getLocale())
//&&&staticSymbol&&&%>-settings"));<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		toolBarManager.add(new <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.jface.action.Separator")
//&&&staticSymbol&&&%>("<%
//&&&staticSymbol&&&=genPackage.getPrefix().toLowerCase(genModel.getLocale())
//&&&staticSymbol&&&%>-additions"));<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * This adds to the menu bar a menu and some separators for editor additions,
//&&&staticSymbol&&&	 * as well as the sub-menus for object creation items.
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
//&&&staticSymbol&&&	public void contributeToMenu(<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.jface.action.IMenuManager")
//&&&staticSymbol&&&%> menuManager)
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		super.contributeToMenu(menuManager);
//&&&staticSymbol&&&
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.jface.action.IMenuManager")
//&&&staticSymbol&&&%> submenuManager = new <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.jface.action.MenuManager")
//&&&staticSymbol&&&%>(<%
//&&&staticSymbol&&&=genPackage.getImportedEditorPluginClassName()
//&&&staticSymbol&&&%>.INSTANCE.getString("_UI_<%
//&&&staticSymbol&&&=genPackage.getEditorClassName()
//&&&staticSymbol&&&%>_menu"), "<%
//&&&staticSymbol&&&=genPackage.getInterfacePackageName()
//&&&staticSymbol&&&%>MenuID");<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genModel.getNonNLS(2)
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		menuManager.insertAfter("additions", submenuManager);<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		submenuManager.add(new <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.jface.action.Separator")
//&&&staticSymbol&&&%>("settings"));<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		submenuManager.add(new <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.jface.action.Separator")
//&&&staticSymbol&&&%>("actions"));<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		submenuManager.add(new <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.jface.action.Separator")
//&&&staticSymbol&&&%>("additions"));<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		submenuManager.add(new <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.jface.action.Separator")
//&&&staticSymbol&&&%>("additions-end"));<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
if (genModel.isCreationCommands()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		// Prepare for CreateChild item addition or removal.
//&&&staticSymbol&&&		//
//&&&staticSymbol&&&		createChildMenuManager = new <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.jface.action.MenuManager")
//&&&staticSymbol&&&%>(<%
//&&&staticSymbol&&&=genPackage.getImportedEditorPluginClassName()
//&&&staticSymbol&&&%>.INSTANCE.getString("_UI_CreateChild_menu_item"));<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		submenuManager.insertBefore("additions", createChildMenuManager);<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&		// Prepare for CreateSibling item addition or removal.
//&&&staticSymbol&&&		//
//&&&staticSymbol&&&		createSiblingMenuManager = new <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.jface.action.MenuManager")
//&&&staticSymbol&&&%>(<%
//&&&staticSymbol&&&=genPackage.getImportedEditorPluginClassName()
//&&&staticSymbol&&&%>.INSTANCE.getString("_UI_CreateSibling_menu_item"));<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		submenuManager.insertBefore("additions", createSiblingMenuManager);<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&		// Force an update because Eclipse hides empty menus now.
//&&&staticSymbol&&&		//
//&&&staticSymbol&&&		submenuManager.addMenuListener
//&&&staticSymbol&&&			(new <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.jface.action.IMenuListener")
//&&&staticSymbol&&&%>()
//&&&staticSymbol&&&			 {
//&&&staticSymbol&&&				 public void menuAboutToShow(<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.jface.action.IMenuManager")
//&&&staticSymbol&&&%> menuManager)
//&&&staticSymbol&&&				 {
//&&&staticSymbol&&&					 menuManager.updateAll(true);
//&&&staticSymbol&&&				 }
//&&&staticSymbol&&&			 });
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		// Add your contributions.
//&&&staticSymbol&&&		// Ensure that you remove @generated or mark it @generated NOT
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		addGlobalActions(submenuManager);
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * When the active editor changes, this remembers the change and registers with it as a selection provider.
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
//&&&staticSymbol&&&	public void setActiveEditor(<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.ui.IEditorPart")
//&&&staticSymbol&&&%> part)
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		super.setActiveEditor(part);
//&&&staticSymbol&&&		activeEditorPart = part;
//&&&staticSymbol&&&
//&&&staticSymbol&&&		// Switch to the new selection provider.
//&&&staticSymbol&&&		//
//&&&staticSymbol&&&		if (selectionProvider != null)
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			selectionProvider.removeSelectionChangedListener(this);
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&		if (part == null)
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			selectionProvider = null;
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&		else
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			selectionProvider = part.getSite().getSelectionProvider();
//&&&staticSymbol&&&			selectionProvider.addSelectionChangedListener(this);
//&&&staticSymbol&&&
//&&&staticSymbol&&&			// Fake a selection changed event to update the menus.
//&&&staticSymbol&&&			//
//&&&staticSymbol&&&			if (selectionProvider.getSelection() != null)
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&				selectionChanged(new <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.jface.viewers.SelectionChangedEvent")
//&&&staticSymbol&&&%>(selectionProvider, selectionProvider.getSelection()));
//&&&staticSymbol&&&			}
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * This implements {@link org.eclipse.jface.viewers.ISelectionChangedListener},
//&&&staticSymbol&&&	 * handling {@link org.eclipse.jface.viewers.SelectionChangedEvent}s by querying for the children and siblings
//&&&staticSymbol&&&	 * that can be added to the selected object and updating the menus accordingly.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	public void selectionChanged(<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.jface.viewers.SelectionChangedEvent")
//&&&staticSymbol&&&%> event)
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&<%
if (genModel.isCreationCommands()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		// Remove any menu items for old selection.
//&&&staticSymbol&&&		//
//&&&staticSymbol&&&		if (createChildMenuManager != null)
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&  <%
if (genModel.isCreationSubmenus()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			depopulateManager(createChildMenuManager, createChildSubmenuActions);
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			depopulateManager(createChildMenuManager, createChildActions);
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&		if (createSiblingMenuManager != null)
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&  <%
if (genModel.isCreationSubmenus()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			depopulateManager(createSiblingMenuManager, createSiblingSubmenuActions);
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			depopulateManager(createSiblingMenuManager, createSiblingActions);
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&
//&&&staticSymbol&&&		// Query the new selection for appropriate new child/sibling descriptors
//&&&staticSymbol&&&		//
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=_CollectionOfAnything
//&&&staticSymbol&&&%> newChildDescriptors = null;
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=_CollectionOfAnything
//&&&staticSymbol&&&%> newSiblingDescriptors = null;
//&&&staticSymbol&&&
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.jface.viewers.ISelection")
//&&&staticSymbol&&&%> selection = event.getSelection();
//&&&staticSymbol&&&		if (selection instanceof <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.jface.viewers.IStructuredSelection")
//&&&staticSymbol&&&%> && ((IStructuredSelection)selection).size() == 1)
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			Object object = ((<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.jface.viewers.IStructuredSelection")
//&&&staticSymbol&&&%>)selection).getFirstElement();
//&&&staticSymbol&&&
//&&&staticSymbol&&&			<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.edit.domain.EditingDomain")
//&&&staticSymbol&&&%> domain = ((<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.edit.domain.IEditingDomainProvider")
//&&&staticSymbol&&&%>)activeEditorPart).getEditingDomain();
//&&&staticSymbol&&&
//&&&staticSymbol&&&			newChildDescriptors = domain.getNewChildDescriptors(object, null);
//&&&staticSymbol&&&			newSiblingDescriptors = domain.getNewChildDescriptors(null, object);
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&
//&&&staticSymbol&&&		// Generate actions for selection; populate and redraw the menus.
//&&&staticSymbol&&&		//
//&&&staticSymbol&&&		createChildActions = generateCreateChildActions(newChildDescriptors, selection);
//&&&staticSymbol&&&  <%
if (genModel.isCreationSubmenus()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		createChildSubmenuActions = extractSubmenuActions(createChildActions);
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		createSiblingActions = generateCreateSiblingActions(newSiblingDescriptors, selection);
//&&&staticSymbol&&&  <%
if (genModel.isCreationSubmenus()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		createSiblingSubmenuActions = extractSubmenuActions(createSiblingActions);
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&		if (createChildMenuManager != null)
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&  <%
if (genModel.isCreationSubmenus()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			populateManager(createChildMenuManager, createChildSubmenuActions, null);
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			populateManager(createChildMenuManager, createChildActions, null);
//&&&staticSymbol&&&			createChildMenuManager.update(true);
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&		if (createSiblingMenuManager != null)
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&  <%
if (genModel.isCreationSubmenus()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			populateManager(createSiblingMenuManager, createSiblingSubmenuActions, null);
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			populateManager(createSiblingMenuManager, createSiblingActions, null);
//&&&staticSymbol&&&			createSiblingMenuManager.update(true);
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&<%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		// Add your contributions.
//&&&staticSymbol&&&		// Ensure that you remove @generated or mark it @generated NOT
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
if (genModel.isCreationCommands()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * This generates a {@link org.eclipse.emf.edit.ui.action.CreateChildAction} for each object in <code>descriptors</code>,
//&&&staticSymbol&&&	 * and returns the collection of these actions.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	protected <%
//&&&staticSymbol&&&=_CollectionOfIAction
//&&&staticSymbol&&&%> generateCreateChildActions(<%
//&&&staticSymbol&&&=_CollectionOfAnything
//&&&staticSymbol&&&%> descriptors, <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.jface.viewers.ISelection")
//&&&staticSymbol&&&%> selection)
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=_CollectionOfIAction
//&&&staticSymbol&&&%> actions = new <%
//&&&staticSymbol&&&=_ArrayListOfIAction
//&&&staticSymbol&&&%>();
//&&&staticSymbol&&&		if (descriptors != null)
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&<%
if (genModel.useGenerics()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			for (<%
//&&&staticSymbol&&&=genModel.getImportedName("java.lang.Object")
//&&&staticSymbol&&&%> descriptor : descriptors)
//&&&staticSymbol&&&<%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			for (<%
//&&&staticSymbol&&&=genModel.getImportedName("java.util.Iterator")
//&&&staticSymbol&&&%> i = descriptors.iterator(); i.hasNext(); )
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&				actions.add(new <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.edit.ui.action.CreateChildAction")
//&&&staticSymbol&&&%>(activeEditorPart, selection, <%
if (genModel.useGenerics()) {
//&&&staticSymbol&&&%>descriptor<%
} else {
//&&&staticSymbol&&&%>i.next()<%
}
//&&&staticSymbol&&&%>));
//&&&staticSymbol&&&			}
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&		return actions;
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * This generates a {@link org.eclipse.emf.edit.ui.action.CreateSiblingAction} for each object in <code>descriptors</code>,
//&&&staticSymbol&&&	 * and returns the collection of these actions.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	protected <%
//&&&staticSymbol&&&=_CollectionOfIAction
//&&&staticSymbol&&&%> generateCreateSiblingActions(<%
//&&&staticSymbol&&&=_CollectionOfAnything
//&&&staticSymbol&&&%> descriptors, <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.jface.viewers.ISelection")
//&&&staticSymbol&&&%> selection)
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=_CollectionOfIAction
//&&&staticSymbol&&&%> actions = new <%
//&&&staticSymbol&&&=_ArrayListOfIAction
//&&&staticSymbol&&&%>();
//&&&staticSymbol&&&		if (descriptors != null)
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&<%
if (genModel.useGenerics()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			for (<%
//&&&staticSymbol&&&=genModel.getImportedName("java.lang.Object")
//&&&staticSymbol&&&%> descriptor : descriptors)
//&&&staticSymbol&&&<%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			for (<%
//&&&staticSymbol&&&=genModel.getImportedName("java.util.Iterator")
//&&&staticSymbol&&&%> i = descriptors.iterator(); i.hasNext(); )
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&				actions.add(new <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.edit.ui.action.CreateSiblingAction")
//&&&staticSymbol&&&%>(activeEditorPart, selection, <%
if (genModel.useGenerics()) {
//&&&staticSymbol&&&%>descriptor<%
} else {
//&&&staticSymbol&&&%>i.next()<%
}
//&&&staticSymbol&&&%>));
//&&&staticSymbol&&&			}
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&		return actions;
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * This populates the specified <code>manager</code> with {@link org.eclipse.jface.action.ActionContributionItem}s
//&&&staticSymbol&&&	 * based on the {@link org.eclipse.jface.action.IAction}s contained in the <code>actions</code> collection,
//&&&staticSymbol&&&	 * by inserting them before the specified contribution item <code>contributionID</code>.
//&&&staticSymbol&&&	 * If <code>contributionID</code> is <code>null</code>, they are simply added.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	protected void populateManager(<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.jface.action.IContributionManager")
//&&&staticSymbol&&&%> manager, <%
//&&&staticSymbol&&&=_CollectionOfExtendsIAction
//&&&staticSymbol&&&%> actions, String contributionID)
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		if (actions != null)
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&<%
if (genModel.useGenerics()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			for (<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.jface.action.IAction")
//&&&staticSymbol&&&%> action : actions)
//&&&staticSymbol&&&<%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			for (<%
//&&&staticSymbol&&&=genModel.getImportedName("java.util.Iterator")
//&&&staticSymbol&&&%> i = actions.iterator(); i.hasNext(); )
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&<%
if (!genModel.useGenerics()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.jface.action.IAction")
//&&&staticSymbol&&&%> action = (IAction)i.next();
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				if (contributionID != null)
//&&&staticSymbol&&&				{
//&&&staticSymbol&&&					manager.insertBefore(contributionID, action);
//&&&staticSymbol&&&				}
//&&&staticSymbol&&&				else
//&&&staticSymbol&&&				{
//&&&staticSymbol&&&					manager.add(action);
//&&&staticSymbol&&&				}
//&&&staticSymbol&&&			}
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&		
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * This removes from the specified <code>manager</code> all {@link org.eclipse.jface.action.ActionContributionItem}s
//&&&staticSymbol&&&	 * based on the {@link org.eclipse.jface.action.IAction}s contained in the <code>actions</code> collection.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	protected void depopulateManager(<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.jface.action.IContributionManager")
//&&&staticSymbol&&&%> manager, <%
//&&&staticSymbol&&&=_CollectionOfExtendsIAction
//&&&staticSymbol&&&%> actions)
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		if (actions != null)
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.jface.action.IContributionItem")
//&&&staticSymbol&&&%>[] items = manager.getItems();
//&&&staticSymbol&&&			for (int i = 0; i < items.length; i++)
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&				// Look into SubContributionItems
//&&&staticSymbol&&&				//
//&&&staticSymbol&&&				<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.jface.action.IContributionItem")
//&&&staticSymbol&&&%> contributionItem = items[i];
//&&&staticSymbol&&&				while (contributionItem instanceof <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.jface.action.SubContributionItem")
//&&&staticSymbol&&&%>)
//&&&staticSymbol&&&				{
//&&&staticSymbol&&&					contributionItem = ((<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.jface.action.SubContributionItem")
//&&&staticSymbol&&&%>)contributionItem).getInnerItem();
//&&&staticSymbol&&&				}
//&&&staticSymbol&&&
//&&&staticSymbol&&&				// Delete the ActionContributionItems with matching action.
//&&&staticSymbol&&&				//
//&&&staticSymbol&&&				if (contributionItem instanceof <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.jface.action.ActionContributionItem")
//&&&staticSymbol&&&%>)
//&&&staticSymbol&&&				{
//&&&staticSymbol&&&					<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.jface.action.IAction")
//&&&staticSymbol&&&%> action = ((<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.jface.action.ActionContributionItem")
//&&&staticSymbol&&&%>)contributionItem).getAction();
//&&&staticSymbol&&&					if (actions.contains(action))
//&&&staticSymbol&&&					{
//&&&staticSymbol&&&						manager.remove(contributionItem);
//&&&staticSymbol&&&					}
//&&&staticSymbol&&&				}
//&&&staticSymbol&&&			}
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&  <%
if (genModel.isCreationSubmenus()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * This extracts those actions in the <code>submenuActions</code> collection whose text is qualified and returns
//&&&staticSymbol&&&	 * a map of these actions, keyed by submenu text.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	protected <%
//&&&staticSymbol&&&=_MapOfStringToCollectionOfIAction
//&&&staticSymbol&&&%> extractSubmenuActions(<%
//&&&staticSymbol&&&=_CollectionOfIAction
//&&&staticSymbol&&&%> createActions)
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=_MapOfStringToCollectionOfIAction
//&&&staticSymbol&&&%> createSubmenuActions = new <%
//&&&staticSymbol&&&=_LinkedHashMapOfStringToCollectionOfIAction
//&&&staticSymbol&&&%>();
//&&&staticSymbol&&&		if (createActions != null)
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			for (<%
//&&&staticSymbol&&&=_IteratorOfIAction
//&&&staticSymbol&&&%> actions = createActions.iterator(); actions.hasNext(); )
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&				<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.jface.action.IAction")
//&&&staticSymbol&&&%> action = <%
if (!genModel.useGenerics()) {
//&&&staticSymbol&&&%>(<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.jface.action.IAction")
//&&&staticSymbol&&&%>)<%
}
//&&&staticSymbol&&&%>actions.next();
//&&&staticSymbol&&&				<%
//&&&staticSymbol&&&=genModel.getImportedName("java.util.StringTokenizer")
//&&&staticSymbol&&&%> st = new <%
//&&&staticSymbol&&&=genModel.getImportedName("java.util.StringTokenizer")
//&&&staticSymbol&&&%>(action.getText(), "|");<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				if (st.countTokens() == 2)
//&&&staticSymbol&&&				{
//&&&staticSymbol&&&					String text = st.nextToken().trim();
//&&&staticSymbol&&&					<%
//&&&staticSymbol&&&=_CollectionOfIAction
//&&&staticSymbol&&&%> submenuActions = <%
if (!genModel.useGenerics()) {
//&&&staticSymbol&&&%>(<%
//&&&staticSymbol&&&=_CollectionOfIAction
//&&&staticSymbol&&&%>)<%
}
//&&&staticSymbol&&&%>createSubmenuActions.get(text);
//&&&staticSymbol&&&					if (submenuActions == null)
//&&&staticSymbol&&&					{
//&&&staticSymbol&&&						createSubmenuActions.put(text, submenuActions = new <%
//&&&staticSymbol&&&=_ArrayListOfIAction
//&&&staticSymbol&&&%>());
//&&&staticSymbol&&&					}
//&&&staticSymbol&&&					action.setText(st.nextToken().trim());
//&&&staticSymbol&&&					submenuActions.add(action);
//&&&staticSymbol&&&					actions.remove();
//&&&staticSymbol&&&				}
//&&&staticSymbol&&&			}
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&		return createSubmenuActions;
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * This populates the specified <code>manager</code> with {@link org.eclipse.jface.action.MenuManager}s containing
//&&&staticSymbol&&&	 * {@link org.eclipse.jface.action.ActionContributionItem}s based on the {@link org.eclipse.jface.action.IAction}s
//&&&staticSymbol&&&	 * contained in the <code>submenuActions</code> collection, by inserting them before the specified contribution
//&&&staticSymbol&&&	 * item <code>contributionID</code>.
//&&&staticSymbol&&&	 * If <code>contributionID</code> is <code>null</code>, they are simply added.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	protected void populateManager(<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.jface.action.IContributionManager")
//&&&staticSymbol&&&%> manager, <%
//&&&staticSymbol&&&=_MapOfStringToCollectionOfIAction
//&&&staticSymbol&&&%> submenuActions, String contributionID)
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		if (submenuActions != null)
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&    <%
if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			for (<%
//&&&staticSymbol&&&=_MapEntryOfStringToCollectionOfIAction
//&&&staticSymbol&&&%> entry : submenuActions.entrySet())
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&    <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			for (<%
//&&&staticSymbol&&&=genModel.getImportedName("java.util.Iterator")
//&&&staticSymbol&&&%> entries = submenuActions.entrySet().iterator(); entries.hasNext();)
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&				<%
//&&&staticSymbol&&&=_MapEntryOfStringToCollectionOfIAction
//&&&staticSymbol&&&%> entry = (<%
//&&&staticSymbol&&&=_MapEntryOfStringToCollectionOfIAction
//&&&staticSymbol&&&%>)entries.next();
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.jface.action.MenuManager")
//&&&staticSymbol&&&%> submenuManager = new <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.jface.action.MenuManager")
//&&&staticSymbol&&&%>(<%
if (!genModel.useGenerics()) {
//&&&staticSymbol&&&%>(String)<%
}
//&&&staticSymbol&&&%>entry.getKey());
//&&&staticSymbol&&&				if (contributionID != null)
//&&&staticSymbol&&&				{
//&&&staticSymbol&&&					manager.insertBefore(contributionID, submenuManager);
//&&&staticSymbol&&&				}
//&&&staticSymbol&&&				else
//&&&staticSymbol&&&				{
//&&&staticSymbol&&&					manager.add(submenuManager);
//&&&staticSymbol&&&				}
//&&&staticSymbol&&&				populateManager(submenuManager, <%
if (!genModel.useGenerics()) {
//&&&staticSymbol&&&%>(<%
//&&&staticSymbol&&&=_CollectionOfIAction
//&&&staticSymbol&&&%>)<%
}
//&&&staticSymbol&&&%>entry.getValue(), null);
//&&&staticSymbol&&&			}
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * This removes from the specified <code>manager</code> all {@link org.eclipse.jface.action.MenuManager}s and their
//&&&staticSymbol&&&	 * {@link org.eclipse.jface.action.ActionContributionItem}s based on the {@link org.eclipse.jface.action.IAction}s
//&&&staticSymbol&&&	 * contained in the <code>submenuActions</code> map.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	protected void depopulateManager(<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.jface.action.IContributionManager")
//&&&staticSymbol&&&%> manager, <%
//&&&staticSymbol&&&=_MapOfStringToCollectionOfIAction
//&&&staticSymbol&&&%> submenuActions)
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		if (submenuActions != null)
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.jface.action.IContributionItem")
//&&&staticSymbol&&&%>[] items = manager.getItems();
//&&&staticSymbol&&&			for (int i = 0; i < items.length; i++)
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&				<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.jface.action.IContributionItem")
//&&&staticSymbol&&&%> contributionItem = items[i];
//&&&staticSymbol&&&				if (contributionItem instanceof <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.jface.action.MenuManager")
//&&&staticSymbol&&&%>)
//&&&staticSymbol&&&				{
//&&&staticSymbol&&&					<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.jface.action.MenuManager")
//&&&staticSymbol&&&%> submenuManager = (<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.jface.action.MenuManager")
//&&&staticSymbol&&&%>)contributionItem;
//&&&staticSymbol&&&					if (submenuActions.containsKey(submenuManager.getMenuText()))
//&&&staticSymbol&&&					{
//&&&staticSymbol&&&						depopulateManager(submenuManager, <%
if (!genModel.useGenerics()) {
//&&&staticSymbol&&&%>(<%
//&&&staticSymbol&&&=_CollectionOfIAction
//&&&staticSymbol&&&%>)<%
}
//&&&staticSymbol&&&%>submenuActions.get(contributionItem));
//&&&staticSymbol&&&						manager.remove(contributionItem);
//&&&staticSymbol&&&					}
//&&&staticSymbol&&&				}
//&&&staticSymbol&&&			}
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * This populates the pop-up menu before it appears.
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
//&&&staticSymbol&&&	public void menuAboutToShow(<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.jface.action.IMenuManager")
//&&&staticSymbol&&&%> menuManager)
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		super.menuAboutToShow(menuManager);
//&&&staticSymbol&&&<%
if (genModel.isCreationCommands()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.jface.action.MenuManager")
//&&&staticSymbol&&&%> submenuManager = null;
//&&&staticSymbol&&&
//&&&staticSymbol&&&		submenuManager = new <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.jface.action.MenuManager")
//&&&staticSymbol&&&%>(<%
//&&&staticSymbol&&&=genPackage.getImportedEditorPluginClassName()
//&&&staticSymbol&&&%>.INSTANCE.getString("_UI_CreateChild_menu_item"));<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
if (genModel.isCreationSubmenus()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		populateManager(submenuManager, createChildSubmenuActions, null);
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		populateManager(submenuManager, createChildActions, null);
//&&&staticSymbol&&&		menuManager.insertBefore("edit", submenuManager);<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&		submenuManager = new <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.jface.action.MenuManager")
//&&&staticSymbol&&&%>(<%
//&&&staticSymbol&&&=genPackage.getImportedEditorPluginClassName()
//&&&staticSymbol&&&%>.INSTANCE.getString("_UI_CreateSibling_menu_item"));<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
if (genModel.isCreationSubmenus()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		populateManager(submenuManager, createSiblingSubmenuActions, null);
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		populateManager(submenuManager, createSiblingActions, null);
//&&&staticSymbol&&&		menuManager.insertBefore("edit", submenuManager);<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * This inserts global actions before the "additions-end" separator.
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
//&&&staticSymbol&&&	protected void addGlobalActions(<%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.jface.action.IMenuManager")
//&&&staticSymbol&&&%> menuManager)
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		menuManager.insertAfter("additions-end", new <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.jface.action.Separator")
//&&&staticSymbol&&&%>("ui-actions"));<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genModel.getNonNLS(2)
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		menuManager.insertAfter("ui-actions", showPropertiesViewAction);<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&		refreshViewerAction.setEnabled(refreshViewerAction.isEnabled());		
//&&&staticSymbol&&&		menuManager.insertAfter("ui-actions", refreshViewerAction);<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&		super.addGlobalActions(menuManager);
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * This ensures that a delete action will clean up all references to deleted objects.
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
//&&&staticSymbol&&&	protected boolean removeAllReferencesOnDelete()
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		return true;
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&}
//&&&staticSymbol&&&<%
genModel.emitSortedImports();
//&&&staticSymbol&&&%>

}
}