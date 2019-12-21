package GoogleMap;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import org.testng.annotations.Test;
@Test
public class gmPost {
public void PostData() {
	String b="{"+
			"\"location\":{"+
			"\"lat\":-38.383494,"+
			"\"lng\":33.427362"+
			"},"+
			"\"accuracy\":50,"+
			"\"name\":\"Frontline House\","+
			"\"phone_number\":\"(+91)8862005442\","+
			"\"address\":\"29,sidelayout,cohen\","+
			"\"types\":[\"shoe park\"],"+
			"\"website\":\"http://google.com\","+
			"\"language\":\"French-IN\"}";
	RestAssured.baseURI="https://maps.googleapis.com";
	Response res=given().
	queryParam("key","AIzaSyBCKwihz0mGGp11PmBeUxa1a81xnZ_1XQ4").
	body(b).
	when().post("/maps/api/place/add/json").
	then().assertThat().statusCode(200).and().contentType(ContentType.JSON).and().body("status",equalTo("OK")).
	extract().response();
		
	
	

	
}
}
