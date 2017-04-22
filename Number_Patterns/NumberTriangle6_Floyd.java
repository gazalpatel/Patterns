/*
 * 
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 
 * 
 */

package Number_Patterns;

import java.util.Scanner;

public class NumberTriangle6_Floyd 
{
	public static void main(String[] args)
	{
		int i, j , rows, number = 1;
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter number of rows: ");
		rows = scanner.nextInt();
		
		for(i=1; i <= rows; i++)
	    {
	        for(j=1; j <= i; ++j)
	        {
	        	System.out.print(String.valueOf(number) + " ");
	            ++number;
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
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 
 * 
 * 
 */
