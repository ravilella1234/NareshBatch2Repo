package icici.loans.carloans;

public class Child2 extends Child1
{

	public static void main(String[] args) {
		Child2 c = new Child2();
		c.m1();
		c.m2();
	}

	@Override
	public void m2() {
		System.out.println("iam m2 overriden method from Child2");
	}

}
