/*
 * 
1 
3 2 
4 5 6 
10 9 8 7 
11 12 13 14 15
 * 
 */
package Number_Patterns;

import java.util.Scanner;

public class NumberTriangle40_Floyd 
{
	public static void main(String[] args)
	{
		int i, j, k=1 , l, rows;
				
		System.out.println("Enter number of rows: ");
		rows = new Scanner(System.in).nextInt();
		
		for(i=1; i<=rows; i++)
	    {
			l = k+i-1;
			
			for(j=1; j<=i; j++)
	        {
				 if(i%2 == 1)
					 System.out.print(String.valueOf(k)+ " ");
				 else
					 System.out.print(String.valueOf(l)+ " ");
				      
				 k++;
				 l--;
				
	        }
			System.out.println();
	    }
	}
}

/*
 * 
Enter number of rows: 
5
1 
3 2 
4 5 6 
10 9 8 7 
11 12 13 14 15 

 * 
 */
