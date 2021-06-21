package SubmissionPerformance;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

public class SaveBOLinDB {

	public static void main(String[] args) throws IOException {
		// String dbURI="mongodb://gcdmongoqa:aK3u3SDmQp1j9hdoiHVvJVpvEJCNbtZO2TxrWtlGUPlh93c13P7UUQjzOdf1NLAfyyuFUZCVSApkNdK2Pvs47w==@gcdmongoqa.mongo.cosmos.azure.com:10255/?ssl=true&replicaSet=globaldb&retrywrites=false&maxIdleTimeMS=120000&appName=@gcdmongoqa@";
	      String dbURI="mongodb://gcdmongo-pre-prod:SEntatkatHGDn8SsgdstpPT2Eyd9QzG11PY1588buGlJYWl0tyvLJiCjSjBPvJDeslquqwNQzU8rUpyqhvwRMQ==@gcdmongo-pre-prod.mongo.cosmos.azure.com:10255/?ssl=true&replicaSet=globaldb&retrywrites=false&maxIdleTimeMS=120000&appName=@gcdmongo-pre-prod@"; 
		  
	  //   String dbURI ="mongodb://gcdmongodb:6Sbgznu1YXpp7o5YCNCa6VU9R7afLVsfOcrk1OVMhYV7GXOyelDm70bYPfuE64i3SoHPr7pJLvml60LvaT7FSw==@gcdmongodb.documents.azure.com:10255/?ssl=true&replicaSet=globaldb";
	    			 
	      
	      
	      MongoClient client = new MongoClient(new MongoClientURI(dbURI));
		 
	  	for(int i=5000;i<6202;i++)
			{
		 String jsonString = FileUtils.readFileToString(new File("C:\\vijay\\SPT\\SubmissionData\\VJPPB"+i+".json"), "UTF-8");

	        Document doc = Document.parse(jsonString);
	        List<Document> list = new ArrayList<>();
	        list.add(doc);
	             
	        client.getDatabase("billoflading").getCollection("billOfLading").insertMany(list);

			list=null;
			}
	        		client.close();

	}

	 
}
