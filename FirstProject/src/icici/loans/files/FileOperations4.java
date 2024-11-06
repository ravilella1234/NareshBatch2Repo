package icici.loans.files;

import java.io.File;
import java.io.IOException;

public class FileOperations4 
{

	public static void main(String[] args) throws IOException 
	{
		
		File f = new File("D:\\Naresh Batch-2\\FirstProject\\main");
		System.out.println(f.getAbsolutePath());
		System.out.println(f.getParent());
		String val = f.getParent()+"\\r1.txt";
		
		System.out.println(val);
	
	}

}
