package Login;

import org.testng.annotations.Test;
import org.openqa.selenium.By;

import Driver.Driver;

public class Login extends Driver {
	@Test
	public void check()
	{
		driver.findElement(By.id("email")).sendKeys("admin");
		driver.findElement(By.id("pass")).sendKeys("admin");
		driver.findElement(By.id("loginbutton")).click();
		driver.navigate().back();
	}
	
	@Test
	public void forgot()
	{
		driver.findElement(By.partialLinkText("Forgotten account?")).click();
	}
}
