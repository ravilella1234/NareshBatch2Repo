package icici.loans.goldloans;

import java.util.Scanner;

public class SingleDimenssionArrayDemo 
{

	public static void main(String[] args) 
	{
		/*int[] a = {10,20,30,40};
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println("a["+i+"]="+a[i]);
		}*/
		
		
		/*int[] a = new int[]{10,20,30,40};
		for(int i=0;i<a.length;i++)
		{
			System.out.println("a["+i+"]="+a[i]);
		}*/
		
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the array size : ");
		 int asize = sc.nextInt();
		
		int[] a = new int[asize];
		int sum = 0;
				
		System.out.println("Enter the array Elements : ");
		for(int i=0;i<a.length;i++)
		{
			a[i] = sc.nextInt();
			System.out.println("a["+i+"]="+a[i]);
			sum = sum + a[i];
		}
		System.out.println("um of the array is : "+  sum);
	}

}
