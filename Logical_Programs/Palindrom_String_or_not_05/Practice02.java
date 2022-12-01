package Palindrom_String_or_not_05;

public class Practice02
{
	public static void main(String[]args)
	{
		System.out.println(" Verifying the String is Pallindrome or Not ");
	
	String Original = "NITIN";
	
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
		System.out.println(" Given String is not Pallindrome ");
	}
	
	System.out.println(Original);
	
	}
}
