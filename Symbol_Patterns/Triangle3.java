/*
 *
        # 
      # # # 
    # # # # # 
  # # # # # # # 
# # # # # # # # #
 * 
 */
package Symbol_Patterns;

import java.util.Scanner;

public class Triangle3 
{
	public static void main(String[] args)
	{
		int i,space, rows, k=0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter number of rows: ");
		rows = scanner.nextInt();
		
		for(i=1; i<=rows; ++i, k=0)
	    {
	        for(space=1; space<=rows-i; ++space)
	        {
	        	System.out.print("  ");
	        }

	        while(k != 2*i-1)
	        {
	        	System.out.print("# ");
	            ++k;
	        }

	        System.out.println();
	    }
	}
}

/*
 * 
 * 
 * Enter number of rows: 
5
        # 
      # # # 
    # # # # # 
  # # # # # # # 
# # # # # # # # # 
 * 
 * 
 * 
 * */
