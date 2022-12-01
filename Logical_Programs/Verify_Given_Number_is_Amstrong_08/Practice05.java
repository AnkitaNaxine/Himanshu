package Verify_Given_Number_is_Amstrong_08;

public class Practice05 
{
	public static void main(String[]args) 
	{
		int ONUM = 407;
		int SUM = 0;
		
		for(int i=ONUM; i>0; i=i/10)
		{
			int REM = i%10;
			SUM = SUM+(REM*REM*REM);
		}
		
		if(ONUM==SUM)
		{
			System.out.println(" Given Number is "+ONUM+" Amstrong Number");
		}
		else
		{
			System.out.println(" Given Number is "+ONUM+" Not Amstrong Number");
		}
		
		
		
		
		
		
	}

}
