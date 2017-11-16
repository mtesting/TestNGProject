package SeleniumTestNGTests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Sample {
	WebDriver driver;
	MyBrowser mybrowser;
	@BeforeClass
	public void myBrowser()
	{
	 mybrowser= new MyBrowser();
	 mybrowser.launchChrome();
	 System.out.println("Browser created");
	}
  @Test
  public void testBrowser() throws Exception {
	 
	  mybrowser.driver.get("http:\\www.gmail.com");
	  System.out.println("Sample executed");
	  Thread.sleep(3000);
	  
  }
  @AfterClass
  public void closeBrowser()
  {
	  mybrowser.closedriver();
	  System.out.println("Browser closed");
	  
  }
}
