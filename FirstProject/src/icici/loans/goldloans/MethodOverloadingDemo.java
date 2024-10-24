package icici.loans.goldloans;

public class MethodOverloadingDemo 
{
	
	/*public void m1(int x)
	{
		System.out.println(x);
	}*/
	
	/*public void m1(float x)
	{
		System.out.println(x);
	}*/
	
	/*public void m1(String x)
	{
		System.out.println(x);
	}*/
	
	/*public void m1(Integer x)
	{
		System.out.println(x);
	}*/
	
	/*public void m1(Number x)
	{
		System.out.println(x);
	}*/
	
	public void m1(Object x)
	{
		System.out.println(x);
	}

	public static void main(String[] args) 
	{
		MethodOverloadingDemo obj = new MethodOverloadingDemo();
		obj.m1(100);
		obj.m1(13.34f);
		obj.m1("ravi");
		obj.m1(300);
		obj.m1(34.45f);
		obj.m1("teja");
	}

}
