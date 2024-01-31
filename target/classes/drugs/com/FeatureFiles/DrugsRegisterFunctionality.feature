@regression @smoke @us-248
Feature: Drugs Register Functionality

Description: Registration with invalid email
  
  Background:
    Given Open Drugs Homepage

  Scenario: Drugs Register Functionality
  	When the user clicks on the Register link
    And the user enters invalid information
    And the user clicks to the Continue with email button
    Then the user should see an error message
   