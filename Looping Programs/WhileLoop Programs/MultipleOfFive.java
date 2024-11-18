//WAJP to sum of numbers which are multiple of 5 from 1 to 50.

class MultipleOfFive
{
	public static void main(String [] args)
	{ 
		int num = 1,sum=0;
		
		while(num<=50)
		{ 
			if(num % 5 == 0)
			{ 
				sum = sum + num;
				System.out.println(sum);
			}
		num++;
		}
		System.out.println("Sum of multiple of 5 is:-"+sum);
	}
}