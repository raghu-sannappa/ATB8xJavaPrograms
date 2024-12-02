/*WAJP to print pattern 
A      E
  B  D
    C
  B   D
A	E

*/

class PatternSolidShapeNumber12
{
	public static void main(String [] args)
	{ 
		int n=5;
		char ch='A';
		
		for(int i=0;i<n;i++)
		{ 
			for(int j=0;j<n;j++)
			{
				if(i==j )
				{
				 	 System.out.print((char) ('A' + i) + " ");
				}
				else if(i+j==n-1)
				{  
					System.out.print((char)('A'+j)+ "   ");
				}
				else 
				{
                    			System.out.print("  "); // Spaces for alignment
                		}
			}
			

			System.out.println();
		}


		
	}
}