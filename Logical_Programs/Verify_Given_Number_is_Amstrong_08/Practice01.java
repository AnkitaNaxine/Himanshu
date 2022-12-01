package Verify_Given_Number_is_Amstrong_08;

public class Practice01 
{
	public static void main(String[]args) 
	{
		int OrgNum = 100;
		int sum = 0;
		
		for(int i=OrgNum; i>0; i=i/10) 
		{
			int rem = i%10;
			sum = sum+(rem*rem*rem);
		}
		
		if(OrgNum == sum) 
		{
			System.out.println(" Given Number "+OrgNum+" is An Amstrong Number");
		}
		else
		{
			System.out.println(" Given Number "+OrgNum+" is not An Amstrong Number" );
		}
	}

}
