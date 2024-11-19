//WAJP to check given number is palindrome or not.

class Palindrome
{	
	public static void checkPalindrome(int  num)
	{ 
		int originalNum=num;
		int revNum = 0;
		while(num!=0)
		{ 
			int last = num % 10;
			revNum=revNum * 10 + last;
			num = num/10;
		}
		if(revNum==originalNum)
		{ 
			System.out.println(revNum+":is a palindrome number");	
		}
		else
		{	
			System.out.println(revNum+":is not a palindrome number");
		}
	}
	public static void main(String [] args)
	{ 
		int num = 3223;
		checkPalindrome(num);
	} 
}