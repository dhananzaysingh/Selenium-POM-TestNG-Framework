package E2E.Selenium.testScripts;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import E2E.Selenium.page.landingPage;
import E2E.Selenium.page.loginPage;




public class homePage extends E2E.Selenium.resources.base {
	
	@BeforeTest
	public void openBrowser() throws IOException
	{
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
	}
	
	@Test
	public void basePageNavigation()
	{
		
		
		landingPage l = new landingPage(driver);
		
		l.Login().click();
		
		loginPage lp = new loginPage(driver);
		lp.getEmail().sendKeys("email");
		lp.getPassword().sendKeys("password");
		lp.submitButton().click();
		}
	
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
	}

}
