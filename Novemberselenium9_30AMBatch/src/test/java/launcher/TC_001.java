package launcher;

public class TC_001 extends BaseTest
{

	public static void main(String[] args) throws Exception 
	{
		
		/*
		  		get()
				getCurrentUrl()
				getTitle()
				getPagesource()
				close()
				quit()
				manage()
				navigate()
				
				getWindoWHandle()
				getWindoWHandles()
				findElement()
				findElements()
				sWtichTo()
		 */
		
		
		launch("Chrome");
		
		navigateurl("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		String page = driver.getPageSource();
		System.out.println(page);
		
		driver.manage().deleteAllCookies();
		
		driver.navigate().back();
		
		//driver.wait(3000);
		Thread.sleep(3000);
		
		driver.navigate().forward();
		
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		
		//driver.close();
		driver.quit();
		
	}

}
