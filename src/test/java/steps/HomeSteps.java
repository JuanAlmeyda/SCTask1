package steps;

import cucumber.api.java.en.Then;
import junit.framework.Assert;
import pages.HomePage;

public class HomeSteps extends DriverFactory{
	
	@Then("^he should get a welcome message$")
	public void she_should_get_a_welcome_message() throws Throwable {
		Assert.assertTrue(new HomePage(driver).isSignInLinkDisplayed());
	}


}
