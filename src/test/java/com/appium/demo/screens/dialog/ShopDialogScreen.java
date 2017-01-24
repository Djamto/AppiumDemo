package com.appium.demo.screens.dialog;

import com.appium.demo.screens.BaseScreen;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

/**
 * Created by darjandjamtovski on 1/22/17.
 */
public class ShopDialogScreen extends BaseScreen {

    public void clickTheDialogOkButton(){
        MobileElement element = waitForElementPresent(By.xpath("//android.widget.TextView[@text='OK']"), 2);
        element.click();
    }

    public boolean isTheDialogClosed(){
        try{
            waitForElementPresent(By.xpath("//android.widget.TextView[@text='OK']"), 2);
            return false;
        }catch (Exception e){
            return true;
        }
    }
}
