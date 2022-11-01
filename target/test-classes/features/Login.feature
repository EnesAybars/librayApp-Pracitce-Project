
Feature: Librarian App login feature
  User Story:
  As a user, I should be able to login with correct credentials to different accounts

  Background: Assuming user is on the login page
    Given User is on the login page

  @employee
  Scenario: Login as librarian
      When user enters librarian username
      And user enters librarian password
      Then user should land on the dashboard page


  Scenario: Login as student
    When user enters student username
    And user enters student password
    Then user should land on the books page

