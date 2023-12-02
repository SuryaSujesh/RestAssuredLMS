package testrunner;

//import org.testng.annotations.DataProvider;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class testRunner {
	
	
	@CucumberOptions(
			plugin = {"pretty","html:target/TestReports/HTML/index.html", "json:target/TestReports/json/report.json",
					"junit:target/TestReports/junit/report.xml",
					"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}, //reporting purpose
			
			monochrome=false,  
			features = {"src/test/java/features"}, //location of feature files
			glue={"stepdefinition"},
			publish=true) //location of step definition file

	public class TestRunner extends AbstractTestNGCucumberTests{
		
		
		}
}	
