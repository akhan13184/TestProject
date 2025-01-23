Feature: Testing contact us page
 Go to the website https://www.mortgageadvicebureau.com/contact-us and fill all the details in ‘Contact Us’ section (except clicking on ‘Submit’ button)
 
  Scenario: Filling all the details in ‘Contact Us’ section (except clicking on ‘Submit’ button)
    Given I log into "https://www.mortgageadvicebureau.com/contact-us"
    And I swipe down
    Then I put first name as "John"
    And I put last name as "McLeod"
    And I put email address as "JMcleod@hotmail.co.uk"
    And I swipe down
    And I put Post Code as "LE3 4AB"
    And I put mobile number as "07979441277"
    And I leave a message as "This is for an interview"
    And I select marking email options
    