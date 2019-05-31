package testRunner;

import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;

//@RunWith(Cucumber.class)
@CucumberOptions(features = "./features", glue = { "stepdefinitions" }, plugin = { "pretty",
		"html:test-outout", "json:json_output/cucumber.json",
		"junit:junit_xml_reports/cucumber.xml" }, /* to generate different types of reporting */
		monochrome = true,
		tags= {"@UATTesting"}/* display the console output in a proper readable format */
		//strict = true, /* it will check if any step is not defined in step definition file */
		//dryRun = false /* to check the mapping is proper between feature file and step def file */
		/*tags = {"@SmokeTest", "~@RegressionTest", "~@End2End","@TestRun"}*/ 

)
@Test
public class TestRunner extends AbstractTestNGCucumberTests  {
	

}
