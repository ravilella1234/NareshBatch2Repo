package apipack;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;
public class NewTest 
{
	
  @Test
  public void test1() 
  {
	  //Response response = RestAssured.get("https://reqres.in/api/users?page=2");
	  Response response = get("https://reqres.in/api/users?page=2");
	  System.out.println(response.getStatusCode());
	  System.out.println(response.getTime());
	  System.out.println(response.body().asString());
	  System.out.println(response.getStatusLine());
	  System.out.println(response.getHeader("content-type"));
	  
	  int statuscode = response.getStatusCode();
	  Assert.assertEquals(statuscode, 200);
  }
  
  
  @Test
  public void test2()
  {
	  baseURI = "https://reqres.in/api";
	  given().get("/users?page=2").then().statusCode(200);
  }
  
  @Test
  public void test3()
  {
	  baseURI = "https://reqres.in/api";
	  given().
	  	get("/users?page=2").
	  then().
	  	statusCode(200).
	  	body("data[1].id", equalTo(8)).
	  	log().all();
  }
  
}
