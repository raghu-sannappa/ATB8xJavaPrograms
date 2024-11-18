class CheckUpperOrLowerCaseAlphabet
{
	public static void findUpperOrLowerCase(char ch)
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
	} 
	
	public static void main(String [] args)
	{ 
		char ch = 'z';
		findUpperOrLowerCase(ch);
	}


}