package tests;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/tests/Registration.feature",
				 glue = "Register",
				 plugin = {"pretty","html:target/cucumberhtmlreport.html",
						   "json:target/cucumberjsonreport.json",
						   "junit:target/cucumberjunitreport.xml"
		 				  },
				 dryRun = true
			    )
public class TestRunner 
{

}
