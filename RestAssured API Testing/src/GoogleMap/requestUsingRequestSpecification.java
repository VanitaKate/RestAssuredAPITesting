package GoogleMap;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class requestUsingRequestSpecification {
@Test
	void restRequest(){
		RestAssured.baseURI="https://restapi.demoqa.com/utilities/weather/city";
		RequestSpecification httpRequest=RestAssured.given();
		Response response=httpRequest.request(Method.GET, "/Hyderabad");
		System.out.println("Status Code is: " +response.getStatusCode());
		System.out.println("Content Type is: " +response.getContentType());
		System.out.println("Session ID is: " +response.getSessionId());
		System.out.println("Response Body: "+response.body().asString());
		
	}
}
