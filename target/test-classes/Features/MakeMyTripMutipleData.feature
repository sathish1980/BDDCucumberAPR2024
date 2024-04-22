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
#Sample Feature Definition Template

Feature: Title of your feature
  I want to use this template for my feature file
@Sanity
  Scenario Outline: Verify user can search the flight with valid values
  	Given Lauch the browser and enter MakemyTrip Url
    And Wait for Some to click on Adds
    When I see a From location dorpdown I will select on it as <fromLocation>
    And Select to location as <toLocation>
    And select date as <date>
    And Click On Search button
    Then I validate the searchResult
    And I Close the Browser
    

    Examples: 
      | fromLocation  | toLocation | date  |
      | MAA | PNQ | 27 |
      | BLR | MAA | 25 |
      | BOM |	DEL | 22 |
