
## Purpose

The purpose of this demo project is to show the structure of BDD automation tests using Cucumber.
The scenarios which are found into the project are tested on an emulator, and are based for the following application:
https://play.google.com/store/apps/details?id=com.csform.android.uiapptemplate

## Folder structure

test/java/package/base - This folder contains the class for initialization of the driver, and reading the configuration for
the Appium driver stored into the config_app.properties.

test/java/package/screens/ - This folder contains the logic for manipulating the elements on each screen.

test/java/package/steps/ - This folder contains the step definitions of the scenarios defined in the feature file.

test/java/package/RunTest - Runner for the cucumber scenario/s.

test/resources/app - This folder contains the apk required for testing. In this project the application is not included,
you are going to have to download the application from Play Store, and run the scenarios on your device.

test/resources/feature - This folder contains the feature files in which the scenarios are defined.

/test/resources/config_app.properties - This file contains the parameters required for initialization of the driver.
The full list of parameters for the Appium driver can be fond on the following link: http://appium.io/slate/en/master/?java#android-only

## Good luck with your automation testing