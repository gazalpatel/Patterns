/*
 * 
1 
2 3 2 
3 4 5 4 3 
4 5 6 7 6 5 4 
5 6 7 8 9 8 7 6 5 

 * 
 */

package Number_Patterns;

import java.util.Scanner;

public class NumberTriangle41
{
	public static void main(String[] args)
	{
		int i, j, k, rows;
				
		System.out.println("Enter number of rows: ");
		rows = new Scanner(System.in).nextInt();
		
		for(i=1; i<=rows; i++)
	    {
			k = i;
			for(j=1; j<=i; j++)
	        {
				System.out.print(String.valueOf(k++)+ " ");
	        }
			k -= 2;
			for(j=k; j>=i; j--)
	        {
				System.out.print(String.valueOf(k--)+ " ");
	        }
			System.out.println();
	    }
	}
}

/*

Enter number of rows: 
5
1 
2 3 2 
3 4 5 4 3 
4 5 6 7 6 5 4 
5 6 7 8 9 8 7 6 5 

*/