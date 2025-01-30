Feature: User Login
  As a user, I want to log in to the application so that I can access my account.
  
	Scenario: Successful login with valid credentials  
    Given The user navigates to the login page  
    When The user enters valid email credentials "ravilella@gmail.com"
    And Enter valid password "123456"
    And Clicks the login button  
    Then The user should be redirected to the dashboard