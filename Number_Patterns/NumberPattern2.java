/*
 * 
1        11        1
12      2112      21
123    321123    321
1234  43211234  4321
12345543211234554321
 * 
 */

package Number_Patterns;

import java.util.Scanner;

public class NumberPattern2
{
	public static void main(String[] args)
	{
		int i, j, k, rows;
				
		System.out.println("Enter number: ");
		rows = new Scanner(System.in).nextInt();
		
		for(i=1; i<=rows; i++)
		{
			for(j=1; j<=rows; j++)
		    {
				if(j<=i)
					System.out.print(String.valueOf(j));
			    else
			    	System.out.print(" ");
		    }
			for(j=rows; j>=1; j--)
			{
				 if(j<=i)
					 System.out.print(String.valueOf(j));
				 else
					 System.out.print(" ");
			}
			for(j=1; j<=rows; j++)
		    {
				if(j<=i)
					System.out.print(String.valueOf(j));
			    else
			    	System.out.print(" ");
		    }
			for(j=rows; j>=1; j--)
			{
				 if(j<=i)
					 System.out.print(String.valueOf(j));
				 else
					 System.out.print(" ");
			}
			System.out.println();
		}
		
	}
}

/*
Enter number: 
5
1        11        1
12      2112      21
123    321123    321
1234  43211234  4321
12345543211234554321

*/