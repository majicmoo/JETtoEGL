class appengineWeb {
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
//&&&staticSymbol&&&<%include("../Header.xmljetinc");%>
//&&&staticSymbol&&&<appengine-web-app xmlns="http://appengine.google.com/ns/1.0">
//&&&staticSymbol&&&	<application><%
//&&&staticSymbol&&&=genModel.getModelName().toLowerCase().replaceAll("\\s", "-")
//&&&staticSymbol&&&%>-editor</application>
//&&&staticSymbol&&&	<version>1</version>
//&&&staticSymbol&&&</appengine-web-app>

}
}