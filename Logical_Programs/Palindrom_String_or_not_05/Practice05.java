package Palindrom_String_or_not_05;

public class Practice05 
{
	public static void main(String[]args)
	{
		System.out.println(" Verify that the Given String is ");
	
		String ORG = "MADAM";
		String REV = "";
		
		for(int i=ORG.length()-1; i>=0; i--)
		{
			REV = REV+ORG.charAt(i);
		}
	
		if(ORG == REV)
		{
			System.out.println(" Given Name is "+ORG+" is Palindrome ");
		}
		else
		{
			System.out.println(" Given Name is "+ORG+" is not Palindrome ");
		}
	}

}
