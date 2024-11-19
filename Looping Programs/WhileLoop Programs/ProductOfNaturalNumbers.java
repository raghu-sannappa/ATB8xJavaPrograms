//WAJPT calculate product of natural numbers from 1 to n.

class ProductOfNaturalNumbers
{
	public static int findProductOfNaturalNumbers(int num)
	{
		int prod=1;
		while(num<=5)
		{ 
			prod = prod * num;
		num++;
		}
		return prod;
	}
	public static void main(String [] args)
	{
		int num = 1;
		int res = findProductOfNaturalNumbers(num);
		System.out.println("Product of Natural Numbers between 1 to 5 is:"+res);
	}
}