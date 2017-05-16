package com.threeothree.test.features.pages;

import com.threeothree.framework.base.BasePage;
import com.threeothree.framework.base.DriverContext;

import com.threeothree.framework.utilities.GenerateData;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Random;



/**
 * Created by Sajitha on 4/24/2017.
 */
public class RequestAccessPage extends BasePage {


    public RequestAccessPage() {

    }
    GenerateData gen=new GenerateData();

    @FindBy(how = How.ID,using = "first-name")
    public WebElement txtFirstName;
    @FindBy(how = How.ID,using = "last-name")
    public WebElement txtLaststName;
    @FindBy(how = How.ID,using = "email")
    public WebElement txtEmailid;
    @FindBy(how=How.ID,using = "phone")
    public WebElement phoneNumber;
    @FindBy(how=How.XPATH,using="html/body/div[1]/section/section/section/form/fieldset/div[1]/div[1]/div[8]/label[3]")
 public WebElement radioBtnacntType;
    @FindBy(how = How.XPATH,using=".//*[@id='content']/form/fieldset/div[1]/div[1]/div[9]/span[3]/label")
    public WebElement chkBooxForCS1;
    @FindBy(how = How.XPATH,using=".//*[@id='content']/form/fieldset/div[1]/div[1]/div[9]/span[5]/label")
    public WebElement chkBooxForCS2;
    @FindBy(how = How.XPATH,using=".//*[@id='content']/form/fieldset/div[1]/div[1]/div[9]/span[8]/label")
    public WebElement chkBooxForCS3;

    @FindBy(how  =How.ID,using="chosenSupplier" )
    public WebElement SupplierName;
    @FindBy(how  =How.XPATH,using="html/body/div[1]/section/section/section/form/fieldset/div[1]/div[2]/span/div[2]/input" )
    public WebElement SupplierAddress;
    @FindBy(how  =How.ID,using="supplier_state" )
    public WebElement SupplierState;
    @FindBy(how  =How.XPATH,using="html/body/div[1]/section/section/section/form/fieldset/div[1]/div[2]/span/div[3]/input" )
    public WebElement SupplierCity;
    @FindBy(how  =How.XPATH,using="html/body/div[1]/section/section/section/form/fieldset/div[1]/div[2]/span/div[4]/input" )
    public WebElement SupplierZip;
    @FindBy(how  =How.ID,using="supplier_country" )
    public WebElement SupplierCountry;
    @FindBy(how  =How.ID,using="Company Name" )
    public WebElement RepCompnyName;
    @FindBy(how  =How.CSS,using="[type='text'][value='Company Address']" )
    public WebElement RpAddress;
    @FindBy(how  =How.CSS,using="[type='text'][value='City']" )
    public WebElement RepCity;

    @FindBy(how  =How.ID,using="rep_company_state" )
    public WebElement State;
    @FindBy(how  =How.ID,using="rep_company_zip" )
    public WebElement RepZip;
    @FindBy(how =How.XPATH,using="html/body/div[2]/div[3]/div[1]/div/div/span/div[5]")
    public WebElement capcha;
    @FindBy(how = How.XPATH,using="html/body/div[1]/section/section/section/form/fieldset/div[3]/button")
    public WebElement requestAccess;
    @FindBy(how=How.XPATH,using = "html/body/div[1]/section/section/section/form/fieldset/div[1]/div[2]/span[2]/div[1]/input")
    public WebElement Companyname;
    @FindBy(how=How.XPATH,using = "html/body/div[1]/section/section/section/form/fieldset/div[1]/div[1]/div[8]/label[2]")
    public WebElement IAmABroker;
    @FindBy(how=How.XPATH,using = "html/body/div[1]/section/section/section/form/fieldset/div[1]/div[2]/span[2]/div[2]/input")
    public WebElement CompanyAddress;
    @FindBy(how=How.XPATH,using="html/body/div[1]/section/section/section/form/fieldset/div[1]/div[2]/span[2]/div[3]/input")
    public WebElement companyCity;
    @FindBy(how=How.ID,using="rep_company_state")
    public WebElement companyState;
    @FindBy(how =How.ID,using = "rep_company_zip")
    public WebElement CompanyZip;

    public void selectSupName()
{

    Select select=new Select(SupplierName);
    Random rand=new Random();
    int index=rand.nextInt(50)+1;
    select.selectByIndex(index);
}
    public void registration(){

        txtFirstName.sendKeys(gen.generateRandomString(5));
        txtLaststName.sendKeys(gen.generateRandomString(15));
        txtEmailid.sendKeys();
        phoneNumber.sendKeys(gen.generateRandomNumber(10));
    }
public void accntType(){
    radioBtnacntType.click();

    }
    public void addingState(){
        chkBooxForCS1.click();
        chkBooxForCS2.click();
    }

    public void supplierName(){
        Select select=new Select(SupplierName);
        Random rand=new Random();
        int index=rand.nextInt(2848+1);
        select.selectByIndex(index);
    }
    public void sup_add(){
        SupplierAddress.sendKeys(gen.generateRandomNumber(5));
    }
    public void sup_city(){
       SupplierCity.sendKeys(gen.generateRandomString(5));
    }
    public void supp_state(){
        Select select=new Select((SupplierState));
                Random rand=new Random();
        int index=rand.nextInt(51+1);
        select.selectByIndex(index);

    }
    public void sup_zip(){

        SupplierZip.sendKeys(gen.generateRandomNumber(5));
    }
public void supCountry(){
    Select select=new Select(SupplierCountry);
select.selectByValue("USA");

}
public void roboCapcha()
{
    capcha.click();

}
    public void request(){
        requestAccess.click();


}
public void compnyName()
{
   Companyname.sendKeys(gen.generateRandomString(5));
}
    public void compnyAdrs(){
        CompanyAddress.sendKeys(gen.generateRandomNumber(5));
    }
    public void compnyCity(){
        companyCity.sendKeys(gen.generateRandomString(5));
    }
    public void cmpnySate(){
        Select select=new Select(companyState);
        Random rand=new Random();
        int index=rand.nextInt(51+1);
        select.selectByIndex(index);
    }
    public void compnyZiip(){
        CompanyZip.sendKeys(gen.generateRandomNumber(5));
    }
}

