package complianceVerification;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.Assert;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import getDQEcallUsingComplianceId.DQECompliance;
import io.restassured.response.Response;
import utils.Helper;

public class GetComplianceVerification {
	public static String GetCookie="ARRAffinity=e6544bf19e630e56176871ae002063ac11fc26dd97b84aa42ebbeab32bc611e2";
	public static String EDI;
	
	public static void JSonvalidatorforGetComplianceObject(String jsonResp,String eventType,String dqeapplicable,String uri) throws InterruptedException, JsonParseException, JsonMappingException, IOException
	{
		
		
		DQECompliance getPortCall = null;
          ObjectMapper mapper = new ObjectMapper();
          try
          {
        	 getPortCall =  mapper.readValue(jsonResp, DQECompliance.class);
        	    Helper.loginfo("BOL number on compliance object  ", getPortCall.getBillOfLadings().get(0).getBolNumber());
	  	      //  Helper.loginfo("compliance ID  ", getPortCall.getComplianceId());
	  	        Helper.loginfo("BOL status : ",getPortCall.getBillOfLadings().get(0).getStatus());
  	          
  	       
          } catch (Exception e)
          {
             e.printStackTrace();
          }
          
         
           if(dqeapplicable.contains("Y"))
          {
        	   Thread.sleep(3000);
        	  System.out.println(getPortCall.getBillOfLadings().get(0).getStatus());
        	  if(getPortCall.getBillOfLadings().get(0).getStatus().contains("Data Quality Check Failed"))
        		  assertEquals(getPortCall.getBillOfLadings().get(0).getStatus(), "Data Quality Check Failed");
        	  else if(getPortCall.getBillOfLadings().get(0).getStatus().contains("Ready For Submission"))
        		  Assert.fail("Status should be DQE but ready for submission found");
        	  else {
        		  int i =0;
        		  while(i<2) {
        		  Thread.sleep(25000);
        		  Response resp2 =given().header("Cookie",GetCookie).when()
      	        		.get(uri);
        		  DQECompliance getPortCall1 = null;
        		  getPortCall1 =  mapper.readValue(resp2.getBody().asString(), DQECompliance.class);
        		  
        		 if(getPortCall1.getBillOfLadings().get(0).getStatus().contains("Data Quality Check Failed")) {
        			 System.out.println("status changed on call no "+i);
        			 i=3;
        		 }
        		 else if(i==1)
        		     Assert.fail("DQE expected but not found"+i);
        		 i++;
        		  }
        		  
        	  }
        			  
        			
        	  
          }
           else if(dqeapplicable.contains("Approved")&&eventType.equalsIgnoreCase("Issue_Verify_Copy_of_TPDOC_Closed"))
           {
        	   Thread.sleep(80000);
        	   if(getPortCall.getBillOfLadings().get(0).getStatus().equalsIgnoreCase("Approved"))
        		   System.out.println("DKEXP status changed to approved");
       	      else
       	    	  System.out.println("Still status is"+getPortCall.getBillOfLadings().get(0).getStatus());
//        		   Assert.fail("DKEXP is in "+getPortCall.getBillOfLadings().get(0).getStatus().equalsIgnoreCase("Approved"));
//        	   
           }
           else if(eventType.equalsIgnoreCase("Confirm_Shipment_Closed_TPDOC")||eventType.equalsIgnoreCase("Schedule_Shipment_Closed"))
	          {
        	   	Helper.loginfo("Inside CS or SSC event", "NO valiodation for now");
	        	  assertEquals(getPortCall.getBillOfLadings().get(0).getStatus(), "Awaiting SI Processing");
	        	  
	          }
          else {
				/*
				 * System.out.println("inside status verification post IVC"); int itr =0;
				 * while(itr<2) { Thread.sleep(20000); Response resp2
				 * =given().header("Cookie",GetCookie).when() .get(uri); DQECompliance
				 * getPortCall1 = null; getPortCall1 =
				 * mapper.readValue(resp2.getBody().asString(), DQECompliance.class);
				 * 
				 * if(getPortCall.getBillOfLadings().get(0).getStatus().
				 * contains("Ready For Submission")) {
				 * System.out.println("status changed on call no "+itr); itr=3; } else
				 * if(getPortCall1.getBillOfLadings().get(0).getStatus().equalsIgnoreCase(
				 * "Approved")) itr=3; else
				 * if(getPortCall1.getBillOfLadings().get(0).getStatus().
				 * equalsIgnoreCase("Submitted Awaiting Response")) { itr=3;
				 * 
				 * 
				 * EDI=getPortCall1.getBillOfLadings().get(0).getEdiTransmissionId();
				 * System.out.println("EDI value is "+EDI); } else if(itr==1)
				 * Assert.fail("ready for submission expected but not found"); itr++; }
				 */
        		  
        	  
          
        		  if(getPortCall.getBillOfLadings().get(0).getStatus().contains("Ready For Submission")) {
         			 System.out.println("Compliance status is RFS");
         			
         		 }
         		else if(getPortCall.getBillOfLadings().get(0).getStatus().equalsIgnoreCase("Submitted Awaiting Response")) {
         			
         			System.out.println("Status changes to submitting awaiting response");
  						}
          
          
          
          
          
          }
          }
           
           

}
