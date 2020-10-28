package com.roytuts.cucumber.java.junit;

import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdditionStepDefinition {

    private int num1;
    private int num2;
    private int total;

    @Given("I input numbers {int} and {int} into the calculator")
    public void i_input_numbers_and_into_the_calculator(Integer int1, Integer int2) {
        num1 = int1;
        num2 = int2;

        assertTrue("The total is not zero.", total == 0);
    }

    @When("I press add")
    public void i_press_add() {
        total = num1 + num2;
    }

    @Then("I should get the result {int} on the screen")
    public void i_should_get_the_result_on_the_screen(Integer int1) {
        assertTrue("The expected total was 30, but actually is: " + total, total == int1);
    }

}
