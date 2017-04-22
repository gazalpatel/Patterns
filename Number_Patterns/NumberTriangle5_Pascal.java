package Number_Patterns;

/*
 * 
           1
         1   1
       1   2   1
     1   3   3   1
   1   4   6   4   1
 * 
 */
import java.util.Scanner;

public class NumberTriangle5_Pascal 
{
	public static void main(String[] args)
	{
		int i, j , rows, space, coef = 1;
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter number of rows: ");
		rows = scanner.nextInt();
		
		for(i=0; i<rows; i++)
	    {
	        for(space=1; space < rows-i; space++)
	        	System.out.print("  ");

	        for(j=0; j <= i; j++)
	        {
	            if (j==0 || i==0)
	                coef = 1;
	            else
	                coef = coef*(i-j+1)/j;

	            System.out.print("   "+String.valueOf(coef));
	            //System.out.print(String.valueOf(coef));
	        }
	        System.out.print("\n");
	    }

	}
}


/*
 * 
 * Enter number of rows: 
5
           1
         1   1
       1   2   1
     1   3   3   1
   1   4   6   4   1
 * 
 * 
 * 
 * 
 * 
 * Enter number of rows: 
8
                 1
               1   1
             1   2   1
           1   3   3   1
         1   4   6   4   1
       1   5   10   10   5   1
     1   6   15   20   15   6   1
   1   7   21   35   35   21   7   1
 * 
 * 
 * 
 * */
 