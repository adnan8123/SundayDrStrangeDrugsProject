@regression @smoke @us-248

Feature: Drugs A-Z Functionality
  Background:
    Given Open Drugs HomePage

  Scenario: Drugs A-Z Functionality
    When the user click to the Drugs A-Z section
    And the user should see an alphabetical list of drugs
    Then each drug in the list should be clickable
















