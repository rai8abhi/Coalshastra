$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/resources/coalShastra/login.feature");
formatter.feature({
  "name": "feature to test login flow functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Verify if user is able to login",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.step({
  "name": "user enter the \u003cemailId\u003e and \u003cpassword\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "user click on submit button",
  "keyword": "And "
});
formatter.step({
  "name": "user navigate to login page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "emailId",
        "password"
      ]
    },
    {
      "cells": [
        "rai8abhishek@gmail.com",
        "P@ssword001"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verify if user is able to login",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.MyStepdefs.userIsOnLoginPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter the rai8abhishek@gmail.com and P@ssword001",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.MyStepdefs.userEnterTheEmailIdAndPassword(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on submit button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.MyStepdefs.userClickOnSubmitButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigate to login page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.MyStepdefs.userNavigateToLoginPage()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/java/resources/coalShastra/registration.feature");
formatter.feature({
  "name": "This is used to verify registration page",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "All ready registered user should not able to register again with same information",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Login page shown to user",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.RegistrationStepdefs.userIsLoginPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on registration button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.RegistrationStepdefs.userClickOnRegistrationButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter his details on registration process",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.RegistrationStepdefs.userEnterHisDetailsOnRegistrationProcess()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on submit button of registration",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.RegistrationStepdefs.userClickOnSubmitButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should not able to register again",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.RegistrationStepdefs.userShouldNotAbleToRegisterAgain()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});