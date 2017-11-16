package DataDrivenTests;

import java.io.File;
import java.io.FileInputStream;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;

public class ReadExcel{ 
@Test

	public void readExcelData() throws Exception
	{

	 Sheet s;
	   
	    File fi = new File("C:\\Mydata\\MyData1.xls");
	    Workbook W = Workbook.getWorkbook(fi);

	    s = W.getSheet(0);

	    for(int row = 0;row < s.getRows();row++){

	    String Username = s.getCell(0,row).getContents();
	    System.out.println("Username" +" "+Username);
	    String password= s.getCell(1, row).getContents();
	    System.out.println("Password" +" "+password);
	    
}
	}
}

