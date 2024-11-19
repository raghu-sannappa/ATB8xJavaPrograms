//WAJPT calculate sum of even numbers from 1 to n.



class SumOfEvenNumbers
{
	public static void main(String [] args)
	{ 
		int num =1,sum=0;
		while(num<=50)
		{ 
			if(num%2==0)
			{
			sum = sum + num;
			
			}
		num++;	
		}
		System.out.println("Sum of Even Numbers From 1 to 50 is:"+sum);
	}
}