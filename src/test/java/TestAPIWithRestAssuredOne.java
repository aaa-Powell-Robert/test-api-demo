package test.java;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
//import io.restassured.RestAssured.*;
//import io.restassured.matcher.RestAssuredMatchers.*;
//import org.hamcrest.Matchers.*;

import org.hamcrest.Matchers;

public class TestAPIWithRestAssuredOne {

	@Test 
	public void testIcndbAPICategories() {
		
		RestAssured.get("http://api.icndb.com/categories")
		.then()
		.body("type", Matchers.equalTo("success"))
		.body("value", Matchers.hasItems("explicit", "nerdy", "foobar"));

	}
}
