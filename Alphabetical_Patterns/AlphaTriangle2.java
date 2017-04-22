package Alphabetical_Patterns;

import java.util.Scanner;

/*
 * 
dddd
ccc
bb
a
 * 
 */
public class AlphaTriangle2 
{
	public static void main(String[] args)
	{
		int i,j, selection;
		char input, alpha;
		Scanner scanner = new Scanner(System.in);
		
			
		System.out.println("Enter 1 for capital and 2 for small letters: ");
		selection = scanner.nextInt();
		
		if(selection == 1)
		{
			alpha = 'A';
			
			System.out.println("Enter the uppercase character you want to print in last row: ");
			input = scanner.next().charAt(0);
			
			for(i=(input-'A'+1); i>=1; --i)
		    {
		        for(j=1; j<=i; ++j)
		        {
		            System.out.print(input);
		        }
		        input--;
		        System.out.println();
		    }
		}
		else if(selection == 2)
		{
			alpha = 'a';
			
			System.out.println("Enter the lowercase character you want to print in last row: ");
			input = scanner.next().charAt(0);
			
			for(i=(input-'a'+1); i>=1; --i)
		    {
		        for(j=1; j<=i; ++j)
		        {
		            System.out.print(input);
		        }
		        input--;
		        System.out.println();
		    }
		}
		else
		{
			System.out.println("Sorry! Wrong selection");
		}	
	}
}

/*
 * 
 * Enter 1 for capital and 2 for small letters: 
1
Enter the uppercase character you want to print in last row: 
C
CCC
BB
A

 *
 * 
 * 
 * Enter 1 for capital and 2 for small letters: 
2
Enter the lowercase character you want to print in last row: 
d
dddd
ccc
bb
a
 *
 * 
 * 
 * Enter 1 for capital and 2 for small letters: 
5
Sorry! Wrong selection
 * 
 * 
 * 
 * 
 */
