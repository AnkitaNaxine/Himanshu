package Reverse_String_Printing_04;

public class Practice02 
{
	public static void main(String[]args) 
	{
		System.out.println(" Reverse the String ");
	
	String O = ("Himanshu Janardhanji Dalal");
	String R = "";
	
	for(int a=O.length()-1; a>=0; a--) 
	{
		R = R+O.charAt(a);
	}
	
	System.out.println(R);
	
	
	
	}

}
