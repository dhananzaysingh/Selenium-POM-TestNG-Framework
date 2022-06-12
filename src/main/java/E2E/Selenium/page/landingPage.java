package E2E.Selenium.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class landingPage {
	
	WebDriver driver;
	public landingPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By loginElement = By.cssSelector("a[href*='sign_in']");
	
	public WebElement Login()
	{
		return driver.findElement(loginElement);
		
	}

}
