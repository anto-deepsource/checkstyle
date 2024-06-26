/*
ImportOrder
option = top
groups = org, java
ordered = (default)true
separated = (default)false
separatedStaticGroups = (default)false
caseSensitive = (default)true
staticGroups = (default)
sortStaticImportsAlphabetically = true
useContainerOrderingForStatic = (default)false
tokens = (default)STATIC_IMPORT


*/

package com.puppycrawl.tools.checkstyle.checks.imports.importorder;

import static java.lang.Math.abs;
import static org.antlr.v4.runtime.Recognizer.EOF;

import org.antlr.v4.runtime.*; // violation 'Extra separation in import group before 'org.antlr.v4.runtime.*''

import java.util.Set; // violation 'Extra separation in import group before 'java.util.Set''

public class InputImportOrderStaticGroupOrder1
{

}
