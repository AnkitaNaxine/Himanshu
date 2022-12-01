package Palindrom_String_or_not_05;

public class Practice03 
{
	public static void main(String[]args) 
	{
		System.out.println(" Verify that the given string is pallindrome or not ");
	
	String Original = "HimanshuuhsnamiH";
	
	String Reverse = "";
	
	for(int i=Original.length()-1; i>=0; i--) 
	{
		Reverse = Reverse + Original.charAt(i);
	}
	
	if(Original.equals(Reverse)) 
	{
		System.out.println(" Given String is Pallindrome ");
	}
	else 
	{
		System.out.println(" Given String is Not Pallindrome ");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
