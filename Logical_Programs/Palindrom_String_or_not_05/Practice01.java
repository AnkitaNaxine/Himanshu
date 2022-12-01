package Palindrom_String_or_not_05;

public class Practice01 
{
	public static void main(String[]args) 
	{
		System.out.println(" Verify that the given String is Palindrome or not ");
	
	String Original = "DAD";
	
	String Reverse = "";
	
	for(int i=Original.length()-1; i>=0; i--) 
	{
		Reverse = Reverse + Original.charAt(i);
	}
	
	if(Original.equals(Reverse)) 
	{
		System.out.println(" Palindrome String ");
	}
	else 
	{
		System.out.println(" Not a Palindrome String ");
	}
	
	System.out.println(Original);
	
	
	
	
	
	
	
	
	
	}

}
