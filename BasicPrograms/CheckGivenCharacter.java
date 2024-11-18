class CheckGivenCharacter
{
	public static void findGivenCharcacter(char ch)
	{ 
		int res = ch;

		System.out.println(res);

		if(res>=65 && res<=90)
		{ 
			System.out.println("Given Character is UpperCasse Alphabet");
		}
		else if(res>=97 && res <=122)
		{ 
			System.out.println("Given Character is LowerCase Alphabet");
		}
		else if(res>=47 && res<=58)
		{ 
			System.out.println("Given Character is Digit");

		}
		else 		
		{ 
			System.out.println("Given Character is Special Charcater.");

		}

		

	} 
	
	public static void main(String [] args)
	{ 
		char ch = '5';
		findGivenCharcacter(ch);
	}


}