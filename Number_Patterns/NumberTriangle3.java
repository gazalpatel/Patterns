/*
 * 
        1 
      2 3 2 
    3 4 5 4 3 
  4 5 6 7 6 5 4 
5 6 7 8 9 8 7 6 5  
 * 
 */

/*
 * 
      1
    232
  34543
4567654
 * 
 */
package Number_Patterns;

import java.util.Scanner;

public class NumberTriangle3 
{
	public static void main(String[] args)
	{
		int i,space, rows, k=0;
		int count = 0, count1 = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter number of rows: ");
		rows = scanner.nextInt();
		
		for(i=1; i<=rows; ++i, k=0)
	    {
	        for(space=1; space<=rows-i; ++space)
	        {
	        	System.out.print("  ");
	        	++count;
	        }

	        while(k != 2*i-1)
	        {
	        	if (count <= rows-1)
	            {
	        		//System.out.print(String.valueOf(i+k));
	        		System.out.print(String.valueOf(i+k)+" ");
	                ++count;
	            }
	            else
	            {
	                ++count1;
	                //System.out.print(String.valueOf(i+k-2*count1));
	                System.out.print(String.valueOf(i+k-2*count1)+" ");
	            }
	            ++k;
	        }
	        
	        count1 = count = k = 0;
	        System.out.println();
	    }
	}
}

/*
 * 
 * 
 * (without space after number in while loop)
 * Enter number of rows: 
4
      1
    232
  34543
4567654
 * 
 * 
 * (with space after number in while loop)
 * Enter number of rows: 
5
        1 
      2 3 2 
    3 4 5 4 3 
  4 5 6 7 6 5 4 
5 6 7 8 9 8 7 6 5 
 * 
 */