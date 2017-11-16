package DataDrivenTests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest{
	
	@DataProvider(name = "provideDaysInterval")
	public Object[][] provideData() {
	return new Object[][]{{1}, {2}, {28}, {110}, {365}, {400}, {800}};
	}
	 @DataProvider(name = "Authentication")
	 
	  public static Object[][] credentials() {
	 
	        return new Object[][] { { "testuser_1", "Test@123" }, { "testuser_2", "Test@126" }};
	 }
	@Test(dataProvider="provideDaysInterval")
	public void dataValidTest(int numberOfDaysInterval)
	{
		
	}
	@Test(dataProvider=  "Authentication")
	 public void test(String sUsername, String sPassword)
	 {
	 }
	
	}
	 

	


