$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("sample.feature");
formatter.feature({
  "line": 2,
  "name": "DOF",
  "description": "",
  "id": "dof",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Regression"
    }
  ]
});
formatter.before({
  "duration": 7278448844,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "DOF-50 [Order Mgmt Track - New Subscription Creation] Contract End Date",
  "description": "",
  "id": "dof;dof-50-[order-mgmt-track---new-subscription-creation]-contract-end-date",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@Admin"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "that I am logged into CRM SOM",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I enter the provider order in CRM",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I can see the provider contract in the items",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I can  see  contract end date displayed on the provider contract",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "verify contract greater than one year",
  "keyword": "And "
});
formatter.match({
  "location": "SampleStepDefinition.that_i_am_logged_into_crm_som()"
});
formatter.result({
  "duration": 257429234,
  "status": "passed"
});
formatter.match({
  "location": "SampleStepDefinition.i_enter_the_provider_order_in_crm()"
});
formatter.result({
  "duration": 139353,
  "status": "passed"
});
formatter.match({
  "location": "SampleStepDefinition.i_can_see_the_provider_contract_in_the_items()"
});
formatter.result({
  "duration": 80139,
  "status": "passed"
});
formatter.match({
  "location": "SampleStepDefinition.i_can_see_contract_end_date_displayed_on_the_provider_contract()"
});
formatter.result({
  "duration": 89043,
  "status": "passed"
});
formatter.match({
  "location": "SampleStepDefinition.verify_contract_greater_than_one_year()"
});
formatter.result({
  "duration": 80585,
  "status": "passed"
});
formatter.write("Finished scenario");
formatter.after({
  "duration": 1140711448,
  "status": "passed"
});
formatter.before({
  "duration": 5042809002,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Login into SAP HANA",
  "description": "",
  "id": "dof;login-into-sap-hana",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 12,
      "name": "@User"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "that I am logged into SAP HANA",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "I enter \"Maintain Business partner\" in the search tab",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "login into module",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "create \"Person\" business partner",
  "keyword": "And "
});
formatter.match({
  "location": "SampleStepDefinition.that_i_am_logged_into_sap_hana()"
});
formatter.result({
  "duration": 3725135,
  "error_message": "java.lang.AssertionError: expected [true] but found [false]\r\n\tat org.testng.Assert.fail(Assert.java:94)\r\n\tat org.testng.Assert.failNotEquals(Assert.java:513)\r\n\tat org.testng.Assert.assertTrue(Assert.java:42)\r\n\tat org.testng.Assert.assertTrue(Assert.java:52)\r\n\tat stepDefinitions.SampleStepDefinition.that_i_am_logged_into_sap_hana(SampleStepDefinition.java:22)\r\n\tat ✽.Given that I am logged into SAP HANA(sample.feature:14)\r\n",
  "status": "failed"
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
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 1425176072,
  "status": "passed"
});
});