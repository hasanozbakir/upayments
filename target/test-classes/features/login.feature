@login
Feature: Users should be able to login

  @wip
  Scenario: Login with valid credentials
    Given the user is on the login page
    When the user enters the valid credentials
    Then the user should be able to login

  Scenario: Login with wrong password
    Given the user is on the login page
    When the user enters the valid username and "wrongpassword"
    Then the user shouldn't be able to login

  Scenario: Login with wrong username
    Given the user is on the login page
    When the user enters the valid password and "wrongusername"
    Then the user shouldn't be able to login


