package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "D:\\WorkSpace\\Eclipse\\MavanCucumber\\src\\main\\java\\Features\\RajuTest.feature", //the path of the feature files
			glue={"stepDefinition"},
			plugin= {"pretty","html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"},
			format= {}, //to generate different types of reporting
			monochrome = true, //display the console output in a proper readable format
			strict = true, //it will check if any step is not defined in step definition file
			dryRun = true //to check the mapping is proper between feature file and step def file
			//tags = {"@RegresstionTest , @SmokeTest , @FunctionalTest , @E2ETest"}	// OR "@RegresstionTest , @SmokeTest , @FunctionalTest , @E2ETest"
			//tags = {"~@RegresstionTest" , "~@SmokeTest" }	// AND "@RegresstionTest" , "@SmokeTest" 
			)

public class TestRunner {
		
		

}
