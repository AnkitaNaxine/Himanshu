package Reverse_String_Printing_04;

public class Practice01 
{
	public static void main(String[]args) 
	{
		System.out.println(" Printing String in Reverse form ");
	
	String Original = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	
	String Reverse = "";
	
	for(int i=Original.length()-1; i>=0; i--) 
	{
		Reverse=Reverse+Original.charAt(i);
	}
	
	System.out.println(Reverse);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
