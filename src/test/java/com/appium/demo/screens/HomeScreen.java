package com.appium.demo.screens;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

/**
 * Created by darjandjamtovski on 1/21/17.
 */
public class HomeScreen extends BaseScreen{

    public static String MENU_LIST_VIEW = "List Views";
    public static String MENU_PARALLAX = "Parallax";
    public static String MENU_LEFT_MENUS = "Left Menus";
    public static String MENU_LOGIN_PAGES = "Login Pages";
    public static String MENU_IMAGE_GALLERY = "Image Gallery";
    public static String MENU_SHAPE_IMAGE_VIEWS = "Shape Image Views";
    public static String MENU_PROGRESS_BARS = "Progress Bars";
    public static String MENU_CHECKBOXES = "Check Boxes";
    public static String MENU_SPLASH_SCREENS = "Splash Screens";
    public static String MENU_SEARCH_BARS = "Search Bars";
    public static String MENU_TEXT_VIEWS = "Text Views";
    public static String MENU_DIALOGS = "Dialogs";
    public static String MENU_TABS = "Tabs";
    public static String MENU_WIZARDS = "Wizards";

    public HomeScreen() {
        super();
    }

    public void clickMenuButton(String menuTitle){
        MobileElement loginPagesButton = waitForElementPresent(By.xpath("//android.widget.ListView//android.widget.TextView[@text='"+menuTitle+"']"));
        loginPagesButton.click();
    }

    public void scrollDownTheMenu() throws InterruptedException {
        swipe(By.xpath("//android.widget.ListView"), SwipeDirection.TOP, 50);
    }
}
