package stepDefinations;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

import java.io.IOException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import resources.APIResources;
import resources.TestDataBuild;
import resources.Utils;

public class stepsAddSubmission extends Utils {
	
	TestDataBuild data = new TestDataBuild();
	APIResources resourceAPI;
	
	
	@Given("Add Submission Payload with {string} {string} {string} {string} {string}")
	public void add_submission_payload_with(String external_id, String opportunity_id, String submission_id, String submission_name, String status) throws IOException {
		res = given().spec(requestSpecification()).header("x-api-key",resourceAPI.xapikey).header("Authorization", resourceAPI.Authorization).header("Content-Type",resourceAPI.contentJson).body(data.addSubmission(external_id, opportunity_id, submission_id, submission_name, status));
	}



}
