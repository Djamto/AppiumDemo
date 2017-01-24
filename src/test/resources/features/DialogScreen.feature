Feature: Dialog screen

  @DialogScreen
  Scenario: User has validated the dialog is closed
    When The user has scrolled down the home menu
    And The user has chosen the option Dialogs from the menu
    And The user has chosen the "Shop dialog"
    And The user has clicked the OK button in the dialog
    Then Validate the dialog is closed