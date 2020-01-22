package RestAssuredAPIUsingPOJO;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class oAuth2PostRequest {

	@Test
	public void PostRequestToGetTokenForVaniKateApp() {
		Response response=RestAssured.given()
				.formParam("client_id", "VaniKateApp")
				.formParam("client_secret","ad3077738a5d8f20e1d78a92c07e74cc")
				.formParam("grant_type", "client_credentials")
				.post("http://coop.apps.symfonycasts.com/token");
		String Access_Token=response.getBody().asString();
		System.out.println("Access_Token forVaniKateApp: "+response.jsonPath().get("access_token"));
	}
	
	@Test
	public void PostRequestToGetTokenForMyRestApp() {
		Response response=RestAssured.given()
				.formParam("client_id", "MyRestApp")
				.formParam("client_secret","80ce0462ab246956e3822aa9770bb8a4")
				.formParam("grant_type", "client_credentials")
				.post("http://coop.apps.symfonycasts.com/token");
		String Access_Token=response.getBody().asString();
		System.out.println("Access_Token for MyRestApp: "+response.jsonPath().get("access_token"));
	}
}
