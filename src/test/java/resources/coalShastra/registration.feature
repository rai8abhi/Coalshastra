Feature: This is used to verify registration page

  Scenario: All ready registered user should not able to register again with same information
    Given user is on login page
    And user click on registration button
    And user enter his details on registration process
    When user click on submit button
    Then user should not able to register again
