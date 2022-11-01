@wip
Feature: Login with different Users TASK #6
  As a user, I should be able to login with different users using their
  correct emails and passwords. When I login, I should be able to
  see username in the account username section.

  Scenario Outline: Verify user information <email>
    Given user is on the login page
    When user is login using "<email>" and "<password>"
    Then account holder name should be "<name>"

    @students
    Examples:
      | email             | password | name            |
      | student1@library  | i2A9TgXa | Test Student 1  |
      | student2@library  | 80qynl9d | Test Student 2  |
      | student3@library  | 1f3ZGRGj | Test Student 3  |
      | student4@library  | 1AHF6MHk | Test Student 4  |
      | student5@library  | uElqihO2 | Test Student 5  |
      | student6@library  | P2OEdBiW | Test Student 6  |
      | student7@library  | YKMPKm0L | Test Student 7  |
      | student8@library  | UFAgfoZK | Test Student 8  |
      | student9@library  | 5RHpP7ry | Test Student 9  |
      | student10@library | KmmX2MjV | Test Student 10 |


    @librarian
    Examples:
      | email               | password | name              |
      | librarian1@library  | rs4BNN9G | Test Librarian 1  |
      | librarian2@library  | eb2VQKEj | Test Librarian 2  |
      | librarian3@library  | I6JMMwLb | Test Librarian 3  |
      | librarian4@library  | 7jrGZdaV | Test Librarian 4  |
      | librarian5@library  | 4p4ewVgW | Test Librarian 5  |
      | librarian6@library  | n6Pt4ocG | Test Librarian 6  |
      | librarian7@library  | OEeZbJjV | Test Librarian 7  |
      | librarian8@library  | FE7aFu6s | Test Librarian 8  |
      | librarian9@library  | NEoroTSN | Test Librarian 9  |
      | librarian10@library | Dltvxmpn | Test Librarian 10 |












