package stepDefinitions;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import utilities.TestBase;

public class HooksCucumber extends TestBase {

	Scenario scenario;

	// @Before({"@Admin,@User"}) /* Mention the tags here on which the before method
	// will be executed */
	@Before
	public void testSetUp(Scenario scenario) {

		this.scenario = scenario;
		initiateBrowser();
		System.out.println("Test Environment set up");
		System.out.println("___________________________________________________________");
		System.out.println("Executing the scenario: " + scenario.getName());

	}

	@After
	public void tearDown(Scenario scenario) {
		scenario.write("Finished scenario");

		if (scenario.isFailed()) {

			System.out.println(scenario.getName() + " is failed");
			scenario.embed(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES), "image/png");
		}

		else {
			try {
				System.out.println(scenario.getName() + " is passed ");
				scenario.embed(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES), "image/png");
			} catch (Exception e) {
				e.getMessage();
			}
		}

		System.out.println("Test Environment destroyed");
		System.out.println("___________________________________________________________");
		closeBrowser();

	}

}
