//WAJP to print Prime numbers from 100 to 500.

class PrimeInGivenRange
{
	
	public static boolean isPrime(int num)
	{
		int count =0,first =1;
		while(first<=num)
		{ 
			if(num % first ==0)
			{
				count++; 
			}
			first++;
		}
		return count==2;
	} 
	public static void main(String [] args)
	{
		int num = 100;

		while(num<=500)
		{
			if(isPrime(num))
			{
				System.out.print(num+ " ");
			}
			num++;
		} 
	}
}