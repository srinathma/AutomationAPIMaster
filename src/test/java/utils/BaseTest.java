
/*Author : Srinath GCD API Automation framework
 * Created On: 07-05-2020
 * Modified by : 19-05-2020
 * 
 * 
 */
package utils;


import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import com.relevantcodes.extentreports.LogStatus;

import utils.ExtentReport;
import utils.Logging;



public class BaseTest {
	
	public static String baseurl="https://gcd-location-service.azurewebsites.net";
	protected static Logging log;
	
	@Parameters({ "ReportName", "FlowType" })
	@BeforeSuite(alwaysRun = true)
	public void config(@Optional("Optional name Automation ") String reportname, @Optional("API Report") String flow)
			throws IOException {
		
        baseurl=Helper.propertyReader(Helper.commonFilePath, "baserurl");
        //Create the path in which we will create folder to keep html reports
		String subfolderpath=System.getProperty("user.dir")+"/htmlReports/"+utils.Helper.Timestamp();
		//create sub folder
		utils.Helper.CreateFolder(subfolderpath);
		
		ExtentReport.initialize(subfolderpath+"/"+"Automation_API.html");
		
		// Log path
		utils.Logging.setLogPath(subfolderpath+"/"+"Automation_logs.log");

		// create logging instance
		log = Logging.getInstance();

	}
	
	@BeforeMethod(alwaysRun = true)
	public static void LogBeforeMethod() {
		final Logging log = Logging.getInstance();

		log.info("Test case", "*********************************************************************");
	}
	


	@AfterMethod(alwaysRun = true)
	public void getResult(ITestResult result) {
		if (result.getStatus() == ITestResult.SUCCESS) {
			ExtentReport.extentlog.log(LogStatus.PASS, "Test case is passed "+result );

		} else if (result.getStatus() == ITestResult.FAILURE) {
			ExtentReport.extentlog.log(LogStatus.FAIL, "Test case is failed " );
			ExtentReport.extentlog.log(LogStatus.FAIL, "Test case is failed " + result.getThrowable());
		} else if (result.getStatus() == ITestResult.SKIP) {
			ExtentReport.extentlog.log(LogStatus.SKIP, "Test case is Skiped " + result.getName());
		}
		ExtentReport.extentreport.endTest(ExtentReport.extentlog);
	}
	
	  @BeforeClass 
	  public void setProxy(){
	  System.setProperty("http.proxyHost","10.0.11.1");
	  System.setProperty("http.proxyPort", "9400");
	  System.setProperty("https.proxyHost", "10.0.11.1");
	  System.setProperty("https.proxyPort", "9400"); 
	  }
	 	 
	@AfterSuite(alwaysRun = true)
	public void endReport() {
		ExtentReport.extentreport.flush();
		ExtentReport.extentreport.close();
		Logging.setinstanceNull();
	}

	
	
}

