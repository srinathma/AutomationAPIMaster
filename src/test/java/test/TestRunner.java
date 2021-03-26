package test;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumber;




@RunWith(ExtendedCucumber.class)
@ExtendedCucumberOptions(
		jsonReport = "target/81/cucumber.json",
        jsonUsageReport = "target/81/cucumber-usage.json",
        usageReport = false,
        detailedReport = true,
        detailedAggregatedReport = true,
        overviewReport = true,
        overviewChartsReport = true,
        pdfPageSize = "A4 Landscape",
        toPDF = false,
        outputFolder = "target/81",
        retryCount = 0)
@CucumberOptions(
		 plugin = {
	            "html:target/81", "json:target/81/cucumber.json",
	            "pretty:target/81/cucumber-pretty.txt",
	            "usage:target/81/cucumber-usage.json", "junit:target/81/cucumber-results.xml" },
        		features="src/test/resources/features/",
       		glue={"stepdefs","test"},
        tags = { "@regDQE06BBbookingreg" }
)


public class TestRunner { 
	
	
	}

