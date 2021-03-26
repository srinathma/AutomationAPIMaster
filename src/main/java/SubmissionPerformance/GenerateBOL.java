package SubmissionPerformance;

import java.util.Date;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

import io.restassured.RestAssured;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.io.FileUtils;
import org.bson.Document;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

public class GenerateBOL {

	@SuppressWarnings("null")
	public static void main(String[] args) throws IOException {
		//RestAssured.proxy("dk.ibg.apmoller.net", 8887);
		GenerateBOL generateBOL=new GenerateBOL();
		String data=generateBOL.readFile("C:\\Srinath\\SPT\\BOLTemplate.txt");
		
		for(int i=40000;i<40050;i++)
		{
			 PrintWriter writer1 =null;
			String BOL="SRIL"+i;
			//String HPL="1234"+i;
			
		   String value=data.replaceAll("BOLNO", BOL);
		   //String cityname = data.replaceAll("CITY", HPL);
			        
		         writer1 = new PrintWriter(new File("C:\\Srinath\\SPT\\SubmissionData\\"+BOL+".json"));  
		         writer1.write(value);                                                   
		     
			value=null;
			  writer1.flush();  
		       writer1.close(); 
		}
	}
	
	


	

	 String readFile(String fileName) throws IOException {
		    BufferedReader br = new BufferedReader(new FileReader(fileName));
		    try {
		        StringBuilder sb = new StringBuilder();
		        String line = br.readLine();

		        while (line != null) {
		            sb.append(line);
		            sb.append("\n");
		            line = br.readLine();
		        }
		        return sb.toString();
		    } finally {
		        br.close();
		    }
		}


}
