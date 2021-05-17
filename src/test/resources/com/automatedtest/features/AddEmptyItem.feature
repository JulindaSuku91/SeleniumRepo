@AddEmptyNegativeCase
Feature: Negative Test case to add an empty item
        As a user I should able to complete operation add
@AddEmptyItem
Scenario: I add new item with success
    Given I navigate to "https://todomvc.com/examples/angular2/"
    Then Requested Page is open with success
    And I can find field to enter items
    And I enter "New Item"
    When I enter " "
    Then I should not see this new item saved in list


