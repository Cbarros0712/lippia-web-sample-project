Feature: CP05- I client want to create a new workspace

  Background: Validate login

    Given The user is on home page
    When  The user click on log in button on landing page
    And The user click on log in manually button

  @WorkspaceCreacion @Successfull @Smoke
  Scenario: 1-The User is in page tracker
    When The user set the email "kiru.dengeki@gmail.com"
    When The user  set the password "clavesegura"
    When The user click on log in button
    When The user verify is in the  tracker
    When The user on log in button menu workspace
    When The User on log in button Administrar workspace
    When The User on log in button Crear workspace
    When The User on log in div
    When The User set the name of workspace "Workspace"
    When The User on log in button Crear
    

  @Workspace @Successfull @Smoke
  Scenario: 2-The user is in page tracker
    When The user set the email "kiru.dengeki@gmail.com"
    When The user  set the password "clavesegura"
    When The user click on log in button
    When The user verify is in the  tracker
    When The user on log in button menu workspace
    When The User on log in button Settings workspace
    When The User set the workspace name "1234" in the modification.
    When The User on log in button upgrade
    Then The User modify the workspace
