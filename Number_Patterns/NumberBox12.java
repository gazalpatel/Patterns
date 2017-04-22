/*
 * 
      1
    2   2
  3       3
4           4
  3       3
    2   2
      1
 * 
 */
package Number_Patterns;

import java.util.Scanner;

public class NumberBox12 
{
	public static void main(String[] args)
	{
		int i, j, k, rows;

		System.out.println("Enter number of rows: ");
		rows = new Scanner(System.in).nextInt();
		
		 for(i=1; i<=rows; i++)
		  {
		    for(j=rows; j>=((i-1)*(rows/2)-1); j--)
		    	System.out.print(" ");
		    
		    System.out.print(String.valueOf(i));
		    
		    for(j=(rows/2); j<=(i-1)*rows; j++)
		    	System.out.print(" ");
		    
		    if(i>1)
		    	System.out.print(String.valueOf(i));
		    
		    System.out.println();
		  }
		  for(i=rows-1; i>=1; i--)
		  {
		    for(j=rows; j>=((i-1)*(rows/2)-1); j--)
		    	System.out.print(" ");
		    
		    System.out.print(String.valueOf(i));
		    
		    for(j=(rows/2); j<=(i-1)*rows; j++)
		    	System.out.print(" ");
		    
		    if(i>1)
		    	System.out.print(String.valueOf(i));
		    
		    System.out.println();
		  }
	}
}

/*
 * 
Enter number of rows: 
4
      1
    2   2
  3       3
4           4
  3       3
    2   2
      1
 * 
 */
