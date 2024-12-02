/*WAJP to print pattern 
1 
A B
1 2 3
A B C D
1 2 3
A B
1

*/

class PatternSolidShapeNumber10
{

	public static void main(String [] args)
	{ 
		int n=4;
		
		for(int i=0;i<n-1;i++)
		{  
			int num=1;
			char ch ='A';
			for(int j=0;j<n;j++)
			{ 
				if(i>=j)
				{
					if(i%2==0)
					{ 
						System.out.print(num++ +"  ");

					}
					else
					{ 
						System.out.print(ch++ +"  ");
					}
				}
			
			}
			System.out.println();
		}	
			
			

			//2nd shape 
		for(int i=0;i<n;i++)
		{  
			int num=1;
			char ch ='A';
			for(int j=0;j<n;j++)
			{ 
				if(i+j<=n-1)
				{
					if(i%2==0)
					{ 
						System.out.print(ch++ +"  ");

					}
					else
					{ 
						System.out.print(num++ +"  ");
					}
				}
			
			}
			System.out.println();
		}	
			

	
	
	}
}