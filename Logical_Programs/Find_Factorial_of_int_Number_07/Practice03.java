package Find_Factorial_of_int_Number_07;

import java.util.Scanner;

public class Practice03 
{
	public static void main(String[]args) 
	{
		System.out.println(" Enter Number : ");
		Scanner S = new Scanner(System.in);
		int NUM = S.nextInt();
		
		int FACT = 1;
		
		for(int i=NUM; i>1; i--) 
		{
			FACT = FACT*i;
		}
		
		System.out.println(FACT);
		
	}

}
