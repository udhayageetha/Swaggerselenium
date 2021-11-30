package com.test.restAssured;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class TC002_Post_Request {
	@Test
	public void post() {

		RestAssured.baseURI = "https://jsonplaceholder.typicode.com";

		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();

		requestParams.put("userid", "10");
		requestParams.put("id", "101");

		httpRequest.header("ContentType","application/json");
		httpRequest.body(requestParams.toJSONString());

		Response response = httpRequest.request(Method.POST,"/posts");

		String responseBody = response.getBody().asString();
	
		
		System.out.println(responseBody);

		Object nameValue = response.jsonPath().get("userid");

		System.out.println(nameValue);

	



	}


}
