//WAJP to print upper case alphabets from A to Z.

class PrintUpperCasseAlphabets
{
	public static void main(String [] args)
	{ 
		char ch = 'A';
		
		while(ch<='Z')
		{ 
			System.out.print(ch+" ");
			ch++;
		}
	}
}