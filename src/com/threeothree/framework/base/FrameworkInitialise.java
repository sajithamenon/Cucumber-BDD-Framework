package com.threeothree.framework.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import static com.threeothree.framework.base.BrowserType.Chrome;
import static com.threeothree.framework.base.BrowserType.Safari;

/**
 * Created by Sajitha on 4/21/2017.
 */
public class FrameworkInitialise extends Base {
    public  void initializeBrowser(BrowserType browserType) {
    WebDriver driver=null;

        switch (browserType) {
            case Chrome: {
                System.setProperty("webdriver.chrome.driver",(""));
                driver = new ChromeDriver();
                break;
            }
            case Firefox: {
                driver = new FirefoxDriver();
                break;

            }

            case IE: {
                System.setProperty("webdriver.ie.driver",(""));
                driver=new InternetExplorerDriver();
                break;
            }
            case Safari: {
                break;
            }
        }
        //Set the Driver
        DriverContext.setDriver(driver);
        //Browser
        DriverContext.Browser=new Browser(driver);
    }

}
