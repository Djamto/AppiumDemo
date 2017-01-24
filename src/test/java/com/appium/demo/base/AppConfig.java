package com.appium.demo.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by darjandjamtovski on 1/22/17.
 */
public class AppConfig {

    public static final String PROPERTY_EXPLICIT_WAIT = "explicit.wait";
    public static final String PROPERTY_APPLICATION_PATH = "application.path";
    public static final String PROPERTY_PACKAGE_NAME = "base.pkg";
    public static final String PROPERTY_APPIUM_SERVER_PORT = "appium.server.port";
    public static final String PROPERTY_APPLICATION_ACTIVITY = "application.activity";
    public static final String PROPERTY_AUTOMATION_INSTRUMENTATION = "automation.instrumentation";
    public static final String PROPERTY_BROWSER_NAME = "browser.name";
    public static final String PROPERTY_PLATFORM_NAME = "platform.name";
    public static final String PROPERTY_DEVICE_NAME = "device.name";
    public static final String PROPERTY_PLATFORM_VERSION = "platform.version";

    public int getIntegerProperty(String propertyKey){
        return Integer.parseInt(getProperty(propertyKey));
    }

    public String getProperty(String propertyKey){
        Properties properties = new Properties();
        InputStream inputStream = null;
        String result = null;

        try{
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource("config_app.properties").getFile());

            inputStream = new FileInputStream(file);
            properties.load(inputStream);
            result = properties.getProperty(propertyKey);
        }catch (IOException e){
            return null;
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return result;
    }
}
