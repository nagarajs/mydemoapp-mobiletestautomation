
Feature: Login of DemoApp

  @done
  Scenario: Login Success
    Given the customer is navigated to Login Screen
    When the customer enter the username as bob@example.com and password as 10203040
    Then the customer must be logged in successfully

  @done
  Scenario: Unsuccessful Login
    Given the customer is navigated to Login Screen
    When the customer enter the username as alice@example.com and password as 10203040
    Then the customer gets an login error message






