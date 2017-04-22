package Alphabetical_Patterns;

import java.util.Scanner;

/*
 * 
A
BB
CCC
DDDD
 * 
 */
public class AlphabetTriangle1 
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
			
			for(i=1; i<=(input-'A'+1); ++i)
		    {
		        for(j=1; j<=i; ++j)
		        {
		            System.out.print(alpha);
		        }
		        alpha++;
		        System.out.println();
		    }
		}
		else if(selection == 2)
		{
			alpha = 'a';
			
			System.out.println("Enter the lowercase character you want to print in last row: ");
			input = scanner.next().charAt(0);
			
			for(i=1; i<=(input-'a'+1); ++i)
		    {
		        for(j=1; j<=i; ++j)
		        {
		            System.out.print(alpha);
		        }
		        alpha++;
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
 * 
 * 
 * Enter 1 for capital and 2 for small letters: 
1
Enter the uppercase character you want to print in last row: 
D
A
BB
CCC
DDDD
 * 
 * 
 * 
 * 
 * Enter 1 for capital and 2 for small letters: 
2
Enter the lowercase character you want to print in last row: 
e
a
bb
ccc
dddd
eeeee
 * 
 * 
 * 
 * Enter 1 for capital and 2 for small letters: 
4
Sorry! Wrong selection

 * 
 * 
 */
