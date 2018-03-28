package test.java;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class TestIcndbAPI {
	@Test 
	public void testIcndbAPICategories() {
		
		RestAssured.get("http://api.icndb.com/categories")
		.then()
		.body("type", Matchers.equalTo("success"))
		.body("value", Matchers.hasItems("explicit", "nerdy"));

	}

	@Test 
	public void testIcndbAPIJoke100() {
		
		RestAssured.get("http://api.icndb.com/jokes/100")
		.then()
		.body("type", Matchers.equalTo("success"))
		.body("value.joke", Matchers.equalTo("Chuck Norris grinds his coffee with his teeth and boils the water with his own rage."));
	}

	@Test 
	public void testIcndbAPIJoke100JohnDoe() {
		
		RestAssured.get("http://api.icndb.com/jokes/100?firstName=John&lastName=Doe")
		.then()
		.body("type", Matchers.equalTo("success"))
		.body("value.joke", Matchers.equalTo("John Doe grinds his coffee with his teeth and boils the water with his own rage."));
	}

}
