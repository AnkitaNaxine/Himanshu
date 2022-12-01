package Verify_Given_Number_is_Amstrong_08;

public class Practice02 
{
	public static void main(String[]args) 
	{
		int Onum = 407;
		int sum = 0;
		
		for (int i=Onum; i>0; i=i/10) 
		{
			int rem = i%10;
			sum = sum + (rem*rem*rem);
		
		}
		
		if(Onum == sum)
		{
			System.out.println(" Given Number "+Onum+" is Amstrong ");
		}
		else 
		{
			System.out.println(" Given Number "+Onum+" is not Amstrong ");
		}
	}

}
