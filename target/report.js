$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Feature/login.feature");
formatter.feature({
  "name": "To validate Login functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To validate login with invalid username and valid password",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "To launch the browser and max the window",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.to_launch_the_browser_and_max_the_window()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To launch the url of the given application",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.to_launch_the_url_of_the_given_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass the invalid username in email field",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.to_pass_the_invalid_username_in_email_field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass the valid passowrd in password field",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.to_pass_the_valid_passowrd_in_password_field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.to_click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.to_close_the_browser()"
});
formatter.result({
  "status": "passed"
});
});