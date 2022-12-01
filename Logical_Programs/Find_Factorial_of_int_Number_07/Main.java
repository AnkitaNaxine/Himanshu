package Find_Factorial_of_int_Number_07;

import java.util.Scanner;

public class Main 
{
	public static void main(String[]args) 
	{
		System.out.println(" Enter NUM : ");
		Scanner S = new Scanner(System.in);
		int num = S.nextInt();
		
		int fact = 1;
		
		for(int i=num; i>1; i--) 
		{
			fact = fact*i;
		}
		
		System.out.println(fact);
		
		
	}

}
