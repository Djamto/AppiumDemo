package com.appium.demo.screens;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

/**
 * Created by darjandjamtovski on 1/22/17.
 */
public class CheckBoxesScreen extends BaseScreen {

    public void checkCheckboxType1(){
        MobileElement element = waitForElementPresent(By.xpath("//android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]"));
        element.click();
    }

    public boolean isCheckBoxType1Checked(){
        MobileElement element = waitForElementPresent(By.xpath("//android.widget.ScrollView//android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.CheckBox[1]"));
        boolean isChecked = Boolean.parseBoolean(element.getAttribute("checked"));

        return isChecked;
    }
}
