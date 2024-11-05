package icici.loans.exceptions;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class ExceptionDemo 
{

	public static void main(String[] args) 
	{
		int nr , dr , result;
		
		Scanner obj = new Scanner(System.in);
		
		
		while (true) 
		{
			System.out.println("Enter the NR value : ");
			nr = obj.nextInt();
			System.out.println("Enter the DR value :");
			dr = obj.nextInt();
			try 
			{
				result = nr / dr;
				System.out.println(result);
				break;
			} 
			catch (Exception e) 
			{
				e.printStackTrace();
			} 
			finally 
			{
				System.out.println("iam final block...");
			}
		}
	}

}
