package icici.loans.goldloans;

public class TwoDimArray1 
{

	public static void main(String[] args) 
	{
		int[][] a = {
						{10,20,30},
						{40,50,},
						{70,80,90,10,20}
					};
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j] + "\t");
			}
			System.out.println("\n");
		}
		
		for(int[] p:a)
		{
			for(int q:p)
			{
				System.out.print(q + "\t");
			}
			System.out.println("\n");
		}
	}

}
