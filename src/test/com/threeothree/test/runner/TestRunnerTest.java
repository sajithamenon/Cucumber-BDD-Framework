package com.threeothree.test.runner;

import com.beust.testng.TestNG;
import cucumber.api.CucumberOptions;

import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;

import cucumber.runtime.model.CucumberTagStatement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.List;

/**
 * Created by Sajitha on 5/10/2017.
 */


@CucumberOptions(features = {"src\\test\\com\\threeothree\\test\\features"},
        format={"json:target/cucumber.json","html:target/site/cucumber-pretty"},
glue={"com\\threeothree\\test\\steps"})
public class TestRunnerTest {
private TestNGCucumberRunner testNGCucumberRunner;

@BeforeClass(alwaysRun = true)
public void setUpClass()
    {
       testNGCucumberRunner=new TestNGCucumberRunner(this.getClass());

    }

    @Test(dataProvider="features")
    public void runTests(CucumberFeatureWrapper cucumberFeatureWrapper)
    {
      /*  List<CucumberTagStatement>elements=cucumberFeatureWrapper.getCucumberFeature().getFeatureElements();
        for(Iterator<CucumberTagStatement> element=elements.iterator();element.hasNext();)
        { //Pass the hardCoded Scenario Name
            CucumberTagStatement scenarioName=element.next();
            if(!scenarioName.getVisualName().equals("Login with correct username and password for the admin"))
            {
                element.remove();
            }
        }*/



        testNGCucumberRunner.runCucumber(cucumberFeatureWrapper.getCucumberFeature());
    }
    @DataProvider
    public Object[][] features(){return testNGCucumberRunner.provideFeatures();}

@AfterClass(alwaysRun = true)
public void afterClass(){testNGCucumberRunner.finish();}}