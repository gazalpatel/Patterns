/*
 * 
1 
1 2 
3 5 8 
13 21 34 55 
89 144 233 377 610 
 * 
 */

package Number_Patterns;

import java.util.Scanner;

public class NumberTriangle39 
{
	public static void main(String[] args)
	{
		int i, j, k=1, rows;
				
		System.out.println("Enter number of rows: ");
		rows = new Scanner(System.in).nextInt();
		
		for(i=1; i<=rows; i++)
	    {
			for(j=1; j<=i; j++)
	        {
				System.out.print(String.valueOf(fibonacci(k++))+ " ");
	        }
			System.out.println();
	    }
	}
	
	public static int fibonacci(int n)
	{
	  if(n<=1)
	    return n;
	  
	  return(fibonacci(n-1) + fibonacci(n-2));
	}
}

/*
 * 
 Enter number of rows: 
7
1 
1 2 
3 5 8 
13 21 34 55 
89 144 233 377 610 
987 1597 2584 4181 6765 10946 
17711 28657 46368 75025 121393 196418 317811 

 * 
 */
