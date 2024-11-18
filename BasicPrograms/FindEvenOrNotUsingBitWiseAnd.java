// WAJPT check the given number is even or odd without using arithmetic operator.

import java.util.Scanner;
class FindEvenOrNotUsingBitWiseAnd
{ 
	public static void main(String [] args)
	{ 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check:");
		int num = sc.nextInt();
		
		//Isolate the least significant bit
		int lsb = num & 1;	 

		System.out.println("The least significant bit of " + num + " is: " + lsb);
		
		if(lsb==0)
		{ 
			System.out.println(num + "is a even number");
		}
		else 
		{ 
			System.out.println(num + ":is a odd number");
		}
	}
}