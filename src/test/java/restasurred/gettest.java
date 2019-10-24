package restasurred;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class gettest {

	public String url;
	public String key;
	public RequestSpecification httpRequest;
	public Response response;
	
	
	//TESTNG METODU ILE ASSERT TEST
	@Test
	public void runtest(String url , String key) {
		
		
		RestAssured.baseURI = url;
		   httpRequest=RestAssured.given();
		   response=httpRequest.request(Method.GET,key);
		  
		  
		  int statusCode=response.getStatusCode();
		  System.out.println("Status code is: "+statusCode);
		  Assert.assertEquals(statusCode, 200);
		  
		  String statusLine=response.getStatusLine();
		  System.out.println("Status line is:"+statusLine);
		  Assert.assertEquals(statusLine, "HTTP/1.1 200 OK");

	}
	
		//GELEN GET BODY"I DONDUREN FONKSIYON
		public String returnpath() {
		
		
		
		  String responseBody=response.getBody().asString();
		  System.out.println(responseBody);
		  
		 return responseBody;

	}
	
}
