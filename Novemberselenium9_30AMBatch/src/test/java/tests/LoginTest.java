package tests;

import java.lang.reflect.Method;

import org.testng.annotations.Test;

public class LoginTest 
{
	
	String cName = this.getClass().getSimpleName();
	
  @Test(priority = 1)
  public void loginWithValidCredientials(Method method) 
  {
	  System.out.println(cName+ " - " + method.getName() + " - " + Thread.currentThread().getId());
  }
  
  @Test(priority = 2)
  public void loginWithInvalidUser(Method method) 
  {
	  System.out.println(cName+ " - " + method.getName() + " - " + Thread.currentThread().getId());
  }
  
  @Test(priority = 3)
  public void loginWithInvalidPassword(Method method) 
  {
	  System.out.println(cName+ " - " + method.getName() + " - " + Thread.currentThread().getId());
  }
  
  @Test(priority = 4)
  public void loginWithInvalidCredientials(Method method) 
  {
	  System.out.println(cName+ " - " + method.getName() + " - " + Thread.currentThread().getId());
  }
  
  @Test(priority = 5)
  public void loginWithEmptyFields(Method method) 
  {
	  System.out.println(cName+ " - " + method.getName() + " - " + Thread.currentThread().getId());
  }
}
