package GoogleMap;


import static org.hamcrest.Matchers.equalTo;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;
@Test
public class GoogleMapBasic {
public void autoRestAssured() {
	RestAssured.baseURI="https://maps.googleapis.com";
	
//	RequestSpecification httpRequest=RestAssured.given();
//	JSONObject requestparams=new JSONObject();
	given().param("location","-33.8670522,151.1957362").
	param("radius","500").
	param("key","AIzaSyBCKwihz0mGGp11PmBeUxa1a81xnZ_1XQ4").
	when().get("/maps/api/place/nearbysearch/json").
	then().assertThat().statusCode(200).and().contentType(ContentType.JSON).and().
	body("results[0].place_id", equalTo("ChIJP3Sa8ziYEmsRUKgyFmh9AQM")).and().
	header("Server","pablo");
}
}
