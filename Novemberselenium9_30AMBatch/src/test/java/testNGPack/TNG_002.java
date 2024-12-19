package testNGPack;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import launcher.BaseTest;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.lang.reflect.Method;

import org.testng.annotations.AfterMethod;

public class TNG_002 extends BaseTest
{
	
  @BeforeMethod
  @Parameters("browser")
  public void startUp(@Optional("chrome") String btype) throws Exception 
  {
	  System.out.println("startUp has started...");
	  	Runtime.getRuntime().exec("taskkill /F /IM chrome.exe");
	    init();
		test = getTest();
		test = getReport().createTest(this.getClass().getName());
		test.log(Status.INFO, "init the properties files....");
		
		launch(btype);
		test.log(Status.INFO, "Opened the Browser : " +  getP().getProperty("chromebrowser"));
		
		navigateurl("amazonurl");
		test.log(Status.INFO, "Opened the application : " + getChildProp().getProperty("amazonurl"));
  }	
	
  @Test
  @Parameters("amazonsearchtext")
  public void amazonAction(Method method, String searchtext) 
  {
	  System.out.println(method.getName() +"  is Executing...");
	    selectDropdownOption("amazonsearchdropbox_id","Books");
		test.log(Status.PASS, "select Dropdown Option By using locator : " + getOrProp().getProperty("amazonsearchdropbox_id"));
		
		typeText("amazonsearchtextbox_id",searchtext);
		test.log(Status.FAIL, "Entered the search text By using locator : " + getOrProp().getProperty("amazonsearchtextbox_id"));
		
		clickElement("amazonsearchbutton_xpath");
		test.log(Status.INFO, "Clicked on Element By using locator :" + getOrProp().getProperty("amazonsearchbutton_xpath"));
  }
  

  @AfterMethod
  public void packUp() 
  {
	  System.out.println("packUp has Ended...");
	  getReport().flush();
	  driver.quit();
  }

}
