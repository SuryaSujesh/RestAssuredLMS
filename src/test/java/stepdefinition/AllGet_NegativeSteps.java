package stepdefinition;

import static io.restassured.RestAssured.given;

import java.io.IOException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import utilities.API_enum;
import utilities.Utils;

public class AllGet_NegativeSteps extends Utils {
	ResponseSpecification res1;
	RequestSpecification req1;
	Response response;

	@Given("User creates GET Request for invalid inputs the LMS API endpoint")
	public void user_creates_get_request_for_invalid_inputs_the_lms_api_endpoint() throws IOException {
		req1 = given().spec(requestSpecification());
	}
	
	@When("User calls {string} with {string} HTTPS Request for Negative get request")
	public void user_calls_with_https_request_for_negative_get_request(String resource, String method) throws IOException {
		API_enum resource_api = API_enum.valueOf(resource);
		if (method.equalsIgnoreCase("getAll"))
		{
		response = req1.get(resource_api.getresource());
		}
		else if (method.equalsIgnoreCase("GetstudentID"))
		{
		response = req1.get(resource_api.getresource()+"U2341");
		}
		else if (method.equalsIgnoreCase("GetByUSerID"))
		{
		response = req1.get(resource_api.getresource()+ PostRequestSteps.userId_env);
		}
		else if (method.equalsIgnoreCase("getByBatchID"))
		{
		response = req1.get(resource_api.getresource()+PostRequestSteps.bacthId_env);
		}
		
		else if (method.equalsIgnoreCase("GetAssignID"))
		{
		response = req1.get(resource_api.getresource()+ PostRequestSteps.AssignId_env);
		}
		else if (method.equalsIgnoreCase("getProgID"))
		{
		response = req1.get(resource_api.getresource()+ PostRequestSteps.progID_env);
		}
		else if (method.equalsIgnoreCase("getInvalidBatchID"))
		{
		response = req1.get(resource_api.getresource()+786);
		}
	}

	@Then("User receives NotFound404 message")
	public void user_receives_not_found404_message() {
		
		response.then().assertThat().header("Content-Type","application/json")
		.statusCode(404).log().all();
		
	}

	

}
