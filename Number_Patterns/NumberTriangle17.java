/*
 * 
123456
54321
1234
321
12
1
 * 
 */
package Number_Patterns;

import java.util.Scanner;

public class NumberTriangle17 
{
	public static void main(String[] args)
	{
		int i, j, k, rows;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter number of rows: ");
		rows = scanner.nextInt();
		
		for(i=rows; i>=1; i--)
	    {
			 if(i%2==1)
				k=i;
		     else
		       	k=1;
			 
	         for(j=1; j<=i; j++)
	         {
	        	System.out.print(String.valueOf(k));
	        	
	        	if(i%2==1)
	        		k--;
	            else
	            	k++;
	         }
	        System.out.println();
	    }
	}
}

/*
 * 
 * 
 Enter number of rows: 
6
123456
54321
1234
321
12
1
 * 
 */ 
