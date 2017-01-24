package com.appium.demo;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "json:cucumber.json",
        features = {
                "src/test/resources/features/HomeScreen.feature",
                "src/test/resources/features/LoginScreen.feature",
                "src/test/resources/features/ListViewsScreen.feature",
                "src/test/resources/features/CheckBoxesScreen.feature",
                "src/test/resources/features/DialogScreen.feature",
                "src/test/resources/features/WizardScreen.feature"
        },
        glue = {"com.appium.demo.steps", "com.appium.demo.base"},
        tags = {"@WizardScreen"}
)
public class RunTest {

}
