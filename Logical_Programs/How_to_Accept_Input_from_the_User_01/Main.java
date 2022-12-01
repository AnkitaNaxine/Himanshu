package How_to_Accept_Input_from_the_User_01;

import java.util.Scanner;

public class Main
{
	public static void main(String[]args) 
	{
		Scanner S1 = new Scanner(System.in);	
//		//for to Accept the input from the Keyboard input
//		System.out.println(" Enter NUM1 : ");
//		int NUM1 = S1.nextInt();	               
//	//	System.out.println(NUM1*NUM1);
//		
//		
//		System.out.println(" Enter NUM2 : ");
//		int NUM2 = S1.nextInt();
//		
//		System.out.println(NUM1+NUM2);
		
		
		System.out.println(" Enter Student Name : ");
		String Name = S1.next();
		System.out.println(Name.length());
	}

}
