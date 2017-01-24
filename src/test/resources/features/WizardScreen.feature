Feature: Wizard screen

  @WizardScreen
  Scenario: User has validated the flow of the wizard
    When The user has scrolled down the home menu to open the Wizard
    And The user has selected the Wizard option from the menu
    And The user has selected "Social wizard" from the list
    And The user has scrolled the wizard to the finish
    Then Validate the wizard is going to have text Finish at the final slide