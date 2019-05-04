@tag
Feature: Flipkart validation

  @tag1
  Scenario: Flipkart login page validation
    Given the user is in Flipkart page
    When the user enter below credentials
      | lsathish@gmail.com | 2109error |
    Then the user must prompt to home page
