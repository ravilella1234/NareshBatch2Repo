package icici.loans.goldloans;

public class EmployeeChild extends Employee
{
	String city;
	
	public EmployeeChild(String city) 
	{
		super(1745,"ravi",13.34f);
		this.city = city;
		
		System.out.println(this.city);
	}
	
	 void m3()
	{
	
	}

	public static void main(String[] args) 
	{
		EmployeeChild ec = new EmployeeChild("hyderabad");
	}

}
