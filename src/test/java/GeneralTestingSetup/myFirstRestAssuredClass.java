package GeneralTestingSetup;
import java.util.ArrayList;
import static io.restassured.RestAssured.*;
import static java.util.concurrent.TimeUnit.MILLISECONDS;


public class myFirstRestAssuredClass {
	   final static String url="http://demo.guru99.com/V4/sinkministatement.php?CUSTOMER_ID=68195&PASSWORD=1234!&Account_No=1";

	   public static void main(String args[]) {

	     getResponseBody();
	     getResponseStatus();
	     
	     getResponseBodyWithWrongUserNameAndPassword();
	     getResponseStatusWithWrongUserNameAndPassword();

	; }

	   //This will fetch the response body as is and log it. given and when are optional here
	   public static void getResponseBody(){
	       given().when().get(url).then().log()
	      .all();

	  given().queryParam("CUSTOMER_ID","68195")
	               .queryParam("PASSWORD","1234!")
	               .queryParam("Account_No","1") .when().get("http://demo.guru99.com/V4/sinkministatement.php").then().log().body();
	   }

	public static void getResponseStatus(){
	   int statusCode= given().queryParam("CUSTOMER_ID","68195")
	           .queryParam("PASSWORD","1234!")
	           .queryParam("Account_No","1")
	           .when().get("http://demo.guru99.com/V4/sinkministatement.php").getStatusCode();
	   System.out.println("The response status is "+statusCode);

	   given().when().get(url).then().assertThat().statusCode(200);
	}

	
	   //This will fetch the response body as is and log it. given and when are optional here
	   public static void getResponseBodyWithWrongUserNameAndPassword(){
	       given().when().get(url).then().log()
	      .all();

	  given().queryParam("CUSTOMER_ID","22332368195")
	               .queryParam("PASSWORD","123453345e678!")
	               .queryParam("Account_No","1") .when().get("http://demo.guru99.com/V4/sinkministatement.php").then().log().body();
	   }

	public static void getResponseStatusWithWrongUserNameAndPassword(){
	   int statusCode= given().queryParam("CUSTOMER_ID","22332368195")
	           .queryParam("PASSWORD","123453345e678")
	           .queryParam("Account_No","1")
	           .when().get("http://demo.guru99.com/V4/sinkministatement.php").getStatusCode();
	   System.out.println("The response status is "+statusCode);

	   given().when().get(url).then().assertThat().statusCode(200);
	}
	
	}