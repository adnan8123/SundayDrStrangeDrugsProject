@regression @smoke @us-248

Feature: Drugs Search Functionality

Background:
    Given Open Drugs Homepage

  Scenario: Search for Aspirin
  	When the user search for aspirin in the search bar
    Then the user should see the list of aspirin items
    
    

 