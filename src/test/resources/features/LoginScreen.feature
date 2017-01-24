Feature: Login Screen

  @LoginScreen
  Scenario: Open the light login screen
    When The user has clicked the menu button Login Pages
    And The user has chosen the option "Light" from List
    Then Validate the Light Login screen is opened