<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd">
<suite name="Custom suite" verbose="1" thread-count="1" parallel="tests" configfailurepolicy="continue">
<listeners>
<listener class-name="com.cucumber.testng.examples.TestNGExecutionListener"></listener>
</listeners>
<test name="Cucumber Date Calculator Test 1" annotations="JDK" preserve-order="true">
<classes>
<class name="com.com.threeothree.test.runner.TestRunner"/>
<methods>
<include name=t
</classes>
</test>
<test name="Cucumber Date Calculator Test 2" annotations="JDK" preserve-order="true">
<classes>
<class name="com.cucumber.testng.examples.RunCukesByFeatureAndCompositionTest2"/>
</classes>
</test>
</suite>