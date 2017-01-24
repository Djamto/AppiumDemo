package com.appium.demo.screens.login;

import com.appium.demo.screens.BaseScreen;
import org.openqa.selenium.By;

/**
 * Created by darjandjamtovski on 1/21/17.
 */
public class LoginLightScreen extends BaseScreen {

    public boolean isLoginButtonPresent(){
        try{
            waitForElementPresent(By.xpath("//android.widget.TextView[@text='LOGIN']"));
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
