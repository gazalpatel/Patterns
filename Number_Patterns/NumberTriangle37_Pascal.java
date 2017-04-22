/*
 * 
1 
1 1 
1 2 1 
1 3 3 1 
1 4 6 4 1 
1 5 10 10 5 1 
 * 
 */
package Number_Patterns;

import java.util.Scanner;

public class NumberTriangle37_Pascal 
{
	public static void main(String[] args)
	{
		int i, j, rows;
		long k;
		
		System.out.println("Enter number of rows: ");
		rows = new Scanner(System.in).nextInt();
		
		for(i=0; i<=rows; i++)
	    {
			for(j=0; j<=i; j++)
	        {
				k = fact(i) / (fact(j)*fact(i-j)) ;
				System.out.print(String.valueOf(k)+ " ");
	        }
			System.out.println();
	    }
	}
	
	public static long fact(int n)
	{
	    int i;
	    long f = 1;
	    for(i=1;i<=n;i++)
	      f = f*i;
	    return f;
	}
}

/*
 * 
 * Enter number of rows: 
5
1 
1 1 
1 2 1 
1 3 3 1 
1 4 6 4 1 
1 5 10 10 5 1 

 * 
 */
