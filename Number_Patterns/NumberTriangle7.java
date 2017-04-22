/*
 * 
12345
2345
345
45
5 
 * 
 */
package Number_Patterns;

import java.util.Scanner;

public class NumberTriangle7
{
	public static void main(String[] args)
	{
		int i, j, rows;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter number of rows: ");
		rows = scanner.nextInt();
		
		for(i=1;i<=rows;i++)
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
5
12345
2345
345
45
5 
 * 
*/



