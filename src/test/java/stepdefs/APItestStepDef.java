package stepdefs;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import pojo.User;
import utils.BaseTest;
import utils.Helper;
import utils.ResponseBLOB;

import static io.restassured.RestAssured.given;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;

import org.apache.commons.lang3.RandomStringUtils;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.testng.Assert;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.inject.Inject;

import apiTest.GetCountryData;
import apiTest.UserTest;
import apiTest.UserTest;


public class APItestStepDef {
	ResponseBLOB resp=new ResponseBLOB();
	
	UserTest userTest=new UserTest();
	
	






@When("^user create booking information for \"([^\"]*)\" with \"([^\"]*)\" having \"([^\"]*)\" with \\\"([^\\\"]*)\\\" for \"([^\"]*)\"$")
public void user_create_a_post_body_for_with_having_with(String event, String param, String pramvalue, String dqeApplicable, String bookingType) throws Throwable {

	
	userTest.insertDatainDB(event,param,pramvalue,dqeApplicable,bookingType);
	
	
	
	
	
	
	
	
	/*
	 * if(event.equalsIgnoreCase("CREATE")) { userTest.updatePostBodyForBol(event,
	 * param, pramvalue, dqeApplicable); } else {
	 * userTest.GetServiceCall("getBOLService",event, dqeApplicable);
	 * userTest.updatePostBodyForBol(event, param, pramvalue, dqeApplicable); }
	 */
	
}



@When("^call GETComplianceObject service to validate using compliance ID for \"([^\"]*)\" with \"([^\"]*)\" having \"([^\"]*)\" with \"([^\"]*)\"$")
public void call_GETComplianceObject_service_to_validate_using_compliance_ID_for_with_having_with(String event, String param, String pramvalue, String dqeApplicable) throws Throwable {
	Thread.sleep(5000);
	userTest.GetComplianceObjectUsingCmpID(event, dqeApplicable);
}




@When("^call GETDQEObject service to validate DQE using compliance ID for \"([^\"]*)\" with \"([^\"]*)\" having \"([^\"]*)\" with \"([^\"]*)\"$")
public void call_GETDQEObject_service_to_validate_DQE_using_compliance_ID_for_with_having_with(String event, String param, String pramvalue, String dqeApplicable) throws Throwable {
    userTest.GetDQeObjectUsingCmpID(event, dqeApplicable);
}



@When("^BOL submitted automatically falls in submission timeline for \"([^\"]*)\"$")
public void bol_submitted_automatically_falls_in_submission_timeline_for(String event) throws Throwable {
	
	if(event.contains("Issue_Verify_Copy_of_TPDOC_Closed")&&Helper.country.contains("DKIMP")) {
		Thread.sleep(15000);
		resp.createXMLREsponse();
		//resp.UploadToBlob();
	
	}
	else if(event.contains("Issue_Verify_Copy_of_TPDOC_Closed"))
			userTest.checkApprovedStatus(event);
	
}

//Download file from blob
@Then("^download the file$")
public void download_the_file() throws Throwable {
	//resp.DownloadFromBlob();
	//resp.UploadToBlobthroughService();
	
	
	ObjectMapper mapper=new ObjectMapper();
	User bodyload = mapper.readValue(new File("C:\\Vijay\\LatestJSON\\Denamrk_imp.json"), User.class);
	bodyload=GetCountryData.setCountryspecificData(bodyload);
	bodyload.getData().setBolNumber("BOL005210");;
	bodyload.setKey("BOL005210");
	bodyload.setEventType("CREATE");
	
	String baseUrlRoute = Helper.propertyReader(Helper.commonFilePath, "baseUrlRoute");
	String baseUriRoute = Helper.propertyReader(Helper.commonFilePath, "baseUriRoute");

	Response resp= 
			given()
			.header("Content-Type","application/json").header("Cookie","ARRAffinity=e6544bf19e630e56176871ae002063ac11fc26dd97b84aa42ebbeab32bc611e2").body(bodyload).
			when()
			.post(baseUrlRoute + baseUriRoute);
	
	if(resp.getStatusCode()!=200)
		Assert.fail("status is not 200 it is : "+resp.getStatusCode());
}



@When("^user create booking information for \"([^\"]*)\" with \"([^\"]*)\" ,\"([^\"]*)\" ,\"([^\"]*)\",\"([^\"]*)\", \"([^\"]*)\"$")
public void user_create_booking_information_for_with(String Event, String operatorcode, String param1, String param1value, String param2, String param2value,String dqeFlag) throws Throwable {
	
	
	}

@When("^call GETComplianceObject service to validate using compliance ID for \"([^\"]*)\" with \"([^\"]*)\" ,\"([^\"]*)\" \"([^\"]*)\",\"([^\"]*)\" \"([^\"]*)\"$")
public void call_GETComplianceObject_service_to_validate_using_compliance_ID_for_with(String event, String arg2, String arg3, String arg4, String arg5, String arg6) throws Throwable {
	//userTest.GetComplianceObjectUsingCmpID(event, "N");
	userTest.GetServiceCall(event,"N");
}


	/*
	 * @When("^user amends booking information for \"([^\"]*)\" with \"([^\"]*)\" having \"([^\"]*)\" with \"([^\"]*)\" for \"([^\"]*)\"$"
	 * ) public void
	 * user_amends_booking_information_for_something_with_something_having_something_with_something_for_something
	 * (String event, String parameter, String value, String dqeapplicable, String
	 * type) throws Throwable { userTest.amendedBolNo();
	 * 
	 * 
	 * }
	 */
    


@When("^user calls get port call service$")
public void user_calls_get_port_call_service() throws Throwable {
    userTest.GetPortCallObject();
}


@When("^user create booking information for \"([^\"]*)\" for \"([^\"]*)\"$")
public void user_create_booking_information_for_for(String event, String type,String dqeFlag) throws Throwable {
	
   
}


@When("^call GETComplianceObject service to validate using compliance ID for \"([^\"]*)\" for \"([^\"]*)\"$")
public void call_GETComplianceObject_service_to_validate_using_compliance_ID_for_for(String event, String arg2) throws Throwable {
	userTest.GetComplianceObjectUsingCmpID(event, "N");
}


@Then("^call \"([^\"]*)\" for \"([^\"]*)\" to validate with \"([^\"]*)\"$")
public void call_for_to_validate_with(String serviceName, String Event, String dqe) throws Throwable {
  
	Thread.sleep(10000);
	userTest.GetServiceCall(serviceName,Event,dqe);
}



//response upload
@When("^user upload \"([^\"]*)\" response$")
public void user_upload_response(String arg1) throws Throwable {
    
}

@Then("^Verify \"([^\"]*)\" for the manifest for \"([^\"]*)\"$")
public void verify_for_the_manifest_for(String status, String event) throws Throwable {
   if(event.contains("Verify_Copy")&&Helper.country.contains("DKIMP")||Helper.country.contains("DKIMP"))
	   userTest.verifySubmissionStatus();
}





// vijay 4 wall testing


@Then("^BOL data is post using post call for four wall testing for \"([^\"]*)\"$")
public void bol_data_is_post_using_post_call_for_four_wall_testing_for(String event) throws Throwable {
	//userTest.insertDatainDB(event);
}




}
