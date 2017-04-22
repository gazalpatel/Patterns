/*
 * 
54321
4321
321
21
1
 * 
 */

package Number_Patterns;

import java.util.Scanner;

public class NumberTriangle8
{
	public static void main(String[] args)
	{
		int i, j, rows;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter number of rows: ");
		rows = scanner.nextInt();
		
		for(i=rows;i>=1;i--)
	    {
	        for(j=i;j>=1;j--)
	        {
	        	System.out.print(String.valueOf(j));
	        }
	        System.out.println();
	    }
	}
}

/*
 * 
 * 
 * Enter number of rows: 
6
654321
54321
4321
321
21
1
 * 
 */
