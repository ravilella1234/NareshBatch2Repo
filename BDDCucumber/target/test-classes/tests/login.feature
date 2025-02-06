@all
Feature: User Login  
  As a user, I want to log in to the application so that I can access my account
  
Background:
	Given The user navigates to the login page
  
  @smoketest @regression @login @validcredentials
  Scenario Outline: Successful login with valid credentials
    When The user enters valid email credentials "<username>"
    And Enter valid password "<password>"
    And Clicks the login button
    Then The user should be redirected to the dashboard
    Examples:
    |username	|password|
    |user1		|	pass123|
    |user2		|	pass456|
    |user3		|	pass789|
		
  @smoketest  @regression @login @invalid-credentials
  Scenario: Login attempt with invalid credentials    
    When The user enters invalid email "ravilella@gmail.com"
    And Enter invalid password "123456"
    And Clicks the login button
    Then An error message "Invalid username or password" should be displayed  

	@regression @login @invalid-valid-credentials
  Scenario: Login with invalid user and valid password credentials   
    When The user enters invalid email "ravilella@gmail.com"
    And Enter valid password "123456"  
    And Clicks the login button
    Then user should get proper warning message

	@regression @login @valid-invalid-credentials
  Scenario: Login with valid user and invalid password credentials  
    When The user enters valid email credentials "ravilella@gmail.com"
    And Enter invalid password "123456"  
    And Clicks the login button
    Then user should get proper warning message
  