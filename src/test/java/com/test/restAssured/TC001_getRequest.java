package com.test.restAssured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;

import io.restassured.specification.RequestSpecification;
@Test
public class TC001_getRequest {

	public void getResponse() {

		RestAssured.baseURI = "https://jsonplaceholder.typicode.com/posts";

		RequestSpecification httpRequest = RestAssured.given();

		Response response = httpRequest.request(Method.GET, "1");

		String responseBody =   response.getBody().asString();

		System.out.println("Response BodyElementType is:"+responseBody);








	}
}
