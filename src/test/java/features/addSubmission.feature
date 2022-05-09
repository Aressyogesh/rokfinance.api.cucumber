Feature: Validating Add Submission API's
@Smoke
Scenario Outline: Verify if Submission is being Succesfully added using AddSubmissionAPI
	Given Add Submission Payload with "<external_id>" "<opportunity_id>" "<submission_id>" "<submission_name>" "<status>"  
	When user calls "AddSubmissionAPI" with "POST" http request
	Then the API call got success with status code 200
	And "status" in response body is "true"
	And "message" in response body is "Submission created successfully."
	
	
Examples:
	|external_id          |opportunity_id    |submission_id     |submission_name   |status  |
	|0012h00000kOjcAAAS	  |0062h00000WQEuDAAX|a1m2h000002oNp1AAE|Submission-0030082|Approved|
	|0012h00000kOjcAAAS	  |0062h00000WQEuDAAX|a1m2h000002oNp1AAF|Submission-0030082|Approved|
	|0012h00000kOjcAAAS	  |0062h00000WQEuDAAX|a1m2h000002oNp1AAG|Submission-0030082|Approved|
	|0012h00000kOjcAAAS	  |0062h00000WQEuDAAX|a1m2h000002oNp1AAH|Submission-0030082|Approved|
	|0012h00000kOjcAAAS	  |0062h00000WQEuDAAX|a1m2h000002oNp1AAI|Submission-0030082|Approved|

	 


	

	
	
	
	
	
	

	
	
	