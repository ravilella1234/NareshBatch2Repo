package icici.loans.files;

import java.io.File;
import java.io.FileReader;

public class File3 
{

	public static void main(String[] args) throws Exception 
	{
		File f = new File("C:\\Users\\DELL\\Desktop\\text1.txt");
		
		FileReader fr = new FileReader(f);
		int asciiNum = 0; 
		while((asciiNum = fr.read()) != -1)
		{
			System.out.print((char)asciiNum);
			Thread.sleep(1000);
		}
	}
}
