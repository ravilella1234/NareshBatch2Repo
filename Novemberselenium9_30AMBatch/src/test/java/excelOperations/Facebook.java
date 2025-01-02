package excelOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook 
{

	public static void main(String[] args) throws Exception 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		ExcelAPI e = new ExcelAPI("C:\\Users\\DELL\\Desktop\\testdata1.xlsx");
		int rowCount = e.getRowCount("login");
		for(int i=1;i<rowCount;i++)
		{
			driver.findElement(By.id("email")).clear();
			driver.findElement(By.id("email")).sendKeys(e.getCellData("login", "UserName", i));
			
			driver.findElement(By.id("pass")).clear();
			driver.findElement(By.id("pass")).sendKeys(e.getCellData("login", "Password", i));
			
			Thread.sleep(2000);
		}
		
	}

}
