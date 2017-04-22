/*
 * 
11111
1   1
1   1
1   1
11111
 * 
 */

package Number_Patterns;

import java.util.Scanner;

public class NumberBox6
{
	public static void main(String[] args)
	{
		int i, j, rows;

		System.out.println("Enter number of rows: ");
		rows = new Scanner(System.in).nextInt();
		
		for(i=1; i<=rows; i++)
	    {
	        for(j=1; j<=rows; ++j)
	        {
	        	if(i==1 || j==1 || i==rows || j==rows)
	            {
	        		System.out.print(String.valueOf(1));
	            }
	            else
	            {
	            	System.out.print(" ");
	            }
	        }
	        System.out.println();
	    }
	}
}


/*
Enter number of rows: 
5
11111
1   1
1   1
1   1
11111


*/