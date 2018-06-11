package ApiAutomationTask.ApiAutomationTask;

import static com.jayway.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class TC001_ChecktheAllStatus {
	@Test
	  public void CheckResponsefor200 ()  {
		 given().get("http://services.groupkt.com/country/get/all").then().statusCode(200);
	  }
	  
	  @Test
	  public void CheckResponsefor204 ()  {
		 given().get("http://services.groupkt.com/country/get/all").then().statusCode(204);

	  }
	  @Test
	  public void CheckResponsefor504 ()  {
		 given().get("http://services.groupkt.com/country/get/all").then().statusCode(504);

	  }
	  
	  @Test
	  public void CheckResponsefor501 ()  {
		 given().get("http://services.groupkt.com/country/get/all").then().statusCode(501);

	  } 
	  @Test
	  public void CheckResponsefor415 ()  {
		 given().get("http://services.groupkt.com/country/get/all").then().statusCode(415);

	  }
	  @Test
	  public void CheckResponsefor412 ()  {
		 given().get("http://services.groupkt.com/country/get/all").then().statusCode(412);

	  } 
	  @Test
	  public void CheckResponsefor406 ()  {
		 given().get("http://services.groupkt.com/country/get/all").then().statusCode(406);

	  } 
	  @Test
	  public void CheckResponsefor405 ()  {
		 given().get("http://services.groupkt.com/country/get/all").then().statusCode(405);

	  } 
	  
	  @Test
	  public void CheckResponsefor404 ()  {
		 given().get("http://services.groupkt.com/country/get/all").then().statusCode(404);

	  }
	  
	  @Test
	  public void CheckResponsefor401 ()  {
		 given().get("http://services.groupkt.com/country/get/all").then().statusCode(401);

	  }
	  
	  @Test
	  public void CheckResponsefor400 ()  {
		 given().get("http://services.groupkt.com/country/get/all").then().statusCode(400);

	  }
	  
	  @Test
	  public void CheckResponsefor500 ()  {
		 given().get("http://services.groupkt.com/country/get/all").then().statusCode(500);

	  } 
}
