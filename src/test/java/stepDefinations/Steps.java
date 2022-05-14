package stepDefinations;

import io.cucumber.java.en.*;

public class Steps {
	@Given("User is on Home Page")
	public void user_is_on_home_page() {
	    System.out.println("User is on Home Page");
	}

	@When("User Navigate to LogIn Page")
	public void user_navigate_to_log_in_page() {
		System.out.println("User Navigate to LogIn Page");
	}

	@And("User enters UserName and Password")
	public void user_enters_user_name_and_password() {
		System.out.println("User enters UserName and Password");
	}

	@Then("Message displayed Login Successfully")
	public void message_displayed_login_successfully() {
		System.out.println("Message displayed Login Successfully");
	}

}
