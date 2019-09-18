package stepDefinitions;

import org.openqa.selenium.WebDriver;

import Pages.LoginPage;
import cucumber.api.java.en.Given;
import utilities.TestBase;

public class LoginStepDefinition extends TestBase {
	
	LoginPage loginPage;

	public LoginStepDefinition() {
		loginPage = new LoginPage(driver);
	}

	@Given("^I login with valid credentials$")
	public void i_login_with_valid_credentials() throws Throwable {
		
		loginPage.salesForceLoginWithValidUsernamePassword();
	}

}
