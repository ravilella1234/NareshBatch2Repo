package icici.loans.goldloans;

public class VariableTypes 
{
	//primitive variable
	int x = 100; //primitive instance variable (or) global (or) non-static
	static double roi = 6.5;  // primitive static variable
	static VariableTypes obj;
	
	public void m1()
	{
		int x = 300; // primitive local variable
		//System.out.println(y);
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(roi);
	}
	
	public static void m2()
	{
		 obj = new VariableTypes();
		System.out.println(obj.x);
		System.out.println(VariableTypes.roi);
	}
	
	public static void main(String[] args) 
	{
		//Non-primitive variable
		obj = new VariableTypes();
		System.out.println(obj.x);
		System.out.println(VariableTypes.roi);	
	}

}
