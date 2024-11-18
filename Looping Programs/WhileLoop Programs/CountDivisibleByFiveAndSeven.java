//WAJP to count numbers which are divisible by both 5 & 7 from 1 to 500.

class CountDivisibleByFiveAndSeven
{
	public static void main(String [] args)
	{ 
		int num =1,count=0;
		while(num<=500)
		{ 
			if((num % 5 ==0) && (num % 7 == 0))
			{ 
				System.out.println(num);
				count++;
			}
		num++;
		}
		System.out.println("Count of Numbers which are divisible by 5 & 7 Till 500 is:"+count);
	}
}