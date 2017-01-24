package com.appium.demo.base;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by darjandjamtovski on 1/21/17.
 */
public class DriverHelper {

    private AppConfig appConfig;
    private static AppiumDriver driver;
    private URL serverUrl;
    private DesiredCapabilities capabilities;

    @Before
    public void initDriver() throws MalformedURLException {
        appConfig = new AppConfig();
        capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, appConfig.getProperty(AppConfig.PROPERTY_BROWSER_NAME));
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, appConfig.getProperty(AppConfig.PROPERTY_PLATFORM_VERSION));
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, appConfig.getProperty(AppConfig.PROPERTY_PLATFORM_NAME));
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, appConfig.getProperty(AppConfig.PROPERTY_DEVICE_NAME));
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, appConfig.getProperty(AppConfig.PROPERTY_AUTOMATION_INSTRUMENTATION));
        capabilities.setCapability("appPackage", appConfig.getProperty(AppConfig.PROPERTY_PACKAGE_NAME));
        capabilities.setCapability("appActivity", appConfig.getProperty(AppConfig.PROPERTY_APPLICATION_ACTIVITY));
        //capabilities.setCapability(MobileCapabilityType.APP, new File(ClassLoader.getSystemResource(appConfig.getProperty(AppConfig.PROPERTY_APPLICATION_PATH))
        //        .getFile()).getAbsolutePath());
        serverUrl = new URL("http://localhost:" + appConfig.getProperty(AppConfig.PROPERTY_APPIUM_SERVER_PORT) + "/wd/hub");
        driver = new AndroidDriver(serverUrl, capabilities);
    }

    @After
    public void destroyDriver(){
        driver.quit();
    }

    public static AppiumDriver<? extends MobileElement> getDriver(){
        return driver;
    }
}
