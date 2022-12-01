package Reverse_String_Printing_04;

public class Practice03 
{
	public static void main(String[]args) 
	{
		System.out.println(" Printing the String in Reverse Order ");
	
	String Original = "Ridhima";
	String Reverse = "";
	
	for(int i=Original.length()-1; i>=0; i--) 
	{
		Reverse = Reverse+Original.charAt(i);
	}
	
	System.out.println(Reverse);
	
	
	
	
	
	
	
	
	}

}
