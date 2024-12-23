package tests;

import java.lang.reflect.Method;

import org.testng.annotations.Test;

public class LoginTest 
{
	
	String cName = this.getClass().getSimpleName();
	
  @Test(priority = 1,groups = {"smoke","sanity","Regression","Login","All"})
  public void loginWithValidCredientials(Method method) 
  {
	  System.out.println(cName+ " - " + method.getName() + " - " + Thread.currentThread().getId());
  }
  
  @Test(priority = 2,groups = {"sanity","Regression","Login","All"})
  public void loginWithInvalidUser(Method method) 
  {
	  System.out.println(cName+ " - " + method.getName() + " - " + Thread.currentThread().getId());
  }
  
  @Test(priority = 3,groups = {"Regression","Login","All"})
  public void loginWithInvalidPassword(Method method) 
  {
	  System.out.println(cName+ " - " + method.getName() + " - " + Thread.currentThread().getId());
  }
  
  @Test(priority = 4,groups = {"Regression","Login","All"})
  public void loginWithInvalidCredientials(Method method) 
  {
	  System.out.println(cName+ " - " + method.getName() + " - " + Thread.currentThread().getId());
  }
  
  @Test(priority = 5,groups = {"Regression","Login","All"})
  public void loginWithEmptyFields(Method method) 
  {
	  System.out.println(cName+ " - " + method.getName() + " - " + Thread.currentThread().getId());
  }
}
