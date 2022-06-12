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
	
	@Test(dataProvider="getData")
	public void basePageNavigation(String email, String password)
	{
		
		
		landingPage l = new landingPage(driver);
		
		l.Login().click();
		
		loginPage lp = new loginPage(driver);
		lp.getEmail().sendKeys(email);
		lp.getPassword().sendKeys(password);
		lp.submitButton().click();
		}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] obj = new Object[2][2];
		
		obj[0][0]="restricteduser@gmail.com";
		obj[0][1]="123";
		obj[1][0]="nonrestricteduser@gmail.com";
		obj[1][1]="1234";
		
		return obj;
	}
	
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
	}

}
