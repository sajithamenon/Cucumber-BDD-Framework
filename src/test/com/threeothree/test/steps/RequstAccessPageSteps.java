package com.threeothree.test.steps;

import com.threeothree.framework.base.Base;
import com.threeothree.test.features.pages.LoginPage;
import com.threeothree.test.features.pages.RequestAccessPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

/**
 * Created by Sajitha on 5/8/2017.
 */
public class RequstAccessPageSteps extends Base {
    @When("^the user is on the loginPage$")
    public void theUserIsOnTheLoginPage() throws Throwable {
        CurrentPage=GetInstance(LoginPage.class);
    }
    @And("^click request access tab$")
    public void clickRequestAccessTab() throws Throwable {
        CurrentPage=CurrentPage.As(LoginPage.class).requestAccess();
        Thread.sleep(3000);
    }
    @And("enter the details of FirstName LastName Email and phone number$")
    public void enterTheDetailsOfFirstNameLastNameEmailAndPhoneNumber() throws Throwable  {
       CurrentPage.As(RequestAccessPage.class).registration();
    }

    @And("^check the radio Button Named I am a Supplier$")
    public void checkTheRadioButtonNamedIAmASupplier() throws Throwable {
     CurrentPage.As(RequestAccessPage.class).accntType();}

    @And("^Check the states Idaho and Montana$")
    public void checkTheStatesIdahoAndMontana() throws Throwable {
        CurrentPage.As(RequestAccessPage.class).addingState();
    }

    @And("^Select a Suppplier name$")
    public void selectASuppplierName() throws Throwable {
        CurrentPage.As(RequestAccessPage.class).supplierName();
    }

    @And("^enter a Supplier address$")
    public void enterASupplierAddress() throws Throwable {
       CurrentPage.As(RequestAccessPage.class).sup_add();}

    @And("^enter the city$")
    public void enterTheCity() throws Throwable {
        CurrentPage.As(RequestAccessPage.class).sup_city();
    }

    @And("^Select the state$")
    public void selectTheState() throws Throwable {
        CurrentPage.As(RequestAccessPage.class).supp_state();
    }

    @And("^enter the zipcode$")
    public void enterTheZipcodeAs() throws Throwable {
        CurrentPage.As(RequestAccessPage.class).sup_zip();

    }

    @And("^select the country as United Staes$")
    public void selectTheCountryAsUnitedStaes() throws Throwable {
        CurrentPage.As(RequestAccessPage.class).supCountry();
    }




    @And("^Register$")
    public void register() throws Throwable {
        CurrentPage.As(RequestAccessPage.class).request();
    }


    @And("^check the radio Button Named I am a Broker$")
    public void checkTheRadioButtonNamedIAmABroker() throws Throwable {
       CurrentPage.As(RequestAccessPage.class).IAmABroker.click();
    }

    @And("^Enter the companyName$")
    public void enterTheCompanyName() throws Throwable {
        CurrentPage.As(RequestAccessPage.class).compnyName();
    }

    @And("^enter the company address$")
    public void enterTheCompanyAddress() throws Throwable {
       CurrentPage.As(RequestAccessPage.class).compnyAdrs();

    }

    @And("^enter the company city$")
    public void enterTheCompanyCity() throws Throwable {
        CurrentPage.As(RequestAccessPage.class).compnyCity();
    }

    @And("^Select the company state$")
    public void selectTheCompanyState() throws Throwable {
      CurrentPage.As(RequestAccessPage.class).cmpnySate();
    }

    @And("^Enetr the company Zip$")
    public void enetrTheCompanyZip() throws Throwable {
        CurrentPage.As(RequestAccessPage.class).compnyZiip();
    }
}
