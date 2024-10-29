package icici.loans.goldloans;

import java.io.File;
import java.util.Enumeration;
import java.util.Properties;
import java.util.Set;

public class ImportantFunctionalities 
{
	
	public String projectName(String path)
	{
		File f = new File(path);
		return f.getName();
	}
	
	public String cName()
	{
		return this.getClass().getSimpleName();	
	}
	
	public String pName()
	{
		return this.getClass().getPackageName();	
	}

	public static void main(String[] args) 
	{
		System.out.println(System.getProperty("user.dir"));
		
		ImportantFunctionalities obj = new ImportantFunctionalities();
		System.out.println(obj.projectName(System.getProperty("user.dir")));
		
		System.out.println(obj.cName());
		
		System.out.println(obj.pName());
		
		System.out.println(System.getProperty("os.name"));
		System.out.println(System.getProperty("os.version"));
		System.out.println(System.getProperty("user.name"));
		System.out.println(System.getProperty("user.home"));
		
		
		
		Properties p = System.getProperties();
		Enumeration<Object> e = p.elements();
		while(e.hasMoreElements())
		{
			Object ele = e.nextElement();
			System.out.println(ele);
		}
		
		
	}

}
