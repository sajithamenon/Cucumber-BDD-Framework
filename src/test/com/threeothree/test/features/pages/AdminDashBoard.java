package com.threeothree.test.features.pages;


import com.threeothree.framework.base.BasePage;
import com.threeothree.framework.base.DriverContext;
import com.threeothree.framework.cofig.Settings;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import static com.threeothree.framework.base.Base.CurrentPage;

/**
 * Created by Sajitha on 4/24/2017.
 */
public  class AdminDashBoard extends BasePage {
    public AdminDashBoard() {
    }
    @FindBy(how = How.LINK_TEXT,using ="Users" )
    public WebElement users;
    @FindBy(how = How.LINK_TEXT,using ="Control States" )
    public WebElement controlStates;
    @FindBy(how = How.LINK_TEXT,using ="Vendors" )
    public WebElement vendors;
    @FindBy(how = How.LINK_TEXT,using ="Product Vendor of Record Change" )
    public WebElement prdtVORC;
    @FindBy(how = How.ID,using ="search_mode" )
    public WebElement search;
    public void isUsersPresent(){
        users.isDisplayed();
    }


public void pageTitle(){
   System.out.print( DriverContext.Driver.getTitle());
}
}
