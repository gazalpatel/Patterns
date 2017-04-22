/*
 * 
1 1 1 1 1 
0 0 0 0 
1 1 1 
0 0 
1 
 * 
 */
package Number_Patterns;

import java.util.Scanner;

public class NumberTriangle35
{
	public static void main(String[] args)
	{
		int i, j, rows;
				
		System.out.println("Enter number of rows: ");
		rows = new Scanner(System.in).nextInt();
		
		for(i=rows; i>=1; i--)
	    {
			for(j=1; j<=i; j++)
	        {
				System.out.print(String.valueOf(i%2)+ " ");
	        }
			System.out.println();
	    }
	}
}
/*
Enter number of rows: 
5
1 1 1 1 1 
0 0 0 0 
1 1 1 
0 0 
1 


*/