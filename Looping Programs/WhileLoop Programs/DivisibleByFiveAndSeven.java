//WAJP to print numbers which are divisible by both 5 & 7 from 1 to 500.

class DivisibleByFiveAndSeven
{
	public static void main(String [] args)
	{ 
		int num =1;
		while(num<=500)
		{ 
			if((num % 5 ==0) && (num % 7 == 0))
			{ 
				System.out.println(num);
			}
		num++;
		}
	}
}