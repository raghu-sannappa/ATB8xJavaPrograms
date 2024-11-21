//WAJP to check given number is prime or not.
//Logic for prime number example 1,2,3,4,5 - 5 is prime because it is divisible by 1 and 5(count-2), 4 is not because it is divisible by 1,2,4(count-3)

import java.util.Scanner;
class PrimeOrNot
{
	public static int checkPrimeOrNot(int num)
	{ 
		int count=0,first=1;
		while(first<=num)
		{ 
			if(num%first==0)
			{  
				count++;	
			}
		first++;
		}
		return count==2;
	} 
	public static void main(String [] args)
	{ 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check:");
		int num = sc.nextInt();

		
		if(checkPrimeOrNot(num))
		{  
			System.out.println("Prime Number.");
		}
		else 
		{  
			System.out.println("Not a Prime Number.");	
		}
	}
}