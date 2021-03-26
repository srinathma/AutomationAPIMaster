package SubmissionPerformance;

import java.util.ArrayList;

import org.json.simple.JSONObject;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RefreshBOL {

	public static void main(String[] args) {
		int counter=50;
		RefreshBOL rfBOL=new RefreshBOL();
		ArrayList < String > bol = new ArrayList < String > ();
		for(int i=40001;i<40051;i++) {
		
		
		int index=i%counter;
		int j=index-1;
		if(index==0)
			bol.add(49,"SRIL"+i);
		else	
			bol.add(j,"SRIL"+i);
	
		if(i%counter==0) {
			rfBOL.refreshBOLURI(bol);
		
			System.out.println("value : "+bol);
			bol.clear();
			
		}
		}
	}

	public void refreshBOLURI(ArrayList<String> bol)
	{
		RefreshBOLPOJO refreshBody = new RefreshBOLPOJO(); //This hotel object includes multiple objects and those objects also include multiple objects, lists
        Gson gson = new GsonBuilder().create();
        refreshBody.setBolNumbers(bol);
        String jsonBody = gson.toJson(refreshBody);
       
      System.out.println(jsonBody);
	RestAssured.baseURI ="https://gcd-orchestration-preprod.maersk-digital.net";
	RequestSpecification request = RestAssured.given();
	request.header("Content-Type", "application/json");
	request.body(jsonBody);
	Response response = request.post("/v1/routeEnrichment/refresh");
	System.out.println(response.getStatusCode());

	}
}
