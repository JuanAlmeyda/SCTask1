package steps;

import cucumber.api.java.en.When;
import pages.LandingPage;

public class LandingSteps extends DriverFactory {
	
	@When("^he chooses to register$")
	public void she_chooses_to_sign_up() throws Throwable {
		new LandingPage(driver).he_chooses_to_register();
	}
	
}
