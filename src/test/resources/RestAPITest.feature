Feature: API Tests
Showcase API automation for an open API and how different responses can be used. 
  
  Scenario: 1 Verify API response status code 401
    Given a REST API endpoint of "https://demoqa.com/Account/v1/User/"
    When I send a GET request of "test"
    Then the response status code should be 401
    
    Scenario: 2 Verify API response status code 200
    Given a REST API endpoint of "https://demoqa.com/Account/v1/User/"
    When I send a GET request of ""
    Then the response status code should be 200