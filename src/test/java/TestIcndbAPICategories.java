package test.java;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

import org.hamcrest.Matchers;

public class TestIcndbAPICategories {

	@Test 
	public void testIcndbAPICategoriesPASS() {
		
		RestAssured.get("http://api.icndb.com/categories")
		.then()
		.body("type", Matchers.equalTo("success"))
		.body("value", Matchers.hasItems("explicit", "nerdy"));

	}

	@Test 
	public void testIcndbAPICategoriesFAIL() {
		
		RestAssured.get("http://api.icndb.com/categories")
		.then()
		.body("type", Matchers.equalTo("success"))
		.body("value", Matchers.hasItems("explicit", "nerdy", "foobar"));

	}
}
