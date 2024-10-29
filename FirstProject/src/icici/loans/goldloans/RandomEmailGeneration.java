package icici.loans.goldloans;

import java.util.Date;
import java.util.Random;

public class RandomEmailGeneration 
{
	public int randomNum(int numberBoud)
	{
		Random r = new Random();
		int rNum = r.nextInt(numberBoud);
		return rNum;
	}
	
	public String randomNumThroughDate()
	{
		Date d =  new Date();
		String dt = d.toString().replace(":", "").replace(" ", "");
		return dt;
	}

	public static void main(String[] args) 
	{
		String fName = "qatest";
		String dName = "@gmail.com";
		
		RandomEmailGeneration obj = new RandomEmailGeneration();
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(fName+obj.randomNum(9999)+dName);
		}
		
		for(int j=1;j<=10;j++)
		{
			System.out.println(obj.randomNumThroughDate()+dName);
		}
		
		
	}

}
