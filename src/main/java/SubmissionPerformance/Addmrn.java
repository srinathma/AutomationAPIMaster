package SubmissionPerformance;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.internal.util.IOUtils;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class Addmrn {

	public static void main(String[] args) throws FileNotFoundException {
		//String mrnURLadd = Helper.propertyReader(Helper.commonFilePath, "addPostMRN");
		//RequestSpecification request = RestAssured.given();
		RestAssured.proxy("dk.ibg.apmoller.net", 8887);
		FileInputStream file = new FileInputStream(new File
				 (System.getProperty("user.dir")+"\\TestData\\MRN.json"));
		
		Response resp= 
				given()
				.header("Content-Type","application/json").header("Cookie","ARRAffinity=e6544bf19e630e56176871ae002063ac11fc26dd97b84aa42ebbeab32bc611e2").header("X-API-KEY","69ba14f0-2edb-4b87-96ca-789125790b09").
				header("X-APP-ID","GCD").body(file).
				  when().post("https://gcd-compliance.maersk-digital.net/v1/compliance/manifestation");
		System.out.println(resp.getStatusCode());
		
		System.out.println(resp.getBody().asString());

	}
}


