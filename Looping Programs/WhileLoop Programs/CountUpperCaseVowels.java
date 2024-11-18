//WAJP to count UpperCase Vowels.

class CountUpperCaseVowels
{	
	public static void main(String [] args)
	{	
		char ch = 'A';
		int count =0;
		
		while(ch<='Z')
		{
			if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
			{ 
				count++;
			}
		ch++;
		}
		System.out.println("Upper Case Vowels Count is:-"+count);
	}
}