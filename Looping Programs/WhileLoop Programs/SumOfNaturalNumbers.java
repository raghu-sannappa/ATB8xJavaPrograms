//WAJPT calculate sum of natural numbers from 1 to n.

class SumOfNaturalNumbers
{
	public static void main(String [] args)
	{ 
		int num =1,sum=0;
		while(num<=50)
		{ 
			sum = sum + num;
			num++;	
		}
		System.out.println("Sum of Natural Numbers From 1 to 50 is:"+sum);
	}
}