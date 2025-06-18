Feature: Login Functionality

#  Write a Scenario Outline that:
#  o Simulates a user trying to log in with different combinations of username and password.
#  o Assumes the user is already on the login page.

  Background:
    Given the user is on the login page

  Scenario Outline: the user enters different combinations of username and password

    When the user enters different combinations of invalid <username> and/or <password>
    And the user clicks the submit button
    Then the user will not be able to login
    And see a login error message

    Examples:
      | username  | password    |
      | invalid1  | wrongPass   |
      | validUser | wrongPass   |
      | invalid2  | correctPass |





