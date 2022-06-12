package E2E.Selenium.resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {
	
	
	
	public WebDriver driver;
	public Properties prop;

	public WebDriver initializeDriver() throws IOException 
	{
		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Dell\\eclipse-workspace\\Selenium\\src\\main\\java\\E2E\\Selenium\\resources\\data.properties");
		
		prop.load(fis);
		
		String BrowserName = prop.getProperty("Browser");
		
		if(BrowserName.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		else if(BrowserName.equals("Firefox"))
		{
			//execute firefox code
		}
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		return driver;
		
	}

}
