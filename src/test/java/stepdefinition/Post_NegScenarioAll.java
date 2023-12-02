package stepdefinition;

import static io.restassured.RestAssured.given;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import utilities.API_enum;
import utilities.ExcelUtility;
import utilities.Utils;

public class Post_NegScenarioAll extends Utils {
	
	
	ResponseSpecification res1;
	RequestSpecification req2;
	Response response;
	ExcelUtility excelread=new ExcelUtility("./src/test/resources/Team11_TestData.xlsx");
	HashMap<String,Object> map=new HashMap<String, Object>();
	/**** PROGRAM MODULE POST NEGATIVE SCENARIOS ***/
	@Given("user creates POST request with existing prog name for the LMS API endpoint from  {string} and {string}")
	public void user_creates_post_request_with_existing_prog_name_for_the_lms_api_endpoint_from_and(String testcaseName, String Sheetname) throws IOException {
		List<String> data=excelread.getData(testcaseName,Sheetname);
		
		
		map.put("programName",PostRequestSteps.progname_env);
		map.put("programDescription",data.get(1));
		map.put("programStatus",data.get(2));
		
		req2=given().spec(requestSpecification()).body(map);
		//res1=new ResponseSpecBuilder().expectStatusCode(400).build();

	}
	
	@Given("user creates POST request with missingfield for the LMS API endpoint from  {string} and {string}")
	public void user_creates_post_request_with_missingfield_for_the_lms_api_endpoint_from_and(String testcaseName, String Sheetname) throws IOException {
		List<String> data=excelread.getData(testcaseName,Sheetname);
		
		
		map.put("programName","");
		map.put("programDescription",data.get(1));
		map.put("programStatus",data.get(2));
		
		req2=given().spec(requestSpecification()).body(map);
	}
	
	
	/**** BATCH MODULE POST REQUEST NEGATIVE SCENARIOS *****/
	
	@Given("user creates POST request with existing batch name for the LMS API endpoint from  {string} and {string}")
	public void user_creates_post_request_with_existing_batch_name_for_the_lms_api_endpoint_from_and(String testcaseName, String Sheetname) throws IOException {
		
		List<String> data=excelread.getData(testcaseName,Sheetname);
		
		//with same batch name
		map.put("batchName",PostRequestSteps.bname_env);
		map.put("batchDescription",data.get(1));
		map.put("batchStatus",data.get(2));
		map.put("batchNoOfClasses",data.get(3));
		
		map.put("programId",PostRequestSteps.progID_env);
		
		req2=given().spec(requestSpecification()).body(map);
	}
	
	@Given("user creates POST request with missingfield in batch for the LMS API endpoint from  {string} and {string}")
	public void user_creates_post_request_with_missingfield_in_batch_for_the_lms_api_endpoint_from_and(String testcaseName, String Sheetname) throws IOException {
		
		List<String> data=excelread.getData(testcaseName,Sheetname);
		
		
		map.put("batchName",PostRequestSteps.bname_env);
		map.put("batchDescription",data.get(1));
		map.put("batchStatus",data.get(2));
		map.put("batchNoOfClasses",data.get(3));
		
		//missing programID
		req2=given().spec(requestSpecification()).body(map);
	    
	}
	
	
	/***** USER MODULE POST NEGATIVE SCENARIOS  ****/
	
	@Given("user creates user with existing phone number for the LMS API endpoint from  {string} and {string}")
	public void user_creates_user_with_existing_phone_number_for_the_lms_api_endpoint_from_and(String testcaseName, String Sheetname) throws IOException {
	   
		List<String> data=excelread.getData(testcaseName,Sheetname);
		HashMap<String,Object> userdata=new HashMap<String,Object>();
		
		HashMap<String,Object> map=new HashMap<String,Object>();
		map.put("roleId",data.get(12));
		map.put("userRoleStatus",data.get(13));
		
		Object[] maparray=new Object[1];
		maparray[0]=map;
		
		userdata.put("userComments",data.get(1));
		userdata.put("userEduPg",data.get(2));
		userdata.put("userEduUg",data.get(3));
		userdata.put("userFirstName",PostRequestSteps.userfirsname_env);
		
		userdata.put("userLastName",data.get(4));
		userdata.put("userLinkedinUrl",data.get(5));
		userdata.put("userLocation",data.get(6));
		userdata.put("userMiddleName",data.get(8));
		userdata.put("userPhoneNumber",PostRequestSteps.phone);
					
		userdata.put("userRoleMaps",maparray);
		
		userdata.put("userTimeZone",data.get(16));
		userdata.put("userVisaStatus",data.get(20));
		req2=given().spec(requestSpecification()).body(userdata);
		
	}

	@When("user call {string} with {string} http request for users")
	public void user_call_with_http_request_for_users(String resource, String method) {
		API_enum resource_api = API_enum.valueOf(resource);
		if (method.equalsIgnoreCase("POST"))
		{
			
		response = req2.post(resource_api.getresource())
		.then()
		.log().all()
		.extract().response();
		}
	    
	}

