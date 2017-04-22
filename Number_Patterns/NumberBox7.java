/*
 * 
  1  2  3  4  5  6  7
  8                 9
 10                11
 12                13
 14                15
 16                17
 18 19 20 21 22 23 24
 * 
 */

package Number_Patterns;

import java.util.Scanner;

public class NumberBox7
{
	public static void main(String[] args)
	{
		int i, j, rows, count=1;

		Integer y;
		Object[] obj; 
		
		System.out.println("Enter number of rows: ");
		rows = new Scanner(System.in).nextInt();
		
		for(i=1; i<=rows; i++)
	    {
	        for(j=1; j<=rows; ++j)
	        {
	        	if(i==1 || j==1 || i==rows || j==rows)
	            {
	        		y = new Integer(count++);
					obj = new Integer[1];
					
					obj[0] = y;
					
					System.out.format("%3d" , obj);
	            }
	            else
	            {
	            	System.out.print("   ");
	            }
	        }
	        System.out.println();
	    }
	}
}
/*
 * 
 * Enter number of rows: 
7
  1  2  3  4  5  6  7
  8                 9
 10                11
 12                13
 14                15
 16                17
 18 19 20 21 22 23 24

 * 
 */
