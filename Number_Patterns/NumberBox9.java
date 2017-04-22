/*
 * 
555555555
544444445
543333345
543222345
543212345
543222345
543333345
544444445
555555555
 * 
 */
package Number_Patterns;

import java.util.Scanner;

public class NumberBox9 
{
	public static void main(String[] args)
	{
		int i, j, k, rows;

		System.out.println("Enter number of rows: ");
		rows = new Scanner(System.in).nextInt();
		
		 for(i=rows; i>1; i--)
		    {
		        for(j=rows; j>=1; j--)
		        {
		            if(j>i) System.out.print(String.valueOf(j));
		            else System.out.print(String.valueOf(i));
		        }
		        for(j=2; j<=rows; j++)
		        {
		            if(j>i) System.out.print(String.valueOf(j));
		            else System.out.print(String.valueOf(i));
		        }
		        System.out.println();
		    }    
		 for(i=1; i<=rows; i++)
		    {
		        for(j=rows; j>=1; j--)
		        {
		            if(j>i) System.out.print(String.valueOf(j));
		            else System.out.print(String.valueOf(i));
		        }
		        for(j=2; j<=rows; j++)
		        {
		            if(j>i) System.out.print(String.valueOf(j));
		            else System.out.print(String.valueOf(i));
		        }
		        System.out.println();
		    }
	}
}

/*
 * 
Enter number of rows: 
5
555555555
544444445
543333345
543222345
543212345
543222345
543333345
544444445
555555555

 * 
 */
