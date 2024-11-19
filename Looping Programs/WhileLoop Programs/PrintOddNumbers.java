//WAJPT print the odd numbers from 1 to 10.


class PrintOddNumbers
{
	public static void printOddNumbersOnly(int num)
	{ 
	
		System.out.println("Even Numbers Between 1 to 10.");	
		while(num<=10)
		{ 
			if(num%2!=0)
			{
			System.out.println(num);
			}
		num++;
		}
	}
	public static void main(String[] args)
	{
		int num =1;
		printOddNumbersOnly(num);
	}
}