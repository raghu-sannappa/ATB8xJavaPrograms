//WAJPT count the alphabets from A to Z.

class CountAlphabetsAtoZ
{
	public static int getCountOfAlphabets(char ch)
	{
		int count=0;
		while(ch<='Z')
		{ 
			count++;
			ch++;	
		}
		return count;
	}
	public static void main(String [] args)
	{
		char ch='A';

		int res = getCountOfAlphabets(ch);
		System.out.println("Total Count of Charcaters from A to Z is:"+res);
	}
}