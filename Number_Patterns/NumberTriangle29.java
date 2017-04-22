/*
1
2*2
2*2
1
 * 
 * 
5
1
2*2
3*3*3
2*2
1
*/

package Number_Patterns;

import java.util.Scanner;

public class NumberTriangle29
{
	public static void main(String[] args)
	{
		int i, j, rows;
				
		System.out.println("Enter number of rows: ");
		rows = new Scanner(System.in).nextInt();
		
		for(i=1; i<=rows; i++)
	    {
			for(j=1; j<=i; j++)
	        {
				if(j<i) 
					System.out.print(String.valueOf(i) + "*");
			    else 
			    	System.out.print(String.valueOf(i));
	        }
			
			System.out.println();
	    }
		
		for(i=rows; i >= 1; i--)
		{
	        for(j=1; j <= i; j++)
	        {
	        	if(j<i) 
	        		System.out.print(String.valueOf(i) + "*");
	            else 
	                System.out.print(String.valueOf(i));
	        }
	        System.out.println();
	    }
	}
}

/*
 * 
 * Enter number of rows: 
5
1
2*2
3*3*3
4*4*4*4
5*5*5*5*5
5*5*5*5*5
4*4*4*4
3*3*3
2*2
1

 * 
 * 
 * Enter number of rows: 
4
1
2*2
3*3*3
4*4*4*4
4*4*4*4
3*3*3
2*2
1

 * 
 */
