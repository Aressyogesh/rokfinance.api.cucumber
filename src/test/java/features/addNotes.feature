Feature: Validating Add Notes API's
#@Regression
Scenario Outline: Verify if Notes are being Succesfully added using AddNotesAPI
	Given Add Submission Payload with "<external_id>" "<opportunity_id>" "<submission_id>" "<submission_name>" "<status>"  
	When user calls "AddNotesAPI" with "POST" http request
	Then the API call got success with status code 200
	And "status" in response body is "true"
	And "message" in response body is "Submission created successfully."
	
	
Examples:
	|external_id          |opportunity_id    |submission_id     |submission_name   |status  |
	|0012h00000kOjcAAAS	  |0062h00000WQEuDAAX|a1m2h000002oNp1AAE|Submission-0030082|Approved|

	 


	

	
	
	
	
	
	

	
	
	