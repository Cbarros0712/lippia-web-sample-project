@Project
Feature: CP04- New Project

  Background: Create new project

    Given The user is on home page
    When  The user click on log in button on landing page
    And The user click on log in manually button

  @Smoke @ProjectoSuccessful
  Scenario: 1-Create New Project
    When The user set the email "kiru.dengeki@gmail.com"
    When The user  set the password "clavesegura"
    When The user click on log in button
    When The user click on Project option
    When The user click on Create New Project
    When The user set the name of project "Project"
    When The user on log in button Create
    Then The user sees a successful message