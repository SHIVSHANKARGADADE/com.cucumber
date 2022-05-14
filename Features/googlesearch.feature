Feature: To check Google Search

  Scenario: user validate the working of google search
    Given user launch the chrome
    And user is on google search
    When user enters text in searchbox
    And user click on log in button
    Then user navigate to serchpage
