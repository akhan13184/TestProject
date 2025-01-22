@tag
Feature: Testing contact us page
 Testing contact us page without submitting

  Scenario: Title of your scenario outline
    Given I log into "https://www.mortgageadvicebureau.com/contact-us"
    And I swipe down
    Then I put first name as "Ammar"
    And I put last name as "Khan"
    And I put email address as "ammar88@hotmail.co.uk"
    And I swipe down
    And I put Post Code as "LE2 2BJ"
    And I put mobile number as "07868155174"
    And I leave a message as "This is for a interview"
    And I select marking email options
    