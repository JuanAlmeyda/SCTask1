package steps;

import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

public class StartingSteps extends DriverFactory{
	@Before
	public void presetup() {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\JuanCarlosAlmeydaCru\\Downloads\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
	}
	
	@Given("^the user is on landing page$")
	public void setup() throws Throwable {
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
	}


}
