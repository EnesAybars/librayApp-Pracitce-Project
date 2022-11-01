
Feature: Login with Parameters

  Background: Assuming user is on the login page
    Given User is on the login page

    Scenario: Login as librarian
      When user enters librarian username <"librarian2@library">
      And user enters librarian password <"eb2VQKEj">
      Then user should land on the dashboard page

    Scenario: Login as student
      When user enters student username <"student2@library">
      And user enters student password <"80qynl9d">
      Then user should land on the books page


    #Task 4:
    Scenario: Login as librarian in the same line
      When user login using <"librarian2@library"> and <"eb2VQKEj">
      Then user should be on the dashboard page
      And There should be <"173"> users
