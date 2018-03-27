package test.java;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;


public class TestAPIWithOkHttpClient {
	String RequestURL = "http://www.icndb.com";
		
	@Test
	public void testAPIWithOkHttpClientGET() {
		
		OkHttpClient client = new OkHttpClient ();

		Request request = new Request.Builder()
				.url( RequestURL )
				.get( )
		        .build ();
		try {

			Response response = client.newCall ( request ).execute ();
			System.out.println ( response.isSuccessful () );

			String resBody = response.body ().string ();
			System.out.println ( "responseBody:" + resBody.toString () );

			String resMsg = response.message ();
			System.out.println ( "responseMsg:" + resMsg );

			int resCode = response.code ();
			System.out.println ( "responseCode:" + resCode );

			Assert.assertEquals ( resMsg, "OK", "Error! Response message is NOT shown as success message" );
			Assert.assertEquals ( resCode, 200, "Error! Response code is NOT shown as success code 200" );

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace ();
		}
	}

	@Test
	public void testAPIWithOkHttpClientPOST() {
		String RequestURL = "http://www.icndb.com";
		String RequestJSON = "";
		
		OkHttpClient client = new OkHttpClient ();
		MediaType mediaType = MediaType.parse ( "application/json" );
		RequestBody body = RequestBody.create ( mediaType, RequestJSON );

		Request request = new Request.Builder()
				.url ( RequestURL )
				.post ( body )
				.addHeader ( "content-type", "application/json" )
		        .addHeader ( "cache-control", "no-cache" )
		        .build ();
		try {

			Response response = client.newCall ( request ).execute ();
			System.out.println ( response.isSuccessful () );

			String resBody = response.body ().string ();
			System.out.println ( "responseBody:" + resBody.toString () );

			String resMsg = response.message ();
			System.out.println ( "responseMsg:" + resMsg );

			int resCode = response.code ();
			System.out.println ( "responseCode:" + resCode );

			Assert.assertEquals ( resMsg, "OK", "Error! Response message is NOT shown as success message" );
			Assert.assertEquals ( resCode, 200, "Error! Response code is NOT shown as success code 200" );

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace ();
		}
	}
}
