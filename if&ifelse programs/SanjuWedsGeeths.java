//WAJPT read the integer value from the user, if the number is divisible by 3 print sanju , if the number is divisible by 5 print geetha , if number is divisible by both 3 & 5 print sanju weds geetha else print break-up.

import java.util.Scanner;
class SanjuWedsGeeths
{

	public static void checkSanjuWedsGeeths(int num)
	{ 
		if(num % 3==0 && num%5==0)
		{ 
			System.out.println("Sanju Weds Geetha");
		}
		else if(num % 3 ==0)
		{ 
			System.out.println("Sanju");
		}
		else if(num % 5 ==0)
		{ 
			System.out.println("Geetha");
		}
		else 
		{ 
			System.out.println("BreakUp");
		}


	}
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check:");
		int num = sc.nextInt();
		
		checkSanjuWedsGeeths(num);
		
	}	
}