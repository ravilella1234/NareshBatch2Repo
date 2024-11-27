package launcher;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTest 
{
	public static WebDriver driver;
	public static FileInputStream fis;
	public static String projectResourcePath = System.getProperty("user.dir")+"\\src\\test\\resources\\";
	public static Properties p;
	public static Properties mainProp;
	public static Properties childProp;
	public static Properties orProp;
	
	public static void init() throws Exception
	{
		fis = new FileInputStream(projectResourcePath+"data.properties");
		p = new Properties();
		p.load(fis);
		//String e = p.getProperty("amazonurl");
		//System.out.println(e);
		
		fis = new FileInputStream(projectResourcePath+"environment.properties");
		mainProp = new Properties();
		mainProp.load(fis);
		String e = mainProp.getProperty("env");
		System.out.println(e);
		
		fis = new FileInputStream(projectResourcePath+e+".properties");
		childProp = new Properties();
		childProp.load(fis);
		String url = childProp.getProperty("amazonurl");
		System.out.println(url);
		
		fis = new FileInputStream(projectResourcePath+"or.properties");
		orProp = new Properties();
		orProp.load(fis);
	}
	
	public static void launch(String browser)
	{
		if(p.getProperty(browser).equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}else if (p.getProperty(browser).equals("firefox")) {
			driver = new FirefoxDriver();
		}else if (p.getProperty(browser).equals("edge")) {
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
	}
	
	public static void navigateurl(String url)
	{
		//driver.get(url);
		driver.navigate().to(childProp.getProperty(url));
	}
	
	
	public static void clickElement(String locatorKey) 
	{
		getElementType(locatorKey).click();
		//driver.findElement(By.xpath(orProp.getProperty(locatorKey))).click();
	}

	public static void typeText(String locatorKey, String text) 
	{
		getElementType(locatorKey).sendKeys(text);
		//driver.findElement(By.name(orProp.getProperty(locatorKey))).sendKeys(text);
	}

	public static void selectDropdownOption(String locatorKey, String option) 
	{
		getElementType(locatorKey).sendKeys(option);
		//driver.findElement(By.id(orProp.getProperty(locatorKey))).sendKeys(option);
	}
	
	public static WebElement getElementType(String locatorKey) 
	{
		WebElement element = null;
		
		if(!isElementPresent(locatorKey))
			System.out.println("Provided element is not present by given locator... " + locatorKey);
		
		element = driver.findElement(getByLocator(locatorKey));
		
		/*if(locatorKey.endsWith("_id")) {
			element = driver.findElement(By.id(orProp.getProperty(locatorKey)));
		}else if (locatorKey.endsWith("_name")) {
			element = driver.findElement(By.name(orProp.getProperty(locatorKey)));
		}else if (locatorKey.endsWith("_classname")) {
			element = driver.findElement(By.className(orProp.getProperty(locatorKey)));
		}else if (locatorKey.endsWith("_xpath")) {
			element = driver.findElement(By.xpath(orProp.getProperty(locatorKey)));
		}else if (locatorKey.endsWith("_css")) {
			element = driver.findElement(By.cssSelector(orProp.getProperty(locatorKey)));
		}else if (locatorKey.endsWith("_linktext")) {
			element = driver.findElement(By.linkText(orProp.getProperty(locatorKey)));
		}else if (locatorKey.endsWith("_partiallinktext")) {
			element = driver.findElement(By.partialLinkText(orProp.getProperty(locatorKey)));
		}*/
		
		
		return element;
	}

	public static boolean isElementPresent(String locatorKey) 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		try 
		{
			wait.until(ExpectedConditions.presenceOfElementLocated(getByLocator(locatorKey)));
			
			/*if(locatorKey.endsWith("_id")) {
				wait.until(ExpectedConditions.presenceOfElementLocated(By.id(orProp.getProperty(locatorKey))));
			}else if (locatorKey.endsWith("_name")) {
				wait.until(ExpectedConditions.presenceOfElementLocated(By.name(orProp.getProperty(locatorKey))));
			}else if (locatorKey.endsWith("_classname")) {
				wait.until(ExpectedConditions.presenceOfElementLocated(By.className(orProp.getProperty(locatorKey))));
			}else if (locatorKey.endsWith("_xpath")) {
				wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(orProp.getProperty(locatorKey))));
			}else if (locatorKey.endsWith("_css")) {
				wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(orProp.getProperty(locatorKey))));
			}else if (locatorKey.endsWith("_linktext")) {
				wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText(orProp.getProperty(locatorKey))));
			}else if (locatorKey.endsWith("_partiallinktext")) {
				wait.until(ExpectedConditions.presenceOfElementLocated(By.partialLinkText(orProp.getProperty(locatorKey))));
			}*/
			return true;
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			return false;
		}
	}
	
	
	public static By getByLocator(String locatorKey)
	{
		By by = null;
		
		if(locatorKey.endsWith("_id")) {
			 by = By.id(orProp.getProperty(locatorKey));
		}else if (locatorKey.endsWith("_name")) {
			by = By.name(orProp.getProperty(locatorKey));
		}else if (locatorKey.endsWith("_classname")) {
			by = By.className(orProp.getProperty(locatorKey));
		}else if (locatorKey.endsWith("_xpath")) {
			by = By.xpath(orProp.getProperty(locatorKey));
		}else if (locatorKey.endsWith("_css")) {
			by = By.cssSelector(orProp.getProperty(locatorKey));
		}else if (locatorKey.endsWith("_linktext")) {
			by = By.linkText(orProp.getProperty(locatorKey));
		}else if (locatorKey.endsWith("_partiallinktext")) {
			by = By.partialLinkText(orProp.getProperty(locatorKey));
		}
		
		return by;
	}


}
