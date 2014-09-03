class Advisor {
public static void main (String[] args) {
//&&&staticSymbol&&&<%import org.eclipse.emf.codegen.ecore.genmodel.*;%>
//&&&staticSymbol&&&<%include("../Header.javajetinc");%>
//&&&staticSymbol&&&<%

/**
 * Copyright (c) 2004-2010 IBM Corporation and others.
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
GenModel genModel = (GenModel)argument;
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
String _ListOfString = "List" + (genModel.useGenerics() ? "<String>" : "");
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
String _UniqueEListOfString = "UniqueEList" + (genModel.useGenerics() ? "<String>" : "");
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
String _StringBuilder = genModel.getImportedName(genModel.useGenerics() ? "java.lang.StringBuilder" : "java.lang.StringBuffer");
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&package <%
//&&&staticSymbol&&&=genModel.getEditorPluginPackageName()
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
if (!genModel.isRichAjaxPlatform()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
if (!genModel.useGenerics()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
if (genModel.getAllGenPackagesWithConcreteClasses().size() > 1) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
if (!genModel.isRichAjaxPlatform()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
if (!genModel.isRichAjaxPlatform()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
if (!genModel.isRichAjaxPlatform()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
if (genModel.getAllGenPackagesWithConcreteClasses().size() > 1) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
genModel.markImportLocation(stringBuffer);
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&
//&&&staticSymbol&&&/**
//&&&staticSymbol&&& * Customized {@link WorkbenchAdvisor} for the RCP application.
//&&&staticSymbol&&& * <!-- begin-user-doc -->
//&&&staticSymbol&&& * <!-- end-user-doc -->
//&&&staticSymbol&&& * @generated
//&&&staticSymbol&&& */
//&&&staticSymbol&&&public final class <%
//&&&staticSymbol&&&=genModel.getEditorAdvisorClassName()
//&&&staticSymbol&&&%> extends WorkbenchAdvisor
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
if (!genModel.isRichAjaxPlatform()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * The default file extension filters for use in dialogs.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&  <%
if (genModel.getAllGenPackagesWithConcreteClasses().size() == 1) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	private static final String[] FILE_EXTENSION_FILTERS = <%
if (!genModel.useGenerics()) {
//&&&staticSymbol&&&%>(String[])<%
}
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genModel.getAllGenPackagesWithConcreteClasses().get(0).getImportedEditorClassName()
//&&&staticSymbol&&&%>.FILE_EXTENSION_FILTERS.toArray(new String[0]);
//&&&staticSymbol&&&  <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	private static final String[] FILE_EXTENSION_FILTERS = getFileExtensionFilters();
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * Returns the default file extension filters. This method should only be used to initialize {@link #FILE_EXTENSION_FILTERS}.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	private static String[] getFileExtensionFilters()
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=_ListOfString
//&&&staticSymbol&&&%> result = new <%
//&&&staticSymbol&&&=_UniqueEListOfString
//&&&staticSymbol&&&%>();
//&&&staticSymbol&&&    <%
for (GenPackage genPackage : genModel.getAllGenPackagesWithConcreteClasses()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		result.addAll(<%
//&&&staticSymbol&&&=genPackage.getImportedEditorClassName()
//&&&staticSymbol&&&%>.FILE_EXTENSION_FILTERS);
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		return <%
if (!genModel.useGenerics()) {
//&&&staticSymbol&&&%>(String[])<%
}
//&&&staticSymbol&&&%>result.toArray(new String[0]);
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%> 
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
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
//&&&staticSymbol&&&=genModel.getEditorPluginClassName()
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
//&&&staticSymbol&&&=genModel.getQualifiedEditorPluginClassName()
//&&&staticSymbol&&&%>.INSTANCE.getString(key, new Object [] { s1 });
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * RCP's application
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	public static class Application implements IApplication
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		/**
//&&&staticSymbol&&&		 * @see org.eclipse.equinox.app.IApplication#start(org.eclipse.equinox.app.IApplicationContext)
//&&&staticSymbol&&&		 * <!-- begin-user-doc -->
//&&&staticSymbol&&&		 * <!-- end-user-doc -->
//&&&staticSymbol&&&		 * @generated
//&&&staticSymbol&&&		 */
//&&&staticSymbol&&&		public Object start(IApplicationContext context) throws Exception
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			WorkbenchAdvisor workbenchAdvisor = new <%
//&&&staticSymbol&&&=genModel.getEditorAdvisorClassName()
//&&&staticSymbol&&&%>();
//&&&staticSymbol&&&			Display display = PlatformUI.createDisplay();
//&&&staticSymbol&&&			try
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&				int returnCode = PlatformUI.createAndRunWorkbench(display, workbenchAdvisor);
//&&&staticSymbol&&&				if (returnCode == PlatformUI.RETURN_RESTART)
//&&&staticSymbol&&&				{
//&&&staticSymbol&&&					return IApplication.EXIT_RESTART;
//&&&staticSymbol&&&				}
//&&&staticSymbol&&&				else
//&&&staticSymbol&&&				{
//&&&staticSymbol&&&					return IApplication.EXIT_OK;
//&&&staticSymbol&&&				}
//&&&staticSymbol&&&			}
//&&&staticSymbol&&&			finally
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&				display.dispose();
//&&&staticSymbol&&&			}
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&
//&&&staticSymbol&&&		/**
//&&&staticSymbol&&&		 * @see org.eclipse.equinox.app.IApplication#stop()
//&&&staticSymbol&&&		 * <!-- begin-user-doc -->
//&&&staticSymbol&&&		 * <!-- end-user-doc -->
//&&&staticSymbol&&&		 * @generated
//&&&staticSymbol&&&		 */
//&&&staticSymbol&&&		public void stop()
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			// Do nothing.
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * RCP's perspective
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	public static class Perspective implements IPerspectiveFactory
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		/**
//&&&staticSymbol&&&		 * Perspective ID
//&&&staticSymbol&&&		 * <!-- begin-user-doc -->
//&&&staticSymbol&&&		 * <!-- end-user-doc -->
//&&&staticSymbol&&&		 * @generated
//&&&staticSymbol&&&		 */
//&&&staticSymbol&&&		public static final String ID_PERSPECTIVE = "<%
//&&&staticSymbol&&&=genModel.getQualifiedEditorAdvisorClassName()
//&&&staticSymbol&&&%>Perspective";<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&		/**
//&&&staticSymbol&&&		 * @see org.eclipse.ui.IPerspectiveFactory#createInitialLayout(org.eclipse.ui.IPageLayout)
//&&&staticSymbol&&&		 * <!-- begin-user-doc -->
//&&&staticSymbol&&&		 * <!-- end-user-doc -->
//&&&staticSymbol&&&		 * @generated
//&&&staticSymbol&&&		 */
//&&&staticSymbol&&&		public void createInitialLayout(IPageLayout layout)
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			layout.setEditorAreaVisible(true);
//&&&staticSymbol&&&			layout.addPerspectiveShortcut(ID_PERSPECTIVE);
//&&&staticSymbol&&&
//&&&staticSymbol&&&			IFolderLayout right = layout.createFolder("right", IPageLayout.RIGHT, (float)0.66, layout.getEditorArea());<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			right.addView(IPageLayout.ID_OUTLINE);
//&&&staticSymbol&&&
//&&&staticSymbol&&&			IFolderLayout bottonRight = layout.createFolder("bottonRight", IPageLayout.BOTTOM, (float)0.60, "right");<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genModel.getNonNLS(2)
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			bottonRight.addView(IPageLayout.ID_PROP_SHEET);
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&	
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * RCP's window advisor
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	public static class WindowAdvisor extends WorkbenchWindowAdvisor
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		/**
//&&&staticSymbol&&&		 * @see WorkbenchWindowAdvisor#WorkbenchWindowAdvisor(org.eclipse.ui.application.IWorkbenchWindowConfigurer)
//&&&staticSymbol&&&		 * <!-- begin-user-doc -->
//&&&staticSymbol&&&		 * <!-- end-user-doc -->
//&&&staticSymbol&&&		 * @generated
//&&&staticSymbol&&&		 */
//&&&staticSymbol&&&		public WindowAdvisor(IWorkbenchWindowConfigurer configurer)
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			super(configurer);
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&		
//&&&staticSymbol&&&		/**
//&&&staticSymbol&&&		 * @see org.eclipse.ui.application.WorkbenchWindowAdvisor#preWindowOpen()
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
//&&&staticSymbol&&&		public void preWindowOpen()
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			IWorkbenchWindowConfigurer configurer = getWindowConfigurer();
//&&&staticSymbol&&&			configurer.setInitialSize(new Point(600, 450));
//&&&staticSymbol&&&			configurer.setShowCoolBar(false);
//&&&staticSymbol&&&			configurer.setShowStatusLine(true);
//&&&staticSymbol&&&			configurer.setTitle(getString("_UI_Application_title"));<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&		
//&&&staticSymbol&&&		/**
//&&&staticSymbol&&&		 * @see org.eclipse.ui.application.WorkbenchWindowAdvisor#createActionBarAdvisor(org.eclipse.ui.application.IActionBarConfigurer)
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
//&&&staticSymbol&&&		public ActionBarAdvisor createActionBarAdvisor(IActionBarConfigurer configurer)
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			return new WindowActionBarAdvisor(configurer);
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * RCP's action bar advisor
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	public static class WindowActionBarAdvisor extends ActionBarAdvisor
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		/**
//&&&staticSymbol&&&		 * @see ActionBarAdvisor#ActionBarAdvisor(org.eclipse.ui.application.IActionBarConfigurer)
//&&&staticSymbol&&&		 * <!-- begin-user-doc -->
//&&&staticSymbol&&&		 * <!-- end-user-doc -->
//&&&staticSymbol&&&		 * @generated
//&&&staticSymbol&&&		 */
//&&&staticSymbol&&&		public WindowActionBarAdvisor(IActionBarConfigurer configurer)
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			super(configurer);
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&		
//&&&staticSymbol&&&		/**
//&&&staticSymbol&&&		 * @see org.eclipse.ui.application.ActionBarAdvisor#fillMenuBar(org.eclipse.jface.action.IMenuManager)
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
//&&&staticSymbol&&&		protected void fillMenuBar(IMenuManager menuBar)
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			IWorkbenchWindow window = getActionBarConfigurer().getWindowConfigurer().getWindow();
//&&&staticSymbol&&&			menuBar.add(createFileMenu(window));
//&&&staticSymbol&&&			menuBar.add(createEditMenu(window));
//&&&staticSymbol&&&			menuBar.add(new GroupMarker(IWorkbenchActionConstants.MB_ADDITIONS));
//&&&staticSymbol&&&			menuBar.add(createWindowMenu(window));
//&&&staticSymbol&&&			menuBar.add(createHelpMenu(window));					
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&		
//&&&staticSymbol&&&		/**
//&&&staticSymbol&&&		 * Creates the 'File' menu.
//&&&staticSymbol&&&		 * <!-- begin-user-doc -->
//&&&staticSymbol&&&		 * <!-- end-user-doc -->
//&&&staticSymbol&&&		 * @generated
//&&&staticSymbol&&&		 */
//&&&staticSymbol&&&		protected IMenuManager createFileMenu(IWorkbenchWindow window)
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			IMenuManager menu = new MenuManager(getString("_UI_Menu_File_label"),<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			IWorkbenchActionConstants.M_FILE);    
//&&&staticSymbol&&&			menu.add(new GroupMarker(IWorkbenchActionConstants.FILE_START));
//&&&staticSymbol&&&	
//&&&staticSymbol&&&			IMenuManager newMenu = new MenuManager(getString("_UI_Menu_New_label"), "new");<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genModel.getNonNLS(2)
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			newMenu.add(new GroupMarker(IWorkbenchActionConstants.MB_ADDITIONS));
//&&&staticSymbol&&&	
//&&&staticSymbol&&&			menu.add(newMenu);
//&&&staticSymbol&&&			menu.add(new Separator());
//&&&staticSymbol&&&			menu.add(new GroupMarker(IWorkbenchActionConstants.MB_ADDITIONS));
//&&&staticSymbol&&&			menu.add(new Separator());
//&&&staticSymbol&&&			addToMenuAndRegister(menu, ActionFactory.CLOSE.create(window));
//&&&staticSymbol&&&			addToMenuAndRegister(menu, ActionFactory.CLOSE_ALL.create(window));
//&&&staticSymbol&&&			menu.add(new Separator());
//&&&staticSymbol&&&			addToMenuAndRegister(menu, ActionFactory.SAVE.create(window));
//&&&staticSymbol&&&			addToMenuAndRegister(menu, ActionFactory.SAVE_AS.create(window));
//&&&staticSymbol&&&			addToMenuAndRegister(menu, ActionFactory.SAVE_ALL.create(window));
//&&&staticSymbol&&&			menu.add(new Separator());
//&&&staticSymbol&&&			addToMenuAndRegister(menu, ActionFactory.QUIT.create(window));
//&&&staticSymbol&&&			menu.add(new GroupMarker(IWorkbenchActionConstants.FILE_END));
//&&&staticSymbol&&&			return menu;
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&
//&&&staticSymbol&&&		/**
//&&&staticSymbol&&&		 * Creates the 'Edit' menu.
//&&&staticSymbol&&&		 * <!-- begin-user-doc -->
//&&&staticSymbol&&&		 * <!-- end-user-doc -->
//&&&staticSymbol&&&		 * @generated
//&&&staticSymbol&&&		 */
//&&&staticSymbol&&&		protected IMenuManager createEditMenu(IWorkbenchWindow window)
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			IMenuManager menu = new MenuManager(getString("_UI_Menu_Edit_label"),<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			IWorkbenchActionConstants.M_EDIT);
//&&&staticSymbol&&&			menu.add(new GroupMarker(IWorkbenchActionConstants.EDIT_START));
//&&&staticSymbol&&&	
//&&&staticSymbol&&&			addToMenuAndRegister(menu, ActionFactory.UNDO.create(window));
//&&&staticSymbol&&&			addToMenuAndRegister(menu, ActionFactory.REDO.create(window));
//&&&staticSymbol&&&			menu.add(new GroupMarker(IWorkbenchActionConstants.UNDO_EXT));
//&&&staticSymbol&&&			menu.add(new Separator());
//&&&staticSymbol&&&	
//&&&staticSymbol&&&			addToMenuAndRegister(menu, ActionFactory.CUT.create(window));
//&&&staticSymbol&&&			addToMenuAndRegister(menu, ActionFactory.COPY.create(window));
//&&&staticSymbol&&&			addToMenuAndRegister(menu, ActionFactory.PASTE.create(window));
//&&&staticSymbol&&&			menu.add(new GroupMarker(IWorkbenchActionConstants.CUT_EXT));
//&&&staticSymbol&&&			menu.add(new Separator());
//&&&staticSymbol&&&	
//&&&staticSymbol&&&			addToMenuAndRegister(menu, ActionFactory.DELETE.create(window));
//&&&staticSymbol&&&			addToMenuAndRegister(menu, ActionFactory.SELECT_ALL.create(window));
//&&&staticSymbol&&&			menu.add(new Separator());
//&&&staticSymbol&&&	
//&&&staticSymbol&&&			menu.add(new GroupMarker(IWorkbenchActionConstants.ADD_EXT));
//&&&staticSymbol&&&	
//&&&staticSymbol&&&			menu.add(new GroupMarker(IWorkbenchActionConstants.EDIT_END));
//&&&staticSymbol&&&			menu.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
//&&&staticSymbol&&&			return menu;
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&	
//&&&staticSymbol&&&		/**
//&&&staticSymbol&&&		 * Creates the 'Window' menu.
//&&&staticSymbol&&&		 * <!-- begin-user-doc -->
//&&&staticSymbol&&&		 * <!-- end-user-doc -->
//&&&staticSymbol&&&		 * @generated
//&&&staticSymbol&&&		 */
//&&&staticSymbol&&&		protected IMenuManager createWindowMenu(IWorkbenchWindow window)
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			IMenuManager menu = new MenuManager(getString("_UI_Menu_Window_label"),<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			IWorkbenchActionConstants.M_WINDOW);
//&&&staticSymbol&&&	
//&&&staticSymbol&&&			addToMenuAndRegister(menu, ActionFactory.OPEN_NEW_WINDOW.create(window));
//&&&staticSymbol&&&			menu.add(new GroupMarker(IWorkbenchActionConstants.MB_ADDITIONS));
//&&&staticSymbol&&&<%
if (!genModel.isRichAjaxPlatform()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			menu.add(ContributionItemFactory.OPEN_WINDOWS.create(window));
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	
//&&&staticSymbol&&&			return menu;
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&	
//&&&staticSymbol&&&		/**
//&&&staticSymbol&&&		 * Creates the 'Help' menu.
//&&&staticSymbol&&&		 * <!-- begin-user-doc -->
//&&&staticSymbol&&&		 * <!-- end-user-doc -->
//&&&staticSymbol&&&		 * @generated
//&&&staticSymbol&&&		 */
//&&&staticSymbol&&&		protected IMenuManager createHelpMenu(IWorkbenchWindow window)
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			IMenuManager menu = new MenuManager(getString("_UI_Menu_Help_label"), IWorkbenchActionConstants.M_HELP);<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			// Welcome or intro page would go here
//&&&staticSymbol&&&			// Help contents would go here
//&&&staticSymbol&&&			// Tips and tricks page would go here
//&&&staticSymbol&&&			menu.add(new GroupMarker(IWorkbenchActionConstants.HELP_START));
//&&&staticSymbol&&&			menu.add(new GroupMarker(IWorkbenchActionConstants.HELP_END));
//&&&staticSymbol&&&			menu.add(new GroupMarker(IWorkbenchActionConstants.MB_ADDITIONS));
//&&&staticSymbol&&&			return menu;
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&		
//&&&staticSymbol&&&		/**
//&&&staticSymbol&&&		 * Adds the specified action to the given menu and also registers the action with the
//&&&staticSymbol&&&		 * action bar configurer, in order to activate its key binding.
//&&&staticSymbol&&&		 * <!-- begin-user-doc -->
//&&&staticSymbol&&&		 * <!-- end-user-doc -->
//&&&staticSymbol&&&		 * @generated
//&&&staticSymbol&&&		 */
//&&&staticSymbol&&&		protected void addToMenuAndRegister(IMenuManager menuManager, IAction action)
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			menuManager.add(action);
//&&&staticSymbol&&&			getActionBarConfigurer().registerGlobalAction(action);
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&	
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * About action for the RCP application.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	public static class AboutAction extends WorkbenchWindowActionDelegate
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		/**
//&&&staticSymbol&&&		 * @see org.eclipse.ui.IActionDelegate#run(org.eclipse.jface.action.IAction)
//&&&staticSymbol&&&		 * <!-- begin-user-doc -->
//&&&staticSymbol&&&		 * <!-- end-user-doc -->
//&&&staticSymbol&&&		 * @generated
//&&&staticSymbol&&&		 */
//&&&staticSymbol&&&		public void run(IAction action)
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			MessageDialog.openInformation(getWindow().getShell(), getString("_UI_About_title"),<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			getString("_UI_About_text"));<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&	
//&&&staticSymbol&&&<%
if (!genModel.isRichAjaxPlatform()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * Open action for the objects from the <%
//&&&staticSymbol&&&=genModel.getModelName()
//&&&staticSymbol&&&%> model.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	public static class OpenAction extends WorkbenchWindowActionDelegate
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		/**
//&&&staticSymbol&&&		 * Opens the editors for the files selected using the file dialog.
//&&&staticSymbol&&&		 * <!-- begin-user-doc -->
//&&&staticSymbol&&&		 * <!-- end-user-doc -->
//&&&staticSymbol&&&		 * @generated
//&&&staticSymbol&&&		 */
//&&&staticSymbol&&&		public void run(IAction action)
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			String[] filePaths = openFilePathDialog(getWindow().getShell(), SWT.OPEN, null);
//&&&staticSymbol&&&			if (filePaths.length > 0)
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&				openEditor(getWindow().getWorkbench(), URI.createFileURI(filePaths[0]));
//&&&staticSymbol&&&			}
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * Open URI action for the objects from the <%
//&&&staticSymbol&&&=genModel.getModelName()
//&&&staticSymbol&&&%> model.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	public static class OpenURIAction extends WorkbenchWindowActionDelegate
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		/**
//&&&staticSymbol&&&		 * Opens the editors for the files selected using the LoadResourceDialog.
//&&&staticSymbol&&&		 * <!-- begin-user-doc -->
//&&&staticSymbol&&&		 * <!-- end-user-doc -->
//&&&staticSymbol&&&		 * @generated
//&&&staticSymbol&&&		 */
//&&&staticSymbol&&&		public void run(IAction action)
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			LoadResourceAction.LoadResourceDialog loadResourceDialog = new LoadResourceAction.LoadResourceDialog(getWindow().getShell());
//&&&staticSymbol&&&			if (Window.OK == loadResourceDialog.open())
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&<%
if (genModel.useGenerics()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				for (URI uri : loadResourceDialog.getURIs())
//&&&staticSymbol&&&				{
//&&&staticSymbol&&&					openEditor(getWindow().getWorkbench(), uri);
//&&&staticSymbol&&&				}
//&&&staticSymbol&&&<%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				for (Iterator i = loadResourceDialog.getURIs().iterator(); i.hasNext();)
//&&&staticSymbol&&&				{
//&&&staticSymbol&&&					openEditor(getWindow().getWorkbench(), (URI)i.next());
//&&&staticSymbol&&&				}
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			}
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&	
//&&&staticSymbol&&&<%
if (!genModel.isRichAjaxPlatform()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	public static String[] openFilePathDialog(Shell shell, int style, String[] fileExtensionFilters)
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		return openFilePathDialog(shell, style, fileExtensionFilters, (style & SWT.OPEN) != 0, (style & SWT.OPEN) != 0, (style & SWT.SAVE) != 0);
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	public static String[] openFilePathDialog(Shell shell, int style, String[] fileExtensionFilters, boolean includeGroupFilter, boolean includeAllFilter, boolean addExtension)
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		FileDialog fileDialog = new FileDialog(shell, style);
//&&&staticSymbol&&&		if (fileExtensionFilters == null)
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			fileExtensionFilters = FILE_EXTENSION_FILTERS;
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&		
//&&&staticSymbol&&&		// If requested, augment the file extension filters by adding a group of all the other filters (*.ext1;*.ext2;...)
//&&&staticSymbol&&&		// at the beginning and/or an all files wildcard (*.*) at the end.
//&&&staticSymbol&&&		//
//&&&staticSymbol&&&		includeGroupFilter &= fileExtensionFilters.length > 1;
//&&&staticSymbol&&&		int offset = includeGroupFilter ? 1 : 0;
//&&&staticSymbol&&&		
//&&&staticSymbol&&&		if (includeGroupFilter || includeAllFilter)
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			int size = fileExtensionFilters.length + offset + (includeAllFilter ? 1 : 0);
//&&&staticSymbol&&&			String[] allFilters = new String[size];
//&&&staticSymbol&&&			<%
//&&&staticSymbol&&&=_StringBuilder
//&&&staticSymbol&&&%> group = includeGroupFilter ? new <%
//&&&staticSymbol&&&=_StringBuilder
//&&&staticSymbol&&&%>() : null;
//&&&staticSymbol&&&			
//&&&staticSymbol&&&			for (int i = 0; i < fileExtensionFilters.length; i++)
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&				if (includeGroupFilter)
//&&&staticSymbol&&&				{
//&&&staticSymbol&&&					if (i != 0)
//&&&staticSymbol&&&					{
//&&&staticSymbol&&&						group.append(';');
//&&&staticSymbol&&&					}
//&&&staticSymbol&&&					group.append(fileExtensionFilters[i]);
//&&&staticSymbol&&&				}
//&&&staticSymbol&&&				allFilters[i + offset] = fileExtensionFilters[i];
//&&&staticSymbol&&&			}
//&&&staticSymbol&&&			
//&&&staticSymbol&&&			if (includeGroupFilter)
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&				allFilters[0] = group.toString();
//&&&staticSymbol&&&			}
//&&&staticSymbol&&&			if (includeAllFilter)
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&				allFilters[allFilters.length - 1] = "*.*";<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			}
//&&&staticSymbol&&&			
//&&&staticSymbol&&&			fileDialog.setFilterExtensions(allFilters);
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&		else
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			fileDialog.setFilterExtensions(fileExtensionFilters);
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&		fileDialog.open();
//&&&staticSymbol&&&		
//&&&staticSymbol&&&		String[] filenames = fileDialog.getFileNames();
//&&&staticSymbol&&&		String[] result = new String[filenames.length];
//&&&staticSymbol&&&		String path = fileDialog.getFilterPath() + File.separator;
//&&&staticSymbol&&&		String extension = null;
//&&&staticSymbol&&&		
//&&&staticSymbol&&&		// If extension adding requested, get the dotted extension corresponding to the selected filter.
//&&&staticSymbol&&&		//
//&&&staticSymbol&&&		if (addExtension)
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			int i = fileDialog.getFilterIndex();
//&&&staticSymbol&&&			if (i != -1 && (!includeAllFilter || i != fileExtensionFilters.length))
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&				i = includeGroupFilter && i == 0 ? 0 : i - offset;
//&&&staticSymbol&&&				String filter = fileExtensionFilters[i];
//&&&staticSymbol&&&				int dot = filter.lastIndexOf('.');
//&&&staticSymbol&&&				if (dot == 1 && filter.charAt(0) == '*')
//&&&staticSymbol&&&				{
//&&&staticSymbol&&&					extension = filter.substring(dot);
//&&&staticSymbol&&&				}
//&&&staticSymbol&&&			}
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&		
//&&&staticSymbol&&&		// Build the result by adding the selected path and, if needed, auto-appending the extension.
//&&&staticSymbol&&&		//
//&&&staticSymbol&&&		for (int i = 0; i < filenames.length; i++)
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			String filename = path + filenames[i];
//&&&staticSymbol&&&			if (extension != null)
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&				int dot = filename.lastIndexOf('.');
//&&&staticSymbol&&&				if (dot == -1 || !Arrays.asList(fileExtensionFilters).contains("*" + filename.substring(dot)))<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				{
//&&&staticSymbol&&&					filename += extension;
//&&&staticSymbol&&&				}
//&&&staticSymbol&&&			}
//&&&staticSymbol&&&			result[i] = filename;
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&		return result;
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	public static boolean openEditor(IWorkbench workbench, URI uri)
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		IWorkbenchWindow workbenchWindow = workbench.getActiveWorkbenchWindow();
//&&&staticSymbol&&&		IWorkbenchPage page = workbenchWindow.getActivePage();
//&&&staticSymbol&&&		
//&&&staticSymbol&&&		IEditorDescriptor editorDescriptor = EditUIUtil.getDefaultEditor(uri, null);
//&&&staticSymbol&&&		if (editorDescriptor == null)
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			MessageDialog.openError(
//&&&staticSymbol&&&				workbenchWindow.getShell(),
//&&&staticSymbol&&&				getString("_UI_Error_title"),<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				getString("_WARN_No_Editor", uri.lastSegment()));<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			return false;
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&		else
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			try
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&				page.openEditor(new URIEditorInput(uri), editorDescriptor.getId());
//&&&staticSymbol&&&			}
//&&&staticSymbol&&&			catch (PartInitException exception)
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&				MessageDialog.openError(
//&&&staticSymbol&&&					workbenchWindow.getShell(),
//&&&staticSymbol&&&					getString("_UI_OpenEditorError_label"),<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&					exception.getMessage());
//&&&staticSymbol&&&				return false;
//&&&staticSymbol&&&			}
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&		return true;
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&	
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * @see org.eclipse.ui.application.WorkbenchAdvisor#getInitialWindowPerspectiveId()
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
//&&&staticSymbol&&&	public String getInitialWindowPerspectiveId()
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		return Perspective.ID_PERSPECTIVE;
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * @see org.eclipse.ui.application.WorkbenchAdvisor#initialize(org.eclipse.ui.application.IWorkbenchConfigurer)
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
//&&&staticSymbol&&&	public void initialize(IWorkbenchConfigurer configurer)
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		super.initialize(configurer);
//&&&staticSymbol&&&		configurer.setSaveAndRestore(true);
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&	
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * @see org.eclipse.ui.application.WorkbenchAdvisor#createWorkbenchWindowAdvisor(org.eclipse.ui.application.IWorkbenchWindowConfigurer)
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
//&&&staticSymbol&&&	public WorkbenchWindowAdvisor createWorkbenchWindowAdvisor(IWorkbenchWindowConfigurer configurer)
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		return new WindowAdvisor(configurer);
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&}
//&&&staticSymbol&&&<%
genModel.emitSortedImports();
//&&&staticSymbol&&&%>

}
}