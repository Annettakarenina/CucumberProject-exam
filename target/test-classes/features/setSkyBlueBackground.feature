Feature: setting sky blue background functionality

  @Scenario1
  Scenario: Verify sky blue background button functionality
    Given user is on techfios project page
    And "Set SkyBlue Background" button exists
    When user clicks on the button
    Then  the background color will change to sky blue

