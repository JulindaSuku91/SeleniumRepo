@DeleteItemFeature
Feature: Delete Item Feature
  I want to use this template for my functioanlity delete

  @DeleteItemScenario
  Scenario: Delete
    Given I navigate to url "https://todomvc.com/examples/angular2/"
    Then Requested Page is open with success
    And I can find field to enter items 
    And I enter "My First Item"
    And I click on Item
    When I click on x option
    Then Item is deleted


