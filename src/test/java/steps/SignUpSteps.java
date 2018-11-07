package steps;

import cucumber.api.java.en.And;
import pages.SignUpPage;

public class SignUpSteps extends DriverFactory {
	
	@And("^he provides the first name as ([^\"]*)$")
	public void he_provides_the_first_name_as(String firstName) throws Throwable {
		new SignUpPage(driver).he_provides_the_first_name_as(firstName);
	}

	@And("^he provides the last name as ([^\"]*)$")
	public void he_provides_the_last_name_as(String lastName) throws Throwable {
		new SignUpPage(driver).he_provides_the_last_name_as(lastName);
	}
	
	@And("^he provides the phone as ([^\"]*)$")
	public void he_provides_the_phone_as(String phone) throws Throwable {
		new SignUpPage(driver).he_provides_the_phone_as(phone);
	}
	
	@And("^he provides the email as ([^\"]*)$")
	public void he_provides_the_email_as(String email) throws Throwable {
		new SignUpPage(driver).he_provides_the_email_as(email);
	}
	
	@And("^he provides the address as ([^\"]*)$")
	public void he_provides_the_address_as(String address) throws Throwable {
		new SignUpPage(driver).he_provides_the_address_as(address);
	}
	
	@And("^he provides the city as ([^\"]*)$")
	public void he_provides_the_city_as(String city) throws Throwable {
		new SignUpPage(driver).he_provides_the_city_as(city);
	}
	
	@And("^he provides the state as ([^\"]*)$")
	public void he_provides_the_state_as(String state) throws Throwable {
		new SignUpPage(driver).he_provides_the_state_as(state);
	}
	
	@And("^he provides the postal code as ([^\"]*)$")
	public void he_provides_the_postal_code_as(String postalCode) throws Throwable {
		new SignUpPage(driver).he_provides_the_postal_code_as(postalCode);
	}
	
	@And("^he provides the country as ([^\"]*)$")
	public void he_provides_the_country_as(String country) throws Throwable {
		new SignUpPage(driver).he_provides_the_country_as(country);
	}
	
	@And("^he provides the user name as ([^\"]*)$")
	public void he_provides_the_user_name_as(String user) throws Throwable {
		new SignUpPage(driver).he_provides_the_user_name_as(user);
	}
	
	@And("^he provides the password as ([^\"]*)$")
	public void he_provides_the_password_as(String password) throws Throwable {
		new SignUpPage(driver).he_provides_the_password_as(password);
	}

	@And("he provides the confirm password again as ([^\"]*)$")
	public void he_provides_the_confirm_password_again_as(String confirmPassword) throws Throwable {
		new SignUpPage(driver).he_provides_the_confirm_password_again_as(confirmPassword);
	}

	@And("^he signs-up$")
	public void she_signs_up() throws Throwable {
		new SignUpPage(driver).he_signs_up();
	}


}
