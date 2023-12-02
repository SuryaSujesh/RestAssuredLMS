package stepdefinition;

import static io.restassured.RestAssured.given;

import java.io.IOException;
import java.util.HashMap;
import java.util.Random;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import utilities.API_enum;
import utilities.TestData2;
import utilities.Utils;

public class PutRequest_missingFields extends Utils {
	
	ResponseSpecification res1;
	RequestSpecification req1;
	Response response;
	
	TestData2 data=new TestData2();
	
	// UPDATE PROGRAM WITH MISSING FIELDS  AND VALID ID
	@Given("user creates PUT request with missing data for the LMS API endpoint")
	public void user_creates_put_request_with_missing_data_for_the_lms_api_endpoint() throws IOException {
		
		
		Random randomNum = new Random();
		String p_name="GoogleSurvivors-"+randomNum.nextInt(10);
		String p_desc="Sdet-"+randomNum.nextInt(10);
		HashMap<String,Object> progdataput=new HashMap<String,Object>();
		progdataput.put("programDescription",p_desc);
		progdataput.put("programId",PostRequestSteps.progID_env);
		progdataput.put("programName","");
		progdataput.put("programStatus","");
		req1 = given().spec(requestSpecification()).body(progdataput);
	}

	@Given("user creates PUT request with missing data and valid name for the LMS API endpoint")
	public void user_creates_put_request_with_missing_data_and_valid_name_for_the_lms_api_endpoint() throws IOException {
		
		HashMap<String,Object> progdataput=new HashMap<String,Object>();
		progdataput.put("programDescription","sql");
		progdataput.put("programId","");
		progdataput.put("programName",PostRequestSteps.progname_env);
		progdataput.put("programStatus","inactive");
		req1 = given().spec(requestSpecification()).body(progdataput);
	}
	
	// UPDATE BATCH WITH MISSING FIELDS  AND VALID ID
	
	@Given("user creates PUT request with missing batch data for the LMS API endpoint")
	public void user_creates_put_request_with_missing_batch_data_for_the_lms_api_endpoint() throws IOException {
		HashMap<String,Object> batchdataput=new HashMap<String,Object>();
		batchdataput.put("batchDescription","");
		batchdataput.put("batchId",PostRequestSteps.bacthId_env);
		req1 = given().spec(requestSpecification()).body(batchdataput);
	}
	
	
	// UPDATE USER WITH MISSING FIELDS  AND VALID ID
	
	@Given("user creates put request for missing fields and valid user the LMS API endpoint")
	public void user_creates_put_request_for_missing_fields_and_valid_user_the_lms_api_endpoint() throws IOException {
		HashMap<String,Object> userdataput=new HashMap<String,Object>();
		userdataput.put("userComments","this is admin");
		userdataput.put("userEduPg","bsc");
		userdataput.put("userEduUg","mca");
		userdataput.put("userFirstName","");
		userdataput.put("userLastName","");
		userdataput.put("userId",PostRequestSteps.userId_env);
		userdataput.put("userLinkedinUrl","");
		userdataput.put("userLocation","");
		userdataput.put("userMiddleName","");
		userdataput.put("userPhoneNumber","");
		userdataput.put("userTimeZone","");
		userdataput.put("userVisaStatus","");
		req1 = given().spec(requestSpecification()).body(userdataput);
	}
	
	@Given("user creates put request on user for changing role status with missing data")
	public void user_creates_put_request_on_user_for_changing_role_status_with_missing_data() throws IOException {
		HashMap<String,Object> userdataput=new HashMap<String,Object>();
		userdataput.put("roleId","");
		userdataput.put("userRoleStatus"," ");
		req1 = given().spec(requestSpecification()).body(userdataput);
	}
	
