@TimeTracker

Feature: CP06- I client want valid Time Tracker

  Background: Validate Time Tracker

    Given The user is on home page
    When  The user click on log in button on landing page
    And The user click on log in manually button



  @Smoke@TimeTrackerSuccessful
  Scenario Outline: 1-Valid Time Tracker
     When The user set  the  "<email>" and  "<password>"
     When  The user click on log in button
     When The user click on Time Tracker



     Examples:
       | email			      | password				|
       |kiru.dengeki@gmail.com| clavesegura				|
