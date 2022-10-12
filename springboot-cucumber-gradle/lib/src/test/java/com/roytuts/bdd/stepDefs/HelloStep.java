package com.roytuts.bdd.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;

public class HelloStep {

	private ValidatableResponse validatableResponse;
	private final String endpoint = "http://localhost:8080/hello";

	@Given("I send a request to the URL to get hello")
	public void i_send_a_request_to_the_url_to_get_hello() {
		validatableResponse = RestAssured.given().contentType(ContentType.JSON).when().get(endpoint).then();
	}

	@Then("the response will return status {int}")
	public void the_response_will_return_status(Integer statusCode) {
		validatableResponse.assertThat().statusCode(statusCode);
	}

}
