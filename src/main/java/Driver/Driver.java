package Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Driver {
	String path;
	public static WebDriver driver;
	
	@BeforeSuite
	public void Launch_browser()
	{
		path= System.getProperty("user.dir")+"//Driver//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
	}
	@AfterSuite
	public void close()
	{
		driver.close();
	}

}
