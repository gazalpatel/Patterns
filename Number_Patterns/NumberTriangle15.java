/*
 * 
11111
2222
333
44
5

 * 
 */
package Number_Patterns;

import java.util.Scanner;

public class NumberTriangle15 
{
	public static void main(String[] args)
	{
		int i, j, rows;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter number of rows: ");
		rows = scanner.nextInt();
		
		for(i=1;i<=rows;i++)
	    {
	        for(j=rows;j>=i;j--)
	        {
	        	System.out.print(String.valueOf(i));
	        }
	        System.out.println();
	    }
	}
}

/*
 * 
 * 
 * Enter number of rows: 
5
11111
2222
333
44
5

 * 
 *
 */
