class CheckAlpahbet
{
	public static boolean FindAlphabetOrNot(char ch)
	{ 
		int res = ch;
		System.out.println(res);
		if(res>=65 && res<=90)
		{ 
			return true;
		}
		else if(res>=97 && res <=122)
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
		char ch = '*';
		if(FindAlphabetOrNot(ch))
		{ 
			System.out.println("Yes Given Character is Alphabet");
		}
		else
		{ 
			System.out.println("No Given Character is not Alphabet");
		}
	}


}