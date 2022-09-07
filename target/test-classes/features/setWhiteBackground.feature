
Feature: setting white background functionality

@Scenario2
  Scenario: Verifying white color background functionality
    Given user is on techfios project page
    When "Set SkyWhite Background" button found
    And user clicks on that button
    Then background color changes to white
