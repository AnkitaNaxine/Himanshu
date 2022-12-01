package Palindrom_String_or_not_05;

public class Practice04 
{
	public static void main(String[]args) 
	{
		System.out.println(" Verify that the given String is Palindrome or not ");
	
		String Original = "MADAM";
		String Reverse = "";
		
		for(int i=Original.length()-1; i>=0; i--)
		{
			Reverse = Reverse+Original.charAt(i);
		}
	
		if(Original == Reverse)
		{
			System.out.println(" Given String "+Original+" is Palindrome ");
		}
		else
		{
			System.out.println(" Given String "+Original+" is not Palindrome ");
		}
	
	
	
	
	
	
	
	
	
	
	
	}

}
