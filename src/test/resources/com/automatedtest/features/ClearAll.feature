@DeleteAllItemFeature
Feature: Delete All Items Feature
  I want to use this template for my functioanlity delete all items

  @DeleteAllItemScenario
  Scenario: Delete
    Given I navigate to url "https://todomvc.com/examples/angular2/"
    Then Requested Page is open with success
    And I can find field to enter items 
    And I enter "My First Item"
    And I enter "My Second Item"
    And I select Items to delete
    When I click on delete all option
    Then All Items are deleted

 
