package RestAssuredAPIUsingPOJO;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class FreelancerGetRequestforPHPproject {
	@Test
	public void GetFreelancerforPHP() {
       String response=RestAssured.given().
		when().
		get("https://www.freelancer.com/api/projects/0.1/jobs/search/?job_names=PHP").
		then().
		extract().body().asString();
       System.out.println(response);
		/*
		 * Response resp=RestAssured.get(
		 * "https://www.freelancer.com/api/projects/0.1/jobs/search/?job_names=PHP");
		 * System.out.println("Response Body: " +resp.body().asString());
		 * System.out.println("StatusCode: " +resp.getStatusCode());
		 * System.out.println("Status: " +resp.getStatusCode());
		 * System.out.println("SessionID: " +resp.getSessionId());
		 * System.out.println("requestTime: " +resp.time());
		 */

	}

}
