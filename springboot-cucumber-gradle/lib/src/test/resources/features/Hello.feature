Feature: Validation of get method

  Scenario: Send a valid Request to get hello
  
  Given I send a request to the URL to get hello
  Then the response will return status 200
