//WAJP to print count number of digits in the given number.

class CountDigitsInGivenNumber
{ 
	public static void main(String [] args)
	{ 
		int num = 12345,count=0;
		
		while(num!=0)
		{         
		//Remove last digit.
			num = num / 10;
		// count 
			count++ ;
			
		}
		System.out.println("Count of Digits In the Given Number is:-"+count);
		
	}
}