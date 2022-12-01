package Verify_Two_Interger_Arrays_Same_or_Not_06;

import java.util.Arrays;

public class Practice01 
{
	public static void main(String[]args) 
	{
		int ar1[]= {10,20,30};
		int ar2[]= {40,50,60};
		int ar3[]= {40,50,60};
		
		System.out.println(Arrays.equals(ar1, ar2));	// False (Because Both Arrays are Different)
		System.out.println(Arrays.equals(ar1, ar3)); 	// False (Because Both Arrays are Different)
		System.out.println(Arrays.equals(ar2, ar3)); 	// True  (Because Both Arrays are Same)
	}

}
