package com.appium.demo.screens.list;

import com.appium.demo.screens.BaseScreen;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

/**
 * Created by darjandjamtovski on 1/21/17.
 */
public class ListViewsScreen extends BaseScreen{

    public void clickListOption(String listOption){
        MobileElement element = waitForElementPresent(By.xpath("//android.widget.ListView//android.widget.TextView[@text='"+listOption+"']"));
        element.click();
    }
}
