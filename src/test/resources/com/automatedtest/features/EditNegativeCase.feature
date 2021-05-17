@EditItemNegative
Feature: Edit Existing Item
  I want to use this template to do the  negative case automation of edit existing item
  
  @EditItemScenarioNegative
  Scenario: Edit Existing Item
    Given I navigate to url "https://todomvc.com/examples/angular2/"
    Then Requested Page is open with success
    And I can find field to enter items 
    And I enter "My First Item"
    And I have an item created before
    When I double click to item
    And I change content to empty " "
    Then Item should not be displayed on list anymore

 

