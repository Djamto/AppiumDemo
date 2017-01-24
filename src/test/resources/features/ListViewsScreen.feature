Feature: List Views feature

  @ListViewsScreen
  Scenario: User has swiped Social account
    When User has chosen the option ListViews from the home menu
    And The user has chosen the list "Swipe-to-dissmiss" option
    And The user has chosen option "Social" from the Swipe-to-dismiss screen
    And The user has swiped the user with tag "@Monument walk tour"
    Then Validate the Swipe undo button is displayed