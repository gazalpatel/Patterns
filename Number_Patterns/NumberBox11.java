/*
 * 
12345
21234
32123
43212
54321
 * 
 */
package Number_Patterns;

import java.util.Scanner;

public class NumberBox11
{
	public static void main(String[] args)
	{
		int i, j, k, rows;

		System.out.println("Enter number of rows: ");
		rows = new Scanner(System.in).nextInt();
		
		 for(i=1; i<=rows; i++)
		    {
		        for(j=i; j>1; j--)
		            System.out.print(String.valueOf(j));
		        for(k=1; k<= rows-i+1 ; k++)
		        	System.out.print(String.valueOf(k));
		        
		        System.out.println();
		    }    
	}
}
/*
Enter number of rows: 
5
12345
21234
32123
43212
54321

*/