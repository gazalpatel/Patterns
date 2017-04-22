package Number_Patterns;

import java.util.Scanner;

/*
 * 
1
12
123
1234
 * 
 */
public class NumberTriangle1
{
	public static void main(String[] args)
	{
		int i,j, rows;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter number of rows: ");
		rows = scanner.nextInt();
		
		for(i=1; i<=rows; ++i)
	    {
	        for(j=1; j<=i; ++j)
	        {
	            System.out.print(String.valueOf(j));
	        }
	        System.out.println();
	    }
	}
}


/*
 * 
 * Enter number of rows: 
4
1
12
123
1234
 * 
 * 
 * 
 */




