package apiTest;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static org.testng.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


import org.apache.commons.lang3.RandomStringUtils;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.testng.Assert;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import pojo.Cargo;
import pojo.User;
import utils.BaseTest;
import utils.Helper;
import utils.Utility;

import com.QueueCon.PostOnQueue;
import com.example.Example;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import GetPortCall.GetPortCallPOJO;
import complianceVerification.GetComplianceVerification;
import getDQEcallUsingComplianceId.BillOfLading;
import getDQEcallUsingComplianceId.DQECompliance;

public class UserTest extends BaseTest {

	public String baseUri;
	User bodyload;
	Example GetBol;
	Utility utils;
	public static String bol;
	public static String instanceID;
	public static String cmpID;
	public static String GetCookie = "ARRAffinity=e6544bf19e630e56176871ae002063ac11fc26dd97b84aa42ebbeab32bc611e2";
	
	public static LinkedList<String> bolno=new LinkedList();
	public static boolean firstTime=true;

	public String getBOL(String event,String dqeFlag) throws IOException
	{
		if (event.contains("Confirm_Shipment_Closed_TPDOC"))
		{
			String random = RandomStringUtils.randomNumeric(6);
			bol = "AVR" + random;
			Helper.loginfo("BOL : ", bol);
			PrintWriter pw=new PrintWriter(new FileWriter("boldata.txt",true));
			pw.println(bol);
			pw.flush();
			pw.close();
			return bol;
		}
		else if(dqeFlag.equalsIgnoreCase("amd"))
		{
			bol=amendedBolNo();
		}
		
		return bol;
	}

	public void GetServiceCall(String eventType, String dqeApplicable)
			throws JsonParseException, JsonMappingException, InterruptedException, IOException {

		String URI = Helper.getURI(bol, cmpID);
		System.out.println(URI);
		Response resp = given().header("Cookie", GetCookie).when().get(URI);
		System.out.println(resp.getBody().asString());
		if (resp.getStatusCode() != 200)
			Assert.fail("status in getBOLSErvice is not 200 it is : " + resp.getStatusCode());

		if (cmpID != null)
			GetComplianceVerification.JSonvalidatorforGetComplianceObject(resp.getBody().asString(), eventType,
					dqeApplicable, URI);
		else
			JSONvalidator(resp.getBody().asString(),"Test");

	}

//Generic method to call getURI	
	public void GetServiceCall(String service, String eventType, String dqeApplicable)
			throws JsonParseException, JsonMappingException, InterruptedException, IOException {

		String URI = Helper.getURI(service, bol, cmpID);
		System.out.println(URI);
		Response resp = given().header("X-API-KEY", "69ba14f0-2edb-4b87-96ca-789125790b09").header("X-APP-ID", "GCD")
				.when().get(URI);
		if (resp.getStatusCode() != 200)
			Assert.fail("status in getBOLSErvice is not 200 it is : " + resp.getStatusCode());

		if (service.contains("getComplianceUsingTpdocandBOL"))
			GetComplianceVerification.JSonvalidatorforGetComplianceObject(resp.getBody().asString(), eventType,
					dqeApplicable, URI);
		else
			JSONvalidator(resp.getBody().asString(),eventType);

	}

	// @Test(enabled=false,description = "Validate Status code 200 for Bill of
	// Lading ")
	public void GetRequestBilloflading() throws FileNotFoundException {

		String getBolService = Helper.propertyReader(Helper.commonFilePath, "getBOLService");
		String cookie = Helper.propertyReader(Helper.commonFilePath, "GetCookie");
		System.out.println(getBolService);
		Response resp = given().header("Cookie", cookie).when().get(getBolService + bol);
		System.out.println(resp.getBody().asString());
		if (resp.getStatusCode() != 200)
			Assert.fail("status in getBOLSErvice is not 200 it is : " + resp.getStatusCode());
		JSONvalidator(resp.getBody().asString(),"Test");
	}

