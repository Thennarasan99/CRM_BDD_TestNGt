Feature: feature to test add contacts functionality

  @Addcontacts
  Scenario: check add contacts functionality
    Given User is on homepage
    When user clicks on add contact button
    And user fill-up the page with valid deatils 
    Then click save button

  @check_saved_contacts
  Scenario: check Existing contacts functionality
    Given User is on homepage
    When user clicks on add contact button
    Then user should verify saved contact details in my contacs page
