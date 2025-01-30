package cucumberproject;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition 
{
	
	@Given("The user navigates to the login page")
	public void the_user_navigates_to_the_login_page() {
		System.out.println("The user navigated to the login page");
	}

	@When("The user enters valid email credentials {string}")
	public void the_user_enters_valid_email_credentials(String username) {
	    System.out.println(username + " Entered");
	}

	@And("Enter valid password {string}")
	public void enter_valid_password(String password) {
		System.out.println(password + " Entered");
	}

	@And("Clicks the login button")
	public void clicks_the_login_button() {
		System.out.println("Clicked on login Button");
	}

	@Then("The user should be redirected to the dashboard")
	public void the_user_should_be_redirected_to_the_dashboard() {
		System.out.println("user has be redirected to the dashboard");
	}
	
	
}
