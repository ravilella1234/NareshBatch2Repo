package assertionpack;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertionTest 
{
  @Test
  public void f() 
  {
	  /*Assert.assertEquals(null, null);
	  Assert.assertNotEquals(getClass(), getClass());
	  Assert.assertNull(getClass());
	  Assert.assertNotNull(getClass());
	  Assert.assertTrue(false, null);
	  Assert.assertFalse(false, null);
	  Assert.fail(null);*/
	  
	  String s1 = "ravikanth";
	  String s2 = "lella";
	  
//	  Assert.assertEquals(s1, s2);
//	  System.out.println("iam second line...");
//	  Assert.assertNotEquals(s1, s2);
//	  System.out.println("iam fourth line...");
	  
	  Assert.assertTrue(s1.equals(s2), "Both text are not equal...");
	  System.out.println("iam first line...");
	  
  }
}
