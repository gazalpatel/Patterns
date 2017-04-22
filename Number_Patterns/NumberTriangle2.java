package Number_Patterns;

/*
 * 
12345
1234
123
12
1
 * 
 */
import java.util.Scanner;

public class NumberTriangle2
{
	public static void main(String[] args)
	{
		int i,j, rows;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter number of rows: ");
		rows = scanner.nextInt();
		
		for(i=rows; i>=1; --i)
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
5
12345
1234
123
12
1
 * 
 * 
 * */
