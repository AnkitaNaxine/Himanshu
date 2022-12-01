package Reverse_String_Printing_04;

public class Practice04 
{
	public static void main(String[]args) 
	{
		System.out.println(" Check that Given String is Palindrome or Not ");
	
	String Original = "mam";
	
	String Reverse = "";
	
	for(int i=Original.length()-1; i>=0; i--) 
	{
		Reverse = Reverse + Original.charAt(i);
	}
	
	if(Original.equals(Reverse))
	{
		System.out.println(" Given String is Palindrom ");
	}
	else 
	{
		System.out.println(" Given String is not Palindrom ");
	}
	
	
	System.out.println(Original);
	
	
	
	
	
	
	
	
	
	}

}
