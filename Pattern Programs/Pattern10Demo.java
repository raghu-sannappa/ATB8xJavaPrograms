/*WAJP to Print Pattern
D D D D 
C C C C 
B B B B 
A A A A 
*/

class Pattern10Demo
{ 
	public static void main(String [] args)
	{ 
		
		int n = 4;
		  
		char ch = (char)(n+64);	
		for(int i=0;i<n;i++)
		{ 
			
			for(int j=0;j<n;j++)
			{
				System.out.print(ch+" ");  
				
			}
			ch--;
			
			System.out.println();
		} 
	}
}