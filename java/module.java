class module {
public static void main (String[] args) {
//&&&staticSymbol&&&<%import java.util.*;%>
//&&&staticSymbol&&&<%import org.eclipse.emf.codegen.ecore.genmodel.*;%>
//&&&staticSymbol&&&<%

/**
* Copyright (c) 2010 Ed Merks and others.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
*
* Contributors:
* Ed Merks - Initial API and implementation
*/

//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
GenModel genModel = (GenModel)argument; /* Trick to import java.util.* without warnings */Iterator.class.getName();
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<?xml version="1.0" encoding="UTF-8"?>
//&&&staticSymbol&&&<!DOCTYPE module PUBLIC "-//Google Inc.//DTD Google Web Toolkit 2.0.1//EN" "http://google-web-toolkit.googlecode.com/svn/tags/2.0.1/distro-source/core/src/gwt-module.dtd">
//&&&staticSymbol&&&<%include("../Header.xmljetinc");%>
//&&&staticSymbol&&&<module>
//&&&staticSymbol&&&<%
for (String inherits : genModel.getEditModuleInherits()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<inherits name="<%
//&&&staticSymbol&&&=inherits
//&&&staticSymbol&&&%>" />
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
for (String source : genModel.getEditModuleSources()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<source path="<%
//&&&staticSymbol&&&=source
//&&&staticSymbol&&&%>"/>
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&</module>

}
}