Feature: Validating Edit Partner API
@Regression
Scenario Outline: Verify if Partner is being Succesfully updated using EditPartnerAPI
	Given Add Submission Payload with "<activity_history>" "<user_type>" "<unique_identifier>" "<trash>" "<old_external_id>" "<restore>" "<external_id>" "<create_date>" "<doesnt_qualify_reason>" "<lead_status>" "<business_phone>" "<mobile>" "<email>" "<last_name>" "<first_name>" "<company>" "<lead_id>"
	When user calls "EditPartnerAPI" with "POST" http request
	Then the API call got success with status code 200
	And "status" in response body is "true"
	And "message" in response body is "Referral partner lead updated successfully."
	
	
Examples:
	    |activity_history|user_type|unique_identifier|trash|old_external_id   |restore|external_id       |create_date        |doesnt_qualify_reason|lead_status|business_phone|mobile        |email             |last_name|first_name|company  |lead_id           |
		|null            |1        |ZK0rG704282022   |null |0012h00000m1pIoAAI|false  |0012h00000m1pIoAAI|2022-04-28 07:07:38|null                 |Hot lead   |(475)-454-5455|(545)-415-4545|testleads@test.com|test     |test      |test lead|00Q2h000007FIeQEAW|

	 


	

	
	
	
	
	
	

	
	
	