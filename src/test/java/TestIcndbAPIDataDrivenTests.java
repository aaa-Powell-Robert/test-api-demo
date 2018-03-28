package test.java;

import java.util.HashMap;
import java.util.Map;

import org.hamcrest.Matchers;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class TestIcndbAPIDataDrivenTests {
	
	@DataProvider(name = "icndbdata")
	public String[][] createIcndbTestData() {
	         
	    return new String[][] {
            	{"99", "Chuck Norris has 12 moons. One of those moons is the Earth."},
	            {"100", "Chuck Norris grinds his coffee with his teeth and boils the water with his own rage."},
	            {"101", "Archaeologists unearthed an old english dictionary dating back to the year 1236. It defined &quot;victim&quot; as &quot;one who has encountered Chuck Norris&quot;"}
	    };
	}
	
	@Test(dataProvider = "icndbdata")
	public void icndbDataTest(String id, String joke) {
	         
	    RestAssured.given().
	        pathParams("id", id).
	    when().
	        get("http://api.icndb.com/jokes/{id}").
	    then().
	        assertThat().
	        //body("value.id", Matchers.equalTo(id)).
	        body("value.joke", Matchers.equalTo(joke));
	}
}
