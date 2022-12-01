package Verify_Given_Number_is_Amstrong_08;

public class Main 
{
	public static void main(String[]args) 
	{
		int OrgNum = 153;
		int SUM = 0;

		for(int i=OrgNum; i>0; i = i / 10)
		{
			int rem = i % 10;
			SUM = SUM + (rem*rem*rem);
		}
		
		if(OrgNum == SUM)
		{
			System.out.println(" Given Number "+OrgNum+" is Amstrong Number");
		}
		else
		{
			System.out.println(" Given Number "+OrgNum+" is not an Amstrong Number");
		}
			
	}

}
