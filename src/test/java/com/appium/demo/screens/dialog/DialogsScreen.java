package com.appium.demo.screens.dialog;

import com.appium.demo.screens.BaseScreen;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

/**
 * Created by darjandjamtovski on 1/22/17.
 */
public class DialogsScreen extends BaseScreen {

    public void clickListOption(String listOption) throws InterruptedException {
        Thread.sleep(500);
        MobileElement element = waitForElementPresent(By.xpath("//android.widget.ListView//android.widget.TextView[@text='"+listOption+"']"));
        element.click();
    }
}
