package Verify_Given_Number_is_Amstrong_08;

public class Practice11 
{
	public static void main(String[]args)
	{
		int ORG = 153;
		int SUM = 0;
		
		for(int i=ORG; i>=1; i=i/10)
		{
			int REM = i%10;
			SUM = SUM+(REM*REM*REM);
		}
		System.out.println(SUM);
		
		if(ORG==SUM)
		{
			System.out.println(" Given Number is Amstromg Number ");
		}
		else
		{
			System.out.println(" Given Number is not Amstrong Number");
		}
		
	}

}
