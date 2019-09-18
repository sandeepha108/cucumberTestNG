package testRunner;

import java.io.File;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;

import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;

@CucumberOptions(features = { "./features" }, glue = { "stepDefinitions" }, plugin = { "pretty",
		"html:Reports/cucumber-pretty",
		"com.cucumber.listener.ExtentCucumberFormatter:./Reports/cucumber-extent/report.html" }, monochrome = true, tags = {
				"@Regression" })
/*
 * plugin = { "pretty", "html:test-outout", "json:json_output/cucumber.json",
 * "junit:junit_xml_reports/cucumber.xml" },
 */
/* to generate different types of reporting */
/* display the console output in a proper readable format */
// strict = true, /* it will check if any step is not defined in step definition
// file */
// dryRun = false /* to check the mapping is proper between feature file and
// step def file */
/* tags = {"@SmokeTest", "~@RegressionTest", "~@End2End","@TestRun"} */

@Test
public class TestRunner extends AbstractTestNGCucumberTests {
	private TestNGCucumberRunner testNGCucumberRunner;

	@BeforeClass(alwaysRun = true)
	public void setUpClass() throws Exception {
		testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
	}

	@Test(groups = "cucumber", description = "Runs Cucumber Feature", dataProvider = "features")
	public void feature(CucumberFeatureWrapper cucumberFeature) {
		testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
	}

	/**
	 * @return returns two dimensional array of {@link CucumberFeatureWrapper}
	 *         objects.
	 */
	@DataProvider
	public Object[][] features() {
		return testNGCucumberRunner.provideFeatures();
	}

	@AfterClass(alwaysRun = true)
	public void tearDownClass() throws Exception {
		testNGCucumberRunner.finish();
		Reporter.loadXMLConfig(new File("./extent-config.xml"));
		/*
		 * Properties p = System.getProperties(); p.list(System.out);
		 */

		/*
		 * Reporter.setSystemInfo("User Name",System.getProperty("user.name"));
		 * Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
		 * Reporter.setSystemInfo("64 Bit", "Windows 10");
		 * Reporter.setSystemInfo("2.53.0", "Selenium"); Reporter.setSystemInfo("3.3.9",
		 * "Maven"); Reporter.setSystemInfo("1.8.0_66", "Java Version");
		 * Reporter.setTestRunnerOutput("Cucumber JUnit Test Runner");
		 */
	}

}
