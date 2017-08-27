package com.appium.demo.screens;

import com.appium.demo.base.AppConfig;
import com.appium.demo.base.DriverHelper;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by darjandjamtovski on 1/21/17.
 */
public class BaseScreen {

    protected AppiumDriver driver;
    private AppConfig appConfig;

    public enum SwipeDirection{
        LEFT, RIGHT, TOP, BOTTOM
    }

    public BaseScreen(){
        this.driver = DriverHelper.getDriver();
        this.appConfig = new AppConfig();
    }

    public MobileElement waitForElementPresent(By by){
        WebDriverWait wait = new WebDriverWait(driver, appConfig.getIntegerProperty(AppConfig.PROPERTY_EXPLICIT_WAIT));
        MobileElement element = (MobileElement) wait.until(ExpectedConditions.presenceOfElementLocated(by));

        return element;
    }

    public MobileElement waitForElementPresent(By by, int waitSeconds){
        WebDriverWait wait = new WebDriverWait(driver, waitSeconds);
        MobileElement element = (MobileElement) wait.until(ExpectedConditions.presenceOfElementLocated(by));
        return element;
    }

    public void swipe(By by, SwipeDirection swipeDirection, int endPosition) throws InterruptedException {
        MobileElement element = waitForElementPresent(by);
        int elementX = element.getLocation().x;
        int elementY = element.getLocation().y;
        TouchAction touchAction = new TouchAction(driver);

        switch(swipeDirection){
            case LEFT:
                int xPressed = element.getSize().width - 40;
                int yPressed1 = element.getSize().height / 2;
                touchAction.press(xPressed, yPressed1).moveTo(element, endPosition, yPressed1).perform();
                Thread.sleep(200);
                touchAction.release().perform();
                break;
            case RIGHT:
                touchAction.press(elementX + 20, elementY + 20).moveTo(element, elementX + endPosition, elementY).perform();
                Thread.sleep(200);
                touchAction.release().perform();
                break;
            case TOP:
                int yPressed = element.getSize().height - 40;
                touchAction.press(elementX + 100, yPressed).moveTo(element, elementX, endPosition).perform();
                Thread.sleep(200);
                touchAction.release().perform();
                break;
            case BOTTOM:
                touchAction.press(elementX + 20, elementY + 20).moveTo(element, elementX, elementY + endPosition).perform();
                Thread.sleep(200);
                touchAction.release().perform();
                break;
        }

        Thread.sleep(500);
    }
}
