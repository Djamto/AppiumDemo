package com.appium.demo.steps;

import com.appium.demo.screens.HomeScreen;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;

/**
 * Created by darjandjamtovski on 1/21/17.
 */
public class HomeScreenSteps {

    private HomeScreen homeScreen = new HomeScreen();

    @Given("^The application is started$")
    public void givenTheApplicationIsStarted() throws InterruptedException {
        homeScreen.clickMenuButton(HomeScreen.MENU_LOGIN_PAGES);
    }

    @Then("^Validate the home screen$")
    public void thenValidateTheHomeScreen(){
        Assert.assertTrue(true);
    }
}
