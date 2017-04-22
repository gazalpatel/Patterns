/*
 * 
1 2 3 4 5 6 7 
  1 2 3 4 5 
    1 2 3 
      1 
 * 
 */

package Number_Patterns;

import java.util.Scanner;

public class NumberTriangle4
{
	public static void main(String[] args)
	{
		int i, j, space, rows;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter number of rows: ");
		rows = scanner.nextInt();
		
		 for(i=rows; i>=1; --i)
		    {
		        for(space=0; space < rows-i; ++space)
		        	System.out.print("  ");

		        for(j=1; j <= i-1; ++j)
		         	//System.out.print("# ");
		        	System.out.print(String.valueOf(j)+" ");
		        
		        for(j=i; j <= 2*i-1; ++j)
		        	//System.out.print("# ");
		        	System.out.print(String.valueOf(j)+" ");

		        
		       
		        System.out.println();
		    }
	}
}

/*
 * 
 * 
 * Enter number of rows: 
4
1 2 3 4 5 6 7 
  1 2 3 4 5 
    1 2 3 
      1 

 * 
 */
