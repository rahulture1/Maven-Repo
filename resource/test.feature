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
Feature: Test Amazon App
  I want to use this template for my feature file

  Scenario: Login with valid cerdentials
    Given Navigate to "https://www.amazon.in/"
    And User should click on signin
    When user enter username "9880461409" and password "1qaz!QAZ"
    And click on Login button
    Then User must navigate to home page
