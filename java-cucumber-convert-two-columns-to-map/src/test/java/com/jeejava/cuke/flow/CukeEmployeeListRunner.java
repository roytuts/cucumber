package com.jeejava.cuke.flow;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {
		"classpath:cuke/flow/feature/employeelist.feature" }, glue = "com.jeejava.cuke.flow.steps", monochrome = true, plugin = {
				"pretty", "html:target/cucumber", "json:target/Cucumber.json", "junit:target/Cucumber.xml" })
public class CukeEmployeeListRunner {

}