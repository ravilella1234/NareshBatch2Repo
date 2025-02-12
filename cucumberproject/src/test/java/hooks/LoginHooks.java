package hooks;

import java.util.Properties;

import browserfactory.DriverFactory;
import io.cucumber.java.Before;
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

}
