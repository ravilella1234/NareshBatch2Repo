package assertionpack;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.testng.Assert.*;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SoftAssertionTest 
{

	public static void main(String[] args) throws Exception 
	{
		SoftAssert obj = new SoftAssert();
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(10000);
		
		String actualtitle = driver.getTitle();
		String expectedtitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		
		assertEquals(actualtitle, expectedtitle);
		
		
		assertFalse(driver.findElement(By.linkText("Mobiles")).isDisplayed(),"Element is not displayed");
		Thread.sleep(3000);
		System.out.println("iam first line...");
		
//		obj.assertTrue(false, "msg1");
//		obj.assertTrue(true, "msg2");
//		obj.assertTrue(false, "msg3");
//		obj.assertTrue(true, "msg4");
		
		obj.assertAll();
	}

}
