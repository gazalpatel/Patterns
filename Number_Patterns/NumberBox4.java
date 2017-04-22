/*
 * 
432*
43*1
4*21
*321
 * 
 */

package Number_Patterns;

import java.util.Scanner;

public class NumberBox4 
{
	public static void main(String[] args)
	{
		int i, j, rows;

		System.out.println("Enter number of rows: ");
		rows = new Scanner(System.in).nextInt();
		
		for(i=1; i<=rows; i++)
	    {
			for(j=rows; j>=1; j--)
		    {
				if(i==j)
					System.out.print("*");
				else
					System.out.print(String.valueOf(j));
		    }
			System.out.println();
	    }
	}
}

/*

Enter number of rows: 
4
432*
43*1
4*21
*321

*/