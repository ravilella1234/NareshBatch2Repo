package icici.loans.goldloans;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo 
{

	public int[] m1()
	{
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the array size : ");
		 int asize = sc.nextInt();
		
		int[] a = new int[asize];
		int sum = 0;
		int c = 10;
				
		System.out.println("Enter the array Elements : ");
		for(int i=0;i<a.length;i++)
		{
			a[i] = sc.nextInt();
			System.out.println("a["+i+"]="+a[i]);
			sum = sum + a[i];
		}
		System.out.println("sum of the array in m1 : "+  sum);
		return new int[]{sum,c};	
	}
	
	public static void main(String[] args) 
	{
		ArrayDemo obj = new ArrayDemo();
		int[] count = obj.m1();
		System.out.println("Count of the array in main : "+  Arrays.toString(count));
	}

}
