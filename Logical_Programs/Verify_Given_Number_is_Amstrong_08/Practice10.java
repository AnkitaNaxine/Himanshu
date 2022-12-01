package Verify_Given_Number_is_Amstrong_08;

public class Practice10 
{
	public static void main(String[]args)
	{
		int ONUM = 153;
		int SUM =0;
		
		for(int i=ONUM; i>=1; i=i/10)
		{
			int REM = i%10;
			SUM = SUM+(REM*REM*REM);
		}
		
		System.out.println(SUM);
		
		if(ONUM == SUM)
		{
			System.out.println(" Given Number "+ONUM+" is Amstrong Number ");
		}
		else
		{
			System.out.println(" Given Number "+ONUM+" is not an Amstrong Number ");
		}
	}

}
