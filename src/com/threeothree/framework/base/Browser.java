package com.threeothree.framework.base;

import org.openqa.selenium.WebDriver;

/**
 * Created by Sajitha on 4/27/2017.
 */
public class Browser extends  Base {
    private WebDriver _driver;

    public Browser(WebDriver driver) {
       _driver = driver;
    }

   // public BrowserType Type;

    public void goToUrl(String url) {
        _driver.get(url);
    }
    public void maximize(){
        _driver.manage().window().maximize();

    }

}


