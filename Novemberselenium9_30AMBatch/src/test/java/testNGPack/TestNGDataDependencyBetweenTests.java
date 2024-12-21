package testNGPack;

import java.lang.reflect.Method;

import org.testng.ITestContext;
import org.testng.annotations.Test;

public class TestNGDataDependencyBetweenTests 
{
	
  @Test
  public void test1(Method method,ITestContext context) 
  {
	  String bookingID = "RRR1234";
	  System.out.println(method.getName() + " --- "+ bookingID);
	  context.setAttribute("bID", bookingID);
  }
  
  @Test
  public void test2(Method method,ITestContext context) 
  {
	  String bookingID = context.getAttribute("bID").toString();
	  System.out.println(method.getName()+ " --- "+ bookingID );
  }
  
}
