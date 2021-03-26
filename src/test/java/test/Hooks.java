package test;

import java.io.IOException;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.github.mkolisnyk.cucumber.runner.BeforeSuite;
import com.google.inject.Inject;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.restassured.RestAssured;

public class Hooks {

	private static final Logger LOGGER = LoggerFactory.getLogger(Hooks.class);
	private static Date starttime;
	private static Date endtime;
	public static String bol=null;
	

	

	@Before
	public void beforeHooks(Scenario scenario) {

		System.out.println("\n---------------------------------------------");
		System.out.println("Starting Scenario - " + scenario.getName());
		System.out.println("---------------------------------------------\n");
		LOGGER.info(scenario.getName()+" started*************************");
		starttime = new Date();
		
		RestAssured.proxy("dk.ibg.apmoller.net", 8887);
			
			
		}





	





	
//	@After
//	public void afterReport(Scenario scenario) throws InterruptedException{
//		endtime = new Date();
//		ScenarioDetailsPOJO sn = new ScenarioDetailsPOJO();
//		
//		sn.setScreenshot(scenario.getId().split(";")[1]+".png");
//		action.takeScreenshot(sn.getScreenshot());
//		sn.setId(context.getScenariolist().size()+1);
//		sn.setName(scenario.getName());
//		sn.setTestdata(utils.getTestData());
//		sn.setStatus(scenario.getStatus());
//		sn.setStartTime(utils.getDateTime(starttime));
//		sn.setEndTime(utils.getDateTime(endtime));
//		sn.setElapsedTime(utils.getElapsedTime(starttime, endtime));
//		
//		sn.setScreenshot(scenario.getId().split(";")[1]+".png");
//		context.getScenariolist().add(sn);
//		if(context.getFeaturename()==null){
//			String feature = scenario.getId().split(";")[0].replace("-"," ");
//			context.setFeaturename(feature);
//		}
//		context.setTccount(context.getTccount()+1);
//		if(scenario.isFailed()){
//			context.setFailtccount(context.getFailtccount()+1);
//		} else {
//			context.setPasstccount(context.getPasstccount()+1);
//		}
//	}
//	
//	
//	
//	@After
//	public void afterHooks(Scenario scenario) throws InterruptedException{
//
//		System.out.println("\n----------------------------------------");
//		System.out.println("Scenario - " + scenario.getStatus());
//		System.out.println("----------------------------------------\n");
//		LOGGER.info("Scenario "+scenario.getName()+" completed with status - "+scenario.getStatus());
//
//		Thread.sleep(4000);
//		if(webdriver!=null){
//			webdriver.close();
//			//webdriver.quit();
//			LOGGER.info("WebDriver Closed");
//		}
//		
//		
//		
//	}

}