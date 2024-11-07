package icici.loans.files;

import java.io.File;
import java.util.Scanner;

public class File2 
{

	public static void main(String[] args) throws Exception 
	{
		File f = new File("C:\\Users\\DELL\\Desktop\\text1.txt");
		
		Scanner sc = new Scanner(f);
		/*while(sc.hasNext())
		{
			System.out.println(sc.next());
			Thread.sleep(1000);
		}*/
		
		while(sc.hasNextLine())
		{
			System.out.println(sc.nextLine());
			Thread.sleep(1000);
		}
		sc.close();
	}

}
