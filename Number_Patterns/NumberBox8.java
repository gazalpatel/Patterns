/*
 * 
1001001
0101010
0011100
 * 
 * 
10010001
01010010
00110100
 * 
 */

package Number_Patterns;

import java.util.Scanner;

public class NumberBox8 
{
	public static void main(String[] args)
	{
		int i, j, k, rows;

		System.out.println("Enter number of rows: ");
		rows = new Scanner(System.in).nextInt();
		
		for(i=1; i<=(rows/2)-1; i++)
	    {
	        for(j=1; j<rows; ++j)
	        {
	        	if(j==i || j==(rows/2) || (rows-j) ==i)
	            {
	        		System.out.print(String.valueOf(1));
	            }
	            else
	            {
	            	System.out.print(String.valueOf(0));
	            }
	        }
	        System.out.println();
	    }
	}
}
/*
 * (enter even raw)
Enter number of rows: 
8
1001001
0101010
0011100
 * 
 * 
 * (enter odd raw)
10010001
01010010
00110100

 */
