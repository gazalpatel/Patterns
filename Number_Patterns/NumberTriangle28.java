/*
 * 
1 
2 3 2 
4 5 6 5 4 
7 8 9 10 9 8 7 
11 12 13 14 15 14 13 12 11 
 * 
 */
package Number_Patterns;

import java.util.Scanner;

public class NumberTriangle28
{
	public static void main(String[] args)
	{
		int i, j, k=1, l=1, rows;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter number of rows: ");
		rows = scanner.nextInt();
		
		for(i=1; i<=rows; i++)
	    {
			l=k;
			
	        for(j=1; j<=i; j++)
	        {
	        	System.out.print(String.valueOf(l++)+" ");
	        	//l = l+1;
	        }
	        
	        k = l--;
	        
	        for(j=1;j<i;j++)
	        {
	        	//l = l-1;
	        	System.out.print(String.valueOf(--l)+" ");
	        }
	        System.out.println();
	    }
	}
}

/*
5

Enter number of rows: 
1 
2 3 2 
4 5 6 5 4 
7 8 9 10 9 8 7 
11 12 13 14 15 14 13 12 11 


*/