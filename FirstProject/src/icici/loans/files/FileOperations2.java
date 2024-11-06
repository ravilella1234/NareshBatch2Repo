package icici.loans.files;

import java.io.File;
import java.io.IOException;

public class FileOperations2 
{

	public static void main(String[] args) throws IOException 
	{
		//File f = new File(System.getProperty("user.dir")+"/resume2.txt");
		//File f = new File(".\\resume3.txt");
		File f = new File(".\\resumes\\resume4.txt");
		if(f.exists())
			f.delete();
		f.createNewFile();
		
		//System.out.println(f.getAbsolutePath());
	}

}
