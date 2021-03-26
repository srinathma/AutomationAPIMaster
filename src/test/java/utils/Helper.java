package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.Properties;
import java.util.Random;

import org.apache.commons.io.IOUtils;
import org.ini4j.Ini;
import org.ini4j.Profile.Section;

import io.restassured.response.Response;
import utils.Logging;

public class Helper {

	public static final String commonFilePath = System.getProperty("user.dir") + "/common.properties";
//	public static final String BrekBulkGDSPath="C:\\\\Vijay\\\\GCD\\\\Automation\\\\GCDworkspace\\\\APITEST\\\\TestData\\\\BB_GDS.json";
//	public static final String CCBookingGDSPath="C:\\Vijay\\GCD\\Automation\\GCDworkspace\\APITEST\\TestData\\BB_GDS.json";
	public static final String JSONPAth = "C:\\Vijay\\LatestJSON\\";
	public static final String country = "FIIMP";
	public static final String country_DK="DKIMP";
	//public static final String country_TZ="TZIMP";
	//public static final String country_DKEXS="DKEXS";

	// static UserTest user;
	/*
	 * To print logs file
	 */
	public static void loginfo(String value, String message) {
		final Logging log = Logging.getInstance();
		log.info(value, message);
	}

	/*
	 * create folder
	 */
	public static void CreateFolder(String path) {
		// File is a class inside java.io package
		File file = new File(path);
		if (!file.exists()) {
			file.mkdir();// mkdir is used to create folder
		} else
			System.out.println("Folder already created");
	}

	/*
	 * Return current time stamp
	 */
	public static String Timestamp() {

		Date now = new Date();
		String Timestamp = now.toString().replace(":", "-");
		return Timestamp;

	}

	/*
	 * @param filepath key
	 * 
	 * @return value of the key
	 */
	public static String propertyReader(String filePath, String key) {
		String value = null;
		// Inputstream is required while loading into properties
		try (InputStream input = new FileInputStream(filePath)) {

			Properties prop = new Properties();

			// load a properties file
			prop.load(input);
			// getProperty will fetch the value according to the key
			value = prop.getProperty(key);

		} catch (IOException ex) {
			ex.printStackTrace();
		}
		return value;

	}

	/*
	 * params tailUrl - tail part of API token - Authorization token
	 * 
	 * return - response of the API
	 */
	/*
	 * public static Response getReponse(String baseUrl, String tailUrl) {
	 * 
	 * baseUrl = Helper.propertyReader(Helper.commonFilePath, "baseUrl"); tailUrl
	 * =Helper.propertyReader(Helper.commonFilePath, "tailUrl");
	 * 
	 * Helper.loginfo("Hitting API URL :- ", baseUrl + tailUrl);
	 * ExtentReport.ExtentReportInfoLog("Hitting API URL :- "+ baseUrl + tailUrl);
	 * Response resp = null;
	 * 
	 * try {
	 * 
	 * resp = given().when().get(baseUrl + tailUrl);//.header("Authorization",
	 * "Bearer " + token)
	 * 
	 * 
	 * String responseTime = String.valueOf(resp.getTime()); String statusCode =
	 * String.valueOf(resp.getStatusCode());
	 * 
	 * // Adding logs Helper.loginfo("Response :- ", resp.body().asString());
	 * Helper.loginfo("Response time :- ", responseTime);
	 * Helper.loginfo("Status code :- ", statusCode);
	 * 
	 * // adding logs to html report
	 * ExtentReport.ExtentReportInfoLog("Response time:     " + responseTime);
	 * ExtentReport.ExtentReportInfoLog("Status code:     " + statusCode);
	 * 
	 * } catch (Exception e) { Helper.loginfo("Error :- ", e.getMessage()); }
	 * 
	 * return resp; }
	 */
	/*
	 * public static Response postUserDetails(String tailUrl) throws
	 * FileNotFoundException {
	 * 
	 * FileInputStream file = new FileInputStream(new File
	 * (System.getProperty("user.dir")+"\\TestData\\testdataPost.json"));
	 * 
	 * String baseUrl = Helper.propertyReader(Helper.commonFilePath, "baserurl");
	 * 
	 * Helper.loginfo("Hitting API URL :- ", baseUrl + tailUrl);
	 * 
	 * Response resp = null;
	 * 
	 * try{
	 * 
	 * resp =
	 * given().header(ReadTestData.getTestData("content"),ReadTestData.getTestData(
	 * "content-type")). body(IOUtils.toString(file,"UTF-8")).
	 * 
	 * when(). post(baseUrl + tailUrl);
	 * 
	 * //Adding logs to log and html report Helper.loginfo("Response :- ",
	 * resp.body().asString()); Helper.loginfo("Response time :- ",
	 * String.valueOf(resp.getTime()));
	 * ExtentReport.ExtentReportInfoLog("Response time:     " +
	 * String.valueOf(resp.getTime())); } catch (Exception e) {
	 * Helper.loginfo("Error :- ", e.getMessage()); }
	 * 
	 * return resp; }
	 * 
	 */
	public static String readConfig(String propertyValue, String env) {

		String pValue = null;
		String filepath = commonFilePath;
		try {
			Ini ini = new Ini(new File(filepath));
			Section section = ini.get(env); // Evironment
			pValue = section.get(propertyValue);
			System.out.println(pValue);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return pValue;
	}
//Generate 18 characters for MRN
	
	  public static String generateRandomMRN() { 
		  //String mrnno=null; 
		  char[] chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray(); 
		  Random rnd = new  Random(); 
		  StringBuilder mrnno = new StringBuilder((100000 + rnd.nextInt(900000)) + "A");
		  for (int i = 0; i < 5; i++)
	  mrnno.append(chars[rnd.nextInt(chars.length)]);
	  //System.out.println("random"+mrnno);
	  
	  return mrnno.toString(); 
	  }
	 
	
	public static String getURI(String bol, String cmpID) {

		if (cmpID != null)
			return propertyReader(Helper.commonFilePath, "getComplianceUsingTpdocandBOL") + bol + "&complianceId="
					+ cmpID;
		else
			return propertyReader(Helper.commonFilePath, "getBOLService") + bol;
	}

	public static String getURI(String service, String bol, String cmpID) {
		String URI = null;

		if (service.equalsIgnoreCase("getBOLService"))
			URI = propertyReader(Helper.commonFilePath, "getBOLService") + bol;

		else if (service.equalsIgnoreCase("getComplianceUsingTpdocandBOL"))
			URI = propertyReader(Helper.commonFilePath, "getComplianceUsingTpdocandBOL") + bol + "&complianceId="
					+ cmpID;

		else
			System.out.println("service is not present in propertyFile");

		return URI;

	}

	/*
	 * public static String getURI(String SeriveName) {
	 * 
	 * 
	 * return propertyReader(Helper.commonFilePath, SeriveName)+UserTest.bol;
	 * 
	 * }
	 */

}
