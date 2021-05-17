@AddItem
Feature: AddItem
        As a user I should able to complete operation add

  Scenario: I add new item with success
    Given I navigate to "https://todomvc.com/examples/angular2/"
    Then Requested Page is open with success
    And I can find field to enter items
    When I enter "My First Item"
    Then I should see new my first item saved in list


