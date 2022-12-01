package Verify_Given_Number_is_Amstrong_08;

public class Practice08 
{
	public static void main(String[]args) 
	{
		int OriginalNumber = 407;
		int Sum = 0;
		
		for(int i=OriginalNumber; i>0; i=i/10)
		{
			int Rem = i%10;
			Sum = Sum+(Rem*Rem*Rem);
		}
		
		if(OriginalNumber == Sum)
		{
			System.out.println(" Given Number "+OriginalNumber+" is Amstrong Number");
		}
		else
		{
			System.out.println(" Given Number "+OriginalNumber+" is not An Amstrong Number");
		}
		
		
		
		
		
		
	}

}
