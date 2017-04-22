/*
 * Floyd (2)
      1 
    2 3 4 
  5 6 7 8 9 
10 11 12 13 14 15 16 
 * 
 */

package Number_Patterns;

import java.util.Scanner;

public class NumberTriangle24_Floyd
{
	public static void main(String[] args)
	{
		int i, j, rows, k = 1 ;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter number required in last  row (even input will get rounded to lower odd) : ");
		rows = scanner.nextInt();
		
		for(i=1;i<=rows;i+=2)
	    {
	        for(j=rows;j>=1;j--)
	        {
	        	 if(j>i)
	        		 System.out.print(" ");
	        	 else
	        	 	 System.out.print(String.valueOf(k++) + " ");
	        }
	        System.out.println();
	    }
	}
}

/*
Enter number required in last  row (even input will get rounded to lower odd) : 
7
      1 
    2 3 4 
  5 6 7 8 9 
10 11 12 13 14 15 16 



Enter number required in last  row (even input will get rounded to lower odd) : 
8
       1 
     2 3 4 
   5 6 7 8 9 
 10 11 12 13 14 15 16 

*/