package launcher;

public class TC_002 extends BaseTest
{

	public static void main(String[] args) throws Exception 
	{
		init();
		
		launch("chromebrowser");
		
		navigateurl("amazonurl");
		
		driver.manage().window().maximize();
		
		
	}

}
