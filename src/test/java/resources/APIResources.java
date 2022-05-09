package resources;
//enum is special class in java which has collection of constants or  methods
public enum APIResources {
	
	AddDealAPI("/API/DealApi/edit"),
	AddSubmissionAPI("API/DealApi/createSubmission"),
	AddNotesAPI("/API/DealApi/createNotes"),
	EditPartnerAPI("/API/PartnerAPI/edit");
	
	private String resource;
	
	public static String xapikey = "CODEX@123";
	public static String Authorization="Basic Og==";
	public static String contentJson="application/json";
	
	
	APIResources(String resource)
	{
		this.resource=resource;
	}
	
	public String getResource()
	{
		return resource;
	}
	

}
