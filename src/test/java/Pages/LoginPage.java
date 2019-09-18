package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.TestBase;

public class LoginPage extends TestBase {

	WebDriver driver;
	public LoginPage(WebDriver driver) {

		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	public static WebElement userNameTextField;

	@FindBy(id = "password")
	public static WebElement passwordTextField;

	@FindBy(id = "Login")
	public static WebElement applicationLoginButton;

	public void salesForceLoginWithValidUsernamePassword() throws InterruptedException {
		userNameTextField.sendKeys(prop.getProperty("username"));
		passwordTextField.sendKeys(prop.getProperty("password"));
		applicationLoginButton.click();
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		By element = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("Login")));
		

	}

}
