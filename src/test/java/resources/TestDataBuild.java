package resources;

import java.util.ArrayList;
import java.util.List;

import pojo.addDeal;
import pojo.addSubmission;
import pojo.editPartner;



public class TestDataBuild {

	
	
	public addDeal addDeal(String defaulted, String unique_identifier, String hide_opportunity_flag, String modified_date, String opportunity_owner_email, String opportunity_owner_phone, String opportunity_owner_name, String date_last_stage, String deal_users_count, String old_external_id, String commission, String opp_id, String override_deal, String external_id, String create_date, String estimated_annual_gross_sales, String funding_date, String funding_amt, String business_start_date, String stage, String industry, String business_phone, String mobile, String email, String last_name, String first_name, String company_name, String lead_source) {
		
		addDeal deal = new addDeal();
		deal.setdefaulted(defaulted);
		deal.setunique_identifier(unique_identifier);
		deal.sethide_opportunity_flag(hide_opportunity_flag);
		deal.setmodified_date(modified_date);
		deal.setopportunity_owner_email(opportunity_owner_email);
		deal.setopportunity_owner_phone(opportunity_owner_phone);
		deal.setopportunity_owner_name(opportunity_owner_name);
		deal.setdate_last_stage(date_last_stage);
		deal.setdeal_users_count(deal_users_count);
		deal.setold_external_id(old_external_id);
		deal.setcommission(commission);
		deal.setopp_id(opp_id);
		deal.setoverride_deal(override_deal);
		deal.setexternal_id(external_id);
		deal.setcreate_date(create_date);
		deal.setestimated_annual_gross_sales(estimated_annual_gross_sales);
		deal.setfunding_date(funding_date);
		deal.setfunding_amt(funding_amt);
		deal.setbusiness_start_date(business_start_date);
		deal.setstage(stage);
		deal.setindustry(industry);
		deal.setbusiness_phone(business_phone);
		deal.setmobile(mobile);
		deal.setemail(email);
		deal.setlast_name(last_name);
		deal.setfirst_name(first_name);
		deal.setcompany_name(company_name);
		deal.setlead_source(lead_source);
		
		
		return deal;
	}
	
public addSubmission addSubmission(String external_id, String opportunity_id, String submission_id, String submission_name, String status){
		
	addSubmission submission = new addSubmission();
	submission.setexternal_id(external_id);
	submission.setopportunity_id(opportunity_id);
	submission.setsubmission_id(submission_id);
	submission.setsubmission_name(submission_name);
	submission.setstatus(status);
	return submission;
	
	}

public editPartner editPartner(String activity_history, String user_type, String unique_identifier, String trash, String old_external_id, String restore, String external_id, String create_date, String doesnt_qualify_reason, String lead_status, String business_phone, String mobile, String email, String last_name, String first_name, String company, String lead_id) {
	editPartner partner = new editPartner();
	partner.setactivity_history(activity_history);
	partner.setuser_type(user_type);
	partner.setunique_identifier(unique_identifier);
	partner.settrash(trash);
	partner.setold_external_id(old_external_id);
	partner.setrestore(restore);
	partner.setexternal_id(external_id);
	partner.setcreate_date(create_date);
	partner.setdoesnt_qualify_reason(doesnt_qualify_reason);
	partner.setlead_status(lead_status);
	partner.setbusiness_phone(business_phone);
	partner.setmobile(mobile);
	partner.setemail(email);
	partner.setlast_name(last_name);
	partner.setfirst_name(first_name);
	partner.setcompany(company);
	partner.setlead_id(lead_id);
	return partner;
}
	
	
	
}
