Feature: Login Page

  Background:
    Given the user is on the login page

    #    Scenario outline will run through each row of the examples table
  Scenario Outline: Login with invalid credentials

    When the user enters invalid <user name> and <password> # use <> to create linked words to examples
    And the user clicks the login button
    Then the user should not be logged in successfully and recieves an error message

    Examples:
      | user name | password      |
      | shanim    | wrongpassword |
      | mercator  | rotacem       |

