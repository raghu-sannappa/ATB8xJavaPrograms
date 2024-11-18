class EvenOrOdd
{

	public static boolean checkEvenOrOdd(int num)
	{ 
		if(num % 2 == 0)
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
		int num = 11;
		if(checkEvenOrOdd(num))
		{ 
			System.out.println("Number is Even");
		}
		else 
		{ 
			System.out.println("Number is Odd");
		}
	}
}