/*
 * 
11111
2222
333
22
1
 *  
 * 
111111
22222
3333
333
22
1
 * 
 */

package Number_Patterns;

import java.util.Scanner;

public class NumberTriangle25 
{
	public static void main(String[] args)
	{
		int i, j, rows;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter number of rows: ");
		rows = scanner.nextInt();
		
		for(i=1;i<=rows;i++)
	    {
	        for(j=rows;j>=i;j--)
	        {
	        	if(i<=3)
	        		System.out.print(String.valueOf(i));
	            else
	            	System.out.print(String.valueOf(rows-i+1));
	        	
	        }
	        System.out.println();
	    }
	}
}

/*
 * 
 * Enter number of rows: 
6
111111
22222
3333
333
22
1

 * 
 * 
 * Enter number of rows: 
5
11111
2222
333
22
1

 * 
 * 
 */
