$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/CRM_BDD_TestNG/src/test/resources/feature/Add_contacts.feature");
formatter.feature({
  "name": "feature to test add contacts functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "check add contacts functionality",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Addcontacts"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "Crm_addcontacts_automation.user_is_on_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on add contact button",
  "keyword": "When "
});
formatter.match({
  "location": "Crm_addcontacts_automation.user_clicks_on_add_contact_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user fill-up the page with valid deatils",
  "keyword": "And "
});
formatter.match({
  "location": "Crm_addcontacts_automation.user_fill_up_with_valid_deatils_and_click_save_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click save button",
  "keyword": "Then "
});
formatter.match({
  "location": "Crm_addcontacts_automation.click_save_button()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "check Existing contacts functionality",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@check_saved_contacts"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "Crm_addcontacts_automation.user_is_on_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on add contact button",
  "keyword": "When "
});
formatter.match({
  "location": "Crm_addcontacts_automation.user_clicks_on_add_contact_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should verify saved contact details in my contacs page",
  "keyword": "Then "
});
formatter.match({
  "location": "Crm_addcontacts_automation.user_should_see_saved_contact_details_in_my_contacs_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("D:/CRM_BDD_TestNG/src/test/resources/feature/Valid_login.feature");
formatter.feature({
  "name": "feature to test  login functionality with valid and invalid credentials",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "check login successful with valid credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@postive_testing"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is in login page",
  "keyword": "Given "
});
formatter.match({
  "location": "Crm_login_automation.user_is_in_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters username and password",
  "keyword": "When "
});
formatter.match({
  "location": "Crm_login_automation.user_enters_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on login button",
  "keyword": "And "
});
formatter.match({
  "location": "Crm_login_automation.clicks_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is navigate to the home page and verify the userid",
  "keyword": "Then "
});
formatter.match({
  "location": "Crm_login_automation.user_is_navigate_to_the_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "check login error with invalid credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@negative_testing"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is in login page",
  "keyword": "Given "
});
formatter.match({
  "location": "Crm_login_automation.user_is_in_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters invalid_username and invalid_password",
  "keyword": "When "
});
formatter.match({
  "location": "Crm_login_automation.user_enters_invalid_username_and_invalid_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on login button",
  "keyword": "And "
});
formatter.match({
  "location": "Crm_login_automation.clicks_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should get error message",
  "keyword": "Then "
});
formatter.match({
  "location": "Crm_login_automation.user_should_get_error_message()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});