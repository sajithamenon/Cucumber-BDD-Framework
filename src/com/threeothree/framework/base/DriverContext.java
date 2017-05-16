package com.threeothree.framework.base;

import org.openqa.selenium.WebDriver;

/**
 * Created by Sajitha on 4/21/2017.
 */
public class DriverContext {
    public static WebDriver Driver;
    public static Browser Browser;

    public static void setDriver(WebDriver driver) {
        Driver = driver;
    }
}
