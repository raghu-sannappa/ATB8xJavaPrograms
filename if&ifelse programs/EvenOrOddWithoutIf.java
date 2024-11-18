// WAJPT check the given number is even or odd without using if statement.

class EvenOrOddWithoutIf
{
	public static void main(String [] args)
	{  
		int num = 11;
		
		
		System.out.println((num & 1)==0 ? num + ":is even number" : num + ":is Odd number" );
	} 
}