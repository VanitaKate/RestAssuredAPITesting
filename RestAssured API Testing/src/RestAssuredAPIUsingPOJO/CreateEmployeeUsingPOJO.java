package RestAssuredAPIUsingPOJO;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.RestAssured;

import io.restassured.response.Response;

public class CreateEmployeeUsingPOJO {

	@Test
	public void createEmployee() throws JsonProcessingException {
		EmployeeFieldsPOJO EmployeeFieldsPOJO=new EmployeeFieldsPOJO("VasudhaK", 91000, 35);
		PayloadUsingPOJO payload=new PayloadUsingPOJO(EmployeeFieldsPOJO);
		ObjectMapper objMap=new ObjectMapper();
		String MyData=objMap.writerWithDefaultPrettyPrinter().writeValueAsString(EmployeeFieldsPOJO);
		
		System.out.println(MyData);
		
		Response response=RestAssured.
				given()
				.body(MyData)
				.post("http://dummy.restapiexample.com/api/v1/create");
		System.out.println(response.getStatusCode());
		System.out.println(response.getBody().asString());
		System.out.println(response.getStatusLine());
		System.out.println(response.time());
	}
}
