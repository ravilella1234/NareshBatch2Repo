package icici.loans.files;

import java.io.File;
import java.io.FileInputStream;

public class File1 
{

	public static void main(String[] args) throws Exception 
	{
		File f = new File("C:\\Users\\DELL\\Desktop\\text1.txt");
		
		FileInputStream fis = new FileInputStream(f);
		//FileInputStream fis1 = new FileInputStream("C:\\Users\\DELL\\Desktop\\text1.txt");
		int asciiNum = 0;
		while((asciiNum = fis.read()) != -1)
		{
			System.out.print((char)asciiNum);
			Thread.sleep(1000);
		}
		
		//System.out.print(fis.read());
		fis.close();
	}

}
