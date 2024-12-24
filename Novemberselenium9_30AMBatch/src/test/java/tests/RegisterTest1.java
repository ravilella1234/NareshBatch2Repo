package tests;

import java.lang.reflect.Method;

import org.testng.annotations.Test;

public class RegisterTest1 
{
	String cName = this.getClass().getSimpleName();
	
  @Test(groups = {"smoke"})
  public void registerWithMandotoryFields(Method method) 
  {
	  
	  System.out.println(cName+ " - " + method.getName() + " - " + Thread.currentThread().getId() + "smoke");
  }
  
  @Test(groups = {"sanity"})
  public void registerWithAllFields(Method method) 
  {
	int x = 5/0;
	  System.out.println(cName+ " - " + method.getName() + " - " + Thread.currentThread().getId() + "sanity");
  }
  
  @Test(groups = {"smoke"})
  public void registerWithDuplicateFields(Method method) 
  {
	  System.out.println(cName+ " - " + method.getName() + " - " + Thread.currentThread().getId() + "smoke");
  }
  
  @Test(groups = {"Regression"}) //,dependsOnGroups = {"smoke"}
  public void registerWithEmptyFields(Method method) 
  {
	  System.out.println(cName+ " - " + method.getName() + " - " + Thread.currentThread().getId() + "Regression");
  }
  
}
