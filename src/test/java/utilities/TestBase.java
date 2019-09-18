package utilities;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestBase {

//	public static Properties prop;
//	public static WebDriver driver;
	
	public  Properties prop;
	public  WebDriver driver;

	public TestBase() {

		prop = new Properties();
		try {
			prop.load(new FileInputStream("./configurations/browser-config.properties"));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public  void initiateBrowser() {
		String browserName = prop.getProperty("browser");
		String chromeDriverPath = prop.getProperty("chrome.driver.path");
		String ieDriverPath = prop.getProperty("iepath.driver.path");
		String firefoxDriverPath = prop.getProperty("firefoxpath.driver.path");
		String baseURL = prop.getProperty("baseURL");

		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", chromeDriverPath);
			driver = new ChromeDriver();

		} else if (browserName.equals("ie")) {
			System.setProperty("webdriver.ie.driver", ieDriverPath);
			driver = new InternetExplorerDriver();
		} else if (browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", firefoxDriverPath);
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().pageLoadTimeout(GlobalConstants.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(GlobalConstants.IMPLICITE_WAIT, TimeUnit.SECONDS);
		driver.get(baseURL);

	}

	public  void closeBrowser() {
		driver.close();
		driver.quit();

	}

}
