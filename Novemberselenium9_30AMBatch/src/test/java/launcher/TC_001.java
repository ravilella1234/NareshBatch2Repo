package launcher;

public class TC_001 extends BaseTest
{

	public static void main(String[] args) 
	{
		launch("Chrome");
		
		navigateurl("https://www.amazon.in/");
	}

}
