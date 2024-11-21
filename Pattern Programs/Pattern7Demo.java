/*WAJP to Print Pattern
A B C D
A B C D 
A B C D 
A B C D 
*/

class Pattern7Demo
{ 
	public static void main(String [] args)
	{ 
		
		int n =4;

		for(int i=0;i<n;i++)
		{ 
			char ch = 'A';
			for(int j=0;j<n;j++)
			{
				System.out.print(ch +" ");  
				ch++;
			}
			System.out.println();
		} 
	}
}