package launcher;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class TC_002 extends BaseTest
{

	public static void main(String[] args) throws Exception 
	{
		init();
		
		launch("chromebrowser");
		
		navigateurl("amazonurl");
		
		selectDropdownOption("amazonsearchdropbox_id","Books");
		
		typeText("amazonsearchtextbox_id","Harry Potter");
		
		clickElement("amazonsearchbutton_xpath");
		
		
		//WebElement loc = driver.findElement(By.id("searchDropdownBox"));
		//loc.sendKeys("Books");
		
		//driver.findElement(By.id("searchDropdownBox")).sendKeys("Books");
		
		//driver.findElement(By.name("field-keywords")).sendKeys("Harry Potter");
		
		//driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
		//driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).sendKeys(Keys.ENTER);
	}

	
}
