/*
 * 
1
121
12321
1234321
123454321
12345654321
 * 
 */

package Number_Patterns;

import java.util.Scanner;

public class NumberTriangle26 
{
	public static void main(String[] args)
	{
		int i, j, rows;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter number of rows: ");
		rows = scanner.nextInt();
		
		for(i=1;i<=rows;i++)
	    {
			for(j=1;j<=i;j++)
				System.out.print(String.valueOf(j));
			
			for(j=i-1;j>=1;j--)
				System.out.print(String.valueOf(j)); 
			
	        System.out.println();
	    }
	}
}

/*
Enter number of rows: 
6
1
121
12321
1234321
123454321
12345654321




*/