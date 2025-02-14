package runners;

import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

import io.cucumber.junit.Cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
					features = "src/test/resources/feature",
					glue = {"steps","hooks"},
					plugin = {"pretty",
							  "html:target/cucumber-report.html"
					         }
				)


public class TestRunner extends AbstractTestNGCucumberTests
{
	@DataProvider(parallel = true)
	public Object[][] scenarios()
	{
		return super.scenarios();
	}
}
