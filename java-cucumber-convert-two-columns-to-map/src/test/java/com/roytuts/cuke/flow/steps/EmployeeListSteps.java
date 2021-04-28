package com.roytuts.cuke.flow.steps;

import java.util.HashMap;
import java.util.Map;

//Cucumber 1.2.5
//import org.hamcrest.CoreMatchers;
//import org.junit.Assert;
//import cucumber.api.DataTable;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import gherkin.formatter.model.DataTableRow;
//Cucumber 1.2.5

import org.junit.jupiter.api.Assertions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EmployeeListSteps {

	private int currTotalSrDev;
	private int currTotalJrDev;
	private Map<String, Integer> employeeMap;

	@Given("^an organization has employees$")
	public void an_organization_has_employees(DataTable employeeTable) throws Throwable {
		employeeMap = new HashMap<String, Integer>();
		//Cucumber 1.2.5
		// for (DataTable row : employeeTable.getGherkinRows()) {
		// employeeMap.put(row.getCells().get(0),
		// Integer.parseInt(row.getCells().get(1)));
		// }
		//Cucumber 1.2.5
		employeeMap = employeeTable.asMap(String.class, Integer.class);
	}

	@When("^it recruits (\\d+) more (.*) and (\\d+) more (.*) employees$")
	public void it_recruits_more_Sr_Dev_and_more_Jr_Dev_employees(int noOfSrDev, String srDev, int noOfJrDev,
			String jrDev) throws Throwable {
		currTotalSrDev = employeeMap.get(srDev) + noOfSrDev;
		currTotalJrDev = employeeMap.get(jrDev) + noOfJrDev;
	}

	@Then("^the organization will have (\\d+) Sr. Dev and (\\d+) Jr. Dev$")
	public void the_organization_will_have_Sr_Dev_and_Jr_Dev(int expTotalSrDev, int expTotalJrDev) throws Throwable {
		// Assert.assertThat(currTotalSrDev, CoreMatchers.is(expTotalSrDev));//Junit 4
		// Assert.assertThat(currTotalJrDev, CoreMatchers.is(expTotalJrDev));//Junit 4

		Assertions.assertEquals(currTotalSrDev, expTotalSrDev); //Junit 5
		Assertions.assertEquals(currTotalJrDev, expTotalJrDev); //Junit 5
	}

}
