Feature: Test log in

  Scenario Outline: validate log in functionality
    Given user launch browser
    And user is on log in page
    When user enters <username> and <password>
    And user navigate to home page
    Then user click on logout button

    Examples:
    
   |username|password|
  	|Raghav|12345|
  	|ragha|12478|