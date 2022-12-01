package Verify_Given_Number_is_Amstrong_08;

public class Practice04 
{
	public static void main(String[]args) 
	{
	
	int OriginalNumber = 100;
	int sum = 0;
	
	for (int i=OriginalNumber; i>0; i=i/10)
	{
		int rem = i%10;
		sum = sum+(rem*rem*rem);
	}
	
	if(OriginalNumber == sum)
	{
		System.out.println(" Given Number is "+OriginalNumber+" Amstrong Number");
	}
	else
	{
		System.out.println(" Given Number is "+OriginalNumber+" Not Amstrong Number");
	}
	
	}
}
