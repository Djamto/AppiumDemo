package com.appium.demo.screens.wizard;

import com.appium.demo.screens.BaseScreen;
import org.openqa.selenium.By;

/**
 * Created by darjandjamtovski on 1/22/17.
 */
public class SocialWizard extends BaseScreen{

    public void scrollTheWizardToTheEnd() throws InterruptedException {
        for(int i = 1; i <= 2; i++){
            swipe(By.xpath("//android.support.v4.view.ViewPager"), SwipeDirection.LEFT, 50);
            Thread.sleep(500);
        }
    }

    public boolean isFinishTextAvailable(){
        try{
            waitForElementPresent(By.xpath("//android.widget.TextView[@text='Finish']"), 2);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
