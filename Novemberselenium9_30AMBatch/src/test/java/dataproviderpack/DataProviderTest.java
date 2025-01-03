package dataproviderpack;

import org.testng.annotations.DataProvider;

public class DataProviderTest 
{
 

  @DataProvider() //name = "Testdata"
  public Object[][] data() 
  {
    return new Object[][] 
    {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
      new Object[] { 3, "c" },
    };
  }
}
