$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/user/eclipse-workspace/FaceBook/src/main/java/Features/login.feature");
formatter.feature({
  "line": 1,
  "name": "Facebook login  Action Feature",
  "description": "",
  "id": "facebook-login--action-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Facebook login Test Scenario",
  "description": "",
  "id": "facebook-login--action-feature;facebook-login-test-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "user should enter the url",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "title of the page is facebook",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "user should enter email and password",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "user should click on login button",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginstepDefinition.user_present_on_login_page()"
});
formatter.result({
  "duration": 13777009500,
  "status": "passed"
});
formatter.match({
  "location": "LoginstepDefinition.title_of_the_page_is_facebook()"
});
formatter.result({
  "duration": 2011788300,
  "status": "passed"
});
formatter.match({
  "location": "LoginstepDefinition.user_should_enter_email_and_password()"
});
formatter.result({
  "duration": 2384658200,
  "status": "passed"
});
formatter.match({
  "location": "LoginstepDefinition.user_should_click_on_login_button()"
});
formatter.result({
  "duration": 2148626700,
  "status": "passed"
});
});