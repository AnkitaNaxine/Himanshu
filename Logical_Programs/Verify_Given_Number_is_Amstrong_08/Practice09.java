package Verify_Given_Number_is_Amstrong_08;

public class Practice09 
{
	public static void main(String[]args) 
	{
		int ORGnum = 153;
		int SUM = 0;
		
		for(int i=ORGnum; i>0; i=i/10)
		{
			int REM = i%10;
			SUM = SUM+(REM*REM*REM);
		}
		
		System.out.println(SUM);
		
		if(ORGnum == SUM)
		{
			System.out.println(" Given Number is "+ORGnum+" an Amstrong Number");
		}
		else
		{
			System.out.println(" Given Number is "+ORGnum+"Not an Amstrong Number");
		
		}
		
		
	}

}
