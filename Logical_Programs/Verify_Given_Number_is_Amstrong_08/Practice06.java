package Verify_Given_Number_is_Amstrong_08;

public class Practice06 
{
	public static void main(String[]args) 
	{
		int OriginalNumber = 153;
		int Sum = 0;
		
		for(int i=OriginalNumber; i>0; i=i/10) 
		{
			int Rem = i%10;
			Sum = Sum+(Rem*Rem*Rem);
			
		}
		
		if(OriginalNumber==Sum)
		{
			System.out.println(" Given Number  "+OriginalNumber+" is Amstrong");
		}
		else
		{
			System.out.println(" Given Number  "+OriginalNumber+"is not Amstrong");
		}
		
		
		
		
		
		
	}

}
