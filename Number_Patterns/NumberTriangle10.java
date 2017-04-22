/*
 * 
7
67
567
4567
34567
234567
1234567
 * 
 */

package Number_Patterns;

import java.util.Scanner;

public class NumberTriangle10
{
	public static void main(String[] args)
	{
		int i, j, rows;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter number of rows: ");
		rows = scanner.nextInt();
		
		for(i=rows;i>=1;i--)
	    {
	        for(j=i;j<=rows;j++)
	        {
	        	System.out.print(String.valueOf(j));
	        }
	        System.out.println();
	    }
	}

}

/*
 * 
 Enter number of rows: 
7
7
67
567
4567
34567
234567
1234567
 * 
 */
