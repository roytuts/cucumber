package com.roytuts.cuke.flow;

import org.junit.runner.RunWith;

//Cucumber 1.2.5
//import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;
//Cucumber 1.2.5

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {
		"classpath:cuke/flow/feature/sum.feature" }, glue = "com.roytuts.cuke.flow.steps", monochrome = true, plugin = {
				"pretty", "html:target/cucumber", "json:target/Cucumber.json", "junit:target/Cucumber.xml" })
public class CukeSumRunner {

}