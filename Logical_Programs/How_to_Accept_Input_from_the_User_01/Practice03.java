package How_to_Accept_Input_from_the_User_01;

import java.util.Scanner;

public class Practice03 
{
	public static void main(String[]args) 
	{
		System.out.println(" Enter Number : ");
		Scanner S = new Scanner(System.in);
		int NUM = S.nextInt();				// for to Accept int Input from the User
		System.out.println(NUM*NUM);
		
		System.out.println(" Enter Name : ");
		String Name = S.next();				// for to Accept String Input from the User
		System.out.println(Name.length());
	}

}
