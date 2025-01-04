package excelOperations;

import org.testng.annotations.Test;

import java.util.Hashtable;

import org.testng.annotations.DataProvider;

public class FinalversionTest 
{
  @Test(dataProvider = "dp")
  public void f(Hashtable<String, String> str) 
  {
	  System.out.println("f test");
  }
    

  @DataProvider
  public Object[][] dp() throws Exception 
  {
	  System.out.println("dp");
	    ExcelAPI e = new ExcelAPI("C:\\Users\\DELL\\Desktop\\suitex.xlsx");
		String sheetName = "data";
		String testName = "LoginTest";
		return DataUtil.getTableData(e, sheetName, testName);
  }
}
