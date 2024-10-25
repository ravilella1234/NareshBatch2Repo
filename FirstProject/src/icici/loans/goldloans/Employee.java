package icici.loans.goldloans;

public class Employee 
{
	int eno;
	String ename;
	float roi;
	
	public Employee()
	{
		System.out.println("iam default constructor...");
	}

	public Employee(int i, String string) 
	{
		eno = i;
		ename = string;
	}

	public Employee(int i, String string, float f) 
	{
		eno = i;
		ename = string;
		roi = f;
	}

	public static void main(String[] args) 
	{
		Employee e1 = new Employee();
		System.out.println(e1.eno);
		System.out.println(e1.ename);
		System.out.println(e1.roi);
		
		Employee e2 = new Employee(1744,"ravi");
		System.out.println(e2.eno);
		System.out.println(e2.ename);
		System.out.println(e2.roi);
		
		Employee e3 = new Employee(1745,"kiran",8.5f);
		System.out.println(e3.eno);
		System.out.println(e3.ename);
		System.out.println(e3.roi);
	}

}
