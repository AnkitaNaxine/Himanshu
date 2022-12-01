package Verify_Given_Number_is_Amstrong_08;

public class Practice12 
{
	public static void main(String[]args)
	{
		int NUM = 407;
		int SUM = 0;
		
		for(int i=NUM; i>=1; i=i/10)
		{
			int REM = i%10;
			SUM = SUM+(REM*REM*REM);
		}
//		System.out.println(SUM);
		
		if(NUM==SUM)
		{
			System.out.println(" Given Number "+NUM+" is Amstrong");
		}
		else
		{
			System.out.println(" Given Number "+NUM+" is not Amstrong");
		}
	}

}
