/*
 * 
11 
12 13 
13 14 15 
14 15 16 17 
 * 
 */

package Number_Patterns;

import java.util.Scanner;

public class NumberTriangle30 
{
	public static void main(String[] args)
	{
		int i, j, rows;
				
		System.out.println("Enter number of rows: ");
		rows = new Scanner(System.in).nextInt();
		
		for(i=1; i<=rows; i++)
	    {
			for(j=1; j<=i; j++)
	        {
				System.out.print(String.valueOf(9+i+j)+ " ");
	        }
			System.out.println();
	    }
	
	}
}

/*
Enter number of rows: 
4
11 
12 13 
13 14 15 
14 15 16 17 

*/