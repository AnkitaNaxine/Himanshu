package Palindrom_String_or_not_05;

public class Practice06 
{
	public static void main(String[]args)
	{
		String ORG = "NITIN";
		String REV = "";
		
		for(int i=ORG.length()-1; i>=0; i--)
		{
			REV = REV+ORG.charAt(i);
		}
		
		System.out.println(REV);
		
		if(ORG.equals(REV))
		{
			System.out.println(" Given String "+ORG+" is Palindrome ");
		}
		else
		{
			System.out.println(" Given String "+ORG+" is not Palindrome ");
		}
	}
	
}
