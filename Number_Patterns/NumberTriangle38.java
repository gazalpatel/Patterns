/*
 * 
   1
   2   4
   3   6   9
   4   8  12  16
   5  10  15  20  25
 * 
 */

package Number_Patterns;

import java.util.Scanner;

public class NumberTriangle38 
{
	public static void main(String[] args)
	{
		int i, j, rows;
				
		System.out.println("Enter number of rows: ");
		rows = new Scanner(System.in).nextInt();
		
		for(i=1; i<=rows; i++)
	    {
			for(j=1; j<=i; j++)
	        {
				Integer y = new Integer(i*j);
				Object[] obj = new Integer[1];
				
				obj[0] = y;
				
				System.out.format("%4d" , obj);
				//System.out.print(String.valueOf(i*j)+ " ");
	        }
			System.out.println();
	    }
	}
}

/*

Enter number of rows: 
10
   1
   2   4
   3   6   9
   4   8  12  16
   5  10  15  20  25
   6  12  18  24  30  36
   7  14  21  28  35  42  49
   8  16  24  32  40  48  56  64
   9  18  27  36  45  54  63  72  81
  10  20  30  40  50  60  70  80  90 100

*/