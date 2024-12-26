package assertionpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HardAssertionTest1 
{
  @Test
  public void f() throws Exception 
  {
	    WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(10000);
		
		String actualtitle = driver.getTitle();
		String expectedtitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		
		Assert.assertEquals(actualtitle, expectedtitle);
		
		Assert.assertTrue(driver.findElement(By.linkText("Best Sellers")).isDisplayed());
	  
		System.out.println("iam first line...");
  }
}
