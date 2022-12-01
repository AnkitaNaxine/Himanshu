package Find_Factorial_of_int_Number_07;

import java.util.Scanner;

public class Practic05 
{
	public static void main(String[]args) 
	{
		System.out.println(" Enter Number = ");
		Scanner S = new Scanner(System.in);
		int Number = S.nextInt();
		
		int Factorial = 1;
		
		for(int i=Number; i>1; i--) 
		{
			Factorial = Factorial*i;
		}
	System.out.println(Factorial);	
		
	}

}
