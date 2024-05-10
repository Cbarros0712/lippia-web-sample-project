@LoginInWithEmail
Feature: CP02- Login  Continue With Email Clockify

  Background: Validate login valid and invalid and Continue With Email

    Given The user is on home page
    When  The user click on log in button on landing page

  @Smoke @LoginContinueWithEmail
  Scenario: 1-Continue With Email user login
    When The user set the email "claudia.a.barros1408@gmail.com"
    When The user click on log in button Continue With Email
    Then The user verify see mensagge code

  @Smoke @LoginContinueWithEmailInvalid
  Scenario Outline: 2- Continue WithE mail user login invalid
    When The user set  the  "<email>"
    When  The user click on log in button Continue With Email
    Then The user should be able to see message invalid

    Examples:
      | email	  |
      |pepemonto@ |
      |clau@      |
