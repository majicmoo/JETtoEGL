class web {
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
//&&&staticSymbol&&&<?xml version="1.0" encoding="UTF-8"?>
//&&&staticSymbol&&&<!DOCTYPE web-app PUBLIC "-//Sun Microsystems, Inc.//DTD Web Application 2.3//EN" "http://java.sun.com/dtd/web-app_2_3.dtd">
//&&&staticSymbol&&&<%include("../Header.xmljetinc");%>
//&&&staticSymbol&&&<web-app>
//&&&staticSymbol&&&  <servlet>
//&&&staticSymbol&&&    <servlet-name>uriServlet</servlet-name>
//&&&staticSymbol&&&    <servlet-class>org.eclipse.emf.server.ecore.resource.URIServiceImpl</servlet-class>
//&&&staticSymbol&&&  </servlet>
//&&&staticSymbol&&&  
//&&&staticSymbol&&&  <servlet-mapping>
//&&&staticSymbol&&&    <servlet-name>uriServlet</servlet-name>
//&&&staticSymbol&&&    <url-pattern>/<%
//&&&staticSymbol&&&=genModel.getQualifiedEditorModuleName()
//&&&staticSymbol&&&%>/uriService</url-pattern>
//&&&staticSymbol&&&  </servlet-mapping>
//&&&staticSymbol&&&
//&&&staticSymbol&&&  <welcome-file-list>
//&&&staticSymbol&&&    <welcome-file><%
//&&&staticSymbol&&&=genModel.getEditorHomePageName()
//&&&staticSymbol&&&%>.html</welcome-file>
//&&&staticSymbol&&&  </welcome-file-list>
//&&&staticSymbol&&&</web-app>

}
}