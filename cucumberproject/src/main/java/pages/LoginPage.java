package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage 
{
	
	private WebDriver driver;
	
	private By usernameFiled = By.id("username");
	private By passwordFiled = By.id("password");
	private By loginButtonField = By.id("submit");
	private By loginSuccessField = By.xpath("//strong[contains(text(),'Congratulations student. You successfully logged in!')]");
	private By logoutButtonField = By.xpath("//a[normalize-space()='Log out']");
	private By loginErrorField = By.cssSelector("#error");
    //private By loginwronguserField = ;
	//private By loginwrongpasswordField = ;
	/**
	 * @param driver
	 */
	public LoginPage(WebDriver driver) 
	{
		this.driver = driver;
	}
	
	public void enterUserName(String userName)
	{
		driver.findElement(usernameFiled).sendKeys(userName);
	}
	
	public void enterPassword(String password)
	{
		driver.findElement(passwordFiled).sendKeys(password);
	}
	
	public void clickSubmit()
	{
		driver.findElement(loginButtonField).click();
	}
	
	public String loginSuccess()
	{
		return driver.findElement(loginSuccessField).getText();
	}
	
	public boolean loginErrorDispled() 
	{
		return driver.findElement(loginErrorField).isDisplayed();
	}
	
	public String loginErrorText() 
	{
		return driver.findElement(loginErrorField).getText();
	}
	
	public String getCurrentURL()
	{
		return driver.getCurrentUrl();
	}
	
	public boolean logOutButton()
	{
		return driver.findElement(logoutButtonField).isDisplayed();
	}

}
