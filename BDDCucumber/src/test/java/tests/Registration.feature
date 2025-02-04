Feature: User Registration


Scenario: Register with mandatory fields
	Given User navigates to Register Account page
	When User enters first name "Ravikanth" Into the First Name field
	And Enters lastname "Lella" into the Last Name field
	And Enters email address "ravikanthlella@gmail.com" into the Email field
	And Enters telephone "1234567890" into the Telephone field
	And Enters password "12345" into the Password field
	And Enters password "12345" into the Password Confirm field
	And Selects Privacy Policy field
	And Click on Continue button
	Then Account should get successfully created
	

Scenario: Register with all fields
	Given User navigates to Register Account page 
	When User enters first name "Ravikanth" Into the First Name field
	And Enters lastname "Lella" into the Last Name field
	And Enters email address "ravikanthlella@gmail.com" into the Email field
	And Enters telephone "1234567890" into the Telephone field 
	And Enters password "12345" into the Password field
	And Enters password "12345" into the Password Confirm field
	And Selects Yes for Newsletter
	And Selects Privacy Policy field
	And Click on Continue button
	Then Account should get successfully created
	

Scenario: Register without providing any fields.
	Given User navigates to Register Account page
	When User donot enter details into any fields
	And Click on Continue button
	Then Warning messages should be displayed for all the mandatory fields

	
