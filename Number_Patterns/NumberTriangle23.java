/*
 * 
1
123
12345
1234567
 * 
 */
package Number_Patterns;

import java.util.Scanner;

public class NumberTriangle23 
{
	public static void main(String[] args)
	{
		int i, j, rows;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter number of rows: ");
		rows = scanner.nextInt();
		
		for(i=1;i<=rows;i+=2)
	    {
	        for(j=1;j<=i;j++)
	        {
	        	System.out.print(String.valueOf(j));
	        }
	        System.out.println();
	    }
	}
}

/*
 * 
 * Enter number of rows: 
6
1
123
12345

 *
 * Enter number of rows: 
7
1
123
12345
1234567
 * 
 */ 
