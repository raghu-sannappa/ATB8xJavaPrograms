//WAJP to find sum of odd numbers from 1 to 10.

class PrintOddNumbers
{ 
	public static void main(String [] args)
	{ 
		int num = 1,sum = 0;
		while(num<=10)
		{ 
			if((num % 2) != 0)
			{ 
				sum =sum + num;	
			}
		num++;
		}
		System.out.println("Sum of odd numbers between 1 to 10 is:"+sum);
	}
}