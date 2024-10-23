package icici.loans.carloans;

public class ChildClass extends FirstAbstract
{

	public static void main(String[] args) 
	{
		ChildClass c = new ChildClass();
		c.m1();
		c.m2();
	}

	@Override
	public void m2() {
		System.out.println("iam m2 overriden method from ChildClass");
	}
	
	public void m1()
	{
		System.out.println("iam m1 overiden from ChildClass");
	}

}
