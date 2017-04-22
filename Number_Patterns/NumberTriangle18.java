/*
 * 
123456789
1234567
12345
123
1
 * 
 */

package Number_Patterns;

import java.util.Scanner;

public class NumberTriangle18 
{
	public static void main(String[] args)
	{
		int i, j, rows;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter number of rows: ");
		rows = scanner.nextInt();
		
		for(i=rows;i>=1;i-=2)
	    {
	        for(j=1;j<=i;j++)
	        {
	        	System.out.print(String.valueOf(j));
	        }
	        System.out.println();
	    }
	}
}

/*

Enter number of rows: 
5
12345
123
1



Enter number of rows: 
6
123456
1234
12

*/