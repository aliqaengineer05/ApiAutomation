package ApiAutomationTask.ApiAutomationTask;

import static com.jayway.restassured.RestAssured.given;
import static org.junit.matchers.JUnitMatchers.hasItems;

import org.testng.annotations.Test;

public class TC002_CheckAndValidateResponse {
	@Test
	  public void CheckCountriesResponse ()  {
		 given().get("http://services.groupkt.com/country/get/all")
		 .then()
		 .body("RestResponse.result.alpha2_code", hasItems("US", "DE" ,"GB"));
	  }
	
	@Test
	  public void CheckIndidualResponsefor_USA ()  {
		 given().get("http://services.groupkt.com/country/get/all")
		 .then()
		 .body("RestResponse.result.alpha2_code", hasItems("US"));
	  }
	@Test
	  public void CheckIndidualResponsefor_DE ()  {
		 given().get("http://services.groupkt.com/country/get/all")
		 .then()
		 .body("RestResponse.result.alpha2_code", hasItems("DE"));
	  }
	
	@Test
	  public void CheckIndidualResponsefor_GB ()  {
		 given().get("http://services.groupkt.com/country/get/all")
		 .then()
		 .body("RestResponse.result.alpha2_code", hasItems("GB"));
	  }
	@Test
	  public void ValidateResponseforInexistentCountries ()  {
		 given().get("http://services.groupkt.com/country/get/all")
		 .then()
		 .body("RestResponse.result.alpha2_code", hasItems("Iatly"));
	  }
}
