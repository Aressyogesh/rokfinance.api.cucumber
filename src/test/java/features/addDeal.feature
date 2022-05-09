Feature: Validating Add Deal API's
@Regression
Scenario Outline: Verify if Deal is being Succesfully added using AddDealAPI
	Given Add Deal Payload with "<defaulted>" "<unique_identifier>" "<hide_opportunity_flag>" "<modified_date>" "<opportunity_owner_email>" "<opportunity_owner_phone>" "<opportunity_owner_name>" "<date_last_stage>" "<deal_users_count>" "<old_external_id>" "<commission>" "<opp_id>" "<override_deal>" "<external_id>" "<create_date>" "<estimated_annual_gross_sales>" "<funding_date>" "<funding_amt>" "<business_start_date>" "<stage>" "<industry>" "<business_phone>" "<mobile>" "<email>" "<last_name>" "<first_name>" "<company_name>" "<lead_source>" 
	When user calls "AddDealAPI" with "POST" http request
	Then the API call got success with status code 200
	And "status" in response body is "true"
	And "message" in response body is "Deal updated successfully."
	
	
Examples:
	|defaulted|unique_identifier|hide_opportunity_flag|modified_date      |opportunity_owner_email|opportunity_owner_phone|opportunity_owner_name|date_last_stage    |deal_users_count|old_external_id   |commission|opp_id             |override_deal|external_id       |create_date        |estimated_annual_gross_sales|funding_date|funding_amt|business_start_date|stage      |industry               |business_phone|mobile        |email                  |last_name|first_name|company_name|lead_source                     |
	|false	  |UZ8pkr05032021	|false                |2022-05-06 01:51:41|yogesh.lolage@aress.com|(999) 999-9999         |Yogesh Lolage         |2022-05-03 12:29:15|2               |0012h00000m1pIoAAI|0.00      |0062h00000WSEvXdAAX|true         |0012h00000m1pIoAAI|2022-05-03 12:16:22|0.00                        |2022-05-11  |5000.00    |2022-04-25         |10 - Funded|Beauty / Nail Salon    |(320)-312-3215|(315)-135-1435|yogesh.lolage@aress.com|Lolage   |Yogesh    |ABC Ltd     |Unknown - Rep to Get Lead Source|

	 


	

	
	
	
	
	
	

	
	
	