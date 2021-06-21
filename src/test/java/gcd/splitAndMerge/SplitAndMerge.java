package gcd.splitAndMerge;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

import org.apache.commons.lang3.RandomStringUtils;
import org.json.simple.JSONObject;

import com.QueueCon.PostOnQueue;

import io.restassured.RestAssured;
import io.restassured.internal.support.FileReader;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import utils.Helper;

//ORR related and split and combine related code

public class SplitAndMerge {

	String Filepath="C:\\vijay\\GCD\\GCDAPITEST\\GCDAPITEST\\TestData\\";
	static HashMap<String,String> tpdoc=new HashMap<String,String>();
	ORReventsClass oRReventsClass=new ORReventsClass();
	
	 public void createAndInsertdata(String Event, String GdsPath, String type) throws FileNotFoundException, InterruptedException
	    {
		 String data=null;
		 String segmentID=null;
		 String instanceID=null;
		 
		 
		getBOL(GdsPath);
		data= oRReventsClass.getGDS(GdsPath);
		data=SplitAndMerge.replaceData(data,GdsPath);
		System.out.println(data);
		segmentID=getSegmentID(Event,GdsPath);
		if(GdsPath.contains("Main"))
			instanceID=tpdoc.get("TPDOCNO")+"1234";
		else if(GdsPath.contains("SEC"))
			instanceID=tpdoc.get("ORRNO")+"1234";
		PostOnQueue poQ=new PostOnQueue();
		poQ.bookingSegmentInsert(instanceID,segmentID,data,Event);
		Thread.sleep(10000);
		
		RestAssured.baseURI ="https://gcd-orchestration-perf.maersk-digital.net";
		RequestSpecification request = RestAssured.given();
		JSONObject requestParams = new JSONObject();
		requestParams.put("segmentId", segmentID); 
		requestParams.put("eventType", Event);
		requestParams.put("referenceNumber", instanceID);
		requestParams.put("totalSegments", 1);
		request.header("Content-Type", "application/json");
		request.body(requestParams.toJSONString());
		Response response = request.post("/v1/routeEnrichment");
		
		System.out.println("Orchestration hit response : "+response.getStatusCode());
		System.out.println(requestParams.toJSONString());
	
		
	    		
	    }
	
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 private String getSegmentID(String event,String gds) {
		 String segmentID="14Tpdoct-c415-4bbb-bzv7-";
		 
		 if(event.equalsIgnoreCase("Shipment_Merge_or_Split")&&gds.contains("Main")) {
			 return segmentID+tpdoc.get("TPDOCNO")+"SPE";
		 }
		 else if(event.equalsIgnoreCase("Issue_Verify_Copy_of_TPDOC_Closed")&&gds.contains("Main"))
			 return segmentID+tpdoc.get("TPDOCNO")+"IVC";
		 else if(event.equalsIgnoreCase("Issue_Verify_Copy_of_TPDOC_Closed")&&gds.contains("SEC"))
			 return segmentID+tpdoc.get("ORRNO")+"IVC";
		 else
			 return null;
	}










	//ORR specific BOl created
	//ORR No is other parameter
	//ORRREF  which is actually for orr ref
		public static void getBOL(String GdsPath) {
			if(GdsPath.contains("generate"))
			{	
				String random = RandomStringUtils.randomNumeric(6);
				tpdoc.put("TPDOCNO", "IMP"+random);
				tpdoc.put("ORRNO", "OLD"+random);
				tpdoc.put("ORRREF", "YOO"+random);
				
			}
			
			}
	 
		
		//reading file data for event
		public static String replaceData(String gds,String GdsPath) throws FileNotFoundException
		{
			if(GdsPath.contains("SEC"))
				gds=gds.replaceAll("ORRNO", tpdoc.get("ORRNO"));
			else {
			gds=gds.replaceAll("TPDOCNO", tpdoc.get("TPDOCNO"));
			gds=gds.replaceAll("ORRNO", tpdoc.get("ORRNO"));
			gds=gds.replaceAll("ORRREF", tpdoc.get("ORRREF"));
			
			gds=gds.replaceAll("VESSEL","B6G"); 
			gds=gds.replaceAll("VOYAGE","053E"); 
			gds= gds.replaceAll("LOADCITY","DEBRV");  
			gds=gds.replaceAll("LOADPORT","DEBRVTM");   
			gds=gds.replaceAll("DPCITY","FIRMA"); 
			gds= gds.replaceAll("DPPORT","FIRMATM");
			}
			
			  
			  return gds;
		}
	 
}