	public void GetPortCallObject() throws FileNotFoundException {
		Response resp = given()
				.header("Cookie", "ARRAffinity=c9d4dba95981ac6556df1e255f10623d00d4daaacd325bbda9a056ae72099fa0").when()
				.get("https://gcd-port-call.dev.maersk-digital.net/v1/portcall/sites?srcPortCode=FIHELST&destPortCode=DEHAMBK&srcDepartureVoyageCode=1327&destArrivalVoyageCode=1327&vesselCode=5X7");

		assertEquals(resp.getStatusCode(), 200);
		System.out.println(resp.getBody().asString());
		JSONvalidatorforGetPortCallservice(resp.getBody().asString());

	}

	// JSON reader and validator
	public void JSONvalidator(String data,String event) {
		ObjectMapper mapper = new ObjectMapper();
		try {
			GetBol = mapper.readValue(data, Example.class);
			Boolean ivRec=GetBol.isIsIVCReceived();
			if(event.contains("Confirm_Shipment_Closed_1TPDOC")) {
				
				if(ivRec) {
					Assert.fail("IVC rec is true for "+event);
				}
				
			}
			else if(event.contains("Issue_Verify_Copy_of_TPDOC_Closed")) {
				if(!ivRec) {
					Assert.fail("IVC rec is false for "+event);
				}
			}

			if (GetBol.getShipments().get(0).getRoute().getRouteLinks().get(0).getCompliances().size() > 1) {
				int cmpLenth = GetBol.getShipments().get(0).getRoute().getRouteLinks().get(0).getCompliances().size();
				for (int i = 0; i < cmpLenth; i++) {
					if (GetBol.getShipments().get(0).getRoute().getRouteLinks().get(0).getCompliances().get(i)
							.startsWith(Helper.country))
						cmpID = GetBol.getShipments().get(0).getRoute().getRouteLinks().get(0).getCompliances().get(i);
				}
			} else
				cmpID = GetBol.getShipments().get(0).getRoute().getRouteLinks().get(0).getCompliances().get(0);
			GetCountryData.verifyComplianceType(cmpID);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// JSON reader and validator
	public void JSONvalidatorforGetPortCallservice(String data) {

		GetPortCallPOJO getPortCall[] = null;
		ObjectMapper mapper = new ObjectMapper();
		try {
			getPortCall = mapper.readValue(data, GetPortCallPOJO[].class);

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("BOL number : " + getPortCall[0].getGsisKey());

	}

	public void GetComplianceObjectUsingCmpID(String eventType, String dqeApplicable)
			throws InterruptedException, JsonParseException, JsonMappingException, IOException {
		String cookie = Helper.propertyReader(Helper.commonFilePath, "GetCookie");
		String getBolService = Helper.propertyReader(Helper.commonFilePath, "getComplianceUsingTpdocandBOL");
		String cmpId = GetBol.getShipments().get(0).getRoute().getRouteLinks().get(0).getCompliances().get(0);
		Helper.loginfo("compliance id: ", cmpId);
		String uri = getBolService + GetBol.getBolNumber() + "&complianceId=" + cmpId;
		Response resp = given().header("Cookie", cookie).when().get(uri);
		System.out.println(resp.getBody().asString());
		GetComplianceVerification.JSonvalidatorforGetComplianceObject(resp.getBody().asString(), eventType,
				dqeApplicable, uri);

	}

	// dqe type needs to be checked

	

	// this method is to get call for DQE using compliance ID
	public void GetDQeObjectUsingCmpID(String eventType, String dqeApplicable) throws FileNotFoundException {
		Response resp = given()
				.header("Cookie", "ARRAffinity=c9d4dba95981ac6556df1e255f10623d00d4daaacd325bbda9a056ae72099fa0").when()
				.get("https://gcd-compliance-service.azurewebsites.net/v1/compliance/getByComplianceId/SEIMP-TOZ2CHOVRSCVXUKWA56KPA");

		assertEquals(resp.getStatusCode(), 200);
		System.out.println(resp.getBody().asString());

		ObjectMapper mapper = new ObjectMapper();
		try {
			DQECompliance GetDQEObject = mapper.readValue(resp.getBody().asString(), DQECompliance.class);

			System.out.println(GetDQEObject.getBillOfLadings().size());
			if (dqeApplicable.equalsIgnoreCase("Y")) {
				for (BillOfLading element : GetDQEObject.getBillOfLadings()) {

					System.out.println(element.getBolNumber());
					if (element.getBolNumber().equalsIgnoreCase("GCS000110")) {
						System.out.println(element.getDqeErrors().get(0).getDqeType());
						break;

					}
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// code to identify root element
	public String getRootElement(String parameter) {
		ArrayList<String> Cargos = new ArrayList<String>(
				Arrays.asList("hsCode", "commodityCode", "commodityDescription"));

		ArrayList<String> CargoDesc = new ArrayList<String>(
				Arrays.asList("cargoDesc", "cargoDescText", "Marks and Numbers"));

		ArrayList<String> CargoPackages = new ArrayList<String>(
				Arrays.asList("packageDescriptionType", "packageStyleAltText"));

		ArrayList<String> equipments = new ArrayList<String>(Arrays.asList("sealNumber"));

		if (Cargos.contains(parameter))
			return "Cargo";
		else if (CargoDesc.contains(parameter))
			return "CargoDesc";
		else if (CargoPackages.contains(parameter))
			return "CargoPackages";
		else if (equipments.contains(parameter))
			return "equipments";
		else
			return "NA";

	}

	

	public void checkApprovedStatus(String event)
			throws JsonParseException, JsonMappingException, IOException, InterruptedException {

		if (event.contains("Verify")) {

			String getBolService = Helper.propertyReader(Helper.commonFilePath, "getComplianceUsingTpdocandBOL");
			String uri = getBolService + bol + "&complianceId=" + cmpID;

			Thread.sleep(35000);
			Response resp = given().header("Cookie", GetCookie).when().get(uri);

			DQECompliance getPortCall = null;
			ObjectMapper mapper1 = new ObjectMapper();

			getPortCall = mapper1.readValue(resp.getBody().asString(), DQECompliance.class);
			if (getPortCall.getBillOfLadings().get(0).getStatus().equalsIgnoreCase("Approved"))
				Helper.loginfo("Status changed to ", getPortCall.getBillOfLadings().get(0).getStatus());
			else
				Assert.fail("Status failed");

		}

	}

	

	private static JSONObject replacekeyInJSONObject(JSONObject jsonObject, String jsonKey, String jsonValue) {

		for (Object key : jsonObject.keySet()) {
			if (key.equals(jsonKey) && ((jsonObject.get(key) instanceof String)
					|| (jsonObject.get(key) instanceof Number) || jsonObject.get(key) == null)) {
				jsonObject.put(key, jsonValue);
				return jsonObject;
			} else if (jsonObject.get(key) instanceof JSONObject) {
				JSONObject modifiedJsonobject = (JSONObject) jsonObject.get(key);
				if (modifiedJsonobject != null) {
					replacekeyInJSONObject(modifiedJsonobject, jsonKey, jsonValue);
				}
			}

		}
		return jsonObject;
	}

	private static JSONObject createJSONObject(String jsonString) {
		JSONObject jsonObject = new JSONObject();
		JSONParser jsonParser = new JSONParser();
		if ((jsonString != null) && !(jsonString.isEmpty())) {
			try {
				jsonObject = (JSONObject) jsonParser.parse(jsonString);
			} catch (org.json.simple.parser.ParseException e) {
				e.printStackTrace();
			}
		}
		return jsonObject;
	}

	public void verifySubmissionStatus() {

//			String uri=Helper.getURI("getComplianceUsingTpdocandBOL",bol,cmpID);
//			 ObjectMapper mapper = new ObjectMapper();
//			  Response resp2 =given().header("Cookie",GetCookie).when()
//    	        		.get(uri);
//      		  DQECompliance getPortCall2 = null;
//      		  getPortCall2 =  mapper.readValue(resp2.getBody().asString(), DQECompliance.class);
//      		  
//      		 if(getPortCall2.getBillOfLadings().get(0).getStatus().contains("Ready For Submission")) {
//      			 System.out.println("status changed on call no "+itr);
//      			
//      		 }
//      		 else if(getPortCall2.getBillOfLadings().get(0).getStatus().equalsIgnoreCase("Approved"))
//      			
//      		 else if(getPortCall2.getBillOfLadings().get(0).getStatus().equalsIgnoreCase("Submitted Awaiting Response")) {
//      			 itr=3;
//      			 if(getPortCall2.getBillOfLadings().get(0).getStatus().contains("Submitted Awaiting Response")) {
//						EDI=getPortCall2.getBillOfLadings().get(0).getEdiTransmissionId();
//						System.out.println("EDI value is "+EDI);
//						}
//      		 else if(itr==1)
//      		     Assert.fail("ready for submission expected but not found");
//      		 itr++;
//      		  }
//      		  
//      	  }
//        }

	}

	/**
	 * @param event
	 * @param param
	 * @param value
	 * @param type
	 * @throws InterruptedException
	 * @throws IOException 
	 */
	public void insertDatainDB(String event, String param, String value,String dqeFlag,String type) throws InterruptedException, IOException
	{
		String test = null;
		String seg = null;
		String time = null;
		bol = getBOL(event,dqeFlag);
		System.out.println(bol);
		
			if (event.equalsIgnoreCase("Confirm_Shipment_Closed_TPDOC")) {
				time = "2021-04-16 03.46.43";
				seg = bol + "CSC";
			} else if (event.equalsIgnoreCase("Issue_Verify_Copy_of_TPDOC_Closed")) {
				seg = bol + "IVC";
				time = "2020-09-17 09.47.43";
			} else if (event.equalsIgnoreCase("Issue_Amended_Verify_Copy_of_TPDOC_Closed")) {
				seg = bol + "IAC";
				time = "2021-04-27 03.48.43";
			} else if (event.equalsIgnoreCase("Related_Seal_Number_Changed")) {
				seg = bol + "RSN";
				time = "2020-09-17 09.48.43";
			} else if (event.equalsIgnoreCase("TPDOC_Removed")) {
				seg = bol + "TPR";
				time = "2020-09-17 09.48.43";
			}

			instanceID = bol + "1234";
			String segmentID = "14Tpdoct-c415-4bbb-bzv7-" + seg;// 14Tpdoct-c415-4bbb-bzv7-DOL678998CSC

			String payload = GetPayloadAvro.getPayload(bol,type, param,value).replaceAll("UPDATETIME", time);

			PostOnQueue poQ = new PostOnQueue();
			poQ.bookingSegmentInsert(instanceID, segmentID, payload, event);
			Thread.sleep(3000);

			RestAssured.baseURI = "https://gcd-orchestration-preprod.maersk-digital.net";
			RequestSpecification request = RestAssured.given();
			JSONObject requestParams = new JSONObject();

			requestParams.put("id", segmentID);
			requestParams.put("referenceNumber", instanceID);
			requestParams.put("eventType", event);
			
			request.header("Content-Type", "application/json");
			request.body(requestParams.toJSONString());
			Response response = request.post("/v1/routeEnrichment");

			System.out.println("Orchestration hit response : " + response.getStatusCode());
			System.out.println(bol);
			System.out.println(requestParams.toJSONString());
			// RequestSpecification request1 = new RequestSpecBuilder().addHeader("",
			// "").addParam("", "").build().given().post(uri)

		
	}


	
	public String amendedBolNo() throws IOException
	{
		
			if(firstTime)
			{
				
				BufferedReader br=new BufferedReader(new FileReader("boldata.txt"));
				String line=br.readLine();
				while(line!=null)
				{
					
					bolno.add(line);
					
					line=br.readLine();
				}
				br.close();
				bol=bolno.pop();
				firstTime=false;
				File fl = new File("boldata.txt");
				fl.delete();
			}
			else
			{
				if(bolno.isEmpty())
				{
					System.out.println("All Bol's are used");
					
					//FileWriter fw = new FileWriter("boldata.txt",true);
					File fl = new File("boldata.txt");
					fl.delete();
					
				}
				else
					bol=bolno.pop();
			}
		
		return bol;
    		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
