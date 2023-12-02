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

public class AllPut_NegativeSteps extends Utils {
	ResponseSpecification res1;
	RequestSpecification req1;
	Response response;
	
	TestData2 data=new TestData2();
	
	/**** UPDATE PROGRAM WITH INVALID DATA ***/
	
	@Given("user creates PUT request with Invalid ID for the LMS API endpoint from  {string} and {string}")
	public void user_creates_put_request_with_invalid_ID_for_the_lms_api_endpoint_from_and(String testcaseName, String Sheetname) throws IOException {
	
				req1 = given().spec(requestSpecification()).body(data.programPut(testcaseName, Sheetname));
				
	}
	
	
	@Given("user creates PUT request with Invalid name for the LMS API endpoint")
	public void user_creates_put_request_with_invalid_name_for_the_lms_api_endpoint() throws IOException {
		HashMap<String,Object> progdataput=new HashMap<String,Object>();
		progdataput.put("programDescription","selenium");
		progdataput.put("programId",PostRequestSteps.progID_env);
		progdataput.put("programName",PostRequestSteps.progname_env);
		progdataput.put("programStatus","active");
		req1 = given().spec(requestSpecification()).body(progdataput);
	}

	
	
	
	// UPDATE BATCH WITH INVALID DATA
	
	@Given("user creates PUT request with Invalid batchID for the LMS API endpoint from  {string} and {string}")
	public void user_creates_put_request_with_invalid_batch_id_for_the_lms_api_endpoint_from_and(String testcaseName, String Sheetname) throws IOException {
		req1 = given().spec(requestSpecification()).body(data.batchPut(testcaseName, Sheetname));
	}

	
	
	
	//UPDATA USER WITH INVALID DATA
	
	@Given("user creates put request for invalid user the LMS API endpoint from  {string} and {string}")
	public void user_creates_put_request_for_invalid_user_the_lms_api_endpoint_from_and(String testcaseName, String Sheetname) throws IOException {
		req1 = given().spec(requestSpecification()).body(data.UserPut(testcaseName, Sheetname));
	}

	

	@Given("user creates put request on user for changing role status with invalid data {string} and {string}")
	public void user_creates_put_request_on_user_for_changing_role_status_with_invalid_data_and(String testcaseName, String Sheetname) throws IOException {
		HashMap<String,Object> userdataput=new HashMap<String,Object>();
		userdataput.put("roleId",PostRequestSteps.userId_env);
		userdataput.put("userRoleStatus","online");
		req1 = given().spec(requestSpecification()).body(userdataput);
	}

	

	
	
	
	@When("user call {string} with {string} http request for Put")
	public void user_call_with_http_request_for_put(String resource, String method) {
		
		API_enum resource_api = API_enum.valueOf(resource);
		if (method.equalsIgnoreCase("PutUser"))
		response = req1.put(resource_api.getresource()+PostRequestSteps.userId_env);
		else if (method.equalsIgnoreCase("PutforUserrolestatus"))
			response = req1.put(resource_api.getresource()+"U861");
		
		else if (method.equalsIgnoreCase("PutProgram"))
			response = req1.put(resource_api.getresource()+PostRequestSteps.progID_env);
		else if (method.equalsIgnoreCase("PutProgramname"))
			response = req1.put(resource_api.getresource()+PostRequestSteps.progname_env);
		else if (method.equalsIgnoreCase("Putbatchid"))
			response = req1.put(resource_api.getresource()+PostRequestSteps.bacthId_env);
		else if (method.equalsIgnoreCase("putAssign"))
			response = req1.put(resource_api.getresource()+PostRequestSteps.AssignId_env);
		else if (method.equalsIgnoreCase("putAssignsubmit"))
			response = req1.put(resource_api.getresource()+PostRequestSteps.submitID_env);
	}

	
	//UPDATE ASSIGNMENT WITH INVALID ID
	@Given("user creates put request on Assignment with Invalid Id  {string} and {string}")
	public void user_creates_put_request_on_assignment_with_invalid_id_and(String testcaseName, String Sheetname) throws IOException {
		req1 = given().spec(requestSpecification()).body(data.assignPut(testcaseName,Sheetname));
	}

	// UPDATE ON ASSIGNMENT SUBMIT INVALID ID
	
	@Given("user creates put request on Invalid submitid {string} and {string}")
	public void user_creates_put_request_on_invalid_submitid_and(String testcaseName, String Sheetname) throws IOException {
		req1 = given().spec(requestSpecification()).body(data.assignsubmitPut(testcaseName,Sheetname));
	}

	@Given("user creates put request on grades Invalid submitid {string} and {string}")
	public void user_creates_put_request_on_grades_invalid_submitid_and(String testcaseName, String Sheetname) throws IOException {
		req1 = given().spec(requestSpecification()).body(data.assignsubmitPut(testcaseName,Sheetname));
	}
	
	@Then("User receives 404NotFound status code with message and boolean success details")
	public void user_receives_404NotFound_status_code_with_message_and_boolean_success_details() {
		response.then().assertThat().header("Content-Type","application/json")
		.statusCode(404).log().all();
	}
	
	

}
