package pojo;


import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.response.Response;
import utils.Helper;
public class Test {
	
	
	public static String test1234() throws JsonParseException, JsonMappingException, IOException {
	
		String value=null;
	ObjectMapper mapper = new ObjectMapper();
    User payload = mapper.readValue("C:\\Users\\srm058\\Desktop\\APITEST\\APITEST\\TestData\\testdataPost.json", User.class);
    
    
   // C:\Users\srm058\Desktop\APITEST\APITEST\TestData
    // error is resolved now you can user payload object in your body of post call
    
    String baseUrlRoute = Helper.propertyReader(Helper.commonFilePath, "baseUrlRoute");
	String baseUriRoute = Helper.propertyReader(Helper.commonFilePath, "baseUriRoute");
	Helper.loginfo("Hitting API URL :- ", baseUrlRoute + baseUriRoute);
	
	System.out.println(System.getProperty("user.dir"));
	
	//FileInputStream file = new FileInputStream(new File(System.getProperty("user.dir") + "\\TestData\\testdataPost.json"));
	Response resp= 
			given().header("Content-Type","application/json").header("Cookie","ARRAffinity=e6544bf19e630e56176871ae002063ac11fc26dd97b84aa42ebbeab32bc611e2")
			.body(payload)
			.when().post(baseUrlRoute + baseUriRoute);
			assertEquals(resp.getStatusCode(),200);
    return value ;
	}
    
}
