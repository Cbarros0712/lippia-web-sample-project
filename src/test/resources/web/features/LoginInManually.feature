@LoginIn
Feature: CP01- Login in Clockify

  Background: Validate login valid and invalid

    Given The user is on home page
    When  The user click on log in button on landing page
    And The user click on log in manually button

  @Smoke @LoginInSuccessful
  Scenario: 1-Manual user login successful
    When The user set the email "kiru.dengeki@gmail.com"
    When The user  set the password "clavesegura"
    When The user click on log in button
    Then The user verify is in the  tracker

  @Smoke @LoginInInvalid
  Scenario Outline: 2- Login fallido
    When The user set  the  "<email>" and  "<password>"
    When  The user click on log in button
    Then The user should be able to see message error

    Examples:
      | email			    | password				|
      |pepemontoya@gmail.com| xxxxx					|
      |asdasdads@hotmial.com| asasas				|

  @Smoke @PasswordRequered
  Scenario Outline: 2- Password Requered
    When The user set  the  "<email>"
    When  The user click on log in button
    Then The user should be able to see message error password is requered

    Examples:
      | email			             |
      |claudia.a.barros1408@gmail.com|

