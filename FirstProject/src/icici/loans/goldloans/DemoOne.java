package icici.loans.goldloans;

import java.io.File;
import java.util.Arrays;

public class DemoOne {

	
	public String cName()
	{
		return this.getClass().getSimpleName();
	}
	
	public String pName()
	{
		return this.getClass().getPackageName();
	}
	
	public String[] projectName(String path)
	{
		File projectDir = new File(path);
		 String name1 = projectDir.getName();
		 String name2 = projectDir.getParent();
		 
		 return new String[] {name1,name2};
	}
	
	
	public String getlastNameFromPackage() 
	{
		Package p = this.getClass().getPackage();
		String n = p.getName();
		String[] partName = n.split("\\.");
		if(partName.length>3)
			return partName[2];
		else
			return "String is not present at index ";
	}
	
	
	public static void main(String[] args) 
	{
		System.out.println(System.getProperty("user.dir"));
		System.out.println(System.getProperty("user.name"));
		System.out.println(System.getProperty("os.name"));
		System.out.println(System.getProperty("os.version"));
		
		System.out.println((System.getProperty("user.dir")));
		
		DemoOne obj = new DemoOne();
		System.out.println(obj.cName());
		
		System.out.println(obj.pName());
		
		String[] val = obj.projectName(System.getProperty("user.dir"));
		System.out.println(Arrays.toString(val));
		
		String val1 = obj.getlastNameFromPackage();
		System.out.println(val1);
	}
}
