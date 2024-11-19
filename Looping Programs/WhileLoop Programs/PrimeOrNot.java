//WAJP to check given number is prime or not.

import java.util.Scanner;
class PrimeOrNot
{
	public static int checkPrimeOrNot(int num)
	{ 
		int count=0,num1=1;
		while(num1<=num)
		{ 
			if(num%num1==0)
			{  
				count++;	
			}
		num1++;
		}
		return count;
	} 
	public static void main(String [] args)
	{ 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check:");
		int num = sc.nextInt();

		int res = checkPrimeOrNot(num);
		if(res<=2)
		{  
			System.out.println("Prime Number.");
		}
		else 
		{  
			System.out.println("Not a Prime Number.");	
		}
	}
}