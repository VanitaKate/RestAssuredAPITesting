package GoogleMap;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class postRequestToCreateCustomer {
	@Test
	void restRequest(){
		RestAssured.baseURI="https://restapi.demoqa.com/customers";
		RequestSpecification httpRequest=RestAssured.given();
		JSONObject requestParams=new JSONObject();
		requestParams.put("FirstName", "Kai");
		requestParams.put("LastName", "Jackson");
		requestParams.put("UserName", "JohnJ");
		requestParams.put("Email", "vasudha1981@yahoo.com");
		httpRequest.header("Content-Type", "application/json");
		httpRequest.body(requestParams.toJSONString());
		Response response=httpRequest.request(Method.POST, "/register");
		System.out.println("Status Code is: " +response.getStatusCode());
		
	//	System.out.println("Success Code is : " +(response.jsonPath().get("SuccessCode")));
		System.out.println("Content Type is: " +response.getContentType());
		System.out.println("Session ID is: " +response.getSessionId());
		
		System.out.println("Response Body: "+response.body().asString());
		
	}
}