	@Given("user creates put request on user assign user to program batch with missing data")
	public void user_creates_put_request_on_user_assign_user_to_program_batch_with_missing_data() throws IOException {
	    
		
HashMap<String,Object> parent=new HashMap<String,Object>();
		
		HashMap<String,Object> map=new HashMap<String,Object>();
		map.put("batchId","7259");
		map.put("userRoleProgramBatchStatus","active");
		
		Object[] maparray=new Object[1];
		maparray[0]=map;
		
		parent.put("programId","");
		parent.put("roleId","");
		parent.put("userId",PostRequestSteps.userId_env);
		parent.put("userRoleProgramBatches",maparray);
		req1 = given().spec(requestSpecification()).body(parent);
		
	}
	@Given("user creates put request on user to assign user to program batch with InvalidID")
	public void user_creates_put_request_on_user_to_assign_user_to_program_batch_with_invalid_id() throws IOException {
HashMap<String,Object> parent=new HashMap<String,Object>();
		
		HashMap<String,Object> map=new HashMap<String,Object>();
		map.put("batchId",PostRequestSteps.bacthId_env);
		map.put("userRoleProgramBatchStatus","active");
		
		Object[] maparray=new Object[1];
		maparray[0]=map;
		
		parent.put("programId",PostRequestSteps.progID_env);
		parent.put("roleId","R02");
		parent.put("userId",PostRequestSteps.userId_env);
		parent.put("userRoleProgramBatches",maparray);
		req1 = given().spec(requestSpecification()).body(parent);
	}
	
	
	//update assignment with missing field
	
	@Given("user creates put request on Assignment with missing field")
	public void user_creates_put_request_on_assignment_with_missing_field() throws IOException {
		HashMap<String,Object> assigndataput=new HashMap<String,Object>();
		assigndataput.put("assignmentDescription","");
		assigndataput.put("assignmentId","");
		assigndataput.put("assignmentName","");
		assigndataput.put("batchId","");
		assigndataput.put("comments","aaaa");
		assigndataput.put("createdBy","");
		assigndataput.put("dueDate","");
		assigndataput.put("graderId","");
		assigndataput.put("pathAttachment1","/Users/srihari/API/file1.json");
		assigndataput.put("pathAttachment2","/Users/srihari/API/file2.json");
		assigndataput.put("pathAttachment3","/Users/srihari/API/file3.json");
		assigndataput.put("pathAttachment4","/Users/srihari/API/file4.json");
		assigndataput.put("pathAttachment5","/Users/srihari/API/file5.json");
		req1 = given().spec(requestSpecification()).body(assigndataput);
	}

	
	
	//UPDATE ASSIGNMENT SUBMISSION WITH MISSING FIELDS
	@Given("user creates put request on missing fields {string} and {string}")
	public void user_creates_put_request_on_missing_fields_and(String testcaseName, String Sheetname) throws IOException {
		req1 = given().spec(requestSpecification()).body(data.gradeAssignPut(testcaseName,Sheetname));
	}

	@Given("user creates put request on grades with missing fields {string} and {string}")
	public void user_creates_put_request_on_grades_with_missing_fields_and(String testcaseName, String Sheetname) throws IOException {
		req1 = given().spec(requestSpecification()).body(data.gradeAssignPut(testcaseName,Sheetname));
	}

	
	@When("user calls {string} with {string} http request for Put")
	public void user_calls_with_http_request_for_put(String resource, String method) {
		
		API_enum resource_api = API_enum.valueOf(resource);
		if (method.equalsIgnoreCase("PutUser"))
		response = req1.put(resource_api.getresource()+PostRequestSteps.userId_env);
		else if (method.equalsIgnoreCase("PutforUserrolestatus"))
			response = req1.put(resource_api.getresource()+PostRequestSteps.userId_env);
		else if (method.equalsIgnoreCase("PutUserprogbatch"))
			response = req1.put(resource_api.getresource()+"U123");
		else if (method.equalsIgnoreCase("PutProgram"))
			response = req1.put(resource_api.getresource()+PostRequestSteps.progID_env);
		else if (method.equalsIgnoreCase("PutProgramname"))
			response = req1.put(resource_api.getresource()+PostRequestSteps.progname_env);
		else if (method.equalsIgnoreCase("Putbatchid"))
			response = req1.put(resource_api.getresource()+PostRequestSteps.bacthId_env);
		else if (method.equalsIgnoreCase("putAssign"))
			response = req1.put(resource_api.getresource()+PostRequestSteps.AssignId_env);
		else if (method.equalsIgnoreCase("putGRADEsubmit"))
			response = req1.put(resource_api.getresource()+PostRequestSteps.submitID_env);
	}
	
	@Then("User receives 400BadRequest status code with message and boolean success details")
	public void user_receives_400BadRequest_status_code_with_message_and_boolean_success_details() {
		response.then().assertThat().header("Content-Type","application/json")
		.statusCode(400)
				.log().all();
	
	
	}


}
