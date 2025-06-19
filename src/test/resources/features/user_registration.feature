Feature: User Registration

#  Describe the user registration functionality of a web application.
#  Your scenario should:
#  • Represent a successful registration.
#  • Use a data table to input user information (e.g., name, email, password).
#  • Include realistic steps for form submission.
#  • Demonstrate at least one expected outcome using Then.
#  • Include additional validations using And.

  Background:
    Given the user is on the registration page

  Scenario Outline: the user successfully registers

    When the user fills the registration form by inputing valid <name> , <email> and <password>:
    And the user clicks the submit button
    Then the user will successfully create an account
    And see the "registration successful" message

    Examples:
      | name  | email                 | password     |
      | Shani | shani.email@email.com | password1234 |

