package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage 
{
	WebDriver driver;

    // Locators
    private By usernameField = By.id("email");
    private By passwordField = By.id("pass");
    private By loginButton = By.id("u_0_5_/P");
    private By verifyTitle = By.xpath("//img[@alt='Facebook']");

    // Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Methods
    public void enterUsername(String username) {
        driver.findElement(usernameField).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();
    }

    public Boolean verifyTitle()
    {
    	return driver.findElement(verifyTitle).isDisplayed();
    }

}
