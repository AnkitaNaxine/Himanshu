package All_Logical_Programs;

import java.util.Scanner;

public class How_to_Accept_Input_from_the_User_01
{
	public static void main(String[]args)
	{
//		System.out.println(" Enter Number : ");
		Scanner S = new Scanner(System.in);
//		int NUM = S.nextInt();
//		System.out.println(NUM*NUM);
		
		System.out.println(" Enter Name : ");
		String NAME = S.next();
		System.out.println(NAME.length());
		
		
	}

}
