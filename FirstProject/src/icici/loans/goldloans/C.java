package icici.loans.goldloans;

import java.util.Date;

import icici.loans.carloans.A;

public   class C 
{
	 int i= 10;
	public final static String cname = "dell";
	
	
	
	public  void m3()
	{
		System.out.println("iam m3 from C");
		System.out.println(i);
		i=20;
		
	}
	
	public static void m5()
	{
		System.out.println("iam m5 static method");
	}
	
	static
	{
		System.out.println("iam static Block...");
	}
	
	static
	{
		Date dt = new Date();
		System.out.println(dt);
	}

	public static void main(String[] args) 
	{
		//A a = new A();
		//a.m1();
		//System.out.println(a.x);
		
		C c = new C();
		c.m3();
		m5();
		//c.m1();
		//System.out.println(c.x);
	}

}
