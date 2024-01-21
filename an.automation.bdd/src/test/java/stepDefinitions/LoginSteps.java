package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	@Given("I want to navigate to Admin page")
	public void navigateToAdminPage() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Navigated to Admin Page");	    
	}
	@And("Give user name")
	public void giveUserName() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Entered User Name");	
	}
	@And("Give user password")
	public void givePaggword() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Entered Password");	
	}

    @And("Enter {string} and {string}")
	public void enter_admin_userName_userPwd(String UserName, String Password) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("uname is" + " " + UserName + " " + "upwd is" + " " + Password);
	}
 	
		
	@And("Click Login")
	public void clickLoginButton() {
	    // Write code here that turns the phrase above into concrete actions	
		System.out.println("Clicked on Login Button");	
	}
	@When("Login is successfull")
	public void whenLoginIsSuccess() {
	    // Write code here that turns the phrase above into concrete actions	
		System.out.println("Logged In Page Displayed");	
	}
	@Then("Display successful login message")
	public void displayLoginSuccessMessage() {
	    // Write code here that turns the phrase above into concrete actions	
		System.out.println("Login Success validated");	
	}

	
}
