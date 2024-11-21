/*WAJP to Print Pattern
D C B A
D C B A 
D C B A  
D C B A
*/

class Pattern9Demo
{ 
	public static void main(String [] args)
	{ 
		
		int n = 6;
		  
		
		for(int i=0;i<n;i++)
		{ 
			char ch = (char)(n+64);	
			for(int j=0;j<n;j++)
			{
				System.out.print(ch-- +" ");  
				
			}
			
			System.out.println();
		} 
	}
}