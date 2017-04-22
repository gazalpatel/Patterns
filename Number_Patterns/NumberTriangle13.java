/*
 * 
1
24
135
2468
13579
 * 
 */

package Number_Patterns;

import java.util.Scanner;

public class NumberTriangle13
{
	public static void main(String[] args)
	{
		int i, j, k, rows;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter number of rows: ");
		rows = scanner.nextInt();
		
		 for(i=1;i<=rows;i++)
		  {
		    if(i%2==0) 
		    {
		      k=2; 
		    }
		    else 
		    {
		      k=1;
		    }
		    for(j=1;j<=i;j++,k+=2)
		    {
		    	System.out.print(String.valueOf(k));
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
24
135
2468
13579

 * 
 * */
