package com.threeothree.test.features.pages;

import com.threeothree.framework.base.Base;
import com.threeothree.framework.base.BasePage;
import com.threeothree.framework.base.DriverContext;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
//import static com.threeothree.framework.base.Base.CurrentPage;

/**
 * Created by Sajitha on 4/24/2017.
 */
public  class LoginPage extends BasePage {
    public LoginPage() {


    }


    @FindBy(how = How.ID, using = "username")
    public static WebElement txtUsernames;
    @FindBy(how = How.ID, using = "password")
    public static WebElement txtPassword;
    @FindBy(how = How.CLASS_NAME, using = "btn")
    public static WebElement btnsubmit;
    @FindBy(how = How.LINK_TEXT, using = "Forgot your password?")
    public WebElement ForgotPassword;
    @FindBy(how = How.LINK_TEXT, using = "Request an account")
    public WebElement requestAnaccnt;
    @FindBy(how = How.ID, using = "logo")
    public WebElement Logo;


    public BasePage login(String UserName, String Password) {
        txtUsernames.sendKeys(UserName);
        txtPassword.sendKeys(Password);
        btnsubmit.submit();
//return GetInstance(AdminDashBoard.class);

        return GetInstance(AdminDashBoard.class);
    }

    public void loginFail() {
        String ActualTitle= DriverContext.Driver.getTitle();
        String ExpectedTitle ="Users Login";
        Assert.assertTrue( Boolean.parseBoolean(ActualTitle),ExpectedTitle);
    }
    public void pageTitle(){
        System.out.print( DriverContext.Driver.getTitle());
    }

    public BasePage requestAccess(){

        requestAnaccnt.click();
        return GetInstance(RequestAccessPage.class);
    }
}

