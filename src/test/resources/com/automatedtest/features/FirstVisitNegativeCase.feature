@FirstPageVisit
Feature: Open for the first time page after closing browser
        As a user I should able when navigate for first time after closing browser to page and not see any item created before

  Scenario: Check page on first visit
    Given I navigate to "https://todomvc.com/examples/angular2/"
    Then Requested Page is open with success
    And I can find field to enter items
    And Any item on list view


