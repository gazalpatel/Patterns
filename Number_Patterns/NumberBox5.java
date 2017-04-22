/*
 * 
1234432112344321
123  321123  321
12    2112    21
1      11      1
1      11      1
12    2112    21
123  321123  321
1234432112344321 
 * 
 */

package Number_Patterns;

import java.util.Scanner;

public class NumberBox5 
{
	public static void main(String[] args) 
	{
		int i, j, rows, k;

		System.out.println("Enter number of rows: ");
		rows = new Scanner(System.in).nextInt();

		for (i = rows; i >= 1; i--) 
		{
			for (k = 1; k <= rows/2; k++) 
			{
				for (j = 1; j <= rows; ++j) 
				{
					if (j <= i)
						System.out.print(String.valueOf(j));
					else
						System.out.print(" ");
				}
				for (j = rows; j >= 1; --j)
				{
					if (j <= i)
						System.out.print(String.valueOf(j));
					else
						System.out.print(" ");
				}
			}
			System.out.println();
		}
		for (i = 1; i <= rows; i++) 
		{
			for (k = 1; k <= rows/2; k++) 
			{
				for (j = 1; j <= rows; j++) 
				{
					if (j <= i)
						System.out.print(String.valueOf(j));
					else
						System.out.print(" ");
				}
				for (j = rows; j >= 1; j--) 
				{
					if (j <= i)
						System.out.print(String.valueOf(j));
					else
						System.out.print(" ");
				}
			}

			System.out.println();
		}
	}
}

/*
 * 
 * Enter number of rows: 
6
123456654321123456654321123456654321
12345  5432112345  5432112345  54321
1234    43211234    43211234    4321
123      321123      321123      321
12        2112        2112        21
1          11          11          1
1          11          11          1
12        2112        2112        21
123      321123      321123      321
1234    43211234    43211234    4321
12345  5432112345  5432112345  54321
123456654321123456654321123456654321

 * 
 * 
 * 
 * Enter number of rows: 
5
12345543211234554321
1234  43211234  4321
123    321123    321
12      2112      21
1        11        1
1        11        1
12      2112      21
123    321123    321
1234  43211234  4321
12345543211234554321

 * 
 */
