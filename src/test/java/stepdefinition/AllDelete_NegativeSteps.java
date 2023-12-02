package stepdefinition;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

import java.io.IOException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import utilities.API_enum;
import utilities.Utils;

public class AllDelete_NegativeSteps extends Utils {

	RequestSpecification req1;
	Response response;
	
	@Given("User creates DELETE Request with invalid inputs for the LMS API endpoint")
	public void user_creates_delete_request_with_invalid_inputs_for_the_lms_api_endpoint() throws IOException {
		req1 = given().spec(requestSpecification());
	}

	@When("User calls {string} with {string} HTTPS Request for delete")
	public void user_calls_with_https_request_for_delete(String resource, String method) {
		API_enum resource_api = API_enum.valueOf(resource);
		if (method.equalsIgnoreCase("deletebatchid"))
		{
		response = req1.delete(resource_api.getresource()+PostRequestSteps.bacthId_env);
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

	@Then("User receives 404NotFound status with message")
	public void user_receives_404not_found_status_with_message() {
		response.then().assertThat().header("Content-Type","application/json")
		.statusCode(404).log().all();
	}

}
