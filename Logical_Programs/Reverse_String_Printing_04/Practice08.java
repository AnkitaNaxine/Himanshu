package Reverse_String_Printing_04;

public class Practice08 
{
	public static void main(String[]args)
	{
		String Name = "Himanshu";
		String Rev = "";
		
		for(int i=Name.length()-1; i>=0; i--)
		{
			Rev = Rev+Name.charAt(i);
		}
		
		System.out.println(Rev);
		
		
		
		
		
	}

}
