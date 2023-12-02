package stepdefinition;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

import java.io.IOException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import utilities.API_enum;
import utilities.ExcelWriter;
import utilities.TestData;
import utilities.Utils;


public class DeleteRequestSteps extends Utils
{
	RequestSpecification req1;
	Response response;
	
	
	@Given("User creates DELETE Request for the LMS API endpoint")
	public void user_creates_delete_request_for_the_lms_api_endpoint() throws IOException {
		req1 = given().spec(requestSpecification());
	}



	@When("User calls {string} with {string} HTTPS Request")
	public void user_calls_with_https_request(String resource, String method) 
	{
		API_enum resource_api = API_enum.valueOf(resource);
		if (method.equalsIgnoreCase("deletebatchid"))
		{
		response = req1.delete(resource_api.getresource()+ PostRequestSteps.bacthId_env);
		}
		else if (method.equalsIgnoreCase("deleteprogramid"))
		{
		response = req1.delete(resource_api.getresource()+PostRequestSteps.progID_env);
		}
		else if (method.equalsIgnoreCase("deleteuserid"))
		{
		response = req1.delete(resource_api.getresource()+ PostRequestSteps.userId_env);
		}
		else if (method.equalsIgnoreCase("deletename"))
		{
		response = req1.delete(resource_api.getresource()+ PostRequestSteps.progname_env);
		}
		else if (method.equalsIgnoreCase("deletesubmitid"))
		{
		response = req1.delete(resource_api.getresource()+ PostRequestSteps.submitID_env);
		}
		else if (method.equalsIgnoreCase("deleteassignid"))
		{
		response = req1.delete(resource_api.getresource()+ PostRequestSteps.AssignId_env);
		}
	}

	@Then("User receives 200Ok status with message")
	public void user_receives_200ok_status_with_message() 
	{
		response.then()
		.statusCode(200).log().all();
	}
	
	


}
