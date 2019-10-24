package restasurred;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class postcheck {

	
	
	@Test
	void posttest(String url, String key, String name, String job) {
		
		
		  RestAssured.baseURI=url;
		  
		  RequestSpecification httpRequest=RestAssured.given();
		 
		   
		  JSONObject requestParams=new JSONObject();
		  
		  requestParams.put("name",name);
		  requestParams.put("job",job);
		  
		  
		  
		  httpRequest.header("Content-Type","application/json");

		  httpRequest.body(requestParams.toJSONString()); 
		  Response response=httpRequest.request(Method.POST,key);

		  
		  String responseBody=response.getBody().asString();
		  System.out.println("Response Body is:" +responseBody);
		  
		  int statusCode=response.getStatusCode();
		  System.out.println("Status code is: "+statusCode);
		  Assert.assertEquals(statusCode, 201);
		  
		  String successCode=response.jsonPath().get("SuccessCode");
		//Assert.assertEquals(successCode, " null");

		  System.out.println("succes  code is: "+successCode);


	}
	
	
}
