include "Java.Grm"
include "eolAddons.Grm"
include "CommentOverrides.Grm"


% Main translation rule 
function main
    replace [program] 
	P [program]
    by
	P [java2eol]
end function


%% Something to call the rules
%%class
function java2eol
    replace [program]
	P [program]
    by
	P 
	[removeClass]
	[removeMainFunction]
	[transformForIn]
	[transformConditionalStatement]
	%[transformTypeDeclaration]
	[transformOps]
	[transformBooleanOps]
	[transformDoStatement]
	%[transformTypeAssignment]
	[localVarDecl2Assignment]
	[removeCast]
end function


%% change for loop syntax
%% from  for( type var: listOfVar)
%% to for( var in listOfVar)
rule transformForIn
	replace [declaration_or_statement]
	'for '( 
	%for_in_init
	_ [repeat modifier] _ [type_specifier] Id [id] _ [opt generic_parameter] _ [repeat dimension]
	': Expr [expression] ')
		Stmt [statement]        
    construct NewDecls [repeat declaration_or_statement]
	_ [statementBlockToDecls Stmt]
	  [statementOneDeclToDecls Stmt] 
    by
	'for (Id 'in Expr '){
	NewDecls';
	'}
end rule

%% Transform do while
rule transformDoStatement
    replace [statement]
    'do Stmt [statement]
    'while '( Expr [assignment_expression] ') ';
    by
    Stmt ';
    while '( Expr ') '{
        Stmt ';
    '}
end rule




 %local variable declaration to simple assignment
rule localVarDecl2Assignment
    replace $ [declaration_or_statement]
	Decl [declaration_or_statement] 
    deconstruct Decl
    _ [repeat modifier] _ [type_specifier] _ [variable_declarators] ';
    by
	Decl [localVarDecl2AssignmentExp] 
end rule


function localVarDecl2AssignmentExp
    replace [declaration_or_statement]
    _ [repeat modifier] _ [type_specifier] Id [id] _ [opt generic_parameter] _ [repeat dimension]
    '= Exp [conditional_expression] ';
    construct Ass [assignment_expression]
    'var Id '= Exp 
    by
    Ass ';
end function



%% Transform All Operators
function transformOps
    replace [program]
	P [program]
    by
	P [transformDecrementOperator] 
	  [transformIncrementOperator]
	  [transformNotEqualsOperator] 
	  [transformEqualsOperator]
	  [transformModOperator]
end function



%% Remove casts

rule removeCast
    replace [unary_expression]
    '( _ [type_specifier] ') Expr [unary_expression] 
    by
    Expr 
end rule
    


%% Not equals operator
%% from !=
%% to <>
rule transformNotEqualsOperator
	replace [equality_op]
	'!= 
	by
	'<> 
end rule


%% Equals operator
%% from ==
%% to =
rule transformEqualsOperator
	replace [equality_op]
	'==
	by
	'=
end rule


%% Decrement operator
%% from var --
%% to var = var-1
rule transformDecrementOperator
    replace [unary_expression]
	Id [primary] '-- 
	by
	Id '= Id '- '1
end rule

%% Increment operator
%% from var ++
%% to var = var+1
rule transformIncrementOperator
	replace [unary_expression]
	Id [primary] '++ 
	by
	Id '= Id '+ '1
end rule

%% Transform Mod (%)
rule transformModOperator
    replace [multiplicative_expression]
    a [unary_expression] '% b [unary_expression]
    by
    a '.mod( b ')
end rule



%% Transform All Boolean Operation%
function transformBooleanOps
    replace [program]	
    P [program]
    by
	P [transformBooleanOr] [transformBooleanAnd] [transformBooleanNot]
end function


%% Boolean operator And
%% from &&
%% to and
rule transformBooleanAnd
	replace [and_inclusive_or_expression]
	'&& CE [inclusive_or_expression]
    by
	'and CE
end rule


%% Boolean operator Or
%% from ||
%% to or
rule transformBooleanOr
	replace [or_conditional_and_expression]
	'|| CE [conditional_and_expression]
    by
	'or CE
end rule


%% Boolean operator Not
%% from !
%% to not
rule transformBooleanNot
	replace [unary_op]
	'!
    by
	'not
end rule



%%Transform Conditional Statements

rule transformConditionalStatement
    replace [assignment_expression]
    expr [conditional_or_expression] '? exprtrue [expression] ': exprfalse [conditional_expression] 
    by
    'if '( expr ') '{
        exprtrue ';
    '} else '{
        exprfalse ';
    '}
end rule
    


%% Remove class
rule removeClass
    replace [program]
    _ [class_header] Body [class_body] 
    by
    Body
end rule
    

%% Remove main function
rule removeMainFunction
    replace [method_or_constructor_declaration]
    _ [repeat modifier] _ [type_specifier] _ [method_declarator] _ [opt throws] Body [method_body]
    by
    Body
end rule




%one decl statetement to decls
function statementOneDeclToDecls Stmt [statement]
    replace [repeat declaration_or_statement]
	_ [repeat declaration_or_statement]
    deconstruct not Stmt
	_ [block]
    construct Decl [declaration_or_statement]
	Stmt
    by
	Decl
end function

%one decl statetement to decls
function statementBlockToDecls Stmt [statement]
    replace [repeat declaration_or_statement]
	_ [repeat declaration_or_statement]
    deconstruct Stmt
	'{ Decls [repeat declaration_or_statement] '}
    by
	Decls
end function


