package Reverse_String_Printing_04;

public class Practice05 
{
	public static void main(String[]args) 
	{
		String Original = "Himanshu";
		
		String Reverse = "";
		
		for(int i=Original.length()-1; i>=0; i--)
		{
			Reverse = Reverse+Original.charAt(i);
		}
		
		System.out.println(Reverse);
	}

}
