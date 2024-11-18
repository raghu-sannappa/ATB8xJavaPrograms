//WAJP to print digits of numbers in reverses order.

class ReverseNumber
{
	public static void main(String [] args)
	{ 
		int num = 12345;
		
		while(num!=0)
		{ 
		// take last digit
			int last = num % 10;  // last = 3
		// print last digit
			System.out.print( last ); // 5 4 3 2
		// Remove last digit
			num = num/10 ;
			
		}
					
	}	
}