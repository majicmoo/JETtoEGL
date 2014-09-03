class ResourceClass {
public static void main (String[] args) {
//&&&staticSymbol&&&<%import org.eclipse.emf.codegen.ecore.genmodel.*;%>
//&&&staticSymbol&&&<%import org.eclipse.emf.codegen.ecore.genmodel.impl.*;%>
//&&&staticSymbol&&&<%import java.util.*;%>
//&&&staticSymbol&&&<%import org.eclipse.emf.ecore.EStructuralFeature;%>
//&&&staticSymbol&&&<%import org.eclipse.emf.ecore.util.*;%>
//&&&staticSymbol&&&<%include("../Header.javajetinc");%>
//&&&staticSymbol&&&<%

/**
 * Copyright (c) 2002-2006 IBM Corporation and others.
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
GenPackage genPackage = (GenPackage)argument; GenModel genModel=genPackage.getGenModel(); ExtendedMetaData extendedMetaData= genModel.getExtendedMetaData();
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&package <%
//&&&staticSymbol&&&=genPackage.getUtilitiesPackageName()
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
genModel.getImportedName("org.eclipse.emf.common.util.URI");
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
genModel.markImportLocation(stringBuffer);
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&/**
//&&&staticSymbol&&& * <!-- begin-user-doc -->
//&&&staticSymbol&&& * The <b>Resource </b> associated with the package.
//&&&staticSymbol&&& * <!-- end-user-doc -->
//&&&staticSymbol&&& * @see <%
//&&&staticSymbol&&&=genPackage.getQualifiedResourceFactoryClassName()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&& * @generated
//&&&staticSymbol&&& */
//&&&staticSymbol&&&public class <%
//&&&staticSymbol&&&=genPackage.getResourceClassName()
//&&&staticSymbol&&&%> extends <%
//&&&staticSymbol&&&=genPackage.getImportedResourceBaseClassName()
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
//&&&staticSymbol&&&	 * Creates an instance of the resource.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @param uri the URI of the new resource.
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	public <%
//&&&staticSymbol&&&=genPackage.getResourceClassName()
//&&&staticSymbol&&&%>(URI uri)
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		super(uri);
//&&&staticSymbol&&&<%
if (genPackage.getResource() == GenResourceKind.XML_LITERAL) { // Do nothing
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
if (genPackage.isDataTypeConverters() && (genPackage.hasDocumentRoot() || org.eclipse.emf.ecore.xml.type.XMLTypePackage.eNS_URI.equals(genPackage.getNSURI()))) { boolean isXMLTypePackage = org.eclipse.emf.ecore.xml.type.XMLTypePackage.eNS_URI.equals(genPackage.getNSURI());
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
final String _Map = genModel.useGenerics() ? "Map<?, ?>" : "Map";
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
final String _MapStringBoolean = genModel.useGenerics() ? "Map<String, Boolean>" : "Map";
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
final String _MapStringWildcard = genModel.useGenerics() ? "Map<String, ?>" : "Map";
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
if (!isXMLTypePackage) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
genModel.getImportedName("org.eclipse.emf.ecore.xmi.XMLResource");
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
genModel.getImportedName("org.eclipse.emf.ecore.xmi.XMLParserPool");
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
genModel.getImportedName("org.eclipse.emf.ecore.xmi.impl.XMLParserPoolImpl");
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
genModel.getImportedName("java.io.InputStream");
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
genModel.getImportedName("java.io.IOException");
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
genModel.getImportedName("org.eclipse.emf.ecore.EObject");
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
genModel.getImportedName("java.util.Collections");
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
genModel.getImportedName("java.util.HashMap");
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
genModel.getImportedName("java.util.Map");
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
genModel.getImportedName("org.xml.sax.InputSource");
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
genModel.getImportedName("javax.xml.parsers.SAXParser");
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
genModel.getImportedName("org.xml.sax.Attributes");
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
genModel.getImportedName("org.xml.sax.SAXException");
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
String _StackFrame = genModel.getImportedName("org.eclipse.emf.ecore.xml.type.util.XMLTypeResourceImpl")+".StackFrame";
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
String _DataFrame = genModel.getImportedName("org.eclipse.emf.ecore.xml.type.util.XMLTypeResourceImpl")+".DataFrame";
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
if (!isXMLTypePackage) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * A load option that turns of the use of the generate data converters.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	public static final String OPTION_USE_DATA_CONVERTER = "USE_DATA_CONVERTER";
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
//&&&staticSymbol&&&	public void doLoad(InputStream inputStream, <%
//&&&staticSymbol&&&=_Map
//&&&staticSymbol&&&%> options) throws IOException
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		if (options != null && Boolean.TRUE.equals(options.get(OPTION_USE_DATA_CONVERTER)))
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&		  getContents().add
//&&&staticSymbol&&&			 (load
//&&&staticSymbol&&&				 (new InputSource(inputStream), 
//&&&staticSymbol&&&				  (<%
//&&&staticSymbol&&&=_MapStringBoolean
//&&&staticSymbol&&&%>)options.get(XMLResource.OPTION_PARSER_FEATURES), 
//&&&staticSymbol&&&				  (<%
//&&&staticSymbol&&&=_MapStringWildcard
//&&&staticSymbol&&&%>)options.get(XMLResource.OPTION_PARSER_PROPERTIES), 
//&&&staticSymbol&&&				  Boolean.TRUE.equals(options.get(XMLResource.OPTION_USE_LEXICAL_HANDLER))).eContainer());
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&		else
//&&&staticSymbol&&&		{  
//&&&staticSymbol&&&			super.doLoad(inputStream, options);
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
//&&&staticSymbol&&&	public void doLoad(InputSource inputSource, <%
//&&&staticSymbol&&&=_Map
//&&&staticSymbol&&&%> options) throws IOException
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		if (options != null && Boolean.TRUE.equals(options.get(OPTION_USE_DATA_CONVERTER)))
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&		  getContents().add
//&&&staticSymbol&&&			 (load
//&&&staticSymbol&&&				 (inputSource,
//&&&staticSymbol&&&				  (<%
//&&&staticSymbol&&&=_MapStringBoolean
//&&&staticSymbol&&&%>)options.get(XMLResource.OPTION_PARSER_FEATURES), 
//&&&staticSymbol&&&				  (<%
//&&&staticSymbol&&&=_MapStringWildcard
//&&&staticSymbol&&&%>)options.get(XMLResource.OPTION_PARSER_PROPERTIES), 
//&&&staticSymbol&&&				  Boolean.TRUE.equals(options.get(XMLResource.OPTION_USE_LEXICAL_HANDLER))).eContainer());
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&		else
//&&&staticSymbol&&&		{  
//&&&staticSymbol&&&			super.doLoad(inputSource, options);
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	protected static final XMLParserPool parserPool = new XMLParserPoolImpl();
//&&&staticSymbol&&&
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * Loads an instance from the input.
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @param inputSource the input from which to load.
//&&&staticSymbol&&&	 * @param features a map of the parser features and their values.
//&&&staticSymbol&&&	 * @param properties a map of a parser properties and their values.
//&&&staticSymbol&&&	 * @param useLexicalHandler whether a lexical handler should be used during loading.
//&&&staticSymbol&&&	 * @return the root object; for the case of a document root, the child of that document root is return.
//&&&staticSymbol&&&	 * @throws ParserConfigurationException
//&&&staticSymbol&&&	 * @throws SAXException
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	public static EObject load(InputSource inputSource, <%
//&&&staticSymbol&&&=_MapStringBoolean
//&&&staticSymbol&&&%> features, <%
//&&&staticSymbol&&&=_MapStringWildcard
//&&&staticSymbol&&&%> properties, boolean useLexicalHandler) throws IOException
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		<%
//&&&staticSymbol&&&=_MapStringBoolean
//&&&staticSymbol&&&%> requiredFeatures = new <%
//&&&staticSymbol&&&=_MapStringBoolean.replaceAll("Map","HashMap")
//&&&staticSymbol&&&%>();
//&&&staticSymbol&&&		requiredFeatures.put("http://xml.org/sax/features/namespaces", Boolean.TRUE); 
//&&&staticSymbol&&&		if (features != null)
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			requiredFeatures.putAll(features);
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&		
//&&&staticSymbol&&&		if (properties == null)
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			properties = Collections.<%
if (genModel.useGenerics()) {
//&&&staticSymbol&&&%>emptyMap()<%
} else {
//&&&staticSymbol&&&%>EMPTY_MAP<%
}
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&		
//&&&staticSymbol&&&		SAXParser saxParser = null;
//&&&staticSymbol&&&		try
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			saxParser = parserPool.get(requiredFeatures, properties, useLexicalHandler);
//&&&staticSymbol&&&			final FrameFactory.DocumentRootStackFrame documentRoot = FrameFactory.INSTANCE.pushDocumentRoot(null, null);
//&&&staticSymbol&&&			XMLTypeResourceImpl.Handler handler = new XMLTypeResourceImpl.Handler(documentRoot);
//&&&staticSymbol&&&			saxParser.parse(inputSource, handler);
//&&&staticSymbol&&&<%
if (genModel.isSuppressEMFTypes()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			return (EObject)((EObject)FrameFactory.INSTANCE.popDocumentRoot(documentRoot)).eContents().get(0);
//&&&staticSymbol&&&<%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			return FrameFactory.INSTANCE.popDocumentRoot(documentRoot).eContents().get(0);
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&		catch (Exception exception)
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			throw new IOWrappedException(exception);
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&		finally
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			parserPool.release(saxParser, requiredFeatures, properties, useLexicalHandler);
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	/**
//&&&staticSymbol&&&	 * <!-- begin-user-doc -->
//&&&staticSymbol&&&	 * <!-- end-user-doc -->
//&&&staticSymbol&&&	 * @generated
//&&&staticSymbol&&&	 */
//&&&staticSymbol&&&	public final static class FrameFactory
//&&&staticSymbol&&&	{
//&&&staticSymbol&&&		/**
//&&&staticSymbol&&&		 * <!-- begin-user-doc -->
//&&&staticSymbol&&&		 * <!-- end-user-doc -->
//&&&staticSymbol&&&		 * @generated
//&&&staticSymbol&&&		 */
//&&&staticSymbol&&&		public static final FrameFactory INSTANCE = new FrameFactory();
//&&&staticSymbol&&&	
//&&&staticSymbol&&&<%
for (GenClass genClass : genPackage.getGenClasses()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		/**
//&&&staticSymbol&&&		 * <!-- begin-user-doc -->
//&&&staticSymbol&&&		 * <!-- end-user-doc -->
//&&&staticSymbol&&&		 * @generated
//&&&staticSymbol&&&		 */
//&&&staticSymbol&&&		protected <%
//&&&staticSymbol&&&=genClass.getName()
//&&&staticSymbol&&&%>StackFrame <%
//&&&staticSymbol&&&=genClass.getSafeUncapName()
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
for (GenDataType genDataType : genPackage.getAllGenDataTypes()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		/**
//&&&staticSymbol&&&		 * <!-- begin-user-doc -->
//&&&staticSymbol&&&		 * <!-- end-user-doc -->
//&&&staticSymbol&&&		 * @generated
//&&&staticSymbol&&&		 */
//&&&staticSymbol&&&		protected <%
//&&&staticSymbol&&&=_DataFrame
//&&&staticSymbol&&&%> <%
//&&&staticSymbol&&&=genDataType.getSafeUncapName()
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
for (GenClass genClass : genPackage.getGenClasses()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
List<EStructuralFeature> attributes = extendedMetaData.getAllAttributes(genClass.getEcoreClass());
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
List<EStructuralFeature> elements = extendedMetaData.getAllElements(genClass.getEcoreClass());
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		/**
//&&&staticSymbol&&&		 * <!-- begin-user-doc -->
//&&&staticSymbol&&&		 * <!-- end-user-doc -->
//&&&staticSymbol&&&		 * @generated
//&&&staticSymbol&&&		 */
//&&&staticSymbol&&&		public <%
//&&&staticSymbol&&&=genClass.getName()
//&&&staticSymbol&&&%>StackFrame push<%
//&&&staticSymbol&&&=genClass.getName()
//&&&staticSymbol&&&%>(<%
//&&&staticSymbol&&&=_StackFrame
//&&&staticSymbol&&&%> previous, Attributes attributes)
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			 <%
//&&&staticSymbol&&&=genClass.getName()
//&&&staticSymbol&&&%>StackFrame result<%
//&&&staticSymbol&&&=genClass.getName()
//&&&staticSymbol&&&%> = <%
//&&&staticSymbol&&&=genClass.getSafeUncapName()
//&&&staticSymbol&&&%> == null ? new <%
//&&&staticSymbol&&&=genClass.getName()
//&&&staticSymbol&&&%>StackFrame() : <%
//&&&staticSymbol&&&=genClass.getSafeUncapName()
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&			 <%
//&&&staticSymbol&&&=genClass.getSafeUncapName()
//&&&staticSymbol&&&%> = null;
//&&&staticSymbol&&&			 result<%
//&&&staticSymbol&&&=genClass.getName()
//&&&staticSymbol&&&%>.pushOnto(previous);
//&&&staticSymbol&&&			 result<%
//&&&staticSymbol&&&=genClass.getName()
//&&&staticSymbol&&&%>.handleAttributes(attributes);
//&&&staticSymbol&&&			 return result<%
//&&&staticSymbol&&&=genClass.getName()
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&
//&&&staticSymbol&&&		/**
//&&&staticSymbol&&&		 * <!-- begin-user-doc -->
//&&&staticSymbol&&&		 * <!-- end-user-doc -->
//&&&staticSymbol&&&		 * @generated
//&&&staticSymbol&&&		 */
//&&&staticSymbol&&&		public <%
//&&&staticSymbol&&&=genClass.getImportedInterfaceName()
//&&&staticSymbol&&&%> pop<%
//&&&staticSymbol&&&=genClass.getName()
//&&&staticSymbol&&&%>(<%
//&&&staticSymbol&&&=genClass.getName()
//&&&staticSymbol&&&%>StackFrame <%
//&&&staticSymbol&&&=genClass.getSafeUncapName()
//&&&staticSymbol&&&%>)
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			<%
//&&&staticSymbol&&&=genClass.getImportedInterfaceName()
//&&&staticSymbol&&&%> result<%
//&&&staticSymbol&&&=genClass.getName()
//&&&staticSymbol&&&%>Value = <%
//&&&staticSymbol&&&=genClass.getSafeUncapName()
//&&&staticSymbol&&&%>.pop<%
//&&&staticSymbol&&&=genClass.getName()
//&&&staticSymbol&&&%>();
//&&&staticSymbol&&&			this.<%
//&&&staticSymbol&&&=genClass.getSafeUncapName()
//&&&staticSymbol&&&%> = <%
//&&&staticSymbol&&&=genClass.getSafeUncapName()
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&			return result<%
//&&&staticSymbol&&&=genClass.getName()
//&&&staticSymbol&&&%>Value;
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&
//&&&staticSymbol&&&		/**
//&&&staticSymbol&&&		 * <!-- begin-user-doc -->
//&&&staticSymbol&&&		 * <!-- end-user-doc -->
//&&&staticSymbol&&&		 * @generated
//&&&staticSymbol&&&		 */
//&&&staticSymbol&&&		public static class <%
//&&&staticSymbol&&&=genClass.getName()
//&&&staticSymbol&&&%>StackFrame extends <%
//&&&staticSymbol&&&=_StackFrame
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			/**
//&&&staticSymbol&&&			 * <!-- begin-user-doc -->
//&&&staticSymbol&&&			 * <!-- end-user-doc -->
//&&&staticSymbol&&&			 * @generated
//&&&staticSymbol&&&			 */
//&&&staticSymbol&&&			protected <%
//&&&staticSymbol&&&=genClass.getImportedInterfaceName()
//&&&staticSymbol&&&%> the<%
//&&&staticSymbol&&&=genClass.getName()
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&		
//&&&staticSymbol&&&<%
for (GenFeature genFeature : genClass.getAllGenFeatures()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
String name = extendedMetaData.getName(genFeature.getEcoreFeature());
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
if ((elements.contains(genFeature.getEcoreFeature()) || attributes.contains(genFeature.getEcoreFeature())) && name.indexOf(":") == -1) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
if (genFeature.isReferenceType()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			/**
//&&&staticSymbol&&&			 * <!-- begin-user-doc -->
//&&&staticSymbol&&&			 * <!-- end-user-doc -->
//&&&staticSymbol&&&			 * @generated
//&&&staticSymbol&&&			 */
//&&&staticSymbol&&&			protected <%
//&&&staticSymbol&&&=genFeature.getTypeGenClass().getGenPackage().getImportedResourceClassName()
//&&&staticSymbol&&&%>.FrameFactory.<%
//&&&staticSymbol&&&=genFeature.getTypeGenClass().getName()
//&&&staticSymbol&&&%>StackFrame <%
//&&&staticSymbol&&&=genFeature.getSafeName()
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			/**
//&&&staticSymbol&&&			 * <!-- begin-user-doc -->
//&&&staticSymbol&&&			 * <!-- end-user-doc -->
//&&&staticSymbol&&&			 * @generated
//&&&staticSymbol&&&			 */
//&&&staticSymbol&&&			protected <%
//&&&staticSymbol&&&=_DataFrame
//&&&staticSymbol&&&%> <%
//&&&staticSymbol&&&=genFeature.getSafeName()
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&		
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			/**
//&&&staticSymbol&&&			 * <!-- begin-user-doc -->
//&&&staticSymbol&&&			 * <!-- end-user-doc -->
//&&&staticSymbol&&&			 * @generated
//&&&staticSymbol&&&			 */
//&&&staticSymbol&&&  <%
if (genModel.useClassOverrideAnnotation()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			@Override
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			public void handleAttributes(Attributes attributes)
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&<%
int count = 0; for (GenFeature genFeature : genClass.getAllGenFeatures()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
String name = extendedMetaData.getName(genFeature.getEcoreFeature());
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
if (attributes.contains(genFeature.getEcoreFeature()) && !genFeature.isDerived() && name.indexOf(":") == -1) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
String namespace = Literals.toStringLiteral(extendedMetaData.getNamespace(genFeature.getEcoreFeature()), genModel); if ("null".equals(namespace)) namespace = "\"\"";
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
if (!genFeature.isReferenceType()) { GenClassifier genClassifier = genFeature.getTypeGenClassifier();
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
if (count++ == 0) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				String theValue = attributes.getValue(<%
//&&&staticSymbol&&&=namespace
//&&&staticSymbol&&&%>, "<%
//&&&staticSymbol&&&=name
//&&&staticSymbol&&&%>");
//&&&staticSymbol&&&<%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				theValue = attributes.getValue(<%
//&&&staticSymbol&&&=namespace
//&&&staticSymbol&&&%>, "<%
//&&&staticSymbol&&&=name
//&&&staticSymbol&&&%>");
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				if (theValue != null)
//&&&staticSymbol&&&				{
//&&&staticSymbol&&&<%
if (genClassifier.getGenPackage().isDataTypeConverters()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&					the<%
//&&&staticSymbol&&&=genClass.getName()
//&&&staticSymbol&&&%>.set<%
//&&&staticSymbol&&&=genFeature.getAccessorName()
//&&&staticSymbol&&&%>(<%
//&&&staticSymbol&&&=genClassifier.getGenPackage().getQualifiedFactoryInstanceAccessor()
//&&&staticSymbol&&&%>.create<%
//&&&staticSymbol&&&=genClassifier.getName()
//&&&staticSymbol&&&%>(theValue));
//&&&staticSymbol&&&<%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&					the<%
//&&&staticSymbol&&&=genClass.getName()
//&&&staticSymbol&&&%>.set<%
//&&&staticSymbol&&&=genFeature.getAccessorName()
//&&&staticSymbol&&&%>((<%
//&&&staticSymbol&&&=genFeature.getImportedType(null)
//&&&staticSymbol&&&%>)<%
//&&&staticSymbol&&&=genClassifier.getGenPackage().getQualifiedEFactoryInstanceAccessor()
//&&&staticSymbol&&&%>.createFromString(<%
//&&&staticSymbol&&&=genClassifier.getQualifiedClassifierAccessor()
//&&&staticSymbol&&&%>, theValue));
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				}
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
if (count == 0) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				// There are attributes to handle.
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			}
//&&&staticSymbol&&&		
//&&&staticSymbol&&&			/**
//&&&staticSymbol&&&			 * <!-- begin-user-doc -->
//&&&staticSymbol&&&			 * <!-- end-user-doc -->
//&&&staticSymbol&&&			 * @generated
//&&&staticSymbol&&&			 */
//&&&staticSymbol&&&  <%
if (genModel.useClassOverrideAnnotation()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			@Override
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			public <%
//&&&staticSymbol&&&=_StackFrame
//&&&staticSymbol&&&%> startElement(String namespace, String localName, String qName, Attributes attributes) throws SAXException
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&<%
count = 0; for (GenFeature genFeature : genClass.getAllGenFeatures()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
String name = extendedMetaData.getName(genFeature.getEcoreFeature());
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
if (elements.contains(genFeature.getEcoreFeature()) && name.indexOf(":") == -1) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
String namespace = Literals.toStringLiteral(extendedMetaData.getNamespace(genFeature.getEcoreFeature()), genModel); if ("null".equals(namespace)) namespace = "\"\"";
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				<%
if (count++ != 0) {
//&&&staticSymbol&&&%>else <%
}
//&&&staticSymbol&&&%>if ("<%
//&&&staticSymbol&&&=name
//&&&staticSymbol&&&%>".equals(localName) && <%
//&&&staticSymbol&&&=namespace
//&&&staticSymbol&&&%>.equals(namespace))
//&&&staticSymbol&&&				{
//&&&staticSymbol&&&					return <%
//&&&staticSymbol&&&=genFeature.getSafeName()
//&&&staticSymbol&&&%> = <%
//&&&staticSymbol&&&=genFeature.getTypeGenClassifier().getGenPackage().getImportedResourceClassName()
//&&&staticSymbol&&&%>.FrameFactory.INSTANCE.push<%
//&&&staticSymbol&&&=genFeature.getTypeGenClassifier().getName()
//&&&staticSymbol&&&%>(this, attributes);
//&&&staticSymbol&&&				}
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
if (count == 0) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				return super.startElement(namespace, localName, qName, attributes);
//&&&staticSymbol&&&<%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				else
//&&&staticSymbol&&&				{
//&&&staticSymbol&&&					return super.startElement(namespace, localName, qName, attributes);
//&&&staticSymbol&&&				}
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			}
//&&&staticSymbol&&&
//&&&staticSymbol&&&			/**
//&&&staticSymbol&&&			 * <!-- begin-user-doc -->
//&&&staticSymbol&&&			 * <!-- end-user-doc -->
//&&&staticSymbol&&&			 * @generated
//&&&staticSymbol&&&			 */
//&&&staticSymbol&&&  <%
if (genModel.useClassOverrideAnnotation()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			@Override
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			public void endElement(<%
//&&&staticSymbol&&&=_StackFrame
//&&&staticSymbol&&&%> child) throws SAXException
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&<%
count = 0; for (GenFeature genFeature : genClass.getAllGenFeatures()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
String name = extendedMetaData.getName(genFeature.getEcoreFeature());
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
if (elements.contains(genFeature.getEcoreFeature()) && name.indexOf(":") == -1) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				<%
if (count++ != 0) {
//&&&staticSymbol&&&%>else <%
}
//&&&staticSymbol&&&%>if (child == <%
//&&&staticSymbol&&&=genFeature.getSafeName()
//&&&staticSymbol&&&%>)
//&&&staticSymbol&&&				{
//&&&staticSymbol&&&<%
if (genFeature.isListType()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&					the<%
//&&&staticSymbol&&&=genClass.getName()
//&&&staticSymbol&&&%>.<%
//&&&staticSymbol&&&=genFeature.getGetAccessor()
//&&&staticSymbol&&&%>().add(<%
//&&&staticSymbol&&&=genFeature.getTypeGenClassifier().getGenPackage().getImportedResourceClassName()
//&&&staticSymbol&&&%>.FrameFactory.INSTANCE.pop<%
//&&&staticSymbol&&&=genFeature.getTypeGenClassifier().getName()
//&&&staticSymbol&&&%>(<%
//&&&staticSymbol&&&=genFeature.getSafeName()
//&&&staticSymbol&&&%>));
//&&&staticSymbol&&&<%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&					the<%
//&&&staticSymbol&&&=genClass.getName()
//&&&staticSymbol&&&%>.set<%
//&&&staticSymbol&&&=genFeature.getAccessorName()
//&&&staticSymbol&&&%>(<%
//&&&staticSymbol&&&=genFeature.getTypeGenClassifier().getGenPackage().getImportedResourceClassName()
//&&&staticSymbol&&&%>.FrameFactory.INSTANCE.pop<%
//&&&staticSymbol&&&=genFeature.getTypeGenClassifier().getName()
//&&&staticSymbol&&&%>(<%
//&&&staticSymbol&&&=genFeature.getSafeName()
//&&&staticSymbol&&&%>));
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&					<%
//&&&staticSymbol&&&=genFeature.getSafeName()
//&&&staticSymbol&&&%> = null;
//&&&staticSymbol&&&				}
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
if (count == 0) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				super.endElement(child);
//&&&staticSymbol&&&<%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&				else
//&&&staticSymbol&&&				{
//&&&staticSymbol&&&					super.endElement(child);
//&&&staticSymbol&&&				}
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			}
//&&&staticSymbol&&&
//&&&staticSymbol&&&			/**
//&&&staticSymbol&&&			 * <!-- begin-user-doc -->
//&&&staticSymbol&&&			 * <!-- end-user-doc -->
//&&&staticSymbol&&&			 * @generated
//&&&staticSymbol&&&			 */
//&&&staticSymbol&&&  <%
if (genModel.useClassOverrideAnnotation()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			@Override
//&&&staticSymbol&&&  <%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			public void create()
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&				the<%
//&&&staticSymbol&&&=genClass.getName()
//&&&staticSymbol&&&%> = <%
//&&&staticSymbol&&&=genPackage.getQualifiedFactoryInstanceAccessor()
//&&&staticSymbol&&&%>.create<%
//&&&staticSymbol&&&=genClass.getName()
//&&&staticSymbol&&&%>();
//&&&staticSymbol&&&			}
//&&&staticSymbol&&&		
//&&&staticSymbol&&&			/**
//&&&staticSymbol&&&			 * <!-- begin-user-doc -->
//&&&staticSymbol&&&			 * <!-- end-user-doc -->
//&&&staticSymbol&&&			 * @generated
//&&&staticSymbol&&&			 */
//&&&staticSymbol&&&			protected <%
//&&&staticSymbol&&&=genClass.getImportedInterfaceName()
//&&&staticSymbol&&&%> pop<%
//&&&staticSymbol&&&=genClass.getName()
//&&&staticSymbol&&&%>()
//&&&staticSymbol&&&			{
//&&&staticSymbol&&&				pop();
//&&&staticSymbol&&&				<%
//&&&staticSymbol&&&=genClass.getImportedInterfaceName()
//&&&staticSymbol&&&%> result<%
//&&&staticSymbol&&&=genClass.getName()
//&&&staticSymbol&&&%>Value = the<%
//&&&staticSymbol&&&=genClass.getName()
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&				the<%
//&&&staticSymbol&&&=genClass.getName()
//&&&staticSymbol&&&%> = null;
//&&&staticSymbol&&&				return result<%
//&&&staticSymbol&&&=genClass.getName()
//&&&staticSymbol&&&%>Value;
//&&&staticSymbol&&&			}
//&&&staticSymbol&&&		
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
for (GenDataType genDataType : genPackage.getAllGenDataTypes()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&		/**
//&&&staticSymbol&&&		 * <!-- begin-user-doc -->
//&&&staticSymbol&&&		 * <!-- end-user-doc -->
//&&&staticSymbol&&&		 * @generated
//&&&staticSymbol&&&		 */
//&&&staticSymbol&&&		public <%
//&&&staticSymbol&&&=_DataFrame
//&&&staticSymbol&&&%> push<%
//&&&staticSymbol&&&=genDataType.getName()
//&&&staticSymbol&&&%>(<%
//&&&staticSymbol&&&=_StackFrame
//&&&staticSymbol&&&%> previous, Attributes attributes)
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&			 <%
//&&&staticSymbol&&&=_DataFrame
//&&&staticSymbol&&&%> result<%
//&&&staticSymbol&&&=genDataType.getName()
//&&&staticSymbol&&&%> = <%
//&&&staticSymbol&&&=genDataType.getSafeUncapName()
//&&&staticSymbol&&&%> == null ? new <%
//&&&staticSymbol&&&=_DataFrame
//&&&staticSymbol&&&%>() : <%
//&&&staticSymbol&&&=genDataType.getSafeUncapName()
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&			 <%
//&&&staticSymbol&&&=genDataType.getSafeUncapName()
//&&&staticSymbol&&&%> = null;
//&&&staticSymbol&&&			 result<%
//&&&staticSymbol&&&=genDataType.getName()
//&&&staticSymbol&&&%>.pushOnto(previous);
//&&&staticSymbol&&&			 result<%
//&&&staticSymbol&&&=genDataType.getName()
//&&&staticSymbol&&&%>.handleAttributes(attributes);
//&&&staticSymbol&&&			 return result<%
//&&&staticSymbol&&&=genDataType.getName()
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&
//&&&staticSymbol&&&		/**
//&&&staticSymbol&&&		 * <!-- begin-user-doc -->
//&&&staticSymbol&&&		 * <!-- end-user-doc -->
//&&&staticSymbol&&&		 * @generated
//&&&staticSymbol&&&		 */
//&&&staticSymbol&&&		public <%
//&&&staticSymbol&&&=genDataType.getImportedParameterizedInstanceClassName()
//&&&staticSymbol&&&%> pop<%
//&&&staticSymbol&&&=genDataType.getName()
//&&&staticSymbol&&&%>(<%
//&&&staticSymbol&&&=_DataFrame
//&&&staticSymbol&&&%> <%
//&&&staticSymbol&&&=genDataType.getSafeUncapName()
//&&&staticSymbol&&&%>)
//&&&staticSymbol&&&		{
//&&&staticSymbol&&&<%
if (genDataType.getGenPackage().isDataTypeConverters()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			<%
//&&&staticSymbol&&&=genDataType.getImportedParameterizedInstanceClassName()
//&&&staticSymbol&&&%> result<%
//&&&staticSymbol&&&=genDataType.getName()
//&&&staticSymbol&&&%>Value = <%
//&&&staticSymbol&&&=genDataType.getGenPackage().getQualifiedFactoryInstanceAccessor()
//&&&staticSymbol&&&%>.create<%
//&&&staticSymbol&&&=genDataType.getName()
//&&&staticSymbol&&&%>(<%
//&&&staticSymbol&&&=genDataType.getSafeUncapName()
//&&&staticSymbol&&&%>.popValue());
//&&&staticSymbol&&&<%
} else if (genDataType.isPrimitiveType() && genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			<%
//&&&staticSymbol&&&=genDataType.getImportedInstanceClassName()
//&&&staticSymbol&&&%> result<%
//&&&staticSymbol&&&=genDataType.getName()
//&&&staticSymbol&&&%>Value = ((<%
//&&&staticSymbol&&&=genDataType.getObjectInstanceClassName()
//&&&staticSymbol&&&%>)<%
//&&&staticSymbol&&&=genDataType.getGenPackage().getQualifiedEFactoryInstanceAccessor()
//&&&staticSymbol&&&%>.createFromString(<%
//&&&staticSymbol&&&=genDataType.getQualifiedClassifierAccessor()
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=genDataType.getSafeUncapName()
//&&&staticSymbol&&&%>.popValue())).<%
//&&&staticSymbol&&&=genDataType.getPrimitiveValueFunction()
//&&&staticSymbol&&&%>();
//&&&staticSymbol&&&<%
} else {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			<%
//&&&staticSymbol&&&=genDataType.getImportedInstanceClassName()
//&&&staticSymbol&&&%> result<%
//&&&staticSymbol&&&=genDataType.getName()
//&&&staticSymbol&&&%>Value = (<%
//&&&staticSymbol&&&=genDataType.getObjectInstanceClassName()
//&&&staticSymbol&&&%>)<%
//&&&staticSymbol&&&=genDataType.getGenPackage().getQualifiedEFactoryInstanceAccessor()
//&&&staticSymbol&&&%>.createFromString(<%
//&&&staticSymbol&&&=genDataType.getQualifiedClassifierAccessor()
//&&&staticSymbol&&&%>, <%
//&&&staticSymbol&&&=genDataType.getSafeUncapName()
//&&&staticSymbol&&&%>.popValue());
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&			this.<%
//&&&staticSymbol&&&=genDataType.getSafeUncapName()
//&&&staticSymbol&&&%> = <%
//&&&staticSymbol&&&=genDataType.getSafeUncapName()
//&&&staticSymbol&&&%>;
//&&&staticSymbol&&&			return result<%
//&&&staticSymbol&&&=genDataType.getName()
//&&&staticSymbol&&&%>Value;
//&&&staticSymbol&&&		}
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&	}
//&&&staticSymbol&&&
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&} //<%
//&&&staticSymbol&&&=genPackage.getResourceClassName()
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
genModel.emitSortedImports();
//&&&staticSymbol&&&%>

}
}