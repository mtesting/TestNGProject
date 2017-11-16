package SeleniumTestNGTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class SampleTest {
	WebDriver driver;
	
	@Test(priority=1)
	public void verifyTitle()
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\GIRISH\\Downloads\\geckodriver-v0.17.0-win32\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http:\\www.gmail.com");
		String actual= driver.getTitle();
		Assert.assertEquals(actual, "Gmail");
	}
	@Test(priority=2)
	public void closeDriver()
	{
		System.out.println("closing the driver");
	}
	
	

}
