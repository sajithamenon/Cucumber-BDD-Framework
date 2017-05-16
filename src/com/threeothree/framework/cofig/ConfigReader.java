package com.threeothree.framework.cofig;

import com.threeothree.framework.base.BrowserType;

import java.io.IOException;
import java.util.Properties;

/**
 * Created by Sajitha on 5/3/2017.
 */
public class ConfigReader {
    public static void populateSettings() throws IOException {
        ConfigReader reader=new ConfigReader();
        reader.readProperty();
    }
    private void readProperty() throws IOException {
        Properties p=new Properties();
        p.load(getClass().getResourceAsStream("GlobalConfig.properties"));
Settings.Password=p.getProperty("Password");
        Settings.AUT=p.getProperty("AUT");
        Settings.UserName=p.getProperty("UserName");
        Settings.BrowserType=BrowserType.valueOf(p.getProperty("BrowserType"));
    }

}
