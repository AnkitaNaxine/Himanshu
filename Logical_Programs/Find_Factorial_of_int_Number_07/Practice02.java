package Find_Factorial_of_int_Number_07;

import java.util.Scanner;

public class Practice02 
{
	public static void main(String[]args) 
	{
		System.out.println(" Enter Number : ");
		Scanner S = new Scanner(System.in);
		int NUMBER = S.nextInt();
		
		int FACTORIAL = 1;
		
		for(int i=NUMBER; i>1; i--) 
		{
			FACTORIAL = FACTORIAL*i;
		}
		
		System.out.println(FACTORIAL);
	}

}
