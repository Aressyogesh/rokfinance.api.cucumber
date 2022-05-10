package stepDefinations;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.hamcrest.Matcher;
import org.hamcrest.Matchers;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.ValidatableResponse;
import resources.APIResources;
import resources.TestDataBuild;
import resources.Utils;

public class stepsAddDeal extends Utils {
	
	TestDataBuild data = new TestDataBuild();
	APIResources resourceAPI;
	@Given("Add Deal Payload with {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string}")
	public void add_Deal_Payload_with(String defaulted, String unique_identifier, String hide_opportunity_flag, String modified_date, String opportunity_owner_email, String opportunity_owner_phone, String opportunity_owner_name, String date_last_stage, String deal_users_count, String old_external_id, String commission, String opp_id, String override_deal, String external_id, String create_date, String estimated_annual_gross_sales, String funding_date, String funding_amt, String business_start_date, String stage, String industry, String business_phone, String mobile, String email, String last_name, String first_name, String company_name, String lead_source) throws IOException {
		 res = given().spec(requestSpecification()).header("x-api-key",resourceAPI.xapikey).header("Authorization", resourceAPI.Authorization).header("Content-Type",resourceAPI.contentJson).body(data.addDeal(defaulted, unique_identifier, hide_opportunity_flag, modified_date, opportunity_owner_email, opportunity_owner_phone, opportunity_owner_name, date_last_stage, deal_users_count, old_external_id, commission, opp_id, override_deal, external_id, create_date, estimated_annual_gross_sales, funding_date, funding_amt, business_start_date, stage, industry, business_phone, mobile, email, last_name, first_name, company_name, lead_source));
	}

	@When("user calls {string} with {string} http request")
	public void user_calls_with_http_request(String resource, String method) {
		 	resourceAPI = APIResources.valueOf(resource);
		    System.out.println(resourceAPI.getResource());
		    resspec = new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
		    if (method.equalsIgnoreCase("POST"))
		     response = res.when().post(resourceAPI.getResource());
			else if (method.equalsIgnoreCase("GET"))
		    	response = res.when().get(resourceAPI.getResource());
		    else if (method.equalsIgnoreCase("DELETE"))
		    	response = res.when().delete(resourceAPI.getResource());
	}
	@Then("the API call got success with status code {int}")
	public void the_API_call_got_success_with_status_code(Integer int1) {
		assertEquals(200, response.getStatusCode());
		assertEquals("HTTP/1.1 200 OK", response.getStatusLine());
		ValidatableResponse valRes = response.then();
		valRes.time(Matchers.lessThan(3000L));
		valRes.time(Matchers.lessThan(3000L), TimeUnit.SECONDS);
		
		String resp = response.asString();
		System.out.println("Response Body - "+ response.getBody().asPrettyString());
		System.out.println("Response Header - "+ response.getHeaders());
		System.out.println("Status Code - " + response.getStatusCode());
		System.out.println("Status Line - " + response.getStatusLine());
		System.out.println("Response Time - "+ response.getTimeIn(TimeUnit.MILLISECONDS));
		//System.out.println(resp);
	}
	@Then("{string} in response body is {string}")
	public void in_response_body_is(String key, String value) {
	    String resp = response.asString();
	   // System.out.println(resp);
	    JsonPath js = new JsonPath(resp);
	    assertEquals(js.get(key).toString(), value);
	    	
		token = js.get("token");
		//System.out.println(token);
		
		 
	    
	}

}
