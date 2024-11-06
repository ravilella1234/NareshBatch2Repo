package icici.loans.files;

import java.io.File;
import java.io.IOException;

public class FileOperations3 
{

	public static void main(String[] args) throws IOException 
	{
		
		File f = new File("C:\\Users\\DELL\\Desktop\\resumes\\A\\B\\C");
		f.mkdirs();
		if(f.exists())
			f = new File("C:\\Users\\DELL\\Desktop\\resumes\\A\\B\\C\\r1.txt");
		f.createNewFile();
	}

}
