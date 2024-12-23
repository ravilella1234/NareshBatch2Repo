package tests;

import java.lang.reflect.Method;

import org.testng.annotations.Test;

public class SearchTest 
{
	
	String cName = this.getClass().getSimpleName();
	
  @Test(priority = 1,groups = {"smoke","sanity","Regression","Search","All"})
  public void searchWithValidProduct(Method method) 
  {
	  System.out.println(cName+ " - " + method.getName() + " - " + Thread.currentThread().getId());
  }
  
  @Test(priority = 2,groups = {"Regression","Search","All"})
  public void searchWithInvalidProduct(Method method) 
  {
	  System.out.println(cName+ " - " + method.getName() + " - " + Thread.currentThread().getId());
  }
  
  @Test(priority = 3,groups = {"Regression","Search","All"})
  public void searchWithEmptyProduct(Method method) 
  {
	  System.out.println(cName+ " - " + method.getName() + " - " + Thread.currentThread().getId());
  }
  
}
