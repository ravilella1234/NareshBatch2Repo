package icici.loans.files;

import java.io.File;

public class FileOperations 
{

	public static void main(String[] args) 
	{
		File f = new File("C:/Users/DELL/Desktop/resumes/resume1.txt");
		System.out.println(f.exists());
		System.out.println(f.isFile());
		System.out.println(f.isDirectory());
		System.out.println(f.getAbsolutePath());
		System.out.println(f.getName());
		System.out.println(f.getParent());
		System.out.println(f.getParentFile());
		System.out.println(f.canWrite());
		System.out.println(f.setWritable(true));
		System.out.println(f.isHidden());
		
	}

}
