/*
 * 
123454321
1234#4321
123##&321
12###&&21
1####&&&1
 * 
 */

package Number_Patterns;

import java.util.Scanner;

public class NumberBox2 
{
	public static void main(String[] args)
	{
		int i, j, rows;

		System.out.println("Enter number of rows: ");
		rows = new Scanner(System.in).nextInt();
		
		for(i=rows; i>=1; i--)
	    {
	        for(j=1; j<=rows; ++j)
	        {
	        	if(j <= i)
             		System.out.print(String.valueOf(j));
	        	else
	        		System.out.print("#");
	        	
	        }
	        for(j=4; j>=1; --j)
	        {
	        	if(j <= i)
             		System.out.print(String.valueOf(j));
	        	else
	        		System.out.print("&");
	        	
	        }
	        System.out.println();
	    }
	}
}
/*

Enter number of rows: 
5
123454321
1234#4321
123##&321
12###&&21
1####&&&1


*/