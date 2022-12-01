package How_to_Accept_Input_from_the_User_01;

import java.util.Scanner;

public class Practice06 
{
	public static void main(String[]args) 
	{
//		System.out.println(" Enter Numbers : ");
		Scanner S = new Scanner(System.in);
//		int NUM1 = S.nextInt();
//		int NUM2 = S.nextInt();
//		System.out.println(NUM1+NUM2);
		
		System.out.println(" Enter Name : ");
		String NAME = S.next();
		System.out.println(NAME.charAt(5));
		
		
		
	}

}
