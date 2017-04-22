/*
 * 
1 
2 1 2 
3 2 1 2 3 
4 3 2 1 2 3 4 
5 4 3 2 1 2 3 4 5
 * 
 */

package Number_Patterns;

import java.util.Scanner;

public class NumberTriangle32
{
	public static void main(String[] args)
	{
		int i, j, rows;
				
		System.out.println("Enter number of rows: ");
		rows = new Scanner(System.in).nextInt();
		
		for(i=1; i<=rows; i++)
	    {
			for(j=i; j>1; j--)
	        {
				System.out.print(String.valueOf(j)+ " ");
	        }
			for(j=1; j<=i; j++)
	        {
				System.out.print(String.valueOf(j)+ " ");
	        }
			System.out.println();
	    }
	
	}
}

/*
Enter number of rows: 
5
1 
2 1 2 
3 2 1 2 3 
4 3 2 1 2 3 4 
5 4 3 2 1 2 3 4 5 


*/