package All_Logical_Programs;

public class Verify_that_String_is_Palindrome_Not_04 
{
	public static void main(String[]args)
	{
		String O="NITIN";
		String R = "";
		
		for(int i=O.length()-1; i>=0; i--)
		{
			R=R+O.charAt(i);
		}
		
		if(O.equals(R))
		{
			System.out.println(" Given String "+O+" is Palindrome ");
		}
		else
		{
			System.out.println(" Given String "+O+" is not Palindrome");
		}
		
	}

}
