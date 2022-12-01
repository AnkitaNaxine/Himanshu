package Reverse_String_Printing_04;

public class Main 
{
	public static void  main(String[]args) 
	{
		System.out.println(" Printing the String in Reverse form ");
	
	String Original = "Himanshu";
	
	String Revers = "";
	
	for(int i=Original.length()-1; i>=0; i--) 
	{
		Revers = Revers+Original.charAt(i);
	}
	
	System.out.println(Revers);
	
	}

}
