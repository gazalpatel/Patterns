/*
 * 
6
65
654
6543
65432
654321
 * 
 */

package Number_Patterns;

import java.util.Scanner;

public class NumberTriangle12 
{
	public static void main(String[] args)
	{
		int i, j, rows;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter number of rows: ");
		rows = scanner.nextInt();
		
		for(i=rows;i>=1;i--)
	    {
	        for(j=rows;j>=i;j--)
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
 Enter number of rows: 
6
6
65
654
6543
65432
654321

 * */
