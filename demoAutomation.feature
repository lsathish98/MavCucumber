@tag
Feature: To test Demo Automation Registration functionality

  @tag2
  Scenario Outline: To verify the Demo Automation Registration functionality
    Given The user is in Demo Automation page
    When The user enter the appropriate fields "<First Name>", "<SurName>", "<Email Address>", "<Remail>", "<New Password>", "<BDate>", "<BMonth>", "<BYear>"
    Then The user must be able to Register successfully

    Examples: 
      | First Name    | SurName    | Email Address    | Remail           | New Password | BDate | BMonth | BYear |
      | Sathish Kumar | Loganathan | sathishl98@aa.in | sathishl98@aa.in | Errs         |    20 | Jul    |  1992 |
      | Sai           | Loganathan | sathishl98@aa.in | sathishl98@aa.in | Errs         |    20 | Jul    |  1992 |
