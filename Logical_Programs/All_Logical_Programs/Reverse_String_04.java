package All_Logical_Programs;

public class Reverse_String_04 
{
	public static void main(String[]args)
	{
		String ORGName = "GaneshPurushottamjiDalal";
		String REVName = "";
		
		for(int i=ORGName.length()-1; i>=0; i--)
		{
			REVName=REVName+ORGName.charAt(i);
		}
		
		System.out.println(REVName);
		
		
		
		
		
	}

}
