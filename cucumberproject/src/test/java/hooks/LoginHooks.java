package hooks;

import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import browserfactory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.ConfigReader;

public class LoginHooks 
{
	private ConfigReader configReader;
	private DriverFactory driverFactory;
	Properties prop;
	
	
	@Before(order=1)
	public void getProperty()
	{
		configReader = new ConfigReader();
		prop = configReader.init_prop(); 
	}
	
	@Before(order=2)
	public void launchBrowser()
	{
		String browserName = prop.getProperty("browser");
		driverFactory = new DriverFactory();
		driverFactory.init_driver(browserName);
	}
	
	@After(order=1)
	public void quitBrowser()
	{
		DriverFactory.getDriver().quit();
	}
	
	@After(order=2)
	public void tearDown(Scenario scenario)
	{
		if(scenario.isFailed())
		{
			// take screenshot
			String screenshotName = scenario.getName().replace(" ", "_");
			byte[] sourcePath = ((TakesScreenshot)DriverFactory.getDriver()).getScreenshotAs(OutputType.BYTES);
			scenario.attach(sourcePath, "image/png", screenshotName);
		}	
	}

}
