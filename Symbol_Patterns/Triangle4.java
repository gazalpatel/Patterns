/*
 * 
 # # # # # # # 
  # # # # # 
    # # # 
      #
 * 
 */

/*
 * 
# # # # # $ $ $ $ 
  # # # # $ $ $ 
    # # # $ $ 
      # # $ 
        # 
 * 
 */
package Symbol_Patterns;

import java.util.Scanner;

public class Triangle4 
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

		        for(j=i; j <= 2*i-1; ++j)
		        	System.out.print("# ");

		        for(j=0; j < i-1; ++j)
		         	System.out.print("# ");
		       
		        System.out.println();
		    }
	}
}

/*
 * 
 * 
 * Enter number of rows: 
4
# # # # # # # 
  # # # # # 
    # # # 
      # 
 * 
 * 
 * 
 * 
 * (with dollar sign in second for loop to understand better)
 * //System.out.print("$ ");
 * Enter number of rows: 
5
# # # # # $ $ $ $ 
  # # # # $ $ $ 
    # # # $ $ 
      # # $ 
        # 
 * 
 * 
 * 
 * */
