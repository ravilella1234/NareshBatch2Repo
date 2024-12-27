package tests;

import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


public class RegisterTest 
{
	String cName = this.getClass().getSimpleName();
	
  @Test(priority = 1,groups = {"smoke","Regression","Register","All"})
  public void registerWithMandotoryFields(Method method) 
  {
	  System.out.println(cName+ " - " + method.getName() + " - " + Thread.currentThread().getId());
  }
  
  @Test(priority = 2,groups = {"smoke","Regression","Register","All"})
  public void registerWithAllFields(Method method) 
  {
	  System.out.println(cName+ " - " + method.getName() + " - " + Thread.currentThread().getId());
	  Assert.fail();
  }
  
  @Test(priority = 3,groups = {"Regression","sanity","Register","All"},timeOut = 1000)
  public void registerWithDuplicateFields(Method method) throws Exception 
  {
	  System.out.println(cName+ " - " + method.getName() + " - " + Thread.currentThread().getId());
	  Thread.sleep(2000);
  }
  
  @Test(priority = 4,groups = {"Regression","Register","All"},dependsOnMethods = {"registerWithAllFields"})
  public void registerWithEmptyFields(Method method) 
  {
	  System.out.println(cName+ " - " + method.getName() + " - " + Thread.currentThread().getId());
  }
  
}
