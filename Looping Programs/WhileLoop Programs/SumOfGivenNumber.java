//WAJP to print sum of digits in the given number

class SumOfGivenNumber
{ 
	public static void main(String [] args)
	{ 
		int num = 12345,sum=0;
		
		while(num!=0)
		{ 
		//Take last digit 
			int last = num % 10;         
			
		//Add num to sum.
			sum = sum + last;        
			

		//Remove last digit.
			num = num / 10;
			
		}
		System.out.println("Sum of Given Number is:-"+sum);
		
	}
}