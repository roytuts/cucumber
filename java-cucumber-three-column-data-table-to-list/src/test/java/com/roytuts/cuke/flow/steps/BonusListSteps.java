package com.roytuts.cuke.flow.steps;

import java.util.List;

//Cucumber 1.2.5
//import org.hamcrest.CoreMatchers;
//import org.junit.Assert;
//import com.roytuts.cuke.flow.vo.EmpBonus;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//Cucumber 1.2.5

import org.junit.jupiter.api.Assertions;

import com.roytuts.cuke.flow.vo.EmpBonus;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BonusListSteps {

	private int totalEmployee;
	private int totalBonusAmt;

	@Given("^an organization has (\\d+) employees$")
	public void an_organization_has_employees(int totalEmployee) throws Throwable {
		this.totalEmployee = totalEmployee;
	}

	@When("^it pays bonus according to the designation$")
	public void it_pays_bonus_according_to_the_designation(List<EmpBonus> empBonus) throws Throwable {
		for (EmpBonus empBonus2 : empBonus) {
			Integer noOfEmployee = empBonus2.getNoOfEmployees();
			Integer bonusAmt = empBonus2.getBonus();
			totalBonusAmt += noOfEmployee * bonusAmt;
		}
	}

	@Then("^the organization has to pay total extra Rs. (\\d+) to (\\d+) employees$")
	public void the_organization_has_to_pay_total_extra_Rs_to_employees(int expTotalMoney, int expTotalEmployee)
			throws Throwable {
		// Assert.assertThat(totalBonusAmt, CoreMatchers.is(expTotalMoney)); //Junit 4
		// Assert.assertThat(totalEmployee, CoreMatchers.is(expTotalEmployee)); //Junit 4
		Assertions.assertEquals(totalBonusAmt, expTotalMoney);
		Assertions.assertEquals(totalEmployee, expTotalEmployee);
	}

}
