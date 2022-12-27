@login
Feature: Users should be able to login

  @wip
  Scenario: Login with valid credentials
    Given the user is on the login page
    When the user enters the valid credentials
    Then the user should be able to login


