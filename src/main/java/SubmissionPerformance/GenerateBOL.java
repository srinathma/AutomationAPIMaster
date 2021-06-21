package SubmissionPerformance;

import java.util.Date;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.RandomStringUtils;
import org.bson.Document;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

public class GenerateBOL {

	@SuppressWarnings("null")
	public static void main(String[] args) throws IOException {
		GenerateBOL generateBOL=new GenerateBOL();
		
		String data=generateBOL.readFile("C:\\vijay\\SPT\\tz.txt");
		//String shortId = RandomStringUtils.random(9);
		
		
		for(int i=5000;i<6202;i++)
		{
			 PrintWriter writer1 =null;
			String BOL="VJPPB"+i;
			
		   String value=data.replaceAll("BOLNO", BOL);
			        
		         writer1 = new PrintWriter(new File("C:\\vijay\\SPT\\SubmissionData\\"+BOL+".json"));  
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
