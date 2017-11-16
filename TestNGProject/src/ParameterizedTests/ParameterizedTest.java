package ParameterizedTests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizedTest {
	@Parameters("Param1")
	@Test
	public void Test1(String str1)
	{
		System.out.println(str1);
	}
	@Parameters("Param2")
	@Test
	public void test2(String str2)
	{
		System.out.println(str2);
	}
	

}
