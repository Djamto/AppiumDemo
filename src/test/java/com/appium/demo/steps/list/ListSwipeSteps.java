package com.appium.demo.steps.list;

import com.appium.demo.screens.HomeScreen;
import com.appium.demo.screens.list.ListViewsScreen;
import com.appium.demo.screens.list.swipe.ListSwipeScreen;
import com.appium.demo.screens.list.swipe.ListSwipeSocialScreen;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

/**
 * Created by darjandjamtovski on 1/21/17.
 */
public class ListSwipeSteps {

    private HomeScreen homeScreen = new HomeScreen();
    private ListViewsScreen listViewsScreen = new ListViewsScreen();
    private ListSwipeScreen listSwipeScreen = new ListSwipeScreen();
    private ListSwipeSocialScreen listSwipeSocialScreen = new ListSwipeSocialScreen();

    @When("^User has chosen the option ListViews from the home menu$")
    public void whenUserHasChosenTheOptionListViewsFromTheHomeMenu(){
        homeScreen.clickMenuButton(HomeScreen.MENU_LIST_VIEW);
    }

    @And("^The user has chosen the list \"(.*)\" option$")
    public void andTheUserHasChosenTheListOption(String option){
        listViewsScreen.clickListOption(option);
    }

    @And ("^The user has chosen option \"(.*)\" from the Swipe-to-dismiss screen$")
    public void andTheUserHasChosenOptionFromTheSwipeToDismissScreen(String option){
        listSwipeScreen.clickListOption(option);
    }

    @And ("^The user has swiped the user with tag \"(.*)\"$")
    public void andTheUserHasSwipedTheuserWithTag(String tag) throws InterruptedException {
        listSwipeSocialScreen.swipeElement();
    }

    @Then("^Validate the Swipe undo button is displayed$")
    public void thenValidateTheSwipeUndoButtonIsDisplayed() {
        Assert.assertTrue(listSwipeSocialScreen.isUndoButtonPresent());
    }
}
