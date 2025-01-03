package dataproviderpack;

import org.testng.annotations.Test;

public class UserTest 
{
  @Test(dataProvider = "data" , dataProviderClass = DataProviderTest.class)
  public void f(Integer i, String s) 
  {
	  
  }
}
