/*
 * 
11111
10001
10001
10001
11111

 * 
 */

package Number_Patterns;

import java.util.Scanner;

public class NumberBox10
{
	public static void main(String[] args)
	{
		int i, j, rows;

		System.out.println("Enter number of rows: ");
		rows = new Scanner(System.in).nextInt();
		
		 for(i=1; i<=rows; i++)
		    {
		        for(j=1; j<=rows; j++)
		        {
		            if(i==1 || j==1 || i==rows ||j==rows)
		            	System.out.print(String.valueOf(1));
		            else
		            	System.out.print(String.valueOf(0));
		        }
		        System.out.println();
		    }    
	}
}
/*
 * 
 * 
Enter number of rows: 
10
1111111111
1000000001
1000000001
1000000001
1000000001
1000000001
1000000001
1000000001
1000000001
1111111111

 * 
 * 
 */
