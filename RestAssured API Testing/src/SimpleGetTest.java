import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class SimpleGetTest {
	//
	@Test
 public void GetWeatherDetails() {
	 RestAssured.baseURI="http://restapi.demoqa.com/utilities/weather/city";
	 RequestSpecification httpRequest=RestAssured.given();
	 Response response=httpRequest.request(Method.GET, "/Hyderabad");
	 String ResponseBody=response.getBody().asString();
	 System.out.println(ResponseBody);
 }
	/*@Test
	public void test_NumberOfCircuitsFor2017Season_ShouldBe20() {
	        
	    given().
	    when().
	        get("http://ergast.com/api/f1/2017/circuits.json").
	    then().
	        assertThat().
	        body("MRData.CircuitTable.Circuits.circuitId",hasSize(20));
	}*/
}
