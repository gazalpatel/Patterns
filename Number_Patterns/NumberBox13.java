/*
 * 
1  2  3  4  5  
16          6  
15          7  
14          8  
13 12 11 10 9 
 * 
 */
package Number_Patterns;

import java.util.Scanner;

public class NumberBox13 
{

	public static void main(String[] args)
	{
		int i, j, k, rows;

		int l, m;
		Integer y;
		Object[] obj; 
		
		System.out.println("Enter number of rows: ");
		rows = new Scanner(System.in).nextInt();
		
		k=rows;
		
		//l = rows + 2*(rows-1);
		l = (3*rows) - 2;
		
		//m = (2*rows) + 2*(rows-2);
		m  = (4*rows) - 4;
				
		for(i=1; i<=rows; i++)
		  {
		    for(j=1; j<=rows; j++)
		    {
		      if(i==1)
		      {
		    	  y = new Integer(j);
				  obj = new Integer[1];
				  obj[0] = y;
				  System.out.format("%-3d" , obj);
		      }
		      else if(j==rows)
		      {
		    	  y = new Integer(++k);
				  obj = new Integer[1];
				  obj[0] = y;
				  System.out.format("%-3d" , obj);
		      }
		      else if(i==rows)
		      {
		    	  y = new Integer(l--);
				  obj = new Integer[1];
				  obj[0] = y;
				  System.out.format("%-3d" , obj);
		      }
		      else if(j==1)
		      {
		    	  y = new Integer(m--);
				  obj = new Integer[1];
				  obj[0] = y;
				  System.out.format("%-3d" , obj);
		      }
		      else
		    	  System.out.print("   ");
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
1  2  3  4  5  
16          6  
15          7  
14          8  
13 12 11 10 9  

 * 
 */
