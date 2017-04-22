/*
 * 
55555
4444
333
22
1
 * 
 */
package Number_Patterns;

import java.util.Scanner;

public class NumberTriangle14
{
	public static void main(String[] args)
	{
		int i, j, rows;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter number of rows: ");
		rows = scanner.nextInt();
		
		for(i=rows;i>=1;i--)
	    {
	        for(j=1;j<=i;j++)
	        {
	        	System.out.print(String.valueOf(i));
	        }
	        System.out.println();
	    }
	}
}

/*
 * 
 Enter number of rows: 
5
55555
4444
333
22
1
 * 
 * */
