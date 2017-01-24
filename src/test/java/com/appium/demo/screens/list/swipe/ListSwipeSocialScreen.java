package com.appium.demo.screens.list.swipe;

import com.appium.demo.screens.BaseScreen;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

/**
 * Created by darjandjamtovski on 1/21/17.
 */
public class ListSwipeSocialScreen extends BaseScreen{

    public void swipeElement() throws InterruptedException {
        MobileElement element = waitForElementPresent(By.xpath("//android.widget.ListView/android.widget.FrameLayout[1]"));
        swipe(By.xpath("//android.widget.ListView/android.widget.FrameLayout[1]"), SwipeDirection.RIGHT, 50);
    }

    public boolean isUndoButtonPresent(){
        try{
            waitForElementPresent(By.xpath("//android.widget.ListView[1]//android.widget.TextView[@text='Seen!']"), 3);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
