/*
 * 
  1  2  3  4  5
  6  7  8  9
 10 11 12
 13 14
 15
 * 
 */
package Number_Patterns;

import java.util.Scanner;

public class NumberTriangle34_Floyd
{
	public static void main(String[] args)
	{
		int i, j, k=1 , rows;
				
		System.out.println("Enter number of rows: ");
		rows = new Scanner(System.in).nextInt();
		
		for(i=1; i<=rows; i++)
	    {
			for(j=rows; j>=i; j--)
	        {
				Integer y = new Integer(k++);
				Object[] obj = new Integer[1];
				
				obj[0] = y;
				
				System.out.format("%3d" , obj);
			}
			System.out.println();
	    }
	}
}

/*
 * 
 * Enter number of rows: 
5
  1  2  3  4  5
  6  7  8  9
 10 11 12
 13 14
 15
 * 
 */
