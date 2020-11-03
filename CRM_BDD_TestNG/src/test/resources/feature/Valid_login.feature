Feature: feature to test  login functionality with valid and invalid credentials

@postive_testing
  Scenario: check login successful with valid credentials
    Given User is in login page
    When user enters username and password
   And clicks on login button
    Then user is navigate to the home page and verify the userid 
    
   
    @negative_testing
     Scenario: check login error with invalid credentials
    Given User is in login page
    When user enters invalid_username and invalid_password
   And clicks on login button
    Then user should get error message
    