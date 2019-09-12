package com.roytuts.cuke.flow.steps;

import java.util.List;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SumSteps {

	private double sum;
	private List<Double> numbers;

	@Given("^a list of real numbers$")
	public void a_list_of_real_numbers(List<Double> numbers) throws Throwable {
		this.numbers = numbers;
	}

	@When("^I calculate the sum of them$")
	public void I_calculate_the_sum_of_them() throws Throwable {
		for (Double number : numbers) {
			sum += number;
		}
	}

	@Then("^I will get (\\d+\\.\\d+)$")
	public void I_will_get_(Double expectedTotal) throws Throwable {
		Assert.assertThat(sum, CoreMatchers.is(expectedTotal));
		System.out.println("Actual Sum : " + sum);
	}

}
