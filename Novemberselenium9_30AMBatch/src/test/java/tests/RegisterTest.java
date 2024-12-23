package tests;

import java.lang.reflect.Method;

import org.testng.annotations.Test;

public class RegisterTest 
{
	String cName = this.getClass().getSimpleName();
	
  @Test(priority = 1,groups = {"smoke","sanity","Regression","Register","All"})
  public void registerWithMandotoryFields(Method method) 
  {
	  System.out.println(cName+ " - " + method.getName() + " - " + Thread.currentThread().getId());
  }
  
  @Test(priority = 2,groups = {"smoke","Regression","Register","All"})
  public void registerWithAllFields(Method method) 
  {
	  System.out.println(cName+ " - " + method.getName() + " - " + Thread.currentThread().getId());
  }
  
  @Test(priority = 3,groups = {"Regression","Register","All"})
  public void registerWithDuplicateFields(Method method) 
  {
	  System.out.println(cName+ " - " + method.getName() + " - " + Thread.currentThread().getId());
  }
  
  @Test(priority = 4,groups = {"Regression","Register","All"})
  public void registerWithEmptyFields(Method method) 
  {
	  System.out.println(cName+ " - " + method.getName() + " - " + Thread.currentThread().getId());
  }
  
}
