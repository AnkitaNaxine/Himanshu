package Verify_Given_Number_is_Amstrong_08;

public class Practice07 
{
	public static void main(String[]args) 
	{
		
		int Onum = 153;
		int Sum = 0;
		
		for(int i=Onum; i>0; i=i/10) 
		{
			int Rem = i%10;
			Sum = Sum+(Rem*Rem*Rem);
		}
		
		if(Onum == Sum)
		{
			System.out.println(" Given Number "+Onum+" is Amstrong Number");
		}
		else
		{
			System.out.println(" Given Number "+Onum+" is not Amstrong Number");
		}
		
		
		
		
		
		
		
		
	}

}
