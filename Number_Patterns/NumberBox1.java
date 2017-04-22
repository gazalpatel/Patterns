/*
 * 
7777777
6777777
5677777
4567777
3456777
2345677
1234567
 * 
 */

package Number_Patterns;

import java.util.Scanner;

public class NumberBox1 
{
	public static void main(String[] args)
	{
		int i, j, k, rows;

		System.out.println("Enter number of rows: ");
		rows = new Scanner(System.in).nextInt();
		
		for(i=rows; i>=1; i--)
	    {
			k=i;
	        for(j=1; j<=rows; ++j)
	        {
	        	if(k <= rows)
	            {
	        		System.out.print(String.valueOf(k));
	            }
	            else
	            {
	            	System.out.print(String.valueOf(rows));
	            }
	            k++;
	        }
	        System.out.println();
	    }
	}
}

/*

Enter number of rows: 
7
7777777
6777777
5677777
4567777
3456777
2345677
1234567


*/