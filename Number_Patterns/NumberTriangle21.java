/*
 * 
1
10
101
1010
10101
101010
1010101
 * 
 */

package Number_Patterns;

import java.util.Scanner;

public class NumberTriangle21
{
	public static void main(String[] args)
	{
		int i, j, rows;
		//Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter number of rows: ");
		rows = new Scanner(System.in).nextInt();
		
		for(i=1;i<=rows;i++)
	    {
	        for(j=1;j<=i;j++)
	        {
	        	System.out.print(String.valueOf(j%2));
	        }
	        System.out.println();
	    }
	}
}


/*
 * 
 Enter number of rows: 
9
1
10
101
1010
10101
101010
1010101
10101010
101010101
 * 
 */
