/*
   1   2   3   4   5   6

  20  21  22  23  24   7

  19  32  33  34  25   8

  18  31  36  35  26   9

  17  30  29  28  27  10

  16  15  14  13  12  11
 * 
 */

package Number_Patterns;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class NumberBox3
{
	public static void main(String[] args)
	{
		int[][] a;
		int i, j, low=0, top, n=1, rows=10;
		
		Integer y;
		Object[] obj; 
		
		System.out.println("Enter number of rows: ");
		rows = new Scanner(System.in).nextInt();
		
		top = rows-1;
		a = new int[rows][rows];
		
		 for(i=0; i<=(rows/2); i++,low++,top--)
		    {
		        for(j=low;j<=top;j++,n++)
		            a[i][j]=n;
		        for(j=low+1;j<=top;j++,n++)
		            a[j][top]=n;
		        for(j=top-1;j>=low;j--,n++)
		            a[top][j]=n;
		        for(j=top-1;j>low;j--,n++)
		            a[j][low]=n;
		    }
		 System.out.println("Perfect Square =>");
		 
		 for(i=0;i<rows;i++)
		    {
			 System.out.println("\n");
		        for(j=0;j<rows;j++)
		        {
		        	y = new Integer(a[i][j]);
					obj = new Integer[1];
					
					obj[0] = y;
					
					System.out.format("%4d" , obj);
		        	
					//for animation effect
					/*
					try {
						TimeUnit.SECONDS.sleep(1);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					*/
		        }
		    }
	}
}

/*
 * 
Enter number of rows: 
10
Perfect Square =>


   1   2   3   4   5   6   7   8   9  10

  36  37  38  39  40  41  42  43  44  11

  35  64  65  66  67  68  69  70  45  12

  34  63  84  85  86  87  88  71  46  13

  33  62  83  96  97  98  89  72  47  14

  32  61  82  95 100  99  90  73  48  15

  31  60  81  94  93  92  91  74  49  16

  30  59  80  79  78  77  76  75  50  17

  29  58  57  56  55  54  53  52  51  18

  28  27  26  25  24  23  22  21  20  19
 * 
 * 
 * (for(i=0; i<(rows/2); i++,low++,top--))
 * Enter number of rows: 
5
Perfect Square =>


   1   2   3   4   5

  16  17  18  19   6

  15  24   0  20   7

  14  23  22  21   8

  13  12  11  10   9
 * 
 * 
 * (for(i=0; i<=(rows/2); i++,low++,top--))
 * 
   1   2   3

   8   9   4

   7   6   5
 */
