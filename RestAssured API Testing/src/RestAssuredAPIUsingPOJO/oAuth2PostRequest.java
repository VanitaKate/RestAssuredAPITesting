package RestAssuredAPIUsingPOJO;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class oAuth2PostRequest {

	@Test
	public void PostRequestToGetToken() {
		Response response=RestAssured.given()
				.formParam("client_id", "VaniKateApp")
				.formParam("client_secret","ad3077738a5d8f20e1d78a92c07e74cc")
				.formParam("grant_type", "client_credentials")
				.post("http://coop.apps.symfonycasts.com/token");
		String Access_Token=response.getBody().asString();
		System.out.println("Access_Token: "+response.jsonPath().get("access_token"));
	}
}
