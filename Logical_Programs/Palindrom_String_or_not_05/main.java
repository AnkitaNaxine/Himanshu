package Palindrom_String_or_not_05;

public class main 
{
	public static void main(String[]args) 
	{
		System.out.println(" Verify that given string is Palindrom or not ");
	
	String Original = "radar";
	
	String Reverse = "";
	
	for(int i=Original.length()-1; i>=0; i--) 
	{
		Reverse = Reverse + Original.charAt(i);
	}
			
	if(Original.equals(Reverse))
	{
		System.out.println(" Given String is Palindrome ");
	}
	else 
	{
		System.out.println(" Given String is not Palindrome ");
	}
	
	System.out.println(Original);
	
	
	
	
	
	
	}

}
