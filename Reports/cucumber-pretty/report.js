$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("sample.feature");
formatter.feature({
  "line": 2,
  "name": "DOF",
  "description": "",
  "id": "dof",
  "keyword": "Feature"
});
formatter.before({
  "duration": 6690853852,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I login with valid credentials",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinition.i_login_with_valid_credentials()"
});
formatter.result({
  "duration": 340635050,
  "error_message": "java.lang.NullPointerException\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy21.sendKeys(Unknown Source)\r\n\tat Pages.LoginPage.salesForceLoginWithValidUsernamePassword(LoginPage.java:30)\r\n\tat stepDefinitions.LoginStepDefinition.i_login_with_valid_credentials(LoginStepDefinition.java:20)\r\n\tat ✽.Given I login with valid credentials(sample.feature:5)\r\n",
  "status": "failed"
});
formatter.scenario({
  "line": 8,
  "name": "DOF-50 [Order Mgmt Track - New Subscription Creation] Contract End Date",
  "description": "",
  "id": "dof;dof-50-[order-mgmt-track---new-subscription-creation]-contract-end-date",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "that I am logged into CRM SOM",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I enter the provider order in CRM",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I can see the provider contract in the items",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I can  see  contract end date displayed on the provider contract",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "verify contract greater than one year",
  "keyword": "And "
});
formatter.match({
  "location": "SampleStepDefinition.that_i_am_logged_into_crm_som()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SampleStepDefinition.i_enter_the_provider_order_in_crm()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SampleStepDefinition.i_can_see_the_provider_contract_in_the_items()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SampleStepDefinition.i_can_see_contract_end_date_displayed_on_the_provider_contract()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SampleStepDefinition.verify_contract_greater_than_one_year()"
});
formatter.result({
  "status": "skipped"
});
formatter.write("Finished scenario");
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 3394107457,
  "status": "passed"
});
formatter.before({
  "duration": 6068915668,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I login with valid credentials",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinition.i_login_with_valid_credentials()"
});
formatter.result({
  "duration": 3555062,
  "error_message": "java.lang.NullPointerException\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy21.sendKeys(Unknown Source)\r\n\tat Pages.LoginPage.salesForceLoginWithValidUsernamePassword(LoginPage.java:30)\r\n\tat stepDefinitions.LoginStepDefinition.i_login_with_valid_credentials(LoginStepDefinition.java:20)\r\n\tat ✽.Given I login with valid credentials(sample.feature:5)\r\n",
  "status": "failed"
});
formatter.scenario({
  "line": 16,
  "name": "Login into SAP HANA",
  "description": "",
  "id": "dof;login-into-sap-hana",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 15,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "that I am logged into SAP HANA",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "I enter \"Maintain Business partner\" in the search tab",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "login into module",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "create \"Person\" business partner",
  "keyword": "And "
});
formatter.match({
  "location": "SampleStepDefinition.that_i_am_logged_into_sap_hana()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Maintain Business partner",
      "offset": 9
    }
  ],
  "location": "SampleStepDefinition.i_enter_something_in_the_search_tab(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SampleStepDefinition.login_into_module()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Person",
      "offset": 8
    }
  ],
  "location": "SampleStepDefinition.create_something_business_partner(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.write("Finished scenario");
formatter.embedding("image/png", "embedded1.png");
formatter.after({
  "duration": 1550081853,
  "status": "passed"
});
});