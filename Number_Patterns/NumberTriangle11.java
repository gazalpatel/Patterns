/*
 * 
1
21
321
4321
54321
 * 
 */
package Number_Patterns;

import java.util.Scanner;

public class NumberTriangle11 
{
	public static void main(String[] args)
	{
		int i, j, rows;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter number of rows: ");
		rows = scanner.nextInt();
		
		for(i=1;i<=rows;i++)
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
 * Enter number of rows: 
5
1
21
321
4321
54321
 * 
 */