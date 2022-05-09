package cucumber.Options;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/features"
,plugin = {"json:target/jsonReports/cucumber-report.json"
		   //,"com.cucumber.listener.ExtentCucumberFormatter:target/extent-reports/report.html"
		   //,"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:target/extent-reports/report.html"
		  }
,glue= {"stepDefinations"},
dryRun = false,
monochrome = true,
tags= "@Smoke")
public class TestRunner {
  //compile test verify
	
	@AfterClass
	 public static void writeExtentReport() throws FileNotFoundException, IOException 
	{
		/*
		 * Reporter.loadXMLConfig(new
		 * File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath())
		 * ); Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
		 * Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
		 */
	 }
}
