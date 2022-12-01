package Reverse_String_Printing_04;

public class Practice09 
{
	public static void main(String[]args)
	{
		String ORG = "Himanshu";
		String REV = "";
		
		for(int i=ORG.length()-1; i>=0; i--)
		{
			REV = REV+ORG.charAt(i);
		}
		
		System.out.println(REV);
	}

}
