//WAJPT check whether given character is vowel or consonant?

import java.util.Scanner;
class VowelOrConsonent
{

	public static void checkVowelOrConsonent(char ch)
	{  
		if((ch=='A'||ch=='a')||
		   (ch=='E'||ch=='e')||
		   (ch=='I'||ch=='i')||
		   (ch=='O'||ch=='o')||
		   (ch=='U'||ch=='u'))
		{
			System.out.println(ch+": Is a Vowel");
		}
		else
		{ 
			System.out.println(ch+": Is a Consonent");
		}
	}
	public static void main(String [] args)
	{ 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character to check:-");
		char ch = sc.next().charAt(0);

		checkVowelOrConsonent(ch);
		
	}
}