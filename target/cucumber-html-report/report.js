$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/resources/coalShastra/registration.feature");
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