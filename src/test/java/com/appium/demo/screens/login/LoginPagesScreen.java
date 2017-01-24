package com.appium.demo.screens.login;

import com.appium.demo.screens.BaseScreen;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created by darjandjamtovski on 1/21/17.
 */
public class LoginPagesScreen extends BaseScreen {

    public LoginPagesScreen() {
    }

    public void clickLoginOption(String loginOption){
        MobileElement element = waitForElementPresent(By.xpath("//android.widget.TextView[@text='"+loginOption+"']"));
        element.click();
    }
}
