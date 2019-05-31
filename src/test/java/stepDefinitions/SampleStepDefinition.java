package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;



public class SampleStepDefinition {

	@Given("^that I am logged into CRM SOM$")
	public void that_i_am_logged_into_crm_som() throws Throwable {
		
	}

	@Given("^that I am logged into SAP HANA$")
	public void that_i_am_logged_into_sap_hana() throws Throwable {
		System.out.println("hello");
	}

	@When("^I enter the provider order in CRM$")
	public void i_enter_the_provider_order_in_crm() throws Throwable {
		System.out.println("hello");
	}

	@When("^I enter \"([^\"]*)\" in the search tab$")
	public void i_enter_something_in_the_search_tab(String strArg1) throws Throwable {
		System.out.println(strArg1);
	}

	@Then("^I can see the provider contract in the items$")
	public void i_can_see_the_provider_contract_in_the_items() throws Throwable {
		System.out.println("hello");
	}

	@Then("^login into module$")
	public void login_into_module() throws Throwable {
		System.out.println("hello");
	}

	@And("^I can  see  contract end date displayed on the provider contract$")
	public void i_can_see_contract_end_date_displayed_on_the_provider_contract() throws Throwable {
		System.out.println("hello");
	}

	@And("^verify contract greater than one year$")
	public void verify_contract_greater_than_one_year() throws Throwable {
		System.out.println("hello");
	}

	@And("^create \"([^\"]*)\" business partner$")
	public void create_something_business_partner(String strArg1) throws Throwable {
		System.out.println(strArg1);
	}

}