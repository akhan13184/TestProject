package StepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class RestAssuredSteps {
	
    private Response response;

    @Given("a REST API endpoint of \"([^\"]*)\"")
    public void setApiEndpoint(String URL) {
        RestAssured.baseURI = URL;
    }

    @When("I send a GET request of \"([^\"]*)\"")
    public void sendGetRequest(String getrequest) {
        response = RestAssured.get(getrequest);
    }

    @Then("the response status code should be {int}")
    public void verifyStatusCode(int expectedStatusCode) {
        response.then().statusCode(expectedStatusCode);
    }	

}
