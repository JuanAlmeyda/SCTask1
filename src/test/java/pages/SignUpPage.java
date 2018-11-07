package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SignUpPage {
	
	WebDriver driver;

	@FindBy(name = "firstName")
	private WebElement firstNameTextBox;
	@FindBy(name = "lastName")
	private WebElement lastNameTextBox;
	@FindBy(name = "phone")
	private WebElement phoneTextBox;
	@FindBy(name = "userName")
	private WebElement emailTextBox;
	@FindBy(name = "address1")
	private WebElement addressTextBox;
	@FindBy(name = "city")
	private WebElement cityTextBox;
	@FindBy(name = "state")
	private WebElement stateTextBox;
	@FindBy(name = "postalCode")
	private WebElement postalCodeTextBox;
	@FindBy(name = "country")
	private WebElement countrySelect;
	@FindBy(name = "email")
	private WebElement userTextBox;
	@FindBy(name = "password")
	private WebElement passwordTextBox;
	@FindBy(name = "confirmPassword")
	private WebElement confirmPasswordTextBox;
	@FindBy(name = "register")
	private WebElement signupButton;

	public SignUpPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void he_provides_the_first_name_as(String firstName) throws Throwable {
		firstNameTextBox.sendKeys(firstName);
	}

	public void he_provides_the_last_name_as(String lastName) throws Throwable {
		lastNameTextBox.sendKeys(lastName);
	}
	
	public void he_provides_the_phone_as(String phone) throws Throwable {
		phoneTextBox.sendKeys(phone);
	}
	
	public void he_provides_the_email_as(String email) throws Throwable {
		emailTextBox.sendKeys(email);
	}
	
	public void he_provides_the_address_as(String address) throws Throwable {
		addressTextBox.sendKeys(address);
	}
	public void he_provides_the_city_as(String city) throws Throwable {
		cityTextBox.sendKeys(city);
	}
	public void he_provides_the_state_as(String state) throws Throwable {
		stateTextBox.sendKeys(state);
	}
	public void he_provides_the_postal_code_as(String postal) throws Throwable {
		postalCodeTextBox.sendKeys(postal);
	}
	public void he_provides_the_country_as(String country) throws Throwable {
		Select dropdown = new Select(countrySelect);
		dropdown.selectByVisibleText(country.trim().toUpperCase());
	}
	
	public void he_provides_the_user_name_as(String userName) throws Throwable {
		userTextBox.sendKeys(userName);
	}

	public void he_provides_the_password_as(String password) throws Throwable {
		passwordTextBox.sendKeys(password);
	}

	public void he_provides_the_confirm_password_again_as(String confirmPassword) throws Throwable {
		confirmPasswordTextBox.sendKeys(confirmPassword);
	}

	public void he_signs_up() throws Throwable {
		signupButton.click();
	}


}
