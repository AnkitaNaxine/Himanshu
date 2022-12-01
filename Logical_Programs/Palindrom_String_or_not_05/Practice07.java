package Palindrom_String_or_not_05;

public class Practice07 
{
	public static void main(String[]args)
	{
		String ORG = "MADAM";
		String REV = "";
		
		for(int i=ORG.length()-1; i>=0; i--)
		{
			REV = REV+ORG.charAt(i);
		}
		
		if(ORG.equals(REV))
		{
			System.out.println(" Given String "+ORG+" is Palidrome");
		}
		else
		{
			System.out.println(" Given String "+ORG+" is not Palindrome");
		}
		
	}

}
