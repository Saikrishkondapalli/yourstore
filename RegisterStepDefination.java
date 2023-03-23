package stepdefinations;

import io.cucumber.java.en.Given;

public class RegisterStepDefination {
	
	 @Given("User open the indexpage")
	public void user_open_the_indexpage() {
	   System.out.println("Open the index page");
	}
	@Given("User should be on Login")
	public void user_should_be_on_login() {
	    System.out.println("Done with opening browser");
	}

	

}
