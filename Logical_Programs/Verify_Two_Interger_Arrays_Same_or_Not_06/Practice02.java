package Verify_Two_Interger_Arrays_Same_or_Not_06;

import java.util.Arrays;

public class Practice02 
{
	public static void main(String[]args) 
	{
		int AR1[] = {1,2,3,4};
		int AR2[] = {1,2,3,4};
		int AR3[] = {5,6,7,8};
		
		System.out.println(Arrays.equals(AR1, AR2));	// True
		System.out.println(Arrays.equals(AR2, AR3)); 	// False
		System.out.println(Arrays.equals(AR2, AR3)); 	// False
		
	}

}
