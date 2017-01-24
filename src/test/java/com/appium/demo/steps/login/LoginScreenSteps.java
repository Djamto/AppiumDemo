package com.appium.demo.steps.login;

import com.appium.demo.screens.HomeScreen;
import com.appium.demo.screens.login.LoginLightScreen;
import com.appium.demo.screens.login.LoginPagesScreen;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

/**
 * Created by darjandjamtovski on 1/21/17.
 */
public class LoginScreenSteps {

    private HomeScreen homeScreen = new HomeScreen();
    private LoginPagesScreen loginPagesScreen = new LoginPagesScreen();
    private LoginLightScreen loginLightScreen = new LoginLightScreen();

    @When("^The user has clicked the menu button Login Pages$")
    public void whenTheUserHasClickedTheMenuButtonLoginPages(){
        homeScreen.clickMenuButton(HomeScreen.MENU_LOGIN_PAGES);
    }

    @And("^The user has chosen the option \"(.*)\" from List$")
    public void andTheUserHasChosenTheOptionFromList(String loginOption){
        loginPagesScreen.clickLoginOption(loginOption);
    }

    @Then("^Validate the Light Login screen is opened$")
    public void thenValidateTheLightLoginScreenIsOpened() throws InterruptedException {
        Assert.assertTrue(loginLightScreen.isLoginButtonPresent());
    }
}
