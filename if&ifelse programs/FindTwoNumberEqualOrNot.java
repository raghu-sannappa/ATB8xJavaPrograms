// WAJPT read 2 integer value from the user and print those are equal are not?

import java.util.Scanner;
class FindTwoNumberEqualOrNot
{ 

	public static boolean checkTwoNumbersEqualOrNot(int num1,int num2)
	{  
		if(num1==num2)	
		{ 
			return true;
		}
		else
		{
			return false;  
		}
	}
	public static void main(String [] args)
	{ 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number:");
		int num1 = sc.nextInt();

		System.out.println("Enter the second number:");
		int num2 = sc.nextInt();

		if(checkTwoNumbersEqualOrNot(num1,num2))
		{ 
			System.out.println(num1 +"&"+ num2 + ": are equal");
		
		}
		else 
		{
			System.out.println(num1 +"&"+ num2 + ": are not equal");  
		}

	}
}