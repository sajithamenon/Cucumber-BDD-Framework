package com.threeothree.test.steps;

import com.threeothree.framework.base.DriverContext;
import com.threeothree.framework.base.FrameworkInitialise;
import com.threeothree.framework.cofig.ConfigReader;
import com.threeothree.framework.cofig.Settings;
import cucumber.api.java.After;
import cucumber.api.java.Before;


import java.io.IOException;

/**
 * Created by Sajitha on 5/4/2017.
 */
public class Testinitialise extends FrameworkInitialise {
    @Before
    /*Incase of Database tersting
    String connectionUrl="jdbc:mysql://173.193.155.250:3306/finantialplanner";
    String UserName=
    String Password=
    * Connection conn=DatabaseUtil.open(connectionUrl,UserName,Password);
    * DatabaseUtil.executeQuery("SELECT * FROM Employees",conn)*/


    public void openBrowser() throws IOException {
        //initialise Config
        ConfigReader.populateSettings();
        initializeBrowser(Settings.BrowserType);
        DriverContext.Browser.goToUrl(Settings.AUT);

    }

  /*  @After
    public void closeBrowser() {
        DriverContext.Driver.close();
        DriverContext.Driver.quit();
    }*/
}

