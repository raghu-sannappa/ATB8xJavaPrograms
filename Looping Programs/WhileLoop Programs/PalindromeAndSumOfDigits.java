//WAJP to print numbers from 1 to 500 which are * Number must be palindrome * Sum of digits of number must be <=6.

class PalindromeAndSumOfDigits
{ 
	public static void main(String [] args)
	{ 
		int num=100;
		while(num<=500)
		{ 
			if(isPalindrome(num) && sumOfDigits(num)<=6)
			{ 
				System.out.println(num);
			}
			num++;
		}			
  	}
	
	public static boolean isPalindrome(int num)
	{ 
		int originalNum=num;
		int revNum=0;
		while(num>0)
		{ 
			int last = num % 10;
			revNum = revNum*10+last;
			num= num/10;
		}
		return revNum==originalNum;
		
	}

	public static int sumOfDigits(int num)
	{ 
		int sum=0;
		while(num>0)
		{
			int last = num % 10;
			    sum= sum+last;
			    num = num/10;
		}
		return sum;
	}
}