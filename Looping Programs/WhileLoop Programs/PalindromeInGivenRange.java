//WAJP to print Palindrome numbers from 100 to 500.

class PalindromeInGivenRange
{

	public static boolean checkPalindrome(int num)
	{
		int rev=0,last=0;
		
		int originalNum = num;
		while(num!=0)
		{ 
			last = num % 10;
			rev = rev * 10 + last;
			num = num/10;
		}

		if(rev==originalNum)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	public static void main(String [] args)
	{ 
		int num = 100;
		while(num<=500)
		{
			
			if(checkPalindrome(num))
			{
				System.out.print(num+" ");
			}
			num++;
		}
	}
}