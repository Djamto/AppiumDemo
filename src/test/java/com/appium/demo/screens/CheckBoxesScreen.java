package com.appium.demo.screens;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

/**
 * Created by darjandjamtovski on 1/22/17.
 */
public class CheckBoxesScreen extends BaseScreen {

    public void checkCheckboxType1(){
        MobileElement element = waitForElementPresent(MobileBy.AndroidUIAutomator("new UiSelector().text(\"SMS notification\")"));
        element.click();
    }

    public boolean isCheckBoxType1Checked(){
        MobileElement element = waitForElementPresent(MobileBy.AndroidUIAutomator("new UiSelector().text(\"SMS notification\")"));
        boolean isChecked = Boolean.parseBoolean(element.getAttribute("checked"));

        return isChecked;
    }
}
