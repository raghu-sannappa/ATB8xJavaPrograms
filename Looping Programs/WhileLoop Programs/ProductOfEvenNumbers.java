//WAJP to find product of even numbers from 1 to 10.

class ProductOfEvenNumbers
{
	public static void main(String [] args)
	{ 
		int num =1,prod=1;
		
		while(num<=10)
		{ 
			if(num % 2 == 0)
			{ 
				prod = prod * num;
			}
		num++;
		}
		System.out.println("Product of Even Numbers From 1 to 10 is:-"+prod);
	}
}