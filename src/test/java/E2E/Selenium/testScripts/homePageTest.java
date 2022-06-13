package E2E.Selenium.testScripts;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import E2E.Selenium.page.landingPage;
import E2E.Selenium.page.loginPage;
import E2E.Selenium.utils.base;




public class homePageTest extends base {
	
	Logger log = Logger.getLogger(homePageTest.class.getName());
	
	@BeforeTest
	public void openBrowser() throws IOException
	{
		driver = initializeDriver();
		log.info("launching the driver");
		driver.get(prop.getProperty("url"));
	}
	
	@Test
	public void basePageNavigation()
	{
		
		
		landingPage l = new landingPage(driver);
		
		l.Login().click();
		log.debug("Clicking on login");
		
		loginPage lp = new loginPage(driver);
		lp.getEmail().sendKeys("email");
		lp.getPassword().sendKeys("password");
		lp.submitButton().click();
		log.debug("Clicking on submit");
		}
	
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
		log.info("Closing the browser");
	}

}
