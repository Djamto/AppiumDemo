Feature: Checkboxes Screen

  @CheckBoxesScreen
  Scenario: User has validated checkbox type
    When User has chosen option Checkboxes from the menu
    And User has checked the checkbox type
    Then Validate the checkbox type is checked