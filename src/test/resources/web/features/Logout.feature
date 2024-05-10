@Loginout
Feature: CP03- Logout in Clockify

  Background: Validate logout

    Given The user is on home page
    When  The user click on log in button on landing page
    And The user click on log in manually button

  @Smoke @LoginInSuccessful
  Scenario: 1-Logout successful
    When The user set the email "kiru.dengeki@gmail.com"
    When The user  set the password "clavesegura"
    When The user click on log in button
    When The user verify is in the  tracker
    When The user click on log out in button
    When The user select log out
    Then The user click on log out