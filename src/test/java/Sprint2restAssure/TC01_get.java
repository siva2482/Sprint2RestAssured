package Sprint2restAssure;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class TC01_get {
	@Test
	public void run()
	{
		// specify base url
		RestAssured.baseURI = "https://70ssu4a992.execute-api.us-west-2.amazonaws.com/items/1";
		/************/
		Response response = null;
		response = RestAssured
		.given()
		.when()
		.get();

		System.out.println("Response is :\n"+response.getBody().asString());
		System.out.println(response.getHeader("content-type"));
		int statusCode = response.getStatusCode();
		System.out.println(response.getStatusCode());
		/************/
		Assert.assertEquals(statusCode, 200);
		// create request object
		////RequestSpecification request = RestAssured.given();
		// create response object
		//Response response = request.request(Method.GET, "");
		//Response response2 = get("");
		
	}
		@Test
		public void run2()
		{
		Response response1 = RestAssured.get("https://70ssu4a992.execute-api.us-west-2.amazonaws.com/items/1");
		System.out.println("==============================");
		System.out.println(response1.asString());
		System.out.println(response1.getStatusCode());
		System.out.println(response1.getStatusLine());
		System.out.println(response1.getBody().asString());
		System.out.println(response1.getHeader("content-type"));
		System.out.println(response1.getTime());
		}

}
