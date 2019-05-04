@tag
Feature: Login validation

  @tag1
  Scenario Outline: To validate login functionality
    Given the user in fb page
    When the user enter credentials "<userid>" , "<password>"
    Then the user prompts to fb page

    Examples: 
      | userid | password  |
      | user1  | password1 |
      | user2  | password2 |
