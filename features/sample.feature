
Feature: DOF

Background: 
Given I login with valid credentials

  @Regression
  Scenario: DOF-50 [Order Mgmt Track - New Subscription Creation] Contract End Date
    Given that I am logged into CRM SOM
    When I enter the provider order in CRM
    Then I can see the provider contract in the items
    And I can  see  contract end date displayed on the provider contract
    And verify contract greater than one year

 @Regression
  Scenario: Login into SAP HANA
    Given that I am logged into SAP HANA
    When I enter "Maintain Business partner" in the search tab
    Then login into module
    And create "Person" business partner
