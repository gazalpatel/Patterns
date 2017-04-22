/*
 * 
                       1
                   4   9  16
              25  36  49  64  81
         100 121 144 169 196 225 256
     289 324 361 400 441 484 529 576 625
 * 
 */

package Number_Patterns;

import java.util.Scanner;

public class NumberTriangle36 
{
	public static void main(String[] args)
	{
		int i, j, k=1, rows;
				
		System.out.println("Enter number of rows: ");
		rows = new Scanner(System.in).nextInt();
		
		for(i=1; i<=rows; i++)
	    {
			for(j=i; j<=rows; j++)
	        {
				System.out.print("    ");
				//System.out.print(String.valueOf(i%2)+ " ");
	        }
			for(j=1; j<(i*2); j++)
	        {
				Integer y = new Integer(k*k);
				Object[] obj = new Integer[1];
				
				obj[0] = y;
				
				System.out.format("%4d" , obj);
				
				k++;
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
                   4   9  16
              25  36  49  64  81
         100 121 144 169 196 225 256
     289 324 361 400 441 484 529 576 625
 * 
 */
