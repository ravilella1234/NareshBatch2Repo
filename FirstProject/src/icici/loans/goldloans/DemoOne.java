package icici.loans.goldloans;

import java.io.File;

public class DemoOne {

	
	public String cName()
	{
		return this.getClass().getSimpleName();
	}
	
	public String pName()
	{
		return this.getClass().getPackageName();
	}
	
	public String projectName(String path)
	{
		File projectDir = new File(path);
		return projectDir.getName();
		
	}
	
	public static void main(String[] args) 
	{
		System.out.println(System.getProperty("user.dir"));
		System.out.println(System.getProperty("user.name"));
		System.out.println(System.getProperty("os.name"));
		System.out.println(System.getProperty("os.version"));
		
		
		DemoOne obj = new DemoOne();
		System.out.println(obj.cName());
		
		System.out.println(obj.pName());
		
		System.out.println(obj.projectName(System.getProperty("user.dir")));
		
	}

}
