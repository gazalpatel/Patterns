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

public class NumberTriangle27
{
	public static void main(String[] args)
	{
		int i, j, rows;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter number of rows: ");
		rows = scanner.nextInt();
		
		for(i=1;i<=rows;i++)
	    {
	        for(j=rows;j>=1;j--)
	        {
	        	if(j<=i)
	        		System.out.print(String.valueOf(j));
	            else
	               System.out.print(" ");
	        }
	        System.out.println();
	    }
	}
}

/*
 * 
 * Enter number of rows: 
7
      1
     21
    321
   4321
  54321
 654321
7654321
 * 
 * 
 */
