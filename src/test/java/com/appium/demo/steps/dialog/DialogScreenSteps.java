package com.appium.demo.steps.dialog;

import com.appium.demo.screens.HomeScreen;
import com.appium.demo.screens.dialog.DialogsScreen;
import com.appium.demo.screens.dialog.ShopDialogScreen;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

/**
 * Created by darjandjamtovski on 1/22/17.
 */
public class DialogScreenSteps {

    private HomeScreen homeScreen = new HomeScreen();
    private DialogsScreen dialogsScreen = new DialogsScreen();
    private ShopDialogScreen shopDialogScreen = new ShopDialogScreen();

    @When("^The user has scrolled down the home menu$")
    public void whenTheUserHasScrolledDownTheHomeMenu() throws InterruptedException{
        homeScreen.scrollDownTheMenu();
    }

    @And("^The user has chosen the option Dialogs from the menu$")
    public void andTheUserHasChosenTheOptionDialogsFromThemenu(){
        homeScreen.clickMenuButton(HomeScreen.MENU_DIALOGS);
    }

    @And ("^The user has chosen the \"(.*)\"$")
    public void andTheUserHasChosenTheShopDialog(String listOption) throws InterruptedException {
        dialogsScreen.clickListOption(listOption);
    }

    @And ("^The user has clicked the OK button in the dialog$")
    public void andTheUserHasClickedTheOkButtonInTheDialog(){
        shopDialogScreen.clickTheDialogOkButton();
    }

    @Then("^Validate the dialog is closed$")
    public void thenValidateTheDialogIsClosed(){
        Assert.assertTrue(shopDialogScreen.isTheDialogClosed());
    }
}
