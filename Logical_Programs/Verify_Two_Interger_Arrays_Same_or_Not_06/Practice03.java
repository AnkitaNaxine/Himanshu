package Verify_Two_Interger_Arrays_Same_or_Not_06;

import java.util.Arrays;

public class Practice03 
{
	public static void main(String[]args) 
	{
		int AR1[] = {1,2,3};
		int AR2[] = {4,5,6};
		int AR3[] = {4,5,6};
		
		System.out.println(Arrays.equals(AR1, AR2));	// False
		System.out.println(Arrays.equals(AR2, AR3)); 	// True
		System.out.println(Arrays.equals(AR1, AR3));	// False
	}

}
