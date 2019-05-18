#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
Feature: Test functionality 

  Background: 
    Given I open browser and enter link website "https://1log.online:8009/admin/"
    And I fill login form
      | username | password |
      | vananhto |   123456 |
    And I login

  @done
  Scenario Outline: 
    And I open driver screen "https://1log.online:8009/admin/driver"
    And I click create new driver button
    When I input driver code "<driverCode>"
    And I input full name of driver "<driverFullName>"
    And I input driver mobile no "<driverMobileNo>"
    And I input driver id no "<driverIdNo>"
    And I save driver info
    And I confirm to save
    And I click OK
    Then Driver is created successfully

    Examples: info of new driver
      | driverCode | driverFullName | driverMobileNo | driverIdNo |
      | TX99901    | Dương Minh Anh |     0988110978 | 1901238984 |
	@done
  Scenario: Create new driver
    Given I open driver page "https://1log.online:8009/admin/driver"
    When I click button to open create new driver screen
    And I enter a valid driver code
    And I enter a valid driver full name
    And I enter a valid driver mobile number
    And I enter a valid driver id number
    And I click save button
    And I click button to confirm saving
    And I click button OK
    Then The driver is created successfully
    
   Scenario: Create new order
   	Given I open order page "https://1log.online:8009/admin/order"
   	When I click button to open order screen
   	And I enter order code
   	And I enter order number
   	And I enter order bill number
   	And I select customer
   	And I enter order date
   	And I enter note 
   	And I enter order amount
   	And I enter order quantity
   	And I enter order volume
   	And I click save button
    And I click button to confirm saving
    And I click button OK
    Then The driver is created successfully
