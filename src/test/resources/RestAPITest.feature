Feature: API Tests
  @tag1
  Scenario: Verify API response 401
    Given a REST API endpoint
    When I send a GET request of "test"
    Then the response status code should be 401
    
    Scenario: Verify API response 200
    Given a REST API endpoint
    When I send a GET request of "ammar88"
    Then the response status code should be 200