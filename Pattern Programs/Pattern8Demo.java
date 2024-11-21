/*WAJP to Print Pattern
A A A A
B B B B 
C C C C  
D D D D
*/

class Pattern8Demo
{ 
	public static void main(String [] args)
	{ 
		
		int n =4;
		char ch = 'A';

		for(int i=0;i<n;i++)
		{ 
			
			for(int j=0;j<n;j++)
			{
				System.out.print(ch +" ");  
				
			}
			ch++;
			System.out.println();
		} 
	}
}