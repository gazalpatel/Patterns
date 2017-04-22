/*
 * 
1 
2 6 
3 7 10 
4 8 11 13 
5 9 12 14 15 
 * 
 */
package Number_Patterns;

import java.util.Scanner;

public class NumberTriangle22
{
	public static void main(String[] args)
	{
		int i, j, k, rows;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter number of rows: ");
		rows = scanner.nextInt();
		
		for(i=1;i<=rows;i++)
	    {
			k = i;
	        for(j=1;j<=i;j++)
	        {
	        	System.out.print(String.valueOf(k)+" ");
	        	k += rows-j;
	        }
	        System.out.println();
	    }
	}
}

/*
 * 
 * 
 * 
Enter number of rows: 
5
1 
2 6 
3 7 10 
4 8 11 13 
5 9 12 14 15  

 *
 *
 */
