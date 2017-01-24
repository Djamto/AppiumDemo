package com.appium.demo.steps;

import com.appium.demo.screens.CheckBoxesScreen;
import com.appium.demo.screens.HomeScreen;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

/**
 * Created by darjandjamtovski on 1/22/17.
 */
public class CheckBoxesScreenSteps {

    private HomeScreen homeScreen = new HomeScreen();
    private CheckBoxesScreen checkBoxesScreen = new CheckBoxesScreen();

    @When("^User has chosen option Checkboxes from the menu$")
    public void whenUserHasChosenOptionCheckboxesFromTheMenu(){
        homeScreen.clickMenuButton(HomeScreen.MENU_CHECKBOXES);
    }

    @And("^User has checked the checkbox type$")
    public void andUserHasCheckedTheCheckboxOfType1(){
        checkBoxesScreen.checkCheckboxType1();
    }

    @Then("^Validate the checkbox type is checked$")
    public void thenValidateTheCheckboxOfType1IsChecked(){
        Assert.assertTrue(checkBoxesScreen.isCheckBoxType1Checked());
    }
}
