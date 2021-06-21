package apiTest;

import java.io.File;
import java.io.IOException;

import org.testng.Assert;


import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.getCountryData.CountryDataPojo;

import pojo.User;
import utils.Helper;

public class GetCountryData {
	


	public static User setCountryspecificData(User bodyload) throws JsonParseException, JsonMappingException, IOException {
		
		int countryNumber=GetCountryNumber();
		CountryDataPojo GetData[] = null;
		ObjectMapper mapper=new ObjectMapper();
		
		GetData = mapper.readValue(new File(Helper.JSONPAth + "CountryData.json"), CountryDataPojo[].class);
		
		bodyload.getData().getShipments().get(0).getRoute().getRouteLinks().get(0).getRouteStartPoint().setSiteCode(GetData[countryNumber].getCountry().get(0).getStartPoint());
		bodyload.getData().getShipments().get(0).getRoute().getRouteLinks().get(0).getRouteStartPoint().setGeoCode(GetData[countryNumber].getCountry().get(0).getStartPointGeoCode());
		bodyload.getData().getShipments().get(0).getRoute().getRouteLinks().get(0).getRouteEndPoint().setSiteCode(GetData[countryNumber].getCountry().get(0).getEndPoint());
		bodyload.getData().getShipments().get(0).getRoute().getRouteLinks().get(0).getRouteEndPoint().setGeoCode(GetData[countryNumber].getCountry().get(0).getStartPointGeoCode());
		
		bodyload.getData().getShipments().get(0).getRoute().getRouteLinks().get(0).setVesselCode(GetData[countryNumber].getCountry().get(0).getVessel());
		bodyload.getData().getShipments().get(0).getRoute().getRouteLinks().get(0).setInboundVoyageNumber(GetData[countryNumber].getCountry().get(0).getInboundVoyageNumber());
		bodyload.getData().getShipments().get(0).getRoute().getRouteLinks().get(0).setOutboundVoyageNumber(GetData[countryNumber].getCountry().get(0).getOutboundVoyageNumber());
		
		
		return bodyload;
	}

	private static int GetCountryNumber() {
		int returnvalue=20;
		switch(Helper.country)
		{
		   case "DKEXS" :
			   returnvalue= 2;
		       break;
		   case "FIIMP" :
			   returnvalue= 0;
			   break; 
		   case "DKIMP" :
			   returnvalue= 1;
			   break; 
		   default : 
			   System.out.println("Country is not present in json");
		}
		
		return returnvalue;
	}

	public static void verifyComplianceType(String cmpID) {
		
		
			if(cmpID.startsWith(Helper.country))
				System.out.println("Compliance id is: "+cmpID+" for given country : "+Helper.country);
			else
				Assert.fail("Invalid compliance ID is present for country : "+Helper.country);
			
		
		
	}

}
