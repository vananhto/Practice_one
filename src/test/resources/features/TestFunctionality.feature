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

	Scenario: 
    Given I open browser and enter link website "https://1log.online:8009/admin/"
    And I fill login form
      | username | password  |
      | vananhto  | 123456 |
    And I login
    
  #Scenario:
  #	Given I open order page "https://1log.online:8009/admin/order"
  #	And I click create new order
  #	When I enter 
