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

public class stepsEditPartner extends Utils {
	
	TestDataBuild data = new TestDataBuild();
	APIResources resourceAPI;
	
	//@Given("Add Submission Payload with {string} {string} {string} {string} {string}")
	//public void add_submission_payload_with(String external_id, String opportunity_id, String submission_id, String submission_name, String status) throws IOException {
	//	res = given().spec(requestSpecification()).header("x-api-key",resourceAPI.xapikey).header("Authorization", resourceAPI.Authorization).header("Content-Type",resourceAPI.contentJson).body(data.addSubmission(external_id, opportunity_id, submission_id, submission_name, status));
	//}

	@Given("Add Submission Payload with {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string}")
	public void add_submission_payload_with(String activity_history, String user_type, String unique_identifier, String trash, String old_external_id, String restore, String external_id, String create_date, String doesnt_qualify_reason, String lead_status, String business_phone, String mobile, String email, String last_name, String first_name, String company, String lead_id) throws IOException {
		res = given().spec(requestSpecification()).header("x-api-key",resourceAPI.xapikey).header("Authorization", resourceAPI.Authorization).header("Content-Type",resourceAPI.contentJson).body(data.editPartner(activity_history, user_type, unique_identifier, trash, old_external_id, restore, external_id, create_date, doesnt_qualify_reason, lead_status, business_phone, mobile, email, last_name, first_name, company, lead_id));
		
	}


}
