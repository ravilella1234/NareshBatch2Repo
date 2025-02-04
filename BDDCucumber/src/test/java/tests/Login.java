package tests;

import io.cucumber.java.en.*;

public class Login 
{
	
	@Given("The user navigates to the login page")
	public void the_user_navigates_to_the_login_page() {
	    System.out.println("---> user navigated to the login page");
	}

	@When("The user enters valid email credentials {string}")
	public void the_user_enters_valid_email_credentials(String user_email) {
		System.out.println("---> user entered valid email credentials : " + user_email);
	}

	@When("Enter valid password {string}")
	public void enter_valid_password(String user_password) {
		System.out.println("---> user Entered valid password : " +  user_password);
	}

	@When("Clicks the login button")
	public void clicks_the_login_button() {
		System.out.println("---> user Clickd the login button");
	}

	@Then("The user should be redirected to the dashboard")
	public void the_user_should_be_redirected_to_the_dashboard() {
		System.out.println("---> user redirected to the dashboard page");
	}

	
	@When("The user enters invalid email {string}")
	public void the_user_enters_invalid_email(String invalid_email) {
		System.out.println("---> user entered invalid email : " + invalid_email);
	}

	@When("Enter invalid password {string}")
	public void enter_invalid_password(String invalid_password) {
		System.out.println("---> user Entered invalid password : " + invalid_password);
	}

	@Then("An error message {string} should be displayed")
	public void an_error_message_should_be_displayed(String error_message) {
		System.out.println(error_message + "  ---> error message is displayed");
	}

	@Then("user should get proper warning message")
	public void user_should_get_proper_warning_message() {
		System.out.println("---> user got proper warning message  ");
	}	
}
