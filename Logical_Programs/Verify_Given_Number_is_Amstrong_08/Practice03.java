package Verify_Given_Number_is_Amstrong_08;

public class Practice03 
{
	public static void main(String[]args) 
	{
		int orgnum = 407;
		int sum = 0;
		
		for(int i=orgnum; i>0; i=i/10)
		{
			int rem = i%10;
			sum = sum+(rem*rem*rem);
		}
		
		if(orgnum==sum)
		{
			System.out.println(" Amstrong");
		}
		else
		{
			System.out.println(" Not Amstrong");
		}
		
	}
	

}
