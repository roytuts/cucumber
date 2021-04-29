package com.roytuts.cuke.flow;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//Cucumber 1.2.5
//import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;
//Cucumber 1.2.5

@RunWith(Cucumber.class)
@CucumberOptions(features = {
		"classpath:cuke/flow/feature/bonuslist.feature" }, glue = "com.roytuts.cuke.flow.steps", monochrome = true, plugin = {
				"pretty", "html:target/cucumber", "json:target/Cucumber.json", "junit:target/Cucumber.xml" })
public class CukeBonusListRunner {

}
