package SeleniumTestNGTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyBrowser {

	
		
		WebDriver driver;
		
		public void launchChrome()
		{
			try{
				System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (1)\\chromedriver.exe");
			driver=new ChromeDriver();
			
			
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}
		public void launchfirefox()
		{
			System.setProperty("webdriver.gecko.driver","C:\\Users\\GIRISH\\Downloads\\geckodriver-v0.17.0-win32\\geckodriver.exe");
			//System.setProperty("webdriver.firefox.bin","C:\\Program Files\\Mozilla Firefox\firefox.exe");
			driver=new FirefoxDriver();
			
			
		}
		public void closedriver()
		{
			driver.quit();
		}
	}


