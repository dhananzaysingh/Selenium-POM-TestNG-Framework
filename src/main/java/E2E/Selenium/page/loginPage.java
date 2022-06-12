package E2E.Selenium.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPage {
	
	WebDriver driver;
	
	public loginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By email= By.cssSelector("input[id='user_email']");
	By password = By.xpath("//input[@type='password']");
	By submit = By.xpath("//input[@value='Log In']");
	
	
	public WebElement getEmail()
	{
		return driver.findElement(email);	
	}
	
	public WebElement getPassword()
	{
		return driver.findElement(password);
	}
	
	public WebElement submitButton()
	{
		return driver.findElement(submit);
	}

}
