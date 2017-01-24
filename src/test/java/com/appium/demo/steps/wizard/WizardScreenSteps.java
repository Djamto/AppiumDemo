package com.appium.demo.steps.wizard;

import com.appium.demo.screens.HomeScreen;
import com.appium.demo.screens.wizard.SocialWizard;
import com.appium.demo.screens.wizard.WizardsScreen;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

/**
 * Created by darjandjamtovski on 1/22/17.
 */
public class WizardScreenSteps {

    private HomeScreen homeScreen = new HomeScreen();
    private WizardsScreen wizardsScreen = new WizardsScreen();
    private SocialWizard socialWizard = new SocialWizard();

    @When("^The user has scrolled down the home menu to open the Wizard$")
    public void whenTheUserHasScrolledDownTheHomeMenuToOpenTheWizard() throws InterruptedException {
        homeScreen.scrollDownTheMenu();
    }

    @And("^The user has selected the Wizard option from the menu$")
    public void andTheUserHasSelectedTheWizardOptionFromTheMenu(){
        homeScreen.clickMenuButton(HomeScreen.MENU_WIZARDS);
    }

    @And ("^The user has selected \"(.*)\" from the list$")
    public void andTheUserHasSelectedSocialWizardFromTheList(String listOption) throws InterruptedException {
        wizardsScreen.clickListOption(listOption);
    }

    @And ("^The user has scrolled the wizard to the finish$")
    public void andTheUserHasScrolledTheWizardToTheFinish() throws InterruptedException {
        socialWizard.scrollTheWizardToTheEnd();
    }

    @Then("^Validate the wizard is going to have text Finish at the final slide$")
    public void thenValidateTheWizardIsGoingToHaveTextFinishAtTheFinalSlide(){
        Assert.assertTrue(socialWizard.isFinishTextAvailable());
    }
}
