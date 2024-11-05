package icici.loans.exceptions;

import java.util.Scanner;

public class UserDefineException extends Throwable
{

	
	
	public UserDefineException(String string) 
	{
		super(string);
	}

	public static void main(String[] args) 
	{
		String str;
		Scanner obj = new Scanner(System.in);
		
		
		while (true) {
			System.out.println("Enter the 10 character string : ");
			str = obj.nextLine();
			try 
			{
				if (str.length() != 10) 
					throw new UserDefineException("String should contain 10 character");
				 else
					 System.out.println(str);
				break;
			} 
			catch (UserDefineException e) 
			{
				e.printStackTrace();
			} 
		}
	}

}
