@Org @Net
Feature: Testing for login page

@DEV
Scenario Outline: Unsuccessful login

	Given I want to use the browser Firefox
	When I set the username to "<username>"
	When I set the password to "<password>"
	When I login to CosmicComix
	Then I see the error message "<message>"
	And I am on the login page

	@Regression
	Examples:
	|	username		|	password		|		message		|
	|	testuser1 		|					|	Please provide a password.	|
	|					|	testuser1		|	Please provide a username.	|
	|	testuser		|	testuser		|	That username does not match anything in our records.		|
	|	testuser1		|	testuser2		|	The password provided does not match the username entered.	|

@SIT
Scenario Outline: Successful login

	Given I want to use the browser "<browser>"
	When I set the username to testuser1
	And I set the password to testuser1
	When I login to CosmicComix
	Then I am on the launcher page

	@Regression
	Examples:
			|	    browser	 |
			|	    Firefox	 |
			|	    Chrome       |
			|     InternetExplorer   |
	@Smoke
	Examples:
			|	browser		|
			|	Firefox		|

@UAT
Scenario Outline: Login to Facebook

	Given user navigates to Facebook
	When I enter Username as "<username>" and Password as "<password>"
	Then login should be unsuccessful
	Then the user should be redirected to login retry
	
	Examples:
	| username  | password  | 
	| username1 | password1 | 
	| username2 | password2 |