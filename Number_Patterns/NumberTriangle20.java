/*
 * 
13579
3579
579
79
9
 * 
 */

package Number_Patterns;

import java.util.Scanner;

public class NumberTriangle20
{
	public static void main(String[] args)
	{
		int i, j, rows;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter number of rows: ");
		rows = scanner.nextInt();
		
		for(i=1;i<=rows;i+=2)
	    {
	        for(j=i;j<=rows;j+=2)
	        {
	        	System.out.print(String.valueOf(j));
	        }
	        System.out.println();
	    }
	}
}


/*
Enter number of rows: 
9
13579
3579
579
79
9



Enter number of rows: 
8
1357
357
57
7

*/