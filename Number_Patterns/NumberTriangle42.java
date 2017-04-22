/*
 * 
51437
1437
437
37
7
 * 
 */
package Number_Patterns;

import java.util.Scanner;

public class NumberTriangle42
{
	public static void main(String[] args)
	{
		long num, i=1;
		int j, k, rows;
				
		System.out.println("Enter number: ");
		num = new Scanner(System.in).nextInt();
		
		for(i=10; i<=num; i*=10);
			
		for(i=i/10; num>0; i/=10)
	    {
			System.out.println(String.valueOf(num));
			num %= i;
	    }
	}
}
/*
 * 
 * 
Enter number: 
51437
51437
1437
437
37
7
 * 
 */
