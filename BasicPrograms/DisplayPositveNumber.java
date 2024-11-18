//WAJPT Read the integer value from the user and print that value in positive format.

import java.util.Scanner;
class DisplayPositveNumber
{
	
	public static int getPositiveNumber(int num)
	{ 
		
		if(num<0)
		{
			num = num * (-1);
		
		}
		else if(num>0) 
		{ 
			num = num * 1;
			
		}
		return num;
		
	}
	
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:-");
		int num = sc.nextInt();
		System.out.println("Positive Number is:" + getPositiveNumber(num));
	}
}