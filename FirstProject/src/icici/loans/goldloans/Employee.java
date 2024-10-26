package icici.loans.goldloans;

public class Employee 
{
	int eno;
	String ename;
	float roi;
	
	/*public Employee()
	{
		System.out.println("iam default constructor...");
		
		System.out.println(this.eno);
		System.out.println(this.ename);
		System.out.println(this.roi);
	}*/
	
	public Employee(int eno) 
	{
		//this();
		this.eno = eno;
		
		System.out.println(this.eno);
		System.out.println(this.ename);
		System.out.println(this.roi);
	}

	public Employee(int eno, String ename) 
	{
		this(eno);
		this.eno = eno;
		this.ename = ename;
		
		System.out.println(this.eno);
		System.out.println(this.ename);
		System.out.println(this.roi);
	}

	public Employee(int eno, String ename, float roi) 
	{
		this(eno,ename);
		this.eno = eno;
		this.ename = ename;
		this.roi = roi;
		
		System.out.println(this.eno);
		System.out.println(this.ename);
		System.out.println(this.roi);
	}

	public static void main(String[] args) 
	{
		Employee e4 = new Employee(1745,"kiran",8.5f);
	}

}
