class PackageExample {
public static void main (String[] args) {
//&&&staticSymbol&&&<%import org.eclipse.emf.codegen.ecore.genmodel.*;%>
//&&&staticSymbol&&&<%include("../Header.javajetinc");%>
//&&&staticSymbol&&&<%

/**
 * Copyright (c) 2005-2007 IBM Corporation and others.
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
GenPackage genPackage = (GenPackage)argument; GenModel genModel = genPackage.getGenModel();
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%

String _System = genModel.getImportedName("java.lang.System");
String _String = genModel.getImportedName("java.lang.String");
String _RuntimeException = genModel.getImportedName("java.lang.RuntimeException");
String _File = genModel.getImportedName("java.io.File");
String _Iterator = null;
if (!genModel.useGenerics()) {
  _Iterator = genModel.getImportedName("java.util.Iterator");
}
String _Diagnostic = genModel.getImportedName("org.eclipse.emf.common.util.Diagnostic");
String _URI = genModel.getImportedName("org.eclipse.emf.common.util.URI");
String _EObject = genModel.getImportedName("org.eclipse.emf.ecore.EObject");
String _Diagnostician = genModel.getImportedName("org.eclipse.emf.ecore.util.Diagnostician");
String _Resource = genModel.getImportedName("org.eclipse.emf.ecore.resource.Resource");
String _ResourceSet = genModel.getImportedName("org.eclipse.emf.ecore.resource.ResourceSet");
String _ResourceSetImpl = genModel.getImportedName("org.eclipse.emf.ecore.resource.impl.ResourceSetImpl");

//&&&staticSymbol&&&%>
//&&&staticSymbol&&&package <%
//&&&staticSymbol&&&=genPackage.getTestsPackageName()
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
genModel.markImportLocation(stringBuffer);
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&/**
//&&&staticSymbol&&& * <!-- begin-user-doc -->
//&&&staticSymbol&&& * A sample utility for the '<em><b><%
//&&&staticSymbol&&&=genPackage.getPackageName()
//&&&staticSymbol&&&%></b></em>' package.
//&&&staticSymbol&&& * <!-- end-user-doc -->
//&&&staticSymbol&&& * @generated
//&&&staticSymbol&&& */
//&&&staticSymbol&&&public class <%
//&&&staticSymbol&&&=genPackage.getExampleClassName()
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
//&&&staticSymbol&&&=_String
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
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * Load all the argument file paths or URIs as instances of the model.
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @param args the file paths or URIs.
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	public static void main(String[] args)
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		// Create a resource set to hold the resources.
//&&&staticSymbol&&&		//
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=_ResourceSet
//&&&staticSymbol&&&%> resourceSet = new <%
//&&&staticSymbol&&&=_ResourceSetImpl
//&&&staticSymbol&&&%>();
//&&&staticSymbol&&&		
//&&&staticSymbol&&&<%
if (genPackage.isContentType()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		// Register the appropriate resource factory to handle the content type.
//&&&staticSymbol&&&		//
//&&&staticSymbol&&&		resourceSet.getResourceFactoryRegistry().getContentTypeToFactoryMap().put
//&&&staticSymbol&&&			(<%
//&&&staticSymbol&&&=genPackage.getImportedPackageInterfaceName()
//&&&staticSymbol&&&%>.eCONTENT_TYPE,
//&&&staticSymbol&&&			 new <%
//&&&staticSymbol&&&=genModel.getImportedName(genPackage.getQualifiedEffectiveResourceFactoryClassName())
//&&&staticSymbol&&&%>());
//&&&staticSymbol&&&		
//&&&staticSymbol&&&		// Register the appropriate content handler for all file extensions and any element from the package's namespace.
//&&&staticSymbol&&&		//
//&&&staticSymbol&&&		resourceSet.getURIConverter().getContentHandlers().add
//&&&staticSymbol&&&			(new <%
//&&&staticSymbol&&&=genModel.getImportedName("org.eclipse.emf.ecore.xmi.impl.RootXMLContentHandlerImpl")
//&&&staticSymbol&&&%>(<%
//&&&staticSymbol&&&=genPackage.getImportedPackageInterfaceName()
//&&&staticSymbol&&&%>.eCONTENT_TYPE, null, null, <%
if (genPackage.hasTargetNamespace()) {
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=genPackage.getImportedPackageInterfaceName()
//&&&staticSymbol&&&%>.eNS_URI<%
} else {
//&&&staticSymbol&&&%>(<%
//&&&staticSymbol&&&=_String
//&&&staticSymbol&&&%>)null<%
}
//&&&staticSymbol&&&%>, null));
//&&&staticSymbol&&&<%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		// Register the appropriate resource factory to handle all file extensions.
//&&&staticSymbol&&&		//
//&&&staticSymbol&&&		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put
//&&&staticSymbol&&&			(Resource.Factory.Registry.DEFAULT_EXTENSION, 
//&&&staticSymbol&&&			 new <%
//&&&staticSymbol&&&=genModel.getImportedName(genPackage.getQualifiedEffectiveResourceFactoryClassName())
//&&&staticSymbol&&&%>());
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&		// Register the package to ensure it is available during loading.
//&&&staticSymbol&&&		//
//&&&staticSymbol&&&		resourceSet.getPackageRegistry().put
//&&&staticSymbol&&&			(<%
//&&&staticSymbol&&&=genPackage.getImportedPackageInterfaceName()
//&&&staticSymbol&&&%>.eNS_URI, 
//&&&staticSymbol&&&			 <%
//&&&staticSymbol&&&=genPackage.getImportedPackageInterfaceName()
//&&&staticSymbol&&&%>.eINSTANCE);
//&&&staticSymbol&&&        
//&&&staticSymbol&&&		// If there are no arguments, emit an appropriate usage message.
//&&&staticSymbol&&&		//
//&&&staticSymbol&&&		if (args.length == 0)
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&<%
if (genPackage.getRootClass() != null) { GenClass rootClass = genPackage.getRootClass();
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			System.out.println("Enter a list of file paths or URIs that have content like this:");<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			try
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&  <%
if (genPackage.isContentType()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				<%
//&&&staticSymbol&&&=_Resource
//&&&staticSymbol&&&%> resource = resourceSet.createResource(<%
//&&&staticSymbol&&&=_URI
//&&&staticSymbol&&&%>.createURI("http:///My.<%
//&&&staticSymbol&&&=genPackage.getFileExtension()
//&&&staticSymbol&&&%>"), <%
//&&&staticSymbol&&&=genPackage.getImportedPackageInterfaceName()
//&&&staticSymbol&&&%>.eCONTENT_TYPE);<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				<%
//&&&staticSymbol&&&=_Resource
//&&&staticSymbol&&&%> resource = resourceSet.createResource(<%
//&&&staticSymbol&&&=_URI
//&&&staticSymbol&&&%>.createURI("http:///My.<%
//&&&staticSymbol&&&=genPackage.getFileExtension()
//&&&staticSymbol&&&%>"));<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&  <%
if (genPackage.getRootFeature() != null) { GenFeature rootFeature = genPackage.getRootFeature(); GenClass documentRoot = rootFeature.getGenClass();
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				<%
//&&&staticSymbol&&&=documentRoot.getImportedInterfaceName()
//&&&staticSymbol&&&%> documentRoot = <%
//&&&staticSymbol&&&=genPackage.getQualifiedEFactoryInternalInstanceAccessor()
//&&&staticSymbol&&&%>.create<%
//&&&staticSymbol&&&=documentRoot.getName()
//&&&staticSymbol&&&%>();
//&&&staticSymbol&&&				<%
//&&&staticSymbol&&&=rootClass.getImportedInterfaceName()
//&&&staticSymbol&&&%> root = <%
//&&&staticSymbol&&&=rootClass.getGenPackage().getQualifiedEFactoryInternalInstanceAccessor()
//&&&staticSymbol&&&%>.create<%
//&&&staticSymbol&&&=rootClass.getName()
//&&&staticSymbol&&&%>();
//&&&staticSymbol&&&    <%
if (documentRoot.isDynamic()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				documentRoot.eSet(<%
//&&&staticSymbol&&&=rootFeature.getQualifiedFeatureAccessor()
//&&&staticSymbol&&&%>, root);
//&&&staticSymbol&&&    <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				documentRoot.set<%
//&&&staticSymbol&&&=rootFeature.getCapName()
//&&&staticSymbol&&&%>(root);
//&&&staticSymbol&&&    <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				resource.getContents().add(<%
if (!documentRoot.isEObjectExtension()){
//&&&staticSymbol&&&%>(<%
//&&&staticSymbol&&&=_EObject
//&&&staticSymbol&&&%>)<%
}
//&&&staticSymbol&&&%>documentRoot);
//&&&staticSymbol&&&  <%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				<%
//&&&staticSymbol&&&=rootClass.getImportedInterfaceName()
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=rootClass.getInterfaceWildTypeArguments()
//&&&staticSymbol&&&%> root = <%
//&&&staticSymbol&&&=rootClass.getGenPackage().getQualifiedEFactoryInternalInstanceAccessor()
//&&&staticSymbol&&&%>.create<%
//&&&staticSymbol&&&=rootClass.getName()
//&&&staticSymbol&&&%>();
//&&&staticSymbol&&&				resource.getContents().add(<%
if (!rootClass.isEObjectExtension()){
//&&&staticSymbol&&&%>(<%
//&&&staticSymbol&&&=_EObject
//&&&staticSymbol&&&%>)<%
}
//&&&staticSymbol&&&%>root);
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				resource.save(<%
//&&&staticSymbol&&&=_System
//&&&staticSymbol&&&%>.out, null);
//&&&staticSymbol&&&			}
//&&&staticSymbol&&&			catch (<%
//&&&staticSymbol&&&=genModel.getImportedName("java.io.IOException")
//&&&staticSymbol&&&%> exception) 
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&				exception.printStackTrace();
//&&&staticSymbol&&&			}
//&&&staticSymbol&&&<%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			System.out.println("Enter a list of file paths or URIs");
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&		else
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			// Iterate over all the arguments.
//&&&staticSymbol&&&			//
//&&&staticSymbol&&&			for (int i = 0; i < args.length; ++i)
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&				// Construct the URI for the instance file.
//&&&staticSymbol&&&				// The argument is treated as a file path only if it denotes an existing file.
//&&&staticSymbol&&&				// Otherwise, it's directly treated as a URL.
//&&&staticSymbol&&&				//
//&&&staticSymbol&&&				<%
//&&&staticSymbol&&&=_File
//&&&staticSymbol&&&%> file = new <%
//&&&staticSymbol&&&=_File
//&&&staticSymbol&&&%>(args[i]);
//&&&staticSymbol&&&				<%
//&&&staticSymbol&&&=_URI
//&&&staticSymbol&&&%> uri = file.isFile() ? <%
//&&&staticSymbol&&&=_URI
//&&&staticSymbol&&&%>.createFileURI(file.getAbsolutePath()): URI.createURI(args[i]);
//&&&staticSymbol&&&
//&&&staticSymbol&&&				try
//&&&staticSymbol&&&				{
//&&&staticSymbol&&&					// Demand load resource for this file.
//&&&staticSymbol&&&					//
//&&&staticSymbol&&&					<%
//&&&staticSymbol&&&=_Resource
//&&&staticSymbol&&&%> resource = resourceSet.getResource(uri, true);
//&&&staticSymbol&&&					System.out.println("Loaded " + uri);<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&					// Validate the contents of the loaded resource.
//&&&staticSymbol&&&					//
//&&&staticSymbol&&&<%
if (genModel.useGenerics()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&					for (<%
//&&&staticSymbol&&&=_EObject
//&&&staticSymbol&&&%> eObject : resource.getContents())
//&&&staticSymbol&&&<%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&					for (<%
//&&&staticSymbol&&&=_Iterator
//&&&staticSymbol&&&%> j = resource.getContents().iterator(); j.hasNext(); )
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&					{
//&&&staticSymbol&&&<%
if (!genModel.useGenerics()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&						<%
//&&&staticSymbol&&&=_EObject
//&&&staticSymbol&&&%> eObject = (<%
//&&&staticSymbol&&&=_EObject
//&&&staticSymbol&&&%>)j.next();
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&						<%
//&&&staticSymbol&&&=_Diagnostic
//&&&staticSymbol&&&%> diagnostic = <%
//&&&staticSymbol&&&=_Diagnostician
//&&&staticSymbol&&&%>.INSTANCE.validate(eObject);
//&&&staticSymbol&&&						if (diagnostic.getSeverity() != Diagnostic.OK)
//&&&staticSymbol&&&						{
//&&&staticSymbol&&&							printDiagnostic(diagnostic, "");<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&						}
//&&&staticSymbol&&&					}
//&&&staticSymbol&&&				}
//&&&staticSymbol&&&				catch (<%
//&&&staticSymbol&&&=_RuntimeException
//&&&staticSymbol&&&%> exception) 
//&&&staticSymbol&&&				{
//&&&staticSymbol&&&					System.out.println("Problem loading " + uri);<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&					exception.printStackTrace();
//&&&staticSymbol&&&				}
//&&&staticSymbol&&&			}
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&	
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * Prints diagnostics with indentation.
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @param diagnostic the diagnostic to print.
//&&&staticSymbol&&&	 * @param indent the indentation for printing.
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	protected static void printDiagnostic(Diagnostic diagnostic, String indent)
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		System.out.print(indent);
//&&&staticSymbol&&&		System.out.println(diagnostic.getMessage());
//&&&staticSymbol&&&<%
if (genModel.useGenerics()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		for (Diagnostic child : diagnostic.getChildren())
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			printDiagnostic(child, indent + "  ");<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&<%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		for (Iterator i = diagnostic.getChildren().iterator(); i.hasNext(); )
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			printDiagnostic((Diagnostic)i.next(), indent + "  ");<%
//&&&staticSymbol&&&=genModel.getNonNLS()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&} //<%
//&&&staticSymbol&&&=genPackage.getExampleClassName()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
genModel.emitSortedImports();
//&&&staticSymbol&&&%>

}
}