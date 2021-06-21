package apiTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import pojo.User;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class GMTes {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		// TODO Auto-generated method stub
		/*
		 * ObjectMapper mapper = new ObjectMapper();
		 * System.out.println(System.getProperty("user.dir"));
		 */
		//String PATH = "C/:\\Users\\srm058\\Desktop\\APITEST\\APITEST\\TestData";
				/*
				 * User payload = mapper.readValue(new File( System.getProperty("user.dir") +
				 * "\\TestData\\"+"testdataPost.json"), User.class); String abcd =
				 * mapper.writerWithDefaultPrettyPrinter().writeValueAsString(payload);
				 */
		FileInputStream file = new FileInputStream(new File (System.getProperty("user.dir")+"\\TestData\\data.json"));
		
		
		
		
		
	    System.out.println("Json is : " );
	    

	}

}
