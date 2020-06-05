Feature: This is used to verify registration page

  Scenario: All ready registered user should not able to register again with same information
    Given Login page shown to user
    And user click on registration button
    And user enter his details on registration process
    When user click on submit button of registration
    Then user should not able to register again
