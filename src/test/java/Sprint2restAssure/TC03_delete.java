package Sprint2restAssure;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class TC03_delete {
	
	
	@Test
	public void TC03_Delete() {
		RestAssured.when().
		delete("https://70ssu4a992.execute-api.us-west-2.amazonaws.com/items/101").
		then().
		statusCode(200).log().all();
		
	}

}