	@Then("User receives BadRequest status code with message and boolean success details")
	public void user_receives_bad_request_status_code_with_message_and_boolean_success_details() {
		response.then().assertThat().header("Content-Type","application/json")
		.statusCode(400).log().all();
	}

	
	
	@Given("user creates user with a missing field for the LMS API endpoint from  {string} and {string}")
	public void user_creates_user_with_a_missing_field_for_the_lms_api_endpoint_from_and(String testcaseName, String Sheetname) throws IOException {
		List<String> data=excelread.getData(testcaseName,Sheetname);
		HashMap<String,Object> userdata=new HashMap<String,Object>();
		
		HashMap<String,Object> map=new HashMap<String,Object>();
		map.put("roleId",data.get(12));
		map.put("userRoleStatus",data.get(13));
		
		Object[] maparray=new Object[1];
		maparray[0]=map;
		
		userdata.put("userComments",data.get(1));
		userdata.put("userEduPg",data.get(2));
		userdata.put("userEduUg",data.get(3));
		req2=given().spec(requestSpecification()).body(userdata);
	}

	
	  /***  ASSIGNMENT MODULE NEGATIVE POST SCENARIOS  ***/
	
	
	@Given("user creates Assignment with existing value for the LMS API endpoint from  {string} and {string}")
	public void user_creates_Assignment_with_existing_value_for_the_lms_api_endpoint_from_and(String testcasename, String sheetname) throws IOException {
		List<String> data=excelread.getData(testcasename,sheetname);
		HashMap<String,Object> assdata=new HashMap<String, Object>();
		assdata.put("assignmentDescription",data.get(1));
		assdata.put("assignmentName",PostRequestSteps.assignname_env);
		assdata.put("batchId",PostRequestSteps.bacthId_env);
		assdata.put("comments",data.get(7));
		
		assdata.put("createdBy",PostRequestSteps.userId_env);
		
		assdata.put("dueDate",PostRequestSteps.duedate_env);
		assdata.put("graderId",PostRequestSteps.userId_env);
		assdata.put("pathAttachment1",data.get(2));
		assdata.put("pathAttachment2",data.get(3));
		assdata.put("pathAttachment3",data.get(4));
		assdata.put("pathAttachment4",data.get(5));
		assdata.put("pathAttachment5",data.get(6));
		req2=given().spec(requestSpecification()).body(assdata);
	}
	
	
	@Given("user creates Assignment with missing value for the LMS API endpoint from  {string} and {string}")
	public void user_creates_Assignment_with_missing_value_for_the_lms_api_endpoint_from_and(String testcasename, String sheetname) throws IOException {
	    
		List<String> data=excelread.getData(testcasename,sheetname);
		HashMap<String,Object> assdata=new HashMap<String, Object>();
		assdata.put("assignmentDescription",data.get(1));
		assdata.put("assignmentName",PostRequestSteps.assignname_env);
		assdata.put("batchId",PostRequestSteps.bacthId_env);
		assdata.put("comments",data.get(7));
		req2=given().spec(requestSpecification()).body(assdata);
		
	}
	
	 /***  ASSIGNMENT SUBMIT  MODULE NEGATIVE POST SCENARIOS   ***/
	
	@Given("user submits assignment with existing value for the LMS API endpoint from  {string} and {string}")
	public void user_submits_assignment_with_existing_value_for_the_lms_api_endpoint_from_and(String testcasename, String sheetname) throws IOException {
		List<String> data=excelread.getData(testcasename,sheetname);
		HashMap<String,Object> subdata=new HashMap<String, Object>();
		subdata.put("assignmentId",PostRequestSteps.AssignId_env);
		subdata.put("userId",PostRequestSteps.userId_env);
		subdata.put("subDesc",data.get(1));
		subdata.put("subComments",data.get(2));
		subdata.put("subPathAttach1",data.get(3));
		
		subdata.put("subPathAttach2",data.get(4));
		
		subdata.put("subPathAttach3",data.get(5));
		subdata.put("subPathAttach4",data.get(6));
		subdata.put("subPathAttach5",data.get(7));
		subdata.put("subDateTime",PostRequestSteps.subdate_env);
		subdata.put("gradedBy",PostRequestSteps.userId_env);
		subdata.put("gradedDateTime","");
		subdata.put("grade",data.get(8));
		
		req2=given().spec(requestSpecification()).body(subdata);
		
	}

	@Given("user submits assignment with missing value for the LMS API endpoint from  {string} and {string}")
	public void user_submits_assignment_with_missing_value_for_the_lms_api_endpoint_from_and(String testcasename, String sheetname) throws IOException {
		List<String> data=excelread.getData(testcasename,sheetname);
		HashMap<String,Object> subdata=new HashMap<String, Object>();
		subdata.put("assignmentId","");
		subdata.put("userId",PostRequestSteps.userId_env);
		subdata.put("subDesc",data.get(1));
		req2=given().spec(requestSpecification()).body(subdata);
	}
	
}
