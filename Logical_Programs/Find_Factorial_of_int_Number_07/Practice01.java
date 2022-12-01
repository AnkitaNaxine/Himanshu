package Find_Factorial_of_int_Number_07;

import java.util.Scanner;

public class Practice01 
{
	public static void main(String[]args) 
	{
		System.out.println(" Enter NUM : ");
		Scanner S = new Scanner(System.in);
		int NUM = S.nextInt();
		
		int FACTORIAL = 1;
		
		for(int i=NUM; i>1; i--) 
		{
			FACTORIAL = FACTORIAL*i;
		}
		
		System.out.println(FACTORIAL);
		
	}

}
