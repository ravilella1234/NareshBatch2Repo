package test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.LoginPage2;
import utils.BaseTest;

public class LoginTest extends BaseTest
{
	
  @BeforeMethod
  public void startup() throws Exception
  {
	  init("chromebrowser");
	  navigateUrl("facebookurl");
  }
	
  @Test
  public void f()  
  {
	  //LoginPage page = new LoginPage(driver);
	  LoginPage2 page = new LoginPage2(driver);
	  page.enterUsername("ravilella");
	  page.enterPassword("ravilella");
	  //page.clickLogin();
	  Assert.assertTrue(page.verifyTitle(), "Not Displayed");
  }
  
  @AfterMethod
  public void endup()
  {
	  driver.quit();
  }
}
