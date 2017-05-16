package com.threeothree.test.steps;

import com.threeothree.framework.base.Base;
import com.threeothree.framework.base.DriverContext;
import com.threeothree.framework.cofig.Settings;
import com.threeothree.test.features.pages.AdminDashBoard;
import com.threeothree.test.features.pages.LoginPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.testng.Assert;


/**
 * Created by Sajitha on 5/5/2017.
 */
public class LoginSteps extends Base {


    @When("^I login with correct credentials$")
    public void iLoginWithCorrectCredentials() throws Throwable {
        CurrentPage=GetInstance(LoginPage.class);
       CurrentPage= CurrentPage.As(LoginPage.class).login(Settings.UserName, Settings.Password);
        Thread.sleep(3000);
    }

    @Then("^I should go to the adminDashboard$")
    public void iShouldGoToTheAdminDashboard() throws Throwable {
       //CurrentPage=GetInstance(AdminDashBoard.class);
     CurrentPage.As(AdminDashBoard.class).pageTitle();
        Assert.assertEquals("Dashboard",  DriverContext.Driver.getTitle());
    }


    @When("^I login with correct username and incorrect password$")
    public void iLoginWithCorrectUsernameAndIncorrectPassword() throws Throwable {
        CurrentPage = GetInstance(LoginPage.class);
        CurrentPage = CurrentPage.As(LoginPage.class).login(Settings.UserName,"saji");
        Thread.sleep(3000);
    }

    @Then("^I should not  go to the adminDashboard$")
    public void iShouldNotGoToTheAdminDashboard() throws Throwable {

      Assert.assertFalse(Boolean.parseBoolean("Dashboard"), (DriverContext.Driver.getTitle()));
        System.out.println(DriverContext.Driver.getTitle());
    }

    @When("^I login with incorrect email and correct password$")
    public void iLoginWithIncorrectEmailAndCorrectPassword() throws Throwable {
        CurrentPage = GetInstance(LoginPage.class);
        CurrentPage = CurrentPage.As(LoginPage.class).login("saji", Settings.Password);
        Thread.sleep(3000);
    }


    @When("^I login with empty credentials$")
    public void iLoginWithEmptyCredentials() throws Throwable {
        CurrentPage = GetInstance(LoginPage.class);
        CurrentPage = CurrentPage.As(LoginPage.class).login("","");
        Thread.sleep(3000);

    }

    @When("^I login with empty userName and correct password$")
    public void iLoginWithEmptyUserNameAndCorrectPassword() throws Throwable {
        CurrentPage = GetInstance(LoginPage.class);
        CurrentPage = CurrentPage.As(LoginPage.class).login("",Settings.Password);
        Thread.sleep(3000);
    }

    @When("^I login with empty password and correct userName$")
    public void iLoginWithEmptyPasswordAndCorrectUserName() throws Throwable {
        CurrentPage = GetInstance(LoginPage.class);
        CurrentPage = CurrentPage.As(LoginPage.class).login(Settings.UserName,"");
        Thread.sleep(3000);
    }

}

