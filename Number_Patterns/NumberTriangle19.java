/*
 * 
1
01
101
0101
10101
 * 
 */
package Number_Patterns;

import java.util.Scanner;

public class NumberTriangle19
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
	        	System.out.print(String.valueOf(j%2));
	        }
	        System.out.println();
	    }
	}
}

/*
 * 
 * 
Enter number of rows: 
5
1
01
101
0101
10101
 * 
 */
