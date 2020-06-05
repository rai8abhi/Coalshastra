Feature: feature to test login flow functionality

  Scenario Outline: Verify if user is able to login
    Given user is on login page
    When user enter the <emailId> and <password>
    And user click on submit button
    Then user navigate to login button
    Examples:
      | emailId                | password    |
      | rai8abhishek@gmail.com | P@ssword001 |

  Scenario Outline: Verify that user should not be able to login, if password field is black
    Given user is on login page
    When user enter the <emailId> and <password>
    And user click on submit button
    Then user should not navigate to login button
    Examples:
      | emailId                | password    |
      | rai8abhishek@gmail.com |             |
      |                        | Password001 |
